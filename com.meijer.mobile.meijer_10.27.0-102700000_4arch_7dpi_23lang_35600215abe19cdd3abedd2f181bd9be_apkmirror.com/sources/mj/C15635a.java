package mj;

import com.meijer.mobile.cart.model.hybris.orderdetails.HybrisShopperInfo;
import gj.ShopperInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/orderdetails/HybrisShopperInfo;", "Lgj/l;", "a", "(Lcom/meijer/mobile/cart/model/hybris/orderdetails/HybrisShopperInfo;)Lgj/l;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: mj.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C15635a {
    public static final ShopperInfo a(HybrisShopperInfo hybrisShopperInfo) {
        Intrinsics.j(hybrisShopperInfo, "<this>");
        return new ShopperInfo(hybrisShopperInfo.getName(), hybrisShopperInfo.getImage());
    }
}
