package com.meijer.mobile.meijer.activity.checkout.review;

import Ik.Validation;
import com.google.android.libraries.places.api.model.PlaceTypes;
import hk.BillingAddress;
import hk.CardHolderName;
import hk.PaymentOption;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import tk.C17269a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0014BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0014\u0010\rR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001c\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/a;", "", "", "name", "addressLine1", "addressLine2", "addressCityStateZip", "", "error", "shippingZipCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "c", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "f", "g", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.review.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class AddressDecorator {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressLine1;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressLine2;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressCityStateZip;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer error;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String shippingZipCode;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004¢\u0006\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/a$a;", "", "<init>", "()V", "LIk/b;", "Lhk/f;", "validation", "Lcom/meijer/mobile/meijer/activity/checkout/review/a;", "b", "(LIk/b;)Lcom/meijer/mobile/meijer/activity/checkout/review/a;", "Ldi/c;", PlaceTypes.ADDRESS, "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.meijer.mobile.meijer.activity.checkout.review.AddressDecorator a(Ik.Validation<di.CustomerAddress> r13) {
            /*
                r12 = this;
                java.lang.String r0 = "address"
                kotlin.jvm.internal.Intrinsics.j(r13, r0)
                java.lang.Object r0 = r13.e()
                di.c r0 = (di.CustomerAddress) r0
                r1 = 0
                if (r0 == 0) goto L34
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r0.getFirstName()
                r2.append(r3)
                r3 = 32
                r2.append(r3)
                java.lang.String r0 = r0.getLastName()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                if (r0 == 0) goto L34
                boolean r2 = kotlin.text.StringsKt.s0(r0)
                if (r2 != 0) goto L34
                r4 = r0
                goto L35
            L34:
                r4 = r1
            L35:
                java.lang.Object r0 = r13.e()
                di.c r0 = (di.CustomerAddress) r0
                if (r0 == 0) goto L4d
                tk.a r2 = tk.C17269a.f163094a
                java.lang.String r3 = r0.getLine1()
                java.lang.String r0 = r0.getLine2()
                java.lang.String r0 = r2.b(r3, r0)
                r5 = r0
                goto L4e
            L4d:
                r5 = r1
            L4e:
                java.lang.Object r0 = r13.e()
                di.c r0 = (di.CustomerAddress) r0
                if (r0 == 0) goto L6e
                tk.a r2 = tk.C17269a.f163094a
                java.lang.String r3 = r0.getTown()
                di.f r6 = r0.getRegion()
                java.lang.String r6 = r6.getIsoCodeShort()
                java.lang.String r0 = r0.getPostalCode()
                java.lang.String r0 = r2.c(r3, r6, r0)
                r7 = r0
                goto L6f
            L6e:
                r7 = r1
            L6f:
                int r0 = com.meijer.mobile.meijer.Y.f100593Oa
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                Ik.d r2 = r13.getResult()
                java.util.List r2 = r2.a()
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L85
                r8 = r0
                goto L86
            L85:
                r8 = r1
            L86:
                java.lang.Object r13 = r13.e()
                di.c r13 = (di.CustomerAddress) r13
                if (r13 == 0) goto L92
                java.lang.String r1 = r13.getPostalCode()
            L92:
                r9 = r1
                com.meijer.mobile.meijer.activity.checkout.review.a r3 = new com.meijer.mobile.meijer.activity.checkout.review.a
                r6 = 0
                r10 = 4
                r11 = 0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.AddressDecorator.Companion.a(Ik.b):com.meijer.mobile.meijer.activity.checkout.review.a");
        }

        public final AddressDecorator b(Validation<PaymentOption> validation) {
            BillingAddress billingAddress;
            BillingAddress billingAddress2;
            BillingAddress billingAddress3;
            BillingAddress billingAddress4;
            CardHolderName name;
            String fullName;
            Intrinsics.j(validation, "validation");
            PaymentOption paymentOptionE = validation.e();
            String str = (paymentOptionE == null || (billingAddress4 = paymentOptionE.getBillingAddress()) == null || (name = billingAddress4.getName()) == null || (fullName = name.getFullName()) == null || StringsKt.s0(fullName)) ? null : fullName;
            PaymentOption paymentOptionE2 = validation.e();
            String street1 = (paymentOptionE2 == null || (billingAddress3 = paymentOptionE2.getBillingAddress()) == null) ? null : billingAddress3.getStreet1();
            PaymentOption paymentOptionE3 = validation.e();
            String street2 = (paymentOptionE3 == null || (billingAddress2 = paymentOptionE3.getBillingAddress()) == null) ? null : billingAddress2.getStreet2();
            PaymentOption paymentOptionE4 = validation.e();
            return new AddressDecorator(str, street1, street2, (paymentOptionE4 == null || (billingAddress = paymentOptionE4.getBillingAddress()) == null) ? null : C17269a.f163094a.c(billingAddress.getCity(), billingAddress.getState(), billingAddress.getPostalCode()), !validation.getResult().a().isEmpty() ? Integer.valueOf(com.meijer.mobile.meijer.Y.f100593Oa) : null, null, 32, null);
        }
    }

    public AddressDecorator() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressDecorator)) {
            return false;
        }
        AddressDecorator addressDecorator = (AddressDecorator) other;
        return Intrinsics.e(this.name, addressDecorator.name) && Intrinsics.e(this.addressLine1, addressDecorator.addressLine1) && Intrinsics.e(this.addressLine2, addressDecorator.addressLine2) && Intrinsics.e(this.addressCityStateZip, addressDecorator.addressCityStateZip) && Intrinsics.e(this.error, addressDecorator.error) && Intrinsics.e(this.shippingZipCode, addressDecorator.shippingZipCode);
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.addressLine1;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.addressLine2;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.addressCityStateZip;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.error;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.shippingZipCode;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "AddressDecorator(name=" + this.name + ", addressLine1=" + this.addressLine1 + ", addressLine2=" + this.addressLine2 + ", addressCityStateZip=" + this.addressCityStateZip + ", error=" + this.error + ", shippingZipCode=" + this.shippingZipCode + ')';
    }

    public AddressDecorator(String str, String str2, String str3, String str4, Integer num, String str5) {
        this.name = str;
        this.addressLine1 = str2;
        this.addressLine2 = str3;
        this.addressCityStateZip = str4;
        this.error = num;
        this.shippingZipCode = str5;
    }

    /* renamed from: a, reason: from getter */
    public final String getAddressCityStateZip() {
        return this.addressCityStateZip;
    }

    /* renamed from: b, reason: from getter */
    public final String getAddressLine1() {
        return this.addressLine1;
    }

    /* renamed from: c, reason: from getter */
    public final String getAddressLine2() {
        return this.addressLine2;
    }

    /* renamed from: d, reason: from getter */
    public final Integer getError() {
        return this.error;
    }

    /* renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: f, reason: from getter */
    public final String getShippingZipCode() {
        return this.shippingZipCode;
    }

    public /* synthetic */ AddressDecorator(String str, String str2, String str3, String str4, Integer num, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : str5);
    }
}
