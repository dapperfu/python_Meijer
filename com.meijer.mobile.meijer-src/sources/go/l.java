package go;

import co.EarnReward;
import co.EnumC6540l;
import co.EnumC6541m;
import co.EnumC6542n;
import com.meijer.mobile.mperks.networking.api.models.MperksRewardJson;
import fl.C14016a;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import wk.C17898a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/MperksRewardJson;", "Lco/g;", "a", "(Lcom/meijer/mobile/mperks/networking/api/models/MperksRewardJson;)Lco/g;", "networking_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l {
    public static final EarnReward a(MperksRewardJson mperksRewardJson) {
        Intrinsics.j(mperksRewardJson, "<this>");
        long rewardId = mperksRewardJson.getRewardId();
        EnumC6541m enumC6541m = Intrinsics.e(mperksRewardJson.getRewardProgram(), "booster") ? EnumC6541m.f62801a : EnumC6541m.f62802b;
        String imageUrl = mperksRewardJson.getImageUrl();
        String title = mperksRewardJson.getTitle();
        String description = mperksRewardJson.getDescription();
        String startAt = mperksRewardJson.getStartAt();
        C17898a c17898a = C17898a.f167225a;
        ZonedDateTime zonedDateTimeAtZone = ((Instant) wk.d.a(startAt, c17898a.s(), new C14016a())).atZone(ZoneId.systemDefault());
        ZonedDateTime zonedDateTimeAtZone2 = ((Instant) wk.d.a(mperksRewardJson.getEndAt(), c17898a.s(), new C14016a())).atZone(ZoneId.systemDefault());
        String terms = mperksRewardJson.getTerms();
        String earnKind = mperksRewardJson.getEarnKind();
        return new EarnReward(rewardId, enumC6541m, imageUrl, title, description, zonedDateTimeAtZone, zonedDateTimeAtZone2, terms, Intrinsics.e(earnKind, "Purchase") ? EnumC6540l.f62797b : Intrinsics.e(earnKind, "NonPurchase") ? EnumC6540l.f62798c : EnumC6540l.f62796a, mperksRewardJson.getEarnRequirement(), mperksRewardJson.getProgress(), Intrinsics.e(mperksRewardJson.getEarnMetric(), "Dollar") ? EnumC6542n.f62805a : EnumC6542n.f62806b, mperksRewardJson.getMaxDaysToEarn(), mperksRewardJson.getMaxDaysToRedeem(), mperksRewardJson.getMaxEarnCount(), mperksRewardJson.getAllowCarryOver(), mperksRewardJson.getHasUpcs());
    }
}
