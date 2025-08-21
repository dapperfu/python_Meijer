package l7;

import androidx.view.AbstractC6165l;
import androidx.view.InterfaceC6132F;
import androidx.view.InterfaceC6171r;
import androidx.view.InterfaceC6172s;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
final class k implements j, InterfaceC6171r {

    /* renamed from: a, reason: collision with root package name */
    private final Set<l> f149515a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6165l f149516b;

    @Override // l7.j
    public void a(l lVar) {
        this.f149515a.remove(lVar);
    }

    @Override // l7.j
    public void b(l lVar) {
        this.f149515a.add(lVar);
        if (this.f149516b.b() == AbstractC6165l.b.f55499a) {
            lVar.onDestroy();
        } else if (this.f149516b.b().b(AbstractC6165l.b.f55502d)) {
            lVar.onStart();
        } else {
            lVar.onStop();
        }
    }

    @InterfaceC6132F(AbstractC6165l.a.ON_DESTROY)
    public void onDestroy(InterfaceC6172s interfaceC6172s) {
        Iterator it = r7.l.j(this.f149515a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).onDestroy();
        }
        interfaceC6172s.getLifecycle().d(this);
    }

    @InterfaceC6132F(AbstractC6165l.a.ON_START)
    public void onStart(InterfaceC6172s interfaceC6172s) {
        Iterator it = r7.l.j(this.f149515a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).onStart();
        }
    }

    @InterfaceC6132F(AbstractC6165l.a.ON_STOP)
    public void onStop(InterfaceC6172s interfaceC6172s) {
        Iterator it = r7.l.j(this.f149515a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).onStop();
        }
    }

    k(AbstractC6165l abstractC6165l) {
        this.f149516b = abstractC6165l;
        abstractC6165l.a(this);
    }
}
