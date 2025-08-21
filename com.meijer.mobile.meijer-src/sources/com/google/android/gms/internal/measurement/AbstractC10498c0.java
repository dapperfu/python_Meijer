package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.google.android.gms.internal.measurement.c0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10498c0 extends SQLiteOpenHelper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10498c0(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
        int i11 = AbstractC10525f0.f83017b;
        Z.a();
    }
}
