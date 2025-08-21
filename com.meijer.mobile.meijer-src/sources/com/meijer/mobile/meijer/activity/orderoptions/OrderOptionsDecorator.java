package com.meijer.mobile.meijer.activity.orderoptions;

import bk.AbstractC6392a;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.meijer.mobile.meijer.activity.checkout.review.StoreDecorator;
import di.CustomerAddress;
import fj.DeliveryMode;
import fj.ShoppingCart;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0002\u000e\u001bBO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJX\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u0019\u001a\u0004\b*\u0010\u0011R\u0011\u0010-\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010/\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b.\u0010,R\u0011\u00103\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00106\u001a\u0002048F¢\u0006\u0006\u001a\u0004\b)\u00105R\u0011\u00107\u001a\u0002048F¢\u0006\u0006\u001a\u0004\b%\u00105R\u0011\u00108\u001a\u0002048F¢\u0006\u0006\u001a\u0004\b!\u00105R\u0011\u00109\u001a\u0002048F¢\u0006\u0006\u001a\u0004\b\u001f\u00105¨\u0006:"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/r;", "", "", "selectedDeliveryMode", "", "deliveryFee", "curbsideFee", "Ldi/c;", "deliveryAddress", "Lcom/meijer/mobile/meijer/activity/checkout/review/X1;", PlaceTypes.STORE, "error", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ldi/c;Lcom/meijer/mobile/meijer/activity/checkout/review/X1;Ljava/lang/String;)V", "a", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ldi/c;Lcom/meijer/mobile/meijer/activity/checkout/review/X1;Ljava/lang/String;)Lcom/meijer/mobile/meijer/activity/orderoptions/r;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "i", "b", "Ljava/lang/Double;", "getDeliveryFee", "()Ljava/lang/Double;", "c", "getCurbsideFee", "d", "Ldi/c;", "g", "()Ldi/c;", "e", "Lcom/meijer/mobile/meijer/activity/checkout/review/X1;", "j", "()Lcom/meijer/mobile/meijer/activity/checkout/review/X1;", "f", "getError", "l", "()Z", "isPickupOrder", "k", "isDeliveryOrder", "Lcom/meijer/mobile/meijer/activity/orderoptions/r$b;", "h", "()Lcom/meijer/mobile/meijer/activity/orderoptions/r$b;", "orderDetails", "Lbk/a;", "()Lbk/a;", "addressSectionHeader", "addressSectionEmptyListString", "addressSearchButton", "addressNewSearchButton", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.orderoptions.r, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class OrderOptionsDecorator {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f110819h = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String selectedDeliveryMode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double deliveryFee;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double curbsideFee;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final CustomerAddress deliveryAddress;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final StoreDecorator store;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String error;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/r$a;", "", "<init>", "()V", "Lfj/C;", "cart", "", "deliveryModeCode", "error", "Lcom/meijer/mobile/meijer/activity/orderoptions/r;", "a", "(Lfj/C;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/meijer/activity/orderoptions/r;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.r$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ OrderOptionsDecorator b(Companion companion, ShoppingCart shoppingCart, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                shoppingCart = null;
            }
            if ((i10 & 2) != 0) {
                str = null;
            }
            if ((i10 & 4) != 0) {
                str2 = null;
            }
            return companion.a(shoppingCart, str, str2);
        }

        public final OrderOptionsDecorator a(ShoppingCart cart, String deliveryModeCode, String error) {
            Double dValueOf;
            nk.b deliveryCost;
            nk.b deliveryCost2;
            if (cart == null) {
                return new OrderOptionsDecorator(null, null, null, null, null, error, 31, null);
            }
            if (deliveryModeCode == null) {
                DeliveryMode deliveryMode = cart.getDeliveryMode();
                deliveryModeCode = deliveryMode != null ? deliveryMode.getCode() : null;
                if (deliveryModeCode == null) {
                    deliveryModeCode = "pickup";
                }
            }
            Double dValueOf2 = Double.valueOf(cart.getPointOfService().getDeliveryFee());
            DeliveryMode deliveryMode2 = cart.getDeliveryMode();
            if (Intrinsics.b((deliveryMode2 == null || (deliveryCost2 = deliveryMode2.getDeliveryCost()) == null) ? null : Double.valueOf(deliveryCost2.getValue()), 0.0d)) {
                DeliveryMode deliveryMode3 = cart.getDeliveryMode();
                dValueOf = (deliveryMode3 == null || (deliveryCost = deliveryMode3.getDeliveryCost()) == null) ? null : Double.valueOf(deliveryCost.getValue());
            } else {
                dValueOf = Double.valueOf(cart.getPointOfService().getCurbSideFee());
            }
            return new OrderOptionsDecorator(deliveryModeCode, dValueOf2, dValueOf, cart.getDeliveryAddress(), StoreDecorator.Companion.c(StoreDecorator.INSTANCE, cart.getPointOfService(), null, 2, null), error);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/r$b;", "", "", "fulfillmentIcon", "Lbk/a;", "fulfillmentAddress", PlaceTypes.ADDRESS, "<init>", "(Ljava/lang/Integer;Lbk/a;Lbk/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "b", "Lbk/a;", "()Lbk/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.r$b, reason: from toString */
    public static final /* data */ class OrderDetailsDecorator {

        /* renamed from: d, reason: collision with root package name */
        public static final int f110826d = AbstractC6392a.f60445b;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer fulfillmentIcon;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a fulfillmentAddress;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a address;

        public OrderDetailsDecorator() {
            this(null, null, null, 7, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderDetailsDecorator)) {
                return false;
            }
            OrderDetailsDecorator orderDetailsDecorator = (OrderDetailsDecorator) other;
            return Intrinsics.e(this.fulfillmentIcon, orderDetailsDecorator.fulfillmentIcon) && Intrinsics.e(this.fulfillmentAddress, orderDetailsDecorator.fulfillmentAddress) && Intrinsics.e(this.address, orderDetailsDecorator.address);
        }

        public int hashCode() {
            Integer num = this.fulfillmentIcon;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            AbstractC6392a abstractC6392a = this.fulfillmentAddress;
            int iHashCode2 = (iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31;
            AbstractC6392a abstractC6392a2 = this.address;
            return iHashCode2 + (abstractC6392a2 != null ? abstractC6392a2.hashCode() : 0);
        }

        public String toString() {
            return "OrderDetailsDecorator(fulfillmentIcon=" + this.fulfillmentIcon + ", fulfillmentAddress=" + this.fulfillmentAddress + ", address=" + this.address + ')';
        }

        public OrderDetailsDecorator(Integer num, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2) {
            this.fulfillmentIcon = num;
            this.fulfillmentAddress = abstractC6392a;
            this.address = abstractC6392a2;
        }

        /* renamed from: a, reason: from getter */
        public final AbstractC6392a getAddress() {
            return this.address;
        }

        /* renamed from: b, reason: from getter */
        public final AbstractC6392a getFulfillmentAddress() {
            return this.fulfillmentAddress;
        }

        /* renamed from: c, reason: from getter */
        public final Integer getFulfillmentIcon() {
            return this.fulfillmentIcon;
        }

        public /* synthetic */ OrderDetailsDecorator(Integer num, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 0 : num, (i10 & 2) != 0 ? null : abstractC6392a, (i10 & 4) != 0 ? null : abstractC6392a2);
        }
    }

    public OrderOptionsDecorator() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderOptionsDecorator)) {
            return false;
        }
        OrderOptionsDecorator orderOptionsDecorator = (OrderOptionsDecorator) other;
        return Intrinsics.e(this.selectedDeliveryMode, orderOptionsDecorator.selectedDeliveryMode) && Intrinsics.e(this.deliveryFee, orderOptionsDecorator.deliveryFee) && Intrinsics.e(this.curbsideFee, orderOptionsDecorator.curbsideFee) && Intrinsics.e(this.deliveryAddress, orderOptionsDecorator.deliveryAddress) && Intrinsics.e(this.store, orderOptionsDecorator.store) && Intrinsics.e(this.error, orderOptionsDecorator.error);
    }

    public int hashCode() {
        String str = this.selectedDeliveryMode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d10 = this.deliveryFee;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.curbsideFee;
        int iHashCode3 = (iHashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
        CustomerAddress customerAddress = this.deliveryAddress;
        int iHashCode4 = (iHashCode3 + (customerAddress == null ? 0 : customerAddress.hashCode())) * 31;
        StoreDecorator storeDecorator = this.store;
        int iHashCode5 = (iHashCode4 + (storeDecorator == null ? 0 : storeDecorator.hashCode())) * 31;
        String str2 = this.error;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "OrderOptionsDecorator(selectedDeliveryMode=" + this.selectedDeliveryMode + ", deliveryFee=" + this.deliveryFee + ", curbsideFee=" + this.curbsideFee + ", deliveryAddress=" + this.deliveryAddress + ", store=" + this.store + ", error=" + this.error + ')';
    }

    public OrderOptionsDecorator(String str, Double d10, Double d11, CustomerAddress customerAddress, StoreDecorator storeDecorator, String str2) {
        this.selectedDeliveryMode = str;
        this.deliveryFee = d10;
        this.curbsideFee = d11;
        this.deliveryAddress = customerAddress;
        this.store = storeDecorator;
        this.error = str2;
    }

    public static /* synthetic */ OrderOptionsDecorator b(OrderOptionsDecorator orderOptionsDecorator, String str, Double d10, Double d11, CustomerAddress customerAddress, StoreDecorator storeDecorator, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = orderOptionsDecorator.selectedDeliveryMode;
        }
        if ((i10 & 2) != 0) {
            d10 = orderOptionsDecorator.deliveryFee;
        }
        if ((i10 & 4) != 0) {
            d11 = orderOptionsDecorator.curbsideFee;
        }
        if ((i10 & 8) != 0) {
            customerAddress = orderOptionsDecorator.deliveryAddress;
        }
        if ((i10 & 16) != 0) {
            storeDecorator = orderOptionsDecorator.store;
        }
        if ((i10 & 32) != 0) {
            str2 = orderOptionsDecorator.error;
        }
        StoreDecorator storeDecorator2 = storeDecorator;
        String str3 = str2;
        return orderOptionsDecorator.a(str, d10, d11, customerAddress, storeDecorator2, str3);
    }

    public final OrderOptionsDecorator a(String selectedDeliveryMode, Double deliveryFee, Double curbsideFee, CustomerAddress deliveryAddress, StoreDecorator store, String error) {
        return new OrderOptionsDecorator(selectedDeliveryMode, deliveryFee, curbsideFee, deliveryAddress, store, error);
    }

    /* renamed from: g, reason: from getter */
    public final CustomerAddress getDeliveryAddress() {
        return this.deliveryAddress;
    }

    /* renamed from: i, reason: from getter */
    public final String getSelectedDeliveryMode() {
        return this.selectedDeliveryMode;
    }

    /* renamed from: j, reason: from getter */
    public final StoreDecorator getStore() {
        return this.store;
    }

    public final boolean k() {
        return Intrinsics.e(this.selectedDeliveryMode, "delivery");
    }

    public final boolean l() {
        return Intrinsics.e(this.selectedDeliveryMode, "pickup");
    }

    public final AbstractC6392a c() {
        if (l()) {
            return AbstractC6392a.INSTANCE.d(Il.h.f14928Y, new Object[0]);
        }
        return AbstractC6392a.INSTANCE.d(Il.h.f14906C, new Object[0]);
    }

    public final AbstractC6392a d() {
        if (l()) {
            return AbstractC6392a.INSTANCE.d(Il.h.f14928Y, new Object[0]);
        }
        return AbstractC6392a.INSTANCE.d(Il.h.f14927X, new Object[0]);
    }

    public final AbstractC6392a e() {
        if (l()) {
            return AbstractC6392a.INSTANCE.d(Il.h.f14908E, new Object[0]);
        }
        return AbstractC6392a.INSTANCE.d(Il.h.f14911H, new Object[0]);
    }

    public final AbstractC6392a f() {
        if (l()) {
            return AbstractC6392a.INSTANCE.d(Il.h.f14905B, new Object[0]);
        }
        return AbstractC6392a.INSTANCE.d(Il.h.f14926W, new Object[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsDecorator.OrderDetailsDecorator h() {
        /*
            r14 = this;
            boolean r0 = r14.l()
            r1 = 0
            if (r0 == 0) goto L53
            int r0 = Cj.i.f4783f2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.meijer.mobile.meijer.activity.checkout.review.X1 r2 = r14.store
            if (r2 == 0) goto L24
            java.lang.String r2 = r2.getName()
            if (r2 == 0) goto L24
            bk.a$a r3 = bk.AbstractC6392a.INSTANCE
            int r4 = Il.h.f14913J
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            bk.a r2 = r3.d(r4, r2)
            goto L25
        L24:
            r2 = r1
        L25:
            bk.a$a r3 = bk.AbstractC6392a.INSTANCE
            int r4 = Il.h.f14944h
            tk.a r5 = tk.C17269a.f163094a
            com.meijer.mobile.meijer.activity.checkout.review.X1 r6 = r14.store
            if (r6 == 0) goto L34
            java.lang.String r6 = r6.getAddressLine1()
            goto L35
        L34:
            r6 = r1
        L35:
            com.meijer.mobile.meijer.activity.checkout.review.X1 r7 = r14.store
            if (r7 == 0) goto L3d
            java.lang.String r1 = r7.getAddressCityStateZip()
        L3d:
            java.lang.String[] r1 = new java.lang.String[]{r6, r1}
            java.lang.String r1 = r5.f(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            bk.a r1 = r3.d(r4, r1)
            com.meijer.mobile.meijer.activity.orderoptions.r$b r3 = new com.meijer.mobile.meijer.activity.orderoptions.r$b
            r3.<init>(r0, r2, r1)
            return r3
        L53:
            boolean r0 = r14.k()
            if (r0 == 0) goto Ldd
            int r0 = Cj.i.f4775d2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            di.c r2 = r14.deliveryAddress
            if (r2 == 0) goto L76
            java.lang.String r2 = r2.getLine1()
            if (r2 == 0) goto L76
            bk.a$a r3 = bk.AbstractC6392a.INSTANCE
            int r4 = Il.h.f14961u
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            bk.a r2 = r3.d(r4, r2)
            goto L77
        L76:
            r2 = r1
        L77:
            bk.a$a r3 = bk.AbstractC6392a.INSTANCE
            int r4 = Il.h.f14944h
            di.c r5 = r14.deliveryAddress
            if (r5 == 0) goto Lcd
            java.lang.String r6 = r5.getLine1()
            java.lang.String r7 = r5.getLine2()
            if (r7 == 0) goto L90
            boolean r8 = kotlin.text.StringsKt.s0(r7)
            if (r8 != 0) goto L90
            r1 = r7
        L90:
            tk.a r7 = tk.C17269a.f163094a
            java.lang.String r8 = r5.getTown()
            di.f r9 = r5.getRegion()
            java.lang.String r10 = r9.getIsoCodeShort()
            if (r10 != 0) goto Laa
            java.lang.String r9 = r9.getIsoCode()
            java.lang.String r10 = "US-"
            java.lang.String r10 = kotlin.text.StringsKt.K0(r9, r10)
        Laa:
            java.lang.String r5 = r5.getPostalCode()
            java.lang.String r5 = r7.c(r8, r10, r5)
            java.lang.String[] r1 = new java.lang.String[]{r6, r1, r5}
            java.util.List r1 = kotlin.collections.CollectionsKt.r(r1)
            r5 = r1
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r12 = 62
            r13 = 0
            java.lang.String r6 = ", "
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r1 = kotlin.collections.CollectionsKt.B0(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r1 != 0) goto Lcf
        Lcd:
            java.lang.String r1 = ""
        Lcf:
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            bk.a r1 = r3.d(r4, r1)
            com.meijer.mobile.meijer.activity.orderoptions.r$b r3 = new com.meijer.mobile.meijer.activity.orderoptions.r$b
            r3.<init>(r0, r2, r1)
            return r3
        Ldd:
            com.meijer.mobile.meijer.activity.orderoptions.r$b r4 = new com.meijer.mobile.meijer.activity.orderoptions.r$b
            r8 = 7
            r9 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsDecorator.h():com.meijer.mobile.meijer.activity.orderoptions.r$b");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OrderOptionsDecorator(String str, Double d10, Double d11, CustomerAddress customerAddress, StoreDecorator storeDecorator, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        Double dValueOf = Double.valueOf(0.0d);
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? dValueOf : d10, (i10 & 4) != 0 ? dValueOf : d11, (i10 & 8) != 0 ? null : customerAddress, (i10 & 16) != 0 ? null : storeDecorator, (i10 & 32) != 0 ? null : str2);
    }
}
