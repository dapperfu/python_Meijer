package Ic;

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
import gd.C14248g;
import gd.ServiceConnectionC14242a;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import od.C16023b;
import ud.AbstractBinderC17245e;
import ud.InterfaceC17246f;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    ServiceConnectionC14242a f13799a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC17246f f13800b;

    /* renamed from: c, reason: collision with root package name */
    boolean f13801c;

    /* renamed from: d, reason: collision with root package name */
    final Object f13802d;

    /* renamed from: e, reason: collision with root package name */
    c f13803e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f13804f;

    /* renamed from: g, reason: collision with root package name */
    final long f13805g;

    /* renamed from: Ic.a$a, reason: collision with other inner class name */
    public static final class C0217a {

        /* renamed from: a, reason: collision with root package name */
        private final String f13806a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f13807b;

        public String a() {
            return this.f13806a;
        }

        public boolean b() {
            return this.f13807b;
        }

        public String toString() {
            String str = this.f13806a;
            boolean z10 = this.f13807b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(z10);
            return sb2.toString();
        }

        @Deprecated
        public C0217a(String str, boolean z10) {
            this.f13806a = str;
            this.f13807b = z10;
        }
    }

    public a(Context context) {
        this(context, 30000L, false, false);
    }

    public static void d(boolean z10) {
    }

    public C0217a b() throws IOException {
        return i(-1);
    }

    public void e() throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        g(true);
    }

    @VisibleForTesting
    public a(Context context, long j10, boolean z10, boolean z11) {
        Context applicationContext;
        this.f13802d = new Object();
        r.l(context);
        if (z10 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f13804f = context;
        this.f13801c = false;
        this.f13805g = j10;
    }

    public static C0217a a(Context context) throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        a aVar = new a(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aVar.g(false);
            C0217a c0217aI = aVar.i(-1);
            aVar.h(c0217aI, true, 0.0f, SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
            return c0217aI;
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
                    if (!aVar.f13801c) {
                        synchronized (aVar.f13802d) {
                            c cVar = aVar.f13803e;
                            if (cVar == null || !cVar.f13812d) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            aVar.g(false);
                            if (!aVar.f13801c) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e10) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                        }
                    }
                    r.l(aVar.f13799a);
                    r.l(aVar.f13800b);
                    try {
                        zZzd = aVar.f13800b.zzd();
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

    private final C0217a i(int i10) throws IOException {
        C0217a c0217a;
        r.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f13801c) {
                    synchronized (this.f13802d) {
                        c cVar = this.f13803e;
                        if (cVar == null || !cVar.f13812d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        g(false);
                        if (!this.f13801c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e10) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                    }
                }
                r.l(this.f13799a);
                r.l(this.f13800b);
                try {
                    c0217a = new C0217a(this.f13800b.zzc(), this.f13800b.E1(true));
                } catch (RemoteException e11) {
                    FS.log_i("AdvertisingIdClient", "GMS remote exception ", e11);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        j();
        return c0217a;
    }

    private final void j() {
        synchronized (this.f13802d) {
            c cVar = this.f13803e;
            if (cVar != null) {
                cVar.f13811c.countDown();
                try {
                    this.f13803e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.f13805g;
            if (j10 > 0) {
                this.f13803e = new c(this, j10);
            }
        }
    }

    public final void f() {
        r.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f13804f == null || this.f13799a == null) {
                    return;
                }
                try {
                    if (this.f13801c) {
                        C16023b.b().c(this.f13804f, this.f13799a);
                    }
                } catch (Throwable th2) {
                    FS.log_i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th2);
                }
                this.f13801c = false;
                this.f13800b = null;
                this.f13799a = null;
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
                if (this.f13801c) {
                    f();
                }
                Context context = this.f13804f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iH = C14248g.f().h(context, 12451000);
                    if (iH != 0 && iH != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC14242a serviceConnectionC14242a = new ServiceConnectionC14242a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!C16023b.b().a(context, intent, serviceConnectionC14242a, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f13799a = serviceConnectionC14242a;
                        try {
                            this.f13800b = AbstractBinderC17245e.A1(serviceConnectionC14242a.a(10000L, TimeUnit.MILLISECONDS));
                            this.f13801c = true;
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
    final boolean h(C0217a c0217a, boolean z10, float f10, long j10, String str, Throwable th2) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            String str2 = "1";
            map.put("app_context", "1");
            if (c0217a != null) {
                if (true != c0217a.b()) {
                    str2 = "0";
                }
                map.put("limit_ad_tracking", str2);
                String strA = c0217a.a();
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
