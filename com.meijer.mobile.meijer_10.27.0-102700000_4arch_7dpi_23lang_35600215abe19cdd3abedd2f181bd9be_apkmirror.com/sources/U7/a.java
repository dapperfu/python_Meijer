package U7;

import T7.c;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import x8.f;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LU7/a;", "", "<init>", "()V", "", "", "e", "(J)Ljava/lang/String;", "LT7/c;", "startupType", "beginTime", "", "b", "(LT7/c;J)V", "endTime", "a", "(LT7/c;JJ)V", "c", "(LT7/c;)V", "LT7/a;", "startupPhase", "startTime", "d", "(LT7/c;LT7/a;JJ)V", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {
    private final String e(long j10) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss:SSS", Locale.getDefault());
        Date date = new Date();
        date.setTime(j10);
        String str = simpleDateFormat.format(date);
        Intrinsics.i(str, "format(...)");
        return str;
    }

    public final void a(c startupType, long beginTime, long endTime) {
        Intrinsics.j(startupType, "startupType");
        f.a("dtxEventGeneration", "App startup type " + startupType.name() + " duration: " + (endTime - beginTime) + " ms");
    }

    public final void b(c startupType, long beginTime) {
        Intrinsics.j(startupType, "startupType");
        f.a("dtxEventGeneration", "App startup type " + startupType.name() + " begin at " + e(beginTime));
    }

    public final void c(c startupType) {
        Intrinsics.j(startupType, "startupType");
        f.a("dtxEventGeneration", "App startup type " + startupType.name() + " was not finished");
    }

    public final void d(c startupType, T7.a startupPhase, long startTime, long endTime) {
        Intrinsics.j(startupType, "startupType");
        Intrinsics.j(startupPhase, "startupPhase");
        f.a("dtxEventGeneration", "App startup type " + startupType.name() + " phase " + startupPhase.name() + " [" + e(startTime) + "] -> [" + e(endTime) + ']');
    }
}
