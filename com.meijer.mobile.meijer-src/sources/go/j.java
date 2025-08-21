package go;

import com.meijer.mobile.mperks.networking.api.models.MperksEarnedRewardJson;
import com.meijer.mobile.mperks.networking.api.models.MperksRewardEarnedResponse;
import com.meijer.mobile.mperks.networking.domain.models.MperksRewardEarnedDetail;
import com.meijer.mobile.mperks.networking.domain.models.RewardEarnedSummary;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/MperksRewardEarnedResponse;", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksRewardEarnedDetail;", "a", "(Lcom/meijer/mobile/mperks/networking/api/models/MperksRewardEarnedResponse;)Lcom/meijer/mobile/mperks/networking/domain/models/MperksRewardEarnedDetail;", "networking_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class j {
    public static final MperksRewardEarnedDetail a(MperksRewardEarnedResponse mperksRewardEarnedResponse) {
        Intrinsics.j(mperksRewardEarnedResponse, "<this>");
        RewardEarnedSummary rewardEarnedSummaryA = k.a(mperksRewardEarnedResponse.getSummary());
        List<MperksEarnedRewardJson> listB = mperksRewardEarnedResponse.b();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(h.a((MperksEarnedRewardJson) it.next()));
        }
        List<MperksEarnedRewardJson> listA = mperksRewardEarnedResponse.a();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listA, 10));
        Iterator<T> it2 = listA.iterator();
        while (it2.hasNext()) {
            arrayList2.add(h.a((MperksEarnedRewardJson) it2.next()));
        }
        return new MperksRewardEarnedDetail(rewardEarnedSummaryA, arrayList, arrayList2);
    }
}
