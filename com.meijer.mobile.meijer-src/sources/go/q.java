package go;

import com.meijer.mobile.mperks.networking.api.models.RewardOfferJson;
import com.meijer.mobile.mperks.networking.domain.models.RewardOffer;
import j$.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import wk.C17898a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/RewardOfferJson;", "Lcom/meijer/mobile/mperks/networking/domain/models/RewardOffer;", "a", "(Lcom/meijer/mobile/mperks/networking/api/models/RewardOfferJson;)Lcom/meijer/mobile/mperks/networking/domain/models/RewardOffer;", "networking_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class q {
    public static final RewardOffer a(RewardOfferJson rewardOfferJson) {
        Intrinsics.j(rewardOfferJson, "<this>");
        long meijerOfferId = rewardOfferJson.getMeijerOfferId();
        boolean isClippable = rewardOfferJson.getIsClippable();
        String title = rewardOfferJson.getTitle();
        String subTitle = rewardOfferJson.getSubTitle();
        String description = rewardOfferJson.getDescription();
        String termsConditionsDescription = rewardOfferJson.getTermsConditionsDescription();
        String endDate = rewardOfferJson.getEndDate();
        LocalDateTime localDateTime = endDate != null ? (LocalDateTime) wk.d.b(endDate, C17898a.f167225a.s(), new uh.j()) : null;
        int pointCost = rewardOfferJson.getPointCost();
        EnumEntries<RewardOffer.ConditionType> entries = RewardOffer.ConditionType.getEntries();
        Integer conditionTypeId = rewardOfferJson.getConditionTypeId();
        return new RewardOffer(meijerOfferId, isClippable, title, subTitle, description, termsConditionsDescription, localDateTime, pointCost, entries.get(conditionTypeId != null ? conditionTypeId.intValue() : RewardOffer.ConditionType.UNKNOWN.ordinal()), rewardOfferJson.getImageURL(), rewardOfferJson.getIsClipped());
    }
}
