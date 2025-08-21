package db;

import java.nio.charset.Charset;

/* renamed from: db.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13649b {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final Charset f128329a = Charset.forName("ISO-8859-1");

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Charset f128330b = Charset.forName("US-ASCII");

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Charset f128331c = Charset.forName("UTF-16");

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Charset f128332d = Charset.forName("UTF-16BE");

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Charset f128333e = Charset.forName("UTF-16LE");

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final Charset f128334f = Charset.forName("UTF-8");

    public static Charset a(String str) {
        return str == null ? Charset.defaultCharset() : Charset.forName(str);
    }

    public static Charset b(Charset charset) {
        return charset == null ? Charset.defaultCharset() : charset;
    }
}
