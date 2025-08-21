package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.ni0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9005ni0 extends C9219pi0 {

    /* renamed from: e, reason: collision with root package name */
    final char[] f77962e;

    private C9005ni0(C8898mi0 c8898mi0) {
        super(c8898mi0, null);
        this.f77962e = new char[512];
        C6782Df0.e(c8898mi0.f77702b.length == 16);
        for (int i10 = 0; i10 < 256; i10++) {
            this.f77962e[i10] = c8898mi0.a(i10 >>> 4);
            this.f77962e[i10 | 256] = c8898mi0.a(i10 & 15);
        }
    }

    @Override // com.google.android.gms.internal.ads.C9219pi0, com.google.android.gms.internal.ads.AbstractC9539si0
    final void b(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        C6782Df0.k(0, i11, bArr.length);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = bArr[i12] & 255;
            appendable.append(this.f77962e[i13]);
            appendable.append(this.f77962e[i13 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.ads.C9219pi0
    final AbstractC9539si0 j(C8898mi0 c8898mi0, Character ch2) {
        return new C9005ni0(c8898mi0);
    }

    @Override // com.google.android.gms.internal.ads.C9219pi0, com.google.android.gms.internal.ads.AbstractC9539si0
    final int a(byte[] bArr, CharSequence charSequence) throws zzfzy {
        if (charSequence.length() % 2 != 1) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequence.length()) {
                bArr[i11] = (byte) ((this.f78469b.b(charSequence.charAt(i10)) << 4) | this.f78469b.b(charSequence.charAt(i10 + 1)));
                i10 += 2;
                i11++;
            }
            return i11;
        }
        throw new zzfzy("Invalid input length " + charSequence.length());
    }

    C9005ni0(String str, String str2) {
        this(new C8898mi0("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
