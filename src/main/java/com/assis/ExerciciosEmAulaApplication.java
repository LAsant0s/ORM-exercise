package com.assis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.assis.domain.ex3.Post;
import com.assis.domain.ex3.PostComment;
import com.assis.repository.ex3.PostCommentRepository;
import com.assis.repository.ex3.PostRepository;

@SpringBootApplication
public class ExerciciosEmAulaApplication implements CommandLineRunner {

	
	public static void main(String[] args) {
		SpringApplication.run(ExerciciosEmAulaApplication.class, args);
	}
	
//	@Autowired
//	TodoListRepository todoRepository; 
	
//	@Autowired
//	TodoListItemRepository itemRepository;
	
//	@Autowired
//	LibraryRepository libraryRepo; 
	
//	@Autowired
//	BookRepository bookRepo;
	
//	@Autowired
//	PostRepository postRepo; 
	
//	@Autowired
//	PostCommentRepository postCommentRepo;

	@Override
	public void run(String... args) throws Exception {
		// Exercício 1
		/*
			TodoList td = new TodoList(null, "teste"); 
			
			TodoListItem item1 = new TodoListItem(null, "item1", td);
			TodoListItem item2 = new TodoListItem(null, "item2", td);
			TodoListItem item3 = new TodoListItem(null, "item3", td);
			TodoListItem item4 = new TodoListItem(null, "item4", td);
			
			td.getListaDeItens().add(item1);
			td.getListaDeItens().add(item2);
			td.getListaDeItens().add(item3);
			td.getListaDeItens().add(item4);
	
			todoRepository.save(td); 
	
			itemRepository.save(item1);
			itemRepository.save(item2);
			itemRepository.save(item3);
			itemRepository.save(item4);
		*/
		
		// Exercício 2
		/*
			Library lib = new Library(null, "testeLib"); 
			
			Book book1 = new Book(null, "book1", lib);
			Book book2 = new Book(null, "book2", lib);
			Book book3 = new Book(null, "book3", lib);
			
			lib.getBooks().add(book1);
			lib.getBooks().add(book2);
			lib.getBooks().add(book3);
			
			libraryRepo.save(lib);
			
			bookRepo.save(book1);
			bookRepo.save(book2);
			bookRepo.save(book3);
		*/
		
		// Exercício 3
		/*
			Post post = new Post(null, "PostTeste");
			
			PostComment pc1 = new PostComment(null, "comentário 1", post); 
			PostComment pc2 = new PostComment(null, "comentário 2", post);
			PostComment pc3 = new PostComment(null, "comentário 3", post);
			
			post.addComment(pc1);
			post.addComment(pc2);
			post.addComment(pc3);
			
			post.removeComment(pc3);
			
			postRepo.save(post);
			
			postCommentRepo.save(pc1);
			postCommentRepo.save(pc2);
		*/
	}

}
