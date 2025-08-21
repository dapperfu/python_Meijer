package B4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Pair;
import com.fullstory.FS;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"LB4/d;", "Ljava/io/Closeable;", "", "enabled", "", "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "LB4/c;", "C2", "()LB4/c;", "writableDatabase", "a", "b", "c", "sqlite_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface d extends Closeable {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000 \r2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u0018"}, d2 = {"LB4/d$a;", "", "", "version", "<init>", "(I)V", "", "fileName", "", "a", "(Ljava/lang/String;)V", "LB4/c;", "db", "b", "(LB4/c;)V", "d", "oldVersion", "newVersion", "g", "(LB4/c;II)V", "e", "f", "c", "I", "sqlite_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final int version;

        public void b(B4.c db2) {
            Intrinsics.j(db2, "db");
        }

        public abstract void d(B4.c db2);

        public abstract void e(B4.c db2, int oldVersion, int newVersion);

        public void f(B4.c db2) {
            Intrinsics.j(db2, "db");
        }

        public abstract void g(B4.c db2, int oldVersion, int newVersion);

        private final void a(String fileName) {
            if (StringsKt.H(fileName, ":memory:", true)) {
                return;
            }
            int length = fileName.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = Intrinsics.k(fileName.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            if (fileName.subSequence(i10, length + 1).toString().length() == 0) {
                return;
            }
            FS.log_w("SupportSQLite", "deleting the database file: " + fileName);
            try {
                SQLiteDatabase.deleteDatabase(new File(fileName));
            } catch (Exception e10) {
                FS.log_w("SupportSQLite", "delete failed: ", e10);
            }
        }

        public void c(B4.c db2) {
            Intrinsics.j(db2, "db");
            FS.log_e("SupportSQLite", "Corruption reported by sqlite on database: " + db2 + ".path");
            if (!db2.isOpen()) {
                String path = db2.getPath();
                if (path != null) {
                    a(path);
                    return;
                }
                return;
            }
            List<Pair<String, String>> listN = null;
            try {
                try {
                    listN = db2.N();
                } catch (SQLiteException unused) {
                }
                try {
                    db2.close();
                } catch (IOException unused2) {
                }
                if (listN != null) {
                    return;
                }
            } finally {
                if (listN != null) {
                    Iterator<T> it = listN.iterator();
                    while (it.hasNext()) {
                        Object second = ((Pair) it.next()).second;
                        Intrinsics.i(second, "second");
                        a((String) second);
                    }
                } else {
                    String path2 = db2.getPath();
                    if (path2 != null) {
                        a(path2);
                    }
                }
            }
        }

        public a(int i10) {
            this.version = i10;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000 \u00162\u00020\u0001:\u0002\r\u000fB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, d2 = {"LB4/d$b;", "", "Landroid/content/Context;", "context", "", "name", "LB4/d$a;", "callback", "", "useNoBackupDirectory", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;LB4/d$a;ZZ)V", "a", "Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "LB4/d$a;", "d", "Z", "e", "f", "sqlite_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final Context context;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final String name;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final a callback;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final boolean useNoBackupDirectory;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final boolean allowDataLossOnRecovery;

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0016\u0010\u0015\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"LB4/d$b$a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "LB4/d$b;", "b", "()LB4/d$b;", "", "name", "d", "(Ljava/lang/String;)LB4/d$b$a;", "LB4/d$a;", "callback", "c", "(LB4/d$a;)LB4/d$b$a;", "", "useNoBackupDirectory", "e", "(Z)LB4/d$b$a;", "allowDataLossOnRecovery", "a", "Landroid/content/Context;", "Ljava/lang/String;", "LB4/d$a;", "Z", "sqlite_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @SourceDebugExtension
        public static class a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final Context context;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private String name;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private a callback;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private boolean useNoBackupDirectory;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            private boolean allowDataLossOnRecovery;

            public a(Context context) {
                Intrinsics.j(context, "context");
                this.context = context;
            }

            public a a(boolean allowDataLossOnRecovery) {
                this.allowDataLossOnRecovery = allowDataLossOnRecovery;
                return this;
            }

            public b b() {
                String str;
                a aVar = this.callback;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.useNoBackupDirectory && ((str = this.name) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.context, this.name, aVar, this.useNoBackupDirectory, this.allowDataLossOnRecovery);
            }

            public a c(a callback) {
                Intrinsics.j(callback, "callback");
                this.callback = callback;
                return this;
            }

            public a d(String name) {
                this.name = name;
                return this;
            }

            public a e(boolean useNoBackupDirectory) {
                this.useNoBackupDirectory = useNoBackupDirectory;
                return this;
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LB4/d$b$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LB4/d$b$a;", "a", "(Landroid/content/Context;)LB4/d$b$a;", "sqlite_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: B4.d$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final a a(Context context) {
                Intrinsics.j(context, "context");
                return new a(context);
            }
        }

        @JvmStatic
        public static final a a(Context context) {
            return INSTANCE.a(context);
        }

        public b(Context context, String str, a callback, boolean z10, boolean z11) {
            Intrinsics.j(context, "context");
            Intrinsics.j(callback, "callback");
            this.context = context;
            this.name = str;
            this.callback = callback;
            this.useNoBackupDirectory = z10;
            this.allowDataLossOnRecovery = z11;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"LB4/d$c;", "", "LB4/d$b;", "configuration", "LB4/d;", "a", "(LB4/d$b;)LB4/d;", "sqlite_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface c {
        d a(b configuration);
    }

    B4.c C2();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean enabled);
}
