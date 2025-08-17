package xs;

import ak.AbstractC5607a;
import android.content.Context;
import android.content.res.Resources;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import ws.C17857c;
import ws.C17858d;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\nB'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lxs/c;", "", "Lxs/b;", "tipOption", "Lak/a;", "percentageAmount", "", "isSelected", "<init>", "(Lxs/b;Lak/a;Z)V", "a", "(Lxs/b;Lak/a;Z)Lxs/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lxs/b;", "d", "()Lxs/b;", "b", "Lak/a;", "c", "()Lak/a;", "Z", "e", "()Z", "rateandtip_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xs.c, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class TipSuggestionButtonDecorator {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f169928e = AbstractC5607a.f45514b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC18092b tipOption;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a percentageAmount;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSelected;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u0014\u0010 \u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0019R\u0014\u0010!\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u001c¨\u0006\""}, d2 = {"Lxs/c$a;", "", "<init>", "()V", "", "isSelected", "Lxs/b;", "tipOption", "", "totalPrice", "Lxs/c;", "b", "(ZLxs/b;D)Lxs/c;", "orderTotalPrice", "isSinglePageCheckout", "", "c", "(Ljava/lang/Double;Z)Ljava/util/List;", "amountToAnnounce", "Landroid/content/Context;", "context", "", "a", "(DLandroid/content/Context;)Ljava/lang/String;", "MINIMUM_AMOUNT", "D", "", "HUNDRED", "I", "CUSTOM_TIP_OVER_TIP_ORDER_MIN", "CUSTOM_TIP_OVER_TIP_ORDER_PERCENTAGE", "CUSTOM_TIP_UNDER_TIP_MAX", "CUSTOM_TIP_MAXIMUM_AMOUNT", "CUSTOM_TIP_MAXIMUM_AMOUNT_CENTS", "rateandtip_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xs.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String a(double amountToAnnounce, Context context) throws Resources.NotFoundException {
            Intrinsics.j(context, "context");
            double d10 = 100;
            double d11 = amountToAnnounce / d10;
            int i10 = (int) d11;
            int iC = MathKt.c((d11 - i10) * d10);
            String quantityString = context.getResources().getQuantityString(C17857c.f166437b, i10, Integer.valueOf(i10));
            Intrinsics.i(quantityString, "getQuantityString(...)");
            String quantityString2 = context.getResources().getQuantityString(C17857c.f166436a, iC, Integer.valueOf(iC));
            Intrinsics.i(quantityString2, "getQuantityString(...)");
            return quantityString + " and " + quantityString2;
        }

        public final TipSuggestionButtonDecorator b(boolean isSelected, EnumC18092b tipOption, double totalPrice) {
            Intrinsics.j(tipOption, "tipOption");
            return new TipSuggestionButtonDecorator(tipOption, tipOption.getHasFormatArgs() ? AbstractC5607a.INSTANCE.d(C17858d.f166445h, Double.valueOf(totalPrice * tipOption.getValue())) : null, isSelected);
        }

        public final List<EnumC18092b> c(Double orderTotalPrice, boolean isSinglePageCheckout) {
            List<EnumC18092b> listP;
            if (orderTotalPrice != null) {
                if (orderTotalPrice.doubleValue() >= 75.0d) {
                    listP = CollectionsKt.p(EnumC18092b.f169905i, EnumC18092b.f169906j, EnumC18092b.f169907k, isSinglePageCheckout ? EnumC18092b.f169909m : EnumC18092b.f169908l);
                } else {
                    listP = CollectionsKt.p(EnumC18092b.f169902f, EnumC18092b.f169903g, EnumC18092b.f169904h, isSinglePageCheckout ? EnumC18092b.f169909m : EnumC18092b.f169908l);
                }
                if (listP != null) {
                    return listP;
                }
            }
            return CollectionsKt.m();
        }
    }

    public TipSuggestionButtonDecorator() {
        this(null, null, false, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TipSuggestionButtonDecorator)) {
            return false;
        }
        TipSuggestionButtonDecorator tipSuggestionButtonDecorator = (TipSuggestionButtonDecorator) other;
        return this.tipOption == tipSuggestionButtonDecorator.tipOption && Intrinsics.e(this.percentageAmount, tipSuggestionButtonDecorator.percentageAmount) && this.isSelected == tipSuggestionButtonDecorator.isSelected;
    }

    public TipSuggestionButtonDecorator(EnumC18092b tipOption, AbstractC5607a abstractC5607a, boolean z10) {
        Intrinsics.j(tipOption, "tipOption");
        this.tipOption = tipOption;
        this.percentageAmount = abstractC5607a;
        this.isSelected = z10;
    }

    public static /* synthetic */ TipSuggestionButtonDecorator b(TipSuggestionButtonDecorator tipSuggestionButtonDecorator, EnumC18092b enumC18092b, AbstractC5607a abstractC5607a, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC18092b = tipSuggestionButtonDecorator.tipOption;
        }
        if ((i10 & 2) != 0) {
            abstractC5607a = tipSuggestionButtonDecorator.percentageAmount;
        }
        if ((i10 & 4) != 0) {
            z10 = tipSuggestionButtonDecorator.isSelected;
        }
        return tipSuggestionButtonDecorator.a(enumC18092b, abstractC5607a, z10);
    }

    public final TipSuggestionButtonDecorator a(EnumC18092b tipOption, AbstractC5607a percentageAmount, boolean isSelected) {
        Intrinsics.j(tipOption, "tipOption");
        return new TipSuggestionButtonDecorator(tipOption, percentageAmount, isSelected);
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC5607a getPercentageAmount() {
        return this.percentageAmount;
    }

    /* renamed from: d, reason: from getter */
    public final EnumC18092b getTipOption() {
        return this.tipOption;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public int hashCode() {
        int iHashCode = this.tipOption.hashCode() * 31;
        AbstractC5607a abstractC5607a = this.percentageAmount;
        return ((iHashCode + (abstractC5607a == null ? 0 : abstractC5607a.hashCode())) * 31) + Boolean.hashCode(this.isSelected);
    }

    public String toString() {
        return "TipSuggestionButtonDecorator(tipOption=" + this.tipOption + ", percentageAmount=" + this.percentageAmount + ", isSelected=" + this.isSelected + ')';
    }

    public /* synthetic */ TipSuggestionButtonDecorator(EnumC18092b enumC18092b, AbstractC5607a abstractC5607a, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? EnumC18092b.f169911o : enumC18092b, (i10 & 2) != 0 ? null : abstractC5607a, (i10 & 4) != 0 ? false : z10);
    }
}
