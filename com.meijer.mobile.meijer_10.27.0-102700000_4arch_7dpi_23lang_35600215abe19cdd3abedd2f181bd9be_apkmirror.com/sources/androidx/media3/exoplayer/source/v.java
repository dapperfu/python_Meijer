package androidx.media3.exoplayer.source;

import Ce.U;
import a3.t;
import androidx.media3.exoplayer.C6061l0;
import androidx.media3.exoplayer.source.q;
import d3.C13466a;
import h3.M;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import p3.InterfaceC16252e;

/* loaded from: classes.dex */
final class v implements q, q.a {

    /* renamed from: a, reason: collision with root package name */
    private final q[] f56944a;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC16252e f56946c;

    /* renamed from: f, reason: collision with root package name */
    private q.a f56949f;

    /* renamed from: g, reason: collision with root package name */
    private p3.w f56950g;

    /* renamed from: i, reason: collision with root package name */
    private G f56952i;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<q> f56947d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<a3.G, a3.G> f56948e = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final IdentityHashMap<p3.r, Integer> f56945b = new IdentityHashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private q[] f56951h = new q[0];

    private static final class a implements s3.y {

        /* renamed from: a, reason: collision with root package name */
        private final s3.y f56953a;

        /* renamed from: b, reason: collision with root package name */
        private final a3.G f56954b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f56953a.equals(aVar.f56953a) && this.f56954b.equals(aVar.f56954b);
        }

        @Override // s3.InterfaceC16850B
        public a3.t a(int i10) {
            return this.f56954b.a(this.f56953a.c(i10));
        }

        @Override // s3.InterfaceC16850B
        public int c(int i10) {
            return this.f56953a.c(i10);
        }

        @Override // s3.y
        public void d(float f10) {
            this.f56953a.d(f10);
        }

        @Override // s3.y
        public void disable() {
            this.f56953a.disable();
        }

        @Override // s3.y
        public void e() {
            this.f56953a.e();
        }

        @Override // s3.y
        public void enable() {
            this.f56953a.enable();
        }

        @Override // s3.InterfaceC16850B
        public int f(int i10) {
            return this.f56953a.f(i10);
        }

        @Override // s3.InterfaceC16850B
        public a3.G g() {
            return this.f56954b;
        }

        @Override // s3.y
        public void h(boolean z10) {
            this.f56953a.h(z10);
        }

        public int hashCode() {
            return ((527 + this.f56954b.hashCode()) * 31) + this.f56953a.hashCode();
        }

        @Override // s3.y
        public int i() {
            return this.f56953a.i();
        }

        @Override // s3.y
        public a3.t j() {
            return this.f56954b.a(this.f56953a.i());
        }

        @Override // s3.y
        public void k() {
            this.f56953a.k();
        }

        @Override // s3.InterfaceC16850B
        public int length() {
            return this.f56953a.length();
        }

        public a(s3.y yVar, a3.G g10) {
            this.f56953a = yVar;
            this.f56954b = g10;
        }
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean a() {
        return this.f56952i.a();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean b(C6061l0 c6061l0) {
        if (this.f56947d.isEmpty()) {
            return this.f56952i.b(c6061l0);
        }
        int size = this.f56947d.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f56947d.get(i10).b(c6061l0);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long c() {
        return this.f56952i.c();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long d() {
        return this.f56952i.d();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public void e(long j10) {
        this.f56952i.e(j10);
    }

    @Override // androidx.media3.exoplayer.source.q.a
    public void f(q qVar) {
        this.f56947d.remove(qVar);
        if (!this.f56947d.isEmpty()) {
            return;
        }
        int i10 = 0;
        for (q qVar2 : this.f56944a) {
            i10 += qVar2.r().f155475a;
        }
        a3.G[] gArr = new a3.G[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            q[] qVarArr = this.f56944a;
            if (i11 >= qVarArr.length) {
                this.f56950g = new p3.w(gArr);
                ((q.a) C13466a.e(this.f56949f)).f(this);
                return;
            }
            p3.w wVarR = qVarArr[i11].r();
            int i13 = wVarR.f155475a;
            int i14 = 0;
            while (i14 < i13) {
                a3.G gB = wVarR.b(i14);
                a3.t[] tVarArr = new a3.t[gB.f43633a];
                for (int i15 = 0; i15 < gB.f43633a; i15++) {
                    a3.t tVarA = gB.a(i15);
                    t.b bVarB = tVarA.b();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i11);
                    sb2.append(":");
                    String str = tVarA.f43935a;
                    if (str == null) {
                        str = "";
                    }
                    sb2.append(str);
                    tVarArr[i15] = bVarB.f0(sb2.toString()).N();
                }
                a3.G g10 = new a3.G(i11 + ":" + gB.f43634b, tVarArr);
                this.f56948e.put(g10, gB);
                gArr[i12] = g10;
                i14++;
                i12++;
            }
            i11++;
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public long h(long j10) {
        long jH = this.f56951h[0].h(j10);
        int i10 = 1;
        while (true) {
            q[] qVarArr = this.f56951h;
            if (i10 >= qVarArr.length) {
                return jH;
            }
            if (qVarArr[i10].h(jH) != jH) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public long i(s3.y[] yVarArr, boolean[] zArr, p3.r[] rVarArr, boolean[] zArr2, long j10) {
        int[] iArr = new int[yVarArr.length];
        int[] iArr2 = new int[yVarArr.length];
        int i10 = 0;
        for (int i11 = 0; i11 < yVarArr.length; i11++) {
            p3.r rVar = rVarArr[i11];
            Integer num = rVar == null ? null : this.f56945b.get(rVar);
            iArr[i11] = num == null ? -1 : num.intValue();
            s3.y yVar = yVarArr[i11];
            if (yVar != null) {
                String str = yVar.g().f43634b;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i11] = -1;
            }
        }
        this.f56945b.clear();
        int length = yVarArr.length;
        p3.r[] rVarArr2 = new p3.r[length];
        p3.r[] rVarArr3 = new p3.r[yVarArr.length];
        s3.y[] yVarArr2 = new s3.y[yVarArr.length];
        ArrayList arrayList = new ArrayList(this.f56944a.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < this.f56944a.length) {
            for (int i13 = i10; i13 < yVarArr.length; i13++) {
                rVarArr3[i13] = iArr[i13] == i12 ? rVarArr[i13] : null;
                if (iArr2[i13] == i12) {
                    s3.y yVar2 = (s3.y) C13466a.e(yVarArr[i13]);
                    yVarArr2[i13] = new a(yVar2, (a3.G) C13466a.e(this.f56948e.get(yVar2.g())));
                } else {
                    yVarArr2[i13] = null;
                }
            }
            int i14 = i12;
            long jI = this.f56944a[i12].i(yVarArr2, zArr, rVarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = jI;
            } else if (jI != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < yVarArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    p3.r rVar2 = (p3.r) C13466a.e(rVarArr3[i15]);
                    rVarArr2[i15] = rVarArr3[i15];
                    this.f56945b.put(rVar2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    C13466a.g(rVarArr3[i15] == null);
                }
            }
            if (z10) {
                arrayList.add(this.f56944a[i14]);
            }
            i12 = i14 + 1;
            i10 = 0;
        }
        int i16 = i10;
        System.arraycopy(rVarArr2, i16, rVarArr, i16, length);
        this.f56951h = (q[]) arrayList.toArray(new q[i16]);
        this.f56952i = this.f56946c.a(arrayList, U.l(arrayList, new Be.g() { // from class: androidx.media3.exoplayer.source.u
            @Override // Be.g
            public final Object apply(Object obj) {
                return ((q) obj).r().c();
            }
        }));
        return j11;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long j() {
        long j10 = -9223372036854775807L;
        for (q qVar : this.f56951h) {
            long j11 = qVar.j();
            if (j11 == -9223372036854775807L) {
                if (j10 != -9223372036854775807L && qVar.h(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == -9223372036854775807L) {
                for (q qVar2 : this.f56951h) {
                    if (qVar2 == qVar) {
                        break;
                    }
                    if (qVar2.h(j11) != j11) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j10 = j11;
            } else if (j11 != j10) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long k(long j10, M m10) {
        q[] qVarArr = this.f56951h;
        return (qVarArr.length > 0 ? qVarArr[0] : this.f56944a[0]).k(j10, m10);
    }

    public q m(int i10) {
        q qVar = this.f56944a[i10];
        return qVar instanceof K ? ((K) qVar).l() : qVar;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void n() throws IOException {
        for (q qVar : this.f56944a) {
            qVar.n();
        }
    }

    @Override // androidx.media3.exoplayer.source.G.a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void g(q qVar) {
        ((q.a) C13466a.e(this.f56949f)).g(this);
    }

    @Override // androidx.media3.exoplayer.source.q
    public void q(q.a aVar, long j10) {
        this.f56949f = aVar;
        Collections.addAll(this.f56947d, this.f56944a);
        for (q qVar : this.f56944a) {
            qVar.q(this, j10);
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public p3.w r() {
        return (p3.w) C13466a.e(this.f56950g);
    }

    @Override // androidx.media3.exoplayer.source.q
    public void u(long j10, boolean z10) {
        for (q qVar : this.f56951h) {
            qVar.u(j10, z10);
        }
    }

    public v(InterfaceC16252e interfaceC16252e, long[] jArr, q... qVarArr) {
        this.f56946c = interfaceC16252e;
        this.f56944a = qVarArr;
        this.f56952i = interfaceC16252e.empty();
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f56944a[i10] = new K(qVarArr[i10], j10);
            }
        }
    }
}
