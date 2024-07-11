package amadorcf.es.user_service.model.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import amadorcf.es.user_service.model.Status;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateUserStatus {

    private Status status;
}
