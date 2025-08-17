package jj;

import com.meijer.mobile.cart.model.hybris.HybrisBatchEntryUpdateRequest;
import com.meijer.mobile.cart.model.hybris.HybrisMultiEntryUpdateRequest;
import com.meijer.mobile.product.model.hybris.api.models.HybrisProductIdentity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "Lmk/i;", "Lcom/meijer/mobile/cart/model/hybris/HybrisBatchEntryUpdateRequest;", "a", "(Ljava/util/List;)Lcom/meijer/mobile/cart/model/hybris/HybrisBatchEntryUpdateRequest;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class n {
    public static final HybrisBatchEntryUpdateRequest a(List<? extends mk.i> list) {
        Intrinsics.j(list, "<this>");
        List<? extends mk.i> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
        for (mk.i iVar : list2) {
            arrayList.add(new HybrisMultiEntryUpdateRequest(iVar.getQuantity(), new HybrisProductIdentity(iVar.getProduct().getCode())));
        }
        return new HybrisBatchEntryUpdateRequest(arrayList);
    }
}
