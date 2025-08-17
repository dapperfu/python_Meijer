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
public final class zzcbg extends FrameLayout implements InterfaceC8897nr {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6807Hr f80601a;

    /* renamed from: b, reason: collision with root package name */
    private final FrameLayout f80602b;

    /* renamed from: c, reason: collision with root package name */
    private final View f80603c;

    /* renamed from: d, reason: collision with root package name */
    private final C6554Af f80604d;

    /* renamed from: e, reason: collision with root package name */
    final RunnableC6875Jr f80605e;

    /* renamed from: f, reason: collision with root package name */
    private final long f80606f;

    /* renamed from: g, reason: collision with root package name */
    private final zzcay f80607g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f80608h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f80609i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f80610j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f80611k;

    /* renamed from: l, reason: collision with root package name */
    private long f80612l;

    /* renamed from: m, reason: collision with root package name */
    private long f80613m;

    /* renamed from: n, reason: collision with root package name */
    private String f80614n;

    /* renamed from: o, reason: collision with root package name */
    private String[] f80615o;

    /* renamed from: p, reason: collision with root package name */
    private Bitmap f80616p;

    /* renamed from: q, reason: collision with root package name */
    private final ImageView f80617q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f80618r;

    public zzcbg(Context context, InterfaceC6807Hr interfaceC6807Hr, int i10, boolean z10, C6554Af c6554Af, C6773Gr c6773Gr) {
        zzcay zzcawVar;
        C6554Af c6554Af2;
        zzcay zzcemVar;
        super(context);
        this.f80601a = interfaceC6807Hr;
        this.f80604d = c6554Af;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f80602b = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        com.google.android.gms.common.internal.r.l(interfaceC6807Hr.zzj());
        C9004or c9004or = interfaceC6807Hr.zzj().f17970a;
        C6841Ir c6841Ir = new C6841Ir(context, interfaceC6807Hr.zzn(), interfaceC6807Hr.zzs(), c6554Af, interfaceC6807Hr.zzk());
        if (i10 == 3) {
            zzcemVar = new zzcem(context, c6841Ir);
            c6554Af2 = c6554Af;
        } else {
            if (i10 == 2) {
                zzcawVar = new zzcck(context, c6841Ir, interfaceC6807Hr, z10, C9004or.a(interfaceC6807Hr), c6773Gr);
                c6554Af2 = c6554Af;
            } else {
                c6554Af2 = c6554Af;
                zzcawVar = new zzcaw(context, interfaceC6807Hr, z10, C9004or.a(interfaceC6807Hr), c6773Gr, new C6841Ir(context, interfaceC6807Hr.zzn(), interfaceC6807Hr.zzs(), c6554Af, interfaceC6807Hr.zzk()));
            }
            zzcemVar = zzcawVar;
        }
        this.f80607g = zzcemVar;
        View view = new View(context);
        this.f80603c = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcemVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) Mc.A.c().a(C8659lf.f76138S)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76096P)).booleanValue()) {
            q();
        }
        this.f80617q = new ImageView(context);
        this.f80606f = ((Long) Mc.A.c().a(C8659lf.f76166U)).longValue();
        boolean zBooleanValue = ((Boolean) Mc.A.c().a(C8659lf.f76124R)).booleanValue();
        this.f80611k = zBooleanValue;
        if (c6554Af2 != null) {
            c6554Af.d("spinner_used", true != zBooleanValue ? "0" : "1");
        }
        this.f80605e = new RunnableC6875Jr(this);
        zzcemVar.p(this);
    }

    public final void g(String str, String[] strArr) {
        this.f80614n = str;
        this.f80615o = strArr;
    }

    public final Integer o() {
        zzcay zzcayVar = this.f80607g;
        if (zzcayVar != null) {
            return zzcayVar.t();
        }
        return null;
    }

    final /* synthetic */ void s() {
        m("firstFrameRendered", new String[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8897nr
    public final void zzd() {
        m("pause", new String[0]);
        l();
        this.f80608h = false;
    }

    private final void l() {
        if (this.f80601a.zzi() == null || !this.f80609i || this.f80610j) {
            return;
        }
        this.f80601a.zzi().getWindow().clearFlags(128);
        this.f80609i = false;
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
        this.f80601a.L("onVideoEvent", map);
    }

    private final boolean n() {
        return this.f80617q.getParent() != null;
    }

    public final void A(MotionEvent motionEvent) {
        zzcay zzcayVar = this.f80607g;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.dispatchTouchEvent(motionEvent);
    }

    public final void B(int i10) {
        zzcay zzcayVar = this.f80607g;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.u(i10);
    }

    public final void C(int i10) {
        zzcay zzcayVar = this.f80607g;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.v(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8897nr
    public final void K0(String str, String str2) {
        m("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8897nr
    public final void a(String str, String str2) {
        m("error", "what", str, "extra", str2);
    }

    public final void b(int i10) {
        zzcay zzcayVar = this.f80607g;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.w(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8897nr
    public final void c(int i10, int i11) {
        if (this.f80611k) {
            AbstractC7593bf abstractC7593bf = C8659lf.f76152T;
            int iMax = Math.max(i10 / ((Integer) Mc.A.c().a(abstractC7593bf)).intValue(), 1);
            int iMax2 = Math.max(i11 / ((Integer) Mc.A.c().a(abstractC7593bf)).intValue(), 1);
            Bitmap bitmap = this.f80616p;
            if (bitmap != null && bitmap.getWidth() == iMax && this.f80616p.getHeight() == iMax2) {
                return;
            }
            this.f80616p = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.f80618r = false;
        }
    }

    public final void d(int i10) {
        zzcay zzcayVar = this.f80607g;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.a(i10);
    }

    public final void e(int i10) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76138S)).booleanValue()) {
            this.f80602b.setBackgroundColor(i10);
            this.f80603c.setBackgroundColor(i10);
        }
    }

    public final void f(int i10) {
        zzcay zzcayVar = this.f80607g;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.b(i10);
    }

    public final void finalize() throws Throwable {
        try {
            this.f80605e.a();
            final zzcay zzcayVar = this.f80607g;
            if (zzcayVar != null) {
                C6908Kq.f68179f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.qr
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
        zzcay zzcayVar = this.f80607g;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.f80600b.e(f10);
        zzcayVar.zzn();
    }

    public final void j(float f10, float f11) {
        zzcay zzcayVar = this.f80607g;
        if (zzcayVar != null) {
            zzcayVar.s(f10, f11);
        }
    }

    public final void k() {
        zzcay zzcayVar = this.f80607g;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.f80600b.d(false);
        zzcayVar.zzn();
    }

    public final void q() {
        zzcay zzcayVar = this.f80607g;
        if (zzcayVar == null) {
            return;
        }
        TextView textView = new TextView(zzcayVar.getContext());
        Resources resourcesF = Lc.v.s().f();
        textView.setText(String.valueOf(resourcesF == null ? "AdMob - " : resourcesF.getString(Jc.d.f14776u)).concat(this.f80607g.l()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.f80602b.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.f80602b.bringChildToFront(textView);
    }

    public final void r() {
        this.f80605e.a();
        zzcay zzcayVar = this.f80607g;
        if (zzcayVar != null) {
            zzcayVar.r();
        }
        l();
    }

    final /* synthetic */ void t(boolean z10) {
        m("windowFocusChanged", "hasWindowFocus", String.valueOf(z10));
    }

    public final void u(Integer num) {
        if (this.f80607g == null) {
            return;
        }
        if (TextUtils.isEmpty(this.f80614n)) {
            m("no_src", new String[0]);
        } else {
            this.f80607g.c(this.f80614n, this.f80615o, num);
        }
    }

    public final void v() {
        zzcay zzcayVar = this.f80607g;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.f80600b.d(true);
        zzcayVar.zzn();
    }

    final void w() {
        zzcay zzcayVar = this.f80607g;
        if (zzcayVar == null) {
            return;
        }
        long jD = zzcayVar.d();
        if (this.f80612l == jD || jD <= 0) {
            return;
        }
        float f10 = jD / 1000.0f;
        if (((Boolean) Mc.A.c().a(C8659lf.f76224Y1)).booleanValue()) {
            m("timeupdate", "time", String.valueOf(f10), "totalBytes", String.valueOf(this.f80607g.k()), "qoeCachedBytes", String.valueOf(this.f80607g.i()), "qoeLoadedBytes", String.valueOf(this.f80607g.j()), "droppedFrames", String.valueOf(this.f80607g.e()), "reportTime", String.valueOf(Lc.v.c().a()));
        } else {
            m("timeupdate", "time", String.valueOf(f10));
        }
        this.f80612l = jD;
    }

    public final void x() {
        zzcay zzcayVar = this.f80607g;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.m();
    }

    public final void y() {
        zzcay zzcayVar = this.f80607g;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.n();
    }

    public final void z(int i10) {
        zzcay zzcayVar = this.f80607g;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.o(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8897nr
    public final void zza() {
        if (((Boolean) Mc.A.c().a(C8659lf.f76252a2)).booleanValue()) {
            this.f80605e.a();
        }
        m("ended", new String[0]);
        l();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8897nr
    public final void zze() {
        if (((Boolean) Mc.A.c().a(C8659lf.f76252a2)).booleanValue()) {
            this.f80605e.b();
        }
        if (this.f80601a.zzi() != null && !this.f80609i) {
            boolean z10 = (this.f80601a.zzi().getWindow().getAttributes().flags & 128) != 0;
            this.f80610j = z10;
            if (!z10) {
                this.f80601a.zzi().getWindow().addFlags(128);
                this.f80609i = true;
            }
        }
        this.f80608h = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8897nr
    public final void zzf() {
        zzcay zzcayVar = this.f80607g;
        if (zzcayVar != null && this.f80613m == 0) {
            float f10 = zzcayVar.f();
            zzcay zzcayVar2 = this.f80607g;
            m("canplaythrough", "duration", String.valueOf(f10 / 1000.0f), "videoWidth", String.valueOf(zzcayVar2.h()), "videoHeight", String.valueOf(zzcayVar2.g()));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8897nr
    public final void zzg() {
        this.f80603c.setVisibility(4);
        Pc.D0.f25081l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.rr
            @Override // java.lang.Runnable
            public final void run() {
                this.f78074a.s();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8897nr
    public final void zzh() {
        this.f80605e.b();
        Pc.D0.f25081l.post(new RunnableC9538tr(this));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8897nr
    public final void zzi() {
        if (this.f80618r && this.f80616p != null && !n()) {
            this.f80617q.setImageBitmap(this.f80616p);
            this.f80617q.invalidate();
            this.f80602b.addView(this.f80617q, new FrameLayout.LayoutParams(-1, -1));
            this.f80602b.bringChildToFront(this.f80617q);
        }
        this.f80605e.a();
        this.f80613m = this.f80612l;
        Pc.D0.f25081l.post(new RunnableC9645ur(this));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8897nr
    public final void zzk() {
        if (this.f80608h && n()) {
            this.f80602b.removeView(this.f80617q);
        }
        if (this.f80607g == null || this.f80616p == null) {
            return;
        }
        long jC = Lc.v.c().c();
        if (this.f80607g.getBitmap(this.f80616p) != null) {
            this.f80618r = true;
        }
        long jC2 = Lc.v.c().c() - jC;
        if (Pc.p0.m()) {
            Pc.p0.k("Spinner frame grab took " + jC2 + "ms");
        }
        if (jC2 > this.f80606f) {
            Qc.p.g("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.f80611k = false;
            this.f80616p = null;
            C6554Af c6554Af = this.f80604d;
            if (c6554Af != null) {
                c6554Af.d("spinner_jank", Long.toString(jC2));
            }
        }
    }

    public final void h(int i10, int i11, int i12, int i13) {
        if (Pc.p0.m()) {
            Pc.p0.k("Set video bounds to x:" + i10 + ";y:" + i11 + ";w:" + i12 + ";h:" + i13);
        }
        if (i12 != 0 && i13 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
            layoutParams.setMargins(i10, i11, 0, 0);
            this.f80602b.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            this.f80605e.b();
        } else {
            this.f80605e.a();
            this.f80613m = this.f80612l;
        }
        Pc.D0.f25081l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.sr
            @Override // java.lang.Runnable
            public final void run() {
                this.f78306a.t(z10);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.InterfaceC8897nr
    public final void onWindowVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            this.f80605e.b();
            z10 = true;
        } else {
            this.f80605e.a();
            this.f80613m = this.f80612l;
            z10 = false;
        }
        Pc.D0.f25081l.post(new RunnableC9752vr(this, z10));
    }
}
