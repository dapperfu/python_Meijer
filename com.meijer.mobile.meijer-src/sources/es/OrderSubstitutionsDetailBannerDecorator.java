package es;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0014B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u001a"}, d2 = {"Les/J;", "Les/b;", "Lvo/b;", "substitutionScreenType", "", "isOrderDetailBannerVisible", "<init>", "(Lvo/b;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lvo/b;", "a", "()Lvo/b;", "c", "Z", "()Z", "d", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: es.J, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class OrderSubstitutionsDetailBannerDecorator extends AbstractC13866b {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f130656e = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final vo.b substitutionScreenType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOrderDetailBannerVisible;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Les/J$a;", "", "<init>", "()V", "", "checkOrderHasAnySubstitution", "checkIsAnyProductOutOfStock", "shouldShowBannerWithFlyBuy", "checkIsAnyOutOfStockWithNotSubs", "Les/J;", "a", "(ZZZZ)Les/J;", "Lvo/b;", "b", "(ZZ)Lvo/b;", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: es.J$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final vo.b b(boolean checkOrderHasAnySubstitution, boolean checkIsAnyOutOfStockWithNotSubs) {
            return checkOrderHasAnySubstitution ? vo.b.f166128g : checkIsAnyOutOfStockWithNotSubs ? vo.b.f166130i : vo.b.f166129h;
        }

        public final OrderSubstitutionsDetailBannerDecorator a(boolean checkOrderHasAnySubstitution, boolean checkIsAnyProductOutOfStock, boolean shouldShowBannerWithFlyBuy, boolean checkIsAnyOutOfStockWithNotSubs) {
            boolean z10;
            vo.b bVarB = b(checkOrderHasAnySubstitution, checkIsAnyOutOfStockWithNotSubs);
            if ((shouldShowBannerWithFlyBuy && checkIsAnyProductOutOfStock) || ((shouldShowBannerWithFlyBuy && checkOrderHasAnySubstitution) || (shouldShowBannerWithFlyBuy && checkIsAnyOutOfStockWithNotSubs))) {
                z10 = true;
            } else {
                z10 = false;
            }
            return new OrderSubstitutionsDetailBannerDecorator(bVarB, z10);
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderSubstitutionsDetailBannerDecorator)) {
            return false;
        }
        OrderSubstitutionsDetailBannerDecorator orderSubstitutionsDetailBannerDecorator = (OrderSubstitutionsDetailBannerDecorator) other;
        return this.substitutionScreenType == orderSubstitutionsDetailBannerDecorator.substitutionScreenType && this.isOrderDetailBannerVisible == orderSubstitutionsDetailBannerDecorator.isOrderDetailBannerVisible;
    }

    public OrderSubstitutionsDetailBannerDecorator(vo.b substitutionScreenType, boolean z10) {
        Intrinsics.j(substitutionScreenType, "substitutionScreenType");
        this.substitutionScreenType = substitutionScreenType;
        this.isOrderDetailBannerVisible = z10;
    }

    /* renamed from: a, reason: from getter */
    public final vo.b getSubstitutionScreenType() {
        return this.substitutionScreenType;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsOrderDetailBannerVisible() {
        return this.isOrderDetailBannerVisible;
    }

    public int hashCode() {
        return (this.substitutionScreenType.hashCode() * 31) + Boolean.hashCode(this.isOrderDetailBannerVisible);
    }

    public String toString() {
        return "OrderSubstitutionsDetailBannerDecorator(substitutionScreenType=" + this.substitutionScreenType + ", isOrderDetailBannerVisible=" + this.isOrderDetailBannerVisible + ')';
    }
}
