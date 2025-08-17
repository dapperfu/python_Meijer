package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.g;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final int f45572a;

    /* renamed from: b, reason: collision with root package name */
    final long f45573b;

    /* renamed from: c, reason: collision with root package name */
    final long f45574c;

    /* renamed from: d, reason: collision with root package name */
    final float f45575d;

    /* renamed from: e, reason: collision with root package name */
    final long f45576e;

    /* renamed from: f, reason: collision with root package name */
    final int f45577f;

    /* renamed from: g, reason: collision with root package name */
    final CharSequence f45578g;

    /* renamed from: h, reason: collision with root package name */
    final long f45579h;

    /* renamed from: i, reason: collision with root package name */
    List<CustomAction> f45580i;

    /* renamed from: j, reason: collision with root package name */
    final long f45581j;

    /* renamed from: k, reason: collision with root package name */
    final Bundle f45582k;

    /* renamed from: l, reason: collision with root package name */
    private Object f45583l;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f45584a;

        /* renamed from: b, reason: collision with root package name */
        private final CharSequence f45585b;

        /* renamed from: c, reason: collision with root package name */
        private final int f45586c;

        /* renamed from: d, reason: collision with root package name */
        private final Bundle f45587d;

        /* renamed from: e, reason: collision with root package name */
        private Object f45588e;

        static class a implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }

            a() {
            }
        }

        CustomAction(String str, CharSequence charSequence, int i10, Bundle bundle) {
            this.f45584a = str;
            this.f45585b = charSequence;
            this.f45586c = i10;
            this.f45587d = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static CustomAction a(Object obj) {
            if (obj == null) {
                return null;
            }
            CustomAction customAction = new CustomAction(g.a.a(obj), g.a.d(obj), g.a.c(obj), g.a.b(obj));
            customAction.f45588e = obj;
            return customAction;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f45585b) + ", mIcon=" + this.f45586c + ", mExtras=" + this.f45587d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f45584a);
            TextUtils.writeToParcel(this.f45585b, parcel, i10);
            parcel.writeInt(this.f45586c);
            parcel.writeBundle(this.f45587d);
        }

        CustomAction(Parcel parcel) {
            this.f45584a = parcel.readString();
            this.f45585b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f45586c = parcel.readInt();
            this.f45587d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    static class a implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }

        a() {
        }
    }

    PlaybackStateCompat(int i10, long j10, long j11, float f10, long j12, int i11, CharSequence charSequence, long j13, List<CustomAction> list, long j14, Bundle bundle) {
        this.f45572a = i10;
        this.f45573b = j10;
        this.f45574c = j11;
        this.f45575d = f10;
        this.f45576e = j12;
        this.f45577f = i11;
        this.f45578g = charSequence;
        this.f45579h = j13;
        this.f45580i = new ArrayList(list);
        this.f45581j = j14;
        this.f45582k = bundle;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        List<Object> listD = g.d(obj);
        if (listD != null) {
            arrayList = new ArrayList(listD.size());
            Iterator<Object> it = listD.iterator();
            while (it.hasNext()) {
                arrayList.add(CustomAction.a(it.next()));
            }
        }
        Bundle bundleA = h.a(obj);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(g.i(obj), g.h(obj), g.c(obj), g.g(obj), g.a(obj), 0, g.e(obj), g.f(obj), arrayList, g.b(obj), bundleA);
        playbackStateCompat.f45583l = obj;
        return playbackStateCompat;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f45572a + ", position=" + this.f45573b + ", buffered position=" + this.f45574c + ", speed=" + this.f45575d + ", updated=" + this.f45579h + ", actions=" + this.f45576e + ", error code=" + this.f45577f + ", error message=" + this.f45578g + ", custom actions=" + this.f45580i + ", active item id=" + this.f45581j + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f45572a);
        parcel.writeLong(this.f45573b);
        parcel.writeFloat(this.f45575d);
        parcel.writeLong(this.f45579h);
        parcel.writeLong(this.f45574c);
        parcel.writeLong(this.f45576e);
        TextUtils.writeToParcel(this.f45578g, parcel, i10);
        parcel.writeTypedList(this.f45580i);
        parcel.writeLong(this.f45581j);
        parcel.writeBundle(this.f45582k);
        parcel.writeInt(this.f45577f);
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f45572a = parcel.readInt();
        this.f45573b = parcel.readLong();
        this.f45575d = parcel.readFloat();
        this.f45579h = parcel.readLong();
        this.f45574c = parcel.readLong();
        this.f45576e = parcel.readLong();
        this.f45578g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f45580i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f45581j = parcel.readLong();
        this.f45582k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f45577f = parcel.readInt();
    }
}
