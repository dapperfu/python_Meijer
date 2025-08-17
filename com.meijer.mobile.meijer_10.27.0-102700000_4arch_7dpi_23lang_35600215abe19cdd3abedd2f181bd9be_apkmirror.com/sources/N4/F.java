package N4;

import N4.P;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\bB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"LN4/F;", "LN4/P;", "LN4/F$a;", "builder", "<init>", "(LN4/F$a;)V", "e", "a", "b", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class F extends P {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B;\b\u0016\u0012\u0010\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00008PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LN4/F$a;", "LN4/P$a;", "LN4/F;", "Ljava/lang/Class;", "Landroidx/work/c;", "workerClass", "", "repeatInterval", "Ljava/util/concurrent/TimeUnit;", "repeatIntervalTimeUnit", "flexInterval", "flexIntervalTimeUnit", "<init>", "(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;JLjava/util/concurrent/TimeUnit;)V", "n", "()LN4/F;", "o", "()LN4/F$a;", "thisObject", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a extends P.a<a, F> {
        @Override // N4.P.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public a g() {
            return this;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class<? extends androidx.work.c> workerClass, long j10, TimeUnit repeatIntervalTimeUnit, long j11, TimeUnit flexIntervalTimeUnit) {
            super(workerClass);
            Intrinsics.j(workerClass, "workerClass");
            Intrinsics.j(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            Intrinsics.j(flexIntervalTimeUnit, "flexIntervalTimeUnit");
            getWorkSpec().r(repeatIntervalTimeUnit.toMillis(j10), flexIntervalTimeUnit.toMillis(j11));
        }

        @Override // N4.P.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public F c() {
            if (getBackoffCriteriaSet() && getWorkSpec().constraints.getRequiresDeviceIdle()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            if (!getWorkSpec().expedited) {
                return new F(this);
            }
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(a builder) {
        super(builder.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), builder.getWorkSpec(), builder.f());
        Intrinsics.j(builder, "builder");
    }
}
