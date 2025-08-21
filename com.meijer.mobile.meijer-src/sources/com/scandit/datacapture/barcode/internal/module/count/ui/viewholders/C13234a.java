package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.control.Control;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13234a implements BarcodeCountDataCaptureViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final DataCaptureView f122908a;

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountDataCaptureViewHolder
    public final void a(BarcodeCountBasicOverlay overlay) {
        Intrinsics.j(overlay, "overlay");
        this.f122908a.removeOverlay(overlay);
    }

    public C13234a(DataCaptureView dataCaptureView) {
        Intrinsics.j(dataCaptureView, "dataCaptureView");
        this.f122908a = dataCaptureView;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountDataCaptureViewHolder
    public final void a(ViewGroup container) {
        Intrinsics.j(container, "container");
        ViewParent parent = this.f122908a.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.f122908a);
        }
        container.addView(this.f122908a);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountDataCaptureViewHolder
    public final void b(BarcodeCountBasicOverlay overlay) {
        Intrinsics.j(overlay, "overlay");
        this.f122908a.addOverlay(overlay);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountDataCaptureViewHolder
    public final void a(RelativeLayout.LayoutParams layoutParams) {
        Intrinsics.j(layoutParams, "layoutParams");
        this.f122908a.setLayoutParams(layoutParams);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountDataCaptureViewHolder
    public final void a(HintHolderV2 hintHolder) {
        Intrinsics.j(hintHolder, "hintHolder");
        this.f122908a._overrideHintHolderV2(hintHolder);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountDataCaptureViewHolder
    public final void a(Control control, Anchor anchor, PointWithUnit offset) {
        Intrinsics.j(control, "control");
        Intrinsics.j(anchor, "anchor");
        Intrinsics.j(offset, "offset");
        this.f122908a.addControl(control, anchor, offset);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountDataCaptureViewHolder
    public final void a(Control control) {
        Intrinsics.j(control, "control");
        this.f122908a.removeControl(control);
    }
}
