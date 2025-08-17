package Tq;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0006\u0010\u0019R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LTq/b;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "code", "", "is24Hrsand365Days", "", "LTq/m;", "weekDayOpeningList", "<init>", "(Ljava/lang/String;ZLjava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCode", "b", "Z", "()Z", "c", "Ljava/util/List;", "getWeekDayOpeningList", "()Ljava/util/List;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Tq.b, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class OpeningSchedule {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean is24Hrsand365Days;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<WeekDayOpening> weekDayOpeningList;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpeningSchedule)) {
            return false;
        }
        OpeningSchedule openingSchedule = (OpeningSchedule) other;
        return Intrinsics.e(this.code, openingSchedule.code) && this.is24Hrsand365Days == openingSchedule.is24Hrsand365Days && Intrinsics.e(this.weekDayOpeningList, openingSchedule.weekDayOpeningList);
    }

    public OpeningSchedule(String code, boolean z10, List<WeekDayOpening> weekDayOpeningList) {
        Intrinsics.j(code, "code");
        Intrinsics.j(weekDayOpeningList, "weekDayOpeningList");
        this.code = code;
        this.is24Hrsand365Days = z10;
        this.weekDayOpeningList = weekDayOpeningList;
    }

    public int hashCode() {
        return (((this.code.hashCode() * 31) + Boolean.hashCode(this.is24Hrsand365Days)) * 31) + this.weekDayOpeningList.hashCode();
    }

    public String toString() {
        return "OpeningSchedule(code=" + this.code + ", is24Hrsand365Days=" + this.is24Hrsand365Days + ", weekDayOpeningList=" + this.weekDayOpeningList + ')';
    }
}
