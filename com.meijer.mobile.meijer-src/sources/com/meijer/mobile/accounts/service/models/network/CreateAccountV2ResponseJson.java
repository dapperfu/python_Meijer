package com.meijer.mobile.accounts.service.models.network;

import Yj.e;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0001\u001bBq\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\f\b\u0001\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\b\b\u0001\u0010\r\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011Jz\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00022\f\b\u0003\u0010\f\u001a\u00060\nj\u0002`\u000b2\b\b\u0003\u0010\r\u001a\u00020\u00022\b\b\u0003\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u0015R\u001b\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u0015R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/CreateAccountV2ResponseJson;", "", "", "birthdate", "createdAt", "email", "firstName", PreferencesHelper.PREF_ID, "lastName", "phone", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "preferredStoreId", "zip", "", "isActive", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Z)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Z)Lcom/meijer/mobile/accounts/service/models/network/CreateAccountV2ResponseJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "e", "f", "g", "h", "I", "i", "j", "Z", "k", "()Z", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CreateAccountV2ResponseJson {

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: l, reason: collision with root package name */
    private static final String f94727l = e.a("urn:meijer:digital:accounts:error:accountconflict");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String birthdate;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String createdAt;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastName;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phone;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final int preferredStoreId;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zip;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isActive;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/CreateAccountV2ResponseJson$a;", "", "<init>", "()V", "LYj/d;", "ACCOUNT_CONFLICT_URN", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.accounts.service.models.network.CreateAccountV2ResponseJson$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String a() {
            return CreateAccountV2ResponseJson.f94727l;
        }
    }

    public CreateAccountV2ResponseJson(@g(name = "birthdate") String str, @g(name = "createdAt") String createdAt, @g(name = "email") String email, @g(name = "firstName") String firstName, @g(name = "accountId") String id2, @g(name = "lastName") String lastName, @g(name = "phone") String phone, @g(name = "preferredStoreId") int i10, @g(name = "zip") String zip, @g(name = "isActive") boolean z10) {
        Intrinsics.j(createdAt, "createdAt");
        Intrinsics.j(email, "email");
        Intrinsics.j(firstName, "firstName");
        Intrinsics.j(id2, "id");
        Intrinsics.j(lastName, "lastName");
        Intrinsics.j(phone, "phone");
        Intrinsics.j(zip, "zip");
        this.birthdate = str;
        this.createdAt = createdAt;
        this.email = email;
        this.firstName = firstName;
        this.id = id2;
        this.lastName = lastName;
        this.phone = phone;
        this.preferredStoreId = i10;
        this.zip = zip;
        this.isActive = z10;
    }

    public final CreateAccountV2ResponseJson copy(@g(name = "birthdate") String birthdate, @g(name = "createdAt") String createdAt, @g(name = "email") String email, @g(name = "firstName") String firstName, @g(name = "accountId") String id2, @g(name = "lastName") String lastName, @g(name = "phone") String phone, @g(name = "preferredStoreId") int preferredStoreId, @g(name = "zip") String zip, @g(name = "isActive") boolean isActive) {
        Intrinsics.j(createdAt, "createdAt");
        Intrinsics.j(email, "email");
        Intrinsics.j(firstName, "firstName");
        Intrinsics.j(id2, "id");
        Intrinsics.j(lastName, "lastName");
        Intrinsics.j(phone, "phone");
        Intrinsics.j(zip, "zip");
        return new CreateAccountV2ResponseJson(birthdate, createdAt, email, firstName, id2, lastName, phone, preferredStoreId, zip, isActive);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateAccountV2ResponseJson)) {
            return false;
        }
        CreateAccountV2ResponseJson createAccountV2ResponseJson = (CreateAccountV2ResponseJson) other;
        return Intrinsics.e(this.birthdate, createAccountV2ResponseJson.birthdate) && Intrinsics.e(this.createdAt, createAccountV2ResponseJson.createdAt) && Intrinsics.e(this.email, createAccountV2ResponseJson.email) && Intrinsics.e(this.firstName, createAccountV2ResponseJson.firstName) && Intrinsics.e(this.id, createAccountV2ResponseJson.id) && Intrinsics.e(this.lastName, createAccountV2ResponseJson.lastName) && Intrinsics.e(this.phone, createAccountV2ResponseJson.phone) && this.preferredStoreId == createAccountV2ResponseJson.preferredStoreId && Intrinsics.e(this.zip, createAccountV2ResponseJson.zip) && this.isActive == createAccountV2ResponseJson.isActive;
    }

    public int hashCode() {
        String str = this.birthdate;
        return ((((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.email.hashCode()) * 31) + this.firstName.hashCode()) * 31) + this.id.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.phone.hashCode()) * 31) + Integer.hashCode(this.preferredStoreId)) * 31) + this.zip.hashCode()) * 31) + Boolean.hashCode(this.isActive);
    }

    public String toString() {
        return "CreateAccountV2ResponseJson(birthdate=" + this.birthdate + ", createdAt=" + this.createdAt + ", email=" + this.email + ", firstName=" + this.firstName + ", id=" + this.id + ", lastName=" + this.lastName + ", phone=" + this.phone + ", preferredStoreId=" + this.preferredStoreId + ", zip=" + this.zip + ", isActive=" + this.isActive + ')';
    }

    /* renamed from: b, reason: from getter */
    public final String getBirthdate() {
        return this.birthdate;
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
    public final String getId() {
        return this.id;
    }

    /* renamed from: g, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: h, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: i, reason: from getter */
    public final int getPreferredStoreId() {
        return this.preferredStoreId;
    }

    /* renamed from: j, reason: from getter */
    public final String getZip() {
        return this.zip;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    public /* synthetic */ CreateAccountV2ResponseJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, String str8, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, str2, str3, str4, str5, str6, str7, i10, str8, z10);
    }
}
