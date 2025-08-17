package t3;

import Be.v;
import Ce.L;
import Ce.M;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import d3.C13466a;
import d3.C13467b;
import d3.InterfaceC13473h;
import d3.P;
import d3.w;
import f3.InterfaceC13839d;
import f3.o;
import java.util.HashMap;
import java.util.Map;
import t3.d;

/* loaded from: classes.dex */
public final class h implements d, o {

    /* renamed from: r, reason: collision with root package name */
    public static final L<Long> f161379r = L.C(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* renamed from: s, reason: collision with root package name */
    public static final L<Long> f161380s = L.C(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* renamed from: t, reason: collision with root package name */
    public static final L<Long> f161381t = L.C(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* renamed from: u, reason: collision with root package name */
    public static final L<Long> f161382u = L.C(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* renamed from: v, reason: collision with root package name */
    public static final L<Long> f161383v = L.C(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* renamed from: w, reason: collision with root package name */
    public static final L<Long> f161384w = L.C(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* renamed from: x, reason: collision with root package name */
    @SuppressLint({"NonFinalStaticField", "StaticFieldLeak"})
    private static h f161385x;

    /* renamed from: a, reason: collision with root package name */
    private final Context f161386a;

    /* renamed from: b, reason: collision with root package name */
    private final M<Integer, Long> f161387b;

    /* renamed from: c, reason: collision with root package name */
    private final d.a.C2528a f161388c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC13473h f161389d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f161390e;

    /* renamed from: f, reason: collision with root package name */
    private final l f161391f;

    /* renamed from: g, reason: collision with root package name */
    private int f161392g;

    /* renamed from: h, reason: collision with root package name */
    private long f161393h;

    /* renamed from: i, reason: collision with root package name */
    private long f161394i;

    /* renamed from: j, reason: collision with root package name */
    private long f161395j;

    /* renamed from: k, reason: collision with root package name */
    private long f161396k;

    /* renamed from: l, reason: collision with root package name */
    private long f161397l;

    /* renamed from: m, reason: collision with root package name */
    private long f161398m;

    /* renamed from: n, reason: collision with root package name */
    private int f161399n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f161400o;

    /* renamed from: p, reason: collision with root package name */
    private int f161401p;

    /* renamed from: q, reason: collision with root package name */
    private String f161402q;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f161403a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<Integer, Long> f161404b;

        /* renamed from: c, reason: collision with root package name */
        private int f161405c;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC13473h f161406d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f161407e;

        public h a() {
            return new h(this.f161403a, this.f161404b, this.f161405c, this.f161406d, this.f161407e);
        }

        public b(Context context) {
            Context applicationContext;
            if (context == null) {
                applicationContext = null;
            } else {
                applicationContext = context.getApplicationContext();
            }
            this.f161403a = applicationContext;
            this.f161405c = 2000;
            this.f161406d = InterfaceC13473h.f127116a;
            this.f161407e = true;
            HashMap map = new HashMap(8);
            this.f161404b = map;
            map.put(0, 1000000L);
            map.put(2, -9223372036854775807L);
            map.put(3, -9223372036854775807L);
            map.put(4, -9223372036854775807L);
            map.put(5, -9223372036854775807L);
            map.put(10, -9223372036854775807L);
            map.put(9, -9223372036854775807L);
            map.put(7, -9223372036854775807L);
        }
    }

    private static int[] i(String str) {
        str.getClass();
        switch (str) {
            case "AD":
            case "AI":
            case "BB":
            case "BQ":
            case "CW":
            case "DM":
            case "KN":
            case "KY":
            case "SX":
            case "VC":
                return new int[]{1, 2, 0, 0, 2, 2};
            case "AE":
                return new int[]{1, 4, 2, 3, 4, 1};
            case "AF":
            case "SZ":
                return new int[]{4, 4, 3, 4, 2, 2};
            case "AG":
            case "CI":
                return new int[]{2, 4, 3, 4, 2, 2};
            case "AL":
                return new int[]{1, 1, 1, 2, 2, 2};
            case "AM":
            case "PA":
                return new int[]{2, 3, 2, 3, 2, 2};
            case "AO":
                return new int[]{3, 4, 4, 3, 2, 2};
            case "AQ":
            case "ER":
            case "NU":
            case "SC":
            case "SH":
                return new int[]{4, 2, 2, 2, 2, 2};
            case "AR":
                return new int[]{2, 2, 2, 2, 1, 2};
            case "AS":
                return new int[]{2, 2, 3, 3, 2, 2};
            case "AT":
            case "EE":
            case "HU":
            case "IS":
            case "LV":
            case "MT":
            case "SE":
                return new int[]{0, 0, 0, 0, 0, 2};
            case "AU":
                return new int[]{0, 3, 1, 1, 3, 0};
            case "AW":
                return new int[]{2, 2, 3, 4, 2, 2};
            case "AX":
            case "CX":
            case "LI":
            case "MS":
            case "PM":
            case "SM":
            case "VA":
                return new int[]{0, 2, 2, 2, 2, 2};
            case "AZ":
            case "DJ":
            case "LY":
            case "SL":
                return new int[]{4, 2, 3, 3, 2, 2};
            case "BA":
            case "JO":
            case "TR":
                return new int[]{1, 1, 1, 1, 2, 2};
            case "BD":
                return new int[]{2, 1, 3, 2, 4, 2};
            case "BE":
                return new int[]{0, 0, 1, 0, 1, 2};
            case "BF":
            case "SD":
            case "SY":
            case "TD":
                return new int[]{4, 3, 4, 4, 2, 2};
            case "BG":
            case "PT":
            case "SI":
                return new int[]{0, 0, 0, 0, 1, 2};
            case "BH":
                return new int[]{1, 3, 1, 3, 4, 2};
            case "BI":
            case "GQ":
            case "HT":
            case "NE":
            case "VE":
            case "YE":
                return new int[]{4, 4, 4, 4, 2, 2};
            case "BJ":
                return new int[]{4, 4, 2, 3, 2, 2};
            case "BL":
            case "MP":
            case "PY":
                return new int[]{1, 2, 2, 2, 2, 2};
            case "BM":
                return new int[]{0, 2, 0, 0, 2, 2};
            case "BN":
                return new int[]{3, 2, 0, 0, 2, 2};
            case "BO":
                return new int[]{1, 2, 4, 4, 2, 2};
            case "BR":
                return new int[]{1, 1, 1, 1, 2, 4};
            case "BS":
                return new int[]{3, 2, 1, 1, 2, 2};
            case "BT":
                return new int[]{3, 1, 2, 2, 3, 2};
            case "BW":
                return new int[]{3, 2, 1, 0, 2, 2};
            case "BY":
                return new int[]{1, 2, 3, 3, 2, 2};
            case "BZ":
            case "CK":
                return new int[]{2, 2, 2, 1, 2, 2};
            case "CA":
            case "UA":
                return new int[]{0, 2, 1, 2, 3, 3};
            case "CD":
            case "ML":
                return new int[]{3, 3, 2, 2, 2, 2};
            case "CF":
                return new int[]{4, 2, 4, 2, 2, 2};
            case "CG":
            case "EG":
            case "MG":
                return new int[]{3, 4, 3, 3, 2, 2};
            case "CH":
                return new int[]{0, 1, 0, 0, 0, 2};
            case "CL":
            case "TH":
                return new int[]{0, 1, 2, 2, 2, 2};
            case "CM":
            case "MR":
                return new int[]{4, 3, 3, 4, 2, 2};
            case "CN":
                return new int[]{2, 0, 1, 1, 3, 1};
            case "CO":
                return new int[]{2, 3, 3, 2, 2, 2};
            case "CR":
            case "NI":
                return new int[]{2, 4, 4, 4, 2, 2};
            case "CU":
            case "KI":
            case "NR":
            case "TL":
                return new int[]{4, 2, 4, 4, 2, 2};
            case "CV":
                return new int[]{2, 3, 0, 1, 2, 2};
            case "CY":
                return new int[]{1, 0, 1, 0, 0, 2};
            case "CZ":
                return new int[]{0, 0, 2, 0, 1, 2};
            case "DE":
                return new int[]{0, 1, 4, 2, 2, 1};
            case "DK":
                return new int[]{0, 0, 2, 0, 0, 2};
            case "DO":
            case "LR":
                return new int[]{3, 4, 4, 4, 2, 2};
            case "DZ":
            case "TJ":
                return new int[]{3, 3, 4, 4, 2, 2};
            case "EC":
                return new int[]{1, 3, 2, 1, 2, 2};
            case "ES":
                return new int[]{0, 0, 0, 0, 1, 0};
            case "ET":
                return new int[]{4, 3, 4, 4, 4, 2};
            case "FI":
                return new int[]{0, 0, 0, 1, 0, 2};
            case "FJ":
                return new int[]{3, 2, 2, 3, 2, 2};
            case "FK":
            case "NF":
            case "SJ":
                return new int[]{3, 2, 2, 2, 2, 2};
            case "FM":
                return new int[]{4, 2, 4, 0, 2, 2};
            case "FO":
                return new int[]{0, 2, 2, 0, 2, 2};
            case "FR":
                return new int[]{1, 1, 1, 1, 0, 2};
            case "GA":
                return new int[]{3, 4, 0, 0, 2, 2};
            case "GB":
                return new int[]{1, 1, 3, 2, 2, 2};
            case "GD":
                return new int[]{2, 2, 0, 0, 2, 2};
            case "GE":
                return new int[]{1, 1, 0, 2, 2, 2};
            case "GF":
                return new int[]{3, 2, 3, 3, 2, 2};
            case "GG":
                return new int[]{0, 2, 1, 1, 2, 2};
            case "GH":
                return new int[]{3, 3, 3, 2, 2, 2};
            case "GI":
            case "IM":
            case "JE":
                return new int[]{0, 2, 0, 1, 2, 2};
            case "GL":
            case "MC":
                return new int[]{1, 2, 2, 0, 2, 2};
            case "GM":
            case "SS":
                return new int[]{4, 3, 2, 4, 2, 2};
            case "GN":
                return new int[]{3, 4, 4, 2, 2, 2};
            case "GP":
                return new int[]{2, 1, 1, 3, 2, 2};
            case "GR":
                return new int[]{1, 0, 0, 0, 1, 2};
            case "GT":
                return new int[]{2, 1, 2, 1, 2, 2};
            case "GU":
                return new int[]{2, 2, 4, 3, 3, 2};
            case "GW":
                return new int[]{4, 4, 1, 2, 2, 2};
            case "GY":
                return new int[]{3, 1, 1, 3, 2, 2};
            case "HK":
                return new int[]{0, 1, 0, 1, 1, 0};
            case "HR":
            case "KW":
                return new int[]{1, 0, 0, 0, 0, 2};
            case "ID":
                return new int[]{3, 1, 3, 3, 2, 4};
            case "IE":
                return new int[]{1, 1, 1, 1, 1, 2};
            case "IL":
                return new int[]{1, 2, 2, 3, 4, 2};
            case "IN":
                return new int[]{1, 1, 3, 2, 2, 3};
            case "IO":
                return new int[]{3, 2, 2, 0, 2, 2};
            case "IQ":
                return new int[]{3, 2, 3, 2, 2, 2};
            case "IR":
                return new int[]{4, 2, 3, 3, 4, 3};
            case "IT":
                return new int[]{0, 1, 1, 2, 1, 2};
            case "JM":
                return new int[]{2, 4, 3, 1, 2, 2};
            case "JP":
                return new int[]{0, 3, 2, 3, 4, 2};
            case "KE":
                return new int[]{3, 2, 1, 1, 1, 2};
            case "KG":
                return new int[]{2, 1, 1, 2, 2, 2};
            case "KH":
                return new int[]{1, 0, 4, 2, 2, 2};
            case "KM":
            case "VU":
                return new int[]{4, 3, 3, 2, 2, 2};
            case "KR":
                return new int[]{0, 2, 2, 4, 4, 4};
            case "KZ":
                return new int[]{2, 1, 2, 2, 3, 2};
            case "LA":
                return new int[]{1, 2, 1, 3, 2, 2};
            case "LB":
                return new int[]{3, 1, 1, 2, 2, 2};
            case "LC":
                return new int[]{2, 2, 1, 1, 2, 2};
            case "LK":
            case "MM":
                return new int[]{3, 2, 3, 3, 4, 2};
            case "LS":
            case "PG":
                return new int[]{4, 3, 3, 3, 2, 2};
            case "LT":
                return new int[]{0, 1, 0, 1, 0, 2};
            case "LU":
                return new int[]{4, 0, 3, 2, 1, 3};
            case "MA":
                return new int[]{3, 3, 1, 1, 2, 2};
            case "MD":
                return new int[]{1, 0, 0, 0, 2, 2};
            case "ME":
                return new int[]{2, 0, 0, 1, 3, 2};
            case "MF":
                return new int[]{1, 2, 2, 3, 2, 2};
            case "MH":
            case "TM":
            case "TV":
            case "WF":
                return new int[]{4, 2, 2, 4, 2, 2};
            case "MK":
                return new int[]{1, 0, 0, 1, 3, 2};
            case "MN":
                return new int[]{2, 0, 2, 2, 2, 2};
            case "MO":
                return new int[]{0, 2, 4, 4, 3, 1};
            case "MQ":
                return new int[]{2, 1, 2, 3, 2, 2};
            case "MU":
                return new int[]{3, 1, 0, 2, 2, 2};
            case "MV":
                return new int[]{3, 2, 1, 3, 4, 2};
            case "MW":
                return new int[]{3, 2, 2, 1, 2, 2};
            case "MX":
                return new int[]{2, 4, 4, 4, 3, 2};
            case "MY":
                return new int[]{1, 0, 4, 1, 1, 0};
            case "MZ":
            case "WS":
                return new int[]{3, 1, 2, 2, 2, 2};
            case "NA":
                return new int[]{3, 4, 3, 2, 2, 2};
            case "NC":
            case "YT":
                return new int[]{2, 3, 3, 4, 2, 2};
            case "NG":
                return new int[]{3, 4, 2, 1, 2, 2};
            case "NL":
                return new int[]{2, 1, 4, 3, 0, 4};
            case "NO":
                return new int[]{0, 0, 3, 0, 0, 2};
            case "NP":
                return new int[]{2, 2, 4, 3, 2, 2};
            case "NZ":
                return new int[]{0, 0, 1, 2, 4, 2};
            case "OM":
                return new int[]{2, 3, 1, 2, 4, 2};
            case "PE":
                return new int[]{1, 2, 4, 4, 3, 2};
            case "PF":
                return new int[]{2, 2, 3, 1, 2, 2};
            case "PH":
                return new int[]{2, 1, 2, 3, 2, 1};
            case "PK":
                return new int[]{3, 3, 3, 3, 2, 2};
            case "PL":
                return new int[]{1, 0, 2, 2, 4, 4};
            case "PR":
                return new int[]{2, 0, 2, 1, 2, 0};
            case "PS":
                return new int[]{3, 4, 1, 3, 2, 2};
            case "PW":
                return new int[]{2, 2, 4, 1, 2, 2};
            case "QA":
                return new int[]{1, 4, 4, 4, 4, 2};
            case "RE":
                return new int[]{0, 3, 2, 3, 1, 2};
            case "RO":
                return new int[]{0, 0, 1, 1, 3, 2};
            case "RS":
                return new int[]{1, 0, 0, 1, 2, 2};
            case "RU":
                return new int[]{1, 0, 0, 1, 3, 3};
            case "RW":
                return new int[]{3, 3, 2, 0, 2, 2};
            case "SA":
                return new int[]{3, 1, 1, 2, 2, 0};
            case "SB":
            case "ZW":
                return new int[]{4, 2, 4, 3, 2, 2};
            case "SG":
                return new int[]{2, 3, 3, 3, 1, 1};
            case "SK":
                return new int[]{0, 1, 1, 1, 2, 2};
            case "SN":
                return new int[]{4, 4, 3, 2, 2, 2};
            case "SO":
                return new int[]{2, 2, 3, 4, 4, 2};
            case "SR":
                return new int[]{2, 4, 4, 1, 2, 2};
            case "ST":
                return new int[]{2, 2, 1, 2, 2, 2};
            case "SV":
                return new int[]{2, 3, 2, 1, 2, 2};
            case "TC":
                return new int[]{3, 2, 1, 2, 2, 2};
            case "TG":
                return new int[]{3, 4, 1, 0, 2, 2};
            case "TN":
                return new int[]{3, 1, 1, 1, 2, 2};
            case "TO":
                return new int[]{3, 2, 4, 3, 2, 2};
            case "TT":
                return new int[]{2, 4, 1, 0, 2, 2};
            case "TW":
                return new int[]{0, 0, 0, 0, 0, 0};
            case "TZ":
                return new int[]{3, 4, 2, 1, 3, 2};
            case "UG":
                return new int[]{3, 3, 2, 3, 4, 2};
            case "US":
                return new int[]{2, 2, 4, 1, 3, 1};
            case "UY":
                return new int[]{2, 1, 1, 2, 1, 2};
            case "UZ":
                return new int[]{1, 2, 3, 4, 3, 2};
            case "VG":
                return new int[]{2, 2, 1, 1, 2, 4};
            case "VI":
                return new int[]{0, 2, 1, 2, 2, 2};
            case "VN":
                return new int[]{0, 0, 1, 2, 2, 2};
            case "XK":
                return new int[]{1, 2, 1, 1, 2, 2};
            case "ZA":
                return new int[]{2, 4, 2, 1, 1, 2};
            case "ZM":
                return new int[]{4, 4, 4, 3, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o(int i10) throws Throwable {
        Throwable th2;
        try {
            try {
                int i11 = this.f161399n;
                if (i11 != 0) {
                    try {
                        if (!this.f161390e) {
                            return;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                if (this.f161400o) {
                    i10 = this.f161401p;
                }
                if (i11 != i10 || this.f161402q == null) {
                    this.f161399n = i10;
                    if (i10 == 1 || i10 == 0 || i10 == 8) {
                        return;
                    }
                    if (this.f161402q == null) {
                        this.f161402q = P.Q(this.f161386a);
                    }
                    this.f161397l = j(i10);
                    long jC = this.f161389d.c();
                    n(this.f161392g > 0 ? (int) (jC - this.f161393h) : 0, this.f161394i, this.f161397l);
                    this.f161393h = jC;
                    this.f161394i = 0L;
                    this.f161396k = 0L;
                    this.f161395j = 0L;
                    this.f161391f.g();
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    @Override // f3.o
    public synchronized void a(InterfaceC13839d interfaceC13839d, f3.g gVar, boolean z10) {
        try {
            if (m(gVar, z10)) {
                if (this.f161392g == 0) {
                    this.f161393h = this.f161389d.c();
                }
                this.f161392g++;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055 A[Catch: all -> 0x0072, TRY_ENTER, TryCatch #1 {all -> 0x0072, blocks: (B:3:0x0001, B:7:0x0009, B:11:0x0011, B:13:0x002e, B:23:0x0060, B:22:0x0055), top: B:38:0x0001 }] */
    @Override // f3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void b(f3.InterfaceC13839d r11, f3.g r12, boolean r13) throws java.lang.Throwable {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r11 = m(r12, r13)     // Catch: java.lang.Throwable -> L72
            if (r11 != 0) goto L9
            monitor-exit(r10)
            return
        L9:
            int r11 = r10.f161392g     // Catch: java.lang.Throwable -> L72
            r12 = 1
            if (r11 <= 0) goto L10
            r11 = r12
            goto L11
        L10:
            r11 = 0
        L11:
            d3.C13466a.g(r11)     // Catch: java.lang.Throwable -> L72
            d3.h r11 = r10.f161389d     // Catch: java.lang.Throwable -> L72
            long r0 = r11.c()     // Catch: java.lang.Throwable -> L72
            long r2 = r10.f161393h     // Catch: java.lang.Throwable -> L72
            long r2 = r0 - r2
            int r5 = (int) r2     // Catch: java.lang.Throwable -> L72
            long r2 = r10.f161395j     // Catch: java.lang.Throwable -> L72
            long r6 = (long) r5     // Catch: java.lang.Throwable -> L72
            long r2 = r2 + r6
            r10.f161395j = r2     // Catch: java.lang.Throwable -> L72
            long r2 = r10.f161396k     // Catch: java.lang.Throwable -> L72
            long r6 = r10.f161394i     // Catch: java.lang.Throwable -> L72
            long r2 = r2 + r6
            r10.f161396k = r2     // Catch: java.lang.Throwable -> L72
            if (r5 <= 0) goto L75
            float r11 = (float) r6     // Catch: java.lang.Throwable -> L72
            r13 = 1174011904(0x45fa0000, float:8000.0)
            float r11 = r11 * r13
            float r13 = (float) r5     // Catch: java.lang.Throwable -> L72
            float r11 = r11 / r13
            t3.l r13 = r10.f161391f     // Catch: java.lang.Throwable -> L72
            double r2 = (double) r6     // Catch: java.lang.Throwable -> L72
            double r2 = java.lang.Math.sqrt(r2)     // Catch: java.lang.Throwable -> L72
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L72
            r13.c(r2, r11)     // Catch: java.lang.Throwable -> L72
            long r2 = r10.f161395j     // Catch: java.lang.Throwable -> L72
            r6 = 2000(0x7d0, double:9.88E-321)
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 >= 0) goto L55
            long r2 = r10.f161396k     // Catch: java.lang.Throwable -> L51
            r6 = 524288(0x80000, double:2.590327E-318)
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 < 0) goto L60
            goto L55
        L51:
            r0 = move-exception
            r11 = r0
            r4 = r10
            goto L7d
        L55:
            t3.l r11 = r10.f161391f     // Catch: java.lang.Throwable -> L72
            r13 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11.f(r13)     // Catch: java.lang.Throwable -> L72
            long r2 = (long) r11     // Catch: java.lang.Throwable -> L72
            r10.f161397l = r2     // Catch: java.lang.Throwable -> L72
        L60:
            long r6 = r10.f161394i     // Catch: java.lang.Throwable -> L72
            long r8 = r10.f161397l     // Catch: java.lang.Throwable -> L72
            r4 = r10
            r4.n(r5, r6, r8)     // Catch: java.lang.Throwable -> L6f
            r4.f161393h = r0     // Catch: java.lang.Throwable -> L6f
            r0 = 0
            r4.f161394i = r0     // Catch: java.lang.Throwable -> L6f
            goto L76
        L6f:
            r0 = move-exception
        L70:
            r11 = r0
            goto L7d
        L72:
            r0 = move-exception
            r4 = r10
            goto L70
        L75:
            r4 = r10
        L76:
            int r11 = r4.f161392g     // Catch: java.lang.Throwable -> L6f
            int r11 = r11 - r12
            r4.f161392g = r11     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r10)
            return
        L7d:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L6f
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.h.b(f3.d, f3.g, boolean):void");
    }

    @Override // t3.d
    public o c() {
        return this;
    }

    @Override // f3.o
    public synchronized void d(InterfaceC13839d interfaceC13839d, f3.g gVar, boolean z10, int i10) {
        if (m(gVar, z10)) {
            this.f161394i += i10;
        }
    }

    @Override // f3.o
    public void g(InterfaceC13839d interfaceC13839d, f3.g gVar, boolean z10) {
    }

    private h(Context context, Map<Integer, Long> map, int i10, InterfaceC13473h interfaceC13473h, boolean z10) {
        this.f161386a = context == null ? null : context.getApplicationContext();
        this.f161387b = M.d(map);
        this.f161388c = new d.a.C2528a();
        this.f161391f = new l(i10);
        this.f161389d = interfaceC13473h;
        this.f161390e = z10;
        if (context == null) {
            this.f161399n = 0;
            this.f161397l = 1000000L;
            return;
        }
        w wVarE = w.e(context);
        int iG = wVarE.g();
        this.f161399n = iG;
        this.f161397l = j(iG);
        wVarE.k(new w.c() { // from class: t3.g
            @Override // d3.w.c
            public final void a(int i11) throws Throwable {
                this.f161378a.o(i11);
            }
        }, C13467b.a());
    }

    private long j(int i10) {
        Long lValueOf = this.f161387b.get(Integer.valueOf(i10));
        if (lValueOf == null) {
            lValueOf = this.f161387b.get(0);
        } else if (lValueOf.longValue() == -9223372036854775807L) {
            lValueOf = Long.valueOf(k(this.f161402q, i10));
        }
        if (lValueOf == null) {
            lValueOf = 1000000L;
        }
        return lValueOf.longValue();
    }

    public static synchronized h l(Context context) {
        try {
            if (f161385x == null) {
                f161385x = new b(context).a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f161385x;
    }

    private static boolean m(f3.g gVar, boolean z10) {
        return z10 && !gVar.d(8);
    }

    private void n(int i10, long j10, long j11) {
        if (i10 == 0 && j10 == 0 && j11 == this.f161398m) {
            return;
        }
        this.f161398m = j11;
        this.f161388c.c(i10, j10, j11);
    }

    @Override // t3.d
    public void e(d.a aVar) {
        this.f161388c.d(aVar);
    }

    private static long k(String str, int i10) {
        int[] iArrI = i(v.e(str));
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        if (i10 != 7) {
                            if (i10 != 9) {
                                if (i10 != 10) {
                                    return 1000000L;
                                }
                                return f161383v.get(iArrI[4]).longValue();
                            }
                            return f161384w.get(iArrI[5]).longValue();
                        }
                    } else {
                        return f161382u.get(iArrI[3]).longValue();
                    }
                } else {
                    return f161381t.get(iArrI[2]).longValue();
                }
            } else {
                return f161380s.get(iArrI[1]).longValue();
            }
        }
        return f161379r.get(iArrI[0]).longValue();
    }

    @Override // t3.d
    public void f(Handler handler, d.a aVar) {
        C13466a.e(handler);
        C13466a.e(aVar);
        this.f161388c.b(handler, aVar);
    }
}
