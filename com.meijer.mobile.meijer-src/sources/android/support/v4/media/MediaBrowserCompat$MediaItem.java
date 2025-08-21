package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final int f45752a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaDescriptionCompat f45753b;

    static class a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaBrowserCompat$MediaItem[] newArray(int i10) {
            return new MediaBrowserCompat$MediaItem[i10];
        }

        a() {
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaItem{mFlags=" + this.f45752a + ", mDescription=" + this.f45753b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f45752a);
        this.f45753b.writeToParcel(parcel, i10);
    }

    MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f45752a = parcel.readInt();
        this.f45753b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }
}
