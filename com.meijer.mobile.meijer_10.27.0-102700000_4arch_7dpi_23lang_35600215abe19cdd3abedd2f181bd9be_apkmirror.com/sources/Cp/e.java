package Cp;

import com.meijer.mobile.receipt.service.api.models.NextGenDigitalReceiptJson;
import j$.time.LocalDateTime;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import th.j;
import vk.C17590a;
import zp.DigitalReceipt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/receipt/service/api/models/NextGenDigitalReceiptJson;", "Lzp/b;", "a", "(Lcom/meijer/mobile/receipt/service/api/models/NextGenDigitalReceiptJson;)Lzp/b;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class e {
    public static final DigitalReceipt a(NextGenDigitalReceiptJson nextGenDigitalReceiptJson) {
        DigitalReceipt.EnumC2799b next;
        Intrinsics.j(nextGenDigitalReceiptJson, "<this>");
        String nextgenReceiptId = nextGenDigitalReceiptJson.getNextgenReceiptId();
        Object objA = vk.d.a(nextGenDigitalReceiptJson.getTransactionDateTime(), C17590a.f164803a.s(), new j());
        Intrinsics.i(objA, "toDateTime(...)");
        LocalDateTime localDateTime = (LocalDateTime) objA;
        String storeName = nextGenDigitalReceiptJson.getStoreName();
        String storeAddress = nextGenDigitalReceiptJson.getStoreAddress();
        int storeId = nextGenDigitalReceiptJson.getStoreId();
        String storeCity = nextGenDigitalReceiptJson.getStoreCity();
        String storeState = nextGenDigitalReceiptJson.getStoreState();
        String storeZipCodeValidator = nextGenDigitalReceiptJson.getStoreZipCodeValidator();
        double totalSpent = nextGenDigitalReceiptJson.getTotalSpent();
        int numberOfItems = nextGenDigitalReceiptJson.getNumberOfItems();
        Iterator<DigitalReceipt.EnumC2799b> it = DigitalReceipt.EnumC2799b.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.e(next.getValue(), nextGenDigitalReceiptJson.getProcessingStatus())) {
                break;
            }
        }
        return new DigitalReceipt(null, nextgenReceiptId, localDateTime, null, storeName, storeAddress, storeId, storeCity, storeState, storeZipCodeValidator, totalSpent, numberOfItems, null, next, null, null, 53257, null);
    }
}
