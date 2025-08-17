package Qv;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kw.C15331h;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LQv/k;", "", "<init>", "()V", "", "username", "password", "Ljava/nio/charset/Charset;", "charset", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f31461a = new k();

    @JvmStatic
    @JvmOverloads
    public static final String a(String username, String password) {
        Intrinsics.j(username, "username");
        Intrinsics.j(password, "password");
        return c(username, password, null, 4, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final String b(String username, String password, Charset charset) {
        Intrinsics.j(username, "username");
        Intrinsics.j(password, "password");
        Intrinsics.j(charset, "charset");
        return "Basic " + C15331h.INSTANCE.c(username + ':' + password, charset).a();
    }

    public static /* synthetic */ String c(String str, String str2, Charset charset, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            charset = Charsets.ISO_8859_1;
        }
        return b(str, str2, charset);
    }

    private k() {
    }
}
