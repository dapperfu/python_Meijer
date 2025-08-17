package d3;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import d3.w;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: f, reason: collision with root package name */
    private static w f127161f;

    /* renamed from: a, reason: collision with root package name */
    private final Executor f127162a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<d> f127163b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f127164c;

    /* renamed from: d, reason: collision with root package name */
    private int f127165d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f127166e;

    private static final class b {

        private static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* renamed from: a, reason: collision with root package name */
            private final w f127167a;

            public a(w wVar) {
                this.f127167a = wVar;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                boolean z10;
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                int i10 = 5;
                if (overrideNetworkType != 3 && overrideNetworkType != 4 && overrideNetworkType != 5) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                w wVar = this.f127167a;
                if (z10) {
                    i10 = 10;
                }
                wVar.m(i10);
            }
        }

        public static void a(Context context, w wVar) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) C13466a.e((TelephonyManager) context.getSystemService("phone"));
                a aVar = new a(wVar);
                telephonyManager.registerTelephonyCallback(wVar.f127162a, aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                wVar.m(5);
            }
        }
    }

    public interface c {
        void a(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class d {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<c> f127168a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f127169b;

        public d(c cVar, Executor executor) {
            this.f127168a = new WeakReference<>(cVar);
            this.f127169b = executor;
        }

        public static /* synthetic */ void a(d dVar) {
            c cVar = dVar.f127168a.get();
            if (cVar != null) {
                cVar.a(w.this.g());
            }
        }

        public void b() {
            this.f127169b.execute(new Runnable() { // from class: d3.A
                @Override // java.lang.Runnable
                public final void run() {
                    w.d.a(this.f127055a);
                }
            });
        }

        public boolean c() {
            return this.f127168a.get() == null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class e extends BroadcastReceiver {
        private e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, Intent intent) {
            w.this.f127162a.execute(new Runnable() { // from class: d3.B
                @Override // java.lang.Runnable
                public final void run() {
                    w.this.i(context);
                }
            });
        }
    }

    public static synchronized w e(Context context) {
        try {
            if (f127161f == null) {
                f127161f = new w(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f127161f;
    }

    private static int h(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i10 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i10 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return f(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"UnprotectedReceiver"})
    public void j(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new e(), intentFilter);
    }

    private void l() {
        Iterator<d> it = this.f127163b.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (next.c()) {
                this.f127163b.remove(next);
            }
        }
    }

    public int g() {
        int i10;
        synchronized (this.f127164c) {
            i10 = this.f127165d;
        }
        return i10;
    }

    private w(final Context context) {
        Executor executorA = C13467b.a();
        this.f127162a = executorA;
        this.f127163b = new CopyOnWriteArrayList<>();
        this.f127164c = new Object();
        this.f127165d = 0;
        executorA.execute(new Runnable() { // from class: d3.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f127159a.j(context);
            }
        });
    }

    private static int f(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                if (P.f127086a >= 29) {
                    return 9;
                }
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(Context context) {
        int iH = h(context);
        if (P.f127086a >= 31 && iH == 5) {
            b.a(context, this);
        } else {
            m(iH);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(int i10) {
        l();
        synchronized (this.f127164c) {
            try {
                if (this.f127166e && this.f127165d == i10) {
                    return;
                }
                this.f127166e = true;
                this.f127165d = i10;
                Iterator<d> it = this.f127163b.iterator();
                while (it.hasNext()) {
                    it.next().b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k(c cVar, Executor executor) {
        boolean z10;
        l();
        d dVar = new d(cVar, executor);
        synchronized (this.f127164c) {
            this.f127163b.add(dVar);
            z10 = this.f127166e;
        }
        if (z10) {
            dVar.b();
        }
    }
}
