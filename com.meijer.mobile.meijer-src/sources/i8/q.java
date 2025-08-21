package i8;

import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import m8.C15689d;
import m8.EnumC15686a;

/* loaded from: classes4.dex */
public class q extends p {

    /* renamed from: y, reason: collision with root package name */
    private static final String f137343y = x.f137411a + "DTXActionImpl";

    /* renamed from: z, reason: collision with root package name */
    private static ConcurrentHashMap<Long, Vector<p>> f137344z = new ConcurrentHashMap<>();

    /* renamed from: u, reason: collision with root package name */
    protected int f137345u;

    /* renamed from: v, reason: collision with root package name */
    protected Vector<p> f137346v;

    /* renamed from: w, reason: collision with root package name */
    protected boolean f137347w;

    /* renamed from: x, reason: collision with root package name */
    int f137348x;

    public void J() {
        K(true);
        v();
    }

    protected void M(p pVar) {
    }

    protected q(String str, w wVar, long j10, p8.b bVar, int i10, boolean z10, q qVar) {
        super(str, 5, wVar, j10, bVar, i10, z10);
        this.f137345u = -1;
        this.f137346v = new Vector<>();
        this.f137348x = 0;
        this.f137334k = qVar;
        if (qVar == null) {
            this.f137335l = this;
        } else {
            this.f137335l = qVar.f137335l;
        }
        this.f137347w = z10;
        if (x.f137412b) {
            z8.f.u(f137343y, "New action " + str);
        }
        if (u()) {
            if (x.f137412b) {
                z8.f.u(f137343y, "The action name is null or empty hence this action will be deactivated");
            }
            c();
        }
    }

    public final void D(p pVar) {
        if (pVar == null || !pVar.r()) {
            return;
        }
        q();
        this.f137346v.add(pVar);
        M(pVar);
    }

    public Vector<p> F() {
        Vector<p> vector;
        synchronized (this.f137346v) {
            vector = new Vector<>(this.f137346v);
        }
        return vector;
    }

    public int G() {
        return this.f137348x;
    }

    protected void L(boolean z10) {
        Vector<p> vector = this.f137346v;
        if (vector == null) {
            return;
        }
        synchronized (vector) {
            try {
                for (int size = this.f137346v.size() - 1; size >= 0; size--) {
                    p pVar = this.f137346v.get(size);
                    if (pVar.p() == 5) {
                        ((q) pVar).K(z10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void N(String str) {
        if (str == null) {
            return;
        }
        Iterator<p> it = F().iterator();
        while (it.hasNext()) {
            p next = it.next();
            if (next.h().equals(str)) {
                this.f137346v.remove(next);
                l.q(next);
                if (x.f137412b) {
                    z8.f.u(f137343y, "Removing child: " + str);
                    return;
                }
                return;
            }
        }
    }

    @Override // i8.p
    public StringBuilder b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("et=");
        sb2.append(this.f137333j.e());
        sb2.append("&na=");
        sb2.append(z8.f.t(h()));
        sb2.append("&it=");
        sb2.append(z8.f.e());
        sb2.append("&ca=");
        sb2.append(o());
        sb2.append("&pa=");
        sb2.append(j());
        sb2.append("&s0=");
        sb2.append(g());
        sb2.append("&t0=");
        sb2.append(n());
        sb2.append("&s1=");
        sb2.append(this.f137345u);
        sb2.append("&t1=");
        sb2.append(e() - n());
        sb2.append("&fw=");
        sb2.append(this.f137347w ? "1" : "0");
        return sb2;
    }

    @Deprecated
    static Vector<p> H() {
        C15689d c15689dC = C14695b.e().c();
        if (c15689dC != null && c15689dC.f150767d == EnumC15686a.SAAS) {
            return null;
        }
        return f137344z.remove(Long.valueOf(z8.f.e()));
    }

    @Deprecated
    protected void E() {
        Vector<p> vectorH = H();
        if (vectorH != null) {
            Iterator<p> it = vectorH.iterator();
            while (it.hasNext()) {
                p next = it.next();
                if (next.n() > n() && next.n() < e()) {
                    if (x.f137412b) {
                        z8.f.u(f137343y, String.format("%s adopting %s tagId=%s", h(), next.h(), Long.valueOf(next.o())));
                    }
                    next.y(o());
                    D(next);
                } else if (x.f137412b) {
                    z8.f.u(f137343y, String.format("%s not adopting %s tagId=%s", h(), next.h(), Long.valueOf(next.o())));
                }
            }
        }
    }

    protected boolean I() {
        if (s()) {
            return false;
        }
        if (this.f137348x >= 10) {
            if (x.f137412b) {
                z8.f.z(f137343y, String.format("Maximum depth of actions reached (10). Discarding creation of '%s'", h()));
            }
            return false;
        }
        return u.b();
    }

    protected void K(boolean z10) {
        q qVar;
        if (s()) {
            if (x.f137412b) {
                z8.f.u(f137343y, String.format("Action %s is already closed", h()));
                return;
            }
            return;
        }
        if (x.f137412b) {
            z8.f.u(f137343y, String.format("Action %s closing ... saving=%b", h(), Boolean.valueOf(z10)));
        }
        C14694a.b(this);
        boolean zI = I();
        if (zI) {
            this.f137326c = this.f137331h.h();
            E();
            L(z10);
            this.f137345u = z8.f.f();
            if (z10) {
                qVar = this;
                l.d(h(), 2, j(), qVar, this.f137331h, this.f137332i, new String[0]);
            } else {
                qVar = this;
                B();
                l.q(this);
            }
        } else {
            qVar = this;
            L(false);
            B();
            l.q(this);
        }
        p pVar = qVar.f137334k;
        if (pVar != null && (pVar instanceof r)) {
            ((r) pVar).a0(this);
        }
        if (x.f137412b) {
            String str = f137343y;
            z8.f.u(str, String.format("Action %s closed: shouldSave=%b rc=%b", h(), Boolean.valueOf(z10), Boolean.valueOf(zI)));
            if (!zI) {
                z8.f.z(str, String.format("Discard %s tagId=%d capture state=%b", h(), Long.valueOf(o()), Boolean.valueOf(zI)));
            }
        }
    }
}
