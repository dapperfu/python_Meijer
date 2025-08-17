package kotlin.text;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u001a"}, d2 = {"Lkotlin/text/Charsets;", "", "<init>", "()V", "Ljava/nio/charset/Charset;", "b", "Ljava/nio/charset/Charset;", "UTF_8", "c", "UTF_16", "d", "UTF_16BE", "e", "UTF_16LE", "f", "US_ASCII", "g", "ISO_8859_1", "h", "utf_32le", "i", "utf_32be", "()Ljava/nio/charset/Charset;", "UTF_32LE", "a", "UTF_32BE", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Charsets {

    /* renamed from: a, reason: collision with root package name */
    public static final Charsets f147389a = new Charsets();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final Charset UTF_8;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final Charset UTF_16;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final Charset UTF_16BE;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final Charset UTF_16LE;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final Charset US_ASCII;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final Charset ISO_8859_1;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static volatile Charset utf_32le;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static volatile Charset utf_32be;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        Intrinsics.i(charsetForName, "forName(...)");
        UTF_8 = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        Intrinsics.i(charsetForName2, "forName(...)");
        UTF_16 = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        Intrinsics.i(charsetForName3, "forName(...)");
        UTF_16BE = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        Intrinsics.i(charsetForName4, "forName(...)");
        UTF_16LE = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        Intrinsics.i(charsetForName5, "forName(...)");
        US_ASCII = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        Intrinsics.i(charsetForName6, "forName(...)");
        ISO_8859_1 = charsetForName6;
    }

    @JvmName
    public final Charset a() {
        Charset charset = utf_32be;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        Intrinsics.i(charsetForName, "forName(...)");
        utf_32be = charsetForName;
        return charsetForName;
    }

    @JvmName
    public final Charset b() {
        Charset charset = utf_32le;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        Intrinsics.i(charsetForName, "forName(...)");
        utf_32le = charsetForName;
        return charsetForName;
    }

    private Charsets() {
    }
}
