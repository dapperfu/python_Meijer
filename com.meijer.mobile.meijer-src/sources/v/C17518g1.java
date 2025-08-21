package v;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import v.C17518g1;

/* renamed from: v.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C17518g1 {

    /* renamed from: a, reason: collision with root package name */
    final Executor f165065a;

    /* renamed from: b, reason: collision with root package name */
    final Object f165066b = new Object();

    /* renamed from: c, reason: collision with root package name */
    final Set<J1> f165067c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    final Set<J1> f165068d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    final Set<J1> f165069e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    private final CameraDevice.StateCallback f165070f = new a();

    /* renamed from: v.g1$a */
    class a extends CameraDevice.StateCallback {
        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }

        a() {
        }

        private void c() {
            List<J1> listF;
            synchronized (C17518g1.this.f165066b) {
                listF = C17518g1.this.f();
                C17518g1.this.f165069e.clear();
                C17518g1.this.f165067c.clear();
                C17518g1.this.f165068d.clear();
            }
            Iterator<J1> it = listF.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
        }

        private void d(final int i10) {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (C17518g1.this.f165066b) {
                linkedHashSet.addAll(C17518g1.this.f165069e);
                linkedHashSet.addAll(C17518g1.this.f165067c);
            }
            C17518g1.this.f165065a.execute(new Runnable() { // from class: v.f1
                @Override // java.lang.Runnable
                public final void run() {
                    C17518g1.a.a(linkedHashSet, i10);
                }
            });
        }

        private void e() {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (C17518g1.this.f165066b) {
                linkedHashSet.addAll(C17518g1.this.f165069e);
                linkedHashSet.addAll(C17518g1.this.f165067c);
            }
            C17518g1.this.f165065a.execute(new Runnable() { // from class: v.e1
                @Override // java.lang.Runnable
                public final void run() {
                    C17518g1.b(linkedHashSet);
                }
            });
        }

        public static /* synthetic */ void a(LinkedHashSet linkedHashSet, int i10) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((J1) it.next()).f(i10);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            e();
            c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            e();
            c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            e();
            d(i10);
            c();
        }
    }

    CameraDevice.StateCallback c() {
        return this.f165070f;
    }

    List<J1> d() {
        ArrayList arrayList;
        synchronized (this.f165066b) {
            arrayList = new ArrayList(this.f165067c);
        }
        return arrayList;
    }

    List<J1> e() {
        ArrayList arrayList;
        synchronized (this.f165066b) {
            arrayList = new ArrayList(this.f165069e);
        }
        return arrayList;
    }

    List<J1> f() {
        ArrayList arrayList;
        synchronized (this.f165066b) {
            arrayList = new ArrayList();
            arrayList.addAll(d());
            arrayList.addAll(e());
        }
        return arrayList;
    }

    void g(J1 j12) {
        synchronized (this.f165066b) {
            this.f165067c.remove(j12);
            this.f165068d.remove(j12);
        }
    }

    void h(J1 j12) {
        synchronized (this.f165066b) {
            this.f165068d.add(j12);
        }
    }

    void j(J1 j12) {
        synchronized (this.f165066b) {
            this.f165067c.add(j12);
            this.f165069e.remove(j12);
        }
        a(j12);
    }

    void k(J1 j12) {
        synchronized (this.f165066b) {
            this.f165069e.add(j12);
        }
    }

    C17518g1(Executor executor) {
        this.f165065a = executor;
    }

    private void a(J1 j12) {
        J1 next;
        Iterator<J1> it = f().iterator();
        while (it.hasNext() && (next = it.next()) != j12) {
            next.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Set<J1> set) {
        for (J1 j12 : set) {
            j12.c().q(j12);
        }
    }

    void i(J1 j12) {
        a(j12);
        synchronized (this.f165066b) {
            this.f165069e.remove(j12);
        }
    }
}
