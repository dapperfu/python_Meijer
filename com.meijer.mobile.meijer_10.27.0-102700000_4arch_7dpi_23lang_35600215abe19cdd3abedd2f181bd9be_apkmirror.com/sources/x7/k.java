package x7;

import E7.RetryInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\n\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u001a\u0010\r\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t\"\u001a\u0010\u000e\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\u000f"}, d2 = {"LE7/a;", "", "c", "(LE7/a;)Z", "Lkotlin/time/Duration;", "a", "(LE7/a;)J", "J", "getFIRST_RETRY_SCHEDULING_TIME", "()J", "FIRST_RETRY_SCHEDULING_TIME", "b", "getSECOND_RETRY_SCHEDULING_TIME", "SECOND_RETRY_SCHEDULING_TIME", "DISABLE_AGENT_TIME", "com.dynatrace.agent_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private static final long f169458a;

    /* renamed from: b, reason: collision with root package name */
    private static final long f169459b;

    /* renamed from: c, reason: collision with root package name */
    private static final long f169460c;

    static {
        Duration.Companion companion = Duration.INSTANCE;
        DurationUnit durationUnit = DurationUnit.f147509e;
        f169458a = DurationKt.t(30L, durationUnit);
        f169459b = DurationKt.t(60L, durationUnit);
        f169460c = DurationKt.s(2, DurationUnit.f147511g);
    }

    public static final long a(RetryInfo retryInfo) {
        Intrinsics.j(retryInfo, "<this>");
        int count = retryInfo.getCount();
        return count != 1 ? count != 2 ? f169460c : f169459b : f169458a;
    }

    public static final long b() {
        return f169460c;
    }

    public static final boolean c(RetryInfo retryInfo) {
        Intrinsics.j(retryInfo, "<this>");
        return retryInfo.getCount() == 3;
    }
}
