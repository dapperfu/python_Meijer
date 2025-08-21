package C4;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 F2\u00020\u0001:\u00019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\nJ\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$JE\u0010.\u001a\u00020&2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010\u000b2\u0012\u0010-\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010,\u0018\u00010+H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b0\u00101J)\u00103\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0010\u00102\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010,0+H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\bH\u0016¢\u0006\u0004\b5\u0010\u0011J\u0015\u00107\u001a\u00020\u00172\u0006\u00106\u001a\u00020\u0002¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0019R\u0016\u0010>\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u0019R(\u0010E\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0B\u0018\u00010A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006G"}, d2 = {"LC4/f;", "LB4/c;", "Landroid/database/sqlite/SQLiteDatabase;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;)V", "Landroid/database/sqlite/SQLiteTransactionListener;", "transactionListener", "", "p", "(Landroid/database/sqlite/SQLiteTransactionListener;)V", "", "sql", "LB4/g;", "Y1", "(Ljava/lang/String;)LB4/g;", "n", "()V", "A0", "f2", "l", "r", "q", "", "j3", "()Z", "query", "Landroid/database/Cursor;", "E2", "(Ljava/lang/String;)Landroid/database/Cursor;", "LB4/f;", "i0", "(LB4/f;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "T2", "(LB4/f;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "whereClause", "", "", "whereArgs", "u2", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "S", "(Ljava/lang/String;)V", "bindArgs", "z0", "(Ljava/lang/String;[Ljava/lang/Object;)V", "close", "sqLiteDatabase", "u", "(Landroid/database/sqlite/SQLiteDatabase;)Z", "a", "Landroid/database/sqlite/SQLiteDatabase;", "isOpen", "getPath", "()Ljava/lang/String;", "path", "z3", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "N", "()Ljava/util/List;", "attachedDbs", "b", "sqlite-framework_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class f implements B4.c {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f4080c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f4081d = new String[0];

    /* renamed from: e, reason: collision with root package name */
    private static final Lazy<Method> f4082e;

    /* renamed from: f, reason: collision with root package name */
    private static final Lazy<Method> f4083f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SQLiteDatabase delegate;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\f\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"LC4/f$a;", "", "<init>", "()V", "Ljava/lang/reflect/Method;", "getThreadSessionMethod$delegate", "Lkotlin/Lazy;", "d", "()Ljava/lang/reflect/Method;", "getThreadSessionMethod", "beginTransactionMethod$delegate", "c", "beginTransactionMethod", "", "", "CONFLICT_VALUES", "[Ljava/lang/String;", "EMPTY_STRING_ARRAY", "sqlite-framework_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: C4.f$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method c() {
            return (Method) f.f4083f.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method d() {
            return (Method) f.f4082e.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method j() {
        Class<?> returnType;
        try {
            Method methodD = INSTANCE.d();
            if (methodD == null || (returnType = methodD.getReturnType()) == null) {
                return null;
            }
            Class cls = Integer.TYPE;
            return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method m() {
        try {
            Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    private final void p(SQLiteTransactionListener transactionListener) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Companion companion = INSTANCE;
        if (companion.c() == null || companion.d() == null) {
            if (transactionListener != null) {
                l(transactionListener);
                return;
            } else {
                n();
                return;
            }
        }
        Method methodC = companion.c();
        Intrinsics.g(methodC);
        Method methodD = companion.d();
        Intrinsics.g(methodD);
        Object objInvoke = methodD.invoke(this.delegate, null);
        if (objInvoke == null) {
            throw new IllegalStateException("Required value was null.");
        }
        methodC.invoke(objInvoke, 0, transactionListener, 0, null);
    }

    @Override // B4.c
    public void f2() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        p(null);
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f143288c;
        f4082e = LazyKt.a(lazyThreadSafetyMode, new Function0() { // from class: C4.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.m();
            }
        });
        f4083f = LazyKt.a(lazyThreadSafetyMode, new Function0() { // from class: C4.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.j();
            }
        });
    }

    public f(SQLiteDatabase delegate) {
        Intrinsics.j(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor A(B4.f fVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.g(sQLiteQuery);
        fVar.b(new k(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SQLiteCursor w(B4.f fVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.g(sQLiteQuery);
        fVar.b(new k(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // B4.c
    public void A0() {
        this.delegate.beginTransactionNonExclusive();
    }

    @Override // B4.c
    public Cursor E2(String query) {
        Intrinsics.j(query, "query");
        return i0(new B4.a(query));
    }

    @Override // B4.c
    public List<Pair<String, String>> N() {
        return this.delegate.getAttachedDbs();
    }

    @Override // B4.c
    public void S(String sql) throws SQLException {
        Intrinsics.j(sql, "sql");
        this.delegate.execSQL(sql);
    }

    @Override // B4.c
    public Cursor T2(final B4.f query, CancellationSignal cancellationSignal) {
        Intrinsics.j(query, "query");
        SQLiteDatabase sQLiteDatabase = this.delegate;
        SQLiteDatabase.CursorFactory cursorFactory = new SQLiteDatabase.CursorFactory() { // from class: C4.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return f.A(query, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
            }
        };
        String query2 = query.getQuery();
        String[] strArr = f4081d;
        Intrinsics.g(cancellationSignal);
        Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, query2, strArr, null, cancellationSignal);
        Intrinsics.i(cursorRawQueryWithFactory, "rawQueryWithFactory(...)");
        return cursorRawQueryWithFactory;
    }

    @Override // B4.c
    public B4.g Y1(String sql) throws SQLException {
        Intrinsics.j(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.delegate.compileStatement(sql);
        Intrinsics.i(sQLiteStatementCompileStatement, "compileStatement(...)");
        return new l(sQLiteStatementCompileStatement);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // B4.c
    public String getPath() {
        return this.delegate.getPath();
    }

    @Override // B4.c
    public Cursor i0(final B4.f query) {
        Intrinsics.j(query, "query");
        final Function4 function4 = new Function4() { // from class: C4.b
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return f.w(query, (SQLiteDatabase) obj, (SQLiteCursorDriver) obj2, (String) obj3, (SQLiteQuery) obj4);
            }
        };
        Cursor cursorRawQueryWithFactory = this.delegate.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: C4.c
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return f.z(function4, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.getQuery(), f4081d, null);
        Intrinsics.i(cursorRawQueryWithFactory, "rawQueryWithFactory(...)");
        return cursorRawQueryWithFactory;
    }

    @Override // B4.c
    public boolean isOpen() {
        return this.delegate.isOpen();
    }

    @Override // B4.c
    public boolean j3() {
        return this.delegate.inTransaction();
    }

    public void l(SQLiteTransactionListener transactionListener) {
        Intrinsics.j(transactionListener, "transactionListener");
        this.delegate.beginTransactionWithListener(transactionListener);
    }

    @Override // B4.c
    public void n() {
        this.delegate.beginTransaction();
    }

    @Override // B4.c
    public void q() {
        this.delegate.setTransactionSuccessful();
    }

    @Override // B4.c
    public void r() {
        this.delegate.endTransaction();
    }

    public final boolean u(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.j(sqLiteDatabase, "sqLiteDatabase");
        return Intrinsics.e(this.delegate, sqLiteDatabase);
    }

    @Override // B4.c
    public int u2(String table, int conflictAlgorithm, ContentValues values, String whereClause, Object[] whereArgs) throws SQLException {
        Intrinsics.j(table, "table");
        Intrinsics.j(values, "values");
        if (values.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = values.size();
        int length = whereArgs == null ? size : whereArgs.length + size;
        Object[] objArr = new Object[length];
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE ");
        sb2.append(f4080c[conflictAlgorithm]);
        sb2.append(table);
        sb2.append(" SET ");
        int i10 = 0;
        for (String str : values.keySet()) {
            sb2.append(i10 > 0 ? "," : "");
            sb2.append(str);
            objArr[i10] = values.get(str);
            sb2.append("=?");
            i10++;
        }
        if (whereArgs != null) {
            for (int i11 = size; i11 < length; i11++) {
                objArr[i11] = whereArgs[i11 - size];
            }
        }
        if (!TextUtils.isEmpty(whereClause)) {
            sb2.append(" WHERE ");
            sb2.append(whereClause);
        }
        B4.g gVarY1 = Y1(sb2.toString());
        B4.a.INSTANCE.b(gVarY1, objArr);
        return gVarY1.a0();
    }

    @Override // B4.c
    public void z0(String sql, Object[] bindArgs) throws SQLException {
        Intrinsics.j(sql, "sql");
        Intrinsics.j(bindArgs, "bindArgs");
        this.delegate.execSQL(sql, bindArgs);
    }

    @Override // B4.c
    public boolean z3() {
        return this.delegate.isWriteAheadLoggingEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor z(Function4 function4, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return (Cursor) function4.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }
}
