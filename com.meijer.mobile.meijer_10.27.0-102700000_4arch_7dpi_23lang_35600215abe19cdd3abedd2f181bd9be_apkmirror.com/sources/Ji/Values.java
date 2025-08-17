package Ji;

import androidx.compose.ui.text.TextStyle;
import kotlin.AbstractC18142l;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001d¨\u0006&"}, d2 = {"LJi/y;", "", "LJi/W;", "transformations", "LJi/I;", "One", "Two", "Three", "Four", "Five", "<init>", "(LJi/W;LJi/I;LJi/I;LJi/I;LJi/I;LJi/I;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LJi/W;", "getTransformations", "()LJi/W;", "b", "LJi/I;", "m", "()LJi/I;", "c", "o", "d", "n", "e", "l", "f", "k", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ji.y, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class Values {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final W transformations;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final I One;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final I Two;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final I Three;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final I Four;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final I Five;

    public Values(W transformations, I One, I Two, I Three, I Four, I Five) {
        Intrinsics.j(transformations, "transformations");
        Intrinsics.j(One, "One");
        Intrinsics.j(Two, "Two");
        Intrinsics.j(Three, "Three");
        Intrinsics.j(Four, "Four");
        Intrinsics.j(Five, "Five");
        this.transformations = transformations;
        this.One = One;
        this.Two = Two;
        this.Three = Three;
        this.Four = Four;
        this.Five = Five;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Values)) {
            return false;
        }
        Values values = (Values) other;
        return Intrinsics.e(this.transformations, values.transformations) && Intrinsics.e(this.One, values.One) && Intrinsics.e(this.Two, values.Two) && Intrinsics.e(this.Three, values.Three) && Intrinsics.e(this.Four, values.Four) && Intrinsics.e(this.Five, values.Five);
    }

    public int hashCode() {
        return (((((((((this.transformations.hashCode() * 31) + this.One.hashCode()) * 31) + this.Two.hashCode()) * 31) + this.Three.hashCode()) * 31) + this.Four.hashCode()) * 31) + this.Five.hashCode();
    }

    /* renamed from: k, reason: from getter */
    public final I getFive() {
        return this.Five;
    }

    /* renamed from: l, reason: from getter */
    public final I getFour() {
        return this.Four;
    }

    /* renamed from: m, reason: from getter */
    public final I getOne() {
        return this.One;
    }

    /* renamed from: n, reason: from getter */
    public final I getThree() {
        return this.Three;
    }

    /* renamed from: o, reason: from getter */
    public final I getTwo() {
        return this.Two;
    }

    public String toString() {
        return "Values(transformations=" + this.transformations + ", One=" + this.One + ", Two=" + this.Two + ", Three=" + this.Three + ", Four=" + this.Four + ", Five=" + this.Five + ')';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle f(W w10) {
        return new TextStyle(w10.getAdsTextColor01(), w10.getAdsFontSize07(), FontWeight.INSTANCE.f(), null, null, w10.getAdsFontFamilyPromo(), null, w10.getAdsLetterSpacing00(), null, null, null, 0L, null, null, null, 0, 0, w10.getAdsLineHeight01(), null, null, null, 0, 0, null, 16645976, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle g(W w10) {
        return new TextStyle(w10.getAdsTextColor01(), w10.getAdsFontSize05(), FontWeight.INSTANCE.f(), null, null, w10.getAdsFontFamilyPromo(), null, w10.getAdsLetterSpacing00(), null, null, null, 0L, null, null, null, 0, 0, w10.getAdsLineHeight01(), null, null, null, 0, 0, null, 16645976, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle h(W w10) {
        return new TextStyle(w10.getAdsTextColor01(), w10.getAdsFontSize03(), FontWeight.INSTANCE.f(), null, null, w10.getAdsFontFamilyPromo(), null, w10.getAdsLetterSpacing00(), null, null, null, 0L, null, null, null, 0, 0, w10.getAdsLineHeight01(), null, null, null, 0, 0, null, 16645976, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle i(W w10) {
        return new TextStyle(w10.getAdsTextColor01(), w10.getAdsFontSize02(), FontWeight.INSTANCE.f(), null, null, w10.getAdsFontFamilyPromo(), null, w10.getAdsLetterSpacing00(), null, null, null, 0L, null, null, null, 0, 0, w10.getAdsLineHeight01(), null, null, null, 0, 0, null, 16645976, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle j(W w10) {
        long adsTextColor02 = w10.getAdsTextColor02();
        AbstractC18142l adsFontFamilyProduct = w10.getAdsFontFamilyProduct();
        return new TextStyle(adsTextColor02, w10.getAdsFontSize02(), FontWeight.INSTANCE.e(), null, null, adsFontFamilyProduct, null, w10.getAdsLetterSpacing01(), null, null, null, 0L, F1.k.INSTANCE.b(), null, null, 0, 0, w10.getAdsLineHeight01(), null, null, null, 0, 0, null, 16641880, null);
    }

    public /* synthetic */ Values(final W w10, I i10, I i11, I i12, I i13, I i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(w10, (i15 & 2) != 0 ? new I() { // from class: Ji.t
            @Override // Ji.I
            public final TextStyle getStyle() {
                return Values.f(w10);
            }
        } : i10, (i15 & 4) != 0 ? new I() { // from class: Ji.u
            @Override // Ji.I
            public final TextStyle getStyle() {
                return Values.g(w10);
            }
        } : i11, (i15 & 8) != 0 ? new I() { // from class: Ji.v
            @Override // Ji.I
            public final TextStyle getStyle() {
                return Values.h(w10);
            }
        } : i12, (i15 & 16) != 0 ? new I() { // from class: Ji.w
            @Override // Ji.I
            public final TextStyle getStyle() {
                return Values.i(w10);
            }
        } : i13, (i15 & 32) != 0 ? new I() { // from class: Ji.x
            @Override // Ji.I
            public final TextStyle getStyle() {
                return Values.j(w10);
            }
        } : i14);
    }
}
