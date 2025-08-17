package com.scandit.datacapture.core.ui.viewfinder.serialization;

import com.scandit.datacapture.core.internal.module.serialization.NativeViewfinderDeserializerHelper;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NoViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.AimerViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.LaserlineViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderLineStyle;
import com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderStyle;
import com.scandit.datacapture.core.ui.viewfinder.TargetAimerViewfinder;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;

@ProxyReversedAdapter(NativeViewfinderDeserializerHelper.class)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H'J\b\u0010\u0006\u001a\u00020\u0007H'J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH'J\b\u0010\u000e\u001a\u00020\u000fH'¨\u0006\u0010"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializerHelper;", "", "createAimerViewfinder", "Lcom/scandit/datacapture/core/ui/viewfinder/AimerViewfinder;", "createLaserlineViewfinder", "Lcom/scandit/datacapture/core/ui/viewfinder/LaserlineViewfinder;", "createNoViewfinder", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NoViewfinder;", "createRectangularViewfinder", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinder;", "style", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderStyle;", "lineStyle", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderLineStyle;", "createTargetAimerViewfinder", "Lcom/scandit/datacapture/core/ui/viewfinder/TargetAimerViewfinder;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ViewfinderDeserializerHelper {
    @ProxyFunction
    AimerViewfinder createAimerViewfinder();

    @ProxyFunction
    LaserlineViewfinder createLaserlineViewfinder();

    @ProxyFunction
    NoViewfinder createNoViewfinder();

    @ProxyFunction
    RectangularViewfinder createRectangularViewfinder(RectangularViewfinderStyle style, RectangularViewfinderLineStyle lineStyle);

    @ProxyFunction
    TargetAimerViewfinder createTargetAimerViewfinder();
}
