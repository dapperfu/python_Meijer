package Uq;

import Tq.ScheduleTime;
import com.meijer.mobile.store.model.hybris.HybrisScheduleTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/store/model/hybris/HybrisScheduleTime;", "LTq/d;", "a", "(Lcom/meijer/mobile/store/model/hybris/HybrisScheduleTime;)LTq/d;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d {
    public static final ScheduleTime a(HybrisScheduleTime hybrisScheduleTime) {
        Intrinsics.j(hybrisScheduleTime, "<this>");
        return new ScheduleTime(hybrisScheduleTime.getHour(), hybrisScheduleTime.getMinute(), hybrisScheduleTime.getFormattedHour());
    }
}
