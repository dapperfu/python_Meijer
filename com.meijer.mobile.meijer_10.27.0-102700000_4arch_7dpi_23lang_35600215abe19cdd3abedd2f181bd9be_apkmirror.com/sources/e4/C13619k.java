package e4;

import a3.t;
import androidx.media3.common.ParserException;
import com.medallia.digital.mobilesdk.l3;
import d3.C13466a;
import d3.P;
import e4.L;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import x3.C18010o;
import x3.O;

/* renamed from: e4.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13619k implements InterfaceC13621m {

    /* renamed from: a, reason: collision with root package name */
    private final d3.D f128358a;

    /* renamed from: c, reason: collision with root package name */
    private final String f128360c;

    /* renamed from: d, reason: collision with root package name */
    private final int f128361d;

    /* renamed from: e, reason: collision with root package name */
    private final String f128362e;

    /* renamed from: f, reason: collision with root package name */
    private String f128363f;

    /* renamed from: g, reason: collision with root package name */
    private O f128364g;

    /* renamed from: i, reason: collision with root package name */
    private int f128366i;

    /* renamed from: j, reason: collision with root package name */
    private int f128367j;

    /* renamed from: k, reason: collision with root package name */
    private long f128368k;

    /* renamed from: l, reason: collision with root package name */
    private a3.t f128369l;

    /* renamed from: m, reason: collision with root package name */
    private int f128370m;

    /* renamed from: n, reason: collision with root package name */
    private int f128371n;

    /* renamed from: h, reason: collision with root package name */
    private int f128365h = 0;

    /* renamed from: q, reason: collision with root package name */
    private long f128374q = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f128359b = new AtomicInteger();

    /* renamed from: o, reason: collision with root package name */
    private int f128372o = -1;

    /* renamed from: p, reason: collision with root package name */
    private int f128373p = -1;

    @Override // e4.InterfaceC13621m
    public void c() {
        this.f128365h = 0;
        this.f128366i = 0;
        this.f128367j = 0;
        this.f128374q = -9223372036854775807L;
        this.f128359b.set(0);
    }

    @Override // e4.InterfaceC13621m
    public void d(boolean z10) {
    }

    private void g() {
        byte[] bArrE = this.f128358a.e();
        if (this.f128369l == null) {
            a3.t tVarH = C18010o.h(bArrE, this.f128363f, this.f128360c, this.f128361d, this.f128362e, null);
            this.f128369l = tVarH;
            this.f128364g.b(tVarH);
        }
        this.f128370m = C18010o.b(bArrE);
        this.f128368k = He.f.d(P.U0(C18010o.g(bArrE), this.f128369l.f43925F));
    }

    private void h() throws ParserException {
        C18010o.b bVarI = C18010o.i(this.f128358a.e());
        k(bVarI);
        this.f128370m = bVarI.f169250d;
        long j10 = bVarI.f169251e;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        this.f128368k = j10;
    }

    private void i() throws ParserException {
        C18010o.b bVarK = C18010o.k(this.f128358a.e(), this.f128359b);
        if (this.f128371n == 3) {
            k(bVarK);
        }
        this.f128370m = bVarK.f169250d;
        long j10 = bVarK.f169251e;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        this.f128368k = j10;
    }

    private void k(C18010o.b bVar) {
        int i10;
        int i11 = bVar.f169248b;
        if (i11 == -2147483647 || (i10 = bVar.f169249c) == -1) {
            return;
        }
        a3.t tVar = this.f128369l;
        if (tVar != null && i10 == tVar.f43924E && i11 == tVar.f43925F && Objects.equals(bVar.f169247a, tVar.f43949o)) {
            return;
        }
        a3.t tVar2 = this.f128369l;
        a3.t tVarN = (tVar2 == null ? new t.b() : tVar2.b()).f0(this.f128363f).U(this.f128362e).u0(bVar.f169247a).R(bVar.f169249c).v0(bVar.f169248b).j0(this.f128360c).s0(this.f128361d).N();
        this.f128369l = tVarN;
        this.f128364g.b(tVarN);
    }

    @Override // e4.InterfaceC13621m
    public void a(d3.D d10) throws ParserException {
        C13466a.i(this.f128364g);
        while (d10.a() > 0) {
            switch (this.f128365h) {
                case 0:
                    if (!j(d10)) {
                        break;
                    } else {
                        int i10 = this.f128371n;
                        if (i10 != 3 && i10 != 4) {
                            if (i10 != 1) {
                                this.f128365h = 2;
                                break;
                            } else {
                                this.f128365h = 1;
                                break;
                            }
                        } else {
                            this.f128365h = 4;
                            break;
                        }
                    }
                    break;
                case 1:
                    if (!b(d10, this.f128358a.e(), 18)) {
                        break;
                    } else {
                        g();
                        this.f128358a.W(0);
                        this.f128364g.d(this.f128358a, 18);
                        this.f128365h = 6;
                        break;
                    }
                case 2:
                    if (!b(d10, this.f128358a.e(), 7)) {
                        break;
                    } else {
                        this.f128372o = C18010o.j(this.f128358a.e());
                        this.f128365h = 3;
                        break;
                    }
                case 3:
                    if (!b(d10, this.f128358a.e(), this.f128372o)) {
                        break;
                    } else {
                        h();
                        this.f128358a.W(0);
                        this.f128364g.d(this.f128358a, this.f128372o);
                        this.f128365h = 6;
                        break;
                    }
                case 4:
                    if (!b(d10, this.f128358a.e(), 6)) {
                        break;
                    } else {
                        int iL = C18010o.l(this.f128358a.e());
                        this.f128373p = iL;
                        int i11 = this.f128366i;
                        if (i11 > iL) {
                            int i12 = i11 - iL;
                            this.f128366i = i11 - i12;
                            d10.W(d10.f() - i12);
                        }
                        this.f128365h = 5;
                        break;
                    }
                case 5:
                    if (!b(d10, this.f128358a.e(), this.f128373p)) {
                        break;
                    } else {
                        i();
                        this.f128358a.W(0);
                        this.f128364g.d(this.f128358a, this.f128373p);
                        this.f128365h = 6;
                        break;
                    }
                case 6:
                    int iMin = Math.min(d10.a(), this.f128370m - this.f128366i);
                    this.f128364g.d(d10, iMin);
                    int i13 = this.f128366i + iMin;
                    this.f128366i = i13;
                    if (i13 == this.f128370m) {
                        C13466a.g(this.f128374q != -9223372036854775807L);
                        this.f128364g.c(this.f128374q, this.f128371n == 4 ? 0 : 1, this.f128370m, 0, null);
                        this.f128374q += this.f128368k;
                        this.f128365h = 0;
                        break;
                    } else {
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // e4.InterfaceC13621m
    public void e(long j10, int i10) {
        this.f128374q = j10;
    }

    public C13619k(String str, int i10, int i11, String str2) {
        this.f128358a = new d3.D(new byte[i11]);
        this.f128360c = str;
        this.f128361d = i10;
        this.f128362e = str2;
    }

    private boolean b(d3.D d10, byte[] bArr, int i10) {
        int iMin = Math.min(d10.a(), i10 - this.f128366i);
        d10.l(bArr, this.f128366i, iMin);
        int i11 = this.f128366i + iMin;
        this.f128366i = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    private boolean j(d3.D d10) {
        while (d10.a() > 0) {
            int i10 = this.f128367j << 8;
            this.f128367j = i10;
            int iH = i10 | d10.H();
            this.f128367j = iH;
            int iC = C18010o.c(iH);
            this.f128371n = iC;
            if (iC != 0) {
                byte[] bArrE = this.f128358a.e();
                int i11 = this.f128367j;
                bArrE[0] = (byte) ((i11 >> 24) & l3.f92484c);
                bArrE[1] = (byte) ((i11 >> 16) & l3.f92484c);
                bArrE[2] = (byte) ((i11 >> 8) & l3.f92484c);
                bArrE[3] = (byte) (i11 & l3.f92484c);
                this.f128366i = 4;
                this.f128367j = 0;
                return true;
            }
        }
        return false;
    }

    @Override // e4.InterfaceC13621m
    public void f(x3.r rVar, L.d dVar) {
        dVar.a();
        this.f128363f = dVar.b();
        this.f128364g = rVar.t(dVar.c(), 1);
    }
}
