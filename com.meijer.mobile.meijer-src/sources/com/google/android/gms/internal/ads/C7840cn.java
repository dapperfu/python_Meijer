package com.google.android.gms.internal.ads;

import Oc.C4447y;
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
public final class C7840cn extends C7947dn implements InterfaceC7194Pi {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC9133ot f74087c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f74088d;

    /* renamed from: e, reason: collision with root package name */
    private final WindowManager f74089e;

    /* renamed from: f, reason: collision with root package name */
    private final C7288Se f74090f;

    /* renamed from: g, reason: collision with root package name */
    DisplayMetrics f74091g;

    /* renamed from: h, reason: collision with root package name */
    private float f74092h;

    /* renamed from: i, reason: collision with root package name */
    int f74093i;

    /* renamed from: j, reason: collision with root package name */
    int f74094j;

    /* renamed from: k, reason: collision with root package name */
    private int f74095k;

    /* renamed from: l, reason: collision with root package name */
    int f74096l;

    /* renamed from: m, reason: collision with root package name */
    int f74097m;

    /* renamed from: n, reason: collision with root package name */
    int f74098n;

    /* renamed from: o, reason: collision with root package name */
    int f74099o;

    public C7840cn(InterfaceC9133ot interfaceC9133ot, Context context, C7288Se c7288Se) {
        super(interfaceC9133ot, "");
        this.f74093i = -1;
        this.f74094j = -1;
        this.f74096l = -1;
        this.f74097m = -1;
        this.f74098n = -1;
        this.f74099o = -1;
        this.f74087c = interfaceC9133ot;
        this.f74088d = context;
        this.f74090f = c7288Se;
        this.f74089e = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final /* synthetic */ void a(Object obj, Map map) throws JSONException {
        JSONObject jSONObjectPut;
        this.f74091g = new DisplayMetrics();
        Display defaultDisplay = this.f74089e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f74091g);
        this.f74092h = this.f74091g.density;
        this.f74095k = defaultDisplay.getRotation();
        C4447y.b();
        DisplayMetrics displayMetrics = this.f74091g;
        this.f74093i = Sc.g.x(displayMetrics, displayMetrics.widthPixels);
        C4447y.b();
        DisplayMetrics displayMetrics2 = this.f74091g;
        this.f74094j = Sc.g.x(displayMetrics2, displayMetrics2.heightPixels);
        Activity activityZzi = this.f74087c.zzi();
        if (activityZzi == null || activityZzi.getWindow() == null) {
            this.f74096l = this.f74093i;
            this.f74097m = this.f74094j;
        } else {
            Nc.v.t();
            int[] iArrQ = Rc.D0.q(activityZzi);
            C4447y.b();
            this.f74096l = Sc.g.x(this.f74091g, iArrQ[0]);
            C4447y.b();
            this.f74097m = Sc.g.x(this.f74091g, iArrQ[1]);
        }
        if (this.f74087c.c().i()) {
            this.f74098n = this.f74093i;
            this.f74099o = this.f74094j;
        } else {
            this.f74087c.measure(0, 0);
        }
        e(this.f74093i, this.f74094j, this.f74096l, this.f74097m, this.f74092h, this.f74095k);
        C7734bn c7734bn = new C7734bn();
        C7288Se c7288Se = this.f74090f;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        c7734bn.e(c7288Se.a(intent));
        C7288Se c7288Se2 = this.f74090f;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        c7734bn.c(c7288Se2.a(intent2));
        c7734bn.a(this.f74090f.b());
        c7734bn.d(this.f74090f.c());
        c7734bn.b(true);
        boolean z10 = c7734bn.f73703a;
        boolean z11 = c7734bn.f73704b;
        boolean z12 = c7734bn.f73705c;
        boolean z13 = c7734bn.f73706d;
        boolean z14 = c7734bn.f73707e;
        InterfaceC9133ot interfaceC9133ot = this.f74087c;
        try {
            jSONObjectPut = new JSONObject().put("sms", z10).put("tel", z11).put("calendar", z12).put("storePicture", z13).put("inlineVideo", z14);
        } catch (JSONException e10) {
            Sc.p.e("Error occurred while obtaining the MRAID capabilities.", e10);
            jSONObjectPut = null;
        }
        interfaceC9133ot.j("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        this.f74087c.getLocationOnScreen(iArr);
        h(C4447y.b().e(this.f74088d, iArr[0]), C4447y.b().e(this.f74088d, iArr[1]));
        if (Sc.p.j(2)) {
            Sc.p.f("Dispatching Ready Event.");
        }
        d(this.f74087c.zzn().f34479a);
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
            android.content.Context r0 = r6.f74088d
            boolean r1 = r0 instanceof android.app.Activity
            r2 = 0
            if (r1 == 0) goto L13
            Nc.v.t()
            android.app.Activity r0 = (android.app.Activity) r0
            int[] r0 = Rc.D0.r(r0)
            r0 = r0[r2]
            goto L14
        L13:
            r0 = r2
        L14:
            com.google.android.gms.internal.ads.ot r1 = r6.f74087c
            com.google.android.gms.internal.ads.iu r1 = r1.c()
            if (r1 == 0) goto L28
            com.google.android.gms.internal.ads.ot r1 = r6.f74087c
            com.google.android.gms.internal.ads.iu r1 = r1.c()
            boolean r1 = r1.i()
            if (r1 != 0) goto L84
        L28:
            com.google.android.gms.internal.ads.ot r1 = r6.f74087c
            int r3 = r1.getWidth()
            int r1 = r1.getHeight()
            com.google.android.gms.internal.ads.bf r4 = com.google.android.gms.internal.ads.C8784lf.f77132d0
            com.google.android.gms.internal.ads.jf r5 = Oc.A.c()
            java.lang.Object r4 = r5.a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L6b
            if (r3 != 0) goto L58
            com.google.android.gms.internal.ads.ot r3 = r6.f74087c
            com.google.android.gms.internal.ads.iu r3 = r3.c()
            if (r3 == 0) goto L57
            com.google.android.gms.internal.ads.ot r3 = r6.f74087c
            com.google.android.gms.internal.ads.iu r3 = r3.c()
            int r3 = r3.f75858c
            goto L58
        L57:
            r3 = r2
        L58:
            if (r1 != 0) goto L6b
            com.google.android.gms.internal.ads.ot r1 = r6.f74087c
            com.google.android.gms.internal.ads.iu r1 = r1.c()
            if (r1 == 0) goto L6c
            com.google.android.gms.internal.ads.ot r1 = r6.f74087c
            com.google.android.gms.internal.ads.iu r1 = r1.c()
            int r2 = r1.f75857b
            goto L6c
        L6b:
            r2 = r1
        L6c:
            android.content.Context r1 = r6.f74088d
            Sc.g r4 = Oc.C4447y.b()
            int r1 = r4.e(r1, r3)
            r6.f74098n = r1
            android.content.Context r1 = r6.f74088d
            Sc.g r3 = Oc.C4447y.b()
            int r1 = r3.e(r1, r2)
            r6.f74099o = r1
        L84:
            int r0 = r8 - r0
            int r1 = r6.f74098n
            int r2 = r6.f74099o
            r6.b(r7, r0, r1, r2)
            com.google.android.gms.internal.ads.ot r0 = r6.f74087c
            com.google.android.gms.internal.ads.gu r0 = r0.zzN()
            r0.B(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7840cn.h(int, int):void");
    }
}
