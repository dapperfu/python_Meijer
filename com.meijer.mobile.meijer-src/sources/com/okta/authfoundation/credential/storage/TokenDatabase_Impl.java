package com.okta.authfoundation.credential.storage;

import B4.c;
import B4.d;
import android.database.SQLException;
import androidx.room.C6261e;
import androidx.room.C6273q;
import androidx.room.G;
import androidx.room.M;
import com.okta.authfoundation.credential.storage.TokenDatabase_Impl;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import u4.AbstractC17349b;
import u4.InterfaceC17348a;
import w4.C17824b;
import w4.C17841s;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u0003J1\u0010\u0012\u001a$\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f0\u00110\u000eH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u000f0\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00112\u001a\u0010\u0018\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u000f\u0012\u0004\u0012\u00020\u00150\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0010¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/okta/authfoundation/credential/storage/TokenDatabase_Impl;", "Lcom/okta/authfoundation/credential/storage/TokenDatabase;", "<init>", "()V", "Landroidx/room/e;", "config", "LB4/d;", "createOpenHelper", "(Landroidx/room/e;)LB4/d;", "Landroidx/room/q;", "createInvalidationTracker", "()Landroidx/room/q;", "", "clearAllTables", "", "Ljava/lang/Class;", "", "", "getRequiredTypeConverters", "()Ljava/util/Map;", "", "Lu4/a;", "getRequiredAutoMigrationSpecs", "()Ljava/util/Set;", "autoMigrationSpecs", "Lu4/b;", "getAutoMigrations", "(Ljava/util/Map;)Ljava/util/List;", "LXs/a;", "g", "()LXs/a;", "Lkotlin/Lazy;", "b", "Lkotlin/Lazy;", "_tokenDao", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TokenDatabase_Impl extends TokenDatabase {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy<Xs.a> _tokenDao = LazyKt.b(new Function0() { // from class: Xs.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TokenDatabase_Impl.i(this.f42666a);
        }
    });

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"com/okta/authfoundation/credential/storage/TokenDatabase_Impl$a", "Landroidx/room/M$b;", "LB4/c;", "db", "", "createAllTables", "(LB4/c;)V", "dropAllTables", "onCreate", "onOpen", "onPreMigrate", "onPostMigrate", "Landroidx/room/M$c;", "onValidateSchema", "(LB4/c;)Landroidx/room/M$c;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends M.b {
        @Override // androidx.room.M.b
        public void onPostMigrate(c db2) {
            Intrinsics.j(db2, "db");
        }

        a() {
            super(1);
        }

        @Override // androidx.room.M.b
        public void createAllTables(c db2) throws SQLException {
            Intrinsics.j(db2, "db");
            db2.S("CREATE TABLE IF NOT EXISTS `TokenEntity` (`id` TEXT NOT NULL, `encryptedToken` BLOB NOT NULL, `tags` TEXT NOT NULL, `payloadData` TEXT, `keyAlias` TEXT NOT NULL, `tokenEncryptionType` TEXT NOT NULL, `biometricTimeout` INTEGER, `encryptionExtras` TEXT NOT NULL, PRIMARY KEY(`id`))");
            db2.S("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            db2.S("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '455cd16a710cea2118329a6db2420074')");
        }

        @Override // androidx.room.M.b
        public void dropAllTables(c db2) throws SQLException {
            Intrinsics.j(db2, "db");
            db2.S("DROP TABLE IF EXISTS `TokenEntity`");
            List list = ((G) TokenDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((G.b) it.next()).d(db2);
                }
            }
        }

        @Override // androidx.room.M.b
        public void onCreate(c db2) {
            Intrinsics.j(db2, "db");
            List list = ((G) TokenDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((G.b) it.next()).b(db2);
                }
            }
        }

        @Override // androidx.room.M.b
        public void onOpen(c db2) {
            Intrinsics.j(db2, "db");
            ((G) TokenDatabase_Impl.this).mDatabase = db2;
            TokenDatabase_Impl.this.internalInitInvalidationTracker(db2);
            List list = ((G) TokenDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((G.b) it.next()).f(db2);
                }
            }
        }

        @Override // androidx.room.M.b
        public void onPreMigrate(c db2) {
            Intrinsics.j(db2, "db");
            C17824b.c(db2);
        }

        @Override // androidx.room.M.b
        public M.c onValidateSchema(c db2) {
            Intrinsics.j(db2, "db");
            HashMap map = new HashMap(8);
            map.put(PreferencesHelper.PREF_ID, new C17841s.a(PreferencesHelper.PREF_ID, "TEXT", true, 1, null, 1));
            map.put("encryptedToken", new C17841s.a("encryptedToken", "BLOB", true, 0, null, 1));
            map.put("tags", new C17841s.a("tags", "TEXT", true, 0, null, 1));
            map.put("payloadData", new C17841s.a("payloadData", "TEXT", false, 0, null, 1));
            map.put("keyAlias", new C17841s.a("keyAlias", "TEXT", true, 0, null, 1));
            map.put("tokenEncryptionType", new C17841s.a("tokenEncryptionType", "TEXT", true, 0, null, 1));
            map.put("biometricTimeout", new C17841s.a("biometricTimeout", "INTEGER", false, 0, null, 1));
            map.put("encryptionExtras", new C17841s.a("encryptionExtras", "TEXT", true, 0, null, 1));
            C17841s c17841s = new C17841s("TokenEntity", map, new HashSet(0), new HashSet(0));
            C17841s c17841sB = C17841s.INSTANCE.b(db2, "TokenEntity");
            if (c17841s.equals(c17841sB)) {
                return new M.c(true, null);
            }
            return new M.c(false, "TokenEntity(com.okta.authfoundation.credential.storage.TokenEntity).\n Expected:\n" + c17841s + "\n Found:\n" + c17841sB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.okta.authfoundation.credential.storage.a i(TokenDatabase_Impl tokenDatabase_Impl) {
        return new com.okta.authfoundation.credential.storage.a(tokenDatabase_Impl);
    }

    @Override // androidx.room.G
    public void clearAllTables() throws SQLException {
        super.assertNotMainThread();
        c cVarC2 = super.getOpenHelper().C2();
        try {
            super.beginTransaction();
            cVarC2.S("DELETE FROM `TokenEntity`");
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
        return new C6273q(this, new HashMap(0), new HashMap(0), "TokenEntity");
    }

    @Override // androidx.room.G
    protected d createOpenHelper(C6261e config) {
        Intrinsics.j(config, "config");
        return config.sqliteOpenHelperFactory.a(d.b.INSTANCE.a(config.context).d(config.name).c(new M(config, new a(), "455cd16a710cea2118329a6db2420074", "7f39321ea836250ea55c5f6f12aebd6e")).b());
    }

    @Override // com.okta.authfoundation.credential.storage.TokenDatabase
    public Xs.a g() {
        return this._tokenDao.getValue();
    }

    @Override // androidx.room.G
    public List<AbstractC17349b> getAutoMigrations(Map<Class<? extends InterfaceC17348a>, ? extends InterfaceC17348a> autoMigrationSpecs) {
        Intrinsics.j(autoMigrationSpecs, "autoMigrationSpecs");
        return new ArrayList();
    }

    @Override // androidx.room.G
    public Set<Class<? extends InterfaceC17348a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.G
    protected Map<Class<? extends Object>, List<Class<? extends Object>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(Xs.a.class, com.okta.authfoundation.credential.storage.a.INSTANCE.a());
        return map;
    }
}
