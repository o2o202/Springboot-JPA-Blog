package com.cos.blog.test;

import org.springframework.web.bind.annotation.*;

//사용자가 요청 ->응답(html파일) ->@Controller
//사용자가 요청 -> 응답(data)
@RestController
public class HttpControllerTest {

    private static final String TAG="httpControllerTest:";

    @GetMapping("/http/lombok")
    public String lombokTest(){
        //기본 생성자 사용시 : 순서 중요 Member m = new Member(1,"ssa","1234","eamil");
        //@Builder어노테이션 사용 시 생성자 순서가 바껴도 상관없음
        Member m = Member.builder().username("aa").id(1).build();
        System.out.println(TAG+"getter: "+m.getId());
        m.setId(5000);
        System.out.println(TAG+"setter: "+m.getId());

        return "lombok test완료";
    }

    //http://localhost:8080/http/get (select)
    @GetMapping("/http/get")
    public String getTest(Member m){ //id=1&username=김소연 (쿼리스트링방식요청) == @RequestParam String id

        return  "get요청 : "+m.getId()+", "+m.getUsername();
    }
    //인터넷 브라우저 요청은 무조건 get요청밖에 할 수 없다
    //http://localhost:8080/http/post (insert)
    @PostMapping("/http/post") //text/plnin, application/json
    public String postTest(@RequestBody Member m){ //MessageConverter(스프링부트)
        return  "post요청 : "+m.getId()+", "+m.getUsername();
    }
    //http://localhost:8080/http/put (update)
    @PutMapping("/http/put")
    public String putTest(){
        return  "put요청";
    }
    //http://localhost:8080/http/delete (delete)
    @DeleteMapping("/http/delete")
    public String deleteTest(){
        return  "delete요청";
    }
}
