package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f45567a;

    /* renamed from: b, reason: collision with root package name */
    public int f45568b;

    /* renamed from: c, reason: collision with root package name */
    public int f45569c;

    /* renamed from: d, reason: collision with root package name */
    public int f45570d;

    /* renamed from: e, reason: collision with root package name */
    public int f45571e;

    static class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }

        a() {
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f45567a);
        parcel.writeInt(this.f45569c);
        parcel.writeInt(this.f45570d);
        parcel.writeInt(this.f45571e);
        parcel.writeInt(this.f45568b);
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f45567a = parcel.readInt();
        this.f45569c = parcel.readInt();
        this.f45570d = parcel.readInt();
        this.f45571e = parcel.readInt();
        this.f45568b = parcel.readInt();
    }
}
