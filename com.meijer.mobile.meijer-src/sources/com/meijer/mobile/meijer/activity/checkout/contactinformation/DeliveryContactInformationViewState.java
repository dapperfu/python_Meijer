package com.meijer.mobile.meijer.activity.checkout.contactinformation;

import Ik.Validation;
import Ik.c;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.meijer.activity.checkout.contactinformation.H;
import com.meijer.mobile.meijer.activity.checkout.pickupperson.LocationData;
import com.meijer.mobile.meijer.activity.checkout.pickupperson.SlotData;
import java.util.List;
import kl.CheckoutFlowState;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b-\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BÁ\u0001\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJÊ\u0001\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b\u000e\u0010?R\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010>\u001a\u0004\b@\u0010?R\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bA\u0010>\u001a\u0004\bB\u0010?R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b0\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bF\u0010>\u001a\u0004\bG\u0010?R\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bD\u0010>\u001a\u0004\bH\u0010?R\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bI\u0010>\u001a\u0004\bJ\u0010?R\u0017\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010>\u001a\u0004\bF\u0010?R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\b;\u0010K\u001a\u0004\bI\u0010LR*\u0010M\u001a\u0012\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010%0\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010K\u001a\u0004\b)\u0010LR\u0014\u0010O\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010?R\u0011\u0010Q\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bP\u0010?¨\u0006R"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;", "LIk/a;", "LIk/b;", "", "emailAddress", "phoneNumber", "", "agreedToTerms", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/S;", "orderTypeHeaderDataDecorator", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/P;", "slotData", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/b;", "locationData", "isEditMode", "isLoading", "isContactInfoProvided", "Lkl/f;", "checkoutFlowState", "isShowFormInputScreen", "isEnableContinueButton", "isBunchaOrder", "byPassNonTextablePhoneNumber", "", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$i;", "contactInfoFieldErrors", "<init>", "(LIk/b;LIk/b;LIk/b;Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/S;Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/P;Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/b;ZZZLkl/f;ZZZZLjava/util/List;)V", "z", "()Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;", "h", "(LIk/b;LIk/b;LIk/b;Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/S;Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/P;Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/b;ZZZLkl/f;ZZZZLjava/util/List;)Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LIk/b;", "n", "()LIk/b;", "b", "q", "c", "j", "d", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/S;", "p", "()Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/S;", "e", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/P;", "r", "()Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/P;", "f", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/b;", "o", "()Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/b;", "g", "Z", "()Z", "v", "i", "t", "Lkl/f;", "l", "()Lkl/f;", "k", "y", "u", "m", "s", "Ljava/util/List;", "()Ljava/util/List;", "validations", "x", "isShowContinueButton", "w", "isShowContactInfoInputView", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.O, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class DeliveryContactInformationViewState implements Ik.a<DeliveryContactInformationViewState> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<String> emailAddress;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<String> phoneNumber;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<Boolean> agreedToTerms;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrderTypeHeaderDataDecorator orderTypeHeaderDataDecorator;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final SlotData slotData;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocationData locationData;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEditMode;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isContactInfoProvided;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final CheckoutFlowState checkoutFlowState;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isShowFormInputScreen;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEnableContinueButton;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isBunchaOrder;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean byPassNonTextablePhoneNumber;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<H.i> contactInfoFieldErrors;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final List<Validation<? extends Object>> validations;

    public DeliveryContactInformationViewState() {
        this(null, null, null, null, null, null, false, false, false, null, false, false, false, false, null, 32767, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryContactInformationViewState)) {
            return false;
        }
        DeliveryContactInformationViewState deliveryContactInformationViewState = (DeliveryContactInformationViewState) other;
        return Intrinsics.e(this.emailAddress, deliveryContactInformationViewState.emailAddress) && Intrinsics.e(this.phoneNumber, deliveryContactInformationViewState.phoneNumber) && Intrinsics.e(this.agreedToTerms, deliveryContactInformationViewState.agreedToTerms) && Intrinsics.e(this.orderTypeHeaderDataDecorator, deliveryContactInformationViewState.orderTypeHeaderDataDecorator) && Intrinsics.e(this.slotData, deliveryContactInformationViewState.slotData) && Intrinsics.e(this.locationData, deliveryContactInformationViewState.locationData) && this.isEditMode == deliveryContactInformationViewState.isEditMode && this.isLoading == deliveryContactInformationViewState.isLoading && this.isContactInfoProvided == deliveryContactInformationViewState.isContactInfoProvided && Intrinsics.e(this.checkoutFlowState, deliveryContactInformationViewState.checkoutFlowState) && this.isShowFormInputScreen == deliveryContactInformationViewState.isShowFormInputScreen && this.isEnableContinueButton == deliveryContactInformationViewState.isEnableContinueButton && this.isBunchaOrder == deliveryContactInformationViewState.isBunchaOrder && this.byPassNonTextablePhoneNumber == deliveryContactInformationViewState.byPassNonTextablePhoneNumber && Intrinsics.e(this.contactInfoFieldErrors, deliveryContactInformationViewState.contactInfoFieldErrors);
    }

    public int hashCode() {
        int iHashCode = ((((this.emailAddress.hashCode() * 31) + this.phoneNumber.hashCode()) * 31) + this.agreedToTerms.hashCode()) * 31;
        OrderTypeHeaderDataDecorator orderTypeHeaderDataDecorator = this.orderTypeHeaderDataDecorator;
        int iHashCode2 = (iHashCode + (orderTypeHeaderDataDecorator == null ? 0 : orderTypeHeaderDataDecorator.hashCode())) * 31;
        SlotData slotData = this.slotData;
        int iHashCode3 = (iHashCode2 + (slotData == null ? 0 : slotData.hashCode())) * 31;
        LocationData locationData = this.locationData;
        int iHashCode4 = (((((((iHashCode3 + (locationData == null ? 0 : locationData.hashCode())) * 31) + Boolean.hashCode(this.isEditMode)) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isContactInfoProvided)) * 31;
        CheckoutFlowState checkoutFlowState = this.checkoutFlowState;
        return ((((((((((iHashCode4 + (checkoutFlowState != null ? checkoutFlowState.hashCode() : 0)) * 31) + Boolean.hashCode(this.isShowFormInputScreen)) * 31) + Boolean.hashCode(this.isEnableContinueButton)) * 31) + Boolean.hashCode(this.isBunchaOrder)) * 31) + Boolean.hashCode(this.byPassNonTextablePhoneNumber)) * 31) + this.contactInfoFieldErrors.hashCode();
    }

    public String toString() {
        return "DeliveryContactInformationViewState(emailAddress=" + this.emailAddress + ", phoneNumber=" + this.phoneNumber + ", agreedToTerms=" + this.agreedToTerms + ", orderTypeHeaderDataDecorator=" + this.orderTypeHeaderDataDecorator + ", slotData=" + this.slotData + ", locationData=" + this.locationData + ", isEditMode=" + this.isEditMode + ", isLoading=" + this.isLoading + ", isContactInfoProvided=" + this.isContactInfoProvided + ", checkoutFlowState=" + this.checkoutFlowState + ", isShowFormInputScreen=" + this.isShowFormInputScreen + ", isEnableContinueButton=" + this.isEnableContinueButton + ", isBunchaOrder=" + this.isBunchaOrder + ", byPassNonTextablePhoneNumber=" + this.byPassNonTextablePhoneNumber + ", contactInfoFieldErrors=" + this.contactInfoFieldErrors + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeliveryContactInformationViewState(Validation<String> emailAddress, Validation<String> phoneNumber, Validation<Boolean> agreedToTerms, OrderTypeHeaderDataDecorator orderTypeHeaderDataDecorator, SlotData slotData, LocationData locationData, boolean z10, boolean z11, boolean z12, CheckoutFlowState checkoutFlowState, boolean z13, boolean z14, boolean z15, boolean z16, List<? extends H.i> contactInfoFieldErrors) {
        Intrinsics.j(emailAddress, "emailAddress");
        Intrinsics.j(phoneNumber, "phoneNumber");
        Intrinsics.j(agreedToTerms, "agreedToTerms");
        Intrinsics.j(contactInfoFieldErrors, "contactInfoFieldErrors");
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.agreedToTerms = agreedToTerms;
        this.orderTypeHeaderDataDecorator = orderTypeHeaderDataDecorator;
        this.slotData = slotData;
        this.locationData = locationData;
        this.isEditMode = z10;
        this.isLoading = z11;
        this.isContactInfoProvided = z12;
        this.checkoutFlowState = checkoutFlowState;
        this.isShowFormInputScreen = z13;
        this.isEnableContinueButton = z14;
        this.isBunchaOrder = z15;
        this.byPassNonTextablePhoneNumber = z16;
        this.contactInfoFieldErrors = contactInfoFieldErrors;
        this.validations = CollectionsKt.p(emailAddress, phoneNumber, agreedToTerms);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List A(Jk.k validator) {
        List listM;
        Intrinsics.j(validator, "$this$validator");
        Object objI = validator.i();
        if (!((Boolean) objI).booleanValue()) {
            objI = null;
        }
        return (((Boolean) objI) == null || (listM = CollectionsKt.m()) == null) ? CollectionsKt.e(new c.Invalid(validator.getFieldName(), null, null, 6, null)) : listM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List B(Jk.k validator) {
        List listE;
        Intrinsics.j(validator, "$this$validator");
        String str = (String) validator.i();
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                if (!Ds.h.f6648a.a(str)) {
                    str = null;
                }
                if (str == null || (listE = CollectionsKt.m()) == null) {
                    listE = CollectionsKt.e(new c.Invalid(validator.getFieldName(), null, null, 6, null));
                }
                if (listE != null) {
                    return listE;
                }
            }
        }
        return CollectionsKt.e(new c.Empty(validator.getFieldName(), null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List C(Jk.k validator) {
        List listE;
        Intrinsics.j(validator, "$this$validator");
        String str = (String) validator.i();
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                if (!Ds.g.d(str)) {
                    str = null;
                }
                if (str == null || (listE = CollectionsKt.m()) == null) {
                    listE = CollectionsKt.e(new c.Invalid(validator.getFieldName(), null, null, 6, null));
                }
                if (listE != null) {
                    return listE;
                }
            }
        }
        return CollectionsKt.e(new c.Empty(validator.getFieldName(), null, 2, null));
    }

    public static /* synthetic */ DeliveryContactInformationViewState i(DeliveryContactInformationViewState deliveryContactInformationViewState, Validation validation, Validation validation2, Validation validation3, OrderTypeHeaderDataDecorator orderTypeHeaderDataDecorator, SlotData slotData, LocationData locationData, boolean z10, boolean z11, boolean z12, CheckoutFlowState checkoutFlowState, boolean z13, boolean z14, boolean z15, boolean z16, List list, int i10, Object obj) {
        return deliveryContactInformationViewState.h((i10 & 1) != 0 ? deliveryContactInformationViewState.emailAddress : validation, (i10 & 2) != 0 ? deliveryContactInformationViewState.phoneNumber : validation2, (i10 & 4) != 0 ? deliveryContactInformationViewState.agreedToTerms : validation3, (i10 & 8) != 0 ? deliveryContactInformationViewState.orderTypeHeaderDataDecorator : orderTypeHeaderDataDecorator, (i10 & 16) != 0 ? deliveryContactInformationViewState.slotData : slotData, (i10 & 32) != 0 ? deliveryContactInformationViewState.locationData : locationData, (i10 & 64) != 0 ? deliveryContactInformationViewState.isEditMode : z10, (i10 & 128) != 0 ? deliveryContactInformationViewState.isLoading : z11, (i10 & 256) != 0 ? deliveryContactInformationViewState.isContactInfoProvided : z12, (i10 & 512) != 0 ? deliveryContactInformationViewState.checkoutFlowState : checkoutFlowState, (i10 & 1024) != 0 ? deliveryContactInformationViewState.isShowFormInputScreen : z13, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? deliveryContactInformationViewState.isEnableContinueButton : z14, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? deliveryContactInformationViewState.isBunchaOrder : z15, (i10 & 8192) != 0 ? deliveryContactInformationViewState.byPassNonTextablePhoneNumber : z16, (i10 & 16384) != 0 ? deliveryContactInformationViewState.contactInfoFieldErrors : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean x() {
        int i10 = 2;
        return this.emailAddress.j(new Jk.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.O.e
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((DeliveryContactInformationViewState) this.receiver).n();
            }
        }, null, i10, 0 == true ? 1 : 0), new Jk.b(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.O.f
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((DeliveryContactInformationViewState) this.receiver).n();
            }
        }, null, 2, null)).getIsValid() && this.phoneNumber.j(new Jk.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.O.g
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((DeliveryContactInformationViewState) this.receiver).q();
            }
        }, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0), new Jk.g(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.O.h
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((DeliveryContactInformationViewState) this.receiver).q();
            }
        }, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0)).getIsValid() && this.agreedToTerms.j(new Jk.a(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.O.i
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((DeliveryContactInformationViewState) this.receiver).j();
            }
        })).getIsValid();
    }

    @Override // Ik.a
    public List<Validation<? extends Object>> a() {
        return this.validations;
    }

    public final DeliveryContactInformationViewState h(Validation<String> emailAddress, Validation<String> phoneNumber, Validation<Boolean> agreedToTerms, OrderTypeHeaderDataDecorator orderTypeHeaderDataDecorator, SlotData slotData, LocationData locationData, boolean isEditMode, boolean isLoading, boolean isContactInfoProvided, CheckoutFlowState checkoutFlowState, boolean isShowFormInputScreen, boolean isEnableContinueButton, boolean isBunchaOrder, boolean byPassNonTextablePhoneNumber, List<? extends H.i> contactInfoFieldErrors) {
        Intrinsics.j(emailAddress, "emailAddress");
        Intrinsics.j(phoneNumber, "phoneNumber");
        Intrinsics.j(agreedToTerms, "agreedToTerms");
        Intrinsics.j(contactInfoFieldErrors, "contactInfoFieldErrors");
        return new DeliveryContactInformationViewState(emailAddress, phoneNumber, agreedToTerms, orderTypeHeaderDataDecorator, slotData, locationData, isEditMode, isLoading, isContactInfoProvided, checkoutFlowState, isShowFormInputScreen, isEnableContinueButton, isBunchaOrder, byPassNonTextablePhoneNumber, contactInfoFieldErrors);
    }

    public final Validation<Boolean> j() {
        return this.agreedToTerms;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getByPassNonTextablePhoneNumber() {
        return this.byPassNonTextablePhoneNumber;
    }

    /* renamed from: l, reason: from getter */
    public final CheckoutFlowState getCheckoutFlowState() {
        return this.checkoutFlowState;
    }

    public final List<H.i> m() {
        return this.contactInfoFieldErrors;
    }

    public final Validation<String> n() {
        return this.emailAddress;
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

    /* renamed from: r, reason: from getter */
    public final SlotData getSlotData() {
        return this.slotData;
    }

    /* renamed from: s, reason: from getter */
    public final boolean getIsBunchaOrder() {
        return this.isBunchaOrder;
    }

    /* renamed from: t, reason: from getter */
    public final boolean getIsContactInfoProvided() {
        return this.isContactInfoProvided;
    }

    /* renamed from: u, reason: from getter */
    public final boolean getIsEnableContinueButton() {
        return this.isEnableContinueButton;
    }

    /* renamed from: v, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean w() {
        int i10 = 2;
        return (this.emailAddress.j(new Jk.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.O.a
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((DeliveryContactInformationViewState) this.receiver).n();
            }
        }, null, i10, 0 == true ? 1 : 0), new Jk.b(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.O.b
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((DeliveryContactInformationViewState) this.receiver).n();
            }
        }, null, 2, null)).getIsValid() && this.phoneNumber.j(new Jk.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.O.c
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((DeliveryContactInformationViewState) this.receiver).q();
            }
        }, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0), new Jk.g(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.O.d
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((DeliveryContactInformationViewState) this.receiver).q();
            }
        }, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0)).getIsValid()) ? false : true;
    }

    /* renamed from: y, reason: from getter */
    public final boolean getIsShowFormInputScreen() {
        return this.isShowFormInputScreen;
    }

    public DeliveryContactInformationViewState z() {
        return i(this, this.emailAddress.j(Jk.l.b(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.O.j
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((DeliveryContactInformationViewState) this.receiver).n();
            }
        }, new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.L
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeliveryContactInformationViewState.B((Jk.k) obj);
            }
        })), this.phoneNumber.j(Jk.l.b(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.O.k
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((DeliveryContactInformationViewState) this.receiver).q();
            }
        }, new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.M
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeliveryContactInformationViewState.C((Jk.k) obj);
            }
        })), this.agreedToTerms.j(Jk.l.b(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.O.l
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((DeliveryContactInformationViewState) this.receiver).j();
            }
        }, new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.N
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeliveryContactInformationViewState.A((Jk.k) obj);
            }
        })), null, null, null, false, false, false, null, false, x(), false, false, null, 30712, null);
    }

    public /* synthetic */ DeliveryContactInformationViewState(Validation validation, Validation validation2, Validation validation3, OrderTypeHeaderDataDecorator orderTypeHeaderDataDecorator, SlotData slotData, LocationData locationData, boolean z10, boolean z11, boolean z12, CheckoutFlowState checkoutFlowState, boolean z13, boolean z14, boolean z15, boolean z16, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Validation(null, null, 2, null) : validation, (i10 & 2) != 0 ? new Validation(null, null, 2, null) : validation2, (i10 & 4) != 0 ? new Validation(Boolean.FALSE, null, 2, null) : validation3, (i10 & 8) != 0 ? null : orderTypeHeaderDataDecorator, (i10 & 16) != 0 ? null : slotData, (i10 & 32) != 0 ? null : locationData, (i10 & 64) != 0 ? false : z10, (i10 & 128) != 0 ? true : z11, (i10 & 256) != 0 ? false : z12, (i10 & 512) == 0 ? checkoutFlowState : null, (i10 & 1024) != 0 ? false : z13, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? false : z14, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z15, (i10 & 8192) == 0 ? z16 : false, (i10 & 16384) != 0 ? CollectionsKt.m() : list);
    }
}
