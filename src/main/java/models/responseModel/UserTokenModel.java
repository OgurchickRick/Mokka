package models.responseModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserTokenModel {
    public String  expiration;
    public Boolean isDeleted;
    public String tokenInfo;
    public Integer employeeId;
    public Integer tokenId;
}
