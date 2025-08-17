package com.meijer.mobile.accounts.payments.api.models.network;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import uh.EnumC17262d;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001Bí\u0001\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001b\u0010\u001cJö\u0001\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\t\u001a\u00020\u00052\b\b\u0003\u0010\n\u001a\u00020\u00052\b\b\u0003\u0010\u000b\u001a\u00020\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0003\u0010\u000f\u001a\u00020\u00022\b\b\u0003\u0010\u0010\u001a\u00020\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0016\u001a\u00020\u00152\b\b\u0003\u0010\u0017\u001a\u00020\u00052\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0019\u001a\u00020\u00052\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00152\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010 R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b&\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b*\u0010 R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010 R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u0010 R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b6\u0010-\u001a\u0004\b0\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b/\u00109R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b1\u0010)R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b4\u0010)R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\b:\u0010 R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b:\u0010-\u001a\u0004\b;\u0010 R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b;\u0010-\u001a\u0004\b,\u0010 R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b<\u0010-\u001a\u0004\b<\u0010 R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b3\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0017\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b@\u0010-\u001a\u0004\b6\u0010 R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bA\u0010-\u001a\u0004\b7\u0010 R\u0017\u0010\u0019\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bB\u0010-\u001a\u0004\b@\u0010 R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\bA\u0010 R\u0011\u0010E\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bB\u0010D¨\u0006F"}, d2 = {"Lcom/meijer/mobile/accounts/payments/api/models/network/AccountAddressDTO;", "", "", PreferencesHelper.PREF_ID, "digitalAccountId", "", "name", "addressLine1", "addressLine2", "city", "state", "zipCode", "addressTypeString", "", "addressTypeId", "addressValidationType", "contactId", "nameFirst", "nameLast", "addressNickname", "phoneNumber", "", "isPrimary", "createDate", "createdBy", "updateDate", "updatedBy", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/accounts/payments/api/models/network/AccountAddressDTO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "l", "()J", "b", "k", "c", "Ljava/lang/String;", "m", "d", "e", "f", "g", "q", "h", "u", "i", "j", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "n", "o", "p", "Z", "v", "()Z", "r", "s", "t", "Luh/d;", "()Luh/d;", "validationType", "payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AccountAddressDTO {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long digitalAccountId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressLine1;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressLine2;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String city;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String state;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zipCode;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressTypeString;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer addressTypeId;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final long addressValidationType;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final long contactId;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nameFirst;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nameLast;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressNickname;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phoneNumber;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPrimary;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final String createDate;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final String createdBy;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final String updateDate;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final String updatedBy;

    public AccountAddressDTO(@g(name = "accountAddressId") long j10, @g(name = "accountId") long j11, @g(name = "addressName") String str, @g(name = "addressLine1") String addressLine1, @g(name = "addressLine2") String str2, @g(name = "city") String city, @g(name = "state") String state, @g(name = "zip") String zipCode, @g(name = "addressType") String str3, @g(name = "addressTypeId") Integer num, @g(name = "addressValidationType") long j12, @g(name = "addressContactId") long j13, @g(name = "addressContactFirstName") String str4, @g(name = "addressContactLastName") String str5, @g(name = "addressContactNickName") String str6, @g(name = "addressContactPhone") String str7, @g(name = "isPreferred") boolean z10, @g(name = "createDate") String createDate, @g(name = "createdBy") String str8, @g(name = "updateDate") String updateDate, @g(name = "updatedBy") String str9) {
        Intrinsics.j(addressLine1, "addressLine1");
        Intrinsics.j(city, "city");
        Intrinsics.j(state, "state");
        Intrinsics.j(zipCode, "zipCode");
        Intrinsics.j(createDate, "createDate");
        Intrinsics.j(updateDate, "updateDate");
        this.id = j10;
        this.digitalAccountId = j11;
        this.name = str;
        this.addressLine1 = addressLine1;
        this.addressLine2 = str2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.addressTypeString = str3;
        this.addressTypeId = num;
        this.addressValidationType = j12;
        this.contactId = j13;
        this.nameFirst = str4;
        this.nameLast = str5;
        this.addressNickname = str6;
        this.phoneNumber = str7;
        this.isPrimary = z10;
        this.createDate = createDate;
        this.createdBy = str8;
        this.updateDate = updateDate;
        this.updatedBy = str9;
    }

    public final AccountAddressDTO copy(@g(name = "accountAddressId") long id2, @g(name = "accountId") long digitalAccountId, @g(name = "addressName") String name, @g(name = "addressLine1") String addressLine1, @g(name = "addressLine2") String addressLine2, @g(name = "city") String city, @g(name = "state") String state, @g(name = "zip") String zipCode, @g(name = "addressType") String addressTypeString, @g(name = "addressTypeId") Integer addressTypeId, @g(name = "addressValidationType") long addressValidationType, @g(name = "addressContactId") long contactId, @g(name = "addressContactFirstName") String nameFirst, @g(name = "addressContactLastName") String nameLast, @g(name = "addressContactNickName") String addressNickname, @g(name = "addressContactPhone") String phoneNumber, @g(name = "isPreferred") boolean isPrimary, @g(name = "createDate") String createDate, @g(name = "createdBy") String createdBy, @g(name = "updateDate") String updateDate, @g(name = "updatedBy") String updatedBy) {
        Intrinsics.j(addressLine1, "addressLine1");
        Intrinsics.j(city, "city");
        Intrinsics.j(state, "state");
        Intrinsics.j(zipCode, "zipCode");
        Intrinsics.j(createDate, "createDate");
        Intrinsics.j(updateDate, "updateDate");
        return new AccountAddressDTO(id2, digitalAccountId, name, addressLine1, addressLine2, city, state, zipCode, addressTypeString, addressTypeId, addressValidationType, contactId, nameFirst, nameLast, addressNickname, phoneNumber, isPrimary, createDate, createdBy, updateDate, updatedBy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountAddressDTO)) {
            return false;
        }
        AccountAddressDTO accountAddressDTO = (AccountAddressDTO) other;
        return this.id == accountAddressDTO.id && this.digitalAccountId == accountAddressDTO.digitalAccountId && Intrinsics.e(this.name, accountAddressDTO.name) && Intrinsics.e(this.addressLine1, accountAddressDTO.addressLine1) && Intrinsics.e(this.addressLine2, accountAddressDTO.addressLine2) && Intrinsics.e(this.city, accountAddressDTO.city) && Intrinsics.e(this.state, accountAddressDTO.state) && Intrinsics.e(this.zipCode, accountAddressDTO.zipCode) && Intrinsics.e(this.addressTypeString, accountAddressDTO.addressTypeString) && Intrinsics.e(this.addressTypeId, accountAddressDTO.addressTypeId) && this.addressValidationType == accountAddressDTO.addressValidationType && this.contactId == accountAddressDTO.contactId && Intrinsics.e(this.nameFirst, accountAddressDTO.nameFirst) && Intrinsics.e(this.nameLast, accountAddressDTO.nameLast) && Intrinsics.e(this.addressNickname, accountAddressDTO.addressNickname) && Intrinsics.e(this.phoneNumber, accountAddressDTO.phoneNumber) && this.isPrimary == accountAddressDTO.isPrimary && Intrinsics.e(this.createDate, accountAddressDTO.createDate) && Intrinsics.e(this.createdBy, accountAddressDTO.createdBy) && Intrinsics.e(this.updateDate, accountAddressDTO.updateDate) && Intrinsics.e(this.updatedBy, accountAddressDTO.updatedBy);
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.id) * 31) + Long.hashCode(this.digitalAccountId)) * 31;
        String str = this.name;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.addressLine1.hashCode()) * 31;
        String str2 = this.addressLine2;
        int iHashCode3 = (((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.city.hashCode()) * 31) + this.state.hashCode()) * 31) + this.zipCode.hashCode()) * 31;
        String str3 = this.addressTypeString;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.addressTypeId;
        int iHashCode5 = (((((iHashCode4 + (num == null ? 0 : num.hashCode())) * 31) + Long.hashCode(this.addressValidationType)) * 31) + Long.hashCode(this.contactId)) * 31;
        String str4 = this.nameFirst;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.nameLast;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.addressNickname;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.phoneNumber;
        int iHashCode9 = (((((iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31) + Boolean.hashCode(this.isPrimary)) * 31) + this.createDate.hashCode()) * 31;
        String str8 = this.createdBy;
        int iHashCode10 = (((iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.updateDate.hashCode()) * 31;
        String str9 = this.updatedBy;
        return iHashCode10 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        return "AccountAddressDTO(id=" + this.id + ", digitalAccountId=" + this.digitalAccountId + ", name=" + this.name + ", addressLine1=" + this.addressLine1 + ", addressLine2=" + this.addressLine2 + ", city=" + this.city + ", state=" + this.state + ", zipCode=" + this.zipCode + ", addressTypeString=" + this.addressTypeString + ", addressTypeId=" + this.addressTypeId + ", addressValidationType=" + this.addressValidationType + ", contactId=" + this.contactId + ", nameFirst=" + this.nameFirst + ", nameLast=" + this.nameLast + ", addressNickname=" + this.addressNickname + ", phoneNumber=" + this.phoneNumber + ", isPrimary=" + this.isPrimary + ", createDate=" + this.createDate + ", createdBy=" + this.createdBy + ", updateDate=" + this.updateDate + ", updatedBy=" + this.updatedBy + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getAddressLine1() {
        return this.addressLine1;
    }

    /* renamed from: b, reason: from getter */
    public final String getAddressLine2() {
        return this.addressLine2;
    }

    /* renamed from: c, reason: from getter */
    public final String getAddressNickname() {
        return this.addressNickname;
    }

    /* renamed from: d, reason: from getter */
    public final Integer getAddressTypeId() {
        return this.addressTypeId;
    }

    /* renamed from: e, reason: from getter */
    public final String getAddressTypeString() {
        return this.addressTypeString;
    }

    /* renamed from: f, reason: from getter */
    public final long getAddressValidationType() {
        return this.addressValidationType;
    }

    /* renamed from: g, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: h, reason: from getter */
    public final long getContactId() {
        return this.contactId;
    }

    /* renamed from: i, reason: from getter */
    public final String getCreateDate() {
        return this.createDate;
    }

    /* renamed from: j, reason: from getter */
    public final String getCreatedBy() {
        return this.createdBy;
    }

    /* renamed from: k, reason: from getter */
    public final long getDigitalAccountId() {
        return this.digitalAccountId;
    }

    /* renamed from: l, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: m, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: n, reason: from getter */
    public final String getNameFirst() {
        return this.nameFirst;
    }

    /* renamed from: o, reason: from getter */
    public final String getNameLast() {
        return this.nameLast;
    }

    /* renamed from: p, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: q, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: r, reason: from getter */
    public final String getUpdateDate() {
        return this.updateDate;
    }

    /* renamed from: s, reason: from getter */
    public final String getUpdatedBy() {
        return this.updatedBy;
    }

    public final EnumC17262d t() {
        long j10 = this.addressValidationType;
        return j10 == 1 ? EnumC17262d.f162972c : j10 == 2 ? EnumC17262d.f162973d : j10 == 3 ? EnumC17262d.f162974e : EnumC17262d.f162971b;
    }

    /* renamed from: u, reason: from getter */
    public final String getZipCode() {
        return this.zipCode;
    }

    /* renamed from: v, reason: from getter */
    public final boolean getIsPrimary() {
        return this.isPrimary;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ AccountAddressDTO(long r31, long r33, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.Integer r42, long r43, long r45, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, boolean r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, int r56, kotlin.jvm.internal.DefaultConstructorMarker r57) {
        /*
            r30 = this;
            r0 = r56
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto La
            r5 = r2
            goto Lc
        La:
            r5 = r31
        Lc:
            r1 = r0 & 2
            if (r1 == 0) goto L12
            r7 = r2
            goto L14
        L12:
            r7 = r33
        L14:
            r1 = r0 & 4
            r4 = 0
            if (r1 == 0) goto L1b
            r9 = r4
            goto L1d
        L1b:
            r9 = r35
        L1d:
            r1 = r0 & 16
            if (r1 == 0) goto L23
            r11 = r4
            goto L25
        L23:
            r11 = r37
        L25:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L2b
            r15 = r4
            goto L2d
        L2b:
            r15 = r41
        L2d:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L34
            r16 = r4
            goto L36
        L34:
            r16 = r42
        L36:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L3d
            r17 = r2
            goto L3f
        L3d:
            r17 = r43
        L3f:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L46
            r19 = r2
            goto L48
        L46:
            r19 = r45
        L48:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L4f
            r21 = r4
            goto L51
        L4f:
            r21 = r47
        L51:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L58
            r22 = r4
            goto L5a
        L58:
            r22 = r48
        L5a:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L61
            r23 = r4
            goto L63
        L61:
            r23 = r49
        L63:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L6c
            r24 = r4
            goto L6e
        L6c:
            r24 = r50
        L6e:
            r1 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L77
            r1 = 0
            r25 = r1
            goto L79
        L77:
            r25 = r51
        L79:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L81
            r27 = r4
            goto L83
        L81:
            r27 = r53
        L83:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L99
            r29 = r4
            r10 = r36
            r12 = r38
            r13 = r39
            r14 = r40
            r26 = r52
            r28 = r54
            r4 = r30
            goto La9
        L99:
            r29 = r55
            r4 = r30
            r10 = r36
            r12 = r38
            r13 = r39
            r14 = r40
            r26 = r52
            r28 = r54
        La9:
            r4.<init>(r5, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.accounts.payments.api.models.network.AccountAddressDTO.<init>(long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
