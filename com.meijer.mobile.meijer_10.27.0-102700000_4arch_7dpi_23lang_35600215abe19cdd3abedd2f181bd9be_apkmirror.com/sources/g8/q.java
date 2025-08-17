package g8;

import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import k8.C15118d;
import k8.EnumC15115a;

/* loaded from: classes4.dex */
public class q extends p {

    /* renamed from: y, reason: collision with root package name */
    private static final String f133127y = x.f133195a + "DTXActionImpl";

    /* renamed from: z, reason: collision with root package name */
    private static ConcurrentHashMap<Long, Vector<p>> f133128z = new ConcurrentHashMap<>();

    /* renamed from: u, reason: collision with root package name */
    protected int f133129u;

    /* renamed from: v, reason: collision with root package name */
    protected Vector<p> f133130v;

    /* renamed from: w, reason: collision with root package name */
    protected boolean f133131w;

    /* renamed from: x, reason: collision with root package name */
    int f133132x;

    public void J() {
        K(true);
        v();
    }

    protected void M(p pVar) {
    }

    protected q(String str, w wVar, long j10, n8.b bVar, int i10, boolean z10, q qVar) {
        super(str, 5, wVar, j10, bVar, i10, z10);
        this.f133129u = -1;
        this.f133130v = new Vector<>();
        this.f133132x = 0;
        this.f133118k = qVar;
        if (qVar == null) {
            this.f133119l = this;
        } else {
            this.f133119l = qVar.f133119l;
        }
        this.f133131w = z10;
        if (x.f133196b) {
            x8.f.u(f133127y, "New action " + str);
        }
        if (u()) {
            if (x.f133196b) {
                x8.f.u(f133127y, "The action name is null or empty hence this action will be deactivated");
            }
            c();
        }
    }

    public final void D(p pVar) {
        if (pVar == null || !pVar.r()) {
            return;
        }
        q();
        this.f133130v.add(pVar);
        M(pVar);
    }

    public Vector<p> F() {
        Vector<p> vector;
        synchronized (this.f133130v) {
            vector = new Vector<>(this.f133130v);
        }
        return vector;
    }

    public int G() {
        return this.f133132x;
    }

    protected void L(boolean z10) {
        Vector<p> vector = this.f133130v;
        if (vector == null) {
            return;
        }
        synchronized (vector) {
            try {
                for (int size = this.f133130v.size() - 1; size >= 0; size--) {
                    p pVar = this.f133130v.get(size);
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
                this.f133130v.remove(next);
                l.q(next);
                if (x.f133196b) {
                    x8.f.u(f133127y, "Removing child: " + str);
                    return;
                }
                return;
            }
        }
    }

    @Override // g8.p
    public StringBuilder b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("et=");
        sb2.append(this.f133117j.e());
        sb2.append("&na=");
        sb2.append(x8.f.t(h()));
        sb2.append("&it=");
        sb2.append(x8.f.e());
        sb2.append("&ca=");
        sb2.append(o());
        sb2.append("&pa=");
        sb2.append(j());
        sb2.append("&s0=");
        sb2.append(g());
        sb2.append("&t0=");
        sb2.append(n());
        sb2.append("&s1=");
        sb2.append(this.f133129u);
        sb2.append("&t1=");
        sb2.append(e() - n());
        sb2.append("&fw=");
        sb2.append(this.f133131w ? "1" : "0");
        return sb2;
    }

    @Deprecated
    static Vector<p> H() {
        C15118d c15118dC = C14219b.e().c();
        if (c15118dC != null && c15118dC.f141621d == EnumC15115a.SAAS) {
            return null;
        }
        return f133128z.remove(Long.valueOf(x8.f.e()));
    }

    @Deprecated
    protected void E() {
        Vector<p> vectorH = H();
        if (vectorH != null) {
            Iterator<p> it = vectorH.iterator();
            while (it.hasNext()) {
                p next = it.next();
                if (next.n() > n() && next.n() < e()) {
                    if (x.f133196b) {
                        x8.f.u(f133127y, String.format("%s adopting %s tagId=%s", h(), next.h(), Long.valueOf(next.o())));
                    }
                    next.y(o());
                    D(next);
                } else if (x.f133196b) {
                    x8.f.u(f133127y, String.format("%s not adopting %s tagId=%s", h(), next.h(), Long.valueOf(next.o())));
                }
            }
        }
    }

    protected boolean I() {
        if (s()) {
            return false;
        }
        if (this.f133132x >= 10) {
            if (x.f133196b) {
                x8.f.z(f133127y, String.format("Maximum depth of actions reached (10). Discarding creation of '%s'", h()));
            }
            return false;
        }
        return u.b();
    }

    protected void K(boolean z10) {
        q qVar;
        if (s()) {
            if (x.f133196b) {
                x8.f.u(f133127y, String.format("Action %s is already closed", h()));
                return;
            }
            return;
        }
        if (x.f133196b) {
            x8.f.u(f133127y, String.format("Action %s closing ... saving=%b", h(), Boolean.valueOf(z10)));
        }
        C14218a.b(this);
        boolean zI = I();
        if (zI) {
            this.f133110c = this.f133115h.h();
            E();
            L(z10);
            this.f133129u = x8.f.f();
            if (z10) {
                qVar = this;
                l.d(h(), 2, j(), qVar, this.f133115h, this.f133116i, new String[0]);
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
        p pVar = qVar.f133118k;
        if (pVar != null && (pVar instanceof r)) {
            ((r) pVar).a0(this);
        }
        if (x.f133196b) {
            String str = f133127y;
            x8.f.u(str, String.format("Action %s closed: shouldSave=%b rc=%b", h(), Boolean.valueOf(z10), Boolean.valueOf(zI)));
            if (!zI) {
                x8.f.z(str, String.format("Discard %s tagId=%d capture state=%b", h(), Long.valueOf(o()), Boolean.valueOf(zI)));
            }
        }
    }
}
