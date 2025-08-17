package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.oi0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8987oi0 extends C9094pi0 {
    private C8987oi0(C8773mi0 c8773mi0, Character ch2) {
        super(c8773mi0, ch2);
        C6657Df0.e(c8773mi0.f76862b.length == 64);
    }

    @Override // com.google.android.gms.internal.ads.C9094pi0, com.google.android.gms.internal.ads.AbstractC9414si0
    final void b(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        C6657Df0.k(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = bArr[i12] & 255;
            int i15 = ((bArr[i12 + 1] & 255) << 8) | (i14 << 16) | (bArr[i12 + 2] & 255);
            appendable.append(this.f77629b.a(i15 >>> 18));
            appendable.append(this.f77629b.a((i15 >>> 12) & 63));
            appendable.append(this.f77629b.a((i15 >>> 6) & 63));
            appendable.append(this.f77629b.a(i15 & 63));
            i12 += 3;
        }
        if (i12 < i11) {
            k(appendable, bArr, i12, i11 - i12);
        }
    }

    @Override // com.google.android.gms.internal.ads.C9094pi0
    final AbstractC9414si0 j(C8773mi0 c8773mi0, Character ch2) {
        return new C8987oi0(c8773mi0, ch2);
    }

    C8987oi0(String str, String str2, Character ch2) {
        this(new C8773mi0(str, str2.toCharArray()), ch2);
    }

    @Override // com.google.android.gms.internal.ads.C9094pi0, com.google.android.gms.internal.ads.AbstractC9414si0
    final int a(byte[] bArr, CharSequence charSequence) throws zzfzy {
        CharSequence charSequenceF = f(charSequence);
        if (this.f77629b.d(charSequenceF.length())) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequenceF.length()) {
                int i12 = i11 + 1;
                int iB = (this.f77629b.b(charSequenceF.charAt(i10)) << 18) | (this.f77629b.b(charSequenceF.charAt(i10 + 1)) << 12);
                bArr[i11] = (byte) (iB >>> 16);
                int i13 = i10 + 2;
                if (i13 < charSequenceF.length()) {
                    int i14 = i10 + 3;
                    int iB2 = iB | (this.f77629b.b(charSequenceF.charAt(i13)) << 6);
                    int i15 = i11 + 2;
                    bArr[i12] = (byte) ((iB2 >>> 8) & com.medallia.digital.mobilesdk.l3.f92484c);
                    if (i14 < charSequenceF.length()) {
                        i10 += 4;
                        i11 += 3;
                        bArr[i15] = (byte) ((iB2 | this.f77629b.b(charSequenceF.charAt(i14))) & com.medallia.digital.mobilesdk.l3.f92484c);
                    } else {
                        i11 = i15;
                        i10 = i14;
                    }
                } else {
                    i10 = i13;
                    i11 = i12;
                }
            }
            return i11;
        }
        throw new zzfzy("Invalid input length " + charSequenceF.length());
    }
}
