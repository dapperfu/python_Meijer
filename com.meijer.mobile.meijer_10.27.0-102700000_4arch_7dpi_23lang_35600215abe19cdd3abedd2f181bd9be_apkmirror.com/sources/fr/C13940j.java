package fr;

import com.meijer.mobile.subscription.service.api.models.PreferredTimeslotResponseJson;
import cr.PreferredTimeslot;
import j$.time.DayOfWeek;
import j$.time.LocalTime;
import kj.C15170c;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import vk.C17590a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/subscription/service/api/models/PreferredTimeslotResponseJson;", "Lcr/h;", "a", "(Lcom/meijer/mobile/subscription/service/api/models/PreferredTimeslotResponseJson;)Lcr/h;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: fr.j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13940j {
    public static final PreferredTimeslot a(PreferredTimeslotResponseJson preferredTimeslotResponseJson) {
        Intrinsics.j(preferredTimeslotResponseJson, "<this>");
        DayOfWeek dayOfWeek = (DayOfWeek) CollectionsKt.p(DayOfWeek.SUNDAY, DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SATURDAY).get(preferredTimeslotResponseJson.getDayOfWeek());
        String endTime = preferredTimeslotResponseJson.getEndTime();
        C17590a c17590a = C17590a.f164803a;
        Object objA = vk.d.a(endTime, c17590a.u(), new C15170c());
        Intrinsics.i(objA, "toDateTime(...)");
        Object objA2 = vk.d.a(preferredTimeslotResponseJson.getStartTime(), c17590a.u(), new C15170c());
        Intrinsics.i(objA2, "toDateTime(...)");
        return new PreferredTimeslot(dayOfWeek, (LocalTime) objA, (LocalTime) objA2);
    }
}
