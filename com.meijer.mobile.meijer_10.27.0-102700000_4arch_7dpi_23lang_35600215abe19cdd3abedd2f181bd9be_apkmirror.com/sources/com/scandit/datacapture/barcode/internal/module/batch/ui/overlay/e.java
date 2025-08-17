package com.scandit.datacapture.barcode.internal.module.batch.ui.overlay;

import android.view.ViewGroup;
import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.Augmentation;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.Transformation;
import com.scandit.datacapture.core.internal.sdk.utils.ObjectOverlayUtilsKt;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class e extends TrackedObjectAugmenter {

    /* renamed from: j, reason: collision with root package name */
    public boolean f121270j;

    /* renamed from: k, reason: collision with root package name */
    public final d f121271k;

    public static void a(e eVar) {
        if (eVar.f121270j) {
            return;
        }
        Iterator it = eVar.getAugmentations().values().iterator();
        while (it.hasNext()) {
            eVar.a((Augmentation) it.next());
        }
        eVar.getHost().postDelayed(30L, eVar.f121271k);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter
    public final void correctViewPositions(Transformation transformation) {
        Intrinsics.j(transformation, "transformation");
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter
    public final void onHostAttachedToWindow() {
        this.f121270j = false;
        getHost().postDelayed(30L, this.f121271k);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter
    public final void onHostDetachedFromWindow() {
        this.f121270j = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TrackedObjectAugmenter.Host host) {
        super(host);
        Intrinsics.j(host, "host");
        this.f121270j = true;
        Transformation.INSTANCE.getID();
        this.f121271k = new d(this);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter
    public final String getTrackingId(Object obj) {
        TrackedBarcode trackedBarcode = (TrackedBarcode) obj;
        Intrinsics.j(trackedBarcode, "<this>");
        return String.valueOf(trackedBarcode.getIdentifier());
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter
    public final void onAugmentationAdded(Augmentation augmentation) {
        Intrinsics.j(augmentation, "augmentation");
        Transformation.INSTANCE.getID();
        ViewGroup containerView = augmentation.getContainerView();
        if (containerView != null) {
            containerView.addOnLayoutChangeListener(new c(new b(this, augmentation)));
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter
    public final void onAugmentationRemoved(Augmentation augmentation) {
        Intrinsics.j(augmentation, "augmentation");
        Transformation.INSTANCE.getID();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter
    public final void onAugmentationUpdated(Augmentation augmentation) {
        Intrinsics.j(augmentation, "augmentation");
        Transformation.INSTANCE.getID();
    }

    public final void a(Augmentation augmentation) {
        ViewGroup containerView = augmentation.getContainerView();
        if (containerView == null) {
            return;
        }
        Point anchorPositionIgnoringLicense = ((TrackedBarcode) augmentation.getTrackedObject()).getF120470a().getAnchorPositionIgnoringLicense(augmentation.getAnchor());
        TrackedObjectAugmenter.Host host = getHost();
        Intrinsics.g(anchorPositionIgnoringLicense);
        Point pointCalculateViewTopLeft = getObjectOverlayUtils().calculateViewTopLeft(host.mapFramePointToView(anchorPositionIgnoringLicense), augmentation.getOffset(), ObjectOverlayUtilsKt.getSize(containerView));
        containerView.setX(pointCalculateViewTopLeft.getX());
        containerView.setY(pointCalculateViewTopLeft.getY());
    }
}
