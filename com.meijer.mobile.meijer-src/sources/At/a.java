package At;

import android.content.Context;
import android.content.SharedPreferences;
import tt.d;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private d f2106a;

    /* renamed from: b, reason: collision with root package name */
    private Context f2107b;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f2108c;

    /* renamed from: d, reason: collision with root package name */
    private Ct.a f2109d;

    /* renamed from: e, reason: collision with root package name */
    private Db.b f2110e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: At.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0039a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2111a;

        static {
            int[] iArr = new int[Ct.a.values().length];
            f2111a = iArr;
            try {
                iArr[Ct.a.ULTRA_LOW_BATTERY_CONSUMPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2111a[Ct.a.HIGH_BATTERY_CONSUMPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final long a() {
        if (C0039a.f2111a[d().ordinal()] != 1) {
            return Db.b.b(this.f2110e.e().d(), 120000);
        }
        return 720000L;
    }

    public long b() {
        d dVar = this.f2106a;
        if (dVar != null && dVar.f163398a.getProperty("extra.exit.delay") != null) {
            return this.f2106a.a();
        }
        int i10 = C0039a.f2111a[d().ordinal()];
        if (i10 == 1) {
            return 3600L;
        }
        if (i10 != 2) {
            return Db.b.b(this.f2110e.e().h(), 900);
        }
        return 120L;
    }

    public long c() {
        int i10 = C0039a.f2111a[d().ordinal()];
        if (i10 == 1) {
            return 720L;
        }
        if (i10 != 2) {
            return Db.b.b(this.f2110e.e().e(), 240);
        }
        return 120L;
    }

    public final Ct.a d() {
        if (this.f2109d == null) {
            if (this.f2108c == null) {
                this.f2108c = this.f2107b.getSharedPreferences("FaarPrefs", 0);
            }
            try {
                this.f2109d = Ct.a.valueOf(this.f2108c.getString("ALLOWABLE_CONSUMPTION", Ct.a.LOW_BATTERY_CONSUMPTION.name()));
            } catch (Exception unused) {
                this.f2109d = Ct.a.LOW_BATTERY_CONSUMPTION;
            }
        }
        return this.f2109d;
    }

    public a(d dVar, Context context, Db.b bVar) {
        this.f2106a = dVar;
        this.f2107b = context;
        this.f2110e = bVar;
    }
}
