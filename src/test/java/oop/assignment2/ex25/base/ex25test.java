package oop.assignment2.ex25.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex25test {
    /*
    The password '12345' is a very weak password.
The password 'abcdef' is a weak password.
The password 'abc123xyz' is a strong password.
The password '1337h@xor!' is a very strong password.
     */

    //  1 = very weak password
    //  2 = weak password
    //  3 = good password
    //  4 = strong password
    //  5 = very strong password

    @Test
    void is_very_weak_password_true() {
        boolean isWeak = false;
        PasswordValidator pw = new PasswordValidator();
        int res = pw.passwordValidator("12345");
        if(res == 1) {
            isWeak = true;
        }
        assertTrue(isWeak);
    }

    @Test
    void is_not_very_weak_password_true() {
        boolean isWeak = false;
        PasswordValidator pw = new PasswordValidator();
        int res = pw.passwordValidator("abcdef");
        if(res == 1) {
            isWeak = true;
        }
        assertFalse(isWeak);
    }

    @Test
    void is__weak_password_true() {
        boolean isWeak = false;
        PasswordValidator pw = new PasswordValidator();
        int res = pw.passwordValidator("abcdef");
        if(res == 2) {
            isWeak = true;
        }
        assertTrue(isWeak);
    }

    @Test
    void is_not_weak_password_true() {
        boolean isWeak = false;
        PasswordValidator pw = new PasswordValidator();
        int res = pw.passwordValidator("abc123xyz");
        if(res == 2) {
            isWeak = true;
        }
        assertFalse(isWeak);
    }

    @Test
    void is_good_password_true() {
        boolean isWeak = false;
        PasswordValidator pw = new PasswordValidator();
        int res = pw.passwordValidator("helohello");
        if(res == 3) {
            isWeak = true;
        }
        assertTrue(isWeak);
    }

    @Test
    void is_not_good_password_true() {
        boolean isWeak = false;
        PasswordValidator pw = new PasswordValidator();
        int res = pw.passwordValidator("helohelo");
        if(res == 3) {
            isWeak = true;
        }
        assertFalse(isWeak);
    }

    @Test
    void is_strong_password_true() {
        boolean isWeak = false;
        PasswordValidator pw = new PasswordValidator();
        int res = pw.passwordValidator("abc123xyz");
        if(res == 4) {
            isWeak = true;
        }
        assertTrue(isWeak);
    }

    @Test
    void is_not_strong_password_true() {
        boolean isWeak = false;
        PasswordValidator pw = new PasswordValidator();
        int res = pw.passwordValidator("abcxyz");
        if(res == 4) {
            isWeak = true;
        }
        assertFalse(isWeak);
    }

    @Test
    void is_very_strong_password_true() {
        boolean isWeak = false;
        PasswordValidator pw = new PasswordValidator();
        int res = pw.passwordValidator("1337h@xor!");
        if(res == 5) {
            isWeak = true;
        }
        assertTrue(isWeak);
    }

    @Test
    void is_not_very_strong_password_true() {
        boolean isWeak = false;
        PasswordValidator pw = new PasswordValidator();
        int res = pw.passwordValidator("abc123xyz");
        if(res == 5) {
            isWeak = true;
        }
        assertFalse(isWeak);
    }
}
