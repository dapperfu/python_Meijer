package U3;

import U3.r;
import androidx.media3.common.ParserException;
import d3.C13599a;
import d3.D;
import d3.InterfaceC13610l;
import d3.P;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import x3.E;
import x3.I;
import x3.InterfaceC18077p;
import x3.InterfaceC18078q;
import x3.O;

/* loaded from: classes4.dex */
public class n implements InterfaceC18077p {

    /* renamed from: a, reason: collision with root package name */
    private final r f37047a;

    /* renamed from: c, reason: collision with root package name */
    private final a3.t f37049c;

    /* renamed from: d, reason: collision with root package name */
    private final List<b> f37050d;

    /* renamed from: g, reason: collision with root package name */
    private O f37053g;

    /* renamed from: h, reason: collision with root package name */
    private int f37054h;

    /* renamed from: i, reason: collision with root package name */
    private int f37055i;

    /* renamed from: j, reason: collision with root package name */
    private long[] f37056j;

    /* renamed from: k, reason: collision with root package name */
    private long f37057k;

    /* renamed from: b, reason: collision with root package name */
    private final d f37048b = new d();

    /* renamed from: f, reason: collision with root package name */
    private byte[] f37052f = P.f127893f;

    /* renamed from: e, reason: collision with root package name */
    private final D f37051e = new D();

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        private final long f37058a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f37059b;

        private b(long j10, byte[] bArr) {
            this.f37058a = j10;
            this.f37059b = bArr;
        }

        @Override // java.lang.Comparable
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return Long.compare(this.f37058a, bVar.f37058a);
        }
    }

    @Override // x3.InterfaceC18077p
    public boolean j(InterfaceC18078q interfaceC18078q) throws IOException {
        return true;
    }

    private void f() throws IOException {
        try {
            long j10 = this.f37057k;
            this.f37047a.a(this.f37052f, 0, this.f37054h, j10 != -9223372036854775807L ? r.b.c(j10) : r.b.b(), new InterfaceC13610l() { // from class: U3.m
                @Override // d3.InterfaceC13610l
                public final void accept(Object obj) {
                    n.d(this.f37046a, (e) obj);
                }
            });
            Collections.sort(this.f37050d);
            this.f37056j = new long[this.f37050d.size()];
            for (int i10 = 0; i10 < this.f37050d.size(); i10++) {
                this.f37056j[i10] = this.f37050d.get(i10).f37058a;
            }
            this.f37052f = P.f127893f;
        } catch (RuntimeException e10) {
            throw ParserException.a("SubtitleParser failed.", e10);
        }
    }

    private boolean g(InterfaceC18078q interfaceC18078q) throws IOException {
        byte[] bArr = this.f37052f;
        if (bArr.length == this.f37054h) {
            this.f37052f = Arrays.copyOf(bArr, bArr.length + 1024);
        }
        byte[] bArr2 = this.f37052f;
        int i10 = this.f37054h;
        int i11 = interfaceC18078q.read(bArr2, i10, bArr2.length - i10);
        if (i11 != -1) {
            this.f37054h += i11;
        }
        long length = interfaceC18078q.getLength();
        return (length != -1 && ((long) this.f37054h) == length) || i11 == -1;
    }

    private void k() {
        long j10 = this.f37057k;
        for (int iG = j10 == -9223372036854775807L ? 0 : P.g(this.f37056j, j10, true, true); iG < this.f37050d.size(); iG++) {
            l(this.f37050d.get(iG));
        }
    }

    private void l(b bVar) {
        C13599a.i(this.f37053g);
        int length = bVar.f37059b.length;
        this.f37051e.T(bVar.f37059b);
        this.f37053g.d(this.f37051e, length);
        this.f37053g.c(bVar.f37058a, 1, length, 0, null);
    }

    @Override // x3.InterfaceC18077p
    public void a(long j10, long j11) {
        int i10 = this.f37055i;
        C13599a.g((i10 == 0 || i10 == 5) ? false : true);
        this.f37057k = j11;
        if (this.f37055i == 2) {
            this.f37055i = 1;
        }
        if (this.f37055i == 4) {
            this.f37055i = 3;
        }
    }

    @Override // x3.InterfaceC18077p
    public int b(InterfaceC18078q interfaceC18078q, I i10) throws IOException {
        int i11 = this.f37055i;
        C13599a.g((i11 == 0 || i11 == 5) ? false : true);
        if (this.f37055i == 1) {
            int iD = interfaceC18078q.getLength() != -1 ? Je.f.d(interfaceC18078q.getLength()) : 1024;
            if (iD > this.f37052f.length) {
                this.f37052f = new byte[iD];
            }
            this.f37054h = 0;
            this.f37055i = 2;
        }
        if (this.f37055i == 2 && g(interfaceC18078q)) {
            f();
            this.f37055i = 4;
        }
        if (this.f37055i == 3 && h(interfaceC18078q)) {
            k();
            this.f37055i = 4;
        }
        return this.f37055i == 4 ? -1 : 0;
    }

    @Override // x3.InterfaceC18077p
    public void c(x3.r rVar) {
        C13599a.g(this.f37055i == 0);
        O oT = rVar.t(0, 3);
        this.f37053g = oT;
        a3.t tVar = this.f37049c;
        if (tVar != null) {
            oT.b(tVar);
            rVar.p();
            rVar.g(new E(new long[]{0}, new long[]{0}, -9223372036854775807L));
        }
        this.f37055i = 1;
    }

    @Override // x3.InterfaceC18077p
    public void release() {
        if (this.f37055i == 5) {
            return;
        }
        this.f37047a.reset();
        this.f37055i = 5;
    }

    public n(r rVar, a3.t tVar) {
        a3.t tVarN;
        this.f37047a = rVar;
        if (tVar != null) {
            tVarN = tVar.b().u0("application/x-media3-cues").S(tVar.f44767o).W(rVar.c()).N();
        } else {
            tVarN = null;
        }
        this.f37049c = tVarN;
        this.f37050d = new ArrayList();
        this.f37055i = 0;
        this.f37056j = P.f127894g;
        this.f37057k = -9223372036854775807L;
    }

    public static /* synthetic */ void d(n nVar, e eVar) {
        nVar.getClass();
        b bVar = new b(eVar.f37038b, nVar.f37048b.a(eVar.f37037a, eVar.f37039c));
        nVar.f37050d.add(bVar);
        long j10 = nVar.f37057k;
        if (j10 != -9223372036854775807L && eVar.f37038b < j10) {
            return;
        }
        nVar.l(bVar);
    }

    private boolean h(InterfaceC18078q interfaceC18078q) throws IOException {
        int iD;
        if (interfaceC18078q.getLength() != -1) {
            iD = Je.f.d(interfaceC18078q.getLength());
        } else {
            iD = 1024;
        }
        if (interfaceC18078q.a(iD) == -1) {
            return true;
        }
        return false;
    }
}
