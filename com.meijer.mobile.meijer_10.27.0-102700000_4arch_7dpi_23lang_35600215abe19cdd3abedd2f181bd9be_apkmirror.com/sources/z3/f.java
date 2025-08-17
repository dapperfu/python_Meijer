package z3;

import Ce.L;
import Ce.y0;
import d3.D;

/* loaded from: classes2.dex */
final class f implements InterfaceC18378a {

    /* renamed from: a, reason: collision with root package name */
    public final L<InterfaceC18378a> f171542a;

    /* renamed from: b, reason: collision with root package name */
    private final int f171543b;

    public static f c(int i10, D d10) {
        L.a aVar = new L.a();
        int iG = d10.g();
        int iB = -2;
        while (d10.a() > 8) {
            int iU = d10.u();
            int iF = d10.f() + d10.u();
            d10.V(iF);
            InterfaceC18378a interfaceC18378aC = iU == 1414744396 ? c(d10.u(), d10) : a(iU, iB, d10);
            if (interfaceC18378aC != null) {
                if (interfaceC18378aC.getType() == 1752331379) {
                    iB = ((d) interfaceC18378aC).b();
                }
                aVar.a(interfaceC18378aC);
            }
            d10.W(iF);
            d10.V(iG);
        }
        return new f(i10, aVar.k());
    }

    public <T extends InterfaceC18378a> T b(Class<T> cls) {
        y0<InterfaceC18378a> it = this.f171542a.iterator();
        while (it.hasNext()) {
            T t10 = (T) it.next();
            if (t10.getClass() == cls) {
                return t10;
            }
        }
        return null;
    }

    @Override // z3.InterfaceC18378a
    public int getType() {
        return this.f171543b;
    }

    private f(int i10, L<InterfaceC18378a> l10) {
        this.f171543b = i10;
        this.f171542a = l10;
    }

    private static InterfaceC18378a a(int i10, int i11, D d10) {
        switch (i10) {
            case 1718776947:
                return g.d(i11, d10);
            case 1751742049:
                return c.b(d10);
            case 1752331379:
                return d.c(d10);
            case 1852994675:
                return h.a(d10);
            default:
                return null;
        }
    }
}
