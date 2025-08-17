package p2;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.view.AbstractC6023l;
import androidx.view.InterfaceC6027p;
import androidx.view.InterfaceC6030s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: p2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C16244x {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f155403a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<InterfaceC16247z> f155404b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final Map<InterfaceC16247z, a> f155405c = new HashMap();

    /* renamed from: p2.x$a */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC6023l f155406a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC6027p f155407b;

        void a() {
            this.f155406a.d(this.f155407b);
            this.f155407b = null;
        }

        a(AbstractC6023l abstractC6023l, InterfaceC6027p interfaceC6027p) {
            this.f155406a = abstractC6023l;
            this.f155407b = interfaceC6027p;
            abstractC6023l.a(interfaceC6027p);
        }
    }

    public void c(InterfaceC16247z interfaceC16247z) {
        this.f155404b.add(interfaceC16247z);
        this.f155403a.run();
    }

    public void f(Menu menu, MenuInflater menuInflater) {
        Iterator<InterfaceC16247z> it = this.f155404b.iterator();
        while (it.hasNext()) {
            it.next().d(menu, menuInflater);
        }
    }

    public void g(Menu menu) {
        Iterator<InterfaceC16247z> it = this.f155404b.iterator();
        while (it.hasNext()) {
            it.next().a(menu);
        }
    }

    public boolean h(MenuItem menuItem) {
        Iterator<InterfaceC16247z> it = this.f155404b.iterator();
        while (it.hasNext()) {
            if (it.next().c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void i(Menu menu) {
        Iterator<InterfaceC16247z> it = this.f155404b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public void j(InterfaceC16247z interfaceC16247z) {
        this.f155404b.remove(interfaceC16247z);
        a aVarRemove = this.f155405c.remove(interfaceC16247z);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f155403a.run();
    }

    public C16244x(Runnable runnable) {
        this.f155403a = runnable;
    }

    public static /* synthetic */ void a(C16244x c16244x, AbstractC6023l.b bVar, InterfaceC16247z interfaceC16247z, InterfaceC6030s interfaceC6030s, AbstractC6023l.a aVar) {
        c16244x.getClass();
        if (aVar == AbstractC6023l.a.l(bVar)) {
            c16244x.c(interfaceC16247z);
            return;
        }
        if (aVar == AbstractC6023l.a.ON_DESTROY) {
            c16244x.j(interfaceC16247z);
        } else if (aVar == AbstractC6023l.a.b(bVar)) {
            c16244x.f155404b.remove(interfaceC16247z);
            c16244x.f155403a.run();
        }
    }

    public static /* synthetic */ void b(C16244x c16244x, InterfaceC16247z interfaceC16247z, InterfaceC6030s interfaceC6030s, AbstractC6023l.a aVar) {
        c16244x.getClass();
        if (aVar == AbstractC6023l.a.ON_DESTROY) {
            c16244x.j(interfaceC16247z);
        }
    }

    public void d(final InterfaceC16247z interfaceC16247z, InterfaceC6030s interfaceC6030s) {
        c(interfaceC16247z);
        AbstractC6023l lifecycle = interfaceC6030s.getLifecycle();
        a aVarRemove = this.f155405c.remove(interfaceC16247z);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f155405c.put(interfaceC16247z, new a(lifecycle, new InterfaceC6027p() { // from class: p2.w
            @Override // androidx.view.InterfaceC6027p
            public final void onStateChanged(InterfaceC6030s interfaceC6030s2, AbstractC6023l.a aVar) {
                C16244x.b(this.f155401a, interfaceC16247z, interfaceC6030s2, aVar);
            }
        }));
    }

    @SuppressLint({"LambdaLast"})
    public void e(final InterfaceC16247z interfaceC16247z, InterfaceC6030s interfaceC6030s, final AbstractC6023l.b bVar) {
        AbstractC6023l lifecycle = interfaceC6030s.getLifecycle();
        a aVarRemove = this.f155405c.remove(interfaceC16247z);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f155405c.put(interfaceC16247z, new a(lifecycle, new InterfaceC6027p() { // from class: p2.v
            @Override // androidx.view.InterfaceC6027p
            public final void onStateChanged(InterfaceC6030s interfaceC6030s2, AbstractC6023l.a aVar) {
                C16244x.a(this.f155398a, bVar, interfaceC16247z, interfaceC6030s2, aVar);
            }
        }));
    }
}
