package hd;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }

    j() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new l(parcel.readStrongBinder());
    }
}
