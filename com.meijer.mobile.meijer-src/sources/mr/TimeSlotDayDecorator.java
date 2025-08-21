package mr;

import j$.time.format.TextStyle;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\f¨\u0006\u001c"}, d2 = {"Lmr/l;", "", "Lmr/j;", "timeSlotDay", "", "isDaySelected", "<init>", "(Lmr/j;Z)V", "a", "(Lmr/j;Z)Lmr/l;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lmr/j;", "d", "()Lmr/j;", "b", "Z", "e", "()Z", "c", "dayOfWeekLabel", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: mr.l, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class TimeSlotDayDecorator {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final FulfillmentDay timeSlotDay;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDaySelected;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeSlotDayDecorator)) {
            return false;
        }
        TimeSlotDayDecorator timeSlotDayDecorator = (TimeSlotDayDecorator) other;
        return Intrinsics.e(this.timeSlotDay, timeSlotDayDecorator.timeSlotDay) && this.isDaySelected == timeSlotDayDecorator.isDaySelected;
    }

    public TimeSlotDayDecorator(FulfillmentDay timeSlotDay, boolean z10) {
        Intrinsics.j(timeSlotDay, "timeSlotDay");
        this.timeSlotDay = timeSlotDay;
        this.isDaySelected = z10;
    }

    public static /* synthetic */ TimeSlotDayDecorator b(TimeSlotDayDecorator timeSlotDayDecorator, FulfillmentDay fulfillmentDay, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fulfillmentDay = timeSlotDayDecorator.timeSlotDay;
        }
        if ((i10 & 2) != 0) {
            z10 = timeSlotDayDecorator.isDaySelected;
        }
        return timeSlotDayDecorator.a(fulfillmentDay, z10);
    }

    public final TimeSlotDayDecorator a(FulfillmentDay timeSlotDay, boolean isDaySelected) {
        Intrinsics.j(timeSlotDay, "timeSlotDay");
        return new TimeSlotDayDecorator(timeSlotDay, isDaySelected);
    }

    public final String c() {
        String displayName = this.timeSlotDay.getDate().getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
        Intrinsics.i(displayName, "getDisplayName(...)");
        if (displayName.length() <= 0) {
            return displayName;
        }
        StringBuilder sb2 = new StringBuilder();
        String strValueOf = String.valueOf(displayName.charAt(0));
        Intrinsics.h(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        Intrinsics.i(upperCase, "toUpperCase(...)");
        sb2.append((Object) upperCase);
        String strSubstring = displayName.substring(1);
        Intrinsics.i(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        return sb2.toString();
    }

    /* renamed from: d, reason: from getter */
    public final FulfillmentDay getTimeSlotDay() {
        return this.timeSlotDay;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsDaySelected() {
        return this.isDaySelected;
    }

    public int hashCode() {
        return (this.timeSlotDay.hashCode() * 31) + Boolean.hashCode(this.isDaySelected);
    }

    public String toString() {
        return "TimeSlotDayDecorator(timeSlotDay=" + this.timeSlotDay + ", isDaySelected=" + this.isDaySelected + ')';
    }
}
