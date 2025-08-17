package cm;

import Ul.HomeCouponCard;
import Ul.e;
import cl.C6409a;
import com.meijer.mobile.coupons.api.models.LegacyCouponJson;
import com.meijer.mobile.home.service.models.homecard.HandPickedOfferCard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/home/service/models/homecard/HandPickedOfferCard;", "LUl/f;", "a", "(Lcom/meijer/mobile/home/service/models/homecard/HandPickedOfferCard;)LUl/f;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: cm.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6413a {
    public static final HomeCouponCard a(HandPickedOfferCard handPickedOfferCard) {
        Intrinsics.j(handPickedOfferCard, "<this>");
        e.b.SpecialOffers specialOffers = new e.b.SpecialOffers(0, 1, null);
        List<LegacyCouponJson> listD = handPickedOfferCard.d();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(C6409a.g((LegacyCouponJson) it.next()));
        }
        return new HomeCouponCard("HandpickedOffers", "Special Offers", specialOffers, arrayList, null, null, null, handPickedOfferCard.getTotalHandPickedOffersCount(), null, null, 880, null);
    }
}
