package com.meijer.mobile.store.model.hybris;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\f\b\u0001\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\f\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/store/model/hybris/HybrisOpeningSchedule;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "code", "", "is24Hrsand365Days", "", "Lcom/meijer/mobile/store/model/hybris/HybrisWeekDayOpening;", "weekDayOpeningList", "<init>", "(Ljava/lang/String;ZLjava/util/List;)V", "copy", "(Ljava/lang/String;ZLjava/util/List;)Lcom/meijer/mobile/store/model/hybris/HybrisOpeningSchedule;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "c", "()Z", "Ljava/util/List;", "()Ljava/util/List;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HybrisOpeningSchedule {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean is24Hrsand365Days;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisWeekDayOpening> weekDayOpeningList;

    public final HybrisOpeningSchedule copy(@g(name = "code") String code, @g(name = "is24Hrsand365Days") boolean is24Hrsand365Days, @g(name = "weekDayOpeningList") List<HybrisWeekDayOpening> weekDayOpeningList) {
        Intrinsics.j(code, "code");
        Intrinsics.j(weekDayOpeningList, "weekDayOpeningList");
        return new HybrisOpeningSchedule(code, is24Hrsand365Days, weekDayOpeningList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisOpeningSchedule)) {
            return false;
        }
        HybrisOpeningSchedule hybrisOpeningSchedule = (HybrisOpeningSchedule) other;
        return Intrinsics.e(this.code, hybrisOpeningSchedule.code) && this.is24Hrsand365Days == hybrisOpeningSchedule.is24Hrsand365Days && Intrinsics.e(this.weekDayOpeningList, hybrisOpeningSchedule.weekDayOpeningList);
    }

    public int hashCode() {
        return (((this.code.hashCode() * 31) + Boolean.hashCode(this.is24Hrsand365Days)) * 31) + this.weekDayOpeningList.hashCode();
    }

    public String toString() {
        return "HybrisOpeningSchedule(code=" + this.code + ", is24Hrsand365Days=" + this.is24Hrsand365Days + ", weekDayOpeningList=" + this.weekDayOpeningList + ')';
    }

    public HybrisOpeningSchedule(@g(name = "code") String code, @g(name = "is24Hrsand365Days") boolean z10, @g(name = "weekDayOpeningList") List<HybrisWeekDayOpening> weekDayOpeningList) {
        Intrinsics.j(code, "code");
        Intrinsics.j(weekDayOpeningList, "weekDayOpeningList");
        this.code = code;
        this.is24Hrsand365Days = z10;
        this.weekDayOpeningList = weekDayOpeningList;
    }

    /* renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    public final List<HybrisWeekDayOpening> b() {
        return this.weekDayOpeningList;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIs24Hrsand365Days() {
        return this.is24Hrsand365Days;
    }
}
