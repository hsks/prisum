package com.hsks.prisum.service;

import com.hsks.prisum.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;


@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @InjectMocks
    private UserService userService;

    @Mock
    private UserRepository userRepository;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void shouldFetchUsers() {
        userService.getAllUsers();

        verify(userRepository).findAll();
    }
}