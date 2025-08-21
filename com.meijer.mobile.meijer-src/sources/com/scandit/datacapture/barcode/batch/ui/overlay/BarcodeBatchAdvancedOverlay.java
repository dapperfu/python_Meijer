package com.scandit.datacapture.barcode.batch.ui.overlay;

import android.annotation.SuppressLint;
import android.view.View;
import com.scandit.datacapture.barcode.batch.capture.BarcodeBatch;
import com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializer;
import com.scandit.datacapture.barcode.batch.capture.BarcodeBatchListener;
import com.scandit.datacapture.barcode.batch.capture.BarcodeBatchSession;
import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingAdvancedOverlay;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.sdk.capture.NativeFeatureAvailability;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAdvancedOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u00019J\u0010\u0010\u0006\u001a\u00020\u0005H\u0097\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0097\u0001¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\"\u0010#J!\u0010$\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b$\u0010%R$\u0010-\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00104\u001a\u00020.2\u0006\u0010/\u001a\u00020.8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0014\u00108\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006:"}, d2 = {"Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchAdvancedOverlay;", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAdvancedOverlay;", "Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;", "Lcom/scandit/datacapture/core/ui/overlay/DataCaptureOverlay;", "Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchAdvancedOverlayProxy;", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_dataCaptureOverlayImpl", "()Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "Lcom/scandit/datacapture/barcode/batch/internal/module/ui/overlay/NativeBarcodeTrackingAdvancedOverlay;", "_impl", "()Lcom/scandit/datacapture/barcode/batch/internal/module/ui/overlay/NativeBarcodeTrackingAdvancedOverlay;", "", "jsonData", "", "updateFromJson", "(Ljava/lang/String;)V", "trackedBarcode", "Landroid/view/View;", "view", "setViewForTrackedBarcode", "(Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;Landroid/view/View;)V", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "anchor", "setAnchorForTrackedBarcode", "(Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;Lcom/scandit/datacapture/core/common/geometry/Anchor;)V", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "offset", "setOffsetForTrackedBarcode", "(Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;)V", "clearTrackedBarcodeViews", "()V", "trackedObject", "_viewForTrackedObject", "(Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;)Landroid/view/View;", "_anchorForTrackedObject", "(Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;)Lcom/scandit/datacapture/core/common/geometry/Anchor;", "_offsetForTrackedObject", "(Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;Landroid/view/View;)Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchAdvancedOverlayListener;", "j", "Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchAdvancedOverlayListener;", "getListener", "()Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchAdvancedOverlayListener;", "setListener", "(Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchAdvancedOverlayListener;)V", "listener", "", "<set-?>", "getShouldShowScanAreaGuides", "()Z", "setShouldShowScanAreaGuides", "(Z)V", "shouldShowScanAreaGuides", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeFeatureAvailability;", "getRequireArFeatureAvailabilityFromContext", "()Lcom/scandit/datacapture/core/internal/sdk/capture/NativeFeatureAvailability;", "requireArFeatureAvailabilityFromContext", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes12.dex */
public final class BarcodeBatchAdvancedOverlay extends TrackedObjectAdvancedOverlay<TrackedBarcode> implements DataCaptureOverlay, BarcodeBatchAdvancedOverlayProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ BarcodeBatchAdvancedOverlayProxyAdapter f121438i;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private BarcodeBatchAdvancedOverlayListener listener;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchAdvancedOverlay$Companion;", "", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatch;", "mode", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "view", "Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchAdvancedOverlay;", "newInstance", "(Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatch;Lcom/scandit/datacapture/core/ui/DataCaptureView;)Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchAdvancedOverlay;", "deserializerInstance$scandit_barcode_capture", "deserializerInstance", "", "jsonData", "fromJson", "(Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatch;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchAdvancedOverlay;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public final BarcodeBatchAdvancedOverlay deserializerInstance$scandit_barcode_capture(BarcodeBatch mode, DataCaptureView view) {
            Intrinsics.j(mode, "mode");
            BarcodeBatchAdvancedOverlay barcodeBatchAdvancedOverlay = new BarcodeBatchAdvancedOverlay(mode, view, new com.scandit.datacapture.barcode.internal.module.batch.ui.overlay.a(), null);
            if (view != null) {
                view.addOverlay(barcodeBatchAdvancedOverlay);
            }
            return barcodeBatchAdvancedOverlay;
        }

        @JvmStatic
        public final BarcodeBatchAdvancedOverlay fromJson(BarcodeBatch mode, String jsonData) {
            Intrinsics.j(mode, "mode");
            Intrinsics.j(jsonData, "jsonData");
            return new BarcodeBatchDeserializer().advancedOverlayFromJson(mode, jsonData);
        }

        @JvmStatic
        public final BarcodeBatchAdvancedOverlay newInstance(BarcodeBatch mode, DataCaptureView view) {
            Intrinsics.j(mode, "mode");
            BarcodeBatchAdvancedOverlay barcodeBatchAdvancedOverlay = new BarcodeBatchAdvancedOverlay(mode, view, new com.scandit.datacapture.barcode.internal.module.batch.ui.overlay.a(), null);
            if (view != null) {
                view.addOverlay(barcodeBatchAdvancedOverlay);
            }
            return barcodeBatchAdvancedOverlay;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @JvmStatic
    public static final BarcodeBatchAdvancedOverlay fromJson(BarcodeBatch barcodeBatch, String str) {
        return INSTANCE.fromJson(barcodeBatch, str);
    }

    @JvmStatic
    public static final BarcodeBatchAdvancedOverlay newInstance(BarcodeBatch barcodeBatch, DataCaptureView dataCaptureView) {
        return INSTANCE.newInstance(barcodeBatch, dataCaptureView);
    }

    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay, com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlayProxy
    @NativeImpl
    /* renamed from: _dataCaptureOverlayImpl */
    public NativeDataCaptureOverlay getF121443c() {
        return this.f121438i.getF121443c();
    }

    @Override // com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlayProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeBarcodeTrackingAdvancedOverlay getF121441a() {
        return this.f121438i.getF121441a();
    }

    @Override // com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlayProxy
    @ProxyFunction(property = "shouldShowScanAreaGuides")
    public boolean getShouldShowScanAreaGuides() {
        return this.f121438i.getShouldShowScanAreaGuides();
    }

    @Override // com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlayProxy
    @ProxyFunction(property = "shouldShowScanAreaGuides")
    public void setShouldShowScanAreaGuides(boolean z10) {
        this.f121438i.setShouldShowScanAreaGuides(z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAdvancedOverlay
    public Anchor _anchorForTrackedObject(TrackedBarcode trackedObject) {
        Intrinsics.j(trackedObject, "trackedObject");
        BarcodeBatchAdvancedOverlayListener barcodeBatchAdvancedOverlayListener = this.listener;
        if (barcodeBatchAdvancedOverlayListener != null) {
            return barcodeBatchAdvancedOverlayListener.anchorForTrackedBarcode(this, trackedObject);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAdvancedOverlay
    public PointWithUnit _offsetForTrackedObject(TrackedBarcode trackedObject, View view) {
        Intrinsics.j(trackedObject, "trackedObject");
        Intrinsics.j(view, "view");
        BarcodeBatchAdvancedOverlayListener barcodeBatchAdvancedOverlayListener = this.listener;
        if (barcodeBatchAdvancedOverlayListener != null) {
            return barcodeBatchAdvancedOverlayListener.offsetForTrackedBarcode(this, trackedObject, view);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAdvancedOverlay
    public View _viewForTrackedObject(TrackedBarcode trackedObject) {
        Intrinsics.j(trackedObject, "trackedObject");
        BarcodeBatchAdvancedOverlayListener barcodeBatchAdvancedOverlayListener = this.listener;
        if (barcodeBatchAdvancedOverlayListener != null) {
            return barcodeBatchAdvancedOverlayListener.viewForTrackedBarcode(this, trackedObject);
        }
        return null;
    }

    public final BarcodeBatchAdvancedOverlayListener getListener() {
        return this.listener;
    }

    public final void setAnchorForTrackedBarcode(TrackedBarcode trackedBarcode, Anchor anchor) {
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        Intrinsics.j(anchor, "anchor");
        setAnchorForTrackedObject(trackedBarcode, anchor);
    }

    public final void setListener(BarcodeBatchAdvancedOverlayListener barcodeBatchAdvancedOverlayListener) {
        this.listener = barcodeBatchAdvancedOverlayListener;
    }

    public final void setOffsetForTrackedBarcode(TrackedBarcode trackedBarcode, PointWithUnit offset) {
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        Intrinsics.j(offset, "offset");
        setOffsetForTrackedObject(trackedBarcode, offset);
    }

    public final void setViewForTrackedBarcode(TrackedBarcode trackedBarcode, View view) {
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        setViewForTrackedObject(trackedBarcode, view);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAdvancedOverlay
    public void updateFromJson(String jsonData) {
        Intrinsics.j(jsonData, "jsonData");
        new BarcodeBatchDeserializer().updateAdvancedOverlayFromJson(this, jsonData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BarcodeBatchAdvancedOverlay(BarcodeBatch barcodeBatch, DataCaptureView dataCaptureView, TrackedObjectAugmenter.Factory factory, DefaultConstructorMarker defaultConstructorMarker) {
        super(barcodeBatch, dataCaptureView, factory);
        NativeBarcodeTrackingAdvancedOverlay nativeBarcodeTrackingAdvancedOverlayCreate = NativeBarcodeTrackingAdvancedOverlay.create(barcodeBatch.getF121378a());
        Intrinsics.i(nativeBarcodeTrackingAdvancedOverlayCreate, "create(...)");
        this.f121438i = new BarcodeBatchAdvancedOverlayProxyAdapter(nativeBarcodeTrackingAdvancedOverlayCreate, null, 2, 0 == true ? 1 : 0);
        barcodeBatch.getListeners$scandit_barcode_capture().add(0, new BarcodeBatchListener() { // from class: com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlay$barcodeBatchListener$1
            @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchListener
            public void onSessionUpdated(BarcodeBatch mode, BarcodeBatchSession session, FrameData data) {
                Intrinsics.j(mode, "mode");
                Intrinsics.j(session, "session");
                Intrinsics.j(data, "data");
                BarcodeBatchAdvancedOverlay barcodeBatchAdvancedOverlay = this.f121440a;
                long frameSequenceId = session.getFrameSequenceId();
                List<TrackedBarcode> addedTrackedBarcodes = session.getAddedTrackedBarcodes();
                List<TrackedBarcode> updatedTrackedBarcodes = session.getUpdatedTrackedBarcodes();
                List<Integer> removedTrackedBarcodes = session.getRemovedTrackedBarcodes();
                ArrayList arrayList = new ArrayList(CollectionsKt.x(removedTrackedBarcodes, 10));
                Iterator<T> it = removedTrackedBarcodes.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf(((Number) it.next()).intValue()));
                }
                barcodeBatchAdvancedOverlay.updateTrackedObjects(frameSequenceId, addedTrackedBarcodes, updatedTrackedBarcodes, arrayList);
            }

            @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchListener
            @ProxyFunction
            public void onObservationStarted(BarcodeBatch barcodeBatch2) {
                BarcodeBatchListener.DefaultImpls.onObservationStarted(this, barcodeBatch2);
            }

            @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchListener
            @ProxyFunction
            public void onObservationStopped(BarcodeBatch barcodeBatch2) {
                BarcodeBatchListener.DefaultImpls.onObservationStopped(this, barcodeBatch2);
            }
        });
    }

    public final void clearTrackedBarcodeViews() {
        clearTrackedObjectViews();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAdvancedOverlay
    public NativeFeatureAvailability getRequireArFeatureAvailabilityFromContext() {
        NativeFeatureAvailability nativeFeatureAvailabilityRequireArFeatureAvailabilityFromContext = getF121441a().requireArFeatureAvailabilityFromContext();
        Intrinsics.i(nativeFeatureAvailabilityRequireArFeatureAvailabilityFromContext, "requireArFeatureAvailabilityFromContext(...)");
        return nativeFeatureAvailabilityRequireArFeatureAvailabilityFromContext;
    }
}
