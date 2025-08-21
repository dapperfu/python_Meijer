package f9;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import e9.InterfaceC13782a;
import i9.C14700b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\t¢\u0006\u0004\b\u000e\u0010\u000fR&\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0017"}, d2 = {"Lf9/a;", "Landroid/database/sqlite/SQLiteOpenHelper;", "Lf9/c;", "Landroid/content/Context;", "context", "", "databaseName", "", "databaseVersion", "", "Li9/b;", "", "Ljava/lang/Runnable;", "triggerMap", "<init>", "(Landroid/content/Context;Ljava/lang/String;ILjava/util/Map;)V", "a", "Ljava/util/Map;", "Le9/a;", "()Le9/a;", "readableCoreDatabase", "b", "writableCoreDatabase", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: f9.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC13970a extends SQLiteOpenHelper implements c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<C14700b, List<Runnable>> triggerMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC13970a(Context context, String databaseName, int i10, Map<C14700b, List<Runnable>> triggerMap) {
        super(context, databaseName, (SQLiteDatabase.CursorFactory) null, i10);
        Intrinsics.j(context, "context");
        Intrinsics.j(databaseName, "databaseName");
        Intrinsics.j(triggerMap, "triggerMap");
        this.triggerMap = triggerMap;
    }

    @Override // f9.c
    public InterfaceC13782a a() {
        SQLiteDatabase readableDatabase = super.getReadableDatabase();
        Intrinsics.i(readableDatabase, "getReadableDatabase(...)");
        return new e9.c(readableDatabase, this.triggerMap);
    }

    @Override // f9.c
    public InterfaceC13782a b() {
        SQLiteDatabase writableDatabase = super.getWritableDatabase();
        Intrinsics.i(writableDatabase, "getWritableDatabase(...)");
        return new e9.c(writableDatabase, this.triggerMap);
    }
}
