package c9;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import g9.C14224b;
import g9.EnumC14223a;
import g9.EnumC14225c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\b\u0017\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0012¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u000b2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019Jq\u0010#\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000b2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b#\u0010$J/\u0010&\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u0007H\u0016¢\u0006\u0004\b&\u0010'J)\u0010,\u001a\u00020+2\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010\u000b2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b,\u0010-J9\u00101\u001a\u0002002\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)2\b\u0010.\u001a\u0004\u0018\u00010\u000b2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0015H\u0016¢\u0006\u0004\b1\u00102J1\u00103\u001a\u0002002\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010.\u001a\u0004\u0018\u00010\u000b2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0015H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0011H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0011H\u0016¢\u0006\u0004\b7\u00106J\u000f\u00108\u001a\u00020\u0011H\u0016¢\u0006\u0004\b8\u00106R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00109\u001a\u0004\b:\u0010;R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b#\u0010<R\u0016\u0010>\u001a\u00020\u001a8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010=¨\u0006?"}, d2 = {"Lc9/c;", "Lc9/a;", "Landroid/database/sqlite/SQLiteDatabase;", "backingDatabase", "", "Lg9/b;", "", "Ljava/lang/Runnable;", "registeredTriggers", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/util/Map;)V", "", "tableName", "Lg9/c;", "triggerType", "Lg9/a;", "triggerEvent", "", "h", "(Ljava/lang/String;Lg9/c;Lg9/a;)V", "sql", "", "selectionArgs", "Landroid/database/Cursor;", "c", "(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;", "", "distinct", "table", "columns", "selection", "groupBy", "having", "orderBy", "limit", "b", "(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "trigger", "d", "(Ljava/lang/String;Lg9/c;Lg9/a;Ljava/lang/Runnable;)V", "nullColumnHack", "Landroid/content/ContentValues;", "values", "", "f", "(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J", "whereClause", "whereArgs", "", "a", "(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "e", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I", "n", "()V", "q", "r", "Landroid/database/sqlite/SQLiteDatabase;", "g", "()Landroid/database/sqlite/SQLiteDatabase;", "Ljava/util/Map;", "Z", "locked", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public class c implements InterfaceC6378a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SQLiteDatabase backingDatabase;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<C14224b, List<Runnable>> registeredTriggers;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean locked;

    public c(SQLiteDatabase backingDatabase, Map<C14224b, List<Runnable>> registeredTriggers) {
        Intrinsics.j(backingDatabase, "backingDatabase");
        Intrinsics.j(registeredTriggers, "registeredTriggers");
        this.backingDatabase = backingDatabase;
        this.registeredTriggers = registeredTriggers;
    }

    private void h(String tableName, EnumC14225c triggerType, EnumC14223a triggerEvent) {
        if (this.locked) {
            return;
        }
        this.locked = true;
        List<Runnable> list = this.registeredTriggers.get(new C14224b(tableName, triggerType, triggerEvent));
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.locked = false;
    }

    @Override // c9.InterfaceC6378a
    public int a(String table, ContentValues values, String whereClause, String[] whereArgs) {
        Intrinsics.j(table, "table");
        Intrinsics.j(values, "values");
        EnumC14225c enumC14225c = EnumC14225c.f133208a;
        EnumC14223a enumC14223a = EnumC14223a.f133202c;
        h(table, enumC14225c, enumC14223a);
        int iUpdate = getBackingDatabase().update(table, values, whereClause, whereArgs);
        h(table, EnumC14225c.f133209b, enumC14223a);
        return iUpdate;
    }

    @Override // c9.InterfaceC6378a
    public Cursor b(boolean distinct, String table, String[] columns, String selection, String[] selectionArgs, String groupBy, String having, String orderBy, String limit) {
        Intrinsics.j(table, "table");
        Cursor cursorQuery = getBackingDatabase().query(distinct, table, columns, selection, selectionArgs, groupBy, having, orderBy, limit);
        Intrinsics.i(cursorQuery, "query(...)");
        return cursorQuery;
    }

    @Override // c9.InterfaceC6378a
    public Cursor c(String sql, String[] selectionArgs) {
        Intrinsics.j(sql, "sql");
        Cursor cursorRawQuery = getBackingDatabase().rawQuery(sql, selectionArgs);
        Intrinsics.i(cursorRawQuery, "rawQuery(...)");
        return cursorRawQuery;
    }

    @Override // c9.InterfaceC6378a
    public void d(String table, EnumC14225c triggerType, EnumC14223a triggerEvent, Runnable trigger) {
        Intrinsics.j(table, "table");
        Intrinsics.j(triggerType, "triggerType");
        Intrinsics.j(triggerEvent, "triggerEvent");
        Intrinsics.j(trigger, "trigger");
        C14224b c14224b = new C14224b(table, triggerType, triggerEvent);
        List<Runnable> arrayList = this.registeredTriggers.get(c14224b);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(trigger);
        this.registeredTriggers.put(c14224b, arrayList);
    }

    @Override // c9.InterfaceC6378a
    public int e(String table, String whereClause, String[] whereArgs) {
        Intrinsics.j(table, "table");
        EnumC14225c enumC14225c = EnumC14225c.f133208a;
        EnumC14223a enumC14223a = EnumC14223a.f133201b;
        h(table, enumC14225c, enumC14223a);
        int iDelete = getBackingDatabase().delete(table, whereClause, whereArgs);
        h(table, EnumC14225c.f133209b, enumC14223a);
        return iDelete;
    }

    @Override // c9.InterfaceC6378a
    public long f(String table, String nullColumnHack, ContentValues values) {
        Intrinsics.j(table, "table");
        Intrinsics.j(values, "values");
        EnumC14225c enumC14225c = EnumC14225c.f133208a;
        EnumC14223a enumC14223a = EnumC14223a.f133200a;
        h(table, enumC14225c, enumC14223a);
        long jInsert = getBackingDatabase().insert(table, nullColumnHack, values);
        h(table, EnumC14225c.f133209b, enumC14223a);
        return jInsert;
    }

    /* renamed from: g, reason: from getter */
    public SQLiteDatabase getBackingDatabase() {
        return this.backingDatabase;
    }

    @Override // c9.InterfaceC6378a
    public void n() {
        getBackingDatabase().beginTransaction();
    }

    @Override // c9.InterfaceC6378a
    public void q() {
        getBackingDatabase().setTransactionSuccessful();
    }

    @Override // c9.InterfaceC6378a
    public void r() {
        getBackingDatabase().endTransaction();
    }
}
