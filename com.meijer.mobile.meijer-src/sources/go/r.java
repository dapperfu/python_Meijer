package go;

import com.meijer.mobile.mperks.networking.api.models.RewardAccountTransactionReasonJson;
import com.meijer.mobile.mperks.networking.api.models.SaleDetailsJson;
import com.meijer.mobile.mperks.networking.domain.models.ReasonDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/SaleDetailsJson;", "Lcom/meijer/mobile/mperks/networking/api/models/RewardAccountTransactionReasonJson;", "reason", "Lcom/meijer/mobile/mperks/networking/domain/models/ReasonDetails$SaleDetails;", "a", "(Lcom/meijer/mobile/mperks/networking/api/models/SaleDetailsJson;Lcom/meijer/mobile/mperks/networking/api/models/RewardAccountTransactionReasonJson;)Lcom/meijer/mobile/mperks/networking/domain/models/ReasonDetails$SaleDetails;", "networking_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class r {
    public static final ReasonDetails.SaleDetails a(SaleDetailsJson saleDetailsJson, RewardAccountTransactionReasonJson reason) {
        Intrinsics.j(saleDetailsJson, "<this>");
        Intrinsics.j(reason, "reason");
        return new ReasonDetails.SaleDetails(o.a(reason), saleDetailsJson.getSaleId(), saleDetailsJson.getPartner(), saleDetailsJson.getPartnerOrderId(), saleDetailsJson.getDigitalOrderId());
    }
}
