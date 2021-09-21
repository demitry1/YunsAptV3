package org.demitry.notice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/notice/")
public class NoticeController {
    //공지사항 리스트페이지
    @RequestMapping("/notice")
    public String notice()
    {
        return "/notice/notice";
    }
    //공지사항 상세페이지
    @RequestMapping(value = "/noticeDetail", method = RequestMethod.GET)
    public String noticeDetail(){
        return "/notice/noticeDetail";
    }
    //공지사항 입력
    @RequestMapping(value = "/noticeInsert", method = RequestMethod.GET)
    public String noticeInsert(){
        return "/notice/noticeInsert";
    }
    //공지사항 수정페이지
    @RequestMapping("/noticeModify")
    public String noticeModify(){
        return "/notice/noticeModify";
    }
}