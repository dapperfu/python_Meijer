package fr;

import com.meijer.mobile.subscription.service.api.models.PreferredTimeslotResponseJson;
import cr.PreferredTimeslot;
import j$.time.DayOfWeek;
import j$.time.LocalTime;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lj.C15514c;
import wk.C17898a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/subscription/service/api/models/PreferredTimeslotResponseJson;", "Lcr/h;", "a", "(Lcom/meijer/mobile/subscription/service/api/models/PreferredTimeslotResponseJson;)Lcr/h;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: fr.j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14065j {
    public static final PreferredTimeslot a(PreferredTimeslotResponseJson preferredTimeslotResponseJson) {
        Intrinsics.j(preferredTimeslotResponseJson, "<this>");
        DayOfWeek dayOfWeek = (DayOfWeek) CollectionsKt.p(DayOfWeek.SUNDAY, DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SATURDAY).get(preferredTimeslotResponseJson.getDayOfWeek());
        String endTime = preferredTimeslotResponseJson.getEndTime();
        C17898a c17898a = C17898a.f167225a;
        Object objA = wk.d.a(endTime, c17898a.t(), new C15514c());
        Intrinsics.i(objA, "toDateTime(...)");
        Object objA2 = wk.d.a(preferredTimeslotResponseJson.getStartTime(), c17898a.t(), new C15514c());
        Intrinsics.i(objA2, "toDateTime(...)");
        return new PreferredTimeslot(dayOfWeek, (LocalTime) objA, (LocalTime) objA2);
    }
}
