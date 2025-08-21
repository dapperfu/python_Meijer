package android.support.v4.media;

import Z.C5603a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: c, reason: collision with root package name */
    static final C5603a<String, Integer> f45771c;

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f45772d;

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f45773e;

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f45774f;

    /* renamed from: a, reason: collision with root package name */
    final Bundle f45775a;

    /* renamed from: b, reason: collision with root package name */
    private Object f45776b;

    static class a implements Parcelable.Creator<MediaMetadataCompat> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat[] newArray(int i10) {
            return new MediaMetadataCompat[i10];
        }

        a() {
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    static {
        C5603a<String, Integer> c5603a = new C5603a<>();
        f45771c = c5603a;
        c5603a.put("android.media.metadata.TITLE", 1);
        c5603a.put("android.media.metadata.ARTIST", 1);
        c5603a.put("android.media.metadata.DURATION", 0);
        c5603a.put("android.media.metadata.ALBUM", 1);
        c5603a.put("android.media.metadata.AUTHOR", 1);
        c5603a.put("android.media.metadata.WRITER", 1);
        c5603a.put("android.media.metadata.COMPOSER", 1);
        c5603a.put("android.media.metadata.COMPILATION", 1);
        c5603a.put("android.media.metadata.DATE", 1);
        c5603a.put("android.media.metadata.YEAR", 0);
        c5603a.put("android.media.metadata.GENRE", 1);
        c5603a.put("android.media.metadata.TRACK_NUMBER", 0);
        c5603a.put("android.media.metadata.NUM_TRACKS", 0);
        c5603a.put("android.media.metadata.DISC_NUMBER", 0);
        c5603a.put("android.media.metadata.ALBUM_ARTIST", 1);
        c5603a.put("android.media.metadata.ART", 2);
        c5603a.put("android.media.metadata.ART_URI", 1);
        c5603a.put("android.media.metadata.ALBUM_ART", 2);
        c5603a.put("android.media.metadata.ALBUM_ART_URI", 1);
        c5603a.put("android.media.metadata.USER_RATING", 3);
        c5603a.put("android.media.metadata.RATING", 3);
        c5603a.put("android.media.metadata.DISPLAY_TITLE", 1);
        c5603a.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c5603a.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c5603a.put("android.media.metadata.DISPLAY_ICON", 2);
        c5603a.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c5603a.put("android.media.metadata.MEDIA_ID", 1);
        c5603a.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c5603a.put("android.media.metadata.MEDIA_URI", 1);
        c5603a.put("android.media.metadata.ADVERTISEMENT", 0);
        c5603a.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f45772d = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f45773e = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f45774f = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new a();
    }

    public static MediaMetadataCompat a(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        c.a(obj, parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel = CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        mediaMetadataCompatCreateFromParcel.f45776b = obj;
        return mediaMetadataCompatCreateFromParcel;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeBundle(this.f45775a);
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f45775a = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
}
