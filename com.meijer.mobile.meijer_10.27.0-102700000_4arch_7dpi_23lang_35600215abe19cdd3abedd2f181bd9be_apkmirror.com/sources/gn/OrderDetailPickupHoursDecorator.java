package gn;

import com.meijer.mobile.storeinfo.api.model.Store;
import com.meijer.mobile.storeinfo.api.model.StoreInfo;
import j$.time.DayOfWeek;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ok.StoreDetails;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0081\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u000fB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Lgn/k;", "", "", "isOutsideOfPickupHours", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gn.k, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class OrderDetailPickupHoursDecorator {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOutsideOfPickupHours;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lgn/k$a;", "", "<init>", "()V", "Lcom/meijer/mobile/storeinfo/api/model/StoreInfo;", "j$/time/LocalDateTime", "currentDateTime", "", "b", "(Lcom/meijer/mobile/storeinfo/api/model/StoreInfo;Lj$/time/LocalDateTime;)Z", "storeInfo", "Lgn/k;", "a", "(Lcom/meijer/mobile/storeinfo/api/model/StoreInfo;Lj$/time/LocalDateTime;)Lgn/k;", "", "THIRTY_MINUTE_BUFFER", "J", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: gn.k$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: gn.k$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C2107a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DayOfWeek.values().length];
                try {
                    iArr[DayOfWeek.SATURDAY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DayOfWeek.SUNDAY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        private static final boolean c(LocalTime localTime, LocalDateTime localDateTime) {
            LocalTime localTime2;
            return localTime.isAfter((localDateTime == null || (localTime2 = localDateTime.toLocalTime()) == null) ? null : localTime2.minusMinutes(30L));
        }

        private static final boolean d(LocalTime localTime, LocalDateTime localDateTime) {
            LocalTime localTime2;
            return localTime.isBefore((localDateTime == null || (localTime2 = localDateTime.toLocalTime()) == null) ? null : localTime2.minusMinutes(30L));
        }

        public final OrderDetailPickupHoursDecorator a(StoreInfo storeInfo, LocalDateTime currentDateTime) {
            Intrinsics.j(storeInfo, "storeInfo");
            Intrinsics.j(currentDateTime, "currentDateTime");
            return new OrderDetailPickupHoursDecorator(OrderDetailPickupHoursDecorator.INSTANCE.b(storeInfo, currentDateTime));
        }

        private final boolean b(StoreInfo storeInfo, LocalDateTime localDateTime) {
            int i10;
            LocalTime localTime = localDateTime.toLocalTime();
            Intrinsics.i(localTime, "toLocalTime(...)");
            StoreDetails storeDetailsA = Store.INSTANCE.a((Store) CollectionsKt.s0(storeInfo.a()));
            DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
            if (dayOfWeek == null) {
                i10 = -1;
            } else {
                i10 = C2107a.$EnumSwitchMapping$0[dayOfWeek.ordinal()];
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (!d(localTime, storeDetailsA.getCurbsideWeekdayOpen()) && !c(localTime, storeDetailsA.getCurbsideWeekdayClose())) {
                        return false;
                    }
                    return true;
                }
                if (!d(localTime, storeDetailsA.getCurbsideSunOpen()) && !c(localTime, storeDetailsA.getCurbsideSunClose())) {
                    return false;
                }
                return true;
            }
            if (!d(localTime, storeDetailsA.getCurbsideSatOpen()) && !c(localTime, storeDetailsA.getCurbsideSatClose())) {
                return false;
            }
            return true;
        }
    }

    public OrderDetailPickupHoursDecorator() {
        this(false, 1, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OrderDetailPickupHoursDecorator) && this.isOutsideOfPickupHours == ((OrderDetailPickupHoursDecorator) other).isOutsideOfPickupHours;
    }

    public OrderDetailPickupHoursDecorator(boolean z10) {
        this.isOutsideOfPickupHours = z10;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getIsOutsideOfPickupHours() {
        return this.isOutsideOfPickupHours;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isOutsideOfPickupHours);
    }

    public String toString() {
        return "OrderDetailPickupHoursDecorator(isOutsideOfPickupHours=" + this.isOutsideOfPickupHours + ')';
    }

    public /* synthetic */ OrderDetailPickupHoursDecorator(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10);
    }
}
