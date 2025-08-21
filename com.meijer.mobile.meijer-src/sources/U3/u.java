package U3;

import U3.r;
import a3.InterfaceC5654k;
import a3.z;
import d3.C13599a;
import d3.D;
import d3.InterfaceC13610l;
import d3.P;
import java.io.EOFException;
import java.io.IOException;
import x3.O;

/* loaded from: classes4.dex */
final class u implements O {

    /* renamed from: a, reason: collision with root package name */
    private final O f37075a;

    /* renamed from: b, reason: collision with root package name */
    private final r.a f37076b;

    /* renamed from: h, reason: collision with root package name */
    private r f37082h;

    /* renamed from: i, reason: collision with root package name */
    private a3.t f37083i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f37084j;

    /* renamed from: c, reason: collision with root package name */
    private final d f37077c = new d();

    /* renamed from: e, reason: collision with root package name */
    private int f37079e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f37080f = 0;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f37081g = P.f127893f;

    /* renamed from: d, reason: collision with root package name */
    private final D f37078d = new D();

    private void i(int i10) {
        int length = this.f37081g.length;
        int i11 = this.f37080f;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.f37079e;
        int iMax = Math.max(i12 * 2, i10 + i12);
        byte[] bArr = this.f37081g;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f37079e, bArr2, 0, i12);
        this.f37079e = 0;
        this.f37080f = i12;
        this.f37081g = bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(e eVar, long j10, int i10) {
        C13599a.i(this.f37083i);
        byte[] bArrA = this.f37077c.a(eVar.f37037a, eVar.f37039c);
        this.f37078d.T(bArrA);
        this.f37075a.d(this.f37078d, bArrA.length);
        long j11 = eVar.f37038b;
        if (j11 == -9223372036854775807L) {
            C13599a.g(this.f37083i.f44772t == Long.MAX_VALUE);
        } else {
            long j12 = this.f37083i.f44772t;
            j10 = j12 == Long.MAX_VALUE ? j10 + j11 : j11 + j12;
        }
        this.f37075a.c(j10, i10 | 1, bArrA.length, 0, null);
    }

    @Override // x3.O
    public int a(InterfaceC5654k interfaceC5654k, int i10, boolean z10, int i11) throws IOException {
        if (this.f37082h == null) {
            return this.f37075a.a(interfaceC5654k, i10, z10, i11);
        }
        i(i10);
        int i12 = interfaceC5654k.read(this.f37081g, this.f37080f, i10);
        if (i12 != -1) {
            this.f37080f += i12;
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // x3.O
    public void b(a3.t tVar) {
        C13599a.e(tVar.f44767o);
        C13599a.a(z.k(tVar.f44767o) == 3);
        if (!tVar.equals(this.f37083i)) {
            this.f37083i = tVar;
            this.f37082h = this.f37076b.a(tVar) ? this.f37076b.c(tVar) : null;
        }
        if (this.f37082h == null) {
            this.f37075a.b(tVar);
        } else {
            this.f37075a.b(tVar.b().u0("application/x-media3-cues").S(tVar.f44767o).y0(Long.MAX_VALUE).W(this.f37076b.b(tVar)).N());
        }
    }

    @Override // x3.O
    public void c(final long j10, final int i10, int i11, int i12, O.a aVar) {
        if (this.f37082h == null) {
            this.f37075a.c(j10, i10, i11, i12, aVar);
            return;
        }
        C13599a.b(aVar == null, "DRM on subtitles is not supported");
        int i13 = (this.f37080f - i12) - i11;
        try {
            this.f37082h.a(this.f37081g, i13, i11, r.b.b(), new InterfaceC13610l() { // from class: U3.t
                @Override // d3.InterfaceC13610l
                public final void accept(Object obj) {
                    this.f37072a.j((e) obj, j10, i10);
                }
            });
        } catch (RuntimeException e10) {
            if (!this.f37084j) {
                throw e10;
            }
            d3.r.j("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e10);
        }
        int i14 = i13 + i11;
        this.f37079e = i14;
        if (i14 == this.f37080f) {
            this.f37079e = 0;
            this.f37080f = 0;
        }
    }

    @Override // x3.O
    public void e(D d10, int i10, int i11) {
        if (this.f37082h == null) {
            this.f37075a.e(d10, i10, i11);
            return;
        }
        i(i10);
        d10.l(this.f37081g, this.f37080f, i10);
        this.f37080f += i10;
    }

    public void k(boolean z10) {
        this.f37084j = z10;
    }

    public u(O o10, r.a aVar) {
        this.f37075a = o10;
        this.f37076b = aVar;
    }
}
