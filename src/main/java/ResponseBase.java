import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonProperty;
@Setter
@Getter
import java.util.ArrayList;
import java.util.List;


public class ResponseBase {
    @JsonProperty("data")
    private DataImage DataImage;
    @JsonProperty ("success")
    private Boolean success;
    @JsonProperty("status")
    private Integer status;

}
