package ps;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b&\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bj\u0002\b\rj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\nj\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'¨\u0006("}, d2 = {"Lps/G;", "", "", "resId", "intentCode", "stringResId", "<init>", "(Ljava/lang/String;IIII)V", "a", "I", "l", "()I", "b", "e", "c", "getStringResId", "d", "f", "g", "h", "i", "j", "k", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ps.G, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC16377G {

    /* renamed from: D, reason: collision with root package name */
    private static final /* synthetic */ EnumC16377G[] f156352D;

    /* renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f156353E;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int resId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int intentCode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int stringResId;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC16377G f156355e = new EnumC16377G("HOME", 0, g0.f156528q, 0, Bj.o.f2996S);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC16377G f156356f = new EnumC16377G("DEPARTMENTS", 1, g0.f156523l, 180, Bj.o.f3001W);

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC16377G f156357g = new EnumC16377G("COUPONS", 2, g0.f156521j, 536871032, Bj.o.f2986N);

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC16377G f156358h = new EnumC16377G("REWARDS", 3, g0.f156535x, 165, Bj.o.f3000V);

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC16377G f156359i = new EnumC16377G("CART", 4, g0.f156519h, 268437856, Bj.o.f2982L);

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC16377G f156360j = new EnumC16377G("RECEIPTS_AND_SAVINGS", 5, g0.f156536y, 1000, Bj.o.f3008b0);

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC16377G f156361k = new EnumC16377G("SHOPPING_LIST", 6, g0.f156506C, HttpResponseStatus.SUCCESS_OK, Bj.o.f3016f0);

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC16377G f156362l = new EnumC16377G("SCHOOL_SUPPLY_LIST", 7, g0.f156537z, 268440656, Bj.o.f3010c0);

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC16377G f156363m = new EnumC16377G("WEEKLY_AD", 8, g0.f156508E, 536871412, Bj.o.f3020h0);

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC16377G f156364n = new EnumC16377G("HEARING_AIDS", 9, g0.f156526o, 1901, 0);

    /* renamed from: o, reason: collision with root package name */
    public static final EnumC16377G f156365o = new EnumC16377G("MCC", 10, g0.f156529r, 1200, 0);

    /* renamed from: p, reason: collision with root package name */
    public static final EnumC16377G f156366p = new EnumC16377G("MEIJER_STYLE", 11, g0.f156530s, 1201, 0);

    /* renamed from: q, reason: collision with root package name */
    public static final EnumC16377G f156367q = new EnumC16377G("SETTINGS", 12, g0.f156504A, 268436157, Bj.o.f3012d0);

    /* renamed from: r, reason: collision with root package name */
    public static final EnumC16377G f156368r = new EnumC16377G("HELP", 13, g0.f156527p, 9000, Bj.o.f2994R);

    /* renamed from: s, reason: collision with root package name */
    public static final EnumC16377G f156369s = new EnumC16377G("SIGN_OUT", 14, g0.f156507D, 800, Bj.o.f3018g0);

    /* renamed from: t, reason: collision with root package name */
    public static final EnumC16377G f156370t = new EnumC16377G("SHOP_AND_SCAN", 15, g0.f156505B, 268437756, Bj.o.f3014e0);

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC16377G f156371u = new EnumC16377G("ORDER_HISTORY", 16, g0.f156531t, 268437956, Bj.o.f3003Y);

    /* renamed from: v, reason: collision with root package name */
    public static final EnumC16377G f156372v = new EnumC16377G("DESIGN_CATALOG", 17, g0.f156524m, 8100, Bj.o.f2990P);

    /* renamed from: w, reason: collision with root package name */
    public static final EnumC16377G f156373w = new EnumC16377G("ACRES_SHOWCASE", 18, g0.f156512a, 8101, Bj.o.f2978J);

    /* renamed from: x, reason: collision with root package name */
    public static final EnumC16377G f156374x = new EnumC16377G("DEBUG_OPTIONS", 19, g0.f156522k, 7256, Bj.o.f2988O);

    /* renamed from: y, reason: collision with root package name */
    public static final EnumC16377G f156375y = new EnumC16377G("PROVIDE_FEEDBACK", 20, g0.f156534w, 8266, Bj.o.f3006a0);

    /* renamed from: z, reason: collision with root package name */
    public static final EnumC16377G f156376z = new EnumC16377G("PHARMACY", 21, g0.f156532u, 1700, 0);

    /* renamed from: A, reason: collision with root package name */
    public static final EnumC16377G f156349A = new EnumC16377G("PHOTO", 22, g0.f156533v, 1100, Bj.o.f3004Z);

    /* renamed from: B, reason: collision with root package name */
    public static final EnumC16377G f156350B = new EnumC16377G("CAKES", 23, g0.f156518g, 5100, Bj.o.f2980K);

    /* renamed from: C, reason: collision with root package name */
    public static final EnumC16377G f156351C = new EnumC16377G("CHATBOT", 24, g0.f156520i, 16385, Bj.o.f2984M);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lps/G$a;", "", "<init>", "()V", "", "resId", "Lps/G;", "b", "(I)Lps/G;", "intentCode", "a", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: ps.G$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EnumC16377G a(int intentCode) {
            EnumC16377G next;
            Iterator<EnumC16377G> it = EnumC16377G.b().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (next.getIntentCode() == intentCode) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            EnumC16377G enumC16377G = next;
            if (enumC16377G == null) {
                return EnumC16377G.f156355e;
            }
            return enumC16377G;
        }

        @JvmStatic
        public final EnumC16377G b(int resId) {
            EnumC16377G next;
            Iterator<EnumC16377G> it = EnumC16377G.b().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (next.getResId() == resId) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            EnumC16377G enumC16377G = next;
            if (enumC16377G == null) {
                return EnumC16377G.f156355e;
            }
            return enumC16377G;
        }
    }

    public static EnumEntries<EnumC16377G> b() {
        return f156353E;
    }

    static {
        EnumC16377G[] enumC16377GArrA = a();
        f156352D = enumC16377GArrA;
        f156353E = EnumEntriesKt.a(enumC16377GArrA);
        INSTANCE = new Companion(null);
    }

    private static final /* synthetic */ EnumC16377G[] a() {
        return new EnumC16377G[]{f156355e, f156356f, f156357g, f156358h, f156359i, f156360j, f156361k, f156362l, f156363m, f156364n, f156365o, f156366p, f156367q, f156368r, f156369s, f156370t, f156371u, f156372v, f156373w, f156374x, f156375y, f156376z, f156349A, f156350B, f156351C};
    }

    public static EnumC16377G valueOf(String str) {
        return (EnumC16377G) Enum.valueOf(EnumC16377G.class, str);
    }

    public static EnumC16377G[] values() {
        return (EnumC16377G[]) f156352D.clone();
    }

    /* renamed from: e, reason: from getter */
    public final int getIntentCode() {
        return this.intentCode;
    }

    /* renamed from: l, reason: from getter */
    public final int getResId() {
        return this.resId;
    }

    private EnumC16377G(String str, int i10, int i11, int i12, int i13) {
        this.resId = i11;
        this.intentCode = i12;
        this.stringResId = i13;
    }
}
