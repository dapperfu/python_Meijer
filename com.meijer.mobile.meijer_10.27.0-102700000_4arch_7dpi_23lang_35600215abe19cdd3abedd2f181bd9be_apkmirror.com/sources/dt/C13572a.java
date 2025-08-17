package dt;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kw.C15331h;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ldt/a;", "", "<init>", "()V", "", "source", "", "a", "([B)Ljava/lang/String;", "codeVerifier", "b", "(Ljava/lang/String;)Ljava/lang/String;", "c", "()Ljava/lang/String;", "oauth2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: dt.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13572a {

    /* renamed from: a, reason: collision with root package name */
    public static final C13572a f127628a = new C13572a();

    private final String a(byte[] source) {
        return StringsKt.A1(C15331h.Companion.g(C15331h.INSTANCE, source, 0, 0, 3, null).b(), '=');
    }

    public final String b(String codeVerifier) throws NoSuchAlgorithmException {
        Intrinsics.j(codeVerifier, "codeVerifier");
        byte[] bytes = codeVerifier.getBytes(Charsets.US_ASCII);
        Intrinsics.i(bytes, "getBytes(...)");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Intrinsics.i(messageDigest, "getInstance(...)");
        messageDigest.update(bytes, 0, bytes.length);
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.i(bArrDigest, "digest(...)");
        return a(bArrDigest);
    }

    public final String c() {
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        return a(bArr);
    }

    private C13572a() {
    }
}
