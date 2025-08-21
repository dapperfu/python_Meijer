package kotlin.time;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012¨\u0006\u001a"}, d2 = {"Lkotlin/time/UnboundLocalDateTime;", "", "", "year", "month", "day", "hour", "minute", "second", "nanosecond", "<init>", "(IIIIIII)V", "", "toString", "()Ljava/lang/String;", "a", "I", "g", "()I", "b", "d", "c", "e", "f", "h", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ExperimentalTime
/* loaded from: classes14.dex */
final class UnboundLocalDateTime {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int year;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int month;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int day;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int hour;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int minute;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int second;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int nanosecond;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/time/UnboundLocalDateTime$Companion;", "", "<init>", "()V", "Lkotlin/time/Instant;", "instant", "Lkotlin/time/UnboundLocalDateTime;", "a", "(Lkotlin/time/Instant;)Lkotlin/time/UnboundLocalDateTime;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final UnboundLocalDateTime a(Instant instant) {
            long j10;
            long j11;
            Intrinsics.j(instant, "instant");
            long epochSeconds = instant.getEpochSeconds();
            long j12 = epochSeconds / 86400;
            if ((epochSeconds ^ 86400) < 0 && j12 * 86400 != epochSeconds) {
                j12--;
            }
            long j13 = epochSeconds % 86400;
            int i10 = (int) (j13 + (86400 & (((j13 ^ 86400) & ((-j13) | j13)) >> 63)));
            long j14 = (j12 + 719528) - 60;
            if (j14 < 0) {
                j10 = -1;
                long j15 = 146097;
                long j16 = ((j14 + 1) / j15) - 1;
                j11 = HttpResponseStatus.ERROR_BAD_REQUEST * j16;
                j14 += (-j16) * j15;
            } else {
                j10 = -1;
                j11 = 0;
            }
            long j17 = HttpResponseStatus.ERROR_BAD_REQUEST;
            long j18 = ((j17 * j14) + 591) / 146097;
            long j19 = 365;
            long j20 = 4;
            long j21 = 100;
            long j22 = j14 - ((((j19 * j18) + (j18 / j20)) - (j18 / j21)) + (j18 / j17));
            if (j22 < 0) {
                j18 += j10;
                j22 = j14 - ((((j19 * j18) + (j18 / j20)) - (j18 / j21)) + (j18 / j17));
            }
            int i11 = (int) j22;
            int i12 = ((i11 * 5) + 2) / 153;
            int i13 = i10 / 3600;
            int i14 = i10 - (i13 * 3600);
            int i15 = i14 / 60;
            return new UnboundLocalDateTime((int) (j18 + j11 + (i12 / 10)), ((i12 + 2) % 12) + 1, (i11 - (((i12 * 306) + 5) / 10)) + 1, i13, i15, i14 - (i15 * 60), instant.getNanosecondsOfSecond());
        }
    }

    /* renamed from: a, reason: from getter */
    public final int getDay() {
        return this.day;
    }

    /* renamed from: b, reason: from getter */
    public final int getHour() {
        return this.hour;
    }

    /* renamed from: c, reason: from getter */
    public final int getMinute() {
        return this.minute;
    }

    /* renamed from: d, reason: from getter */
    public final int getMonth() {
        return this.month;
    }

    /* renamed from: e, reason: from getter */
    public final int getNanosecond() {
        return this.nanosecond;
    }

    /* renamed from: f, reason: from getter */
    public final int getSecond() {
        return this.second;
    }

    /* renamed from: g, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    public String toString() {
        return "UnboundLocalDateTime(" + this.year + '-' + this.month + '-' + this.day + ' ' + this.hour + ':' + this.minute + ':' + this.second + '.' + this.nanosecond + ')';
    }

    public UnboundLocalDateTime(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.year = i10;
        this.month = i11;
        this.day = i12;
        this.hour = i13;
        this.minute = i14;
        this.second = i15;
        this.nanosecond = i16;
    }
}
