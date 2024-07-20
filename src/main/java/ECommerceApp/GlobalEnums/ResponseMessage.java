package ECommerceApp.GlobalEnums;

public enum ResponseMessage {
    Unauthorized_Request("Unauthorized request"),
    Invalid_Referer("Invalid referer"),
    Invalid_Credentials("Invalid username or password"),
    Logout_Failed( "Failed To Log out"),
    Logout_Success("Logged out Successfully"),
    Missing_Username("Missing username"),
    Old_Password_Detected("The New Password Cannot Be Same As Old Passwords"),
    Password_Changed_Success("Password changed successfully"),
    Password_Changed_Failed("Password change failed"),
    Passwords_Not_Matched("Passwords not match"),
    Many_Requests("Too many requests !"),
    Passwords_SAME("New password must not be equal to the old password"),

    User_Locked("User is locked"),
    User_Authenticated_Successfully("User authenticated successfully"),
    User_Already_Logged_In("User is already logged in"),
    User_Not_Authenticated("User Not Authenticated"),
    User_Not_Found("User does not exist"),
    User_Not_Active("User Account Is Not Active"),
    Succesful_Request("Succesful request"),
    Developer_Message("Successfull Call For Api"),

    ;

    private final String message;

    ResponseMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getMessageByUsername(String username) {
        return message.replace("User", username);
    }
    public String getMessageByApi(String api) {
        return message.replace("Api", api);
    }
}
