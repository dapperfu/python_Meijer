package j7;

import androidx.view.AbstractC6023l;
import androidx.view.InterfaceC5990F;
import androidx.view.InterfaceC6029r;
import androidx.view.InterfaceC6030s;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
final class k implements j, InterfaceC6029r {

    /* renamed from: a, reason: collision with root package name */
    private final Set<l> f139499a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6023l f139500b;

    @Override // j7.j
    public void a(l lVar) {
        this.f139499a.remove(lVar);
    }

    @Override // j7.j
    public void b(l lVar) {
        this.f139499a.add(lVar);
        if (this.f139500b.b() == AbstractC6023l.b.f55275a) {
            lVar.onDestroy();
        } else if (this.f139500b.b().b(AbstractC6023l.b.f55278d)) {
            lVar.onStart();
        } else {
            lVar.onStop();
        }
    }

    @InterfaceC5990F(AbstractC6023l.a.ON_DESTROY)
    public void onDestroy(InterfaceC6030s interfaceC6030s) {
        Iterator it = p7.l.j(this.f139499a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).onDestroy();
        }
        interfaceC6030s.getLifecycle().d(this);
    }

    @InterfaceC5990F(AbstractC6023l.a.ON_START)
    public void onStart(InterfaceC6030s interfaceC6030s) {
        Iterator it = p7.l.j(this.f139499a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).onStart();
        }
    }

    @InterfaceC5990F(AbstractC6023l.a.ON_STOP)
    public void onStop(InterfaceC6030s interfaceC6030s) {
        Iterator it = p7.l.j(this.f139499a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).onStop();
        }
    }

    k(AbstractC6023l abstractC6023l) {
        this.f139500b = abstractC6023l;
        abstractC6023l.a(this);
    }
}
