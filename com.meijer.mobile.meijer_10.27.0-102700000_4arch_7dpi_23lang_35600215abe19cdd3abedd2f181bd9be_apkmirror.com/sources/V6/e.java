package V6;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public interface e {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f36934a = Charset.forName("UTF-8");

    boolean equals(Object obj);

    int hashCode();

    void updateDiskCacheKey(MessageDigest messageDigest);
}
