package mj;

import com.meijer.mobile.cart.model.hybris.orderdetails.HybrisTipAmount;
import gj.TipAmount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/orderdetails/HybrisTipAmount;", "Lgj/m;", "a", "(Lcom/meijer/mobile/cart/model/hybris/orderdetails/HybrisTipAmount;)Lgj/m;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: mj.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C15636b {
    public static final TipAmount a(HybrisTipAmount hybrisTipAmount) {
        Intrinsics.j(hybrisTipAmount, "<this>");
        return new TipAmount(hybrisTipAmount.getAveragePoundEach(), hybrisTipAmount.getCurrencyIso(), hybrisTipAmount.getFormattedValue(), hybrisTipAmount.getPriceType(), hybrisTipAmount.getValue());
    }
}
