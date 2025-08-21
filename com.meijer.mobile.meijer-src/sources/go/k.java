package go;

import com.meijer.mobile.mperks.networking.api.models.MperksRewardEarnedSummaryJson;
import com.meijer.mobile.mperks.networking.domain.models.RewardEarnedSummary;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/MperksRewardEarnedSummaryJson;", "Lcom/meijer/mobile/mperks/networking/domain/models/RewardEarnedSummary;", "a", "(Lcom/meijer/mobile/mperks/networking/api/models/MperksRewardEarnedSummaryJson;)Lcom/meijer/mobile/mperks/networking/domain/models/RewardEarnedSummary;", "networking_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k {
    public static final RewardEarnedSummary a(MperksRewardEarnedSummaryJson mperksRewardEarnedSummaryJson) {
        Intrinsics.j(mperksRewardEarnedSummaryJson, "<this>");
        return new RewardEarnedSummary(mperksRewardEarnedSummaryJson.getEarnedCount());
    }
}
