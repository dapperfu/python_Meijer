package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;

/* renamed from: com.google.android.gms.internal.ads.zo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10174zo {

    /* renamed from: A, reason: collision with root package name */
    private int f80474A;

    /* renamed from: B, reason: collision with root package name */
    private final String f80475B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f80476C;

    /* renamed from: a, reason: collision with root package name */
    private int f80477a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f80478b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f80479c;

    /* renamed from: d, reason: collision with root package name */
    private int f80480d;

    /* renamed from: e, reason: collision with root package name */
    private int f80481e;

    /* renamed from: f, reason: collision with root package name */
    private int f80482f;

    /* renamed from: g, reason: collision with root package name */
    private String f80483g;

    /* renamed from: h, reason: collision with root package name */
    private int f80484h;

    /* renamed from: i, reason: collision with root package name */
    private int f80485i;

    /* renamed from: j, reason: collision with root package name */
    private int f80486j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f80487k;

    /* renamed from: l, reason: collision with root package name */
    private int f80488l;

    /* renamed from: m, reason: collision with root package name */
    private double f80489m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f80490n;

    /* renamed from: o, reason: collision with root package name */
    private String f80491o;

    /* renamed from: p, reason: collision with root package name */
    private String f80492p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f80493q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f80494r;

    /* renamed from: s, reason: collision with root package name */
    private final String f80495s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f80496t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f80497u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f80498v;

    /* renamed from: w, reason: collision with root package name */
    private final String f80499w;

    /* renamed from: x, reason: collision with root package name */
    private final String f80500x;

    /* renamed from: y, reason: collision with root package name */
    private float f80501y;

    /* renamed from: z, reason: collision with root package name */
    private int f80502z;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C10174zo(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            com.google.android.gms.internal.ads.C8659lf.a(r7)
            r6.c(r7)
            r6.e(r7)
            r6.d(r7)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r2 = b(r0, r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L23
            r2 = r3
            goto L24
        L23:
            r2 = r4
        L24:
            r6.f80493q = r2
            java.lang.String r2 = "http://www.google.com"
            android.content.pm.ResolveInfo r2 = b(r0, r2)
            if (r2 == 0) goto L2f
            goto L30
        L2f:
            r3 = r4
        L30:
            r6.f80494r = r3
            java.lang.String r2 = r1.getCountry()
            r6.f80495s = r2
            Lc.v.t()
            Mc.C4169y.b()
            boolean r2 = Qc.g.t()
            r6.f80496t = r2
            boolean r2 = com.google.android.gms.common.util.j.c(r7)
            r6.f80497u = r2
            boolean r2 = com.google.android.gms.common.util.j.d(r7)
            r6.f80498v = r2
            java.lang.String r1 = r1.getLanguage()
            r6.f80499w = r1
            java.lang.String r1 = "market://details?id=com.google.android.gms.ads"
            android.content.pm.ResolveInfo r0 = b(r0, r1)
            java.lang.String r1 = "."
            r2 = 0
            if (r0 != 0) goto L63
        L61:
            r0 = r2
            goto L8a
        L63:
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            if (r0 != 0) goto L68
            goto L61
        L68:
            qd.e r3 = qd.C16519f.a(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r5 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            android.content.pm.PackageInfo r3 = r3.f(r5, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            if (r3 == 0) goto L61
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r0 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.append(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.append(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r0 = r4.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
        L8a:
            r6.f80500x = r0
            qd.e r0 = qd.C16519f.a(r7)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r3 = "com.android.vending"
            r4 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r0 = r0.f(r3, r4)     // Catch: java.lang.Exception -> Lb0
            if (r0 == 0) goto Lb0
            int r3 = r0.versionCode     // Catch: java.lang.Exception -> Lb0
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Exception -> Lb0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb0
            r4.<init>()     // Catch: java.lang.Exception -> Lb0
            r4.append(r3)     // Catch: java.lang.Exception -> Lb0
            r4.append(r1)     // Catch: java.lang.Exception -> Lb0
            r4.append(r0)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> Lb0
        Lb0:
            r6.f80475B = r2
            android.content.res.Resources r7 = r7.getResources()
            if (r7 != 0) goto Lb9
            goto Lcb
        Lb9:
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            if (r7 == 0) goto Lcb
            float r0 = r7.density
            r6.f80501y = r0
            int r0 = r7.widthPixels
            r6.f80502z = r0
            int r7 = r7.heightPixels
            r6.f80474A = r7
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C10174zo.<init>(android.content.Context):void");
    }

    public final C6566Ao a() {
        return new C6566Ao(this.f80477a, this.f80493q, this.f80494r, this.f80483g, this.f80495s, this.f80496t, this.f80497u, this.f80498v, this.f80478b, this.f80479c, this.f80499w, this.f80500x, this.f80475B, this.f80480d, this.f80484h, this.f80485i, this.f80486j, this.f80481e, this.f80482f, this.f80501y, this.f80502z, this.f80474A, this.f80489m, this.f80490n, this.f80487k, this.f80488l, this.f80491o, this.f80476C, this.f80492p);
    }

    private static ResolveInfo b(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th2) {
            Lc.v.s().x(th2, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    private final void c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f80477a = audioManager.getMode();
                this.f80478b = audioManager.isMusicActive();
                this.f80479c = audioManager.isSpeakerphoneOn();
                this.f80480d = audioManager.getStreamVolume(3);
                this.f80481e = audioManager.getRingerMode();
                this.f80482f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th2) {
                Lc.v.s().x(th2, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f80477a = -2;
        this.f80478b = false;
        this.f80479c = false;
        this.f80480d = 0;
        this.f80481e = 2;
        this.f80482f = 0;
    }

    @SuppressLint({"UnprotectedReceiver"})
    private final void d(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intentRegisterReceiver = (!((Boolean) Mc.A.c().a(C8659lf.f76149Sa)).booleanValue() || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (intentRegisterReceiver == null) {
            this.f80489m = -1.0d;
            this.f80490n = false;
        } else {
            int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
            this.f80489m = intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1);
            this.f80490n = intExtra == 2 || intExtra == 5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void e(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r6.getSystemService(r1)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            java.lang.String r2 = r0.getNetworkOperator()
            r5.f80483g = r2
            boolean r2 = com.google.android.gms.common.util.n.j()
            r3 = 0
            if (r2 == 0) goto L31
            com.google.android.gms.internal.ads.bf r2 = com.google.android.gms.internal.ads.C8659lf.f76608z8
            com.google.android.gms.internal.ads.jf r4 = Mc.A.c()
            java.lang.Object r2 = r4.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L31
            r2 = r3
            goto L35
        L31:
            int r2 = r0.getNetworkType()
        L35:
            r5.f80485i = r2
            int r0 = r0.getPhoneType()
            r5.f80486j = r0
            r0 = -2
            r5.f80484h = r0
            r5.f80487k = r3
            r0 = -1
            r5.f80488l = r0
            Lc.v.t()
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r6 = Pc.D0.b(r6, r2)
            if (r6 == 0) goto L6f
            android.net.NetworkInfo r6 = r1.getActiveNetworkInfo()
            if (r6 == 0) goto L67
            int r0 = r6.getType()
            r5.f80484h = r0
            android.net.NetworkInfo$DetailedState r6 = r6.getDetailedState()
            int r6 = r6.ordinal()
            r5.f80488l = r6
            goto L69
        L67:
            r5.f80484h = r0
        L69:
            boolean r6 = r1.isActiveNetworkMetered()
            r5.f80487k = r6
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C10174zo.e(android.content.Context):void");
    }

    public C10174zo(Context context, C6566Ao c6566Ao) {
        C8659lf.a(context);
        c(context);
        e(context);
        d(context);
        this.f80491o = Build.FINGERPRINT;
        this.f80492p = Build.DEVICE;
        this.f80476C = C6961Mf.g(context);
        this.f80493q = c6566Ao.f65174a;
        this.f80494r = c6566Ao.f65175b;
        this.f80495s = c6566Ao.f65176c;
        this.f80496t = c6566Ao.f65177d;
        this.f80497u = c6566Ao.f65178e;
        this.f80498v = c6566Ao.f65179f;
        this.f80499w = c6566Ao.f65180g;
        this.f80500x = c6566Ao.f65181h;
        this.f80475B = c6566Ao.f65182i;
        this.f80501y = c6566Ao.f65185l;
        this.f80502z = c6566Ao.f65186m;
        this.f80474A = c6566Ao.f65187n;
    }
}
