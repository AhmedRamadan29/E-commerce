package ECommerceApp.ECommerceMainPage.Services;

import ECommerceApp.ECommerceMainPage.DTOs.CrudApplicationParamDto;
import ECommerceApp.ECommerceMainPage.DTOs.DeleteApplicationParamDTO;
import ECommerceApp.ECommerceMainPage.DTOs.InsertApplicationParamDTO;
import ECommerceApp.ECommerceMainPage.DTOs.UpdateApplicationParamDTO;
import ECommerceApp.ECommerceMainPage.Entitys.ApplicationParameters;
import ECommerceApp.ECommerceMainPage.Repositorys.ApplicationParameterRepository;
import ECommerceApp.Utils.IntegerUtils;
import ECommerceApp.Utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ApplicationParamsService {
    @Autowired
    private ApplicationParameterRepository applicationParameterRepository;

    public List<String> getDistinctNameParams() {
        return applicationParameterRepository.getDistinctName();
//        List<String> namesList=applicationParameterRepository.getDistinctName();
//        return namesList.parallelStream().map(ApplicationParametersMapper::applicationParameterDTO).collect(Collectors.toList());
    }

    public Optional<ApplicationParameters> getByParamName(String paramName) {
       return Optional.ofNullable(applicationParameterRepository.findByParameterName(paramName).orElse(null));
    }

    public ResponseEntity<?> crudAppParamsOperation(CrudApplicationParamDto crudApplicationParamDto) {
        List<InsertApplicationParamDTO> insertApplicationParamDTOS=crudApplicationParamDto.insertApplicationParamDTOSList;
        insertAppParamsList(insertApplicationParamDTOS);
        List<DeleteApplicationParamDTO> deleteApplicationParamDTOS=crudApplicationParamDto.deleteApplicationParamDTOSList;
        deleteAppParamsList(deleteApplicationParamDTOS);
        List<UpdateApplicationParamDTO> updateApplicationParamDTOS=crudApplicationParamDto.updateApplicationParamDTOSList;
        updateAppParamsList(updateApplicationParamDTOS);
        return ResponseEntity.ok().build();
    }
    public void updateAppParamsList(List<UpdateApplicationParamDTO> updateApplicationParamDTOS) {
        for (UpdateApplicationParamDTO updateApplicationParamDTO : updateApplicationParamDTOS) {
            if(IntegerUtils.isNull(updateApplicationParamDTO.getParameterId()))
            {
                throw new RuntimeException("Update Application Param Failed Id Cannot Be Null!");
            }
            ApplicationParameters applicationParameters=applicationParameterRepository.findById(updateApplicationParamDTO.getParameterId()).orElse(null);
            if (applicationParameters==null) {
                throw new RuntimeException("Update Application Param Failed Id Not Found!");
            }
            applicationParameters.builder().parameterName(updateApplicationParamDTO.getParameterName()).
                    parameterValue(updateApplicationParamDTO.getParameterValue())
                    .parameterOrder(updateApplicationParamDTO.getParameterOrder())
                    .updatedAt(LocalDate.now()).
                    parameteriId(updateApplicationParamDTO.getParameterId()).build();
            applicationParameterRepository.saveAndFlush(applicationParameters);

        }
    }
    public void deleteAppParamsList(List<DeleteApplicationParamDTO> deleteApplicationParamDTOS) {
        for(DeleteApplicationParamDTO deleteApplicationParamDTO : deleteApplicationParamDTOS) {
           if(IntegerUtils.isNull(deleteApplicationParamDTO.getId()))
           {
               throw new RuntimeException("Delete Application Param Failed Id Cannot Be Null!");
           }
           ApplicationParameters applicationParameters=applicationParameterRepository.findById(deleteApplicationParamDTO.getId()).orElse(null);
           if (applicationParameters==null) {
               throw new RuntimeException("Delete Application Param Failed Id Not Found!");
           }
           applicationParameterRepository.deleteById(deleteApplicationParamDTO.getId());
        }
    }
    public void insertAppParamsList(List<InsertApplicationParamDTO> insertApplicationParamDTOS)
    {
        for (InsertApplicationParamDTO insertApplicationParamDTO : insertApplicationParamDTOS) {
            if(StringUtils.isNull(insertApplicationParamDTO.getParameterName()))
            {
                throw new RuntimeException("Invalid Insert Application Parameter Name!");
            }
            if(StringUtils.isNull(insertApplicationParamDTO.getParameterValue()))
            {
                throw new RuntimeException("Invalid Insert Application Parameter Value!");
            }
            ApplicationParameters applicationParameters=new ApplicationParameters();
            applicationParameters.builder().parameterName(insertApplicationParamDTO.getParameterName()).
                    parameterValue(insertApplicationParamDTO.getParameterValue()).parameterDescription("")
                    .parameterOrder(insertApplicationParamDTO.getParameterOrder()).createdAt(LocalDate.now()).
                    updatedAt(LocalDate.now()).build();
            applicationParameterRepository.save(applicationParameters);
        }
    }
}
