package oj;

import Co.Image;
import com.meijer.mobile.cart.model.hybris.orders.HybrisPromotion;
import com.meijer.mobile.cart.model.hybris.orders.HybrisPromotionRestriction;
import com.meijer.mobile.product.model.hybris.api.models.HybrisImage;
import hj.Promotion;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/orders/HybrisPromotion;", "Lhj/g;", "a", "(Lcom/meijer/mobile/cart/model/hybris/orders/HybrisPromotion;)Lhj/g;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: oj.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C16211c {
    public static final Promotion a(HybrisPromotion hybrisPromotion) {
        Intrinsics.j(hybrisPromotion, "<this>");
        String code = hybrisPromotion.getCode();
        List<String> listB = hybrisPromotion.b();
        String description = hybrisPromotion.getDescription();
        boolean enabled = hybrisPromotion.getEnabled();
        String endDate = hybrisPromotion.getEndDate();
        List<String> listF = hybrisPromotion.f();
        int priority = hybrisPromotion.getPriority();
        HybrisImage productBanner = hybrisPromotion.getProductBanner();
        Image imageA = productBanner != null ? Io.c.a(productBanner) : null;
        String promotionGroup = hybrisPromotion.getPromotionGroup();
        String promotionType = hybrisPromotion.getPromotionType();
        HybrisPromotionRestriction restrictions = hybrisPromotion.getRestrictions();
        return new Promotion(code, listB, description, enabled, endDate, listF, priority, imageA, promotionGroup, promotionType, restrictions != null ? C16213e.a(restrictions) : null, hybrisPromotion.getStartDate(), hybrisPromotion.getTitle());
    }
}
