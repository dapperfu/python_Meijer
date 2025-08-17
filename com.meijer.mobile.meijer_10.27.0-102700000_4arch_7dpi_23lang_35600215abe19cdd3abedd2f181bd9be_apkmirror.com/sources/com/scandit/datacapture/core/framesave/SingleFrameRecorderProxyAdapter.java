package com.scandit.datacapture.core.framesave;

import com.scandit.datacapture.core.internal.module.framesave.NativeSingleFrameRecorder;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/scandit/datacapture/core/framesave/SingleFrameRecorderProxyAdapter;", "Lcom/scandit/datacapture/core/framesave/SingleFrameRecorderProxy;", "Lcom/scandit/datacapture/core/internal/module/framesave/NativeSingleFrameRecorder;", "_NativeSingleFrameRecorder", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/core/internal/module/framesave/NativeSingleFrameRecorder;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/core/internal/module/framesave/NativeSingleFrameRecorder;", "", "_waitUntilSavesAreCompleted", "()V", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class SingleFrameRecorderProxyAdapter implements SingleFrameRecorderProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeSingleFrameRecorder f124181a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public SingleFrameRecorderProxyAdapter(NativeSingleFrameRecorder _NativeSingleFrameRecorder, ProxyCache proxyCache) {
        Intrinsics.j(_NativeSingleFrameRecorder, "_NativeSingleFrameRecorder");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f124181a = _NativeSingleFrameRecorder;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.core.framesave.SingleFrameRecorderProxy
    /* renamed from: _impl, reason: from getter */
    public NativeSingleFrameRecorder getF124181a() {
        return this.f124181a;
    }

    @Override // com.scandit.datacapture.core.framesave.SingleFrameRecorderProxy
    public void _waitUntilSavesAreCompleted() {
        this.f124181a.waitUntilSavesAreCompleted();
    }

    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    public /* synthetic */ SingleFrameRecorderProxyAdapter(NativeSingleFrameRecorder nativeSingleFrameRecorder, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeSingleFrameRecorder, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
