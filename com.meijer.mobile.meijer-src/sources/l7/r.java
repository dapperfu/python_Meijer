package l7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import l7.InterfaceC15471b;
import r7.f;

/* loaded from: classes4.dex */
final class r {

    /* renamed from: d, reason: collision with root package name */
    private static volatile r f149532d;

    /* renamed from: a, reason: collision with root package name */
    private final c f149533a;

    /* renamed from: b, reason: collision with root package name */
    final Set<InterfaceC15471b.a> f149534b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private boolean f149535c;

    class a implements f.b<ConnectivityManager> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f149536a;

        a(Context context) {
            this.f149536a = context;
        }

        @Override // r7.f.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f149536a.getSystemService("connectivity");
        }
    }

    class b implements InterfaceC15471b.a {
        b() {
        }

        @Override // l7.InterfaceC15471b.a
        public void a(boolean z10) {
            ArrayList arrayList;
            r7.l.a();
            synchronized (r.this) {
                arrayList = new ArrayList(r.this.f149534b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC15471b.a) it.next()).a(z10);
            }
        }
    }

    private interface c {
        boolean register();

        void unregister();
    }

    private static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        boolean f149539a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC15471b.a f149540b;

        /* renamed from: c, reason: collision with root package name */
        private final f.b<ConnectivityManager> f149541c;

        /* renamed from: d, reason: collision with root package name */
        private final ConnectivityManager.NetworkCallback f149542d = new a();

        class a extends ConnectivityManager.NetworkCallback {

            /* renamed from: l7.r$d$a$a, reason: collision with other inner class name */
            class RunnableC2297a implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ boolean f149544a;

                RunnableC2297a(boolean z10) {
                    this.f149544a = z10;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.a(this.f149544a);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                b(false);
            }

            a() {
            }

            private void b(boolean z10) {
                r7.l.u(new RunnableC2297a(z10));
            }

            void a(boolean z10) {
                r7.l.a();
                d dVar = d.this;
                boolean z11 = dVar.f149539a;
                dVar.f149539a = z10;
                if (z11 != z10) {
                    dVar.f149540b.a(z10);
                }
            }
        }

        @Override // l7.r.c
        @SuppressLint({"MissingPermission"})
        public boolean register() {
            this.f149539a = this.f149541c.get().getActiveNetwork() != null;
            try {
                this.f149541c.get().registerDefaultNetworkCallback(this.f149542d);
                return true;
            } catch (RuntimeException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    FS.log_w("ConnectivityMonitor", "Failed to register callback", e10);
                }
                return false;
            }
        }

        @Override // l7.r.c
        public void unregister() {
            this.f149541c.get().unregisterNetworkCallback(this.f149542d);
        }

        d(f.b<ConnectivityManager> bVar, InterfaceC15471b.a aVar) {
            this.f149541c = bVar;
            this.f149540b = aVar;
        }
    }

    synchronized void d(InterfaceC15471b.a aVar) {
        this.f149534b.add(aVar);
        b();
    }

    synchronized void e(InterfaceC15471b.a aVar) {
        this.f149534b.remove(aVar);
        c();
    }

    static r a(Context context) {
        if (f149532d == null) {
            synchronized (r.class) {
                try {
                    if (f149532d == null) {
                        f149532d = new r(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f149532d;
    }

    private void b() {
        if (this.f149535c || this.f149534b.isEmpty()) {
            return;
        }
        this.f149535c = this.f149533a.register();
    }

    private void c() {
        if (this.f149535c && this.f149534b.isEmpty()) {
            this.f149533a.unregister();
            this.f149535c = false;
        }
    }

    private r(Context context) {
        this.f149533a = new d(r7.f.a(new a(context)), new b());
    }
}
