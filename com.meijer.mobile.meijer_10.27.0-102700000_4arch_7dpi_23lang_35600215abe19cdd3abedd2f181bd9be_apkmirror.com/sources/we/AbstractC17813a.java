package we;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"RestrictedApi"})
/* renamed from: we.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC17813a implements Parcelable {
    public static final Parcelable.Creator<AbstractC17813a> CREATOR = new e();

    abstract PendingIntent a();

    abstract boolean b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(a(), 0);
        parcel.writeInt(b() ? 1 : 0);
    }
}
