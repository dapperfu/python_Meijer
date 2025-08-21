package com.meijer.mobile.meijer.activity.checkout.pickupperson;

import Ik.Validation;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.meijer.activity.checkout.contactinformation.OrderTypeHeaderDataDecorator;
import com.meijer.mobile.meijer.activity.checkout.pickupperson.C12057p;
import gj.PickupPerson;
import java.util.List;
import kl.CheckoutFlowState;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b0\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001Bñ\u0001\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0000H\u0016¢\u0006\u0004\b \u0010!Jú\u0001\u0010\"\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u00100R\u001f\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u00100R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\b7\u00100R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b7\u00109\u001a\u0004\b<\u0010;R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b4\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b/\u0010H\u001a\u0004\bA\u0010IR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010\u0016\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bL\u00109\u001a\u0004\bJ\u0010;R\u0017\u0010\u0017\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b2\u00109\u001a\u0004\bN\u0010;R\u0017\u0010\u0018\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bF\u00109\u001a\u0004\bO\u0010;R\u0017\u0010\u0019\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b?\u00109\u001a\u0004\bP\u0010;R\u0017\u0010\u001a\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b6\u00109\u001a\u0004\b=\u0010;R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bQ\u0010SR*\u0010T\u001a\u0012\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010)0\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010R\u001a\u0004\b-\u0010SR\u0014\u0010V\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bU\u0010;R\u0011\u0010X\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bW\u0010;¨\u0006Y"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/N;", "LIk/a;", "LIk/b;", "", "firstName", "lastName", "emailAddress", "phoneNumber", "", "agreedToTerms", "isLoading", "isEditMode", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/S;", "orderTypeHeaderDataDecorator", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/P;", "slotData", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/b;", "locationData", "Lkl/f;", "checkoutFlowState", "Lgj/b;", "initialPickupPerson", "hasPickupPersonChanged", "isShowFormInputScreen", "isEnableContinueButton", "isContactInfoProvided", "byPassNonTextablePhoneNumber", "", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$i;", "pickupPersonFieldErrors", "<init>", "(LIk/b;LIk/b;LIk/b;LIk/b;LIk/b;ZZLcom/meijer/mobile/meijer/activity/checkout/contactinformation/S;Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/P;Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/b;Lkl/f;Lgj/b;ZZZZZLjava/util/List;)V", "A", "()Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/N;", "e", "(LIk/b;LIk/b;LIk/b;LIk/b;LIk/b;ZZLcom/meijer/mobile/meijer/activity/checkout/contactinformation/S;Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/P;Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/b;Lkl/f;Lgj/b;ZZZZZLjava/util/List;)Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/N;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LIk/b;", "k", "()LIk/b;", "b", "n", "c", "j", "d", "q", "g", "f", "Z", "w", "()Z", "u", "h", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/S;", "p", "()Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/S;", "i", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/P;", "s", "()Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/P;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/b;", "o", "()Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/b;", "Lkl/f;", "()Lkl/f;", "l", "Lgj/b;", "m", "()Lgj/b;", "z", "v", "t", "r", "Ljava/util/List;", "()Ljava/util/List;", "validations", "y", "isShowContinueButton", "x", "isShowContactInfoInputView", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.N, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class PickupPersonViewState implements Ik.a<PickupPersonViewState> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<String> firstName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<String> lastName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<String> emailAddress;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<String> phoneNumber;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<Boolean> agreedToTerms;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEditMode;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrderTypeHeaderDataDecorator orderTypeHeaderDataDecorator;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final SlotData slotData;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocationData locationData;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final CheckoutFlowState checkoutFlowState;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final PickupPerson initialPickupPerson;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasPickupPersonChanged;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isShowFormInputScreen;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEnableContinueButton;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isContactInfoProvided;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean byPassNonTextablePhoneNumber;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<C12057p.i> pickupPersonFieldErrors;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final List<Validation<? extends Object>> validations;

    public PickupPersonViewState() {
        this(null, null, null, null, null, false, false, null, null, null, null, null, false, false, false, false, false, null, 262143, null);
    }

    public static /* synthetic */ PickupPersonViewState f(PickupPersonViewState pickupPersonViewState, Validation validation, Validation validation2, Validation validation3, Validation validation4, Validation validation5, boolean z10, boolean z11, OrderTypeHeaderDataDecorator orderTypeHeaderDataDecorator, SlotData slotData, LocationData locationData, CheckoutFlowState checkoutFlowState, PickupPerson pickupPerson, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, List list, int i10, Object obj) {
        List list2;
        boolean z17;
        Validation validation6 = (i10 & 1) != 0 ? pickupPersonViewState.firstName : validation;
        Validation validation7 = (i10 & 2) != 0 ? pickupPersonViewState.lastName : validation2;
        Validation validation8 = (i10 & 4) != 0 ? pickupPersonViewState.emailAddress : validation3;
        Validation validation9 = (i10 & 8) != 0 ? pickupPersonViewState.phoneNumber : validation4;
        Validation validation10 = (i10 & 16) != 0 ? pickupPersonViewState.agreedToTerms : validation5;
        boolean z18 = (i10 & 32) != 0 ? pickupPersonViewState.isLoading : z10;
        boolean z19 = (i10 & 64) != 0 ? pickupPersonViewState.isEditMode : z11;
        OrderTypeHeaderDataDecorator orderTypeHeaderDataDecorator2 = (i10 & 128) != 0 ? pickupPersonViewState.orderTypeHeaderDataDecorator : orderTypeHeaderDataDecorator;
        SlotData slotData2 = (i10 & 256) != 0 ? pickupPersonViewState.slotData : slotData;
        LocationData locationData2 = (i10 & 512) != 0 ? pickupPersonViewState.locationData : locationData;
        CheckoutFlowState checkoutFlowState2 = (i10 & 1024) != 0 ? pickupPersonViewState.checkoutFlowState : checkoutFlowState;
        PickupPerson pickupPerson2 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? pickupPersonViewState.initialPickupPerson : pickupPerson;
        boolean z20 = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? pickupPersonViewState.hasPickupPersonChanged : z12;
        boolean z21 = (i10 & 8192) != 0 ? pickupPersonViewState.isShowFormInputScreen : z13;
        Validation validation11 = validation6;
        boolean z22 = (i10 & 16384) != 0 ? pickupPersonViewState.isEnableContinueButton : z14;
        boolean z23 = (i10 & 32768) != 0 ? pickupPersonViewState.isContactInfoProvided : z15;
        boolean z24 = (i10 & 65536) != 0 ? pickupPersonViewState.byPassNonTextablePhoneNumber : z16;
        if ((i10 & 131072) != 0) {
            z17 = z24;
            list2 = pickupPersonViewState.pickupPersonFieldErrors;
        } else {
            list2 = list;
            z17 = z24;
        }
        return pickupPersonViewState.e(validation11, validation7, validation8, validation9, validation10, z18, z19, orderTypeHeaderDataDecorator2, slotData2, locationData2, checkoutFlowState2, pickupPerson2, z20, z21, z22, z23, z17, list2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickupPersonViewState)) {
            return false;
        }
        PickupPersonViewState pickupPersonViewState = (PickupPersonViewState) other;
        return Intrinsics.e(this.firstName, pickupPersonViewState.firstName) && Intrinsics.e(this.lastName, pickupPersonViewState.lastName) && Intrinsics.e(this.emailAddress, pickupPersonViewState.emailAddress) && Intrinsics.e(this.phoneNumber, pickupPersonViewState.phoneNumber) && Intrinsics.e(this.agreedToTerms, pickupPersonViewState.agreedToTerms) && this.isLoading == pickupPersonViewState.isLoading && this.isEditMode == pickupPersonViewState.isEditMode && Intrinsics.e(this.orderTypeHeaderDataDecorator, pickupPersonViewState.orderTypeHeaderDataDecorator) && Intrinsics.e(this.slotData, pickupPersonViewState.slotData) && Intrinsics.e(this.locationData, pickupPersonViewState.locationData) && Intrinsics.e(this.checkoutFlowState, pickupPersonViewState.checkoutFlowState) && Intrinsics.e(this.initialPickupPerson, pickupPersonViewState.initialPickupPerson) && this.hasPickupPersonChanged == pickupPersonViewState.hasPickupPersonChanged && this.isShowFormInputScreen == pickupPersonViewState.isShowFormInputScreen && this.isEnableContinueButton == pickupPersonViewState.isEnableContinueButton && this.isContactInfoProvided == pickupPersonViewState.isContactInfoProvided && this.byPassNonTextablePhoneNumber == pickupPersonViewState.byPassNonTextablePhoneNumber && Intrinsics.e(this.pickupPersonFieldErrors, pickupPersonViewState.pickupPersonFieldErrors);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.firstName.hashCode() * 31) + this.lastName.hashCode()) * 31) + this.emailAddress.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.agreedToTerms.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isEditMode)) * 31;
        OrderTypeHeaderDataDecorator orderTypeHeaderDataDecorator = this.orderTypeHeaderDataDecorator;
        int iHashCode2 = (iHashCode + (orderTypeHeaderDataDecorator == null ? 0 : orderTypeHeaderDataDecorator.hashCode())) * 31;
        SlotData slotData = this.slotData;
        int iHashCode3 = (iHashCode2 + (slotData == null ? 0 : slotData.hashCode())) * 31;
        LocationData locationData = this.locationData;
        int iHashCode4 = (iHashCode3 + (locationData == null ? 0 : locationData.hashCode())) * 31;
        CheckoutFlowState checkoutFlowState = this.checkoutFlowState;
        int iHashCode5 = (iHashCode4 + (checkoutFlowState == null ? 0 : checkoutFlowState.hashCode())) * 31;
        PickupPerson pickupPerson = this.initialPickupPerson;
        return ((((((((((((iHashCode5 + (pickupPerson != null ? pickupPerson.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasPickupPersonChanged)) * 31) + Boolean.hashCode(this.isShowFormInputScreen)) * 31) + Boolean.hashCode(this.isEnableContinueButton)) * 31) + Boolean.hashCode(this.isContactInfoProvided)) * 31) + Boolean.hashCode(this.byPassNonTextablePhoneNumber)) * 31) + this.pickupPersonFieldErrors.hashCode();
    }

    public String toString() {
        return "PickupPersonViewState(firstName=" + this.firstName + ", lastName=" + this.lastName + ", emailAddress=" + this.emailAddress + ", phoneNumber=" + this.phoneNumber + ", agreedToTerms=" + this.agreedToTerms + ", isLoading=" + this.isLoading + ", isEditMode=" + this.isEditMode + ", orderTypeHeaderDataDecorator=" + this.orderTypeHeaderDataDecorator + ", slotData=" + this.slotData + ", locationData=" + this.locationData + ", checkoutFlowState=" + this.checkoutFlowState + ", initialPickupPerson=" + this.initialPickupPerson + ", hasPickupPersonChanged=" + this.hasPickupPersonChanged + ", isShowFormInputScreen=" + this.isShowFormInputScreen + ", isEnableContinueButton=" + this.isEnableContinueButton + ", isContactInfoProvided=" + this.isContactInfoProvided + ", byPassNonTextablePhoneNumber=" + this.byPassNonTextablePhoneNumber + ", pickupPersonFieldErrors=" + this.pickupPersonFieldErrors + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PickupPersonViewState(Validation<String> firstName, Validation<String> lastName, Validation<String> emailAddress, Validation<String> phoneNumber, Validation<Boolean> agreedToTerms, boolean z10, boolean z11, OrderTypeHeaderDataDecorator orderTypeHeaderDataDecorator, SlotData slotData, LocationData locationData, CheckoutFlowState checkoutFlowState, PickupPerson pickupPerson, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, List<? extends C12057p.i> pickupPersonFieldErrors) {
        Intrinsics.j(firstName, "firstName");
        Intrinsics.j(lastName, "lastName");
        Intrinsics.j(emailAddress, "emailAddress");
        Intrinsics.j(phoneNumber, "phoneNumber");
        Intrinsics.j(agreedToTerms, "agreedToTerms");
        Intrinsics.j(pickupPersonFieldErrors, "pickupPersonFieldErrors");
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.agreedToTerms = agreedToTerms;
        this.isLoading = z10;
        this.isEditMode = z11;
        this.orderTypeHeaderDataDecorator = orderTypeHeaderDataDecorator;
        this.slotData = slotData;
        this.locationData = locationData;
        this.checkoutFlowState = checkoutFlowState;
        this.initialPickupPerson = pickupPerson;
        this.hasPickupPersonChanged = z12;
        this.isShowFormInputScreen = z13;
        this.isEnableContinueButton = z14;
        this.isContactInfoProvided = z15;
        this.byPassNonTextablePhoneNumber = z16;
        this.pickupPersonFieldErrors = pickupPersonFieldErrors;
        this.validations = CollectionsKt.p(firstName, lastName, emailAddress, phoneNumber, agreedToTerms);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean y() {
        int i10 = 2;
        return this.firstName.j(new Jk.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.N.g
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((PickupPersonViewState) this.receiver).k();
            }
        }, null, i10, 0 == true ? 1 : 0)).getIsValid() && this.lastName.j(new Jk.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.N.h
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((PickupPersonViewState) this.receiver).n();
            }
        }, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0)).getIsValid() && this.emailAddress.j(new Jk.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.N.i
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((PickupPersonViewState) this.receiver).j();
            }
        }, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0), new Jk.b(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.N.j
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((PickupPersonViewState) this.receiver).j();
            }
        }, null, 2, null)).getIsValid() && this.phoneNumber.j(new Jk.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.N.k
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((PickupPersonViewState) this.receiver).q();
            }
        }, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0), new Jk.g(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.N.l
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((PickupPersonViewState) this.receiver).q();
            }
        }, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0)).getIsValid() && this.agreedToTerms.j(new Jk.a(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.N.m
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((PickupPersonViewState) this.receiver).g();
            }
        })).getIsValid();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PickupPersonViewState A() {
        int i10 = 2;
        return f(this, this.firstName.j(new Jk.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.N.n
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((PickupPersonViewState) this.receiver).k();
            }
        }, null, i10, 0 == true ? 1 : 0)), this.lastName.j(new Jk.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.N.o
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((PickupPersonViewState) this.receiver).n();
            }
        }, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0)), this.emailAddress.j(new Jk.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.N.p
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((PickupPersonViewState) this.receiver).j();
            }
        }, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0), new Jk.b(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.N.q
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((PickupPersonViewState) this.receiver).j();
            }
        }, null, 2, null)), this.phoneNumber.j(new Jk.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.N.r
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((PickupPersonViewState) this.receiver).q();
            }
        }, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0), new Jk.g(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.N.s
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((PickupPersonViewState) this.receiver).q();
            }
        }, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0)), this.agreedToTerms.j(new Jk.a(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.N.t
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((PickupPersonViewState) this.receiver).g();
            }
        })), false, false, null, null, null, null, null, false, false, y(), false, false, null, 245728, null);
    }

    @Override // Ik.a
    public List<Validation<? extends Object>> a() {
        return this.validations;
    }

    public final PickupPersonViewState e(Validation<String> firstName, Validation<String> lastName, Validation<String> emailAddress, Validation<String> phoneNumber, Validation<Boolean> agreedToTerms, boolean isLoading, boolean isEditMode, OrderTypeHeaderDataDecorator orderTypeHeaderDataDecorator, SlotData slotData, LocationData locationData, CheckoutFlowState checkoutFlowState, PickupPerson initialPickupPerson, boolean hasPickupPersonChanged, boolean isShowFormInputScreen, boolean isEnableContinueButton, boolean isContactInfoProvided, boolean byPassNonTextablePhoneNumber, List<? extends C12057p.i> pickupPersonFieldErrors) {
        Intrinsics.j(firstName, "firstName");
        Intrinsics.j(lastName, "lastName");
        Intrinsics.j(emailAddress, "emailAddress");
        Intrinsics.j(phoneNumber, "phoneNumber");
        Intrinsics.j(agreedToTerms, "agreedToTerms");
        Intrinsics.j(pickupPersonFieldErrors, "pickupPersonFieldErrors");
        return new PickupPersonViewState(firstName, lastName, emailAddress, phoneNumber, agreedToTerms, isLoading, isEditMode, orderTypeHeaderDataDecorator, slotData, locationData, checkoutFlowState, initialPickupPerson, hasPickupPersonChanged, isShowFormInputScreen, isEnableContinueButton, isContactInfoProvided, byPassNonTextablePhoneNumber, pickupPersonFieldErrors);
    }

    public final Validation<Boolean> g() {
        return this.agreedToTerms;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getByPassNonTextablePhoneNumber() {
        return this.byPassNonTextablePhoneNumber;
    }

    /* renamed from: i, reason: from getter */
    public final CheckoutFlowState getCheckoutFlowState() {
        return this.checkoutFlowState;
    }

    public final Validation<String> j() {
        return this.emailAddress;
    }

    public final Validation<String> k() {
        return this.firstName;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getHasPickupPersonChanged() {
        return this.hasPickupPersonChanged;
    }

    /* renamed from: m, reason: from getter */
    public final PickupPerson getInitialPickupPerson() {
        return this.initialPickupPerson;
    }

    public final Validation<String> n() {
        return this.lastName;
    }

    /* renamed from: o, reason: from getter */
    public final LocationData getLocationData() {
        return this.locationData;
    }

    /* renamed from: p, reason: from getter */
    public final OrderTypeHeaderDataDecorator getOrderTypeHeaderDataDecorator() {
        return this.orderTypeHeaderDataDecorator;
    }

    public final Validation<String> q() {
        return this.phoneNumber;
    }

    public final List<C12057p.i> r() {
        return this.pickupPersonFieldErrors;
    }

    /* renamed from: s, reason: from getter */
    public final SlotData getSlotData() {
        return this.slotData;
    }

    /* renamed from: t, reason: from getter */
    public final boolean getIsContactInfoProvided() {
        return this.isContactInfoProvided;
    }

    /* renamed from: u, reason: from getter */
    public final boolean getIsEditMode() {
        return this.isEditMode;
    }

    /* renamed from: v, reason: from getter */
    public final boolean getIsEnableContinueButton() {
        return this.isEnableContinueButton;
    }

    /* renamed from: w, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean x() {
        int i10 = 2;
        return (this.firstName.j(new Jk.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.N.a
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((PickupPersonViewState) this.receiver).k();
            }
        }, null, i10, 0 == true ? 1 : 0)).getIsValid() && this.lastName.j(new Jk.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.N.b
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((PickupPersonViewState) this.receiver).n();
            }
        }, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0)).getIsValid() && this.emailAddress.j(new Jk.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.N.c
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((PickupPersonViewState) this.receiver).j();
            }
        }, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0), new Jk.b(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.N.d
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((PickupPersonViewState) this.receiver).j();
            }
        }, null, 2, null)).getIsValid() && this.phoneNumber.j(new Jk.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.N.e
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((PickupPersonViewState) this.receiver).q();
            }
        }, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0), new Jk.g(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.N.f
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((PickupPersonViewState) this.receiver).q();
            }
        }, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0)).getIsValid()) ? false : true;
    }

    /* renamed from: z, reason: from getter */
    public final boolean getIsShowFormInputScreen() {
        return this.isShowFormInputScreen;
    }

    public /* synthetic */ PickupPersonViewState(Validation validation, Validation validation2, Validation validation3, Validation validation4, Validation validation5, boolean z10, boolean z11, OrderTypeHeaderDataDecorator orderTypeHeaderDataDecorator, SlotData slotData, LocationData locationData, CheckoutFlowState checkoutFlowState, PickupPerson pickupPerson, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Validation(null, null, 2, null) : validation, (i10 & 2) != 0 ? new Validation(null, null, 2, null) : validation2, (i10 & 4) != 0 ? new Validation(null, null, 2, null) : validation3, (i10 & 8) != 0 ? new Validation(null, null, 2, null) : validation4, (i10 & 16) != 0 ? new Validation(Boolean.FALSE, null, 2, null) : validation5, (i10 & 32) != 0 ? true : z10, (i10 & 64) != 0 ? false : z11, (i10 & 128) != 0 ? null : orderTypeHeaderDataDecorator, (i10 & 256) != 0 ? null : slotData, (i10 & 512) != 0 ? null : locationData, (i10 & 1024) != 0 ? null : checkoutFlowState, (i10 & RecyclerView.m.FLAG_MOVED) == 0 ? pickupPerson : null, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z12, (i10 & 8192) != 0 ? false : z13, (i10 & 16384) != 0 ? false : z14, (i10 & 32768) != 0 ? false : z15, (i10 & 65536) != 0 ? false : z16, (i10 & 131072) != 0 ? CollectionsKt.m() : list);
    }
}
