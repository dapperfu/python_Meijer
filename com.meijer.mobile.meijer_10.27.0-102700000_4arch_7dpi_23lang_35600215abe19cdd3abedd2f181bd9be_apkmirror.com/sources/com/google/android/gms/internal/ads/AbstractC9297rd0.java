package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.google.android.gms.internal.ads.rd0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9297rd0 extends SQLiteOpenHelper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC9297rd0(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10, AbstractC9618ud0 abstractC9618ud0) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, i10);
        C8870nd0.a();
    }
}
