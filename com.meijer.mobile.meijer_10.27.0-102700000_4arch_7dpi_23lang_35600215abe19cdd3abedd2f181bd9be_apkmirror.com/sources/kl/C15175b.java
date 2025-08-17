package kl;

import com.meijer.mobile.cart.model.hybris.checkout.TipJson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkl/a;", "Lcom/meijer/mobile/cart/model/hybris/checkout/TipJson;", "a", "(Lkl/a;)Lcom/meijer/mobile/cart/model/hybris/checkout/TipJson;", "digitalshopping_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: kl.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C15175b {
    public static final TipJson a(Tip tip) {
        Intrinsics.j(tip, "<this>");
        return new TipJson(tip.getPercent(), tip.getValue());
    }
}
