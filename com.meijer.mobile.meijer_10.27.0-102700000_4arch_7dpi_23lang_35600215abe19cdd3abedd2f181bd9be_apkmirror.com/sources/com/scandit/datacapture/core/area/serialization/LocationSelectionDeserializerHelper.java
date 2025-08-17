package com.scandit.datacapture.core.area.serialization;

import com.scandit.datacapture.core.area.RadiusLocationSelection;
import com.scandit.datacapture.core.area.RectangularLocationSelection;
import com.scandit.datacapture.core.internal.module.serialization.NativeLocationSelectionDeserializerHelper;
import com.scandit.datacapture.core.internal.sdk.area.NoLocationSelection;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;

@ProxyReversedAdapter(NativeLocationSelectionDeserializerHelper.class)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H'J\b\u0010\u0006\u001a\u00020\u0007H'¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/core/area/serialization/LocationSelectionDeserializerHelper;", "", "createNoLocationSelectionFromJson", "Lcom/scandit/datacapture/core/internal/sdk/area/NoLocationSelection;", "createRadiusLocationSelectionFromJson", "Lcom/scandit/datacapture/core/area/RadiusLocationSelection;", "createRectangularLocationSelectionFromJson", "Lcom/scandit/datacapture/core/area/RectangularLocationSelection;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface LocationSelectionDeserializerHelper {
    @ProxyFunction(nativeName = "createNoLocationSelection")
    NoLocationSelection createNoLocationSelectionFromJson();

    @ProxyFunction(nativeName = "createRadiusLocationSelection")
    RadiusLocationSelection createRadiusLocationSelectionFromJson();

    @ProxyFunction(nativeName = "createRectangularLocationSelection")
    RectangularLocationSelection createRectangularLocationSelectionFromJson();
}
