package jj;

import com.meijer.mobile.cart.model.hybris.HighValuePromo;
import ej.HighValuePromoData;
import j$.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vk.C17590a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/HighValuePromo;", "Lej/p;", "a", "(Lcom/meijer/mobile/cart/model/hybris/HighValuePromo;)Lej/p;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class l {
    public static final HighValuePromoData a(HighValuePromo highValuePromo) {
        Intrinsics.j(highValuePromo, "<this>");
        String advText = highValuePromo.getAdvText();
        String expirationDate = highValuePromo.getExpirationDate();
        return new HighValuePromoData(advText, expirationDate != null ? (ZonedDateTime) vk.d.b(expirationDate, C17590a.FULL_NUMERIC_MONTH_DATE_TIME, new k()) : null, highValuePromo.getPromoDesc(), highValuePromo.getPromoNum(), highValuePromo.getPromptResponse(), Intrinsics.e(highValuePromo.getPromptResponse(), "execute"));
    }
}
