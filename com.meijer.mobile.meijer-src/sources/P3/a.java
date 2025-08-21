package P3;

import androidx.media3.common.ParserException;
import d3.C13599a;
import java.io.IOException;
import java.util.ArrayDeque;
import x3.InterfaceC18078q;

/* loaded from: classes4.dex */
final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f25299a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<b> f25300b = new ArrayDeque<>();

    /* renamed from: c, reason: collision with root package name */
    private final g f25301c = new g();

    /* renamed from: d, reason: collision with root package name */
    private P3.b f25302d;

    /* renamed from: e, reason: collision with root package name */
    private int f25303e;

    /* renamed from: f, reason: collision with root package name */
    private int f25304f;

    /* renamed from: g, reason: collision with root package name */
    private long f25305g;

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f25306a;

        /* renamed from: b, reason: collision with root package name */
        private final long f25307b;

        private b(int i10, long j10) {
            this.f25306a = i10;
            this.f25307b = j10;
        }
    }

    @Override // P3.c
    public void reset() {
        this.f25303e = 0;
        this.f25300b.clear();
        this.f25301c.e();
    }

    private long e(InterfaceC18078q interfaceC18078q, int i10) throws IOException {
        interfaceC18078q.readFully(this.f25299a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (this.f25299a[i11] & 255);
        }
        return j10;
    }

    private static String f(InterfaceC18078q interfaceC18078q, int i10) throws IOException {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        interfaceC18078q.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // P3.c
    public boolean a(InterfaceC18078q interfaceC18078q) throws IOException {
        C13599a.i(this.f25302d);
        while (true) {
            b bVarPeek = this.f25300b.peek();
            if (bVarPeek != null && interfaceC18078q.getPosition() >= bVarPeek.f25307b) {
                this.f25302d.a(this.f25300b.pop().f25306a);
                return true;
            }
            if (this.f25303e == 0) {
                long jD = this.f25301c.d(interfaceC18078q, true, false, 4);
                if (jD == -2) {
                    jD = c(interfaceC18078q);
                }
                if (jD == -1) {
                    return false;
                }
                this.f25304f = (int) jD;
                this.f25303e = 1;
            }
            if (this.f25303e == 1) {
                this.f25305g = this.f25301c.d(interfaceC18078q, false, true, 8);
                this.f25303e = 2;
            }
            int iD = this.f25302d.d(this.f25304f);
            if (iD != 0) {
                if (iD == 1) {
                    long position = interfaceC18078q.getPosition();
                    this.f25300b.push(new b(this.f25304f, this.f25305g + position));
                    this.f25302d.h(this.f25304f, position, this.f25305g);
                    this.f25303e = 0;
                    return true;
                }
                if (iD == 2) {
                    long j10 = this.f25305g;
                    if (j10 <= 8) {
                        this.f25302d.c(this.f25304f, e(interfaceC18078q, (int) j10));
                        this.f25303e = 0;
                        return true;
                    }
                    throw ParserException.a("Invalid integer size: " + this.f25305g, null);
                }
                if (iD == 3) {
                    long j11 = this.f25305g;
                    if (j11 <= 2147483647L) {
                        this.f25302d.f(this.f25304f, f(interfaceC18078q, (int) j11));
                        this.f25303e = 0;
                        return true;
                    }
                    throw ParserException.a("String element size: " + this.f25305g, null);
                }
                if (iD == 4) {
                    this.f25302d.g(this.f25304f, (int) this.f25305g, interfaceC18078q);
                    this.f25303e = 0;
                    return true;
                }
                if (iD != 5) {
                    throw ParserException.a("Invalid element type " + iD, null);
                }
                long j12 = this.f25305g;
                if (j12 == 4 || j12 == 8) {
                    this.f25302d.b(this.f25304f, d(interfaceC18078q, (int) j12));
                    this.f25303e = 0;
                    return true;
                }
                throw ParserException.a("Invalid float size: " + this.f25305g, null);
            }
            interfaceC18078q.k((int) this.f25305g);
            this.f25303e = 0;
        }
    }

    @Override // P3.c
    public void b(P3.b bVar) {
        this.f25302d = bVar;
    }

    private long c(InterfaceC18078q interfaceC18078q) throws IOException {
        interfaceC18078q.d();
        while (true) {
            interfaceC18078q.m(this.f25299a, 0, 4);
            int iC = g.c(this.f25299a[0]);
            if (iC != -1 && iC <= 4) {
                int iA = (int) g.a(this.f25299a, iC, false);
                if (this.f25302d.e(iA)) {
                    interfaceC18078q.k(iC);
                    return iA;
                }
            }
            interfaceC18078q.k(1);
        }
    }

    private double d(InterfaceC18078q interfaceC18078q, int i10) throws IOException {
        long jE = e(interfaceC18078q, i10);
        if (i10 == 4) {
            return Float.intBitsToFloat((int) jE);
        }
        return Double.longBitsToDouble(jE);
    }
}
