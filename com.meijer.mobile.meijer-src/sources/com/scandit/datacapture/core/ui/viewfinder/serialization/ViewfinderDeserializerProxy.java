package com.scandit.datacapture.core.ui.viewfinder.serialization;

import com.scandit.datacapture.core.internal.module.serialization.NativeViewfinderDeserializer;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001a\u00020\bH'J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH'R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializerProxy;", "", "warnings", "", "", "getWarnings", "()Ljava/util/List;", "_impl", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeViewfinderDeserializer;", "_setHelper", "", "helper", "Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializerHelper;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeViewfinderDeserializer.class)
/* loaded from: classes12.dex */
public interface ViewfinderDeserializerProxy {
    @NativeImpl
    NativeViewfinderDeserializer _impl();

    @ProxyFunction(nativeName = "setHelper")
    void _setHelper(ViewfinderDeserializerHelper helper);

    @ProxyFunction(property = "warnings")
    List<String> getWarnings();
}
