package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.recyclerview.widget.RecyclerView;
import com.medallia.digital.mobilesdk.l3;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: classes13.dex */
public final class CodedOutputStream {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f145839a;

    /* renamed from: b, reason: collision with root package name */
    private final int f145840b;

    /* renamed from: e, reason: collision with root package name */
    private final OutputStream f145843e;

    /* renamed from: d, reason: collision with root package name */
    private int f145842d = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f145841c = 0;

    public static class OutOfSpaceException extends IOException {
        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public static int D(int i10) {
        return v(WireFormat.c(i10, 0));
    }

    public static int G(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long H(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int b(boolean z10) {
        return 1;
    }

    public static int c(byte[] bArr) {
        return v(bArr.length) + bArr.length;
    }

    public static int g(double d10) {
        return 8;
    }

    public static int j(int i10) {
        return 4;
    }

    public static int k(long j10) {
        return 8;
    }

    public static int m(float f10) {
        return 4;
    }

    static int u(int i10) {
        return i10 > 4096 ? RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT : i10;
    }

    public static int v(int i10) {
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

    public static int w(long j10) {
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

    public static int x(int i10) {
        return 4;
    }

    public static int y(long j10) {
        return 8;
    }

    public void L(int i10, boolean z10) throws IOException {
        w0(i10, 0);
        M(z10);
    }

    public void N(byte[] bArr) throws IOException {
        o0(bArr.length);
        k0(bArr);
    }

    public void O(int i10, ByteString byteString) throws IOException {
        w0(i10, 2);
        P(byteString);
    }

    public void Q(int i10, double d10) throws IOException {
        w0(i10, 1);
        R(d10);
    }

    public void S(int i10, int i11) throws IOException {
        w0(i10, 0);
        T(i11);
    }

    public void W(int i10, float f10) throws IOException {
        w0(i10, 5);
        X(f10);
    }

    public void Y(int i10, MessageLite messageLite) throws IOException {
        w0(i10, 3);
        Z(messageLite);
        w0(i10, 4);
    }

    public void a0(int i10, int i11) throws IOException {
        w0(i10, 0);
        b0(i11);
    }

    public void d0(int i10, MessageLite messageLite) throws IOException {
        w0(i10, 2);
        e0(messageLite);
    }

    public void f0(int i10, MessageLite messageLite) throws IOException {
        w0(1, 3);
        x0(2, i10);
        d0(3, messageLite);
        w0(1, 4);
    }

    public void h0(int i10) throws IOException {
        g0((byte) i10);
    }

    public void i0(ByteString byteString) throws IOException {
        j0(byteString, 0, byteString.size());
    }

    public void k0(byte[] bArr) throws IOException {
        l0(bArr, 0, bArr.length);
    }

    public void n0(long j10) throws IOException {
        h0(((int) j10) & l3.f92484c);
        h0(((int) (j10 >> 8)) & l3.f92484c);
        h0(((int) (j10 >> 16)) & l3.f92484c);
        h0(((int) (j10 >> 24)) & l3.f92484c);
        h0(((int) (j10 >> 32)) & l3.f92484c);
        h0(((int) (j10 >> 40)) & l3.f92484c);
        h0(((int) (j10 >> 48)) & l3.f92484c);
        h0(((int) (j10 >> 56)) & l3.f92484c);
    }

    public void t0(int i10, long j10) throws IOException {
        w0(i10, 0);
        u0(j10);
    }

    public void x0(int i10, int i11) throws IOException {
        w0(i10, 0);
        y0(i11);
    }

    public static int C(String str) throws UnsupportedEncodingException {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return v(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported.", e10);
        }
    }

    public static CodedOutputStream J(OutputStream outputStream, int i10) {
        return new CodedOutputStream(outputStream, new byte[i10]);
    }

    private void K() throws IOException {
        OutputStream outputStream = this.f145843e;
        if (outputStream == null) {
            throw new OutOfSpaceException();
        }
        outputStream.write(this.f145839a, 0, this.f145841c);
        this.f145841c = 0;
    }

    public static int p(int i10) {
        if (i10 >= 0) {
            return v(i10);
        }
        return 10;
    }

    public void I() throws IOException {
        if (this.f145843e != null) {
            K();
        }
    }

    public void b0(int i10) throws IOException {
        if (i10 >= 0) {
            o0(i10);
        } else {
            p0(i10);
        }
    }

    public void g0(byte b10) throws IOException {
        if (this.f145841c == this.f145840b) {
            K();
        }
        byte[] bArr = this.f145839a;
        int i10 = this.f145841c;
        this.f145841c = i10 + 1;
        bArr[i10] = b10;
        this.f145842d++;
    }

    public void j0(ByteString byteString, int i10, int i11) throws IOException {
        int i12 = this.f145840b;
        int i13 = this.f145841c;
        if (i12 - i13 >= i11) {
            byteString.m(this.f145839a, i10, i13, i11);
            this.f145841c += i11;
            this.f145842d += i11;
            return;
        }
        int i14 = i12 - i13;
        byteString.m(this.f145839a, i10, i13, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.f145841c = this.f145840b;
        this.f145842d += i14;
        K();
        if (i16 <= this.f145840b) {
            byteString.m(this.f145839a, i15, 0, i16);
            this.f145841c = i16;
        } else {
            byteString.B(this.f145843e, i15, i16);
        }
        this.f145842d += i16;
    }

    public void l0(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f145840b;
        int i13 = this.f145841c;
        if (i12 - i13 >= i11) {
            System.arraycopy(bArr, i10, this.f145839a, i13, i11);
            this.f145841c += i11;
            this.f145842d += i11;
            return;
        }
        int i14 = i12 - i13;
        System.arraycopy(bArr, i10, this.f145839a, i13, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.f145841c = this.f145840b;
        this.f145842d += i14;
        K();
        if (i16 <= this.f145840b) {
            System.arraycopy(bArr, i15, this.f145839a, 0, i16);
            this.f145841c = i16;
        } else {
            this.f145843e.write(bArr, i15, i16);
        }
        this.f145842d += i16;
    }

    public void m0(int i10) throws IOException {
        h0(i10 & l3.f92484c);
        h0((i10 >> 8) & l3.f92484c);
        h0((i10 >> 16) & l3.f92484c);
        h0((i10 >> 24) & l3.f92484c);
    }

    public void o0(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            h0((i10 & l3.f92485d) | 128);
            i10 >>>= 7;
        }
        h0(i10);
    }

    public void p0(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            h0((((int) j10) & l3.f92485d) | 128);
            j10 >>>= 7;
        }
        h0((int) j10);
    }

    public void v0(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        o0(bytes.length);
        k0(bytes);
    }

    private CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.f145843e = outputStream;
        this.f145839a = bArr;
        this.f145840b = bArr.length;
    }

    public static int A(int i10, long j10) {
        return D(i10) + B(j10);
    }

    public static int B(long j10) {
        return w(H(j10));
    }

    public static int E(int i10) {
        return v(i10);
    }

    public static int F(long j10) {
        return w(j10);
    }

    public static int a(int i10, boolean z10) {
        return D(i10) + b(z10);
    }

    public static int d(int i10, ByteString byteString) {
        return D(i10) + e(byteString);
    }

    public static int e(ByteString byteString) {
        return v(byteString.size()) + byteString.size();
    }

    public static int f(int i10, double d10) {
        return D(i10) + g(d10);
    }

    public static int h(int i10, int i11) {
        return D(i10) + i(i11);
    }

    public static int i(int i10) {
        return p(i10);
    }

    public static int l(int i10, float f10) {
        return D(i10) + m(f10);
    }

    public static int n(MessageLite messageLite) {
        return messageLite.c();
    }

    public static int o(int i10, int i11) {
        return D(i10) + p(i11);
    }

    public static int q(long j10) {
        return w(j10);
    }

    public static int r(LazyFieldLite lazyFieldLite) {
        int iB = lazyFieldLite.b();
        return v(iB) + iB;
    }

    public static int s(int i10, MessageLite messageLite) {
        return D(i10) + t(messageLite);
    }

    public static int t(MessageLite messageLite) {
        int iC = messageLite.c();
        return v(iC) + iC;
    }

    public static int z(int i10) {
        return v(G(i10));
    }

    public void M(boolean z10) throws IOException {
        h0(z10 ? 1 : 0);
    }

    public void P(ByteString byteString) throws IOException {
        o0(byteString.size());
        i0(byteString);
    }

    public void R(double d10) throws IOException {
        n0(Double.doubleToRawLongBits(d10));
    }

    public void T(int i10) throws IOException {
        b0(i10);
    }

    public void U(int i10) throws IOException {
        m0(i10);
    }

    public void V(long j10) throws IOException {
        n0(j10);
    }

    public void X(float f10) throws IOException {
        m0(Float.floatToRawIntBits(f10));
    }

    public void Z(MessageLite messageLite) throws IOException {
        messageLite.g(this);
    }

    public void c0(long j10) throws IOException {
        p0(j10);
    }

    public void e0(MessageLite messageLite) throws IOException {
        o0(messageLite.c());
        messageLite.g(this);
    }

    public void q0(int i10) throws IOException {
        m0(i10);
    }

    public void r0(long j10) throws IOException {
        n0(j10);
    }

    public void s0(int i10) throws IOException {
        o0(G(i10));
    }

    public void u0(long j10) throws IOException {
        p0(H(j10));
    }

    public void w0(int i10, int i11) throws IOException {
        o0(WireFormat.c(i10, i11));
    }

    public void y0(int i10) throws IOException {
        o0(i10);
    }

    public void z0(long j10) throws IOException {
        p0(j10);
    }
}
