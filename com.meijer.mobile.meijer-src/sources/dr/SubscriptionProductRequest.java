package dr;

import Tq.SimpleStoreSummary;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b#\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b-\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b.\u0010\u001cR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b'\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00107R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b(\u0010:R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b3\u0010;\u001a\u0004\b)\u0010<R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b0\u0010=\u001a\u0004\b&\u0010>R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b8\u0010A¨\u0006B"}, d2 = {"Ldr/g;", "", "", "subscriptionId", "name", "baseSite", "", "deliveryFrequency", "deliveryFrequencyUnit", "fulfillmentPartner", "fulfillmentType", "LTq/e;", "storeInfo", "Ldr/f;", "productInfo", "Ldr/d;", "paymentInfo", "Ldr/b;", "customerDeliveryAddress", "Ldr/c;", "customerName", "Ldr/a;", "contactInfo", "Ldr/e;", "preferredTimeslot", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LTq/e;Ldr/f;Ldr/d;Ldr/b;Ldr/c;Ldr/a;Ldr/e;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSubscriptionId", "b", "i", "c", "d", "I", "e", "f", "g", "h", "LTq/e;", "m", "()LTq/e;", "Ldr/f;", "l", "()Ldr/f;", "j", "Ldr/d;", "()Ldr/d;", "k", "Ldr/b;", "()Ldr/b;", "Ldr/c;", "()Ldr/c;", "Ldr/a;", "()Ldr/a;", "n", "Ldr/e;", "()Ldr/e;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dr.g, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
public final /* data */ class SubscriptionProductRequest {

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

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionProductRequest)) {
            return false;
        }
        SubscriptionProductRequest subscriptionProductRequest = (SubscriptionProductRequest) other;
        return Intrinsics.e(this.subscriptionId, subscriptionProductRequest.subscriptionId) && Intrinsics.e(this.name, subscriptionProductRequest.name) && Intrinsics.e(this.baseSite, subscriptionProductRequest.baseSite) && this.deliveryFrequency == subscriptionProductRequest.deliveryFrequency && Intrinsics.e(this.deliveryFrequencyUnit, subscriptionProductRequest.deliveryFrequencyUnit) && Intrinsics.e(this.fulfillmentPartner, subscriptionProductRequest.fulfillmentPartner) && Intrinsics.e(this.fulfillmentType, subscriptionProductRequest.fulfillmentType) && Intrinsics.e(this.storeInfo, subscriptionProductRequest.storeInfo) && Intrinsics.e(this.productInfo, subscriptionProductRequest.productInfo) && Intrinsics.e(this.paymentInfo, subscriptionProductRequest.paymentInfo) && Intrinsics.e(this.customerDeliveryAddress, subscriptionProductRequest.customerDeliveryAddress) && Intrinsics.e(this.customerName, subscriptionProductRequest.customerName) && Intrinsics.e(this.contactInfo, subscriptionProductRequest.contactInfo) && Intrinsics.e(this.preferredTimeslot, subscriptionProductRequest.preferredTimeslot);
    }

    public SubscriptionProductRequest(String str, String str2, String baseSite, int i10, String deliveryFrequencyUnit, String fulfillmentPartner, String fulfillmentType, SimpleStoreSummary storeInfo, ProductInfoRequest productInfo, PaymentInfoRequest paymentInfo, CustomerDeliveryAddressRequest customerDeliveryAddress, CustomerNameRequest customerNameRequest, ContactInfoRequest contactInfoRequest, PreferredTimeslotRequest preferredTimeslot) {
        Intrinsics.j(baseSite, "baseSite");
        Intrinsics.j(deliveryFrequencyUnit, "deliveryFrequencyUnit");
        Intrinsics.j(fulfillmentPartner, "fulfillmentPartner");
        Intrinsics.j(fulfillmentType, "fulfillmentType");
        Intrinsics.j(storeInfo, "storeInfo");
        Intrinsics.j(productInfo, "productInfo");
        Intrinsics.j(paymentInfo, "paymentInfo");
        Intrinsics.j(customerDeliveryAddress, "customerDeliveryAddress");
        Intrinsics.j(preferredTimeslot, "preferredTimeslot");
        this.subscriptionId = str;
        this.name = str2;
        this.baseSite = baseSite;
        this.deliveryFrequency = i10;
        this.deliveryFrequencyUnit = deliveryFrequencyUnit;
        this.fulfillmentPartner = fulfillmentPartner;
        this.fulfillmentType = fulfillmentType;
        this.storeInfo = storeInfo;
        this.productInfo = productInfo;
        this.paymentInfo = paymentInfo;
        this.customerDeliveryAddress = customerDeliveryAddress;
        this.customerName = customerNameRequest;
        this.contactInfo = contactInfoRequest;
        this.preferredTimeslot = preferredTimeslot;
    }

    /* renamed from: a, reason: from getter */
    public final String getBaseSite() {
        return this.baseSite;
    }

    /* renamed from: b, reason: from getter */
    public final ContactInfoRequest getContactInfo() {
        return this.contactInfo;
    }

    /* renamed from: c, reason: from getter */
    public final CustomerDeliveryAddressRequest getCustomerDeliveryAddress() {
        return this.customerDeliveryAddress;
    }

    /* renamed from: d, reason: from getter */
    public final CustomerNameRequest getCustomerName() {
        return this.customerName;
    }

    /* renamed from: e, reason: from getter */
    public final int getDeliveryFrequency() {
        return this.deliveryFrequency;
    }

    /* renamed from: f, reason: from getter */
    public final String getDeliveryFrequencyUnit() {
        return this.deliveryFrequencyUnit;
    }

    /* renamed from: g, reason: from getter */
    public final String getFulfillmentPartner() {
        return this.fulfillmentPartner;
    }

    /* renamed from: h, reason: from getter */
    public final String getFulfillmentType() {
        return this.fulfillmentType;
    }

    public int hashCode() {
        String str = this.subscriptionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (((((((((((((((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.baseSite.hashCode()) * 31) + Integer.hashCode(this.deliveryFrequency)) * 31) + this.deliveryFrequencyUnit.hashCode()) * 31) + this.fulfillmentPartner.hashCode()) * 31) + this.fulfillmentType.hashCode()) * 31) + this.storeInfo.hashCode()) * 31) + this.productInfo.hashCode()) * 31) + this.paymentInfo.hashCode()) * 31) + this.customerDeliveryAddress.hashCode()) * 31;
        CustomerNameRequest customerNameRequest = this.customerName;
        int iHashCode3 = (iHashCode2 + (customerNameRequest == null ? 0 : customerNameRequest.hashCode())) * 31;
        ContactInfoRequest contactInfoRequest = this.contactInfo;
        return ((iHashCode3 + (contactInfoRequest != null ? contactInfoRequest.hashCode() : 0)) * 31) + this.preferredTimeslot.hashCode();
    }

    /* renamed from: i, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: j, reason: from getter */
    public final PaymentInfoRequest getPaymentInfo() {
        return this.paymentInfo;
    }

    /* renamed from: k, reason: from getter */
    public final PreferredTimeslotRequest getPreferredTimeslot() {
        return this.preferredTimeslot;
    }

    /* renamed from: l, reason: from getter */
    public final ProductInfoRequest getProductInfo() {
        return this.productInfo;
    }

    /* renamed from: m, reason: from getter */
    public final SimpleStoreSummary getStoreInfo() {
        return this.storeInfo;
    }

    public String toString() {
        return "SubscriptionProductRequest(subscriptionId=" + this.subscriptionId + ", name=" + this.name + ", baseSite=" + this.baseSite + ", deliveryFrequency=" + this.deliveryFrequency + ", deliveryFrequencyUnit=" + this.deliveryFrequencyUnit + ", fulfillmentPartner=" + this.fulfillmentPartner + ", fulfillmentType=" + this.fulfillmentType + ", storeInfo=" + this.storeInfo + ", productInfo=" + this.productInfo + ", paymentInfo=" + this.paymentInfo + ", customerDeliveryAddress=" + this.customerDeliveryAddress + ", customerName=" + this.customerName + ", contactInfo=" + this.contactInfo + ", preferredTimeslot=" + this.preferredTimeslot + ')';
    }
}
