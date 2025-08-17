package W4;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LW4/n;", "", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "<init>", "(Landroidx/work/impl/WorkDatabase;)V", "", "minInclusive", "maxInclusive", "e", "(II)I", "c", "()I", "a", "Landroidx/work/impl/WorkDatabase;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: W4.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5412n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final WorkDatabase workDatabase;

    public C5412n(WorkDatabase workDatabase) {
        Intrinsics.j(workDatabase, "workDatabase");
        this.workDatabase = workDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer d(C5412n c5412n) {
        return Integer.valueOf(C5413o.d(c5412n.workDatabase, "next_alarm_manager_id"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer f(C5412n c5412n, int i10, int i11) {
        int iD = C5413o.d(c5412n.workDatabase, "next_job_scheduler_id");
        if (i10 > iD || iD > i11) {
            C5413o.e(c5412n.workDatabase, "next_job_scheduler_id", i10 + 1);
        } else {
            i10 = iD;
        }
        return Integer.valueOf(i10);
    }

    public final int c() {
        Object objRunInTransaction = this.workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: W4.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C5412n.d(this.f38527a);
            }
        });
        Intrinsics.i(objRunInTransaction, "workDatabase.runInTransa…NAGER_ID_KEY) }\n        )");
        return ((Number) objRunInTransaction).intValue();
    }

    public final int e(final int minInclusive, final int maxInclusive) {
        Object objRunInTransaction = this.workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: W4.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C5412n.f(this.f38528a, minInclusive, maxInclusive);
            }
        });
        Intrinsics.i(objRunInTransaction, "workDatabase.runInTransa…d\n            }\n        )");
        return ((Number) objRunInTransaction).intValue();
    }
}
