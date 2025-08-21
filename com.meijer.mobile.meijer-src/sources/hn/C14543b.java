package hn;

import com.meijer.mobile.storeinfo.api.model.Store;
import com.meijer.mobile.storeinfo.api.model.StoreInfo;
import java.util.List;
import kotlin.Metadata;
import pk.StoreDetails;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/storeinfo/api/model/StoreInfo;", "Lpk/h;", "a", "(Lcom/meijer/mobile/storeinfo/api/model/StoreInfo;)Lpk/h;", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: hn.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C14543b {
    public static final StoreDetails a(StoreInfo storeInfo) {
        List<Store> listA;
        Store store;
        List<Store> listA2;
        Store store2;
        List<Store> listA3;
        Store store3;
        List<Store> listA4;
        Store store4;
        List<Store> listA5;
        Store store5;
        String name = null;
        String address = (storeInfo == null || (listA5 = storeInfo.a()) == null || (store5 = listA5.get(0)) == null) ? null : store5.getAddress();
        String city = (storeInfo == null || (listA4 = storeInfo.a()) == null || (store4 = listA4.get(0)) == null) ? null : store4.getCity();
        String state = (storeInfo == null || (listA3 = storeInfo.a()) == null || (store3 = listA3.get(0)) == null) ? null : store3.getState();
        String zipCode = (storeInfo == null || (listA2 = storeInfo.a()) == null || (store2 = listA2.get(0)) == null) ? null : store2.getZipCode();
        if (storeInfo != null && (listA = storeInfo.a()) != null && (store = listA.get(0)) != null) {
            name = store.getName();
        }
        return new StoreDetails(0, null, null, address, city, state, zipCode, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, name, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16777337, -1, 1048575, null);
    }
}
