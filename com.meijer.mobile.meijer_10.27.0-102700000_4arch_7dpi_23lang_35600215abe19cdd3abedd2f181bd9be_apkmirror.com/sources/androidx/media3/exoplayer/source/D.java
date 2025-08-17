package androidx.media3.exoplayer.source;

import a3.InterfaceC5571k;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.source.F;
import d3.C13466a;
import d3.P;
import g3.C14196c;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import t3.C17058a;
import t3.b;
import x3.O;

/* loaded from: classes.dex */
class D {

    /* renamed from: a, reason: collision with root package name */
    private final t3.b f56675a;

    /* renamed from: b, reason: collision with root package name */
    private final int f56676b;

    /* renamed from: c, reason: collision with root package name */
    private final d3.D f56677c;

    /* renamed from: d, reason: collision with root package name */
    private a f56678d;

    /* renamed from: e, reason: collision with root package name */
    private a f56679e;

    /* renamed from: f, reason: collision with root package name */
    private a f56680f;

    /* renamed from: g, reason: collision with root package name */
    private long f56681g;

    private static final class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public long f56682a;

        /* renamed from: b, reason: collision with root package name */
        public long f56683b;

        /* renamed from: c, reason: collision with root package name */
        public C17058a f56684c;

        /* renamed from: d, reason: collision with root package name */
        public a f56685d;

        public a b() {
            this.f56684c = null;
            a aVar = this.f56685d;
            this.f56685d = null;
            return aVar;
        }

        @Override // t3.b.a
        public C17058a a() {
            return (C17058a) C13466a.e(this.f56684c);
        }

        public void c(C17058a c17058a, a aVar) {
            this.f56684c = c17058a;
            this.f56685d = aVar;
        }

        public void d(long j10, int i10) {
            C13466a.g(this.f56684c == null);
            this.f56682a = j10;
            this.f56683b = j10 + i10;
        }

        public int e(long j10) {
            return ((int) (j10 - this.f56682a)) + this.f56684c.f161362b;
        }

        @Override // t3.b.a
        public b.a next() {
            a aVar = this.f56685d;
            if (aVar == null || aVar.f56684c == null) {
                return null;
            }
            return aVar;
        }

        public a(long j10, int i10) {
            d(j10, i10);
        }
    }

    private void a(a aVar) {
        if (aVar.f56684c == null) {
            return;
        }
        this.f56675a.a(aVar);
        aVar.b();
    }

    private static a c(a aVar, long j10) {
        while (j10 >= aVar.f56683b) {
            aVar = aVar.f56685d;
        }
        return aVar;
    }

    private void f(int i10) {
        long j10 = this.f56681g + i10;
        this.f56681g = j10;
        a aVar = this.f56680f;
        if (j10 == aVar.f56683b) {
            this.f56680f = aVar.f56685d;
        }
    }

    private int g(int i10) {
        a aVar = this.f56680f;
        if (aVar.f56684c == null) {
            aVar.c(this.f56675a.c(), new a(this.f56680f.f56683b, this.f56676b));
        }
        return Math.min(i10, (int) (this.f56680f.f56683b - this.f56681g));
    }

    private static a j(a aVar, DecoderInputBuffer decoderInputBuffer, F.b bVar, d3.D d10) {
        long j10 = bVar.f56720b;
        int iP = 1;
        d10.S(1);
        a aVarI = i(aVar, j10, d10.e(), 1);
        long j11 = j10 + 1;
        byte b10 = d10.e()[0];
        boolean z10 = (b10 & 128) != 0;
        int i10 = b10 & Byte.MAX_VALUE;
        C14196c c14196c = decoderInputBuffer.f55464c;
        byte[] bArr = c14196c.f132704a;
        if (bArr == null) {
            c14196c.f132704a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a aVarI2 = i(aVarI, j11, c14196c.f132704a, i10);
        long j12 = j11 + i10;
        if (z10) {
            d10.S(2);
            aVarI2 = i(aVarI2, j12, d10.e(), 2);
            j12 += 2;
            iP = d10.P();
        }
        int i11 = iP;
        int[] iArr = c14196c.f132707d;
        if (iArr == null || iArr.length < i11) {
            iArr = new int[i11];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = c14196c.f132708e;
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
            iArr4[0] = bVar.f56719a - ((int) (j12 - bVar.f56720b));
        }
        O.a aVar2 = (O.a) P.h(bVar.f56721c);
        c14196c.c(i11, iArr2, iArr4, aVar2.f169095b, c14196c.f132704a, aVar2.f169094a, aVar2.f169096c, aVar2.f169097d);
        long j13 = bVar.f56720b;
        int i14 = (int) (j12 - j13);
        bVar.f56720b = j13 + i14;
        bVar.f56719a -= i14;
        return aVarI2;
    }

    public void b(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f56678d;
            if (j10 < aVar.f56683b) {
                break;
            }
            this.f56675a.b(aVar.f56684c);
            this.f56678d = this.f56678d.b();
        }
        if (this.f56679e.f56682a < aVar.f56682a) {
            this.f56679e = aVar;
        }
    }

    public long d() {
        return this.f56681g;
    }

    public void e(DecoderInputBuffer decoderInputBuffer, F.b bVar) {
        k(this.f56679e, decoderInputBuffer, bVar, this.f56677c);
    }

    public void l(DecoderInputBuffer decoderInputBuffer, F.b bVar) {
        this.f56679e = k(this.f56679e, decoderInputBuffer, bVar, this.f56677c);
    }

    public void m() {
        a(this.f56678d);
        this.f56678d.d(0L, this.f56676b);
        a aVar = this.f56678d;
        this.f56679e = aVar;
        this.f56680f = aVar;
        this.f56681g = 0L;
        this.f56675a.d();
    }

    public void n() {
        this.f56679e = this.f56678d;
    }

    public void p(d3.D d10, int i10) {
        while (i10 > 0) {
            int iG = g(i10);
            a aVar = this.f56680f;
            d10.l(aVar.f56684c.f161361a, aVar.e(this.f56681g), iG);
            i10 -= iG;
            f(iG);
        }
    }

    public D(t3.b bVar) {
        this.f56675a = bVar;
        int iE = bVar.e();
        this.f56676b = iE;
        this.f56677c = new d3.D(32);
        a aVar = new a(0L, iE);
        this.f56678d = aVar;
        this.f56679e = aVar;
        this.f56680f = aVar;
    }

    private static a h(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a aVarC = c(aVar, j10);
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (aVarC.f56683b - j10));
            byteBuffer.put(aVarC.f56684c.f161361a, aVarC.e(j10), iMin);
            i10 -= iMin;
            j10 += iMin;
            if (j10 == aVarC.f56683b) {
                aVarC = aVarC.f56685d;
            }
        }
        return aVarC;
    }

    private static a i(a aVar, long j10, byte[] bArr, int i10) {
        a aVarC = c(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (aVarC.f56683b - j10));
            System.arraycopy(aVarC.f56684c.f161361a, aVarC.e(j10), bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += iMin;
            if (j10 == aVarC.f56683b) {
                aVarC = aVarC.f56685d;
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
            a aVarI = i(aVar, bVar.f56720b, d10.e(), 4);
            int iL = d10.L();
            bVar.f56720b += 4;
            bVar.f56719a -= 4;
            decoderInputBuffer.F(iL);
            a aVarH = h(aVarI, bVar.f56720b, decoderInputBuffer.f55465d, iL);
            bVar.f56720b += iL;
            int i10 = bVar.f56719a - iL;
            bVar.f56719a = i10;
            decoderInputBuffer.J(i10);
            return h(aVarH, bVar.f56720b, decoderInputBuffer.f55468g, bVar.f56719a);
        }
        decoderInputBuffer.F(bVar.f56719a);
        return h(aVar, bVar.f56720b, decoderInputBuffer.f55465d, bVar.f56719a);
    }

    public int o(InterfaceC5571k interfaceC5571k, int i10, boolean z10) throws IOException {
        int iG = g(i10);
        a aVar = this.f56680f;
        int i11 = interfaceC5571k.read(aVar.f56684c.f161361a, aVar.e(this.f56681g), iG);
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
