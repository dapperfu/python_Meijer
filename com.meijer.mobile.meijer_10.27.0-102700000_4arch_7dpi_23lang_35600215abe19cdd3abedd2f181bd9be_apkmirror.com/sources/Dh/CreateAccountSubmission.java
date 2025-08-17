package Dh;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001a\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b \u0010\u0013R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u0013R\u001b\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010\u0015R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b!\u0010&¨\u0006'"}, d2 = {"LDh/i;", "", "", "firstName", "lastName", "email", "password", "phone", "pin", "zip", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "LDh/o;", "preferenceList", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "e", "f", "g", "i", "h", "I", "Ljava/util/List;", "()Ljava/util/List;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Dh.i, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class CreateAccountSubmission {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String password;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phone;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pin;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zip;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Preference> preferenceList;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateAccountSubmission)) {
            return false;
        }
        CreateAccountSubmission createAccountSubmission = (CreateAccountSubmission) other;
        return Intrinsics.e(this.firstName, createAccountSubmission.firstName) && Intrinsics.e(this.lastName, createAccountSubmission.lastName) && Intrinsics.e(this.email, createAccountSubmission.email) && Intrinsics.e(this.password, createAccountSubmission.password) && Intrinsics.e(this.phone, createAccountSubmission.phone) && Intrinsics.e(this.pin, createAccountSubmission.pin) && Intrinsics.e(this.zip, createAccountSubmission.zip) && this.storeId == createAccountSubmission.storeId && Intrinsics.e(this.preferenceList, createAccountSubmission.preferenceList);
    }

    public CreateAccountSubmission(String firstName, String lastName, String email, String password, String phone, String pin, String zip, int i10, List<Preference> preferenceList) {
        Intrinsics.j(firstName, "firstName");
        Intrinsics.j(lastName, "lastName");
        Intrinsics.j(email, "email");
        Intrinsics.j(password, "password");
        Intrinsics.j(phone, "phone");
        Intrinsics.j(pin, "pin");
        Intrinsics.j(zip, "zip");
        Intrinsics.j(preferenceList, "preferenceList");
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.pin = pin;
        this.zip = zip;
        this.storeId = i10;
        this.preferenceList = preferenceList;
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

    public final List<Preference> g() {
        return this.preferenceList;
    }

    /* renamed from: h, reason: from getter */
    public final int getStoreId() {
        return this.storeId;
    }

    public int hashCode() {
        return (((((((((((((((this.firstName.hashCode() * 31) + this.lastName.hashCode()) * 31) + this.email.hashCode()) * 31) + this.password.hashCode()) * 31) + this.phone.hashCode()) * 31) + this.pin.hashCode()) * 31) + this.zip.hashCode()) * 31) + Integer.hashCode(this.storeId)) * 31) + this.preferenceList.hashCode();
    }

    /* renamed from: i, reason: from getter */
    public final String getZip() {
        return this.zip;
    }

    public String toString() {
        return "CreateAccountSubmission(firstName=" + this.firstName + ", lastName=" + this.lastName + ", email=" + this.email + ", password=" + this.password + ", phone=" + this.phone + ", pin=" + this.pin + ", zip=" + this.zip + ", storeId=" + this.storeId + ", preferenceList=" + this.preferenceList + ')';
    }
}
