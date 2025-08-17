package com.scandit.datacapture.barcode.data;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeArucoMarker;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\n\u001a\u00020\u000bH'R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/barcode/data/ArucoMarkerProxy;", "", "data", "", "getData", "()[B", "size", "", "getSize", "()I", "_impl", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeArucoMarker;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeArucoMarker.class)
/* loaded from: classes11.dex */
public interface ArucoMarkerProxy {
    @NativeImpl
    NativeArucoMarker _impl();

    @ProxyFunction(nativeName = "getBits", property = "data")
    byte[] getData();

    @ProxyFunction(property = "size")
    int getSize();
}
