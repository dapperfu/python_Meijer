package androidx.room;

import A4.d;
import android.database.Cursor;
import android.database.SQLException;
import androidx.room.G;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import t4.C17059a;

@Deprecated
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 \u000e2\u00020\u0001:\u0003\u0012\u001b#B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ'\u0010\u0017\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u000fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\"R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\"¨\u0006$"}, d2 = {"Landroidx/room/M;", "LA4/d$a;", "Landroidx/room/e;", "configuration", "Landroidx/room/M$b;", "delegate", "", "identityHash", "legacyHash", "<init>", "(Landroidx/room/e;Landroidx/room/M$b;Ljava/lang/String;Ljava/lang/String;)V", "LA4/c;", "db", "", "h", "(LA4/c;)V", "j", "i", "b", "d", "", "oldVersion", "newVersion", "g", "(LA4/c;II)V", "e", "f", "c", "Landroidx/room/e;", "", "Landroidx/room/G$b;", "Ljava/util/List;", "callbacks", "Landroidx/room/M$b;", "Ljava/lang/String;", "a", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public class M extends d.a {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private C6119e configuration;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<G.b> callbacks;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b delegate;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String identityHash;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String legacyHash;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/room/M$a;", "", "<init>", "()V", "LA4/c;", "db", "", "c", "(LA4/c;)Z", "b", "", "a", "(LA4/c;)V", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.room.M$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void a(A4.c db2) throws SQLException {
            Intrinsics.j(db2, "db");
            Cursor cursorF2 = db2.F2("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                List listC = CollectionsKt.c();
                while (cursorF2.moveToNext()) {
                    String string = cursorF2.getString(0);
                    Intrinsics.g(string);
                    if (!StringsKt.W(string, "sqlite_", false, 2, null) && !Intrinsics.e(string, "android_metadata")) {
                        listC.add(TuplesKt.a(string, Boolean.valueOf(Intrinsics.e(cursorF2.getString(1), "view"))));
                    }
                }
                List<Pair> listA = CollectionsKt.a(listC);
                CloseableKt.a(cursorF2, null);
                for (Pair pair : listA) {
                    String str = (String) pair.a();
                    if (((Boolean) pair.b()).booleanValue()) {
                        db2.S("DROP VIEW IF EXISTS " + str);
                    } else {
                        db2.S("DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        }

        public final boolean b(A4.c db2) {
            Intrinsics.j(db2, "db");
            Cursor cursorF2 = db2.F2("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z10 = false;
                if (cursorF2.moveToFirst()) {
                    if (cursorF2.getInt(0) == 0) {
                        z10 = true;
                    }
                }
                CloseableKt.a(cursorF2, null);
                return z10;
            } finally {
            }
        }

        public final boolean c(A4.c db2) {
            Intrinsics.j(db2, "db");
            Cursor cursorF2 = db2.F2("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z10 = false;
                if (cursorF2.moveToFirst()) {
                    if (cursorF2.getInt(0) != 0) {
                        z10 = true;
                    }
                }
                CloseableKt.a(cursorF2, null);
                return z10;
            } finally {
            }
        }
    }

    @Deprecated
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\nJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/room/M$b;", "", "", "version", "<init>", "(I)V", "LA4/c;", "db", "", "dropAllTables", "(LA4/c;)V", "createAllTables", "onOpen", "onCreate", "validateMigration", "Landroidx/room/M$c;", "onValidateSchema", "(LA4/c;)Landroidx/room/M$c;", "onPreMigrate", "onPostMigrate", "I", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class b {

        @JvmField
        public final int version;

        public abstract void createAllTables(A4.c db2);

        public abstract void dropAllTables(A4.c db2);

        public abstract void onCreate(A4.c db2);

        public abstract void onOpen(A4.c db2);

        public void onPostMigrate(A4.c db2) {
            Intrinsics.j(db2, "db");
        }

        public void onPreMigrate(A4.c db2) {
            Intrinsics.j(db2, "db");
        }

        public c onValidateSchema(A4.c db2) {
            Intrinsics.j(db2, "db");
            validateMigration(db2);
            return new c(true, null);
        }

        @Deprecated
        protected void validateMigration(A4.c db2) {
            Intrinsics.j(db2, "db");
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }

        public b(int i10) {
            this.version = i10;
        }
    }

    @Deprecated
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/room/M$c;", "", "", "isValid", "", "expectedFoundMsg", "<init>", "(ZLjava/lang/String;)V", "a", "Z", "b", "Ljava/lang/String;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final boolean isValid;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final String expectedFoundMsg;

        public c(boolean z10, String str) {
            this.isValid = z10;
            this.expectedFoundMsg = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(C6119e configuration, b delegate, String identityHash, String legacyHash) {
        super(delegate.version);
        Intrinsics.j(configuration, "configuration");
        Intrinsics.j(delegate, "delegate");
        Intrinsics.j(identityHash, "identityHash");
        Intrinsics.j(legacyHash, "legacyHash");
        this.callbacks = configuration.callbacks;
        this.configuration = configuration;
        this.delegate = delegate;
        this.identityHash = identityHash;
        this.legacyHash = legacyHash;
    }

    private final void h(A4.c db2) throws SQLException {
        if (!INSTANCE.c(db2)) {
            c cVarOnValidateSchema = this.delegate.onValidateSchema(db2);
            if (cVarOnValidateSchema.isValid) {
                this.delegate.onPostMigrate(db2);
                j(db2);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cVarOnValidateSchema.expectedFoundMsg);
            }
        }
        Cursor cursorX2 = db2.X2(new A4.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = cursorX2.moveToFirst() ? cursorX2.getString(0) : null;
            CloseableKt.a(cursorX2, null);
            if (Intrinsics.e(this.identityHash, string) || Intrinsics.e(this.legacyHash, string)) {
                return;
            }
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.identityHash + ", found: " + string);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.a(cursorX2, th2);
                throw th3;
            }
        }
    }

    private final void i(A4.c db2) throws SQLException {
        db2.S("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    @Override // A4.d.a
    public void b(A4.c db2) {
        Intrinsics.j(db2, "db");
        super.b(db2);
    }

    @Override // A4.d.a
    public void d(A4.c db2) throws SQLException {
        Intrinsics.j(db2, "db");
        boolean zB = INSTANCE.b(db2);
        this.delegate.createAllTables(db2);
        if (!zB) {
            c cVarOnValidateSchema = this.delegate.onValidateSchema(db2);
            if (!cVarOnValidateSchema.isValid) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cVarOnValidateSchema.expectedFoundMsg);
            }
        }
        j(db2);
        this.delegate.onCreate(db2);
        List<G.b> list = this.callbacks;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((G.b) it.next()).a(db2);
            }
        }
    }

    @Override // A4.d.a
    public void e(A4.c db2, int oldVersion, int newVersion) throws SQLException {
        Intrinsics.j(db2, "db");
        g(db2, oldVersion, newVersion);
    }

    @Override // A4.d.a
    public void f(A4.c db2) throws SQLException {
        Intrinsics.j(db2, "db");
        super.f(db2);
        h(db2);
        this.delegate.onOpen(db2);
        List<G.b> list = this.callbacks;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((G.b) it.next()).e(db2);
            }
        }
        this.configuration = null;
    }

    @Override // A4.d.a
    public void g(A4.c db2, int oldVersion, int newVersion) throws SQLException {
        List<u4.b> listD;
        Intrinsics.j(db2, "db");
        C6119e c6119e = this.configuration;
        if (c6119e != null && (listD = c6119e.migrationContainer.d(oldVersion, newVersion)) != null) {
            this.delegate.onPreMigrate(db2);
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                ((u4.b) it.next()).migrate(new C17059a(db2));
            }
            c cVarOnValidateSchema = this.delegate.onValidateSchema(db2);
            if (cVarOnValidateSchema.isValid) {
                this.delegate.onPostMigrate(db2);
                j(db2);
                return;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + cVarOnValidateSchema.expectedFoundMsg);
            }
        }
        C6119e c6119e2 = this.configuration;
        if (c6119e2 == null || c6119e2.e(oldVersion, newVersion)) {
            throw new IllegalStateException("A migration from " + oldVersion + " to " + newVersion + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        if (c6119e2.allowDestructiveMigrationForAllTables) {
            INSTANCE.a(db2);
        } else {
            this.delegate.dropAllTables(db2);
        }
        List<G.b> list = this.callbacks;
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                ((G.b) it2.next()).c(db2);
            }
        }
        this.delegate.createAllTables(db2);
    }

    private final void j(A4.c db2) throws SQLException {
        i(db2);
        db2.S(J.a(this.identityHash));
    }
}
