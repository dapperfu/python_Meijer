package Rm;

import ak.AbstractC5607a;
import com.meijer.mobile.meijer.Y;
import j$.time.YearMonth;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\b\u0010\f¨\u0006\u000e"}, d2 = {"LRm/e;", "", "j$/time/YearMonth", "yearMonth", "now", "<init>", "(Lj$/time/YearMonth;Lj$/time/YearMonth;)V", "", "a", "Z", "isCurrentMonth", "Lak/a;", "()Lak/a;", "noReceiptsMessage", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isCurrentMonth;

    public e(YearMonth yearMonth, YearMonth now) {
        Intrinsics.j(yearMonth, "yearMonth");
        Intrinsics.j(now, "now");
        this.isCurrentMonth = Intrinsics.e(yearMonth, now);
    }

    public final AbstractC5607a a() {
        return this.isCurrentMonth ? AbstractC5607a.INSTANCE.d(Y.f100151k3, new Object[0]) : AbstractC5607a.INSTANCE.d(Y.f100211n3, new Object[0]);
    }
}
