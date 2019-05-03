package com.confyd.security;

public interface ISecurityUserService {

    String validatePasswordResetToken(long id, String token);

}
