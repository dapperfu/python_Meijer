package com.meijer.mobile.accounts.service.models.network;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\f\b\u0001\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\b\b\u0001\u0010\f\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011Jt\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\f\b\u0003\u0010\u000b\u001a\u00060\tj\u0002`\n2\b\b\u0003\u0010\f\u001a\u00020\u00022\u000e\b\u0003\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b \u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b!\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\"\u0010\u0015R\u001b\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\u0015R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b#\u0010(¨\u0006)"}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/CreateAccountV2Request;", "", "", "email", "firstName", "lastName", "password", "phone", "pin", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "zip", "", "Lcom/meijer/mobile/accounts/service/models/network/PreferenceRequestJson;", "preferences", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;)Lcom/meijer/mobile/accounts/service/models/network/CreateAccountV2Request;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "e", "f", "g", "I", "h", "i", "Ljava/util/List;", "()Ljava/util/List;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CreateAccountV2Request {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String password;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phone;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pin;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zip;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PreferenceRequestJson> preferences;

    public final CreateAccountV2Request copy(@g(name = "email") String email, @g(name = "firstName") String firstName, @g(name = "lastName") String lastName, @g(name = "password") String password, @g(name = "phone") String phone, @g(name = "pin") String pin, @g(name = "preferredStoreId") int storeId, @g(name = "zip") String zip, @g(name = "preferences") List<PreferenceRequestJson> preferences) {
        Intrinsics.j(email, "email");
        Intrinsics.j(firstName, "firstName");
        Intrinsics.j(lastName, "lastName");
        Intrinsics.j(password, "password");
        Intrinsics.j(phone, "phone");
        Intrinsics.j(pin, "pin");
        Intrinsics.j(zip, "zip");
        Intrinsics.j(preferences, "preferences");
        return new CreateAccountV2Request(email, firstName, lastName, password, phone, pin, storeId, zip, preferences);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateAccountV2Request)) {
            return false;
        }
        CreateAccountV2Request createAccountV2Request = (CreateAccountV2Request) other;
        return Intrinsics.e(this.email, createAccountV2Request.email) && Intrinsics.e(this.firstName, createAccountV2Request.firstName) && Intrinsics.e(this.lastName, createAccountV2Request.lastName) && Intrinsics.e(this.password, createAccountV2Request.password) && Intrinsics.e(this.phone, createAccountV2Request.phone) && Intrinsics.e(this.pin, createAccountV2Request.pin) && this.storeId == createAccountV2Request.storeId && Intrinsics.e(this.zip, createAccountV2Request.zip) && Intrinsics.e(this.preferences, createAccountV2Request.preferences);
    }

    public int hashCode() {
        return (((((((((((((((this.email.hashCode() * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.password.hashCode()) * 31) + this.phone.hashCode()) * 31) + this.pin.hashCode()) * 31) + Integer.hashCode(this.storeId)) * 31) + this.zip.hashCode()) * 31) + this.preferences.hashCode();
    }

    public String toString() {
        return "CreateAccountV2Request(email=" + this.email + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", password=" + this.password + ", phone=" + this.phone + ", pin=" + this.pin + ", storeId=" + this.storeId + ", zip=" + this.zip + ", preferences=" + this.preferences + ')';
    }

    public CreateAccountV2Request(@g(name = "email") String email, @g(name = "firstName") String firstName, @g(name = "lastName") String lastName, @g(name = "password") String password, @g(name = "phone") String phone, @g(name = "pin") String pin, @g(name = "preferredStoreId") int i10, @g(name = "zip") String zip, @g(name = "preferences") List<PreferenceRequestJson> preferences) {
        Intrinsics.j(email, "email");
        Intrinsics.j(firstName, "firstName");
        Intrinsics.j(lastName, "lastName");
        Intrinsics.j(password, "password");
        Intrinsics.j(phone, "phone");
        Intrinsics.j(pin, "pin");
        Intrinsics.j(zip, "zip");
        Intrinsics.j(preferences, "preferences");
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.phone = phone;
        this.pin = pin;
        this.storeId = i10;
        this.zip = zip;
        this.preferences = preferences;
    }

    /* renamed from: a, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: b, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: c, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: d, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* renamed from: e, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: f, reason: from getter */
    public final String getPin() {
        return this.pin;
    }

    public final List<PreferenceRequestJson> g() {
        return this.preferences;
    }

    /* renamed from: h, reason: from getter */
    public final int getStoreId() {
        return this.storeId;
    }

    /* renamed from: i, reason: from getter */
    public final String getZip() {
        return this.zip;
    }
}
