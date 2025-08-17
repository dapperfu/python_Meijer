package com.meijer.mobile.accounts.service.models.network;

import Xj.e;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0001\u001cB\u008d\u0001\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\b\b\u0003\u0010\f\u001a\u00020\u000b\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0096\u0001\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b#\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b$\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b%\u0010\u0015R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b*\u0010\u0015R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b&\u0010\u0015¨\u0006."}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/AddressSuggestionJson;", "", "", "name", "contactFirstName", "contactLastName", "streetAddressLine1", "streetAddressLine2", "city", "state", "zip", "", "isPrimary", "isVerified", "verificationSource", "verificationSignature", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/accounts/service/models/network/AddressSuggestionJson;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "c", "d", "g", "h", "f", "k", "i", "Z", "l", "()Z", "j", "Ljava/lang/Boolean;", "m", "()Ljava/lang/Boolean;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AddressSuggestionJson {

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: n, reason: collision with root package name */
    private static final String f93847n = e.a("urn:meijer:digital:accounts:error:unverifiedaddress");

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

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean isVerified;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String verificationSource;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String verificationSignature;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/AddressSuggestionJson$a;", "", "<init>", "()V", "LXj/d;", "UNVERIFIED_ADDRESS_ERROR_URN_REFERENCE", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.accounts.service.models.network.AddressSuggestionJson$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String a() {
            return AddressSuggestionJson.f93847n;
        }
    }

    public AddressSuggestionJson(@g(name = "name") String str, @g(name = "contactFirstName") String str2, @g(name = "contactLastName") String str3, @g(name = "streetAddressLine1") String streetAddressLine1, @g(name = "streetAddressLine2") String str4, @g(name = "city") String city, @g(name = "state") String state, @g(name = "zip") String zip, @g(name = "isPrimary") boolean z10, @g(name = "isVerified") Boolean bool, @g(name = "verificationSource") String str5, @g(name = "verificationSignature") String str6) {
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
        this.isVerified = bool;
        this.verificationSource = str5;
        this.verificationSignature = str6;
    }

    public final AddressSuggestionJson copy(@g(name = "name") String name, @g(name = "contactFirstName") String contactFirstName, @g(name = "contactLastName") String contactLastName, @g(name = "streetAddressLine1") String streetAddressLine1, @g(name = "streetAddressLine2") String streetAddressLine2, @g(name = "city") String city, @g(name = "state") String state, @g(name = "zip") String zip, @g(name = "isPrimary") boolean isPrimary, @g(name = "isVerified") Boolean isVerified, @g(name = "verificationSource") String verificationSource, @g(name = "verificationSignature") String verificationSignature) {
        Intrinsics.j(streetAddressLine1, "streetAddressLine1");
        Intrinsics.j(city, "city");
        Intrinsics.j(state, "state");
        Intrinsics.j(zip, "zip");
        return new AddressSuggestionJson(name, contactFirstName, contactLastName, streetAddressLine1, streetAddressLine2, city, state, zip, isPrimary, isVerified, verificationSource, verificationSignature);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressSuggestionJson)) {
            return false;
        }
        AddressSuggestionJson addressSuggestionJson = (AddressSuggestionJson) other;
        return Intrinsics.e(this.name, addressSuggestionJson.name) && Intrinsics.e(this.contactFirstName, addressSuggestionJson.contactFirstName) && Intrinsics.e(this.contactLastName, addressSuggestionJson.contactLastName) && Intrinsics.e(this.streetAddressLine1, addressSuggestionJson.streetAddressLine1) && Intrinsics.e(this.streetAddressLine2, addressSuggestionJson.streetAddressLine2) && Intrinsics.e(this.city, addressSuggestionJson.city) && Intrinsics.e(this.state, addressSuggestionJson.state) && Intrinsics.e(this.zip, addressSuggestionJson.zip) && this.isPrimary == addressSuggestionJson.isPrimary && Intrinsics.e(this.isVerified, addressSuggestionJson.isVerified) && Intrinsics.e(this.verificationSource, addressSuggestionJson.verificationSource) && Intrinsics.e(this.verificationSignature, addressSuggestionJson.verificationSignature);
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.contactFirstName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.contactLastName;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.streetAddressLine1.hashCode()) * 31;
        String str4 = this.streetAddressLine2;
        int iHashCode4 = (((((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.city.hashCode()) * 31) + this.state.hashCode()) * 31) + this.zip.hashCode()) * 31) + Boolean.hashCode(this.isPrimary)) * 31;
        Boolean bool = this.isVerified;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.verificationSource;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.verificationSignature;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "AddressSuggestionJson(name=" + this.name + ", contactFirstName=" + this.contactFirstName + ", contactLastName=" + this.contactLastName + ", streetAddressLine1=" + this.streetAddressLine1 + ", streetAddressLine2=" + this.streetAddressLine2 + ", city=" + this.city + ", state=" + this.state + ", zip=" + this.zip + ", isPrimary=" + this.isPrimary + ", isVerified=" + this.isVerified + ", verificationSource=" + this.verificationSource + ", verificationSignature=" + this.verificationSignature + ')';
    }

    /* renamed from: b, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: c, reason: from getter */
    public final String getContactFirstName() {
        return this.contactFirstName;
    }

    /* renamed from: d, reason: from getter */
    public final String getContactLastName() {
        return this.contactLastName;
    }

    /* renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: f, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: g, reason: from getter */
    public final String getStreetAddressLine1() {
        return this.streetAddressLine1;
    }

    /* renamed from: h, reason: from getter */
    public final String getStreetAddressLine2() {
        return this.streetAddressLine2;
    }

    /* renamed from: i, reason: from getter */
    public final String getVerificationSignature() {
        return this.verificationSignature;
    }

    /* renamed from: j, reason: from getter */
    public final String getVerificationSource() {
        return this.verificationSource;
    }

    /* renamed from: k, reason: from getter */
    public final String getZip() {
        return this.zip;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getIsPrimary() {
        return this.isPrimary;
    }

    /* renamed from: m, reason: from getter */
    public final Boolean getIsVerified() {
        return this.isVerified;
    }

    public /* synthetic */ AddressSuggestionJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z10, Boolean bool, String str9, String str10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, str4, (i10 & 16) != 0 ? null : str5, str6, str7, str8, (i10 & 256) != 0 ? false : z10, (i10 & 512) != 0 ? Boolean.FALSE : bool, str9, str10);
    }
}
