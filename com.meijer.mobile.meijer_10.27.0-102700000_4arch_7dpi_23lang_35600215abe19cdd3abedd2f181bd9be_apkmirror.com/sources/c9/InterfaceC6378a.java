package c9;

import android.content.ContentValues;
import android.database.Cursor;
import g9.EnumC14223a;
import g9.EnumC14225c;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJq\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H&¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H&¢\u0006\u0004\b\u001f\u0010 J/\u0010(\u001a\u00020'2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H&¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020'H&¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020'H&¢\u0006\u0004\b,\u0010+J\u000f\u0010-\u001a\u00020'H&¢\u0006\u0004\b-\u0010+¨\u0006."}, d2 = {"Lc9/a;", "", "", "sql", "", "selectionArgs", "Landroid/database/Cursor;", "c", "(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;", "", "distinct", "table", "columns", "selection", "groupBy", "having", "orderBy", "limit", "b", "(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "nullColumnHack", "Landroid/content/ContentValues;", "values", "", "f", "(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J", "whereClause", "whereArgs", "", "a", "(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "e", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I", "Lg9/c;", "triggerType", "Lg9/a;", "triggerEvent", "Ljava/lang/Runnable;", "trigger", "", "d", "(Ljava/lang/String;Lg9/c;Lg9/a;Ljava/lang/Runnable;)V", "n", "()V", "q", "r", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: c9.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6378a {
    int a(String table, ContentValues values, String whereClause, String[] whereArgs);

    Cursor b(boolean distinct, String table, String[] columns, String selection, String[] selectionArgs, String groupBy, String having, String orderBy, String limit);

    Cursor c(String sql, String[] selectionArgs);

    void d(String table, EnumC14225c triggerType, EnumC14223a triggerEvent, Runnable trigger);

    int e(String table, String whereClause, String[] whereArgs);

    long f(String table, String nullColumnHack, ContentValues values);

    void n();

    void q();

    void r();
}
