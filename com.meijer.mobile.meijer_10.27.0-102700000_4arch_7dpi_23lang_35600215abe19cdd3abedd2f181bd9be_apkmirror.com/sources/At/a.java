package At;

import android.content.Context;
import android.content.SharedPreferences;
import tt.d;

/* loaded from: classes11.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private d f1609a;

    /* renamed from: b, reason: collision with root package name */
    private Context f1610b;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f1611c;

    /* renamed from: d, reason: collision with root package name */
    private Ct.a f1612d;

    /* renamed from: e, reason: collision with root package name */
    private Bb.b f1613e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: At.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0026a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1614a;

        static {
            int[] iArr = new int[Ct.a.values().length];
            f1614a = iArr;
            try {
                iArr[Ct.a.ULTRA_LOW_BATTERY_CONSUMPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1614a[Ct.a.HIGH_BATTERY_CONSUMPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final long a() {
        if (C0026a.f1614a[d().ordinal()] != 1) {
            return Bb.b.b(this.f1613e.e().d(), 120000);
        }
        return 720000L;
    }

    public long b() {
        d dVar = this.f1609a;
        if (dVar != null && dVar.f162096a.getProperty("extra.exit.delay") != null) {
            return this.f1609a.a();
        }
        int i10 = C0026a.f1614a[d().ordinal()];
        if (i10 == 1) {
            return 3600L;
        }
        if (i10 != 2) {
            return Bb.b.b(this.f1613e.e().h(), 900);
        }
        return 120L;
    }

    public long c() {
        int i10 = C0026a.f1614a[d().ordinal()];
        if (i10 == 1) {
            return 720L;
        }
        if (i10 != 2) {
            return Bb.b.b(this.f1613e.e().e(), 240);
        }
        return 120L;
    }

    public final Ct.a d() {
        if (this.f1612d == null) {
            if (this.f1611c == null) {
                this.f1611c = this.f1610b.getSharedPreferences("FaarPrefs", 0);
            }
            try {
                this.f1612d = Ct.a.valueOf(this.f1611c.getString("ALLOWABLE_CONSUMPTION", Ct.a.LOW_BATTERY_CONSUMPTION.name()));
            } catch (Exception unused) {
                this.f1612d = Ct.a.LOW_BATTERY_CONSUMPTION;
            }
        }
        return this.f1612d;
    }

    public a(d dVar, Context context, Bb.b bVar) {
        this.f1609a = dVar;
        this.f1610b = context;
        this.f1613e = bVar;
    }
}
