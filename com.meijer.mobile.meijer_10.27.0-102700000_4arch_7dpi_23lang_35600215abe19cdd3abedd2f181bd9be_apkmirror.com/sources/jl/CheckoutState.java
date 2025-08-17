package jl;

import Hk.Validation;
import Hk.c;
import Tq.PointOfService;
import androidx.recyclerview.widget.RecyclerView;
import ci.CustomerAddress;
import com.google.android.libraries.places.api.model.PlaceTypes;
import ej.AvailableFulfillmentEligibility;
import ej.DeliveryMode;
import ej.Entry;
import ej.PaymentDetailItem;
import ej.ShoppingCart;
import ej.SubstitutePreference;
import fj.ContactInformation;
import fj.PickupPerson;
import gk.EbtPaymentOption;
import gk.PaymentOption;
import ij.FulfillmentSlot;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b,\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0093\u0002\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0002\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0002\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0002\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0016\u0012\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0000H\u0016¢\u0006\u0004\b'\u0010(J\u009c\u0002\u0010)\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00022\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00022\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00022\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00162\b\b\u0002\u0010\u001f\u001a\u00020\u00162\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u00020\u00162\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0006¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b9\u00107R\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00028\u0006¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u00107R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006¢\u0006\f\n\u0004\b<\u00105\u001a\u0004\b=\u00107R\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00028\u0006¢\u0006\f\n\u0004\b>\u00105\u001a\u0004\b?\u00107R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b)\u0010@\u001a\u0004\bA\u0010,R\u001f\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00028\u0006¢\u0006\f\n\u0004\bB\u00105\u001a\u0004\bC\u00107R\u001f\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00028\u0006¢\u0006\f\n\u0004\bD\u00105\u001a\u0004\bE\u00107R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b6\u0010F\u001a\u0004\bG\u0010HR\u001f\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00028\u0006¢\u0006\f\n\u0004\bI\u00105\u001a\u0004\bJ\u00107R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b?\u0010K\u001a\u0004\bL\u0010MR\u001f\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00028\u0006¢\u0006\f\n\u0004\bA\u00105\u001a\u0004\bN\u00107R\u001f\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00028\u0006¢\u0006\f\n\u0004\b;\u00105\u001a\u0004\bO\u00107R\u001f\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00028\u0006¢\u0006\f\n\u0004\bP\u00105\u001a\u0004\bI\u00107R\u0017\u0010\u001e\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bG\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010\u001f\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bE\u0010Q\u001a\u0004\bP\u0010SR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006¢\u0006\f\n\u0004\b=\u0010T\u001a\u0004\bU\u0010VR\u0014\u0010W\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010QR\u0017\u0010Y\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bX\u0010Q\u001a\u0004\bX\u0010SR*\u0010Z\u001a\u0012\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001000\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010T\u001a\u0004\b4\u0010VR\u0017\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00180 8F¢\u0006\u0006\u001a\u0004\bD\u0010V¨\u0006\\"}, d2 = {"Ljl/v;", "LHk/a;", "LHk/b;", "Lej/C;", "cart", "LTq/c;", PlaceTypes.STORE, "Lej/h;", "deliveryMode", "", "fulfillmentLocation", "Lci/c;", "deliveryAddress", "deliveryInstructions", "Lgk/f;", "paymentInfo", "Lgk/d;", "ebtPaymentInfo", "Lmk/b;", "ebtApprovedAmount", "Lij/c;", "timeSlot", "", "isExpressPickUp", "Lej/D;", "substitutePreference", "Lfj/b;", "pickupPerson", "Lfj/a;", "contactInformation", "highValuePromosShown", "earlyDelivery", "", "Lej/b;", "availableFulfillmentEligibilities", "<init>", "(LHk/b;LHk/b;LHk/b;LHk/b;LHk/b;Ljava/lang/String;LHk/b;LHk/b;Lmk/b;LHk/b;Ljava/lang/Boolean;LHk/b;LHk/b;LHk/b;ZZLjava/util/List;)V", "B", "(Lej/C;)Ljl/v;", "z", "()Ljl/v;", "f", "(LHk/b;LHk/b;LHk/b;LHk/b;LHk/b;Ljava/lang/String;LHk/b;LHk/b;Lmk/b;LHk/b;Ljava/lang/Boolean;LHk/b;LHk/b;LHk/b;ZZLjava/util/List;)Ljl/v;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LHk/b;", "i", "()LHk/b;", "b", "v", "c", "m", "d", "q", "e", "k", "Ljava/lang/String;", "l", "g", "t", "h", "p", "Lmk/b;", "o", "()Lmk/b;", "j", "x", "Ljava/lang/Boolean;", "y", "()Ljava/lang/Boolean;", "w", "u", "n", "Z", "r", "()Z", "Ljava/util/List;", "getAvailableFulfillmentEligibilities", "()Ljava/util/List;", "isBunchaDeliveryAvailable", "s", "multipleFulfillmentPartnersAvailable", "validations", "availableSubstitutionPreferences", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: jl.v, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class CheckoutState implements Hk.a<CheckoutState> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<ShoppingCart> cart;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<PointOfService> store;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<DeliveryMode> deliveryMode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<String> fulfillmentLocation;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<CustomerAddress> deliveryAddress;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryInstructions;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<PaymentOption> paymentInfo;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<EbtPaymentOption> ebtPaymentInfo;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b ebtApprovedAmount;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<FulfillmentSlot> timeSlot;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean isExpressPickUp;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<SubstitutePreference> substitutePreference;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<PickupPerson> pickupPerson;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<ContactInformation> contactInformation;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean highValuePromosShown;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean earlyDelivery;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<AvailableFulfillmentEligibility> availableFulfillmentEligibilities;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final boolean isBunchaDeliveryAvailable;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final boolean multipleFulfillmentPartnersAvailable;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final List<Validation<? extends Object>> validations;

    public CheckoutState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, 131071, null);
    }

    public static /* synthetic */ CheckoutState g(CheckoutState checkoutState, Validation validation, Validation validation2, Validation validation3, Validation validation4, Validation validation5, String str, Validation validation6, Validation validation7, mk.b bVar, Validation validation8, Boolean bool, Validation validation9, Validation validation10, Validation validation11, boolean z10, boolean z11, List list, int i10, Object obj) {
        List list2;
        boolean z12;
        Validation validation12;
        CheckoutState checkoutState2;
        boolean z13;
        Validation validation13;
        Validation validation14;
        Validation validation15;
        Validation validation16;
        String str2;
        Validation validation17;
        Validation validation18;
        mk.b bVar2;
        Validation validation19;
        Boolean bool2;
        Validation validation20;
        Validation validation21;
        Validation validation22;
        Validation validation23 = (i10 & 1) != 0 ? checkoutState.cart : validation;
        Validation validation24 = (i10 & 2) != 0 ? checkoutState.store : validation2;
        Validation validation25 = (i10 & 4) != 0 ? checkoutState.deliveryMode : validation3;
        Validation validation26 = (i10 & 8) != 0 ? checkoutState.fulfillmentLocation : validation4;
        Validation validation27 = (i10 & 16) != 0 ? checkoutState.deliveryAddress : validation5;
        String str3 = (i10 & 32) != 0 ? checkoutState.deliveryInstructions : str;
        Validation validation28 = (i10 & 64) != 0 ? checkoutState.paymentInfo : validation6;
        Validation validation29 = (i10 & 128) != 0 ? checkoutState.ebtPaymentInfo : validation7;
        mk.b bVar3 = (i10 & 256) != 0 ? checkoutState.ebtApprovedAmount : bVar;
        Validation validation30 = (i10 & 512) != 0 ? checkoutState.timeSlot : validation8;
        Boolean bool3 = (i10 & 1024) != 0 ? checkoutState.isExpressPickUp : bool;
        Validation validation31 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? checkoutState.substitutePreference : validation9;
        Validation validation32 = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? checkoutState.pickupPerson : validation10;
        Validation validation33 = (i10 & 8192) != 0 ? checkoutState.contactInformation : validation11;
        Validation validation34 = validation23;
        boolean z14 = (i10 & 16384) != 0 ? checkoutState.highValuePromosShown : z10;
        boolean z15 = (i10 & 32768) != 0 ? checkoutState.earlyDelivery : z11;
        if ((i10 & 65536) != 0) {
            z12 = z15;
            list2 = checkoutState.availableFulfillmentEligibilities;
            z13 = z14;
            validation13 = validation24;
            validation14 = validation25;
            validation15 = validation26;
            validation16 = validation27;
            str2 = str3;
            validation17 = validation28;
            validation18 = validation29;
            bVar2 = bVar3;
            validation19 = validation30;
            bool2 = bool3;
            validation20 = validation31;
            validation21 = validation32;
            validation22 = validation33;
            validation12 = validation34;
            checkoutState2 = checkoutState;
        } else {
            list2 = list;
            z12 = z15;
            validation12 = validation34;
            checkoutState2 = checkoutState;
            z13 = z14;
            validation13 = validation24;
            validation14 = validation25;
            validation15 = validation26;
            validation16 = validation27;
            str2 = str3;
            validation17 = validation28;
            validation18 = validation29;
            bVar2 = bVar3;
            validation19 = validation30;
            bool2 = bool3;
            validation20 = validation31;
            validation21 = validation32;
            validation22 = validation33;
        }
        return checkoutState2.f(validation12, validation13, validation14, validation15, validation16, str2, validation17, validation18, bVar2, validation19, bool2, validation20, validation21, validation22, z13, z12, list2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutState)) {
            return false;
        }
        CheckoutState checkoutState = (CheckoutState) other;
        return Intrinsics.e(this.cart, checkoutState.cart) && Intrinsics.e(this.store, checkoutState.store) && Intrinsics.e(this.deliveryMode, checkoutState.deliveryMode) && Intrinsics.e(this.fulfillmentLocation, checkoutState.fulfillmentLocation) && Intrinsics.e(this.deliveryAddress, checkoutState.deliveryAddress) && Intrinsics.e(this.deliveryInstructions, checkoutState.deliveryInstructions) && Intrinsics.e(this.paymentInfo, checkoutState.paymentInfo) && Intrinsics.e(this.ebtPaymentInfo, checkoutState.ebtPaymentInfo) && Intrinsics.e(this.ebtApprovedAmount, checkoutState.ebtApprovedAmount) && Intrinsics.e(this.timeSlot, checkoutState.timeSlot) && Intrinsics.e(this.isExpressPickUp, checkoutState.isExpressPickUp) && Intrinsics.e(this.substitutePreference, checkoutState.substitutePreference) && Intrinsics.e(this.pickupPerson, checkoutState.pickupPerson) && Intrinsics.e(this.contactInformation, checkoutState.contactInformation) && this.highValuePromosShown == checkoutState.highValuePromosShown && this.earlyDelivery == checkoutState.earlyDelivery && Intrinsics.e(this.availableFulfillmentEligibilities, checkoutState.availableFulfillmentEligibilities);
    }

    public CheckoutState(Validation<ShoppingCart> cart, Validation<PointOfService> store, Validation<DeliveryMode> deliveryMode, Validation<String> fulfillmentLocation, Validation<CustomerAddress> deliveryAddress, String str, Validation<PaymentOption> paymentInfo, Validation<EbtPaymentOption> ebtPaymentInfo, mk.b bVar, Validation<FulfillmentSlot> timeSlot, Boolean bool, Validation<SubstitutePreference> substitutePreference, Validation<PickupPerson> pickupPerson, Validation<ContactInformation> contactInformation, boolean z10, boolean z11, List<AvailableFulfillmentEligibility> availableFulfillmentEligibilities) {
        boolean z12;
        Intrinsics.j(cart, "cart");
        Intrinsics.j(store, "store");
        Intrinsics.j(deliveryMode, "deliveryMode");
        Intrinsics.j(fulfillmentLocation, "fulfillmentLocation");
        Intrinsics.j(deliveryAddress, "deliveryAddress");
        Intrinsics.j(paymentInfo, "paymentInfo");
        Intrinsics.j(ebtPaymentInfo, "ebtPaymentInfo");
        Intrinsics.j(timeSlot, "timeSlot");
        Intrinsics.j(substitutePreference, "substitutePreference");
        Intrinsics.j(pickupPerson, "pickupPerson");
        Intrinsics.j(contactInformation, "contactInformation");
        Intrinsics.j(availableFulfillmentEligibilities, "availableFulfillmentEligibilities");
        this.cart = cart;
        this.store = store;
        this.deliveryMode = deliveryMode;
        this.fulfillmentLocation = fulfillmentLocation;
        this.deliveryAddress = deliveryAddress;
        this.deliveryInstructions = str;
        this.paymentInfo = paymentInfo;
        this.ebtPaymentInfo = ebtPaymentInfo;
        this.ebtApprovedAmount = bVar;
        this.timeSlot = timeSlot;
        this.isExpressPickUp = bool;
        this.substitutePreference = substitutePreference;
        this.pickupPerson = pickupPerson;
        this.contactInformation = contactInformation;
        this.highValuePromosShown = z10;
        this.earlyDelivery = z11;
        this.availableFulfillmentEligibilities = availableFulfillmentEligibilities;
        List<AvailableFulfillmentEligibility> list = availableFulfillmentEligibilities;
        if ((list instanceof Collection) && list.isEmpty()) {
            z12 = false;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.e(((AvailableFulfillmentEligibility) it.next()).getPartnerEligibility(), ej.o.f128952f.getPartnerName())) {
                    z12 = true;
                    break;
                }
            }
            z12 = false;
        }
        this.isBunchaDeliveryAvailable = z12;
        this.multipleFulfillmentPartnersAvailable = this.availableFulfillmentEligibilities.size() > 1 && z12;
        this.validations = CollectionsKt.p(this.cart, this.deliveryMode, this.deliveryAddress, this.paymentInfo, this.timeSlot, this.substitutePreference, this.pickupPerson, this.contactInformation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List A(Ik.k validator) {
        List<Entry> listP;
        List listM;
        Intrinsics.j(validator, "$this$validator");
        ShoppingCart shoppingCart = (ShoppingCart) validator.i();
        if (shoppingCart != null && (listP = shoppingCart.p()) != null) {
            if (listP.isEmpty()) {
                listP = null;
            }
            if (listP != null && (listM = CollectionsKt.m()) != null) {
                return listM;
            }
        }
        return CollectionsKt.e(new c.Empty(validator.getFieldName(), null, 2, null));
    }

    public final CheckoutState B(ShoppingCart cart) {
        PaymentDetailItem paymentInfo;
        List<AvailableFulfillmentEligibility> listM = null;
        CheckoutState checkoutState = new CheckoutState(new Validation(cart, null, 2, null), null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, 131070, null);
        Validation validation = new Validation(gk.g.a(this.paymentInfo.e(), (cart == null || (paymentInfo = cart.getPaymentInfo()) == null) ? null : ej.v.a(paymentInfo)), null, 2, null);
        Validation<EbtPaymentOption> validation2 = this.ebtPaymentInfo;
        mk.b ebtSuggestedTotal = cart != null ? cart.getEbtSuggestedTotal() : null;
        Validation<FulfillmentSlot> validation3 = this.timeSlot;
        Boolean bool = this.isExpressPickUp;
        String str = this.deliveryInstructions;
        Validation<PickupPerson> validation4 = this.pickupPerson;
        Validation<ContactInformation> validation5 = this.contactInformation;
        boolean z10 = this.highValuePromosShown;
        boolean z11 = this.earlyDelivery;
        if (cart != null) {
            listM = cart.c();
        }
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        return g(checkoutState, null, null, null, null, null, str, validation, validation2, ebtSuggestedTotal, validation3, bool, null, validation4, validation5, z10, z11, listM, 2079, null);
    }

    @Override // Hk.a
    public List<Validation<? extends Object>> a() {
        return this.validations;
    }

    public final CheckoutState f(Validation<ShoppingCart> cart, Validation<PointOfService> store, Validation<DeliveryMode> deliveryMode, Validation<String> fulfillmentLocation, Validation<CustomerAddress> deliveryAddress, String deliveryInstructions, Validation<PaymentOption> paymentInfo, Validation<EbtPaymentOption> ebtPaymentInfo, mk.b ebtApprovedAmount, Validation<FulfillmentSlot> timeSlot, Boolean isExpressPickUp, Validation<SubstitutePreference> substitutePreference, Validation<PickupPerson> pickupPerson, Validation<ContactInformation> contactInformation, boolean highValuePromosShown, boolean earlyDelivery, List<AvailableFulfillmentEligibility> availableFulfillmentEligibilities) {
        Intrinsics.j(cart, "cart");
        Intrinsics.j(store, "store");
        Intrinsics.j(deliveryMode, "deliveryMode");
        Intrinsics.j(fulfillmentLocation, "fulfillmentLocation");
        Intrinsics.j(deliveryAddress, "deliveryAddress");
        Intrinsics.j(paymentInfo, "paymentInfo");
        Intrinsics.j(ebtPaymentInfo, "ebtPaymentInfo");
        Intrinsics.j(timeSlot, "timeSlot");
        Intrinsics.j(substitutePreference, "substitutePreference");
        Intrinsics.j(pickupPerson, "pickupPerson");
        Intrinsics.j(contactInformation, "contactInformation");
        Intrinsics.j(availableFulfillmentEligibilities, "availableFulfillmentEligibilities");
        return new CheckoutState(cart, store, deliveryMode, fulfillmentLocation, deliveryAddress, deliveryInstructions, paymentInfo, ebtPaymentInfo, ebtApprovedAmount, timeSlot, isExpressPickUp, substitutePreference, pickupPerson, contactInformation, highValuePromosShown, earlyDelivery, availableFulfillmentEligibilities);
    }

    public final List<SubstitutePreference> h() {
        return SubstitutePreference.INSTANCE.e();
    }

    public int hashCode() {
        int iHashCode = ((((((((this.cart.hashCode() * 31) + this.store.hashCode()) * 31) + this.deliveryMode.hashCode()) * 31) + this.fulfillmentLocation.hashCode()) * 31) + this.deliveryAddress.hashCode()) * 31;
        String str = this.deliveryInstructions;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.paymentInfo.hashCode()) * 31) + this.ebtPaymentInfo.hashCode()) * 31;
        mk.b bVar = this.ebtApprovedAmount;
        int iHashCode3 = (((iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.timeSlot.hashCode()) * 31;
        Boolean bool = this.isExpressPickUp;
        return ((((((((((((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31) + this.substitutePreference.hashCode()) * 31) + this.pickupPerson.hashCode()) * 31) + this.contactInformation.hashCode()) * 31) + Boolean.hashCode(this.highValuePromosShown)) * 31) + Boolean.hashCode(this.earlyDelivery)) * 31) + this.availableFulfillmentEligibilities.hashCode();
    }

    public final Validation<ShoppingCart> i() {
        return this.cart;
    }

    public final Validation<ContactInformation> j() {
        return this.contactInformation;
    }

    public final Validation<CustomerAddress> k() {
        return this.deliveryAddress;
    }

    /* renamed from: l, reason: from getter */
    public final String getDeliveryInstructions() {
        return this.deliveryInstructions;
    }

    public final Validation<DeliveryMode> m() {
        return this.deliveryMode;
    }

    /* renamed from: n, reason: from getter */
    public final boolean getEarlyDelivery() {
        return this.earlyDelivery;
    }

    /* renamed from: o, reason: from getter */
    public final mk.b getEbtApprovedAmount() {
        return this.ebtApprovedAmount;
    }

    public final Validation<EbtPaymentOption> p() {
        return this.ebtPaymentInfo;
    }

    public final Validation<String> q() {
        return this.fulfillmentLocation;
    }

    /* renamed from: r, reason: from getter */
    public final boolean getHighValuePromosShown() {
        return this.highValuePromosShown;
    }

    /* renamed from: s, reason: from getter */
    public final boolean getMultipleFulfillmentPartnersAvailable() {
        return this.multipleFulfillmentPartnersAvailable;
    }

    public final Validation<PaymentOption> t() {
        return this.paymentInfo;
    }

    public String toString() {
        return "CheckoutState(cart=" + this.cart + ", store=" + this.store + ", deliveryMode=" + this.deliveryMode + ", fulfillmentLocation=" + this.fulfillmentLocation + ", deliveryAddress=" + this.deliveryAddress + ", deliveryInstructions=" + this.deliveryInstructions + ", paymentInfo=" + this.paymentInfo + ", ebtPaymentInfo=" + this.ebtPaymentInfo + ", ebtApprovedAmount=" + this.ebtApprovedAmount + ", timeSlot=" + this.timeSlot + ", isExpressPickUp=" + this.isExpressPickUp + ", substitutePreference=" + this.substitutePreference + ", pickupPerson=" + this.pickupPerson + ", contactInformation=" + this.contactInformation + ", highValuePromosShown=" + this.highValuePromosShown + ", earlyDelivery=" + this.earlyDelivery + ", availableFulfillmentEligibilities=" + this.availableFulfillmentEligibilities + ')';
    }

    public final Validation<PickupPerson> u() {
        return this.pickupPerson;
    }

    public final Validation<PointOfService> v() {
        return this.store;
    }

    public final Validation<SubstitutePreference> w() {
        return this.substitutePreference;
    }

    public final Validation<FulfillmentSlot> x() {
        return this.timeSlot;
    }

    /* renamed from: y, reason: from getter */
    public final Boolean getIsExpressPickUp() {
        return this.isExpressPickUp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CheckoutState z() {
        char c10;
        Ik.k<PickupPerson> fVar;
        char c11;
        String str;
        Validation<ShoppingCart> validationJ = this.cart.j(Ik.l.b(new PropertyReference0Impl(this) { // from class: jl.v.h
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((CheckoutState) this.receiver).i();
            }
        }, new Function1() { // from class: jl.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CheckoutState.A((Ik.k) obj);
            }
        }));
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        int i10 = 2;
        Validation<PointOfService> validationJ2 = this.store.j(new Ik.e(new PropertyReference0Impl(this) { // from class: jl.v.k
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((CheckoutState) this.receiver).v();
            }
        }, null, i10, 0 == true ? 1 : 0));
        Validation<DeliveryMode> validationJ3 = this.deliveryMode.j(new Ik.e(new PropertyReference0Impl(this) { // from class: jl.v.l
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((CheckoutState) this.receiver).m();
            }
        }, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0), new x(new PropertyReference0Impl(this) { // from class: jl.v.m
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((CheckoutState) this.receiver).m();
            }
        }, this.store.e()));
        Validation<CustomerAddress> validation = this.deliveryAddress;
        Validation<DeliveryMode> validation2 = this.deliveryMode;
        if (validation2.e() != null) {
            validation2 = null;
        }
        Ik.f fVar2 = validation2 != null ? new Ik.f(new PropertyReference0Impl(this) { // from class: jl.v.n
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((CheckoutState) this.receiver).k();
            }
        }) : null;
        Validation<DeliveryMode> validation3 = this.deliveryMode;
        DeliveryMode deliveryModeE = validation3.e();
        if (!Intrinsics.e(deliveryModeE != null ? deliveryModeE.getCode() : null, "delivery")) {
            validation3 = null;
        }
        Validation<CustomerAddress> validationJ4 = validation.j(fVar2, validation3 != null ? new Ik.e(new PropertyReference0Impl(this) { // from class: jl.v.o
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((CheckoutState) this.receiver).k();
            }
        }, objArr4 == true ? 1 : 0, i10, objArr3 == true ? 1 : 0) : null);
        Validation<PaymentOption> validationJ5 = this.paymentInfo.j(new Ik.e(new PropertyReference0Impl(this) { // from class: jl.v.a
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((CheckoutState) this.receiver).t();
            }
        }, objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0), new z(new PropertyReference0Impl(this) { // from class: jl.v.b
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((CheckoutState) this.receiver).t();
            }
        }));
        Validation<EbtPaymentOption> validationJ6 = this.ebtPaymentInfo.j(new y(new PropertyReference0Impl(this) { // from class: jl.v.c
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((CheckoutState) this.receiver).p();
            }
        }));
        Validation<FulfillmentSlot> validationJ7 = this.timeSlot.j(new C14986B(new PropertyReference0Impl(this) { // from class: jl.v.d
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((CheckoutState) this.receiver).x();
            }
        }));
        Validation<SubstitutePreference> validationJ8 = this.substitutePreference.j(new C14985A(new PropertyReference0Impl(this) { // from class: jl.v.e
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((CheckoutState) this.receiver).w();
            }
        }));
        Validation<PickupPerson> validation4 = this.pickupPerson;
        Validation<DeliveryMode> validation5 = this.deliveryMode;
        if (validation5.e() != null) {
            validation5 = null;
        }
        if (validation5 != null) {
            c10 = 1;
            fVar = new Ik.f<>(new PropertyReference0Impl(this) { // from class: jl.v.f
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((CheckoutState) this.receiver).u();
                }
            });
        } else {
            c10 = 1;
            fVar = null;
        }
        Validation<DeliveryMode> validation6 = this.deliveryMode;
        DeliveryMode deliveryModeE2 = validation6.e();
        if (deliveryModeE2 != null) {
            String code = deliveryModeE2.getCode();
            c11 = 0;
            str = code;
        } else {
            c11 = 0;
            str = null;
        }
        if (!Intrinsics.e(str, "pickup")) {
            validation6 = null;
        }
        Ik.k<PickupPerson> eVar = validation6 != null ? new Ik.e<>(new PropertyReference0Impl(this) { // from class: jl.v.g
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((CheckoutState) this.receiver).u();
            }
        }, null, i10, 0 == true ? 1 : 0) : null;
        Ik.k<PickupPerson>[] kVarArr = new Ik.k[2];
        kVarArr[c11] = fVar;
        kVarArr[c10] = eVar;
        Validation<PickupPerson> validationJ9 = validation4.j(kVarArr);
        Validation<ContactInformation> validation7 = this.contactInformation;
        Validation<DeliveryMode> validation8 = this.deliveryMode;
        if (validation8.e() != null) {
            validation8 = null;
        }
        Ik.k<ContactInformation> fVar3 = validation8 != null ? new Ik.f<>(new PropertyReference0Impl(this) { // from class: jl.v.i
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((CheckoutState) this.receiver).j();
            }
        }) : null;
        Validation<DeliveryMode> validation9 = this.deliveryMode;
        DeliveryMode deliveryModeE3 = validation9.e();
        if (!Intrinsics.e(deliveryModeE3 != null ? deliveryModeE3.getCode() : null, "delivery")) {
            validation9 = null;
        }
        Ik.k<ContactInformation> eVar2 = validation9 != null ? new Ik.e<>(new PropertyReference0Impl(this) { // from class: jl.v.j
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((CheckoutState) this.receiver).j();
            }
        }, null, i10, 0 == true ? 1 : 0) : null;
        Ik.k<ContactInformation>[] kVarArr2 = new Ik.k[2];
        kVarArr2[c11] = fVar3;
        kVarArr2[c10] = eVar2;
        return g(this, validationJ, validationJ2, validationJ3, null, validationJ4, null, validationJ5, validationJ6, null, validationJ7, null, validationJ8, validationJ9, validation7.j(kVarArr2), false, false, null, 116008, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0072 A[PHI: r7
      0x0072: PHI (r7v12 java.lang.String) = (r7v9 java.lang.String), (r7v17 java.lang.String) binds: [B:43:0x0088, B:34:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ CheckoutState(Hk.Validation r18, Hk.Validation r19, Hk.Validation r20, Hk.Validation r21, Hk.Validation r22, java.lang.String r23, Hk.Validation r24, Hk.Validation r25, mk.b r26, Hk.Validation r27, java.lang.Boolean r28, Hk.Validation r29, Hk.Validation r30, Hk.Validation r31, boolean r32, boolean r33, java.util.List r34, int r35, kotlin.jvm.internal.DefaultConstructorMarker r36) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jl.CheckoutState.<init>(Hk.b, Hk.b, Hk.b, Hk.b, Hk.b, java.lang.String, Hk.b, Hk.b, mk.b, Hk.b, java.lang.Boolean, Hk.b, Hk.b, Hk.b, boolean, boolean, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
