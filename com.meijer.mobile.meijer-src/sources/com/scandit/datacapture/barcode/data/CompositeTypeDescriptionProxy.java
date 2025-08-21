package com.scandit.datacapture.barcode.data;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeCompositeTypeDescription;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.EnumSet;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\f\u001a\u00020\rH'J\b\u0010\u000e\u001a\u00020\u000fH'R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/scandit/datacapture/barcode/data/CompositeTypeDescriptionProxy;", "", "symbologies", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "getSymbologies", "()Ljava/util/Set;", "types", "Ljava/util/EnumSet;", "Lcom/scandit/datacapture/barcode/data/CompositeType;", "getTypes", "()Ljava/util/EnumSet;", "_impl", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeCompositeTypeDescription;", "toJson", "", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeCompositeTypeDescription.class)
/* loaded from: classes12.dex */
public interface CompositeTypeDescriptionProxy {
    @NativeImpl
    NativeCompositeTypeDescription _impl();

    @ProxyFunction(property = "symbologies")
    Set<Symbology> getSymbologies();

    @ProxyFunction(nativeName = "getTypesBits", property = "types")
    EnumSet<CompositeType> getTypes();

    @ProxyFunction(nativeName = "toJson")
    String toJson();
}
