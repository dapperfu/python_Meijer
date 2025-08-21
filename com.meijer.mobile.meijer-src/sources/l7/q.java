package l7;

import android.util.Log;
import com.fullstory.FS;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import o7.InterfaceC16079d;

/* loaded from: classes4.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final Set<InterfaceC16079d> f149529a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final Set<InterfaceC16079d> f149530b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private boolean f149531c;

    public boolean a(InterfaceC16079d interfaceC16079d) {
        boolean z10 = true;
        if (interfaceC16079d == null) {
            return true;
        }
        boolean zRemove = this.f149529a.remove(interfaceC16079d);
        if (!this.f149530b.remove(interfaceC16079d) && !zRemove) {
            z10 = false;
        }
        if (z10) {
            interfaceC16079d.clear();
        }
        return z10;
    }

    public void c() {
        this.f149531c = true;
        for (InterfaceC16079d interfaceC16079d : r7.l.j(this.f149529a)) {
            if (interfaceC16079d.isRunning() || interfaceC16079d.isComplete()) {
                interfaceC16079d.clear();
                this.f149530b.add(interfaceC16079d);
            }
        }
    }

    public void d() {
        this.f149531c = true;
        for (InterfaceC16079d interfaceC16079d : r7.l.j(this.f149529a)) {
            if (interfaceC16079d.isRunning()) {
                interfaceC16079d.pause();
                this.f149530b.add(interfaceC16079d);
            }
        }
    }

    public void f() {
        this.f149531c = false;
        for (InterfaceC16079d interfaceC16079d : r7.l.j(this.f149529a)) {
            if (!interfaceC16079d.isComplete() && !interfaceC16079d.isRunning()) {
                interfaceC16079d.i();
            }
        }
        this.f149530b.clear();
    }

    public void b() {
        Iterator it = r7.l.j(this.f149529a).iterator();
        while (it.hasNext()) {
            a((InterfaceC16079d) it.next());
        }
        this.f149530b.clear();
    }

    public void e() {
        for (InterfaceC16079d interfaceC16079d : r7.l.j(this.f149529a)) {
            if (!interfaceC16079d.isComplete() && !interfaceC16079d.e()) {
                interfaceC16079d.clear();
                if (this.f149531c) {
                    this.f149530b.add(interfaceC16079d);
                } else {
                    interfaceC16079d.i();
                }
            }
        }
    }

    public void g(InterfaceC16079d interfaceC16079d) {
        this.f149529a.add(interfaceC16079d);
        if (!this.f149531c) {
            interfaceC16079d.i();
            return;
        }
        interfaceC16079d.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            FS.log_v("RequestTracker", "Paused, delaying request");
        }
        this.f149530b.add(interfaceC16079d);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f149529a.size() + ", isPaused=" + this.f149531c + "}";
    }
}
