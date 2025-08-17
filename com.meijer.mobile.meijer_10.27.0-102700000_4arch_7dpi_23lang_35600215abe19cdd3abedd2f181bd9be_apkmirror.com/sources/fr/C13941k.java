package fr;

import com.meijer.mobile.subscription.service.api.models.ProductInfoRequestJson;
import dr.ProductInfoRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldr/f;", "Lcom/meijer/mobile/subscription/service/api/models/ProductInfoRequestJson;", "a", "(Ldr/f;)Lcom/meijer/mobile/subscription/service/api/models/ProductInfoRequestJson;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: fr.k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13941k {
    public static final ProductInfoRequestJson a(ProductInfoRequest productInfoRequest) {
        Intrinsics.j(productInfoRequest, "<this>");
        return new ProductInfoRequestJson(productInfoRequest.getProductCode(), productInfoRequest.getProductImageThumbnail(), productInfoRequest.getProductName(), productInfoRequest.getProductPrice(), (int) productInfoRequest.getProductQty(), productInfoRequest.getProductUnit());
    }
}
