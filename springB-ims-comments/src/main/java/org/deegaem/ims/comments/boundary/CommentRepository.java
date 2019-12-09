package org.deegaem.ims.comments.boundary;

import org.deegaem.ims.comments.entity.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Long> {

}
