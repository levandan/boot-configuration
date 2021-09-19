package com.mbc.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mbc.command.UserDto;
import com.mbc.model.User;
import com.mbc.service.UserService;

@Service
public class UserServiceImpl implements UserService {

  private final Map<UUID, User> users = new HashMap<>();

  private Logger log = LoggerFactory.getLogger(this.getClass());

  public List<User> getAll(){
    return new ArrayList<>(users.values());
  }

  public User getByUuid(String uuid){
    User user = users.get(UUID.fromString(uuid));
    return user != null ? user : new User();
  }

  public User create(UserDto userDto){
    UUID userId = UUID.fromString(userDto.getUuid());
    User user = new User(userId, userDto.getName(), userDto.getEmail());
    users.put(userId, user);
    return user;
  }

}
