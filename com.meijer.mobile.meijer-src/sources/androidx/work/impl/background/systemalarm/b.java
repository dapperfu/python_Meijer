package androidx.work.impl.background.systemalarm;

import O4.AbstractC4373v;
import O4.InterfaceC4354b;
import P4.InterfaceC4571f;
import P4.y;
import P4.z;
import W4.WorkGenerationalId;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class b implements InterfaceC4571f {

    /* renamed from: f, reason: collision with root package name */
    private static final String f59367f = AbstractC4373v.i("CommandHandler");

    /* renamed from: a, reason: collision with root package name */
    private final Context f59368a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<WorkGenerationalId, f> f59369b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Object f59370c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4354b f59371d;

    /* renamed from: e, reason: collision with root package name */
    private final z f59372e;

    private static boolean m(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    static Intent a(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent b(Context context, WorkGenerationalId workGenerationalId) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        return q(intent, workGenerationalId);
    }

    static Intent c(Context context, WorkGenerationalId workGenerationalId, boolean z10) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        return q(intent, workGenerationalId);
    }

    static Intent d(Context context, WorkGenerationalId workGenerationalId) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        return q(intent, workGenerationalId);
    }

    static Intent f(Context context, WorkGenerationalId workGenerationalId) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        return q(intent, workGenerationalId);
    }

    private void h(Intent intent, int i10, g gVar) {
        synchronized (this.f59370c) {
            try {
                WorkGenerationalId workGenerationalIdP = p(intent);
                AbstractC4373v abstractC4373vE = AbstractC4373v.e();
                String str = f59367f;
                abstractC4373vE.a(str, "Handing delay met for " + workGenerationalIdP);
                if (this.f59369b.containsKey(workGenerationalIdP)) {
                    AbstractC4373v.e().a(str, "WorkSpec " + workGenerationalIdP + " is is already being handled for ACTION_DELAY_MET");
                } else {
                    f fVar = new f(this.f59368a, i10, gVar, this.f59372e.e(workGenerationalIdP));
                    this.f59369b.put(workGenerationalIdP, fVar);
                    fVar.f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static WorkGenerationalId p(Intent intent) {
        return new WorkGenerationalId(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    private static Intent q(Intent intent, WorkGenerationalId workGenerationalId) {
        intent.putExtra("KEY_WORKSPEC_ID", workGenerationalId.getWorkSpecId());
        intent.putExtra("KEY_WORKSPEC_GENERATION", workGenerationalId.getGeneration());
        return intent;
    }

    @Override // P4.InterfaceC4571f
    public void e(WorkGenerationalId workGenerationalId, boolean z10) {
        synchronized (this.f59370c) {
            try {
                f fVarRemove = this.f59369b.remove(workGenerationalId);
                this.f59372e.f(workGenerationalId);
                if (fVarRemove != null) {
                    fVarRemove.g(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean n() {
        boolean z10;
        synchronized (this.f59370c) {
            z10 = !this.f59369b.isEmpty();
        }
        return z10;
    }

    b(Context context, InterfaceC4354b interfaceC4354b, z zVar) {
        this.f59368a = context;
        this.f59371d = interfaceC4354b;
        this.f59372e = zVar;
    }

    private void g(Intent intent, int i10, g gVar) {
        AbstractC4373v.e().a(f59367f, "Handling constraints changed " + intent);
        new c(this.f59368a, this.f59371d, i10, gVar).a();
    }

    private void i(Intent intent, int i10) {
        WorkGenerationalId workGenerationalIdP = p(intent);
        boolean z10 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        AbstractC4373v.e().a(f59367f, "Handling onExecutionCompleted " + intent + ", " + i10);
        e(workGenerationalIdP, z10);
    }

    private void j(Intent intent, int i10, g gVar) {
        AbstractC4373v.e().a(f59367f, "Handling reschedule " + intent + ", " + i10);
        gVar.g().x();
    }

    private void k(Intent intent, int i10, g gVar) {
        WorkGenerationalId workGenerationalIdP = p(intent);
        AbstractC4373v abstractC4373vE = AbstractC4373v.e();
        String str = f59367f;
        abstractC4373vE.a(str, "Handling schedule work for " + workGenerationalIdP);
        WorkDatabase workDatabaseU = gVar.g().u();
        workDatabaseU.beginTransaction();
        try {
            WorkSpec workSpecJ = workDatabaseU.l().j(workGenerationalIdP.getWorkSpecId());
            if (workSpecJ == null) {
                AbstractC4373v.e().k(str, "Skipping scheduling " + workGenerationalIdP + " because it's no longer in the DB");
                return;
            }
            if (workSpecJ.state.b()) {
                AbstractC4373v.e().k(str, "Skipping scheduling " + workGenerationalIdP + "because it is finished.");
                return;
            }
            long jC = workSpecJ.c();
            if (!workSpecJ.l()) {
                AbstractC4373v.e().a(str, "Setting up Alarms for " + workGenerationalIdP + "at " + jC);
                a.c(this.f59368a, workDatabaseU, workGenerationalIdP, jC);
            } else {
                AbstractC4373v.e().a(str, "Opportunistically setting an alarm for " + workGenerationalIdP + "at " + jC);
                a.c(this.f59368a, workDatabaseU, workGenerationalIdP, jC);
                gVar.f().a().execute(new g.b(gVar, a(this.f59368a), i10));
            }
            workDatabaseU.setTransactionSuccessful();
        } finally {
            workDatabaseU.endTransaction();
        }
    }

    private void l(Intent intent, g gVar) {
        List<y> listRemove;
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        if (extras.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i10 = extras.getInt("KEY_WORKSPEC_GENERATION");
            listRemove = new ArrayList<>(1);
            y yVarF = this.f59372e.f(new WorkGenerationalId(string, i10));
            if (yVarF != null) {
                listRemove.add(yVarF);
            }
        } else {
            listRemove = this.f59372e.remove(string);
        }
        for (y yVar : listRemove) {
            AbstractC4373v.e().a(f59367f, "Handing stopWork work for " + string);
            gVar.i().b(yVar);
            a.a(this.f59368a, gVar.g().u(), yVar.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
            gVar.e(yVar.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), false);
        }
    }

    void o(Intent intent, int i10, g gVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            g(intent, i10, gVar);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            j(intent, i10, gVar);
            return;
        }
        if (!m(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            AbstractC4373v.e().c(f59367f, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            k(intent, i10, gVar);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            h(intent, i10, gVar);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            l(intent, gVar);
            return;
        }
        if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            i(intent, i10);
            return;
        }
        AbstractC4373v.e().k(f59367f, "Ignoring intent " + intent);
    }
}
