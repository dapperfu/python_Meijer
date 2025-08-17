package Q4;

import N4.AbstractC4333v;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t\"\u0018\u0010\u000e\u001a\u00020\u000b*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u001d\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f*\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/a;", "configuration", "", "a", "(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Landroidx/work/a;)Ljava/lang/String;", "Ljava/lang/String;", "TAG", "Landroid/app/job/JobScheduler;", "c", "(Landroid/content/Context;)Landroid/app/job/JobScheduler;", "wmJobScheduler", "", "Landroid/app/job/JobInfo;", "b", "(Landroid/app/job/JobScheduler;)Ljava/util/List;", "safePendingJobs", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f29753a;

    static {
        String strI = AbstractC4333v.i("SystemJobScheduler");
        Intrinsics.i(strI, "tagWithPrefix(\"SystemJobScheduler\")");
        f29753a = strI;
    }

    public static final String a(Context context, WorkDatabase workDatabase, androidx.work.a configuration) {
        String str;
        Intrinsics.j(context, "context");
        Intrinsics.j(workDatabase, "workDatabase");
        Intrinsics.j(configuration, "configuration");
        int i10 = Build.VERSION.SDK_INT;
        int i11 = i10 >= 31 ? BinsView.TOTE_WIDTH_DP : 100;
        int size = workDatabase.l().h().size();
        String strB0 = "<faulty JobScheduler failed to getPendingJobs>";
        if (i10 >= 34) {
            JobScheduler jobSchedulerC = c(context);
            List<JobInfo> listB = b(jobSchedulerC);
            if (listB != null) {
                List<JobInfo> listG = m.g(context, jobSchedulerC);
                int size2 = listG != null ? listB.size() - listG.size() : 0;
                String str2 = null;
                if (size2 == 0) {
                    str = null;
                } else {
                    str = size2 + " of which are not owned by WorkManager";
                }
                Object systemService = context.getSystemService("jobscheduler");
                Intrinsics.h(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
                List<JobInfo> listG2 = m.g(context, (JobScheduler) systemService);
                int size3 = listG2 != null ? listG2.size() : 0;
                if (size3 != 0) {
                    str2 = size3 + " from WorkManager in the default namespace";
                }
                strB0 = CollectionsKt.B0(CollectionsKt.r(listB.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str2), ",\n", null, null, 0, null, null, 62, null);
            }
        } else {
            List<JobInfo> listG3 = m.g(context, c(context));
            if (listG3 != null) {
                strB0 = listG3.size() + " jobs from WorkManager";
            }
        }
        return "JobScheduler " + i11 + " job limit exceeded.\nIn JobScheduler there are " + strB0 + ".\nThere are " + size + " jobs tracked by WorkManager's database;\nthe Configuration limit is " + configuration.getMaxSchedulerLimit() + '.';
    }

    public static final List<JobInfo> b(JobScheduler jobScheduler) {
        Intrinsics.j(jobScheduler, "<this>");
        try {
            return a.f29751a.a(jobScheduler);
        } catch (Throwable th2) {
            AbstractC4333v.e().d(f29753a, "getAllPendingJobs() is not reliable on this device.", th2);
            return null;
        }
    }

    public static final JobScheduler c(Context context) {
        Intrinsics.j(context, "<this>");
        Object systemService = context.getSystemService("jobscheduler");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        return Build.VERSION.SDK_INT >= 34 ? c.f29752a.a(jobScheduler) : jobScheduler;
    }
}
