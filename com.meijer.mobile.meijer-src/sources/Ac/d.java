package Ac;

import Bc.InterfaceC2922d;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.zip.Adler32;
import xc.C18156a;

/* loaded from: classes4.dex */
public class d implements x {

    /* renamed from: a, reason: collision with root package name */
    private final Context f241a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2922d f242b;

    /* renamed from: c, reason: collision with root package name */
    private final f f243c;

    @Override // Ac.x
    public void b(tc.p pVar, int i10) {
        a(pVar, i10, false);
    }

    @Override // Ac.x
    public void a(tc.p pVar, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f241a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f241a.getSystemService("jobscheduler");
        int iC = c(pVar);
        if (!z10 && d(jobScheduler, iC, i10)) {
            C18156a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", pVar);
            return;
        }
        long jI1 = this.f242b.I1(pVar);
        JobInfo.Builder builderC = this.f243c.c(new JobInfo.Builder(iC, componentName), pVar.d(), jI1, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", pVar.b());
        persistableBundle.putInt("priority", Ec.a.a(pVar.d()));
        if (pVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(pVar.c(), 0));
        }
        builderC.setExtras(persistableBundle);
        C18156a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", pVar, Integer.valueOf(iC), Long.valueOf(this.f243c.g(pVar.d(), jI1, i10)), Long.valueOf(jI1), Integer.valueOf(i10));
        jobScheduler.schedule(builderC.build());
    }

    int c(tc.p pVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f241a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(pVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(Ec.a.a(pVar.d())).array());
        if (pVar.c() != null) {
            adler32.update(pVar.c());
        }
        return (int) adler32.getValue();
    }

    public d(Context context, InterfaceC2922d interfaceC2922d, f fVar) {
        this.f241a = context;
        this.f242b = interfaceC2922d;
        this.f243c = fVar;
    }

    private boolean d(JobScheduler jobScheduler, int i10, int i11) {
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            JobInfo next = it.next();
            int i12 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i10) {
                if (i12 >= i11) {
                    return true;
                }
            }
        }
        return false;
    }
}
