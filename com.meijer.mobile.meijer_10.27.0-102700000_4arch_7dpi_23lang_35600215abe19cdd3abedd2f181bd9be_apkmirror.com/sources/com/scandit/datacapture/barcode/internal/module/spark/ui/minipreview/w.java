package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanStateManager;
import com.scandit.datacapture.barcode.internal.module.spark.ui.C13209b;
import com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.w;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;

/* loaded from: classes11.dex */
public final class w implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final SparkScanStateManager f123221a;

    /* renamed from: b, reason: collision with root package name */
    public final View f123222b;

    /* renamed from: c, reason: collision with root package name */
    public Function1 f123223c;

    /* renamed from: d, reason: collision with root package name */
    public final C13209b f123224d;

    /* renamed from: e, reason: collision with root package name */
    public float f123225e;

    /* renamed from: f, reason: collision with root package name */
    public float f123226f;

    /* renamed from: g, reason: collision with root package name */
    public final PointF f123227g;

    /* renamed from: h, reason: collision with root package name */
    public final PointF f123228h;

    /* renamed from: i, reason: collision with root package name */
    public long f123229i;

    /* renamed from: j, reason: collision with root package name */
    public MotionEvent f123230j;

    /* renamed from: k, reason: collision with root package name */
    public final int f123231k;

    /* renamed from: l, reason: collision with root package name */
    public final Handler f123232l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f123233m;

    /* renamed from: n, reason: collision with root package name */
    public final v f123234n;

    public final PointF a(int i10, int i11, Pair sizes) {
        Intrinsics.j(sizes, "sizes");
        Size size = (Size) sizes.c();
        Size size2 = (Size) sizes.d();
        Lazy lazy = com.scandit.datacapture.barcode.internal.module.spark.ui.E.f122978h;
        float fIntValue = ((Number) lazy.getValue()).intValue() + 0.0f;
        Lazy lazy2 = com.scandit.datacapture.barcode.internal.module.spark.ui.E.f122979i;
        float fIntValue2 = ((Number) lazy2.getValue()).intValue() + 0.0f;
        float width = (i10 - size2.getWidth()) - ((Number) lazy2.getValue()).intValue();
        float height = (i11 - size2.getHeight()) - ((Number) lazy.getValue()).intValue();
        int iK = 0;
        boolean z10 = size2.getWidth() > size.getWidth();
        float fM = this.f123221a.m() > 0.0f ? this.f123221a.m() : this.f123222b.getX();
        float fN = this.f123221a.n() > 0.0f ? this.f123221a.n() : this.f123222b.getY();
        int width2 = (!z10 || (fM - ((float) (size2.getWidth() - size.getWidth()))) - ((float) ((Number) lazy2.getValue()).intValue()) >= 0.0f) ? (z10 || this.f123221a.j() <= 0.0f) ? size.getWidth() - size2.getWidth() : (int) (this.f123221a.j() - fM) : 0;
        if (!z10 && this.f123221a.k() > 0.0f) {
            iK = (int) (this.f123221a.k() - fN);
        }
        float fN2 = RangesKt.n(fN + iK, fIntValue, height);
        float fN3 = RangesKt.n(fM + width2, fIntValue2, width);
        this.f123221a.c(fN3);
        this.f123221a.d(fN2);
        return new PointF(fN3, fN2);
    }

    public w(Context context, SparkScanStateManager stateManager, View movingTarget) {
        Intrinsics.j(context, "context");
        Intrinsics.j(stateManager, "stateManager");
        Intrinsics.j(movingTarget, "movingTarget");
        this.f123221a = stateManager;
        this.f123222b = movingTarget;
        this.f123223c = u.f123220a;
        this.f123224d = new C13209b(context);
        this.f123227g = new PointF(0.0f, 0.0f);
        this.f123228h = new PointF(stateManager.m(), stateManager.n());
        this.f123231k = ViewConfiguration.getLongPressTimeout();
        this.f123232l = new Handler(Looper.getMainLooper());
        this.f123234n = new v(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.w.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void a(MotionEvent motionEvent) {
        this.f123229i = System.currentTimeMillis();
        this.f123225e = this.f123222b.getX() - motionEvent.getRawX();
        this.f123226f = this.f123222b.getY() - motionEvent.getRawY();
        this.f123227g.x = motionEvent.getRawX() + this.f123225e;
        this.f123227g.y = motionEvent.getRawY() + this.f123226f;
        this.f123233m = false;
        this.f123232l.removeCallbacksAndMessages(null);
        Handler handler = this.f123232l;
        final v vVar = this.f123234n;
        handler.postDelayed(new Runnable() { // from class: Ut.q
            @Override // java.lang.Runnable
            public final void run() {
                w.a(vVar);
            }
        }, this.f123231k);
    }

    public static final void a(KFunction tmp0) {
        Intrinsics.j(tmp0, "$tmp0");
        ((Function0) tmp0).invoke();
    }
}
