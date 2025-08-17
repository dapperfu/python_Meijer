package U3;

import U3.r;
import androidx.media3.common.ParserException;
import d3.C13466a;
import d3.D;
import d3.InterfaceC13477l;
import d3.P;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import x3.E;
import x3.I;
import x3.InterfaceC18011p;
import x3.InterfaceC18012q;
import x3.O;

/* loaded from: classes4.dex */
public class n implements InterfaceC18011p {

    /* renamed from: a, reason: collision with root package name */
    private final r f35711a;

    /* renamed from: c, reason: collision with root package name */
    private final a3.t f35713c;

    /* renamed from: d, reason: collision with root package name */
    private final List<b> f35714d;

    /* renamed from: g, reason: collision with root package name */
    private O f35717g;

    /* renamed from: h, reason: collision with root package name */
    private int f35718h;

    /* renamed from: i, reason: collision with root package name */
    private int f35719i;

    /* renamed from: j, reason: collision with root package name */
    private long[] f35720j;

    /* renamed from: k, reason: collision with root package name */
    private long f35721k;

    /* renamed from: b, reason: collision with root package name */
    private final d f35712b = new d();

    /* renamed from: f, reason: collision with root package name */
    private byte[] f35716f = P.f127091f;

    /* renamed from: e, reason: collision with root package name */
    private final D f35715e = new D();

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        private final long f35722a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f35723b;

        private b(long j10, byte[] bArr) {
            this.f35722a = j10;
            this.f35723b = bArr;
        }

        @Override // java.lang.Comparable
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return Long.compare(this.f35722a, bVar.f35722a);
        }
    }

    @Override // x3.InterfaceC18011p
    public boolean j(InterfaceC18012q interfaceC18012q) throws IOException {
        return true;
    }

    private void f() throws IOException {
        try {
            long j10 = this.f35721k;
            this.f35711a.a(this.f35716f, 0, this.f35718h, j10 != -9223372036854775807L ? r.b.c(j10) : r.b.b(), new InterfaceC13477l() { // from class: U3.m
                @Override // d3.InterfaceC13477l
                public final void accept(Object obj) {
                    n.d(this.f35710a, (e) obj);
                }
            });
            Collections.sort(this.f35714d);
            this.f35720j = new long[this.f35714d.size()];
            for (int i10 = 0; i10 < this.f35714d.size(); i10++) {
                this.f35720j[i10] = this.f35714d.get(i10).f35722a;
            }
            this.f35716f = P.f127091f;
        } catch (RuntimeException e10) {
            throw ParserException.a("SubtitleParser failed.", e10);
        }
    }

    private boolean g(InterfaceC18012q interfaceC18012q) throws IOException {
        byte[] bArr = this.f35716f;
        if (bArr.length == this.f35718h) {
            this.f35716f = Arrays.copyOf(bArr, bArr.length + 1024);
        }
        byte[] bArr2 = this.f35716f;
        int i10 = this.f35718h;
        int i11 = interfaceC18012q.read(bArr2, i10, bArr2.length - i10);
        if (i11 != -1) {
            this.f35718h += i11;
        }
        long length = interfaceC18012q.getLength();
        return (length != -1 && ((long) this.f35718h) == length) || i11 == -1;
    }

    private void k() {
        long j10 = this.f35721k;
        for (int iG = j10 == -9223372036854775807L ? 0 : P.g(this.f35720j, j10, true, true); iG < this.f35714d.size(); iG++) {
            l(this.f35714d.get(iG));
        }
    }

    private void l(b bVar) {
        C13466a.i(this.f35717g);
        int length = bVar.f35723b.length;
        this.f35715e.T(bVar.f35723b);
        this.f35717g.d(this.f35715e, length);
        this.f35717g.c(bVar.f35722a, 1, length, 0, null);
    }

    @Override // x3.InterfaceC18011p
    public void a(long j10, long j11) {
        int i10 = this.f35719i;
        C13466a.g((i10 == 0 || i10 == 5) ? false : true);
        this.f35721k = j11;
        if (this.f35719i == 2) {
            this.f35719i = 1;
        }
        if (this.f35719i == 4) {
            this.f35719i = 3;
        }
    }

    @Override // x3.InterfaceC18011p
    public int b(InterfaceC18012q interfaceC18012q, I i10) throws IOException {
        int i11 = this.f35719i;
        C13466a.g((i11 == 0 || i11 == 5) ? false : true);
        if (this.f35719i == 1) {
            int iD = interfaceC18012q.getLength() != -1 ? He.f.d(interfaceC18012q.getLength()) : 1024;
            if (iD > this.f35716f.length) {
                this.f35716f = new byte[iD];
            }
            this.f35718h = 0;
            this.f35719i = 2;
        }
        if (this.f35719i == 2 && g(interfaceC18012q)) {
            f();
            this.f35719i = 4;
        }
        if (this.f35719i == 3 && h(interfaceC18012q)) {
            k();
            this.f35719i = 4;
        }
        return this.f35719i == 4 ? -1 : 0;
    }

    @Override // x3.InterfaceC18011p
    public void c(x3.r rVar) {
        C13466a.g(this.f35719i == 0);
        O oT = rVar.t(0, 3);
        this.f35717g = oT;
        a3.t tVar = this.f35713c;
        if (tVar != null) {
            oT.b(tVar);
            rVar.p();
            rVar.g(new E(new long[]{0}, new long[]{0}, -9223372036854775807L));
        }
        this.f35719i = 1;
    }

    @Override // x3.InterfaceC18011p
    public void release() {
        if (this.f35719i == 5) {
            return;
        }
        this.f35711a.reset();
        this.f35719i = 5;
    }

    public n(r rVar, a3.t tVar) {
        a3.t tVarN;
        this.f35711a = rVar;
        if (tVar != null) {
            tVarN = tVar.b().u0("application/x-media3-cues").S(tVar.f43949o).W(rVar.c()).N();
        } else {
            tVarN = null;
        }
        this.f35713c = tVarN;
        this.f35714d = new ArrayList();
        this.f35719i = 0;
        this.f35720j = P.f127092g;
        this.f35721k = -9223372036854775807L;
    }

    public static /* synthetic */ void d(n nVar, e eVar) {
        nVar.getClass();
        b bVar = new b(eVar.f35702b, nVar.f35712b.a(eVar.f35701a, eVar.f35703c));
        nVar.f35714d.add(bVar);
        long j10 = nVar.f35721k;
        if (j10 != -9223372036854775807L && eVar.f35702b < j10) {
            return;
        }
        nVar.l(bVar);
    }

    private boolean h(InterfaceC18012q interfaceC18012q) throws IOException {
        int iD;
        if (interfaceC18012q.getLength() != -1) {
            iD = He.f.d(interfaceC18012q.getLength());
        } else {
            iD = 1024;
        }
        if (interfaceC18012q.a(iD) == -1) {
            return true;
        }
        return false;
    }
}
