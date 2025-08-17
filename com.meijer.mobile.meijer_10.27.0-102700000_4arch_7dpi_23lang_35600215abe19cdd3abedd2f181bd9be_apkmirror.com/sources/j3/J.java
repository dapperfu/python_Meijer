package j3;

import androidx.media3.common.audio.AudioProcessor;
import com.medallia.digital.mobilesdk.l3;
import d3.C13466a;
import d3.P;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class J extends androidx.media3.common.audio.b {

    /* renamed from: i, reason: collision with root package name */
    private final float f139194i;

    /* renamed from: j, reason: collision with root package name */
    private final short f139195j;

    /* renamed from: k, reason: collision with root package name */
    private final int f139196k;

    /* renamed from: l, reason: collision with root package name */
    private final long f139197l;

    /* renamed from: m, reason: collision with root package name */
    private final long f139198m;

    /* renamed from: n, reason: collision with root package name */
    private int f139199n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f139200o;

    /* renamed from: p, reason: collision with root package name */
    private int f139201p;

    /* renamed from: q, reason: collision with root package name */
    private long f139202q;

    /* renamed from: r, reason: collision with root package name */
    private int f139203r;

    /* renamed from: s, reason: collision with root package name */
    private byte[] f139204s;

    /* renamed from: t, reason: collision with root package name */
    private int f139205t;

    /* renamed from: u, reason: collision with root package name */
    private int f139206u;

    /* renamed from: v, reason: collision with root package name */
    private byte[] f139207v;

    public J() {
        this(100000L, 0.2f, 2000000L, 10, (short) 1024);
    }

    private int m(float f10) {
        return n((int) f10);
    }

    private void w(byte[] bArr, int i10, int i11) {
        if (i11 == 3) {
            return;
        }
        for (int i12 = 0; i12 < i10; i12 += 2) {
            C(bArr, i12, (F(bArr[i12 + 1], bArr[i12]) * (i11 == 0 ? p(i12, i10 - 1) : i11 == 2 ? o(i12, i10 - 1) : this.f139196k)) / 100);
        }
    }

    @Override // androidx.media3.common.audio.b
    public void k() {
        this.f139200o = false;
        byte[] bArr = P.f127091f;
        this.f139204s = bArr;
        this.f139207v = bArr;
    }

    public J(long j10, float f10, long j11, int i10, short s10) {
        boolean z10 = false;
        this.f139203r = 0;
        this.f139205t = 0;
        this.f139206u = 0;
        if (f10 >= 0.0f && f10 <= 1.0f) {
            z10 = true;
        }
        C13466a.a(z10);
        this.f139197l = j10;
        this.f139194i = f10;
        this.f139198m = j11;
        this.f139196k = i10;
        this.f139195j = s10;
        byte[] bArr = P.f127091f;
        this.f139204s = bArr;
        this.f139207v = bArr;
    }

    private void A(int i10, int i11) {
        if (i10 == 0) {
            return;
        }
        C13466a.a(this.f139206u >= i10);
        if (i11 == 2) {
            int i12 = this.f139205t;
            int i13 = this.f139206u;
            int i14 = i12 + i13;
            byte[] bArr = this.f139204s;
            if (i14 <= bArr.length) {
                System.arraycopy(bArr, (i12 + i13) - i10, this.f139207v, 0, i10);
            } else {
                int length = i13 - (bArr.length - i12);
                if (length >= i10) {
                    System.arraycopy(bArr, length - i10, this.f139207v, 0, i10);
                } else {
                    int i15 = i10 - length;
                    System.arraycopy(bArr, bArr.length - i15, this.f139207v, 0, i15);
                    System.arraycopy(this.f139204s, 0, this.f139207v, i15, length);
                }
            }
        } else {
            int i16 = this.f139205t;
            int i17 = i16 + i10;
            byte[] bArr2 = this.f139204s;
            if (i17 <= bArr2.length) {
                System.arraycopy(bArr2, i16, this.f139207v, 0, i10);
            } else {
                int length2 = bArr2.length - i16;
                System.arraycopy(bArr2, i16, this.f139207v, 0, length2);
                System.arraycopy(this.f139204s, 0, this.f139207v, length2, i10 - length2);
            }
        }
        C13466a.b(i10 % this.f139199n == 0, "sizeToOutput is not aligned to frame size: " + i10);
        C13466a.g(this.f139205t < this.f139204s.length);
        y(this.f139207v, i10, i11);
    }

    private static void C(byte[] bArr, int i10, int i11) {
        if (i11 >= 32767) {
            bArr[i10] = -1;
            bArr[i10 + 1] = Byte.MAX_VALUE;
        } else if (i11 <= -32768) {
            bArr[i10] = 0;
            bArr[i10 + 1] = Byte.MIN_VALUE;
        } else {
            bArr[i10] = (byte) (i11 & l3.f92484c);
            bArr[i10 + 1] = (byte) (i11 >> 8);
        }
    }

    private void E(ByteBuffer byteBuffer) {
        int length;
        int i10;
        C13466a.g(this.f139205t < this.f139204s.length);
        int iLimit = byteBuffer.limit();
        int iT = t(byteBuffer);
        int iPosition = iT - byteBuffer.position();
        int i11 = this.f139205t;
        int i12 = this.f139206u;
        int i13 = i11 + i12;
        byte[] bArr = this.f139204s;
        if (i13 < bArr.length) {
            length = bArr.length - (i12 + i11);
            i10 = i11 + i12;
        } else {
            int length2 = i12 - (bArr.length - i11);
            length = i11 - length2;
            i10 = length2;
        }
        boolean z10 = iT < iLimit;
        int iMin = Math.min(iPosition, length);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f139204s, i10, iMin);
        int i14 = this.f139206u + iMin;
        this.f139206u = i14;
        C13466a.g(i14 <= this.f139204s.length);
        boolean z11 = z10 && iPosition < length;
        z(z11);
        if (z11) {
            this.f139201p = 0;
            this.f139203r = 0;
        }
        byteBuffer.limit(iLimit);
    }

    private static int F(byte b10, byte b11) {
        return (b10 << 8) | (b11 & 255);
    }

    private int n(int i10) {
        int i11 = this.f139199n;
        return (i10 / i11) * i11;
    }

    private int o(int i10, int i11) {
        int i12 = this.f139196k;
        return i12 + ((((100 - i12) * (i10 * 1000)) / i11) / 1000);
    }

    private int p(int i10, int i11) {
        return (((this.f139196k - 100) * ((i10 * 1000) / i11)) / 1000) + 100;
    }

    private int q(int i10) {
        int iR = ((r(this.f139198m) - this.f139203r) * this.f139199n) - (this.f139204s.length / 2);
        C13466a.g(iR >= 0);
        return m(Math.min((i10 * this.f139194i) + 0.5f, iR));
    }

    private int r(long j10) {
        return (int) ((j10 * this.f55354b.f55344a) / 1000000);
    }

    private void y(byte[] bArr, int i10, int i11) {
        C13466a.b(i10 % this.f139199n == 0, "byteOutput size is not aligned to frame size " + i10);
        w(bArr, i10, i11);
        l(i10).put(bArr, 0, i10).flip();
    }

    private void z(boolean z10) {
        int length;
        int iQ;
        int i10 = this.f139206u;
        byte[] bArr = this.f139204s;
        if (i10 == bArr.length || z10) {
            if (this.f139203r == 0) {
                if (z10) {
                    A(i10, 3);
                    length = i10;
                } else {
                    C13466a.g(i10 >= bArr.length / 2);
                    length = this.f139204s.length / 2;
                    A(length, 0);
                }
                iQ = length;
            } else if (z10) {
                int length2 = i10 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iQ2 = q(length2) + (this.f139204s.length / 2);
                A(iQ2, 2);
                iQ = iQ2;
                length = length3;
            } else {
                length = i10 - (bArr.length / 2);
                iQ = q(length);
                A(iQ, 1);
            }
            C13466a.h(length % this.f139199n == 0, "bytesConsumed is not aligned to frame size: %s" + length);
            C13466a.g(i10 >= iQ);
            this.f139206u -= length;
            int i11 = this.f139205t + length;
            this.f139205t = i11;
            this.f139205t = i11 % this.f139204s.length;
            this.f139203r = this.f139203r + (iQ / this.f139199n);
            this.f139202q += (length - iQ) / r2;
        }
    }

    public void D(boolean z10) {
        this.f139200o = z10;
    }

    @Override // androidx.media3.common.audio.b
    protected AudioProcessor.a h(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f55346c == 2) {
            return aVar.f55344a == -1 ? AudioProcessor.a.f55343e : aVar;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // androidx.media3.common.audio.b
    public void j() {
        if (this.f139206u > 0) {
            z(true);
            this.f139203r = 0;
        }
    }

    public long u() {
        return this.f139202q;
    }

    private void B(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f139204s.length));
        int iS = s(byteBuffer);
        if (iS == byteBuffer.position()) {
            this.f139201p = 1;
        } else {
            byteBuffer.limit(Math.min(iS, byteBuffer.capacity()));
            x(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private int s(ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 1; iLimit >= byteBuffer.position(); iLimit -= 2) {
            if (v(byteBuffer.get(iLimit), byteBuffer.get(iLimit - 1))) {
                int i10 = this.f139199n;
                return ((iLimit / i10) * i10) + i10;
            }
        }
        return byteBuffer.position();
    }

    private int t(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position() + 1; iPosition < byteBuffer.limit(); iPosition += 2) {
            if (v(byteBuffer.get(iPosition), byteBuffer.get(iPosition - 1))) {
                int i10 = this.f139199n;
                return i10 * (iPosition / i10);
            }
        }
        return byteBuffer.limit();
    }

    private boolean v(byte b10, byte b11) {
        if (Math.abs(F(b10, b11)) > this.f139195j) {
            return true;
        }
        return false;
    }

    private void x(ByteBuffer byteBuffer) {
        l(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    @Override // androidx.media3.common.audio.b, androidx.media3.common.audio.AudioProcessor
    public boolean a() {
        if (super.a() && this.f139200o) {
            return true;
        }
        return false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void e(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !b()) {
            int i10 = this.f139201p;
            if (i10 != 0) {
                if (i10 == 1) {
                    E(byteBuffer);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                B(byteBuffer);
            }
        }
    }

    @Override // androidx.media3.common.audio.b
    public void i() {
        if (a()) {
            this.f139199n = this.f55354b.f55345b * 2;
            int iN = n(r(this.f139197l) / 2) * 2;
            if (this.f139204s.length != iN) {
                this.f139204s = new byte[iN];
                this.f139207v = new byte[iN];
            }
        }
        this.f139201p = 0;
        this.f139202q = 0L;
        this.f139203r = 0;
        this.f139205t = 0;
        this.f139206u = 0;
    }
}
