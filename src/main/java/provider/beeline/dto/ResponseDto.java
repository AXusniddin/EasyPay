package provider.beeline.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto<O>{
    private Integer code;
    private String message;
    private Boolean success;
    private O data;
}
