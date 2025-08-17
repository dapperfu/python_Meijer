package com.meijer.mobile.singlepagecheckout;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b\b\u0010\u001bR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b$\u0010'¨\u0006("}, d2 = {"Lcom/meijer/mobile/singlepagecheckout/d0;", "", "", "isBopasEnabled", "isBunchaEnabled", "isSinglePageCheckoutEnabled", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1;", "fulfillmentSlotsViewModel", "isEditMode", "Lkotlin/Function0;", "", "onUpdateActivityExtra", "onOpenInfoActionSheet", "<init>", "(ZZZLcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "h", "()Z", "b", "i", "c", "j", "d", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1;", "e", "()Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1;", "f", "Lkotlin/jvm/functions/Function0;", "g", "()Lkotlin/jvm/functions/Function0;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.singlepagecheckout.d0, reason: case insensitive filesystem and from toString */
/* loaded from: classes11.dex */
public final /* data */ class FulfillmentSlotsCardDecorator {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isBopasEnabled;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isBunchaEnabled;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSinglePageCheckoutEnabled;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1 fulfillmentSlotsViewModel;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEditMode;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function0<Unit> onUpdateActivityExtra;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function0<Unit> onOpenInfoActionSheet;

    public FulfillmentSlotsCardDecorator(boolean z10, boolean z11, boolean z12, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1 fulfillmentSlotsViewModel, boolean z13, Function0<Unit> onUpdateActivityExtra, Function0<Unit> onOpenInfoActionSheet) {
        Intrinsics.j(fulfillmentSlotsViewModel, "fulfillmentSlotsViewModel");
        Intrinsics.j(onUpdateActivityExtra, "onUpdateActivityExtra");
        Intrinsics.j(onOpenInfoActionSheet, "onOpenInfoActionSheet");
        this.isBopasEnabled = z10;
        this.isBunchaEnabled = z11;
        this.isSinglePageCheckoutEnabled = z12;
        this.fulfillmentSlotsViewModel = fulfillmentSlotsViewModel;
        this.isEditMode = z13;
        this.onUpdateActivityExtra = onUpdateActivityExtra;
        this.onOpenInfoActionSheet = onOpenInfoActionSheet;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FulfillmentSlotsCardDecorator)) {
            return false;
        }
        FulfillmentSlotsCardDecorator fulfillmentSlotsCardDecorator = (FulfillmentSlotsCardDecorator) other;
        return this.isBopasEnabled == fulfillmentSlotsCardDecorator.isBopasEnabled && this.isBunchaEnabled == fulfillmentSlotsCardDecorator.isBunchaEnabled && this.isSinglePageCheckoutEnabled == fulfillmentSlotsCardDecorator.isSinglePageCheckoutEnabled && Intrinsics.e(this.fulfillmentSlotsViewModel, fulfillmentSlotsCardDecorator.fulfillmentSlotsViewModel) && this.isEditMode == fulfillmentSlotsCardDecorator.isEditMode && Intrinsics.e(this.onUpdateActivityExtra, fulfillmentSlotsCardDecorator.onUpdateActivityExtra) && Intrinsics.e(this.onOpenInfoActionSheet, fulfillmentSlotsCardDecorator.onOpenInfoActionSheet);
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.isBopasEnabled) * 31) + Boolean.hashCode(this.isBunchaEnabled)) * 31) + Boolean.hashCode(this.isSinglePageCheckoutEnabled)) * 31) + this.fulfillmentSlotsViewModel.hashCode()) * 31) + Boolean.hashCode(this.isEditMode)) * 31) + this.onUpdateActivityExtra.hashCode()) * 31) + this.onOpenInfoActionSheet.hashCode();
    }

    public String toString() {
        return "FulfillmentSlotsCardDecorator(isBopasEnabled=" + this.isBopasEnabled + ", isBunchaEnabled=" + this.isBunchaEnabled + ", isSinglePageCheckoutEnabled=" + this.isSinglePageCheckoutEnabled + ", fulfillmentSlotsViewModel=" + this.fulfillmentSlotsViewModel + ", isEditMode=" + this.isEditMode + ", onUpdateActivityExtra=" + this.onUpdateActivityExtra + ", onOpenInfoActionSheet=" + this.onOpenInfoActionSheet + ')';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d() {
        return Unit.f142422a;
    }

    /* renamed from: e, reason: from getter */
    public final com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1 getFulfillmentSlotsViewModel() {
        return this.fulfillmentSlotsViewModel;
    }

    public final Function0<Unit> f() {
        return this.onOpenInfoActionSheet;
    }

    public final Function0<Unit> g() {
        return this.onUpdateActivityExtra;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getIsBopasEnabled() {
        return this.isBopasEnabled;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getIsBunchaEnabled() {
        return this.isBunchaEnabled;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getIsSinglePageCheckoutEnabled() {
        return this.isSinglePageCheckoutEnabled;
    }

    public /* synthetic */ FulfillmentSlotsCardDecorator(boolean z10, boolean z11, boolean z12, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1 q1Var, boolean z13, Function0 function0, Function0 function02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, z11, z12, q1Var, z13, (i10 & 32) != 0 ? new Function0() { // from class: com.meijer.mobile.singlepagecheckout.b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FulfillmentSlotsCardDecorator.c();
            }
        } : function0, (i10 & 64) != 0 ? new Function0() { // from class: com.meijer.mobile.singlepagecheckout.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FulfillmentSlotsCardDecorator.d();
            }
        } : function02);
    }
}
