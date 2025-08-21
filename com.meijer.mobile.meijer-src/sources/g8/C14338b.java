package g8;

import java.security.SecureRandom;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lg8/b;", "", "<init>", "()V", "", "byteAmount", "", "a", "(I)Ljava/lang/String;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: g8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14338b {

    /* renamed from: a, reason: collision with root package name */
    public static final C14338b f134108a = new C14338b();

    @JvmStatic
    public static final String a(int byteAmount) {
        byte[] bArr = new byte[byteAmount];
        new SecureRandom().nextBytes(bArr);
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < byteAmount; i10++) {
            String hexString = Integer.toHexString(bArr[i10] & 255);
            if (hexString.length() == 1) {
                sb2.append('0');
            }
            sb2.append(hexString);
        }
        String string = sb2.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    private C14338b() {
    }
}
