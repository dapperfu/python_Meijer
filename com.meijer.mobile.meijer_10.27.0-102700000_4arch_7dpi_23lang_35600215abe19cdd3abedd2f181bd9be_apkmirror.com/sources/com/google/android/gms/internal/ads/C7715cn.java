package com.google.android.gms.internal.ads;

import Mc.C4169y;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.cn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7715cn extends C7822dn implements InterfaceC7069Pi {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC9008ot f73247c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f73248d;

    /* renamed from: e, reason: collision with root package name */
    private final WindowManager f73249e;

    /* renamed from: f, reason: collision with root package name */
    private final C7163Se f73250f;

    /* renamed from: g, reason: collision with root package name */
    DisplayMetrics f73251g;

    /* renamed from: h, reason: collision with root package name */
    private float f73252h;

    /* renamed from: i, reason: collision with root package name */
    int f73253i;

    /* renamed from: j, reason: collision with root package name */
    int f73254j;

    /* renamed from: k, reason: collision with root package name */
    private int f73255k;

    /* renamed from: l, reason: collision with root package name */
    int f73256l;

    /* renamed from: m, reason: collision with root package name */
    int f73257m;

    /* renamed from: n, reason: collision with root package name */
    int f73258n;

    /* renamed from: o, reason: collision with root package name */
    int f73259o;

    public C7715cn(InterfaceC9008ot interfaceC9008ot, Context context, C7163Se c7163Se) {
        super(interfaceC9008ot, "");
        this.f73253i = -1;
        this.f73254j = -1;
        this.f73256l = -1;
        this.f73257m = -1;
        this.f73258n = -1;
        this.f73259o = -1;
        this.f73247c = interfaceC9008ot;
        this.f73248d = context;
        this.f73250f = c7163Se;
        this.f73249e = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final /* synthetic */ void a(Object obj, Map map) throws JSONException {
        JSONObject jSONObjectPut;
        this.f73251g = new DisplayMetrics();
        Display defaultDisplay = this.f73249e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f73251g);
        this.f73252h = this.f73251g.density;
        this.f73255k = defaultDisplay.getRotation();
        C4169y.b();
        DisplayMetrics displayMetrics = this.f73251g;
        this.f73253i = Qc.g.x(displayMetrics, displayMetrics.widthPixels);
        C4169y.b();
        DisplayMetrics displayMetrics2 = this.f73251g;
        this.f73254j = Qc.g.x(displayMetrics2, displayMetrics2.heightPixels);
        Activity activityZzi = this.f73247c.zzi();
        if (activityZzi == null || activityZzi.getWindow() == null) {
            this.f73256l = this.f73253i;
            this.f73257m = this.f73254j;
        } else {
            Lc.v.t();
            int[] iArrQ = Pc.D0.q(activityZzi);
            C4169y.b();
            this.f73256l = Qc.g.x(this.f73251g, iArrQ[0]);
            C4169y.b();
            this.f73257m = Qc.g.x(this.f73251g, iArrQ[1]);
        }
        if (this.f73247c.c().i()) {
            this.f73258n = this.f73253i;
            this.f73259o = this.f73254j;
        } else {
            this.f73247c.measure(0, 0);
        }
        e(this.f73253i, this.f73254j, this.f73256l, this.f73257m, this.f73252h, this.f73255k);
        C7609bn c7609bn = new C7609bn();
        C7163Se c7163Se = this.f73250f;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        c7609bn.e(c7163Se.a(intent));
        C7163Se c7163Se2 = this.f73250f;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        c7609bn.c(c7163Se2.a(intent2));
        c7609bn.a(this.f73250f.b());
        c7609bn.d(this.f73250f.c());
        c7609bn.b(true);
        boolean z10 = c7609bn.f72863a;
        boolean z11 = c7609bn.f72864b;
        boolean z12 = c7609bn.f72865c;
        boolean z13 = c7609bn.f72866d;
        boolean z14 = c7609bn.f72867e;
        InterfaceC9008ot interfaceC9008ot = this.f73247c;
        try {
            jSONObjectPut = new JSONObject().put("sms", z10).put("tel", z11).put("calendar", z12).put("storePicture", z13).put("inlineVideo", z14);
        } catch (JSONException e10) {
            Qc.p.e("Error occurred while obtaining the MRAID capabilities.", e10);
            jSONObjectPut = null;
        }
        interfaceC9008ot.j("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        this.f73247c.getLocationOnScreen(iArr);
        h(C4169y.b().e(this.f73248d, iArr[0]), C4169y.b().e(this.f73248d, iArr[1]));
        if (Qc.p.j(2)) {
            Qc.p.f("Dispatching Ready Event.");
        }
        d(this.f73247c.zzn().f29929a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006b A[PHI: r3
      0x006b: PHI (r3v1 int) = (r3v0 int), (r3v4 int) binds: [B:11:0x0042, B:17:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f73248d
            boolean r1 = r0 instanceof android.app.Activity
            r2 = 0
            if (r1 == 0) goto L13
            Lc.v.t()
            android.app.Activity r0 = (android.app.Activity) r0
            int[] r0 = Pc.D0.r(r0)
            r0 = r0[r2]
            goto L14
        L13:
            r0 = r2
        L14:
            com.google.android.gms.internal.ads.ot r1 = r6.f73247c
            com.google.android.gms.internal.ads.iu r1 = r1.c()
            if (r1 == 0) goto L28
            com.google.android.gms.internal.ads.ot r1 = r6.f73247c
            com.google.android.gms.internal.ads.iu r1 = r1.c()
            boolean r1 = r1.i()
            if (r1 != 0) goto L84
        L28:
            com.google.android.gms.internal.ads.ot r1 = r6.f73247c
            int r3 = r1.getWidth()
            int r1 = r1.getHeight()
            com.google.android.gms.internal.ads.bf r4 = com.google.android.gms.internal.ads.C8659lf.f76292d0
            com.google.android.gms.internal.ads.jf r5 = Mc.A.c()
            java.lang.Object r4 = r5.a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L6b
            if (r3 != 0) goto L58
            com.google.android.gms.internal.ads.ot r3 = r6.f73247c
            com.google.android.gms.internal.ads.iu r3 = r3.c()
            if (r3 == 0) goto L57
            com.google.android.gms.internal.ads.ot r3 = r6.f73247c
            com.google.android.gms.internal.ads.iu r3 = r3.c()
            int r3 = r3.f75018c
            goto L58
        L57:
            r3 = r2
        L58:
            if (r1 != 0) goto L6b
            com.google.android.gms.internal.ads.ot r1 = r6.f73247c
            com.google.android.gms.internal.ads.iu r1 = r1.c()
            if (r1 == 0) goto L6c
            com.google.android.gms.internal.ads.ot r1 = r6.f73247c
            com.google.android.gms.internal.ads.iu r1 = r1.c()
            int r2 = r1.f75017b
            goto L6c
        L6b:
            r2 = r1
        L6c:
            android.content.Context r1 = r6.f73248d
            Qc.g r4 = Mc.C4169y.b()
            int r1 = r4.e(r1, r3)
            r6.f73258n = r1
            android.content.Context r1 = r6.f73248d
            Qc.g r3 = Mc.C4169y.b()
            int r1 = r3.e(r1, r2)
            r6.f73259o = r1
        L84:
            int r0 = r8 - r0
            int r1 = r6.f73258n
            int r2 = r6.f73259o
            r6.b(r7, r0, r1, r2)
            com.google.android.gms.internal.ads.ot r0 = r6.f73247c
            com.google.android.gms.internal.ads.gu r0 = r0.zzN()
            r0.B(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7715cn.h(int, int):void");
    }
}
