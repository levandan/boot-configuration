package com.mbc.service;

import java.util.List;

import com.mbc.command.UserDto;
import com.mbc.model.User;

public interface UserService {

  List<User> getAll();
  User getByUuid(String uuid);
  User create(UserDto userDto);

}
