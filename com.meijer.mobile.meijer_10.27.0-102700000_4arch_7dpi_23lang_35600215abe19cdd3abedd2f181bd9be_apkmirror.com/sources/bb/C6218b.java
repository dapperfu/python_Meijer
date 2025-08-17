package bb;

import java.nio.charset.Charset;

/* renamed from: bb.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6218b {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final Charset f60094a = Charset.forName("ISO-8859-1");

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Charset f60095b = Charset.forName("US-ASCII");

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Charset f60096c = Charset.forName("UTF-16");

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Charset f60097d = Charset.forName("UTF-16BE");

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Charset f60098e = Charset.forName("UTF-16LE");

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final Charset f60099f = Charset.forName("UTF-8");

    public static Charset a(String str) {
        return str == null ? Charset.defaultCharset() : Charset.forName(str);
    }

    public static Charset b(Charset charset) {
        return charset == null ? Charset.defaultCharset() : charset;
    }
}
