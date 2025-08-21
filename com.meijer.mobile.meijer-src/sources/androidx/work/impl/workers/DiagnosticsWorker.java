package androidx.work.impl.workers;

import O4.AbstractC4373v;
import P4.O;
import W4.e;
import W4.i;
import W4.q;
import Z4.b;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "()Landroidx/work/c$a;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        Intrinsics.j(context, "context");
        Intrinsics.j(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public c.a doWork() {
        O oP = O.p(getApplicationContext());
        Intrinsics.i(oP, "getInstance(applicationContext)");
        WorkDatabase workDatabaseU = oP.u();
        Intrinsics.i(workDatabaseU, "workManager.workDatabase");
        androidx.work.impl.model.c cVarL = workDatabaseU.l();
        i iVarJ = workDatabaseU.j();
        q qVarM = workDatabaseU.m();
        e eVarI = workDatabaseU.i();
        List<WorkSpec> listD = cVarL.d(oP.n().getClock().a() - TimeUnit.DAYS.toMillis(1L));
        List<WorkSpec> listV = cVarL.v();
        List<WorkSpec> listN = cVarL.n(HttpResponseStatus.SUCCESS_OK);
        if (!listD.isEmpty()) {
            AbstractC4373v.e().f(b.f43614a, "Recently completed work:\n\n");
            AbstractC4373v.e().f(b.f43614a, b.d(iVarJ, qVarM, eVarI, listD));
        }
        if (!listV.isEmpty()) {
            AbstractC4373v.e().f(b.f43614a, "Running work:\n\n");
            AbstractC4373v.e().f(b.f43614a, b.d(iVarJ, qVarM, eVarI, listV));
        }
        if (!listN.isEmpty()) {
            AbstractC4373v.e().f(b.f43614a, "Enqueued work:\n\n");
            AbstractC4373v.e().f(b.f43614a, b.d(iVarJ, qVarM, eVarI, listN));
        }
        c.a aVarC = c.a.c();
        Intrinsics.i(aVarC, "success()");
        return aVarC;
    }
}
