package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class zzcbg extends FrameLayout implements InterfaceC9022nr {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6932Hr f81441a;

    /* renamed from: b, reason: collision with root package name */
    private final FrameLayout f81442b;

    /* renamed from: c, reason: collision with root package name */
    private final View f81443c;

    /* renamed from: d, reason: collision with root package name */
    private final C6679Af f81444d;

    /* renamed from: e, reason: collision with root package name */
    final RunnableC7000Jr f81445e;

    /* renamed from: f, reason: collision with root package name */
    private final long f81446f;

    /* renamed from: g, reason: collision with root package name */
    private final zzcay f81447g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f81448h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f81449i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f81450j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f81451k;

    /* renamed from: l, reason: collision with root package name */
    private long f81452l;

    /* renamed from: m, reason: collision with root package name */
    private long f81453m;

    /* renamed from: n, reason: collision with root package name */
    private String f81454n;

    /* renamed from: o, reason: collision with root package name */
    private String[] f81455o;

    /* renamed from: p, reason: collision with root package name */
    private Bitmap f81456p;

    /* renamed from: q, reason: collision with root package name */
    private final ImageView f81457q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f81458r;

    public zzcbg(Context context, InterfaceC6932Hr interfaceC6932Hr, int i10, boolean z10, C6679Af c6679Af, C6898Gr c6898Gr) {
        zzcay zzcawVar;
        C6679Af c6679Af2;
        zzcay zzcemVar;
        super(context);
        this.f81441a = interfaceC6932Hr;
        this.f81444d = c6679Af;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f81442b = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        com.google.android.gms.common.internal.r.l(interfaceC6932Hr.zzj());
        C9129or c9129or = interfaceC6932Hr.zzj().f20790a;
        C6966Ir c6966Ir = new C6966Ir(context, interfaceC6932Hr.zzn(), interfaceC6932Hr.zzs(), c6679Af, interfaceC6932Hr.zzk());
        if (i10 == 3) {
            zzcemVar = new zzcem(context, c6966Ir);
            c6679Af2 = c6679Af;
        } else {
            if (i10 == 2) {
                zzcawVar = new zzcck(context, c6966Ir, interfaceC6932Hr, z10, C9129or.a(interfaceC6932Hr), c6898Gr);
                c6679Af2 = c6679Af;
            } else {
                c6679Af2 = c6679Af;
                zzcawVar = new zzcaw(context, interfaceC6932Hr, z10, C9129or.a(interfaceC6932Hr), c6898Gr, new C6966Ir(context, interfaceC6932Hr.zzn(), interfaceC6932Hr.zzs(), c6679Af, interfaceC6932Hr.zzk()));
            }
            zzcemVar = zzcawVar;
        }
        this.f81447g = zzcemVar;
        View view = new View(context);
        this.f81443c = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcemVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) Oc.A.c().a(C8784lf.f76978S)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f76936P)).booleanValue()) {
            q();
        }
        this.f81457q = new ImageView(context);
        this.f81446f = ((Long) Oc.A.c().a(C8784lf.f77006U)).longValue();
        boolean zBooleanValue = ((Boolean) Oc.A.c().a(C8784lf.f76964R)).booleanValue();
        this.f81451k = zBooleanValue;
        if (c6679Af2 != null) {
            c6679Af.d("spinner_used", true != zBooleanValue ? "0" : "1");
        }
        this.f81445e = new RunnableC7000Jr(this);
        zzcemVar.p(this);
    }

    public final void g(String str, String[] strArr) {
        this.f81454n = str;
        this.f81455o = strArr;
    }

    public final Integer o() {
        zzcay zzcayVar = this.f81447g;
        if (zzcayVar != null) {
            return zzcayVar.t();
        }
        return null;
    }

    final /* synthetic */ void s() {
        m("firstFrameRendered", new String[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9022nr
    public final void zzd() {
        m("pause", new String[0]);
        l();
        this.f81448h = false;
    }

    private final void l() {
        if (this.f81441a.zzi() == null || !this.f81449i || this.f81450j) {
            return;
        }
        this.f81441a.zzi().getWindow().clearFlags(128);
        this.f81449i = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(String str, String... strArr) {
        HashMap map = new HashMap();
        Integer numO = o();
        if (numO != null) {
            map.put("playerId", numO.toString());
        }
        map.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.f81441a.L("onVideoEvent", map);
    }

    private final boolean n() {
        return this.f81457q.getParent() != null;
    }

    public final void A(MotionEvent motionEvent) {
        zzcay zzcayVar = this.f81447g;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.dispatchTouchEvent(motionEvent);
    }

    public final void B(int i10) {
        zzcay zzcayVar = this.f81447g;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.u(i10);
    }

    public final void C(int i10) {
        zzcay zzcayVar = this.f81447g;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.v(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9022nr
    public final void M0(String str, String str2) {
        m("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9022nr
    public final void a(String str, String str2) {
        m("error", "what", str, "extra", str2);
    }

    public final void b(int i10) {
        zzcay zzcayVar = this.f81447g;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.w(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9022nr
    public final void c(int i10, int i11) {
        if (this.f81451k) {
            AbstractC7718bf abstractC7718bf = C8784lf.f76992T;
            int iMax = Math.max(i10 / ((Integer) Oc.A.c().a(abstractC7718bf)).intValue(), 1);
            int iMax2 = Math.max(i11 / ((Integer) Oc.A.c().a(abstractC7718bf)).intValue(), 1);
            Bitmap bitmap = this.f81456p;
            if (bitmap != null && bitmap.getWidth() == iMax && this.f81456p.getHeight() == iMax2) {
                return;
            }
            this.f81456p = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.f81458r = false;
        }
    }

    public final void d(int i10) {
        zzcay zzcayVar = this.f81447g;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.a(i10);
    }

    public final void e(int i10) {
        if (((Boolean) Oc.A.c().a(C8784lf.f76978S)).booleanValue()) {
            this.f81442b.setBackgroundColor(i10);
            this.f81443c.setBackgroundColor(i10);
        }
    }

    public final void f(int i10) {
        zzcay zzcayVar = this.f81447g;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.b(i10);
    }

    public final void finalize() throws Throwable {
        try {
            this.f81445e.a();
            final zzcay zzcayVar = this.f81447g;
            if (zzcayVar != null) {
                C7033Kq.f69019f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.qr
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcayVar.r();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    public final void i(float f10) {
        zzcay zzcayVar = this.f81447g;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.f81440b.e(f10);
        zzcayVar.zzn();
    }

    public final void j(float f10, float f11) {
        zzcay zzcayVar = this.f81447g;
        if (zzcayVar != null) {
            zzcayVar.s(f10, f11);
        }
    }

    public final void k() {
        zzcay zzcayVar = this.f81447g;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.f81440b.d(false);
        zzcayVar.zzn();
    }

    public final void q() {
        zzcay zzcayVar = this.f81447g;
        if (zzcayVar == null) {
            return;
        }
        TextView textView = new TextView(zzcayVar.getContext());
        Resources resourcesF = Nc.v.s().f();
        textView.setText(String.valueOf(resourcesF == null ? "AdMob - " : resourcesF.getString(Lc.d.f18113u)).concat(this.f81447g.l()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.f81442b.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.f81442b.bringChildToFront(textView);
    }

    public final void r() {
        this.f81445e.a();
        zzcay zzcayVar = this.f81447g;
        if (zzcayVar != null) {
            zzcayVar.r();
        }
        l();
    }

    final /* synthetic */ void t(boolean z10) {
        m("windowFocusChanged", "hasWindowFocus", String.valueOf(z10));
    }

    public final void u(Integer num) {
        if (this.f81447g == null) {
            return;
        }
        if (TextUtils.isEmpty(this.f81454n)) {
            m("no_src", new String[0]);
        } else {
            this.f81447g.c(this.f81454n, this.f81455o, num);
        }
    }

    public final void v() {
        zzcay zzcayVar = this.f81447g;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.f81440b.d(true);
        zzcayVar.zzn();
    }

    final void w() {
        zzcay zzcayVar = this.f81447g;
        if (zzcayVar == null) {
            return;
        }
        long jD = zzcayVar.d();
        if (this.f81452l == jD || jD <= 0) {
            return;
        }
        float f10 = jD / 1000.0f;
        if (((Boolean) Oc.A.c().a(C8784lf.f77064Y1)).booleanValue()) {
            m("timeupdate", "time", String.valueOf(f10), "totalBytes", String.valueOf(this.f81447g.k()), "qoeCachedBytes", String.valueOf(this.f81447g.i()), "qoeLoadedBytes", String.valueOf(this.f81447g.j()), "droppedFrames", String.valueOf(this.f81447g.e()), "reportTime", String.valueOf(Nc.v.c().a()));
        } else {
            m("timeupdate", "time", String.valueOf(f10));
        }
        this.f81452l = jD;
    }

    public final void x() {
        zzcay zzcayVar = this.f81447g;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.m();
    }

    public final void y() {
        zzcay zzcayVar = this.f81447g;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.n();
    }

    public final void z(int i10) {
        zzcay zzcayVar = this.f81447g;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.o(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9022nr
    public final void zza() {
        if (((Boolean) Oc.A.c().a(C8784lf.f77092a2)).booleanValue()) {
            this.f81445e.a();
        }
        m("ended", new String[0]);
        l();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9022nr
    public final void zze() {
        if (((Boolean) Oc.A.c().a(C8784lf.f77092a2)).booleanValue()) {
            this.f81445e.b();
        }
        if (this.f81441a.zzi() != null && !this.f81449i) {
            boolean z10 = (this.f81441a.zzi().getWindow().getAttributes().flags & 128) != 0;
            this.f81450j = z10;
            if (!z10) {
                this.f81441a.zzi().getWindow().addFlags(128);
                this.f81449i = true;
            }
        }
        this.f81448h = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9022nr
    public final void zzf() {
        zzcay zzcayVar = this.f81447g;
        if (zzcayVar != null && this.f81453m == 0) {
            float f10 = zzcayVar.f();
            zzcay zzcayVar2 = this.f81447g;
            m("canplaythrough", "duration", String.valueOf(f10 / 1000.0f), "videoWidth", String.valueOf(zzcayVar2.h()), "videoHeight", String.valueOf(zzcayVar2.g()));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9022nr
    public final void zzg() {
        this.f81443c.setVisibility(4);
        Rc.D0.f32295l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.rr
            @Override // java.lang.Runnable
            public final void run() {
                this.f78914a.s();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9022nr
    public final void zzh() {
        this.f81445e.b();
        Rc.D0.f32295l.post(new RunnableC9663tr(this));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9022nr
    public final void zzi() {
        if (this.f81458r && this.f81456p != null && !n()) {
            this.f81457q.setImageBitmap(this.f81456p);
            this.f81457q.invalidate();
            this.f81442b.addView(this.f81457q, new FrameLayout.LayoutParams(-1, -1));
            this.f81442b.bringChildToFront(this.f81457q);
        }
        this.f81445e.a();
        this.f81453m = this.f81452l;
        Rc.D0.f32295l.post(new RunnableC9770ur(this));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9022nr
    public final void zzk() {
        if (this.f81448h && n()) {
            this.f81442b.removeView(this.f81457q);
        }
        if (this.f81447g == null || this.f81456p == null) {
            return;
        }
        long jC = Nc.v.c().c();
        if (this.f81447g.getBitmap(this.f81456p) != null) {
            this.f81458r = true;
        }
        long jC2 = Nc.v.c().c() - jC;
        if (Rc.p0.m()) {
            Rc.p0.k("Spinner frame grab took " + jC2 + "ms");
        }
        if (jC2 > this.f81446f) {
            Sc.p.g("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.f81451k = false;
            this.f81456p = null;
            C6679Af c6679Af = this.f81444d;
            if (c6679Af != null) {
                c6679Af.d("spinner_jank", Long.toString(jC2));
            }
        }
    }

    public final void h(int i10, int i11, int i12, int i13) {
        if (Rc.p0.m()) {
            Rc.p0.k("Set video bounds to x:" + i10 + ";y:" + i11 + ";w:" + i12 + ";h:" + i13);
        }
        if (i12 != 0 && i13 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
            layoutParams.setMargins(i10, i11, 0, 0);
            this.f81442b.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            this.f81445e.b();
        } else {
            this.f81445e.a();
            this.f81453m = this.f81452l;
        }
        Rc.D0.f32295l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.sr
            @Override // java.lang.Runnable
            public final void run() {
                this.f79146a.t(z10);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.InterfaceC9022nr
    public final void onWindowVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            this.f81445e.b();
            z10 = true;
        } else {
            this.f81445e.a();
            this.f81453m = this.f81452l;
            z10 = false;
        }
        Rc.D0.f32295l.post(new RunnableC9877vr(this, z10));
    }
}
