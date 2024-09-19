package com.nadia.donatellouserservice.Services;

import com.nadia.donatellouserservice.Entities.User;
import com.nadia.donatellouserservice.Repositories.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCreateUser() {
        User user = new User();
        user.setId(1L);
        user.setUsername("anna_svensson");
        user.setEmail("anna@example.com");

        when(userRepository.save(user)).thenReturn(user);
        User result = userService.createUser(user);

        assertNotNull(result);
        assertEquals("anna_svensson", result.getUsername());
        assertEquals("anna@example.com", result.getEmail());
        verify(userRepository, times(1)).save(user);
    }


    @Test
    public void testGetAllUsers() {
        User user1 = new User();
        user1.setId(1L);
        user1.setUsername("anna_svensson");
        user1.setEmail("anna@example.com");

        User user2 = new User();
        user2.setId(2L);
        user2.setUsername("erik_larsson");
        user2.setEmail("erik@example.com");

        List<User> users = Arrays.asList(user1, user2);
        when(userRepository.findAll()).thenReturn(users);
        List<User> result = userService.getAllUsers();

        assertEquals(2, result.size());
        assertEquals("anna_svensson", result.get(0).getUsername());
        assertEquals("erik_larsson", result.get(1).getUsername());
        verify(userRepository, times(1)).findAll();
    }
}