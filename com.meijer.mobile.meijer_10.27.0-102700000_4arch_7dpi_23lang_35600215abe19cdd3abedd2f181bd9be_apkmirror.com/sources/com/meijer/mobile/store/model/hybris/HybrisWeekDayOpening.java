package com.meijer.mobile.store.model.hybris;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ<\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001c\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/store/model/hybris/HybrisWeekDayOpening;", "", "", "isClosed", "Lcom/meijer/mobile/store/model/hybris/HybrisScheduleTime;", "closingTime", "openingTime", "", "weekDay", "<init>", "(ZLcom/meijer/mobile/store/model/hybris/HybrisScheduleTime;Lcom/meijer/mobile/store/model/hybris/HybrisScheduleTime;Ljava/lang/String;)V", "copy", "(ZLcom/meijer/mobile/store/model/hybris/HybrisScheduleTime;Lcom/meijer/mobile/store/model/hybris/HybrisScheduleTime;Ljava/lang/String;)Lcom/meijer/mobile/store/model/hybris/HybrisWeekDayOpening;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "d", "()Z", "b", "Lcom/meijer/mobile/store/model/hybris/HybrisScheduleTime;", "()Lcom/meijer/mobile/store/model/hybris/HybrisScheduleTime;", "c", "Ljava/lang/String;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class HybrisWeekDayOpening {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isClosed;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisScheduleTime closingTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisScheduleTime openingTime;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String weekDay;

    public HybrisWeekDayOpening(@g(name = "closed") boolean z10, @g(name = "closingTime") HybrisScheduleTime hybrisScheduleTime, @g(name = "openingTime") HybrisScheduleTime hybrisScheduleTime2, @g(name = "weekDay") String weekDay) {
        Intrinsics.j(weekDay, "weekDay");
        this.isClosed = z10;
        this.closingTime = hybrisScheduleTime;
        this.openingTime = hybrisScheduleTime2;
        this.weekDay = weekDay;
    }

    public final HybrisWeekDayOpening copy(@g(name = "closed") boolean isClosed, @g(name = "closingTime") HybrisScheduleTime closingTime, @g(name = "openingTime") HybrisScheduleTime openingTime, @g(name = "weekDay") String weekDay) {
        Intrinsics.j(weekDay, "weekDay");
        return new HybrisWeekDayOpening(isClosed, closingTime, openingTime, weekDay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisWeekDayOpening)) {
            return false;
        }
        HybrisWeekDayOpening hybrisWeekDayOpening = (HybrisWeekDayOpening) other;
        return this.isClosed == hybrisWeekDayOpening.isClosed && Intrinsics.e(this.closingTime, hybrisWeekDayOpening.closingTime) && Intrinsics.e(this.openingTime, hybrisWeekDayOpening.openingTime) && Intrinsics.e(this.weekDay, hybrisWeekDayOpening.weekDay);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isClosed) * 31;
        HybrisScheduleTime hybrisScheduleTime = this.closingTime;
        int iHashCode2 = (iHashCode + (hybrisScheduleTime == null ? 0 : hybrisScheduleTime.hashCode())) * 31;
        HybrisScheduleTime hybrisScheduleTime2 = this.openingTime;
        return ((iHashCode2 + (hybrisScheduleTime2 != null ? hybrisScheduleTime2.hashCode() : 0)) * 31) + this.weekDay.hashCode();
    }

    public String toString() {
        return "HybrisWeekDayOpening(isClosed=" + this.isClosed + ", closingTime=" + this.closingTime + ", openingTime=" + this.openingTime + ", weekDay=" + this.weekDay + ')';
    }

    /* renamed from: a, reason: from getter */
    public final HybrisScheduleTime getClosingTime() {
        return this.closingTime;
    }

    /* renamed from: b, reason: from getter */
    public final HybrisScheduleTime getOpeningTime() {
        return this.openingTime;
    }

    /* renamed from: c, reason: from getter */
    public final String getWeekDay() {
        return this.weekDay;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsClosed() {
        return this.isClosed;
    }

    public /* synthetic */ HybrisWeekDayOpening(boolean z10, HybrisScheduleTime hybrisScheduleTime, HybrisScheduleTime hybrisScheduleTime2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, (i10 & 2) != 0 ? null : hybrisScheduleTime, (i10 & 4) != 0 ? null : hybrisScheduleTime2, str);
    }
}
