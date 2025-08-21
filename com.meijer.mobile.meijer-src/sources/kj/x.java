package kj;

import com.meijer.mobile.address.model.hybris.HybrisCustomerAddress;
import com.meijer.mobile.cart.model.hybris.MultiTenderPaymentInfoResponse;
import com.meijer.mobile.cart.model.hybris.TendersItemResponse;
import di.CustomerAddress;
import ei.C13801b;
import fj.MultiTenderPaymentInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/MultiTenderPaymentInfoResponse;", "Lfj/s;", "a", "(Lcom/meijer/mobile/cart/model/hybris/MultiTenderPaymentInfoResponse;)Lfj/s;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class x {
    public static final MultiTenderPaymentInfo a(MultiTenderPaymentInfoResponse multiTenderPaymentInfoResponse) {
        Intrinsics.j(multiTenderPaymentInfoResponse, "<this>");
        String accountHolderName = multiTenderPaymentInfoResponse.getAccountHolderName();
        HybrisCustomerAddress billingAddress = multiTenderPaymentInfoResponse.getBillingAddress();
        ArrayList arrayList = null;
        CustomerAddress customerAddressA = billingAddress != null ? C13801b.a(billingAddress) : null;
        List<TendersItemResponse> listC = multiTenderPaymentInfoResponse.c();
        if (listC != null) {
            List<TendersItemResponse> list = listC;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list, 10));
            for (TendersItemResponse tendersItemResponse : list) {
                arrayList2.add(tendersItemResponse != null ? F.b(tendersItemResponse) : null);
            }
            arrayList = arrayList2;
        }
        return new MultiTenderPaymentInfo(accountHolderName, customerAddressA, arrayList);
    }
}
