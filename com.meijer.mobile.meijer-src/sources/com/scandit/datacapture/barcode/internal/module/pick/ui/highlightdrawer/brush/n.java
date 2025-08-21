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

/* loaded from: classes12.dex */
public final class n extends FrameLayout implements BarcodePickDrawer {

    /* renamed from: a, reason: collision with root package name */
    public BarcodePickViewHighlightStyle f123525a;

    /* renamed from: b, reason: collision with root package name */
    public final b f123526b;

    /* renamed from: c, reason: collision with root package name */
    public final j f123527c;

    /* renamed from: d, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ui.h f123528d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f123529e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f123530f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f123531g;

    /* renamed from: h, reason: collision with root package name */
    public final Function1 f123532h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f123533i;

    /* renamed from: j, reason: collision with root package name */
    public final List f123534j;

    /* renamed from: k, reason: collision with root package name */
    public final Map f123535k;

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final boolean a() {
        return false;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void b(TrackedObject track, BarcodePickState pickState) {
        Intrinsics.j(track, "track");
        Intrinsics.j(pickState, "pickState");
        a aVarA = ((i) this.f123526b).a(track, pickState, this.f123525a);
        this.f123529e.put(Integer.valueOf(track.getIdentifier()), aVarA);
        if (this.f123533i.get(Integer.valueOf(track.getIdentifier())) == null) {
            a(track, aVarA);
        } else {
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.viewholder.b bVar = (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.viewholder.b) this.f123533i.get(Integer.valueOf(track.getIdentifier()));
            if (bVar != null) {
                ((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.viewholder.c) bVar).a(aVarA);
            }
        }
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e eVar = (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e) this.f123535k.get(Integer.valueOf(track.getIdentifier()));
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
        this.f123525a = highlightStyle;
        this.f123526b = drawDataFactory;
        this.f123527c = drawSettings;
        this.f123528d = touchEventHandler;
        this.f123529e = drawingData;
        this.f123530f = tapPaint;
        this.f123531g = boundingBoxPaint;
        this.f123532h = statusIconViewDrawerProvider;
        this.f123533i = brushViewMap;
        this.f123534j = viewCachePool;
        this.f123535k = statusIconViewDrawers;
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
        return ((com.scandit.datacapture.barcode.internal.module.ui.i) this.f123528d).a(event);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void start() {
        for (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e eVar : this.f123535k.values()) {
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
        Iterator it = this.f123533i.entrySet().iterator();
        while (it.hasNext()) {
            removeView(((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.viewholder.c) ((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.viewholder.b) ((Map.Entry) it.next()).getValue())).f123548a);
        }
        Iterator it2 = this.f123535k.entrySet().iterator();
        while (it2.hasNext()) {
            ((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e) ((Map.Entry) it2.next()).getValue()).a();
        }
        this.f123534j.clear();
        this.f123529e.clear();
        this.f123533i.clear();
        Iterator it3 = this.f123535k.values().iterator();
        while (it3.hasNext()) {
            ((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e) it3.next()).a();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(TrackedObject track, BarcodePickState pickState) {
        Intrinsics.j(track, "track");
        Intrinsics.j(pickState, "pickState");
        if (this.f123533i.containsKey(Integer.valueOf(track.getIdentifier()))) {
            b(track, pickState);
            return;
        }
        a aVarA = ((i) this.f123526b).a(track, pickState, this.f123525a);
        this.f123529e.put(Integer.valueOf(track.getIdentifier()), aVarA);
        Unit unit = Unit.f143329a;
        a(track, aVarA);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void b() {
        Iterator it = this.f123535k.values().iterator();
        while (it.hasNext()) {
            ((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e) it.next()).f123658g = true;
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(BarcodePickViewHighlightStyle highlightStyle) {
        Intrinsics.j(highlightStyle, "highlightStyle");
        this.f123525a = highlightStyle;
        for (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e eVar : this.f123535k.values()) {
            eVar.getClass();
            Intrinsics.j(highlightStyle, "highlightStyle");
            eVar.f123655d = highlightStyle;
        }
    }

    public final void a(TrackedObject track, a initialDrawData) {
        n nVar;
        a aVar;
        BarcodePickStatusIconStyle barcodePickStatusIconStyleA;
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.viewholder.b cVar = (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.viewholder.b) CollectionsKt.L(this.f123534j);
        if (cVar == null) {
            j drawSettings = this.f123527c;
            Paint tapPaint = this.f123530f;
            Paint boundingBoxPaint = this.f123531g;
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
        addView(cVar2.f123548a, new ViewGroup.LayoutParams(-1, -1));
        cVar2.a(aVar);
        nVar.f123533i.put(Integer.valueOf(track.getIdentifier()), cVar);
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e eVar = (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e) nVar.f123532h.invoke(cVar2.f123548a);
        if (eVar != null) {
            l block = new l(this);
            Intrinsics.j(block, "block");
            eVar.f123661j = block;
            BarcodePickState pickState = aVar.f123504e;
            Intrinsics.j(track, "track");
            Intrinsics.j(pickState, "pickState");
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.h hVar = eVar.f123659h;
            BarcodePickState barcodePickState = hVar != null ? hVar.f123683l : null;
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.i iVarA = eVar.f123654c.a(track.getData(), pickState, barcodePickState);
            if (iVarA != null && (barcodePickStatusIconStyleA = iVarA.a()) != null) {
                eVar.a(track, barcodePickStatusIconStyleA, eVar.f123656e.a(track, pickState, barcodePickState));
            }
            eVar.f123660i = new m(this);
            nVar.f123535k.put(Integer.valueOf(track.getIdentifier()), eVar);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(int i10) {
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e eVar = (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e) this.f123535k.remove(Integer.valueOf(i10));
        if (eVar != null) {
            eVar.a();
        }
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.viewholder.b bVar = (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.viewholder.b) this.f123533i.remove(Integer.valueOf(i10));
        if (bVar != null) {
            removeView(((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.viewholder.c) bVar).f123548a);
            this.f123534j.add(bVar);
        }
        this.f123529e.remove(Integer.valueOf(i10));
    }
}
