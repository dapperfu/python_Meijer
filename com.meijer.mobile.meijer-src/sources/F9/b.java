package F9;

import android.content.ContentValues;
import android.database.Cursor;
import com.emarsys.core.util.serialization.SerializationException;
import f9.C13971b;
import g9.AbstractC14341b;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LF9/b;", "Lg9/b;", "LF9/a;", "Lf9/b;", "coreDbHelper", "Ln9/b;", "concurrentHandlerHolder", "<init>", "(Lf9/b;Ln9/b;)V", "item", "Landroid/content/ContentValues;", "h", "(LF9/a;)Landroid/content/ContentValues;", "Landroid/database/Cursor;", "cursor", "i", "(Landroid/database/Cursor;)LF9/a;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public class b extends AbstractC14341b<a> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C13971b coreDbHelper, n9.b concurrentHandlerHolder) {
        super("shard", coreDbHelper, concurrentHandlerHolder);
        Intrinsics.j(coreDbHelper, "coreDbHelper");
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
    }

    @Override // g9.AbstractC14341b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public ContentValues c(a item) {
        Intrinsics.j(item, "item");
        ContentValues contentValues = new ContentValues();
        contentValues.put("shard_id", item.b());
        contentValues.put("type", item.e());
        contentValues.put("data", N9.a.b(item.a()));
        contentValues.put("timestamp", Long.valueOf(item.c()));
        contentValues.put("ttl", Long.valueOf(item.d()));
        return contentValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.Map] */
    @Override // g9.AbstractC14341b
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public a d(Cursor cursor) {
        HashMap map;
        Object objA;
        Intrinsics.j(cursor, "cursor");
        String string = cursor.getString(cursor.getColumnIndexOrThrow("shard_id"));
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("type"));
        try {
            objA = N9.a.a(cursor.getBlob(cursor.getColumnIndexOrThrow("data")));
            Intrinsics.i(objA, "blobToSerializable(...)");
        } catch (SerializationException | ClassCastException unused) {
            map = new HashMap();
        }
        if (!(objA instanceof Map)) {
            throw new ClassCastException();
        }
        map = (Map) objA;
        return new a(string, string2, map, cursor.getLong(cursor.getColumnIndexOrThrow("timestamp")), cursor.getLong(cursor.getColumnIndexOrThrow("ttl")));
    }
}
