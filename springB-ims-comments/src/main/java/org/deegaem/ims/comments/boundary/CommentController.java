package org.deegaem.ims.comments.boundary;

import java.util.List;
import java.util.Optional;
import org.deegaem.ims.comments.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

	@Autowired
	CommentsService service;

	/*
	 * @GetMapping("comments/{issueid}") public Response getComments(@PathVariable
	 * Long issueId) { return Response.ok(service.getComments(issueId)).build(); }
	 */

	@RequestMapping(method = RequestMethod.GET, value = "/comments")
	public List<Comment> getComments() {
		return service.getComments();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/comments/{id}")
	public Optional<Comment> getComment(@PathVariable long id) {
		return service.getComment(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/comments")
	public ResponseEntity<Comment> createComment(@RequestBody Comment comment) {
		Comment createdComment = service.createComment(comment);
		return new ResponseEntity<Comment>(createdComment, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/comments/{id}")
	public ResponseEntity<Comment> updateComment(@PathVariable long id, @RequestBody Comment comment) {
		Comment updatedComment = service.updateComment(id, comment);
		return new ResponseEntity<Comment>(updatedComment, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/comments/{id}")
	public ResponseEntity<Comment> deleteComment(@PathVariable long id) {
		service.deleteComment(id);
		return new ResponseEntity<Comment>(HttpStatus.NO_CONTENT);
	}

}
