package com.meijer.mobile.meijer.activity.checkout.review;

import gk.BillingAddress;
import gk.PaymentOption;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0013BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/b;", "", "", "addressLine1", "addressLine2", "city", "state", "zipCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getAddressLine1", "b", "getAddressLine2", "c", "getCity", "d", "getState", "e", "getZipCode", "f", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.review.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class AddressFormDecorator {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressLine1;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressLine2;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String city;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String state;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zipCode;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/b$a;", "", "<init>", "()V", "Lgk/f;", "paymentOption", "Lcom/meijer/mobile/meijer/activity/checkout/review/b;", "a", "(Lgk/f;)Lcom/meijer/mobile/meijer/activity/checkout/review/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AddressFormDecorator a(PaymentOption paymentOption) {
            BillingAddress billingAddress;
            BillingAddress billingAddress2;
            BillingAddress billingAddress3;
            BillingAddress billingAddress4;
            BillingAddress billingAddress5;
            String postalCode = null;
            String street1 = (paymentOption == null || (billingAddress5 = paymentOption.getBillingAddress()) == null) ? null : billingAddress5.getStreet1();
            String street2 = (paymentOption == null || (billingAddress4 = paymentOption.getBillingAddress()) == null) ? null : billingAddress4.getStreet2();
            String city = (paymentOption == null || (billingAddress3 = paymentOption.getBillingAddress()) == null) ? null : billingAddress3.getCity();
            String state = (paymentOption == null || (billingAddress2 = paymentOption.getBillingAddress()) == null) ? null : billingAddress2.getState();
            if (paymentOption != null && (billingAddress = paymentOption.getBillingAddress()) != null) {
                postalCode = billingAddress.getPostalCode();
            }
            return new AddressFormDecorator(street1, street2, city, state, postalCode);
        }
    }

    public AddressFormDecorator() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressFormDecorator)) {
            return false;
        }
        AddressFormDecorator addressFormDecorator = (AddressFormDecorator) other;
        return Intrinsics.e(this.addressLine1, addressFormDecorator.addressLine1) && Intrinsics.e(this.addressLine2, addressFormDecorator.addressLine2) && Intrinsics.e(this.city, addressFormDecorator.city) && Intrinsics.e(this.state, addressFormDecorator.state) && Intrinsics.e(this.zipCode, addressFormDecorator.zipCode);
    }

    public int hashCode() {
        String str = this.addressLine1;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.addressLine2;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.city;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.state;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.zipCode;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "AddressFormDecorator(addressLine1=" + this.addressLine1 + ", addressLine2=" + this.addressLine2 + ", city=" + this.city + ", state=" + this.state + ", zipCode=" + this.zipCode + ')';
    }

    public AddressFormDecorator(String str, String str2, String str3, String str4, String str5) {
        this.addressLine1 = str;
        this.addressLine2 = str2;
        this.city = str3;
        this.state = str4;
        this.zipCode = str5;
    }

    public /* synthetic */ AddressFormDecorator(String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5);
    }
}
