package Cp;

import com.meijer.mobile.receipt.service.api.models.DigitalReceiptJson;
import j$.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import th.j;
import vk.C17590a;
import zp.DigitalReceipt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/receipt/service/api/models/DigitalReceiptJson;", "Lzp/b;", "a", "(Lcom/meijer/mobile/receipt/service/api/models/DigitalReceiptJson;)Lzp/b;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class b {
    public static final DigitalReceipt a(DigitalReceiptJson digitalReceiptJson) {
        Long lX;
        DigitalReceipt.c next;
        DigitalReceipt.EnumC2799b next2;
        HttpUrl httpUrlE;
        List<String> listN;
        String str;
        List listA1;
        String str2;
        Intrinsics.j(digitalReceiptJson, "<this>");
        long receiptId = digitalReceiptJson.getReceiptId();
        Object objA = vk.d.a(digitalReceiptJson.getTransactionDate(), C17590a.f164803a.s(), new j());
        Intrinsics.i(objA, "toDateTime(...)");
        LocalDateTime localDateTime = (LocalDateTime) objA;
        String storeName = digitalReceiptJson.getStoreName();
        String storeAddress = digitalReceiptJson.getStoreAddress();
        int storeId = digitalReceiptJson.getStoreId();
        String storeCity = digitalReceiptJson.getStoreCity();
        String storeState = digitalReceiptJson.getStoreState();
        String storeZipCodeValidator = digitalReceiptJson.getStoreZipCodeValidator();
        double totalSpent = digitalReceiptJson.getTotalSpent();
        int numberOfItems = digitalReceiptJson.getNumberOfItems();
        String laneNumber = digitalReceiptJson.getLaneNumber();
        Iterator<DigitalReceipt.c> it = DigitalReceipt.c.b().iterator();
        while (true) {
            lX = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.e(next.getValue(), digitalReceiptJson.getTransactionType())) {
                break;
            }
        }
        DigitalReceipt.c cVar = next;
        if (cVar == null) {
            cVar = DigitalReceipt.c.f173166b;
        }
        DigitalReceipt.c cVar2 = cVar;
        Iterator<DigitalReceipt.EnumC2799b> it2 = DigitalReceipt.EnumC2799b.b().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (Intrinsics.e(next2.getValue(), digitalReceiptJson.getProcessingStatus())) {
                break;
            }
        }
        DigitalReceipt.EnumC2799b enumC2799b = next2;
        String homeDeliveryUrl = digitalReceiptJson.getHomeDeliveryUrl();
        if (homeDeliveryUrl != null && (httpUrlE = HttpUrl.INSTANCE.e(homeDeliveryUrl)) != null && (listN = httpUrlE.n()) != null && (str = (String) CollectionsKt.F0(listN)) != null && (listA1 = StringsKt.a1(str, new String[]{"."}, false, 0, 6, null)) != null && (str2 = (String) CollectionsKt.u0(listA1)) != null) {
            lX = StringsKt.x(str2);
        }
        Long l10 = lX;
        if (l10 == null) {
            uw.a.INSTANCE.s("Failed to parse order ID from url: " + digitalReceiptJson.getHomeDeliveryUrl(), new Object[0]);
        }
        return new DigitalReceipt(Long.valueOf(receiptId), null, localDateTime, null, storeName, storeAddress, storeId, storeCity, storeState, storeZipCodeValidator, totalSpent, numberOfItems, laneNumber, enumC2799b, l10, cVar2, 10, null);
    }
}
