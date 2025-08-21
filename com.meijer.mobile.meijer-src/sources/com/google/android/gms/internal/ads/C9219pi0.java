package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.pi0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C9219pi0 extends AbstractC9539si0 {

    /* renamed from: b, reason: collision with root package name */
    final C8898mi0 f78469b;

    /* renamed from: c, reason: collision with root package name */
    final Character f78470c;

    /* renamed from: d, reason: collision with root package name */
    private volatile AbstractC9539si0 f78471d;

    C9219pi0(C8898mi0 c8898mi0, Character ch2) {
        this.f78469b = c8898mi0;
        boolean z10 = true;
        if (ch2 != null && c8898mi0.e('=')) {
            z10 = false;
        }
        C6782Df0.i(z10, "Padding character %s was already in alphabet", ch2);
        this.f78470c = ch2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9539si0
    void b(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        C6782Df0.k(0, i11, bArr.length);
        while (i12 < i11) {
            k(appendable, bArr, i12, Math.min(this.f78469b.f77706f, i11 - i12));
            i12 += this.f78469b.f77706f;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9539si0
    final int c(int i10) {
        return (int) (((this.f78469b.f77704d * i10) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9539si0
    final int d(int i10) {
        C8898mi0 c8898mi0 = this.f78469b;
        return c8898mi0.f77705e * Bi0.b(i10, c8898mi0.f77706f, RoundingMode.CEILING);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9539si0
    public final AbstractC9539si0 e() {
        AbstractC9539si0 abstractC9539si0J = this.f78471d;
        if (abstractC9539si0J == null) {
            C8898mi0 c8898mi0 = this.f78469b;
            C8898mi0 c8898mi0C = c8898mi0.c();
            abstractC9539si0J = c8898mi0C == c8898mi0 ? this : j(c8898mi0C, this.f78470c);
            this.f78471d = abstractC9539si0J;
        }
        return abstractC9539si0J;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9219pi0) {
            C9219pi0 c9219pi0 = (C9219pi0) obj;
            if (this.f78469b.equals(c9219pi0.f78469b) && Objects.equals(this.f78470c, c9219pi0.f78470c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch2 = this.f78470c;
        return Objects.hashCode(ch2) ^ this.f78469b.hashCode();
    }

    AbstractC9539si0 j(C8898mi0 c8898mi0, Character ch2) {
        return new C9219pi0(c8898mi0, ch2);
    }

    final void k(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        C6782Df0.k(i10, i10 + i11, bArr.length);
        int i12 = 0;
        C6782Df0.e(i11 <= this.f78469b.f77706f);
        long j10 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            j10 = (j10 | (bArr[i10 + i13] & 255)) << 8;
        }
        int i14 = (i11 + 1) * 8;
        C8898mi0 c8898mi0 = this.f78469b;
        while (i12 < i11 * 8) {
            long j11 = j10 >>> ((i14 - c8898mi0.f77704d) - i12);
            C8898mi0 c8898mi02 = this.f78469b;
            appendable.append(c8898mi02.a(((int) j11) & c8898mi02.f77703c));
            i12 += this.f78469b.f77704d;
        }
        if (this.f78470c != null) {
            while (i12 < this.f78469b.f77706f * 8) {
                this.f78470c.getClass();
                appendable.append('=');
                i12 += this.f78469b.f77704d;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.f78469b);
        if (8 % this.f78469b.f77704d != 0) {
            if (this.f78470c == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.f78470c);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9539si0
    int a(byte[] bArr, CharSequence charSequence) throws zzfzy {
        C8898mi0 c8898mi0;
        CharSequence charSequenceF = f(charSequence);
        if (this.f78469b.d(charSequenceF.length())) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequenceF.length()) {
                long jB = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    c8898mi0 = this.f78469b;
                    if (i12 >= c8898mi0.f77705e) {
                        break;
                    }
                    jB <<= c8898mi0.f77704d;
                    if (i10 + i12 < charSequenceF.length()) {
                        jB |= this.f78469b.b(charSequenceF.charAt(i13 + i10));
                        i13++;
                    }
                    i12++;
                }
                int i14 = c8898mi0.f77706f;
                int i15 = i13 * c8898mi0.f77704d;
                int i16 = (i14 - 1) * 8;
                while (i16 >= (i14 * 8) - i15) {
                    bArr[i11] = (byte) ((jB >>> i16) & 255);
                    i16 -= 8;
                    i11++;
                }
                i10 += this.f78469b.f77705e;
            }
            return i11;
        }
        throw new zzfzy("Invalid input length " + charSequenceF.length());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9539si0
    final CharSequence f(CharSequence charSequence) {
        charSequence.getClass();
        if (this.f78470c == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    C9219pi0(String str, String str2, Character ch2) {
        this(new C8898mi0(str, str2.toCharArray()), ch2);
    }
}
