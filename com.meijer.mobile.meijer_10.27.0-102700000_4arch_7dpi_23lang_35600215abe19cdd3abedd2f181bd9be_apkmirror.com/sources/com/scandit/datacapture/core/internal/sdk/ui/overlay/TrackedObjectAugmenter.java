package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnitUtilsKt;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.internal.sdk.utils.ObjectOverlayUtils;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000 C*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003CDEB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\n\u0010\tJ!\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J9\u0010\u001d\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0014¢\u0006\u0004\b!\u0010\"J\u001d\u0010#\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0014¢\u0006\u0004\b#\u0010\"J\u001d\u0010$\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0014¢\u0006\u0004\b$\u0010\"J\u000f\u0010%\u001a\u00020\u0007H\u0007¢\u0006\u0004\b%\u0010\tJ\u0017\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&H\u0017¢\u0006\u0004\b(\u0010)R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020\u001b0.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R,\u00109\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010?\u001a\u00020:8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0018\u0010B\u001a\u00020\u001b*\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006F"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter;", "T", "", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter$Host;", "host", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter$Host;)V", "", "onHostAttachedToWindow", "()V", "onHostDetachedFromWindow", "trackedObject", "Landroid/view/View;", "view", "setViewForTrackedObject", "(Ljava/lang/Object;Landroid/view/View;)V", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "offset", "setOffsetForTrackedObject", "(Ljava/lang/Object;Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;)V", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "anchor", "setAnchorForTrackedObject", "(Ljava/lang/Object;Lcom/scandit/datacapture/core/common/geometry/Anchor;)V", "", "addedTrackedObjects", "updatedTrackedObjects", "", "removedTrackedObjects", "setAugmentations", "(Ljava/lang/Iterable;Ljava/lang/Iterable;Ljava/lang/Iterable;)V", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/Augmentation;", "augmentation", "onAugmentationAdded", "(Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/Augmentation;)V", "onAugmentationUpdated", "onAugmentationRemoved", "clearAugmentations", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/Transformation;", "transformation", "correctViewPositions", "(Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/Transformation;)V", "a", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter$Host;", "getHost", "()Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter$Host;", "", "b", "Ljava/util/Set;", "getActiveIdentifiers", "()Ljava/util/Set;", "activeIdentifiers", "", "c", "Ljava/util/Map;", "getAugmentations", "()Ljava/util/Map;", "augmentations", "Lcom/scandit/datacapture/core/internal/sdk/utils/ObjectOverlayUtils;", "g", "Lcom/scandit/datacapture/core/internal/sdk/utils/ObjectOverlayUtils;", "getObjectOverlayUtils", "()Lcom/scandit/datacapture/core/internal/sdk/utils/ObjectOverlayUtils;", "objectOverlayUtils", "getTrackingId", "(Ljava/lang/Object;)Ljava/lang/String;", "trackingId", "Companion", "Factory", "Host", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes11.dex */
public abstract class TrackedObjectAugmenter<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h, reason: collision with root package name */
    private static final Anchor f125783h = Anchor.CENTER;

    /* renamed from: i, reason: collision with root package name */
    private static final PointWithUnit f125784i = PointWithUnitUtilsKt.PointWithUnit(0.0f, 0.0f, MeasureUnit.FRACTION);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Host host;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Set activeIdentifiers;

    /* renamed from: c, reason: collision with root package name */
    private final LinkedHashMap f125787c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedHashMap f125788d;

    /* renamed from: e, reason: collision with root package name */
    private final LinkedHashMap f125789e;

    /* renamed from: f, reason: collision with root package name */
    private final LinkedHashMap f125790f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ObjectOverlayUtils objectOverlayUtils;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter$Factory;", "T", "", "forHost", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter;", "host", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter$Host;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Factory<T> {
        TrackedObjectAugmenter<T> forHost(Host<T> host);
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00028\u0001H&¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH&J\u001f\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020\u0006H&¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016H&J\u001e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016H&J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter$Host;", "T", "", "addAugmentedView", "", "view", "Landroid/view/View;", "anchorForTrackedObject", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "trackedObject", "(Ljava/lang/Object;)Lcom/scandit/datacapture/core/common/geometry/Anchor;", "mapFramePointToView", "Lcom/scandit/datacapture/core/common/geometry/Point;", "point", "mapFrameQuadrilateralToView", "Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "quadrilateral", "offsetForTrackedObject", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "(Ljava/lang/Object;Landroid/view/View;)Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "post", "action", "Lkotlin/Function0;", "postDelayed", "delayMillis", "", "removeAugmentedView", "viewForTrackedObject", "(Ljava/lang/Object;)Landroid/view/View;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Host<T> {
        void addAugmentedView(View view);

        Anchor anchorForTrackedObject(T trackedObject);

        Point mapFramePointToView(Point point);

        Quadrilateral mapFrameQuadrilateralToView(Quadrilateral quadrilateral);

        PointWithUnit offsetForTrackedObject(T trackedObject, View view);

        void post(Function0<Unit> action);

        void postDelayed(long delayMillis, Function0<Unit> action);

        void removeAugmentedView(View view);

        View viewForTrackedObject(T trackedObject);
    }

    public void correctViewPositions(Transformation transformation) {
        Intrinsics.j(transformation, "transformation");
    }

    public abstract String getTrackingId(T t10);

    protected void onAugmentationAdded(Augmentation<T> augmentation) {
        Intrinsics.j(augmentation, "augmentation");
    }

    protected void onAugmentationRemoved(Augmentation<T> augmentation) {
        Intrinsics.j(augmentation, "augmentation");
    }

    protected void onAugmentationUpdated(Augmentation<T> augmentation) {
        Intrinsics.j(augmentation, "augmentation");
    }

    public void onHostAttachedToWindow() {
    }

    public void onHostDetachedFromWindow() {
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter$Companion;", "", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "DEFAULT_ANCHOR", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "getDEFAULT_ANCHOR", "()Lcom/scandit/datacapture/core/common/geometry/Anchor;", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "DEFAULT_OFFSET", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "getDEFAULT_OFFSET", "()Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final Anchor getDEFAULT_ANCHOR() {
            return TrackedObjectAugmenter.f125783h;
        }

        public final PointWithUnit getDEFAULT_OFFSET() {
            return TrackedObjectAugmenter.f125784i;
        }
    }

    public TrackedObjectAugmenter(Host<T> host) {
        Intrinsics.j(host, "host");
        this.host = host;
        Set setSynchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        Intrinsics.i(setSynchronizedSet, "synchronizedSet(...)");
        this.activeIdentifiers = setSynchronizedSet;
        this.f125787c = new LinkedHashMap();
        this.f125788d = new LinkedHashMap();
        this.f125789e = new LinkedHashMap();
        this.f125790f = new LinkedHashMap();
        this.objectOverlayUtils = new ObjectOverlayUtils();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a(Object obj) {
        LinkedHashMap linkedHashMap = this.f125788d;
        String trackingId = getTrackingId(obj);
        Object objViewForTrackedObject = linkedHashMap.get(trackingId);
        if (objViewForTrackedObject == null) {
            objViewForTrackedObject = this.host.viewForTrackedObject(obj);
            linkedHashMap.put(trackingId, objViewForTrackedObject);
        }
        View view = (View) objViewForTrackedObject;
        if (view == null) {
            return;
        }
        Anchor anchorAnchorForTrackedObject = (Anchor) this.f125789e.get(getTrackingId(obj));
        if (anchorAnchorForTrackedObject == null) {
            anchorAnchorForTrackedObject = this.host.anchorForTrackedObject(obj);
            if (anchorAnchorForTrackedObject != null) {
                this.f125789e.put(getTrackingId(obj), anchorAnchorForTrackedObject);
            } else {
                anchorAnchorForTrackedObject = null;
            }
            if (anchorAnchorForTrackedObject == null) {
                anchorAnchorForTrackedObject = f125783h;
            }
        }
        PointWithUnit pointWithUnitOffsetForTrackedObject = (PointWithUnit) this.f125790f.get(getTrackingId(obj));
        if (pointWithUnitOffsetForTrackedObject == null) {
            pointWithUnitOffsetForTrackedObject = this.host.offsetForTrackedObject(obj, view);
            if (pointWithUnitOffsetForTrackedObject != null) {
                this.f125790f.put(getTrackingId(obj), pointWithUnitOffsetForTrackedObject);
            } else {
                pointWithUnitOffsetForTrackedObject = null;
            }
            if (pointWithUnitOffsetForTrackedObject == null) {
                pointWithUnitOffsetForTrackedObject = f125784i;
            }
        }
        Augmentation<T> augmentation = (Augmentation) this.f125787c.get(getTrackingId(obj));
        if (augmentation != null) {
            ViewGroup containerView = augmentation.getContainerView();
            if (containerView != null) {
                containerView.removeAllViews();
                this.host.removeAugmentedView(containerView);
            }
            augmentation.setContainerView(null);
            onAugmentationRemoved(augmentation);
        }
        Context context = view.getContext();
        Intrinsics.i(context, "getContext(...)");
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.setVisibility(4);
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        frameLayout.addView(view);
        this.host.addAugmentedView(frameLayout);
        Augmentation<T> augmentation2 = new Augmentation<>(obj, frameLayout, pointWithUnitOffsetForTrackedObject, anchorAnchorForTrackedObject);
        this.f125787c.put(getTrackingId(obj), augmentation2);
        onAugmentationAdded(augmentation2);
    }

    public final void clearAugmentations() {
        for (Augmentation<T> augmentation : this.f125787c.values()) {
            ViewGroup containerView = augmentation.getContainerView();
            if (containerView != null) {
                containerView.removeAllViews();
                this.host.removeAugmentedView(containerView);
            }
            augmentation.setContainerView(null);
            onAugmentationRemoved(augmentation);
        }
        this.f125787c.clear();
        this.f125789e.clear();
        this.f125790f.clear();
        this.f125788d.clear();
    }

    public final Set<String> getActiveIdentifiers() {
        return this.activeIdentifiers;
    }

    protected final Map<String, Augmentation<T>> getAugmentations() {
        return this.f125787c;
    }

    protected final Host<T> getHost() {
        return this.host;
    }

    protected final ObjectOverlayUtils getObjectOverlayUtils() {
        return this.objectOverlayUtils;
    }

    public final void setAnchorForTrackedObject(T trackedObject, Anchor anchor) {
        Intrinsics.j(anchor, "anchor");
        this.f125789e.put(getTrackingId(trackedObject), anchor);
        Augmentation augmentation = (Augmentation) this.f125787c.get(getTrackingId(trackedObject));
        if (augmentation == null) {
            return;
        }
        augmentation.setAnchor(anchor);
    }

    public final void setAugmentations(Iterable<? extends T> addedTrackedObjects, Iterable<? extends T> updatedTrackedObjects, Iterable<String> removedTrackedObjects) {
        Intrinsics.j(addedTrackedObjects, "addedTrackedObjects");
        Intrinsics.j(updatedTrackedObjects, "updatedTrackedObjects");
        Intrinsics.j(removedTrackedObjects, "removedTrackedObjects");
        this.activeIdentifiers.clear();
        for (String str : removedTrackedObjects) {
            Augmentation<T> augmentation = (Augmentation) this.f125787c.remove(str);
            if (augmentation != null) {
                ViewGroup containerView = augmentation.getContainerView();
                if (containerView != null) {
                    containerView.removeAllViews();
                    this.host.removeAugmentedView(containerView);
                }
                augmentation.setContainerView(null);
                onAugmentationRemoved(augmentation);
            }
            this.f125789e.remove(str);
            this.f125790f.remove(str);
            this.f125788d.remove(str);
        }
        for (T t10 : addedTrackedObjects) {
            a(t10);
            this.activeIdentifiers.add(getTrackingId(t10));
        }
        for (T t11 : updatedTrackedObjects) {
            Augmentation<T> augmentation2 = (Augmentation) this.f125787c.get(getTrackingId(t11));
            if (augmentation2 == null) {
                a(t11);
            } else {
                augmentation2.setTrackedObject(t11);
                onAugmentationUpdated(augmentation2);
            }
            this.activeIdentifiers.add(getTrackingId(t11));
        }
    }

    public final void setOffsetForTrackedObject(T trackedObject, PointWithUnit offset) {
        Intrinsics.j(offset, "offset");
        this.f125790f.put(getTrackingId(trackedObject), offset);
        Augmentation augmentation = (Augmentation) this.f125787c.get(getTrackingId(trackedObject));
        if (augmentation == null) {
            return;
        }
        augmentation.setOffset(offset);
    }

    public void setViewForTrackedObject(T trackedObject, View view) {
        synchronized (this.activeIdentifiers) {
            try {
                if (this.activeIdentifiers.contains(getTrackingId(trackedObject))) {
                    this.f125788d.put(getTrackingId(trackedObject), view);
                    a(trackedObject);
                }
                Unit unit = Unit.f142422a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
