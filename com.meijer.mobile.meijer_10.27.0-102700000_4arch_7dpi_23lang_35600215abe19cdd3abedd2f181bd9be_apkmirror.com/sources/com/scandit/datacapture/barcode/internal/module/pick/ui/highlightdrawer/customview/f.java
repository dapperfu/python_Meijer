package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.batch.data.TrackedObject;
import com.scandit.datacapture.barcode.internal.module.pick.ui.BarcodePickBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickElementsCache;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class f extends FrameLayout implements BarcodePickDrawer {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f122611a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f122612b;

    /* renamed from: c, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ui.h f122613c;

    /* renamed from: d, reason: collision with root package name */
    public final BarcodePickViewHighlightStyle f122614d;

    /* renamed from: e, reason: collision with root package name */
    public final j f122615e;

    /* renamed from: f, reason: collision with root package name */
    public final b f122616f;

    /* renamed from: g, reason: collision with root package name */
    public final BarcodePickElementsCache f122617g;

    /* renamed from: h, reason: collision with root package name */
    public final Function1 f122618h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f122619i;

    /* renamed from: j, reason: collision with root package name */
    public final Map f122620j;

    /* renamed from: k, reason: collision with root package name */
    public final Map f122621k;

    /* renamed from: l, reason: collision with root package name */
    public final List f122622l;

    /* renamed from: m, reason: collision with root package name */
    public final Map f122623m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f122624n;

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final boolean a() {
        return false;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void b(TrackedObject track, BarcodePickState pickState) {
        Intrinsics.j(track, "track");
        Intrinsics.j(pickState, "pickState");
        if (this.f122624n) {
            c(track, pickState);
            invalidate();
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e eVar = (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e) this.f122623m.get(Integer.valueOf(track.getIdentifier()));
            if (eVar != null) {
                eVar.a(track, pickState);
            }
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void start() {
        this.f122624n = true;
        invalidate();
        for (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e eVar : this.f122623m.values()) {
            eVar.f122706g = false;
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.h hVar = eVar.f122707h;
            if (hVar != null) {
                com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.b onFinished = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.b.f122714a;
                Intrinsics.j(onFinished, "onFinished");
                if (hVar.f122734o == com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.a.f122711b) {
                    hVar.a(com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.a.f122710a, onFinished);
                } else {
                    onFinished.invoke();
                }
            }
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void stop() {
        this.f122624n = false;
        Iterator it = this.f122620j.values().iterator();
        while (it.hasNext()) {
            View view = ((a) it.next()).f122601a;
            view.setOnClickListener(null);
            ViewExtensionsKt.removeFromSuperview(view);
        }
        this.f122620j.clear();
        Iterator it2 = this.f122623m.values().iterator();
        while (it2.hasNext()) {
            ((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e) it2.next()).a();
        }
        this.f122623m.clear();
        Iterator it3 = this.f122623m.values().iterator();
        while (it3.hasNext()) {
            ((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e) it3.next()).a();
        }
    }

    public f(BarcodePickBasicOverlay container, boolean z10, com.scandit.datacapture.barcode.internal.module.ui.h touchEventHandler, BarcodePickViewHighlightStyle.CustomView highlightStyle, j drawSettings, c drawDataFactory, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.f cache, Function1 statusIconViewDrawerProvider, Paint tapPaint, Map drawingData) {
        LinkedHashMap viewContainers = new LinkedHashMap();
        ArrayList viewContainerCache = new ArrayList();
        LinkedHashMap statusIconViewDrawers = new LinkedHashMap();
        Intrinsics.j(container, "container");
        Intrinsics.j(touchEventHandler, "touchEventHandler");
        Intrinsics.j(highlightStyle, "highlightStyle");
        Intrinsics.j(drawSettings, "drawSettings");
        Intrinsics.j(drawDataFactory, "drawDataFactory");
        Intrinsics.j(cache, "cache");
        Intrinsics.j(statusIconViewDrawerProvider, "statusIconViewDrawerProvider");
        Intrinsics.j(tapPaint, "tapPaint");
        Intrinsics.j(drawingData, "drawingData");
        Intrinsics.j(viewContainers, "viewContainers");
        Intrinsics.j(viewContainerCache, "viewContainerCache");
        Intrinsics.j(statusIconViewDrawers, "statusIconViewDrawers");
        super(container.getContext());
        this.f122611a = container;
        this.f122612b = z10;
        this.f122613c = touchEventHandler;
        this.f122614d = highlightStyle;
        this.f122615e = drawSettings;
        this.f122616f = drawDataFactory;
        this.f122617g = cache;
        this.f122618h = statusIconViewDrawerProvider;
        this.f122619i = tapPaint;
        this.f122620j = drawingData;
        this.f122621k = viewContainers;
        this.f122622l = viewContainerCache;
        this.f122623m = statusIconViewDrawers;
        container.addView(this, new FrameLayout.LayoutParams(-1, -1));
        setElevation(PixelExtensionsKt.pxFromDp$default(4.0f, (Context) null, 1, (Object) null));
        setWillNotDraw(false);
        setClickable(true);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(List tracks) {
        Intrinsics.j(tracks, "tracks");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x032d A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.scandit.datacapture.barcode.batch.data.TrackedObject r19, com.scandit.datacapture.barcode.pick.capture.BarcodePickState r20) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.customview.f.c(com.scandit.datacapture.barcode.batch.data.TrackedObject, com.scandit.datacapture.barcode.pick.capture.BarcodePickState):void");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.j(canvas, "canvas");
        if (this.f122624n && this.f122615e.f122628a) {
            Iterator it = this.f122620j.values().iterator();
            while (it.hasNext()) {
                canvas.drawPath(((a) it.next()).f122603c.f122591b, this.f122619i);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.j(event, "event");
        return ((com.scandit.datacapture.barcode.internal.module.ui.i) this.f122613c).a(event);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(TrackedObject track, BarcodePickState pickState) {
        Intrinsics.j(track, "track");
        Intrinsics.j(pickState, "pickState");
        if (this.f122624n) {
            c(track, pickState);
            invalidate();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void b() {
        this.f122624n = true;
        invalidate();
        Iterator it = this.f122623m.values().iterator();
        while (it.hasNext()) {
            ((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e) it.next()).f122706g = true;
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(int i10) {
        if (this.f122624n) {
            b(i10);
            invalidate();
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e eVar = (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e) this.f122623m.get(Integer.valueOf(i10));
            if (eVar != null) {
                eVar.a();
            }
        }
    }

    public final void b(int i10) {
        View view;
        a aVar = (a) this.f122620j.remove(Integer.valueOf(i10));
        if (aVar != null && (view = aVar.f122601a) != null) {
            view.setOnClickListener(null);
            ViewExtensionsKt.removeFromSuperview(view);
        }
        FrameLayout frameLayout = (FrameLayout) this.f122621k.remove(Integer.valueOf(i10));
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            ViewExtensionsKt.removeFromSuperview(frameLayout);
            this.f122622l.add(frameLayout);
        }
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e eVar = (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e) this.f122623m.get(Integer.valueOf(i10));
        if (eVar != null) {
            eVar.a();
        }
        this.f122623m.remove(Integer.valueOf(i10));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(BarcodePickViewHighlightStyle highlightStyle) {
        Intrinsics.j(highlightStyle, "highlightStyle");
        for (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e eVar : this.f122623m.values()) {
            eVar.getClass();
            Intrinsics.j(highlightStyle, "highlightStyle");
            eVar.f122703d = highlightStyle;
        }
    }

    public final FrameLayout a(Context context, int i10) {
        FrameLayout frameLayout = (FrameLayout) this.f122621k.get(Integer.valueOf(i10));
        if (frameLayout == null && (frameLayout = (FrameLayout) CollectionsKt.L(this.f122622l)) == null) {
            frameLayout = new FrameLayout(context);
            this.f122621k.put(Integer.valueOf(i10), frameLayout);
            if (frameLayout.getParent() == null) {
                this.f122611a.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        return frameLayout;
    }
}
