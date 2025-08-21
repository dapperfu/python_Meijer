package androidx.work.impl.utils;

import O4.AbstractC4373v;
import O4.N;
import P4.I;
import P4.O;
import R4.m;
import W4.k;
import X4.B;
import X4.C;
import X4.C5560i;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.c;
import j2.o;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o2.InterfaceC16068a;

/* loaded from: classes4.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private static final String f59536e = AbstractC4373v.i("ForceStopRunnable");

    /* renamed from: f, reason: collision with root package name */
    private static final long f59537f = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a, reason: collision with root package name */
    private final Context f59538a;

    /* renamed from: b, reason: collision with root package name */
    private final O f59539b;

    /* renamed from: c, reason: collision with root package name */
    private final B f59540c;

    /* renamed from: d, reason: collision with root package name */
    private int f59541d = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private static final String f59542a = AbstractC4373v.i("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            AbstractC4373v.e().j(f59542a, "Rescheduling alarm that keeps track of force-stops.");
            ForceStopRunnable.g(context);
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    public boolean e() {
        try {
            int i10 = Build.VERSION.SDK_INT;
            PendingIntent pendingIntentD = d(this.f59538a, i10 >= 31 ? 570425344 : 536870912);
            if (i10 >= 30) {
                if (pendingIntentD != null) {
                    pendingIntentD.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) this.f59538a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long jA = this.f59540c.a();
                    for (int i11 = 0; i11 < historicalProcessExitReasons.size(); i11++) {
                        ApplicationExitInfo applicationExitInfoA = C5560i.a(historicalProcessExitReasons.get(i11));
                        if (applicationExitInfoA.getReason() == 10 && applicationExitInfoA.getTimestamp() >= jA) {
                            return true;
                        }
                    }
                }
            } else if (pendingIntentD == null) {
                g(this.f59538a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e10) {
            e = e10;
            AbstractC4373v.e().l(f59536e, "Ignoring exception", e);
            return true;
        } catch (SecurityException e11) {
            e = e11;
            AbstractC4373v.e().l(f59536e, "Ignoring exception", e);
            return true;
        }
    }

    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    @SuppressLint({"ClassVerificationFailure"})
    static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent pendingIntentD = d(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + f59537f;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentD);
        }
    }

    public boolean a() {
        boolean zI = m.i(this.f59538a, this.f59539b.u());
        WorkDatabase workDatabaseU = this.f59539b.u();
        c cVarL = workDatabaseU.l();
        k kVarK = workDatabaseU.k();
        workDatabaseU.beginTransaction();
        try {
            List<WorkSpec> listV = cVarL.v();
            boolean z10 = (listV == null || listV.isEmpty()) ? false : true;
            if (z10) {
                for (WorkSpec workSpec : listV) {
                    cVarL.w(N.c.ENQUEUED, workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String);
                    cVarL.e(workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String, -512);
                    cVarL.p(workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String, -1L);
                }
            }
            kVarK.deleteAll();
            workDatabaseU.setTransactionSuccessful();
            workDatabaseU.endTransaction();
            return z10 || zI;
        } catch (Throwable th2) {
            workDatabaseU.endTransaction();
            throw th2;
        }
    }

    public boolean f() {
        a aVarN = this.f59539b.n();
        if (TextUtils.isEmpty(aVarN.getDefaultProcessName())) {
            AbstractC4373v.e().a(f59536e, "The default process name was not specified.");
            return true;
        }
        boolean zB = C.b(this.f59538a, aVarN);
        AbstractC4373v.e().a(f59536e, "Is default app process = " + zB);
        return zB;
    }

    public boolean h() {
        return this.f59539b.q().b();
    }

    public ForceStopRunnable(Context context, O o10) {
        this.f59538a = context.getApplicationContext();
        this.f59539b = o10;
        this.f59540c = o10.q();
    }

    private static PendingIntent d(Context context, int i10) {
        return PendingIntent.getBroadcast(context, -1, c(context), i10);
    }

    public void b() {
        boolean zA = a();
        if (h()) {
            AbstractC4373v.e().a(f59536e, "Rescheduling Workers.");
            this.f59539b.x();
            this.f59539b.q().e(false);
        } else if (e()) {
            AbstractC4373v.e().a(f59536e, "Application was force-stopped, rescheduling.");
            this.f59539b.x();
            this.f59540c.d(this.f59539b.n().getClock().a());
        } else if (zA) {
            AbstractC4373v.e().a(f59536e, "Found unfinished work, scheduling it.");
            androidx.work.impl.a.f(this.f59539b.n(), this.f59539b.u(), this.f59539b.s());
        }
    }

    public void i(long j10) throws InterruptedException {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10;
        String str;
        try {
            if (f()) {
                while (true) {
                    try {
                        I.d(this.f59538a);
                        AbstractC4373v.e().a(f59536e, "Performing cleanup operations.");
                        try {
                            b();
                            break;
                        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e10) {
                            i10 = this.f59541d + 1;
                            this.f59541d = i10;
                            if (i10 >= 3) {
                                if (o.a(this.f59538a)) {
                                    str = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.";
                                } else {
                                    str = "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                                }
                                AbstractC4373v abstractC4373vE = AbstractC4373v.e();
                                String str2 = f59536e;
                                abstractC4373vE.d(str2, str, e10);
                                IllegalStateException illegalStateException = new IllegalStateException(str, e10);
                                InterfaceC16068a<Throwable> interfaceC16068aE = this.f59539b.n().e();
                                if (interfaceC16068aE != null) {
                                    AbstractC4373v.e().b(str2, "Routing exception to the specified exception handler", illegalStateException);
                                    interfaceC16068aE.accept(illegalStateException);
                                } else {
                                    throw illegalStateException;
                                }
                            } else {
                                AbstractC4373v.e().b(f59536e, "Retrying after " + (i10 * 300), e10);
                                i(((long) this.f59541d) * 300);
                            }
                        }
                        AbstractC4373v.e().b(f59536e, "Retrying after " + (i10 * 300), e10);
                        i(((long) this.f59541d) * 300);
                    } catch (SQLiteException e11) {
                        AbstractC4373v.e().c(f59536e, "Unexpected SQLite exception during migrations");
                        IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e11);
                        InterfaceC16068a<Throwable> interfaceC16068aE2 = this.f59539b.n().e();
                        if (interfaceC16068aE2 != null) {
                            interfaceC16068aE2.accept(illegalStateException2);
                        } else {
                            throw illegalStateException2;
                        }
                    }
                }
            }
        } finally {
            this.f59539b.w();
        }
    }
}
