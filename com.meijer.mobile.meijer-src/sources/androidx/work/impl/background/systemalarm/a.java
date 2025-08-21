package androidx.work.impl.background.systemalarm;

import O4.AbstractC4373v;
import W4.WorkGenerationalId;
import X4.C5565n;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.SystemIdInfo;

/* loaded from: classes4.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f59366a = AbstractC4373v.i("Alarms");

    private static void b(Context context, WorkGenerationalId workGenerationalId, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.b(context, workGenerationalId), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        AbstractC4373v.e().a(f59366a, "Cancelling existing alarm with (workSpecId, systemId) (" + workGenerationalId + ", " + i10 + ")");
        alarmManager.cancel(service);
    }

    private static void d(Context context, WorkGenerationalId workGenerationalId, int i10, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.b(context, workGenerationalId), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j10, service);
        }
    }

    public static void a(Context context, WorkDatabase workDatabase, WorkGenerationalId workGenerationalId) {
        W4.e eVarI = workDatabase.i();
        SystemIdInfo systemIdInfoD = eVarI.d(workGenerationalId);
        if (systemIdInfoD != null) {
            b(context, workGenerationalId, systemIdInfoD.systemId);
            AbstractC4373v.e().a(f59366a, "Removing SystemIdInfo for workSpecId (" + workGenerationalId + ")");
            eVarI.e(workGenerationalId);
        }
    }

    public static void c(Context context, WorkDatabase workDatabase, WorkGenerationalId workGenerationalId, long j10) {
        W4.e eVarI = workDatabase.i();
        SystemIdInfo systemIdInfoD = eVarI.d(workGenerationalId);
        if (systemIdInfoD != null) {
            b(context, workGenerationalId, systemIdInfoD.systemId);
            d(context, workGenerationalId, systemIdInfoD.systemId, j10);
        } else {
            int iC = new C5565n(workDatabase).c();
            eVarI.c(W4.g.a(workGenerationalId, iC));
            d(context, workGenerationalId, iC, j10);
        }
    }
}
