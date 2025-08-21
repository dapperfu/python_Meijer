package B4;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\r\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\tJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJE\u0010%\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u00022\u0012\u0010$\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010#\u0018\u00010\"H&¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b'\u0010(J)\u0010*\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010)\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010#0\"H&¢\u0006\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0010R\u0016\u0010/\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0010R(\u00106\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000203\u0018\u0001028&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00067À\u0006\u0001"}, d2 = {"LB4/c;", "Ljava/io/Closeable;", "", "sql", "LB4/g;", "Y1", "(Ljava/lang/String;)LB4/g;", "", "n", "()V", "A0", "f2", "r", "q", "", "j3", "()Z", "query", "Landroid/database/Cursor;", "E2", "(Ljava/lang/String;)Landroid/database/Cursor;", "LB4/f;", "i0", "(LB4/f;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "T2", "(LB4/f;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "whereClause", "", "", "whereArgs", "u2", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "S", "(Ljava/lang/String;)V", "bindArgs", "z0", "(Ljava/lang/String;[Ljava/lang/Object;)V", "isOpen", "getPath", "()Ljava/lang/String;", "path", "z3", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "N", "()Ljava/util/List;", "attachedDbs", "sqlite_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface c extends Closeable {
    void A0();

    Cursor E2(String query);

    List<Pair<String, String>> N();

    void S(String sql) throws SQLException;

    Cursor T2(f query, CancellationSignal cancellationSignal);

    g Y1(String sql);

    String getPath();

    Cursor i0(f query);

    boolean isOpen();

    boolean j3();

    void n();

    void q();

    void r();

    int u2(String table, int conflictAlgorithm, ContentValues values, String whereClause, Object[] whereArgs);

    void z0(String sql, Object[] bindArgs) throws SQLException;

    boolean z3();

    default void f2() {
        n();
    }
}
