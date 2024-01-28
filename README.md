# Boot3-REST-JWT  

[Setting Projects]  
1. Spring Boot  
 - Spring MVC  
2. Spring Data JPA  
3. Spring Validation  
4. Spring HATEOAS  
 - Hypermedia as the Engine of Application State (HATEOAS) is a constraint of the REST application architecture that distinguishes it from other network application architectures.    
 - Hypertext Application Language (HAL)  
5.Springdoc-OpenApi  
 - https://springdoc.org/  
6. Spring Security  
 - JWT(json web token)  

[Setting Project]  
Java 버전 17로 시작  
스프링 부트 프로젝트 생성 ( https://start.spring.io/ )  
추가할 의존성 ( dependency )  
• Web  
• Data JPA  
• HATEOAS  ( https://spring.io/projects/spring-hateoas/ )  
• Validation  
• H2 / MariaDB Client  
• Lombok  
• Devtools  
• Configuration Processo  

[응답코드 정의]  
ResponseEntity를 사용하는 이유  
 - 응답 코드, 헤더, 본문을 모두 저장 해주는 편리한 API  
 
https://restfulapi.net/http-status-201-created/  

[프로파일 정의]  
프로파일 가이드 : https://docs.spring.io/spring-boot/docs/1.2.0.M1/reference/html/boot-features-profiles.html  

[jpa 옵션]  
application.properties 의 spring.jpa.hibernate.ddl-auto=create-drop
```
spring.jpa.hibernate.ddl-auto=create|create-drop|update|validate|none  
 - create  
  JPA가 DB와 상호작용할 때 기존에 있던 스키마(테이블)을 삭제하고 새로 만드는 것을 뜻한다.  
 - create-drop
  JPA 종료 시점에 기존에 있었던 테이블을 삭제합니다.
 - update
  기존 스키마는 유지하고, 새로운 것만 추가하고, 기존의 데이터도 유지한다. 
  변경된 부분만 반영함, 주로 개발 할 때 적합하다.
 - validate
  엔티티와 테이블이 정상 매핑 되어 있는지를 검증합니다.
```  
[jpa 페이징]  
Spring Data JPA의 페이징과 정렬  
 - Spring Data JPA에서는 쿼리 메소드에 페이징과 정렬 기능을 제공하는 2가지 클래스를 제공  
 - org.springframework.data.domain.Sort : 정렬 기능  
 - org.springframework.data.domain.Pageable : 페이징 기능  
 - Pageable 인터페이스는 Paging 하기 위한 파라미터들을 담은 PageRequest 같은 객체에 접근하기 위한 역  
할을 합니다. 이 매개변수를 통해 Paging 하기 위한 정보를 담은 객체가 들어오게 되고 이것을 통해 자동적  
으로 Paging에 필요한 데이터를 처리하여 반환하게 되는 것입니다.  
 - page : 검색을 원하는 페이지 번호를 나타냅니다.  
 - size : 한 페이지의 보여 줄 게시물 개수를 나타냅니다.  
 - sort : 정렬 방식을 나타냅니다.  
[에러처리]  
 - ProblemDetail을 이용한 에러처리  