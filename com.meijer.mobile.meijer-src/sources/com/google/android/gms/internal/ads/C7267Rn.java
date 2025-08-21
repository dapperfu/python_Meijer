package com.google.android.gms.internal.ads;

import Oc.C4447y;
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
import id.C14724g;
import io.constructor.BuildConfig;
import io.constructor.data.local.PreferencesHelper;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import sd.C17067f;

/* renamed from: com.google.android.gms.internal.ads.Rn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7267Rn implements InterfaceC7335Tn {

    /* renamed from: k, reason: collision with root package name */
    private static final Object f70773k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static InterfaceC7335Tn f70774l;

    /* renamed from: m, reason: collision with root package name */
    static InterfaceC7335Tn f70775m;

    /* renamed from: n, reason: collision with root package name */
    static InterfaceC7335Tn f70776n;

    /* renamed from: o, reason: collision with root package name */
    static Boolean f70777o;

    /* renamed from: a, reason: collision with root package name */
    private final Object f70778a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f70779b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakHashMap f70780c;

    /* renamed from: d, reason: collision with root package name */
    private final ExecutorService f70781d;

    /* renamed from: e, reason: collision with root package name */
    private final Sc.a f70782e;

    /* renamed from: f, reason: collision with root package name */
    private final PackageInfo f70783f;

    /* renamed from: g, reason: collision with root package name */
    private final String f70784g;

    /* renamed from: h, reason: collision with root package name */
    private final String f70785h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f70786i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f70787j;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected C7267Rn(android.content.Context r3, Sc.a r4) {
        /*
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.f70778a = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r2.f70780c = r0
            com.google.android.gms.internal.ads.C6948Id0.a()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            r2.f70781d = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.f70786i = r0
            android.content.Context r0 = r3.getApplicationContext()
            if (r0 == 0) goto L2f
            android.content.Context r3 = r3.getApplicationContext()
        L2f:
            r2.f70779b = r3
            r2.f70782e = r4
            com.google.android.gms.internal.ads.bf r4 = com.google.android.gms.internal.ads.C8784lf.f76818G7
            com.google.android.gms.internal.ads.jf r0 = Oc.A.c()
            java.lang.Object r4 = r0.a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0 = 0
            if (r4 == 0) goto L50
            android.os.Handler r4 = Sc.g.f34490b
            if (r3 == 0) goto L50
            android.content.pm.ApplicationInfo r4 = r3.getApplicationInfo()
            if (r4 != 0) goto L52
        L50:
            r3 = r0
            goto L61
        L52:
            sd.e r4 = sd.C17067f.a(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            java.lang.String r3 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            r1 = 0
            android.content.pm.PackageInfo r3 = r4.f(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
        L61:
            r2.f70783f = r3
            com.google.android.gms.internal.ads.bf r3 = com.google.android.gms.internal.ads.C8784lf.f76790E7
            com.google.android.gms.internal.ads.jf r4 = Oc.A.c()
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
            r2.f70784g = r4
            com.google.android.gms.internal.ads.jf r4 = Oc.A.c()
            java.lang.Object r3 = r4.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Lb0
            android.content.Context r3 = r2.f70779b
            android.os.Handler r4 = Sc.g.f34490b
            if (r3 != 0) goto L9a
            goto Lb1
        L9a:
            sd.e r3 = sd.C17067f.a(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
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
            r2.f70785h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7267Rn.<init>(android.content.Context, Sc.a):void");
    }

    private static boolean l(Context context) {
        if (context == null) {
            return false;
        }
        if (!((Boolean) Oc.A.c().a(C8784lf.f76809Fc)).booleanValue()) {
            if (((Boolean) C9855vg.f79947e.e()).booleanValue()) {
                if (!((Boolean) Oc.A.c().a(C8784lf.f77447z7)).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        synchronized (f70773k) {
            try {
                if (f70777o == null) {
                    f70777o = Boolean.valueOf(C4447y.e().nextInt(100) < ((Integer) Oc.A.c().a(C8784lf.f76767Cc)).intValue());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (f70777o.booleanValue()) {
            if (!((Boolean) Oc.A.c().a(C8784lf.f77447z7)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static InterfaceC7335Tn c(Context context) {
        synchronized (f70773k) {
            try {
                if (f70774l == null) {
                    if (l(context)) {
                        f70774l = new C7267Rn(context, Sc.a.B());
                    } else {
                        f70774l = new C7301Sn();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f70774l;
    }

    public static InterfaceC7335Tn d(Context context, Sc.a aVar) {
        synchronized (f70773k) {
            try {
                if (f70776n == null) {
                    boolean z10 = false;
                    if (((Boolean) C8039eg.f74756c.e()).booleanValue()) {
                        if (!((Boolean) Oc.A.c().a(C8784lf.f77447z7)).booleanValue() || ((Boolean) C8039eg.f74754a.e()).booleanValue()) {
                            z10 = true;
                        }
                    }
                    if (l(context)) {
                        C7267Rn c7267Rn = new C7267Rn(context, aVar);
                        c7267Rn.k();
                        c7267Rn.j();
                        f70776n = c7267Rn;
                    } else if (!z10 || context == null) {
                        f70776n = new C7301Sn();
                    } else {
                        C7267Rn c7267Rn2 = new C7267Rn(context, aVar, true);
                        c7267Rn2.k();
                        c7267Rn2.j();
                        f70776n = c7267Rn2;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f70776n;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x002b, B:13:0x0039, B:14:0x0040), top: B:19:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.InterfaceC7335Tn e(android.content.Context r3) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.C7267Rn.f70773k
            monitor-enter(r0)
            com.google.android.gms.internal.ads.Tn r1 = com.google.android.gms.internal.ads.C7267Rn.f70775m     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L40
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.C8784lf.f76734A7     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.jf r2 = Oc.A.c()     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L39
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.C8784lf.f77447z7     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.jf r2 = Oc.A.c()     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L39
            com.google.android.gms.internal.ads.Rn r1 = new com.google.android.gms.internal.ads.Rn     // Catch: java.lang.Throwable -> L37
            Sc.a r2 = Sc.a.B()     // Catch: java.lang.Throwable -> L37
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.C7267Rn.f70775m = r1     // Catch: java.lang.Throwable -> L37
            goto L40
        L37:
            r3 = move-exception
            goto L44
        L39:
            com.google.android.gms.internal.ads.Sn r3 = new com.google.android.gms.internal.ads.Sn     // Catch: java.lang.Throwable -> L37
            r3.<init>()     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.C7267Rn.f70775m = r3     // Catch: java.lang.Throwable -> L37
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.Tn r3 = com.google.android.gms.internal.ads.C7267Rn.f70775m
            return r3
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7267Rn.e(android.content.Context):com.google.android.gms.internal.ads.Tn");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x002b, B:13:0x0035, B:14:0x003c), top: B:19:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.InterfaceC7335Tn f(android.content.Context r3, Sc.a r4) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.C7267Rn.f70773k
            monitor-enter(r0)
            com.google.android.gms.internal.ads.Tn r1 = com.google.android.gms.internal.ads.C7267Rn.f70775m     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L3c
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.C8784lf.f76734A7     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.jf r2 = Oc.A.c()     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L33
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L35
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.C8784lf.f77447z7     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.jf r2 = Oc.A.c()     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L33
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L35
            com.google.android.gms.internal.ads.Rn r1 = new com.google.android.gms.internal.ads.Rn     // Catch: java.lang.Throwable -> L33
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.C7267Rn.f70775m = r1     // Catch: java.lang.Throwable -> L33
            goto L3c
        L33:
            r3 = move-exception
            goto L40
        L35:
            com.google.android.gms.internal.ads.Sn r3 = new com.google.android.gms.internal.ads.Sn     // Catch: java.lang.Throwable -> L33
            r3.<init>()     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.C7267Rn.f70775m = r3     // Catch: java.lang.Throwable -> L33
        L3c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.Tn r3 = com.google.android.gms.internal.ads.C7267Rn.f70775m
            return r3
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7267Rn.f(android.content.Context, Sc.a):com.google.android.gms.internal.ads.Tn");
    }

    public static String g(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7335Tn
    public final void a(Throwable th2, String str, float f10) {
        Throwable th3;
        String packageName;
        PackageInfo packageInfoF;
        ActivityManager.MemoryInfo memoryInfoF;
        if (this.f70787j) {
            return;
        }
        Handler handler = Sc.g.f34490b;
        boolean zG = false;
        if (((Boolean) C9855vg.f79948f.e()).booleanValue()) {
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
                boolean z10 = ((Boolean) Oc.A.c().a(C8784lf.f77344s2)).booleanValue() && stackTrace != null && stackTrace.length == 0 && Sc.g.q(th4.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (Sc.g.q(stackTraceElement.getClassName())) {
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
            String strH = ((Boolean) Oc.A.c().a(C8784lf.f76861J8)).booleanValue() ? h(th2) : "";
            double d10 = f10;
            double dRandom = Math.random();
            int i10 = f10 > 0.0f ? (int) (1.0f / f10) : 1;
            if (dRandom < d10) {
                ArrayList<String> arrayList2 = new ArrayList();
                try {
                    zG = C17067f.a(this.f70779b).g();
                } catch (Throwable th5) {
                    Sc.p.e("Error fetching instant app info", th5);
                }
                try {
                    packageName = this.f70779b.getPackageName();
                } catch (Throwable unused) {
                    Sc.p.g("Cannot obtain package name, proceeding.");
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
                Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("device", str3).appendQueryParameter("js", this.f70782e.f34479a).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strG).appendQueryParameter("eids", TextUtils.join(",", Oc.A.a().a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "697668803").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i10)).appendQueryParameter("pb_tm", String.valueOf(C9855vg.f79945c.e())).appendQueryParameter("gmscv", String.valueOf(C14724g.f().a(this.f70779b))).appendQueryParameter("lite", true != this.f70782e.f34483e ? "0" : "1");
                if (!TextUtils.isEmpty(strH)) {
                    builderAppendQueryParameter3.appendQueryParameter("hash", strH);
                }
                if (((Boolean) Oc.A.c().a(C8784lf.f76804F7)).booleanValue() && (memoryInfoF = Sc.g.f(this.f70779b)) != null) {
                    builderAppendQueryParameter3.appendQueryParameter("available_memory", Long.toString(memoryInfoF.availMem));
                    builderAppendQueryParameter3.appendQueryParameter("total_memory", Long.toString(memoryInfoF.totalMem));
                    builderAppendQueryParameter3.appendQueryParameter("is_low_memory", true != memoryInfoF.lowMemory ? "0" : "1");
                }
                if (((Boolean) Oc.A.c().a(C8784lf.f76790E7)).booleanValue()) {
                    if (!TextUtils.isEmpty(this.f70784g)) {
                        builderAppendQueryParameter3.appendQueryParameter("countrycode", this.f70784g);
                    }
                    if (!TextUtils.isEmpty(this.f70785h)) {
                        builderAppendQueryParameter3.appendQueryParameter("psv", this.f70785h);
                    }
                    Context context = this.f70779b;
                    if (i11 >= 26) {
                        packageInfoF = WebView.getCurrentWebViewPackage();
                    } else if (context == null) {
                        packageInfoF = null;
                    } else {
                        try {
                            packageInfoF = C17067f.a(context).f("com.android.webview", 128);
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                    if (packageInfoF != null) {
                        builderAppendQueryParameter3.appendQueryParameter("wvvc", Integer.toString(packageInfoF.versionCode));
                        builderAppendQueryParameter3.appendQueryParameter("wvvn", packageInfoF.versionName);
                        builderAppendQueryParameter3.appendQueryParameter("wvpn", packageInfoF.packageName);
                    }
                }
                PackageInfo packageInfo = this.f70783f;
                if (packageInfo != null) {
                    builderAppendQueryParameter3.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                    builderAppendQueryParameter3.appendQueryParameter("appvn", this.f70783f.versionName);
                }
                arrayList2.add(builderAppendQueryParameter3.toString());
                for (final String str4 : arrayList2) {
                    final Sc.u uVar = new Sc.u(null);
                    this.f70781d.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.On
                        @Override // java.lang.Runnable
                        public final void run() {
                            uVar.zza(str4);
                        }
                    });
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7335Tn
    public final void b(Throwable th2, String str) {
        if (this.f70787j) {
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
                    zQ |= Sc.g.q(stackTraceElement.getClassName());
                    zEquals |= C7267Rn.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!zQ || zEquals) {
                return;
            }
            if (!this.f70787j) {
                b(th2, "");
            }
            if (this.f70786i.getAndSet(true) || !((Boolean) C8039eg.f74756c.e()).booleanValue()) {
                return;
            }
            C7356Ue.c(this.f70779b);
        }
    }

    public static String h(Throwable th2) {
        return C7392Vf0.c(Sc.g.i(g(th2)));
    }

    private final void j() {
        com.fullstory.FS.setDefaultUncaughtExceptionHandler(new C7199Pn(this, com.fullstory.FS.getDefaultUncaughtExceptionHandler()));
    }

    private final void k() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.f70778a) {
            this.f70780c.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new C7233Qn(this, thread.getUncaughtExceptionHandler()));
    }

    protected C7267Rn(Context context, Sc.a aVar, boolean z10) {
        this(context, aVar);
        this.f70787j = true;
    }
}
