package Rl;

import Pl.PicklistItem;
import com.meijer.mobile.greenville.model.response.picklist.ConfigurationResponse;
import com.meijer.mobile.greenville.model.response.picklist.PayloadResponse;
import com.meijer.mobile.greenville.model.response.picklist.PicklistItemResponse;
import com.meijer.mobile.greenville.model.response.picklist.PicklistResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/meijer/mobile/greenville/model/response/picklist/PicklistResponse;", "", "LPl/d;", "a", "(Lcom/meijer/mobile/greenville/model/response/picklist/PicklistResponse;)Ljava/util/List;", "greenville_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class a {
    public static final List<PicklistItem> a(PicklistResponse picklistResponse) {
        Intrinsics.j(picklistResponse, "<this>");
        List<PicklistItemResponse> listB = ((ConfigurationResponse) CollectionsKt.s0(((PayloadResponse) CollectionsKt.s0(picklistResponse.a())).e())).getConfiguration().getPickList().b();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listB, 10));
        for (PicklistItemResponse picklistItemResponse : listB) {
            List listP0 = CollectionsKt.P0(CollectionsKt.e(picklistItemResponse.getPlu()), picklistItemResponse.f());
            String itemDescription = picklistItemResponse.getItemDescription();
            String str = "";
            if (itemDescription == null) {
                itemDescription = "";
            }
            String customerFacingDescription = picklistItemResponse.getCustomerFacingDescription();
            if (customerFacingDescription != null) {
                str = customerFacingDescription;
            }
            arrayList.add(new PicklistItem(listP0, itemDescription, str, picklistItemResponse.getQuantityRequired(), picklistItemResponse.getWeightRequired(), picklistItemResponse.getImageURL()));
        }
        return arrayList;
    }
}
