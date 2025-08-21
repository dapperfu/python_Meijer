package com.google.android.gms.internal.ads;

import Oc.C4447y;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Ir, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6966Ir {

    /* renamed from: r, reason: collision with root package name */
    private static final boolean f68531r;

    /* renamed from: a, reason: collision with root package name */
    private final Context f68532a;

    /* renamed from: b, reason: collision with root package name */
    private final String f68533b;

    /* renamed from: c, reason: collision with root package name */
    private final Sc.a f68534c;

    /* renamed from: d, reason: collision with root package name */
    private final C10067xf f68535d;

    /* renamed from: e, reason: collision with root package name */
    private final C6679Af f68536e;

    /* renamed from: f, reason: collision with root package name */
    private final Rc.I f68537f;

    /* renamed from: g, reason: collision with root package name */
    private final long[] f68538g;

    /* renamed from: h, reason: collision with root package name */
    private final String[] f68539h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f68540i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f68541j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f68542k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f68543l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f68544m;

    /* renamed from: n, reason: collision with root package name */
    private zzcay f68545n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f68546o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f68547p;

    /* renamed from: q, reason: collision with root package name */
    private long f68548q;

    public final void c() {
        this.f68544m = true;
        if (!this.f68541j || this.f68542k) {
            return;
        }
        C9532sf.a(this.f68536e, this.f68535d, "vfp2");
        this.f68542k = true;
    }

    public final void e() {
        this.f68544m = false;
    }

    public final void a(zzcay zzcayVar) {
        C9532sf.a(this.f68536e, this.f68535d, "vpc2");
        this.f68540i = true;
        this.f68536e.d("vpn", zzcayVar.l());
        this.f68545n = zzcayVar;
    }

    public final void b() {
        if (!this.f68540i || this.f68541j) {
            return;
        }
        C9532sf.a(this.f68536e, this.f68535d, "vfr2");
        this.f68541j = true;
    }

    public final void d() {
        if (!f68531r || this.f68546o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.f68533b);
        bundle.putString("player", this.f68545n.l());
        for (Rc.F f10 : this.f68537f.a()) {
            String strValueOf = String.valueOf(f10.f32307a);
            bundle.putString("fps_c_".concat(strValueOf), Integer.toString(f10.f32311e));
            String strValueOf2 = String.valueOf(f10.f32307a);
            bundle.putString("fps_p_".concat(strValueOf2), Double.toString(f10.f32310d));
        }
        int i10 = 0;
        while (true) {
            long[] jArr = this.f68538g;
            if (i10 >= jArr.length) {
                Nc.v.t().N(this.f68532a, this.f68534c.f34479a, "gmob-apps", bundle, true);
                this.f68546o = true;
                return;
            }
            String str = this.f68539h[i10];
            if (str != null) {
                bundle.putString("fh_".concat(Long.valueOf(jArr[i10]).toString()), str);
            }
            i10++;
        }
    }

    public final void f(zzcay zzcayVar) {
        if (this.f68542k && !this.f68543l) {
            if (Rc.p0.m() && !this.f68543l) {
                Rc.p0.k("VideoMetricsMixin first frame");
            }
            C9532sf.a(this.f68536e, this.f68535d, "vff2");
            this.f68543l = true;
        }
        long jB = Nc.v.c().b();
        if (this.f68544m && this.f68547p && this.f68548q != -1) {
            this.f68537f.b(TimeUnit.SECONDS.toNanos(1L) / (jB - this.f68548q));
        }
        this.f68547p = this.f68544m;
        this.f68548q = jB;
        long jLongValue = ((Long) Oc.A.c().a(C8784lf.f76922O)).longValue();
        long jD = zzcayVar.d();
        int i10 = 0;
        while (true) {
            String[] strArr = this.f68539h;
            if (i10 >= strArr.length) {
                return;
            }
            if (strArr[i10] == null && jLongValue > Math.abs(jD - this.f68538g[i10])) {
                String[] strArr2 = this.f68539h;
                int i11 = 8;
                Bitmap bitmap = zzcayVar.getBitmap(8, 8);
                long j10 = 63;
                long j11 = 0;
                int i12 = 0;
                while (i12 < i11) {
                    int i13 = 0;
                    while (i13 < i11) {
                        int pixel = bitmap.getPixel(i13, i12);
                        j11 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1L : 0L) << ((int) j10);
                        j10--;
                        i13++;
                        i11 = 8;
                    }
                    i12++;
                    i11 = 8;
                }
                strArr2[i10] = String.format("%016X", Long.valueOf(j11));
                return;
            }
            i10++;
        }
    }

    static {
        boolean z10;
        if (C4447y.e().nextInt(100) < ((Integer) Oc.A.c().a(C8784lf.f76753Bc)).intValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        f68531r = z10;
    }

    public C6966Ir(Context context, Sc.a aVar, String str, C6679Af c6679Af, C10067xf c10067xf) {
        Rc.G g10 = new Rc.G();
        g10.a("min_1", Double.MIN_VALUE, 1.0d);
        g10.a("1_5", 1.0d, 5.0d);
        g10.a("5_10", 5.0d, 10.0d);
        g10.a("10_20", 10.0d, 20.0d);
        g10.a("20_30", 20.0d, 30.0d);
        g10.a("30_max", 30.0d, Double.MAX_VALUE);
        this.f68537f = g10.b();
        this.f68540i = false;
        this.f68541j = false;
        this.f68542k = false;
        this.f68543l = false;
        this.f68548q = -1L;
        this.f68532a = context;
        this.f68534c = aVar;
        this.f68533b = str;
        this.f68536e = c6679Af;
        this.f68535d = c10067xf;
        String str2 = (String) Oc.A.c().a(C8784lf.f76908N);
        if (str2 == null) {
            this.f68539h = new String[0];
            this.f68538g = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, ",");
        int length = strArrSplit.length;
        this.f68539h = new String[length];
        this.f68538g = new long[length];
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            try {
                this.f68538g[i10] = Long.parseLong(strArrSplit[i10]);
            } catch (NumberFormatException e10) {
                Sc.p.h("Unable to parse frame hash target time number.", e10);
                this.f68538g[i10] = -1;
            }
        }
    }
}
