package R4;

import android.app.job.JobScheduler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LR4/c;", "", "<init>", "()V", "Landroid/app/job/JobScheduler;", "jobScheduler", "a", "(Landroid/app/job/JobScheduler;)Landroid/app/job/JobScheduler;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f31863a = new c();

    public final JobScheduler a(JobScheduler jobScheduler) {
        Intrinsics.j(jobScheduler, "jobScheduler");
        JobScheduler jobSchedulerForNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        Intrinsics.i(jobSchedulerForNamespace, "jobScheduler.forNamespace(WORKMANAGER_NAMESPACE)");
        return jobSchedulerForNamespace;
    }

    private c() {
    }
}
