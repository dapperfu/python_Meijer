package ye;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new d((PendingIntent) parcel.readParcelable(AbstractC18306a.class.getClassLoader()), parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AbstractC18306a[i10];
    }

    e() {
    }
}
