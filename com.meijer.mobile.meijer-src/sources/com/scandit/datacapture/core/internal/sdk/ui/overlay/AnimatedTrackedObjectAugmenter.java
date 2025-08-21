package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import android.view.View;
import android.view.ViewGroup;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter;
import com.scandit.datacapture.core.internal.sdk.utils.ObjectOverlayUtilsKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u0017*\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H$¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/AnimatedTrackedObjectAugmenter;", "T", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter;", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter$Host;", "host", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter$Host;)V", "trackedObject", "Landroid/view/View;", "view", "", "setViewForTrackedObject", "(Ljava/lang/Object;Landroid/view/View;)V", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/Augmentation;", "augmentation", "onAugmentationAdded", "(Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/Augmentation;)V", "onAugmentationUpdated", "onAugmentationRemoved", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/Transformation;", "transformation", "correctViewPositions", "(Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/Transformation;)V", "Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "getViewLocation", "(Ljava/lang/Object;Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/Transformation;)Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public abstract class AnimatedTrackedObjectAugmenter<T> extends TrackedObjectAugmenter<T> {

    /* renamed from: j, reason: collision with root package name */
    private final LinkedHashMap f126706j;

    protected abstract Quadrilateral getViewLocation(T t10, Transformation transformation);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedTrackedObjectAugmenter(TrackedObjectAugmenter.Host<T> host) {
        super(host);
        Intrinsics.j(host, "host");
        this.f126706j = new LinkedHashMap();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter
    public void correctViewPositions(Transformation transformation) {
        Intrinsics.j(transformation, "transformation");
        Iterator<Augmentation<T>> it = getAugmentations().values().iterator();
        while (it.hasNext()) {
            a(it.next(), transformation);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter
    protected void onAugmentationAdded(Augmentation<T> augmentation) {
        Intrinsics.j(augmentation, "augmentation");
        getHost().post(new a(augmentation, this));
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter
    protected void onAugmentationRemoved(Augmentation<T> augmentation) {
        Intrinsics.j(augmentation, "augmentation");
        this.f126706j.remove(augmentation);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter
    protected void onAugmentationUpdated(Augmentation<T> augmentation) {
        Intrinsics.j(augmentation, "augmentation");
        a(augmentation, Transformation.INSTANCE.getID());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Augmentation augmentation, Transformation transformation) {
        ViewGroup containerView = augmentation.getContainerView();
        if (containerView != null) {
            if (this.f126706j.get(augmentation) == null) {
                this.f126706j.put(augmentation, new AugmentationAnimation(containerView, getObjectOverlayUtils().getObjectOverlayPosition(getViewLocation(augmentation.getTrackedObject(), transformation), ObjectOverlayUtilsKt.getSize(augmentation.getContainerView()), augmentation.getAnchor(), augmentation.getOffset())));
            }
            AugmentationAnimation augmentationAnimation = (AugmentationAnimation) this.f126706j.get(augmentation);
            if (augmentationAnimation != null) {
                augmentationAnimation.animateTo(getObjectOverlayUtils().getObjectOverlayPosition(getViewLocation(augmentation.getTrackedObject(), transformation), ObjectOverlayUtilsKt.getSize(augmentation.getContainerView()), augmentation.getAnchor(), augmentation.getOffset()));
            }
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter
    public void setViewForTrackedObject(T trackedObject, View view) {
        super.setViewForTrackedObject(trackedObject, view);
        Augmentation<T> augmentation = getAugmentations().get(getTrackingId(trackedObject));
        if (augmentation != null) {
        }
    }
}
