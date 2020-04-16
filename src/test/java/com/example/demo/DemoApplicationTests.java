package com.example.demo;

import com.example.demo.entities.Author;
import com.example.demo.entities.Post;
import io.ebean.annotation.Platform;
import io.ebean.dbmigration.DbMigration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test

	public void migration()
	{
		DbMigration dbMigration = DbMigration.create();
		dbMigration.setPlatform(Platform.MYSQL);
		try {
			dbMigration.generateMigration();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void addPost(){
		var author = new Author();
		author.setName("abc");
		author.save();
		var post = new Post();
		post.setAuthorId(author.getId());
		post.setTitle("SBRNG");
		post.save();
	}
}
