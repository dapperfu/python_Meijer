package u8;

import B8.h;
import V7.AppVersion;
import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.view.Display;
import e8.C13635c;
import g8.C14217B;
import g8.C14219b;
import g8.x;
import java.util.Locale;
import x8.C18024b;

/* renamed from: u8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17233a {

    /* renamed from: x, reason: collision with root package name */
    private static final String f162773x = x.f133195a + "AndroidMetrics";

    /* renamed from: y, reason: collision with root package name */
    private static volatile C17233a f162774y = null;

    /* renamed from: a, reason: collision with root package name */
    private final Context f162775a;

    /* renamed from: b, reason: collision with root package name */
    private final f f162776b;

    /* renamed from: c, reason: collision with root package name */
    private final e f162777c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f162778d;

    /* renamed from: e, reason: collision with root package name */
    public String f162779e;

    /* renamed from: f, reason: collision with root package name */
    public String f162780f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f162781g;

    /* renamed from: h, reason: collision with root package name */
    public String f162782h;

    /* renamed from: l, reason: collision with root package name */
    public String f162786l;

    /* renamed from: m, reason: collision with root package name */
    public String f162787m;

    /* renamed from: n, reason: collision with root package name */
    public String f162788n;

    /* renamed from: p, reason: collision with root package name */
    public Integer f162790p;

    /* renamed from: q, reason: collision with root package name */
    public String f162791q;

    /* renamed from: t, reason: collision with root package name */
    private String f162794t;

    /* renamed from: u, reason: collision with root package name */
    private AppVersion f162795u;

    /* renamed from: w, reason: collision with root package name */
    C14217B f162797w;

    /* renamed from: i, reason: collision with root package name */
    public volatile g f162783i = g.OFFLINE;

    /* renamed from: j, reason: collision with root package name */
    public String f162784j = null;

    /* renamed from: k, reason: collision with root package name */
    public int f162785k = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f162789o = Integer.MIN_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public Location f162792r = null;

    /* renamed from: s, reason: collision with root package name */
    C8.a f162793s = null;

    /* renamed from: v, reason: collision with root package name */
    private long f162796v = 0;

    boolean n(C8.a aVar) {
        return aVar != null && aVar.a() > 0 && aVar.b() > 0 && aVar.c() > 0 && aVar.d() != Float.POSITIVE_INFINITY && aVar.d() > 0.0f;
    }

    /* renamed from: u8.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C2574a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f162798a;

        static {
            int[] iArr = new int[g.values().length];
            f162798a = iArr;
            try {
                iArr[g.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f162798a[g.MOBILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f162798a[g.LAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private ActivityManager b() {
        try {
            return (ActivityManager) this.f162775a.getSystemService("activity");
        } catch (Exception e10) {
            if (!x.f133196b) {
                return null;
            }
            x8.f.z(f162773x, e10.toString());
            return null;
        }
    }

    public static C17233a h() {
        if (f162774y == null) {
            synchronized (C17233a.class) {
                try {
                    if (f162774y == null) {
                        f162774y = new C17233a(C14219b.e().d());
                        f162774y.l();
                    }
                } finally {
                }
            }
        }
        return f162774y;
    }

    private NetworkInfo j() {
        Context context = this.f162775a;
        if (context == null) {
            return null;
        }
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception e10) {
            if (!x.f133196b) {
                return null;
            }
            x8.f.z(f162773x, e10.toString());
            return null;
        }
    }

    private void l() throws Throwable {
        this.f162779e = Build.MANUFACTURER;
        Context context = this.f162775a;
        this.f162781g = context != null && C13635c.f128641a.g(context);
        this.f162786l = Build.VERSION.RELEASE;
        this.f162787m = "Android " + this.f162786l;
        this.f162788n = x8.f.d();
        this.f162791q = Build.MODEL;
        this.f162780f = a(Locale.getDefault());
        z();
        r();
        u();
        C8.a aVarG = g();
        this.f162793s = aVarG;
        q(aVarG);
    }

    private void q(C8.a aVar) {
        V7.b metricsCache;
        I7.c cVarA = I7.c.INSTANCE.a();
        if (cVarA == null || (metricsCache = cVarA.getMetricsCache()) == null) {
            return;
        }
        metricsCache.A(aVar);
    }

    private void s() {
        f fVar = this.f162776b;
        if (fVar != null) {
            this.f162789o = fVar.a();
        }
    }

    private void t() {
        Context context = this.f162775a;
        if (context == null) {
            return;
        }
        this.f162782h = null;
        try {
            String networkOperatorName = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
            if (networkOperatorName != null) {
                this.f162782h = x8.f.s(networkOperatorName, 250);
            }
        } catch (Exception e10) {
            if (x.f133196b) {
                x8.f.z(f162773x, e10.toString());
            }
        }
    }

    private void w() {
        Context context = this.f162775a;
        if (context != null) {
            this.f162785k = context.getResources().getConfiguration().orientation;
        }
    }

    public AppVersion c() {
        return this.f162795u;
    }

    public long d() {
        return this.f162797w.c() - this.f162796v;
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
        return this.f162794t;
    }

    C8.a g() {
        Context context = this.f162775a;
        if (context == null) {
            return null;
        }
        Display display = ((DisplayManager) context.getSystemService("display")).getDisplay(0);
        if (display != null) {
            return h.c(display, this.f162785k);
        }
        if (x.f133196b) {
            x8.f.u(f162773x, "Could not find a default Display");
        }
        return null;
    }

    public C8.a k() {
        return this.f162793s;
    }

    public void o(String str) {
        this.f162794t = str;
    }

    public void p(Location location) {
        this.f162792r = location;
        if (x.f133196b) {
            x8.f.u(f162773x, "GPS/Network getLastKnownLocation mockDeviceLocation:" + this.f162792r);
        }
    }

    public void r() {
        Long lValueOf = x.f133196b ? Long.valueOf(this.f162797w.c()) : 0L;
        t();
        if (x.f133196b) {
            x8.f.u(f162773x, String.format("Basic metrics updated in %s ms", Long.valueOf(this.f162797w.c() - lValueOf.longValue())));
        }
    }

    public void u() {
        Long lValueOf = x.f133196b ? Long.valueOf(this.f162797w.c()) : 0L;
        v();
        w();
        s();
        x();
        e eVar = this.f162777c;
        if (eVar != null) {
            AppVersion appVersionA = eVar.a();
            if (appVersionA.getVersionCode() < 1 || appVersionA.getVersionName() == null) {
                this.f162795u = null;
            } else {
                this.f162795u = appVersionA;
            }
        }
        long jC = this.f162797w.c();
        this.f162796v = jC;
        if (x.f133196b) {
            x8.f.u(f162773x, String.format("Common metrics updated in %s ms", Long.valueOf(jC - lValueOf.longValue())));
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
        throw new UnsupportedOperationException("Method not decompiled: u8.C17233a.z():void");
    }

    public C17233a(Context context) {
        this.f162775a = context;
        if (context == null) {
            this.f162777c = null;
            this.f162776b = null;
        } else {
            this.f162777c = new e(context, new C18024b());
            this.f162776b = f.b(context);
        }
        this.f162797w = C14217B.f132991c;
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
        this.f162783i = e(networkInfoJ);
        int i10 = C2574a.f162798a[this.f162783i.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    this.f162784j = null;
                    return;
                } else {
                    this.f162784j = "Ethernet";
                    return;
                }
            }
            this.f162784j = i(networkInfoJ);
            return;
        }
        this.f162784j = "802.11x";
    }

    private void x() {
        ActivityManager activityManagerB = b();
        if (activityManagerB == null) {
            this.f162790p = null;
            return;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManagerB.getMemoryInfo(memoryInfo);
        this.f162790p = Integer.valueOf((int) (memoryInfo.availMem / 1048576));
    }

    public boolean m() {
        boolean z10;
        NetworkInfo networkInfoJ = j();
        if (networkInfoJ != null && (networkInfoJ.isAvailable() || networkInfoJ.isConnected())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && x.f133196b) {
            x8.f.y(f162773x, "Network connection is not available");
        }
        return z10;
    }

    public void y(C8.a aVar) {
        if (!n(aVar)) {
            if (x.f133196b) {
                x8.f.z(f162773x, "Rejecting invalid screen metrics: " + aVar);
            }
            this.f162793s = null;
        } else {
            this.f162793s = aVar;
        }
        w();
    }
}
