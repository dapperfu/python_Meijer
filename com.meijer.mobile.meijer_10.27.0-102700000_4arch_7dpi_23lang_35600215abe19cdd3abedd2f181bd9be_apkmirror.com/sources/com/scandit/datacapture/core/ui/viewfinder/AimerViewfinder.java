package com.scandit.datacapture.core.ui.viewfinder;

import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeAimerViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeViewfinder;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0011\u001a\u00020\u0005H\u0097\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u0097\u0001R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/AimerViewfinder;", "Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "Lcom/scandit/datacapture/core/ui/viewfinder/AimerViewfinderProxy;", "()V", "impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeAimerViewfinder;", "(Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeAimerViewfinder;)V", "<set-?>", "", "dotColor", "getDotColor", "()I", "setDotColor", "(I)V", "frameColor", "getFrameColor", "setFrameColor", "_impl", "_viewfinderImpl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeViewfinder;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AimerViewfinder implements Viewfinder, AimerViewfinderProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AimerViewfinderProxyAdapter f126174a;

    /* JADX WARN: Multi-variable type inference failed */
    public AimerViewfinder(NativeAimerViewfinder impl) {
        Intrinsics.j(impl, "impl");
        this.f126174a = new AimerViewfinderProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.AimerViewfinderProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeAimerViewfinder getF126175a() {
        return this.f126174a.getF126175a();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.Viewfinder
    @NativeImpl
    /* renamed from: _viewfinderImpl */
    public NativeViewfinder getF126177c() {
        return this.f126174a.getF126177c();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.AimerViewfinderProxy
    @ProxyFunction(property = "dotColor")
    public int getDotColor() {
        return this.f126174a.getDotColor();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.AimerViewfinderProxy
    @ProxyFunction(property = "frameColor")
    public int getFrameColor() {
        return this.f126174a.getFrameColor();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.AimerViewfinderProxy
    @ProxyFunction(property = "dotColor")
    public void setDotColor(int i10) {
        this.f126174a.setDotColor(i10);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.AimerViewfinderProxy
    @ProxyFunction(property = "frameColor")
    public void setFrameColor(int i10) {
        this.f126174a.setFrameColor(i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AimerViewfinder() {
        NativeAimerViewfinder nativeAimerViewfinderCreate = NativeAimerViewfinder.create();
        Intrinsics.i(nativeAimerViewfinderCreate, "create(...)");
        this(nativeAimerViewfinderCreate);
    }
}
