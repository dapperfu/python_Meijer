package androidx.work.impl;

import N4.AbstractC4333v;
import N4.InterfaceC4314b;
import O4.C4458t;
import O4.InterfaceC4445f;
import O4.InterfaceC4460v;
import Q4.m;
import V4.WorkGenerationalId;
import W4.A;
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
    private static final String f59169a = AbstractC4333v.i("Schedulers");

    static InterfaceC4460v c(Context context, WorkDatabase workDatabase, androidx.work.a aVar) {
        m mVar = new m(context, workDatabase, aVar);
        A.c(context, SystemJobService.class, true);
        AbstractC4333v.e().a(f59169a, "Created SystemJobScheduler and enabled SystemJobService");
        return mVar;
    }

    public static void e(final List<InterfaceC4460v> list, C4458t c4458t, final Executor executor, final WorkDatabase workDatabase, final androidx.work.a aVar) {
        c4458t.e(new InterfaceC4445f() { // from class: O4.w
            @Override // O4.InterfaceC4445f
            public final void b(WorkGenerationalId workGenerationalId, boolean z10) {
                executor.execute(new Runnable() { // from class: O4.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.work.impl.a.b(list, workGenerationalId, aVar, workDatabase);
                    }
                });
            }
        });
    }

    public static void f(androidx.work.a aVar, WorkDatabase workDatabase, List<InterfaceC4460v> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        androidx.work.impl.model.c cVarL = workDatabase.l();
        workDatabase.beginTransaction();
        try {
            List<WorkSpec> listX = cVarL.x();
            d(cVarL, aVar.getClock(), listX);
            List<WorkSpec> listT = cVarL.t(aVar.getMaxSchedulerLimit());
            d(cVarL, aVar.getClock(), listT);
            if (listX != null) {
                listT.addAll(listX);
            }
            List<WorkSpec> listO = cVarL.o(HttpResponseStatus.SUCCESS_OK);
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (listT.size() > 0) {
                WorkSpec[] workSpecArr = (WorkSpec[]) listT.toArray(new WorkSpec[listT.size()]);
                for (InterfaceC4460v interfaceC4460v : list) {
                    if (interfaceC4460v.d()) {
                        interfaceC4460v.c(workSpecArr);
                    }
                }
            }
            if (listO.size() > 0) {
                WorkSpec[] workSpecArr2 = (WorkSpec[]) listO.toArray(new WorkSpec[listO.size()]);
                for (InterfaceC4460v interfaceC4460v2 : list) {
                    if (!interfaceC4460v2.d()) {
                        interfaceC4460v2.c(workSpecArr2);
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
            ((InterfaceC4460v) it.next()).a(workGenerationalId.getWorkSpecId());
        }
        f(aVar, workDatabase, list);
    }

    private static void d(androidx.work.impl.model.c cVar, InterfaceC4314b interfaceC4314b, List<WorkSpec> list) {
        if (list.size() > 0) {
            long jA = interfaceC4314b.a();
            Iterator<WorkSpec> it = list.iterator();
            while (it.hasNext()) {
                cVar.q(it.next().io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String, jA);
            }
        }
    }
}
