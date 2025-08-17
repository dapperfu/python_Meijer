package dm;

import Vl.MperksData;
import com.meijer.mobile.home.service.models.mperks.AvailableRewardCouponDto;
import com.meijer.mobile.home.service.models.mperks.ClippedRewardCouponDto;
import com.meijer.mobile.home.service.models.mperks.MperksDataDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/home/service/models/mperks/MperksDataDto;", "LVl/e;", "a", "(Lcom/meijer/mobile/home/service/models/mperks/MperksDataDto;)LVl/e;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class e {
    public static final MperksData a(MperksDataDto mperksDataDto) {
        Intrinsics.j(mperksDataDto, "<this>");
        List<AvailableRewardCouponDto> listA = mperksDataDto.a();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(C13539a.a((AvailableRewardCouponDto) it.next()));
        }
        List<ClippedRewardCouponDto> listB = mperksDataDto.b();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listB, 10));
        Iterator<T> it2 = listB.iterator();
        while (it2.hasNext()) {
            arrayList2.add(C13540b.a((ClippedRewardCouponDto) it2.next()));
        }
        return new MperksData(arrayList, arrayList2, mperksDataDto.getPointBalance());
    }
}
