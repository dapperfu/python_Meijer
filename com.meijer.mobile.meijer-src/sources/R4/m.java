package R4;

import O4.AbstractC4373v;
import O4.E;
import O4.N;
import P4.InterfaceC4586v;
import W4.WorkGenerationalId;
import W4.p;
import X4.C5565n;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o2.InterfaceC16068a;

/* loaded from: classes4.dex */
public class m implements InterfaceC4586v {

    /* renamed from: f, reason: collision with root package name */
    private static final String f31870f = AbstractC4373v.i("SystemJobScheduler");

    /* renamed from: a, reason: collision with root package name */
    private final Context f31871a;

    /* renamed from: b, reason: collision with root package name */
    private final JobScheduler f31872b;

    /* renamed from: c, reason: collision with root package name */
    private final k f31873c;

    /* renamed from: d, reason: collision with root package name */
    private final WorkDatabase f31874d;

    /* renamed from: e, reason: collision with root package name */
    private final androidx.work.a f31875e;

    public m(Context context, WorkDatabase workDatabase, androidx.work.a aVar) {
        this(context, workDatabase, aVar, d.c(context), new k(context, aVar.getClock(), aVar.getIsMarkingJobsAsImportantWhileForeground()));
    }

    @Override // P4.InterfaceC4586v
    public boolean c() {
        return true;
    }

    public static void d(Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.c(context).cancelAll();
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> listG = g(context, jobScheduler);
        if (listG == null || listG.isEmpty()) {
            return;
        }
        Iterator<JobInfo> it = listG.iterator();
        while (it.hasNext()) {
            e(jobScheduler, it.next().getId());
        }
    }

    private static WorkGenerationalId h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new WorkGenerationalId(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // P4.InterfaceC4586v
    public void a(String str) {
        List<Integer> listF = f(this.f31871a, this.f31872b, str);
        if (listF == null || listF.isEmpty()) {
            return;
        }
        Iterator<Integer> it = listF.iterator();
        while (it.hasNext()) {
            e(this.f31872b, it.next().intValue());
        }
        this.f31874d.i().g(str);
    }

    @Override // P4.InterfaceC4586v
    public void b(WorkSpec... workSpecArr) {
        C5565n c5565n = new C5565n(this.f31874d);
        for (WorkSpec workSpec : workSpecArr) {
            this.f31874d.beginTransaction();
            try {
                WorkSpec workSpecJ = this.f31874d.l().j(workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String);
                if (workSpecJ == null) {
                    AbstractC4373v.e().k(f31870f, "Skipping scheduling " + workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String + " because it's no longer in the DB");
                    this.f31874d.setTransactionSuccessful();
                } else if (workSpecJ.state != N.c.ENQUEUED) {
                    AbstractC4373v.e().k(f31870f, "Skipping scheduling " + workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String + " because it is no longer enqueued");
                    this.f31874d.setTransactionSuccessful();
                } else {
                    WorkGenerationalId workGenerationalIdA = p.a(workSpec);
                    SystemIdInfo systemIdInfoD = this.f31874d.i().d(workGenerationalIdA);
                    int iE = systemIdInfoD != null ? systemIdInfoD.systemId : c5565n.e(this.f31875e.getMinJobSchedulerId(), this.f31875e.getMaxJobSchedulerId());
                    if (systemIdInfoD == null) {
                        this.f31874d.i().c(W4.g.a(workGenerationalIdA, iE));
                    }
                    j(workSpec, iE);
                    this.f31874d.setTransactionSuccessful();
                }
            } finally {
                this.f31874d.endTransaction();
            }
        }
    }

    public void j(WorkSpec workSpec, int i10) {
        JobInfo jobInfoA = this.f31873c.a(workSpec, i10);
        AbstractC4373v abstractC4373vE = AbstractC4373v.e();
        String str = f31870f;
        abstractC4373vE.a(str, "Scheduling work ID " + workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String + "Job ID " + i10);
        try {
            if (this.f31872b.schedule(jobInfoA) == 0) {
                AbstractC4373v.e().k(str, "Unable to schedule work ID " + workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String);
                if (workSpec.expedited && workSpec.outOfQuotaPolicy == E.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    workSpec.expedited = false;
                    AbstractC4373v.e().a(str, String.format("Scheduling a non-expedited job (work ID %s)", workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String));
                    j(workSpec, i10);
                }
            }
        } catch (IllegalStateException e10) {
            String strA = d.a(this.f31871a, this.f31874d, this.f31875e);
            AbstractC4373v.e().c(f31870f, strA);
            IllegalStateException illegalStateException = new IllegalStateException(strA, e10);
            InterfaceC16068a<Throwable> interfaceC16068aL = this.f31875e.l();
            if (interfaceC16068aL == null) {
                throw illegalStateException;
            }
            interfaceC16068aL.accept(illegalStateException);
        } catch (Throwable th2) {
            AbstractC4373v.e().d(f31870f, "Unable to schedule " + workSpec, th2);
        }
    }

    private static void e(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th2) {
            AbstractC4373v.e().d(f31870f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th2);
        }
    }

    private static List<Integer> f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> listG = g(context, jobScheduler);
        if (listG == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listG) {
            WorkGenerationalId workGenerationalIdH = h(jobInfo);
            if (workGenerationalIdH != null && str.equals(workGenerationalIdH.getWorkSpecId())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    static List<JobInfo> g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> listB = d.b(jobScheduler);
        if (listB == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listB.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : listB) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static boolean i(Context context, WorkDatabase workDatabase) {
        int size;
        JobScheduler jobSchedulerC = d.c(context);
        List<JobInfo> listG = g(context, jobSchedulerC);
        List<String> listB = workDatabase.i().b();
        boolean z10 = false;
        if (listG != null) {
            size = listG.size();
        } else {
            size = 0;
        }
        HashSet hashSet = new HashSet(size);
        if (listG != null && !listG.isEmpty()) {
            for (JobInfo jobInfo : listG) {
                WorkGenerationalId workGenerationalIdH = h(jobInfo);
                if (workGenerationalIdH != null) {
                    hashSet.add(workGenerationalIdH.getWorkSpecId());
                } else {
                    e(jobSchedulerC, jobInfo.getId());
                }
            }
        }
        Iterator<String> it = listB.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains(it.next())) {
                AbstractC4373v.e().a(f31870f, "Reconciling jobs");
                z10 = true;
                break;
            }
        }
        if (z10) {
            workDatabase.beginTransaction();
            try {
                androidx.work.impl.model.c cVarL = workDatabase.l();
                Iterator<String> it2 = listB.iterator();
                while (it2.hasNext()) {
                    cVarL.p(it2.next(), -1L);
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                return z10;
            } catch (Throwable th2) {
                workDatabase.endTransaction();
                throw th2;
            }
        }
        return z10;
    }

    public m(Context context, WorkDatabase workDatabase, androidx.work.a aVar, JobScheduler jobScheduler, k kVar) {
        this.f31871a = context;
        this.f31872b = jobScheduler;
        this.f31873c = kVar;
        this.f31874d = workDatabase;
        this.f31875e = aVar;
    }
}
