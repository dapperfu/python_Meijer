package qa;

import android.content.ContentValues;
import android.database.Cursor;
import f9.c;
import g9.AbstractC14341b;

/* renamed from: qa.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16617b extends AbstractC14341b<C16616a> {
    public C16617b(c cVar, n9.b bVar) {
        super("displayed_iam", cVar, bVar);
    }

    @Override // g9.AbstractC14341b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public ContentValues c(C16616a c16616a) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("campaign_id", c16616a.a());
        contentValues.put("timestamp", Long.valueOf(c16616a.b()));
        return contentValues;
    }

    @Override // g9.AbstractC14341b
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C16616a d(Cursor cursor) {
        return new C16616a(cursor.getString(cursor.getColumnIndexOrThrow("campaign_id")), cursor.getLong(cursor.getColumnIndexOrThrow("timestamp")));
    }
}
