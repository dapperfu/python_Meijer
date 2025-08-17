package S3;

import androidx.media3.common.ParserException;
import com.medallia.digital.mobilesdk.l3;
import d3.D;
import java.io.IOException;
import x3.C18013s;
import x3.InterfaceC18012q;

/* loaded from: classes4.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f33180a;

    /* renamed from: b, reason: collision with root package name */
    public int f33181b;

    /* renamed from: c, reason: collision with root package name */
    public long f33182c;

    /* renamed from: d, reason: collision with root package name */
    public long f33183d;

    /* renamed from: e, reason: collision with root package name */
    public long f33184e;

    /* renamed from: f, reason: collision with root package name */
    public long f33185f;

    /* renamed from: g, reason: collision with root package name */
    public int f33186g;

    /* renamed from: h, reason: collision with root package name */
    public int f33187h;

    /* renamed from: i, reason: collision with root package name */
    public int f33188i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f33189j = new int[l3.f92484c];

    /* renamed from: k, reason: collision with root package name */
    private final D f33190k = new D(l3.f92484c);

    public void b() {
        this.f33180a = 0;
        this.f33181b = 0;
        this.f33182c = 0L;
        this.f33183d = 0L;
        this.f33184e = 0L;
        this.f33185f = 0L;
        this.f33186g = 0;
        this.f33187h = 0;
        this.f33188i = 0;
    }

    public boolean c(InterfaceC18012q interfaceC18012q) throws IOException {
        return d(interfaceC18012q, -1L);
    }

    f() {
    }

    public boolean a(InterfaceC18012q interfaceC18012q, boolean z10) throws IOException {
        b();
        this.f33190k.S(27);
        if (!C18013s.b(interfaceC18012q, this.f33190k.e(), 0, 27, z10) || this.f33190k.J() != 1332176723) {
            return false;
        }
        int iH = this.f33190k.H();
        this.f33180a = iH;
        if (iH != 0) {
            if (z10) {
                return false;
            }
            throw ParserException.c("unsupported bit stream revision");
        }
        this.f33181b = this.f33190k.H();
        this.f33182c = this.f33190k.v();
        this.f33183d = this.f33190k.x();
        this.f33184e = this.f33190k.x();
        this.f33185f = this.f33190k.x();
        int iH2 = this.f33190k.H();
        this.f33186g = iH2;
        this.f33187h = iH2 + 27;
        this.f33190k.S(iH2);
        if (!C18013s.b(interfaceC18012q, this.f33190k.e(), 0, this.f33186g, z10)) {
            return false;
        }
        for (int i10 = 0; i10 < this.f33186g; i10++) {
            this.f33189j[i10] = this.f33190k.H();
            this.f33188i += this.f33189j[i10];
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r10 == (-1)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r9.getPosition() >= r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r9.a(1) == (-1)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(x3.InterfaceC18012q r9, long r10) throws java.io.IOException {
        /*
            r8 = this;
            long r0 = r9.getPosition()
            long r2 = r9.g()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            d3.C13466a.a(r0)
            d3.D r0 = r8.f33190k
            r3 = 4
            r0.S(r3)
        L1a:
            r4 = -1
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L2b
            long r4 = r9.getPosition()
            r6 = 4
            long r4 = r4 + r6
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 >= 0) goto L51
        L2b:
            d3.D r4 = r8.f33190k
            byte[] r4 = r4.e()
            boolean r4 = x3.C18013s.b(r9, r4, r1, r3, r2)
            if (r4 == 0) goto L51
            d3.D r0 = r8.f33190k
            r0.W(r1)
            d3.D r0 = r8.f33190k
            long r4 = r0.J()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L4d
            r9.d()
            return r2
        L4d:
            r9.k(r2)
            goto L1a
        L51:
            if (r0 == 0) goto L5b
            long r3 = r9.getPosition()
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 >= 0) goto L63
        L5b:
            int r3 = r9.a(r2)
            r4 = -1
            if (r3 == r4) goto L63
            goto L51
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.f.d(x3.q, long):boolean");
    }
}
