package e9;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import i9.C14700b;
import i9.EnumC14699a;
import i9.EnumC14701c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\b\u0017\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0012¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u000b2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019Jq\u0010#\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000b2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b#\u0010$J/\u0010&\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u0007H\u0016¢\u0006\u0004\b&\u0010'J)\u0010,\u001a\u00020+2\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010\u000b2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b,\u0010-J9\u00101\u001a\u0002002\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)2\b\u0010.\u001a\u0004\u0018\u00010\u000b2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0015H\u0016¢\u0006\u0004\b1\u00102J1\u00103\u001a\u0002002\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010.\u001a\u0004\u0018\u00010\u000b2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0015H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0011H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0011H\u0016¢\u0006\u0004\b7\u00106J\u000f\u00108\u001a\u00020\u0011H\u0016¢\u0006\u0004\b8\u00106R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00109\u001a\u0004\b:\u0010;R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b&\u0010<R\u0016\u0010>\u001a\u00020\u001a8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b#\u0010=¨\u0006?"}, d2 = {"Le9/c;", "Le9/a;", "Landroid/database/sqlite/SQLiteDatabase;", "backingDatabase", "", "Li9/b;", "", "Ljava/lang/Runnable;", "registeredTriggers", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/util/Map;)V", "", "tableName", "Li9/c;", "triggerType", "Li9/a;", "triggerEvent", "", "h", "(Ljava/lang/String;Li9/c;Li9/a;)V", "sql", "", "selectionArgs", "Landroid/database/Cursor;", "d", "(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;", "", "distinct", "table", "columns", "selection", "groupBy", "having", "orderBy", "limit", "c", "(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "trigger", "b", "(Ljava/lang/String;Li9/c;Li9/a;Ljava/lang/Runnable;)V", "nullColumnHack", "Landroid/content/ContentValues;", "values", "", "f", "(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J", "whereClause", "whereArgs", "", "a", "(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "e", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I", "n", "()V", "q", "r", "Landroid/database/sqlite/SQLiteDatabase;", "g", "()Landroid/database/sqlite/SQLiteDatabase;", "Ljava/util/Map;", "Z", "locked", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public class c implements InterfaceC13782a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SQLiteDatabase backingDatabase;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<C14700b, List<Runnable>> registeredTriggers;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean locked;

    public c(SQLiteDatabase backingDatabase, Map<C14700b, List<Runnable>> registeredTriggers) {
        Intrinsics.j(backingDatabase, "backingDatabase");
        Intrinsics.j(registeredTriggers, "registeredTriggers");
        this.backingDatabase = backingDatabase;
        this.registeredTriggers = registeredTriggers;
    }

    private void h(String tableName, EnumC14701c triggerType, EnumC14699a triggerEvent) {
        if (this.locked) {
            return;
        }
        this.locked = true;
        List<Runnable> list = this.registeredTriggers.get(new C14700b(tableName, triggerType, triggerEvent));
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.locked = false;
    }

    @Override // e9.InterfaceC13782a
    public int a(String table, ContentValues values, String whereClause, String[] whereArgs) {
        Intrinsics.j(table, "table");
        Intrinsics.j(values, "values");
        EnumC14701c enumC14701c = EnumC14701c.f137424a;
        EnumC14699a enumC14699a = EnumC14699a.f137418c;
        h(table, enumC14701c, enumC14699a);
        int iUpdate = getBackingDatabase().update(table, values, whereClause, whereArgs);
        h(table, EnumC14701c.f137425b, enumC14699a);
        return iUpdate;
    }

    @Override // e9.InterfaceC13782a
    public void b(String table, EnumC14701c triggerType, EnumC14699a triggerEvent, Runnable trigger) {
        Intrinsics.j(table, "table");
        Intrinsics.j(triggerType, "triggerType");
        Intrinsics.j(triggerEvent, "triggerEvent");
        Intrinsics.j(trigger, "trigger");
        C14700b c14700b = new C14700b(table, triggerType, triggerEvent);
        List<Runnable> arrayList = this.registeredTriggers.get(c14700b);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(trigger);
        this.registeredTriggers.put(c14700b, arrayList);
    }

    @Override // e9.InterfaceC13782a
    public Cursor c(boolean distinct, String table, String[] columns, String selection, String[] selectionArgs, String groupBy, String having, String orderBy, String limit) {
        Intrinsics.j(table, "table");
        Cursor cursorQuery = getBackingDatabase().query(distinct, table, columns, selection, selectionArgs, groupBy, having, orderBy, limit);
        Intrinsics.i(cursorQuery, "query(...)");
        return cursorQuery;
    }

    @Override // e9.InterfaceC13782a
    public Cursor d(String sql, String[] selectionArgs) {
        Intrinsics.j(sql, "sql");
        Cursor cursorRawQuery = getBackingDatabase().rawQuery(sql, selectionArgs);
        Intrinsics.i(cursorRawQuery, "rawQuery(...)");
        return cursorRawQuery;
    }

    @Override // e9.InterfaceC13782a
    public int e(String table, String whereClause, String[] whereArgs) {
        Intrinsics.j(table, "table");
        EnumC14701c enumC14701c = EnumC14701c.f137424a;
        EnumC14699a enumC14699a = EnumC14699a.f137417b;
        h(table, enumC14701c, enumC14699a);
        int iDelete = getBackingDatabase().delete(table, whereClause, whereArgs);
        h(table, EnumC14701c.f137425b, enumC14699a);
        return iDelete;
    }

    @Override // e9.InterfaceC13782a
    public long f(String table, String nullColumnHack, ContentValues values) {
        Intrinsics.j(table, "table");
        Intrinsics.j(values, "values");
        EnumC14701c enumC14701c = EnumC14701c.f137424a;
        EnumC14699a enumC14699a = EnumC14699a.f137416a;
        h(table, enumC14701c, enumC14699a);
        long jInsert = getBackingDatabase().insert(table, nullColumnHack, values);
        h(table, EnumC14701c.f137425b, enumC14699a);
        return jInsert;
    }

    /* renamed from: g, reason: from getter */
    public SQLiteDatabase getBackingDatabase() {
        return this.backingDatabase;
    }

    @Override // e9.InterfaceC13782a
    public void n() {
        getBackingDatabase().beginTransaction();
    }

    @Override // e9.InterfaceC13782a
    public void q() {
        getBackingDatabase().setTransactionSuccessful();
    }

    @Override // e9.InterfaceC13782a
    public void r() {
        getBackingDatabase().endTransaction();
    }
}
