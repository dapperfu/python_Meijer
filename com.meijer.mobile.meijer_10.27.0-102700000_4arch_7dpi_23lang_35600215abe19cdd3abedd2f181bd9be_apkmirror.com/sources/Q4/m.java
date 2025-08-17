package Q4;

import N4.AbstractC4333v;
import N4.E;
import N4.N;
import O4.InterfaceC4460v;
import V4.WorkGenerationalId;
import V4.p;
import W4.C5412n;
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
import o2.InterfaceC15993a;

/* loaded from: classes4.dex */
public class m implements InterfaceC4460v {

    /* renamed from: f, reason: collision with root package name */
    private static final String f29759f = AbstractC4333v.i("SystemJobScheduler");

    /* renamed from: a, reason: collision with root package name */
    private final Context f29760a;

    /* renamed from: b, reason: collision with root package name */
    private final JobScheduler f29761b;

    /* renamed from: c, reason: collision with root package name */
    private final k f29762c;

    /* renamed from: d, reason: collision with root package name */
    private final WorkDatabase f29763d;

    /* renamed from: e, reason: collision with root package name */
    private final androidx.work.a f29764e;

    public m(Context context, WorkDatabase workDatabase, androidx.work.a aVar) {
        this(context, workDatabase, aVar, d.c(context), new k(context, aVar.getClock(), aVar.getIsMarkingJobsAsImportantWhileForeground()));
    }

    @Override // O4.InterfaceC4460v
    public boolean d() {
        return true;
    }

    public static void b(Context context) {
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

    @Override // O4.InterfaceC4460v
    public void a(String str) {
        List<Integer> listF = f(this.f29760a, this.f29761b, str);
        if (listF == null || listF.isEmpty()) {
            return;
        }
        Iterator<Integer> it = listF.iterator();
        while (it.hasNext()) {
            e(this.f29761b, it.next().intValue());
        }
        this.f29763d.i().g(str);
    }

    @Override // O4.InterfaceC4460v
    public void c(WorkSpec... workSpecArr) {
        C5412n c5412n = new C5412n(this.f29763d);
        for (WorkSpec workSpec : workSpecArr) {
            this.f29763d.beginTransaction();
            try {
                WorkSpec workSpecK = this.f29763d.l().k(workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String);
                if (workSpecK == null) {
                    AbstractC4333v.e().k(f29759f, "Skipping scheduling " + workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String + " because it's no longer in the DB");
                    this.f29763d.setTransactionSuccessful();
                } else if (workSpecK.state != N.c.ENQUEUED) {
                    AbstractC4333v.e().k(f29759f, "Skipping scheduling " + workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String + " because it is no longer enqueued");
                    this.f29763d.setTransactionSuccessful();
                } else {
                    WorkGenerationalId workGenerationalIdA = p.a(workSpec);
                    SystemIdInfo systemIdInfoE = this.f29763d.i().e(workGenerationalIdA);
                    int iE = systemIdInfoE != null ? systemIdInfoE.systemId : c5412n.e(this.f29764e.getMinJobSchedulerId(), this.f29764e.getMaxJobSchedulerId());
                    if (systemIdInfoE == null) {
                        this.f29763d.i().d(V4.g.a(workGenerationalIdA, iE));
                    }
                    j(workSpec, iE);
                    this.f29763d.setTransactionSuccessful();
                }
            } finally {
                this.f29763d.endTransaction();
            }
        }
    }

    public void j(WorkSpec workSpec, int i10) {
        JobInfo jobInfoA = this.f29762c.a(workSpec, i10);
        AbstractC4333v abstractC4333vE = AbstractC4333v.e();
        String str = f29759f;
        abstractC4333vE.a(str, "Scheduling work ID " + workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String + "Job ID " + i10);
        try {
            if (this.f29761b.schedule(jobInfoA) == 0) {
                AbstractC4333v.e().k(str, "Unable to schedule work ID " + workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String);
                if (workSpec.expedited && workSpec.outOfQuotaPolicy == E.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    workSpec.expedited = false;
                    AbstractC4333v.e().a(str, String.format("Scheduling a non-expedited job (work ID %s)", workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String));
                    j(workSpec, i10);
                }
            }
        } catch (IllegalStateException e10) {
            String strA = d.a(this.f29760a, this.f29763d, this.f29764e);
            AbstractC4333v.e().c(f29759f, strA);
            IllegalStateException illegalStateException = new IllegalStateException(strA, e10);
            InterfaceC15993a<Throwable> interfaceC15993aL = this.f29764e.l();
            if (interfaceC15993aL == null) {
                throw illegalStateException;
            }
            interfaceC15993aL.accept(illegalStateException);
        } catch (Throwable th2) {
            AbstractC4333v.e().d(f29759f, "Unable to schedule " + workSpec, th2);
        }
    }

    private static void e(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th2) {
            AbstractC4333v.e().d(f29759f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th2);
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
        List<String> listC = workDatabase.i().c();
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
        Iterator<String> it = listC.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains(it.next())) {
                AbstractC4333v.e().a(f29759f, "Reconciling jobs");
                z10 = true;
                break;
            }
        }
        if (z10) {
            workDatabase.beginTransaction();
            try {
                androidx.work.impl.model.c cVarL = workDatabase.l();
                Iterator<String> it2 = listC.iterator();
                while (it2.hasNext()) {
                    cVarL.q(it2.next(), -1L);
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
        this.f29760a = context;
        this.f29761b = jobScheduler;
        this.f29762c = kVar;
        this.f29763d = workDatabase;
        this.f29764e = aVar;
    }
}
