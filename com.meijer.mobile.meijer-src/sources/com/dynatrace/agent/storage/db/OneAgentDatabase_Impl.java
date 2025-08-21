package com.dynatrace.agent.storage.db;

import B4.c;
import B4.d;
import Y7.b;
import android.database.SQLException;
import androidx.room.C6261e;
import androidx.room.C6273q;
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
import u4.AbstractC17349b;
import u4.InterfaceC17348a;
import w4.C17824b;
import w4.C17841s;

/* loaded from: classes4.dex */
public final class OneAgentDatabase_Impl extends OneAgentDatabase {

    /* renamed from: a, reason: collision with root package name */
    private volatile b f65021a;

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
                    ((G.b) it.next()).d(cVar);
                }
            }
        }

        @Override // androidx.room.M.b
        public void onCreate(c cVar) {
            List list = ((G) OneAgentDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((G.b) it.next()).b(cVar);
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
                    ((G.b) it.next()).f(cVar);
                }
            }
        }

        @Override // androidx.room.M.b
        public M.c onValidateSchema(c cVar) {
            HashMap map = new HashMap(5);
            map.put(PreferencesHelper.PREF_ID, new C17841s.a(PreferencesHelper.PREF_ID, "INTEGER", true, 1, null, 1));
            map.put("event", new C17841s.a("event", "TEXT", true, 0, null, 1));
            map.put("timestamp", new C17841s.a("timestamp", "INTEGER", true, 0, null, 1));
            map.put("isPriorityData", new C17841s.a("isPriorityData", "INTEGER", true, 0, null, 1));
            map.put("eventSizeBytes", new C17841s.a("eventSizeBytes", "INTEGER", true, 0, null, 1));
            C17841s c17841s = new C17841s("events", map, new HashSet(0), new HashSet(0));
            C17841s c17841sA = C17841s.a(cVar, "events");
            if (c17841s.equals(c17841sA)) {
                return new M.c(true, null);
            }
            return new M.c(false, "events(com.dynatrace.agent.storage.db.EventRecord).\n Expected:\n" + c17841s + "\n Found:\n" + c17841sA);
        }

        @Override // androidx.room.M.b
        public void onPreMigrate(c cVar) {
            C17824b.c(cVar);
        }
    }

    @Override // androidx.room.G
    public void clearAllTables() throws SQLException {
        super.assertNotMainThread();
        c cVarC2 = super.getOpenHelper().C2();
        try {
            super.beginTransaction();
            cVarC2.S("DELETE FROM `events`");
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
        return new C6273q(this, new HashMap(0), new HashMap(0), "events");
    }

    @Override // androidx.room.G
    protected d createOpenHelper(C6261e c6261e) {
        return c6261e.sqliteOpenHelperFactory.a(d.b.a(c6261e.context).d(c6261e.name).c(new M(c6261e, new a(1), "a59cc22b06e263270614a1e34c446daa", "2a34908ba2ef68cc767f6f241e4e9b62")).b());
    }

    @Override // com.dynatrace.agent.storage.db.OneAgentDatabase
    public b g() {
        b bVar;
        if (this.f65021a != null) {
            return this.f65021a;
        }
        synchronized (this) {
            try {
                if (this.f65021a == null) {
                    this.f65021a = new Y7.c(this);
                }
                bVar = this.f65021a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // androidx.room.G
    public List<AbstractC17349b> getAutoMigrations(Map<Class<? extends InterfaceC17348a>, InterfaceC17348a> map) {
        return new ArrayList();
    }

    @Override // androidx.room.G
    public Set<Class<? extends InterfaceC17348a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.G
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(b.class, Y7.c.l());
        return map;
    }
}
