package androidx.work.impl.background.systemalarm;

import N4.AbstractC4333v;
import V4.WorkGenerationalId;
import W4.C5412n;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.SystemIdInfo;

/* loaded from: classes4.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f59180a = AbstractC4333v.i("Alarms");

    private static void b(Context context, WorkGenerationalId workGenerationalId, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.c(context, workGenerationalId), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        AbstractC4333v.e().a(f59180a, "Cancelling existing alarm with (workSpecId, systemId) (" + workGenerationalId + ", " + i10 + ")");
        alarmManager.cancel(service);
    }

    private static void d(Context context, WorkGenerationalId workGenerationalId, int i10, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.c(context, workGenerationalId), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j10, service);
        }
    }

    public static void a(Context context, WorkDatabase workDatabase, WorkGenerationalId workGenerationalId) {
        V4.e eVarI = workDatabase.i();
        SystemIdInfo systemIdInfoE = eVarI.e(workGenerationalId);
        if (systemIdInfoE != null) {
            b(context, workGenerationalId, systemIdInfoE.systemId);
            AbstractC4333v.e().a(f59180a, "Removing SystemIdInfo for workSpecId (" + workGenerationalId + ")");
            eVarI.a(workGenerationalId);
        }
    }

    public static void c(Context context, WorkDatabase workDatabase, WorkGenerationalId workGenerationalId, long j10) {
        V4.e eVarI = workDatabase.i();
        SystemIdInfo systemIdInfoE = eVarI.e(workGenerationalId);
        if (systemIdInfoE != null) {
            b(context, workGenerationalId, systemIdInfoE.systemId);
            d(context, workGenerationalId, systemIdInfoE.systemId, j10);
        } else {
            int iC = new C5412n(workDatabase).c();
            eVarI.d(V4.g.a(workGenerationalId, iC));
            d(context, workGenerationalId, iC, j10);
        }
    }
}
