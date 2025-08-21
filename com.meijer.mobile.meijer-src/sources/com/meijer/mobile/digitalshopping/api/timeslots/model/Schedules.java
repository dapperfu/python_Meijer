package com.meijer.mobile.digitalshopping.api.timeslots.model;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0019\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/timeslots/model/Schedules;", "", "", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/Schedule;", "schedules", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/ScheduleExtras;", "linked", "<init>", "(Ljava/util/List;Lcom/meijer/mobile/digitalshopping/api/timeslots/model/ScheduleExtras;)V", "copy", "(Ljava/util/List;Lcom/meijer/mobile/digitalshopping/api/timeslots/model/ScheduleExtras;)Lcom/meijer/mobile/digitalshopping/api/timeslots/model/Schedules;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/ScheduleExtras;", "()Lcom/meijer/mobile/digitalshopping/api/timeslots/model/ScheduleExtras;", "getLinked$annotations", "()V", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class Schedules {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Schedule> schedules;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ScheduleExtras linked;

    /* JADX WARN: Multi-variable type inference failed */
    public Schedules() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Schedules copy(@g(name = "schedules") List<Schedule> schedules, @g(name = "linked") ScheduleExtras linked) {
        Intrinsics.j(schedules, "schedules");
        return new Schedules(schedules, linked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Schedules)) {
            return false;
        }
        Schedules schedules = (Schedules) other;
        return Intrinsics.e(this.schedules, schedules.schedules) && Intrinsics.e(this.linked, schedules.linked);
    }

    public int hashCode() {
        int iHashCode = this.schedules.hashCode() * 31;
        ScheduleExtras scheduleExtras = this.linked;
        return iHashCode + (scheduleExtras == null ? 0 : scheduleExtras.hashCode());
    }

    public String toString() {
        return "Schedules(schedules=" + this.schedules + ", linked=" + this.linked + ')';
    }

    public Schedules(@g(name = "schedules") List<Schedule> schedules, @g(name = "linked") ScheduleExtras scheduleExtras) {
        Intrinsics.j(schedules, "schedules");
        this.schedules = schedules;
        this.linked = scheduleExtras;
    }

    /* renamed from: a, reason: from getter */
    public final ScheduleExtras getLinked() {
        return this.linked;
    }

    public final List<Schedule> b() {
        return this.schedules;
    }

    public /* synthetic */ Schedules(List list, ScheduleExtras scheduleExtras, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.m() : list, (i10 & 2) != 0 ? new ScheduleExtras(null, 1, null) : scheduleExtras);
    }
}
