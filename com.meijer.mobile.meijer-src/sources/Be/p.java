package Be;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes4.dex */
final class p extends b {
    public static final Parcelable.Creator<p> CREATOR = new o();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    p(List list) {
        super(list);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(b());
    }
}
