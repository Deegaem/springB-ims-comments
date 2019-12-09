package org.deegaem.ims.comments.boundary;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.deegaem.ims.comments.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentsService {

	@Autowired
	CommentRepository repo;

	public List<Comment> getComments() {
		List<Comment> comments = new ArrayList<>();
		repo.findAll().forEach(comments::add);
		return comments;
	}

	public Optional<Comment> getComment(Long id) {
		Optional<Comment> found = repo.findById(id);
		return found != null ? found : Optional.empty();
	}

	public Comment createComment(Comment comment) {
		return repo.save(comment);
	}

	public Comment updateComment(long id, Comment comment) {
		return repo.save(comment);
	}

	public void deleteComment(Long id) {
		repo.deleteById(id);
	}

}
