package Fl;

import Hl.FlyBuyOrderDetail;
import com.meijer.mobile.fulfillment.flybuy.api.models.PagesResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/fulfillment/flybuy/api/models/PagesResponse;", "LHl/b$d;", "a", "(Lcom/meijer/mobile/fulfillment/flybuy/api/models/PagesResponse;)LHl/b$d;", "flybuy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d {
    public static final FlyBuyOrderDetail.Pages a(PagesResponse pagesResponse) {
        Intrinsics.j(pagesResponse, "<this>");
        return new FlyBuyOrderDetail.Pages(Integer.valueOf(pagesResponse.getCurrent()), Integer.valueOf(pagesResponse.getCount()), Integer.valueOf(pagesResponse.getPer()));
    }
}
