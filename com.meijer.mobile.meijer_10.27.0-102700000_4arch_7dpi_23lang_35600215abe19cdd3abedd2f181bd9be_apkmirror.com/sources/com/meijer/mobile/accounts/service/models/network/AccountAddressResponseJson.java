package com.meijer.mobile.accounts.service.models.network;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0004\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\n\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\f\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u000e\u001a\u00020\r\u0012\b\b\u0003\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0086\u0001\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\b\u001a\u00020\u00042\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\n\u001a\u00020\u00042\b\b\u0003\u0010\u000b\u001a\u00020\u00042\b\b\u0003\u0010\f\u001a\u00020\u00042\b\b\u0003\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u000f\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b \u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b!\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\"\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b#\u0010\u0015R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b%\u0010\u0015R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b)\u0010(¨\u0006*"}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/AccountAddressResponseJson;", "", "", "accountAddressId", "", "name", "contactFirstName", "contactLastName", "streetAddressLine1", "streetAddressLine2", "city", "state", "zip", "", "isPrimary", "isVerified", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/meijer/mobile/accounts/service/models/network/AccountAddressResponseJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "e", "c", "d", "g", "f", "h", "i", "j", "Z", "()Z", "k", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AccountAddressResponseJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int accountAddressId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String contactFirstName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String contactLastName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String streetAddressLine1;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String streetAddressLine2;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String city;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String state;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zip;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPrimary;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isVerified;

    public AccountAddressResponseJson(@g(name = "accountAddressId") int i10, @g(name = "name") String str, @g(name = "contactFirstName") String str2, @g(name = "contactLastName") String str3, @g(name = "streetAddressLine1") String streetAddressLine1, @g(name = "streetAddressLine2") String str4, @g(name = "city") String city, @g(name = "state") String state, @g(name = "zip") String zip, @g(name = "isPrimary") boolean z10, @g(name = "isVerified") boolean z11) {
        Intrinsics.j(streetAddressLine1, "streetAddressLine1");
        Intrinsics.j(city, "city");
        Intrinsics.j(state, "state");
        Intrinsics.j(zip, "zip");
        this.accountAddressId = i10;
        this.name = str;
        this.contactFirstName = str2;
        this.contactLastName = str3;
        this.streetAddressLine1 = streetAddressLine1;
        this.streetAddressLine2 = str4;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.isPrimary = z10;
        this.isVerified = z11;
    }

    public final AccountAddressResponseJson copy(@g(name = "accountAddressId") int accountAddressId, @g(name = "name") String name, @g(name = "contactFirstName") String contactFirstName, @g(name = "contactLastName") String contactLastName, @g(name = "streetAddressLine1") String streetAddressLine1, @g(name = "streetAddressLine2") String streetAddressLine2, @g(name = "city") String city, @g(name = "state") String state, @g(name = "zip") String zip, @g(name = "isPrimary") boolean isPrimary, @g(name = "isVerified") boolean isVerified) {
        Intrinsics.j(streetAddressLine1, "streetAddressLine1");
        Intrinsics.j(city, "city");
        Intrinsics.j(state, "state");
        Intrinsics.j(zip, "zip");
        return new AccountAddressResponseJson(accountAddressId, name, contactFirstName, contactLastName, streetAddressLine1, streetAddressLine2, city, state, zip, isPrimary, isVerified);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountAddressResponseJson)) {
            return false;
        }
        AccountAddressResponseJson accountAddressResponseJson = (AccountAddressResponseJson) other;
        return this.accountAddressId == accountAddressResponseJson.accountAddressId && Intrinsics.e(this.name, accountAddressResponseJson.name) && Intrinsics.e(this.contactFirstName, accountAddressResponseJson.contactFirstName) && Intrinsics.e(this.contactLastName, accountAddressResponseJson.contactLastName) && Intrinsics.e(this.streetAddressLine1, accountAddressResponseJson.streetAddressLine1) && Intrinsics.e(this.streetAddressLine2, accountAddressResponseJson.streetAddressLine2) && Intrinsics.e(this.city, accountAddressResponseJson.city) && Intrinsics.e(this.state, accountAddressResponseJson.state) && Intrinsics.e(this.zip, accountAddressResponseJson.zip) && this.isPrimary == accountAddressResponseJson.isPrimary && this.isVerified == accountAddressResponseJson.isVerified;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.accountAddressId) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.contactFirstName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.contactLastName;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.streetAddressLine1.hashCode()) * 31;
        String str4 = this.streetAddressLine2;
        return ((((((((((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.city.hashCode()) * 31) + this.state.hashCode()) * 31) + this.zip.hashCode()) * 31) + Boolean.hashCode(this.isPrimary)) * 31) + Boolean.hashCode(this.isVerified);
    }

    public String toString() {
        return "AccountAddressResponseJson(accountAddressId=" + this.accountAddressId + ", name=" + this.name + ", contactFirstName=" + this.contactFirstName + ", contactLastName=" + this.contactLastName + ", streetAddressLine1=" + this.streetAddressLine1 + ", streetAddressLine2=" + this.streetAddressLine2 + ", city=" + this.city + ", state=" + this.state + ", zip=" + this.zip + ", isPrimary=" + this.isPrimary + ", isVerified=" + this.isVerified + ')';
    }

    /* renamed from: a, reason: from getter */
    public final int getAccountAddressId() {
        return this.accountAddressId;
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
    public final String getZip() {
        return this.zip;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getIsPrimary() {
        return this.isPrimary;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getIsVerified() {
        return this.isVerified;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ AccountAddressResponseJson(int r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, boolean r24, boolean r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r14 = this;
            r0 = r26
            r1 = r0 & 32
            if (r1 == 0) goto L9
            r1 = 0
            r8 = r1
            goto Lb
        L9:
            r8 = r20
        Lb:
            r1 = r0 & 512(0x200, float:7.17E-43)
            r2 = 0
            if (r1 == 0) goto L12
            r12 = r2
            goto L14
        L12:
            r12 = r24
        L14:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L2a
            r13 = r2
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r9 = r21
            r10 = r22
            r11 = r23
            r2 = r14
            goto L3c
        L2a:
            r13 = r25
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r9 = r21
            r10 = r22
            r11 = r23
        L3c:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.accounts.service.models.network.AccountAddressResponseJson.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
