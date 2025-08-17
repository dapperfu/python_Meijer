package com.scandit.datacapture.barcode.data;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeSymbologyDescription;
import com.scandit.datacapture.core.data.Range;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\b\u0010\u0016\u001a\u00020\u0017H'J\b\u0010\u0018\u001a\u00020\tH'R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\t8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\r8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\t8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00138gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/scandit/datacapture/barcode/data/SymbologyDescriptionProxy;", "", "activeSymbolCountRange", "Lcom/scandit/datacapture/core/data/Range;", "getActiveSymbolCountRange", "()Lcom/scandit/datacapture/core/data/Range;", "defaultSymbolCountRange", "getDefaultSymbolCountRange", "identifier", "", "getIdentifier", "()Ljava/lang/String;", "isAvailable", "", "()Z", "isColorInvertible", "readableName", "getReadableName", "symbology", "Lcom/scandit/datacapture/barcode/data/Symbology;", "getSymbology", "()Lcom/scandit/datacapture/barcode/data/Symbology;", "_impl", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeSymbologyDescription;", "toJson", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeSymbologyDescription.class)
/* loaded from: classes11.dex */
public interface SymbologyDescriptionProxy {
    @NativeImpl
    NativeSymbologyDescription _impl();

    @ProxyFunction(property = "activeSymbolCountRange")
    Range getActiveSymbolCountRange();

    @ProxyFunction(property = "defaultSymbolCountRange")
    Range getDefaultSymbolCountRange();

    @ProxyFunction(property = "identifier")
    String getIdentifier();

    @ProxyFunction(property = "readableName")
    String getReadableName();

    @ProxyFunction(property = "symbology")
    Symbology getSymbology();

    @ProxyFunction(property = "isAvailable")
    boolean isAvailable();

    @ProxyFunction(property = "isColorInvertible")
    boolean isColorInvertible();

    @ProxyFunction(nativeName = "toJson")
    String toJson();
}
