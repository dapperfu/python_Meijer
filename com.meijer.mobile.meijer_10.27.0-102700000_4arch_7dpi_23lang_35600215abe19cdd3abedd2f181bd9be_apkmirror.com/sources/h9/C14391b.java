package h9;

import android.content.ContentValues;
import android.database.Cursor;
import e9.AbstractC13637b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lh9/b;", "Le9/b;", "Lh9/a;", "Ld9/c;", "dbHelper", "Ll9/b;", "concurrentHandlerHolder", "<init>", "(Ld9/c;Ll9/b;)V", "item", "Landroid/content/ContentValues;", "h", "(Lh9/a;)Landroid/content/ContentValues;", "Landroid/database/Cursor;", "cursor", "i", "(Landroid/database/Cursor;)Lh9/a;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: h9.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14391b extends AbstractC13637b<ClientIdentification> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14391b(d9.c dbHelper, l9.b concurrentHandlerHolder) {
        super("hardware_identification", dbHelper, concurrentHandlerHolder);
        Intrinsics.j(dbHelper, "dbHelper");
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
    }

    @Override // e9.AbstractC13637b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public ContentValues c(ClientIdentification item) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("hardware_id", item != null ? item.getClientId() : null);
        contentValues.put("encrypted_hardware_id", item != null ? item.getEncryptedClientId() : null);
        contentValues.put("salt", item != null ? item.getSalt() : null);
        contentValues.put("iv", item != null ? item.getIv() : null);
        return contentValues;
    }

    @Override // e9.AbstractC13637b
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public ClientIdentification d(Cursor cursor) {
        Intrinsics.j(cursor, "cursor");
        String string = cursor.getString(cursor.getColumnIndexOrThrow("hardware_id"));
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("encrypted_hardware_id"));
        String string3 = cursor.getString(cursor.getColumnIndexOrThrow("salt"));
        String string4 = cursor.getString(cursor.getColumnIndexOrThrow("iv"));
        Intrinsics.g(string);
        return new ClientIdentification(string, string2, string3, string4);
    }
}
