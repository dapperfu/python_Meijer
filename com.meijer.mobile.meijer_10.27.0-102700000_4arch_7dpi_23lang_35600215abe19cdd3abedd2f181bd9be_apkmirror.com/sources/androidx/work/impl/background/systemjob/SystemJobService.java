package androidx.work.impl.background.systemjob;

import N4.AbstractC4333v;
import O4.C4458t;
import O4.InterfaceC4445f;
import O4.K;
import O4.M;
import O4.O;
import O4.y;
import O4.z;
import V4.WorkGenerationalId;
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
public class SystemJobService extends JobService implements InterfaceC4445f {

    /* renamed from: e, reason: collision with root package name */
    private static final String f59227e = AbstractC4333v.i("SystemJobService");

    /* renamed from: a, reason: collision with root package name */
    private O f59228a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<WorkGenerationalId, JobParameters> f59229b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final z f59230c = z.b(false);

    /* renamed from: d, reason: collision with root package name */
    private K f59231d;

    static int c(int i10) {
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
            return SystemJobService.c(jobParameters.getStopReason());
        }
    }

    private static WorkGenerationalId d(JobParameters jobParameters) {
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

    @Override // O4.InterfaceC4445f
    public void b(WorkGenerationalId workGenerationalId, boolean z10) {
        a("onExecuted");
        AbstractC4333v.e().a(f59227e, workGenerationalId.getWorkSpecId() + " executed on JobScheduler");
        JobParameters jobParametersRemove = this.f59229b.remove(workGenerationalId);
        this.f59230c.c(workGenerationalId);
        if (jobParametersRemove != null) {
            jobFinished(jobParametersRemove, z10);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        if (this.f59228a == null) {
            AbstractC4333v.e().a(f59227e, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        WorkGenerationalId workGenerationalIdD = d(jobParameters);
        if (workGenerationalIdD == null) {
            AbstractC4333v.e().c(f59227e, "WorkSpec id not found!");
            return false;
        }
        if (this.f59229b.containsKey(workGenerationalIdD)) {
            AbstractC4333v.e().a(f59227e, "Job is already being executed by SystemJobService: " + workGenerationalIdD);
            return false;
        }
        AbstractC4333v.e().a(f59227e, "onStartJob for " + workGenerationalIdD);
        this.f59229b.put(workGenerationalIdD, jobParameters);
        int i10 = Build.VERSION.SDK_INT;
        WorkerParameters.a aVar = new WorkerParameters.a();
        if (a.b(jobParameters) != null) {
            aVar.f59110b = Arrays.asList(a.b(jobParameters));
        }
        if (a.a(jobParameters) != null) {
            aVar.f59109a = Arrays.asList(a.a(jobParameters));
        }
        if (i10 >= 28) {
            aVar.f59111c = b.a(jobParameters);
        }
        this.f59231d.d(this.f59230c.d(workGenerationalIdD), aVar);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        a("onStopJob");
        if (this.f59228a == null) {
            AbstractC4333v.e().a(f59227e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        WorkGenerationalId workGenerationalIdD = d(jobParameters);
        if (workGenerationalIdD == null) {
            AbstractC4333v.e().c(f59227e, "WorkSpec id not found!");
            return false;
        }
        AbstractC4333v.e().a(f59227e, "onStopJob for " + workGenerationalIdD);
        this.f59229b.remove(workGenerationalIdD);
        y yVarC = this.f59230c.c(workGenerationalIdD);
        if (yVarC != null) {
            this.f59231d.e(yVarC, Build.VERSION.SDK_INT >= 31 ? c.a(jobParameters) : -512);
        }
        return !this.f59228a.r().j(workGenerationalIdD.getWorkSpecId());
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
            this.f59228a = oP;
            C4458t c4458tR = oP.r();
            this.f59231d = new M(c4458tR, this.f59228a.v());
            c4458tR.e(this);
        } catch (IllegalStateException e10) {
            if (Application.class.equals(getApplication().getClass())) {
                AbstractC4333v.e().k(f59227e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        O o10 = this.f59228a;
        if (o10 != null) {
            o10.r().m(this);
        }
    }
}
