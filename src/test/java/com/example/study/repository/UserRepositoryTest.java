package com.example.study.repository;


import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import javax.swing.text.html.Option;
import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Optional;

public class UserRepositoryTest extends StudyApplicationTests {
    //Dependency Injection(DI)
    @Autowired
    private UserRepository userRepository;

    @Test
    public void create(){
        //String sql = insert into user(%s, %s, %d) value (account,email,age);
        User user = new User();

        user.setAccount("TestUser02");
        user.setEmail("TestUser02@gmail.com");
        user.setPhoneNumber("010-111-1111");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("admin");

        User newUser = userRepository.save(user);
        System.out.println("newUser: "+newUser);

    }

    @Test
      public void read(){
  //  public User read(@RequestParam Long id){
        //Optional<User> user = userRepository.findById(id);
        Optional<User> user = userRepository.findById(2L);

        user.ifPresent(selectUser->{
            System.out.println("user: "+selectUser);
            System.out.println("email: "+selectUser.getEmail());
        });

      //  return user.get();

    }

    @Test
    public void update(){
        Optional<User> user = userRepository.findById(2L);

        user.ifPresent(selectUser->{
            selectUser.setAccount("PPPP");
            selectUser.setUpdatedAt(LocalDateTime.now());
            selectUser.setUpdatedBy("update method()");

            userRepository.save(selectUser);
        });
    }

    //@DeleteMapping("/api/user")
    //public void delete(@RequestParam Long id){
    @Test
    @Transactional              //테스트 코드등에서 실제 데이터에 영향받지않고 원래 데이터로 롤백하여주는 어노테이션
    public void delete(){
        Optional<User> user = userRepository.findById(3L);

        Assertions.assertTrue(user.isPresent());        //true

        user.ifPresent(selectUser->{
            userRepository.delete(selectUser);
        });

        Optional<User> deleteUser = userRepository.findById(3L);

        Assertions.assertFalse(deleteUser.isPresent()); //false

      /*  if(deleteUser.isPresent()){
            System.out.println("데이터 존재: "+deleteUser);
        }else{
            System.out.println("데이터 삭제 데이터 없음");
        }*/


    }

}
