package Lo;

import Fo.Discount;
import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisDiscount;
import j$.time.OffsetDateTime;
import kj.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import wk.C17898a;
import wk.d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisDiscount;", "LFo/a;", "a", "(Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisDiscount;)LFo/a;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class a {
    public static final Discount a(HybrisDiscount hybrisDiscount) {
        Intrinsics.j(hybrisDiscount, "<this>");
        boolean map = hybrisDiscount.getMap();
        String priceGoodThroughString = hybrisDiscount.getPriceGoodThroughString();
        if (priceGoodThroughString == null || StringsKt.s0(priceGoodThroughString)) {
            priceGoodThroughString = null;
        }
        return new Discount(map, priceGoodThroughString != null ? (OffsetDateTime) d.a(priceGoodThroughString, C17898a.f167225a.s(), new r()) : null, hybrisDiscount.getSalePriceText(), hybrisDiscount.getSalePriceType(), hybrisDiscount.getSalePriceValue(), hybrisDiscount.getSavingsText(), hybrisDiscount.getUnit(), hybrisDiscount.getUnitFactor(), hybrisDiscount.getValue());
    }
}
