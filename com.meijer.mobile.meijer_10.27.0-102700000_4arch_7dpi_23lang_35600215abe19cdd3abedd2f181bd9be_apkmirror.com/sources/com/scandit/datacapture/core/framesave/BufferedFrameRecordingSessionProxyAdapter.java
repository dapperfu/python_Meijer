package com.scandit.datacapture.core.framesave;

import com.scandit.datacapture.core.internal.module.framesave.NativeBufferedFrameRecordingSession;
import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/scandit/datacapture/core/framesave/BufferedFrameRecordingSessionProxyAdapter;", "Lcom/scandit/datacapture/core/framesave/BufferedFrameRecordingSessionProxy;", "Lcom/scandit/datacapture/core/internal/module/framesave/NativeBufferedFrameRecordingSession;", "_NativeBufferedFrameRecordingSession", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/core/internal/module/framesave/NativeBufferedFrameRecordingSession;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "Lcom/scandit/datacapture/core/source/FrameSource;", "frameSource", "", "startRecording", "(Lcom/scandit/datacapture/core/source/FrameSource;)V", "stopRecording", "()V", "", "storageDir", "", "discardFramesOlderThan", "discardFramesNewerThan", "_saveCapturedFrames", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BufferedFrameRecordingSessionProxyAdapter implements BufferedFrameRecordingSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBufferedFrameRecordingSession f124149a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public BufferedFrameRecordingSessionProxyAdapter(NativeBufferedFrameRecordingSession _NativeBufferedFrameRecordingSession, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBufferedFrameRecordingSession, "_NativeBufferedFrameRecordingSession");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f124149a = _NativeBufferedFrameRecordingSession;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.core.framesave.BufferedFrameRecordingSessionProxy
    public void _saveCapturedFrames(String storageDir, Long discardFramesOlderThan, Long discardFramesNewerThan) {
        Intrinsics.j(storageDir, "storageDir");
        this.f124149a.saveCapturedFramesAsync(storageDir, discardFramesOlderThan, discardFramesNewerThan);
    }

    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.framesave.BufferedFrameRecordingSessionProxy
    public void startRecording(FrameSource frameSource) {
        Intrinsics.j(frameSource, "frameSource");
        NativeFrameSource f125879c = frameSource.getF125879c();
        this.proxyCache.put(Reflection.b(NativeFrameSource.class), null, f125879c, frameSource);
        this.f124149a.startRecordingAsync(f125879c);
    }

    @Override // com.scandit.datacapture.core.framesave.BufferedFrameRecordingSessionProxy
    public void stopRecording() {
        this.f124149a.stopRecordingAsync();
    }

    public /* synthetic */ BufferedFrameRecordingSessionProxyAdapter(NativeBufferedFrameRecordingSession nativeBufferedFrameRecordingSession, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBufferedFrameRecordingSession, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
