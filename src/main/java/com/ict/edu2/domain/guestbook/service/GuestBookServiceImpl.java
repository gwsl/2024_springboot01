package com.ict.edu2.domain.guestbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.edu2.domain.guestbook.mapper.GuestBookMapper;
import com.ict.edu2.domain.guestbook.vo.GuestBookVO;

@Service
public class GuestBookServiceImpl implements GuestBookService{
    @Autowired
    private GuestBookMapper guestBookMapper;

    @Override
    public List<GuestBookVO> getGuestbookList() {
        return guestBookMapper.getGuestbookList();
    }

    @Override
    public GuestBookVO getGuestbookDetail(String gb_idx) {
        return guestBookMapper.getGuestbookDetail(gb_idx);
    }
    
    
}
