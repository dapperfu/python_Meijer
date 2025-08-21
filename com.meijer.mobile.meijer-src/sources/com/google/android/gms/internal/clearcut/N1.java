package com.google.android.gms.internal.clearcut;

import com.medallia.digital.mobilesdk.l3;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* loaded from: classes6.dex */
public final class N1 {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f82016a;

    /* renamed from: b, reason: collision with root package name */
    private zzbn f82017b;

    /* renamed from: c, reason: collision with root package name */
    private int f82018c;

    private N1(ByteBuffer byteBuffer) {
        this.f82016a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    private static int A(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    private static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt < 2048) {
                i12 += (127 - cCharAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char cCharAt2 = charSequence.charAt(i11);
                    if (cCharAt2 < 2048) {
                        i10 += (127 - cCharAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) < 65536) {
                                StringBuilder sb2 = new StringBuilder(39);
                                sb2.append("Unpaired surrogate at index ");
                                sb2.append(i11);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        StringBuilder sb3 = new StringBuilder(54);
        sb3.append("UTF-8 length does not fit in int: ");
        sb3.append(i12 + 4294967296L);
        throw new IllegalArgumentException(sb3.toString());
    }

    private final void e(int i10) throws IOException {
        byte b10 = (byte) i10;
        if (!this.f82016a.hasRemaining()) {
            throw new zzft(this.f82016a.position(), this.f82016a.limit());
        }
        this.f82016a.put(b10);
    }

    private final void f(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            e((i10 & l3.f93324d) | 128);
            i10 >>>= 7;
        }
        e(i10);
    }

    public static int g(int i10, S1 s12) {
        int iY = y(i10);
        int iC = s12.c();
        return iY + A(iC) + iC;
    }

    public static int h(int i10, String str) {
        return y(i10) + r(str);
    }

    public static int i(int i10, byte[] bArr) {
        return y(i10) + s(bArr);
    }

    public static int m(int i10, long j10) {
        return y(i10) + x(j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v20 */
    private static void n(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i10;
        char cCharAt;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        char c10 = 57343;
        int i11 = 0;
        if (!byteBuffer.hasArray()) {
            int length = charSequence.length();
            while (i11 < length) {
                char cCharAt2 = charSequence.charAt(i11);
                char c11 = cCharAt2;
                if (cCharAt2 < 128) {
                    byteBuffer.put((byte) c11);
                } else if (cCharAt2 < 2048) {
                    byteBuffer.put((byte) ((cCharAt2 >>> 6) | 960));
                    c11 = (cCharAt2 & '?') | 128;
                    byteBuffer.put((byte) c11);
                } else {
                    if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                        int i12 = i11 + 1;
                        if (i12 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i12);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                                byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                                byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                                byteBuffer.put((byte) ((codePoint & 63) | 128));
                                i11 = i12;
                            } else {
                                i11 = i12;
                            }
                        }
                        StringBuilder sb2 = new StringBuilder(39);
                        sb2.append("Unpaired surrogate at index ");
                        sb2.append(i11 - 1);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    byteBuffer.put((byte) ((cCharAt2 >>> '\f') | 480));
                    byteBuffer.put((byte) (((cCharAt2 >>> 6) & 63) | 128));
                    byteBuffer.put((byte) ((cCharAt2 & '?') | 128));
                }
                i11++;
            }
            return;
        }
        try {
            byte[] bArrArray = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            int iRemaining = byteBuffer.remaining();
            int length2 = charSequence.length();
            int i13 = iRemaining + iArrayOffset;
            while (i11 < length2) {
                int i14 = i11 + iArrayOffset;
                if (i14 >= i13 || (cCharAt = charSequence.charAt(i11)) >= 128) {
                    break;
                }
                bArrArray[i14] = (byte) cCharAt;
                i11++;
            }
            if (i11 == length2) {
                i10 = iArrayOffset + length2;
            } else {
                i10 = iArrayOffset + i11;
                while (i11 < length2) {
                    char cCharAt4 = charSequence.charAt(i11);
                    if (cCharAt4 < 128 && i10 < i13) {
                        bArrArray[i10] = (byte) cCharAt4;
                        i10++;
                    } else if (cCharAt4 < 2048 && i10 <= i13 - 2) {
                        int i15 = i10 + 1;
                        bArrArray[i10] = (byte) ((cCharAt4 >>> 6) | 960);
                        i10 += 2;
                        bArrArray[i15] = (byte) ((cCharAt4 & '?') | 128);
                    } else {
                        if ((cCharAt4 >= 55296 && c10 >= cCharAt4) || i10 > i13 - 3) {
                            if (i10 > i13 - 4) {
                                StringBuilder sb3 = new StringBuilder(37);
                                sb3.append("Failed writing ");
                                sb3.append(cCharAt4);
                                sb3.append(" at index ");
                                sb3.append(i10);
                                throw new ArrayIndexOutOfBoundsException(sb3.toString());
                            }
                            int i16 = i11 + 1;
                            if (i16 != charSequence.length()) {
                                char cCharAt5 = charSequence.charAt(i16);
                                if (Character.isSurrogatePair(cCharAt4, cCharAt5)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt4, cCharAt5);
                                    bArrArray[i10] = (byte) ((codePoint2 >>> 18) | 240);
                                    bArrArray[i10 + 1] = (byte) (((codePoint2 >>> 12) & 63) | 128);
                                    int i17 = i10 + 3;
                                    bArrArray[i10 + 2] = (byte) (((codePoint2 >>> 6) & 63) | 128);
                                    i10 += 4;
                                    bArrArray[i17] = (byte) ((codePoint2 & 63) | 128);
                                    i11 = i16;
                                } else {
                                    i11 = i16;
                                }
                            }
                            StringBuilder sb4 = new StringBuilder(39);
                            sb4.append("Unpaired surrogate at index ");
                            sb4.append(i11 - 1);
                            throw new IllegalArgumentException(sb4.toString());
                        }
                        bArrArray[i10] = (byte) ((cCharAt4 >>> '\f') | 480);
                        int i18 = i10 + 2;
                        bArrArray[i10 + 1] = (byte) (((cCharAt4 >>> 6) & 63) | 128);
                        i10 += 3;
                        bArrArray[i18] = (byte) ((cCharAt4 & '?') | 128);
                    }
                    i11++;
                    c10 = 57343;
                }
            }
            byteBuffer.position(i10 - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e10) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e10);
            throw bufferOverflowException;
        }
    }

    public static N1 q(byte[] bArr) {
        return t(bArr, 0, bArr.length);
    }

    public static int r(String str) {
        int iA = a(str);
        return A(iA) + iA;
    }

    public static int s(byte[] bArr) {
        return A(bArr.length) + bArr.length;
    }

    public static N1 t(byte[] bArr, int i10, int i11) {
        return new N1(bArr, 0, i11);
    }

    public static long v(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int x(long j10) {
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (((-16384) & j10) == 0) {
            return 2;
        }
        if (((-2097152) & j10) == 0) {
            return 3;
        }
        if (((-268435456) & j10) == 0) {
            return 4;
        }
        if (((-34359738368L) & j10) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j10) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j10) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j10) == 0) {
            return 8;
        }
        return (j10 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int y(int i10) {
        return A(i10 << 3);
    }

    public static int z(int i10) {
        if (i10 >= 0) {
            return A(i10);
        }
        return 10;
    }

    public final void b(int i10, S1 s12) throws IOException {
        j(i10, 2);
        if (s12.f82043a < 0) {
            s12.c();
        }
        f(s12.f82043a);
        s12.a(this);
    }

    public final void c(int i10, String str) throws IOException {
        j(i10, 2);
        try {
            int iA = A(str.length());
            if (iA != A(str.length() * 3)) {
                f(a(str));
                n(str, this.f82016a);
                return;
            }
            int iPosition = this.f82016a.position();
            if (this.f82016a.remaining() < iA) {
                throw new zzft(iPosition + iA, this.f82016a.limit());
            }
            this.f82016a.position(iPosition + iA);
            n(str, this.f82016a);
            int iPosition2 = this.f82016a.position();
            this.f82016a.position(iPosition);
            f((iPosition2 - iPosition) - iA);
            this.f82016a.position(iPosition2);
        } catch (BufferOverflowException e10) {
            zzft zzftVar = new zzft(this.f82016a.position(), this.f82016a.limit());
            zzftVar.initCause(e10);
            throw zzftVar;
        }
    }

    public final void d(int i10, byte[] bArr) throws IOException {
        j(i10, 2);
        f(bArr.length);
        int length = bArr.length;
        if (this.f82016a.remaining() < length) {
            throw new zzft(this.f82016a.position(), this.f82016a.limit());
        }
        this.f82016a.put(bArr, 0, length);
    }

    public final void j(int i10, int i11) throws IOException {
        f((i10 << 3) | i11);
    }

    public final void k(int i10, boolean z10) throws IOException {
        j(25, 0);
        byte b10 = z10 ? (byte) 1 : (byte) 0;
        if (!this.f82016a.hasRemaining()) {
            throw new zzft(this.f82016a.position(), this.f82016a.limit());
        }
        this.f82016a.put(b10);
    }

    public final void l(int i10, int i11) throws IOException {
        j(i10, 0);
        if (i11 >= 0) {
            f(i11);
        } else {
            w(i11);
        }
    }

    public final void o(int i10, J0 j02) throws IOException {
        if (this.f82017b != null) {
            if (this.f82018c != this.f82016a.position()) {
                this.f82017b.c(this.f82016a.array(), this.f82018c, this.f82016a.position() - this.f82018c);
            }
            zzbn zzbnVar = this.f82017b;
            zzbnVar.n(i10, j02);
            zzbnVar.b();
            this.f82018c = this.f82016a.position();
        }
        this.f82017b = zzbn.f(this.f82016a);
        this.f82018c = this.f82016a.position();
        zzbn zzbnVar2 = this.f82017b;
        zzbnVar2.n(i10, j02);
        zzbnVar2.b();
        this.f82018c = this.f82016a.position();
    }

    public final void p() {
        if (this.f82016a.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", Integer.valueOf(this.f82016a.remaining())));
        }
    }

    public final void u(int i10, long j10) throws IOException {
        j(i10, 0);
        w(j10);
    }

    public final void w(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            e((((int) j10) & l3.f93324d) | 128);
            j10 >>>= 7;
        }
        e((int) j10);
    }

    private N1(byte[] bArr, int i10, int i11) {
        this(ByteBuffer.wrap(bArr, i10, i11));
    }
}
