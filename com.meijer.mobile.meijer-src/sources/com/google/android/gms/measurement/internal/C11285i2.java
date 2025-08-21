package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;

/* renamed from: com.google.android.gms.measurement.internal.i2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11285i2 extends AbstractC11261f2 {

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f86461e = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};

    /* renamed from: c, reason: collision with root package name */
    private final C11277h2 f86462c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f86463d;

    @Override // com.google.android.gms.measurement.internal.AbstractC11261f2
    protected final boolean k() {
        return false;
    }

    public final boolean s() {
        return x(3, new byte[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3 A[Catch: SQLiteException -> 0x0098, SQLiteDatabaseLockedException -> 0x009f, SQLiteFullException -> 0x00a3, all -> 0x0164, TRY_ENTER, TryCatch #1 {all -> 0x0164, blocks: (B:30:0x008d, B:32:0x0093, B:43:0x00b3, B:45:0x00d7, B:47:0x00e1, B:49:0x00e9, B:59:0x0103, B:73:0x012b, B:75:0x0131, B:76:0x0134, B:93:0x016b, B:83:0x0154), top: B:107:0x012b }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0160 A[PHI: r8 r10 r17
      0x0160: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:79:0x014c, B:96:0x0182, B:87:0x015e] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r10v8 android.database.sqlite.SQLiteDatabase) = 
      (r10v6 android.database.sqlite.SQLiteDatabase)
      (r10v7 android.database.sqlite.SQLiteDatabase)
      (r10v9 android.database.sqlite.SQLiteDatabase)
     binds: [B:79:0x014c, B:96:0x0182, B:87:0x015e] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:79:0x014c, B:96:0x0182, B:87:0x015e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean x(int r19, byte[] r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11285i2.x(int, byte[]):boolean");
    }

    public final boolean p(C11282i c11282i) {
        X2 x22 = this.f85708a;
        byte[] bArrR = x22.A().R(c11282i);
        if (bArrR.length <= 131072) {
            return x(2, bArrR);
        }
        x22.a().n().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean q(E e10) {
        X2 x22 = this.f85708a;
        byte[] bArrR = x22.A().R(e10);
        if (bArrR == null) {
            x22.a().n().a("Null default event parameters; not writing to database");
            return false;
        }
        if (bArrR.length <= 131072) {
            return x(4, bArrR);
        }
        x22.a().n().a("Default event parameters too long for local database. Sending directly to service");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0218 A[Catch: SQLiteDatabaseLockedException -> 0x0121, SQLiteException -> 0x01f5, SQLiteFullException -> 0x01f8, all -> 0x036a, TryCatch #5 {all -> 0x036a, blocks: (B:38:0x00de, B:40:0x00e4, B:42:0x00f7, B:44:0x00fd, B:56:0x0134, B:61:0x014c, B:63:0x0151, B:181:0x032f, B:183:0x0335, B:184:0x0338, B:191:0x035a, B:201:0x0376, B:78:0x0186, B:79:0x0189, B:77:0x0182, B:87:0x019c, B:89:0x01b0, B:96:0x01cb, B:97:0x01d4, B:98:0x01d7, B:94:0x01c5, B:101:0x01db, B:105:0x01f1, B:119:0x0218, B:120:0x0222, B:121:0x0225, B:117:0x0212, B:124:0x022b, B:128:0x023f, B:142:0x0264, B:144:0x026e, B:145:0x0271, B:140:0x025e, B:148:0x0276, B:149:0x0286, B:156:0x02c5, B:158:0x02e2, B:159:0x02f1), top: B:224:0x032f }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0264 A[Catch: SQLiteException -> 0x0243, SQLiteFullException -> 0x0246, SQLiteDatabaseLockedException -> 0x0359, all -> 0x036a, TryCatch #5 {all -> 0x036a, blocks: (B:38:0x00de, B:40:0x00e4, B:42:0x00f7, B:44:0x00fd, B:56:0x0134, B:61:0x014c, B:63:0x0151, B:181:0x032f, B:183:0x0335, B:184:0x0338, B:191:0x035a, B:201:0x0376, B:78:0x0186, B:79:0x0189, B:77:0x0182, B:87:0x019c, B:89:0x01b0, B:96:0x01cb, B:97:0x01d4, B:98:0x01d7, B:94:0x01c5, B:101:0x01db, B:105:0x01f1, B:119:0x0218, B:120:0x0222, B:121:0x0225, B:117:0x0212, B:124:0x022b, B:128:0x023f, B:142:0x0264, B:144:0x026e, B:145:0x0271, B:140:0x025e, B:148:0x0276, B:149:0x0286, B:156:0x02c5, B:158:0x02e2, B:159:0x02f1), top: B:224:0x032f }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0366 A[PHI: r6 r11 r13 r17 r19 r21
      0x0366: PHI (r6v14 int) = (r6v7 int), (r6v10 int), (r6v15 int) binds: [B:187:0x034d, B:204:0x038b, B:195:0x0364] A[DONT_GENERATE, DONT_INLINE]
      0x0366: PHI (r11v3 int) = (r11v1 int), (r11v1 int), (r11v4 int) binds: [B:187:0x034d, B:204:0x038b, B:195:0x0364] A[DONT_GENERATE, DONT_INLINE]
      0x0366: PHI (r13v9 android.database.sqlite.SQLiteDatabase) = 
      (r13v5 android.database.sqlite.SQLiteDatabase)
      (r13v7 android.database.sqlite.SQLiteDatabase)
      (r13v10 android.database.sqlite.SQLiteDatabase)
     binds: [B:187:0x034d, B:204:0x038b, B:195:0x0364] A[DONT_GENERATE, DONT_INLINE]
      0x0366: PHI (r17v8 java.lang.String) = (r17v3 java.lang.String), (r17v5 java.lang.String), (r17v9 java.lang.String) binds: [B:187:0x034d, B:204:0x038b, B:195:0x0364] A[DONT_GENERATE, DONT_INLINE]
      0x0366: PHI (r19v8 java.lang.String) = (r19v3 java.lang.String), (r19v5 java.lang.String), (r19v9 java.lang.String) binds: [B:187:0x034d, B:204:0x038b, B:195:0x0364] A[DONT_GENERATE, DONT_INLINE]
      0x0366: PHI (r21v8 java.lang.String) = (r21v3 java.lang.String), (r21v5 java.lang.String), (r21v9 java.lang.String) binds: [B:187:0x034d, B:204:0x038b, B:195:0x0364] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x032f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x038e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x038e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x038e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List r(int r30) {
        /*
            Method dump skipped, instructions count: 953
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11285i2.r(int):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0068 A[PHI: r4
      0x0068: PHI (r4v4 int) = (r4v2 int), (r4v1 int), (r4v1 int) binds: [B:28:0x0066, B:25:0x005f, B:32:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t() {
        /*
            r10 = this;
            java.lang.String r0 = "Error deleting app launch break from local database"
            r10.f()
            boolean r1 = r10.f86463d
            r2 = 0
            if (r1 == 0) goto Lc
            goto L97
        Lc:
            boolean r1 = r10.v()
            if (r1 == 0) goto L97
            r1 = 5
            r4 = r1
            r3 = r2
        L15:
            if (r3 >= r1) goto L88
            r5 = 0
            r6 = 1
            android.database.sqlite.SQLiteDatabase r5 = r10.u()     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L60 android.database.sqlite.SQLiteFullException -> L6c
            if (r5 != 0) goto L23
            r10.f86463d = r6     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L60 android.database.sqlite.SQLiteFullException -> L6c
            goto L97
        L23:
            r5.beginTransaction()     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L60 android.database.sqlite.SQLiteFullException -> L6c
            java.lang.String r7 = "messages"
            java.lang.String r8 = "type == ?"
            r9 = 3
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L60 android.database.sqlite.SQLiteFullException -> L6c
            java.lang.String[] r9 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L60 android.database.sqlite.SQLiteFullException -> L6c
            r5.delete(r7, r8, r9)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L60 android.database.sqlite.SQLiteFullException -> L6c
            r5.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L60 android.database.sqlite.SQLiteFullException -> L6c
            r5.endTransaction()     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L60 android.database.sqlite.SQLiteFullException -> L6c
            r5.close()
            return r6
        L40:
            r0 = move-exception
            goto L82
        L42:
            r7 = move-exception
            if (r5 == 0) goto L4e
            boolean r8 = r5.inTransaction()     // Catch: java.lang.Throwable -> L40
            if (r8 == 0) goto L4e
            r5.endTransaction()     // Catch: java.lang.Throwable -> L40
        L4e:
            com.google.android.gms.measurement.internal.X2 r8 = r10.f85708a     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.measurement.internal.q2 r8 = r8.a()     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.measurement.internal.o2 r8 = r8.m()     // Catch: java.lang.Throwable -> L40
            r8.b(r0, r7)     // Catch: java.lang.Throwable -> L40
            r10.f86463d = r6     // Catch: java.lang.Throwable -> L40
            if (r5 == 0) goto L7f
            goto L68
        L60:
            long r6 = (long) r4     // Catch: java.lang.Throwable -> L40
            android.os.SystemClock.sleep(r6)     // Catch: java.lang.Throwable -> L40
            int r4 = r4 + 20
            if (r5 == 0) goto L7f
        L68:
            r5.close()
            goto L7f
        L6c:
            r7 = move-exception
            com.google.android.gms.measurement.internal.X2 r8 = r10.f85708a     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.measurement.internal.q2 r8 = r8.a()     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.measurement.internal.o2 r8 = r8.m()     // Catch: java.lang.Throwable -> L40
            r8.b(r0, r7)     // Catch: java.lang.Throwable -> L40
            r10.f86463d = r6     // Catch: java.lang.Throwable -> L40
            if (r5 == 0) goto L7f
            goto L68
        L7f:
            int r3 = r3 + 1
            goto L15
        L82:
            if (r5 == 0) goto L87
            r5.close()
        L87:
            throw r0
        L88:
            com.google.android.gms.measurement.internal.X2 r0 = r10.f85708a
            com.google.android.gms.measurement.internal.q2 r0 = r0.a()
            com.google.android.gms.measurement.internal.o2 r0 = r0.p()
            java.lang.String r1 = "Error deleting app launch break from local database in reasonable time"
            r0.a(r1)
        L97:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11285i2.t():boolean");
    }

    final SQLiteDatabase u() throws SQLiteException {
        if (this.f86463d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f86462c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f86463d = true;
        return null;
    }

    final boolean v() {
        X2 x22 = this.f85708a;
        Context contextZzaY = x22.zzaY();
        x22.u();
        return contextZzaY.getDatabasePath("google_app_measurement_local.db").exists();
    }

    C11285i2(X2 x22) {
        super(x22);
        Context contextZzaY = this.f85708a.zzaY();
        this.f85708a.u();
        this.f86462c = new C11277h2(this, contextZzaY, "google_app_measurement_local.db");
    }

    public final void m() {
        int iDelete;
        f();
        try {
            SQLiteDatabase sQLiteDatabaseU = u();
            if (sQLiteDatabaseU != null && (iDelete = sQLiteDatabaseU.delete("messages", null, null)) > 0) {
                this.f85708a.a().u().b("Reset local analytics data. records", Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e10) {
            this.f85708a.a().m().b("Error resetting local analytics data. error", e10);
        }
    }

    public final boolean n(G g10) {
        Parcel parcelObtain = Parcel.obtain();
        H.a(g10, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length > 131072) {
            this.f85708a.a().n().a("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return x(0, bArrMarshall);
    }

    public final boolean o(v6 v6Var) {
        Parcel parcelObtain = Parcel.obtain();
        w6.a(v6Var, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length > 131072) {
            this.f85708a.a().n().a("User property too long for local database. Sending directly to service");
            return false;
        }
        return x(1, bArrMarshall);
    }
}
