package Assignment1.oauth;

import Assignment1.dao.UsersDAO;
import Assignment1.dto.Users;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Authentication {
    private String username;
    private String password;
    public boolean Success;
    private Users user;

    private String stringEncode() {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");

            byte[] messageDigest = md.digest(
                    (this.username + this.password).getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            StringBuilder hashtext = new StringBuilder(no.toString(16));
            while (hashtext.toString().length() < 32) {
                hashtext = hashtext.append("0");
            }
            return hashtext.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean Check() {
        Users users = new UsersDAO().getUserOnUsername(username);
        boolean check = users.checkPassword(stringEncode());
        this.user = users;
        return check;
    }

    public Authentication(String username, String password) {
        this.username = username;
        this.password = password;
        this.Success = Check();
    }

    public Users getUser() {
        return this.user;
    }
}
