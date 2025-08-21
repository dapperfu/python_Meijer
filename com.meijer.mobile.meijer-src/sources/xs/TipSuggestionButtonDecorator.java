package xs;

import android.content.Context;
import android.content.res.Resources;
import bk.AbstractC6392a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import ws.C17919c;
import ws.C17920d;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\nB'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lxs/c;", "", "Lxs/b;", "tipOption", "Lbk/a;", "percentageAmount", "", "isSelected", "<init>", "(Lxs/b;Lbk/a;Z)V", "a", "(Lxs/b;Lbk/a;Z)Lxs/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lxs/b;", "d", "()Lxs/b;", "b", "Lbk/a;", "c", "()Lbk/a;", "Z", "e", "()Z", "rateandtip_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xs.c, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class TipSuggestionButtonDecorator {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f171020e = AbstractC6392a.f60445b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC18220b tipOption;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a percentageAmount;

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
            String quantityString = context.getResources().getQuantityString(C17919c.f167505b, i10, Integer.valueOf(i10));
            Intrinsics.i(quantityString, "getQuantityString(...)");
            String quantityString2 = context.getResources().getQuantityString(C17919c.f167504a, iC, Integer.valueOf(iC));
            Intrinsics.i(quantityString2, "getQuantityString(...)");
            return quantityString + " and " + quantityString2;
        }

        public final TipSuggestionButtonDecorator b(boolean isSelected, EnumC18220b tipOption, double totalPrice) {
            Intrinsics.j(tipOption, "tipOption");
            return new TipSuggestionButtonDecorator(tipOption, tipOption.getHasFormatArgs() ? AbstractC6392a.INSTANCE.d(C17920d.f167513h, Double.valueOf(totalPrice * tipOption.getValue())) : null, isSelected);
        }

        public final List<EnumC18220b> c(Double orderTotalPrice, boolean isSinglePageCheckout) {
            List<EnumC18220b> listP;
            if (orderTotalPrice != null) {
                if (orderTotalPrice.doubleValue() >= 75.0d) {
                    listP = CollectionsKt.p(EnumC18220b.f170997i, EnumC18220b.f170998j, EnumC18220b.f170999k, isSinglePageCheckout ? EnumC18220b.f171001m : EnumC18220b.f171000l);
                } else {
                    listP = CollectionsKt.p(EnumC18220b.f170994f, EnumC18220b.f170995g, EnumC18220b.f170996h, isSinglePageCheckout ? EnumC18220b.f171001m : EnumC18220b.f171000l);
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

    public TipSuggestionButtonDecorator(EnumC18220b tipOption, AbstractC6392a abstractC6392a, boolean z10) {
        Intrinsics.j(tipOption, "tipOption");
        this.tipOption = tipOption;
        this.percentageAmount = abstractC6392a;
        this.isSelected = z10;
    }

    public static /* synthetic */ TipSuggestionButtonDecorator b(TipSuggestionButtonDecorator tipSuggestionButtonDecorator, EnumC18220b enumC18220b, AbstractC6392a abstractC6392a, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC18220b = tipSuggestionButtonDecorator.tipOption;
        }
        if ((i10 & 2) != 0) {
            abstractC6392a = tipSuggestionButtonDecorator.percentageAmount;
        }
        if ((i10 & 4) != 0) {
            z10 = tipSuggestionButtonDecorator.isSelected;
        }
        return tipSuggestionButtonDecorator.a(enumC18220b, abstractC6392a, z10);
    }

    public final TipSuggestionButtonDecorator a(EnumC18220b tipOption, AbstractC6392a percentageAmount, boolean isSelected) {
        Intrinsics.j(tipOption, "tipOption");
        return new TipSuggestionButtonDecorator(tipOption, percentageAmount, isSelected);
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC6392a getPercentageAmount() {
        return this.percentageAmount;
    }

    /* renamed from: d, reason: from getter */
    public final EnumC18220b getTipOption() {
        return this.tipOption;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public int hashCode() {
        int iHashCode = this.tipOption.hashCode() * 31;
        AbstractC6392a abstractC6392a = this.percentageAmount;
        return ((iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31) + Boolean.hashCode(this.isSelected);
    }

    public String toString() {
        return "TipSuggestionButtonDecorator(tipOption=" + this.tipOption + ", percentageAmount=" + this.percentageAmount + ", isSelected=" + this.isSelected + ')';
    }

    public /* synthetic */ TipSuggestionButtonDecorator(EnumC18220b enumC18220b, AbstractC6392a abstractC6392a, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? EnumC18220b.f171003o : enumC18220b, (i10 & 2) != 0 ? null : abstractC6392a, (i10 & 4) != 0 ? false : z10);
    }
}
