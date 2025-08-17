package f6;

import Q5.t;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf6/h;", "", "<init>", "()V", "", "input", "a", "(Ljava/lang/String;)Ljava/lang/String;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: f6.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13852h {

    /* renamed from: a, reason: collision with root package name */
    public static final C13852h f130810a = new C13852h();

    @JvmStatic
    public static final String a(String input) throws NoSuchAlgorithmException {
        if (input != null && input.length() != 0) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                Charset UTF_8 = StandardCharsets.UTF_8;
                Intrinsics.i(UTF_8, "UTF_8");
                byte[] bytes = input.getBytes(UTF_8);
                Intrinsics.i(bytes, "this as java.lang.String).getBytes(charset)");
                messageDigest.update(bytes);
                byte[] messageDigest2 = messageDigest.digest();
                StringBuilder sb2 = new StringBuilder();
                Intrinsics.i(messageDigest2, "messageDigest");
                for (byte b10 : messageDigest2) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.f142841a;
                    String str = String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(b10 & 255)}, 1));
                    Intrinsics.i(str, "format(format, *args)");
                    sb2.append(str);
                }
                return sb2.toString();
            } catch (NoSuchAlgorithmException e10) {
                t.a("MobileCore", "StringEncoder", "Failed to create SHA-256 hash for input: '" + input + "', Error: " + e10, new Object[0]);
            }
        }
        return null;
    }

    private C13852h() {
    }
}
