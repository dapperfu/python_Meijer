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

/* loaded from: classes12.dex */
public final class f extends FrameLayout implements BarcodePickDrawer {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f123563a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f123564b;

    /* renamed from: c, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ui.h f123565c;

    /* renamed from: d, reason: collision with root package name */
    public final BarcodePickViewHighlightStyle f123566d;

    /* renamed from: e, reason: collision with root package name */
    public final j f123567e;

    /* renamed from: f, reason: collision with root package name */
    public final b f123568f;

    /* renamed from: g, reason: collision with root package name */
    public final BarcodePickElementsCache f123569g;

    /* renamed from: h, reason: collision with root package name */
    public final Function1 f123570h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f123571i;

    /* renamed from: j, reason: collision with root package name */
    public final Map f123572j;

    /* renamed from: k, reason: collision with root package name */
    public final Map f123573k;

    /* renamed from: l, reason: collision with root package name */
    public final List f123574l;

    /* renamed from: m, reason: collision with root package name */
    public final Map f123575m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f123576n;

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final boolean a() {
        return false;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void b(TrackedObject track, BarcodePickState pickState) {
        Intrinsics.j(track, "track");
        Intrinsics.j(pickState, "pickState");
        if (this.f123576n) {
            c(track, pickState);
            invalidate();
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e eVar = (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e) this.f123575m.get(Integer.valueOf(track.getIdentifier()));
            if (eVar != null) {
                eVar.a(track, pickState);
            }
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void start() {
        this.f123576n = true;
        invalidate();
        for (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e eVar : this.f123575m.values()) {
            eVar.f123658g = false;
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.h hVar = eVar.f123659h;
            if (hVar != null) {
                com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.b onFinished = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.b.f123666a;
                Intrinsics.j(onFinished, "onFinished");
                if (hVar.f123686o == com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.a.f123663b) {
                    hVar.a(com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.a.f123662a, onFinished);
                } else {
                    onFinished.invoke();
                }
            }
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void stop() {
        this.f123576n = false;
        Iterator it = this.f123572j.values().iterator();
        while (it.hasNext()) {
            View view = ((a) it.next()).f123553a;
            view.setOnClickListener(null);
            ViewExtensionsKt.removeFromSuperview(view);
        }
        this.f123572j.clear();
        Iterator it2 = this.f123575m.values().iterator();
        while (it2.hasNext()) {
            ((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e) it2.next()).a();
        }
        this.f123575m.clear();
        Iterator it3 = this.f123575m.values().iterator();
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
        this.f123563a = container;
        this.f123564b = z10;
        this.f123565c = touchEventHandler;
        this.f123566d = highlightStyle;
        this.f123567e = drawSettings;
        this.f123568f = drawDataFactory;
        this.f123569g = cache;
        this.f123570h = statusIconViewDrawerProvider;
        this.f123571i = tapPaint;
        this.f123572j = drawingData;
        this.f123573k = viewContainers;
        this.f123574l = viewContainerCache;
        this.f123575m = statusIconViewDrawers;
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
        if (this.f123576n && this.f123567e.f123580a) {
            Iterator it = this.f123572j.values().iterator();
            while (it.hasNext()) {
                canvas.drawPath(((a) it.next()).f123555c.f123543b, this.f123571i);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.j(event, "event");
        return ((com.scandit.datacapture.barcode.internal.module.ui.i) this.f123565c).a(event);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(TrackedObject track, BarcodePickState pickState) {
        Intrinsics.j(track, "track");
        Intrinsics.j(pickState, "pickState");
        if (this.f123576n) {
            c(track, pickState);
            invalidate();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void b() {
        this.f123576n = true;
        invalidate();
        Iterator it = this.f123575m.values().iterator();
        while (it.hasNext()) {
            ((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e) it.next()).f123658g = true;
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(int i10) {
        if (this.f123576n) {
            b(i10);
            invalidate();
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e eVar = (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e) this.f123575m.get(Integer.valueOf(i10));
            if (eVar != null) {
                eVar.a();
            }
        }
    }

    public final void b(int i10) {
        View view;
        a aVar = (a) this.f123572j.remove(Integer.valueOf(i10));
        if (aVar != null && (view = aVar.f123553a) != null) {
            view.setOnClickListener(null);
            ViewExtensionsKt.removeFromSuperview(view);
        }
        FrameLayout frameLayout = (FrameLayout) this.f123573k.remove(Integer.valueOf(i10));
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            ViewExtensionsKt.removeFromSuperview(frameLayout);
            this.f123574l.add(frameLayout);
        }
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e eVar = (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e) this.f123575m.get(Integer.valueOf(i10));
        if (eVar != null) {
            eVar.a();
        }
        this.f123575m.remove(Integer.valueOf(i10));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(BarcodePickViewHighlightStyle highlightStyle) {
        Intrinsics.j(highlightStyle, "highlightStyle");
        for (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e eVar : this.f123575m.values()) {
            eVar.getClass();
            Intrinsics.j(highlightStyle, "highlightStyle");
            eVar.f123655d = highlightStyle;
        }
    }

    public final FrameLayout a(Context context, int i10) {
        FrameLayout frameLayout = (FrameLayout) this.f123573k.get(Integer.valueOf(i10));
        if (frameLayout == null && (frameLayout = (FrameLayout) CollectionsKt.L(this.f123574l)) == null) {
            frameLayout = new FrameLayout(context);
            this.f123573k.put(Integer.valueOf(i10), frameLayout);
            if (frameLayout.getParent() == null) {
                this.f123563a.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        return frameLayout;
    }
}
