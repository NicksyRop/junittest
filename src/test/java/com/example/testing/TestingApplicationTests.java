package com.example.testing;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TestingApplicationTests {

	@Test
	void itShouldAddTwoNumbers() {

		Calculator calculator = new Calculator();
		//given

		int numOne = 20;
		int numTwo = 50;
		//when

		int result = calculator.add(numOne,numTwo);


		//then

		assertThat(result).isEqualTo(70);
	}

	class Calculator{

		int add( int a , int b){

			return  a+b;
		}


	}

}
