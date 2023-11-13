package Cook.Cookify_SpringBoot.domain.comment.dto;

import Cook.Cookify_SpringBoot.domain.comment.Comment;
import Cook.Cookify_SpringBoot.domain.member.dto.MemberInfoDto;
import lombok.Data;

@Data
public class ReCommentInfoDto  {


    private final static String DEFAULT_DELETE_MESSAGE = "삭제된 댓글입니다";

    private Long postId;
    private Long parentId;


    private Long reCommentId;
    private String content;
    private boolean isRemoved;


    private MemberInfoDto writerDto;

    public ReCommentInfoDto(Comment reComment) {
        this.postId = reComment.getRecipe().getId();
        this.parentId = reComment.getParent().getId();
        this.reCommentId = reComment.getId();
        this.content = reComment.getContent();

        if(reComment.isRemoved()){
            this.content = DEFAULT_DELETE_MESSAGE;
        }

        this.isRemoved = reComment.isRemoved();
        this.writerDto = new MemberInfoDto(reComment.getMember());
    }
}
