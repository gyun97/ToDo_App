package com.example.todoapp.domain;

//클래스지만 실제 데이터베이스에 저장되어야 하기 때문에 클래스와 데이터베이스의 테이블을 매핑해줘야 한다

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "ToDo")
@Table(name = "todo")
@AllArgsConstructor // 모든 것을 받아들이는 생성자
@NoArgsConstructor // 모든 것을 거부하는 생성자
@Setter
@Getter
public class ToDo {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // PK 1씩 자동증가
    private Long id; // id 컬럼

    @NotNull
    private String todo; // todo 컬럼

}
