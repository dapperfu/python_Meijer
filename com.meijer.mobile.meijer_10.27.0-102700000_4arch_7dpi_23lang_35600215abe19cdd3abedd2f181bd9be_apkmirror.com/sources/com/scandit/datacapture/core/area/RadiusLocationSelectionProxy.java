package com.scandit.datacapture.core.area;

import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.internal.sdk.area.NativeLocationSelection;
import com.scandit.datacapture.core.internal.sdk.area.NativeRadiusLocationSelection;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H'J\b\u0010\b\u001a\u00020\tH'J\b\u0010\n\u001a\u00020\u000bH'R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/core/area/RadiusLocationSelectionProxy;", "Lcom/scandit/datacapture/core/area/LocationSelection;", "radius", "Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "getRadius", "()Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/area/NativeRadiusLocationSelection;", "_locationSelectionImpl", "Lcom/scandit/datacapture/core/internal/sdk/area/NativeLocationSelection;", "toJson", "", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeRadiusLocationSelection.class)
/* loaded from: classes11.dex */
public interface RadiusLocationSelectionProxy extends LocationSelection {
    @NativeImpl
    NativeRadiusLocationSelection _impl();

    @NativeImpl
    NativeLocationSelection _locationSelectionImpl();

    @ProxyFunction(property = "radius")
    FloatWithUnit getRadius();

    @ProxyFunction(nativeName = "toJson")
    String toJson();
}
