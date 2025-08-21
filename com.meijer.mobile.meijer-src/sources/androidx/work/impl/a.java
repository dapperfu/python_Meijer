package androidx.work.impl;

import O4.AbstractC4373v;
import O4.InterfaceC4354b;
import P4.C4584t;
import P4.InterfaceC4571f;
import P4.InterfaceC4586v;
import R4.m;
import W4.WorkGenerationalId;
import X4.A;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.model.WorkSpec;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f59355a = AbstractC4373v.i("Schedulers");

    static InterfaceC4586v c(Context context, WorkDatabase workDatabase, androidx.work.a aVar) {
        m mVar = new m(context, workDatabase, aVar);
        A.c(context, SystemJobService.class, true);
        AbstractC4373v.e().a(f59355a, "Created SystemJobScheduler and enabled SystemJobService");
        return mVar;
    }

    public static void e(final List<InterfaceC4586v> list, C4584t c4584t, final Executor executor, final WorkDatabase workDatabase, final androidx.work.a aVar) {
        c4584t.e(new InterfaceC4571f() { // from class: P4.w
            @Override // P4.InterfaceC4571f
            public final void e(WorkGenerationalId workGenerationalId, boolean z10) {
                executor.execute(new Runnable() { // from class: P4.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.work.impl.a.b(list, workGenerationalId, aVar, workDatabase);
                    }
                });
            }
        });
    }

    public static void f(androidx.work.a aVar, WorkDatabase workDatabase, List<InterfaceC4586v> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        androidx.work.impl.model.c cVarL = workDatabase.l();
        workDatabase.beginTransaction();
        try {
            List<WorkSpec> listX = cVarL.x();
            d(cVarL, aVar.getClock(), listX);
            List<WorkSpec> listS = cVarL.s(aVar.getMaxSchedulerLimit());
            d(cVarL, aVar.getClock(), listS);
            if (listX != null) {
                listS.addAll(listX);
            }
            List<WorkSpec> listN = cVarL.n(HttpResponseStatus.SUCCESS_OK);
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (listS.size() > 0) {
                WorkSpec[] workSpecArr = (WorkSpec[]) listS.toArray(new WorkSpec[listS.size()]);
                for (InterfaceC4586v interfaceC4586v : list) {
                    if (interfaceC4586v.c()) {
                        interfaceC4586v.b(workSpecArr);
                    }
                }
            }
            if (listN.size() > 0) {
                WorkSpec[] workSpecArr2 = (WorkSpec[]) listN.toArray(new WorkSpec[listN.size()]);
                for (InterfaceC4586v interfaceC4586v2 : list) {
                    if (!interfaceC4586v2.c()) {
                        interfaceC4586v2.b(workSpecArr2);
                    }
                }
            }
        } catch (Throwable th2) {
            workDatabase.endTransaction();
            throw th2;
        }
    }

    public static /* synthetic */ void b(List list, WorkGenerationalId workGenerationalId, androidx.work.a aVar, WorkDatabase workDatabase) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC4586v) it.next()).a(workGenerationalId.getWorkSpecId());
        }
        f(aVar, workDatabase, list);
    }

    private static void d(androidx.work.impl.model.c cVar, InterfaceC4354b interfaceC4354b, List<WorkSpec> list) {
        if (list.size() > 0) {
            long jA = interfaceC4354b.a();
            Iterator<WorkSpec> it = list.iterator();
            while (it.hasNext()) {
                cVar.p(it.next().io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String, jA);
            }
        }
    }
}
