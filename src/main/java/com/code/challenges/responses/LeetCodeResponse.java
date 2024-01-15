package com.code.challenges.responses;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LeetCodeResponse {
    private Integer challengeId;
    private String description;
    private String examples;
    private String constrains;
    private String hints;
    private String topics;
    private String comments;
    private List<String> solutions;
}
