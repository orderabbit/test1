package com.korea.test.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class PatchBoardRequestDto {
    private String title;
    private String content;
}
