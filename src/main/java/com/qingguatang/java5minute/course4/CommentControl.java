package com.qingguatang.java5minute.course4;

import com.qingguatang.java5minute.course4.model.Comment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CommentControl {
    @RequestMapping(path = "/comments")
    public String comments(ModelMap modelMap) {
        // 执行方法
        List<Comment> comments = getComment();

        modelMap.addAttribute("comments", comments);
        return "comments";
    }

    private List<Comment> getComment() {
        List<Comment> comments = new ArrayList<>();

        // 添加第一条评论
        Comment comment = new Comment();
        comment.setIcon("http://p1.music.126.net/fQPcNZ7yTMMRkBIobpgiXw==/109951163284896187.jpg?param=50y50");
        comment.setNickName("Notearslefttocry");
        comment.setContent("hello！一转眼四年了！终于等到王者的归来~阿呆的全球屠榜又要开始啦！在此献上我的鸡腿！嘻嘻~");
        comment.setCommentTime("2015年10月23日");
        comment.setLikeNum(82747);
        comments.add(comment);

        // 添加第二条评论
        comment = new Comment();
        comment.setIcon("http://p1.music.126.net/fQPcNZ7yTMMRkBIobpgiXw==/109951163284896187.jpg?param=50y50");
        comment.setNickName("Notearslefttocry");
        comment.setContent("hello！一转眼四年了！终于等到王者的归来~阿呆的全球屠榜又要开始啦！在此献上我的鸡腿！嘻嘻~");
        comment.setCommentTime("2015年10月23日");
        comment.setLikeNum(82747);
        comments.add(comment);

        return comments;
    }
}
