package Ki;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.AbstractC18269l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bL\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001:BÅ\u0002\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000e\u0012\b\b\u0002\u0010 \u001a\u00020\u000e\u0012\b\b\u0002\u0010!\u001a\u00020\u000e\u0012\b\b\u0002\u0010\"\u001a\u00020\u000e\u0012\b\b\u0002\u0010#\u001a\u00020\u000e\u0012\b\b\u0002\u0010$\u001a\u00020\u000e\u0012\b\b\u0002\u0010%\u001a\u00020\u000e¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u0010+R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010)\u001a\u0004\b3\u0010+R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\b5\u0010+R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010)\u001a\u0004\b7\u0010+R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b,\u0010;R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b(\u0010;R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b>\u0010)\u001a\u0004\b?\u0010+R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b?\u0010)\u001a\u0004\b@\u0010+R\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b@\u0010)\u001a\u0004\bA\u0010+R\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bA\u0010)\u001a\u0004\bB\u0010+R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010)\u001a\u0004\b.\u0010+R\u0017\u0010\u0014\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bC\u0010)\u001a\u0004\b0\u0010+R\u0017\u0010\u0015\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bD\u0010)\u001a\u0004\b2\u0010+R\u0017\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\bE\u0010+R\u0017\u0010\u0017\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b4\u0010+R\u0017\u0010\u0018\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bF\u0010)\u001a\u0004\b6\u0010+R\u0017\u0010\u0019\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bG\u0010)\u001a\u0004\b8\u0010+R\u0017\u0010\u001a\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bH\u0010)\u001a\u0004\bI\u0010+R\u0017\u0010\u001b\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bJ\u0010)\u001a\u0004\b<\u0010+R\u0017\u0010\u001c\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bK\u0010)\u001a\u0004\bL\u0010+R\u0017\u0010\u001d\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bM\u0010)\u001a\u0004\b=\u0010+R\u0017\u0010\u001e\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bN\u0010)\u001a\u0004\bO\u0010+R\u0017\u0010\u001f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bP\u0010)\u001a\u0004\b>\u0010+R\u0017\u0010 \u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bQ\u0010)\u001a\u0004\bR\u0010+R\u0017\u0010!\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bS\u0010)\u001a\u0004\bT\u0010+R\u0017\u0010\"\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bU\u0010)\u001a\u0004\bV\u0010+R\u0017\u0010#\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bW\u0010)\u001a\u0004\bX\u0010+R\u0017\u0010$\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bY\u0010)\u001a\u0004\bC\u0010+R\u0017\u0010%\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bZ\u0010)\u001a\u0004\bD\u0010+\u0082\u0001\u0001[¨\u0006\\"}, d2 = {"LKi/W;", "LKi/U;", "LV0/q0;", "adsTextColor01", "adsTextColor02", "adsTextColor03", "adsColorPlaceholder", "adsColorSavings", "adsColorLink", "adsColorInverse", "Ly1/l;", "adsFontFamilyBrand", "adsFontFamilyPromo", "adsFontFamilyProduct", "LH1/v;", "adsLetterSpacing00", "adsLetterSpacing01", "adsLetterSpacing02", "adsLetterSpacing03", "adsFontSize01", "adsFontSize02", "adsFontSize03", "adsFontSize04", "adsFontSize05", "adsFontSize06", "adsFontSize07", "adsFontSize08", "adsFontSize09", "adsFontSize10", "adsFontSize11", "adsFontSize12", "adsFontSize13", "adsFontSize14", "adsFontSize15", "adsFontSize16", "adsFontSize17", "adsLineHeight01", "adsLineHeight02", "<init>", "(JJJJJJJLy1/l;Ly1/l;Ly1/l;JJJJJJJJJJJJJJJJJJJJJJJ)V", "b", "J", "s", "()J", "c", "t", "d", "getAdsTextColor03-0d7_KjU", "e", "getAdsColorPlaceholder-0d7_KjU", "f", "getAdsColorSavings-0d7_KjU", "g", "getAdsColorLink-0d7_KjU", "h", "getAdsColorInverse-0d7_KjU", "i", "Ly1/l;", "a", "()Ly1/l;", "j", "k", "l", "m", "n", "o", "p", "q", "r", "getAdsFontSize04-XSAIIZE", "u", "v", "w", "getAdsFontSize08-XSAIIZE", "x", "y", "getAdsFontSize10-XSAIIZE", "z", "A", "getAdsFontSize12-XSAIIZE", "B", "C", "getAdsFontSize14-XSAIIZE", "D", "getAdsFontSize15-XSAIIZE", "E", "getAdsFontSize16-XSAIIZE", "F", "getAdsFontSize17-XSAIIZE", "G", "H", "LKi/W$a;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class W implements U {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final long adsFontSize12;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final long adsFontSize13;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final long adsFontSize14;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final long adsFontSize15;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final long adsFontSize16;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final long adsFontSize17;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final long adsLineHeight01;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final long adsLineHeight02;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long adsTextColor01;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long adsTextColor02;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long adsTextColor03;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long adsColorPlaceholder;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long adsColorSavings;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long adsColorLink;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long adsColorInverse;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final AbstractC18269l adsFontFamilyBrand;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final AbstractC18269l adsFontFamilyPromo;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final AbstractC18269l adsFontFamilyProduct;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long adsLetterSpacing00;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long adsLetterSpacing01;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long adsLetterSpacing02;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final long adsLetterSpacing03;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final long adsFontSize01;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final long adsFontSize02;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final long adsFontSize03;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final long adsFontSize04;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long adsFontSize05;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final long adsFontSize06;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final long adsFontSize07;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final long adsFontSize08;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final long adsFontSize09;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final long adsFontSize10;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final long adsFontSize11;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LKi/W$a;", "LKi/W;", "LV0/q0;", "adsTextColor01", "adsTextColor02", "adsTextColor03", "adsColorPlaceholder", "adsColorSavings", "adsColorLink", "adsColorInverse", "<init>", "(JJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends W {
        public /* synthetic */ a(long j10, long j11, long j12, long j13, long j14, long j15, long j16, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, j11, j12, j13, j14, j15, j16);
        }

        private a(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            super(j10, j11, j12, j13, j14, j15, j16, null, null, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -128, 1, null);
        }
    }

    public /* synthetic */ W(long j10, long j11, long j12, long j13, long j14, long j15, long j16, AbstractC18269l abstractC18269l, AbstractC18269l abstractC18269l2, AbstractC18269l abstractC18269l3, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16, abstractC18269l, abstractC18269l2, abstractC18269l3, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39);
    }

    private W(long j10, long j11, long j12, long j13, long j14, long j15, long j16, AbstractC18269l adsFontFamilyBrand, AbstractC18269l adsFontFamilyPromo, AbstractC18269l adsFontFamilyProduct, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39) {
        Intrinsics.j(adsFontFamilyBrand, "adsFontFamilyBrand");
        Intrinsics.j(adsFontFamilyPromo, "adsFontFamilyPromo");
        Intrinsics.j(adsFontFamilyProduct, "adsFontFamilyProduct");
        this.adsTextColor01 = j10;
        this.adsTextColor02 = j11;
        this.adsTextColor03 = j12;
        this.adsColorPlaceholder = j13;
        this.adsColorSavings = j14;
        this.adsColorLink = j15;
        this.adsColorInverse = j16;
        this.adsFontFamilyBrand = adsFontFamilyBrand;
        this.adsFontFamilyPromo = adsFontFamilyPromo;
        this.adsFontFamilyProduct = adsFontFamilyProduct;
        this.adsLetterSpacing00 = j17;
        this.adsLetterSpacing01 = j18;
        this.adsLetterSpacing02 = j19;
        this.adsLetterSpacing03 = j20;
        this.adsFontSize01 = j21;
        this.adsFontSize02 = j22;
        this.adsFontSize03 = j23;
        this.adsFontSize04 = j24;
        this.adsFontSize05 = j25;
        this.adsFontSize06 = j26;
        this.adsFontSize07 = j27;
        this.adsFontSize08 = j28;
        this.adsFontSize09 = j29;
        this.adsFontSize10 = j30;
        this.adsFontSize11 = j31;
        this.adsFontSize12 = j32;
        this.adsFontSize13 = j33;
        this.adsFontSize14 = j34;
        this.adsFontSize15 = j35;
        this.adsFontSize16 = j36;
        this.adsFontSize17 = j37;
        this.adsLineHeight01 = j38;
        this.adsLineHeight02 = j39;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC18269l getAdsFontFamilyBrand() {
        return this.adsFontFamilyBrand;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC18269l getAdsFontFamilyProduct() {
        return this.adsFontFamilyProduct;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC18269l getAdsFontFamilyPromo() {
        return this.adsFontFamilyPromo;
    }

    /* renamed from: d, reason: from getter */
    public final long getAdsFontSize01() {
        return this.adsFontSize01;
    }

    /* renamed from: e, reason: from getter */
    public final long getAdsFontSize02() {
        return this.adsFontSize02;
    }

    /* renamed from: f, reason: from getter */
    public final long getAdsFontSize03() {
        return this.adsFontSize03;
    }

    /* renamed from: g, reason: from getter */
    public final long getAdsFontSize05() {
        return this.adsFontSize05;
    }

    /* renamed from: h, reason: from getter */
    public final long getAdsFontSize06() {
        return this.adsFontSize06;
    }

    /* renamed from: i, reason: from getter */
    public final long getAdsFontSize07() {
        return this.adsFontSize07;
    }

    /* renamed from: j, reason: from getter */
    public final long getAdsFontSize09() {
        return this.adsFontSize09;
    }

    /* renamed from: k, reason: from getter */
    public final long getAdsFontSize11() {
        return this.adsFontSize11;
    }

    /* renamed from: l, reason: from getter */
    public final long getAdsFontSize13() {
        return this.adsFontSize13;
    }

    /* renamed from: m, reason: from getter */
    public final long getAdsLetterSpacing00() {
        return this.adsLetterSpacing00;
    }

    /* renamed from: n, reason: from getter */
    public final long getAdsLetterSpacing01() {
        return this.adsLetterSpacing01;
    }

    /* renamed from: o, reason: from getter */
    public final long getAdsLetterSpacing02() {
        return this.adsLetterSpacing02;
    }

    /* renamed from: p, reason: from getter */
    public final long getAdsLetterSpacing03() {
        return this.adsLetterSpacing03;
    }

    /* renamed from: q, reason: from getter */
    public final long getAdsLineHeight01() {
        return this.adsLineHeight01;
    }

    /* renamed from: r, reason: from getter */
    public final long getAdsLineHeight02() {
        return this.adsLineHeight02;
    }

    /* renamed from: s, reason: from getter */
    public final long getAdsTextColor01() {
        return this.adsTextColor01;
    }

    /* renamed from: t, reason: from getter */
    public final long getAdsTextColor02() {
        return this.adsTextColor02;
    }

    public /* synthetic */ W(long j10, long j11, long j12, long j13, long j14, long j15, long j16, AbstractC18269l abstractC18269l, AbstractC18269l abstractC18269l2, AbstractC18269l abstractC18269l3, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16, (i10 & 128) != 0 ? U.INSTANCE.b() : abstractC18269l, (i10 & 256) != 0 ? U.INSTANCE.a() : abstractC18269l2, (i10 & 512) != 0 ? U.INSTANCE.c() : abstractC18269l3, (i10 & 1024) != 0 ? H1.w.g(0.0d) : j17, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? H1.w.g(0.16d) : j18, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? H1.w.g(0.32d) : j19, (i10 & 8192) != 0 ? H1.w.g(0.64d) : j20, (i10 & 16384) != 0 ? H1.w.i(12) : j21, (32768 & i10) != 0 ? H1.w.i(14) : j22, (65536 & i10) != 0 ? H1.w.i(16) : j23, (131072 & i10) != 0 ? H1.w.i(18) : j24, (262144 & i10) != 0 ? H1.w.i(20) : j25, (524288 & i10) != 0 ? H1.w.i(24) : j26, (1048576 & i10) != 0 ? H1.w.i(28) : j27, (2097152 & i10) != 0 ? H1.w.i(32) : j28, (4194304 & i10) != 0 ? H1.w.i(36) : j29, (8388608 & i10) != 0 ? H1.w.i(42) : j30, (16777216 & i10) != 0 ? H1.w.i(48) : j31, (33554432 & i10) != 0 ? H1.w.i(54) : j32, (67108864 & i10) != 0 ? H1.w.i(60) : j33, (134217728 & i10) != 0 ? H1.w.i(68) : j34, (268435456 & i10) != 0 ? H1.w.i(76) : j35, (536870912 & i10) != 0 ? H1.w.i(84) : j36, (1073741824 & i10) != 0 ? H1.w.i(92) : j37, (i10 & Integer.MIN_VALUE) != 0 ? H1.w.d(1.25d) : j38, (i11 & 1) != 0 ? H1.w.d(1.5d) : j39, null);
    }
}
