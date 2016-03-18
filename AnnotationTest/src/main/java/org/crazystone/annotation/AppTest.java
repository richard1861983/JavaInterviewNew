package org.crazystone.annotation;

import junit.framework.TestCase;

public class AppTest
        extends TestCase
{

    public void testApp()
    {
        User user = new User();
        user.setAge(100);
        user.setUserName("skylun");
        user.setUserId(1);

        UserDAO userDao = new UserDAO();
        userDao.save(user);
    }

}