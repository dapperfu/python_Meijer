package com.meijer.mobile.accounts.service.models.network;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010Jx\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\f\u001a\u00020\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b \u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b!\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\"\u0010\u0014R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010\u0016R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b\u001e\u0010\u0014¨\u0006("}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/AccountJson;", "", "", "accountId", "firstName", "lastName", "email", "phone", "zip", "", "preferredStoreId", "", "isActive", "birthDate", "createdAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/accounts/service/models/network/AccountJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "e", "c", "f", "d", "g", "i", "I", "h", "Z", "j", "()Z", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AccountJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String accountId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phone;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zip;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int preferredStoreId;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isActive;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String birthDate;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String createdAt;

    public AccountJson(@g(name = "accountId") String accountId, @g(name = "firstName") String firstName, @g(name = "lastName") String lastName, @g(name = "email") String email, @g(name = "phone") String phone, @g(name = "zip") String zip, @g(name = "preferredStoreId") int i10, @g(name = "isActive") boolean z10, @g(name = "birthDate") String str, @g(name = "createdAt") String str2) {
        Intrinsics.j(accountId, "accountId");
        Intrinsics.j(firstName, "firstName");
        Intrinsics.j(lastName, "lastName");
        Intrinsics.j(email, "email");
        Intrinsics.j(phone, "phone");
        Intrinsics.j(zip, "zip");
        this.accountId = accountId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.zip = zip;
        this.preferredStoreId = i10;
        this.isActive = z10;
        this.birthDate = str;
        this.createdAt = str2;
    }

    public final AccountJson copy(@g(name = "accountId") String accountId, @g(name = "firstName") String firstName, @g(name = "lastName") String lastName, @g(name = "email") String email, @g(name = "phone") String phone, @g(name = "zip") String zip, @g(name = "preferredStoreId") int preferredStoreId, @g(name = "isActive") boolean isActive, @g(name = "birthDate") String birthDate, @g(name = "createdAt") String createdAt) {
        Intrinsics.j(accountId, "accountId");
        Intrinsics.j(firstName, "firstName");
        Intrinsics.j(lastName, "lastName");
        Intrinsics.j(email, "email");
        Intrinsics.j(phone, "phone");
        Intrinsics.j(zip, "zip");
        return new AccountJson(accountId, firstName, lastName, email, phone, zip, preferredStoreId, isActive, birthDate, createdAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountJson)) {
            return false;
        }
        AccountJson accountJson = (AccountJson) other;
        return Intrinsics.e(this.accountId, accountJson.accountId) && Intrinsics.e(this.firstName, accountJson.firstName) && Intrinsics.e(this.lastName, accountJson.lastName) && Intrinsics.e(this.email, accountJson.email) && Intrinsics.e(this.phone, accountJson.phone) && Intrinsics.e(this.zip, accountJson.zip) && this.preferredStoreId == accountJson.preferredStoreId && this.isActive == accountJson.isActive && Intrinsics.e(this.birthDate, accountJson.birthDate) && Intrinsics.e(this.createdAt, accountJson.createdAt);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.accountId.hashCode() * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.email.hashCode()) * 31) + this.phone.hashCode()) * 31) + this.zip.hashCode()) * 31) + Integer.hashCode(this.preferredStoreId)) * 31) + Boolean.hashCode(this.isActive)) * 31;
        String str = this.birthDate;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.createdAt;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "AccountJson(accountId=" + this.accountId + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", email=" + this.email + ", phone=" + this.phone + ", zip=" + this.zip + ", preferredStoreId=" + this.preferredStoreId + ", isActive=" + this.isActive + ", birthDate=" + this.birthDate + ", createdAt=" + this.createdAt + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    /* renamed from: b, reason: from getter */
    public final String getBirthDate() {
        return this.birthDate;
    }

    /* renamed from: c, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: d, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: e, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: f, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: g, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: h, reason: from getter */
    public final int getPreferredStoreId() {
        return this.preferredStoreId;
    }

    /* renamed from: i, reason: from getter */
    public final String getZip() {
        return this.zip;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    public /* synthetic */ AccountJson(String str, String str2, String str3, String str4, String str5, String str6, int i10, boolean z10, String str7, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, i10, z10, (i11 & 256) != 0 ? null : str7, (i11 & 512) != 0 ? null : str8);
    }
}
