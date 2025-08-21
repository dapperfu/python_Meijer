package pa;

import android.content.ContentValues;
import android.database.Cursor;
import f9.c;
import g9.AbstractC14341b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lpa/b;", "Lg9/b;", "Lpa/a;", "Lf9/c;", "dbHelper", "Ln9/b;", "concurrentHandlerHolder", "<init>", "(Lf9/c;Ln9/b;)V", "item", "Landroid/content/ContentValues;", "h", "(Lpa/a;)Landroid/content/ContentValues;", "Landroid/database/Cursor;", "cursor", "i", "(Landroid/database/Cursor;)Lpa/a;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class b extends AbstractC14341b<ButtonClicked> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c dbHelper, n9.b concurrentHandlerHolder) {
        super("button_clicked", dbHelper, concurrentHandlerHolder);
        Intrinsics.j(dbHelper, "dbHelper");
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
    }

    @Override // g9.AbstractC14341b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public ContentValues c(ButtonClicked item) {
        Intrinsics.j(item, "item");
        ContentValues contentValues = new ContentValues();
        contentValues.put("campaign_id", item.getCampaignId());
        contentValues.put("button_id", item.getButtonId());
        contentValues.put("timestamp", Long.valueOf(item.getTimestamp()));
        return contentValues;
    }

    @Override // g9.AbstractC14341b
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public ButtonClicked d(Cursor cursor) {
        Intrinsics.j(cursor, "cursor");
        String string = cursor.getString(cursor.getColumnIndexOrThrow("campaign_id"));
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("button_id"));
        long j10 = cursor.getLong(cursor.getColumnIndexOrThrow("timestamp"));
        Intrinsics.g(string);
        Intrinsics.g(string2);
        return new ButtonClicked(string, string2, j10);
    }
}
