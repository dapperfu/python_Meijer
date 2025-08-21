package kotlin;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0016"}, d2 = {"Ly1/B;", "", "", "weight", "<init>", "(I)V", "other", "z", "(Ly1/B;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "B", "b", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: y1.B, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final class FontWeight implements Comparable<FontWeight> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final FontWeight f171044c;

    /* renamed from: d, reason: collision with root package name */
    private static final FontWeight f171045d;

    /* renamed from: e, reason: collision with root package name */
    private static final FontWeight f171046e;

    /* renamed from: f, reason: collision with root package name */
    private static final FontWeight f171047f;

    /* renamed from: g, reason: collision with root package name */
    private static final FontWeight f171048g;

    /* renamed from: h, reason: collision with root package name */
    private static final FontWeight f171049h;

    /* renamed from: i, reason: collision with root package name */
    private static final FontWeight f171050i;

    /* renamed from: j, reason: collision with root package name */
    private static final FontWeight f171051j;

    /* renamed from: k, reason: collision with root package name */
    private static final FontWeight f171052k;

    /* renamed from: l, reason: collision with root package name */
    private static final FontWeight f171053l;

    /* renamed from: m, reason: collision with root package name */
    private static final FontWeight f171054m;

    /* renamed from: n, reason: collision with root package name */
    private static final FontWeight f171055n;

    /* renamed from: o, reason: collision with root package name */
    private static final FontWeight f171056o;

    /* renamed from: p, reason: collision with root package name */
    private static final FontWeight f171057p;

    /* renamed from: q, reason: collision with root package name */
    private static final FontWeight f171058q;

    /* renamed from: r, reason: collision with root package name */
    private static final FontWeight f171059r;

    /* renamed from: s, reason: collision with root package name */
    private static final FontWeight f171060s;

    /* renamed from: t, reason: collision with root package name */
    private static final FontWeight f171061t;

    /* renamed from: u, reason: collision with root package name */
    private static final List<FontWeight> f171062u;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int weight;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR \u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR \u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR \u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR \u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\bR \u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\bR \u0010\"\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u0006\u0012\u0004\b$\u0010\u0003\u001a\u0004\b#\u0010\b¨\u0006%"}, d2 = {"Ly1/B$a;", "", "<init>", "()V", "Ly1/B;", "W400", "Ly1/B;", "h", "()Ly1/B;", "getW400$annotations", "W500", "i", "getW500$annotations", "W600", "j", "getW600$annotations", "Thin", "g", "getThin$annotations", "Light", "c", "getLight$annotations", "Normal", "e", "getNormal$annotations", "Medium", "d", "getMedium$annotations", "SemiBold", "f", "getSemiBold$annotations", "Bold", "a", "getBold$annotations", "ExtraBold", "b", "getExtraBold$annotations", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: y1.B$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FontWeight a() {
            return FontWeight.f171059r;
        }

        public final FontWeight b() {
            return FontWeight.f171060s;
        }

        public final FontWeight c() {
            return FontWeight.f171055n;
        }

        public final FontWeight d() {
            return FontWeight.f171057p;
        }

        public final FontWeight e() {
            return FontWeight.f171056o;
        }

        public final FontWeight f() {
            return FontWeight.f171058q;
        }

        public final FontWeight g() {
            return FontWeight.f171053l;
        }

        public final FontWeight h() {
            return FontWeight.f171047f;
        }

        public final FontWeight i() {
            return FontWeight.f171048g;
        }

        public final FontWeight j() {
            return FontWeight.f171049h;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FontWeight) && this.weight == ((FontWeight) other).weight;
    }

    static {
        FontWeight fontWeight = new FontWeight(100);
        f171044c = fontWeight;
        FontWeight fontWeight2 = new FontWeight(HttpResponseStatus.SUCCESS_OK);
        f171045d = fontWeight2;
        FontWeight fontWeight3 = new FontWeight(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES);
        f171046e = fontWeight3;
        FontWeight fontWeight4 = new FontWeight(HttpResponseStatus.ERROR_BAD_REQUEST);
        f171047f = fontWeight4;
        FontWeight fontWeight5 = new FontWeight(HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR);
        f171048g = fontWeight5;
        FontWeight fontWeight6 = new FontWeight(600);
        f171049h = fontWeight6;
        FontWeight fontWeight7 = new FontWeight(700);
        f171050i = fontWeight7;
        FontWeight fontWeight8 = new FontWeight(800);
        f171051j = fontWeight8;
        FontWeight fontWeight9 = new FontWeight(900);
        f171052k = fontWeight9;
        f171053l = fontWeight;
        f171054m = fontWeight2;
        f171055n = fontWeight3;
        f171056o = fontWeight4;
        f171057p = fontWeight5;
        f171058q = fontWeight6;
        f171059r = fontWeight7;
        f171060s = fontWeight8;
        f171061t = fontWeight9;
        f171062u = CollectionsKt.p(fontWeight, fontWeight2, fontWeight3, fontWeight4, fontWeight5, fontWeight6, fontWeight7, fontWeight8, fontWeight9);
    }

    /* renamed from: B, reason: from getter */
    public final int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return this.weight;
    }

    public String toString() {
        return "FontWeight(weight=" + this.weight + ')';
    }

    @Override // java.lang.Comparable
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public int compareTo(FontWeight other) {
        return Intrinsics.k(this.weight, other.weight);
    }

    public FontWeight(int i10) {
        this.weight = i10;
        boolean z10 = false;
        if (1 <= i10 && i10 < 1001) {
            z10 = true;
        }
        if (!z10) {
            A1.a.a("Font weight can be in range [1, 1000]. Current value: " + i10);
        }
    }
}
