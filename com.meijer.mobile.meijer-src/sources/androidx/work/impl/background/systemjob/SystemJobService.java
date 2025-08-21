package androidx.work.impl.background.systemjob;

import O4.AbstractC4373v;
import P4.C4584t;
import P4.InterfaceC4571f;
import P4.K;
import P4.M;
import P4.O;
import P4.y;
import P4.z;
import W4.WorkGenerationalId;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class SystemJobService extends JobService implements InterfaceC4571f {

    /* renamed from: e, reason: collision with root package name */
    private static final String f59413e = AbstractC4373v.i("SystemJobService");

    /* renamed from: a, reason: collision with root package name */
    private O f59414a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<WorkGenerationalId, JobParameters> f59415b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final z f59416c = z.b(false);

    /* renamed from: d, reason: collision with root package name */
    private K f59417d;

    static int b(int i10) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return i10;
            default:
                return -512;
        }
    }

    static class a {
        static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    static class b {
        static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    static class c {
        static int a(JobParameters jobParameters) {
            return SystemJobService.b(jobParameters.getStopReason());
        }
    }

    private static WorkGenerationalId c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new WorkGenerationalId(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // P4.InterfaceC4571f
    public void e(WorkGenerationalId workGenerationalId, boolean z10) {
        a("onExecuted");
        AbstractC4373v.e().a(f59413e, workGenerationalId.getWorkSpecId() + " executed on JobScheduler");
        JobParameters jobParametersRemove = this.f59415b.remove(workGenerationalId);
        this.f59416c.f(workGenerationalId);
        if (jobParametersRemove != null) {
            jobFinished(jobParametersRemove, z10);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        if (this.f59414a == null) {
            AbstractC4373v.e().a(f59413e, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        WorkGenerationalId workGenerationalIdC = c(jobParameters);
        if (workGenerationalIdC == null) {
            AbstractC4373v.e().c(f59413e, "WorkSpec id not found!");
            return false;
        }
        if (this.f59415b.containsKey(workGenerationalIdC)) {
            AbstractC4373v.e().a(f59413e, "Job is already being executed by SystemJobService: " + workGenerationalIdC);
            return false;
        }
        AbstractC4373v.e().a(f59413e, "onStartJob for " + workGenerationalIdC);
        this.f59415b.put(workGenerationalIdC, jobParameters);
        int i10 = Build.VERSION.SDK_INT;
        WorkerParameters.a aVar = new WorkerParameters.a();
        if (a.b(jobParameters) != null) {
            aVar.f59296b = Arrays.asList(a.b(jobParameters));
        }
        if (a.a(jobParameters) != null) {
            aVar.f59295a = Arrays.asList(a.a(jobParameters));
        }
        if (i10 >= 28) {
            aVar.f59297c = b.a(jobParameters);
        }
        this.f59417d.d(this.f59416c.e(workGenerationalIdC), aVar);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        a("onStopJob");
        if (this.f59414a == null) {
            AbstractC4373v.e().a(f59413e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        WorkGenerationalId workGenerationalIdC = c(jobParameters);
        if (workGenerationalIdC == null) {
            AbstractC4373v.e().c(f59413e, "WorkSpec id not found!");
            return false;
        }
        AbstractC4373v.e().a(f59413e, "onStopJob for " + workGenerationalIdC);
        this.f59415b.remove(workGenerationalIdC);
        y yVarF = this.f59416c.f(workGenerationalIdC);
        if (yVarF != null) {
            this.f59417d.e(yVarF, Build.VERSION.SDK_INT >= 31 ? c.a(jobParameters) : -512);
        }
        return !this.f59414a.r().j(workGenerationalIdC.getWorkSpecId());
    }

    private static void a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            O oP = O.p(getApplicationContext());
            this.f59414a = oP;
            C4584t c4584tR = oP.r();
            this.f59417d = new M(c4584tR, this.f59414a.v());
            c4584tR.e(this);
        } catch (IllegalStateException e10) {
            if (Application.class.equals(getApplication().getClass())) {
                AbstractC4373v.e().k(f59413e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        O o10 = this.f59414a;
        if (o10 != null) {
            o10.r().m(this);
        }
    }
}
