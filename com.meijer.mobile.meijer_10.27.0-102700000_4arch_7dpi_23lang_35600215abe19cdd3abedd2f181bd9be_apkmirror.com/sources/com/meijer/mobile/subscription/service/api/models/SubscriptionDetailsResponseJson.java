package com.meijer.mobile.subscription.service.api.models;

import com.meijer.mobile.weeklyad.service.flipp.BuildConfig;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b3\b\u0081\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!JØ\u0001\u0010\"\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\u00022\b\b\u0003\u0010\u000f\u001a\u00020\u00022\b\b\u0003\u0010\u0010\u001a\u00020\u00022\b\b\u0003\u0010\u0012\u001a\u00020\u00112\b\b\u0003\u0010\u0013\u001a\u00020\u00022\b\b\u0003\u0010\u0014\u001a\u00020\u00022\b\b\u0003\u0010\u0016\u001a\u00020\u00152\b\b\u0003\u0010\u0018\u001a\u00020\u00172\b\b\u0003\u0010\u001a\u001a\u00020\u00192\b\b\u0003\u0010\u001b\u001a\u00020\u00022\b\b\u0003\u0010\u001c\u001a\u00020\u00112\b\b\u0003\u0010\u001d\u001a\u00020\u00112\b\b\u0003\u0010\u001f\u001a\u00020\u001eHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010%R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010%R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b+\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b.\u00103R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b0\u00106R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b1\u00109R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b/\u0010:\u001a\u0004\b4\u0010'R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010,\u001a\u0004\b7\u0010%R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010,\u001a\u0004\b;\u0010%R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b<\u0010%R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010,\u001a\u0004\b=\u0010%R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010,\u001a\u0004\bA\u0010%R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bB\u0010ER\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bC\u0010HR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bF\u0010KR\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bL\u0010,\u001a\u0004\bI\u0010%R\u0017\u0010\u001c\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b?\u0010>\u001a\u0004\bM\u0010@R\u0017\u0010\u001d\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bM\u0010>\u001a\u0004\bN\u0010@R\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bL\u0010P¨\u0006Q"}, d2 = {"Lcom/meijer/mobile/subscription/service/api/models/SubscriptionDetailsResponseJson;", "", "", PreferencesHelper.PREF_ID, "externalShopperId", "baseSite", "Lcom/meijer/mobile/subscription/service/api/models/ContactInfoResponseJson;", "contactInfo", "Lcom/meijer/mobile/subscription/service/api/models/CustomerDeliveryAddressResponseJson;", "customerDeliveryAddress", "Lcom/meijer/mobile/subscription/service/api/models/CustomerNameResponseJson;", "customerName", "", "deliveryFrequency", "deliveryFrequencyUnit", "fulfillmentPartner", "fulfillmentType", "", "isActive", "name", "nextOrderDate", "Lcom/meijer/mobile/subscription/service/api/models/PaymentInfoResponseJson;", "paymentInfo", "Lcom/meijer/mobile/subscription/service/api/models/PreferredTimeslotResponseJson;", "preferredTimeslot", "Lcom/meijer/mobile/subscription/service/api/models/ProductInfoResponseJson;", "productInfo", "skipOrderDate", "isSkippable", "isSkipped", "Lcom/meijer/mobile/subscription/service/api/models/StoreInfoResponseJson;", "storeInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/subscription/service/api/models/ContactInfoResponseJson;Lcom/meijer/mobile/subscription/service/api/models/CustomerDeliveryAddressResponseJson;Lcom/meijer/mobile/subscription/service/api/models/CustomerNameResponseJson;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/subscription/service/api/models/PaymentInfoResponseJson;Lcom/meijer/mobile/subscription/service/api/models/PreferredTimeslotResponseJson;Lcom/meijer/mobile/subscription/service/api/models/ProductInfoResponseJson;Ljava/lang/String;ZZLcom/meijer/mobile/subscription/service/api/models/StoreInfoResponseJson;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/subscription/service/api/models/ContactInfoResponseJson;Lcom/meijer/mobile/subscription/service/api/models/CustomerDeliveryAddressResponseJson;Lcom/meijer/mobile/subscription/service/api/models/CustomerNameResponseJson;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/subscription/service/api/models/PaymentInfoResponseJson;Lcom/meijer/mobile/subscription/service/api/models/PreferredTimeslotResponseJson;Lcom/meijer/mobile/subscription/service/api/models/ProductInfoResponseJson;Ljava/lang/String;ZZLcom/meijer/mobile/subscription/service/api/models/StoreInfoResponseJson;)Lcom/meijer/mobile/subscription/service/api/models/SubscriptionDetailsResponseJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "j", "b", "g", "c", "d", "Lcom/meijer/mobile/subscription/service/api/models/ContactInfoResponseJson;", "()Lcom/meijer/mobile/subscription/service/api/models/ContactInfoResponseJson;", "e", "Lcom/meijer/mobile/subscription/service/api/models/CustomerDeliveryAddressResponseJson;", "()Lcom/meijer/mobile/subscription/service/api/models/CustomerDeliveryAddressResponseJson;", "f", "Lcom/meijer/mobile/subscription/service/api/models/CustomerNameResponseJson;", "()Lcom/meijer/mobile/subscription/service/api/models/CustomerNameResponseJson;", "I", "h", "i", "k", "Z", "r", "()Z", "l", "m", "n", "Lcom/meijer/mobile/subscription/service/api/models/PaymentInfoResponseJson;", "()Lcom/meijer/mobile/subscription/service/api/models/PaymentInfoResponseJson;", "o", "Lcom/meijer/mobile/subscription/service/api/models/PreferredTimeslotResponseJson;", "()Lcom/meijer/mobile/subscription/service/api/models/PreferredTimeslotResponseJson;", "p", "Lcom/meijer/mobile/subscription/service/api/models/ProductInfoResponseJson;", "()Lcom/meijer/mobile/subscription/service/api/models/ProductInfoResponseJson;", "q", "s", "t", "Lcom/meijer/mobile/subscription/service/api/models/StoreInfoResponseJson;", "()Lcom/meijer/mobile/subscription/service/api/models/StoreInfoResponseJson;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SubscriptionDetailsResponseJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String externalShopperId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String baseSite;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final ContactInfoResponseJson contactInfo;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final CustomerDeliveryAddressResponseJson customerDeliveryAddress;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final CustomerNameResponseJson customerName;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int deliveryFrequency;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryFrequencyUnit;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fulfillmentPartner;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fulfillmentType;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isActive;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nextOrderDate;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentInfoResponseJson paymentInfo;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final PreferredTimeslotResponseJson preferredTimeslot;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductInfoResponseJson productInfo;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String skipOrderDate;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSkippable;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSkipped;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final StoreInfoResponseJson storeInfo;

    public SubscriptionDetailsResponseJson(@g(name = PreferencesHelper.PREF_ID) String id2, @g(name = "accountId") String externalShopperId, @g(name = "baseSite") String baseSite, @g(name = "contactInfo") ContactInfoResponseJson contactInfo, @g(name = "customerDeliveryAddress") CustomerDeliveryAddressResponseJson customerDeliveryAddress, @g(name = "customerName") CustomerNameResponseJson customerName, @g(name = "deliveryFrequency") int i10, @g(name = "deliveryFrequencyUnit") String deliveryFrequencyUnit, @g(name = "fulfillmentPartner") String fulfillmentPartner, @g(name = "fulfillmentType") String fulfillmentType, @g(name = "isActive") boolean z10, @g(name = "name") String name, @g(name = "nextOrderDate") String nextOrderDate, @g(name = "paymentInfo") PaymentInfoResponseJson paymentInfo, @g(name = "preferredTimeslot") PreferredTimeslotResponseJson preferredTimeslot, @g(name = "productInfo") ProductInfoResponseJson productInfo, @g(name = "skipOrderDate") String skipOrderDate, @g(name = "skippable") boolean z11, @g(name = "skipped") boolean z12, @g(name = "storeInfo") StoreInfoResponseJson storeInfo) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(externalShopperId, "externalShopperId");
        Intrinsics.j(baseSite, "baseSite");
        Intrinsics.j(contactInfo, "contactInfo");
        Intrinsics.j(customerDeliveryAddress, "customerDeliveryAddress");
        Intrinsics.j(customerName, "customerName");
        Intrinsics.j(deliveryFrequencyUnit, "deliveryFrequencyUnit");
        Intrinsics.j(fulfillmentPartner, "fulfillmentPartner");
        Intrinsics.j(fulfillmentType, "fulfillmentType");
        Intrinsics.j(name, "name");
        Intrinsics.j(nextOrderDate, "nextOrderDate");
        Intrinsics.j(paymentInfo, "paymentInfo");
        Intrinsics.j(preferredTimeslot, "preferredTimeslot");
        Intrinsics.j(productInfo, "productInfo");
        Intrinsics.j(skipOrderDate, "skipOrderDate");
        Intrinsics.j(storeInfo, "storeInfo");
        this.id = id2;
        this.externalShopperId = externalShopperId;
        this.baseSite = baseSite;
        this.contactInfo = contactInfo;
        this.customerDeliveryAddress = customerDeliveryAddress;
        this.customerName = customerName;
        this.deliveryFrequency = i10;
        this.deliveryFrequencyUnit = deliveryFrequencyUnit;
        this.fulfillmentPartner = fulfillmentPartner;
        this.fulfillmentType = fulfillmentType;
        this.isActive = z10;
        this.name = name;
        this.nextOrderDate = nextOrderDate;
        this.paymentInfo = paymentInfo;
        this.preferredTimeslot = preferredTimeslot;
        this.productInfo = productInfo;
        this.skipOrderDate = skipOrderDate;
        this.isSkippable = z11;
        this.isSkipped = z12;
        this.storeInfo = storeInfo;
    }

    public final SubscriptionDetailsResponseJson copy(@g(name = PreferencesHelper.PREF_ID) String id2, @g(name = "accountId") String externalShopperId, @g(name = "baseSite") String baseSite, @g(name = "contactInfo") ContactInfoResponseJson contactInfo, @g(name = "customerDeliveryAddress") CustomerDeliveryAddressResponseJson customerDeliveryAddress, @g(name = "customerName") CustomerNameResponseJson customerName, @g(name = "deliveryFrequency") int deliveryFrequency, @g(name = "deliveryFrequencyUnit") String deliveryFrequencyUnit, @g(name = "fulfillmentPartner") String fulfillmentPartner, @g(name = "fulfillmentType") String fulfillmentType, @g(name = "isActive") boolean isActive, @g(name = "name") String name, @g(name = "nextOrderDate") String nextOrderDate, @g(name = "paymentInfo") PaymentInfoResponseJson paymentInfo, @g(name = "preferredTimeslot") PreferredTimeslotResponseJson preferredTimeslot, @g(name = "productInfo") ProductInfoResponseJson productInfo, @g(name = "skipOrderDate") String skipOrderDate, @g(name = "skippable") boolean isSkippable, @g(name = "skipped") boolean isSkipped, @g(name = "storeInfo") StoreInfoResponseJson storeInfo) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(externalShopperId, "externalShopperId");
        Intrinsics.j(baseSite, "baseSite");
        Intrinsics.j(contactInfo, "contactInfo");
        Intrinsics.j(customerDeliveryAddress, "customerDeliveryAddress");
        Intrinsics.j(customerName, "customerName");
        Intrinsics.j(deliveryFrequencyUnit, "deliveryFrequencyUnit");
        Intrinsics.j(fulfillmentPartner, "fulfillmentPartner");
        Intrinsics.j(fulfillmentType, "fulfillmentType");
        Intrinsics.j(name, "name");
        Intrinsics.j(nextOrderDate, "nextOrderDate");
        Intrinsics.j(paymentInfo, "paymentInfo");
        Intrinsics.j(preferredTimeslot, "preferredTimeslot");
        Intrinsics.j(productInfo, "productInfo");
        Intrinsics.j(skipOrderDate, "skipOrderDate");
        Intrinsics.j(storeInfo, "storeInfo");
        return new SubscriptionDetailsResponseJson(id2, externalShopperId, baseSite, contactInfo, customerDeliveryAddress, customerName, deliveryFrequency, deliveryFrequencyUnit, fulfillmentPartner, fulfillmentType, isActive, name, nextOrderDate, paymentInfo, preferredTimeslot, productInfo, skipOrderDate, isSkippable, isSkipped, storeInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionDetailsResponseJson)) {
            return false;
        }
        SubscriptionDetailsResponseJson subscriptionDetailsResponseJson = (SubscriptionDetailsResponseJson) other;
        return Intrinsics.e(this.id, subscriptionDetailsResponseJson.id) && Intrinsics.e(this.externalShopperId, subscriptionDetailsResponseJson.externalShopperId) && Intrinsics.e(this.baseSite, subscriptionDetailsResponseJson.baseSite) && Intrinsics.e(this.contactInfo, subscriptionDetailsResponseJson.contactInfo) && Intrinsics.e(this.customerDeliveryAddress, subscriptionDetailsResponseJson.customerDeliveryAddress) && Intrinsics.e(this.customerName, subscriptionDetailsResponseJson.customerName) && this.deliveryFrequency == subscriptionDetailsResponseJson.deliveryFrequency && Intrinsics.e(this.deliveryFrequencyUnit, subscriptionDetailsResponseJson.deliveryFrequencyUnit) && Intrinsics.e(this.fulfillmentPartner, subscriptionDetailsResponseJson.fulfillmentPartner) && Intrinsics.e(this.fulfillmentType, subscriptionDetailsResponseJson.fulfillmentType) && this.isActive == subscriptionDetailsResponseJson.isActive && Intrinsics.e(this.name, subscriptionDetailsResponseJson.name) && Intrinsics.e(this.nextOrderDate, subscriptionDetailsResponseJson.nextOrderDate) && Intrinsics.e(this.paymentInfo, subscriptionDetailsResponseJson.paymentInfo) && Intrinsics.e(this.preferredTimeslot, subscriptionDetailsResponseJson.preferredTimeslot) && Intrinsics.e(this.productInfo, subscriptionDetailsResponseJson.productInfo) && Intrinsics.e(this.skipOrderDate, subscriptionDetailsResponseJson.skipOrderDate) && this.isSkippable == subscriptionDetailsResponseJson.isSkippable && this.isSkipped == subscriptionDetailsResponseJson.isSkipped && Intrinsics.e(this.storeInfo, subscriptionDetailsResponseJson.storeInfo);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((this.id.hashCode() * 31) + this.externalShopperId.hashCode()) * 31) + this.baseSite.hashCode()) * 31) + this.contactInfo.hashCode()) * 31) + this.customerDeliveryAddress.hashCode()) * 31) + this.customerName.hashCode()) * 31) + Integer.hashCode(this.deliveryFrequency)) * 31) + this.deliveryFrequencyUnit.hashCode()) * 31) + this.fulfillmentPartner.hashCode()) * 31) + this.fulfillmentType.hashCode()) * 31) + Boolean.hashCode(this.isActive)) * 31) + this.name.hashCode()) * 31) + this.nextOrderDate.hashCode()) * 31) + this.paymentInfo.hashCode()) * 31) + this.preferredTimeslot.hashCode()) * 31) + this.productInfo.hashCode()) * 31) + this.skipOrderDate.hashCode()) * 31) + Boolean.hashCode(this.isSkippable)) * 31) + Boolean.hashCode(this.isSkipped)) * 31) + this.storeInfo.hashCode();
    }

    public String toString() {
        return "SubscriptionDetailsResponseJson(id=" + this.id + ", externalShopperId=" + this.externalShopperId + ", baseSite=" + this.baseSite + ", contactInfo=" + this.contactInfo + ", customerDeliveryAddress=" + this.customerDeliveryAddress + ", customerName=" + this.customerName + ", deliveryFrequency=" + this.deliveryFrequency + ", deliveryFrequencyUnit=" + this.deliveryFrequencyUnit + ", fulfillmentPartner=" + this.fulfillmentPartner + ", fulfillmentType=" + this.fulfillmentType + ", isActive=" + this.isActive + ", name=" + this.name + ", nextOrderDate=" + this.nextOrderDate + ", paymentInfo=" + this.paymentInfo + ", preferredTimeslot=" + this.preferredTimeslot + ", productInfo=" + this.productInfo + ", skipOrderDate=" + this.skipOrderDate + ", isSkippable=" + this.isSkippable + ", isSkipped=" + this.isSkipped + ", storeInfo=" + this.storeInfo + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getBaseSite() {
        return this.baseSite;
    }

    /* renamed from: b, reason: from getter */
    public final ContactInfoResponseJson getContactInfo() {
        return this.contactInfo;
    }

    /* renamed from: c, reason: from getter */
    public final CustomerDeliveryAddressResponseJson getCustomerDeliveryAddress() {
        return this.customerDeliveryAddress;
    }

    /* renamed from: d, reason: from getter */
    public final CustomerNameResponseJson getCustomerName() {
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
    public final String getExternalShopperId() {
        return this.externalShopperId;
    }

    /* renamed from: h, reason: from getter */
    public final String getFulfillmentPartner() {
        return this.fulfillmentPartner;
    }

    /* renamed from: i, reason: from getter */
    public final String getFulfillmentType() {
        return this.fulfillmentType;
    }

    /* renamed from: j, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: k, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: l, reason: from getter */
    public final String getNextOrderDate() {
        return this.nextOrderDate;
    }

    /* renamed from: m, reason: from getter */
    public final PaymentInfoResponseJson getPaymentInfo() {
        return this.paymentInfo;
    }

    /* renamed from: n, reason: from getter */
    public final PreferredTimeslotResponseJson getPreferredTimeslot() {
        return this.preferredTimeslot;
    }

    /* renamed from: o, reason: from getter */
    public final ProductInfoResponseJson getProductInfo() {
        return this.productInfo;
    }

    /* renamed from: p, reason: from getter */
    public final String getSkipOrderDate() {
        return this.skipOrderDate;
    }

    /* renamed from: q, reason: from getter */
    public final StoreInfoResponseJson getStoreInfo() {
        return this.storeInfo;
    }

    /* renamed from: r, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* renamed from: s, reason: from getter */
    public final boolean getIsSkippable() {
        return this.isSkippable;
    }

    /* renamed from: t, reason: from getter */
    public final boolean getIsSkipped() {
        return this.isSkipped;
    }

    public /* synthetic */ SubscriptionDetailsResponseJson(String str, String str2, String str3, ContactInfoResponseJson contactInfoResponseJson, CustomerDeliveryAddressResponseJson customerDeliveryAddressResponseJson, CustomerNameResponseJson customerNameResponseJson, int i10, String str4, String str5, String str6, boolean z10, String str7, String str8, PaymentInfoResponseJson paymentInfoResponseJson, PreferredTimeslotResponseJson preferredTimeslotResponseJson, ProductInfoResponseJson productInfoResponseJson, String str9, boolean z11, boolean z12, StoreInfoResponseJson storeInfoResponseJson, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? BuildConfig.FLIPP_MERCHANT_ID : str3, contactInfoResponseJson, customerDeliveryAddressResponseJson, customerNameResponseJson, i10, (i11 & 128) != 0 ? "week" : str4, (i11 & 256) != 0 ? "Shipt" : str5, (i11 & 512) != 0 ? "delivery" : str6, z10, str7, str8, paymentInfoResponseJson, preferredTimeslotResponseJson, productInfoResponseJson, str9, z11, z12, storeInfoResponseJson);
    }
}
