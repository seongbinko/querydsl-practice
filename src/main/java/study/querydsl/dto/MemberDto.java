package study.querydsl.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class MemberDto {

    private String username;
    private int age;

    //Todo: Querydsl이 기본생성자를 통해 setter 방식 Projection을 사용해야되기 때문에 필요하다.
    public MemberDto() {

    }
    @QueryProjection
    public MemberDto(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
