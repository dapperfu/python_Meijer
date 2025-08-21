package com.scandit.datacapture.core.ui.viewfinder;

import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeViewfinder;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyBaseClass;
import kotlin.Metadata;

@ProxyBaseClass(NativeViewfinder.class)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'¨\u0006\u0004"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "", "_viewfinderImpl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeViewfinder;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface Viewfinder {
    @NativeImpl
    NativeViewfinder _viewfinderImpl();
}
