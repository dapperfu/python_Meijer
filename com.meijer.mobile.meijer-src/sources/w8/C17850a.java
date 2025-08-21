package w8;

import D8.h;
import X7.AppVersion;
import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.view.Display;
import g8.C14339c;
import i8.C14693B;
import i8.C14695b;
import i8.x;
import java.util.Locale;
import z8.C18461b;

/* renamed from: w8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17850a {

    /* renamed from: x, reason: collision with root package name */
    private static final String f166982x = x.f137411a + "AndroidMetrics";

    /* renamed from: y, reason: collision with root package name */
    private static volatile C17850a f166983y = null;

    /* renamed from: a, reason: collision with root package name */
    private final Context f166984a;

    /* renamed from: b, reason: collision with root package name */
    private final f f166985b;

    /* renamed from: c, reason: collision with root package name */
    private final e f166986c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f166987d;

    /* renamed from: e, reason: collision with root package name */
    public String f166988e;

    /* renamed from: f, reason: collision with root package name */
    public String f166989f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f166990g;

    /* renamed from: h, reason: collision with root package name */
    public String f166991h;

    /* renamed from: l, reason: collision with root package name */
    public String f166995l;

    /* renamed from: m, reason: collision with root package name */
    public String f166996m;

    /* renamed from: n, reason: collision with root package name */
    public String f166997n;

    /* renamed from: p, reason: collision with root package name */
    public Integer f166999p;

    /* renamed from: q, reason: collision with root package name */
    public String f167000q;

    /* renamed from: t, reason: collision with root package name */
    private String f167003t;

    /* renamed from: u, reason: collision with root package name */
    private AppVersion f167004u;

    /* renamed from: w, reason: collision with root package name */
    C14693B f167006w;

    /* renamed from: i, reason: collision with root package name */
    public volatile g f166992i = g.OFFLINE;

    /* renamed from: j, reason: collision with root package name */
    public String f166993j = null;

    /* renamed from: k, reason: collision with root package name */
    public int f166994k = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f166998o = Integer.MIN_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public Location f167001r = null;

    /* renamed from: s, reason: collision with root package name */
    E8.a f167002s = null;

    /* renamed from: v, reason: collision with root package name */
    private long f167005v = 0;

    boolean n(E8.a aVar) {
        return aVar != null && aVar.a() > 0 && aVar.b() > 0 && aVar.c() > 0 && aVar.d() != Float.POSITIVE_INFINITY && aVar.d() > 0.0f;
    }

    /* renamed from: w8.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C2656a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f167007a;

        static {
            int[] iArr = new int[g.values().length];
            f167007a = iArr;
            try {
                iArr[g.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f167007a[g.MOBILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f167007a[g.LAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private ActivityManager b() {
        try {
            return (ActivityManager) this.f166984a.getSystemService("activity");
        } catch (Exception e10) {
            if (!x.f137412b) {
                return null;
            }
            z8.f.z(f166982x, e10.toString());
            return null;
        }
    }

    public static C17850a h() {
        if (f166983y == null) {
            synchronized (C17850a.class) {
                try {
                    if (f166983y == null) {
                        f166983y = new C17850a(C14695b.e().d());
                        f166983y.l();
                    }
                } finally {
                }
            }
        }
        return f166983y;
    }

    private NetworkInfo j() {
        Context context = this.f166984a;
        if (context == null) {
            return null;
        }
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception e10) {
            if (!x.f137412b) {
                return null;
            }
            z8.f.z(f166982x, e10.toString());
            return null;
        }
    }

    private void l() throws Throwable {
        this.f166988e = Build.MANUFACTURER;
        Context context = this.f166984a;
        this.f166990g = context != null && C14339c.f134109a.g(context);
        this.f166995l = Build.VERSION.RELEASE;
        this.f166996m = "Android " + this.f166995l;
        this.f166997n = z8.f.d();
        this.f167000q = Build.MODEL;
        this.f166989f = a(Locale.getDefault());
        z();
        r();
        u();
        E8.a aVarG = g();
        this.f167002s = aVarG;
        q(aVarG);
    }

    private void q(E8.a aVar) {
        X7.b metricsCache;
        K7.c cVarA = K7.c.INSTANCE.a();
        if (cVarA == null || (metricsCache = cVarA.getMetricsCache()) == null) {
            return;
        }
        metricsCache.A(aVar);
    }

    private void s() {
        f fVar = this.f166985b;
        if (fVar != null) {
            this.f166998o = fVar.a();
        }
    }

    private void t() {
        Context context = this.f166984a;
        if (context == null) {
            return;
        }
        this.f166991h = null;
        try {
            String networkOperatorName = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
            if (networkOperatorName != null) {
                this.f166991h = z8.f.s(networkOperatorName, 250);
            }
        } catch (Exception e10) {
            if (x.f137412b) {
                z8.f.z(f166982x, e10.toString());
            }
        }
    }

    private void w() {
        Context context = this.f166984a;
        if (context != null) {
            this.f166994k = context.getResources().getConfiguration().orientation;
        }
    }

    public AppVersion c() {
        return this.f167004u;
    }

    public long d() {
        return this.f167006w.c() - this.f167005v;
    }

    public g e(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isAvailable() || !networkInfo.isConnected()) {
            return g.OFFLINE;
        }
        switch (networkInfo.getType()) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
                return g.MOBILE;
            case 1:
            case 13:
                return g.WIFI;
            case 6:
            case 7:
            case 8:
            default:
                return g.OTHER;
            case 9:
                return g.LAN;
        }
    }

    public String f() {
        return this.f167003t;
    }

    E8.a g() {
        Context context = this.f166984a;
        if (context == null) {
            return null;
        }
        Display display = ((DisplayManager) context.getSystemService("display")).getDisplay(0);
        if (display != null) {
            return h.c(display, this.f166994k);
        }
        if (x.f137412b) {
            z8.f.u(f166982x, "Could not find a default Display");
        }
        return null;
    }

    public E8.a k() {
        return this.f167002s;
    }

    public void o(String str) {
        this.f167003t = str;
    }

    public void p(Location location) {
        this.f167001r = location;
        if (x.f137412b) {
            z8.f.u(f166982x, "GPS/Network getLastKnownLocation mockDeviceLocation:" + this.f167001r);
        }
    }

    public void r() {
        Long lValueOf = x.f137412b ? Long.valueOf(this.f167006w.c()) : 0L;
        t();
        if (x.f137412b) {
            z8.f.u(f166982x, String.format("Basic metrics updated in %s ms", Long.valueOf(this.f167006w.c() - lValueOf.longValue())));
        }
    }

    public void u() {
        Long lValueOf = x.f137412b ? Long.valueOf(this.f167006w.c()) : 0L;
        v();
        w();
        s();
        x();
        e eVar = this.f166986c;
        if (eVar != null) {
            AppVersion appVersionA = eVar.a();
            if (appVersionA.getVersionCode() < 1 || appVersionA.getVersionName() == null) {
                this.f167004u = null;
            } else {
                this.f167004u = appVersionA;
            }
        }
        long jC = this.f167006w.c();
        this.f167005v = jC;
        if (x.f137412b) {
            z8.f.u(f166982x, String.format("Common metrics updated in %s ms", Long.valueOf(jC - lValueOf.longValue())));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[PHI: r2 r3
      0x0058: PHI (r2v15 'e' java.io.IOException) = (r2v14 'e' java.io.IOException), (r2v22 'e' java.io.IOException) binds: [B:50:0x0096, B:21:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r3v6 int) = (r3v5 int), (r3v10 int) binds: [B:50:0x0096, B:21:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.C17850a.z():void");
    }

    public C17850a(Context context) {
        this.f166984a = context;
        if (context == null) {
            this.f166986c = null;
            this.f166985b = null;
        } else {
            this.f166986c = new e(context, new C18461b());
            this.f166985b = f.b(context);
        }
        this.f167006w = C14693B.f137207c;
    }

    public static String a(Locale locale) {
        String language = locale.getLanguage();
        if (locale.getCountry().length() > 0) {
            return language + "_" + locale.getCountry();
        }
        return language;
    }

    private String i(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return "3G";
            case 13:
            case 18:
            case 19:
                return "4G";
            case 20:
                return "5G";
            default:
                return networkInfo.getSubtypeName();
        }
    }

    private void v() {
        NetworkInfo networkInfoJ = j();
        this.f166992i = e(networkInfoJ);
        int i10 = C2656a.f167007a[this.f166992i.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    this.f166993j = null;
                    return;
                } else {
                    this.f166993j = "Ethernet";
                    return;
                }
            }
            this.f166993j = i(networkInfoJ);
            return;
        }
        this.f166993j = "802.11x";
    }

    private void x() {
        ActivityManager activityManagerB = b();
        if (activityManagerB == null) {
            this.f166999p = null;
            return;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManagerB.getMemoryInfo(memoryInfo);
        this.f166999p = Integer.valueOf((int) (memoryInfo.availMem / 1048576));
    }

    public boolean m() {
        boolean z10;
        NetworkInfo networkInfoJ = j();
        if (networkInfoJ != null && (networkInfoJ.isAvailable() || networkInfoJ.isConnected())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && x.f137412b) {
            z8.f.y(f166982x, "Network connection is not available");
        }
        return z10;
    }

    public void y(E8.a aVar) {
        if (!n(aVar)) {
            if (x.f137412b) {
                z8.f.z(f166982x, "Rejecting invalid screen metrics: " + aVar);
            }
            this.f167002s = null;
        } else {
            this.f167002s = aVar;
        }
        w();
    }
}
