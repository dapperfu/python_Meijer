package S4;

import androidx.work.impl.model.WorkSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0014X\u0094D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LS4/b;", "LS4/a;", "", "LT4/h;", "tracker", "<init>", "(LT4/h;)V", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "c", "(Landroidx/work/impl/model/WorkSpec;)Z", "value", "g", "(Z)Z", "", "b", "I", "e", "()I", "reason", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends a<Boolean> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int reason;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(T4.h<Boolean> tracker) {
        super(tracker);
        Intrinsics.j(tracker, "tracker");
        this.reason = 6;
    }

    @Override // S4.d
    public boolean c(WorkSpec workSpec) {
        Intrinsics.j(workSpec, "workSpec");
        return workSpec.constraints.getRequiresCharging();
    }

    @Override // S4.a
    /* renamed from: e, reason: from getter */
    protected int getReason() {
        return this.reason;
    }

    @Override // S4.a
    public /* bridge */ /* synthetic */ boolean f(Boolean bool) {
        return g(bool.booleanValue());
    }

    protected boolean g(boolean value) {
        return !value;
    }
}
