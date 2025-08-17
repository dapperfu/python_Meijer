package yc;

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
import vc.C17544a;
import zc.InterfaceC18422d;

/* renamed from: yc.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18204d implements x {

    /* renamed from: a, reason: collision with root package name */
    private final Context f170392a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC18422d f170393b;

    /* renamed from: c, reason: collision with root package name */
    private final f f170394c;

    @Override // yc.x
    public void a(rc.p pVar, int i10) {
        b(pVar, i10, false);
    }

    @Override // yc.x
    public void b(rc.p pVar, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f170392a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f170392a.getSystemService("jobscheduler");
        int iC = c(pVar);
        if (!z10 && d(jobScheduler, iC, i10)) {
            C17544a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", pVar);
            return;
        }
        long jU1 = this.f170393b.u1(pVar);
        JobInfo.Builder builderC = this.f170394c.c(new JobInfo.Builder(iC, componentName), pVar.d(), jU1, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", pVar.b());
        persistableBundle.putInt("priority", Cc.a.a(pVar.d()));
        if (pVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(pVar.c(), 0));
        }
        builderC.setExtras(persistableBundle);
        C17544a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", pVar, Integer.valueOf(iC), Long.valueOf(this.f170394c.g(pVar.d(), jU1, i10)), Long.valueOf(jU1), Integer.valueOf(i10));
        jobScheduler.schedule(builderC.build());
    }

    int c(rc.p pVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f170392a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(pVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(Cc.a.a(pVar.d())).array());
        if (pVar.c() != null) {
            adler32.update(pVar.c());
        }
        return (int) adler32.getValue();
    }

    public C18204d(Context context, InterfaceC18422d interfaceC18422d, f fVar) {
        this.f170392a = context;
        this.f170393b = interfaceC18422d;
        this.f170394c = fVar;
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
