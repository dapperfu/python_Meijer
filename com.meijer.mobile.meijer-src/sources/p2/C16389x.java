package p2;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.view.AbstractC6165l;
import androidx.view.InterfaceC6169p;
import androidx.view.InterfaceC6172s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: p2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C16389x {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f156077a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<InterfaceC16392z> f156078b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final Map<InterfaceC16392z, a> f156079c = new HashMap();

    /* renamed from: p2.x$a */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC6165l f156080a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC6169p f156081b;

        void a() {
            this.f156080a.d(this.f156081b);
            this.f156081b = null;
        }

        a(AbstractC6165l abstractC6165l, InterfaceC6169p interfaceC6169p) {
            this.f156080a = abstractC6165l;
            this.f156081b = interfaceC6169p;
            abstractC6165l.a(interfaceC6169p);
        }
    }

    public void c(InterfaceC16392z interfaceC16392z) {
        this.f156078b.add(interfaceC16392z);
        this.f156077a.run();
    }

    public void f(Menu menu, MenuInflater menuInflater) {
        Iterator<InterfaceC16392z> it = this.f156078b.iterator();
        while (it.hasNext()) {
            it.next().d(menu, menuInflater);
        }
    }

    public void g(Menu menu) {
        Iterator<InterfaceC16392z> it = this.f156078b.iterator();
        while (it.hasNext()) {
            it.next().a(menu);
        }
    }

    public boolean h(MenuItem menuItem) {
        Iterator<InterfaceC16392z> it = this.f156078b.iterator();
        while (it.hasNext()) {
            if (it.next().c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void i(Menu menu) {
        Iterator<InterfaceC16392z> it = this.f156078b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public void j(InterfaceC16392z interfaceC16392z) {
        this.f156078b.remove(interfaceC16392z);
        a aVarRemove = this.f156079c.remove(interfaceC16392z);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f156077a.run();
    }

    public C16389x(Runnable runnable) {
        this.f156077a = runnable;
    }

    public static /* synthetic */ void a(C16389x c16389x, AbstractC6165l.b bVar, InterfaceC16392z interfaceC16392z, InterfaceC6172s interfaceC6172s, AbstractC6165l.a aVar) {
        c16389x.getClass();
        if (aVar == AbstractC6165l.a.l(bVar)) {
            c16389x.c(interfaceC16392z);
            return;
        }
        if (aVar == AbstractC6165l.a.ON_DESTROY) {
            c16389x.j(interfaceC16392z);
        } else if (aVar == AbstractC6165l.a.b(bVar)) {
            c16389x.f156078b.remove(interfaceC16392z);
            c16389x.f156077a.run();
        }
    }

    public static /* synthetic */ void b(C16389x c16389x, InterfaceC16392z interfaceC16392z, InterfaceC6172s interfaceC6172s, AbstractC6165l.a aVar) {
        c16389x.getClass();
        if (aVar == AbstractC6165l.a.ON_DESTROY) {
            c16389x.j(interfaceC16392z);
        }
    }

    public void d(final InterfaceC16392z interfaceC16392z, InterfaceC6172s interfaceC6172s) {
        c(interfaceC16392z);
        AbstractC6165l lifecycle = interfaceC6172s.getLifecycle();
        a aVarRemove = this.f156079c.remove(interfaceC16392z);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f156079c.put(interfaceC16392z, new a(lifecycle, new InterfaceC6169p() { // from class: p2.w
            @Override // androidx.view.InterfaceC6169p
            public final void onStateChanged(InterfaceC6172s interfaceC6172s2, AbstractC6165l.a aVar) {
                C16389x.b(this.f156075a, interfaceC16392z, interfaceC6172s2, aVar);
            }
        }));
    }

    @SuppressLint({"LambdaLast"})
    public void e(final InterfaceC16392z interfaceC16392z, InterfaceC6172s interfaceC6172s, final AbstractC6165l.b bVar) {
        AbstractC6165l lifecycle = interfaceC6172s.getLifecycle();
        a aVarRemove = this.f156079c.remove(interfaceC16392z);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f156079c.put(interfaceC16392z, new a(lifecycle, new InterfaceC6169p() { // from class: p2.v
            @Override // androidx.view.InterfaceC6169p
            public final void onStateChanged(InterfaceC6172s interfaceC6172s2, AbstractC6165l.a aVar) {
                C16389x.a(this.f156072a, bVar, interfaceC16392z, interfaceC6172s2, aVar);
            }
        }));
    }
}
