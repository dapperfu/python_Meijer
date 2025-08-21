package net.zetetic.database.sqlcipher;

import B4.e;
import android.database.DatabaseUtils;
import android.os.CancellationSignal;
import java.util.Arrays;

/* loaded from: classes14.dex */
public abstract class SQLiteProgram extends SQLiteClosable implements e {

    /* renamed from: h, reason: collision with root package name */
    private static final String[] f152384h = new String[0];

    /* renamed from: b, reason: collision with root package name */
    private final SQLiteDatabase f152385b;

    /* renamed from: c, reason: collision with root package name */
    private final String f152386c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f152387d;

    /* renamed from: e, reason: collision with root package name */
    private final String[] f152388e;

    /* renamed from: f, reason: collision with root package name */
    private final int f152389f;

    /* renamed from: g, reason: collision with root package name */
    private final Object[] f152390g;

    private void d(int i10, Object obj) {
        if (i10 >= 1 && i10 <= this.f152389f) {
            this.f152390g[i10 - 1] = obj;
            return;
        }
        throw new IllegalArgumentException("Cannot bind argument at index " + i10 + " because the index is out of range.  The statement has " + this.f152389f + " parameters.");
    }

    @Override // B4.e
    public void I(int i10) {
        d(i10, null);
    }

    @Override // B4.e
    public void S1(int i10, String str) {
        if (str != null) {
            d(i10, str);
            return;
        }
        throw new IllegalArgumentException("the bind value at index " + i10 + " is null");
    }

    public void g(Object... objArr) {
        if (objArr != null) {
            for (int length = objArr.length; length != 0; length--) {
                d(length, objArr[length - 1]);
            }
        }
    }

    final String[] getColumnNames() {
        return this.f152388e;
    }

    public void h(String[] strArr) {
        if (strArr != null) {
            for (int length = strArr.length; length != 0; length--) {
                S1(length, strArr[length - 1]);
            }
        }
    }

    public void i() {
        Object[] objArr = this.f152390g;
        if (objArr != null) {
            Arrays.fill(objArr, (Object) null);
        }
    }

    final Object[] j() {
        return this.f152390g;
    }

    protected final int l() {
        return this.f152385b.z(this.f152387d);
    }

    final SQLiteDatabase m() {
        return this.f152385b;
    }

    protected final SQLiteSession p() {
        return this.f152385b.A();
    }

    String u() {
        return this.f152386c;
    }

    protected final void w() {
        this.f152385b.O();
    }

    @Override // B4.e
    public void y2(int i10, byte[] bArr) {
        if (bArr != null) {
            d(i10, bArr);
            return;
        }
        throw new IllegalArgumentException("the bind value at index " + i10 + " is null");
    }

    SQLiteProgram(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
        this.f152385b = sQLiteDatabase;
        String strTrim = str.trim();
        this.f152386c = strTrim;
        int sqlStatementType = DatabaseUtils.getSqlStatementType(strTrim);
        if (sqlStatementType != 4 && sqlStatementType != 5 && sqlStatementType != 6) {
            boolean z10 = sqlStatementType == 1;
            SQLiteStatementInfo sQLiteStatementInfo = new SQLiteStatementInfo();
            sQLiteDatabase.A().n(strTrim, sQLiteDatabase.z(z10), cancellationSignal, sQLiteStatementInfo);
            this.f152387d = sQLiteStatementInfo.f152411c;
            this.f152388e = sQLiteStatementInfo.f152410b;
            this.f152389f = sQLiteStatementInfo.f152409a;
        } else {
            this.f152387d = false;
            this.f152388e = f152384h;
            this.f152389f = 0;
        }
        if (objArr != null && objArr.length > this.f152389f) {
            throw new IllegalArgumentException("Too many bind arguments.  " + objArr.length + " arguments were provided but the statement needs " + this.f152389f + " arguments.");
        }
        int i10 = this.f152389f;
        if (i10 != 0) {
            Object[] objArr2 = new Object[i10];
            this.f152390g = objArr2;
            if (objArr != null) {
                System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                return;
            }
            return;
        }
        this.f152390g = null;
    }

    @Override // B4.e
    public void C(int i10, long j10) {
        d(i10, Long.valueOf(j10));
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteClosable
    protected void b() {
        i();
    }

    @Override // B4.e
    public void o(int i10, double d10) {
        d(i10, Double.valueOf(d10));
    }
}
