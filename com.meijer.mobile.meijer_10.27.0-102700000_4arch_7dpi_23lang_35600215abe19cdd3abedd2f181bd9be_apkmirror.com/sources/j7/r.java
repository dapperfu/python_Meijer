package j7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import com.fullstory.FS;
import j7.InterfaceC14872b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p7.f;

/* loaded from: classes4.dex */
final class r {

    /* renamed from: d, reason: collision with root package name */
    private static volatile r f139516d;

    /* renamed from: a, reason: collision with root package name */
    private final c f139517a;

    /* renamed from: b, reason: collision with root package name */
    final Set<InterfaceC14872b.a> f139518b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private boolean f139519c;

    class a implements f.b<ConnectivityManager> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f139520a;

        a(Context context) {
            this.f139520a = context;
        }

        @Override // p7.f.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f139520a.getSystemService("connectivity");
        }
    }

    class b implements InterfaceC14872b.a {
        b() {
        }

        @Override // j7.InterfaceC14872b.a
        public void a(boolean z10) {
            ArrayList arrayList;
            p7.l.a();
            synchronized (r.this) {
                arrayList = new ArrayList(r.this.f139518b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC14872b.a) it.next()).a(z10);
            }
        }
    }

    private interface c {
        boolean register();

        void unregister();
    }

    private static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        boolean f139523a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC14872b.a f139524b;

        /* renamed from: c, reason: collision with root package name */
        private final f.b<ConnectivityManager> f139525c;

        /* renamed from: d, reason: collision with root package name */
        private final ConnectivityManager.NetworkCallback f139526d = new a();

        class a extends ConnectivityManager.NetworkCallback {

            /* renamed from: j7.r$d$a$a, reason: collision with other inner class name */
            class RunnableC2207a implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ boolean f139528a;

                RunnableC2207a(boolean z10) {
                    this.f139528a = z10;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.a(this.f139528a);
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
                p7.l.u(new RunnableC2207a(z10));
            }

            void a(boolean z10) {
                p7.l.a();
                d dVar = d.this;
                boolean z11 = dVar.f139523a;
                dVar.f139523a = z10;
                if (z11 != z10) {
                    dVar.f139524b.a(z10);
                }
            }
        }

        @Override // j7.r.c
        @SuppressLint({"MissingPermission"})
        public boolean register() {
            this.f139523a = this.f139525c.get().getActiveNetwork() != null;
            try {
                this.f139525c.get().registerDefaultNetworkCallback(this.f139526d);
                return true;
            } catch (RuntimeException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    FS.log_w("ConnectivityMonitor", "Failed to register callback", e10);
                }
                return false;
            }
        }

        @Override // j7.r.c
        public void unregister() {
            this.f139525c.get().unregisterNetworkCallback(this.f139526d);
        }

        d(f.b<ConnectivityManager> bVar, InterfaceC14872b.a aVar) {
            this.f139525c = bVar;
            this.f139524b = aVar;
        }
    }

    synchronized void d(InterfaceC14872b.a aVar) {
        this.f139518b.add(aVar);
        b();
    }

    synchronized void e(InterfaceC14872b.a aVar) {
        this.f139518b.remove(aVar);
        c();
    }

    static r a(Context context) {
        if (f139516d == null) {
            synchronized (r.class) {
                try {
                    if (f139516d == null) {
                        f139516d = new r(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f139516d;
    }

    private void b() {
        if (this.f139519c || this.f139518b.isEmpty()) {
            return;
        }
        this.f139519c = this.f139517a.register();
    }

    private void c() {
        if (this.f139519c && this.f139518b.isEmpty()) {
            this.f139517a.unregister();
            this.f139519c = false;
        }
    }

    private r(Context context) {
        this.f139517a = new d(p7.f.a(new a(context)), new b());
    }
}
