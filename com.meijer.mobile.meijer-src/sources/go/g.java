package go;

import com.meijer.mobile.mperks.networking.api.models.MperksCreditCardInfoResponse;
import com.meijer.mobile.mperks.networking.api.models.RewardOfferJson;
import com.meijer.mobile.mperks.networking.domain.models.MperksCreditCardInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ok.MccProgram;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/MperksCreditCardInfoResponse;", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksCreditCardInfo;", "a", "(Lcom/meijer/mobile/mperks/networking/api/models/MperksCreditCardInfoResponse;)Lcom/meijer/mobile/mperks/networking/domain/models/MperksCreditCardInfo;", "networking_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class g {
    public static final MperksCreditCardInfo a(MperksCreditCardInfoResponse mperksCreditCardInfoResponse) {
        Intrinsics.j(mperksCreditCardInfoResponse, "<this>");
        EnumEntries<MccProgram.c> enumEntriesB = MccProgram.c.b();
        int enrollmentStatus = mperksCreditCardInfoResponse.getEnrollmentStatus();
        MccProgram.c cVar = (enrollmentStatus < 0 || enrollmentStatus >= enumEntriesB.size()) ? MccProgram.c.f154293a : enumEntriesB.get(enrollmentStatus);
        double dollarProgress = mperksCreditCardInfoResponse.getDollarProgress();
        List<RewardOfferJson> listC = mperksCreditCardInfoResponse.c();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(q.a((RewardOfferJson) it.next()));
        }
        return new MperksCreditCardInfo(cVar, dollarProgress, arrayList);
    }
}
