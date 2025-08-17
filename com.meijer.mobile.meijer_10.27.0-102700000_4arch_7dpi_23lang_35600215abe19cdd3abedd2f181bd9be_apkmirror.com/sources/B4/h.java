package B4;

import A4.d;
import B4.h;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.fullstory.FS;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 .2\u00020\u0001:\u0003\u0017\u0013\u0015B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001b\u0010&\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b\u0015\u0010#*\u0004\b$\u0010%R\u0016\u0010)\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"LB4/h;", "LA4/d;", "Landroid/content/Context;", "context", "", "name", "LA4/d$a;", "callback", "", "useNoBackupDirectory", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;LA4/d$a;ZZ)V", "enabled", "", "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", "a", "Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "LA4/d$a;", "d", "Z", "e", "Lkotlin/Lazy;", "LB4/h$c;", "f", "Lkotlin/Lazy;", "lazyDelegate", "g", "writeAheadLoggingEnabled", "()LB4/h$c;", "getDelegate$delegate", "(LB4/h;)Ljava/lang/Object;", "delegate", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "LA4/c;", "D2", "()LA4/c;", "writableDatabase", "h", "sqlite-framework_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements A4.d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d.a callback;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean useNoBackupDirectory;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean allowDataLossOnRecovery;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy<c> lazyDelegate;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean writeAheadLoggingEnabled;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\n"}, d2 = {"LB4/h$b;", "", "LB4/f;", "db", "<init>", "(LB4/f;)V", "a", "LB4/f;", "()LB4/f;", "b", "sqlite-framework_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private f db;

        /* renamed from: a, reason: from getter */
        public final f getDb() {
            return this.db;
        }

        public final void b(f fVar) {
            this.db = fVar;
        }

        public b(f fVar) {
            this.db = fVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0003(,\u0014B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010\u001cJ'\u0010$\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010!J\u0017\u0010%\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b%\u0010\u001cJ\u000f\u0010&\u001a\u00020\u001aH\u0016¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0018\u00103\u001a\u0004\b4\u00105R\u0016\u00107\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00103R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00103¨\u0006="}, d2 = {"LB4/h$c;", "Landroid/database/sqlite/SQLiteOpenHelper;", "Landroid/content/Context;", "context", "", "name", "LB4/h$b;", "dbRef", "LA4/d$a;", "callback", "", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;LB4/h$b;LA4/d$a;Z)V", "writable", "Landroid/database/sqlite/SQLiteDatabase;", "h", "(Z)Landroid/database/sqlite/SQLiteDatabase;", "g", "LA4/c;", "c", "(Z)LA4/c;", "sqLiteDatabase", "LB4/f;", "d", "(Landroid/database/sqlite/SQLiteDatabase;)LB4/f;", "", "onCreate", "(Landroid/database/sqlite/SQLiteDatabase;)V", "", "oldVersion", "newVersion", "onUpgrade", "(Landroid/database/sqlite/SQLiteDatabase;II)V", "db", "onConfigure", "onDowngrade", "onOpen", "close", "()V", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "LB4/h$b;", "getDbRef", "()LB4/h$b;", "LA4/d$a;", "getCallback", "()LA4/d$a;", "Z", "getAllowDataLossOnRecovery", "()Z", "e", "migrated", "LC4/a;", "f", "LC4/a;", "lock", "opened", "sqlite-framework_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class c extends SQLiteOpenHelper {

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Context context;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final b dbRef;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final d.a callback;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean allowDataLossOnRecovery;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean migrated;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final C4.a lock;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean opened;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LB4/h$c$a;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "LB4/h$c$b;", "callbackName", "", "cause", "<init>", "(LB4/h$c$b;Ljava/lang/Throwable;)V", "a", "LB4/h$c$b;", "()LB4/h$c$b;", "b", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "sqlite-framework_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        private static final class a extends RuntimeException {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final b callbackName;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final Throwable cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b callbackName, Throwable cause) {
                super(cause);
                Intrinsics.j(callbackName, "callbackName");
                Intrinsics.j(cause, "cause");
                this.callbackName = callbackName;
                this.cause = cause;
            }

            /* renamed from: a, reason: from getter */
            public final b getCallbackName() {
                return this.callbackName;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.cause;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"LB4/h$c$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "sqlite-framework_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            public static final b f2066a = new b("ON_CONFIGURE", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final b f2067b = new b("ON_CREATE", 1);

            /* renamed from: c, reason: collision with root package name */
            public static final b f2068c = new b("ON_UPGRADE", 2);

            /* renamed from: d, reason: collision with root package name */
            public static final b f2069d = new b("ON_DOWNGRADE", 3);

            /* renamed from: e, reason: collision with root package name */
            public static final b f2070e = new b("ON_OPEN", 4);

            /* renamed from: f, reason: collision with root package name */
            private static final /* synthetic */ b[] f2071f;

            /* renamed from: g, reason: collision with root package name */
            private static final /* synthetic */ EnumEntries f2072g;

            static {
                b[] bVarArrA = a();
                f2071f = bVarArrA;
                f2072g = EnumEntriesKt.a(bVarArrA);
            }

            private static final /* synthetic */ b[] a() {
                return new b[]{f2066a, f2067b, f2068c, f2069d, f2070e};
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) f2071f.clone();
            }

            private b(String str, int i10) {
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LB4/h$c$c;", "", "<init>", "()V", "LB4/h$b;", "refHolder", "Landroid/database/sqlite/SQLiteDatabase;", "sqLiteDatabase", "LB4/f;", "a", "(LB4/h$b;Landroid/database/sqlite/SQLiteDatabase;)LB4/f;", "sqlite-framework_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: B4.h$c$c, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final f a(b refHolder, SQLiteDatabase sqLiteDatabase) {
                Intrinsics.j(refHolder, "refHolder");
                Intrinsics.j(sqLiteDatabase, "sqLiteDatabase");
                f db2 = refHolder.getDb();
                if (db2 != null && db2.u(sqLiteDatabase)) {
                    return db2;
                }
                f fVar = new f(sqLiteDatabase);
                refHolder.b(fVar);
                return fVar;
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class d {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.f2066a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.f2067b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.f2068c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.f2069d.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.f2070e.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, String str, final b dbRef, final d.a callback, boolean z10) {
            String string;
            super(context, str, null, callback.version, new DatabaseErrorHandler() { // from class: B4.i
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    h.c.b(callback, dbRef, sQLiteDatabase);
                }
            });
            Intrinsics.j(context, "context");
            Intrinsics.j(dbRef, "dbRef");
            Intrinsics.j(callback, "callback");
            this.context = context;
            this.dbRef = dbRef;
            this.callback = callback;
            this.allowDataLossOnRecovery = z10;
            if (str == null) {
                string = UUID.randomUUID().toString();
                Intrinsics.i(string, "toString(...)");
            } else {
                string = str;
            }
            this.lock = new C4.a(string, context.getCacheDir(), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(d.a aVar, b bVar, SQLiteDatabase sQLiteDatabase) {
            Companion companion = INSTANCE;
            Intrinsics.g(sQLiteDatabase);
            aVar.c(companion.a(bVar, sQLiteDatabase));
        }

        private final SQLiteDatabase g(boolean writable) {
            if (writable) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                Intrinsics.g(writableDatabase);
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            Intrinsics.g(readableDatabase);
            return readableDatabase;
        }

        public final A4.c c(boolean writable) throws IOException {
            A4.c cVarD;
            try {
                this.lock.b((this.opened || getDatabaseName() == null) ? false : true);
                this.migrated = false;
                SQLiteDatabase sQLiteDatabaseH = h(writable);
                if (this.migrated) {
                    close();
                    cVarD = c(writable);
                } else {
                    cVarD = d(sQLiteDatabaseH);
                }
                this.lock.d();
                return cVarD;
            } catch (Throwable th2) {
                this.lock.d();
                throw th2;
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                C4.a.c(this.lock, false, 1, null);
                super.close();
                this.dbRef.b(null);
                this.opened = false;
            } finally {
                this.lock.d();
            }
        }

        public final f d(SQLiteDatabase sqLiteDatabase) {
            Intrinsics.j(sqLiteDatabase, "sqLiteDatabase");
            return INSTANCE.a(this.dbRef, sqLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase db2) {
            Intrinsics.j(db2, "db");
            if (!this.migrated && this.callback.version != db2.getVersion()) {
                db2.setMaxSqlCacheSize(1);
            }
            try {
                this.callback.b(d(db2));
            } catch (Throwable th2) {
                throw new a(b.f2066a, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            Intrinsics.j(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.callback.d(d(sqLiteDatabase));
            } catch (Throwable th2) {
                throw new a(b.f2067b, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase db2, int oldVersion, int newVersion) {
            Intrinsics.j(db2, "db");
            this.migrated = true;
            try {
                this.callback.e(d(db2), oldVersion, newVersion);
            } catch (Throwable th2) {
                throw new a(b.f2069d, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase db2) {
            Intrinsics.j(db2, "db");
            if (!this.migrated) {
                try {
                    this.callback.f(d(db2));
                } catch (Throwable th2) {
                    throw new a(b.f2070e, th2);
                }
            }
            this.opened = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
            Intrinsics.j(sqLiteDatabase, "sqLiteDatabase");
            this.migrated = true;
            try {
                this.callback.g(d(sqLiteDatabase), oldVersion, newVersion);
            } catch (Throwable th2) {
                throw new a(b.f2068c, th2);
            }
        }

        private final SQLiteDatabase h(boolean writable) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z10 = this.opened;
            if (databaseName != null && !z10 && (parentFile = this.context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    FS.log_w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return g(writable);
            } catch (Throwable unused) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return g(writable);
                } catch (Throwable th2) {
                    th = th2;
                    if (th instanceof a) {
                        a aVar = (a) th;
                        Throwable cause = aVar.getCause();
                        int i10 = d.$EnumSwitchMapping$0[aVar.getCallbackName().ordinal()];
                        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
                            if (i10 == 5) {
                                if (cause instanceof SQLiteException) {
                                    th = cause;
                                } else {
                                    throw cause;
                                }
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            throw cause;
                        }
                    }
                    if ((th instanceof SQLiteException) && databaseName != null && this.allowDataLossOnRecovery) {
                        this.context.deleteDatabase(databaseName);
                        try {
                            return g(writable);
                        } catch (a e10) {
                            throw e10.getCause();
                        }
                    }
                    throw th;
                }
            }
        }
    }

    @JvmOverloads
    public h(Context context, String str, d.a callback, boolean z10, boolean z11) {
        Intrinsics.j(context, "context");
        Intrinsics.j(callback, "callback");
        this.context = context;
        this.name = str;
        this.callback = callback;
        this.useNoBackupDirectory = z10;
        this.allowDataLossOnRecovery = z11;
        this.lazyDelegate = LazyKt.b(new Function0() { // from class: B4.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.c(this.f2046a);
            }
        });
    }

    private final c b() {
        return this.lazyDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c c(h hVar) {
        c cVar;
        if (hVar.name == null || !hVar.useNoBackupDirectory) {
            cVar = new c(hVar.context, hVar.name, new b(null), hVar.callback, hVar.allowDataLossOnRecovery);
        } else {
            cVar = new c(hVar.context, new File(A4.b.a(hVar.context), hVar.name).getAbsolutePath(), new b(null), hVar.callback, hVar.allowDataLossOnRecovery);
        }
        cVar.setWriteAheadLoggingEnabled(hVar.writeAheadLoggingEnabled);
        return cVar;
    }

    @Override // A4.d, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.lazyDelegate.a()) {
            b().close();
        }
    }

    @Override // A4.d
    /* renamed from: getDatabaseName, reason: from getter */
    public String getName() {
        return this.name;
    }

    @Override // A4.d
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        if (this.lazyDelegate.a()) {
            b().setWriteAheadLoggingEnabled(enabled);
        }
        this.writeAheadLoggingEnabled = enabled;
    }

    @Override // A4.d
    public A4.c D2() {
        return b().c(true);
    }
}
