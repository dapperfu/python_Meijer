package Be;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
final class o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new p(parcel.readArrayList(e.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new p[i10];
    }

    o() {
    }
}
