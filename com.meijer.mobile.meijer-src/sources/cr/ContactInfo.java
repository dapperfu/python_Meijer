package cr;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u001f\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcr/a;", "Landroid/os/Parcelable;", "", "Lcom/meijer/mobile/core/model/common/EmailAddress;", "contactEmail", "Lcom/meijer/mobile/core/model/common/PhoneNumber;", "contactPhone", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getContactEmail", "b", "getContactPhone", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cr.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
public final /* data */ class ContactInfo implements Parcelable {
    public static final Parcelable.Creator<ContactInfo> CREATOR = new C1994a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String contactEmail;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String contactPhone;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: cr.a$a, reason: collision with other inner class name */
    public static final class C1994a implements Parcelable.Creator<ContactInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ContactInfo createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new ContactInfo(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ContactInfo[] newArray(int i10) {
            return new ContactInfo[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContactInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactInfo)) {
            return false;
        }
        ContactInfo contactInfo = (ContactInfo) other;
        return Intrinsics.e(this.contactEmail, contactInfo.contactEmail) && Intrinsics.e(this.contactPhone, contactInfo.contactPhone);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.contactEmail);
        dest.writeString(this.contactPhone);
    }

    public ContactInfo(String str, String str2) {
        this.contactEmail = str;
        this.contactPhone = str2;
    }

    public int hashCode() {
        String str = this.contactEmail;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.contactPhone;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ContactInfo(contactEmail=" + this.contactEmail + ", contactPhone=" + this.contactPhone + ')';
    }

    public /* synthetic */ ContactInfo(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
