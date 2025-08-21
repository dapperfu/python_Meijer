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
public final class C10299zo {

    /* renamed from: A, reason: collision with root package name */
    private int f81314A;

    /* renamed from: B, reason: collision with root package name */
    private final String f81315B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f81316C;

    /* renamed from: a, reason: collision with root package name */
    private int f81317a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f81318b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f81319c;

    /* renamed from: d, reason: collision with root package name */
    private int f81320d;

    /* renamed from: e, reason: collision with root package name */
    private int f81321e;

    /* renamed from: f, reason: collision with root package name */
    private int f81322f;

    /* renamed from: g, reason: collision with root package name */
    private String f81323g;

    /* renamed from: h, reason: collision with root package name */
    private int f81324h;

    /* renamed from: i, reason: collision with root package name */
    private int f81325i;

    /* renamed from: j, reason: collision with root package name */
    private int f81326j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f81327k;

    /* renamed from: l, reason: collision with root package name */
    private int f81328l;

    /* renamed from: m, reason: collision with root package name */
    private double f81329m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f81330n;

    /* renamed from: o, reason: collision with root package name */
    private String f81331o;

    /* renamed from: p, reason: collision with root package name */
    private String f81332p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f81333q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f81334r;

    /* renamed from: s, reason: collision with root package name */
    private final String f81335s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f81336t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f81337u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f81338v;

    /* renamed from: w, reason: collision with root package name */
    private final String f81339w;

    /* renamed from: x, reason: collision with root package name */
    private final String f81340x;

    /* renamed from: y, reason: collision with root package name */
    private float f81341y;

    /* renamed from: z, reason: collision with root package name */
    private int f81342z;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C10299zo(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            com.google.android.gms.internal.ads.C8784lf.a(r7)
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
            r6.f81333q = r2
            java.lang.String r2 = "http://www.google.com"
            android.content.pm.ResolveInfo r2 = b(r0, r2)
            if (r2 == 0) goto L2f
            goto L30
        L2f:
            r3 = r4
        L30:
            r6.f81334r = r3
            java.lang.String r2 = r1.getCountry()
            r6.f81335s = r2
            Nc.v.t()
            Oc.C4447y.b()
            boolean r2 = Sc.g.t()
            r6.f81336t = r2
            boolean r2 = com.google.android.gms.common.util.j.c(r7)
            r6.f81337u = r2
            boolean r2 = com.google.android.gms.common.util.j.d(r7)
            r6.f81338v = r2
            java.lang.String r1 = r1.getLanguage()
            r6.f81339w = r1
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
            sd.e r3 = sd.C17067f.a(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
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
            r6.f81340x = r0
            sd.e r0 = sd.C17067f.a(r7)     // Catch: java.lang.Exception -> Lb0
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
            r6.f81315B = r2
            android.content.res.Resources r7 = r7.getResources()
            if (r7 != 0) goto Lb9
            goto Lcb
        Lb9:
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            if (r7 == 0) goto Lcb
            float r0 = r7.density
            r6.f81341y = r0
            int r0 = r7.widthPixels
            r6.f81342z = r0
            int r7 = r7.heightPixels
            r6.f81314A = r7
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C10299zo.<init>(android.content.Context):void");
    }

    public final C6691Ao a() {
        return new C6691Ao(this.f81317a, this.f81333q, this.f81334r, this.f81323g, this.f81335s, this.f81336t, this.f81337u, this.f81338v, this.f81318b, this.f81319c, this.f81339w, this.f81340x, this.f81315B, this.f81320d, this.f81324h, this.f81325i, this.f81326j, this.f81321e, this.f81322f, this.f81341y, this.f81342z, this.f81314A, this.f81329m, this.f81330n, this.f81327k, this.f81328l, this.f81331o, this.f81316C, this.f81332p);
    }

    private static ResolveInfo b(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th2) {
            Nc.v.s().x(th2, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    private final void c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f81317a = audioManager.getMode();
                this.f81318b = audioManager.isMusicActive();
                this.f81319c = audioManager.isSpeakerphoneOn();
                this.f81320d = audioManager.getStreamVolume(3);
                this.f81321e = audioManager.getRingerMode();
                this.f81322f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th2) {
                Nc.v.s().x(th2, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f81317a = -2;
        this.f81318b = false;
        this.f81319c = false;
        this.f81320d = 0;
        this.f81321e = 2;
        this.f81322f = 0;
    }

    @SuppressLint({"UnprotectedReceiver"})
    private final void d(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intentRegisterReceiver = (!((Boolean) Oc.A.c().a(C8784lf.f76989Sa)).booleanValue() || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (intentRegisterReceiver == null) {
            this.f81329m = -1.0d;
            this.f81330n = false;
        } else {
            int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
            this.f81329m = intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1);
            this.f81330n = intExtra == 2 || intExtra == 5;
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
            r5.f81323g = r2
            boolean r2 = com.google.android.gms.common.util.n.j()
            r3 = 0
            if (r2 == 0) goto L31
            com.google.android.gms.internal.ads.bf r2 = com.google.android.gms.internal.ads.C8784lf.f77448z8
            com.google.android.gms.internal.ads.jf r4 = Oc.A.c()
            java.lang.Object r2 = r4.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L31
            r2 = r3
            goto L35
        L31:
            int r2 = r0.getNetworkType()
        L35:
            r5.f81325i = r2
            int r0 = r0.getPhoneType()
            r5.f81326j = r0
            r0 = -2
            r5.f81324h = r0
            r5.f81327k = r3
            r0 = -1
            r5.f81328l = r0
            Nc.v.t()
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r6 = Rc.D0.b(r6, r2)
            if (r6 == 0) goto L6f
            android.net.NetworkInfo r6 = r1.getActiveNetworkInfo()
            if (r6 == 0) goto L67
            int r0 = r6.getType()
            r5.f81324h = r0
            android.net.NetworkInfo$DetailedState r6 = r6.getDetailedState()
            int r6 = r6.ordinal()
            r5.f81328l = r6
            goto L69
        L67:
            r5.f81324h = r0
        L69:
            boolean r6 = r1.isActiveNetworkMetered()
            r5.f81327k = r6
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C10299zo.e(android.content.Context):void");
    }

    public C10299zo(Context context, C6691Ao c6691Ao) {
        C8784lf.a(context);
        c(context);
        e(context);
        d(context);
        this.f81331o = Build.FINGERPRINT;
        this.f81332p = Build.DEVICE;
        this.f81316C = C7086Mf.g(context);
        this.f81333q = c6691Ao.f66014a;
        this.f81334r = c6691Ao.f66015b;
        this.f81335s = c6691Ao.f66016c;
        this.f81336t = c6691Ao.f66017d;
        this.f81337u = c6691Ao.f66018e;
        this.f81338v = c6691Ao.f66019f;
        this.f81339w = c6691Ao.f66020g;
        this.f81340x = c6691Ao.f66021h;
        this.f81315B = c6691Ao.f66022i;
        this.f81341y = c6691Ao.f66025l;
        this.f81342z = c6691Ao.f66026m;
        this.f81314A = c6691Ao.f66027n;
    }
}
