package Uq;

import Tq.ScheduleTime;
import Tq.WeekDayOpening;
import com.meijer.mobile.store.model.hybris.HybrisScheduleTime;
import com.meijer.mobile.store.model.hybris.HybrisWeekDayOpening;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/store/model/hybris/HybrisWeekDayOpening;", "LTq/m;", "a", "(Lcom/meijer/mobile/store/model/hybris/HybrisWeekDayOpening;)LTq/m;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j {
    public static final WeekDayOpening a(HybrisWeekDayOpening hybrisWeekDayOpening) {
        Intrinsics.j(hybrisWeekDayOpening, "<this>");
        boolean isClosed = hybrisWeekDayOpening.getIsClosed();
        HybrisScheduleTime closingTime = hybrisWeekDayOpening.getClosingTime();
        ScheduleTime scheduleTimeA = closingTime != null ? d.a(closingTime) : null;
        HybrisScheduleTime openingTime = hybrisWeekDayOpening.getOpeningTime();
        return new WeekDayOpening(isClosed, scheduleTimeA, openingTime != null ? d.a(openingTime) : null, hybrisWeekDayOpening.getWeekDay());
    }
}
