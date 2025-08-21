package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import android.view.ViewGroup;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0003\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/Augmentation;", "T", "", "trackedObject", "Landroid/view/ViewGroup;", "containerView", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "offset", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "anchor", "<init>", "(Ljava/lang/Object;Landroid/view/ViewGroup;Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;Lcom/scandit/datacapture/core/common/geometry/Anchor;)V", "a", "Ljava/lang/Object;", "getTrackedObject", "()Ljava/lang/Object;", "setTrackedObject", "(Ljava/lang/Object;)V", "b", "Landroid/view/ViewGroup;", "getContainerView", "()Landroid/view/ViewGroup;", "setContainerView", "(Landroid/view/ViewGroup;)V", "c", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "getOffset", "()Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "setOffset", "(Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;)V", "d", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "getAnchor", "()Lcom/scandit/datacapture/core/common/geometry/Anchor;", "setAnchor", "(Lcom/scandit/datacapture/core/common/geometry/Anchor;)V", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class Augmentation<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Object trackedObject;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private ViewGroup containerView;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private PointWithUnit offset;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Anchor anchor;

    public Augmentation(T t10, ViewGroup viewGroup, PointWithUnit offset, Anchor anchor) {
        Intrinsics.j(offset, "offset");
        Intrinsics.j(anchor, "anchor");
        this.trackedObject = t10;
        this.containerView = viewGroup;
        this.offset = offset;
        this.anchor = anchor;
    }

    public final Anchor getAnchor() {
        return this.anchor;
    }

    public final ViewGroup getContainerView() {
        return this.containerView;
    }

    public final PointWithUnit getOffset() {
        return this.offset;
    }

    public final T getTrackedObject() {
        return (T) this.trackedObject;
    }

    public final void setAnchor(Anchor anchor) {
        Intrinsics.j(anchor, "<set-?>");
        this.anchor = anchor;
    }

    public final void setContainerView(ViewGroup viewGroup) {
        this.containerView = viewGroup;
    }

    public final void setOffset(PointWithUnit pointWithUnit) {
        Intrinsics.j(pointWithUnit, "<set-?>");
        this.offset = pointWithUnit;
    }

    public final void setTrackedObject(T t10) {
        this.trackedObject = t10;
    }
}
