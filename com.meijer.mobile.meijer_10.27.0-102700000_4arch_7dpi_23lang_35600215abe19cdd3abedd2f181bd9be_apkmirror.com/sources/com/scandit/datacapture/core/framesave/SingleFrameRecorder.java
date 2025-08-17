package com.scandit.datacapture.core.framesave;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.module.framesave.NativeSingleFrameRecorder;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J\u0010\u0010\u0003\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0097\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/scandit/datacapture/core/framesave/SingleFrameRecorder;", "Lcom/scandit/datacapture/core/framesave/SingleFrameRecorderProxy;", "Lcom/scandit/datacapture/core/internal/module/framesave/NativeSingleFrameRecorder;", "_impl", "()Lcom/scandit/datacapture/core/internal/module/framesave/NativeSingleFrameRecorder;", "", "_waitUntilSavesAreCompleted", "()V", "Lcom/scandit/datacapture/core/data/FrameData;", "frame", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "context", "saveFrame", "(Lcom/scandit/datacapture/core/data/FrameData;Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "", "prefix", "(Lcom/scandit/datacapture/core/data/FrameData;Lcom/scandit/datacapture/core/capture/DataCaptureContext;Ljava/lang/String;)V", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class SingleFrameRecorder implements SingleFrameRecorderProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SingleFrameRecorderProxyAdapter f124180a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/core/framesave/SingleFrameRecorder$Companion;", "", "", "storageDir", "Lcom/scandit/datacapture/core/framesave/SingleFrameRecorder;", "create", "(Ljava/lang/String;)Lcom/scandit/datacapture/core/framesave/SingleFrameRecorder;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final SingleFrameRecorder create(String storageDir) {
            Intrinsics.j(storageDir, "storageDir");
            NativeSingleFrameRecorder nativeSingleFrameRecorderCreate = NativeSingleFrameRecorder.create(storageDir);
            Intrinsics.i(nativeSingleFrameRecorderCreate, "create(...)");
            return new SingleFrameRecorder(nativeSingleFrameRecorderCreate, null);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @JvmStatic
    public static final SingleFrameRecorder create(String str) {
        return INSTANCE.create(str);
    }

    @Override // com.scandit.datacapture.core.framesave.SingleFrameRecorderProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeSingleFrameRecorder getF124181a() {
        return this.f124180a.getF124181a();
    }

    @Override // com.scandit.datacapture.core.framesave.SingleFrameRecorderProxy
    @ProxyFunction(nativeName = "waitUntilSavesAreCompleted")
    public void _waitUntilSavesAreCompleted() {
        this.f124180a._waitUntilSavesAreCompleted();
    }

    public final void saveFrame(FrameData frame, DataCaptureContext context) {
        Intrinsics.j(frame, "frame");
        Intrinsics.j(context, "context");
        getF124181a().saveAsync(frame.getF125342a(), context.getF124053a());
    }

    public final void saveFrame(FrameData frame, DataCaptureContext context, String prefix) {
        Intrinsics.j(frame, "frame");
        Intrinsics.j(context, "context");
        Intrinsics.j(prefix, "prefix");
        getF124181a().saveAsyncWithPrefix(prefix, frame.getF125342a(), context.getF124053a());
    }

    public SingleFrameRecorder(NativeSingleFrameRecorder nativeSingleFrameRecorder, DefaultConstructorMarker defaultConstructorMarker) {
        this.f124180a = new SingleFrameRecorderProxyAdapter(nativeSingleFrameRecorder, null, 2, null);
    }
}
