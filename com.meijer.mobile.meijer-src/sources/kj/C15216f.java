package kj;

import com.meijer.mobile.cart.model.hybris.CustomerDataResponse;
import com.meijer.mobile.cart.model.hybris.MembershipResponse;
import fj.CustomerData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/CustomerDataResponse;", "Lfj/g;", "a", "(Lcom/meijer/mobile/cart/model/hybris/CustomerDataResponse;)Lfj/g;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: kj.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C15216f {
    public static final CustomerData a(CustomerDataResponse customerDataResponse) {
        Intrinsics.j(customerDataResponse, "<this>");
        String customerId = customerDataResponse.getCustomerId();
        String maskedMperksRewardsId = customerDataResponse.getMaskedMperksRewardsId();
        MembershipResponse membershipResponse = customerDataResponse.getMembershipResponse();
        return new CustomerData(customerId, maskedMperksRewardsId, membershipResponse != null ? v.a(membershipResponse) : null);
    }
}
