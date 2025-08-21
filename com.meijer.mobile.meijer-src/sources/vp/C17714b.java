package vp;

import com.meijer.mobile.rateandtip.service.models.RateShopperRequestJson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvp/a;", "Lcom/meijer/mobile/rateandtip/service/models/RateShopperRequestJson;", "a", "(Lvp/a;)Lcom/meijer/mobile/rateandtip/service/models/RateShopperRequestJson;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: vp.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C17714b {
    public static final RateShopperRequestJson a(RateShopperRequest rateShopperRequest) {
        Intrinsics.j(rateShopperRequest, "<this>");
        return new RateShopperRequestJson(rateShopperRequest.getShopperName(), rateShopperRequest.getRate());
    }
}
