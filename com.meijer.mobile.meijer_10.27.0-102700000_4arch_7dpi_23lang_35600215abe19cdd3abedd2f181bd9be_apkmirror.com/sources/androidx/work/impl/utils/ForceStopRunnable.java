package androidx.work.impl.utils;

import N4.AbstractC4333v;
import N4.N;
import O4.I;
import O4.O;
import Q4.m;
import V4.k;
import W4.B;
import W4.C;
import W4.C5407i;
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
import o2.InterfaceC15993a;

/* loaded from: classes4.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private static final String f59350e = AbstractC4333v.i("ForceStopRunnable");

    /* renamed from: f, reason: collision with root package name */
    private static final long f59351f = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a, reason: collision with root package name */
    private final Context f59352a;

    /* renamed from: b, reason: collision with root package name */
    private final O f59353b;

    /* renamed from: c, reason: collision with root package name */
    private final B f59354c;

    /* renamed from: d, reason: collision with root package name */
    private int f59355d = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private static final String f59356a = AbstractC4333v.i("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            AbstractC4333v.e().j(f59356a, "Rescheduling alarm that keeps track of force-stops.");
            ForceStopRunnable.g(context);
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    public boolean e() {
        try {
            int i10 = Build.VERSION.SDK_INT;
            PendingIntent pendingIntentD = d(this.f59352a, i10 >= 31 ? 570425344 : 536870912);
            if (i10 >= 30) {
                if (pendingIntentD != null) {
                    pendingIntentD.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) this.f59352a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long jA = this.f59354c.a();
                    for (int i11 = 0; i11 < historicalProcessExitReasons.size(); i11++) {
                        ApplicationExitInfo applicationExitInfoA = C5407i.a(historicalProcessExitReasons.get(i11));
                        if (applicationExitInfoA.getReason() == 10 && applicationExitInfoA.getTimestamp() >= jA) {
                            return true;
                        }
                    }
                }
            } else if (pendingIntentD == null) {
                g(this.f59352a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e10) {
            e = e10;
            AbstractC4333v.e().l(f59350e, "Ignoring exception", e);
            return true;
        } catch (SecurityException e11) {
            e = e11;
            AbstractC4333v.e().l(f59350e, "Ignoring exception", e);
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
        long jCurrentTimeMillis = System.currentTimeMillis() + f59351f;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentD);
        }
    }

    public boolean a() {
        boolean zI = m.i(this.f59352a, this.f59353b.u());
        WorkDatabase workDatabaseU = this.f59353b.u();
        c cVarL = workDatabaseU.l();
        k kVarK = workDatabaseU.k();
        workDatabaseU.beginTransaction();
        try {
            List<WorkSpec> listW = cVarL.w();
            boolean z10 = (listW == null || listW.isEmpty()) ? false : true;
            if (z10) {
                for (WorkSpec workSpec : listW) {
                    cVarL.d(N.c.ENQUEUED, workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String);
                    cVarL.f(workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String, -512);
                    cVarL.q(workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String, -1L);
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
        a aVarN = this.f59353b.n();
        if (TextUtils.isEmpty(aVarN.getDefaultProcessName())) {
            AbstractC4333v.e().a(f59350e, "The default process name was not specified.");
            return true;
        }
        boolean zB = C.b(this.f59352a, aVarN);
        AbstractC4333v.e().a(f59350e, "Is default app process = " + zB);
        return zB;
    }

    public boolean h() {
        return this.f59353b.q().b();
    }

    public ForceStopRunnable(Context context, O o10) {
        this.f59352a = context.getApplicationContext();
        this.f59353b = o10;
        this.f59354c = o10.q();
    }

    private static PendingIntent d(Context context, int i10) {
        return PendingIntent.getBroadcast(context, -1, c(context), i10);
    }

    public void b() {
        boolean zA = a();
        if (h()) {
            AbstractC4333v.e().a(f59350e, "Rescheduling Workers.");
            this.f59353b.x();
            this.f59353b.q().e(false);
        } else if (e()) {
            AbstractC4333v.e().a(f59350e, "Application was force-stopped, rescheduling.");
            this.f59353b.x();
            this.f59354c.d(this.f59353b.n().getClock().a());
        } else if (zA) {
            AbstractC4333v.e().a(f59350e, "Found unfinished work, scheduling it.");
            androidx.work.impl.a.f(this.f59353b.n(), this.f59353b.u(), this.f59353b.s());
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
                        I.d(this.f59352a);
                        AbstractC4333v.e().a(f59350e, "Performing cleanup operations.");
                        try {
                            b();
                            break;
                        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e10) {
                            i10 = this.f59355d + 1;
                            this.f59355d = i10;
                            if (i10 >= 3) {
                                if (o.a(this.f59352a)) {
                                    str = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.";
                                } else {
                                    str = "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                                }
                                AbstractC4333v abstractC4333vE = AbstractC4333v.e();
                                String str2 = f59350e;
                                abstractC4333vE.d(str2, str, e10);
                                IllegalStateException illegalStateException = new IllegalStateException(str, e10);
                                InterfaceC15993a<Throwable> interfaceC15993aE = this.f59353b.n().e();
                                if (interfaceC15993aE != null) {
                                    AbstractC4333v.e().b(str2, "Routing exception to the specified exception handler", illegalStateException);
                                    interfaceC15993aE.accept(illegalStateException);
                                } else {
                                    throw illegalStateException;
                                }
                            } else {
                                AbstractC4333v.e().b(f59350e, "Retrying after " + (i10 * 300), e10);
                                i(((long) this.f59355d) * 300);
                            }
                        }
                        AbstractC4333v.e().b(f59350e, "Retrying after " + (i10 * 300), e10);
                        i(((long) this.f59355d) * 300);
                    } catch (SQLiteException e11) {
                        AbstractC4333v.e().c(f59350e, "Unexpected SQLite exception during migrations");
                        IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e11);
                        InterfaceC15993a<Throwable> interfaceC15993aE2 = this.f59353b.n().e();
                        if (interfaceC15993aE2 != null) {
                            interfaceC15993aE2.accept(illegalStateException2);
                        } else {
                            throw illegalStateException2;
                        }
                    }
                }
            }
        } finally {
            this.f59353b.w();
        }
    }
}
