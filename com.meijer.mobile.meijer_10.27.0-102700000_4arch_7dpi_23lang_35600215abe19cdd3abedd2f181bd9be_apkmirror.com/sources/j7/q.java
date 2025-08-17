package j7;

import android.util.Log;
import com.fullstory.FS;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import m7.InterfaceC15569d;

/* loaded from: classes4.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final Set<InterfaceC15569d> f139513a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final Set<InterfaceC15569d> f139514b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private boolean f139515c;

    public boolean a(InterfaceC15569d interfaceC15569d) {
        boolean z10 = true;
        if (interfaceC15569d == null) {
            return true;
        }
        boolean zRemove = this.f139513a.remove(interfaceC15569d);
        if (!this.f139514b.remove(interfaceC15569d) && !zRemove) {
            z10 = false;
        }
        if (z10) {
            interfaceC15569d.clear();
        }
        return z10;
    }

    public void c() {
        this.f139515c = true;
        for (InterfaceC15569d interfaceC15569d : p7.l.j(this.f139513a)) {
            if (interfaceC15569d.isRunning() || interfaceC15569d.isComplete()) {
                interfaceC15569d.clear();
                this.f139514b.add(interfaceC15569d);
            }
        }
    }

    public void d() {
        this.f139515c = true;
        for (InterfaceC15569d interfaceC15569d : p7.l.j(this.f139513a)) {
            if (interfaceC15569d.isRunning()) {
                interfaceC15569d.pause();
                this.f139514b.add(interfaceC15569d);
            }
        }
    }

    public void f() {
        this.f139515c = false;
        for (InterfaceC15569d interfaceC15569d : p7.l.j(this.f139513a)) {
            if (!interfaceC15569d.isComplete() && !interfaceC15569d.isRunning()) {
                interfaceC15569d.i();
            }
        }
        this.f139514b.clear();
    }

    public void b() {
        Iterator it = p7.l.j(this.f139513a).iterator();
        while (it.hasNext()) {
            a((InterfaceC15569d) it.next());
        }
        this.f139514b.clear();
    }

    public void e() {
        for (InterfaceC15569d interfaceC15569d : p7.l.j(this.f139513a)) {
            if (!interfaceC15569d.isComplete() && !interfaceC15569d.f()) {
                interfaceC15569d.clear();
                if (this.f139515c) {
                    this.f139514b.add(interfaceC15569d);
                } else {
                    interfaceC15569d.i();
                }
            }
        }
    }

    public void g(InterfaceC15569d interfaceC15569d) {
        this.f139513a.add(interfaceC15569d);
        if (!this.f139515c) {
            interfaceC15569d.i();
            return;
        }
        interfaceC15569d.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            FS.log_v("RequestTracker", "Paused, delaying request");
        }
        this.f139514b.add(interfaceC15569d);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f139513a.size() + ", isPaused=" + this.f139515c + "}";
    }
}
