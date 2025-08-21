package com.scandit.datacapture.core.internal.sdk.ui.viewfinder;

import com.scandit.datacapture.core.ui.viewfinder.Viewfinder;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NoViewfinderProxy;", "Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeNoViewfinder;", "_viewfinderImpl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeViewfinder;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeNoViewfinder.class)
/* loaded from: classes12.dex */
public interface NoViewfinderProxy extends Viewfinder {
    @NativeImpl
    NativeNoViewfinder _impl();

    @Override // com.scandit.datacapture.core.ui.viewfinder.Viewfinder
    @NativeImpl
    NativeViewfinder _viewfinderImpl();
}
