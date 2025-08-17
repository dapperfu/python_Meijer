package net.zetetic.database.sqlcipher;

import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* loaded from: classes13.dex */
public final class SQLiteCustomFunction {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase.CustomFunction f151323a;
    public final String name;
    public final int numArgs;

    private void dispatchCallback(String[] strArr) {
        this.f151323a.a(strArr);
    }

    public SQLiteCustomFunction(String str, int i10, SQLiteDatabase.CustomFunction customFunction) {
        if (str != null) {
            this.name = str;
            this.numArgs = i10;
            this.f151323a = customFunction;
            return;
        }
        throw new IllegalArgumentException("name must not be null.");
    }
}
