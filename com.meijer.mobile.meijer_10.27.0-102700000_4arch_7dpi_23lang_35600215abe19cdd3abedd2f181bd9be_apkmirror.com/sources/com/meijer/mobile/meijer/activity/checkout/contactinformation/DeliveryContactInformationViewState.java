package com.meijer.mobile.meijer.activity.checkout.contactinformation;

import Hk.Validation;
import Hk.c;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.meijer.activity.checkout.contactinformation.H;
import com.meijer.mobile.meijer.activity.checkout.pickupperson.LocationData;
import com.meijer.mobile.meijer.activity.checkout.pickupperson.SlotData;
import java.util.List;
import jl.CheckoutFlowState;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b,\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B·\u0001\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJÀ\u0001\u0010\u001d\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b\u000e\u0010>R\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010=\u001a\u0004\b?\u0010>R\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\bA\u0010>R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b/\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bC\u0010=\u001a\u0004\bE\u0010>R\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bF\u0010=\u001a\u0004\bG\u0010>R\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010=\u001a\u0004\bH\u0010>R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b:\u0010I\u001a\u0004\bF\u0010JR*\u0010K\u001a\u0012\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010$0\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u0010I\u001a\u0004\b(\u0010JR\u0014\u0010M\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010>R\u0011\u0010O\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bN\u0010>¨\u0006P"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;", "LHk/a;", "LHk/b;", "", "emailAddress", "phoneNumber", "", "agreedToTerms", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/S;", "orderTypeHeaderDataDecorator", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/P;", "slotData", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/b;", "locationData", "isEditMode", "isLoading", "isContactInfoProvided", "Ljl/f;", "checkoutFlowState", "isShowFormInputScreen", "isEnableContinueButton", "isBunchaOrder", "", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$i;", "contactInfoFieldErrors", "<init>", "(LHk/b;LHk/b;LHk/b;Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/S;Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/P;Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/b;ZZZLjl/f;ZZZLjava/util/List;)V", "y", "()Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;", "h", "(LHk/b;LHk/b;LHk/b;Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/S;Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/P;Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/b;ZZZLjl/f;ZZZLjava/util/List;)Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LHk/b;", "m", "()LHk/b;", "b", "p", "c", "j", "d", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/S;", "o", "()Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/S;", "e", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/P;", "q", "()Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/P;", "f", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/b;", "n", "()Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/b;", "g", "Z", "()Z", "u", "i", "s", "Ljl/f;", "k", "()Ljl/f;", "x", "l", "t", "r", "Ljava/util/List;", "()Ljava/util/List;", "validations", "w", "isShowContinueButton", "v", "isShowContactInfoInputView", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.O, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class DeliveryContactInformationViewState implements Hk.a<DeliveryContactInformationViewState> {

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
    private final List<H.i> contactInfoFieldErrors;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final List<Validation<? extends Object>> validations;

    public DeliveryContactInformationViewState() {
        this(null, null, null, null, null, null, false, false, false, null, false, false, false, null, 16383, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryContactInformationViewState)) {
            return false;
        }
        DeliveryContactInformationViewState deliveryContactInformationViewState = (DeliveryContactInformationViewState) other;
        return Intrinsics.e(this.emailAddress, deliveryContactInformationViewState.emailAddress) && Intrinsics.e(this.phoneNumber, deliveryContactInformationViewState.phoneNumber) && Intrinsics.e(this.agreedToTerms, deliveryContactInformationViewState.agreedToTerms) && Intrinsics.e(this.orderTypeHeaderDataDecorator, deliveryContactInformationViewState.orderTypeHeaderDataDecorator) && Intrinsics.e(this.slotData, deliveryContactInformationViewState.slotData) && Intrinsics.e(this.locationData, deliveryContactInformationViewState.locationData) && this.isEditMode == deliveryContactInformationViewState.isEditMode && this.isLoading == deliveryContactInformationViewState.isLoading && this.isContactInfoProvided == deliveryContactInformationViewState.isContactInfoProvided && Intrinsics.e(this.checkoutFlowState, deliveryContactInformationViewState.checkoutFlowState) && this.isShowFormInputScreen == deliveryContactInformationViewState.isShowFormInputScreen && this.isEnableContinueButton == deliveryContactInformationViewState.isEnableContinueButton && this.isBunchaOrder == deliveryContactInformationViewState.isBunchaOrder && Intrinsics.e(this.contactInfoFieldErrors, deliveryContactInformationViewState.contactInfoFieldErrors);
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
        return ((((((((iHashCode4 + (checkoutFlowState != null ? checkoutFlowState.hashCode() : 0)) * 31) + Boolean.hashCode(this.isShowFormInputScreen)) * 31) + Boolean.hashCode(this.isEnableContinueButton)) * 31) + Boolean.hashCode(this.isBunchaOrder)) * 31) + this.contactInfoFieldErrors.hashCode();
    }

    public String toString() {
        return "DeliveryContactInformationViewState(emailAddress=" + this.emailAddress + ", phoneNumber=" + this.phoneNumber + ", agreedToTerms=" + this.agreedToTerms + ", orderTypeHeaderDataDecorator=" + this.orderTypeHeaderDataDecorator + ", slotData=" + this.slotData + ", locationData=" + this.locationData + ", isEditMode=" + this.isEditMode + ", isLoading=" + this.isLoading + ", isContactInfoProvided=" + this.isContactInfoProvided + ", checkoutFlowState=" + this.checkoutFlowState + ", isShowFormInputScreen=" + this.isShowFormInputScreen + ", isEnableContinueButton=" + this.isEnableContinueButton + ", isBunchaOrder=" + this.isBunchaOrder + ", contactInfoFieldErrors=" + this.contactInfoFieldErrors + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeliveryContactInformationViewState(Validation<String> emailAddress, Validation<String> phoneNumber, Validation<Boolean> agreedToTerms, OrderTypeHeaderDataDecorator orderTypeHeaderDataDecorator, SlotData slotData, LocationData locationData, boolean z10, boolean z11, boolean z12, CheckoutFlowState checkoutFlowState, boolean z13, boolean z14, boolean z15, List<? extends H.i> contactInfoFieldErrors) {
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
        this.contactInfoFieldErrors = contactInfoFieldErrors;
        this.validations = CollectionsKt.p(emailAddress, phoneNumber, agreedToTerms);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List A(Ik.k validator) {
        List listE;
        Intrinsics.j(validator, "$this$validator");
        String str = (String) validator.i();
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                if (!Ds.h.f7341a.a(str)) {
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
    public static final List B(Ik.k validator) {
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

    public static /* synthetic */ DeliveryContactInformationViewState i(DeliveryContactInformationViewState deliveryContactInformationViewState, Validation validation, Validation validation2, Validation validation3, OrderTypeHeaderDataDecorator orderTypeHeaderDataDecorator, SlotData slotData, LocationData locationData, boolean z10, boolean z11, boolean z12, CheckoutFlowState checkoutFlowState, boolean z13, boolean z14, boolean z15, List list, int i10, Object obj) {
        return deliveryContactInformationViewState.h((i10 & 1) != 0 ? deliveryContactInformationViewState.emailAddress : validation, (i10 & 2) != 0 ? deliveryContactInformationViewState.phoneNumber : validation2, (i10 & 4) != 0 ? deliveryContactInformationViewState.agreedToTerms : validation3, (i10 & 8) != 0 ? deliveryContactInformationViewState.orderTypeHeaderDataDecorator : orderTypeHeaderDataDecorator, (i10 & 16) != 0 ? deliveryContactInformationViewState.slotData : slotData, (i10 & 32) != 0 ? deliveryContactInformationViewState.locationData : locationData, (i10 & 64) != 0 ? deliveryContactInformationViewState.isEditMode : z10, (i10 & 128) != 0 ? deliveryContactInformationViewState.isLoading : z11, (i10 & 256) != 0 ? deliveryContactInformationViewState.isContactInfoProvided : z12, (i10 & 512) != 0 ? deliveryContactInformationViewState.checkoutFlowState : checkoutFlowState, (i10 & 1024) != 0 ? deliveryContactInformationViewState.isShowFormInputScreen : z13, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? deliveryContactInformationViewState.isEnableContinueButton : z14, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? deliveryContactInformationViewState.isBunchaOrder : z15, (i10 & 8192) != 0 ? deliveryContactInformationViewState.contactInfoFieldErrors : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean w() {
        return this.emailAddress.j(new Ik.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.O.e
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((DeliveryContactInformationViewState) this.receiver).m();
            }
        }, null, 2, null), new Ik.b(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.O.f
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((DeliveryContactInformationViewState) this.receiver).m();
            }
        }, null, 2, null)).getIsValid() && this.phoneNumber.j(new Ik.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.O.g
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((DeliveryContactInformationViewState) this.receiver).p();
            }
        }, null, 2, null), new Ik.g(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.O.h
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((DeliveryContactInformationViewState) this.receiver).p();
            }
        }, null, 2, 0 == true ? 1 : 0)).getIsValid() && this.agreedToTerms.j(new Ik.a(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.O.i
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((DeliveryContactInformationViewState) this.receiver).j();
            }
        })).getIsValid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List z(Ik.k validator) {
        List listM;
        Intrinsics.j(validator, "$this$validator");
        Object objI = validator.i();
        if (!((Boolean) objI).booleanValue()) {
            objI = null;
        }
        return (((Boolean) objI) == null || (listM = CollectionsKt.m()) == null) ? CollectionsKt.e(new c.Invalid(validator.getFieldName(), null, null, 6, null)) : listM;
    }

    @Override // Hk.a
    public List<Validation<? extends Object>> a() {
        return this.validations;
    }

    public final DeliveryContactInformationViewState h(Validation<String> emailAddress, Validation<String> phoneNumber, Validation<Boolean> agreedToTerms, OrderTypeHeaderDataDecorator orderTypeHeaderDataDecorator, SlotData slotData, LocationData locationData, boolean isEditMode, boolean isLoading, boolean isContactInfoProvided, CheckoutFlowState checkoutFlowState, boolean isShowFormInputScreen, boolean isEnableContinueButton, boolean isBunchaOrder, List<? extends H.i> contactInfoFieldErrors) {
        Intrinsics.j(emailAddress, "emailAddress");
        Intrinsics.j(phoneNumber, "phoneNumber");
        Intrinsics.j(agreedToTerms, "agreedToTerms");
        Intrinsics.j(contactInfoFieldErrors, "contactInfoFieldErrors");
        return new DeliveryContactInformationViewState(emailAddress, phoneNumber, agreedToTerms, orderTypeHeaderDataDecorator, slotData, locationData, isEditMode, isLoading, isContactInfoProvided, checkoutFlowState, isShowFormInputScreen, isEnableContinueButton, isBunchaOrder, contactInfoFieldErrors);
    }

    public final Validation<Boolean> j() {
        return this.agreedToTerms;
    }

    /* renamed from: k, reason: from getter */
    public final CheckoutFlowState getCheckoutFlowState() {
        return this.checkoutFlowState;
    }

    public final List<H.i> l() {
        return this.contactInfoFieldErrors;
    }

    public final Validation<String> m() {
        return this.emailAddress;
    }

    /* renamed from: n, reason: from getter */
    public final LocationData getLocationData() {
        return this.locationData;
    }

    /* renamed from: o, reason: from getter */
    public final OrderTypeHeaderDataDecorator getOrderTypeHeaderDataDecorator() {
        return this.orderTypeHeaderDataDecorator;
    }

    public final Validation<String> p() {
        return this.phoneNumber;
    }

    /* renamed from: q, reason: from getter */
    public final SlotData getSlotData() {
        return this.slotData;
    }

    /* renamed from: r, reason: from getter */
    public final boolean getIsBunchaOrder() {
        return this.isBunchaOrder;
    }

    /* renamed from: s, reason: from getter */
    public final boolean getIsContactInfoProvided() {
        return this.isContactInfoProvided;
    }

    /* renamed from: t, reason: from getter */
    public final boolean getIsEnableContinueButton() {
        return this.isEnableContinueButton;
    }

    /* renamed from: u, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean v() {
        return (this.emailAddress.j(new Ik.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.O.a
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((DeliveryContactInformationViewState) this.receiver).m();
            }
        }, null, 2, null), new Ik.b(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.O.b
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((DeliveryContactInformationViewState) this.receiver).m();
            }
        }, null, 2, null)).getIsValid() && this.phoneNumber.j(new Ik.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.O.c
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((DeliveryContactInformationViewState) this.receiver).p();
            }
        }, null, 2, null), new Ik.g(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.O.d
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((DeliveryContactInformationViewState) this.receiver).p();
            }
        }, null, 2, 0 == true ? 1 : 0)).getIsValid()) ? false : true;
    }

    /* renamed from: x, reason: from getter */
    public final boolean getIsShowFormInputScreen() {
        return this.isShowFormInputScreen;
    }

    public DeliveryContactInformationViewState y() {
        return i(this, this.emailAddress.j(Ik.l.b(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.O.j
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((DeliveryContactInformationViewState) this.receiver).m();
            }
        }, new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.L
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeliveryContactInformationViewState.A((Ik.k) obj);
            }
        })), this.phoneNumber.j(Ik.l.b(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.O.k
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((DeliveryContactInformationViewState) this.receiver).p();
            }
        }, new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.M
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeliveryContactInformationViewState.B((Ik.k) obj);
            }
        })), this.agreedToTerms.j(Ik.l.b(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.O.l
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((DeliveryContactInformationViewState) this.receiver).j();
            }
        }, new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.N
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeliveryContactInformationViewState.z((Ik.k) obj);
            }
        })), null, null, null, false, false, false, null, false, w(), false, null, 14328, null);
    }

    public /* synthetic */ DeliveryContactInformationViewState(Validation validation, Validation validation2, Validation validation3, OrderTypeHeaderDataDecorator orderTypeHeaderDataDecorator, SlotData slotData, LocationData locationData, boolean z10, boolean z11, boolean z12, CheckoutFlowState checkoutFlowState, boolean z13, boolean z14, boolean z15, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Validation(null, null, 2, null) : validation, (i10 & 2) != 0 ? new Validation(null, null, 2, null) : validation2, (i10 & 4) != 0 ? new Validation(Boolean.FALSE, null, 2, null) : validation3, (i10 & 8) != 0 ? null : orderTypeHeaderDataDecorator, (i10 & 16) != 0 ? null : slotData, (i10 & 32) != 0 ? null : locationData, (i10 & 64) != 0 ? false : z10, (i10 & 128) != 0 ? true : z11, (i10 & 256) != 0 ? false : z12, (i10 & 512) == 0 ? checkoutFlowState : null, (i10 & 1024) != 0 ? false : z13, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? false : z14, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? z15 : false, (i10 & 8192) != 0 ? CollectionsKt.m() : list);
    }
}
