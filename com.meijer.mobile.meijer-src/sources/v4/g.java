package v4;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.room.InterfaceC6262f;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import v4.g;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u000f\u0017\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lv4/g;", "LB4/d;", "Landroidx/room/f;", "delegate", "Lv4/b;", "autoCloser", "<init>", "(LB4/d;Lv4/b;)V", "", "close", "()V", "", "enabled", "setWriteAheadLoggingEnabled", "(Z)V", "a", "LB4/d;", "getDelegate", "()LB4/d;", "b", "Lv4/b;", "()Lv4/b;", "Lv4/g$a;", "c", "Lv4/g$a;", "autoClosingDb", "LB4/c;", "C2", "()LB4/c;", "writableDatabase", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements B4.d, InterfaceC6262f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final B4.d delegate;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v4.b autoCloser;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a autoClosingDb;

    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJE\u0010)\u001a\u00020!2\u0006\u0010 \u001a\u00020\t2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010\t2\u0012\u0010(\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010'\u0018\u00010&H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010,J)\u0010.\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0010\u0010-\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010'0&H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0014R\u0016\u00106\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00108\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0014R(\u0010=\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0:\u0018\u0001098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lv4/g$a;", "LB4/c;", "Lv4/b;", "autoCloser", "<init>", "(Lv4/b;)V", "", "i", "()V", "", "sql", "LB4/g;", "Y1", "(Ljava/lang/String;)LB4/g;", "n", "A0", "r", "q", "", "j3", "()Z", "query", "Landroid/database/Cursor;", "E2", "(Ljava/lang/String;)Landroid/database/Cursor;", "LB4/f;", "i0", "(LB4/f;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "T2", "(LB4/f;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "whereClause", "", "", "whereArgs", "u2", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "S", "(Ljava/lang/String;)V", "bindArgs", "z0", "(Ljava/lang/String;[Ljava/lang/Object;)V", "close", "a", "Lv4/b;", "isOpen", "getPath", "()Ljava/lang/String;", "path", "z3", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "N", "()Ljava/util/List;", "attachedDbs", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements B4.c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final v4.b autoCloser;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* synthetic */ class b extends FunctionReferenceImpl implements Function1<B4.c, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public static final b f165559b = new b();

            b() {
                super(1, B4.c.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(B4.c p02) {
                Intrinsics.j(p02, "p0");
                return Boolean.valueOf(p02.j3());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object j(B4.c it) {
            Intrinsics.j(it, "it");
            return null;
        }

        public a(v4.b autoCloser) {
            Intrinsics.j(autoCloser, "autoCloser");
            this.autoCloser = autoCloser;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(String str, B4.c db2) throws SQLException {
            Intrinsics.j(db2, "db");
            db2.S(str);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit h(String str, Object[] objArr, B4.c db2) throws SQLException {
            Intrinsics.j(db2, "db");
            db2.z0(str, objArr);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int l(String str, int i10, ContentValues contentValues, String str2, Object[] objArr, B4.c db2) {
            Intrinsics.j(db2, "db");
            return db2.u2(str, i10, contentValues, str2, objArr);
        }

        @Override // B4.c
        public void A0() {
            try {
                this.autoCloser.j().A0();
            } catch (Throwable th2) {
                this.autoCloser.g();
                throw th2;
            }
        }

        @Override // B4.c
        public Cursor E2(String query) {
            Intrinsics.j(query, "query");
            try {
                return new c(this.autoCloser.j().E2(query), this.autoCloser);
            } catch (Throwable th2) {
                this.autoCloser.g();
                throw th2;
            }
        }

        @Override // B4.c
        public List<Pair<String, String>> N() {
            return (List) this.autoCloser.h(new PropertyReference1Impl() { // from class: v4.g.a.a
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((B4.c) obj).N();
                }
            });
        }

        @Override // B4.c
        public void S(final String sql) throws SQLException {
            Intrinsics.j(sql, "sql");
            this.autoCloser.h(new Function1() { // from class: v4.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g.a.g(sql, (B4.c) obj);
                }
            });
        }

        @Override // B4.c
        public Cursor T2(B4.f query, CancellationSignal cancellationSignal) {
            Intrinsics.j(query, "query");
            try {
                return new c(this.autoCloser.j().T2(query, cancellationSignal), this.autoCloser);
            } catch (Throwable th2) {
                this.autoCloser.g();
                throw th2;
            }
        }

        @Override // B4.c
        public B4.g Y1(String sql) {
            Intrinsics.j(sql, "sql");
            return new b(sql, this.autoCloser);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.autoCloser.f();
        }

        @Override // B4.c
        public String getPath() {
            return (String) this.autoCloser.h(new PropertyReference1Impl() { // from class: v4.g.a.d
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((B4.c) obj).getPath();
                }
            });
        }

        public final void i() {
            this.autoCloser.h(new Function1() { // from class: v4.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g.a.j((B4.c) obj);
                }
            });
        }

        @Override // B4.c
        public Cursor i0(B4.f query) {
            Intrinsics.j(query, "query");
            try {
                return new c(this.autoCloser.j().i0(query), this.autoCloser);
            } catch (Throwable th2) {
                this.autoCloser.g();
                throw th2;
            }
        }

        @Override // B4.c
        public boolean isOpen() {
            B4.c delegateDatabase = this.autoCloser.getDelegateDatabase();
            if (delegateDatabase != null) {
                return delegateDatabase.isOpen();
            }
            return false;
        }

        @Override // B4.c
        public boolean j3() {
            if (this.autoCloser.getDelegateDatabase() == null) {
                return false;
            }
            return ((Boolean) this.autoCloser.h(b.f165559b)).booleanValue();
        }

        @Override // B4.c
        public void n() {
            try {
                this.autoCloser.j().n();
            } catch (Throwable th2) {
                this.autoCloser.g();
                throw th2;
            }
        }

        @Override // B4.c
        public void q() {
            B4.c delegateDatabase = this.autoCloser.getDelegateDatabase();
            Intrinsics.g(delegateDatabase);
            delegateDatabase.q();
        }

        @Override // B4.c
        public void r() {
            try {
                B4.c delegateDatabase = this.autoCloser.getDelegateDatabase();
                Intrinsics.g(delegateDatabase);
                delegateDatabase.r();
            } finally {
                this.autoCloser.g();
            }
        }

        @Override // B4.c
        public int u2(final String table, final int conflictAlgorithm, final ContentValues values, final String whereClause, final Object[] whereArgs) {
            Intrinsics.j(table, "table");
            Intrinsics.j(values, "values");
            return ((Number) this.autoCloser.h(new Function1() { // from class: v4.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(g.a.l(table, conflictAlgorithm, values, whereClause, whereArgs, (B4.c) obj));
                }
            })).intValue();
        }

        @Override // B4.c
        public void z0(final String sql, final Object[] bindArgs) throws SQLException {
            Intrinsics.j(sql, "sql");
            Intrinsics.j(bindArgs, "bindArgs");
            this.autoCloser.h(new Function1() { // from class: v4.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g.a.h(sql, bindArgs, (B4.c) obj);
                }
            });
        }

        @Override // B4.c
        public boolean z3() {
            return ((Boolean) this.autoCloser.h(new PropertyReference1Impl() { // from class: v4.g.a.c
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return Boolean.valueOf(((B4.c) obj).z3());
                }
            })).booleanValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0002\u0018\u0000 ,2\u00020\u0001:\u0001-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010!\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010!\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0010H\u0016¢\u0006\u0004\b,\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001e\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010A¨\u0006C"}, d2 = {"Lv4/g$b;", "LB4/g;", "", "sql", "Lv4/b;", "autoCloser", "<init>", "(Ljava/lang/String;Lv4/b;)V", "T", "Lkotlin/Function1;", "block", "p", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "columnType", "index", "", "i", "(II)V", "LB4/e;", "query", "g", "(LB4/e;)V", "close", "()V", "execute", "a0", "()I", "", "J1", "()J", "I", "(I)V", "value", "C", "(IJ)V", "", "o", "(ID)V", "S1", "(ILjava/lang/String;)V", "", "y2", "(I[B)V", "h", "a", "Ljava/lang/String;", "b", "Lv4/b;", "", "c", "[I", "bindingTypes", "", "d", "[J", "longBindings", "", "e", "[D", "doubleBindings", "", "f", "[Ljava/lang/String;", "stringBindings", "[[B", "blobBindings", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class b implements B4.g {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String sql;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final v4.b autoCloser;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int[] bindingTypes;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private long[] longBindings;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private double[] doubleBindings;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private String[] stringBindings;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private byte[][] blobBindings;

        private final void i(int columnType, int index) {
            int i10 = index + 1;
            int[] iArr = this.bindingTypes;
            if (iArr.length < i10) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
                Intrinsics.i(iArrCopyOf, "copyOf(...)");
                this.bindingTypes = iArrCopyOf;
            }
            if (columnType == 1) {
                long[] jArr = this.longBindings;
                if (jArr.length < i10) {
                    long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
                    Intrinsics.i(jArrCopyOf, "copyOf(...)");
                    this.longBindings = jArrCopyOf;
                    return;
                }
                return;
            }
            if (columnType == 2) {
                double[] dArr = this.doubleBindings;
                if (dArr.length < i10) {
                    double[] dArrCopyOf = Arrays.copyOf(dArr, i10);
                    Intrinsics.i(dArrCopyOf, "copyOf(...)");
                    this.doubleBindings = dArrCopyOf;
                    return;
                }
                return;
            }
            if (columnType == 3) {
                String[] strArr = this.stringBindings;
                if (strArr.length < i10) {
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, i10);
                    Intrinsics.i(objArrCopyOf, "copyOf(...)");
                    this.stringBindings = (String[]) objArrCopyOf;
                    return;
                }
                return;
            }
            if (columnType != 4) {
                return;
            }
            byte[][] bArr = this.blobBindings;
            if (bArr.length < i10) {
                Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i10);
                Intrinsics.i(objArrCopyOf2, "copyOf(...)");
                this.blobBindings = (byte[][]) objArrCopyOf2;
            }
        }

        @Override // B4.e
        public void C(int index, long value) {
            i(1, index);
            this.bindingTypes[index] = 1;
            this.longBindings[index] = value;
        }

        @Override // B4.e
        public void I(int index) {
            i(5, index);
            this.bindingTypes[index] = 5;
        }

        public void h() {
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        @Override // B4.e
        public void o(int index, double value) {
            i(2, index);
            this.bindingTypes[index] = 2;
            this.doubleBindings[index] = value;
        }

        public b(String sql, v4.b autoCloser) {
            Intrinsics.j(sql, "sql");
            Intrinsics.j(autoCloser, "autoCloser");
            this.sql = sql;
            this.autoCloser = autoCloser;
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        private final void g(B4.e query) {
            int length = this.bindingTypes.length;
            for (int i10 = 1; i10 < length; i10++) {
                int i11 = this.bindingTypes[i10];
                if (i11 == 1) {
                    query.C(i10, this.longBindings[i10]);
                } else if (i11 == 2) {
                    query.o(i10, this.doubleBindings[i10]);
                } else if (i11 == 3) {
                    String str = this.stringBindings[i10];
                    Intrinsics.g(str);
                    query.S1(i10, str);
                } else if (i11 == 4) {
                    byte[] bArr = this.blobBindings[i10];
                    Intrinsics.g(bArr);
                    query.y2(i10, bArr);
                } else if (i11 == 5) {
                    query.I(i10);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit j(B4.g statement) {
            Intrinsics.j(statement, "statement");
            statement.execute();
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long l(B4.g obj) {
            Intrinsics.j(obj, "obj");
            return obj.J1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int m(B4.g obj) {
            Intrinsics.j(obj, "obj");
            return obj.a0();
        }

        private final <T> T p(final Function1<? super B4.g, ? extends T> block) {
            return (T) this.autoCloser.h(new Function1() { // from class: v4.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g.b.u(this.f165572a, block, (B4.c) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object u(b bVar, Function1 function1, B4.c db2) {
            Intrinsics.j(db2, "db");
            B4.g gVarY1 = db2.Y1(bVar.sql);
            bVar.g(gVarY1);
            return function1.invoke(gVarY1);
        }

        @Override // B4.g
        public long J1() {
            return ((Number) p(new Function1() { // from class: v4.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Long.valueOf(g.b.l((B4.g) obj));
                }
            })).longValue();
        }

        @Override // B4.e
        public void S1(int index, String value) {
            Intrinsics.j(value, "value");
            i(3, index);
            this.bindingTypes[index] = 3;
            this.stringBindings[index] = value;
        }

        @Override // B4.g
        public int a0() {
            return ((Number) p(new Function1() { // from class: v4.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(g.b.m((B4.g) obj));
                }
            })).intValue();
        }

        @Override // B4.g
        public void execute() {
            p(new Function1() { // from class: v4.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g.b.j((B4.g) obj);
                }
            });
        }

        @Override // B4.e
        public void y2(int index, byte[] value) {
            Intrinsics.j(value, "value");
            i(4, index);
            this.bindingTypes[index] = 4;
            this.blobBindings[index] = value;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            h();
        }
    }

    @Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u0014J \u0010\u001e\u001a\u00020\n2\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001cH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010 \u001a\u00020\n2\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001cH\u0096\u0001¢\u0006\u0004\b \u0010\u001fJ \u0010!\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b!\u0010\"J6\u0010$\u001a(\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u001c0\u001c \u001d*\u0014\u0012\u000e\b\u0001\u0012\n \u001d*\u0004\u0018\u00010\u001c0\u001c\u0018\u00010#0#H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b&\u0010\fJ \u0010(\u001a\n \u001d*\u0004\u0018\u00010'0'2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b(\u0010)J \u0010*\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b*\u0010\"J(\u0010-\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\n2\u000e\u0010,\u001a\n \u001d*\u0004\u0018\u00010+0+H\u0096\u0001¢\u0006\u0004\b-\u0010.J\u0018\u00100\u001a\u00020/2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b2\u00103J\u0018\u00105\u001a\u0002042\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b5\u00106J\u0018\u00108\u001a\u0002072\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b8\u00109J\u0018\u0010;\u001a\u00020:2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b;\u0010<J\u0018\u0010=\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b=\u00103J\u0018\u0010>\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b>\u0010\u0011J\u0010\u0010?\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b?\u0010\tJ\u0010\u0010@\u001a\u00020\u000fH\u0097\u0001¢\u0006\u0004\b@\u0010\u0014J\u0010\u0010A\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\bA\u0010\u0014J \u0010C\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010B0BH\u0096\u0001¢\u0006\u0004\bC\u0010DJ \u0010E\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010B0BH\u0096\u0001¢\u0006\u0004\bE\u0010DJ \u0010G\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010F0FH\u0096\u0001¢\u0006\u0004\bG\u0010HJ \u0010I\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010F0FH\u0096\u0001¢\u0006\u0004\bI\u0010HJ0\u0010L\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010J0J2\u000e\u0010,\u001a\n \u001d*\u0004\u0018\u00010K0KH\u0096\u0001¢\u0006\u0004\bL\u0010MJ\u0018\u0010N\u001a\n \u001d*\u0004\u0018\u00010K0KH\u0096\u0001¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\bP\u0010\u0014J \u0010R\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010Q0QH\u0096\u0001¢\u0006\u0004\bR\u0010SJ\u0018\u0010T\u001a\n \u001d*\u0004\u0018\u00010Q0QH\u0096\u0001¢\u0006\u0004\bT\u0010UJ(\u0010V\u001a\n \u001d*\u0004\u0018\u00010Q0Q2\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010Q0QH\u0096\u0001¢\u0006\u0004\bV\u0010WR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[¨\u0006\\"}, d2 = {"Lv4/g$c;", "Landroid/database/Cursor;", "delegate", "Lv4/b;", "autoCloser", "<init>", "(Landroid/database/Cursor;Lv4/b;)V", "", "close", "()V", "", "getCount", "()I", "getPosition", "p0", "", "move", "(I)Z", "moveToPosition", "moveToFirst", "()Z", "moveToLast", "moveToNext", "moveToPrevious", "isFirst", "isLast", "isBeforeFirst", "isAfterLast", "", "kotlin.jvm.PlatformType", "getColumnIndex", "(Ljava/lang/String;)I", "getColumnIndexOrThrow", "getColumnName", "(I)Ljava/lang/String;", "", "getColumnNames", "()[Ljava/lang/String;", "getColumnCount", "", "getBlob", "(I)[B", "getString", "Landroid/database/CharArrayBuffer;", "p1", "copyStringToBuffer", "(ILandroid/database/CharArrayBuffer;)V", "", "getShort", "(I)S", "getInt", "(I)I", "", "getLong", "(I)J", "", "getFloat", "(I)F", "", "getDouble", "(I)D", "getType", "isNull", "deactivate", "requery", "isClosed", "Landroid/database/ContentObserver;", "registerContentObserver", "(Landroid/database/ContentObserver;)V", "unregisterContentObserver", "Landroid/database/DataSetObserver;", "registerDataSetObserver", "(Landroid/database/DataSetObserver;)V", "unregisterDataSetObserver", "Landroid/content/ContentResolver;", "Landroid/net/Uri;", "setNotificationUri", "(Landroid/content/ContentResolver;Landroid/net/Uri;)V", "getNotificationUri", "()Landroid/net/Uri;", "getWantsAllOnMoveCalls", "Landroid/os/Bundle;", "setExtras", "(Landroid/os/Bundle;)V", "getExtras", "()Landroid/os/Bundle;", "respond", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "a", "Landroid/database/Cursor;", "b", "Lv4/b;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class c implements Cursor {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Cursor delegate;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final v4.b autoCloser;

        public c(Cursor delegate, v4.b autoCloser) {
            Intrinsics.j(delegate, "delegate");
            Intrinsics.j(autoCloser, "autoCloser");
            this.delegate = delegate;
            this.autoCloser = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
            this.autoCloser.g();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int p02, CharArrayBuffer p12) {
            this.delegate.copyStringToBuffer(p02, p12);
        }

        @Override // android.database.Cursor
        @Deprecated
        public void deactivate() {
            this.delegate.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int p02) {
            return this.delegate.getBlob(p02);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.delegate.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String p02) {
            return this.delegate.getColumnIndex(p02);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String p02) {
            return this.delegate.getColumnIndexOrThrow(p02);
        }

        @Override // android.database.Cursor
        public String getColumnName(int p02) {
            return this.delegate.getColumnName(p02);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.delegate.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.delegate.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int p02) {
            return this.delegate.getDouble(p02);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.delegate.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int p02) {
            return this.delegate.getFloat(p02);
        }

        @Override // android.database.Cursor
        public int getInt(int p02) {
            return this.delegate.getInt(p02);
        }

        @Override // android.database.Cursor
        public long getLong(int p02) {
            return this.delegate.getLong(p02);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return this.delegate.getNotificationUri();
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.delegate.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int p02) {
            return this.delegate.getShort(p02);
        }

        @Override // android.database.Cursor
        public String getString(int p02) {
            return this.delegate.getString(p02);
        }

        @Override // android.database.Cursor
        public int getType(int p02) {
            return this.delegate.getType(p02);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.delegate.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.delegate.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.delegate.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.delegate.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.delegate.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.delegate.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int p02) {
            return this.delegate.isNull(p02);
        }

        @Override // android.database.Cursor
        public boolean move(int p02) {
            return this.delegate.move(p02);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.delegate.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.delegate.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.delegate.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int p02) {
            return this.delegate.moveToPosition(p02);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.delegate.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver p02) {
            this.delegate.registerContentObserver(p02);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver p02) {
            this.delegate.registerDataSetObserver(p02);
        }

        @Override // android.database.Cursor
        @Deprecated
        public boolean requery() {
            return this.delegate.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle p02) {
            return this.delegate.respond(p02);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle p02) {
            this.delegate.setExtras(p02);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver p02, Uri p12) {
            this.delegate.setNotificationUri(p02, p12);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver p02) {
            this.delegate.unregisterContentObserver(p02);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver p02) {
            this.delegate.unregisterDataSetObserver(p02);
        }
    }

    public g(B4.d delegate, v4.b autoCloser) {
        Intrinsics.j(delegate, "delegate");
        Intrinsics.j(autoCloser, "autoCloser");
        this.delegate = delegate;
        this.autoCloser = autoCloser;
        this.autoClosingDb = new a(autoCloser);
        autoCloser.l(getDelegate());
    }

    @Override // B4.d
    public B4.c C2() {
        this.autoClosingDb.i();
        return this.autoClosingDb;
    }

    /* renamed from: a, reason: from getter */
    public final v4.b getAutoCloser() {
        return this.autoCloser;
    }

    @Override // B4.d, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.autoClosingDb.close();
    }

    @Override // B4.d
    /* renamed from: getDatabaseName */
    public String getName() {
        return this.delegate.getName();
    }

    @Override // androidx.room.InterfaceC6262f
    public B4.d getDelegate() {
        return this.delegate;
    }

    @Override // B4.d
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        this.delegate.setWriteAheadLoggingEnabled(enabled);
    }
}
