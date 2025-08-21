package U6;

import U6.g;
import com.bugsnag.android.repackaged.dslplatform.json.SerializationException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: g, reason: collision with root package name */
    private static final Charset f37270g = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private int f37271a;

    /* renamed from: b, reason: collision with root package name */
    private long f37272b;

    /* renamed from: c, reason: collision with root package name */
    private OutputStream f37273c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f37274d;

    /* renamed from: e, reason: collision with root package name */
    private final r f37275e;

    /* renamed from: f, reason: collision with root package name */
    private final g.e f37276f;

    public interface a<T> {
        void a(j jVar, T t10);
    }

    @Deprecated
    public j() {
        this(512, (r) null);
    }

    public final void e(OutputStream outputStream) {
        this.f37271a = 0;
        this.f37273c = outputStream;
        this.f37272b = 0L;
    }

    public final void j(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i10 = this.f37271a;
        if (i10 + length >= this.f37274d.length) {
            b(i10, length);
        }
        int i11 = this.f37271a;
        byte[] bArr2 = this.f37274d;
        for (int i12 = 0; i12 < bArr.length; i12++) {
            bArr2[i11 + i12] = bArr[i12];
        }
        this.f37271a += length;
    }

    j(int i10, r rVar) {
        this(new byte[i10], rVar);
    }

    private void b(int i10, int i11) throws IOException {
        OutputStream outputStream = this.f37273c;
        if (outputStream == null) {
            byte[] bArr = this.f37274d;
            this.f37274d = Arrays.copyOf(bArr, bArr.length + (bArr.length / 2) + i11);
            return;
        }
        try {
            outputStream.write(this.f37274d, 0, i10);
            this.f37271a = 0;
            this.f37272b += i10;
            byte[] bArr2 = this.f37274d;
            if (i11 > bArr2.length) {
                this.f37274d = Arrays.copyOf(bArr2, bArr2.length + (bArr2.length / 2) + i11);
            }
        } catch (IOException e10) {
            throw new SerializationException("Unable to write to target stream.", e10);
        }
    }

    private void o(CharSequence charSequence, int i10, int i11, int i12) {
        byte[] bArr = this.f37274d;
        int i13 = i10;
        int i14 = i11;
        while (i13 < i12) {
            char cCharAt = charSequence.charAt(i13);
            if (cCharAt == '\"') {
                int i15 = i14 + 1;
                bArr[i14] = 92;
                i14 += 2;
                bArr[i15] = 34;
            } else if (cCharAt == '\\') {
                int i16 = i14 + 1;
                bArr[i14] = 92;
                i14 += 2;
                bArr[i16] = 92;
            } else if (cCharAt < ' ') {
                if (cCharAt == '\b') {
                    int i17 = i14 + 1;
                    bArr[i14] = 92;
                    i14 += 2;
                    bArr[i17] = 98;
                } else if (cCharAt == '\t') {
                    int i18 = i14 + 1;
                    bArr[i14] = 92;
                    i14 += 2;
                    bArr[i18] = 116;
                } else if (cCharAt == '\n') {
                    int i19 = i14 + 1;
                    bArr[i14] = 92;
                    i14 += 2;
                    bArr[i19] = 110;
                } else if (cCharAt == '\f') {
                    int i20 = i14 + 1;
                    bArr[i14] = 92;
                    i14 += 2;
                    bArr[i20] = 102;
                } else if (cCharAt == '\r') {
                    int i21 = i14 + 1;
                    bArr[i14] = 92;
                    i14 += 2;
                    bArr[i21] = 114;
                } else {
                    bArr[i14] = 92;
                    bArr[i14 + 1] = 117;
                    bArr[i14 + 2] = 48;
                    bArr[i14 + 3] = 48;
                    switch (cCharAt) {
                        case 0:
                            bArr[i14 + 4] = 48;
                            bArr[i14 + 5] = 48;
                            break;
                        case 1:
                            bArr[i14 + 4] = 48;
                            bArr[i14 + 5] = 49;
                            break;
                        case 2:
                            bArr[i14 + 4] = 48;
                            bArr[i14 + 5] = 50;
                            break;
                        case 3:
                            bArr[i14 + 4] = 48;
                            bArr[i14 + 5] = 51;
                            break;
                        case 4:
                            bArr[i14 + 4] = 48;
                            bArr[i14 + 5] = 52;
                            break;
                        case 5:
                            bArr[i14 + 4] = 48;
                            bArr[i14 + 5] = 53;
                            break;
                        case 6:
                            bArr[i14 + 4] = 48;
                            bArr[i14 + 5] = 54;
                            break;
                        case 7:
                            bArr[i14 + 4] = 48;
                            bArr[i14 + 5] = 55;
                            break;
                        case '\b':
                        case '\t':
                        case '\n':
                        case '\f':
                        case '\r':
                        default:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 70;
                            break;
                        case 11:
                            bArr[i14 + 4] = 48;
                            bArr[i14 + 5] = 66;
                            break;
                        case 14:
                            bArr[i14 + 4] = 48;
                            bArr[i14 + 5] = 69;
                            break;
                        case 15:
                            bArr[i14 + 4] = 48;
                            bArr[i14 + 5] = 70;
                            break;
                        case 16:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 48;
                            break;
                        case 17:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 49;
                            break;
                        case 18:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 50;
                            break;
                        case 19:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 51;
                            break;
                        case 20:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 52;
                            break;
                        case 21:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 53;
                            break;
                        case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 54;
                            break;
                        case 23:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 55;
                            break;
                        case 24:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 56;
                            break;
                        case 25:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 57;
                            break;
                        case 26:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 65;
                            break;
                        case 27:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 66;
                            break;
                        case 28:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 67;
                            break;
                        case 29:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 68;
                            break;
                        case 30:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 69;
                            break;
                    }
                    i14 += 6;
                }
            } else if (cCharAt < 127) {
                bArr[i14] = (byte) cCharAt;
                i14++;
            } else {
                int iCodePointAt = Character.codePointAt(charSequence, i13);
                if (Character.isSupplementaryCodePoint(iCodePointAt)) {
                    i13++;
                }
                if (iCodePointAt == 127) {
                    bArr[i14] = (byte) iCodePointAt;
                    i14++;
                } else if (iCodePointAt <= 2047) {
                    int i22 = i14 + 1;
                    bArr[i14] = (byte) (((iCodePointAt >> 6) & 31) | 192);
                    i14 += 2;
                    bArr[i22] = (byte) ((iCodePointAt & 63) | 128);
                } else if (iCodePointAt < 55296 || (iCodePointAt > 57343 && iCodePointAt <= 65535)) {
                    bArr[i14] = (byte) (((iCodePointAt >> 12) & 15) | 224);
                    int i23 = i14 + 2;
                    bArr[i14 + 1] = (byte) (((iCodePointAt >> 6) & 63) | 128);
                    i14 += 3;
                    bArr[i23] = (byte) ((iCodePointAt & 63) | 128);
                } else {
                    if (iCodePointAt < 65536 || iCodePointAt > 1114111) {
                        throw new SerializationException("Unknown unicode codepoint in string! " + Integer.toHexString(iCodePointAt));
                    }
                    bArr[i14] = (byte) (((iCodePointAt >> 18) & 7) | 240);
                    bArr[i14 + 1] = (byte) (((iCodePointAt >> 12) & 63) | 128);
                    int i24 = i14 + 3;
                    bArr[i14 + 2] = (byte) (((iCodePointAt >> 6) & 63) | 128);
                    i14 += 4;
                    bArr[i24] = (byte) ((iCodePointAt & 63) | 128);
                }
            }
            i13++;
        }
        bArr[i14] = 34;
        this.f37271a = i14 + 1;
    }

    void a(int i10) {
        this.f37271a += i10;
    }

    final byte[] c(int i10) throws IOException {
        int i11 = this.f37271a;
        if (i11 + i10 >= this.f37274d.length) {
            b(i11, i10);
        }
        return this.f37274d;
    }

    public final void d() throws IOException {
        int i10;
        OutputStream outputStream = this.f37273c;
        if (outputStream == null || (i10 = this.f37271a) == 0) {
            return;
        }
        try {
            outputStream.write(this.f37274d, 0, i10);
            this.f37272b += this.f37271a;
            this.f37271a = 0;
        } catch (IOException e10) {
            throw new SerializationException("Unable to write to target stream.", e10);
        }
    }

    public <T> void f(Collection<T> collection, a<T> aVar) throws IOException {
        if (collection == null) {
            n();
            return;
        }
        l((byte) 91);
        if (!collection.isEmpty()) {
            Iterator<T> it = collection.iterator();
            T next = it.next();
            if (next != null) {
                aVar.a(this, next);
            } else {
                n();
            }
            while (it.hasNext()) {
                l((byte) 44);
                T next2 = it.next();
                if (next2 != null) {
                    aVar.a(this, next2);
                } else {
                    n();
                }
            }
        }
        l((byte) 93);
    }

    public <T> void g(T[] tArr, a<T> aVar) throws IOException {
        if (tArr == null) {
            n();
            return;
        }
        l((byte) 91);
        if (tArr.length != 0) {
            T t10 = tArr[0];
            if (t10 != null) {
                aVar.a(this, t10);
            } else {
                n();
            }
            for (int i10 = 1; i10 < tArr.length; i10++) {
                l((byte) 44);
                T t11 = tArr[i10];
                if (t11 != null) {
                    aVar.a(this, t11);
                } else {
                    n();
                }
            }
        }
        l((byte) 93);
    }

    public final int h() {
        return this.f37271a;
    }

    public final void k(byte[] bArr) throws IOException {
        int i10 = this.f37271a;
        if ((bArr.length << 1) + i10 + 2 >= this.f37274d.length) {
            b(i10, (bArr.length << 1) + 2);
        }
        byte[] bArr2 = this.f37274d;
        int i11 = this.f37271a;
        int i12 = i11 + 1;
        this.f37271a = i12;
        bArr2[i11] = 34;
        int iB = i12 + U6.a.b(bArr, bArr2, i12);
        byte[] bArr3 = this.f37274d;
        this.f37271a = iB + 1;
        bArr3[iB] = 34;
    }

    public final void l(byte b10) throws IOException {
        int i10 = this.f37271a;
        if (i10 == this.f37274d.length) {
            b(i10, 0);
        }
        byte[] bArr = this.f37274d;
        int i11 = this.f37271a;
        this.f37271a = i11 + 1;
        bArr[i11] = b10;
    }

    final void m(double d10) throws IOException {
        if (d10 == Double.POSITIVE_INFINITY) {
            i("\"Infinity\"");
            return;
        }
        if (d10 == Double.NEGATIVE_INFINITY) {
            i("\"-Infinity\"");
            return;
        }
        if (d10 != d10) {
            i("\"NaN\"");
            return;
        }
        if (d10 == 0.0d) {
            i("0.0");
            return;
        }
        if (!g.a(d10, this.f37276f)) {
            i(Double.toString(d10));
            return;
        }
        int i10 = this.f37271a;
        if (i10 + 24 >= this.f37274d.length) {
            b(i10, 24);
        }
        this.f37271a += this.f37276f.l(this.f37274d, this.f37271a);
    }

    public final void n() throws IOException {
        int i10 = this.f37271a;
        if (i10 + 4 >= this.f37274d.length) {
            b(i10, 0);
        }
        int i11 = this.f37271a;
        byte[] bArr = this.f37274d;
        bArr[i11] = 110;
        bArr[i11 + 1] = 117;
        bArr[i11 + 2] = 108;
        bArr[i11 + 3] = 108;
        this.f37271a = i11 + 4;
    }

    public String toString() {
        return new String(this.f37274d, 0, this.f37271a, f37270g);
    }

    j(byte[] bArr, r rVar) {
        this.f37276f = new g.e();
        this.f37274d = bArr;
        this.f37275e = rVar;
    }

    public final void i(String str) throws IOException {
        int length = str.length();
        int i10 = this.f37271a;
        if (i10 + length >= this.f37274d.length) {
            b(i10, length);
        }
        str.getBytes(0, length, this.f37274d, this.f37271a);
        this.f37271a += length;
    }

    public final void p(CharSequence charSequence) throws IOException {
        int length = charSequence.length();
        int i10 = this.f37271a;
        int i11 = length << 2;
        int i12 = length << 1;
        if (i10 + i11 + i12 + 2 >= this.f37274d.length) {
            b(i10, i11 + i12 + 2);
        }
        byte[] bArr = this.f37274d;
        int i13 = this.f37271a;
        bArr[i13] = 34;
        int i14 = i13 + 1;
        int i15 = 0;
        while (i15 < length) {
            char cCharAt = charSequence.charAt(i15);
            if (cCharAt > 31 && cCharAt != '\"' && cCharAt != '\\' && cCharAt < '~') {
                bArr[i14] = (byte) cCharAt;
                i15++;
                i14++;
            } else {
                o(charSequence, i15, i14, length);
                return;
            }
        }
        bArr[i14] = 34;
        this.f37271a = i14 + 1;
    }

    public final void q(String str) throws IOException {
        int length = str.length();
        int i10 = this.f37271a;
        int i11 = length << 2;
        int i12 = length << 1;
        if (i10 + i11 + i12 + 2 >= this.f37274d.length) {
            b(i10, i11 + i12 + 2);
        }
        byte[] bArr = this.f37274d;
        int i13 = this.f37271a;
        bArr[i13] = 34;
        int i14 = i13 + 1;
        int i15 = 0;
        while (i15 < length) {
            char cCharAt = str.charAt(i15);
            if (cCharAt > 31 && cCharAt != '\"' && cCharAt != '\\' && cCharAt < '~') {
                bArr[i14] = (byte) cCharAt;
                i15++;
                i14++;
            } else {
                o(str, i15, i14, length);
                return;
            }
        }
        bArr[i14] = 34;
        this.f37271a = i14 + 1;
    }
}
