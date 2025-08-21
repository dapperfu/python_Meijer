package A9;

import android.content.ContentValues;
import android.database.Cursor;
import com.emarsys.core.util.serialization.SerializationException;
import g9.AbstractC14341b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class e extends AbstractC14341b<c> {
    public e(f9.c cVar, n9.b bVar) {
        super("request", cVar, bVar);
    }

    @Override // g9.AbstractC14341b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public ContentValues c(c cVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("request_id", cVar.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
        contentValues.put("method", cVar.getMethod().name());
        contentValues.put("url", cVar.getUrl().toString());
        contentValues.put("headers", N9.a.b(cVar.a()));
        contentValues.put("payload", N9.a.b(cVar.d()));
        contentValues.put("timestamp", Long.valueOf(cVar.getTimestamp()));
        contentValues.put("ttl", Long.valueOf(cVar.getTtl()));
        return contentValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Map] */
    @Override // g9.AbstractC14341b
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public c d(Cursor cursor) {
        HashMap map;
        HashMap map2;
        String string = cursor.getString(cursor.getColumnIndexOrThrow("request_id"));
        b bVarValueOf = b.valueOf(cursor.getString(cursor.getColumnIndexOrThrow("method")));
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("url"));
        try {
            map = (Map) N9.a.a(cursor.getBlob(cursor.getColumnIndexOrThrow("headers")));
        } catch (SerializationException | ClassCastException unused) {
            map = new HashMap();
        }
        try {
            map2 = (Map) N9.a.a(cursor.getBlob(cursor.getColumnIndexOrThrow("payload")));
        } catch (SerializationException | ClassCastException unused2) {
            map2 = new HashMap();
        }
        return new c(string2, bVarValueOf, map2, map, cursor.getLong(cursor.getColumnIndexOrThrow("timestamp")), cursor.getLong(cursor.getColumnIndexOrThrow("ttl")), string);
    }
}
