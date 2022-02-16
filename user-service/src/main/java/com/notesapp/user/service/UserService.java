package com.notesapp.user.service;

import com.notesapp.user.VO.Notebook;
import com.notesapp.user.VO.ResponseTemplateVO;
import com.notesapp.user.entity.User;
import com.notesapp.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;


    public User saveUser(User user) {
        log.info("Inside saveUser method in UserService");
        return userRepository.save(user);
    }


    public ResponseTemplateVO getUserWithNotebook(String username) {
        log.info("  getUserWithNotebook method in UserService");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRepository.findByUsername(username);

        Notebook notebook =
                restTemplate.getForObject("http://NOTEBOOK-SERVICE/notebook/"+user.getUsername(), Notebook.class);
        vo.setUser(user);
        vo.setNotebook(notebook);
        return vo;
    }
}
