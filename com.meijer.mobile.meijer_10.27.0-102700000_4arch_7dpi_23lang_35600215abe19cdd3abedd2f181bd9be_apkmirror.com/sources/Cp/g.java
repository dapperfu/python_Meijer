package Cp;

import com.meijer.mobile.receipt.service.api.models.SubmitTransactionRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vk.C17590a;
import zp.TransactionDetails;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzp/i;", "Lcom/meijer/mobile/receipt/service/api/models/SubmitTransactionRequest;", "a", "(Lzp/i;)Lcom/meijer/mobile/receipt/service/api/models/SubmitTransactionRequest;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g {
    public static final SubmitTransactionRequest a(TransactionDetails transactionDetails) {
        Intrinsics.j(transactionDetails, "<this>");
        int transactionId = transactionDetails.getTransactionId();
        int lane = transactionDetails.getLane();
        int storeNumber = transactionDetails.getStoreNumber();
        String str = transactionDetails.getTransactionDate().format(C17590a.ISO_LOCAL_DATE);
        Intrinsics.i(str, "format(...)");
        String str2 = transactionDetails.getTransactionTime().format(C17590a.f164803a.v());
        Intrinsics.i(str2, "format(...)");
        return new SubmitTransactionRequest(transactionId, lane, storeNumber, str, str2);
    }
}
