package go;

import co.ClippedReward;
import com.meijer.mobile.mperks.networking.api.models.MperksEarnedRewardJson;
import j$.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import wk.C17898a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/MperksEarnedRewardJson;", "Lco/e;", "a", "(Lcom/meijer/mobile/mperks/networking/api/models/MperksEarnedRewardJson;)Lco/e;", "networking_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h {
    public static final ClippedReward a(MperksEarnedRewardJson mperksEarnedRewardJson) {
        Intrinsics.j(mperksEarnedRewardJson, "<this>");
        long logixOfferId = mperksEarnedRewardJson.getLogixOfferId();
        String title = mperksEarnedRewardJson.getTitle();
        String description = mperksEarnedRewardJson.getDescription();
        String imageUrl = mperksEarnedRewardJson.getImageUrl();
        String redeemedDate = mperksEarnedRewardJson.getRedeemedDate();
        return new ClippedReward(logixOfferId, description, imageUrl, title, redeemedDate != null ? (LocalDateTime) wk.d.b(redeemedDate, C17898a.f167225a.s(), new uh.j()) : null, mperksEarnedRewardJson.getTermsAndConditions());
    }
}
