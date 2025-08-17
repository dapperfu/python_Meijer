package androidx.room;

import androidx.room.AbstractC6115a;
import androidx.room.G;
import androidx.room.K;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import r4.C16720b;
import w4.C17761i;
import z4.C18379a;
import z4.InterfaceC18380b;
import z4.InterfaceC18381c;
import z4.InterfaceC18382d;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 92\u00020\u0001:\u0002*'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u001c\u0010\bJ'\u0010 \u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0004¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\"\u0010\bJ\u0013\u0010$\u001a\u00020\u001d*\u00020#H\u0004¢\u0006\u0004\b$\u0010%J\u0013\u0010&\u001a\u00020\u001d*\u00020#H\u0004¢\u0006\u0004\b&\u0010%R\u0016\u0010)\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010/\u001a\u00020,8$X¤\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008$X¤\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000205048$X¤\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006:"}, d2 = {"Landroidx/room/a;", "", "<init>", "()V", "Lz4/b;", "connection", "", "i", "(Lz4/b;)V", "g", "j", "k", "h", "", "s", "(Lz4/b;)Z", "B", "l", "m", "f", "t", "u", "v", "w", "", "fileName", "A", "(Ljava/lang/String;)Ljava/lang/String;", "x", "", "oldVersion", "newVersion", "y", "(Lz4/b;II)V", "z", "Landroidx/room/G$d;", "p", "(Landroidx/room/G$d;)I", "q", "a", "Z", "isConfigured", "b", "isInitializing", "Landroidx/room/e;", "o", "()Landroidx/room/e;", "configuration", "Landroidx/room/K;", "r", "()Landroidx/room/K;", "openDelegate", "", "Landroidx/room/G$b;", "n", "()Ljava/util/List;", "callbacks", "c", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.room.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6115a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean isConfigured;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isInitializing;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0084\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/room/a$b;", "Lz4/c;", "actual", "<init>", "(Landroidx/room/a;Lz4/c;)V", "", "filename", "Lz4/b;", "c", "(Ljava/lang/String;)Lz4/b;", "fileName", "a", "Lz4/c;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.room.a$b */
    protected final class b implements InterfaceC18381c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC18381c actual;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC6115a f58445b;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: androidx.room.a$b$a, reason: collision with other inner class name */
        static final class C1141a implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f58446a;

            C1141a(String str) {
                this.f58446a = str;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Void invoke(Throwable error) {
                Intrinsics.j(error, "error");
                throw new IllegalStateException("Unable to open database '" + this.f58446a + "'. Was a proper path / name used in Room's database builder?", error);
            }
        }

        public b(AbstractC6115a abstractC6115a, InterfaceC18381c actual) {
            Intrinsics.j(actual, "actual");
            this.f58445b = abstractC6115a;
            this.actual = actual;
        }

        private final InterfaceC18380b c(final String filename) {
            C16720b c16720b = new C16720b(filename, (this.f58445b.isConfigured || this.f58445b.isInitializing || Intrinsics.e(filename, ":memory:")) ? false : true);
            final AbstractC6115a abstractC6115a = this.f58445b;
            return (InterfaceC18380b) c16720b.b(new Function0() { // from class: androidx.room.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbstractC6115a.b.d(abstractC6115a, this, filename);
                }
            }, new C1141a(filename));
        }

        @Override // z4.InterfaceC18381c
        public InterfaceC18380b a(String fileName) {
            Intrinsics.j(fileName, "fileName");
            return c(this.f58445b.A(fileName));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC18380b d(AbstractC6115a abstractC6115a, b bVar, String str) {
            if (!abstractC6115a.isInitializing) {
                InterfaceC18380b interfaceC18380bA = bVar.actual.a(str);
                if (abstractC6115a.isConfigured) {
                    abstractC6115a.g(interfaceC18380bA);
                    return interfaceC18380bA;
                }
                try {
                    abstractC6115a.isInitializing = true;
                    abstractC6115a.i(interfaceC18380bA);
                    return interfaceC18380bA;
                } finally {
                    abstractC6115a.isInitializing = false;
                }
            }
            throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.room.a$c */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[G.d.values().length];
            try {
                iArr[G.d.f58357b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[G.d.f58358c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public abstract String A(String fileName);

    protected abstract List<G.b> n();

    /* renamed from: o */
    protected abstract C6119e getConfiguration();

    /* renamed from: r */
    protected abstract K getOpenDelegate();

    private final void h(InterfaceC18380b connection) {
        InterfaceC18382d interfaceC18382dS3 = connection.S3("PRAGMA busy_timeout");
        try {
            interfaceC18382dS3.N3();
            long j10 = interfaceC18382dS3.getLong(0);
            AutoCloseableKt.a(interfaceC18382dS3, null);
            if (j10 < 3000) {
                C18379a.a(connection, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AutoCloseableKt.a(interfaceC18382dS3, th2);
                throw th3;
            }
        }
    }

    private final void l(InterfaceC18380b connection) {
        C18379a.a(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private final boolean s(InterfaceC18380b connection) {
        InterfaceC18382d interfaceC18382dS3 = connection.S3("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (interfaceC18382dS3.N3()) {
                if (interfaceC18382dS3.getLong(0) == 0) {
                    z10 = true;
                }
            }
            AutoCloseableKt.a(interfaceC18382dS3, null);
            return z10;
        } finally {
        }
    }

    private final boolean t(InterfaceC18380b connection) {
        InterfaceC18382d interfaceC18382dS3 = connection.S3("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z10 = false;
            if (interfaceC18382dS3.N3()) {
                if (interfaceC18382dS3.getLong(0) != 0) {
                    z10 = true;
                }
            }
            AutoCloseableKt.a(interfaceC18382dS3, null);
            return z10;
        } finally {
        }
    }

    protected final int p(G.d dVar) {
        Intrinsics.j(dVar, "<this>");
        int i10 = c.$EnumSwitchMapping$0[dVar.ordinal()];
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 4;
        }
        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + dVar + '\'').toString());
    }

    protected final int q(G.d dVar) {
        Intrinsics.j(dVar, "<this>");
        int i10 = c.$EnumSwitchMapping$0[dVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return 1;
        }
        throw new IllegalStateException(("Can't get max number of writers for journal mode '" + dVar + '\'').toString());
    }

    protected final void x(InterfaceC18380b connection) {
        Intrinsics.j(connection, "connection");
        boolean zS = s(connection);
        getOpenDelegate().a(connection);
        if (!zS) {
            K.a aVarJ = getOpenDelegate().j(connection);
            if (!aVarJ.isValid) {
                throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + aVarJ.expectedFoundMsg).toString());
            }
        }
        B(connection);
        getOpenDelegate().f(connection);
        u(connection);
    }

    protected final void y(InterfaceC18380b connection, int oldVersion, int newVersion) {
        Intrinsics.j(connection, "connection");
        List<u4.b> listB = C17761i.b(getConfiguration().migrationContainer, oldVersion, newVersion);
        if (listB == null) {
            if (!C17761i.d(getConfiguration(), oldVersion, newVersion)) {
                m(connection);
                v(connection);
                getOpenDelegate().a(connection);
                return;
            } else {
                throw new IllegalStateException(("A migration from " + oldVersion + " to " + newVersion + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
            }
        }
        getOpenDelegate().i(connection);
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            ((u4.b) it.next()).migrate(connection);
        }
        K.a aVarJ = getOpenDelegate().j(connection);
        if (aVarJ.isValid) {
            getOpenDelegate().h(connection);
            B(connection);
        } else {
            throw new IllegalStateException(("Migration didn't properly handle: " + aVarJ.expectedFoundMsg).toString());
        }
    }

    protected final void z(InterfaceC18380b connection) {
        Intrinsics.j(connection, "connection");
        f(connection);
        getOpenDelegate().g(connection);
        w(connection);
        this.isConfigured = true;
    }

    private final void B(InterfaceC18380b connection) {
        l(connection);
        C18379a.a(connection, J.a(getOpenDelegate().getIdentityHash()));
    }

    private final void f(InterfaceC18380b connection) throws Throwable {
        Object objB;
        K.a aVarJ;
        String strP2;
        if (t(connection)) {
            InterfaceC18382d interfaceC18382dS3 = connection.S3("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
            try {
                if (interfaceC18382dS3.N3()) {
                    strP2 = interfaceC18382dS3.P2(0);
                } else {
                    strP2 = null;
                }
                AutoCloseableKt.a(interfaceC18382dS3, null);
                if (!Intrinsics.e(getOpenDelegate().getIdentityHash(), strP2) && !Intrinsics.e(getOpenDelegate().getLegacyIdentityHash(), strP2)) {
                    throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + getOpenDelegate().getIdentityHash() + ", found: " + strP2).toString());
                }
                return;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AutoCloseableKt.a(interfaceC18382dS3, th2);
                    throw th3;
                }
            }
        }
        C18379a.a(connection, "BEGIN EXCLUSIVE TRANSACTION");
        try {
            Result.Companion companion = Result.INSTANCE;
            aVarJ = getOpenDelegate().j(connection);
        } catch (Throwable th4) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th4));
        }
        if (aVarJ.isValid) {
            getOpenDelegate().h(connection);
            B(connection);
            objB = Result.b(Unit.f142422a);
            if (Result.h(objB)) {
                C18379a.a(connection, "END TRANSACTION");
            }
            Throwable thE = Result.e(objB);
            if (thE == null) {
                Result.a(objB);
                return;
            } else {
                C18379a.a(connection, "ROLLBACK TRANSACTION");
                throw thE;
            }
        }
        throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + aVarJ.expectedFoundMsg).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(InterfaceC18380b connection) {
        k(connection);
        h(connection);
        getOpenDelegate().g(connection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(InterfaceC18380b connection) throws Throwable {
        Object objB;
        j(connection);
        k(connection);
        h(connection);
        InterfaceC18382d interfaceC18382dS3 = connection.S3("PRAGMA user_version");
        try {
            interfaceC18382dS3.N3();
            int i10 = (int) interfaceC18382dS3.getLong(0);
            AutoCloseableKt.a(interfaceC18382dS3, null);
            if (i10 != getOpenDelegate().getVersion()) {
                C18379a.a(connection, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    Result.Companion companion = Result.INSTANCE;
                    if (i10 == 0) {
                        x(connection);
                    } else {
                        y(connection, i10, getOpenDelegate().getVersion());
                    }
                    C18379a.a(connection, "PRAGMA user_version = " + getOpenDelegate().getVersion());
                    objB = Result.b(Unit.f142422a);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objB = Result.b(ResultKt.a(th2));
                }
                if (Result.h(objB)) {
                    C18379a.a(connection, "END TRANSACTION");
                }
                Throwable thE = Result.e(objB);
                if (thE != null) {
                    C18379a.a(connection, "ROLLBACK TRANSACTION");
                    throw thE;
                }
            }
            z(connection);
        } finally {
        }
    }

    private final void j(InterfaceC18380b connection) {
        if (getConfiguration().journalMode == G.d.f58358c) {
            C18379a.a(connection, "PRAGMA journal_mode = WAL");
        } else {
            C18379a.a(connection, "PRAGMA journal_mode = TRUNCATE");
        }
    }

    private final void k(InterfaceC18380b connection) {
        if (getConfiguration().journalMode == G.d.f58358c) {
            C18379a.a(connection, "PRAGMA synchronous = NORMAL");
        } else {
            C18379a.a(connection, "PRAGMA synchronous = FULL");
        }
    }

    private final void m(InterfaceC18380b connection) {
        if (getConfiguration().allowDestructiveMigrationForAllTables) {
            InterfaceC18382d interfaceC18382dS3 = connection.S3("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                List listC = CollectionsKt.c();
                while (interfaceC18382dS3.N3()) {
                    String strP2 = interfaceC18382dS3.P2(0);
                    if (!StringsKt.W(strP2, "sqlite_", false, 2, null) && !Intrinsics.e(strP2, "android_metadata")) {
                        listC.add(TuplesKt.a(strP2, Boolean.valueOf(Intrinsics.e(interfaceC18382dS3.P2(1), "view"))));
                    }
                }
                List<Pair> listA = CollectionsKt.a(listC);
                AutoCloseableKt.a(interfaceC18382dS3, null);
                for (Pair pair : listA) {
                    String str = (String) pair.a();
                    if (((Boolean) pair.b()).booleanValue()) {
                        C18379a.a(connection, "DROP VIEW IF EXISTS " + str);
                    } else {
                        C18379a.a(connection, "DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        } else {
            getOpenDelegate().b(connection);
        }
    }

    private final void u(InterfaceC18380b connection) {
        Iterator<T> it = n().iterator();
        while (it.hasNext()) {
            ((G.b) it.next()).b(connection);
        }
    }

    private final void v(InterfaceC18380b connection) {
        Iterator<T> it = n().iterator();
        while (it.hasNext()) {
            ((G.b) it.next()).d(connection);
        }
    }

    private final void w(InterfaceC18380b connection) {
        Iterator<T> it = n().iterator();
        while (it.hasNext()) {
            ((G.b) it.next()).f(connection);
        }
    }
}
