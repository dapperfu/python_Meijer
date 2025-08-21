package go;

import com.meijer.mobile.mperks.networking.api.models.MperksTransactionHistoryResponse;
import com.meijer.mobile.mperks.networking.api.models.MperksTransactionJson;
import com.meijer.mobile.mperks.networking.domain.models.MperksTransaction;
import com.meijer.mobile.mperks.networking.domain.models.PaginatedResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/MperksTransactionHistoryResponse;", "Lcom/meijer/mobile/mperks/networking/domain/models/PaginatedResult;", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransaction;", "a", "(Lcom/meijer/mobile/mperks/networking/api/models/MperksTransactionHistoryResponse;)Lcom/meijer/mobile/mperks/networking/domain/models/PaginatedResult;", "networking_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class m {
    public static final PaginatedResult<MperksTransaction> a(MperksTransactionHistoryResponse mperksTransactionHistoryResponse) {
        Intrinsics.j(mperksTransactionHistoryResponse, "<this>");
        String continuationToken = mperksTransactionHistoryResponse.getContinuationToken();
        int count = mperksTransactionHistoryResponse.getCount();
        List<MperksTransactionJson> listC = mperksTransactionHistoryResponse.c();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(n.a((MperksTransactionJson) it.next()));
        }
        return new PaginatedResult<>(count, continuationToken, arrayList);
    }
}
