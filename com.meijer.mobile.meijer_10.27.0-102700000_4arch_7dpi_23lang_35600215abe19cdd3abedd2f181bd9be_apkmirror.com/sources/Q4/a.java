package Q4;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LQ4/a;", "", "<init>", "()V", "Landroid/app/job/JobScheduler;", "jobScheduler", "", "Landroid/app/job/JobInfo;", "a", "(Landroid/app/job/JobScheduler;)Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f29751a = new a();

    public final List<JobInfo> a(JobScheduler jobScheduler) {
        Intrinsics.j(jobScheduler, "jobScheduler");
        List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
        Intrinsics.i(allPendingJobs, "jobScheduler.allPendingJobs");
        return allPendingJobs;
    }

    private a() {
    }
}
