package z7;

import kotlin.Metadata;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkotlin/time/Duration;", "a", "J", "()J", "DEFAULT_SCHEDULING_TIME", "com.dynatrace.agent_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final long f172556a;

    static {
        Duration.Companion companion = Duration.INSTANCE;
        f172556a = DurationKt.t(120L, DurationUnit.f148417e);
    }

    public static final long a() {
        return f172556a;
    }
}
