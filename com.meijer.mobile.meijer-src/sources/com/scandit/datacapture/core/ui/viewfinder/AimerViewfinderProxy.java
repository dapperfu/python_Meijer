package com.scandit.datacapture.core.ui.viewfinder;

import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeAimerViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeViewfinder;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\f\u001a\u00020\rH'J\b\u0010\u000e\u001a\u00020\u000fH\u0017R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/AimerViewfinderProxy;", "Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "<set-?>", "", "dotColor", "getDotColor", "()I", "setDotColor", "(I)V", "frameColor", "getFrameColor", "setFrameColor", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeAimerViewfinder;", "_viewfinderImpl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeViewfinder;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeAimerViewfinder.class)
/* loaded from: classes12.dex */
public interface AimerViewfinderProxy extends Viewfinder {
    @NativeImpl
    NativeAimerViewfinder _impl();

    @Override // com.scandit.datacapture.core.ui.viewfinder.Viewfinder
    @NativeImpl
    NativeViewfinder _viewfinderImpl();

    @ProxyFunction(property = "dotColor")
    int getDotColor();

    @ProxyFunction(property = "frameColor")
    int getFrameColor();

    @ProxyFunction(property = "dotColor")
    void setDotColor(int i10);

    @ProxyFunction(property = "frameColor")
    void setFrameColor(int i10);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @NativeImpl
        public static NativeViewfinder _viewfinderImpl(AimerViewfinderProxy aimerViewfinderProxy) {
            NativeViewfinder nativeViewfinderAsViewfinder = aimerViewfinderProxy._impl().asViewfinder();
            Intrinsics.i(nativeViewfinderAsViewfinder, "asViewfinder(...)");
            return nativeViewfinderAsViewfinder;
        }
    }
}
