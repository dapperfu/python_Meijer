package Dh;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001e\u0010\u001dR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u001d¨\u0006!"}, d2 = {"LDh/k;", "Landroid/os/Parcelable;", "", "preferenceTypeName", "owningProgramName", "preferenceValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "setPreferenceTypeName", "(Ljava/lang/String;)V", "setOwningProgramName", "c", "setPreferenceValue", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Dh.k, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class CustomerPreference implements Parcelable {
    public static final Parcelable.Creator<CustomerPreference> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private String preferenceTypeName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String owningProgramName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String preferenceValue;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Dh.k$a */
    public static final class a implements Parcelable.Creator<CustomerPreference> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CustomerPreference createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new CustomerPreference(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CustomerPreference[] newArray(int i10) {
            return new CustomerPreference[i10];
        }
    }

    public CustomerPreference() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerPreference)) {
            return false;
        }
        CustomerPreference customerPreference = (CustomerPreference) other;
        return Intrinsics.e(this.preferenceTypeName, customerPreference.preferenceTypeName) && Intrinsics.e(this.owningProgramName, customerPreference.owningProgramName) && Intrinsics.e(this.preferenceValue, customerPreference.preferenceValue);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.preferenceTypeName);
        dest.writeString(this.owningProgramName);
        dest.writeString(this.preferenceValue);
    }

    public CustomerPreference(String preferenceTypeName, String owningProgramName, String preferenceValue) {
        Intrinsics.j(preferenceTypeName, "preferenceTypeName");
        Intrinsics.j(owningProgramName, "owningProgramName");
        Intrinsics.j(preferenceValue, "preferenceValue");
        this.preferenceTypeName = preferenceTypeName;
        this.owningProgramName = owningProgramName;
        this.preferenceValue = preferenceValue;
    }

    /* renamed from: a, reason: from getter */
    public final String getOwningProgramName() {
        return this.owningProgramName;
    }

    /* renamed from: b, reason: from getter */
    public final String getPreferenceTypeName() {
        return this.preferenceTypeName;
    }

    /* renamed from: c, reason: from getter */
    public final String getPreferenceValue() {
        return this.preferenceValue;
    }

    public int hashCode() {
        return (((this.preferenceTypeName.hashCode() * 31) + this.owningProgramName.hashCode()) * 31) + this.preferenceValue.hashCode();
    }

    public String toString() {
        return "CustomerPreference(preferenceTypeName=" + this.preferenceTypeName + ", owningProgramName=" + this.owningProgramName + ", preferenceValue=" + this.preferenceValue + ')';
    }

    public /* synthetic */ CustomerPreference(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3);
    }
}
