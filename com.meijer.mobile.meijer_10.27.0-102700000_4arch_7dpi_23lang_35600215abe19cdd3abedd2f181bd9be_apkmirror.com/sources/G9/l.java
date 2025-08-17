package G9;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LG9/l;", "", "<init>", "()V", "", "times", "", "retryInterval", "Lkotlin/Function0;", "", "action", "a", "(IJLkotlin/jvm/functions/Function0;)V", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f11293a = new l();

    public final void a(int times, long retryInterval, Function0<Unit> action) throws InterruptedException {
        Intrinsics.j(action, "action");
        try {
            action.invoke();
        } catch (Throwable th2) {
            if (times <= 0) {
                throw th2;
            }
            Thread.sleep(retryInterval);
            a(times - 1, retryInterval, action);
        }
    }

    private l() {
    }
}
