package com.meijer.mobile.accounts.service.models.network;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\b\b\u0003\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJr\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001e\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u0012R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b!\u0010\u0012R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006%"}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/AddOrUpdateAccountAddressRequest;", "", "", "name", "contactFirstName", "contactLastName", "streetAddressLine1", "streetAddressLine2", "city", "state", "zip", "", "isPrimary", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/meijer/mobile/accounts/service/models/network/AddOrUpdateAccountAddressRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "f", "e", "g", "h", "i", "Z", "()Z", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AddOrUpdateAccountAddressRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String contactFirstName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String contactLastName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String streetAddressLine1;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String streetAddressLine2;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String city;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String state;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zip;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPrimary;

    public AddOrUpdateAccountAddressRequest(@g(name = "name") String str, @g(name = "contactFirstName") String str2, @g(name = "contactLastName") String str3, @g(name = "streetAddressLine1") String streetAddressLine1, @g(name = "streetAddressLine2") String str4, @g(name = "city") String city, @g(name = "state") String state, @g(name = "zip") String zip, @g(name = "isPrimary") boolean z10) {
        Intrinsics.j(streetAddressLine1, "streetAddressLine1");
        Intrinsics.j(city, "city");
        Intrinsics.j(state, "state");
        Intrinsics.j(zip, "zip");
        this.name = str;
        this.contactFirstName = str2;
        this.contactLastName = str3;
        this.streetAddressLine1 = streetAddressLine1;
        this.streetAddressLine2 = str4;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.isPrimary = z10;
    }

    public final AddOrUpdateAccountAddressRequest copy(@g(name = "name") String name, @g(name = "contactFirstName") String contactFirstName, @g(name = "contactLastName") String contactLastName, @g(name = "streetAddressLine1") String streetAddressLine1, @g(name = "streetAddressLine2") String streetAddressLine2, @g(name = "city") String city, @g(name = "state") String state, @g(name = "zip") String zip, @g(name = "isPrimary") boolean isPrimary) {
        Intrinsics.j(streetAddressLine1, "streetAddressLine1");
        Intrinsics.j(city, "city");
        Intrinsics.j(state, "state");
        Intrinsics.j(zip, "zip");
        return new AddOrUpdateAccountAddressRequest(name, contactFirstName, contactLastName, streetAddressLine1, streetAddressLine2, city, state, zip, isPrimary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddOrUpdateAccountAddressRequest)) {
            return false;
        }
        AddOrUpdateAccountAddressRequest addOrUpdateAccountAddressRequest = (AddOrUpdateAccountAddressRequest) other;
        return Intrinsics.e(this.name, addOrUpdateAccountAddressRequest.name) && Intrinsics.e(this.contactFirstName, addOrUpdateAccountAddressRequest.contactFirstName) && Intrinsics.e(this.contactLastName, addOrUpdateAccountAddressRequest.contactLastName) && Intrinsics.e(this.streetAddressLine1, addOrUpdateAccountAddressRequest.streetAddressLine1) && Intrinsics.e(this.streetAddressLine2, addOrUpdateAccountAddressRequest.streetAddressLine2) && Intrinsics.e(this.city, addOrUpdateAccountAddressRequest.city) && Intrinsics.e(this.state, addOrUpdateAccountAddressRequest.state) && Intrinsics.e(this.zip, addOrUpdateAccountAddressRequest.zip) && this.isPrimary == addOrUpdateAccountAddressRequest.isPrimary;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.contactFirstName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.contactLastName;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.streetAddressLine1.hashCode()) * 31;
        String str4 = this.streetAddressLine2;
        return ((((((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.city.hashCode()) * 31) + this.state.hashCode()) * 31) + this.zip.hashCode()) * 31) + Boolean.hashCode(this.isPrimary);
    }

    public String toString() {
        return "AddOrUpdateAccountAddressRequest(name=" + this.name + ", contactFirstName=" + this.contactFirstName + ", contactLastName=" + this.contactLastName + ", streetAddressLine1=" + this.streetAddressLine1 + ", streetAddressLine2=" + this.streetAddressLine2 + ", city=" + this.city + ", state=" + this.state + ", zip=" + this.zip + ", isPrimary=" + this.isPrimary + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: b, reason: from getter */
    public final String getContactFirstName() {
        return this.contactFirstName;
    }

    /* renamed from: c, reason: from getter */
    public final String getContactLastName() {
        return this.contactLastName;
    }

    /* renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: e, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: f, reason: from getter */
    public final String getStreetAddressLine1() {
        return this.streetAddressLine1;
    }

    /* renamed from: g, reason: from getter */
    public final String getStreetAddressLine2() {
        return this.streetAddressLine2;
    }

    /* renamed from: h, reason: from getter */
    public final String getZip() {
        return this.zip;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getIsPrimary() {
        return this.isPrimary;
    }

    public /* synthetic */ AddOrUpdateAccountAddressRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i10 & 16) != 0 ? null : str5, str6, str7, str8, (i10 & 256) != 0 ? false : z10);
    }
}
