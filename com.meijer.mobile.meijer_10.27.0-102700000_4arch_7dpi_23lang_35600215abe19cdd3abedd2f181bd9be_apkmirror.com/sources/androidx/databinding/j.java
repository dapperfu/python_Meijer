package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class j extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private int f54099a;

    class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j[] newArray(int i10) {
            return new j[i10];
        }

        a() {
        }
    }

    public j(int i10) {
        this.f54099a = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int M() {
        return this.f54099a;
    }

    public void N(int i10) {
        if (i10 != this.f54099a) {
            this.f54099a = i10;
            notifyChange();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f54099a);
    }

    public j() {
    }
}
