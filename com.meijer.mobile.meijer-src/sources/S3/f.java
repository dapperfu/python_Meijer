package S3;

import androidx.media3.common.ParserException;
import com.medallia.digital.mobilesdk.l3;
import d3.D;
import java.io.IOException;
import x3.C18079s;
import x3.InterfaceC18078q;

/* loaded from: classes4.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f34359a;

    /* renamed from: b, reason: collision with root package name */
    public int f34360b;

    /* renamed from: c, reason: collision with root package name */
    public long f34361c;

    /* renamed from: d, reason: collision with root package name */
    public long f34362d;

    /* renamed from: e, reason: collision with root package name */
    public long f34363e;

    /* renamed from: f, reason: collision with root package name */
    public long f34364f;

    /* renamed from: g, reason: collision with root package name */
    public int f34365g;

    /* renamed from: h, reason: collision with root package name */
    public int f34366h;

    /* renamed from: i, reason: collision with root package name */
    public int f34367i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f34368j = new int[l3.f93323c];

    /* renamed from: k, reason: collision with root package name */
    private final D f34369k = new D(l3.f93323c);

    public void b() {
        this.f34359a = 0;
        this.f34360b = 0;
        this.f34361c = 0L;
        this.f34362d = 0L;
        this.f34363e = 0L;
        this.f34364f = 0L;
        this.f34365g = 0;
        this.f34366h = 0;
        this.f34367i = 0;
    }

    public boolean c(InterfaceC18078q interfaceC18078q) throws IOException {
        return d(interfaceC18078q, -1L);
    }

    f() {
    }

    public boolean a(InterfaceC18078q interfaceC18078q, boolean z10) throws IOException {
        b();
        this.f34369k.S(27);
        if (!C18079s.b(interfaceC18078q, this.f34369k.e(), 0, 27, z10) || this.f34369k.J() != 1332176723) {
            return false;
        }
        int iH = this.f34369k.H();
        this.f34359a = iH;
        if (iH != 0) {
            if (z10) {
                return false;
            }
            throw ParserException.c("unsupported bit stream revision");
        }
        this.f34360b = this.f34369k.H();
        this.f34361c = this.f34369k.v();
        this.f34362d = this.f34369k.x();
        this.f34363e = this.f34369k.x();
        this.f34364f = this.f34369k.x();
        int iH2 = this.f34369k.H();
        this.f34365g = iH2;
        this.f34366h = iH2 + 27;
        this.f34369k.S(iH2);
        if (!C18079s.b(interfaceC18078q, this.f34369k.e(), 0, this.f34365g, z10)) {
            return false;
        }
        for (int i10 = 0; i10 < this.f34365g; i10++) {
            this.f34368j[i10] = this.f34369k.H();
            this.f34367i += this.f34368j[i10];
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
    public boolean d(x3.InterfaceC18078q r9, long r10) throws java.io.IOException {
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
            d3.C13599a.a(r0)
            d3.D r0 = r8.f34369k
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
            d3.D r4 = r8.f34369k
            byte[] r4 = r4.e()
            boolean r4 = x3.C18079s.b(r9, r4, r1, r3, r2)
            if (r4 == 0) goto L51
            d3.D r0 = r8.f34369k
            r0.W(r1)
            d3.D r0 = r8.f34369k
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
