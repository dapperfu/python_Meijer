package com.meijer.mobile.meijer.activity.checkout.review;

import com.medallia.digital.mobilesdk.l3;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import xs.EnumC18220b;
import xs.TipSuggestionButtonDecorator;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b#\b\u0081\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\\\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b(\u0010#R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u0010,\u001a\u0004\b$\u0010-R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001e\u0010.\u001a\u0004\b\u000f\u0010/R\u0011\u00101\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b0\u0010#R\u0011\u00103\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b2\u0010/R\u0011\u00105\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b4\u0010/R\u0011\u00107\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b6\u0010/R\u0011\u00109\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b8\u0010/¨\u0006:"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/V1;", "", "Lcom/meijer/mobile/meijer/activity/checkout/review/W1;", "preTipStatus", "", "orderTotalPrice", "Lxs/b;", "selectedTipOption", "", "Lxs/c;", "preTipButtonDecorators", "customTipAmount", "Lcom/meijer/mobile/meijer/activity/checkout/review/K1;", "confirmedTipInfo", "", "isSpc", "<init>", "(Lcom/meijer/mobile/meijer/activity/checkout/review/W1;DLxs/b;Ljava/util/List;DLcom/meijer/mobile/meijer/activity/checkout/review/K1;Z)V", "a", "(Lcom/meijer/mobile/meijer/activity/checkout/review/W1;DLxs/b;Ljava/util/List;DLcom/meijer/mobile/meijer/activity/checkout/review/K1;Z)Lcom/meijer/mobile/meijer/activity/checkout/review/V1;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/meijer/mobile/meijer/activity/checkout/review/W1;", "g", "()Lcom/meijer/mobile/meijer/activity/checkout/review/W1;", "b", "D", "e", "()D", "c", "Lxs/b;", "h", "()Lxs/b;", "d", "Ljava/util/List;", "f", "()Ljava/util/List;", "Lcom/meijer/mobile/meijer/activity/checkout/review/K1;", "()Lcom/meijer/mobile/meijer/activity/checkout/review/K1;", "Z", "()Z", "m", "tipAmount", "j", "shouldShowLowTipWarning", "i", "shouldShowHighTipWarning", "l", "shouldShowTipWarning", "k", "shouldShowMaximumCustomTipWarning", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.checkout.review.V1, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class PreTipDecorator {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final W1 preTipStatus;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double orderTotalPrice;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC18220b selectedTipOption;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<TipSuggestionButtonDecorator> preTipButtonDecorators;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final double customTipAmount;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final ConfirmedTipInfo confirmedTipInfo;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSpc;

    public PreTipDecorator() {
        this(null, 0.0d, null, null, 0.0d, null, false, l3.f93324d, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreTipDecorator)) {
            return false;
        }
        PreTipDecorator preTipDecorator = (PreTipDecorator) other;
        return this.preTipStatus == preTipDecorator.preTipStatus && Double.compare(this.orderTotalPrice, preTipDecorator.orderTotalPrice) == 0 && this.selectedTipOption == preTipDecorator.selectedTipOption && Intrinsics.e(this.preTipButtonDecorators, preTipDecorator.preTipButtonDecorators) && Double.compare(this.customTipAmount, preTipDecorator.customTipAmount) == 0 && Intrinsics.e(this.confirmedTipInfo, preTipDecorator.confirmedTipInfo) && this.isSpc == preTipDecorator.isSpc;
    }

    public int hashCode() {
        return (((((((((((this.preTipStatus.hashCode() * 31) + Double.hashCode(this.orderTotalPrice)) * 31) + this.selectedTipOption.hashCode()) * 31) + this.preTipButtonDecorators.hashCode()) * 31) + Double.hashCode(this.customTipAmount)) * 31) + this.confirmedTipInfo.hashCode()) * 31) + Boolean.hashCode(this.isSpc);
    }

    public String toString() {
        return "PreTipDecorator(preTipStatus=" + this.preTipStatus + ", orderTotalPrice=" + this.orderTotalPrice + ", selectedTipOption=" + this.selectedTipOption + ", preTipButtonDecorators=" + this.preTipButtonDecorators + ", customTipAmount=" + this.customTipAmount + ", confirmedTipInfo=" + this.confirmedTipInfo + ", isSpc=" + this.isSpc + ')';
    }

    public PreTipDecorator(W1 preTipStatus, double d10, EnumC18220b selectedTipOption, List<TipSuggestionButtonDecorator> preTipButtonDecorators, double d11, ConfirmedTipInfo confirmedTipInfo, boolean z10) {
        Intrinsics.j(preTipStatus, "preTipStatus");
        Intrinsics.j(selectedTipOption, "selectedTipOption");
        Intrinsics.j(preTipButtonDecorators, "preTipButtonDecorators");
        Intrinsics.j(confirmedTipInfo, "confirmedTipInfo");
        this.preTipStatus = preTipStatus;
        this.orderTotalPrice = d10;
        this.selectedTipOption = selectedTipOption;
        this.preTipButtonDecorators = preTipButtonDecorators;
        this.customTipAmount = d11;
        this.confirmedTipInfo = confirmedTipInfo;
        this.isSpc = z10;
    }

    public static /* synthetic */ PreTipDecorator b(PreTipDecorator preTipDecorator, W1 w12, double d10, EnumC18220b enumC18220b, List list, double d11, ConfirmedTipInfo confirmedTipInfo, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            w12 = preTipDecorator.preTipStatus;
        }
        if ((i10 & 2) != 0) {
            d10 = preTipDecorator.orderTotalPrice;
        }
        if ((i10 & 4) != 0) {
            enumC18220b = preTipDecorator.selectedTipOption;
        }
        if ((i10 & 8) != 0) {
            list = preTipDecorator.preTipButtonDecorators;
        }
        if ((i10 & 16) != 0) {
            d11 = preTipDecorator.customTipAmount;
        }
        if ((i10 & 32) != 0) {
            confirmedTipInfo = preTipDecorator.confirmedTipInfo;
        }
        if ((i10 & 64) != 0) {
            z10 = preTipDecorator.isSpc;
        }
        double d12 = d11;
        EnumC18220b enumC18220b2 = enumC18220b;
        return preTipDecorator.a(w12, d10, enumC18220b2, list, d12, confirmedTipInfo, z10);
    }

    public final PreTipDecorator a(W1 preTipStatus, double orderTotalPrice, EnumC18220b selectedTipOption, List<TipSuggestionButtonDecorator> preTipButtonDecorators, double customTipAmount, ConfirmedTipInfo confirmedTipInfo, boolean isSpc) {
        Intrinsics.j(preTipStatus, "preTipStatus");
        Intrinsics.j(selectedTipOption, "selectedTipOption");
        Intrinsics.j(preTipButtonDecorators, "preTipButtonDecorators");
        Intrinsics.j(confirmedTipInfo, "confirmedTipInfo");
        return new PreTipDecorator(preTipStatus, orderTotalPrice, selectedTipOption, preTipButtonDecorators, customTipAmount, confirmedTipInfo, isSpc);
    }

    /* renamed from: c, reason: from getter */
    public final ConfirmedTipInfo getConfirmedTipInfo() {
        return this.confirmedTipInfo;
    }

    /* renamed from: d, reason: from getter */
    public final double getCustomTipAmount() {
        return this.customTipAmount;
    }

    /* renamed from: e, reason: from getter */
    public final double getOrderTotalPrice() {
        return this.orderTotalPrice;
    }

    public final List<TipSuggestionButtonDecorator> f() {
        return this.preTipButtonDecorators;
    }

    /* renamed from: g, reason: from getter */
    public final W1 getPreTipStatus() {
        return this.preTipStatus;
    }

    /* renamed from: h, reason: from getter */
    public final EnumC18220b getSelectedTipOption() {
        return this.selectedTipOption;
    }

    public final boolean i() {
        if (this.selectedTipOption != EnumC18220b.f171000l) {
            return false;
        }
        double d10 = this.customTipAmount;
        return d10 >= 100.0d && d10 > this.orderTotalPrice * 0.3d;
    }

    public final boolean j() {
        return this.selectedTipOption == EnumC18220b.f171000l && this.customTipAmount < 1.0d;
    }

    public final boolean k() {
        return this.selectedTipOption == EnumC18220b.f171000l && this.customTipAmount >= 1000.0d;
    }

    public final double m() {
        Object next;
        Iterator<T> it = this.preTipButtonDecorators.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((TipSuggestionButtonDecorator) next).getIsSelected()) {
                break;
            }
        }
        TipSuggestionButtonDecorator tipSuggestionButtonDecorator = (TipSuggestionButtonDecorator) next;
        if (tipSuggestionButtonDecorator != null) {
            EnumC18220b tipOption = tipSuggestionButtonDecorator.getTipOption();
            return tipOption.getHasFormatArgs() ? tipOption.getValue() * this.orderTotalPrice : tipOption.getValue() == EnumC18220b.f171000l.getValue() ? this.customTipAmount : tipOption.getValue();
        }
        if (this.selectedTipOption == EnumC18220b.f171000l && this.isSpc) {
            return this.customTipAmount;
        }
        return 0.0d;
    }

    public final boolean l() {
        if (!i() && !j()) {
            return false;
        }
        return true;
    }

    public /* synthetic */ PreTipDecorator(W1 w12, double d10, EnumC18220b enumC18220b, List list, double d11, ConfirmedTipInfo confirmedTipInfo, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? W1.f105517a : w12, (i10 & 2) != 0 ? 0.0d : d10, (i10 & 4) != 0 ? EnumC18220b.f171003o : enumC18220b, (i10 & 8) != 0 ? CollectionsKt.m() : list, (i10 & 16) == 0 ? d11 : 0.0d, (i10 & 32) != 0 ? new ConfirmedTipInfo(0.0d, null, 3, null) : confirmedTipInfo, (i10 & 64) != 0 ? false : z10);
    }
}
