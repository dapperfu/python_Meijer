package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.measurement.AbstractC10525f0;
import java.io.File;

/* renamed from: com.google.android.gms.measurement.internal.v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11374v {
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084 A[Catch: SQLiteException -> 0x00b9, TryCatch #1 {SQLiteException -> 0x00b9, blocks: (B:26:0x0046, B:28:0x0076, B:30:0x0084, B:32:0x008c, B:33:0x008f, B:34:0x00b8, B:38:0x00be, B:40:0x00c1, B:42:0x00c9, B:43:0x00d0, B:44:0x00d3, B:46:0x00d9, B:49:0x00ea, B:50:0x00ee, B:27:0x006f), top: B:60:0x0046, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be A[Catch: SQLiteException -> 0x00b9, LOOP:1: B:38:0x00be->B:43:0x00d0, LOOP_START, PHI: r1
      0x00be: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:37:0x00bc, B:43:0x00d0] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {SQLiteException -> 0x00b9, blocks: (B:26:0x0046, B:28:0x0076, B:30:0x0084, B:32:0x008c, B:33:0x008f, B:34:0x00b8, B:38:0x00be, B:40:0x00c1, B:42:0x00c9, B:43:0x00d0, B:44:0x00d3, B:46:0x00d9, B:49:0x00ea, B:50:0x00ee, B:27:0x006f), top: B:60:0x0046, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9 A[Catch: SQLiteException -> 0x00b9, TryCatch #1 {SQLiteException -> 0x00b9, blocks: (B:26:0x0046, B:28:0x0076, B:30:0x0084, B:32:0x008c, B:33:0x008f, B:34:0x00b8, B:38:0x00be, B:40:0x00c1, B:42:0x00c9, B:43:0x00d0, B:44:0x00d3, B:46:0x00d9, B:49:0x00ea, B:50:0x00ee, B:27:0x006f), top: B:60:0x0046, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void a(com.google.android.gms.measurement.internal.C11343q2 r10, android.database.sqlite.SQLiteDatabase r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String[] r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11374v.a(com.google.android.gms.measurement.internal.q2, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    static void b(C11343q2 c11343q2, SQLiteDatabase sQLiteDatabase) {
        if (c11343q2 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        com.google.android.gms.internal.measurement.Z.a();
        String path = sQLiteDatabase.getPath();
        int i10 = AbstractC10525f0.f83017b;
        File file = new File(path);
        if (!file.setReadable(false, false)) {
            c11343q2.p().a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            c11343q2.p().a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            c11343q2.p().a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        c11343q2.p().a("Failed to turn on database write permission for owner");
    }
}
