package com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.control.Control;
import com.scandit.datacapture.core.ui.control.LinearControlGroupBuilder;
import com.scandit.datacapture.core.ui.control.LinearControlGroupOrientation;
import com.scandit.datacapture.core.ui.control.TorchSwitchControl;
import com.scandit.datacapture.core.ui.control.ZoomSwitchControl;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class j implements BarcodePickDataCaptureViewWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final g f122506a;

    /* renamed from: b, reason: collision with root package name */
    public final BarcodePickViewSettings f122507b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f122508c;

    /* renamed from: d, reason: collision with root package name */
    public final f f122509d;

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.BarcodePickDataCaptureViewWrapper
    public final void a(com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.f listener) {
        Intrinsics.j(listener, "listener");
        ((DataCaptureView) this.f122508c.getValue()).addListener(listener);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.BarcodePickDataCaptureViewWrapper
    public final void b(DataCaptureOverlay overlay) {
        Intrinsics.j(overlay, "overlay");
        ((DataCaptureView) this.f122508c.getValue()).addOverlay(overlay);
    }

    public j(Context context, h factory, BarcodePickViewSettings settings) {
        Intrinsics.j(context, "context");
        Intrinsics.j(factory, "factory");
        Intrinsics.j(settings, "settings");
        this.f122506a = factory;
        this.f122507b = settings;
        this.f122508c = LazyKt.b(new i(this));
        Intrinsics.j(context, "context");
        this.f122509d = new f(context);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.BarcodePickDataCaptureViewWrapper
    public final Quadrilateral mapFrameQuadrilateralToView(Quadrilateral quadrilateral) {
        Intrinsics.j(quadrilateral, "quadrilateral");
        return ((DataCaptureView) this.f122508c.getValue()).mapFrameQuadrilateralToView(quadrilateral);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.BarcodePickDataCaptureViewWrapper
    public final void a(ViewGroup container, RelativeLayout.LayoutParams params) {
        Intrinsics.j(container, "container");
        Intrinsics.j(params, "params");
        container.addView((DataCaptureView) this.f122508c.getValue(), params);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.BarcodePickDataCaptureViewWrapper
    public final void b() {
        Control controlBuild;
        PointWithUnit pointWithUnit;
        LinearControlGroupOrientation linearControlGroupOrientation;
        f fVar = this.f122509d;
        BarcodePickViewSettings settings = this.f122507b;
        Context context = ((DataCaptureView) this.f122508c.getValue()).getContext();
        Intrinsics.i(context, "getContext(...)");
        boolean zA = com.scandit.datacapture.barcode.internal.module.extensions.b.a(context);
        fVar.getClass();
        Intrinsics.j(settings, "settings");
        TorchSwitchControl torchSwitchControl = (TorchSwitchControl) fVar.f122502c.getValue();
        boolean showTorchButton = settings.getShowTorchButton();
        Anchor torchButtonPosition = settings.getTorchButtonPosition();
        if (!f.f122495j.contains(torchButtonPosition)) {
            torchButtonPosition = null;
        }
        if (torchButtonPosition == null) {
            torchButtonPosition = f.f122498m;
        }
        if (zA && (torchButtonPosition = (Anchor) f.f122496k.get(torchButtonPosition)) == null) {
            torchButtonPosition = f.f122499n;
        }
        a aVar = new a(torchSwitchControl, showTorchButton, torchButtonPosition);
        ZoomSwitchControl zoomSwitchControl = (ZoomSwitchControl) fVar.f122501b.getValue();
        boolean showZoomButton = settings.getShowZoomButton();
        Anchor zoomButtonPosition = settings.getZoomButtonPosition();
        Anchor anchor = f.f122494i.contains(zoomButtonPosition) ? zoomButtonPosition : null;
        if (anchor == null) {
            anchor = f.f122497l;
        }
        if (zA && (anchor = (Anchor) f.f122496k.get(anchor)) == null) {
            anchor = f.f122499n;
        }
        List listP = CollectionsKt.p(aVar, new a(zoomSwitchControl, showZoomButton, anchor));
        ViewExtensionsKt.removeFromSuperview(((ZoomSwitchControl) fVar.f122501b.getValue()).get_view());
        ViewExtensionsKt.removeFromSuperview(((TorchSwitchControl) fVar.f122502c.getValue()).get_view());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP) {
            if (((a) obj).f122484b) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Anchor anchor2 = ((a) next).f122485c;
            Object arrayList2 = linkedHashMap.get(anchor2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(anchor2, arrayList2);
            }
            ((List) arrayList2).add(next);
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Anchor anchor3 = (Anchor) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() > 1) {
                LinearControlGroupBuilder linearControlGroupBuilder = (LinearControlGroupBuilder) fVar.f122503d.getValue();
                if (zA) {
                    linearControlGroupOrientation = LinearControlGroupOrientation.HORIZONTAL;
                } else {
                    linearControlGroupOrientation = LinearControlGroupOrientation.VERTICAL;
                }
                LinearControlGroupBuilder orientation = linearControlGroupBuilder.setOrientation(linearControlGroupOrientation);
                ArrayList arrayList4 = new ArrayList(CollectionsKt.x(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((a) it2.next()).f122483a);
                }
                controlBuild = orientation.setControls(arrayList4).build();
            } else {
                controlBuild = ((a) CollectionsKt.s0(list)).f122483a;
            }
            if (anchor3 == Anchor.TOP_CENTER) {
                pointWithUnit = f.f122491f;
            } else if (anchor3 == Anchor.CENTER_LEFT) {
                pointWithUnit = f.f122492g;
            } else {
                int i10 = b.f122486a[anchor3.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    pointWithUnit = f.f122490e;
                } else {
                    pointWithUnit = f.f122493h;
                }
            }
            arrayList3.add(new k(controlBuild, anchor3, pointWithUnit));
        }
        ArrayList arrayList5 = new ArrayList(CollectionsKt.x(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((k) it3.next()).f122510a);
        }
        fVar.f122500a = arrayList5;
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            k kVar = (k) it4.next();
            ((DataCaptureView) this.f122508c.getValue()).addControl(kVar.f122510a, kVar.f122511b, kVar.f122512c);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.BarcodePickDataCaptureViewWrapper
    public final void a(DataCaptureOverlay overlay) {
        Intrinsics.j(overlay, "overlay");
        ((DataCaptureView) this.f122508c.getValue()).removeOverlay(overlay);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.BarcodePickDataCaptureViewWrapper
    public final void a(DataCaptureContext dataCaptureContext) {
        ((DataCaptureView) this.f122508c.getValue()).setDataCaptureContext(dataCaptureContext);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.BarcodePickDataCaptureViewWrapper
    public final void a(float f10) {
        ViewParent parent = ((DataCaptureView) this.f122508c.getValue()).getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        int height = viewGroup.getHeight();
        int width = viewGroup.getWidth();
        if (height > width) {
            height = (int) (width * f10);
        } else {
            width = (int) (height * f10);
        }
        DataCaptureView dataCaptureView = (DataCaptureView) this.f122508c.getValue();
        ViewGroup.LayoutParams layoutParams = ((DataCaptureView) this.f122508c.getValue()).getLayoutParams();
        layoutParams.height = height;
        layoutParams.width = width;
        dataCaptureView.setLayoutParams(layoutParams);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.BarcodePickDataCaptureViewWrapper
    public final void a() {
        List list = this.f122509d.f122500a;
        DataCaptureView dataCaptureView = (DataCaptureView) this.f122508c.getValue();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dataCaptureView.removeControl((Control) it.next());
        }
    }
}
