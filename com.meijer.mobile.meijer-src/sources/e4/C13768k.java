package e4;

import a3.t;
import androidx.media3.common.ParserException;
import com.medallia.digital.mobilesdk.l3;
import d3.C13599a;
import d3.P;
import e4.L;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import x3.C18076o;
import x3.O;

/* renamed from: e4.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13768k implements InterfaceC13770m {

    /* renamed from: a, reason: collision with root package name */
    private final d3.D f129694a;

    /* renamed from: c, reason: collision with root package name */
    private final String f129696c;

    /* renamed from: d, reason: collision with root package name */
    private final int f129697d;

    /* renamed from: e, reason: collision with root package name */
    private final String f129698e;

    /* renamed from: f, reason: collision with root package name */
    private String f129699f;

    /* renamed from: g, reason: collision with root package name */
    private O f129700g;

    /* renamed from: i, reason: collision with root package name */
    private int f129702i;

    /* renamed from: j, reason: collision with root package name */
    private int f129703j;

    /* renamed from: k, reason: collision with root package name */
    private long f129704k;

    /* renamed from: l, reason: collision with root package name */
    private a3.t f129705l;

    /* renamed from: m, reason: collision with root package name */
    private int f129706m;

    /* renamed from: n, reason: collision with root package name */
    private int f129707n;

    /* renamed from: h, reason: collision with root package name */
    private int f129701h = 0;

    /* renamed from: q, reason: collision with root package name */
    private long f129710q = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f129695b = new AtomicInteger();

    /* renamed from: o, reason: collision with root package name */
    private int f129708o = -1;

    /* renamed from: p, reason: collision with root package name */
    private int f129709p = -1;

    @Override // e4.InterfaceC13770m
    public void c() {
        this.f129701h = 0;
        this.f129702i = 0;
        this.f129703j = 0;
        this.f129710q = -9223372036854775807L;
        this.f129695b.set(0);
    }

    @Override // e4.InterfaceC13770m
    public void d(boolean z10) {
    }

    private void g() {
        byte[] bArrE = this.f129694a.e();
        if (this.f129705l == null) {
            a3.t tVarH = C18076o.h(bArrE, this.f129699f, this.f129696c, this.f129697d, this.f129698e, null);
            this.f129705l = tVarH;
            this.f129700g.b(tVarH);
        }
        this.f129706m = C18076o.b(bArrE);
        this.f129704k = Je.f.d(P.U0(C18076o.g(bArrE), this.f129705l.f44743F));
    }

    private void h() throws ParserException {
        C18076o.b bVarI = C18076o.i(this.f129694a.e());
        k(bVarI);
        this.f129706m = bVarI.f170338d;
        long j10 = bVarI.f170339e;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        this.f129704k = j10;
    }

    private void i() throws ParserException {
        C18076o.b bVarK = C18076o.k(this.f129694a.e(), this.f129695b);
        if (this.f129707n == 3) {
            k(bVarK);
        }
        this.f129706m = bVarK.f170338d;
        long j10 = bVarK.f170339e;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        this.f129704k = j10;
    }

    private void k(C18076o.b bVar) {
        int i10;
        int i11 = bVar.f170336b;
        if (i11 == -2147483647 || (i10 = bVar.f170337c) == -1) {
            return;
        }
        a3.t tVar = this.f129705l;
        if (tVar != null && i10 == tVar.f44742E && i11 == tVar.f44743F && Objects.equals(bVar.f170335a, tVar.f44767o)) {
            return;
        }
        a3.t tVar2 = this.f129705l;
        a3.t tVarN = (tVar2 == null ? new t.b() : tVar2.b()).f0(this.f129699f).U(this.f129698e).u0(bVar.f170335a).R(bVar.f170337c).v0(bVar.f170336b).j0(this.f129696c).s0(this.f129697d).N();
        this.f129705l = tVarN;
        this.f129700g.b(tVarN);
    }

    @Override // e4.InterfaceC13770m
    public void a(d3.D d10) throws ParserException {
        C13599a.i(this.f129700g);
        while (d10.a() > 0) {
            switch (this.f129701h) {
                case 0:
                    if (!j(d10)) {
                        break;
                    } else {
                        int i10 = this.f129707n;
                        if (i10 != 3 && i10 != 4) {
                            if (i10 != 1) {
                                this.f129701h = 2;
                                break;
                            } else {
                                this.f129701h = 1;
                                break;
                            }
                        } else {
                            this.f129701h = 4;
                            break;
                        }
                    }
                    break;
                case 1:
                    if (!b(d10, this.f129694a.e(), 18)) {
                        break;
                    } else {
                        g();
                        this.f129694a.W(0);
                        this.f129700g.d(this.f129694a, 18);
                        this.f129701h = 6;
                        break;
                    }
                case 2:
                    if (!b(d10, this.f129694a.e(), 7)) {
                        break;
                    } else {
                        this.f129708o = C18076o.j(this.f129694a.e());
                        this.f129701h = 3;
                        break;
                    }
                case 3:
                    if (!b(d10, this.f129694a.e(), this.f129708o)) {
                        break;
                    } else {
                        h();
                        this.f129694a.W(0);
                        this.f129700g.d(this.f129694a, this.f129708o);
                        this.f129701h = 6;
                        break;
                    }
                case 4:
                    if (!b(d10, this.f129694a.e(), 6)) {
                        break;
                    } else {
                        int iL = C18076o.l(this.f129694a.e());
                        this.f129709p = iL;
                        int i11 = this.f129702i;
                        if (i11 > iL) {
                            int i12 = i11 - iL;
                            this.f129702i = i11 - i12;
                            d10.W(d10.f() - i12);
                        }
                        this.f129701h = 5;
                        break;
                    }
                case 5:
                    if (!b(d10, this.f129694a.e(), this.f129709p)) {
                        break;
                    } else {
                        i();
                        this.f129694a.W(0);
                        this.f129700g.d(this.f129694a, this.f129709p);
                        this.f129701h = 6;
                        break;
                    }
                case 6:
                    int iMin = Math.min(d10.a(), this.f129706m - this.f129702i);
                    this.f129700g.d(d10, iMin);
                    int i13 = this.f129702i + iMin;
                    this.f129702i = i13;
                    if (i13 == this.f129706m) {
                        C13599a.g(this.f129710q != -9223372036854775807L);
                        this.f129700g.c(this.f129710q, this.f129707n == 4 ? 0 : 1, this.f129706m, 0, null);
                        this.f129710q += this.f129704k;
                        this.f129701h = 0;
                        break;
                    } else {
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // e4.InterfaceC13770m
    public void e(long j10, int i10) {
        this.f129710q = j10;
    }

    public C13768k(String str, int i10, int i11, String str2) {
        this.f129694a = new d3.D(new byte[i11]);
        this.f129696c = str;
        this.f129697d = i10;
        this.f129698e = str2;
    }

    private boolean b(d3.D d10, byte[] bArr, int i10) {
        int iMin = Math.min(d10.a(), i10 - this.f129702i);
        d10.l(bArr, this.f129702i, iMin);
        int i11 = this.f129702i + iMin;
        this.f129702i = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    private boolean j(d3.D d10) {
        while (d10.a() > 0) {
            int i10 = this.f129703j << 8;
            this.f129703j = i10;
            int iH = i10 | d10.H();
            this.f129703j = iH;
            int iC = C18076o.c(iH);
            this.f129707n = iC;
            if (iC != 0) {
                byte[] bArrE = this.f129694a.e();
                int i11 = this.f129703j;
                bArrE[0] = (byte) ((i11 >> 24) & l3.f93323c);
                bArrE[1] = (byte) ((i11 >> 16) & l3.f93323c);
                bArrE[2] = (byte) ((i11 >> 8) & l3.f93323c);
                bArrE[3] = (byte) (i11 & l3.f93323c);
                this.f129702i = 4;
                this.f129703j = 0;
                return true;
            }
        }
        return false;
    }

    @Override // e4.InterfaceC13770m
    public void f(x3.r rVar, L.d dVar) {
        dVar.a();
        this.f129699f = dVar.b();
        this.f129700g = rVar.t(dVar.c(), 1);
    }
}
