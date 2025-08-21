package Ig;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f14557a = Charset.defaultCharset();

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f14558b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f14559c;

    /* renamed from: d, reason: collision with root package name */
    private static final Charset f14560d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f14561e;

    /* JADX WARN: Removed duplicated region for block: B:88:0x00e1 A[PHI: r19
      0x00e1: PHI (r19v6 boolean) = (r19v5 boolean), (r19v5 boolean), (r19v5 boolean), (r19v7 boolean), (r19v7 boolean), (r19v7 boolean) binds: [B:90:0x00e7, B:92:0x00eb, B:94:0x00ef, B:82:0x00d5, B:83:0x00d7, B:85:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.nio.charset.Charset a(byte[] r21, java.util.Map<com.google.zxing.d, ?> r22) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ig.p.a(byte[], java.util.Map):java.nio.charset.Charset");
    }

    static {
        Charset charsetForName;
        Charset charsetForName2;
        boolean z10;
        Charset charsetForName3 = null;
        try {
            charsetForName = Charset.forName("SJIS");
        } catch (UnsupportedCharsetException unused) {
            charsetForName = null;
        }
        f14558b = charsetForName;
        try {
            charsetForName2 = Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused2) {
            charsetForName2 = null;
        }
        f14559c = charsetForName2;
        try {
            charsetForName3 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        f14560d = charsetForName3;
        Charset charset = f14558b;
        if ((charset != null && charset.equals(f14557a)) || (charsetForName3 != null && charsetForName3.equals(f14557a))) {
            z10 = true;
        } else {
            z10 = false;
        }
        f14561e = z10;
    }
}
