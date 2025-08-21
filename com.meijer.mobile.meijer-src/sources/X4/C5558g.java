package X4;

import O4.C4356d;
import O4.P;
import P4.InterfaceC4586v;
import android.os.Build;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\f\u001a%\u0010\u0011\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/a;", "configuration", "LP4/F;", "continuation", "", "a", "(Landroidx/work/impl/WorkDatabase;Landroidx/work/a;LP4/F;)V", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "c", "(Landroidx/work/impl/model/WorkSpec;)Landroidx/work/impl/model/WorkSpec;", "b", "", "LP4/v;", "schedulers", "d", "(Ljava/util/List;Landroidx/work/impl/model/WorkSpec;)Landroidx/work/impl/model/WorkSpec;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: X4.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5558g {
    public static final void a(WorkDatabase workDatabase, androidx.work.a configuration, P4.F continuation) {
        int i10;
        Intrinsics.j(workDatabase, "workDatabase");
        Intrinsics.j(configuration, "configuration");
        Intrinsics.j(continuation, "continuation");
        List listS = CollectionsKt.s(continuation);
        int i11 = 0;
        while (!listS.isEmpty()) {
            P4.F f10 = (P4.F) CollectionsKt.M(listS);
            List<? extends P> listG = f10.g();
            Intrinsics.i(listG, "current.work");
            List<? extends P> list = listG;
            if ((list instanceof Collection) && list.isEmpty()) {
                i10 = 0;
            } else {
                Iterator<T> it = list.iterator();
                i10 = 0;
                while (it.hasNext()) {
                    if (((P) it.next()).getWorkSpec().constraints.g() && (i10 = i10 + 1) < 0) {
                        CollectionsKt.v();
                    }
                }
            }
            i11 += i10;
            List<P4.F> listF = f10.f();
            if (listF != null) {
                listS.addAll(listF);
            }
        }
        if (i11 == 0) {
            return;
        }
        int iB = workDatabase.l().B();
        int contentUriTriggerWorkersLimit = configuration.getContentUriTriggerWorkersLimit();
        if (iB + i11 <= contentUriTriggerWorkersLimit) {
            return;
        }
        throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: " + contentUriTriggerWorkersLimit + ";\nalready enqueued count: " + iB + ";\ncurrent enqueue operation count: " + i11 + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
    }

    public static final WorkSpec b(WorkSpec workSpec) {
        Intrinsics.j(workSpec, "workSpec");
        C4356d c4356d = workSpec.constraints;
        String str = workSpec.workerClassName;
        if (Intrinsics.e(str, ConstraintTrackingWorker.class.getName()) || !(c4356d.getRequiresBatteryNotLow() || c4356d.getRequiresStorageNotLow())) {
            return workSpec;
        }
        androidx.work.b bVarA = new b.a().c(workSpec.input).g("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str).a();
        String name = ConstraintTrackingWorker.class.getName();
        Intrinsics.i(name, "name");
        return WorkSpec.e(workSpec, null, null, name, null, bVarA, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777195, null);
    }

    public static final WorkSpec c(WorkSpec workSpec) {
        Intrinsics.j(workSpec, "workSpec");
        boolean zF = workSpec.input.f("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", String.class);
        boolean zF2 = workSpec.input.f("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", String.class);
        boolean zF3 = workSpec.input.f("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", String.class);
        if (zF || !zF2 || !zF3) {
            return workSpec;
        }
        return WorkSpec.e(workSpec, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", null, new b.a().c(workSpec.input).g("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", workSpec.workerClassName).a(), null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777195, null);
    }

    public static final WorkSpec d(List<? extends InterfaceC4586v> schedulers, WorkSpec workSpec) {
        Intrinsics.j(schedulers, "schedulers");
        Intrinsics.j(workSpec, "workSpec");
        WorkSpec workSpecC = c(workSpec);
        return Build.VERSION.SDK_INT < 26 ? b(workSpecC) : workSpecC;
    }
}
