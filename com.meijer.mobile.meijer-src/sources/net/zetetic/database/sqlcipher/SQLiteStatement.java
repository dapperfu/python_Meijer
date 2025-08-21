package net.zetetic.database.sqlcipher;

import B4.g;
import android.database.sqlite.SQLiteDatabaseCorruptException;

/* loaded from: classes14.dex */
public final class SQLiteStatement extends SQLiteProgram implements g {
    SQLiteStatement(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr) {
        super(sQLiteDatabase, str, objArr, null);
    }

    public String toString() {
        return "SQLiteProgram: " + u();
    }

    @Override // B4.g
    public long J1() {
        a();
        try {
            try {
                return p().i(u(), j(), l(), null);
            } catch (SQLiteDatabaseCorruptException e10) {
                w();
                throw e10;
            }
        } finally {
            c();
        }
    }

    @Override // B4.g
    public int a0() {
        a();
        try {
            try {
                return p().g(u(), j(), l(), null);
            } catch (SQLiteDatabaseCorruptException e10) {
                w();
                throw e10;
            }
        } finally {
            c();
        }
    }

    @Override // B4.g
    public void execute() {
        a();
        try {
            try {
                p().f(u(), j(), l(), null);
            } catch (SQLiteDatabaseCorruptException e10) {
                w();
                throw e10;
            }
        } finally {
            c();
        }
    }

    public long z() {
        a();
        try {
            try {
                return p().j(u(), j(), l(), null);
            } catch (SQLiteDatabaseCorruptException e10) {
                w();
                throw e10;
            }
        } finally {
            c();
        }
    }
}
