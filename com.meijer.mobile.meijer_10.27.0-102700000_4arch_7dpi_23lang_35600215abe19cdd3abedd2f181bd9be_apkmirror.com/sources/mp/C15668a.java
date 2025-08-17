package mp;

import Bo.c;
import Ho.SponsoredData;
import com.meijer.mobile.product.service.recommendations.models.PersonalizedProductsResponseV2Json;
import io.constructor.data.model.common.ResultData;
import ip.PersonalizedProductsResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/product/service/recommendations/models/PersonalizedProductsResponseV2Json;", "", "storeId", "Lip/a;", "a", "(Lcom/meijer/mobile/product/service/recommendations/models/PersonalizedProductsResponseV2Json;I)Lip/a;", "recommendations_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: mp.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15668a {
    public static final PersonalizedProductsResponse a(PersonalizedProductsResponseV2Json personalizedProductsResponseV2Json, int i10) {
        Intrinsics.j(personalizedProductsResponseV2Json, "<this>");
        int resultCode = personalizedProductsResponseV2Json.getResultCode();
        String resultDescription = personalizedProductsResponseV2Json.getResultDescription();
        int totalProducts = personalizedProductsResponseV2Json.getTotalProducts();
        List<ResultData> listC = personalizedProductsResponseV2Json.c();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listC, 10));
        for (ResultData resultData : listC) {
            String id2 = resultData.getId();
            if (id2 == null) {
                id2 = "";
            }
            String onViewBeacon = personalizedProductsResponseV2Json.getOnViewBeacon();
            String str = onViewBeacon == null ? "" : onViewBeacon;
            String onLoadBeacon = personalizedProductsResponseV2Json.getOnLoadBeacon();
            arrayList.add(c.b(resultData, i10, new SponsoredData(id2, null, null, null, null, null, str, onLoadBeacon == null ? "" : onLoadBeacon, 62, null)));
        }
        return new PersonalizedProductsResponse(resultCode, resultDescription, totalProducts, arrayList);
    }
}
