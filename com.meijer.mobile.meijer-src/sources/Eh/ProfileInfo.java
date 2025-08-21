package Eh;

import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001b"}, d2 = {"LEh/u;", "", "Lbk/a;", "firstName", "lastName", "phoneNumber", "email", "homeStore", "<init>", "(Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbk/a;", "b", "()Lbk/a;", "d", "c", "e", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Eh.u, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class ProfileInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a firstName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a lastName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a phoneNumber;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a email;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a homeStore;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileInfo)) {
            return false;
        }
        ProfileInfo profileInfo = (ProfileInfo) other;
        return Intrinsics.e(this.firstName, profileInfo.firstName) && Intrinsics.e(this.lastName, profileInfo.lastName) && Intrinsics.e(this.phoneNumber, profileInfo.phoneNumber) && Intrinsics.e(this.email, profileInfo.email) && Intrinsics.e(this.homeStore, profileInfo.homeStore);
    }

    public ProfileInfo(AbstractC6392a firstName, AbstractC6392a lastName, AbstractC6392a phoneNumber, AbstractC6392a email, AbstractC6392a homeStore) {
        Intrinsics.j(firstName, "firstName");
        Intrinsics.j(lastName, "lastName");
        Intrinsics.j(phoneNumber, "phoneNumber");
        Intrinsics.j(email, "email");
        Intrinsics.j(homeStore, "homeStore");
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.homeStore = homeStore;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC6392a getEmail() {
        return this.email;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC6392a getFirstName() {
        return this.firstName;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC6392a getHomeStore() {
        return this.homeStore;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC6392a getLastName() {
        return this.lastName;
    }

    /* renamed from: e, reason: from getter */
    public final AbstractC6392a getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        return (((((((this.firstName.hashCode() * 31) + this.lastName.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.email.hashCode()) * 31) + this.homeStore.hashCode();
    }

    public String toString() {
        return "ProfileInfo(firstName=" + this.firstName + ", lastName=" + this.lastName + ", phoneNumber=" + this.phoneNumber + ", email=" + this.email + ", homeStore=" + this.homeStore + ')';
    }
}
