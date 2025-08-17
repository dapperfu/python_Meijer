package pj;

import com.meijer.mobile.cart.model.hybris.Cart;
import com.meijer.mobile.cart.model.hybris.promos.HybrisApplyPromoCodeResponse;
import com.meijer.mobile.cart.model.hybris.promos.HybrisPromoCoupon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/promos/HybrisApplyPromoCodeResponse;", "Lpj/a;", "a", "(Lcom/meijer/mobile/cart/model/hybris/promos/HybrisApplyPromoCodeResponse;)Lpj/a;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: pj.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C16311b {
    public static final ApplyPromoCodeResult a(HybrisApplyPromoCodeResponse hybrisApplyPromoCodeResponse) {
        String clipResult;
        Object next;
        Intrinsics.j(hybrisApplyPromoCodeResponse, "<this>");
        boolean z10 = true;
        boolean zH = StringsKt.H(hybrisApplyPromoCodeResponse.getPromo().getPromoCodeResponseMessage(), "success", true);
        List<HybrisPromoCoupon> listA = hybrisApplyPromoCodeResponse.getPromo().a();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(C16312c.a((HybrisPromoCoupon) it.next()));
        }
        if (arrayList.isEmpty()) {
            z10 = false;
            break;
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!((PromoCouponResult) it2.next()).getIsSuccess()) {
                    z10 = false;
                    break;
                }
            }
        }
        boolean z11 = z10;
        String str = (zH && z11) ? "Promo code applied!" : (zH && hybrisApplyPromoCodeResponse.getPromo().a().isEmpty()) ? "Promo code is invalid or expired." : "This promo code has already been applied.";
        Cart cart = hybrisApplyPromoCodeResponse.getCart();
        int promoCodeResponseCode = hybrisApplyPromoCodeResponse.getPromo().getPromoCodeResponseCode();
        String promoCodeResponseMessage = hybrisApplyPromoCodeResponse.getPromo().getPromoCodeResponseMessage();
        if (zH) {
            promoCodeResponseMessage = null;
        }
        if (promoCodeResponseMessage == null) {
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                if (!((PromoCouponResult) next).getIsSuccess()) {
                    break;
                }
            }
            PromoCouponResult promoCouponResult = (PromoCouponResult) next;
            clipResult = promoCouponResult != null ? promoCouponResult.getClipResult() : null;
        } else {
            clipResult = promoCodeResponseMessage;
        }
        return new ApplyPromoCodeResult(cart, arrayList, promoCodeResponseCode, str, clipResult, zH, z11);
    }
}
