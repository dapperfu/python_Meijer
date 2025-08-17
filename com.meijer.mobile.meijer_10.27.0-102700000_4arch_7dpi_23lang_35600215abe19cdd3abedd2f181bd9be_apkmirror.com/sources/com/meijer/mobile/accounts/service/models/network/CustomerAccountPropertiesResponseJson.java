package com.meijer.mobile.accounts.service.models.network;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\n\u001a\u00020\t\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\r\u001a\u00020\f\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010Jt\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\n\u001a\u00020\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u001eR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u001eR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b\"\u0010\u001eR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001b\u001a\u0004\b(\u0010\u0014\"\u0004\b)\u0010\u001eR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0016\"\u0004\b-\u0010.R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001b\u001a\u0004\b/\u0010\u0014\"\u0004\b0\u0010\u001eR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00101\u001a\u0004\b*\u00102\"\u0004\b3\u00104R\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001b\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b5\u0010\u001e¨\u00066"}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/CustomerAccountPropertiesResponseJson;", "", "", "firstName", "lastName", "email", "", "phoneNumber", "zipCode", "", "storeId", "storeName", "", "storeActive", "barCodeImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;ZLjava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;ZLjava/lang/String;)Lcom/meijer/mobile/accounts/service/models/network/CustomerAccountPropertiesResponseJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "setFirstName", "(Ljava/lang/String;)V", "b", "d", "setLastName", "setEmail", "J", "e", "()J", "setPhoneNumber", "(J)V", "i", "setZipCode", "f", "I", "g", "setStoreId", "(I)V", "h", "setStoreName", "Z", "()Z", "setStoreActive", "(Z)V", "setBarCodeImage", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CustomerAccountPropertiesResponseJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private String firstName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String lastName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String email;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private long phoneNumber;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private String zipCode;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private int storeId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private String storeName;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean storeActive;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private String barCodeImage;

    public CustomerAccountPropertiesResponseJson() {
        this(null, null, null, 0L, null, 0, null, false, null, 511, null);
    }

    public final CustomerAccountPropertiesResponseJson copy(@g(name = "firstName") String firstName, @g(name = "lastName") String lastName, @g(name = "emailAddress") String email, @g(name = "phoneNumber") long phoneNumber, @g(name = "zip") String zipCode, @g(name = "storeId") int storeId, @g(name = "storeName") String storeName, @g(name = "storeActive") boolean storeActive, @g(name = "barCodeImage") String barCodeImage) {
        Intrinsics.j(barCodeImage, "barCodeImage");
        return new CustomerAccountPropertiesResponseJson(firstName, lastName, email, phoneNumber, zipCode, storeId, storeName, storeActive, barCodeImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerAccountPropertiesResponseJson)) {
            return false;
        }
        CustomerAccountPropertiesResponseJson customerAccountPropertiesResponseJson = (CustomerAccountPropertiesResponseJson) other;
        return Intrinsics.e(this.firstName, customerAccountPropertiesResponseJson.firstName) && Intrinsics.e(this.lastName, customerAccountPropertiesResponseJson.lastName) && Intrinsics.e(this.email, customerAccountPropertiesResponseJson.email) && this.phoneNumber == customerAccountPropertiesResponseJson.phoneNumber && Intrinsics.e(this.zipCode, customerAccountPropertiesResponseJson.zipCode) && this.storeId == customerAccountPropertiesResponseJson.storeId && Intrinsics.e(this.storeName, customerAccountPropertiesResponseJson.storeName) && this.storeActive == customerAccountPropertiesResponseJson.storeActive && Intrinsics.e(this.barCodeImage, customerAccountPropertiesResponseJson.barCodeImage);
    }

    public int hashCode() {
        String str = this.firstName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.email;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Long.hashCode(this.phoneNumber)) * 31;
        String str4 = this.zipCode;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.storeId)) * 31;
        String str5 = this.storeName;
        return ((((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + Boolean.hashCode(this.storeActive)) * 31) + this.barCodeImage.hashCode();
    }

    public String toString() {
        return "CustomerAccountPropertiesResponseJson(firstName=" + this.firstName + ", lastName=" + this.lastName + ", email=" + this.email + ", phoneNumber=" + this.phoneNumber + ", zipCode=" + this.zipCode + ", storeId=" + this.storeId + ", storeName=" + this.storeName + ", storeActive=" + this.storeActive + ", barCodeImage=" + this.barCodeImage + ')';
    }

    public CustomerAccountPropertiesResponseJson(@g(name = "firstName") String str, @g(name = "lastName") String str2, @g(name = "emailAddress") String str3, @g(name = "phoneNumber") long j10, @g(name = "zip") String str4, @g(name = "storeId") int i10, @g(name = "storeName") String str5, @g(name = "storeActive") boolean z10, @g(name = "barCodeImage") String barCodeImage) {
        Intrinsics.j(barCodeImage, "barCodeImage");
        this.firstName = str;
        this.lastName = str2;
        this.email = str3;
        this.phoneNumber = j10;
        this.zipCode = str4;
        this.storeId = i10;
        this.storeName = str5;
        this.storeActive = z10;
        this.barCodeImage = barCodeImage;
    }

    /* renamed from: a, reason: from getter */
    public final String getBarCodeImage() {
        return this.barCodeImage;
    }

    /* renamed from: b, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: c, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: d, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: e, reason: from getter */
    public final long getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getStoreActive() {
        return this.storeActive;
    }

    /* renamed from: g, reason: from getter */
    public final int getStoreId() {
        return this.storeId;
    }

    /* renamed from: h, reason: from getter */
    public final String getStoreName() {
        return this.storeName;
    }

    /* renamed from: i, reason: from getter */
    public final String getZipCode() {
        return this.zipCode;
    }

    public /* synthetic */ CustomerAccountPropertiesResponseJson(String str, String str2, String str3, long j10, String str4, int i10, String str5, boolean z10, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? 0L : j10, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? 0 : i10, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? false : z10, (i11 & 256) != 0 ? "" : str6);
    }
}
