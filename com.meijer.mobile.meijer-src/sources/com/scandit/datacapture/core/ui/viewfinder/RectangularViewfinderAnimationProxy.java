package com.scandit.datacapture.core.ui.viewfinder;

import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinderAnimation;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\u0005\u001a\u00020\u0006H'J\b\u0010\u0007\u001a\u00020\bH'R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderAnimationProxy;", "", "isLooping", "", "()Z", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinderAnimation;", "toJson", "", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeRectangularViewfinderAnimation.class)
/* loaded from: classes12.dex */
public interface RectangularViewfinderAnimationProxy {
    @NativeImpl
    NativeRectangularViewfinderAnimation _impl();

    @ProxyFunction(property = "isLooping")
    boolean isLooping();

    @ProxyFunction
    String toJson();
}
