package com.meijer.mobile.accounts.service.models.network;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\bF\b\u0087\b\u0018\u0000 Z2\u00020\u0001:\u0001&Bõ\u0001\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\f\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u000e\u001a\u00020\r\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001b\u0010\u001cJþ\u0001\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\f\u001a\u00020\u00052\b\b\u0003\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u000f\u001a\u00020\u00022\b\b\u0003\u0010\u0010\u001a\u00020\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0016\u001a\u00020\u00152\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00152\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b&\u0010)\"\u0004\b-\u0010+R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u0010 \"\u0004\b1\u00102R$\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010/\u001a\u0004\b,\u0010 \"\u0004\b4\u00102R$\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010/\u001a\u0004\b.\u0010 \"\u0004\b6\u00102R$\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010/\u001a\u0004\b8\u0010 \"\u0004\b9\u00102R$\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010/\u001a\u0004\b;\u0010 \"\u0004\b<\u00102R$\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010/\u001a\u0004\b=\u0010 \"\u0004\b>\u00102R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010/\u001a\u0004\b7\u0010 \"\u0004\b@\u00102R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\b5\u0010\"\"\u0004\bC\u0010DR\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010'\u001a\u0004\b:\u0010)\"\u0004\bF\u0010+R\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010'\u001a\u0004\b?\u0010)\"\u0004\bH\u0010+R$\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010/\u001a\u0004\bG\u0010 \"\u0004\bI\u00102R$\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010/\u001a\u0004\bJ\u0010 \"\u0004\bK\u00102R$\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010/\u001a\u0004\b3\u0010 \"\u0004\bL\u00102R$\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010/\u001a\u0004\bM\u0010 \"\u0004\bN\u00102R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010/\u001a\u0004\bA\u0010 \"\u0004\bU\u00102R$\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010/\u001a\u0004\bE\u0010 \"\u0004\bW\u00102R$\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010/\u001a\u0004\bT\u0010 \"\u0004\bX\u00102R$\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010/\u001a\u0004\bV\u0010 \"\u0004\bY\u00102¨\u0006["}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/AccountAddressJson;", "", "", PreferencesHelper.PREF_ID, "accountId", "", "name", "addressLine1", "addressLine2", "city", "state", "zipCode", "addressTypeString", "", "addressType", "addressValidationType", "contactId", "firstName", "lastName", "addressNickname", "phoneNumber", "", "isPrimary", "createDate", "createdBy", "updateDate", "updatedBy", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/accounts/service/models/network/AccountAddressJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "m", "()J", "setId", "(J)V", "b", "setAccountId", "c", "Ljava/lang/String;", "o", "setName", "(Ljava/lang/String;)V", "d", "setAddressLine1", "e", "setAddressLine2", "f", "h", "setCity", "g", "q", "setState", "t", "setZipCode", "i", "setAddressTypeString", "j", "I", "setAddressType", "(I)V", "k", "setAddressValidationType", "l", "setContactId", "setFirstName", "n", "setLastName", "setAddressNickname", "p", "setPhoneNumber", "Z", "u", "()Z", "setPrimary", "(Z)V", "r", "setCreateDate", "s", "setCreatedBy", "setUpdateDate", "setUpdatedBy", "v", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AccountAddressJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private long id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private long accountId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String name;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private String addressLine1;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private String addressLine2;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private String city;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private String state;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private String zipCode;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private String addressTypeString;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private int addressType;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private long addressValidationType;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private long contactId;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private String firstName;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private String lastName;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private String addressNickname;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private String phoneNumber;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isPrimary;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private String createDate;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private String createdBy;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private String updateDate;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private String updatedBy;

    public AccountAddressJson() {
        this(0L, 0L, null, null, null, null, null, null, null, 0, 0L, 0L, null, null, null, null, false, null, null, null, null, 2097151, null);
    }

    public final AccountAddressJson copy(@g(name = "accountAddressId") long id2, @g(name = "accountId") long accountId, @g(name = "addressName") String name, @g(name = "addressLine1") String addressLine1, @g(name = "addressLine2") String addressLine2, @g(name = "city") String city, @g(name = "state") String state, @g(name = "zip") String zipCode, @g(name = "addressType") String addressTypeString, @g(name = "addressTypeId") int addressType, @g(name = "addressValidationType") long addressValidationType, @g(name = "addressContactId") long contactId, @g(name = "addressContactFirstName") String firstName, @g(name = "addressContactLastName") String lastName, @g(name = "addressContactNickName") String addressNickname, @g(name = "addressContactPhone") String phoneNumber, @g(name = "isPreferred") boolean isPrimary, @g(name = "createDate") String createDate, @g(name = "createdBy") String createdBy, @g(name = "updateDate") String updateDate, @g(name = "updatedBy") String updatedBy) {
        Intrinsics.j(addressTypeString, "addressTypeString");
        return new AccountAddressJson(id2, accountId, name, addressLine1, addressLine2, city, state, zipCode, addressTypeString, addressType, addressValidationType, contactId, firstName, lastName, addressNickname, phoneNumber, isPrimary, createDate, createdBy, updateDate, updatedBy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountAddressJson)) {
            return false;
        }
        AccountAddressJson accountAddressJson = (AccountAddressJson) other;
        return this.id == accountAddressJson.id && this.accountId == accountAddressJson.accountId && Intrinsics.e(this.name, accountAddressJson.name) && Intrinsics.e(this.addressLine1, accountAddressJson.addressLine1) && Intrinsics.e(this.addressLine2, accountAddressJson.addressLine2) && Intrinsics.e(this.city, accountAddressJson.city) && Intrinsics.e(this.state, accountAddressJson.state) && Intrinsics.e(this.zipCode, accountAddressJson.zipCode) && Intrinsics.e(this.addressTypeString, accountAddressJson.addressTypeString) && this.addressType == accountAddressJson.addressType && this.addressValidationType == accountAddressJson.addressValidationType && this.contactId == accountAddressJson.contactId && Intrinsics.e(this.firstName, accountAddressJson.firstName) && Intrinsics.e(this.lastName, accountAddressJson.lastName) && Intrinsics.e(this.addressNickname, accountAddressJson.addressNickname) && Intrinsics.e(this.phoneNumber, accountAddressJson.phoneNumber) && this.isPrimary == accountAddressJson.isPrimary && Intrinsics.e(this.createDate, accountAddressJson.createDate) && Intrinsics.e(this.createdBy, accountAddressJson.createdBy) && Intrinsics.e(this.updateDate, accountAddressJson.updateDate) && Intrinsics.e(this.updatedBy, accountAddressJson.updatedBy);
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.id) * 31) + Long.hashCode(this.accountId)) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.addressLine1;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.addressLine2;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.city;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.state;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.zipCode;
        int iHashCode7 = (((((((((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.addressTypeString.hashCode()) * 31) + Integer.hashCode(this.addressType)) * 31) + Long.hashCode(this.addressValidationType)) * 31) + Long.hashCode(this.contactId)) * 31;
        String str7 = this.firstName;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.lastName;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.addressNickname;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.phoneNumber;
        int iHashCode11 = (((iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31) + Boolean.hashCode(this.isPrimary)) * 31;
        String str11 = this.createDate;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.createdBy;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.updateDate;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.updatedBy;
        return iHashCode14 + (str14 != null ? str14.hashCode() : 0);
    }

    public String toString() {
        return "AccountAddressJson(id=" + this.id + ", accountId=" + this.accountId + ", name=" + this.name + ", addressLine1=" + this.addressLine1 + ", addressLine2=" + this.addressLine2 + ", city=" + this.city + ", state=" + this.state + ", zipCode=" + this.zipCode + ", addressTypeString=" + this.addressTypeString + ", addressType=" + this.addressType + ", addressValidationType=" + this.addressValidationType + ", contactId=" + this.contactId + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", addressNickname=" + this.addressNickname + ", phoneNumber=" + this.phoneNumber + ", isPrimary=" + this.isPrimary + ", createDate=" + this.createDate + ", createdBy=" + this.createdBy + ", updateDate=" + this.updateDate + ", updatedBy=" + this.updatedBy + ')';
    }

    public AccountAddressJson(@g(name = "accountAddressId") long j10, @g(name = "accountId") long j11, @g(name = "addressName") String str, @g(name = "addressLine1") String str2, @g(name = "addressLine2") String str3, @g(name = "city") String str4, @g(name = "state") String str5, @g(name = "zip") String str6, @g(name = "addressType") String addressTypeString, @g(name = "addressTypeId") int i10, @g(name = "addressValidationType") long j12, @g(name = "addressContactId") long j13, @g(name = "addressContactFirstName") String str7, @g(name = "addressContactLastName") String str8, @g(name = "addressContactNickName") String str9, @g(name = "addressContactPhone") String str10, @g(name = "isPreferred") boolean z10, @g(name = "createDate") String str11, @g(name = "createdBy") String str12, @g(name = "updateDate") String str13, @g(name = "updatedBy") String str14) {
        Intrinsics.j(addressTypeString, "addressTypeString");
        this.id = j10;
        this.accountId = j11;
        this.name = str;
        this.addressLine1 = str2;
        this.addressLine2 = str3;
        this.city = str4;
        this.state = str5;
        this.zipCode = str6;
        this.addressTypeString = addressTypeString;
        this.addressType = i10;
        this.addressValidationType = j12;
        this.contactId = j13;
        this.firstName = str7;
        this.lastName = str8;
        this.addressNickname = str9;
        this.phoneNumber = str10;
        this.isPrimary = z10;
        this.createDate = str11;
        this.createdBy = str12;
        this.updateDate = str13;
        this.updatedBy = str14;
    }

    /* renamed from: a, reason: from getter */
    public final long getAccountId() {
        return this.accountId;
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
    public final String getAddressNickname() {
        return this.addressNickname;
    }

    /* renamed from: e, reason: from getter */
    public final int getAddressType() {
        return this.addressType;
    }

    /* renamed from: f, reason: from getter */
    public final String getAddressTypeString() {
        return this.addressTypeString;
    }

    /* renamed from: g, reason: from getter */
    public final long getAddressValidationType() {
        return this.addressValidationType;
    }

    /* renamed from: h, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: i, reason: from getter */
    public final long getContactId() {
        return this.contactId;
    }

    /* renamed from: j, reason: from getter */
    public final String getCreateDate() {
        return this.createDate;
    }

    /* renamed from: k, reason: from getter */
    public final String getCreatedBy() {
        return this.createdBy;
    }

    /* renamed from: l, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: m, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: n, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: o, reason: from getter */
    public final String getName() {
        return this.name;
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

    /* renamed from: t, reason: from getter */
    public final String getZipCode() {
        return this.zipCode;
    }

    /* renamed from: u, reason: from getter */
    public final boolean getIsPrimary() {
        return this.isPrimary;
    }

    public /* synthetic */ AccountAddressJson(long j10, long j11, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, long j12, long j13, String str8, String str9, String str10, String str11, boolean z10, String str12, String str13, String str14, String str15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j10, (i11 & 2) != 0 ? 0L : j11, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? null : str6, (i11 & 256) != 0 ? "ShippingAddress" : str7, (i11 & 512) != 0 ? 0 : i10, (i11 & 1024) != 0 ? 0L : j12, (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? 0L : j13, (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str8, (i11 & 8192) != 0 ? null : str9, (i11 & 16384) != 0 ? null : str10, (i11 & 32768) != 0 ? null : str11, (i11 & 65536) == 0 ? z10 : false, (i11 & 131072) != 0 ? null : str12, (i11 & 262144) != 0 ? null : str13, (i11 & 524288) != 0 ? null : str14, (i11 & 1048576) != 0 ? null : str15);
    }
}
