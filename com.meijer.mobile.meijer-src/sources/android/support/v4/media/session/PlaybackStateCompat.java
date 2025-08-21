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
    final int f45796a;

    /* renamed from: b, reason: collision with root package name */
    final long f45797b;

    /* renamed from: c, reason: collision with root package name */
    final long f45798c;

    /* renamed from: d, reason: collision with root package name */
    final float f45799d;

    /* renamed from: e, reason: collision with root package name */
    final long f45800e;

    /* renamed from: f, reason: collision with root package name */
    final int f45801f;

    /* renamed from: g, reason: collision with root package name */
    final CharSequence f45802g;

    /* renamed from: h, reason: collision with root package name */
    final long f45803h;

    /* renamed from: i, reason: collision with root package name */
    List<CustomAction> f45804i;

    /* renamed from: j, reason: collision with root package name */
    final long f45805j;

    /* renamed from: k, reason: collision with root package name */
    final Bundle f45806k;

    /* renamed from: l, reason: collision with root package name */
    private Object f45807l;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f45808a;

        /* renamed from: b, reason: collision with root package name */
        private final CharSequence f45809b;

        /* renamed from: c, reason: collision with root package name */
        private final int f45810c;

        /* renamed from: d, reason: collision with root package name */
        private final Bundle f45811d;

        /* renamed from: e, reason: collision with root package name */
        private Object f45812e;

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
            this.f45808a = str;
            this.f45809b = charSequence;
            this.f45810c = i10;
            this.f45811d = bundle;
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
            customAction.f45812e = obj;
            return customAction;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f45809b) + ", mIcon=" + this.f45810c + ", mExtras=" + this.f45811d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f45808a);
            TextUtils.writeToParcel(this.f45809b, parcel, i10);
            parcel.writeInt(this.f45810c);
            parcel.writeBundle(this.f45811d);
        }

        CustomAction(Parcel parcel) {
            this.f45808a = parcel.readString();
            this.f45809b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f45810c = parcel.readInt();
            this.f45811d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
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
        this.f45796a = i10;
        this.f45797b = j10;
        this.f45798c = j11;
        this.f45799d = f10;
        this.f45800e = j12;
        this.f45801f = i11;
        this.f45802g = charSequence;
        this.f45803h = j13;
        this.f45804i = new ArrayList(list);
        this.f45805j = j14;
        this.f45806k = bundle;
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
        playbackStateCompat.f45807l = obj;
        return playbackStateCompat;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f45796a + ", position=" + this.f45797b + ", buffered position=" + this.f45798c + ", speed=" + this.f45799d + ", updated=" + this.f45803h + ", actions=" + this.f45800e + ", error code=" + this.f45801f + ", error message=" + this.f45802g + ", custom actions=" + this.f45804i + ", active item id=" + this.f45805j + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f45796a);
        parcel.writeLong(this.f45797b);
        parcel.writeFloat(this.f45799d);
        parcel.writeLong(this.f45803h);
        parcel.writeLong(this.f45798c);
        parcel.writeLong(this.f45800e);
        TextUtils.writeToParcel(this.f45802g, parcel, i10);
        parcel.writeTypedList(this.f45804i);
        parcel.writeLong(this.f45805j);
        parcel.writeBundle(this.f45806k);
        parcel.writeInt(this.f45801f);
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f45796a = parcel.readInt();
        this.f45797b = parcel.readLong();
        this.f45799d = parcel.readFloat();
        this.f45803h = parcel.readLong();
        this.f45798c = parcel.readLong();
        this.f45800e = parcel.readLong();
        this.f45802g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f45804i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f45805j = parcel.readLong();
        this.f45806k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f45801f = parcel.readInt();
    }
}
