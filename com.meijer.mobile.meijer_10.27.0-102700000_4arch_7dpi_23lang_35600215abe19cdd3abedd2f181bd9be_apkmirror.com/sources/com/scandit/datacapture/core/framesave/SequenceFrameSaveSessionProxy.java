package com.scandit.datacapture.core.framesave;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.framesave.NativeFrameSaveSession;
import com.scandit.datacapture.core.internal.module.framesave.NativeSequenceFrameSaveSession;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetter;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetterKind;
import com.scandit.datacapture.tools.internal.sdk.ProxySetter;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0001H'J\b\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H'J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH'J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH'J\b\u0010\u000e\u001a\u00020\bH'J\b\u0010\u000f\u001a\u00020\bH'¨\u0006\u0010"}, d2 = {"Lcom/scandit/datacapture/core/framesave/SequenceFrameSaveSessionProxy;", "Lcom/scandit/datacapture/core/framesave/FrameSaveSession;", "_frameSaveSessionImpl", "Lcom/scandit/datacapture/core/internal/module/framesave/NativeFrameSaveSession;", "_getFrameSaveSession", "_impl", "Lcom/scandit/datacapture/core/internal/module/framesave/NativeSequenceFrameSaveSession;", "_setFrameSaveSession", "", "frameSaveSession", "addToContext", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "removeFromContext", "start", "stop", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeSequenceFrameSaveSession.class)
/* loaded from: classes11.dex */
public interface SequenceFrameSaveSessionProxy extends FrameSaveSession {
    @Override // com.scandit.datacapture.core.framesave.FrameSaveSession, com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    @NativeImpl
    /* renamed from: _frameSaveSessionImpl */
    NativeFrameSaveSession getF124178c();

    @ProxyGetter(ProxyGetterKind.WITH_SETTER)
    FrameSaveSession _getFrameSaveSession();

    @NativeImpl
    /* renamed from: _impl */
    NativeSequenceFrameSaveSession getF124176a();

    @ProxySetter
    void _setFrameSaveSession(FrameSaveSession frameSaveSession);

    @Override // com.scandit.datacapture.core.framesave.FrameSaveSession, com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    @ProxyFunction
    void addToContext(DataCaptureContext dataCaptureContext);

    @Override // com.scandit.datacapture.core.framesave.FrameSaveSession, com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    @ProxyFunction
    void removeFromContext(DataCaptureContext dataCaptureContext);

    @ProxyFunction
    void start();

    @ProxyFunction
    void stop();
}
