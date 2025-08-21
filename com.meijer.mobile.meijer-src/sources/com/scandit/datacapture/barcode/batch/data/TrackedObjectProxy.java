package com.scandit.datacapture.barcode.batch.data;

import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedObject;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\b\u0010\u000e\u001a\u00020\u000fH'J\b\u0010\u0010\u001a\u00020\u0003H'R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/scandit/datacapture/barcode/batch/data/TrackedObjectProxy;", "", "data", "", "getData", "()Ljava/lang/String;", "identifier", "", "getIdentifier", "()I", "location", "Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "getLocation", "()Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "_impl", "Lcom/scandit/datacapture/barcode/batch/internal/module/data/NativeTrackedObject;", "toJson", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeTrackedObject.class)
/* loaded from: classes12.dex */
public interface TrackedObjectProxy {
    @NativeImpl
    NativeTrackedObject _impl();

    @ProxyFunction(nativeName = "getUtf8String", property = "data")
    String getData();

    @ProxyFunction(property = "identifier")
    int getIdentifier();

    @ProxyFunction(property = "location")
    Quadrilateral getLocation();

    @ProxyFunction
    String toJson();
}
