package cr;

import Tq.SimpleStoreSummary;
import android.os.Parcel;
import android.os.Parcelable;
import io.constructor.data.local.PreferencesHelper;
import j$.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b:\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u001d\u001a\u00020\u0011\u0012\u0006\u0010\u001e\u001a\u00020\u0011\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u001d\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000b¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u000b¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b-\u0010*J\u001a\u00100\u001a\u00020\u00112\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010,R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u00103\u001a\u0004\b6\u0010,R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b2\u0010*R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u00103\u001a\u0004\b5\u0010,R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u00103\u001a\u0004\bG\u0010,R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u00103\u001a\u0004\bI\u0010,R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bJ\u00103\u001a\u0004\b7\u0010,R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bC\u0010MR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bN\u00103\u001a\u0004\bO\u0010,R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\b;\u0010RR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b?\u0010]R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b^\u0010Q\u001a\u0004\b_\u0010RR\u0017\u0010\u001d\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b`\u0010L\u001a\u0004\b\u001d\u0010MR\u0017\u0010\u001e\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\ba\u0010L\u001a\u0004\bb\u0010MR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0011\u0010g\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bE\u0010M¨\u0006h"}, d2 = {"Lcr/j;", "Landroid/os/Parcelable;", "", "externalShopperId", "baseSite", "Lcr/a;", "contactInfo", "Lcr/b;", "customerDeliveryAddress", "Lcr/c;", "customerName", "", "deliveryFrequency", "deliveryFrequencyUnit", "fulfillmentPartner", "fulfillmentType", PreferencesHelper.PREF_ID, "", "isActive", "name", "j$/time/LocalDate", "nextOrderDate", "Lcr/g;", "paymentInfo", "Lcr/h;", "preferredTimeslot", "Lcr/i;", "productInfo", "skipOrderDate", "isSkippable", "hasSkipped", "LTq/e;", "storeInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcr/a;Lcr/b;Lcr/c;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lj$/time/LocalDate;Lcr/g;Lcr/h;Lcr/i;Lj$/time/LocalDate;ZZLTq/e;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getExternalShopperId", "b", "getBaseSite", "c", "Lcr/a;", "getContactInfo", "()Lcr/a;", "d", "Lcr/b;", "getCustomerDeliveryAddress", "()Lcr/b;", "e", "Lcr/c;", "getCustomerName", "()Lcr/c;", "f", "I", "g", "h", "getFulfillmentPartner", "i", "getFulfillmentType", "j", "k", "Z", "()Z", "l", "getName", "m", "Lj$/time/LocalDate;", "()Lj$/time/LocalDate;", "n", "Lcr/g;", "getPaymentInfo", "()Lcr/g;", "o", "Lcr/h;", "getPreferredTimeslot", "()Lcr/h;", "p", "Lcr/i;", "()Lcr/i;", "q", "getSkipOrderDate", "r", "s", "getHasSkipped", "t", "LTq/e;", "getStoreInfo", "()LTq/e;", "isDefaultSubscriptionName", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cr.j, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class SubscriptionDetails implements Parcelable {
    public static final Parcelable.Creator<SubscriptionDetails> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String externalShopperId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String baseSite;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ContactInfo contactInfo;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final CustomerDeliveryAddress customerDeliveryAddress;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final CustomerName customerName;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int deliveryFrequency;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryFrequencyUnit;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fulfillmentPartner;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fulfillmentType;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isActive;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate nextOrderDate;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentInfo paymentInfo;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final PreferredTimeslot preferredTimeslot;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductInfo productInfo;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate skipOrderDate;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSkippable;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasSkipped;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final SimpleStoreSummary storeInfo;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: cr.j$a */
    public static final class a implements Parcelable.Creator<SubscriptionDetails> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SubscriptionDetails createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            ContactInfo contactInfoCreateFromParcel = ContactInfo.CREATOR.createFromParcel(parcel);
            CustomerDeliveryAddress customerDeliveryAddressCreateFromParcel = CustomerDeliveryAddress.CREATOR.createFromParcel(parcel);
            CustomerName customerNameCreateFromParcel = CustomerName.CREATOR.createFromParcel(parcel);
            int i10 = parcel.readInt();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            boolean z10 = false;
            if (parcel.readInt() != 0) {
                z10 = true;
            }
            return new SubscriptionDetails(string, string2, contactInfoCreateFromParcel, customerDeliveryAddressCreateFromParcel, customerNameCreateFromParcel, i10, string3, string4, string5, string6, z10, parcel.readString(), (LocalDate) parcel.readSerializable(), PaymentInfo.CREATOR.createFromParcel(parcel), PreferredTimeslot.CREATOR.createFromParcel(parcel), ProductInfo.CREATOR.createFromParcel(parcel), (LocalDate) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0, (SimpleStoreSummary) parcel.readParcelable(SubscriptionDetails.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SubscriptionDetails[] newArray(int i10) {
            return new SubscriptionDetails[i10];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionDetails)) {
            return false;
        }
        SubscriptionDetails subscriptionDetails = (SubscriptionDetails) other;
        return Intrinsics.e(this.externalShopperId, subscriptionDetails.externalShopperId) && Intrinsics.e(this.baseSite, subscriptionDetails.baseSite) && Intrinsics.e(this.contactInfo, subscriptionDetails.contactInfo) && Intrinsics.e(this.customerDeliveryAddress, subscriptionDetails.customerDeliveryAddress) && Intrinsics.e(this.customerName, subscriptionDetails.customerName) && this.deliveryFrequency == subscriptionDetails.deliveryFrequency && Intrinsics.e(this.deliveryFrequencyUnit, subscriptionDetails.deliveryFrequencyUnit) && Intrinsics.e(this.fulfillmentPartner, subscriptionDetails.fulfillmentPartner) && Intrinsics.e(this.fulfillmentType, subscriptionDetails.fulfillmentType) && Intrinsics.e(this.id, subscriptionDetails.id) && this.isActive == subscriptionDetails.isActive && Intrinsics.e(this.name, subscriptionDetails.name) && Intrinsics.e(this.nextOrderDate, subscriptionDetails.nextOrderDate) && Intrinsics.e(this.paymentInfo, subscriptionDetails.paymentInfo) && Intrinsics.e(this.preferredTimeslot, subscriptionDetails.preferredTimeslot) && Intrinsics.e(this.productInfo, subscriptionDetails.productInfo) && Intrinsics.e(this.skipOrderDate, subscriptionDetails.skipOrderDate) && this.isSkippable == subscriptionDetails.isSkippable && this.hasSkipped == subscriptionDetails.hasSkipped && Intrinsics.e(this.storeInfo, subscriptionDetails.storeInfo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.externalShopperId);
        dest.writeString(this.baseSite);
        this.contactInfo.writeToParcel(dest, flags);
        this.customerDeliveryAddress.writeToParcel(dest, flags);
        this.customerName.writeToParcel(dest, flags);
        dest.writeInt(this.deliveryFrequency);
        dest.writeString(this.deliveryFrequencyUnit);
        dest.writeString(this.fulfillmentPartner);
        dest.writeString(this.fulfillmentType);
        dest.writeString(this.id);
        dest.writeInt(this.isActive ? 1 : 0);
        dest.writeString(this.name);
        dest.writeSerializable(this.nextOrderDate);
        this.paymentInfo.writeToParcel(dest, flags);
        this.preferredTimeslot.writeToParcel(dest, flags);
        this.productInfo.writeToParcel(dest, flags);
        dest.writeSerializable(this.skipOrderDate);
        dest.writeInt(this.isSkippable ? 1 : 0);
        dest.writeInt(this.hasSkipped ? 1 : 0);
        dest.writeParcelable(this.storeInfo, flags);
    }

    public SubscriptionDetails(String externalShopperId, String baseSite, ContactInfo contactInfo, CustomerDeliveryAddress customerDeliveryAddress, CustomerName customerName, int i10, String deliveryFrequencyUnit, String fulfillmentPartner, String fulfillmentType, String id2, boolean z10, String name, LocalDate nextOrderDate, PaymentInfo paymentInfo, PreferredTimeslot preferredTimeslot, ProductInfo productInfo, LocalDate localDate, boolean z11, boolean z12, SimpleStoreSummary storeInfo) {
        Intrinsics.j(externalShopperId, "externalShopperId");
        Intrinsics.j(baseSite, "baseSite");
        Intrinsics.j(contactInfo, "contactInfo");
        Intrinsics.j(customerDeliveryAddress, "customerDeliveryAddress");
        Intrinsics.j(customerName, "customerName");
        Intrinsics.j(deliveryFrequencyUnit, "deliveryFrequencyUnit");
        Intrinsics.j(fulfillmentPartner, "fulfillmentPartner");
        Intrinsics.j(fulfillmentType, "fulfillmentType");
        Intrinsics.j(id2, "id");
        Intrinsics.j(name, "name");
        Intrinsics.j(nextOrderDate, "nextOrderDate");
        Intrinsics.j(paymentInfo, "paymentInfo");
        Intrinsics.j(preferredTimeslot, "preferredTimeslot");
        Intrinsics.j(productInfo, "productInfo");
        Intrinsics.j(storeInfo, "storeInfo");
        this.externalShopperId = externalShopperId;
        this.baseSite = baseSite;
        this.contactInfo = contactInfo;
        this.customerDeliveryAddress = customerDeliveryAddress;
        this.customerName = customerName;
        this.deliveryFrequency = i10;
        this.deliveryFrequencyUnit = deliveryFrequencyUnit;
        this.fulfillmentPartner = fulfillmentPartner;
        this.fulfillmentType = fulfillmentType;
        this.id = id2;
        this.isActive = z10;
        this.name = name;
        this.nextOrderDate = nextOrderDate;
        this.paymentInfo = paymentInfo;
        this.preferredTimeslot = preferredTimeslot;
        this.productInfo = productInfo;
        this.skipOrderDate = localDate;
        this.isSkippable = z11;
        this.hasSkipped = z12;
        this.storeInfo = storeInfo;
    }

    /* renamed from: a, reason: from getter */
    public final int getDeliveryFrequency() {
        return this.deliveryFrequency;
    }

    /* renamed from: b, reason: from getter */
    public final String getDeliveryFrequencyUnit() {
        return this.deliveryFrequencyUnit;
    }

    /* renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: d, reason: from getter */
    public final LocalDate getNextOrderDate() {
        return this.nextOrderDate;
    }

    /* renamed from: e, reason: from getter */
    public final ProductInfo getProductInfo() {
        return this.productInfo;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    public final boolean g() {
        return StringsKt.r0(this.name);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((this.externalShopperId.hashCode() * 31) + this.baseSite.hashCode()) * 31) + this.contactInfo.hashCode()) * 31) + this.customerDeliveryAddress.hashCode()) * 31) + this.customerName.hashCode()) * 31) + Integer.hashCode(this.deliveryFrequency)) * 31) + this.deliveryFrequencyUnit.hashCode()) * 31) + this.fulfillmentPartner.hashCode()) * 31) + this.fulfillmentType.hashCode()) * 31) + this.id.hashCode()) * 31) + Boolean.hashCode(this.isActive)) * 31) + this.name.hashCode()) * 31) + this.nextOrderDate.hashCode()) * 31) + this.paymentInfo.hashCode()) * 31) + this.preferredTimeslot.hashCode()) * 31) + this.productInfo.hashCode()) * 31;
        LocalDate localDate = this.skipOrderDate;
        return ((((((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31) + Boolean.hashCode(this.isSkippable)) * 31) + Boolean.hashCode(this.hasSkipped)) * 31) + this.storeInfo.hashCode();
    }

    public String toString() {
        return "SubscriptionDetails(externalShopperId=" + this.externalShopperId + ", baseSite=" + this.baseSite + ", contactInfo=" + this.contactInfo + ", customerDeliveryAddress=" + this.customerDeliveryAddress + ", customerName=" + this.customerName + ", deliveryFrequency=" + this.deliveryFrequency + ", deliveryFrequencyUnit=" + this.deliveryFrequencyUnit + ", fulfillmentPartner=" + this.fulfillmentPartner + ", fulfillmentType=" + this.fulfillmentType + ", id=" + this.id + ", isActive=" + this.isActive + ", name=" + this.name + ", nextOrderDate=" + this.nextOrderDate + ", paymentInfo=" + this.paymentInfo + ", preferredTimeslot=" + this.preferredTimeslot + ", productInfo=" + this.productInfo + ", skipOrderDate=" + this.skipOrderDate + ", isSkippable=" + this.isSkippable + ", hasSkipped=" + this.hasSkipped + ", storeInfo=" + this.storeInfo + ')';
    }
}
