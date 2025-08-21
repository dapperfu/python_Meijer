package androidx.work.impl.model;

import O4.C4356d;
import O4.E;
import O4.EnumC4353a;
import O4.EnumC4374w;
import O4.N;
import W4.s;
import X4.NetworkRequestCompat;
import android.database.Cursor;
import androidx.room.AbstractC6264h;
import androidx.room.AbstractC6266j;
import androidx.room.C6260d;
import androidx.room.G;
import androidx.room.N;
import androidx.room.S;
import androidx.work.impl.model.WorkSpec;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import pv.InterfaceC16561f;
import w4.C17823a;
import w4.C17824b;
import w4.C17832j;
import w4.C17840r;

/* loaded from: classes4.dex */
public final class d implements androidx.work.impl.model.c {

    /* renamed from: a, reason: collision with root package name */
    private final G f59499a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6266j<WorkSpec> f59500b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6264h<WorkSpec> f59501c;

    /* renamed from: d, reason: collision with root package name */
    private final S f59502d;

    /* renamed from: e, reason: collision with root package name */
    private final S f59503e;

    /* renamed from: f, reason: collision with root package name */
    private final S f59504f;

    /* renamed from: g, reason: collision with root package name */
    private final S f59505g;

    /* renamed from: h, reason: collision with root package name */
    private final S f59506h;

    /* renamed from: i, reason: collision with root package name */
    private final S f59507i;

    /* renamed from: j, reason: collision with root package name */
    private final S f59508j;

    /* renamed from: k, reason: collision with root package name */
    private final S f59509k;

    /* renamed from: l, reason: collision with root package name */
    private final S f59510l;

    /* renamed from: m, reason: collision with root package name */
    private final S f59511m;

    /* renamed from: n, reason: collision with root package name */
    private final S f59512n;

    /* renamed from: o, reason: collision with root package name */
    private final S f59513o;

    /* renamed from: p, reason: collision with root package name */
    private final S f59514p;

    /* renamed from: q, reason: collision with root package name */
    private final S f59515q;

    /* renamed from: r, reason: collision with root package name */
    private final S f59516r;

    class a extends S {
        a(G g10) {
            super(g10);
        }

        @Override // androidx.room.S
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    class b extends S {
        b(G g10) {
            super(g10);
        }

        @Override // androidx.room.S
        public String createQuery() {
            return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
        }
    }

    class c extends S {
        c(G g10) {
            super(g10);
        }

        @Override // androidx.room.S
        public String createQuery() {
            return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        }
    }

    /* renamed from: androidx.work.impl.model.d$d, reason: collision with other inner class name */
    class C1174d extends S {
        C1174d(G g10) {
            super(g10);
        }

        @Override // androidx.room.S
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    class e extends S {
        e(G g10) {
            super(g10);
        }

        @Override // androidx.room.S
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    class f extends S {
        f(G g10) {
            super(g10);
        }

        @Override // androidx.room.S
        public String createQuery() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    class g extends S {
        g(G g10) {
            super(g10);
        }

        @Override // androidx.room.S
        public String createQuery() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    class h extends S {
        h(G g10) {
            super(g10);
        }

        @Override // androidx.room.S
        public String createQuery() {
            return "UPDATE workspec SET stop_reason=? WHERE id=?";
        }
    }

    class i extends AbstractC6266j<WorkSpec> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.AbstractC6266j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(B4.g gVar, WorkSpec workSpec) {
            gVar.S1(1, workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String);
            s sVar = s.f40787a;
            gVar.C(2, s.k(workSpec.state));
            gVar.S1(3, workSpec.workerClassName);
            gVar.S1(4, workSpec.inputMergerClassName);
            gVar.y2(5, androidx.work.b.h(workSpec.input));
            gVar.y2(6, androidx.work.b.h(workSpec.output));
            gVar.C(7, workSpec.initialDelay);
            gVar.C(8, workSpec.intervalDuration);
            gVar.C(9, workSpec.flexDuration);
            gVar.C(10, workSpec.runAttemptCount);
            gVar.C(11, s.a(workSpec.backoffPolicy));
            gVar.C(12, workSpec.backoffDelayDuration);
            gVar.C(13, workSpec.lastEnqueueTime);
            gVar.C(14, workSpec.minimumRetentionDuration);
            gVar.C(15, workSpec.scheduleRequestedAt);
            gVar.C(16, workSpec.expedited ? 1L : 0L);
            gVar.C(17, s.i(workSpec.outOfQuotaPolicy));
            gVar.C(18, workSpec.getPeriodCount());
            gVar.C(19, workSpec.getGeneration());
            gVar.C(20, workSpec.getNextScheduleTimeOverride());
            gVar.C(21, workSpec.getNextScheduleTimeOverrideGeneration());
            gVar.C(22, workSpec.getStopReason());
            if (workSpec.getTraceTag() == null) {
                gVar.I(23);
            } else {
                gVar.S1(23, workSpec.getTraceTag());
            }
            C4356d c4356d = workSpec.constraints;
            gVar.C(24, s.h(c4356d.getRequiredNetworkType()));
            gVar.y2(25, s.c(c4356d.getRequiredNetworkRequestCompat()));
            gVar.C(26, c4356d.getRequiresCharging() ? 1L : 0L);
            gVar.C(27, c4356d.getRequiresDeviceIdle() ? 1L : 0L);
            gVar.C(28, c4356d.getRequiresBatteryNotLow() ? 1L : 0L);
            gVar.C(29, c4356d.getRequiresStorageNotLow() ? 1L : 0L);
            gVar.C(30, c4356d.getContentTriggerUpdateDelayMillis());
            gVar.C(31, c4356d.getContentTriggerMaxDelayMillis());
            gVar.y2(32, s.j(c4356d.c()));
        }

        i(G g10) {
            super(g10);
        }

        @Override // androidx.room.S
        protected String createQuery() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    class j implements Callable<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f59526a;

        j(N n10) {
            this.f59526a = n10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            Boolean boolValueOf;
            Cursor cursorG = C17824b.g(d.this.f59499a, this.f59526a, false, null);
            try {
                if (cursorG.moveToFirst()) {
                    boolValueOf = Boolean.valueOf(cursorG.getInt(0) != 0);
                } else {
                    boolValueOf = Boolean.FALSE;
                }
                cursorG.close();
                return boolValueOf;
            } catch (Throwable th2) {
                cursorG.close();
                throw th2;
            }
        }

        protected void finalize() {
            this.f59526a.h();
        }
    }

    class k extends AbstractC6264h<WorkSpec> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.AbstractC6264h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(B4.g gVar, WorkSpec workSpec) {
            gVar.S1(1, workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String);
            s sVar = s.f40787a;
            gVar.C(2, s.k(workSpec.state));
            gVar.S1(3, workSpec.workerClassName);
            gVar.S1(4, workSpec.inputMergerClassName);
            gVar.y2(5, androidx.work.b.h(workSpec.input));
            gVar.y2(6, androidx.work.b.h(workSpec.output));
            gVar.C(7, workSpec.initialDelay);
            gVar.C(8, workSpec.intervalDuration);
            gVar.C(9, workSpec.flexDuration);
            gVar.C(10, workSpec.runAttemptCount);
            gVar.C(11, s.a(workSpec.backoffPolicy));
            gVar.C(12, workSpec.backoffDelayDuration);
            gVar.C(13, workSpec.lastEnqueueTime);
            gVar.C(14, workSpec.minimumRetentionDuration);
            gVar.C(15, workSpec.scheduleRequestedAt);
            gVar.C(16, workSpec.expedited ? 1L : 0L);
            gVar.C(17, s.i(workSpec.outOfQuotaPolicy));
            gVar.C(18, workSpec.getPeriodCount());
            gVar.C(19, workSpec.getGeneration());
            gVar.C(20, workSpec.getNextScheduleTimeOverride());
            gVar.C(21, workSpec.getNextScheduleTimeOverrideGeneration());
            gVar.C(22, workSpec.getStopReason());
            if (workSpec.getTraceTag() == null) {
                gVar.I(23);
            } else {
                gVar.S1(23, workSpec.getTraceTag());
            }
            C4356d c4356d = workSpec.constraints;
            gVar.C(24, s.h(c4356d.getRequiredNetworkType()));
            gVar.y2(25, s.c(c4356d.getRequiredNetworkRequestCompat()));
            gVar.C(26, c4356d.getRequiresCharging() ? 1L : 0L);
            gVar.C(27, c4356d.getRequiresDeviceIdle() ? 1L : 0L);
            gVar.C(28, c4356d.getRequiresBatteryNotLow() ? 1L : 0L);
            gVar.C(29, c4356d.getRequiresStorageNotLow() ? 1L : 0L);
            gVar.C(30, c4356d.getContentTriggerUpdateDelayMillis());
            gVar.C(31, c4356d.getContentTriggerMaxDelayMillis());
            gVar.y2(32, s.j(c4356d.c()));
            gVar.S1(33, workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String);
        }

        k(G g10) {
            super(g10);
        }

        @Override // androidx.room.AbstractC6264h, androidx.room.S
        protected String createQuery() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }
    }

    class l extends S {
        l(G g10) {
            super(g10);
        }

        @Override // androidx.room.S
        public String createQuery() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    class m extends S {
        m(G g10) {
            super(g10);
        }

        @Override // androidx.room.S
        public String createQuery() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    class n extends S {
        n(G g10) {
            super(g10);
        }

        @Override // androidx.room.S
        public String createQuery() {
            return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        }
    }

    class o extends S {
        o(G g10) {
            super(g10);
        }

        @Override // androidx.room.S
        public String createQuery() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    class p extends S {
        p(G g10) {
            super(g10);
        }

        @Override // androidx.room.S
        public String createQuery() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    class q extends S {
        q(G g10) {
            super(g10);
        }

        @Override // androidx.room.S
        public String createQuery() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    class r extends S {
        r(G g10) {
            super(g10);
        }

        @Override // androidx.room.S
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    public static List<Class<?>> I() {
        return Collections.EMPTY_LIST;
    }

    @Override // androidx.work.impl.model.c
    public int A(String str) {
        this.f59499a.assertNotSuspendingTransaction();
        B4.g gVarAcquire = this.f59508j.acquire();
        gVarAcquire.S1(1, str);
        try {
            this.f59499a.beginTransaction();
            try {
                int iA0 = gVarAcquire.a0();
                this.f59499a.setTransactionSuccessful();
                return iA0;
            } finally {
                this.f59499a.endTransaction();
            }
        } finally {
            this.f59508j.release(gVarAcquire);
        }
    }

    @Override // androidx.work.impl.model.c
    public int B() {
        N nC = N.c("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", 0);
        this.f59499a.assertNotSuspendingTransaction();
        Cursor cursorG = C17824b.g(this.f59499a, nC, false, null);
        try {
            return cursorG.moveToFirst() ? cursorG.getInt(0) : 0;
        } finally {
            cursorG.close();
            nC.h();
        }
    }

    @Override // androidx.work.impl.model.c
    public void C(String str, int i10) {
        this.f59499a.assertNotSuspendingTransaction();
        B4.g gVarAcquire = this.f59511m.acquire();
        gVarAcquire.S1(1, str);
        gVarAcquire.C(2, i10);
        try {
            this.f59499a.beginTransaction();
            try {
                gVarAcquire.a0();
                this.f59499a.setTransactionSuccessful();
            } finally {
                this.f59499a.endTransaction();
            }
        } finally {
            this.f59511m.release(gVarAcquire);
        }
    }

    @Override // androidx.work.impl.model.c
    public void a(String str) {
        this.f59499a.assertNotSuspendingTransaction();
        B4.g gVarAcquire = this.f59502d.acquire();
        gVarAcquire.S1(1, str);
        try {
            this.f59499a.beginTransaction();
            try {
                gVarAcquire.a0();
                this.f59499a.setTransactionSuccessful();
            } finally {
                this.f59499a.endTransaction();
            }
        } finally {
            this.f59502d.release(gVarAcquire);
        }
    }

    @Override // androidx.work.impl.model.c
    public void b(WorkSpec workSpec) {
        this.f59499a.assertNotSuspendingTransaction();
        this.f59499a.beginTransaction();
        try {
            this.f59501c.handle(workSpec);
            this.f59499a.setTransactionSuccessful();
        } finally {
            this.f59499a.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.c
    public void c(String str) {
        this.f59499a.assertNotSuspendingTransaction();
        B4.g gVarAcquire = this.f59505g.acquire();
        gVarAcquire.S1(1, str);
        try {
            this.f59499a.beginTransaction();
            try {
                gVarAcquire.a0();
                this.f59499a.setTransactionSuccessful();
            } finally {
                this.f59499a.endTransaction();
            }
        } finally {
            this.f59505g.release(gVarAcquire);
        }
    }

    @Override // androidx.work.impl.model.c
    public List<WorkSpec> d(long j10) throws Throwable {
        N n10;
        int iE;
        int iE2;
        int iE3;
        int iE4;
        int iE5;
        int iE6;
        int iE7;
        int iE8;
        int iE9;
        int iE10;
        int iE11;
        int iE12;
        int iE13;
        int iE14;
        N nC = N.c("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        nC.C(1, j10);
        this.f59499a.assertNotSuspendingTransaction();
        Cursor cursorG = C17824b.g(this.f59499a, nC, false, null);
        try {
            iE = C17823a.e(cursorG, PreferencesHelper.PREF_ID);
            iE2 = C17823a.e(cursorG, "state");
            iE3 = C17823a.e(cursorG, "worker_class_name");
            iE4 = C17823a.e(cursorG, "input_merger_class_name");
            iE5 = C17823a.e(cursorG, "input");
            iE6 = C17823a.e(cursorG, "output");
            iE7 = C17823a.e(cursorG, "initial_delay");
            iE8 = C17823a.e(cursorG, "interval_duration");
            iE9 = C17823a.e(cursorG, "flex_duration");
            iE10 = C17823a.e(cursorG, "run_attempt_count");
            iE11 = C17823a.e(cursorG, "backoff_policy");
            iE12 = C17823a.e(cursorG, "backoff_delay_duration");
            iE13 = C17823a.e(cursorG, "last_enqueue_time");
            iE14 = C17823a.e(cursorG, "minimum_retention_duration");
            n10 = nC;
        } catch (Throwable th2) {
            th = th2;
            n10 = nC;
        }
        try {
            int iE15 = C17823a.e(cursorG, "schedule_requested_at");
            int iE16 = C17823a.e(cursorG, "run_in_foreground");
            int iE17 = C17823a.e(cursorG, "out_of_quota_policy");
            int iE18 = C17823a.e(cursorG, "period_count");
            int iE19 = C17823a.e(cursorG, "generation");
            int iE20 = C17823a.e(cursorG, "next_schedule_time_override");
            int iE21 = C17823a.e(cursorG, "next_schedule_time_override_generation");
            int iE22 = C17823a.e(cursorG, "stop_reason");
            int iE23 = C17823a.e(cursorG, "trace_tag");
            int iE24 = C17823a.e(cursorG, "required_network_type");
            int iE25 = C17823a.e(cursorG, "required_network_request");
            int iE26 = C17823a.e(cursorG, "requires_charging");
            int iE27 = C17823a.e(cursorG, "requires_device_idle");
            int iE28 = C17823a.e(cursorG, "requires_battery_not_low");
            int iE29 = C17823a.e(cursorG, "requires_storage_not_low");
            int iE30 = C17823a.e(cursorG, "trigger_content_update_delay");
            int iE31 = C17823a.e(cursorG, "trigger_max_content_delay");
            int iE32 = C17823a.e(cursorG, "content_uri_triggers");
            int i10 = iE14;
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                String string = cursorG.getString(iE);
                N.c cVarG = s.g(cursorG.getInt(iE2));
                String string2 = cursorG.getString(iE3);
                String string3 = cursorG.getString(iE4);
                androidx.work.b bVarB = androidx.work.b.b(cursorG.getBlob(iE5));
                androidx.work.b bVarB2 = androidx.work.b.b(cursorG.getBlob(iE6));
                long j11 = cursorG.getLong(iE7);
                long j12 = cursorG.getLong(iE8);
                long j13 = cursorG.getLong(iE9);
                int i11 = cursorG.getInt(iE10);
                EnumC4353a enumC4353aD = s.d(cursorG.getInt(iE11));
                long j14 = cursorG.getLong(iE12);
                long j15 = cursorG.getLong(iE13);
                int i12 = i10;
                long j16 = cursorG.getLong(i12);
                int i13 = iE;
                int i14 = iE15;
                long j17 = cursorG.getLong(i14);
                iE15 = i14;
                int i15 = iE16;
                boolean z10 = cursorG.getInt(i15) != 0;
                iE16 = i15;
                int i16 = iE17;
                E eF = s.f(cursorG.getInt(i16));
                iE17 = i16;
                int i17 = iE18;
                int i18 = cursorG.getInt(i17);
                iE18 = i17;
                int i19 = iE19;
                int i20 = cursorG.getInt(i19);
                iE19 = i19;
                int i21 = iE20;
                long j18 = cursorG.getLong(i21);
                iE20 = i21;
                int i22 = iE21;
                int i23 = cursorG.getInt(i22);
                iE21 = i22;
                int i24 = iE22;
                int i25 = cursorG.getInt(i24);
                iE22 = i24;
                int i26 = iE23;
                String string4 = cursorG.isNull(i26) ? null : cursorG.getString(i26);
                iE23 = i26;
                int i27 = iE24;
                EnumC4374w enumC4374wE = s.e(cursorG.getInt(i27));
                iE24 = i27;
                int i28 = iE25;
                NetworkRequestCompat networkRequestCompatL = s.l(cursorG.getBlob(i28));
                iE25 = i28;
                int i29 = iE26;
                boolean z11 = cursorG.getInt(i29) != 0;
                iE26 = i29;
                int i30 = iE27;
                boolean z12 = cursorG.getInt(i30) != 0;
                iE27 = i30;
                int i31 = iE28;
                boolean z13 = cursorG.getInt(i31) != 0;
                iE28 = i31;
                int i32 = iE29;
                boolean z14 = cursorG.getInt(i32) != 0;
                iE29 = i32;
                int i33 = iE30;
                long j19 = cursorG.getLong(i33);
                iE30 = i33;
                int i34 = iE31;
                long j20 = cursorG.getLong(i34);
                iE31 = i34;
                int i35 = iE32;
                iE32 = i35;
                arrayList.add(new WorkSpec(string, cVarG, string2, string3, bVarB, bVarB2, j11, j12, j13, new C4356d(networkRequestCompatL, enumC4374wE, z11, z12, z13, z14, j19, j20, s.b(cursorG.getBlob(i35))), i11, enumC4353aD, j14, j15, j16, j17, z10, eF, i18, i20, j18, i23, i25, string4));
                iE = i13;
                i10 = i12;
            }
            cursorG.close();
            n10.h();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            cursorG.close();
            n10.h();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.c
    public void e(String str, int i10) {
        this.f59499a.assertNotSuspendingTransaction();
        B4.g gVarAcquire = this.f59516r.acquire();
        gVarAcquire.C(1, i10);
        gVarAcquire.S1(2, str);
        try {
            this.f59499a.beginTransaction();
            try {
                gVarAcquire.a0();
                this.f59499a.setTransactionSuccessful();
            } finally {
                this.f59499a.endTransaction();
            }
        } finally {
            this.f59516r.release(gVarAcquire);
        }
    }

    @Override // androidx.work.impl.model.c
    public void f(WorkSpec workSpec) {
        this.f59499a.assertNotSuspendingTransaction();
        this.f59499a.beginTransaction();
        try {
            this.f59500b.insert((AbstractC6266j<WorkSpec>) workSpec);
            this.f59499a.setTransactionSuccessful();
        } finally {
            this.f59499a.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.c
    public List<WorkSpec> g() throws Throwable {
        androidx.room.N n10;
        int iE;
        int iE2;
        int iE3;
        int iE4;
        int iE5;
        int iE6;
        int iE7;
        int iE8;
        int iE9;
        int iE10;
        int iE11;
        int iE12;
        int iE13;
        int iE14;
        androidx.room.N nC = androidx.room.N.c("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f59499a.assertNotSuspendingTransaction();
        Cursor cursorG = C17824b.g(this.f59499a, nC, false, null);
        try {
            iE = C17823a.e(cursorG, PreferencesHelper.PREF_ID);
            iE2 = C17823a.e(cursorG, "state");
            iE3 = C17823a.e(cursorG, "worker_class_name");
            iE4 = C17823a.e(cursorG, "input_merger_class_name");
            iE5 = C17823a.e(cursorG, "input");
            iE6 = C17823a.e(cursorG, "output");
            iE7 = C17823a.e(cursorG, "initial_delay");
            iE8 = C17823a.e(cursorG, "interval_duration");
            iE9 = C17823a.e(cursorG, "flex_duration");
            iE10 = C17823a.e(cursorG, "run_attempt_count");
            iE11 = C17823a.e(cursorG, "backoff_policy");
            iE12 = C17823a.e(cursorG, "backoff_delay_duration");
            iE13 = C17823a.e(cursorG, "last_enqueue_time");
            iE14 = C17823a.e(cursorG, "minimum_retention_duration");
            n10 = nC;
        } catch (Throwable th2) {
            th = th2;
            n10 = nC;
        }
        try {
            int iE15 = C17823a.e(cursorG, "schedule_requested_at");
            int iE16 = C17823a.e(cursorG, "run_in_foreground");
            int iE17 = C17823a.e(cursorG, "out_of_quota_policy");
            int iE18 = C17823a.e(cursorG, "period_count");
            int iE19 = C17823a.e(cursorG, "generation");
            int iE20 = C17823a.e(cursorG, "next_schedule_time_override");
            int iE21 = C17823a.e(cursorG, "next_schedule_time_override_generation");
            int iE22 = C17823a.e(cursorG, "stop_reason");
            int iE23 = C17823a.e(cursorG, "trace_tag");
            int iE24 = C17823a.e(cursorG, "required_network_type");
            int iE25 = C17823a.e(cursorG, "required_network_request");
            int iE26 = C17823a.e(cursorG, "requires_charging");
            int iE27 = C17823a.e(cursorG, "requires_device_idle");
            int iE28 = C17823a.e(cursorG, "requires_battery_not_low");
            int iE29 = C17823a.e(cursorG, "requires_storage_not_low");
            int iE30 = C17823a.e(cursorG, "trigger_content_update_delay");
            int iE31 = C17823a.e(cursorG, "trigger_max_content_delay");
            int iE32 = C17823a.e(cursorG, "content_uri_triggers");
            int i10 = iE14;
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                String string = cursorG.getString(iE);
                N.c cVarG = s.g(cursorG.getInt(iE2));
                String string2 = cursorG.getString(iE3);
                String string3 = cursorG.getString(iE4);
                androidx.work.b bVarB = androidx.work.b.b(cursorG.getBlob(iE5));
                androidx.work.b bVarB2 = androidx.work.b.b(cursorG.getBlob(iE6));
                long j10 = cursorG.getLong(iE7);
                long j11 = cursorG.getLong(iE8);
                long j12 = cursorG.getLong(iE9);
                int i11 = cursorG.getInt(iE10);
                EnumC4353a enumC4353aD = s.d(cursorG.getInt(iE11));
                long j13 = cursorG.getLong(iE12);
                long j14 = cursorG.getLong(iE13);
                int i12 = i10;
                long j15 = cursorG.getLong(i12);
                int i13 = iE;
                int i14 = iE15;
                long j16 = cursorG.getLong(i14);
                iE15 = i14;
                int i15 = iE16;
                boolean z10 = cursorG.getInt(i15) != 0;
                iE16 = i15;
                int i16 = iE17;
                E eF = s.f(cursorG.getInt(i16));
                iE17 = i16;
                int i17 = iE18;
                int i18 = cursorG.getInt(i17);
                iE18 = i17;
                int i19 = iE19;
                int i20 = cursorG.getInt(i19);
                iE19 = i19;
                int i21 = iE20;
                long j17 = cursorG.getLong(i21);
                iE20 = i21;
                int i22 = iE21;
                int i23 = cursorG.getInt(i22);
                iE21 = i22;
                int i24 = iE22;
                int i25 = cursorG.getInt(i24);
                iE22 = i24;
                int i26 = iE23;
                String string4 = cursorG.isNull(i26) ? null : cursorG.getString(i26);
                iE23 = i26;
                int i27 = iE24;
                EnumC4374w enumC4374wE = s.e(cursorG.getInt(i27));
                iE24 = i27;
                int i28 = iE25;
                NetworkRequestCompat networkRequestCompatL = s.l(cursorG.getBlob(i28));
                iE25 = i28;
                int i29 = iE26;
                boolean z11 = cursorG.getInt(i29) != 0;
                iE26 = i29;
                int i30 = iE27;
                boolean z12 = cursorG.getInt(i30) != 0;
                iE27 = i30;
                int i31 = iE28;
                boolean z13 = cursorG.getInt(i31) != 0;
                iE28 = i31;
                int i32 = iE29;
                boolean z14 = cursorG.getInt(i32) != 0;
                iE29 = i32;
                int i33 = iE30;
                long j18 = cursorG.getLong(i33);
                iE30 = i33;
                int i34 = iE31;
                long j19 = cursorG.getLong(i34);
                iE31 = i34;
                int i35 = iE32;
                iE32 = i35;
                arrayList.add(new WorkSpec(string, cVarG, string2, string3, bVarB, bVarB2, j10, j11, j12, new C4356d(networkRequestCompatL, enumC4374wE, z11, z12, z13, z14, j18, j19, s.b(cursorG.getBlob(i35))), i11, enumC4353aD, j13, j14, j15, j16, z10, eF, i18, i20, j17, i23, i25, string4));
                iE = i13;
                i10 = i12;
            }
            cursorG.close();
            n10.h();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            cursorG.close();
            n10.h();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.c
    public List<String> h(String str) {
        androidx.room.N nC = androidx.room.N.c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        nC.S1(1, str);
        this.f59499a.assertNotSuspendingTransaction();
        Cursor cursorG = C17824b.g(this.f59499a, nC, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            nC.h();
        }
    }

    @Override // androidx.work.impl.model.c
    public N.c i(String str) {
        androidx.room.N nC = androidx.room.N.c("SELECT state FROM workspec WHERE id=?", 1);
        nC.S1(1, str);
        this.f59499a.assertNotSuspendingTransaction();
        N.c cVarG = null;
        Cursor cursorG = C17824b.g(this.f59499a, nC, false, null);
        try {
            if (cursorG.moveToFirst()) {
                Integer numValueOf = cursorG.isNull(0) ? null : Integer.valueOf(cursorG.getInt(0));
                if (numValueOf != null) {
                    s sVar = s.f40787a;
                    cVarG = s.g(numValueOf.intValue());
                }
            }
            return cVarG;
        } finally {
            cursorG.close();
            nC.h();
        }
    }

    @Override // androidx.work.impl.model.c
    public WorkSpec j(String str) throws Throwable {
        androidx.room.N n10;
        int iE;
        int iE2;
        int iE3;
        int iE4;
        int iE5;
        int iE6;
        int iE7;
        int iE8;
        int iE9;
        int iE10;
        int iE11;
        int iE12;
        int iE13;
        int iE14;
        WorkSpec workSpec;
        androidx.room.N nC = androidx.room.N.c("SELECT * FROM workspec WHERE id=?", 1);
        nC.S1(1, str);
        this.f59499a.assertNotSuspendingTransaction();
        Cursor cursorG = C17824b.g(this.f59499a, nC, false, null);
        try {
            iE = C17823a.e(cursorG, PreferencesHelper.PREF_ID);
            iE2 = C17823a.e(cursorG, "state");
            iE3 = C17823a.e(cursorG, "worker_class_name");
            iE4 = C17823a.e(cursorG, "input_merger_class_name");
            iE5 = C17823a.e(cursorG, "input");
            iE6 = C17823a.e(cursorG, "output");
            iE7 = C17823a.e(cursorG, "initial_delay");
            iE8 = C17823a.e(cursorG, "interval_duration");
            iE9 = C17823a.e(cursorG, "flex_duration");
            iE10 = C17823a.e(cursorG, "run_attempt_count");
            iE11 = C17823a.e(cursorG, "backoff_policy");
            iE12 = C17823a.e(cursorG, "backoff_delay_duration");
            iE13 = C17823a.e(cursorG, "last_enqueue_time");
            iE14 = C17823a.e(cursorG, "minimum_retention_duration");
            n10 = nC;
        } catch (Throwable th2) {
            th = th2;
            n10 = nC;
        }
        try {
            int iE15 = C17823a.e(cursorG, "schedule_requested_at");
            int iE16 = C17823a.e(cursorG, "run_in_foreground");
            int iE17 = C17823a.e(cursorG, "out_of_quota_policy");
            int iE18 = C17823a.e(cursorG, "period_count");
            int iE19 = C17823a.e(cursorG, "generation");
            int iE20 = C17823a.e(cursorG, "next_schedule_time_override");
            int iE21 = C17823a.e(cursorG, "next_schedule_time_override_generation");
            int iE22 = C17823a.e(cursorG, "stop_reason");
            int iE23 = C17823a.e(cursorG, "trace_tag");
            int iE24 = C17823a.e(cursorG, "required_network_type");
            int iE25 = C17823a.e(cursorG, "required_network_request");
            int iE26 = C17823a.e(cursorG, "requires_charging");
            int iE27 = C17823a.e(cursorG, "requires_device_idle");
            int iE28 = C17823a.e(cursorG, "requires_battery_not_low");
            int iE29 = C17823a.e(cursorG, "requires_storage_not_low");
            int iE30 = C17823a.e(cursorG, "trigger_content_update_delay");
            int iE31 = C17823a.e(cursorG, "trigger_max_content_delay");
            int iE32 = C17823a.e(cursorG, "content_uri_triggers");
            if (cursorG.moveToFirst()) {
                workSpec = new WorkSpec(cursorG.getString(iE), s.g(cursorG.getInt(iE2)), cursorG.getString(iE3), cursorG.getString(iE4), androidx.work.b.b(cursorG.getBlob(iE5)), androidx.work.b.b(cursorG.getBlob(iE6)), cursorG.getLong(iE7), cursorG.getLong(iE8), cursorG.getLong(iE9), new C4356d(s.l(cursorG.getBlob(iE25)), s.e(cursorG.getInt(iE24)), cursorG.getInt(iE26) != 0, cursorG.getInt(iE27) != 0, cursorG.getInt(iE28) != 0, cursorG.getInt(iE29) != 0, cursorG.getLong(iE30), cursorG.getLong(iE31), s.b(cursorG.getBlob(iE32))), cursorG.getInt(iE10), s.d(cursorG.getInt(iE11)), cursorG.getLong(iE12), cursorG.getLong(iE13), cursorG.getLong(iE14), cursorG.getLong(iE15), cursorG.getInt(iE16) != 0, s.f(cursorG.getInt(iE17)), cursorG.getInt(iE18), cursorG.getInt(iE19), cursorG.getLong(iE20), cursorG.getInt(iE21), cursorG.getInt(iE22), cursorG.isNull(iE23) ? null : cursorG.getString(iE23));
            } else {
                workSpec = null;
            }
            cursorG.close();
            n10.h();
            return workSpec;
        } catch (Throwable th3) {
            th = th3;
            cursorG.close();
            n10.h();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.c
    public int k(String str) {
        this.f59499a.assertNotSuspendingTransaction();
        B4.g gVarAcquire = this.f59504f.acquire();
        gVarAcquire.S1(1, str);
        try {
            this.f59499a.beginTransaction();
            try {
                int iA0 = gVarAcquire.a0();
                this.f59499a.setTransactionSuccessful();
                return iA0;
            } finally {
                this.f59499a.endTransaction();
            }
        } finally {
            this.f59504f.release(gVarAcquire);
        }
    }

    @Override // androidx.work.impl.model.c
    public List<String> l(String str) {
        androidx.room.N nC = androidx.room.N.c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        nC.S1(1, str);
        this.f59499a.assertNotSuspendingTransaction();
        Cursor cursorG = C17824b.g(this.f59499a, nC, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            nC.h();
        }
    }

    @Override // androidx.work.impl.model.c
    public List<androidx.work.b> m(String str) {
        androidx.room.N nC = androidx.room.N.c("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        nC.S1(1, str);
        this.f59499a.assertNotSuspendingTransaction();
        Cursor cursorG = C17824b.g(this.f59499a, nC, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(androidx.work.b.b(cursorG.getBlob(0)));
            }
            return arrayList;
        } finally {
            cursorG.close();
            nC.h();
        }
    }

    @Override // androidx.work.impl.model.c
    public List<WorkSpec> n(int i10) throws Throwable {
        androidx.room.N n10;
        int iE;
        int iE2;
        int iE3;
        int iE4;
        int iE5;
        int iE6;
        int iE7;
        int iE8;
        int iE9;
        int iE10;
        int iE11;
        int iE12;
        int iE13;
        int iE14;
        androidx.room.N nC = androidx.room.N.c("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        nC.C(1, i10);
        this.f59499a.assertNotSuspendingTransaction();
        Cursor cursorG = C17824b.g(this.f59499a, nC, false, null);
        try {
            iE = C17823a.e(cursorG, PreferencesHelper.PREF_ID);
            iE2 = C17823a.e(cursorG, "state");
            iE3 = C17823a.e(cursorG, "worker_class_name");
            iE4 = C17823a.e(cursorG, "input_merger_class_name");
            iE5 = C17823a.e(cursorG, "input");
            iE6 = C17823a.e(cursorG, "output");
            iE7 = C17823a.e(cursorG, "initial_delay");
            iE8 = C17823a.e(cursorG, "interval_duration");
            iE9 = C17823a.e(cursorG, "flex_duration");
            iE10 = C17823a.e(cursorG, "run_attempt_count");
            iE11 = C17823a.e(cursorG, "backoff_policy");
            iE12 = C17823a.e(cursorG, "backoff_delay_duration");
            iE13 = C17823a.e(cursorG, "last_enqueue_time");
            iE14 = C17823a.e(cursorG, "minimum_retention_duration");
            n10 = nC;
        } catch (Throwable th2) {
            th = th2;
            n10 = nC;
        }
        try {
            int iE15 = C17823a.e(cursorG, "schedule_requested_at");
            int iE16 = C17823a.e(cursorG, "run_in_foreground");
            int iE17 = C17823a.e(cursorG, "out_of_quota_policy");
            int iE18 = C17823a.e(cursorG, "period_count");
            int iE19 = C17823a.e(cursorG, "generation");
            int iE20 = C17823a.e(cursorG, "next_schedule_time_override");
            int iE21 = C17823a.e(cursorG, "next_schedule_time_override_generation");
            int iE22 = C17823a.e(cursorG, "stop_reason");
            int iE23 = C17823a.e(cursorG, "trace_tag");
            int iE24 = C17823a.e(cursorG, "required_network_type");
            int iE25 = C17823a.e(cursorG, "required_network_request");
            int iE26 = C17823a.e(cursorG, "requires_charging");
            int iE27 = C17823a.e(cursorG, "requires_device_idle");
            int iE28 = C17823a.e(cursorG, "requires_battery_not_low");
            int iE29 = C17823a.e(cursorG, "requires_storage_not_low");
            int iE30 = C17823a.e(cursorG, "trigger_content_update_delay");
            int iE31 = C17823a.e(cursorG, "trigger_max_content_delay");
            int iE32 = C17823a.e(cursorG, "content_uri_triggers");
            int i11 = iE14;
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                String string = cursorG.getString(iE);
                N.c cVarG = s.g(cursorG.getInt(iE2));
                String string2 = cursorG.getString(iE3);
                String string3 = cursorG.getString(iE4);
                androidx.work.b bVarB = androidx.work.b.b(cursorG.getBlob(iE5));
                androidx.work.b bVarB2 = androidx.work.b.b(cursorG.getBlob(iE6));
                long j10 = cursorG.getLong(iE7);
                long j11 = cursorG.getLong(iE8);
                long j12 = cursorG.getLong(iE9);
                int i12 = cursorG.getInt(iE10);
                EnumC4353a enumC4353aD = s.d(cursorG.getInt(iE11));
                long j13 = cursorG.getLong(iE12);
                long j14 = cursorG.getLong(iE13);
                int i13 = i11;
                long j15 = cursorG.getLong(i13);
                int i14 = iE;
                int i15 = iE15;
                long j16 = cursorG.getLong(i15);
                iE15 = i15;
                int i16 = iE16;
                boolean z10 = cursorG.getInt(i16) != 0;
                iE16 = i16;
                int i17 = iE17;
                E eF = s.f(cursorG.getInt(i17));
                iE17 = i17;
                int i18 = iE18;
                int i19 = cursorG.getInt(i18);
                iE18 = i18;
                int i20 = iE19;
                int i21 = cursorG.getInt(i20);
                iE19 = i20;
                int i22 = iE20;
                long j17 = cursorG.getLong(i22);
                iE20 = i22;
                int i23 = iE21;
                int i24 = cursorG.getInt(i23);
                iE21 = i23;
                int i25 = iE22;
                int i26 = cursorG.getInt(i25);
                iE22 = i25;
                int i27 = iE23;
                String string4 = cursorG.isNull(i27) ? null : cursorG.getString(i27);
                iE23 = i27;
                int i28 = iE24;
                EnumC4374w enumC4374wE = s.e(cursorG.getInt(i28));
                iE24 = i28;
                int i29 = iE25;
                NetworkRequestCompat networkRequestCompatL = s.l(cursorG.getBlob(i29));
                iE25 = i29;
                int i30 = iE26;
                boolean z11 = cursorG.getInt(i30) != 0;
                iE26 = i30;
                int i31 = iE27;
                boolean z12 = cursorG.getInt(i31) != 0;
                iE27 = i31;
                int i32 = iE28;
                boolean z13 = cursorG.getInt(i32) != 0;
                iE28 = i32;
                int i33 = iE29;
                boolean z14 = cursorG.getInt(i33) != 0;
                iE29 = i33;
                int i34 = iE30;
                long j18 = cursorG.getLong(i34);
                iE30 = i34;
                int i35 = iE31;
                long j19 = cursorG.getLong(i35);
                iE31 = i35;
                int i36 = iE32;
                iE32 = i36;
                arrayList.add(new WorkSpec(string, cVarG, string2, string3, bVarB, bVarB2, j10, j11, j12, new C4356d(networkRequestCompatL, enumC4374wE, z11, z12, z13, z14, j18, j19, s.b(cursorG.getBlob(i36))), i12, enumC4353aD, j13, j14, j15, j16, z10, eF, i19, i21, j17, i24, i26, string4));
                iE = i14;
                i11 = i13;
            }
            cursorG.close();
            n10.h();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            cursorG.close();
            n10.h();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.c
    public int o() {
        this.f59499a.assertNotSuspendingTransaction();
        B4.g gVarAcquire = this.f59513o.acquire();
        try {
            this.f59499a.beginTransaction();
            try {
                int iA0 = gVarAcquire.a0();
                this.f59499a.setTransactionSuccessful();
                return iA0;
            } finally {
                this.f59499a.endTransaction();
            }
        } finally {
            this.f59513o.release(gVarAcquire);
        }
    }

    @Override // androidx.work.impl.model.c
    public int p(String str, long j10) {
        this.f59499a.assertNotSuspendingTransaction();
        B4.g gVarAcquire = this.f59512n.acquire();
        gVarAcquire.C(1, j10);
        gVarAcquire.S1(2, str);
        try {
            this.f59499a.beginTransaction();
            try {
                int iA0 = gVarAcquire.a0();
                this.f59499a.setTransactionSuccessful();
                return iA0;
            } finally {
                this.f59499a.endTransaction();
            }
        } finally {
            this.f59512n.release(gVarAcquire);
        }
    }

    @Override // androidx.work.impl.model.c
    public List<WorkSpec.IdAndState> q(String str) {
        androidx.room.N nC = androidx.room.N.c("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        nC.S1(1, str);
        this.f59499a.assertNotSuspendingTransaction();
        Cursor cursorG = C17824b.g(this.f59499a, nC, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(new WorkSpec.IdAndState(cursorG.getString(0), s.g(cursorG.getInt(1))));
            }
            return arrayList;
        } finally {
            cursorG.close();
            nC.h();
        }
    }

    @Override // androidx.work.impl.model.c
    public InterfaceC16561f<Boolean> r() {
        return C6260d.a(this.f59499a, false, new String[]{"workspec"}, new j(androidx.room.N.c("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0)));
    }

    @Override // androidx.work.impl.model.c
    public List<WorkSpec> s(int i10) throws Throwable {
        androidx.room.N n10;
        int iE;
        int iE2;
        int iE3;
        int iE4;
        int iE5;
        int iE6;
        int iE7;
        int iE8;
        int iE9;
        int iE10;
        int iE11;
        int iE12;
        int iE13;
        int iE14;
        androidx.room.N nC = androidx.room.N.c("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
        nC.C(1, i10);
        this.f59499a.assertNotSuspendingTransaction();
        Cursor cursorG = C17824b.g(this.f59499a, nC, false, null);
        try {
            iE = C17823a.e(cursorG, PreferencesHelper.PREF_ID);
            iE2 = C17823a.e(cursorG, "state");
            iE3 = C17823a.e(cursorG, "worker_class_name");
            iE4 = C17823a.e(cursorG, "input_merger_class_name");
            iE5 = C17823a.e(cursorG, "input");
            iE6 = C17823a.e(cursorG, "output");
            iE7 = C17823a.e(cursorG, "initial_delay");
            iE8 = C17823a.e(cursorG, "interval_duration");
            iE9 = C17823a.e(cursorG, "flex_duration");
            iE10 = C17823a.e(cursorG, "run_attempt_count");
            iE11 = C17823a.e(cursorG, "backoff_policy");
            iE12 = C17823a.e(cursorG, "backoff_delay_duration");
            iE13 = C17823a.e(cursorG, "last_enqueue_time");
            iE14 = C17823a.e(cursorG, "minimum_retention_duration");
            n10 = nC;
        } catch (Throwable th2) {
            th = th2;
            n10 = nC;
        }
        try {
            int iE15 = C17823a.e(cursorG, "schedule_requested_at");
            int iE16 = C17823a.e(cursorG, "run_in_foreground");
            int iE17 = C17823a.e(cursorG, "out_of_quota_policy");
            int iE18 = C17823a.e(cursorG, "period_count");
            int iE19 = C17823a.e(cursorG, "generation");
            int iE20 = C17823a.e(cursorG, "next_schedule_time_override");
            int iE21 = C17823a.e(cursorG, "next_schedule_time_override_generation");
            int iE22 = C17823a.e(cursorG, "stop_reason");
            int iE23 = C17823a.e(cursorG, "trace_tag");
            int iE24 = C17823a.e(cursorG, "required_network_type");
            int iE25 = C17823a.e(cursorG, "required_network_request");
            int iE26 = C17823a.e(cursorG, "requires_charging");
            int iE27 = C17823a.e(cursorG, "requires_device_idle");
            int iE28 = C17823a.e(cursorG, "requires_battery_not_low");
            int iE29 = C17823a.e(cursorG, "requires_storage_not_low");
            int iE30 = C17823a.e(cursorG, "trigger_content_update_delay");
            int iE31 = C17823a.e(cursorG, "trigger_max_content_delay");
            int iE32 = C17823a.e(cursorG, "content_uri_triggers");
            int i11 = iE14;
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                String string = cursorG.getString(iE);
                N.c cVarG = s.g(cursorG.getInt(iE2));
                String string2 = cursorG.getString(iE3);
                String string3 = cursorG.getString(iE4);
                androidx.work.b bVarB = androidx.work.b.b(cursorG.getBlob(iE5));
                androidx.work.b bVarB2 = androidx.work.b.b(cursorG.getBlob(iE6));
                long j10 = cursorG.getLong(iE7);
                long j11 = cursorG.getLong(iE8);
                long j12 = cursorG.getLong(iE9);
                int i12 = cursorG.getInt(iE10);
                EnumC4353a enumC4353aD = s.d(cursorG.getInt(iE11));
                long j13 = cursorG.getLong(iE12);
                long j14 = cursorG.getLong(iE13);
                int i13 = i11;
                long j15 = cursorG.getLong(i13);
                int i14 = iE;
                int i15 = iE15;
                long j16 = cursorG.getLong(i15);
                iE15 = i15;
                int i16 = iE16;
                boolean z10 = cursorG.getInt(i16) != 0;
                iE16 = i16;
                int i17 = iE17;
                E eF = s.f(cursorG.getInt(i17));
                iE17 = i17;
                int i18 = iE18;
                int i19 = cursorG.getInt(i18);
                iE18 = i18;
                int i20 = iE19;
                int i21 = cursorG.getInt(i20);
                iE19 = i20;
                int i22 = iE20;
                long j17 = cursorG.getLong(i22);
                iE20 = i22;
                int i23 = iE21;
                int i24 = cursorG.getInt(i23);
                iE21 = i23;
                int i25 = iE22;
                int i26 = cursorG.getInt(i25);
                iE22 = i25;
                int i27 = iE23;
                String string4 = cursorG.isNull(i27) ? null : cursorG.getString(i27);
                iE23 = i27;
                int i28 = iE24;
                EnumC4374w enumC4374wE = s.e(cursorG.getInt(i28));
                iE24 = i28;
                int i29 = iE25;
                NetworkRequestCompat networkRequestCompatL = s.l(cursorG.getBlob(i29));
                iE25 = i29;
                int i30 = iE26;
                boolean z11 = cursorG.getInt(i30) != 0;
                iE26 = i30;
                int i31 = iE27;
                boolean z12 = cursorG.getInt(i31) != 0;
                iE27 = i31;
                int i32 = iE28;
                boolean z13 = cursorG.getInt(i32) != 0;
                iE28 = i32;
                int i33 = iE29;
                boolean z14 = cursorG.getInt(i33) != 0;
                iE29 = i33;
                int i34 = iE30;
                long j18 = cursorG.getLong(i34);
                iE30 = i34;
                int i35 = iE31;
                long j19 = cursorG.getLong(i35);
                iE31 = i35;
                int i36 = iE32;
                iE32 = i36;
                arrayList.add(new WorkSpec(string, cVarG, string2, string3, bVarB, bVarB2, j10, j11, j12, new C4356d(networkRequestCompatL, enumC4374wE, z11, z12, z13, z14, j18, j19, s.b(cursorG.getBlob(i36))), i12, enumC4353aD, j13, j14, j15, j16, z10, eF, i19, i21, j17, i24, i26, string4));
                iE = i14;
                i11 = i13;
            }
            cursorG.close();
            n10.h();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            cursorG.close();
            n10.h();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.c
    public void t(String str, androidx.work.b bVar) {
        this.f59499a.assertNotSuspendingTransaction();
        B4.g gVarAcquire = this.f59506h.acquire();
        gVarAcquire.y2(1, androidx.work.b.h(bVar));
        gVarAcquire.S1(2, str);
        try {
            this.f59499a.beginTransaction();
            try {
                gVarAcquire.a0();
                this.f59499a.setTransactionSuccessful();
            } finally {
                this.f59499a.endTransaction();
            }
        } finally {
            this.f59506h.release(gVarAcquire);
        }
    }

    @Override // androidx.work.impl.model.c
    public void u(String str, long j10) {
        this.f59499a.assertNotSuspendingTransaction();
        B4.g gVarAcquire = this.f59507i.acquire();
        gVarAcquire.C(1, j10);
        gVarAcquire.S1(2, str);
        try {
            this.f59499a.beginTransaction();
            try {
                gVarAcquire.a0();
                this.f59499a.setTransactionSuccessful();
            } finally {
                this.f59499a.endTransaction();
            }
        } finally {
            this.f59507i.release(gVarAcquire);
        }
    }

    @Override // androidx.work.impl.model.c
    public List<WorkSpec> v() throws Throwable {
        androidx.room.N n10;
        int iE;
        int iE2;
        int iE3;
        int iE4;
        int iE5;
        int iE6;
        int iE7;
        int iE8;
        int iE9;
        int iE10;
        int iE11;
        int iE12;
        int iE13;
        int iE14;
        androidx.room.N nC = androidx.room.N.c("SELECT * FROM workspec WHERE state=1", 0);
        this.f59499a.assertNotSuspendingTransaction();
        Cursor cursorG = C17824b.g(this.f59499a, nC, false, null);
        try {
            iE = C17823a.e(cursorG, PreferencesHelper.PREF_ID);
            iE2 = C17823a.e(cursorG, "state");
            iE3 = C17823a.e(cursorG, "worker_class_name");
            iE4 = C17823a.e(cursorG, "input_merger_class_name");
            iE5 = C17823a.e(cursorG, "input");
            iE6 = C17823a.e(cursorG, "output");
            iE7 = C17823a.e(cursorG, "initial_delay");
            iE8 = C17823a.e(cursorG, "interval_duration");
            iE9 = C17823a.e(cursorG, "flex_duration");
            iE10 = C17823a.e(cursorG, "run_attempt_count");
            iE11 = C17823a.e(cursorG, "backoff_policy");
            iE12 = C17823a.e(cursorG, "backoff_delay_duration");
            iE13 = C17823a.e(cursorG, "last_enqueue_time");
            iE14 = C17823a.e(cursorG, "minimum_retention_duration");
            n10 = nC;
        } catch (Throwable th2) {
            th = th2;
            n10 = nC;
        }
        try {
            int iE15 = C17823a.e(cursorG, "schedule_requested_at");
            int iE16 = C17823a.e(cursorG, "run_in_foreground");
            int iE17 = C17823a.e(cursorG, "out_of_quota_policy");
            int iE18 = C17823a.e(cursorG, "period_count");
            int iE19 = C17823a.e(cursorG, "generation");
            int iE20 = C17823a.e(cursorG, "next_schedule_time_override");
            int iE21 = C17823a.e(cursorG, "next_schedule_time_override_generation");
            int iE22 = C17823a.e(cursorG, "stop_reason");
            int iE23 = C17823a.e(cursorG, "trace_tag");
            int iE24 = C17823a.e(cursorG, "required_network_type");
            int iE25 = C17823a.e(cursorG, "required_network_request");
            int iE26 = C17823a.e(cursorG, "requires_charging");
            int iE27 = C17823a.e(cursorG, "requires_device_idle");
            int iE28 = C17823a.e(cursorG, "requires_battery_not_low");
            int iE29 = C17823a.e(cursorG, "requires_storage_not_low");
            int iE30 = C17823a.e(cursorG, "trigger_content_update_delay");
            int iE31 = C17823a.e(cursorG, "trigger_max_content_delay");
            int iE32 = C17823a.e(cursorG, "content_uri_triggers");
            int i10 = iE14;
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                String string = cursorG.getString(iE);
                N.c cVarG = s.g(cursorG.getInt(iE2));
                String string2 = cursorG.getString(iE3);
                String string3 = cursorG.getString(iE4);
                androidx.work.b bVarB = androidx.work.b.b(cursorG.getBlob(iE5));
                androidx.work.b bVarB2 = androidx.work.b.b(cursorG.getBlob(iE6));
                long j10 = cursorG.getLong(iE7);
                long j11 = cursorG.getLong(iE8);
                long j12 = cursorG.getLong(iE9);
                int i11 = cursorG.getInt(iE10);
                EnumC4353a enumC4353aD = s.d(cursorG.getInt(iE11));
                long j13 = cursorG.getLong(iE12);
                long j14 = cursorG.getLong(iE13);
                int i12 = i10;
                long j15 = cursorG.getLong(i12);
                int i13 = iE;
                int i14 = iE15;
                long j16 = cursorG.getLong(i14);
                iE15 = i14;
                int i15 = iE16;
                boolean z10 = cursorG.getInt(i15) != 0;
                iE16 = i15;
                int i16 = iE17;
                E eF = s.f(cursorG.getInt(i16));
                iE17 = i16;
                int i17 = iE18;
                int i18 = cursorG.getInt(i17);
                iE18 = i17;
                int i19 = iE19;
                int i20 = cursorG.getInt(i19);
                iE19 = i19;
                int i21 = iE20;
                long j17 = cursorG.getLong(i21);
                iE20 = i21;
                int i22 = iE21;
                int i23 = cursorG.getInt(i22);
                iE21 = i22;
                int i24 = iE22;
                int i25 = cursorG.getInt(i24);
                iE22 = i24;
                int i26 = iE23;
                String string4 = cursorG.isNull(i26) ? null : cursorG.getString(i26);
                iE23 = i26;
                int i27 = iE24;
                EnumC4374w enumC4374wE = s.e(cursorG.getInt(i27));
                iE24 = i27;
                int i28 = iE25;
                NetworkRequestCompat networkRequestCompatL = s.l(cursorG.getBlob(i28));
                iE25 = i28;
                int i29 = iE26;
                boolean z11 = cursorG.getInt(i29) != 0;
                iE26 = i29;
                int i30 = iE27;
                boolean z12 = cursorG.getInt(i30) != 0;
                iE27 = i30;
                int i31 = iE28;
                boolean z13 = cursorG.getInt(i31) != 0;
                iE28 = i31;
                int i32 = iE29;
                boolean z14 = cursorG.getInt(i32) != 0;
                iE29 = i32;
                int i33 = iE30;
                long j18 = cursorG.getLong(i33);
                iE30 = i33;
                int i34 = iE31;
                long j19 = cursorG.getLong(i34);
                iE31 = i34;
                int i35 = iE32;
                iE32 = i35;
                arrayList.add(new WorkSpec(string, cVarG, string2, string3, bVarB, bVarB2, j10, j11, j12, new C4356d(networkRequestCompatL, enumC4374wE, z11, z12, z13, z14, j18, j19, s.b(cursorG.getBlob(i35))), i11, enumC4353aD, j13, j14, j15, j16, z10, eF, i18, i20, j17, i23, i25, string4));
                iE = i13;
                i10 = i12;
            }
            cursorG.close();
            n10.h();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            cursorG.close();
            n10.h();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.c
    public int w(N.c cVar, String str) {
        this.f59499a.assertNotSuspendingTransaction();
        B4.g gVarAcquire = this.f59503e.acquire();
        gVarAcquire.C(1, s.k(cVar));
        gVarAcquire.S1(2, str);
        try {
            this.f59499a.beginTransaction();
            try {
                int iA0 = gVarAcquire.a0();
                this.f59499a.setTransactionSuccessful();
                return iA0;
            } finally {
                this.f59499a.endTransaction();
            }
        } finally {
            this.f59503e.release(gVarAcquire);
        }
    }

    @Override // androidx.work.impl.model.c
    public List<WorkSpec> x() throws Throwable {
        androidx.room.N n10;
        int iE;
        int iE2;
        int iE3;
        int iE4;
        int iE5;
        int iE6;
        int iE7;
        int iE8;
        int iE9;
        int iE10;
        int iE11;
        int iE12;
        int iE13;
        int iE14;
        androidx.room.N nC = androidx.room.N.c("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
        this.f59499a.assertNotSuspendingTransaction();
        Cursor cursorG = C17824b.g(this.f59499a, nC, false, null);
        try {
            iE = C17823a.e(cursorG, PreferencesHelper.PREF_ID);
            iE2 = C17823a.e(cursorG, "state");
            iE3 = C17823a.e(cursorG, "worker_class_name");
            iE4 = C17823a.e(cursorG, "input_merger_class_name");
            iE5 = C17823a.e(cursorG, "input");
            iE6 = C17823a.e(cursorG, "output");
            iE7 = C17823a.e(cursorG, "initial_delay");
            iE8 = C17823a.e(cursorG, "interval_duration");
            iE9 = C17823a.e(cursorG, "flex_duration");
            iE10 = C17823a.e(cursorG, "run_attempt_count");
            iE11 = C17823a.e(cursorG, "backoff_policy");
            iE12 = C17823a.e(cursorG, "backoff_delay_duration");
            iE13 = C17823a.e(cursorG, "last_enqueue_time");
            iE14 = C17823a.e(cursorG, "minimum_retention_duration");
            n10 = nC;
        } catch (Throwable th2) {
            th = th2;
            n10 = nC;
        }
        try {
            int iE15 = C17823a.e(cursorG, "schedule_requested_at");
            int iE16 = C17823a.e(cursorG, "run_in_foreground");
            int iE17 = C17823a.e(cursorG, "out_of_quota_policy");
            int iE18 = C17823a.e(cursorG, "period_count");
            int iE19 = C17823a.e(cursorG, "generation");
            int iE20 = C17823a.e(cursorG, "next_schedule_time_override");
            int iE21 = C17823a.e(cursorG, "next_schedule_time_override_generation");
            int iE22 = C17823a.e(cursorG, "stop_reason");
            int iE23 = C17823a.e(cursorG, "trace_tag");
            int iE24 = C17823a.e(cursorG, "required_network_type");
            int iE25 = C17823a.e(cursorG, "required_network_request");
            int iE26 = C17823a.e(cursorG, "requires_charging");
            int iE27 = C17823a.e(cursorG, "requires_device_idle");
            int iE28 = C17823a.e(cursorG, "requires_battery_not_low");
            int iE29 = C17823a.e(cursorG, "requires_storage_not_low");
            int iE30 = C17823a.e(cursorG, "trigger_content_update_delay");
            int iE31 = C17823a.e(cursorG, "trigger_max_content_delay");
            int iE32 = C17823a.e(cursorG, "content_uri_triggers");
            int i10 = iE14;
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                String string = cursorG.getString(iE);
                N.c cVarG = s.g(cursorG.getInt(iE2));
                String string2 = cursorG.getString(iE3);
                String string3 = cursorG.getString(iE4);
                androidx.work.b bVarB = androidx.work.b.b(cursorG.getBlob(iE5));
                androidx.work.b bVarB2 = androidx.work.b.b(cursorG.getBlob(iE6));
                long j10 = cursorG.getLong(iE7);
                long j11 = cursorG.getLong(iE8);
                long j12 = cursorG.getLong(iE9);
                int i11 = cursorG.getInt(iE10);
                EnumC4353a enumC4353aD = s.d(cursorG.getInt(iE11));
                long j13 = cursorG.getLong(iE12);
                long j14 = cursorG.getLong(iE13);
                int i12 = i10;
                long j15 = cursorG.getLong(i12);
                int i13 = iE;
                int i14 = iE15;
                long j16 = cursorG.getLong(i14);
                iE15 = i14;
                int i15 = iE16;
                boolean z10 = cursorG.getInt(i15) != 0;
                iE16 = i15;
                int i16 = iE17;
                E eF = s.f(cursorG.getInt(i16));
                iE17 = i16;
                int i17 = iE18;
                int i18 = cursorG.getInt(i17);
                iE18 = i17;
                int i19 = iE19;
                int i20 = cursorG.getInt(i19);
                iE19 = i19;
                int i21 = iE20;
                long j17 = cursorG.getLong(i21);
                iE20 = i21;
                int i22 = iE21;
                int i23 = cursorG.getInt(i22);
                iE21 = i22;
                int i24 = iE22;
                int i25 = cursorG.getInt(i24);
                iE22 = i24;
                int i26 = iE23;
                String string4 = cursorG.isNull(i26) ? null : cursorG.getString(i26);
                iE23 = i26;
                int i27 = iE24;
                EnumC4374w enumC4374wE = s.e(cursorG.getInt(i27));
                iE24 = i27;
                int i28 = iE25;
                NetworkRequestCompat networkRequestCompatL = s.l(cursorG.getBlob(i28));
                iE25 = i28;
                int i29 = iE26;
                boolean z11 = cursorG.getInt(i29) != 0;
                iE26 = i29;
                int i30 = iE27;
                boolean z12 = cursorG.getInt(i30) != 0;
                iE27 = i30;
                int i31 = iE28;
                boolean z13 = cursorG.getInt(i31) != 0;
                iE28 = i31;
                int i32 = iE29;
                boolean z14 = cursorG.getInt(i32) != 0;
                iE29 = i32;
                int i33 = iE30;
                long j18 = cursorG.getLong(i33);
                iE30 = i33;
                int i34 = iE31;
                long j19 = cursorG.getLong(i34);
                iE31 = i34;
                int i35 = iE32;
                iE32 = i35;
                arrayList.add(new WorkSpec(string, cVarG, string2, string3, bVarB, bVarB2, j10, j11, j12, new C4356d(networkRequestCompatL, enumC4374wE, z11, z12, z13, z14, j18, j19, s.b(cursorG.getBlob(i35))), i11, enumC4353aD, j13, j14, j15, j16, z10, eF, i18, i20, j17, i23, i25, string4));
                iE = i13;
                i10 = i12;
            }
            cursorG.close();
            n10.h();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            cursorG.close();
            n10.h();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.c
    public int y(String str) {
        this.f59499a.assertNotSuspendingTransaction();
        B4.g gVarAcquire = this.f59509k.acquire();
        gVarAcquire.S1(1, str);
        try {
            this.f59499a.beginTransaction();
            try {
                int iA0 = gVarAcquire.a0();
                this.f59499a.setTransactionSuccessful();
                return iA0;
            } finally {
                this.f59499a.endTransaction();
            }
        } finally {
            this.f59509k.release(gVarAcquire);
        }
    }

    @Override // androidx.work.impl.model.c
    public List<WorkSpec.WorkInfoPojo> z(String str) {
        androidx.room.N nC = androidx.room.N.c("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        nC.S1(1, str);
        this.f59499a.assertNotSuspendingTransaction();
        this.f59499a.beginTransaction();
        try {
            Cursor cursorG = C17824b.g(this.f59499a, nC, true, null);
            try {
                HashMap<String, ArrayList<String>> map = new HashMap<>();
                HashMap<String, ArrayList<androidx.work.b>> map2 = new HashMap<>();
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(0);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList<>());
                    }
                    String string2 = cursorG.getString(0);
                    if (!map2.containsKey(string2)) {
                        map2.put(string2, new ArrayList<>());
                    }
                }
                cursorG.moveToPosition(-1);
                G(map);
                F(map2);
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string3 = cursorG.getString(0);
                    N.c cVarG = s.g(cursorG.getInt(1));
                    androidx.work.b bVarB = androidx.work.b.b(cursorG.getBlob(2));
                    int i10 = cursorG.getInt(3);
                    int i11 = cursorG.getInt(4);
                    arrayList.add(new WorkSpec.WorkInfoPojo(string3, cVarG, bVarB, cursorG.getLong(14), cursorG.getLong(15), cursorG.getLong(16), new C4356d(s.l(cursorG.getBlob(6)), s.e(cursorG.getInt(5)), cursorG.getInt(7) != 0, cursorG.getInt(8) != 0, cursorG.getInt(9) != 0, cursorG.getInt(10) != 0, cursorG.getLong(11), cursorG.getLong(12), s.b(cursorG.getBlob(13))), i10, s.d(cursorG.getInt(17)), cursorG.getLong(18), cursorG.getLong(19), cursorG.getInt(20), i11, cursorG.getLong(21), cursorG.getInt(22), map.get(cursorG.getString(0)), map2.get(cursorG.getString(0))));
                }
                this.f59499a.setTransactionSuccessful();
                cursorG.close();
                nC.h();
                return arrayList;
            } catch (Throwable th2) {
                cursorG.close();
                nC.h();
                throw th2;
            }
        } finally {
            this.f59499a.endTransaction();
        }
    }

    public d(G g10) {
        this.f59499a = g10;
        this.f59500b = new i(g10);
        this.f59501c = new k(g10);
        this.f59502d = new l(g10);
        this.f59503e = new m(g10);
        this.f59504f = new n(g10);
        this.f59505g = new o(g10);
        this.f59506h = new p(g10);
        this.f59507i = new q(g10);
        this.f59508j = new r(g10);
        this.f59509k = new a(g10);
        this.f59510l = new b(g10);
        this.f59511m = new c(g10);
        this.f59512n = new C1174d(g10);
        this.f59513o = new e(g10);
        this.f59514p = new f(g10);
        this.f59515q = new g(g10);
        this.f59516r = new h(g10);
    }

    public static /* synthetic */ Unit D(d dVar, HashMap map) {
        dVar.F(map);
        return Unit.f143329a;
    }

    public static /* synthetic */ Unit E(d dVar, HashMap map) {
        dVar.G(map);
        return Unit.f143329a;
    }

    private void F(HashMap<String, ArrayList<androidx.work.b>> map) {
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            C17832j.b(map, true, new Function1() { // from class: W4.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return androidx.work.impl.model.d.D(this.f40781a, (HashMap) obj);
                }
            });
            return;
        }
        StringBuilder sbB = C17840r.b();
        sbB.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        C17840r.a(sbB, size);
        sbB.append(")");
        androidx.room.N nC = androidx.room.N.c(sbB.toString(), size);
        Iterator<String> it = setKeySet.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            nC.S1(i10, it.next());
            i10++;
        }
        Cursor cursorG = C17824b.g(this.f59499a, nC, false, null);
        try {
            int iD = C17823a.d(cursorG, "work_spec_id");
            if (iD == -1) {
                return;
            }
            while (cursorG.moveToNext()) {
                ArrayList<androidx.work.b> arrayList = map.get(cursorG.getString(iD));
                if (arrayList != null) {
                    arrayList.add(androidx.work.b.b(cursorG.getBlob(0)));
                }
            }
        } finally {
            cursorG.close();
        }
    }

    private void G(HashMap<String, ArrayList<String>> map) {
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            C17832j.b(map, true, new Function1() { // from class: W4.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return androidx.work.impl.model.d.E(this.f40780a, (HashMap) obj);
                }
            });
            return;
        }
        StringBuilder sbB = C17840r.b();
        sbB.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        C17840r.a(sbB, size);
        sbB.append(")");
        androidx.room.N nC = androidx.room.N.c(sbB.toString(), size);
        Iterator<String> it = setKeySet.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            nC.S1(i10, it.next());
            i10++;
        }
        Cursor cursorG = C17824b.g(this.f59499a, nC, false, null);
        try {
            int iD = C17823a.d(cursorG, "work_spec_id");
            if (iD == -1) {
                return;
            }
            while (cursorG.moveToNext()) {
                ArrayList<String> arrayList = map.get(cursorG.getString(iD));
                if (arrayList != null) {
                    arrayList.add(cursorG.getString(0));
                }
            }
        } finally {
            cursorG.close();
        }
    }
}
