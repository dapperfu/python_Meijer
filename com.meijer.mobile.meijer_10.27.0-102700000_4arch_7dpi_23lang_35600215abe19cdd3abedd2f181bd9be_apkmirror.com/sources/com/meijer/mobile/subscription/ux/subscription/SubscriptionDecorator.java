package com.meijer.mobile.subscription.ux.subscription;

import Tq.SimpleStoreSummary;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.weeklyad.service.flipp.BuildConfig;
import dr.ContactInfoRequest;
import dr.CustomerDeliveryAddressRequest;
import dr.CustomerNameRequest;
import dr.PaymentInfoRequest;
import dr.PreferredTimeslotRequest;
import dr.ProductInfoRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b%\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0001\u001fB¥\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ®\u0001\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b*\u0010\"R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010)\u001a\u0004\b-\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010$R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u0010\"R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010)\u001a\u0004\b3\u0010\"R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\b5\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b/\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b1\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b3\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b5\u0010?\u001a\u0004\b2\u0010@R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b,\u0010A\u001a\u0004\b4\u0010BR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b=\u0010C\u001a\u0004\b0\u0010DR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bE\u0010GR\u0011\u0010J\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/x;", "", "", "subscriptionId", "name", "baseSite", "", "deliveryFrequency", "deliveryFrequencyUnit", "fulfillmentPartner", "fulfillmentType", "LTq/e;", "storeInfo", "Ldr/f;", "productInfo", "Ldr/d;", "paymentInfo", "Ldr/b;", "customerDeliveryAddress", "Ldr/c;", "customerName", "Ldr/a;", "contactInfo", "Ldr/e;", "preferredTimeslot", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LTq/e;Ldr/f;Ldr/d;Ldr/b;Ldr/c;Ldr/a;Ldr/e;)V", "Lcom/meijer/mobile/subscription/ux/subscription/C;", "config", "c", "(Lcom/meijer/mobile/subscription/ux/subscription/C;)Lcom/meijer/mobile/subscription/ux/subscription/x;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LTq/e;Ldr/f;Ldr/d;Ldr/b;Ldr/c;Ldr/a;Ldr/e;)Lcom/meijer/mobile/subscription/ux/subscription/x;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "q", "b", "l", "d", "I", "h", "e", "i", "f", "j", "g", "k", "LTq/e;", "p", "()LTq/e;", "Ldr/f;", "o", "()Ldr/f;", "Ldr/d;", "m", "()Ldr/d;", "Ldr/b;", "()Ldr/b;", "Ldr/c;", "()Ldr/c;", "Ldr/a;", "()Ldr/a;", "n", "Ldr/e;", "()Ldr/e;", "r", "()Z", "isValid", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.subscription.ux.subscription.x, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class SubscriptionDecorator {

    /* renamed from: p, reason: collision with root package name */
    public static final int f119070p = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subscriptionId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String baseSite;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int deliveryFrequency;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryFrequencyUnit;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fulfillmentPartner;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fulfillmentType;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final SimpleStoreSummary storeInfo;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductInfoRequest productInfo;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentInfoRequest paymentInfo;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final CustomerDeliveryAddressRequest customerDeliveryAddress;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final CustomerNameRequest customerName;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final ContactInfoRequest contactInfo;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final PreferredTimeslotRequest preferredTimeslot;

    public SubscriptionDecorator() {
        this(null, null, null, 0, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionDecorator)) {
            return false;
        }
        SubscriptionDecorator subscriptionDecorator = (SubscriptionDecorator) other;
        return Intrinsics.e(this.subscriptionId, subscriptionDecorator.subscriptionId) && Intrinsics.e(this.name, subscriptionDecorator.name) && Intrinsics.e(this.baseSite, subscriptionDecorator.baseSite) && this.deliveryFrequency == subscriptionDecorator.deliveryFrequency && Intrinsics.e(this.deliveryFrequencyUnit, subscriptionDecorator.deliveryFrequencyUnit) && Intrinsics.e(this.fulfillmentPartner, subscriptionDecorator.fulfillmentPartner) && Intrinsics.e(this.fulfillmentType, subscriptionDecorator.fulfillmentType) && Intrinsics.e(this.storeInfo, subscriptionDecorator.storeInfo) && Intrinsics.e(this.productInfo, subscriptionDecorator.productInfo) && Intrinsics.e(this.paymentInfo, subscriptionDecorator.paymentInfo) && Intrinsics.e(this.customerDeliveryAddress, subscriptionDecorator.customerDeliveryAddress) && Intrinsics.e(this.customerName, subscriptionDecorator.customerName) && Intrinsics.e(this.contactInfo, subscriptionDecorator.contactInfo) && Intrinsics.e(this.preferredTimeslot, subscriptionDecorator.preferredTimeslot);
    }

    public int hashCode() {
        String str = this.subscriptionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (((((((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.baseSite.hashCode()) * 31) + Integer.hashCode(this.deliveryFrequency)) * 31) + this.deliveryFrequencyUnit.hashCode()) * 31) + this.fulfillmentPartner.hashCode()) * 31) + this.fulfillmentType.hashCode()) * 31;
        SimpleStoreSummary simpleStoreSummary = this.storeInfo;
        int iHashCode3 = (iHashCode2 + (simpleStoreSummary == null ? 0 : simpleStoreSummary.hashCode())) * 31;
        ProductInfoRequest productInfoRequest = this.productInfo;
        int iHashCode4 = (iHashCode3 + (productInfoRequest == null ? 0 : productInfoRequest.hashCode())) * 31;
        PaymentInfoRequest paymentInfoRequest = this.paymentInfo;
        int iHashCode5 = (iHashCode4 + (paymentInfoRequest == null ? 0 : paymentInfoRequest.hashCode())) * 31;
        CustomerDeliveryAddressRequest customerDeliveryAddressRequest = this.customerDeliveryAddress;
        int iHashCode6 = (iHashCode5 + (customerDeliveryAddressRequest == null ? 0 : customerDeliveryAddressRequest.hashCode())) * 31;
        CustomerNameRequest customerNameRequest = this.customerName;
        int iHashCode7 = (iHashCode6 + (customerNameRequest == null ? 0 : customerNameRequest.hashCode())) * 31;
        ContactInfoRequest contactInfoRequest = this.contactInfo;
        int iHashCode8 = (iHashCode7 + (contactInfoRequest == null ? 0 : contactInfoRequest.hashCode())) * 31;
        PreferredTimeslotRequest preferredTimeslotRequest = this.preferredTimeslot;
        return iHashCode8 + (preferredTimeslotRequest != null ? preferredTimeslotRequest.hashCode() : 0);
    }

    public String toString() {
        return "SubscriptionDecorator(subscriptionId=" + this.subscriptionId + ", name=" + this.name + ", baseSite=" + this.baseSite + ", deliveryFrequency=" + this.deliveryFrequency + ", deliveryFrequencyUnit=" + this.deliveryFrequencyUnit + ", fulfillmentPartner=" + this.fulfillmentPartner + ", fulfillmentType=" + this.fulfillmentType + ", storeInfo=" + this.storeInfo + ", productInfo=" + this.productInfo + ", paymentInfo=" + this.paymentInfo + ", customerDeliveryAddress=" + this.customerDeliveryAddress + ", customerName=" + this.customerName + ", contactInfo=" + this.contactInfo + ", preferredTimeslot=" + this.preferredTimeslot + ')';
    }

    public SubscriptionDecorator(String str, String str2, String baseSite, int i10, String deliveryFrequencyUnit, String fulfillmentPartner, String fulfillmentType, SimpleStoreSummary simpleStoreSummary, ProductInfoRequest productInfoRequest, PaymentInfoRequest paymentInfoRequest, CustomerDeliveryAddressRequest customerDeliveryAddressRequest, CustomerNameRequest customerNameRequest, ContactInfoRequest contactInfoRequest, PreferredTimeslotRequest preferredTimeslotRequest) {
        Intrinsics.j(baseSite, "baseSite");
        Intrinsics.j(deliveryFrequencyUnit, "deliveryFrequencyUnit");
        Intrinsics.j(fulfillmentPartner, "fulfillmentPartner");
        Intrinsics.j(fulfillmentType, "fulfillmentType");
        this.subscriptionId = str;
        this.name = str2;
        this.baseSite = baseSite;
        this.deliveryFrequency = i10;
        this.deliveryFrequencyUnit = deliveryFrequencyUnit;
        this.fulfillmentPartner = fulfillmentPartner;
        this.fulfillmentType = fulfillmentType;
        this.storeInfo = simpleStoreSummary;
        this.productInfo = productInfoRequest;
        this.paymentInfo = paymentInfoRequest;
        this.customerDeliveryAddress = customerDeliveryAddressRequest;
        this.customerName = customerNameRequest;
        this.contactInfo = contactInfoRequest;
        this.preferredTimeslot = preferredTimeslotRequest;
    }

    public static /* synthetic */ SubscriptionDecorator b(SubscriptionDecorator subscriptionDecorator, String str, String str2, String str3, int i10, String str4, String str5, String str6, SimpleStoreSummary simpleStoreSummary, ProductInfoRequest productInfoRequest, PaymentInfoRequest paymentInfoRequest, CustomerDeliveryAddressRequest customerDeliveryAddressRequest, CustomerNameRequest customerNameRequest, ContactInfoRequest contactInfoRequest, PreferredTimeslotRequest preferredTimeslotRequest, int i11, Object obj) {
        return subscriptionDecorator.a((i11 & 1) != 0 ? subscriptionDecorator.subscriptionId : str, (i11 & 2) != 0 ? subscriptionDecorator.name : str2, (i11 & 4) != 0 ? subscriptionDecorator.baseSite : str3, (i11 & 8) != 0 ? subscriptionDecorator.deliveryFrequency : i10, (i11 & 16) != 0 ? subscriptionDecorator.deliveryFrequencyUnit : str4, (i11 & 32) != 0 ? subscriptionDecorator.fulfillmentPartner : str5, (i11 & 64) != 0 ? subscriptionDecorator.fulfillmentType : str6, (i11 & 128) != 0 ? subscriptionDecorator.storeInfo : simpleStoreSummary, (i11 & 256) != 0 ? subscriptionDecorator.productInfo : productInfoRequest, (i11 & 512) != 0 ? subscriptionDecorator.paymentInfo : paymentInfoRequest, (i11 & 1024) != 0 ? subscriptionDecorator.customerDeliveryAddress : customerDeliveryAddressRequest, (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? subscriptionDecorator.customerName : customerNameRequest, (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? subscriptionDecorator.contactInfo : contactInfoRequest, (i11 & 8192) != 0 ? subscriptionDecorator.preferredTimeslot : preferredTimeslotRequest);
    }

    public final SubscriptionDecorator a(String subscriptionId, String name, String baseSite, int deliveryFrequency, String deliveryFrequencyUnit, String fulfillmentPartner, String fulfillmentType, SimpleStoreSummary storeInfo, ProductInfoRequest productInfo, PaymentInfoRequest paymentInfo, CustomerDeliveryAddressRequest customerDeliveryAddress, CustomerNameRequest customerName, ContactInfoRequest contactInfo, PreferredTimeslotRequest preferredTimeslot) {
        Intrinsics.j(baseSite, "baseSite");
        Intrinsics.j(deliveryFrequencyUnit, "deliveryFrequencyUnit");
        Intrinsics.j(fulfillmentPartner, "fulfillmentPartner");
        Intrinsics.j(fulfillmentType, "fulfillmentType");
        return new SubscriptionDecorator(subscriptionId, name, baseSite, deliveryFrequency, deliveryFrequencyUnit, fulfillmentPartner, fulfillmentType, storeInfo, productInfo, paymentInfo, customerDeliveryAddress, customerName, contactInfo, preferredTimeslot);
    }

    public final SubscriptionDecorator c(SubscriptionStaticConfig config) {
        Intrinsics.j(config, "config");
        String baseSite = this.baseSite;
        if (baseSite.length() == 0) {
            baseSite = config.getBaseSite();
        }
        String str = baseSite;
        String deliveryFrequencyUnit = this.deliveryFrequencyUnit;
        if (deliveryFrequencyUnit.length() == 0) {
            deliveryFrequencyUnit = config.getDeliveryFrequencyUnit();
        }
        String str2 = deliveryFrequencyUnit;
        String fulfillmentType = this.fulfillmentType;
        if (fulfillmentType.length() == 0) {
            fulfillmentType = config.getFulfillmentType();
        }
        String str3 = fulfillmentType;
        String fulfillmentPartner = this.fulfillmentPartner;
        if (fulfillmentPartner.length() == 0) {
            fulfillmentPartner = config.getFulfillmentPartner();
        }
        String str4 = fulfillmentPartner;
        CustomerNameRequest customerName = this.customerName;
        if (customerName == null) {
            customerName = config.getCustomerName();
        }
        CustomerNameRequest customerNameRequest = customerName;
        CustomerDeliveryAddressRequest customerDeliveryAddress = this.customerDeliveryAddress;
        if (customerDeliveryAddress == null) {
            customerDeliveryAddress = config.getCustomerDeliveryAddress();
        }
        CustomerDeliveryAddressRequest customerDeliveryAddressRequest = customerDeliveryAddress;
        PaymentInfoRequest paymentInfo = this.paymentInfo;
        if (paymentInfo == null) {
            paymentInfo = config.getPaymentInfo();
        }
        PaymentInfoRequest paymentInfoRequest = paymentInfo;
        PreferredTimeslotRequest preferredTimeslot = this.preferredTimeslot;
        if (preferredTimeslot == null) {
            preferredTimeslot = config.getPreferredTimeslot();
        }
        PreferredTimeslotRequest preferredTimeslotRequest = preferredTimeslot;
        ContactInfoRequest contactInfo = this.contactInfo;
        if (contactInfo == null) {
            contactInfo = config.getContactInfo();
        }
        return b(this, null, null, str, 0, str2, str4, str3, null, null, paymentInfoRequest, customerDeliveryAddressRequest, customerNameRequest, contactInfo, preferredTimeslotRequest, 395, null);
    }

    /* renamed from: d, reason: from getter */
    public final String getBaseSite() {
        return this.baseSite;
    }

    /* renamed from: e, reason: from getter */
    public final ContactInfoRequest getContactInfo() {
        return this.contactInfo;
    }

    /* renamed from: f, reason: from getter */
    public final CustomerDeliveryAddressRequest getCustomerDeliveryAddress() {
        return this.customerDeliveryAddress;
    }

    /* renamed from: g, reason: from getter */
    public final CustomerNameRequest getCustomerName() {
        return this.customerName;
    }

    /* renamed from: h, reason: from getter */
    public final int getDeliveryFrequency() {
        return this.deliveryFrequency;
    }

    /* renamed from: i, reason: from getter */
    public final String getDeliveryFrequencyUnit() {
        return this.deliveryFrequencyUnit;
    }

    /* renamed from: j, reason: from getter */
    public final String getFulfillmentPartner() {
        return this.fulfillmentPartner;
    }

    /* renamed from: k, reason: from getter */
    public final String getFulfillmentType() {
        return this.fulfillmentType;
    }

    /* renamed from: l, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: m, reason: from getter */
    public final PaymentInfoRequest getPaymentInfo() {
        return this.paymentInfo;
    }

    /* renamed from: n, reason: from getter */
    public final PreferredTimeslotRequest getPreferredTimeslot() {
        return this.preferredTimeslot;
    }

    /* renamed from: o, reason: from getter */
    public final ProductInfoRequest getProductInfo() {
        return this.productInfo;
    }

    /* renamed from: p, reason: from getter */
    public final SimpleStoreSummary getStoreInfo() {
        return this.storeInfo;
    }

    /* renamed from: q, reason: from getter */
    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    public final boolean r() {
        ProductInfoRequest productInfoRequest;
        return this.deliveryFrequency > 0 && (productInfoRequest = this.productInfo) != null && productInfoRequest.getProductQty() > 0.0d;
    }

    public /* synthetic */ SubscriptionDecorator(String str, String str2, String str3, int i10, String str4, String str5, String str6, SimpleStoreSummary simpleStoreSummary, ProductInfoRequest productInfoRequest, PaymentInfoRequest paymentInfoRequest, CustomerDeliveryAddressRequest customerDeliveryAddressRequest, CustomerNameRequest customerNameRequest, ContactInfoRequest contactInfoRequest, PreferredTimeslotRequest preferredTimeslotRequest, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? BuildConfig.FLIPP_MERCHANT_ID : str3, (i11 & 8) != 0 ? 0 : i10, (i11 & 16) != 0 ? "week" : str4, (i11 & 32) != 0 ? "Shipt" : str5, (i11 & 64) != 0 ? "delivery" : str6, (i11 & 128) != 0 ? null : simpleStoreSummary, (i11 & 256) != 0 ? null : productInfoRequest, (i11 & 512) != 0 ? null : paymentInfoRequest, (i11 & 1024) != 0 ? null : customerDeliveryAddressRequest, (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? null : customerNameRequest, (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : contactInfoRequest, (i11 & 8192) != 0 ? null : preferredTimeslotRequest);
    }
}
