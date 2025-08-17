package fr;

import com.meijer.mobile.subscription.service.api.models.ProductInfoResponseJson;
import cr.ProductInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/subscription/service/api/models/ProductInfoResponseJson;", "Lcr/i;", "a", "(Lcom/meijer/mobile/subscription/service/api/models/ProductInfoResponseJson;)Lcr/i;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: fr.l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13942l {
    public static final ProductInfo a(ProductInfoResponseJson productInfoResponseJson) {
        Intrinsics.j(productInfoResponseJson, "<this>");
        return new ProductInfo(productInfoResponseJson.getProductCode(), productInfoResponseJson.getProductImageThumbnail(), productInfoResponseJson.getProductName(), productInfoResponseJson.getProductPrice(), productInfoResponseJson.getProductQty(), productInfoResponseJson.getProductUnit());
    }
}
