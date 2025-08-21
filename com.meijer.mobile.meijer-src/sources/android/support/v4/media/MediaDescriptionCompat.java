package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.support.v4.media.b;
import android.support.v4.media.session.MediaSessionCompat;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f45754a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f45755b;

    /* renamed from: c, reason: collision with root package name */
    private final CharSequence f45756c;

    /* renamed from: d, reason: collision with root package name */
    private final CharSequence f45757d;

    /* renamed from: e, reason: collision with root package name */
    private final Bitmap f45758e;

    /* renamed from: f, reason: collision with root package name */
    private final Uri f45759f;

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f45760g;

    /* renamed from: h, reason: collision with root package name */
    private final Uri f45761h;

    /* renamed from: i, reason: collision with root package name */
    private Object f45762i;

    static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }

        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(android.support.v4.media.a.a(parcel));
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private String f45763a;

        /* renamed from: b, reason: collision with root package name */
        private CharSequence f45764b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f45765c;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f45766d;

        /* renamed from: e, reason: collision with root package name */
        private Bitmap f45767e;

        /* renamed from: f, reason: collision with root package name */
        private Uri f45768f;

        /* renamed from: g, reason: collision with root package name */
        private Bundle f45769g;

        /* renamed from: h, reason: collision with root package name */
        private Uri f45770h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f45763a, this.f45764b, this.f45765c, this.f45766d, this.f45767e, this.f45768f, this.f45769g, this.f45770h);
        }

        public b b(CharSequence charSequence) {
            this.f45766d = charSequence;
            return this;
        }

        public b c(Bundle bundle) {
            this.f45769g = bundle;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.f45767e = bitmap;
            return this;
        }

        public b e(Uri uri) {
            this.f45768f = uri;
            return this;
        }

        public b f(String str) {
            this.f45763a = str;
            return this;
        }

        public b g(Uri uri) {
            this.f45770h = uri;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.f45765c = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.f45764b = charSequence;
            return this;
        }
    }

    public static MediaDescriptionCompat a(Object obj) {
        Uri uri;
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        b bVar = new b();
        bVar.f(android.support.v4.media.a.f(obj));
        bVar.i(android.support.v4.media.a.h(obj));
        bVar.h(android.support.v4.media.a.g(obj));
        bVar.b(android.support.v4.media.a.b(obj));
        bVar.d(android.support.v4.media.a.d(obj));
        bVar.e(android.support.v4.media.a.e(obj));
        Bundle bundleC = android.support.v4.media.a.c(obj);
        if (bundleC != null) {
            MediaSessionCompat.a(bundleC);
            uri = (Uri) bundleC.getParcelable("android.support.v4.media.description.MEDIA_URI");
        } else {
            uri = null;
        }
        if (uri == null) {
            bundle = bundleC;
        } else if (!bundleC.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleC.size() != 2) {
            bundleC.remove("android.support.v4.media.description.MEDIA_URI");
            bundleC.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleC;
        }
        bVar.c(bundle);
        if (uri != null) {
            bVar.g(uri);
        } else {
            bVar.g(android.support.v4.media.b.a(obj));
        }
        MediaDescriptionCompat mediaDescriptionCompatA = bVar.a();
        mediaDescriptionCompatA.f45762i = obj;
        return mediaDescriptionCompatA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Object b() {
        Object obj = this.f45762i;
        if (obj != null) {
            return obj;
        }
        Object objB = a.C0963a.b();
        a.C0963a.g(objB, this.f45754a);
        a.C0963a.i(objB, this.f45755b);
        a.C0963a.h(objB, this.f45756c);
        a.C0963a.c(objB, this.f45757d);
        a.C0963a.e(objB, this.f45758e);
        a.C0963a.f(objB, this.f45759f);
        a.C0963a.d(objB, this.f45760g);
        b.a.a(objB, this.f45761h);
        Object objA = a.C0963a.a(objB);
        this.f45762i = objA;
        return objA;
    }

    public String toString() {
        return ((Object) this.f45755b) + ", " + ((Object) this.f45756c) + ", " + ((Object) this.f45757d);
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f45754a = str;
        this.f45755b = charSequence;
        this.f45756c = charSequence2;
        this.f45757d = charSequence3;
        this.f45758e = bitmap;
        this.f45759f = uri;
        this.f45760g = bundle;
        this.f45761h = uri2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        android.support.v4.media.a.i(b(), parcel, i10);
    }
}
