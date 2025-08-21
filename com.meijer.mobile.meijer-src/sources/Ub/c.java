package Ub;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes4.dex */
public final class c {
    public static String a(String str) {
        if (str != null) {
            return str.replaceAll("<", "").replaceAll(">", "").replaceAll("-", "").replaceAll(" ", "");
        }
        return null;
    }

    public static String b(String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            return a.a(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            return str;
        }
    }
}
