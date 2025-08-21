package Kc;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import com.fullstory.FS;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.VisibleForTesting;
import id.C14724g;
import id.ServiceConnectionC14718a;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import qd.C16631b;
import wd.AbstractBinderC17862e;
import wd.InterfaceC17863f;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    ServiceConnectionC14718a f16545a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC17863f f16546b;

    /* renamed from: c, reason: collision with root package name */
    boolean f16547c;

    /* renamed from: d, reason: collision with root package name */
    final Object f16548d;

    /* renamed from: e, reason: collision with root package name */
    c f16549e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f16550f;

    /* renamed from: g, reason: collision with root package name */
    final long f16551g;

    /* renamed from: Kc.a$a, reason: collision with other inner class name */
    public static final class C0277a {

        /* renamed from: a, reason: collision with root package name */
        private final String f16552a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f16553b;

        public String a() {
            return this.f16552a;
        }

        public boolean b() {
            return this.f16553b;
        }

        public String toString() {
            String str = this.f16552a;
            boolean z10 = this.f16553b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(z10);
            return sb2.toString();
        }

        @Deprecated
        public C0277a(String str, boolean z10) {
            this.f16552a = str;
            this.f16553b = z10;
        }
    }

    public a(Context context) {
        this(context, 30000L, false, false);
    }

    public static void d(boolean z10) {
    }

    public C0277a b() throws IOException {
        return i(-1);
    }

    public void e() throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        g(true);
    }

    @VisibleForTesting
    public a(Context context, long j10, boolean z10, boolean z11) {
        Context applicationContext;
        this.f16548d = new Object();
        r.l(context);
        if (z10 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f16550f = context;
        this.f16547c = false;
        this.f16551g = j10;
    }

    public static C0277a a(Context context) throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        a aVar = new a(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aVar.g(false);
            C0277a c0277aI = aVar.i(-1);
            aVar.h(c0277aI, true, 0.0f, SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
            return c0277aI;
        } finally {
        }
    }

    public static boolean c(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException, IOException {
        boolean zZzd;
        a aVar = new a(context, -1L, false, false);
        try {
            aVar.g(false);
            r.k("Calling this from your main thread can lead to deadlock");
            synchronized (aVar) {
                try {
                    if (!aVar.f16547c) {
                        synchronized (aVar.f16548d) {
                            c cVar = aVar.f16549e;
                            if (cVar == null || !cVar.f16558d) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            aVar.g(false);
                            if (!aVar.f16547c) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e10) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                        }
                    }
                    r.l(aVar.f16545a);
                    r.l(aVar.f16546b);
                    try {
                        zZzd = aVar.f16546b.zzd();
                    } catch (RemoteException e11) {
                        FS.log_i("AdvertisingIdClient", "GMS remote exception ", e11);
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            aVar.j();
            aVar.f();
            return zZzd;
        } catch (Throwable th3) {
            aVar.f();
            throw th3;
        }
    }

    private final C0277a i(int i10) throws IOException {
        C0277a c0277a;
        r.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f16547c) {
                    synchronized (this.f16548d) {
                        c cVar = this.f16549e;
                        if (cVar == null || !cVar.f16558d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        g(false);
                        if (!this.f16547c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e10) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                    }
                }
                r.l(this.f16545a);
                r.l(this.f16546b);
                try {
                    c0277a = new C0277a(this.f16546b.zzc(), this.f16546b.N1(true));
                } catch (RemoteException e11) {
                    FS.log_i("AdvertisingIdClient", "GMS remote exception ", e11);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        j();
        return c0277a;
    }

    private final void j() {
        synchronized (this.f16548d) {
            c cVar = this.f16549e;
            if (cVar != null) {
                cVar.f16557c.countDown();
                try {
                    this.f16549e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.f16551g;
            if (j10 > 0) {
                this.f16549e = new c(this, j10);
            }
        }
    }

    public final void f() {
        r.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f16550f == null || this.f16545a == null) {
                    return;
                }
                try {
                    if (this.f16547c) {
                        C16631b.b().c(this.f16550f, this.f16545a);
                    }
                } catch (Throwable th2) {
                    FS.log_i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th2);
                }
                this.f16547c = false;
                this.f16546b = null;
                this.f16545a = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @VisibleForTesting
    protected final void g(boolean z10) throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        r.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f16547c) {
                    f();
                }
                Context context = this.f16550f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iH = C14724g.f().h(context, 12451000);
                    if (iH != 0 && iH != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC14718a serviceConnectionC14718a = new ServiceConnectionC14718a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!C16631b.b().a(context, intent, serviceConnectionC14718a, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f16545a = serviceConnectionC14718a;
                        try {
                            this.f16546b = AbstractBinderC17862e.K1(serviceConnectionC14718a.a(10000L, TimeUnit.MILLISECONDS));
                            this.f16547c = true;
                            if (z10) {
                                j();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th2) {
                            throw new IOException(th2);
                        }
                    } finally {
                        IOException iOException = new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException(9);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    protected final void finalize() throws Throwable {
        f();
        super.finalize();
    }

    @VisibleForTesting
    final boolean h(C0277a c0277a, boolean z10, float f10, long j10, String str, Throwable th2) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            String str2 = "1";
            map.put("app_context", "1");
            if (c0277a != null) {
                if (true != c0277a.b()) {
                    str2 = "0";
                }
                map.put("limit_ad_tracking", str2);
                String strA = c0277a.a();
                if (strA != null) {
                    map.put("ad_id_size", Integer.toString(strA.length()));
                }
            }
            if (th2 != null) {
                map.put("error", th2.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j10));
            new b(this, map).start();
            return true;
        }
        return false;
    }
}
