package com.scandit.datacapture.core.framesave;

import com.scandit.datacapture.core.internal.module.framesave.NativeSingleFrameRecorder;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/core/framesave/SingleFrameRecorderProxy;", "", "_impl", "Lcom/scandit/datacapture/core/internal/module/framesave/NativeSingleFrameRecorder;", "_waitUntilSavesAreCompleted", "", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeSingleFrameRecorder.class)
/* loaded from: classes12.dex */
public interface SingleFrameRecorderProxy {
    @NativeImpl
    NativeSingleFrameRecorder _impl();

    @ProxyFunction(nativeName = "waitUntilSavesAreCompleted")
    void _waitUntilSavesAreCompleted();
}
