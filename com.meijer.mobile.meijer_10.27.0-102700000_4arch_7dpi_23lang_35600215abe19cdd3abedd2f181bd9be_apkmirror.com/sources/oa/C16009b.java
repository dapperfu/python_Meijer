package oa;

import android.content.ContentValues;
import android.database.Cursor;
import d9.c;
import e9.AbstractC13637b;

/* renamed from: oa.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16009b extends AbstractC13637b<C16008a> {
    public C16009b(c cVar, l9.b bVar) {
        super("displayed_iam", cVar, bVar);
    }

    @Override // e9.AbstractC13637b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public ContentValues c(C16008a c16008a) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("campaign_id", c16008a.a());
        contentValues.put("timestamp", Long.valueOf(c16008a.b()));
        return contentValues;
    }

    @Override // e9.AbstractC13637b
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C16008a d(Cursor cursor) {
        return new C16008a(cursor.getString(cursor.getColumnIndexOrThrow("campaign_id")), cursor.getLong(cursor.getColumnIndexOrThrow("timestamp")));
    }
}
