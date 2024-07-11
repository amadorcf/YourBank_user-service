package amadorcf.es.user_service.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SaveUser {

    private String firstName;

    private String lastName;

    private String contactNumber;

    private String emailId;

    private String password;
}
