package com.meijer.mobile.cart.model.hybris.checkout;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ8\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupPerson;", "", "", "firstName", "lastName", "email", "phoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupPerson;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class HybrisPickupPerson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phoneNumber;

    public HybrisPickupPerson(@g(name = "firstName") String firstName, @g(name = "lastName") String lastName, @g(name = "email") String email, @g(name = "phoneNumber") String phoneNumber) {
        Intrinsics.j(firstName, "firstName");
        Intrinsics.j(lastName, "lastName");
        Intrinsics.j(email, "email");
        Intrinsics.j(phoneNumber, "phoneNumber");
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public final HybrisPickupPerson copy(@g(name = "firstName") String firstName, @g(name = "lastName") String lastName, @g(name = "email") String email, @g(name = "phoneNumber") String phoneNumber) {
        Intrinsics.j(firstName, "firstName");
        Intrinsics.j(lastName, "lastName");
        Intrinsics.j(email, "email");
        Intrinsics.j(phoneNumber, "phoneNumber");
        return new HybrisPickupPerson(firstName, lastName, email, phoneNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisPickupPerson)) {
            return false;
        }
        HybrisPickupPerson hybrisPickupPerson = (HybrisPickupPerson) other;
        return Intrinsics.e(this.firstName, hybrisPickupPerson.firstName) && Intrinsics.e(this.lastName, hybrisPickupPerson.lastName) && Intrinsics.e(this.email, hybrisPickupPerson.email) && Intrinsics.e(this.phoneNumber, hybrisPickupPerson.phoneNumber);
    }

    public int hashCode() {
        return (((((this.firstName.hashCode() * 31) + this.lastName.hashCode()) * 31) + this.email.hashCode()) * 31) + this.phoneNumber.hashCode();
    }

    public String toString() {
        return "HybrisPickupPerson(firstName=" + this.firstName + ", lastName=" + this.lastName + ", email=" + this.email + ", phoneNumber=" + this.phoneNumber + ')';
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
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public /* synthetic */ HybrisPickupPerson(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? "" : str4);
    }
}
