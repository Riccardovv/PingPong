package com.example.todo_list;

import com.example.todo_list.model.Todo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class TodoListApplicationTests {

	@Test
	void contextLoads() {

	}

	/*
	When a new todo is created make sure that it actually exists and is not null
	 */
	@Test
	void newTodo_whenCreated_notEmpty() {
		Todo todo = new Todo("user", "desc", new Date(), true);
		Assertions.assertNotNull(todo.getId());
	}


	/*
	when uptading the description of an existing todo it changes
	 */
	@Test
	void setDescription_whenUsed_updatesDescription() {
		Todo todo = new Todo("user", "desc", new Date(), true);
		String oldDesc = todo.getDescription();
		todo.setDescription("new desc");
		Assertions.assertNotEquals(oldDesc, todo.getDescription());

	}

	/*
	when a new todo is created, a creation date is automatically added
	 */
	@Test
	void getCreationDate_WhenCalled_creationDateIsSet() {
		Todo todo = new Todo("user", "desc", new Date(), true);

		Assertions.assertNotEquals(todo.getCreationDate(), null);
	}

	/*
	target date of the todo is created
	 */
	@Test
	void getTargetDate_WhenCalled_targetDateIsSet() {
		Todo todo = new Todo("user", "desc", new Date(), true);

		Assertions.assertNotEquals(todo.getTargetDate(), null);
	}


	/*
	when called in a todo, sets a string as the link
	 */
	@Test
	void SetLink_whenCalled_setsALink() {
		Todo todo = new Todo("user", "desc", new Date(), true);
		String link = "www.link.com";
		todo.setLink(link);
		Assertions.assertEquals(link,todo.getLink());

	}

	
	/*
	The function should return -1 is a video link, 0 if its a regular link and 1 if it is a video link
	 */
	@Test
	void getLinkType_whenCalled_returnsTypeOfLink() {
	}
}
