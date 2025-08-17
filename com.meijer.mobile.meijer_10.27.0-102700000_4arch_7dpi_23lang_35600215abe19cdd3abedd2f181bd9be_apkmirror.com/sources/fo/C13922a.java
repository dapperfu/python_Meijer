package fo;

import com.meijer.mobile.mperks.networking.api.models.RewardIncludedUpcsResponseJson;
import com.meijer.mobile.mperks.networking.domain.models.RewardIncludedUpcsResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/RewardIncludedUpcsResponseJson;", "Lcom/meijer/mobile/mperks/networking/domain/models/RewardIncludedUpcsResponse;", "a", "(Lcom/meijer/mobile/mperks/networking/api/models/RewardIncludedUpcsResponseJson;)Lcom/meijer/mobile/mperks/networking/domain/models/RewardIncludedUpcsResponse;", "networking_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: fo.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13922a {
    public static final RewardIncludedUpcsResponse a(RewardIncludedUpcsResponseJson rewardIncludedUpcsResponseJson) {
        Intrinsics.j(rewardIncludedUpcsResponseJson, "<this>");
        int count = rewardIncludedUpcsResponseJson.getCount();
        String continuationToken = rewardIncludedUpcsResponseJson.getContinuationToken();
        List<Long> listC = rewardIncludedUpcsResponseJson.c();
        List arrayList = new ArrayList(CollectionsKt.x(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        if (rewardIncludedUpcsResponseJson.c().isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = CollectionsKt.m();
        }
        return new RewardIncludedUpcsResponse(count, continuationToken, arrayList);
    }
}
