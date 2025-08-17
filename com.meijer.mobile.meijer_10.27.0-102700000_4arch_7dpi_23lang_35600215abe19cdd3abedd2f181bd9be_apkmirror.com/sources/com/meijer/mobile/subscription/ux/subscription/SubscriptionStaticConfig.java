package com.meijer.mobile.subscription.ux.subscription;

import com.meijer.mobile.weeklyad.service.flipp.BuildConfig;
import dr.ContactInfoRequest;
import dr.CustomerDeliveryAddressRequest;
import dr.CustomerNameRequest;
import dr.PaymentInfoRequest;
import dr.PreferredTimeslotRequest;
import j$.time.DayOfWeek;
import j$.time.LocalTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b\"\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b \u0010'R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b,\u0010.\u001a\u0004\b\u001e\u0010/¨\u00060"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/C;", "", "", "baseSite", "deliveryFrequencyUnit", "fulfillmentType", "fulfillmentPartner", "Ldr/c;", "customerName", "Ldr/b;", "customerDeliveryAddress", "Ldr/d;", "paymentInfo", "Ldr/e;", "preferredTimeslot", "Ldr/a;", "contactInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldr/c;Ldr/b;Ldr/d;Ldr/e;Ldr/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "e", "c", "g", "d", "f", "Ldr/c;", "()Ldr/c;", "Ldr/b;", "()Ldr/b;", "Ldr/d;", "h", "()Ldr/d;", "Ldr/e;", "i", "()Ldr/e;", "Ldr/a;", "()Ldr/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.subscription.ux.subscription.C, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class SubscriptionStaticConfig {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String baseSite;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryFrequencyUnit;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fulfillmentType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fulfillmentPartner;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final CustomerNameRequest customerName;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final CustomerDeliveryAddressRequest customerDeliveryAddress;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentInfoRequest paymentInfo;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final PreferredTimeslotRequest preferredTimeslot;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final ContactInfoRequest contactInfo;

    public SubscriptionStaticConfig() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionStaticConfig)) {
            return false;
        }
        SubscriptionStaticConfig subscriptionStaticConfig = (SubscriptionStaticConfig) other;
        return Intrinsics.e(this.baseSite, subscriptionStaticConfig.baseSite) && Intrinsics.e(this.deliveryFrequencyUnit, subscriptionStaticConfig.deliveryFrequencyUnit) && Intrinsics.e(this.fulfillmentType, subscriptionStaticConfig.fulfillmentType) && Intrinsics.e(this.fulfillmentPartner, subscriptionStaticConfig.fulfillmentPartner) && Intrinsics.e(this.customerName, subscriptionStaticConfig.customerName) && Intrinsics.e(this.customerDeliveryAddress, subscriptionStaticConfig.customerDeliveryAddress) && Intrinsics.e(this.paymentInfo, subscriptionStaticConfig.paymentInfo) && Intrinsics.e(this.preferredTimeslot, subscriptionStaticConfig.preferredTimeslot) && Intrinsics.e(this.contactInfo, subscriptionStaticConfig.contactInfo);
    }

    public int hashCode() {
        return (((((((((((((((this.baseSite.hashCode() * 31) + this.deliveryFrequencyUnit.hashCode()) * 31) + this.fulfillmentType.hashCode()) * 31) + this.fulfillmentPartner.hashCode()) * 31) + this.customerName.hashCode()) * 31) + this.customerDeliveryAddress.hashCode()) * 31) + this.paymentInfo.hashCode()) * 31) + this.preferredTimeslot.hashCode()) * 31) + this.contactInfo.hashCode();
    }

    public String toString() {
        return "SubscriptionStaticConfig(baseSite=" + this.baseSite + ", deliveryFrequencyUnit=" + this.deliveryFrequencyUnit + ", fulfillmentType=" + this.fulfillmentType + ", fulfillmentPartner=" + this.fulfillmentPartner + ", customerName=" + this.customerName + ", customerDeliveryAddress=" + this.customerDeliveryAddress + ", paymentInfo=" + this.paymentInfo + ", preferredTimeslot=" + this.preferredTimeslot + ", contactInfo=" + this.contactInfo + ')';
    }

    public SubscriptionStaticConfig(String baseSite, String deliveryFrequencyUnit, String fulfillmentType, String fulfillmentPartner, CustomerNameRequest customerName, CustomerDeliveryAddressRequest customerDeliveryAddress, PaymentInfoRequest paymentInfo, PreferredTimeslotRequest preferredTimeslot, ContactInfoRequest contactInfo) {
        Intrinsics.j(baseSite, "baseSite");
        Intrinsics.j(deliveryFrequencyUnit, "deliveryFrequencyUnit");
        Intrinsics.j(fulfillmentType, "fulfillmentType");
        Intrinsics.j(fulfillmentPartner, "fulfillmentPartner");
        Intrinsics.j(customerName, "customerName");
        Intrinsics.j(customerDeliveryAddress, "customerDeliveryAddress");
        Intrinsics.j(paymentInfo, "paymentInfo");
        Intrinsics.j(preferredTimeslot, "preferredTimeslot");
        Intrinsics.j(contactInfo, "contactInfo");
        this.baseSite = baseSite;
        this.deliveryFrequencyUnit = deliveryFrequencyUnit;
        this.fulfillmentType = fulfillmentType;
        this.fulfillmentPartner = fulfillmentPartner;
        this.customerName = customerName;
        this.customerDeliveryAddress = customerDeliveryAddress;
        this.paymentInfo = paymentInfo;
        this.preferredTimeslot = preferredTimeslot;
        this.contactInfo = contactInfo;
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
    public final String getDeliveryFrequencyUnit() {
        return this.deliveryFrequencyUnit;
    }

    /* renamed from: f, reason: from getter */
    public final String getFulfillmentPartner() {
        return this.fulfillmentPartner;
    }

    /* renamed from: g, reason: from getter */
    public final String getFulfillmentType() {
        return this.fulfillmentType;
    }

    /* renamed from: h, reason: from getter */
    public final PaymentInfoRequest getPaymentInfo() {
        return this.paymentInfo;
    }

    /* renamed from: i, reason: from getter */
    public final PreferredTimeslotRequest getPreferredTimeslot() {
        return this.preferredTimeslot;
    }

    public /* synthetic */ SubscriptionStaticConfig(String str, String str2, String str3, String str4, CustomerNameRequest customerNameRequest, CustomerDeliveryAddressRequest customerDeliveryAddressRequest, PaymentInfoRequest paymentInfoRequest, PreferredTimeslotRequest c13561e, ContactInfoRequest contactInfoRequest, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        PreferredTimeslotRequest c13561e2;
        str = (i10 & 1) != 0 ? BuildConfig.FLIPP_MERCHANT_ID : str;
        String str5 = (i10 & 2) != 0 ? "week" : str2;
        String str6 = (i10 & 4) != 0 ? "delivery" : str3;
        String str7 = (i10 & 8) != 0 ? "Shipt" : str4;
        CustomerNameRequest customerNameRequest2 = (i10 & 16) != 0 ? new CustomerNameRequest("John", "Doe") : customerNameRequest;
        CustomerDeliveryAddressRequest customerDeliveryAddressRequest2 = (i10 & 32) != 0 ? new CustomerDeliveryAddressRequest("", "", "", "320528", "", "") : customerDeliveryAddressRequest;
        PaymentInfoRequest paymentInfoRequest2 = (i10 & 64) != 0 ? new PaymentInfoRequest("", "", "218009") : paymentInfoRequest;
        if ((i10 & 128) != 0) {
            DayOfWeek dayOfWeek = DayOfWeek.FRIDAY;
            LocalTime localTimeOf = LocalTime.of(8, 0);
            Intrinsics.i(localTimeOf, "of(...)");
            LocalTime localTimeOf2 = LocalTime.of(12, 0);
            Intrinsics.i(localTimeOf2, "of(...)");
            c13561e2 = new PreferredTimeslotRequest(dayOfWeek, localTimeOf, localTimeOf2);
        } else {
            c13561e2 = c13561e;
        }
        this(str, str5, str6, str7, customerNameRequest2, customerDeliveryAddressRequest2, paymentInfoRequest2, c13561e2, (i10 & 256) != 0 ? new ContactInfoRequest("user@example.com", "123-456-7890") : contactInfoRequest);
    }
}
