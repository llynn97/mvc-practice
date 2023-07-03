package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class UserTest {

    @DisplayName("패스워드를 초기화한다")
    @Test
    void name(){
        //given
        User user = new User();

        //when
        user.initPassword(new CorrectFixedPasswordGenerator());

        //then
        Assertions.assertThat(user.getPassword()).isNotNull();

    }

    @DisplayName("패스워드가 요구사항에 부합하지 않아 패스워드를 초기화하지 않는다")
    @Test
    void name2(){
        //given
        User user = new User();

        //when
        user.initPassword(new WrongFixedPasswordGenerator());

        //then
        Assertions.assertThat(user.getPassword()).isNull();

    }

}