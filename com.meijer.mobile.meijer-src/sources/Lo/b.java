package Lo;

import Fo.Price;
import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "Lnk/b;", "a", "(Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;)Lnk/b;", "b", "(Lnk/b;)Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b {
    public static final nk.b a(HybrisPrice hybrisPrice) {
        Intrinsics.j(hybrisPrice, "<this>");
        return new Price(hybrisPrice.getCurrencyIso(), hybrisPrice.getFormattedValue(), hybrisPrice.getPriceType(), hybrisPrice.getUnit(), hybrisPrice.getValue(), hybrisPrice.getAveragePoundEach(), hybrisPrice.getPriceText());
    }

    public static final HybrisPrice b(nk.b bVar) {
        Intrinsics.j(bVar, "<this>");
        return new HybrisPrice(bVar.getCurrencyIso(), bVar.getFormattedValue(), bVar instanceof Price ? ((Price) bVar).getPriceType() : "BUY", bVar.getUnit(), bVar.getValue(), bVar.getAveragePoundEach(), bVar.getPriceText());
    }
}
