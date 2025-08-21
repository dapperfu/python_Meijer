package com.meijer.mobile.singlepagecheckout;

import com.meijer.mobile.meijer.activity.checkout.pickupperson.C12057p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0007\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0012\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/singlepagecheckout/l;", "", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p;", "pickupPersonFormViewModel", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H;", "deliveryContactViewModel", "", "isEditMode", "isPickUpMode", "Lkotlin/Function0;", "", "onOpenInfoActionSheet", "<init>", "(Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p;Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H;ZZLkotlin/jvm/functions/Function0;)V", "a", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p;", "c", "()Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p;", "b", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H;", "()Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H;", "Z", "()Z", "d", "e", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.singlepagecheckout.l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13065l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C12057p pickupPersonFormViewModel;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final com.meijer.mobile.meijer.activity.checkout.contactinformation.H deliveryContactViewModel;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isEditMode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isPickUpMode;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onOpenInfoActionSheet;

    public C13065l(C12057p pickupPersonFormViewModel, com.meijer.mobile.meijer.activity.checkout.contactinformation.H deliveryContactViewModel, boolean z10, boolean z11, Function0<Unit> onOpenInfoActionSheet) {
        Intrinsics.j(pickupPersonFormViewModel, "pickupPersonFormViewModel");
        Intrinsics.j(deliveryContactViewModel, "deliveryContactViewModel");
        Intrinsics.j(onOpenInfoActionSheet, "onOpenInfoActionSheet");
        this.pickupPersonFormViewModel = pickupPersonFormViewModel;
        this.deliveryContactViewModel = deliveryContactViewModel;
        this.isEditMode = z10;
        this.isPickUpMode = z11;
        this.onOpenInfoActionSheet = onOpenInfoActionSheet;
    }

    /* renamed from: a, reason: from getter */
    public final com.meijer.mobile.meijer.activity.checkout.contactinformation.H getDeliveryContactViewModel() {
        return this.deliveryContactViewModel;
    }

    public final Function0<Unit> b() {
        return this.onOpenInfoActionSheet;
    }

    /* renamed from: c, reason: from getter */
    public final C12057p getPickupPersonFormViewModel() {
        return this.pickupPersonFormViewModel;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsPickUpMode() {
        return this.isPickUpMode;
    }
}
