package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \t2\u00020\u00012\u00020\u0002:\u0001\tB\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0097\u0001J\t\u0010\b\u001a\u00020\u0004H\u0097\u0001¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ProfilingOverlay;", "Lcom/scandit/datacapture/core/ui/overlay/DataCaptureOverlay;", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ProfilingOverlayProxy;", "impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeProfilingOverlay;", "(Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeProfilingOverlay;)V", "_dataCaptureOverlayImpl", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_impl", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Mockable
/* loaded from: classes12.dex */
public final class ProfilingOverlay implements DataCaptureOverlay, ProfilingOverlayProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ProfilingOverlayProxyAdapter f126721a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ProfilingOverlay$Companion;", "", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ProfilingOverlay;", "create", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ProfilingOverlay;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final ProfilingOverlay create(DataCaptureContext dataCaptureContext) {
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
            NativeProfilingOverlay nativeProfilingOverlayCreate = NativeProfilingOverlay.create(dataCaptureContext._impl());
            Intrinsics.g(nativeProfilingOverlayCreate);
            return new ProfilingOverlay(nativeProfilingOverlayCreate);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @JvmStatic
    public static final ProfilingOverlay create(DataCaptureContext dataCaptureContext) {
        return INSTANCE.create(dataCaptureContext);
    }

    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay, com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlayProxy
    @NativeImpl
    /* renamed from: _dataCaptureOverlayImpl */
    public NativeDataCaptureOverlay getF126724c() {
        return this.f126721a.getF126724c();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.ProfilingOverlayProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeProfilingOverlay getF126722a() {
        return this.f126721a.getF126722a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProfilingOverlay(NativeProfilingOverlay impl) {
        Intrinsics.j(impl, "impl");
        this.f126721a = new ProfilingOverlayProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }
}
