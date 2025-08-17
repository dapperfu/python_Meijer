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
/* loaded from: classes11.dex */
public final class C13101a implements BarcodeCountDataCaptureViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final DataCaptureView f121956a;

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountDataCaptureViewHolder
    public final void a(BarcodeCountBasicOverlay overlay) {
        Intrinsics.j(overlay, "overlay");
        this.f121956a.removeOverlay(overlay);
    }

    public C13101a(DataCaptureView dataCaptureView) {
        Intrinsics.j(dataCaptureView, "dataCaptureView");
        this.f121956a = dataCaptureView;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountDataCaptureViewHolder
    public final void a(ViewGroup container) {
        Intrinsics.j(container, "container");
        ViewParent parent = this.f121956a.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.f121956a);
        }
        container.addView(this.f121956a);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountDataCaptureViewHolder
    public final void b(BarcodeCountBasicOverlay overlay) {
        Intrinsics.j(overlay, "overlay");
        this.f121956a.addOverlay(overlay);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountDataCaptureViewHolder
    public final void a(RelativeLayout.LayoutParams layoutParams) {
        Intrinsics.j(layoutParams, "layoutParams");
        this.f121956a.setLayoutParams(layoutParams);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountDataCaptureViewHolder
    public final void a(HintHolderV2 hintHolder) {
        Intrinsics.j(hintHolder, "hintHolder");
        this.f121956a._overrideHintHolderV2(hintHolder);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountDataCaptureViewHolder
    public final void a(Control control, Anchor anchor, PointWithUnit offset) {
        Intrinsics.j(control, "control");
        Intrinsics.j(anchor, "anchor");
        Intrinsics.j(offset, "offset");
        this.f121956a.addControl(control, anchor, offset);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountDataCaptureViewHolder
    public final void a(Control control) {
        Intrinsics.j(control, "control");
        this.f121956a.removeControl(control);
    }
}
