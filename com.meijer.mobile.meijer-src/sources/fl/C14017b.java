package fl;

import bk.AbstractC6392a;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import uh.j;
import wk.C17898a;
import wk.d;
import wk.e;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lfl/b;", "", "<init>", "()V", "", "startDateString", "endDateString", "", "isReward", "j$/time/ZonedDateTime", "now", "Lbk/a;", "a", "(Ljava/lang/String;Ljava/lang/String;ZLj$/time/ZonedDateTime;)Lbk/a;", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fl.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C14017b {

    /* renamed from: a, reason: collision with root package name */
    public static final C14017b f132020a = new C14017b();

    public final AbstractC6392a a(String startDateString, String endDateString, boolean isReward, ZonedDateTime now) {
        ZonedDateTime zonedDateTimeAtZone;
        ZonedDateTime zonedDateTimeN;
        Intrinsics.j(now, "now");
        if (startDateString == null || endDateString == null) {
            return AbstractC6392a.INSTANCE.d(Zk.a.f43849B, new Object[0]);
        }
        C17898a c17898a = C17898a.f167225a;
        LocalDateTime localDateTime = (LocalDateTime) d.b(startDateString, c17898a.s(), new j());
        if (localDateTime == null || (zonedDateTimeAtZone = localDateTime.N(e.EASTERN)) == null) {
            Instant instant = (Instant) d.b(startDateString, c17898a.k(), new C14016a());
            zonedDateTimeAtZone = instant != null ? instant.atZone(e.EASTERN) : null;
            if (zonedDateTimeAtZone == null) {
                throw new IllegalStateException(("Unable to parse Coupon.startDate '" + startDateString + '\'').toString());
            }
        }
        LocalDateTime localDateTime2 = (LocalDateTime) d.b(endDateString, c17898a.s(), new j());
        if (localDateTime2 == null || (zonedDateTimeN = localDateTime2.N(e.EASTERN)) == null) {
            Instant instant2 = (Instant) d.b(endDateString, c17898a.k(), new C14016a());
            ZonedDateTime zonedDateTimeAtZone2 = instant2 != null ? instant2.atZone(e.EASTERN) : null;
            if (zonedDateTimeAtZone2 == null) {
                throw new IllegalStateException(("Unable to parse Coupon.endDate '" + endDateString + '\'').toString());
            }
            zonedDateTimeN = zonedDateTimeAtZone2;
        }
        DateTimeFormatter dateTimeFormatter = C17898a.DATE_SLASHES_SHORT;
        return now.l().isBefore(zonedDateTimeAtZone.l()) ? AbstractC6392a.INSTANCE.d(Zk.a.f43854e, zonedDateTimeAtZone.format(dateTimeFormatter), zonedDateTimeN.format(dateTimeFormatter)) : now.l().isBefore(zonedDateTimeN.l()) ? isReward ? AbstractC6392a.INSTANCE.d(Zk.a.f43875z, zonedDateTimeN.format(dateTimeFormatter)) : AbstractC6392a.INSTANCE.d(Zk.a.f43856g, zonedDateTimeN.format(dateTimeFormatter)) : now.l().isEqual(zonedDateTimeN.l()) ? AbstractC6392a.INSTANCE.d(Zk.a.f43855f, zonedDateTimeN.format(dateTimeFormatter)) : AbstractC6392a.INSTANCE.d(Zk.a.f43853d, new Object[0]);
    }

    private C14017b() {
    }
}
