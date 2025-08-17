package com.google.android.gms.internal.pal;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class I9 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f82660a = c(1, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f82661b = c(2, 32);

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f82662c = c(2, 16);

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f82663d = c(2, 17);

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f82664e = c(2, 18);

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f82665f = c(2, 1);

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f82666g = c(2, 2);

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f82667h = c(2, 3);

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f82668i = c(2, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f82669j = c(2, 2);

    /* renamed from: k, reason: collision with root package name */
    public static final byte[] f82670k = c(2, 3);

    /* renamed from: l, reason: collision with root package name */
    public static final byte[] f82671l = new byte[0];

    /* renamed from: m, reason: collision with root package name */
    private static final byte[] f82672m;

    /* renamed from: n, reason: collision with root package name */
    private static final byte[] f82673n;

    /* renamed from: o, reason: collision with root package name */
    private static final byte[] f82674o;

    static {
        Charset charset = StandardCharsets.UTF_8;
        f82672m = "KEM".getBytes(charset);
        f82673n = "HPKE".getBytes(charset);
        f82674o = "HPKE-v1".getBytes(charset);
    }

    static byte[] f(String str, byte[] bArr, byte[] bArr2, int i10) throws GeneralSecurityException {
        return C10910te.c(c(2, i10), f82674o, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }

    static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        return C10910te.c(f82673n, bArr, bArr2, bArr3);
    }

    public static byte[] c(int i10, int i11) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) ((i11 >> (((i10 - i12) - 1) * 8)) & com.medallia.digital.mobilesdk.l3.f92484c);
        }
        return bArr;
    }

    static byte[] d(byte[] bArr) throws GeneralSecurityException {
        return C10910te.c(f82672m, bArr);
    }

    static byte[] e(String str, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return C10910te.c(f82674o, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }

    static void a(C10702gd c10702gd) throws GeneralSecurityException {
        if (c10702gd.z() != 2 && c10702gd.z() != 1) {
            String str = "UNRECOGNIZED";
            if (c10702gd.y() != 2 && c10702gd.y() != 1) {
                if (c10702gd.w() != 2 && c10702gd.w() != 1) {
                    return;
                }
                int iW = c10702gd.w();
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
            int iY = c10702gd.y();
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
        throw new GeneralSecurityException("Invalid KEM param: ".concat(Zc.a(c10702gd.z())));
    }
}
