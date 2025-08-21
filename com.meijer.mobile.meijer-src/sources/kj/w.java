package kj;

import com.meijer.mobile.cart.model.hybris.MultiTenderPaymentDetailsCreateRequest;
import com.meijer.mobile.cart.model.hybris.PaymentDetailsCreateRequest;
import hk.EbtPaymentOption;
import hk.MultiTenderPaymentOption;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhk/e;", "Lcom/meijer/mobile/cart/model/hybris/MultiTenderPaymentDetailsCreateRequest;", "a", "(Lhk/e;)Lcom/meijer/mobile/cart/model/hybris/MultiTenderPaymentDetailsCreateRequest;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class w {
    public static final MultiTenderPaymentDetailsCreateRequest a(MultiTenderPaymentOption multiTenderPaymentOption) {
        Intrinsics.j(multiTenderPaymentOption, "<this>");
        String selectedType = multiTenderPaymentOption.getSelectedTender().getSelectedType();
        PaymentDetailsCreateRequest paymentDetailsCreateRequestA = z.a(multiTenderPaymentOption.getCreditDebitPaymentOption());
        EbtPaymentOption ebtPaymentOption = multiTenderPaymentOption.getEbtPaymentOption();
        return new MultiTenderPaymentDetailsCreateRequest(selectedType, paymentDetailsCreateRequestA, ebtPaymentOption != null ? C15209A.a(ebtPaymentOption) : null);
    }
}
