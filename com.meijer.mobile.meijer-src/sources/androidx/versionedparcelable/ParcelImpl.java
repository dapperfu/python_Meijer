package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes4.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final J4.a f59096a;

    static class a implements Parcelable.Creator<ParcelImpl> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelImpl[] newArray(int i10) {
            return new ParcelImpl[i10];
        }

        a() {
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        new androidx.versionedparcelable.a(parcel).L(this.f59096a);
    }

    protected ParcelImpl(Parcel parcel) {
        this.f59096a = new androidx.versionedparcelable.a(parcel).u();
    }
}
