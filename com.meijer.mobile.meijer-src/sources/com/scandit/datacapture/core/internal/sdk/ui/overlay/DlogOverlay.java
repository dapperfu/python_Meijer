package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u00012\u00020\u0002:\u0001\rB\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0097\u0001J\t\u0010\b\u001a\u00020\u0004H\u0097\u0001J\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0097\u0001¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/DlogOverlay;", "Lcom/scandit/datacapture/core/ui/overlay/DataCaptureOverlay;", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/DlogOverlayProxy;", "impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDlogOverlay;", "(Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDlogOverlay;)V", "_dataCaptureOverlayImpl", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_impl", "setGlobFilter", "", "globFilter", "", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DlogOverlay implements DataCaptureOverlay, DlogOverlayProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ DlogOverlayProxyAdapter f126715a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/DlogOverlay$Companion;", "", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/DlogOverlay;", "create", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/DlogOverlay;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final DlogOverlay create(DataCaptureContext dataCaptureContext) {
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
            NativeDlogOverlay nativeDlogOverlayCreate = NativeDlogOverlay.create(dataCaptureContext.getF125005a());
            Intrinsics.g(nativeDlogOverlayCreate);
            return new DlogOverlay(nativeDlogOverlayCreate);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @JvmStatic
    public static final DlogOverlay create(DataCaptureContext dataCaptureContext) {
        return INSTANCE.create(dataCaptureContext);
    }

    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay, com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlayProxy
    @NativeImpl
    /* renamed from: _dataCaptureOverlayImpl */
    public NativeDataCaptureOverlay getF126718c() {
        return this.f126715a.getF126718c();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.DlogOverlayProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeDlogOverlay getF126716a() {
        return this.f126715a.getF126716a();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.DlogOverlayProxy
    @ProxyFunction
    public void setGlobFilter(String globFilter) {
        Intrinsics.j(globFilter, "globFilter");
        this.f126715a.setGlobFilter(globFilter);
    }

    public DlogOverlay(NativeDlogOverlay impl) {
        Intrinsics.j(impl, "impl");
        this.f126715a = new DlogOverlayProxyAdapter(impl, null, 2, null);
    }
}
