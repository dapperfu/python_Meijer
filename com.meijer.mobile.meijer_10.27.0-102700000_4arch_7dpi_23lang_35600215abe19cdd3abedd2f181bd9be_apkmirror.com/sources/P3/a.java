package P3;

import androidx.media3.common.ParserException;
import d3.C13466a;
import java.io.IOException;
import java.util.ArrayDeque;
import x3.InterfaceC18012q;

/* loaded from: classes4.dex */
final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f24601a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<b> f24602b = new ArrayDeque<>();

    /* renamed from: c, reason: collision with root package name */
    private final g f24603c = new g();

    /* renamed from: d, reason: collision with root package name */
    private P3.b f24604d;

    /* renamed from: e, reason: collision with root package name */
    private int f24605e;

    /* renamed from: f, reason: collision with root package name */
    private int f24606f;

    /* renamed from: g, reason: collision with root package name */
    private long f24607g;

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f24608a;

        /* renamed from: b, reason: collision with root package name */
        private final long f24609b;

        private b(int i10, long j10) {
            this.f24608a = i10;
            this.f24609b = j10;
        }
    }

    @Override // P3.c
    public void reset() {
        this.f24605e = 0;
        this.f24602b.clear();
        this.f24603c.e();
    }

    private long e(InterfaceC18012q interfaceC18012q, int i10) throws IOException {
        interfaceC18012q.readFully(this.f24601a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (this.f24601a[i11] & 255);
        }
        return j10;
    }

    private static String f(InterfaceC18012q interfaceC18012q, int i10) throws IOException {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        interfaceC18012q.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // P3.c
    public boolean a(InterfaceC18012q interfaceC18012q) throws IOException {
        C13466a.i(this.f24604d);
        while (true) {
            b bVarPeek = this.f24602b.peek();
            if (bVarPeek != null && interfaceC18012q.getPosition() >= bVarPeek.f24609b) {
                this.f24604d.a(this.f24602b.pop().f24608a);
                return true;
            }
            if (this.f24605e == 0) {
                long jD = this.f24603c.d(interfaceC18012q, true, false, 4);
                if (jD == -2) {
                    jD = c(interfaceC18012q);
                }
                if (jD == -1) {
                    return false;
                }
                this.f24606f = (int) jD;
                this.f24605e = 1;
            }
            if (this.f24605e == 1) {
                this.f24607g = this.f24603c.d(interfaceC18012q, false, true, 8);
                this.f24605e = 2;
            }
            int iD = this.f24604d.d(this.f24606f);
            if (iD != 0) {
                if (iD == 1) {
                    long position = interfaceC18012q.getPosition();
                    this.f24602b.push(new b(this.f24606f, this.f24607g + position));
                    this.f24604d.h(this.f24606f, position, this.f24607g);
                    this.f24605e = 0;
                    return true;
                }
                if (iD == 2) {
                    long j10 = this.f24607g;
                    if (j10 <= 8) {
                        this.f24604d.c(this.f24606f, e(interfaceC18012q, (int) j10));
                        this.f24605e = 0;
                        return true;
                    }
                    throw ParserException.a("Invalid integer size: " + this.f24607g, null);
                }
                if (iD == 3) {
                    long j11 = this.f24607g;
                    if (j11 <= 2147483647L) {
                        this.f24604d.f(this.f24606f, f(interfaceC18012q, (int) j11));
                        this.f24605e = 0;
                        return true;
                    }
                    throw ParserException.a("String element size: " + this.f24607g, null);
                }
                if (iD == 4) {
                    this.f24604d.g(this.f24606f, (int) this.f24607g, interfaceC18012q);
                    this.f24605e = 0;
                    return true;
                }
                if (iD != 5) {
                    throw ParserException.a("Invalid element type " + iD, null);
                }
                long j12 = this.f24607g;
                if (j12 == 4 || j12 == 8) {
                    this.f24604d.b(this.f24606f, d(interfaceC18012q, (int) j12));
                    this.f24605e = 0;
                    return true;
                }
                throw ParserException.a("Invalid float size: " + this.f24607g, null);
            }
            interfaceC18012q.k((int) this.f24607g);
            this.f24605e = 0;
        }
    }

    @Override // P3.c
    public void b(P3.b bVar) {
        this.f24604d = bVar;
    }

    private long c(InterfaceC18012q interfaceC18012q) throws IOException {
        interfaceC18012q.d();
        while (true) {
            interfaceC18012q.m(this.f24601a, 0, 4);
            int iC = g.c(this.f24601a[0]);
            if (iC != -1 && iC <= 4) {
                int iA = (int) g.a(this.f24601a, iC, false);
                if (this.f24604d.e(iA)) {
                    interfaceC18012q.k(iC);
                    return iA;
                }
            }
            interfaceC18012q.k(1);
        }
    }

    private double d(InterfaceC18012q interfaceC18012q, int i10) throws IOException {
        long jE = e(interfaceC18012q, i10);
        if (i10 == 4) {
            return Float.intBitsToFloat((int) jE);
        }
        return Double.longBitsToDouble(jE);
    }
}
