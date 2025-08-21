package androidx.work.impl;

import B4.d;
import W4.k;
import W4.l;
import W4.q;
import W4.r;
import android.database.SQLException;
import androidx.room.C6261e;
import androidx.room.C6273q;
import androidx.room.G;
import androidx.room.M;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import u4.AbstractC17349b;
import u4.InterfaceC17348a;
import w4.C17824b;
import w4.C17841s;

/* loaded from: classes4.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: b, reason: collision with root package name */
    private volatile androidx.work.impl.model.c f59346b;

    /* renamed from: c, reason: collision with root package name */
    private volatile W4.a f59347c;

    /* renamed from: d, reason: collision with root package name */
    private volatile q f59348d;

    /* renamed from: e, reason: collision with root package name */
    private volatile W4.e f59349e;

    /* renamed from: f, reason: collision with root package name */
    private volatile W4.i f59350f;

    /* renamed from: g, reason: collision with root package name */
    private volatile k f59351g;

    /* renamed from: h, reason: collision with root package name */
    private volatile W4.c f59352h;

    class a extends M.b {
        @Override // androidx.room.M.b
        public void onPostMigrate(B4.c cVar) {
        }

        @Override // androidx.room.M.b
        public M.c onValidateSchema(B4.c cVar) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new C17841s.a("work_spec_id", "TEXT", true, 1, null, 1));
            map.put("prerequisite_id", new C17841s.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new C17841s.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(PreferencesHelper.PREF_ID)));
            hashSet.add(new C17841s.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList(PreferencesHelper.PREF_ID)));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new C17841s.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            hashSet2.add(new C17841s.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
            C17841s c17841s = new C17841s("Dependency", map, hashSet, hashSet2);
            C17841s c17841sA = C17841s.a(cVar, "Dependency");
            if (!c17841s.equals(c17841sA)) {
                return new M.c(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + c17841s + "\n Found:\n" + c17841sA);
            }
            HashMap map2 = new HashMap(32);
            map2.put(PreferencesHelper.PREF_ID, new C17841s.a(PreferencesHelper.PREF_ID, "TEXT", true, 1, null, 1));
            map2.put("state", new C17841s.a("state", "INTEGER", true, 0, null, 1));
            map2.put("worker_class_name", new C17841s.a("worker_class_name", "TEXT", true, 0, null, 1));
            map2.put("input_merger_class_name", new C17841s.a("input_merger_class_name", "TEXT", true, 0, null, 1));
            map2.put("input", new C17841s.a("input", "BLOB", true, 0, null, 1));
            map2.put("output", new C17841s.a("output", "BLOB", true, 0, null, 1));
            map2.put("initial_delay", new C17841s.a("initial_delay", "INTEGER", true, 0, null, 1));
            map2.put("interval_duration", new C17841s.a("interval_duration", "INTEGER", true, 0, null, 1));
            map2.put("flex_duration", new C17841s.a("flex_duration", "INTEGER", true, 0, null, 1));
            map2.put("run_attempt_count", new C17841s.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            map2.put("backoff_policy", new C17841s.a("backoff_policy", "INTEGER", true, 0, null, 1));
            map2.put("backoff_delay_duration", new C17841s.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            map2.put("last_enqueue_time", new C17841s.a("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
            map2.put("minimum_retention_duration", new C17841s.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            map2.put("schedule_requested_at", new C17841s.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            map2.put("run_in_foreground", new C17841s.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            map2.put("out_of_quota_policy", new C17841s.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            map2.put("period_count", new C17841s.a("period_count", "INTEGER", true, 0, "0", 1));
            map2.put("generation", new C17841s.a("generation", "INTEGER", true, 0, "0", 1));
            map2.put("next_schedule_time_override", new C17841s.a("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
            map2.put("next_schedule_time_override_generation", new C17841s.a("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
            map2.put("stop_reason", new C17841s.a("stop_reason", "INTEGER", true, 0, "-256", 1));
            map2.put("trace_tag", new C17841s.a("trace_tag", "TEXT", false, 0, null, 1));
            map2.put("required_network_type", new C17841s.a("required_network_type", "INTEGER", true, 0, null, 1));
            map2.put("required_network_request", new C17841s.a("required_network_request", "BLOB", true, 0, "x''", 1));
            map2.put("requires_charging", new C17841s.a("requires_charging", "INTEGER", true, 0, null, 1));
            map2.put("requires_device_idle", new C17841s.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            map2.put("requires_battery_not_low", new C17841s.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            map2.put("requires_storage_not_low", new C17841s.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            map2.put("trigger_content_update_delay", new C17841s.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            map2.put("trigger_max_content_delay", new C17841s.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            map2.put("content_uri_triggers", new C17841s.a("content_uri_triggers", "BLOB", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new C17841s.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
            hashSet4.add(new C17841s.d("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
            C17841s c17841s2 = new C17841s("WorkSpec", map2, hashSet3, hashSet4);
            C17841s c17841sA2 = C17841s.a(cVar, "WorkSpec");
            if (!c17841s2.equals(c17841sA2)) {
                return new M.c(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + c17841s2 + "\n Found:\n" + c17841sA2);
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new C17841s.a("tag", "TEXT", true, 1, null, 1));
            map3.put("work_spec_id", new C17841s.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new C17841s.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(PreferencesHelper.PREF_ID)));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new C17841s.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            C17841s c17841s3 = new C17841s("WorkTag", map3, hashSet5, hashSet6);
            C17841s c17841sA3 = C17841s.a(cVar, "WorkTag");
            if (!c17841s3.equals(c17841sA3)) {
                return new M.c(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + c17841s3 + "\n Found:\n" + c17841sA3);
            }
            HashMap map4 = new HashMap(3);
            map4.put("work_spec_id", new C17841s.a("work_spec_id", "TEXT", true, 1, null, 1));
            map4.put("generation", new C17841s.a("generation", "INTEGER", true, 2, "0", 1));
            map4.put("system_id", new C17841s.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new C17841s.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(PreferencesHelper.PREF_ID)));
            C17841s c17841s4 = new C17841s("SystemIdInfo", map4, hashSet7, new HashSet(0));
            C17841s c17841sA4 = C17841s.a(cVar, "SystemIdInfo");
            if (!c17841s4.equals(c17841sA4)) {
                return new M.c(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + c17841s4 + "\n Found:\n" + c17841sA4);
            }
            HashMap map5 = new HashMap(2);
            map5.put("name", new C17841s.a("name", "TEXT", true, 1, null, 1));
            map5.put("work_spec_id", new C17841s.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new C17841s.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(PreferencesHelper.PREF_ID)));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new C17841s.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            C17841s c17841s5 = new C17841s("WorkName", map5, hashSet8, hashSet9);
            C17841s c17841sA5 = C17841s.a(cVar, "WorkName");
            if (!c17841s5.equals(c17841sA5)) {
                return new M.c(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + c17841s5 + "\n Found:\n" + c17841sA5);
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new C17841s.a("work_spec_id", "TEXT", true, 1, null, 1));
            map6.put("progress", new C17841s.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new C17841s.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(PreferencesHelper.PREF_ID)));
            C17841s c17841s6 = new C17841s("WorkProgress", map6, hashSet10, new HashSet(0));
            C17841s c17841sA6 = C17841s.a(cVar, "WorkProgress");
            if (!c17841s6.equals(c17841sA6)) {
                return new M.c(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + c17841s6 + "\n Found:\n" + c17841sA6);
            }
            HashMap map7 = new HashMap(2);
            map7.put("key", new C17841s.a("key", "TEXT", true, 1, null, 1));
            map7.put("long_value", new C17841s.a("long_value", "INTEGER", false, 0, null, 1));
            C17841s c17841s7 = new C17841s("Preference", map7, new HashSet(0), new HashSet(0));
            C17841s c17841sA7 = C17841s.a(cVar, "Preference");
            if (c17841s7.equals(c17841sA7)) {
                return new M.c(true, null);
            }
            return new M.c(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + c17841s7 + "\n Found:\n" + c17841sA7);
        }

        a(int i10) {
            super(i10);
        }

        @Override // androidx.room.M.b
        public void createAllTables(B4.c cVar) throws SQLException {
            cVar.S("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            cVar.S("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            cVar.S("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            cVar.S("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            cVar.S("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            cVar.S("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            cVar.S("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            cVar.S("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            cVar.S("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            cVar.S("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            cVar.S("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            cVar.S("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            cVar.S("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            cVar.S("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            cVar.S("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
        }

        @Override // androidx.room.M.b
        public void dropAllTables(B4.c cVar) throws SQLException {
            cVar.S("DROP TABLE IF EXISTS `Dependency`");
            cVar.S("DROP TABLE IF EXISTS `WorkSpec`");
            cVar.S("DROP TABLE IF EXISTS `WorkTag`");
            cVar.S("DROP TABLE IF EXISTS `SystemIdInfo`");
            cVar.S("DROP TABLE IF EXISTS `WorkName`");
            cVar.S("DROP TABLE IF EXISTS `WorkProgress`");
            cVar.S("DROP TABLE IF EXISTS `Preference`");
            List list = ((G) WorkDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((G.b) it.next()).d(cVar);
                }
            }
        }

        @Override // androidx.room.M.b
        public void onCreate(B4.c cVar) {
            List list = ((G) WorkDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((G.b) it.next()).b(cVar);
                }
            }
        }

        @Override // androidx.room.M.b
        public void onOpen(B4.c cVar) throws SQLException {
            ((G) WorkDatabase_Impl.this).mDatabase = cVar;
            cVar.S("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.internalInitInvalidationTracker(cVar);
            List list = ((G) WorkDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((G.b) it.next()).f(cVar);
                }
            }
        }

        @Override // androidx.room.M.b
        public void onPreMigrate(B4.c cVar) {
            C17824b.c(cVar);
        }
    }

    @Override // androidx.room.G
    public void clearAllTables() throws SQLException {
        super.assertNotMainThread();
        B4.c cVarC2 = super.getOpenHelper().C2();
        try {
            super.beginTransaction();
            cVarC2.S("PRAGMA defer_foreign_keys = TRUE");
            cVarC2.S("DELETE FROM `Dependency`");
            cVarC2.S("DELETE FROM `WorkSpec`");
            cVarC2.S("DELETE FROM `WorkTag`");
            cVarC2.S("DELETE FROM `SystemIdInfo`");
            cVarC2.S("DELETE FROM `WorkName`");
            cVarC2.S("DELETE FROM `WorkProgress`");
            cVarC2.S("DELETE FROM `Preference`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            cVarC2.E2("PRAGMA wal_checkpoint(FULL)").close();
            if (!cVarC2.j3()) {
                cVarC2.S("VACUUM");
            }
        }
    }

    @Override // androidx.room.G
    protected C6273q createInvalidationTracker() {
        return new C6273q(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.G
    protected B4.d createOpenHelper(C6261e c6261e) {
        return c6261e.sqliteOpenHelperFactory.a(d.b.a(c6261e.context).d(c6261e.name).c(new M(c6261e, new a(23), "86254750241babac4b8d52996a675549", "1cbd3130fa23b59692c061c594c16cc0")).b());
    }

    @Override // androidx.work.impl.WorkDatabase
    public W4.a g() {
        W4.a aVar;
        if (this.f59347c != null) {
            return this.f59347c;
        }
        synchronized (this) {
            try {
                if (this.f59347c == null) {
                    this.f59347c = new W4.b(this);
                }
                aVar = this.f59347c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    @Override // androidx.room.G
    public List<AbstractC17349b> getAutoMigrations(Map<Class<? extends InterfaceC17348a>, InterfaceC17348a> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b());
        arrayList.add(new c());
        arrayList.add(new d());
        arrayList.add(new e());
        arrayList.add(new f());
        arrayList.add(new g());
        arrayList.add(new h());
        arrayList.add(new i());
        return arrayList;
    }

    @Override // androidx.room.G
    public Set<Class<? extends InterfaceC17348a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.G
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(androidx.work.impl.model.c.class, androidx.work.impl.model.d.I());
        map.put(W4.a.class, W4.b.e());
        map.put(q.class, r.e());
        map.put(W4.e.class, W4.f.h());
        map.put(W4.i.class, W4.j.c());
        map.put(k.class, l.c());
        map.put(W4.c.class, W4.d.c());
        map.put(androidx.work.impl.model.a.class, androidx.work.impl.model.b.a());
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    public W4.c h() {
        W4.c cVar;
        if (this.f59352h != null) {
            return this.f59352h;
        }
        synchronized (this) {
            try {
                if (this.f59352h == null) {
                    this.f59352h = new W4.d(this);
                }
                cVar = this.f59352h;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public W4.e i() {
        W4.e eVar;
        if (this.f59349e != null) {
            return this.f59349e;
        }
        synchronized (this) {
            try {
                if (this.f59349e == null) {
                    this.f59349e = new W4.f(this);
                }
                eVar = this.f59349e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public W4.i j() {
        W4.i iVar;
        if (this.f59350f != null) {
            return this.f59350f;
        }
        synchronized (this) {
            try {
                if (this.f59350f == null) {
                    this.f59350f = new W4.j(this);
                }
                iVar = this.f59350f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public k k() {
        k kVar;
        if (this.f59351g != null) {
            return this.f59351g;
        }
        synchronized (this) {
            try {
                if (this.f59351g == null) {
                    this.f59351g = new l(this);
                }
                kVar = this.f59351g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.c l() {
        androidx.work.impl.model.c cVar;
        if (this.f59346b != null) {
            return this.f59346b;
        }
        synchronized (this) {
            try {
                if (this.f59346b == null) {
                    this.f59346b = new androidx.work.impl.model.d(this);
                }
                cVar = this.f59346b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public q m() {
        q qVar;
        if (this.f59348d != null) {
            return this.f59348d;
        }
        synchronized (this) {
            try {
                if (this.f59348d == null) {
                    this.f59348d = new r(this);
                }
                qVar = this.f59348d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }
}
