package U3;

import U3.r;
import a3.InterfaceC5571k;
import a3.z;
import d3.C13466a;
import d3.D;
import d3.InterfaceC13477l;
import d3.P;
import java.io.EOFException;
import java.io.IOException;
import x3.O;

/* loaded from: classes4.dex */
final class u implements O {

    /* renamed from: a, reason: collision with root package name */
    private final O f35739a;

    /* renamed from: b, reason: collision with root package name */
    private final r.a f35740b;

    /* renamed from: h, reason: collision with root package name */
    private r f35746h;

    /* renamed from: i, reason: collision with root package name */
    private a3.t f35747i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f35748j;

    /* renamed from: c, reason: collision with root package name */
    private final d f35741c = new d();

    /* renamed from: e, reason: collision with root package name */
    private int f35743e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f35744f = 0;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f35745g = P.f127091f;

    /* renamed from: d, reason: collision with root package name */
    private final D f35742d = new D();

    private void i(int i10) {
        int length = this.f35745g.length;
        int i11 = this.f35744f;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.f35743e;
        int iMax = Math.max(i12 * 2, i10 + i12);
        byte[] bArr = this.f35745g;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f35743e, bArr2, 0, i12);
        this.f35743e = 0;
        this.f35744f = i12;
        this.f35745g = bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(e eVar, long j10, int i10) {
        C13466a.i(this.f35747i);
        byte[] bArrA = this.f35741c.a(eVar.f35701a, eVar.f35703c);
        this.f35742d.T(bArrA);
        this.f35739a.d(this.f35742d, bArrA.length);
        long j11 = eVar.f35702b;
        if (j11 == -9223372036854775807L) {
            C13466a.g(this.f35747i.f43954t == Long.MAX_VALUE);
        } else {
            long j12 = this.f35747i.f43954t;
            j10 = j12 == Long.MAX_VALUE ? j10 + j11 : j11 + j12;
        }
        this.f35739a.c(j10, i10 | 1, bArrA.length, 0, null);
    }

    @Override // x3.O
    public int a(InterfaceC5571k interfaceC5571k, int i10, boolean z10, int i11) throws IOException {
        if (this.f35746h == null) {
            return this.f35739a.a(interfaceC5571k, i10, z10, i11);
        }
        i(i10);
        int i12 = interfaceC5571k.read(this.f35745g, this.f35744f, i10);
        if (i12 != -1) {
            this.f35744f += i12;
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // x3.O
    public void b(a3.t tVar) {
        C13466a.e(tVar.f43949o);
        C13466a.a(z.k(tVar.f43949o) == 3);
        if (!tVar.equals(this.f35747i)) {
            this.f35747i = tVar;
            this.f35746h = this.f35740b.a(tVar) ? this.f35740b.c(tVar) : null;
        }
        if (this.f35746h == null) {
            this.f35739a.b(tVar);
        } else {
            this.f35739a.b(tVar.b().u0("application/x-media3-cues").S(tVar.f43949o).y0(Long.MAX_VALUE).W(this.f35740b.b(tVar)).N());
        }
    }

    @Override // x3.O
    public void c(final long j10, final int i10, int i11, int i12, O.a aVar) {
        if (this.f35746h == null) {
            this.f35739a.c(j10, i10, i11, i12, aVar);
            return;
        }
        C13466a.b(aVar == null, "DRM on subtitles is not supported");
        int i13 = (this.f35744f - i12) - i11;
        try {
            this.f35746h.a(this.f35745g, i13, i11, r.b.b(), new InterfaceC13477l() { // from class: U3.t
                @Override // d3.InterfaceC13477l
                public final void accept(Object obj) {
                    this.f35736a.j((e) obj, j10, i10);
                }
            });
        } catch (RuntimeException e10) {
            if (!this.f35748j) {
                throw e10;
            }
            d3.r.j("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e10);
        }
        int i14 = i13 + i11;
        this.f35743e = i14;
        if (i14 == this.f35744f) {
            this.f35743e = 0;
            this.f35744f = 0;
        }
    }

    @Override // x3.O
    public void e(D d10, int i10, int i11) {
        if (this.f35746h == null) {
            this.f35739a.e(d10, i10, i11);
            return;
        }
        i(i10);
        d10.l(this.f35745g, this.f35744f, i10);
        this.f35744f += i10;
    }

    public void k(boolean z10) {
        this.f35748j = z10;
    }

    public u(O o10, r.a aVar) {
        this.f35739a = o10;
        this.f35740b = aVar;
    }
}
