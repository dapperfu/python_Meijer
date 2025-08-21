package nj;

import com.meijer.mobile.cart.model.hybris.orderdetails.TipAndRateDetailsResponse;
import hj.TipAndRateDetails;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/orderdetails/TipAndRateDetailsResponse;", "Lhj/n;", "a", "(Lcom/meijer/mobile/cart/model/hybris/orderdetails/TipAndRateDetailsResponse;)Lhj/n;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class g {
    public static final TipAndRateDetails a(TipAndRateDetailsResponse tipAndRateDetailsResponse) {
        return tipAndRateDetailsResponse == null ? new TipAndRateDetails(false, null, null, 7, null) : new TipAndRateDetails(tipAndRateDetailsResponse.getTippablePartner(), h.b(tipAndRateDetailsResponse.getTipDetails()), f.a(tipAndRateDetailsResponse.getRateDetails()));
    }
}
