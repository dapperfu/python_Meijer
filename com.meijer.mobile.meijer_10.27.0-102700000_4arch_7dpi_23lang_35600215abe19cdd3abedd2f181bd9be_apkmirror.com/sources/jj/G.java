package jj;

import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.cart.model.hybris.HybrisPaymentRefundDetailInfo;
import com.meijer.mobile.cart.model.hybris.TransactionDTResponse;
import com.meijer.mobile.cart.model.hybris.TransactionDetailsResponse;
import ej.TransactionDetails;
import j$.time.OffsetDateTime;
import j$.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import vk.C17590a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/TransactionDetailsResponse;", "Lej/J;", "a", "(Lcom/meijer/mobile/cart/model/hybris/TransactionDetailsResponse;)Lej/J;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class G {
    public static final TransactionDetails a(TransactionDetailsResponse transactionDetailsResponse) {
        String dateTime;
        Intrinsics.j(transactionDetailsResponse, "<this>");
        String ebtCaptureTranId = transactionDetailsResponse.getEbtCaptureTranId();
        Double ebtRefundAmount = transactionDetailsResponse.getEbtRefundAmount();
        TransactionDTResponse transactionDateTime = transactionDetailsResponse.getTransactionDateTime();
        ZonedDateTime zonedDateTime = (transactionDateTime == null || (dateTime = transactionDateTime.getDateTime()) == null) ? null : (ZonedDateTime) vk.d.b(dateTime, C17590a.FULL_NUMERIC_MONTH_DATE_TIME, new k());
        String ebtRefundDateTime = transactionDetailsResponse.getEbtRefundDateTime();
        Double approvedAmount = transactionDetailsResponse.getApprovedAmount();
        String ebtRefundTranId = transactionDetailsResponse.getEbtRefundTranId();
        Double ebtBalanceAmount = transactionDetailsResponse.getEbtBalanceAmount();
        Double ebtCapturedAmount = transactionDetailsResponse.getEbtCapturedAmount();
        Double remainingBalanceCash = transactionDetailsResponse.getRemainingBalanceCash();
        Double remainingBalanceSNAP = transactionDetailsResponse.getRemainingBalanceSNAP();
        String ebtCaptureDateTime = transactionDetailsResponse.getEbtCaptureDateTime();
        OffsetDateTime offsetDateTime = ebtCaptureDateTime != null ? (OffsetDateTime) vk.d.b(ebtCaptureDateTime, C17590a.f164803a.s(), new r()) : null;
        List<HybrisPaymentRefundDetailInfo> listI = transactionDetailsResponse.i();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listI, 10));
        Iterator<T> it = listI.iterator();
        while (it.hasNext()) {
            arrayList.add(s.a((HybrisPaymentRefundDetailInfo) it.next()));
        }
        return new TransactionDetails(ebtCaptureTranId, ebtRefundAmount, zonedDateTime, ebtRefundDateTime, approvedAmount, ebtRefundTranId, ebtBalanceAmount, ebtCapturedAmount, remainingBalanceCash, remainingBalanceSNAP, offsetDateTime, null, arrayList, RecyclerView.m.FLAG_MOVED, null);
    }
}
