package os;

import j$.time.LocalDate;
import j$.time.Period;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"j$/time/LocalDate", "now", "", "a", "(Lj$/time/LocalDate;Lj$/time/LocalDate;)I", "mperks_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g0 {
    public static final int a(LocalDate localDate, LocalDate now) {
        Intrinsics.j(localDate, "<this>");
        Intrinsics.j(now, "now");
        return Period.between(now, localDate).getDays();
    }

    public static /* synthetic */ int b(LocalDate localDate, LocalDate localDate2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            localDate2 = LocalDate.now();
        }
        return a(localDate, localDate2);
    }
}
