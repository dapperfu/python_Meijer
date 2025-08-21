package go;

import com.meijer.mobile.mperks.networking.api.models.RewardIncludedUpcsResponse;
import com.meijer.mobile.mperks.networking.domain.models.PaginatedResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/RewardIncludedUpcsResponse;", "Lcom/meijer/mobile/mperks/networking/domain/models/PaginatedResult;", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "a", "(Lcom/meijer/mobile/mperks/networking/api/models/RewardIncludedUpcsResponse;)Lcom/meijer/mobile/mperks/networking/domain/models/PaginatedResult;", "networking_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class p {
    public static final PaginatedResult<String> a(RewardIncludedUpcsResponse rewardIncludedUpcsResponse) {
        Intrinsics.j(rewardIncludedUpcsResponse, "<this>");
        int count = rewardIncludedUpcsResponse.getCount();
        String continuationToken = rewardIncludedUpcsResponse.getContinuationToken();
        List<Long> listC = rewardIncludedUpcsResponse.c();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        return new PaginatedResult<>(count, continuationToken, arrayList);
    }
}
