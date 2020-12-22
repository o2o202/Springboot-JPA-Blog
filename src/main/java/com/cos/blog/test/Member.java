package com.cos.blog.test;

import lombok.*;

//@Getter
//@Setter
@Data   //getter, setter 둘다 한번에 실행하는거
// @AllArgsConstructor //기본생성자
@NoArgsConstructor
public class Member {
    private int id;
    private String username;
    private String password;
    private String email;
    
    //모든 경우의 수의 기본생성자를 만들어주는 어노테이션
    @Builder //기본생성자 어노테이션말고 @builder를 사용하면 new연산자이용해 객체 만들때 순서가 상관없다 
    public Member(int id, String username, String password, String email){
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

}
