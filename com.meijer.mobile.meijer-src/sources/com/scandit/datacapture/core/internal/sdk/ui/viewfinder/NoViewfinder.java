package com.scandit.datacapture.core.internal.sdk.ui.viewfinder;

import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0004H\u0097\u0001J\t\u0010\u0007\u001a\u00020\bH\u0097\u0001¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NoViewfinder;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NoViewfinderProxy;", "()V", "impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeNoViewfinder;", "(Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeNoViewfinder;)V", "_impl", "_viewfinderImpl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeViewfinder;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NoViewfinder implements NoViewfinderProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ NoViewfinderProxyAdapter f126777a;

    /* JADX WARN: Multi-variable type inference failed */
    public NoViewfinder(NativeNoViewfinder impl) {
        Intrinsics.j(impl, "impl");
        this.f126777a = new NoViewfinderProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NoViewfinderProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeNoViewfinder getF126778a() {
        return this.f126777a.getF126778a();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NoViewfinderProxy, com.scandit.datacapture.core.ui.viewfinder.Viewfinder
    @NativeImpl
    /* renamed from: _viewfinderImpl */
    public NativeViewfinder getF126780c() {
        return this.f126777a.getF126780c();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NoViewfinder() {
        NativeNoViewfinder nativeNoViewfinderCreate = NativeNoViewfinder.create();
        Intrinsics.i(nativeNoViewfinderCreate, "create(...)");
        this(nativeNoViewfinderCreate);
    }
}
