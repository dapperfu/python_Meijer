package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import android.view.View;
import com.scandit.datacapture.core.capture.DataCaptureMode;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.capture.NativeFeatureAvailability;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAdvancedOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.DataCaptureViewListener;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 B*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002BCB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJA\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011H\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0014H&¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00028\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u001cH\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\u001fH\u0004¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00028\u00002\u0006\u0010$\u001a\u00020#H\u0004¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\f¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\fH\u0014¢\u0006\u0004\b)\u0010(J\u000f\u0010*\u001a\u00020\fH\u0014¢\u0006\u0004\b*\u0010(J\u0019\u0010+\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00028\u0000H$¢\u0006\u0004\b+\u0010,J\u0019\u0010-\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001b\u001a\u00028\u0000H$¢\u0006\u0004\b-\u0010.J!\u0010/\u001a\u0004\u0018\u00010#2\u0006\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u001cH$¢\u0006\u0004\b/\u00100R*\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0005018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R \u0010=\u001a\b\u0012\u0004\u0012\u00028\u0000088\u0004X\u0084\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006D"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAdvancedOverlay;", "T", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ViewBasedDataCaptureOverlay;", "Lcom/scandit/datacapture/core/capture/DataCaptureMode;", "mode", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "dataCaptureView", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter$Factory;", "augmenterFactory", "<init>", "(Lcom/scandit/datacapture/core/capture/DataCaptureMode;Lcom/scandit/datacapture/core/ui/DataCaptureView;Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter$Factory;)V", "view", "", "_setDataCaptureView", "(Lcom/scandit/datacapture/core/ui/DataCaptureView;)V", "", "frameSequenceId", "", "addedTrackedObjects", "updatedTrackedObjects", "", "removedTrackedObjects", "updateTrackedObjects", "(JLjava/lang/Iterable;Ljava/lang/Iterable;Ljava/lang/Iterable;)V", "jsonData", "updateFromJson", "(Ljava/lang/String;)V", "trackedObject", "Landroid/view/View;", "setViewForTrackedObject", "(Ljava/lang/Object;Landroid/view/View;)V", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "anchor", "setAnchorForTrackedObject", "(Ljava/lang/Object;Lcom/scandit/datacapture/core/common/geometry/Anchor;)V", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "offset", "setOffsetForTrackedObject", "(Ljava/lang/Object;Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;)V", "clearTrackedObjectViews", "()V", "onAttachedToWindow", "onDetachedFromWindow", "_viewForTrackedObject", "(Ljava/lang/Object;)Landroid/view/View;", "_anchorForTrackedObject", "(Ljava/lang/Object;)Lcom/scandit/datacapture/core/common/geometry/Anchor;", "_offsetForTrackedObject", "(Ljava/lang/Object;Landroid/view/View;)Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "Ljava/lang/ref/WeakReference;", "b", "Ljava/lang/ref/WeakReference;", "getDataCaptureView", "()Ljava/lang/ref/WeakReference;", "setDataCaptureView", "(Ljava/lang/ref/WeakReference;)V", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter;", "h", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter;", "getAugmenter", "()Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter;", "augmenter", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeFeatureAvailability;", "getRequireArFeatureAvailabilityFromContext", "()Lcom/scandit/datacapture/core/internal/sdk/capture/NativeFeatureAvailability;", "requireArFeatureAvailabilityFromContext", "Companion", "TrackedObjectAugmenterHost", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public abstract class TrackedObjectAdvancedOverlay<T> extends ViewBasedDataCaptureOverlay {
    public static final long CORRECT_VIEW_POSITIONS_DELAY_MILLIS = 100;

    /* renamed from: a, reason: collision with root package name */
    private long f125773a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private WeakReference dataCaptureView;

    /* renamed from: c, reason: collision with root package name */
    private DataCaptureViewSize f125775c;

    /* renamed from: d, reason: collision with root package name */
    private DataCaptureViewSize f125776d;

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f125777e;

    /* renamed from: f, reason: collision with root package name */
    private final TrackedObjectAdvancedOverlay$dataCaptureViewSizeChangedListener$1 f125778f;

    /* renamed from: g, reason: collision with root package name */
    private NativeFeatureAvailability f125779g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final TrackedObjectAugmenter augmenter;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAdvancedOverlay$TrackedObjectAugmenterHost;", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter$Host;", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAdvancedOverlay;)V", "Landroid/view/View;", "view", "", "addAugmentedView", "(Landroid/view/View;)V", "removeAugmentedView", "Lkotlin/Function0;", "action", "post", "(Lkotlin/jvm/functions/Function0;)V", "", "delayMillis", "postDelayed", "(JLkotlin/jvm/functions/Function0;)V", "trackedObject", "viewForTrackedObject", "(Ljava/lang/Object;)Landroid/view/View;", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "anchorForTrackedObject", "(Ljava/lang/Object;)Lcom/scandit/datacapture/core/common/geometry/Anchor;", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "offsetForTrackedObject", "(Ljava/lang/Object;Landroid/view/View;)Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "quadrilateral", "mapFrameQuadrilateralToView", "(Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;)Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "Lcom/scandit/datacapture/core/common/geometry/Point;", "point", "mapFramePointToView", "(Lcom/scandit/datacapture/core/common/geometry/Point;)Lcom/scandit/datacapture/core/common/geometry/Point;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public final class TrackedObjectAugmenterHost implements TrackedObjectAugmenter.Host<T> {
        public TrackedObjectAugmenterHost() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Function0 tmp0) {
            Intrinsics.j(tmp0, "$tmp0");
            tmp0.invoke();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(Function0 tmp0) {
            Intrinsics.j(tmp0, "$tmp0");
            tmp0.invoke();
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter.Host
        public void addAugmentedView(View view) {
            Intrinsics.j(view, "view");
            TrackedObjectAdvancedOverlay.this.addView(view);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter.Host
        public Anchor anchorForTrackedObject(T trackedObject) {
            return TrackedObjectAdvancedOverlay.this._anchorForTrackedObject(trackedObject);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter.Host
        public Point mapFramePointToView(Point point) {
            Point pointMapFramePointToView;
            Intrinsics.j(point, "point");
            DataCaptureView dataCaptureView = TrackedObjectAdvancedOverlay.this.getDataCaptureView().get();
            return (dataCaptureView == null || (pointMapFramePointToView = dataCaptureView.mapFramePointToView(point)) == null) ? point : pointMapFramePointToView;
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter.Host
        public Quadrilateral mapFrameQuadrilateralToView(Quadrilateral quadrilateral) {
            Quadrilateral quadrilateralMapFrameQuadrilateralToView;
            Intrinsics.j(quadrilateral, "quadrilateral");
            DataCaptureView dataCaptureView = TrackedObjectAdvancedOverlay.this.getDataCaptureView().get();
            return (dataCaptureView == null || (quadrilateralMapFrameQuadrilateralToView = dataCaptureView.mapFrameQuadrilateralToView(quadrilateral)) == null) ? quadrilateral : quadrilateralMapFrameQuadrilateralToView;
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter.Host
        public PointWithUnit offsetForTrackedObject(T trackedObject, View view) {
            Intrinsics.j(view, "view");
            return TrackedObjectAdvancedOverlay.this._offsetForTrackedObject(trackedObject, view);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter.Host
        public void post(final Function0<Unit> action) {
            Intrinsics.j(action, "action");
            TrackedObjectAdvancedOverlay.this.post(new Runnable() { // from class: com.scandit.datacapture.core.internal.sdk.ui.overlay.i
                @Override // java.lang.Runnable
                public final void run() {
                    TrackedObjectAdvancedOverlay.TrackedObjectAugmenterHost.a(action);
                }
            });
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter.Host
        public void postDelayed(long delayMillis, final Function0<Unit> action) {
            Intrinsics.j(action, "action");
            TrackedObjectAdvancedOverlay.this.postDelayed(new Runnable() { // from class: com.scandit.datacapture.core.internal.sdk.ui.overlay.j
                @Override // java.lang.Runnable
                public final void run() {
                    TrackedObjectAdvancedOverlay.TrackedObjectAugmenterHost.b(action);
                }
            }, delayMillis);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter.Host
        public void removeAugmentedView(View view) {
            Intrinsics.j(view, "view");
            TrackedObjectAdvancedOverlay.this.removeView(view);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter.Host
        public View viewForTrackedObject(T trackedObject) {
            return TrackedObjectAdvancedOverlay.this._viewForTrackedObject(trackedObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TrackedObjectAdvancedOverlay this$0, long j10, Iterable addedTrackedObjects, Iterable updatedTrackedObjects, Iterable removedTrackedObjects) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(addedTrackedObjects, "$addedTrackedObjects");
        Intrinsics.j(updatedTrackedObjects, "$updatedTrackedObjects");
        Intrinsics.j(removedTrackedObjects, "$removedTrackedObjects");
        if (this$0.f125773a != j10) {
            this$0.f125773a = j10;
            this$0.augmenter.clearAugmentations();
        }
        this$0.augmenter.setAugmentations(addedTrackedObjects, updatedTrackedObjects, removedTrackedObjects);
    }

    protected abstract Anchor _anchorForTrackedObject(T trackedObject);

    protected abstract PointWithUnit _offsetForTrackedObject(T trackedObject, View view);

    protected abstract View _viewForTrackedObject(T trackedObject);

    public abstract NativeFeatureAvailability getRequireArFeatureAvailabilityFromContext();

    public abstract void updateFromJson(String jsonData);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAdvancedOverlay$dataCaptureViewSizeChangedListener$1] */
    public TrackedObjectAdvancedOverlay(DataCaptureMode mode, DataCaptureView dataCaptureView, TrackedObjectAugmenter.Factory<T> augmenterFactory) {
        super(AppAndroidEnvironment.INSTANCE.getApplicationContext());
        Intrinsics.j(mode, "mode");
        Intrinsics.j(augmenterFactory, "augmenterFactory");
        OverlayPreconditionsKt.checkAttachedToSameDataCaptureContext(mode, dataCaptureView, b.f125798a);
        this.dataCaptureView = new WeakReference(dataCaptureView);
        this.f125777e = new Runnable() { // from class: com.scandit.datacapture.core.internal.sdk.ui.overlay.g
            @Override // java.lang.Runnable
            public final void run() {
                TrackedObjectAdvancedOverlay.a(this.f125809a);
            }
        };
        this.f125778f = new DataCaptureViewListener() { // from class: com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAdvancedOverlay$dataCaptureViewSizeChangedListener$1
            @Override // com.scandit.datacapture.core.ui.DataCaptureViewListener
            public void onSizeChanged(int width, int height, int screenRotation) {
                TrackedObjectAdvancedOverlay.access$onDataCaptureViewSizeChanged(this.f125782a, width, height, screenRotation);
            }
        };
        this.f125779g = NativeFeatureAvailability.UNKNOWN;
        this.augmenter = augmenterFactory.forHost(new TrackedObjectAugmenterHost());
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.ViewBasedDataCaptureOverlay
    public void _setDataCaptureView(DataCaptureView view) {
        Intrinsics.j(view, "view");
        this.dataCaptureView = new WeakReference(view);
        if (isAttachedToWindow()) {
            view.addListener(this.f125778f);
        }
    }

    public final void clearTrackedObjectViews() {
        ViewExtensionsKt.runOnMainThread(this, new c(this));
    }

    protected final TrackedObjectAugmenter<T> getAugmenter() {
        return this.augmenter;
    }

    public final WeakReference<DataCaptureView> getDataCaptureView() {
        return this.dataCaptureView;
    }

    protected final void setAnchorForTrackedObject(T trackedObject, Anchor anchor) {
        Intrinsics.j(anchor, "anchor");
        ViewExtensionsKt.runOnMainThread(this, new d(this, trackedObject, anchor));
    }

    public final void setDataCaptureView(WeakReference<DataCaptureView> weakReference) {
        Intrinsics.j(weakReference, "<set-?>");
        this.dataCaptureView = weakReference;
    }

    protected final void setOffsetForTrackedObject(T trackedObject, PointWithUnit offset) {
        Intrinsics.j(offset, "offset");
        ViewExtensionsKt.runOnMainThread(this, new e(this, trackedObject, offset));
    }

    protected final void setViewForTrackedObject(T trackedObject, View view) {
        if (this.f125779g == NativeFeatureAvailability.UNKNOWN) {
            this.f125779g = getRequireArFeatureAvailabilityFromContext();
        }
        if (this.f125779g == NativeFeatureAvailability.SUPPORTED) {
            ViewExtensionsKt.runOnMainThread(this, new f(this, trackedObject, view));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void updateTrackedObjects(final long frameSequenceId, final Iterable<? extends T> addedTrackedObjects, final Iterable<? extends T> updatedTrackedObjects, final Iterable<String> removedTrackedObjects) {
        Intrinsics.j(addedTrackedObjects, "addedTrackedObjects");
        Intrinsics.j(updatedTrackedObjects, "updatedTrackedObjects");
        Intrinsics.j(removedTrackedObjects, "removedTrackedObjects");
        if (this.f125779g == NativeFeatureAvailability.UNKNOWN) {
            this.f125779g = getRequireArFeatureAvailabilityFromContext();
        }
        if (this.f125779g == NativeFeatureAvailability.SUPPORTED) {
            post(new Runnable() { // from class: com.scandit.datacapture.core.internal.sdk.ui.overlay.h
                @Override // java.lang.Runnable
                public final void run() {
                    TrackedObjectAdvancedOverlay.a(this.f125810a, frameSequenceId, addedTrackedObjects, updatedTrackedObjects, removedTrackedObjects);
                }
            });
            if (!Intrinsics.e(this.f125776d, this.f125775c)) {
                this.f125776d = this.f125775c;
            }
            removeCallbacks(this.f125777e);
        }
    }

    public static final void access$onDataCaptureViewSizeChanged(TrackedObjectAdvancedOverlay trackedObjectAdvancedOverlay, int i10, int i11, int i12) {
        trackedObjectAdvancedOverlay.getClass();
        trackedObjectAdvancedOverlay.f125775c = new DataCaptureViewSize(new Size2(i10, i11), i12);
        trackedObjectAdvancedOverlay.removeCallbacks(trackedObjectAdvancedOverlay.f125777e);
        trackedObjectAdvancedOverlay.postDelayed(trackedObjectAdvancedOverlay.f125777e, 100L);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.augmenter.onHostAttachedToWindow();
        DataCaptureView dataCaptureView = (DataCaptureView) this.dataCaptureView.get();
        if (dataCaptureView != null) {
            dataCaptureView.addListener(this.f125778f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DataCaptureView dataCaptureView = (DataCaptureView) this.dataCaptureView.get();
        if (dataCaptureView != null) {
            dataCaptureView.removeListener(this.f125778f);
        }
        this.augmenter.onHostDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TrackedObjectAdvancedOverlay this$0) {
        DataCaptureViewSize dataCaptureViewSize;
        Intrinsics.j(this$0, "this$0");
        DataCaptureViewSize dataCaptureViewSize2 = this$0.f125776d;
        if (dataCaptureViewSize2 == null || (dataCaptureViewSize = this$0.f125775c) == null) {
            return;
        }
        this$0.augmenter.correctViewPositions(Transformation.INSTANCE.between(dataCaptureViewSize2, dataCaptureViewSize));
    }
}
