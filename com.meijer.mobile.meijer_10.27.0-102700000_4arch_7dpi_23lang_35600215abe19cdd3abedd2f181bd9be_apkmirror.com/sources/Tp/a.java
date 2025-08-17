package Tp;

import com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\ba\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0007H§@¢\u0006\u0004\b\f\u0010\nJ\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\r\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"LTp/a;", "", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity;", "item", "", "b", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", PreferencesHelper.PREF_ID, "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "barcode", "c", "d", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface a {
    Object a(String str, Continuation<? super ShopAndScanItemEntity> continuation);

    Object b(ShopAndScanItemEntity shopAndScanItemEntity, Continuation<? super Unit> continuation);

    Object c(String str, Continuation<? super ShopAndScanItemEntity> continuation);

    Object d(String str, Continuation<? super Unit> continuation);
}
