package ze;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
final class n extends AbstractC18446a {
    public static final Parcelable.Creator<n> CREATOR = new m();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    n(int i10, int i11, String str, String str2, String str3) {
        super(i10, i11, str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(getWidth());
        parcel.writeInt(getHeight());
        if (F0() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(F0());
        }
        if (b() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(b());
        }
        if (c() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(c());
        }
    }
}
