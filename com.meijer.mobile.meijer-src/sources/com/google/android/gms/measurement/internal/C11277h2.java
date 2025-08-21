package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.AbstractC10498c0;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.h2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11277h2 extends AbstractC10498c0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C11285i2 f86434a;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C11374v.b(this.f86434a.f85708a.a(), sQLiteDatabase);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C11277h2(C11285i2 c11285i2, Context context, String str) {
        super(context, "google_app_measurement_local.db", null, 1);
        Objects.requireNonNull(c11285i2);
        this.f86434a = c11285i2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e10) {
            throw e10;
        } catch (SQLiteException unused) {
            X2 x22 = this.f86434a.f85708a;
            x22.a().m().a("Opening the local database failed, dropping and recreating it");
            x22.u();
            if (!x22.zzaY().getDatabasePath("google_app_measurement_local.db").delete()) {
                x22.a().m().b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e11) {
                this.f86434a.f85708a.a().m().b("Failed to open local database. Events will bypass local storage", e11);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        C11374v.a(this.f86434a.f85708a.a(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", C11285i2.f86461e);
    }
}
