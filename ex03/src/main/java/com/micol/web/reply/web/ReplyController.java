package com.micol.web.reply.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.micol.web.reply.service.ReplyService;

@Controller
public class ReplyController {
	@Autowired ReplyService replyService;

}
