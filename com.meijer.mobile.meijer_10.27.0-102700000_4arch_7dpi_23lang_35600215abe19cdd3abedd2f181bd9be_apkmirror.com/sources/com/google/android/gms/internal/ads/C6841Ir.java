package com.google.android.gms.internal.ads;

import Mc.C4169y;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Ir, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6841Ir {

    /* renamed from: r, reason: collision with root package name */
    private static final boolean f67691r;

    /* renamed from: a, reason: collision with root package name */
    private final Context f67692a;

    /* renamed from: b, reason: collision with root package name */
    private final String f67693b;

    /* renamed from: c, reason: collision with root package name */
    private final Qc.a f67694c;

    /* renamed from: d, reason: collision with root package name */
    private final C9942xf f67695d;

    /* renamed from: e, reason: collision with root package name */
    private final C6554Af f67696e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.I f67697f;

    /* renamed from: g, reason: collision with root package name */
    private final long[] f67698g;

    /* renamed from: h, reason: collision with root package name */
    private final String[] f67699h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f67700i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f67701j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f67702k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f67703l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f67704m;

    /* renamed from: n, reason: collision with root package name */
    private zzcay f67705n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f67706o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f67707p;

    /* renamed from: q, reason: collision with root package name */
    private long f67708q;

    public final void c() {
        this.f67704m = true;
        if (!this.f67701j || this.f67702k) {
            return;
        }
        C9407sf.a(this.f67696e, this.f67695d, "vfp2");
        this.f67702k = true;
    }

    public final void e() {
        this.f67704m = false;
    }

    public final void a(zzcay zzcayVar) {
        C9407sf.a(this.f67696e, this.f67695d, "vpc2");
        this.f67700i = true;
        this.f67696e.d("vpn", zzcayVar.l());
        this.f67705n = zzcayVar;
    }

    public final void b() {
        if (!this.f67700i || this.f67701j) {
            return;
        }
        C9407sf.a(this.f67696e, this.f67695d, "vfr2");
        this.f67701j = true;
    }

    public final void d() {
        if (!f67691r || this.f67706o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.f67693b);
        bundle.putString("player", this.f67705n.l());
        for (Pc.F f10 : this.f67697f.a()) {
            String strValueOf = String.valueOf(f10.f25093a);
            bundle.putString("fps_c_".concat(strValueOf), Integer.toString(f10.f25097e));
            String strValueOf2 = String.valueOf(f10.f25093a);
            bundle.putString("fps_p_".concat(strValueOf2), Double.toString(f10.f25096d));
        }
        int i10 = 0;
        while (true) {
            long[] jArr = this.f67698g;
            if (i10 >= jArr.length) {
                Lc.v.t().N(this.f67692a, this.f67694c.f29929a, "gmob-apps", bundle, true);
                this.f67706o = true;
                return;
            }
            String str = this.f67699h[i10];
            if (str != null) {
                bundle.putString("fh_".concat(Long.valueOf(jArr[i10]).toString()), str);
            }
            i10++;
        }
    }

    public final void f(zzcay zzcayVar) {
        if (this.f67702k && !this.f67703l) {
            if (Pc.p0.m() && !this.f67703l) {
                Pc.p0.k("VideoMetricsMixin first frame");
            }
            C9407sf.a(this.f67696e, this.f67695d, "vff2");
            this.f67703l = true;
        }
        long jB = Lc.v.c().b();
        if (this.f67704m && this.f67707p && this.f67708q != -1) {
            this.f67697f.b(TimeUnit.SECONDS.toNanos(1L) / (jB - this.f67708q));
        }
        this.f67707p = this.f67704m;
        this.f67708q = jB;
        long jLongValue = ((Long) Mc.A.c().a(C8659lf.f76082O)).longValue();
        long jD = zzcayVar.d();
        int i10 = 0;
        while (true) {
            String[] strArr = this.f67699h;
            if (i10 >= strArr.length) {
                return;
            }
            if (strArr[i10] == null && jLongValue > Math.abs(jD - this.f67698g[i10])) {
                String[] strArr2 = this.f67699h;
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
        if (C4169y.e().nextInt(100) < ((Integer) Mc.A.c().a(C8659lf.f75913Bc)).intValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        f67691r = z10;
    }

    public C6841Ir(Context context, Qc.a aVar, String str, C6554Af c6554Af, C9942xf c9942xf) {
        Pc.G g10 = new Pc.G();
        g10.a("min_1", Double.MIN_VALUE, 1.0d);
        g10.a("1_5", 1.0d, 5.0d);
        g10.a("5_10", 5.0d, 10.0d);
        g10.a("10_20", 10.0d, 20.0d);
        g10.a("20_30", 20.0d, 30.0d);
        g10.a("30_max", 30.0d, Double.MAX_VALUE);
        this.f67697f = g10.b();
        this.f67700i = false;
        this.f67701j = false;
        this.f67702k = false;
        this.f67703l = false;
        this.f67708q = -1L;
        this.f67692a = context;
        this.f67694c = aVar;
        this.f67693b = str;
        this.f67696e = c6554Af;
        this.f67695d = c9942xf;
        String str2 = (String) Mc.A.c().a(C8659lf.f76068N);
        if (str2 == null) {
            this.f67699h = new String[0];
            this.f67698g = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, ",");
        int length = strArrSplit.length;
        this.f67699h = new String[length];
        this.f67698g = new long[length];
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            try {
                this.f67698g[i10] = Long.parseLong(strArrSplit[i10]);
            } catch (NumberFormatException e10) {
                Qc.p.h("Unable to parse frame hash target time number.", e10);
                this.f67698g[i10] = -1;
            }
        }
    }
}
