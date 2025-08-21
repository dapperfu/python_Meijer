package mn;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lmn/l;", "", "Lmn/m;", "promoType", "", "Lmn/n;", "stackedPromos", "<init>", "(Lmn/m;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmn/m;", "()Lmn/m;", "b", "Ljava/util/List;", "()Ljava/util/List;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mn.l, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class MockedPromo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final m promoType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<StackedPromo> stackedPromos;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MockedPromo)) {
            return false;
        }
        MockedPromo mockedPromo = (MockedPromo) other;
        return this.promoType == mockedPromo.promoType && Intrinsics.e(this.stackedPromos, mockedPromo.stackedPromos);
    }

    public MockedPromo(m promoType, List<StackedPromo> stackedPromos) {
        Intrinsics.j(promoType, "promoType");
        Intrinsics.j(stackedPromos, "stackedPromos");
        this.promoType = promoType;
        this.stackedPromos = stackedPromos;
    }

    /* renamed from: a, reason: from getter */
    public final m getPromoType() {
        return this.promoType;
    }

    public final List<StackedPromo> b() {
        return this.stackedPromos;
    }

    public int hashCode() {
        return (this.promoType.hashCode() * 31) + this.stackedPromos.hashCode();
    }

    public String toString() {
        return "MockedPromo(promoType=" + this.promoType + ", stackedPromos=" + this.stackedPromos + ')';
    }
}
