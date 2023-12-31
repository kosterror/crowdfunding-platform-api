package ru.cft.shift.crowdfundingplatformapi.dto.token;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TokensDto {
    private String accessToken;
    private String refreshToken;
}
