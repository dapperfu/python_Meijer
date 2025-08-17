package fr;

import com.meijer.mobile.subscription.service.api.models.PreferredTimeslotRequestJson;
import dr.PreferredTimeslotRequest;
import j$.time.DayOfWeek;
import j$.time.LocalTime;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import vk.C17590a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldr/e;", "Lcom/meijer/mobile/subscription/service/api/models/PreferredTimeslotRequestJson;", "a", "(Ldr/e;)Lcom/meijer/mobile/subscription/service/api/models/PreferredTimeslotRequestJson;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: fr.i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13939i {
    public static final PreferredTimeslotRequestJson a(PreferredTimeslotRequest preferredTimeslotRequest) {
        Intrinsics.j(preferredTimeslotRequest, "<this>");
        int iIndexOf = CollectionsKt.p(DayOfWeek.SUNDAY, DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SATURDAY).indexOf(preferredTimeslotRequest.getDayOfWeek());
        LocalTime endTime = preferredTimeslotRequest.getEndTime();
        C17590a c17590a = C17590a.f164803a;
        String str = endTime.format(c17590a.u());
        Intrinsics.i(str, "format(...)");
        String str2 = preferredTimeslotRequest.getStartTime().format(c17590a.u());
        Intrinsics.i(str2, "format(...)");
        return new PreferredTimeslotRequestJson(iIndexOf, str, str2);
    }
}
