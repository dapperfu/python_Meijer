package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.ni0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8880ni0 extends C9094pi0 {

    /* renamed from: e, reason: collision with root package name */
    final char[] f77122e;

    private C8880ni0(C8773mi0 c8773mi0) {
        super(c8773mi0, null);
        this.f77122e = new char[512];
        C6657Df0.e(c8773mi0.f76862b.length == 16);
        for (int i10 = 0; i10 < 256; i10++) {
            this.f77122e[i10] = c8773mi0.a(i10 >>> 4);
            this.f77122e[i10 | 256] = c8773mi0.a(i10 & 15);
        }
    }

    @Override // com.google.android.gms.internal.ads.C9094pi0, com.google.android.gms.internal.ads.AbstractC9414si0
    final void b(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        C6657Df0.k(0, i11, bArr.length);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = bArr[i12] & 255;
            appendable.append(this.f77122e[i13]);
            appendable.append(this.f77122e[i13 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.ads.C9094pi0
    final AbstractC9414si0 j(C8773mi0 c8773mi0, Character ch2) {
        return new C8880ni0(c8773mi0);
    }

    @Override // com.google.android.gms.internal.ads.C9094pi0, com.google.android.gms.internal.ads.AbstractC9414si0
    final int a(byte[] bArr, CharSequence charSequence) throws zzfzy {
        if (charSequence.length() % 2 != 1) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequence.length()) {
                bArr[i11] = (byte) ((this.f77629b.b(charSequence.charAt(i10)) << 4) | this.f77629b.b(charSequence.charAt(i10 + 1)));
                i10 += 2;
                i11++;
            }
            return i11;
        }
        throw new zzfzy("Invalid input length " + charSequence.length());
    }

    C8880ni0(String str, String str2) {
        this(new C8773mi0("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
