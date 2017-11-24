package com.janp.justanormalperson.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class UserController {
//
//    @RequestMapping(value = "", method = RequestMethod.GET)
//    public ResponseEntity<UserDto> getUser() {
//        User currentUser = UserUtils.getCurrentUser();
//        if (currentUser == null)
//            return ResponseEntity.badRequest().build();
//
//        String username = currentUser.getUsername();
//
//        List<String> groups = currentUser.getAuthorities().stream().map(a -> a.getAuthority()).collect(Collectors.toList());
//
//        UserDto userDto = new UserDto();
//        userDto.setUsername(username);
//        userDto.setGroups(groups);
//        return ResponseEntity.ok(userDto);
//    }

}
