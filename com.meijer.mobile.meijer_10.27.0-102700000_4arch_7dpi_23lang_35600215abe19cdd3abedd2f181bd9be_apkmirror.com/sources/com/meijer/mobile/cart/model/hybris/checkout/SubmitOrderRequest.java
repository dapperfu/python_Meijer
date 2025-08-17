package com.meijer.mobile.cart.model.hybris.checkout;

import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0086\u0001\u0010\u0015\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b$\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b#\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b&\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\"\u00100R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b1\u0010\u0018R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b,\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b1\u00105\u001a\u0004\b.\u00106¨\u00067"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/checkout/SubmitOrderRequest;", "", "", "deliveryNote", "deliveryPhone", "", "earlyDelivery", "deliveryEmail", "Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupPerson;", "pickUpPerson", "Lcom/meijer/mobile/cart/model/hybris/timeslots/HybrisPickupSlotInfo;", "pickUpSlotInfo", "Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisContactInformation;", "contactInformation", "substitutionPreferenceTypeId", "Lcom/meijer/mobile/cart/model/hybris/checkout/TipJson;", "tip", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "ebtApprovedBalance", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupPerson;Lcom/meijer/mobile/cart/model/hybris/timeslots/HybrisPickupSlotInfo;Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisContactInformation;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/checkout/TipJson;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupPerson;Lcom/meijer/mobile/cart/model/hybris/timeslots/HybrisPickupSlotInfo;Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisContactInformation;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/checkout/TipJson;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;)Lcom/meijer/mobile/cart/model/hybris/checkout/SubmitOrderRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "e", "c", "Z", "f", "()Z", "Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupPerson;", "h", "()Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupPerson;", "Lcom/meijer/mobile/cart/model/hybris/timeslots/HybrisPickupSlotInfo;", "i", "()Lcom/meijer/mobile/cart/model/hybris/timeslots/HybrisPickupSlotInfo;", "g", "Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisContactInformation;", "()Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisContactInformation;", "j", "Lcom/meijer/mobile/cart/model/hybris/checkout/TipJson;", "k", "()Lcom/meijer/mobile/cart/model/hybris/checkout/TipJson;", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "()Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SubmitOrderRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryNote;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryPhone;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean earlyDelivery;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryEmail;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPickupPerson pickUpPerson;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final com.meijer.mobile.cart.model.hybris.timeslots.HybrisPickupSlotInfo pickUpSlotInfo;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisContactInformation contactInformation;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String substitutionPreferenceTypeId;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final TipJson tip;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice ebtApprovedBalance;

    public SubmitOrderRequest() {
        this(null, null, false, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ SubmitOrderRequest a(SubmitOrderRequest submitOrderRequest, String str, String str2, boolean z10, String str3, HybrisPickupPerson hybrisPickupPerson, com.meijer.mobile.cart.model.hybris.timeslots.HybrisPickupSlotInfo hybrisPickupSlotInfo, HybrisContactInformation hybrisContactInformation, String str4, TipJson tipJson, HybrisPrice hybrisPrice, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = submitOrderRequest.deliveryNote;
        }
        if ((i10 & 2) != 0) {
            str2 = submitOrderRequest.deliveryPhone;
        }
        if ((i10 & 4) != 0) {
            z10 = submitOrderRequest.earlyDelivery;
        }
        if ((i10 & 8) != 0) {
            str3 = submitOrderRequest.deliveryEmail;
        }
        if ((i10 & 16) != 0) {
            hybrisPickupPerson = submitOrderRequest.pickUpPerson;
        }
        if ((i10 & 32) != 0) {
            hybrisPickupSlotInfo = submitOrderRequest.pickUpSlotInfo;
        }
        if ((i10 & 64) != 0) {
            hybrisContactInformation = submitOrderRequest.contactInformation;
        }
        if ((i10 & 128) != 0) {
            str4 = submitOrderRequest.substitutionPreferenceTypeId;
        }
        if ((i10 & 256) != 0) {
            tipJson = submitOrderRequest.tip;
        }
        if ((i10 & 512) != 0) {
            hybrisPrice = submitOrderRequest.ebtApprovedBalance;
        }
        TipJson tipJson2 = tipJson;
        HybrisPrice hybrisPrice2 = hybrisPrice;
        HybrisContactInformation hybrisContactInformation2 = hybrisContactInformation;
        String str5 = str4;
        HybrisPickupPerson hybrisPickupPerson2 = hybrisPickupPerson;
        com.meijer.mobile.cart.model.hybris.timeslots.HybrisPickupSlotInfo hybrisPickupSlotInfo2 = hybrisPickupSlotInfo;
        return submitOrderRequest.copy(str, str2, z10, str3, hybrisPickupPerson2, hybrisPickupSlotInfo2, hybrisContactInformation2, str5, tipJson2, hybrisPrice2);
    }

    public final SubmitOrderRequest copy(@g(name = "deliveryNote") String deliveryNote, @g(name = "deliveryPhone") String deliveryPhone, @g(name = "earlyDelivery") boolean earlyDelivery, @g(name = "deliveryEmail") String deliveryEmail, @g(name = "pickUpPerson") HybrisPickupPerson pickUpPerson, @g(name = "pickUpSlotInfo") com.meijer.mobile.cart.model.hybris.timeslots.HybrisPickupSlotInfo pickUpSlotInfo, @g(name = "contactInformation") HybrisContactInformation contactInformation, @g(name = "substitutionPreferenceTypeId") String substitutionPreferenceTypeId, @g(name = "tip") TipJson tip, @g(name = "ebtApprovedBalance") HybrisPrice ebtApprovedBalance) {
        return new SubmitOrderRequest(deliveryNote, deliveryPhone, earlyDelivery, deliveryEmail, pickUpPerson, pickUpSlotInfo, contactInformation, substitutionPreferenceTypeId, tip, ebtApprovedBalance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitOrderRequest)) {
            return false;
        }
        SubmitOrderRequest submitOrderRequest = (SubmitOrderRequest) other;
        return Intrinsics.e(this.deliveryNote, submitOrderRequest.deliveryNote) && Intrinsics.e(this.deliveryPhone, submitOrderRequest.deliveryPhone) && this.earlyDelivery == submitOrderRequest.earlyDelivery && Intrinsics.e(this.deliveryEmail, submitOrderRequest.deliveryEmail) && Intrinsics.e(this.pickUpPerson, submitOrderRequest.pickUpPerson) && Intrinsics.e(this.pickUpSlotInfo, submitOrderRequest.pickUpSlotInfo) && Intrinsics.e(this.contactInformation, submitOrderRequest.contactInformation) && Intrinsics.e(this.substitutionPreferenceTypeId, submitOrderRequest.substitutionPreferenceTypeId) && Intrinsics.e(this.tip, submitOrderRequest.tip) && Intrinsics.e(this.ebtApprovedBalance, submitOrderRequest.ebtApprovedBalance);
    }

    public int hashCode() {
        String str = this.deliveryNote;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.deliveryPhone;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.earlyDelivery)) * 31;
        String str3 = this.deliveryEmail;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        HybrisPickupPerson hybrisPickupPerson = this.pickUpPerson;
        int iHashCode4 = (iHashCode3 + (hybrisPickupPerson == null ? 0 : hybrisPickupPerson.hashCode())) * 31;
        com.meijer.mobile.cart.model.hybris.timeslots.HybrisPickupSlotInfo hybrisPickupSlotInfo = this.pickUpSlotInfo;
        int iHashCode5 = (iHashCode4 + (hybrisPickupSlotInfo == null ? 0 : hybrisPickupSlotInfo.hashCode())) * 31;
        HybrisContactInformation hybrisContactInformation = this.contactInformation;
        int iHashCode6 = (iHashCode5 + (hybrisContactInformation == null ? 0 : hybrisContactInformation.hashCode())) * 31;
        String str4 = this.substitutionPreferenceTypeId;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        TipJson tipJson = this.tip;
        int iHashCode8 = (iHashCode7 + (tipJson == null ? 0 : tipJson.hashCode())) * 31;
        HybrisPrice hybrisPrice = this.ebtApprovedBalance;
        return iHashCode8 + (hybrisPrice != null ? hybrisPrice.hashCode() : 0);
    }

    public String toString() {
        return "SubmitOrderRequest(deliveryNote=" + this.deliveryNote + ", deliveryPhone=" + this.deliveryPhone + ", earlyDelivery=" + this.earlyDelivery + ", deliveryEmail=" + this.deliveryEmail + ", pickUpPerson=" + this.pickUpPerson + ", pickUpSlotInfo=" + this.pickUpSlotInfo + ", contactInformation=" + this.contactInformation + ", substitutionPreferenceTypeId=" + this.substitutionPreferenceTypeId + ", tip=" + this.tip + ", ebtApprovedBalance=" + this.ebtApprovedBalance + ')';
    }

    public SubmitOrderRequest(@g(name = "deliveryNote") String str, @g(name = "deliveryPhone") String str2, @g(name = "earlyDelivery") boolean z10, @g(name = "deliveryEmail") String str3, @g(name = "pickUpPerson") HybrisPickupPerson hybrisPickupPerson, @g(name = "pickUpSlotInfo") com.meijer.mobile.cart.model.hybris.timeslots.HybrisPickupSlotInfo hybrisPickupSlotInfo, @g(name = "contactInformation") HybrisContactInformation hybrisContactInformation, @g(name = "substitutionPreferenceTypeId") String str4, @g(name = "tip") TipJson tipJson, @g(name = "ebtApprovedBalance") HybrisPrice hybrisPrice) {
        this.deliveryNote = str;
        this.deliveryPhone = str2;
        this.earlyDelivery = z10;
        this.deliveryEmail = str3;
        this.pickUpPerson = hybrisPickupPerson;
        this.pickUpSlotInfo = hybrisPickupSlotInfo;
        this.contactInformation = hybrisContactInformation;
        this.substitutionPreferenceTypeId = str4;
        this.tip = tipJson;
        this.ebtApprovedBalance = hybrisPrice;
    }

    /* renamed from: b, reason: from getter */
    public final HybrisContactInformation getContactInformation() {
        return this.contactInformation;
    }

    /* renamed from: c, reason: from getter */
    public final String getDeliveryEmail() {
        return this.deliveryEmail;
    }

    /* renamed from: d, reason: from getter */
    public final String getDeliveryNote() {
        return this.deliveryNote;
    }

    /* renamed from: e, reason: from getter */
    public final String getDeliveryPhone() {
        return this.deliveryPhone;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getEarlyDelivery() {
        return this.earlyDelivery;
    }

    /* renamed from: g, reason: from getter */
    public final HybrisPrice getEbtApprovedBalance() {
        return this.ebtApprovedBalance;
    }

    /* renamed from: h, reason: from getter */
    public final HybrisPickupPerson getPickUpPerson() {
        return this.pickUpPerson;
    }

    /* renamed from: i, reason: from getter */
    public final com.meijer.mobile.cart.model.hybris.timeslots.HybrisPickupSlotInfo getPickUpSlotInfo() {
        return this.pickUpSlotInfo;
    }

    /* renamed from: j, reason: from getter */
    public final String getSubstitutionPreferenceTypeId() {
        return this.substitutionPreferenceTypeId;
    }

    /* renamed from: k, reason: from getter */
    public final TipJson getTip() {
        return this.tip;
    }

    public /* synthetic */ SubmitOrderRequest(String str, String str2, boolean z10, String str3, HybrisPickupPerson hybrisPickupPerson, com.meijer.mobile.cart.model.hybris.timeslots.HybrisPickupSlotInfo hybrisPickupSlotInfo, HybrisContactInformation hybrisContactInformation, String str4, TipJson tipJson, HybrisPrice hybrisPrice, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : hybrisPickupPerson, (i10 & 32) != 0 ? null : hybrisPickupSlotInfo, (i10 & 64) != 0 ? null : hybrisContactInformation, (i10 & 128) != 0 ? null : str4, (i10 & 256) != 0 ? null : tipJson, (i10 & 512) != 0 ? null : hybrisPrice);
    }
}
