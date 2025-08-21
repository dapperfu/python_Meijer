package Uq;

import com.meijer.mobile.store.model.hybris.HybrisStoreAddress;
import di.StoreAddress;
import ei.C13800a;
import ei.C13803d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/store/model/hybris/HybrisStoreAddress;", "Ldi/g;", "a", "(Lcom/meijer/mobile/store/model/hybris/HybrisStoreAddress;)Ldi/g;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e {
    public static final StoreAddress a(HybrisStoreAddress hybrisStoreAddress) {
        Intrinsics.j(hybrisStoreAddress, "<this>");
        return new StoreAddress(hybrisStoreAddress.getId(), C13800a.a(hybrisStoreAddress.getCountry()), hybrisStoreAddress.getIsDefault(), hybrisStoreAddress.getLine1(), hybrisStoreAddress.getPostalCode(), C13803d.a(hybrisStoreAddress.getRegion()), hybrisStoreAddress.getTown());
    }
}
