package androidx.media3.exoplayer.source;

import a3.InterfaceC5654k;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.source.F;
import d3.C13599a;
import d3.P;
import g3.C14325c;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import t3.C17177a;
import t3.b;
import x3.O;

/* loaded from: classes.dex */
class D {

    /* renamed from: a, reason: collision with root package name */
    private final t3.b f56899a;

    /* renamed from: b, reason: collision with root package name */
    private final int f56900b;

    /* renamed from: c, reason: collision with root package name */
    private final d3.D f56901c;

    /* renamed from: d, reason: collision with root package name */
    private a f56902d;

    /* renamed from: e, reason: collision with root package name */
    private a f56903e;

    /* renamed from: f, reason: collision with root package name */
    private a f56904f;

    /* renamed from: g, reason: collision with root package name */
    private long f56905g;

    private static final class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public long f56906a;

        /* renamed from: b, reason: collision with root package name */
        public long f56907b;

        /* renamed from: c, reason: collision with root package name */
        public C17177a f56908c;

        /* renamed from: d, reason: collision with root package name */
        public a f56909d;

        public a b() {
            this.f56908c = null;
            a aVar = this.f56909d;
            this.f56909d = null;
            return aVar;
        }

        @Override // t3.b.a
        public C17177a a() {
            return (C17177a) C13599a.e(this.f56908c);
        }

        public void c(C17177a c17177a, a aVar) {
            this.f56908c = c17177a;
            this.f56909d = aVar;
        }

        public void d(long j10, int i10) {
            C13599a.g(this.f56908c == null);
            this.f56906a = j10;
            this.f56907b = j10 + i10;
        }

        public int e(long j10) {
            return ((int) (j10 - this.f56906a)) + this.f56908c.f162172b;
        }

        @Override // t3.b.a
        public b.a next() {
            a aVar = this.f56909d;
            if (aVar == null || aVar.f56908c == null) {
                return null;
            }
            return aVar;
        }

        public a(long j10, int i10) {
            d(j10, i10);
        }
    }

    private void a(a aVar) {
        if (aVar.f56908c == null) {
            return;
        }
        this.f56899a.a(aVar);
        aVar.b();
    }

    private static a c(a aVar, long j10) {
        while (j10 >= aVar.f56907b) {
            aVar = aVar.f56909d;
        }
        return aVar;
    }

    private void f(int i10) {
        long j10 = this.f56905g + i10;
        this.f56905g = j10;
        a aVar = this.f56904f;
        if (j10 == aVar.f56907b) {
            this.f56904f = aVar.f56909d;
        }
    }

    private int g(int i10) {
        a aVar = this.f56904f;
        if (aVar.f56908c == null) {
            aVar.c(this.f56899a.c(), new a(this.f56904f.f56907b, this.f56900b));
        }
        return Math.min(i10, (int) (this.f56904f.f56907b - this.f56905g));
    }

    private static a j(a aVar, DecoderInputBuffer decoderInputBuffer, F.b bVar, d3.D d10) {
        long j10 = bVar.f56944b;
        int iP = 1;
        d10.S(1);
        a aVarI = i(aVar, j10, d10.e(), 1);
        long j11 = j10 + 1;
        byte b10 = d10.e()[0];
        boolean z10 = (b10 & 128) != 0;
        int i10 = b10 & Byte.MAX_VALUE;
        C14325c c14325c = decoderInputBuffer.f55688c;
        byte[] bArr = c14325c.f133994a;
        if (bArr == null) {
            c14325c.f133994a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a aVarI2 = i(aVarI, j11, c14325c.f133994a, i10);
        long j12 = j11 + i10;
        if (z10) {
            d10.S(2);
            aVarI2 = i(aVarI2, j12, d10.e(), 2);
            j12 += 2;
            iP = d10.P();
        }
        int i11 = iP;
        int[] iArr = c14325c.f133997d;
        if (iArr == null || iArr.length < i11) {
            iArr = new int[i11];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = c14325c.f133998e;
        if (iArr3 == null || iArr3.length < i11) {
            iArr3 = new int[i11];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i12 = i11 * 6;
            d10.S(i12);
            aVarI2 = i(aVarI2, j12, d10.e(), i12);
            j12 += i12;
            d10.W(0);
            for (int i13 = 0; i13 < i11; i13++) {
                iArr2[i13] = d10.P();
                iArr4[i13] = d10.L();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f56943a - ((int) (j12 - bVar.f56944b));
        }
        O.a aVar2 = (O.a) P.h(bVar.f56945c);
        c14325c.c(i11, iArr2, iArr4, aVar2.f170183b, c14325c.f133994a, aVar2.f170182a, aVar2.f170184c, aVar2.f170185d);
        long j13 = bVar.f56944b;
        int i14 = (int) (j12 - j13);
        bVar.f56944b = j13 + i14;
        bVar.f56943a -= i14;
        return aVarI2;
    }

    public void b(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f56902d;
            if (j10 < aVar.f56907b) {
                break;
            }
            this.f56899a.b(aVar.f56908c);
            this.f56902d = this.f56902d.b();
        }
        if (this.f56903e.f56906a < aVar.f56906a) {
            this.f56903e = aVar;
        }
    }

    public long d() {
        return this.f56905g;
    }

    public void e(DecoderInputBuffer decoderInputBuffer, F.b bVar) {
        k(this.f56903e, decoderInputBuffer, bVar, this.f56901c);
    }

    public void l(DecoderInputBuffer decoderInputBuffer, F.b bVar) {
        this.f56903e = k(this.f56903e, decoderInputBuffer, bVar, this.f56901c);
    }

    public void m() {
        a(this.f56902d);
        this.f56902d.d(0L, this.f56900b);
        a aVar = this.f56902d;
        this.f56903e = aVar;
        this.f56904f = aVar;
        this.f56905g = 0L;
        this.f56899a.d();
    }

    public void n() {
        this.f56903e = this.f56902d;
    }

    public void p(d3.D d10, int i10) {
        while (i10 > 0) {
            int iG = g(i10);
            a aVar = this.f56904f;
            d10.l(aVar.f56908c.f162171a, aVar.e(this.f56905g), iG);
            i10 -= iG;
            f(iG);
        }
    }

    public D(t3.b bVar) {
        this.f56899a = bVar;
        int iE = bVar.e();
        this.f56900b = iE;
        this.f56901c = new d3.D(32);
        a aVar = new a(0L, iE);
        this.f56902d = aVar;
        this.f56903e = aVar;
        this.f56904f = aVar;
    }

    private static a h(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a aVarC = c(aVar, j10);
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (aVarC.f56907b - j10));
            byteBuffer.put(aVarC.f56908c.f162171a, aVarC.e(j10), iMin);
            i10 -= iMin;
            j10 += iMin;
            if (j10 == aVarC.f56907b) {
                aVarC = aVarC.f56909d;
            }
        }
        return aVarC;
    }

    private static a i(a aVar, long j10, byte[] bArr, int i10) {
        a aVarC = c(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (aVarC.f56907b - j10));
            System.arraycopy(aVarC.f56908c.f162171a, aVarC.e(j10), bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += iMin;
            if (j10 == aVarC.f56907b) {
                aVarC = aVarC.f56909d;
            }
        }
        return aVarC;
    }

    private static a k(a aVar, DecoderInputBuffer decoderInputBuffer, F.b bVar, d3.D d10) {
        if (decoderInputBuffer.H()) {
            aVar = j(aVar, decoderInputBuffer, bVar, d10);
        }
        if (decoderInputBuffer.t()) {
            d10.S(4);
            a aVarI = i(aVar, bVar.f56944b, d10.e(), 4);
            int iL = d10.L();
            bVar.f56944b += 4;
            bVar.f56943a -= 4;
            decoderInputBuffer.F(iL);
            a aVarH = h(aVarI, bVar.f56944b, decoderInputBuffer.f55689d, iL);
            bVar.f56944b += iL;
            int i10 = bVar.f56943a - iL;
            bVar.f56943a = i10;
            decoderInputBuffer.J(i10);
            return h(aVarH, bVar.f56944b, decoderInputBuffer.f55692g, bVar.f56943a);
        }
        decoderInputBuffer.F(bVar.f56943a);
        return h(aVar, bVar.f56944b, decoderInputBuffer.f55689d, bVar.f56943a);
    }

    public int o(InterfaceC5654k interfaceC5654k, int i10, boolean z10) throws IOException {
        int iG = g(i10);
        a aVar = this.f56904f;
        int i11 = interfaceC5654k.read(aVar.f56908c.f162171a, aVar.e(this.f56905g), iG);
        if (i11 == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        f(i11);
        return i11;
    }
}
