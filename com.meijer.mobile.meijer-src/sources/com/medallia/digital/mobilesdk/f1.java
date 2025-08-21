package com.medallia.digital.mobilesdk;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.medallia.digital.mobilesdk.b0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
class f1 extends SQLiteOpenHelper implements m8 {

    /* renamed from: b, reason: collision with root package name */
    private static final String f92803b = "MedalliaDigitalDB";

    /* renamed from: c, reason: collision with root package name */
    private static final int f92804c = b();

    /* renamed from: d, reason: collision with root package name */
    private static f1 f92805d = null;

    /* renamed from: e, reason: collision with root package name */
    private static final double f92806e = 10.0d;

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<String, h1> f92807a;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f92808a;

        static {
            int[] iArr = new int[b0.a.values().length];
            f92808a = iArr;
            try {
                iArr[b0.a.UserJourneyData.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f92808a[b0.a.FormData.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f92808a[b0.a.Resource.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f92808a[b0.a.Template.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f92808a[b0.a.Feedback.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f92808a[b0.a.AnalyticsData.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f92808a[b0.a.MediaFeedback.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f92808a[b0.a.WorkerManager.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f92808a[b0.a.LocalNotification.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f92808a[b0.a.QuarantineRule.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private enum b {
        V0,
        V1,
        V2,
        V3,
        V4,
        V5,
        V6,
        V7,
        V8,
        V9,
        V10,
        V11,
        V12,
        V13,
        V14,
        V15,
        V16,
        V17
    }

    protected f1() {
        super(i4.c().b(), f92803b, (SQLiteDatabase.CursorFactory) null, f92804c);
        HashMap<String, h1> map = new HashMap<>();
        this.f92807a = map;
        map.put(v8.class.getSimpleName(), new v8());
        map.put(k2.class.getSimpleName(), new k2());
        map.put(l6.class.getSimpleName(), new l6());
        map.put(q7.class.getSimpleName(), new q7());
        map.put(d2.class.getSimpleName(), new d2());
        map.put(C11696g.class.getSimpleName(), new C11696g());
        map.put(h5.class.getSimpleName(), new h5());
        map.put(a9.class.getSimpleName(), new a9());
        map.put(u3.class.getSimpleName(), new u3());
        map.put(d6.class.getSimpleName(), new d6());
    }

    private static int b() {
        b[] bVarArrValues = b.values();
        if (bVarArrValues.length > 0) {
            return bVarArrValues[bVarArrValues.length - 1].ordinal();
        }
        return 0;
    }

    public double a(double d10) {
        return d10 * 1048576.0d;
    }

    protected double c() {
        return m1.a(i4.c().b().getDatabasePath(f92803b).length());
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        a4.a("Database");
        i4.c().b().deleteDatabase(f92803b);
        f92805d = null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        for (h1 h1Var : this.f92807a.values()) {
            a(sQLiteDatabase, h1Var.d(), h1Var.c());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        if (i10 < b.V2.ordinal()) {
            a(sQLiteDatabase, v8.class);
        }
        if (i10 < b.V3.ordinal()) {
            a(sQLiteDatabase, q7.class);
        }
        if (i10 < b.V17.ordinal()) {
            a(sQLiteDatabase, k2.class);
        }
        if (i10 < b.V5.ordinal()) {
            a(sQLiteDatabase, l6.class);
        }
        if (i10 < b.V6.ordinal()) {
            a(sQLiteDatabase, d2.class);
        }
        if (i10 < b.V9.ordinal()) {
            a(sQLiteDatabase, C11696g.class);
        }
        if (i10 < b.V11.ordinal()) {
            a(sQLiteDatabase, h5.class);
            a(sQLiteDatabase, a9.class);
        }
        if (i10 < b.V15.ordinal()) {
            a(sQLiteDatabase, d6.class);
        }
        if (i10 < b.V16.ordinal()) {
            a(sQLiteDatabase, u3.class);
        }
    }

    public static f1 a() {
        if (f92805d == null && i4.c().b() != null) {
            f92805d = new f1();
        }
        return f92805d;
    }

    protected b0 b(b0.a aVar, Object... objArr) {
        h1<b0> h1VarB;
        if (aVar == null || (h1VarB = b(aVar)) == null) {
            return null;
        }
        return h1VarB.b(objArr);
    }

    protected long c(b0.a aVar) {
        h1<b0> h1VarB;
        if (aVar == null || (h1VarB = b(aVar)) == null) {
            return 0L;
        }
        return h1VarB.b();
    }

    private void a(SQLiteDatabase sQLiteDatabase, Class cls) throws SQLException {
        h1 h1Var = this.f92807a.get(cls.getSimpleName());
        if (h1Var == null) {
            return;
        }
        a(sQLiteDatabase, h1Var.d());
        a(sQLiteDatabase, h1Var.d(), h1Var.c());
    }

    private h1<b0> b(b0.a aVar) {
        HashMap<String, h1> map;
        Class cls;
        switch (a.f92808a[aVar.ordinal()]) {
            case 1:
                map = this.f92807a;
                cls = v8.class;
                break;
            case 2:
                map = this.f92807a;
                cls = k2.class;
                break;
            case 3:
                map = this.f92807a;
                cls = l6.class;
                break;
            case 4:
                map = this.f92807a;
                cls = q7.class;
                break;
            case 5:
                map = this.f92807a;
                cls = d2.class;
                break;
            case 6:
                map = this.f92807a;
                cls = C11696g.class;
                break;
            case 7:
                map = this.f92807a;
                cls = h5.class;
                break;
            case 8:
                map = this.f92807a;
                cls = a9.class;
                break;
            case 9:
                map = this.f92807a;
                cls = u3.class;
                break;
            case 10:
                map = this.f92807a;
                cls = d6.class;
                break;
            default:
                return null;
        }
        return map.get(cls.getSimpleName());
    }

    protected ArrayList<? extends b0> c(b0.a aVar, Object... objArr) {
        h1<b0> h1VarB;
        if (aVar == null || (h1VarB = b(aVar)) == null) {
            return null;
        }
        return h1VarB.c(objArr);
    }

    private void a(SQLiteDatabase sQLiteDatabase, String str) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
    }

    protected boolean b(b0 b0Var) {
        return (b0Var == null || b0Var.getDataTableObjectType() == null || b(b0Var.getDataTableObjectType()) == null || !b(b0Var.getDataTableObjectType()).c((h1<b0>) b0Var)) ? false : true;
    }

    protected boolean c(b0 b0Var) {
        return (b0Var == null || b0Var.getDataTableObjectType() == null || b(b0Var.getDataTableObjectType()) == null || !b(b0Var.getDataTableObjectType()).d(b0Var)) ? false : true;
    }

    private void a(SQLiteDatabase sQLiteDatabase, String str, HashMap<String, String> map) throws SQLException {
        StringBuilder sb2 = new StringBuilder("CREATE TABLE " + str + " ( _id INTEGER PRIMARY KEY AUTOINCREMENT");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb2.append(", ");
            sb2.append(entry.getKey());
            sb2.append(" ");
            sb2.append(entry.getValue());
        }
        sb2.append(" )");
        sQLiteDatabase.execSQL(sb2.toString());
    }

    protected boolean a(b0.a aVar) {
        h1<b0> h1VarB;
        if (aVar == null || (h1VarB = b(aVar)) == null) {
            return false;
        }
        return h1VarB.a();
    }

    protected boolean a(b0.a aVar, Object... objArr) {
        String str;
        if (aVar == null) {
            str = "Record: failed to clear";
        } else {
            h1<b0> h1VarB = b(aVar);
            if (h1VarB != null) {
                a4.b(aVar + " Record: cleared successfully");
                return h1VarB.a(objArr);
            }
            str = aVar + " Record: failed to clear";
        }
        a4.f(str);
        return false;
    }

    protected boolean a(b0 b0Var) {
        b0.a dataTableObjectType;
        h1<b0> h1VarB;
        if (b0Var == null || (dataTableObjectType = b0Var.getDataTableObjectType()) == null || (h1VarB = b(dataTableObjectType)) == null) {
            return false;
        }
        return h1VarB.a((h1<b0>) b0Var);
    }

    protected boolean a(Double d10) {
        return ((double) i4.c().b().getDatabasePath(f92803b).length()) > a(d10 != null ? d10.doubleValue() : f92806e);
    }
}
