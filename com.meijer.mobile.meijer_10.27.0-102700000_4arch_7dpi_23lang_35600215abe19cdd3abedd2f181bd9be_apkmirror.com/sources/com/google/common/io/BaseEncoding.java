package com.google.common.io;

import Be.p;
import com.medallia.digital.mobilesdk.l3;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes6.dex */
public abstract class BaseEncoding {

    /* renamed from: a, reason: collision with root package name */
    private static final BaseEncoding f88027a = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: b, reason: collision with root package name */
    private static final BaseEncoding f88028b = new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* renamed from: c, reason: collision with root package name */
    private static final BaseEncoding f88029c = new d("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* renamed from: d, reason: collision with root package name */
    private static final BaseEncoding f88030d = new d("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* renamed from: e, reason: collision with root package name */
    private static final BaseEncoding f88031e = new b("base16()", "0123456789ABCDEF");

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f88032a;

        /* renamed from: b, reason: collision with root package name */
        private final char[] f88033b;

        /* renamed from: c, reason: collision with root package name */
        final int f88034c;

        /* renamed from: d, reason: collision with root package name */
        final int f88035d;

        /* renamed from: e, reason: collision with root package name */
        final int f88036e;

        /* renamed from: f, reason: collision with root package name */
        final int f88037f;

        /* renamed from: g, reason: collision with root package name */
        private final byte[] f88038g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean[] f88039h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f88040i;

        a(String str, char[] cArr) {
            this(str, cArr, b(cArr), false);
        }

        private a(String str, char[] cArr, byte[] bArr, boolean z10) {
            this.f88032a = (String) p.q(str);
            this.f88033b = (char[]) p.q(cArr);
            try {
                int iE = Fe.c.e(cArr.length, RoundingMode.UNNECESSARY);
                this.f88035d = iE;
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iE);
                int i10 = 1 << (3 - iNumberOfTrailingZeros);
                this.f88036e = i10;
                this.f88037f = iE >> iNumberOfTrailingZeros;
                this.f88034c = cArr.length - 1;
                this.f88038g = bArr;
                boolean[] zArr = new boolean[i10];
                for (int i11 = 0; i11 < this.f88037f; i11++) {
                    zArr[Fe.c.b(i11 * 8, this.f88035d, RoundingMode.CEILING)] = true;
                }
                this.f88039h = zArr;
                this.f88040i = z10;
            } catch (ArithmeticException e10) {
                throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e10);
            }
        }

        private static byte[] b(char[] cArr) {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i10 = 0; i10 < cArr.length; i10++) {
                char c10 = cArr[i10];
                boolean z10 = true;
                p.f(c10 < 128, "Non-ASCII character: %s", c10);
                if (bArr[c10] != -1) {
                    z10 = false;
                }
                p.f(z10, "Duplicate character: %s", c10);
                bArr[c10] = (byte) i10;
            }
            return bArr;
        }

        int c(char c10) throws DecodingException {
            if (c10 > 127) {
                throw new DecodingException("Unrecognized character: 0x" + Integer.toHexString(c10));
            }
            byte b10 = this.f88038g[c10];
            if (b10 != -1) {
                return b10;
            }
            if (c10 <= ' ' || c10 == 127) {
                throw new DecodingException("Unrecognized character: 0x" + Integer.toHexString(c10));
            }
            throw new DecodingException("Unrecognized character: " + c10);
        }

        char d(int i10) {
            return this.f88033b[i10];
        }

        boolean e(int i10) {
            return this.f88039h[i10 % this.f88036e];
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f88040i == aVar.f88040i && Arrays.equals(this.f88033b, aVar.f88033b)) {
                    return true;
                }
            }
            return false;
        }

        public boolean f(char c10) {
            byte[] bArr = this.f88038g;
            return c10 < bArr.length && bArr[c10] != -1;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f88033b) + (this.f88040i ? 1231 : 1237);
        }

        public String toString() {
            return this.f88032a;
        }
    }

    private static final class b extends d {

        /* renamed from: h, reason: collision with root package name */
        final char[] f88041h;

        b(String str, String str2) {
            this(new a(str, str2.toCharArray()));
        }

        private b(a aVar) {
            super(aVar, null);
            this.f88041h = new char[512];
            p.d(aVar.f88033b.length == 16);
            for (int i10 = 0; i10 < 256; i10++) {
                this.f88041h[i10] = aVar.d(i10 >>> 4);
                this.f88041h[i10 | 256] = aVar.d(i10 & 15);
            }
        }

        @Override // com.google.common.io.BaseEncoding.d
        BaseEncoding o(a aVar, Character ch2) {
            return new b(aVar);
        }

        @Override // com.google.common.io.BaseEncoding.d, com.google.common.io.BaseEncoding
        int e(byte[] bArr, CharSequence charSequence) throws DecodingException {
            p.q(bArr);
            if (charSequence.length() % 2 != 1) {
                int i10 = 0;
                int i11 = 0;
                while (i10 < charSequence.length()) {
                    bArr[i11] = (byte) ((this.f88042f.c(charSequence.charAt(i10)) << 4) | this.f88042f.c(charSequence.charAt(i10 + 1)));
                    i10 += 2;
                    i11++;
                }
                return i11;
            }
            throw new DecodingException("Invalid input length " + charSequence.length());
        }

        @Override // com.google.common.io.BaseEncoding.d, com.google.common.io.BaseEncoding
        void h(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            p.q(appendable);
            p.v(i10, i10 + i11, bArr.length);
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = bArr[i10 + i12] & 255;
                appendable.append(this.f88041h[i13]);
                appendable.append(this.f88041h[i13 | 256]);
            }
        }
    }

    private static final class c extends d {
        c(String str, String str2, Character ch2) {
            this(new a(str, str2.toCharArray()), ch2);
        }

        private c(a aVar, Character ch2) {
            super(aVar, ch2);
            p.d(aVar.f88033b.length == 64);
        }

        @Override // com.google.common.io.BaseEncoding.d
        BaseEncoding o(a aVar, Character ch2) {
            return new c(aVar, ch2);
        }

        @Override // com.google.common.io.BaseEncoding.d, com.google.common.io.BaseEncoding
        int e(byte[] bArr, CharSequence charSequence) throws DecodingException {
            p.q(bArr);
            CharSequence charSequenceM = m(charSequence);
            if (this.f88042f.e(charSequenceM.length())) {
                int i10 = 0;
                int i11 = 0;
                while (i10 < charSequenceM.length()) {
                    int i12 = i10 + 2;
                    int iC = (this.f88042f.c(charSequenceM.charAt(i10)) << 18) | (this.f88042f.c(charSequenceM.charAt(i10 + 1)) << 12);
                    int i13 = i11 + 1;
                    bArr[i11] = (byte) (iC >>> 16);
                    if (i12 < charSequenceM.length()) {
                        int i14 = i10 + 3;
                        int iC2 = iC | (this.f88042f.c(charSequenceM.charAt(i12)) << 6);
                        int i15 = i11 + 2;
                        bArr[i13] = (byte) ((iC2 >>> 8) & l3.f92484c);
                        if (i14 < charSequenceM.length()) {
                            i10 += 4;
                            i11 += 3;
                            bArr[i15] = (byte) ((iC2 | this.f88042f.c(charSequenceM.charAt(i14))) & l3.f92484c);
                        } else {
                            i11 = i15;
                            i10 = i14;
                        }
                    } else {
                        i11 = i13;
                        i10 = i12;
                    }
                }
                return i11;
            }
            throw new DecodingException("Invalid input length " + charSequenceM.length());
        }

        @Override // com.google.common.io.BaseEncoding.d, com.google.common.io.BaseEncoding
        void h(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            p.q(appendable);
            int i12 = i10 + i11;
            p.v(i10, i12, bArr.length);
            while (i11 >= 3) {
                int i13 = i10 + 2;
                int i14 = ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10] & 255) << 16);
                i10 += 3;
                int i15 = i14 | (bArr[i13] & 255);
                appendable.append(this.f88042f.d(i15 >>> 18));
                appendable.append(this.f88042f.d((i15 >>> 12) & 63));
                appendable.append(this.f88042f.d((i15 >>> 6) & 63));
                appendable.append(this.f88042f.d(i15 & 63));
                i11 -= 3;
            }
            if (i10 < i12) {
                n(appendable, bArr, i10, i12 - i10);
            }
        }
    }

    private static class d extends BaseEncoding {

        /* renamed from: f, reason: collision with root package name */
        final a f88042f;

        /* renamed from: g, reason: collision with root package name */
        final Character f88043g;

        d(String str, String str2, Character ch2) {
            this(new a(str, str2.toCharArray()), ch2);
        }

        d(a aVar, Character ch2) {
            this.f88042f = (a) p.q(aVar);
            p.l(ch2 == null || !aVar.f(ch2.charValue()), "Padding character %s was already in alphabet", ch2);
            this.f88043g = ch2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f88042f.equals(dVar.f88042f) && Objects.equals(this.f88043g, dVar.f88043g)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f88042f.hashCode() ^ Objects.hashCode(this.f88043g);
        }

        @Override // com.google.common.io.BaseEncoding
        int j(int i10) {
            return (int) (((this.f88042f.f88035d * i10) + 7) / 8);
        }

        @Override // com.google.common.io.BaseEncoding
        int k(int i10) {
            a aVar = this.f88042f;
            return aVar.f88036e * Fe.c.b(i10, aVar.f88037f, RoundingMode.CEILING);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding l() {
            return this.f88043g == null ? this : o(this.f88042f, null);
        }

        BaseEncoding o(a aVar, Character ch2) {
            return new d(aVar, ch2);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("BaseEncoding.");
            sb2.append(this.f88042f);
            if (8 % this.f88042f.f88035d != 0) {
                if (this.f88043g == null) {
                    sb2.append(".omitPadding()");
                } else {
                    sb2.append(".withPadChar('");
                    sb2.append(this.f88043g);
                    sb2.append("')");
                }
            }
            return sb2.toString();
        }

        @Override // com.google.common.io.BaseEncoding
        int e(byte[] bArr, CharSequence charSequence) throws DecodingException {
            a aVar;
            p.q(bArr);
            CharSequence charSequenceM = m(charSequence);
            if (this.f88042f.e(charSequenceM.length())) {
                int i10 = 0;
                int i11 = 0;
                while (i10 < charSequenceM.length()) {
                    long jC = 0;
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        aVar = this.f88042f;
                        if (i12 >= aVar.f88036e) {
                            break;
                        }
                        jC <<= aVar.f88035d;
                        if (i10 + i12 < charSequenceM.length()) {
                            jC |= this.f88042f.c(charSequenceM.charAt(i13 + i10));
                            i13++;
                        }
                        i12++;
                    }
                    int i14 = aVar.f88037f;
                    int i15 = (i14 * 8) - (i13 * aVar.f88035d);
                    int i16 = (i14 - 1) * 8;
                    while (i16 >= i15) {
                        bArr[i11] = (byte) ((jC >>> i16) & 255);
                        i16 -= 8;
                        i11++;
                    }
                    i10 += this.f88042f.f88036e;
                }
                return i11;
            }
            throw new DecodingException("Invalid input length " + charSequenceM.length());
        }

        @Override // com.google.common.io.BaseEncoding
        void h(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            p.q(appendable);
            p.v(i10, i10 + i11, bArr.length);
            int i12 = 0;
            while (i12 < i11) {
                n(appendable, bArr, i10 + i12, Math.min(this.f88042f.f88037f, i11 - i12));
                i12 += this.f88042f.f88037f;
            }
        }

        @Override // com.google.common.io.BaseEncoding
        CharSequence m(CharSequence charSequence) {
            p.q(charSequence);
            Character ch2 = this.f88043g;
            if (ch2 == null) {
                return charSequence;
            }
            char cCharValue = ch2.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == cCharValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        void n(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            boolean z10;
            p.q(appendable);
            p.v(i10, i10 + i11, bArr.length);
            int i12 = 0;
            if (i11 <= this.f88042f.f88037f) {
                z10 = true;
            } else {
                z10 = false;
            }
            p.d(z10);
            long j10 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                j10 = (j10 | (bArr[i10 + i13] & 255)) << 8;
            }
            int i14 = ((i11 + 1) * 8) - this.f88042f.f88035d;
            while (i12 < i11 * 8) {
                a aVar = this.f88042f;
                appendable.append(aVar.d(((int) (j10 >>> (i14 - i12))) & aVar.f88034c));
                i12 += this.f88042f.f88035d;
            }
            if (this.f88043g != null) {
                while (i12 < this.f88042f.f88037f * 8) {
                    appendable.append(this.f88043g.charValue());
                    i12 += this.f88042f.f88035d;
                }
            }
        }
    }

    private static byte[] i(byte[] bArr, int i10) {
        if (i10 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return bArr2;
    }

    abstract int e(byte[] bArr, CharSequence charSequence) throws DecodingException;

    public String f(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    abstract void h(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException;

    abstract int j(int i10);

    abstract int k(int i10);

    public abstract BaseEncoding l();

    abstract CharSequence m(CharSequence charSequence);

    public static final class DecodingException extends IOException {
        DecodingException(String str) {
            super(str);
        }
    }

    public static BaseEncoding a() {
        return f88031e;
    }

    public static BaseEncoding b() {
        return f88027a;
    }

    public final String g(byte[] bArr, int i10, int i11) {
        p.v(i10, i10 + i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(k(i11));
        try {
            h(sb2, bArr, i10, i11);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    BaseEncoding() {
    }

    public final byte[] c(CharSequence charSequence) {
        try {
            return d(charSequence);
        } catch (DecodingException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    final byte[] d(CharSequence charSequence) throws DecodingException {
        CharSequence charSequenceM = m(charSequence);
        byte[] bArr = new byte[j(charSequenceM.length())];
        return i(bArr, e(bArr, charSequenceM));
    }
}
