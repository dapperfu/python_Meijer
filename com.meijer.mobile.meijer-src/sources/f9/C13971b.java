package f9;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import i9.C14700b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0017\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lf9/b;", "Lf9/a;", "Landroid/content/Context;", "context", "", "Li9/b;", "", "Ljava/lang/Runnable;", "triggerMap", "<init>", "(Landroid/content/Context;Ljava/util/Map;)V", "Landroid/database/sqlite/SQLiteDatabase;", "db", "", "onCreate", "(Landroid/database/sqlite/SQLiteDatabase;)V", "", "oldVersion", "newVersion", "onUpgrade", "(Landroid/database/sqlite/SQLiteDatabase;II)V", "b", "a", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: f9.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C13971b extends AbstractC13970a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13971b(Context context, Map<C14700b, List<Runnable>> triggerMap) {
        super(context, "EmarsysCore.db", 5, triggerMap);
        Intrinsics.j(context, "context");
        Intrinsics.j(triggerMap, "triggerMap");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase db2) throws SQLException {
        Intrinsics.j(db2, "db");
        onUpgrade(db2, 0, 5);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase db2, int oldVersion, int newVersion) throws SQLException {
        Intrinsics.j(db2, "db");
        while (oldVersion < newVersion) {
            for (String str : e9.b.MIGRATION[oldVersion]) {
                db2.execSQL(str);
            }
            oldVersion++;
        }
    }
}
