package me.catring.demo.service;

import me.catring.demo.domain.document.UserProfile;
import me.catring.demo.domain.entity.User;
import me.catring.demo.web.dto.UserDto;


public interface UserService {

    // about account

    // get
    User getUserById(int userId);

    User getUserByUsername(String username);

    int getUserCreditByUsername(String username);

    Iterable<User> getAllUser();


    // update
    boolean saveUser(User user);

    boolean addUser(UserDto userDto);

    boolean addNormalUser(UserDto userDto);

    boolean updateUser(UserDto userDto, String username);

    boolean updateUser(User user);

    boolean updatePassword(String oldPassword, String newPassword, String username);

    boolean updateUsername(String oldUsername, String newUsername);

    // delete
    boolean deleteUserByUserId(int userId);

    boolean deleteUserByUsernameAndPassword(String username, String password);


    // about profile

    // get
    UserProfile getProfileByUsername(String username);

    String getAvatarFilenameByUsername(String username);

    boolean resetAllProfiles();

    // update
    boolean addAddress(String address, String username);

    boolean updateAddress(int index, String address, String username);

    boolean updateProfilePart(String bio, String location, String username);

    boolean updateSubscriptionPart(boolean newsletters, boolean autoRecharge, String username);

    boolean updateAvatarFilename(String avatarFilename, String username);

    // remove
    boolean removeAddress(int addressId, String username);
}
