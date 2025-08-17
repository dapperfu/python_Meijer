package zc;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
final class W extends SQLiteOpenHelper {

    /* renamed from: c, reason: collision with root package name */
    private static final String f171742c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: d, reason: collision with root package name */
    static int f171743d = 7;

    /* renamed from: e, reason: collision with root package name */
    private static final a f171744e;

    /* renamed from: f, reason: collision with root package name */
    private static final a f171745f;

    /* renamed from: g, reason: collision with root package name */
    private static final a f171746g;

    /* renamed from: h, reason: collision with root package name */
    private static final a f171747h;

    /* renamed from: i, reason: collision with root package name */
    private static final a f171748i;

    /* renamed from: j, reason: collision with root package name */
    private static final a f171749j;

    /* renamed from: k, reason: collision with root package name */
    private static final a f171750k;

    /* renamed from: l, reason: collision with root package name */
    private static final List<a> f171751l;

    /* renamed from: a, reason: collision with root package name */
    private final int f171752a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f171753b;

    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    W(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f171753b = false;
        this.f171752a = i10;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f171753b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    static {
        a aVar = new a() { // from class: zc.O
            @Override // zc.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                W.a(sQLiteDatabase);
            }
        };
        f171744e = aVar;
        a aVar2 = new a() { // from class: zc.P
            @Override // zc.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                W.h(sQLiteDatabase);
            }
        };
        f171745f = aVar2;
        a aVar3 = new a() { // from class: zc.Q
            @Override // zc.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f171746g = aVar3;
        a aVar4 = new a() { // from class: zc.S
            @Override // zc.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                W.i(sQLiteDatabase);
            }
        };
        f171747h = aVar4;
        a aVar5 = new a() { // from class: zc.T
            @Override // zc.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                W.d(sQLiteDatabase);
            }
        };
        f171748i = aVar5;
        a aVar6 = new a() { // from class: zc.U
            @Override // zc.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
            }
        };
        f171749j = aVar6;
        a aVar7 = new a() { // from class: zc.V
            @Override // zc.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                W.b(sQLiteDatabase);
            }
        };
        f171750k = aVar7;
        f171751l = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static /* synthetic */ void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    public static /* synthetic */ void b(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN pseudonymous_id TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB");
    }

    public static /* synthetic */ void d(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f171742c);
    }

    public static /* synthetic */ void h(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    public static /* synthetic */ void i(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    private void j(SQLiteDatabase sQLiteDatabase) {
        if (this.f171753b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    private void m(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List<a> list = f171751l;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                f171751l.get(i10).a(sQLiteDatabase);
                i10++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i10 + " to " + i11 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        l(sQLiteDatabase, this.f171752a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        l(sQLiteDatabase, i11);
    }

    private void l(SQLiteDatabase sQLiteDatabase, int i10) {
        j(sQLiteDatabase);
        m(sQLiteDatabase, 0, i10);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        j(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        j(sQLiteDatabase);
        m(sQLiteDatabase, i10, i11);
    }
}
