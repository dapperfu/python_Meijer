package com.google.android.gms.internal.pal;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class I9 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f83500a = c(1, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f83501b = c(2, 32);

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f83502c = c(2, 16);

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f83503d = c(2, 17);

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f83504e = c(2, 18);

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f83505f = c(2, 1);

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f83506g = c(2, 2);

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f83507h = c(2, 3);

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f83508i = c(2, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f83509j = c(2, 2);

    /* renamed from: k, reason: collision with root package name */
    public static final byte[] f83510k = c(2, 3);

    /* renamed from: l, reason: collision with root package name */
    public static final byte[] f83511l = new byte[0];

    /* renamed from: m, reason: collision with root package name */
    private static final byte[] f83512m;

    /* renamed from: n, reason: collision with root package name */
    private static final byte[] f83513n;

    /* renamed from: o, reason: collision with root package name */
    private static final byte[] f83514o;

    static {
        Charset charset = StandardCharsets.UTF_8;
        f83512m = "KEM".getBytes(charset);
        f83513n = "HPKE".getBytes(charset);
        f83514o = "HPKE-v1".getBytes(charset);
    }

    static byte[] f(String str, byte[] bArr, byte[] bArr2, int i10) throws GeneralSecurityException {
        return C11035te.c(c(2, i10), f83514o, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }

    static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        return C11035te.c(f83513n, bArr, bArr2, bArr3);
    }

    public static byte[] c(int i10, int i11) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) ((i11 >> (((i10 - i12) - 1) * 8)) & com.medallia.digital.mobilesdk.l3.f93323c);
        }
        return bArr;
    }

    static byte[] d(byte[] bArr) throws GeneralSecurityException {
        return C11035te.c(f83512m, bArr);
    }

    static byte[] e(String str, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return C11035te.c(f83514o, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }

    static void a(C10827gd c10827gd) throws GeneralSecurityException {
        if (c10827gd.z() != 2 && c10827gd.z() != 1) {
            String str = "UNRECOGNIZED";
            if (c10827gd.y() != 2 && c10827gd.y() != 1) {
                if (c10827gd.w() != 2 && c10827gd.w() != 1) {
                    return;
                }
                int iW = c10827gd.w();
                if (iW != 2) {
                    if (iW != 3) {
                        if (iW != 4) {
                            if (iW == 5) {
                                str = "CHACHA20_POLY1305";
                            }
                        } else {
                            str = "AES_256_GCM";
                        }
                    } else {
                        str = "AES_128_GCM";
                    }
                } else {
                    str = "AEAD_UNKNOWN";
                }
                throw new GeneralSecurityException("Invalid AEAD param: ".concat(str));
            }
            int iY = c10827gd.y();
            if (iY != 2) {
                if (iY != 3) {
                    if (iY != 4) {
                        if (iY == 5) {
                            str = "HKDF_SHA512";
                        }
                    } else {
                        str = "HKDF_SHA384";
                    }
                } else {
                    str = "HKDF_SHA256";
                }
            } else {
                str = "KDF_UNKNOWN";
            }
            throw new GeneralSecurityException("Invalid KDF param: ".concat(str));
        }
        throw new GeneralSecurityException("Invalid KEM param: ".concat(Zc.a(c10827gd.z())));
    }
}
