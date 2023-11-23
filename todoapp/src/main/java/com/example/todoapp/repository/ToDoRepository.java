package com.example.todoapp.repository;

import com.example.todoapp.domain.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Todo Entity 객체를 이용해서 입력, 수정, 삭제, 조회(CRUD)를 도와주는 인터페이스

@Repository // // <엔티티 이름, 엔티티의 id의 타입>
public interface ToDoRepository extends JpaRepository<ToDo, Long> {

}
