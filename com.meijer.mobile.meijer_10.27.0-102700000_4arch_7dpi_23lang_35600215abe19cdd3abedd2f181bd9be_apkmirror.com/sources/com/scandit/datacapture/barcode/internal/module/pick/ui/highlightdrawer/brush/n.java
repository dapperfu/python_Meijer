package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.batch.data.TrackedObject;
import com.scandit.datacapture.barcode.internal.module.pick.ui.BarcodePickBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconStyle;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class n extends FrameLayout implements BarcodePickDrawer {

    /* renamed from: a, reason: collision with root package name */
    public BarcodePickViewHighlightStyle f122573a;

    /* renamed from: b, reason: collision with root package name */
    public final b f122574b;

    /* renamed from: c, reason: collision with root package name */
    public final j f122575c;

    /* renamed from: d, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ui.h f122576d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f122577e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f122578f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f122579g;

    /* renamed from: h, reason: collision with root package name */
    public final Function1 f122580h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f122581i;

    /* renamed from: j, reason: collision with root package name */
    public final List f122582j;

    /* renamed from: k, reason: collision with root package name */
    public final Map f122583k;

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final boolean a() {
        return false;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void b(TrackedObject track, BarcodePickState pickState) {
        Intrinsics.j(track, "track");
        Intrinsics.j(pickState, "pickState");
        a aVarA = ((i) this.f122574b).a(track, pickState, this.f122573a);
        this.f122577e.put(Integer.valueOf(track.getIdentifier()), aVarA);
        if (this.f122581i.get(Integer.valueOf(track.getIdentifier())) == null) {
            a(track, aVarA);
        } else {
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.viewholder.b bVar = (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.viewholder.b) this.f122581i.get(Integer.valueOf(track.getIdentifier()));
            if (bVar != null) {
                ((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.viewholder.c) bVar).a(aVarA);
            }
        }
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e eVar = (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e) this.f122583k.get(Integer.valueOf(track.getIdentifier()));
        if (eVar != null) {
            eVar.a(track, pickState);
        }
    }

    public n(BarcodePickBasicOverlay container, BarcodePickViewHighlightStyle highlightStyle, b drawDataFactory, j drawSettings, com.scandit.datacapture.barcode.internal.module.ui.h touchEventHandler, Map drawingData, Paint tapPaint, Paint boundingBoxPaint, Function1 statusIconViewDrawerProvider) {
        HashMap brushViewMap = new HashMap();
        ArrayList viewCachePool = new ArrayList();
        LinkedHashMap statusIconViewDrawers = new LinkedHashMap();
        Intrinsics.j(container, "container");
        Intrinsics.j(highlightStyle, "highlightStyle");
        Intrinsics.j(drawDataFactory, "drawDataFactory");
        Intrinsics.j(drawSettings, "drawSettings");
        Intrinsics.j(touchEventHandler, "touchEventHandler");
        Intrinsics.j(drawingData, "drawingData");
        Intrinsics.j(tapPaint, "tapPaint");
        Intrinsics.j(boundingBoxPaint, "boundingBoxPaint");
        Intrinsics.j(statusIconViewDrawerProvider, "statusIconViewDrawerProvider");
        Intrinsics.j(brushViewMap, "brushViewMap");
        Intrinsics.j(viewCachePool, "viewCachePool");
        Intrinsics.j(statusIconViewDrawers, "statusIconViewDrawers");
        super(container.getContext());
        this.f122573a = highlightStyle;
        this.f122574b = drawDataFactory;
        this.f122575c = drawSettings;
        this.f122576d = touchEventHandler;
        this.f122577e = drawingData;
        this.f122578f = tapPaint;
        this.f122579g = boundingBoxPaint;
        this.f122580h = statusIconViewDrawerProvider;
        this.f122581i = brushViewMap;
        this.f122582j = viewCachePool;
        this.f122583k = statusIconViewDrawers;
        container.addView(this, new FrameLayout.LayoutParams(-1, -1));
        setElevation(PixelExtensionsKt.pxFromDp$default(4.0f, (Context) null, 1, (Object) null));
        setClickable(true);
        setImportantForAccessibility(2);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(List tracks) {
        Intrinsics.j(tracks, "tracks");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.j(event, "event");
        return ((com.scandit.datacapture.barcode.internal.module.ui.i) this.f122576d).a(event);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void start() {
        for (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e eVar : this.f122583k.values()) {
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
        Iterator it = this.f122581i.entrySet().iterator();
        while (it.hasNext()) {
            removeView(((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.viewholder.c) ((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.viewholder.b) ((Map.Entry) it.next()).getValue())).f122596a);
        }
        Iterator it2 = this.f122583k.entrySet().iterator();
        while (it2.hasNext()) {
            ((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e) ((Map.Entry) it2.next()).getValue()).a();
        }
        this.f122582j.clear();
        this.f122577e.clear();
        this.f122581i.clear();
        Iterator it3 = this.f122583k.values().iterator();
        while (it3.hasNext()) {
            ((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e) it3.next()).a();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(TrackedObject track, BarcodePickState pickState) {
        Intrinsics.j(track, "track");
        Intrinsics.j(pickState, "pickState");
        if (this.f122581i.containsKey(Integer.valueOf(track.getIdentifier()))) {
            b(track, pickState);
            return;
        }
        a aVarA = ((i) this.f122574b).a(track, pickState, this.f122573a);
        this.f122577e.put(Integer.valueOf(track.getIdentifier()), aVarA);
        Unit unit = Unit.f142422a;
        a(track, aVarA);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void b() {
        Iterator it = this.f122583k.values().iterator();
        while (it.hasNext()) {
            ((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e) it.next()).f122706g = true;
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(BarcodePickViewHighlightStyle highlightStyle) {
        Intrinsics.j(highlightStyle, "highlightStyle");
        this.f122573a = highlightStyle;
        for (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e eVar : this.f122583k.values()) {
            eVar.getClass();
            Intrinsics.j(highlightStyle, "highlightStyle");
            eVar.f122703d = highlightStyle;
        }
    }

    public final void a(TrackedObject track, a initialDrawData) {
        n nVar;
        a aVar;
        BarcodePickStatusIconStyle barcodePickStatusIconStyleA;
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.viewholder.b cVar = (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.viewholder.b) CollectionsKt.L(this.f122582j);
        if (cVar == null) {
            j drawSettings = this.f122575c;
            Paint tapPaint = this.f122578f;
            Paint boundingBoxPaint = this.f122579g;
            Intrinsics.j(this, "container");
            Intrinsics.j(initialDrawData, "initialDrawData");
            Intrinsics.j(drawSettings, "drawSettings");
            Intrinsics.j(tapPaint, "tapPaint");
            Intrinsics.j(boundingBoxPaint, "boundingBoxPaint");
            nVar = this;
            aVar = initialDrawData;
            cVar = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.viewholder.c(nVar, aVar, drawSettings, tapPaint, boundingBoxPaint);
        } else {
            nVar = this;
            aVar = initialDrawData;
        }
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.viewholder.c cVar2 = (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.viewholder.c) cVar;
        addView(cVar2.f122596a, new ViewGroup.LayoutParams(-1, -1));
        cVar2.a(aVar);
        nVar.f122581i.put(Integer.valueOf(track.getIdentifier()), cVar);
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e eVar = (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e) nVar.f122580h.invoke(cVar2.f122596a);
        if (eVar != null) {
            l block = new l(this);
            Intrinsics.j(block, "block");
            eVar.f122709j = block;
            BarcodePickState pickState = aVar.f122552e;
            Intrinsics.j(track, "track");
            Intrinsics.j(pickState, "pickState");
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.h hVar = eVar.f122707h;
            BarcodePickState barcodePickState = hVar != null ? hVar.f122731l : null;
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.i iVarA = eVar.f122702c.a(track.getData(), pickState, barcodePickState);
            if (iVarA != null && (barcodePickStatusIconStyleA = iVarA.a()) != null) {
                eVar.a(track, barcodePickStatusIconStyleA, eVar.f122704e.a(track, pickState, barcodePickState));
            }
            eVar.f122708i = new m(this);
            nVar.f122583k.put(Integer.valueOf(track.getIdentifier()), eVar);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(int i10) {
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e eVar = (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e) this.f122583k.remove(Integer.valueOf(i10));
        if (eVar != null) {
            eVar.a();
        }
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.viewholder.b bVar = (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.viewholder.b) this.f122581i.remove(Integer.valueOf(i10));
        if (bVar != null) {
            removeView(((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.viewholder.c) bVar).f122596a);
            this.f122582j.add(bVar);
        }
        this.f122577e.remove(Integer.valueOf(i10));
    }
}
