package ln;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ<\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lln/n;", "", "", "promo", "promoDescription", "", "index", "", "isExpanded", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "a", "(Ljava/lang/String;Ljava/lang/String;IZ)Lln/n;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "e", "c", "I", "Z", "f", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ln.n, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class StackedPromo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promo;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promoDescription;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int index;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isExpanded;

    public StackedPromo() {
        this(null, null, 0, false, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StackedPromo)) {
            return false;
        }
        StackedPromo stackedPromo = (StackedPromo) other;
        return Intrinsics.e(this.promo, stackedPromo.promo) && Intrinsics.e(this.promoDescription, stackedPromo.promoDescription) && this.index == stackedPromo.index && this.isExpanded == stackedPromo.isExpanded;
    }

    public StackedPromo(String str, String str2, int i10, boolean z10) {
        this.promo = str;
        this.promoDescription = str2;
        this.index = i10;
        this.isExpanded = z10;
    }

    public static /* synthetic */ StackedPromo b(StackedPromo stackedPromo, String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = stackedPromo.promo;
        }
        if ((i11 & 2) != 0) {
            str2 = stackedPromo.promoDescription;
        }
        if ((i11 & 4) != 0) {
            i10 = stackedPromo.index;
        }
        if ((i11 & 8) != 0) {
            z10 = stackedPromo.isExpanded;
        }
        return stackedPromo.a(str, str2, i10, z10);
    }

    public final StackedPromo a(String promo, String promoDescription, int index, boolean isExpanded) {
        return new StackedPromo(promo, promoDescription, index, isExpanded);
    }

    /* renamed from: c, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* renamed from: d, reason: from getter */
    public final String getPromo() {
        return this.promo;
    }

    /* renamed from: e, reason: from getter */
    public final String getPromoDescription() {
        return this.promoDescription;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public int hashCode() {
        String str = this.promo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.promoDescription;
        return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.index)) * 31) + Boolean.hashCode(this.isExpanded);
    }

    public String toString() {
        return "StackedPromo(promo=" + this.promo + ", promoDescription=" + this.promoDescription + ", index=" + this.index + ", isExpanded=" + this.isExpanded + ')';
    }

    public /* synthetic */ StackedPromo(String str, String str2, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? false : z10);
    }
}
