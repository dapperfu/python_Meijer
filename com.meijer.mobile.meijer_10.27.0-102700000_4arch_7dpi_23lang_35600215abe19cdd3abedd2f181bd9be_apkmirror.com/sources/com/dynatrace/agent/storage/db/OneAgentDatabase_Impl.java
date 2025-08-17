package com.dynatrace.agent.storage.db;

import A4.c;
import A4.d;
import W7.b;
import android.database.SQLException;
import androidx.room.C6119e;
import androidx.room.C6131q;
import androidx.room.G;
import androidx.room.M;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import u4.InterfaceC17221a;
import w4.C17754b;
import w4.C17771s;

/* loaded from: classes4.dex */
public final class OneAgentDatabase_Impl extends OneAgentDatabase {

    /* renamed from: a, reason: collision with root package name */
    private volatile b f64181a;

    class a extends M.b {
        @Override // androidx.room.M.b
        public void onPostMigrate(c cVar) {
        }

        a(int i10) {
            super(i10);
        }

        @Override // androidx.room.M.b
        public void createAllTables(c cVar) throws SQLException {
            cVar.S("CREATE TABLE IF NOT EXISTS `events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `event` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `isPriorityData` INTEGER NOT NULL, `eventSizeBytes` INTEGER NOT NULL)");
            cVar.S("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            cVar.S("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a59cc22b06e263270614a1e34c446daa')");
        }

        @Override // androidx.room.M.b
        public void dropAllTables(c cVar) throws SQLException {
            cVar.S("DROP TABLE IF EXISTS `events`");
            List list = ((G) OneAgentDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((G.b) it.next()).c(cVar);
                }
            }
        }

        @Override // androidx.room.M.b
        public void onCreate(c cVar) {
            List list = ((G) OneAgentDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((G.b) it.next()).a(cVar);
                }
            }
        }

        @Override // androidx.room.M.b
        public void onOpen(c cVar) {
            ((G) OneAgentDatabase_Impl.this).mDatabase = cVar;
            OneAgentDatabase_Impl.this.internalInitInvalidationTracker(cVar);
            List list = ((G) OneAgentDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((G.b) it.next()).e(cVar);
                }
            }
        }

        @Override // androidx.room.M.b
        public M.c onValidateSchema(c cVar) {
            HashMap map = new HashMap(5);
            map.put(PreferencesHelper.PREF_ID, new C17771s.a(PreferencesHelper.PREF_ID, "INTEGER", true, 1, null, 1));
            map.put("event", new C17771s.a("event", "TEXT", true, 0, null, 1));
            map.put("timestamp", new C17771s.a("timestamp", "INTEGER", true, 0, null, 1));
            map.put("isPriorityData", new C17771s.a("isPriorityData", "INTEGER", true, 0, null, 1));
            map.put("eventSizeBytes", new C17771s.a("eventSizeBytes", "INTEGER", true, 0, null, 1));
            C17771s c17771s = new C17771s("events", map, new HashSet(0), new HashSet(0));
            C17771s c17771sA = C17771s.a(cVar, "events");
            if (c17771s.equals(c17771sA)) {
                return new M.c(true, null);
            }
            return new M.c(false, "events(com.dynatrace.agent.storage.db.EventRecord).\n Expected:\n" + c17771s + "\n Found:\n" + c17771sA);
        }

        @Override // androidx.room.M.b
        public void onPreMigrate(c cVar) {
            C17754b.b(cVar);
        }
    }

    @Override // androidx.room.G
    public void clearAllTables() throws SQLException {
        super.assertNotMainThread();
        c cVarD2 = super.getOpenHelper().D2();
        try {
            super.beginTransaction();
            cVarD2.S("DELETE FROM `events`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            cVarD2.F2("PRAGMA wal_checkpoint(FULL)").close();
            if (!cVarD2.j3()) {
                cVarD2.S("VACUUM");
            }
        }
    }

    @Override // androidx.room.G
    protected C6131q createInvalidationTracker() {
        return new C6131q(this, new HashMap(0), new HashMap(0), "events");
    }

    @Override // androidx.room.G
    protected d createOpenHelper(C6119e c6119e) {
        return c6119e.sqliteOpenHelperFactory.a(d.b.a(c6119e.context).d(c6119e.name).c(new M(c6119e, new a(1), "a59cc22b06e263270614a1e34c446daa", "2a34908ba2ef68cc767f6f241e4e9b62")).b());
    }

    @Override // com.dynatrace.agent.storage.db.OneAgentDatabase
    public b g() {
        b bVar;
        if (this.f64181a != null) {
            return this.f64181a;
        }
        synchronized (this) {
            try {
                if (this.f64181a == null) {
                    this.f64181a = new W7.c(this);
                }
                bVar = this.f64181a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // androidx.room.G
    public List<u4.b> getAutoMigrations(Map<Class<? extends InterfaceC17221a>, InterfaceC17221a> map) {
        return new ArrayList();
    }

    @Override // androidx.room.G
    public Set<Class<? extends InterfaceC17221a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.G
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(b.class, W7.c.m());
        return map;
    }
}
