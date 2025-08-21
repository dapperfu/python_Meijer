package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import com.medallia.digital.mobilesdk.l3;
import fsimpl.C14170dq;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* loaded from: classes14.dex */
public final class CodedInputStream {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f146733a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f146734b;

    /* renamed from: c, reason: collision with root package name */
    private int f146735c;

    /* renamed from: d, reason: collision with root package name */
    private int f146736d;

    /* renamed from: e, reason: collision with root package name */
    private int f146737e;

    /* renamed from: f, reason: collision with root package name */
    private final InputStream f146738f;

    /* renamed from: g, reason: collision with root package name */
    private int f146739g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f146740h;

    /* renamed from: i, reason: collision with root package name */
    private int f146741i;

    /* renamed from: j, reason: collision with root package name */
    private int f146742j;

    /* renamed from: k, reason: collision with root package name */
    private int f146743k;

    /* renamed from: l, reason: collision with root package name */
    private int f146744l;

    /* renamed from: m, reason: collision with root package name */
    private int f146745m;

    private CodedInputStream(InputStream inputStream) {
        this.f146740h = false;
        this.f146742j = a.e.API_PRIORITY_OTHER;
        this.f146744l = 64;
        this.f146745m = 67108864;
        this.f146733a = new byte[RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT];
        this.f146735c = 0;
        this.f146737e = 0;
        this.f146741i = 0;
        this.f146738f = inputStream;
        this.f146734b = false;
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static int B(int i10, InputStream inputStream) throws IOException {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & l3.f93324d;
        int i12 = 7;
        while (i12 < 32) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw InvalidProtocolBufferException.k();
            }
            i11 |= (i13 & l3.f93324d) << i12;
            if ((i13 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int i14 = inputStream.read();
            if (i14 == -1) {
                throw InvalidProtocolBufferException.k();
            }
            if ((i14 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw InvalidProtocolBufferException.f();
    }

    private void N() {
        int i10 = this.f146735c + this.f146736d;
        this.f146735c = i10;
        int i11 = this.f146741i + i10;
        int i12 = this.f146742j;
        if (i11 <= i12) {
            this.f146736d = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f146736d = i13;
        this.f146735c = i10 - i13;
    }

    private void S(int i10) throws IOException {
        if (i10 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        int i11 = this.f146741i;
        int i12 = this.f146737e;
        int i13 = i11 + i12 + i10;
        int i14 = this.f146742j;
        if (i13 > i14) {
            R((i14 - i11) - i12);
            throw InvalidProtocolBufferException.k();
        }
        int i15 = this.f146735c;
        int i16 = i15 - i12;
        this.f146737e = i15;
        O(1);
        while (true) {
            int i17 = i10 - i16;
            int i18 = this.f146735c;
            if (i17 <= i18) {
                this.f146737e = i17;
                return;
            } else {
                i16 += i18;
                this.f146737e = i18;
                O(1);
            }
        }
    }

    private boolean T(int i10) throws IOException {
        int i11 = this.f146737e;
        int i12 = i11 + i10;
        int i13 = this.f146735c;
        if (i12 <= i13) {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i10);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        if (this.f146741i + i11 + i10 <= this.f146742j && this.f146738f != null) {
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f146733a;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f146741i += i11;
                this.f146735c -= i11;
                this.f146737e = 0;
            }
            InputStream inputStream = this.f146738f;
            byte[] bArr2 = this.f146733a;
            int i14 = this.f146735c;
            int i15 = inputStream.read(bArr2, i14, bArr2.length - i14);
            if (i15 == 0 || i15 < -1 || i15 > this.f146733a.length) {
                StringBuilder sb3 = new StringBuilder(102);
                sb3.append("InputStream#read(byte[]) returned invalid result: ");
                sb3.append(i15);
                sb3.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb3.toString());
            }
            if (i15 > 0) {
                this.f146735c += i15;
                if ((this.f146741i + i10) - this.f146745m > 0) {
                    throw InvalidProtocolBufferException.j();
                }
                N();
                if (this.f146735c >= i10) {
                    return true;
                }
                return T(i10);
            }
        }
        return false;
    }

    private void d(int i10) throws IOException {
        if (this.f146735c - this.f146737e < i10) {
            O(i10);
        }
    }

    public static CodedInputStream g(InputStream inputStream) {
        return new CodedInputStream(inputStream);
    }

    static CodedInputStream h(b bVar) {
        CodedInputStream codedInputStream = new CodedInputStream(bVar);
        try {
            codedInputStream.j(bVar.size());
            return codedInputStream;
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    private byte[] x(int i10) throws IOException {
        if (i10 <= 0) {
            if (i10 == 0) {
                return Internal.f146781a;
            }
            throw InvalidProtocolBufferException.g();
        }
        int i11 = this.f146741i;
        int i12 = this.f146737e;
        int i13 = i11 + i12 + i10;
        int i14 = this.f146742j;
        if (i13 > i14) {
            R((i14 - i11) - i12);
            throw InvalidProtocolBufferException.k();
        }
        if (i10 < 4096) {
            byte[] bArr = new byte[i10];
            int i15 = this.f146735c - i12;
            System.arraycopy(this.f146733a, i12, bArr, 0, i15);
            this.f146737e = this.f146735c;
            int i16 = i10 - i15;
            d(i16);
            System.arraycopy(this.f146733a, 0, bArr, i15, i16);
            this.f146737e = i16;
            return bArr;
        }
        int i17 = this.f146735c;
        this.f146741i = i11 + i17;
        this.f146737e = 0;
        this.f146735c = 0;
        int length = i17 - i12;
        int i18 = i10 - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i18 > 0) {
            int iMin = Math.min(i18, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
            byte[] bArr2 = new byte[iMin];
            int i19 = 0;
            while (i19 < iMin) {
                InputStream inputStream = this.f146738f;
                int i20 = inputStream == null ? -1 : inputStream.read(bArr2, i19, iMin - i19);
                if (i20 == -1) {
                    throw InvalidProtocolBufferException.k();
                }
                this.f146741i += i20;
                i19 += i20;
            }
            i18 -= iMin;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i10];
        System.arraycopy(this.f146733a, i12, bArr3, 0, length);
        for (byte[] bArr4 : arrayList) {
            System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
            length += bArr4.length;
        }
        return bArr3;
    }

    public int A() throws IOException {
        int i10;
        int i11 = this.f146737e;
        int i12 = this.f146735c;
        if (i12 != i11) {
            byte[] bArr = this.f146733a;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f146737e = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                long j10 = i15;
                if (j10 < 0) {
                    i10 = (int) ((-128) ^ j10);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << C14170dq.LIGHTEN) ^ i15;
                    long j11 = i17;
                    if (j11 >= 0) {
                        i10 = (int) (16256 ^ j11);
                    } else {
                        int i18 = i11 + 4;
                        long j12 = i17 ^ (bArr[i16] << 21);
                        if (j12 < 0) {
                            i10 = (int) ((-2080896) ^ j12);
                        } else {
                            i16 = i11 + 5;
                            int i19 = (int) ((r1 ^ (r3 << 28)) ^ 266354560);
                            if (bArr[i18] < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i20 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i20;
                                                    i10 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i19;
                            }
                            i10 = i19;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.f146737e = i14;
                return i10;
            }
        }
        return (int) D();
    }

    public long C() throws IOException {
        long j10;
        long j11;
        long j12;
        int i10 = this.f146737e;
        int i11 = this.f146735c;
        if (i11 != i10) {
            byte[] bArr = this.f146733a;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f146737e = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                long j13 = (bArr[i12] << 7) ^ b10;
                if (j13 >= 0) {
                    int i14 = i10 + 3;
                    long j14 = j13 ^ (bArr[i13] << C14170dq.LIGHTEN);
                    if (j14 >= 0) {
                        j12 = 16256;
                    } else {
                        i13 = i10 + 4;
                        j13 = j14 ^ (bArr[i14] << 21);
                        if (j13 < 0) {
                            j11 = -2080896;
                        } else {
                            i14 = i10 + 5;
                            j14 = j13 ^ (bArr[i13] << 28);
                            if (j14 >= 0) {
                                j12 = 266354560;
                            } else {
                                i13 = i10 + 6;
                                j13 = j14 ^ (bArr[i14] << 35);
                                if (j13 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i14 = i10 + 7;
                                    j14 = j13 ^ (bArr[i13] << 42);
                                    if (j14 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i13 = i10 + 8;
                                        j13 = j14 ^ (bArr[i14] << 49);
                                        if (j13 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i14 = i10 + 9;
                                            long j15 = (j13 ^ (bArr[i13] << 56)) ^ 71499008037633920L;
                                            if (j15 >= 0) {
                                                j10 = j15;
                                                i13 = i14;
                                                this.f146737e = i13;
                                                return j10;
                                            }
                                            i13 = i10 + 10;
                                            if (bArr[i14] >= 0) {
                                                j10 = j15;
                                                this.f146737e = i13;
                                                return j10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    j10 = j14 ^ j12;
                    i13 = i14;
                    this.f146737e = i13;
                    return j10;
                }
                j11 = -128;
                j10 = j13 ^ j11;
                this.f146737e = i13;
                return j10;
            }
        }
        return D();
    }

    long D() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            j10 |= (r3 & Byte.MAX_VALUE) << i10;
            if ((w() & 128) == 0) {
                return j10;
            }
        }
        throw InvalidProtocolBufferException.f();
    }

    public void R(int i10) throws IOException {
        int i11 = this.f146735c;
        int i12 = this.f146737e;
        if (i10 > i11 - i12 || i10 < 0) {
            S(i10);
        } else {
            this.f146737e = i12 + i10;
        }
    }

    public void a(int i10) throws InvalidProtocolBufferException {
        if (this.f146739g != i10) {
            throw InvalidProtocolBufferException.b();
        }
    }

    public int e() {
        int i10 = this.f146742j;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.f146741i + this.f146737e);
    }

    public boolean f() throws IOException {
        return this.f146737e == this.f146735c && !T(1);
    }

    public void i(int i10) {
        this.f146742j = i10;
        N();
    }

    public int j(int i10) throws InvalidProtocolBufferException {
        if (i10 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        int i11 = i10 + this.f146741i + this.f146737e;
        int i12 = this.f146742j;
        if (i11 > i12) {
            throw InvalidProtocolBufferException.k();
        }
        this.f146742j = i11;
        N();
        return i12;
    }

    public void r(int i10, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int i11 = this.f146743k;
        if (i11 >= this.f146744l) {
            throw InvalidProtocolBufferException.h();
        }
        this.f146743k = i11 + 1;
        builder.r0(this, extensionRegistryLite);
        a(WireFormat.c(i10, 4));
        this.f146743k--;
    }

    public byte w() throws IOException {
        if (this.f146737e == this.f146735c) {
            O(1);
        }
        byte[] bArr = this.f146733a;
        int i10 = this.f146737e;
        this.f146737e = i10 + 1;
        return bArr[i10];
    }

    public int y() throws IOException {
        int i10 = this.f146737e;
        if (this.f146735c - i10 < 4) {
            O(4);
            i10 = this.f146737e;
        }
        byte[] bArr = this.f146733a;
        this.f146737e = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public long z() throws IOException {
        int i10 = this.f146737e;
        if (this.f146735c - i10 < 8) {
            O(8);
            i10 = this.f146737e;
        }
        byte[] bArr = this.f146733a;
        this.f146737e = i10 + 8;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    private void O(int i10) throws IOException {
        if (T(i10)) {
        } else {
            throw InvalidProtocolBufferException.k();
        }
    }

    public int E() throws IOException {
        return y();
    }

    public long F() throws IOException {
        return z();
    }

    public int G() throws IOException {
        return b(A());
    }

    public long H() throws IOException {
        return c(C());
    }

    public String I() throws IOException {
        int iA = A();
        int i10 = this.f146735c;
        int i11 = this.f146737e;
        if (iA <= i10 - i11 && iA > 0) {
            String str = new String(this.f146733a, i11, iA, "UTF-8");
            this.f146737e += iA;
            return str;
        }
        if (iA == 0) {
            return "";
        }
        return new String(x(iA), "UTF-8");
    }

    public String J() throws IOException {
        byte[] bArrX;
        int iA = A();
        int i10 = this.f146737e;
        if (iA <= this.f146735c - i10 && iA > 0) {
            bArrX = this.f146733a;
            this.f146737e = i10 + iA;
        } else {
            if (iA == 0) {
                return "";
            }
            bArrX = x(iA);
            i10 = 0;
        }
        if (e.f(bArrX, i10, i10 + iA)) {
            return new String(bArrX, i10, iA, "UTF-8");
        }
        throw InvalidProtocolBufferException.d();
    }

    public int K() throws IOException {
        if (f()) {
            this.f146739g = 0;
            return 0;
        }
        int iA = A();
        this.f146739g = iA;
        if (WireFormat.a(iA) != 0) {
            return this.f146739g;
        }
        throw InvalidProtocolBufferException.c();
    }

    public int L() throws IOException {
        return A();
    }

    public long M() throws IOException {
        return C();
    }

    public boolean P(int i10, CodedOutputStream codedOutputStream) throws IOException {
        int iB = WireFormat.b(i10);
        if (iB != 0) {
            if (iB != 1) {
                if (iB != 2) {
                    if (iB != 3) {
                        if (iB != 4) {
                            if (iB == 5) {
                                int iY = y();
                                codedOutputStream.o0(i10);
                                codedOutputStream.U(iY);
                                return true;
                            }
                            throw InvalidProtocolBufferException.e();
                        }
                        return false;
                    }
                    codedOutputStream.o0(i10);
                    Q(codedOutputStream);
                    int iC = WireFormat.c(WireFormat.a(i10), 4);
                    a(iC);
                    codedOutputStream.o0(iC);
                    return true;
                }
                ByteString byteStringL = l();
                codedOutputStream.o0(i10);
                codedOutputStream.P(byteStringL);
                return true;
            }
            long jZ = z();
            codedOutputStream.o0(i10);
            codedOutputStream.V(jZ);
            return true;
        }
        long jT = t();
        codedOutputStream.o0(i10);
        codedOutputStream.z0(jT);
        return true;
    }

    public void Q(CodedOutputStream codedOutputStream) throws IOException {
        int iK;
        do {
            iK = K();
            if (iK == 0) {
                return;
            }
        } while (P(iK, codedOutputStream));
    }

    public boolean k() throws IOException {
        if (C() != 0) {
            return true;
        }
        return false;
    }

    public ByteString l() throws IOException {
        ByteString byteStringK;
        int iA = A();
        int i10 = this.f146735c;
        int i11 = this.f146737e;
        if (iA <= i10 - i11 && iA > 0) {
            if (this.f146734b && this.f146740h) {
                byteStringK = new a(this.f146733a, this.f146737e, iA);
            } else {
                byteStringK = ByteString.k(this.f146733a, i11, iA);
            }
            this.f146737e += iA;
            return byteStringK;
        }
        if (iA == 0) {
            return ByteString.f146726a;
        }
        return new b(x(iA));
    }

    public double m() throws IOException {
        return Double.longBitsToDouble(z());
    }

    public int n() throws IOException {
        return A();
    }

    public int o() throws IOException {
        return y();
    }

    public long p() throws IOException {
        return z();
    }

    public float q() throws IOException {
        return Float.intBitsToFloat(y());
    }

    public int s() throws IOException {
        return A();
    }

    public long t() throws IOException {
        return C();
    }

    public <T extends MessageLite> T u(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int iA = A();
        if (this.f146743k < this.f146744l) {
            int iJ = j(iA);
            this.f146743k++;
            T tC = parser.c(this, extensionRegistryLite);
            a(0);
            this.f146743k--;
            i(iJ);
            return tC;
        }
        throw InvalidProtocolBufferException.h();
    }

    public void v(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int iA = A();
        if (this.f146743k < this.f146744l) {
            int iJ = j(iA);
            this.f146743k++;
            builder.r0(this, extensionRegistryLite);
            a(0);
            this.f146743k--;
            i(iJ);
            return;
        }
        throw InvalidProtocolBufferException.h();
    }

    private CodedInputStream(b bVar) {
        this.f146740h = false;
        this.f146742j = a.e.API_PRIORITY_OTHER;
        this.f146744l = 64;
        this.f146745m = 67108864;
        this.f146733a = bVar.f146841b;
        int iF = bVar.F();
        this.f146737e = iF;
        this.f146735c = iF + bVar.size();
        this.f146741i = -this.f146737e;
        this.f146738f = null;
        this.f146734b = true;
    }
}
