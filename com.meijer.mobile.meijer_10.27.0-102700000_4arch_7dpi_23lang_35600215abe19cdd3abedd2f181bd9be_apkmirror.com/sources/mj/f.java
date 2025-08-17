package mj;

import com.meijer.mobile.cart.model.hybris.orderdetails.RateDetailsResponse;
import gj.RateDetails;
import j$.time.OffsetDateTime;
import jj.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vk.C17590a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/orderdetails/RateDetailsResponse;", "Lgj/k;", "a", "(Lcom/meijer/mobile/cart/model/hybris/orderdetails/RateDetailsResponse;)Lgj/k;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class f {
    public static final RateDetails a(RateDetailsResponse rateDetailsResponse) {
        Intrinsics.j(rateDetailsResponse, "<this>");
        boolean rated = rateDetailsResponse.getRated();
        int rating = rateDetailsResponse.getRating();
        String date = rateDetailsResponse.getDate();
        return new RateDetails(rated, rating, date != null ? (OffsetDateTime) vk.d.b(date, C17590a.f164803a.s(), new r()) : null);
    }
}
