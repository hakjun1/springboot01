package com.springboot.hello.domain.dto;

public class MemberDto {
    private String name;
    private String email;
    private String organization;

    public MemberDto(String name, String email, String organization) {
        this.name = name;//setter사용을 지양하는 추세다(교재는 setter)
        this.email = email;
        this.organization = organization;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getOrganization() {
        return organization;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s",this.name,this.email,this.organization);
        //return name + " " + email + " " + organization;
    }


    //@GetMapping(value = "/request2")
    //    public String getRequestParam2(
    //            @RequestParam Map<String,String> param) {//어떤 값이 들어올지 모를때
    //        StringBuilder sb = new StringBuilder();
    //        param.entrySet().forEach(map-> sb.append(map.getKey() + " : " + map.getValue()+"\n"));
    //                                //map를 인자로
    //        //entrySet() = key value값을 동시에 출력
    //        //foreach = 반복해서 출력
    //        return sb.toString();
    //    }
}
