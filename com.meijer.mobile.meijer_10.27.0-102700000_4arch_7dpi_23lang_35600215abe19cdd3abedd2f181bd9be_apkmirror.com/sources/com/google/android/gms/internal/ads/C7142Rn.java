package com.google.android.gms.internal.ads;

import Mc.C4169y;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import gd.C14248g;
import io.constructor.BuildConfig;
import io.constructor.data.local.PreferencesHelper;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import qd.C16519f;

/* renamed from: com.google.android.gms.internal.ads.Rn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7142Rn implements InterfaceC7210Tn {

    /* renamed from: k, reason: collision with root package name */
    private static final Object f69933k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static InterfaceC7210Tn f69934l;

    /* renamed from: m, reason: collision with root package name */
    static InterfaceC7210Tn f69935m;

    /* renamed from: n, reason: collision with root package name */
    static InterfaceC7210Tn f69936n;

    /* renamed from: o, reason: collision with root package name */
    static Boolean f69937o;

    /* renamed from: a, reason: collision with root package name */
    private final Object f69938a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f69939b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakHashMap f69940c;

    /* renamed from: d, reason: collision with root package name */
    private final ExecutorService f69941d;

    /* renamed from: e, reason: collision with root package name */
    private final Qc.a f69942e;

    /* renamed from: f, reason: collision with root package name */
    private final PackageInfo f69943f;

    /* renamed from: g, reason: collision with root package name */
    private final String f69944g;

    /* renamed from: h, reason: collision with root package name */
    private final String f69945h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f69946i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f69947j;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected C7142Rn(android.content.Context r3, Qc.a r4) {
        /*
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.f69938a = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r2.f69940c = r0
            com.google.android.gms.internal.ads.C6823Id0.a()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            r2.f69941d = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.f69946i = r0
            android.content.Context r0 = r3.getApplicationContext()
            if (r0 == 0) goto L2f
            android.content.Context r3 = r3.getApplicationContext()
        L2f:
            r2.f69939b = r3
            r2.f69942e = r4
            com.google.android.gms.internal.ads.bf r4 = com.google.android.gms.internal.ads.C8659lf.f75978G7
            com.google.android.gms.internal.ads.jf r0 = Mc.A.c()
            java.lang.Object r4 = r0.a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0 = 0
            if (r4 == 0) goto L50
            android.os.Handler r4 = Qc.g.f29940b
            if (r3 == 0) goto L50
            android.content.pm.ApplicationInfo r4 = r3.getApplicationInfo()
            if (r4 != 0) goto L52
        L50:
            r3 = r0
            goto L61
        L52:
            qd.e r4 = qd.C16519f.a(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            java.lang.String r3 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            r1 = 0
            android.content.pm.PackageInfo r3 = r4.f(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
        L61:
            r2.f69943f = r3
            com.google.android.gms.internal.ads.bf r3 = com.google.android.gms.internal.ads.C8659lf.f75950E7
            com.google.android.gms.internal.ads.jf r4 = Mc.A.c()
            java.lang.Object r4 = r4.a(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.String r1 = "unknown"
            if (r4 == 0) goto L80
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.getCountry()
            goto L81
        L80:
            r4 = r1
        L81:
            r2.f69944g = r4
            com.google.android.gms.internal.ads.jf r4 = Mc.A.c()
            java.lang.Object r3 = r4.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Lb0
            android.content.Context r3 = r2.f69939b
            android.os.Handler r4 = Qc.g.f29940b
            if (r3 != 0) goto L9a
            goto Lb1
        L9a:
            qd.e r3 = qd.C16519f.a(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            java.lang.String r4 = "com.android.vending"
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r3 = r3.f(r4, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            if (r3 != 0) goto La9
            goto Lb1
        La9:
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            java.lang.String r0 = java.lang.Integer.toString(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            goto Lb1
        Lb0:
            r0 = r1
        Lb1:
            r2.f69945h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7142Rn.<init>(android.content.Context, Qc.a):void");
    }

    private static boolean l(Context context) {
        if (context == null) {
            return false;
        }
        if (!((Boolean) Mc.A.c().a(C8659lf.f75969Fc)).booleanValue()) {
            if (((Boolean) C9730vg.f79107e.e()).booleanValue()) {
                if (!((Boolean) Mc.A.c().a(C8659lf.f76607z7)).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        synchronized (f69933k) {
            try {
                if (f69937o == null) {
                    f69937o = Boolean.valueOf(C4169y.e().nextInt(100) < ((Integer) Mc.A.c().a(C8659lf.f75927Cc)).intValue());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (f69937o.booleanValue()) {
            if (!((Boolean) Mc.A.c().a(C8659lf.f76607z7)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static InterfaceC7210Tn c(Context context) {
        synchronized (f69933k) {
            try {
                if (f69934l == null) {
                    if (l(context)) {
                        f69934l = new C7142Rn(context, Qc.a.B());
                    } else {
                        f69934l = new C7176Sn();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f69934l;
    }

    public static InterfaceC7210Tn d(Context context, Qc.a aVar) {
        synchronized (f69933k) {
            try {
                if (f69936n == null) {
                    boolean z10 = false;
                    if (((Boolean) C7914eg.f73916c.e()).booleanValue()) {
                        if (!((Boolean) Mc.A.c().a(C8659lf.f76607z7)).booleanValue() || ((Boolean) C7914eg.f73914a.e()).booleanValue()) {
                            z10 = true;
                        }
                    }
                    if (l(context)) {
                        C7142Rn c7142Rn = new C7142Rn(context, aVar);
                        c7142Rn.k();
                        c7142Rn.j();
                        f69936n = c7142Rn;
                    } else if (!z10 || context == null) {
                        f69936n = new C7176Sn();
                    } else {
                        C7142Rn c7142Rn2 = new C7142Rn(context, aVar, true);
                        c7142Rn2.k();
                        c7142Rn2.j();
                        f69936n = c7142Rn2;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f69936n;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x002b, B:13:0x0039, B:14:0x0040), top: B:19:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.InterfaceC7210Tn e(android.content.Context r3) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.C7142Rn.f69933k
            monitor-enter(r0)
            com.google.android.gms.internal.ads.Tn r1 = com.google.android.gms.internal.ads.C7142Rn.f69935m     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L40
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.C8659lf.f75894A7     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.jf r2 = Mc.A.c()     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L39
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.C8659lf.f76607z7     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.jf r2 = Mc.A.c()     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L39
            com.google.android.gms.internal.ads.Rn r1 = new com.google.android.gms.internal.ads.Rn     // Catch: java.lang.Throwable -> L37
            Qc.a r2 = Qc.a.B()     // Catch: java.lang.Throwable -> L37
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.C7142Rn.f69935m = r1     // Catch: java.lang.Throwable -> L37
            goto L40
        L37:
            r3 = move-exception
            goto L44
        L39:
            com.google.android.gms.internal.ads.Sn r3 = new com.google.android.gms.internal.ads.Sn     // Catch: java.lang.Throwable -> L37
            r3.<init>()     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.C7142Rn.f69935m = r3     // Catch: java.lang.Throwable -> L37
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.Tn r3 = com.google.android.gms.internal.ads.C7142Rn.f69935m
            return r3
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7142Rn.e(android.content.Context):com.google.android.gms.internal.ads.Tn");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x002b, B:13:0x0035, B:14:0x003c), top: B:19:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.InterfaceC7210Tn f(android.content.Context r3, Qc.a r4) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.C7142Rn.f69933k
            monitor-enter(r0)
            com.google.android.gms.internal.ads.Tn r1 = com.google.android.gms.internal.ads.C7142Rn.f69935m     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L3c
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.C8659lf.f75894A7     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.jf r2 = Mc.A.c()     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L33
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L35
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.C8659lf.f76607z7     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.jf r2 = Mc.A.c()     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L33
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L35
            com.google.android.gms.internal.ads.Rn r1 = new com.google.android.gms.internal.ads.Rn     // Catch: java.lang.Throwable -> L33
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.C7142Rn.f69935m = r1     // Catch: java.lang.Throwable -> L33
            goto L3c
        L33:
            r3 = move-exception
            goto L40
        L35:
            com.google.android.gms.internal.ads.Sn r3 = new com.google.android.gms.internal.ads.Sn     // Catch: java.lang.Throwable -> L33
            r3.<init>()     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.C7142Rn.f69935m = r3     // Catch: java.lang.Throwable -> L33
        L3c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.Tn r3 = com.google.android.gms.internal.ads.C7142Rn.f69935m
            return r3
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7142Rn.f(android.content.Context, Qc.a):com.google.android.gms.internal.ads.Tn");
    }

    public static String g(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7210Tn
    public final void a(Throwable th2, String str, float f10) {
        Throwable th3;
        String packageName;
        PackageInfo packageInfoF;
        ActivityManager.MemoryInfo memoryInfoF;
        if (this.f69947j) {
            return;
        }
        Handler handler = Qc.g.f29940b;
        boolean zG = false;
        if (((Boolean) C9730vg.f79108f.e()).booleanValue()) {
            th3 = th2;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
                linkedList.push(cause);
            }
            th3 = null;
            while (!linkedList.isEmpty()) {
                Throwable th4 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th4.getStackTrace();
                boolean z10 = ((Boolean) Mc.A.c().a(C8659lf.f76504s2)).booleanValue() && stackTrace != null && stackTrace.length == 0 && Qc.g.q(th4.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (Qc.g.q(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z10 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z10) {
                    th3 = th3 == null ? new Throwable(th4.getMessage()) : new Throwable(th4.getMessage(), th3);
                    th3.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th3 != null) {
            String name = th2.getClass().getName();
            String strG = g(th2);
            String strH = ((Boolean) Mc.A.c().a(C8659lf.f76021J8)).booleanValue() ? h(th2) : "";
            double d10 = f10;
            double dRandom = Math.random();
            int i10 = f10 > 0.0f ? (int) (1.0f / f10) : 1;
            if (dRandom < d10) {
                ArrayList<String> arrayList2 = new ArrayList();
                try {
                    zG = C16519f.a(this.f69939b).g();
                } catch (Throwable th5) {
                    Qc.p.e("Error fetching instant app info", th5);
                }
                try {
                    packageName = this.f69939b.getPackageName();
                } catch (Throwable unused) {
                    Qc.p.g("Cannot obtain package name, proceeding.");
                    packageName = com.google.ads.interactivemedia.v3.impl.data.zzbz.UNKNOWN_CONTENT_TYPE;
                }
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(BuildConfig.SERVICE_SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zG)).appendQueryParameter(PreferencesHelper.PREF_ID, "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE);
                int i11 = Build.VERSION.SDK_INT;
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("api", String.valueOf(i11));
                String str2 = Build.MANUFACTURER;
                String str3 = Build.MODEL;
                if (!str3.startsWith(str2)) {
                    str3 = str2 + " " + str3;
                }
                Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("device", str3).appendQueryParameter("js", this.f69942e.f29929a).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strG).appendQueryParameter("eids", TextUtils.join(",", Mc.A.a().a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "697668803").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i10)).appendQueryParameter("pb_tm", String.valueOf(C9730vg.f79105c.e())).appendQueryParameter("gmscv", String.valueOf(C14248g.f().a(this.f69939b))).appendQueryParameter("lite", true != this.f69942e.f29933e ? "0" : "1");
                if (!TextUtils.isEmpty(strH)) {
                    builderAppendQueryParameter3.appendQueryParameter("hash", strH);
                }
                if (((Boolean) Mc.A.c().a(C8659lf.f75964F7)).booleanValue() && (memoryInfoF = Qc.g.f(this.f69939b)) != null) {
                    builderAppendQueryParameter3.appendQueryParameter("available_memory", Long.toString(memoryInfoF.availMem));
                    builderAppendQueryParameter3.appendQueryParameter("total_memory", Long.toString(memoryInfoF.totalMem));
                    builderAppendQueryParameter3.appendQueryParameter("is_low_memory", true != memoryInfoF.lowMemory ? "0" : "1");
                }
                if (((Boolean) Mc.A.c().a(C8659lf.f75950E7)).booleanValue()) {
                    if (!TextUtils.isEmpty(this.f69944g)) {
                        builderAppendQueryParameter3.appendQueryParameter("countrycode", this.f69944g);
                    }
                    if (!TextUtils.isEmpty(this.f69945h)) {
                        builderAppendQueryParameter3.appendQueryParameter("psv", this.f69945h);
                    }
                    Context context = this.f69939b;
                    if (i11 >= 26) {
                        packageInfoF = WebView.getCurrentWebViewPackage();
                    } else if (context == null) {
                        packageInfoF = null;
                    } else {
                        try {
                            packageInfoF = C16519f.a(context).f("com.android.webview", 128);
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                    if (packageInfoF != null) {
                        builderAppendQueryParameter3.appendQueryParameter("wvvc", Integer.toString(packageInfoF.versionCode));
                        builderAppendQueryParameter3.appendQueryParameter("wvvn", packageInfoF.versionName);
                        builderAppendQueryParameter3.appendQueryParameter("wvpn", packageInfoF.packageName);
                    }
                }
                PackageInfo packageInfo = this.f69943f;
                if (packageInfo != null) {
                    builderAppendQueryParameter3.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                    builderAppendQueryParameter3.appendQueryParameter("appvn", this.f69943f.versionName);
                }
                arrayList2.add(builderAppendQueryParameter3.toString());
                for (final String str4 : arrayList2) {
                    final Qc.u uVar = new Qc.u(null);
                    this.f69941d.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.On
                        @Override // java.lang.Runnable
                        public final void run() {
                            uVar.zza(str4);
                        }
                    });
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7210Tn
    public final void b(Throwable th2, String str) {
        if (this.f69947j) {
            return;
        }
        a(th2, str, 1.0f);
    }

    protected final void i(Thread thread, Throwable th2) {
        if (th2 != null) {
            boolean zQ = false;
            boolean zEquals = false;
            for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zQ |= Qc.g.q(stackTraceElement.getClassName());
                    zEquals |= C7142Rn.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!zQ || zEquals) {
                return;
            }
            if (!this.f69947j) {
                b(th2, "");
            }
            if (this.f69946i.getAndSet(true) || !((Boolean) C7914eg.f73916c.e()).booleanValue()) {
                return;
            }
            C7231Ue.c(this.f69939b);
        }
    }

    public static String h(Throwable th2) {
        return C7267Vf0.c(Qc.g.i(g(th2)));
    }

    private final void j() {
        com.fullstory.FS.setDefaultUncaughtExceptionHandler(new C7074Pn(this, com.fullstory.FS.getDefaultUncaughtExceptionHandler()));
    }

    private final void k() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.f69938a) {
            this.f69940c.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new C7108Qn(this, thread.getUncaughtExceptionHandler()));
    }

    protected C7142Rn(Context context, Qc.a aVar, boolean z10) {
        this(context, aVar);
        this.f69947j = true;
    }
}
