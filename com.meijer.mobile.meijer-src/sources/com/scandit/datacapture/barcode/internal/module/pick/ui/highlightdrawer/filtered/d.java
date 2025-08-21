package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.filtered;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.batch.data.TrackedObject;
import com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterHighlightSettings;
import com.scandit.datacapture.barcode.internal.module.pick.ui.BarcodePickBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.m;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickBrush;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.k;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.p;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.ui.style.Brush;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class d extends View implements BarcodePickDrawer {

    /* renamed from: a, reason: collision with root package name */
    public final b f123597a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f123598b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f123599c;

    /* renamed from: d, reason: collision with root package name */
    public List f123600d;

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(int i10) {
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void b(TrackedObject track, BarcodePickState pickState) {
        Intrinsics.j(track, "track");
        Intrinsics.j(pickState, "pickState");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void start() {
        this.f123599c = true;
        invalidate();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void stop() {
        this.f123599c = false;
        this.f123598b.clear();
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BarcodePickBasicOverlay container, b drawDataFactory, Map drawingData) {
        super(container.getContext());
        Intrinsics.j(container, "container");
        Intrinsics.j(drawDataFactory, "drawDataFactory");
        Intrinsics.j(drawingData, "drawingData");
        this.f123597a = drawDataFactory;
        this.f123598b = drawingData;
        container.addView(this, new FrameLayout.LayoutParams(-1, -1));
        setClickable(false);
        this.f123600d = CollectionsKt.m();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final boolean a() {
        return false;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void b() {
        this.f123599c = true;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.j(canvas, "canvas");
        if (this.f123599c) {
            for (a aVar : this.f123598b.values()) {
                m mVar = aVar.f123593a;
                if (mVar != null) {
                    canvas.drawPath(aVar.f123594b.f123603a, mVar.f123612a);
                    canvas.drawPath(aVar.f123594b.f123603a, mVar.f123613b);
                }
            }
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(TrackedObject track, BarcodePickState pickState) {
        Intrinsics.j(track, "track");
        Intrinsics.j(pickState, "pickState");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(BarcodePickViewHighlightStyle highlightStyle) {
        Intrinsics.j(highlightStyle, "highlightStyle");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(List tracks) {
        BarcodePickBrush pVar;
        Intrinsics.j(tracks, "tracks");
        if (this.f123599c) {
            Iterator it = tracks.iterator();
            while (it.hasNext()) {
                TrackedObject track = (TrackedObject) it.next();
                Map map = this.f123598b;
                Integer numValueOf = Integer.valueOf(track.getIdentifier());
                c cVar = (c) this.f123597a;
                cVar.getClass();
                Intrinsics.j(track, "track");
                BarcodeFilterHighlightSettings barcodeFilterHighlightSettings = cVar.f123596b.f123602b;
                Brush brush = barcodeFilterHighlightSettings != null ? barcodeFilterHighlightSettings.getBrush() : null;
                if (brush == null) {
                    pVar = k.f123731b;
                } else {
                    Intrinsics.j(brush, "brush");
                    pVar = new p(brush);
                }
                Quadrilateral quadrilateralA = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.k.a((Quadrilateral) cVar.f123595a.invoke(track.getLocationIgnoringLicense$scandit_barcode_capture()), cVar.f123596b.f123601a);
                Intrinsics.j(pVar, "<this>");
                map.put(numValueOf, new a(com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.a.a(pVar, CollectionsKt.m()), new h(quadrilateralA)));
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.x(tracks, 10));
            Iterator it2 = tracks.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(((TrackedObject) it2.next()).getIdentifier()));
            }
            List list = this.f123600d;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (!arrayList.contains(Integer.valueOf(((Number) obj).intValue()))) {
                    arrayList2.add(obj);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                this.f123598b.remove(Integer.valueOf(((Number) it3.next()).intValue()));
            }
            this.f123600d = arrayList;
            invalidate();
        }
    }
}
