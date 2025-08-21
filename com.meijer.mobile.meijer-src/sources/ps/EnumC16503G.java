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
/* loaded from: classes12.dex */
public final class EnumC16503G {

    /* renamed from: D, reason: collision with root package name */
    private static final /* synthetic */ EnumC16503G[] f157125D;

    /* renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f157126E;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int resId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int intentCode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int stringResId;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC16503G f157128e = new EnumC16503G("HOME", 0, g0.f157301q, 0, Cj.o.f5041S);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC16503G f157129f = new EnumC16503G("DEPARTMENTS", 1, g0.f157296l, 180, Cj.o.f5046W);

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC16503G f157130g = new EnumC16503G("COUPONS", 2, g0.f157294j, 536871032, Cj.o.f5031N);

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC16503G f157131h = new EnumC16503G("REWARDS", 3, g0.f157308x, 165, Cj.o.f5045V);

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC16503G f157132i = new EnumC16503G("CART", 4, g0.f157292h, 268437856, Cj.o.f5027L);

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC16503G f157133j = new EnumC16503G("RECEIPTS_AND_SAVINGS", 5, g0.f157309y, 1000, Cj.o.f5053b0);

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC16503G f157134k = new EnumC16503G("SHOPPING_LIST", 6, g0.f157279C, HttpResponseStatus.SUCCESS_OK, Cj.o.f5061f0);

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC16503G f157135l = new EnumC16503G("SCHOOL_SUPPLY_LIST", 7, g0.f157310z, 268440656, Cj.o.f5055c0);

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC16503G f157136m = new EnumC16503G("WEEKLY_AD", 8, g0.f157281E, 536871412, Cj.o.f5065h0);

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC16503G f157137n = new EnumC16503G("HEARING_AIDS", 9, g0.f157299o, 1901, 0);

    /* renamed from: o, reason: collision with root package name */
    public static final EnumC16503G f157138o = new EnumC16503G("MCC", 10, g0.f157302r, 1200, 0);

    /* renamed from: p, reason: collision with root package name */
    public static final EnumC16503G f157139p = new EnumC16503G("MEIJER_STYLE", 11, g0.f157303s, 1201, 0);

    /* renamed from: q, reason: collision with root package name */
    public static final EnumC16503G f157140q = new EnumC16503G("SETTINGS", 12, g0.f157277A, 268436157, Cj.o.f5057d0);

    /* renamed from: r, reason: collision with root package name */
    public static final EnumC16503G f157141r = new EnumC16503G("HELP", 13, g0.f157300p, 9000, Cj.o.f5039R);

    /* renamed from: s, reason: collision with root package name */
    public static final EnumC16503G f157142s = new EnumC16503G("SIGN_OUT", 14, g0.f157280D, 800, Cj.o.f5063g0);

    /* renamed from: t, reason: collision with root package name */
    public static final EnumC16503G f157143t = new EnumC16503G("SHOP_AND_SCAN", 15, g0.f157278B, 268437756, Cj.o.f5059e0);

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC16503G f157144u = new EnumC16503G("ORDER_HISTORY", 16, g0.f157304t, 268437956, Cj.o.f5048Y);

    /* renamed from: v, reason: collision with root package name */
    public static final EnumC16503G f157145v = new EnumC16503G("DESIGN_CATALOG", 17, g0.f157297m, 8100, Cj.o.f5035P);

    /* renamed from: w, reason: collision with root package name */
    public static final EnumC16503G f157146w = new EnumC16503G("ACRES_SHOWCASE", 18, g0.f157285a, 8101, Cj.o.f5023J);

    /* renamed from: x, reason: collision with root package name */
    public static final EnumC16503G f157147x = new EnumC16503G("DEBUG_OPTIONS", 19, g0.f157295k, 7256, Cj.o.f5033O);

    /* renamed from: y, reason: collision with root package name */
    public static final EnumC16503G f157148y = new EnumC16503G("PROVIDE_FEEDBACK", 20, g0.f157307w, 8266, Cj.o.f5051a0);

    /* renamed from: z, reason: collision with root package name */
    public static final EnumC16503G f157149z = new EnumC16503G("PHARMACY", 21, g0.f157305u, 1700, 0);

    /* renamed from: A, reason: collision with root package name */
    public static final EnumC16503G f157122A = new EnumC16503G("PHOTO", 22, g0.f157306v, 1100, Cj.o.f5049Z);

    /* renamed from: B, reason: collision with root package name */
    public static final EnumC16503G f157123B = new EnumC16503G("CAKES", 23, g0.f157291g, 5100, Cj.o.f5025K);

    /* renamed from: C, reason: collision with root package name */
    public static final EnumC16503G f157124C = new EnumC16503G("CHATBOT", 24, g0.f157293i, 16385, Cj.o.f5029M);

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
        public final EnumC16503G a(int intentCode) {
            EnumC16503G next;
            Iterator<EnumC16503G> it = EnumC16503G.b().iterator();
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
            EnumC16503G enumC16503G = next;
            if (enumC16503G == null) {
                return EnumC16503G.f157128e;
            }
            return enumC16503G;
        }

        @JvmStatic
        public final EnumC16503G b(int resId) {
            EnumC16503G next;
            Iterator<EnumC16503G> it = EnumC16503G.b().iterator();
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
            EnumC16503G enumC16503G = next;
            if (enumC16503G == null) {
                return EnumC16503G.f157128e;
            }
            return enumC16503G;
        }
    }

    public static EnumEntries<EnumC16503G> b() {
        return f157126E;
    }

    static {
        EnumC16503G[] enumC16503GArrA = a();
        f157125D = enumC16503GArrA;
        f157126E = EnumEntriesKt.a(enumC16503GArrA);
        INSTANCE = new Companion(null);
    }

    private static final /* synthetic */ EnumC16503G[] a() {
        return new EnumC16503G[]{f157128e, f157129f, f157130g, f157131h, f157132i, f157133j, f157134k, f157135l, f157136m, f157137n, f157138o, f157139p, f157140q, f157141r, f157142s, f157143t, f157144u, f157145v, f157146w, f157147x, f157148y, f157149z, f157122A, f157123B, f157124C};
    }

    public static EnumC16503G valueOf(String str) {
        return (EnumC16503G) Enum.valueOf(EnumC16503G.class, str);
    }

    public static EnumC16503G[] values() {
        return (EnumC16503G[]) f157125D.clone();
    }

    /* renamed from: e, reason: from getter */
    public final int getIntentCode() {
        return this.intentCode;
    }

    /* renamed from: l, reason: from getter */
    public final int getResId() {
        return this.resId;
    }

    private EnumC16503G(String str, int i10, int i11, int i12, int i13) {
        this.resId = i11;
        this.intentCode = i12;
        this.stringResId = i13;
    }
}
