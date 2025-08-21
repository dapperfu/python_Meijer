package com.meijer.mobile.accounts.service.models.network;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJV\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u0017\u0010\u0010¨\u0006 "}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/UpdateAccountRequestV2;", "", "", "firstName", "lastName", "email", "phone", "zip", "", "preferredStoreId", "birthDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/meijer/mobile/accounts/service/models/network/UpdateAccountRequestV2;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "e", "g", "f", "I", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class UpdateAccountRequestV2 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phone;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zip;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int preferredStoreId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String birthDate;

    public final UpdateAccountRequestV2 copy(@g(name = "firstName") String firstName, @g(name = "lastName") String lastName, @g(name = "email") String email, @g(name = "phone") String phone, @g(name = "zip") String zip, @g(name = "preferredStoreId") int preferredStoreId, @g(name = "birthDate") String birthDate) {
        Intrinsics.j(firstName, "firstName");
        Intrinsics.j(lastName, "lastName");
        Intrinsics.j(email, "email");
        Intrinsics.j(phone, "phone");
        Intrinsics.j(zip, "zip");
        Intrinsics.j(birthDate, "birthDate");
        return new UpdateAccountRequestV2(firstName, lastName, email, phone, zip, preferredStoreId, birthDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateAccountRequestV2)) {
            return false;
        }
        UpdateAccountRequestV2 updateAccountRequestV2 = (UpdateAccountRequestV2) other;
        return Intrinsics.e(this.firstName, updateAccountRequestV2.firstName) && Intrinsics.e(this.lastName, updateAccountRequestV2.lastName) && Intrinsics.e(this.email, updateAccountRequestV2.email) && Intrinsics.e(this.phone, updateAccountRequestV2.phone) && Intrinsics.e(this.zip, updateAccountRequestV2.zip) && this.preferredStoreId == updateAccountRequestV2.preferredStoreId && Intrinsics.e(this.birthDate, updateAccountRequestV2.birthDate);
    }

    public int hashCode() {
        return (((((((((((this.firstName.hashCode() * 31) + this.lastName.hashCode()) * 31) + this.email.hashCode()) * 31) + this.phone.hashCode()) * 31) + this.zip.hashCode()) * 31) + Integer.hashCode(this.preferredStoreId)) * 31) + this.birthDate.hashCode();
    }

    public String toString() {
        return "UpdateAccountRequestV2(firstName=" + this.firstName + ", lastName=" + this.lastName + ", email=" + this.email + ", phone=" + this.phone + ", zip=" + this.zip + ", preferredStoreId=" + this.preferredStoreId + ", birthDate=" + this.birthDate + ')';
    }

    public UpdateAccountRequestV2(@g(name = "firstName") String firstName, @g(name = "lastName") String lastName, @g(name = "email") String email, @g(name = "phone") String phone, @g(name = "zip") String zip, @g(name = "preferredStoreId") int i10, @g(name = "birthDate") String birthDate) {
        Intrinsics.j(firstName, "firstName");
        Intrinsics.j(lastName, "lastName");
        Intrinsics.j(email, "email");
        Intrinsics.j(phone, "phone");
        Intrinsics.j(zip, "zip");
        Intrinsics.j(birthDate, "birthDate");
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.zip = zip;
        this.preferredStoreId = i10;
        this.birthDate = birthDate;
    }

    /* renamed from: a, reason: from getter */
    public final String getBirthDate() {
        return this.birthDate;
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
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: f, reason: from getter */
    public final int getPreferredStoreId() {
        return this.preferredStoreId;
    }

    /* renamed from: g, reason: from getter */
    public final String getZip() {
        return this.zip;
    }
}
