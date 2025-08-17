package com.meijer.mobile.subscription.service.api.models;

import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.weeklyad.service.flipp.BuildConfig;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b \b\u0081\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0098\u0001\u0010\u001a\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0011\u001a\u00020\u00102\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0003\u0010\u0017\u001a\u00020\u0016HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b$\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b-\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b.\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b.\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b&\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b6\u00108\u001a\u0004\b(\u00109R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b+\u0010<R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b3\u0010=\u001a\u0004\b'\u0010>R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b0\u0010?\u001a\u0004\b:\u0010@¨\u0006A"}, d2 = {"Lcom/meijer/mobile/subscription/service/api/models/SubscriptionProductRequestJson;", "", "", "name", "baseSite", "", "deliveryFrequency", "deliveryFrequencyUnit", "fulfillmentPartner", "fulfillmentType", "Lcom/meijer/mobile/subscription/service/api/models/StoreInfoRequestJson;", "storeInfo", "Lcom/meijer/mobile/subscription/service/api/models/ProductInfoRequestJson;", "productInfo", "Lcom/meijer/mobile/subscription/service/api/models/PaymentInfoRequestJson;", "paymentInfo", "Lcom/meijer/mobile/subscription/service/api/models/CustomerDeliveryAddressRequestJson;", "customerDeliveryAddress", "Lcom/meijer/mobile/subscription/service/api/models/CustomerNameRequestJson;", "customerName", "Lcom/meijer/mobile/subscription/service/api/models/ContactInfoRequestJson;", "contactInfo", "Lcom/meijer/mobile/subscription/service/api/models/PreferredTimeslotRequestJson;", "preferredTimeslot", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/subscription/service/api/models/StoreInfoRequestJson;Lcom/meijer/mobile/subscription/service/api/models/ProductInfoRequestJson;Lcom/meijer/mobile/subscription/service/api/models/PaymentInfoRequestJson;Lcom/meijer/mobile/subscription/service/api/models/CustomerDeliveryAddressRequestJson;Lcom/meijer/mobile/subscription/service/api/models/CustomerNameRequestJson;Lcom/meijer/mobile/subscription/service/api/models/ContactInfoRequestJson;Lcom/meijer/mobile/subscription/service/api/models/PreferredTimeslotRequestJson;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/subscription/service/api/models/StoreInfoRequestJson;Lcom/meijer/mobile/subscription/service/api/models/ProductInfoRequestJson;Lcom/meijer/mobile/subscription/service/api/models/PaymentInfoRequestJson;Lcom/meijer/mobile/subscription/service/api/models/CustomerDeliveryAddressRequestJson;Lcom/meijer/mobile/subscription/service/api/models/CustomerNameRequestJson;Lcom/meijer/mobile/subscription/service/api/models/ContactInfoRequestJson;Lcom/meijer/mobile/subscription/service/api/models/PreferredTimeslotRequestJson;)Lcom/meijer/mobile/subscription/service/api/models/SubscriptionProductRequestJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "i", "b", "c", "I", "e", "d", "f", "g", "h", "Lcom/meijer/mobile/subscription/service/api/models/StoreInfoRequestJson;", "m", "()Lcom/meijer/mobile/subscription/service/api/models/StoreInfoRequestJson;", "Lcom/meijer/mobile/subscription/service/api/models/ProductInfoRequestJson;", "l", "()Lcom/meijer/mobile/subscription/service/api/models/ProductInfoRequestJson;", "Lcom/meijer/mobile/subscription/service/api/models/PaymentInfoRequestJson;", "j", "()Lcom/meijer/mobile/subscription/service/api/models/PaymentInfoRequestJson;", "Lcom/meijer/mobile/subscription/service/api/models/CustomerDeliveryAddressRequestJson;", "()Lcom/meijer/mobile/subscription/service/api/models/CustomerDeliveryAddressRequestJson;", "k", "Lcom/meijer/mobile/subscription/service/api/models/CustomerNameRequestJson;", "()Lcom/meijer/mobile/subscription/service/api/models/CustomerNameRequestJson;", "Lcom/meijer/mobile/subscription/service/api/models/ContactInfoRequestJson;", "()Lcom/meijer/mobile/subscription/service/api/models/ContactInfoRequestJson;", "Lcom/meijer/mobile/subscription/service/api/models/PreferredTimeslotRequestJson;", "()Lcom/meijer/mobile/subscription/service/api/models/PreferredTimeslotRequestJson;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SubscriptionProductRequestJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String baseSite;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int deliveryFrequency;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryFrequencyUnit;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fulfillmentPartner;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fulfillmentType;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final StoreInfoRequestJson storeInfo;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductInfoRequestJson productInfo;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentInfoRequestJson paymentInfo;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final CustomerDeliveryAddressRequestJson customerDeliveryAddress;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final CustomerNameRequestJson customerName;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final ContactInfoRequestJson contactInfo;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final PreferredTimeslotRequestJson preferredTimeslot;

    public SubscriptionProductRequestJson(@g(name = "name") String str, @g(name = "baseSite") String baseSite, @g(name = "deliveryFrequency") int i10, @g(name = "deliveryFrequencyUnit") String deliveryFrequencyUnit, @g(name = "fulfillmentPartner") String fulfillmentPartner, @g(name = "fulfillmentType") String fulfillmentType, @g(name = "storeInfo") StoreInfoRequestJson storeInfo, @g(name = "productInfo") ProductInfoRequestJson productInfo, @g(name = "paymentInfo") PaymentInfoRequestJson paymentInfo, @g(name = "customerDeliveryAddress") CustomerDeliveryAddressRequestJson customerDeliveryAddress, @g(name = "customerName") CustomerNameRequestJson customerNameRequestJson, @g(name = "contactInfo") ContactInfoRequestJson contactInfoRequestJson, @g(name = "preferredTimeslot") PreferredTimeslotRequestJson preferredTimeslot) {
        Intrinsics.j(baseSite, "baseSite");
        Intrinsics.j(deliveryFrequencyUnit, "deliveryFrequencyUnit");
        Intrinsics.j(fulfillmentPartner, "fulfillmentPartner");
        Intrinsics.j(fulfillmentType, "fulfillmentType");
        Intrinsics.j(storeInfo, "storeInfo");
        Intrinsics.j(productInfo, "productInfo");
        Intrinsics.j(paymentInfo, "paymentInfo");
        Intrinsics.j(customerDeliveryAddress, "customerDeliveryAddress");
        Intrinsics.j(preferredTimeslot, "preferredTimeslot");
        this.name = str;
        this.baseSite = baseSite;
        this.deliveryFrequency = i10;
        this.deliveryFrequencyUnit = deliveryFrequencyUnit;
        this.fulfillmentPartner = fulfillmentPartner;
        this.fulfillmentType = fulfillmentType;
        this.storeInfo = storeInfo;
        this.productInfo = productInfo;
        this.paymentInfo = paymentInfo;
        this.customerDeliveryAddress = customerDeliveryAddress;
        this.customerName = customerNameRequestJson;
        this.contactInfo = contactInfoRequestJson;
        this.preferredTimeslot = preferredTimeslot;
    }

    public final SubscriptionProductRequestJson copy(@g(name = "name") String name, @g(name = "baseSite") String baseSite, @g(name = "deliveryFrequency") int deliveryFrequency, @g(name = "deliveryFrequencyUnit") String deliveryFrequencyUnit, @g(name = "fulfillmentPartner") String fulfillmentPartner, @g(name = "fulfillmentType") String fulfillmentType, @g(name = "storeInfo") StoreInfoRequestJson storeInfo, @g(name = "productInfo") ProductInfoRequestJson productInfo, @g(name = "paymentInfo") PaymentInfoRequestJson paymentInfo, @g(name = "customerDeliveryAddress") CustomerDeliveryAddressRequestJson customerDeliveryAddress, @g(name = "customerName") CustomerNameRequestJson customerName, @g(name = "contactInfo") ContactInfoRequestJson contactInfo, @g(name = "preferredTimeslot") PreferredTimeslotRequestJson preferredTimeslot) {
        Intrinsics.j(baseSite, "baseSite");
        Intrinsics.j(deliveryFrequencyUnit, "deliveryFrequencyUnit");
        Intrinsics.j(fulfillmentPartner, "fulfillmentPartner");
        Intrinsics.j(fulfillmentType, "fulfillmentType");
        Intrinsics.j(storeInfo, "storeInfo");
        Intrinsics.j(productInfo, "productInfo");
        Intrinsics.j(paymentInfo, "paymentInfo");
        Intrinsics.j(customerDeliveryAddress, "customerDeliveryAddress");
        Intrinsics.j(preferredTimeslot, "preferredTimeslot");
        return new SubscriptionProductRequestJson(name, baseSite, deliveryFrequency, deliveryFrequencyUnit, fulfillmentPartner, fulfillmentType, storeInfo, productInfo, paymentInfo, customerDeliveryAddress, customerName, contactInfo, preferredTimeslot);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionProductRequestJson)) {
            return false;
        }
        SubscriptionProductRequestJson subscriptionProductRequestJson = (SubscriptionProductRequestJson) other;
        return Intrinsics.e(this.name, subscriptionProductRequestJson.name) && Intrinsics.e(this.baseSite, subscriptionProductRequestJson.baseSite) && this.deliveryFrequency == subscriptionProductRequestJson.deliveryFrequency && Intrinsics.e(this.deliveryFrequencyUnit, subscriptionProductRequestJson.deliveryFrequencyUnit) && Intrinsics.e(this.fulfillmentPartner, subscriptionProductRequestJson.fulfillmentPartner) && Intrinsics.e(this.fulfillmentType, subscriptionProductRequestJson.fulfillmentType) && Intrinsics.e(this.storeInfo, subscriptionProductRequestJson.storeInfo) && Intrinsics.e(this.productInfo, subscriptionProductRequestJson.productInfo) && Intrinsics.e(this.paymentInfo, subscriptionProductRequestJson.paymentInfo) && Intrinsics.e(this.customerDeliveryAddress, subscriptionProductRequestJson.customerDeliveryAddress) && Intrinsics.e(this.customerName, subscriptionProductRequestJson.customerName) && Intrinsics.e(this.contactInfo, subscriptionProductRequestJson.contactInfo) && Intrinsics.e(this.preferredTimeslot, subscriptionProductRequestJson.preferredTimeslot);
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (((((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.baseSite.hashCode()) * 31) + Integer.hashCode(this.deliveryFrequency)) * 31) + this.deliveryFrequencyUnit.hashCode()) * 31) + this.fulfillmentPartner.hashCode()) * 31) + this.fulfillmentType.hashCode()) * 31) + this.storeInfo.hashCode()) * 31) + this.productInfo.hashCode()) * 31) + this.paymentInfo.hashCode()) * 31) + this.customerDeliveryAddress.hashCode()) * 31;
        CustomerNameRequestJson customerNameRequestJson = this.customerName;
        int iHashCode2 = (iHashCode + (customerNameRequestJson == null ? 0 : customerNameRequestJson.hashCode())) * 31;
        ContactInfoRequestJson contactInfoRequestJson = this.contactInfo;
        return ((iHashCode2 + (contactInfoRequestJson != null ? contactInfoRequestJson.hashCode() : 0)) * 31) + this.preferredTimeslot.hashCode();
    }

    public String toString() {
        return "SubscriptionProductRequestJson(name=" + this.name + ", baseSite=" + this.baseSite + ", deliveryFrequency=" + this.deliveryFrequency + ", deliveryFrequencyUnit=" + this.deliveryFrequencyUnit + ", fulfillmentPartner=" + this.fulfillmentPartner + ", fulfillmentType=" + this.fulfillmentType + ", storeInfo=" + this.storeInfo + ", productInfo=" + this.productInfo + ", paymentInfo=" + this.paymentInfo + ", customerDeliveryAddress=" + this.customerDeliveryAddress + ", customerName=" + this.customerName + ", contactInfo=" + this.contactInfo + ", preferredTimeslot=" + this.preferredTimeslot + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getBaseSite() {
        return this.baseSite;
    }

    /* renamed from: b, reason: from getter */
    public final ContactInfoRequestJson getContactInfo() {
        return this.contactInfo;
    }

    /* renamed from: c, reason: from getter */
    public final CustomerDeliveryAddressRequestJson getCustomerDeliveryAddress() {
        return this.customerDeliveryAddress;
    }

    /* renamed from: d, reason: from getter */
    public final CustomerNameRequestJson getCustomerName() {
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

    /* renamed from: i, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: j, reason: from getter */
    public final PaymentInfoRequestJson getPaymentInfo() {
        return this.paymentInfo;
    }

    /* renamed from: k, reason: from getter */
    public final PreferredTimeslotRequestJson getPreferredTimeslot() {
        return this.preferredTimeslot;
    }

    /* renamed from: l, reason: from getter */
    public final ProductInfoRequestJson getProductInfo() {
        return this.productInfo;
    }

    /* renamed from: m, reason: from getter */
    public final StoreInfoRequestJson getStoreInfo() {
        return this.storeInfo;
    }

    public /* synthetic */ SubscriptionProductRequestJson(String str, String str2, int i10, String str3, String str4, String str5, StoreInfoRequestJson storeInfoRequestJson, ProductInfoRequestJson productInfoRequestJson, PaymentInfoRequestJson paymentInfoRequestJson, CustomerDeliveryAddressRequestJson customerDeliveryAddressRequestJson, CustomerNameRequestJson customerNameRequestJson, ContactInfoRequestJson contactInfoRequestJson, PreferredTimeslotRequestJson preferredTimeslotRequestJson, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? BuildConfig.FLIPP_MERCHANT_ID : str2, i10, (i11 & 8) != 0 ? "week" : str3, (i11 & 16) != 0 ? "Shipt" : str4, (i11 & 32) != 0 ? "delivery" : str5, storeInfoRequestJson, productInfoRequestJson, paymentInfoRequestJson, customerDeliveryAddressRequestJson, (i11 & 1024) != 0 ? null : customerNameRequestJson, (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? null : contactInfoRequestJson, preferredTimeslotRequestJson);
    }
}
