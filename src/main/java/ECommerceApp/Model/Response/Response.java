package ECommerceApp.Model.Response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class Response {
    protected int statusCode;
    protected String customerMessage;
    protected String developerMessage;
    protected Object body;
}

