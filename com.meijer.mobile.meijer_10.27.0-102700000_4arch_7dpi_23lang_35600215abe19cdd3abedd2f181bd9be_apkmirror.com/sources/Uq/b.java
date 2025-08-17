package Uq;

import Tq.OpeningSchedule;
import com.meijer.mobile.store.model.hybris.HybrisOpeningSchedule;
import com.meijer.mobile.store.model.hybris.HybrisWeekDayOpening;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/store/model/hybris/HybrisOpeningSchedule;", "LTq/b;", "a", "(Lcom/meijer/mobile/store/model/hybris/HybrisOpeningSchedule;)LTq/b;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class b {
    public static final OpeningSchedule a(HybrisOpeningSchedule hybrisOpeningSchedule) {
        Intrinsics.j(hybrisOpeningSchedule, "<this>");
        String code = hybrisOpeningSchedule.getCode();
        boolean is24Hrsand365Days = hybrisOpeningSchedule.getIs24Hrsand365Days();
        List<HybrisWeekDayOpening> listB = hybrisOpeningSchedule.b();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(j.a((HybrisWeekDayOpening) it.next()));
        }
        return new OpeningSchedule(code, is24Hrsand365Days, arrayList);
    }
}
