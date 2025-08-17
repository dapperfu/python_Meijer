package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.si0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9414si0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC9414si0 f78292a;

    AbstractC9414si0() {
    }

    public static AbstractC9414si0 g() {
        return f78292a;
    }

    abstract int a(byte[] bArr, CharSequence charSequence) throws zzfzy;

    abstract void b(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException;

    abstract int c(int i10);

    abstract int d(int i10);

    public abstract AbstractC9414si0 e();

    abstract CharSequence f(CharSequence charSequence);

    public final String h(byte[] bArr, int i10, int i11) {
        C6657Df0.k(0, i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(d(i11));
        try {
            b(sb2, bArr, 0, i11);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    static {
        new C8987oi0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
        new C8987oi0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new C9094pi0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new C9094pi0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        f78292a = new C8880ni0("base16()", "0123456789ABCDEF");
    }

    public final byte[] i(CharSequence charSequence) {
        try {
            CharSequence charSequenceF = f(charSequence);
            int iC = c(charSequenceF.length());
            byte[] bArr = new byte[iC];
            int iA = a(bArr, charSequenceF);
            if (iA == iC) {
                return bArr;
            }
            byte[] bArr2 = new byte[iA];
            System.arraycopy(bArr, 0, bArr2, 0, iA);
            return bArr2;
        } catch (zzfzy e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
