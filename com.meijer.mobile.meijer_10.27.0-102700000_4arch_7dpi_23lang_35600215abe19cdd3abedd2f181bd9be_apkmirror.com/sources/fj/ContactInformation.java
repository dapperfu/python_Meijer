package fj;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u001f\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\n¨\u0006\u0015"}, d2 = {"Lfj/a;", "", "", "Lcom/meijer/mobile/core/model/common/EmailAddress;", "emailAddress", "Lcom/meijer/mobile/core/model/common/PhoneNumber;", "phoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fj.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class ContactInformation {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String emailAddress;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phoneNumber;

    /* JADX WARN: Multi-variable type inference failed */
    public ContactInformation() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactInformation)) {
            return false;
        }
        ContactInformation contactInformation = (ContactInformation) other;
        return Intrinsics.e(this.emailAddress, contactInformation.emailAddress) && Intrinsics.e(this.phoneNumber, contactInformation.phoneNumber);
    }

    public ContactInformation(String str, String str2) {
        this.emailAddress = str;
        this.phoneNumber = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getEmailAddress() {
        return this.emailAddress;
    }

    /* renamed from: b, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        String str = this.emailAddress;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.phoneNumber;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ContactInformation(emailAddress=" + this.emailAddress + ", phoneNumber=" + this.phoneNumber + ')';
    }

    public /* synthetic */ ContactInformation(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
