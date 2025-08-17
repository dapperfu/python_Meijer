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
    private final String f45530a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f45531b;

    /* renamed from: c, reason: collision with root package name */
    private final CharSequence f45532c;

    /* renamed from: d, reason: collision with root package name */
    private final CharSequence f45533d;

    /* renamed from: e, reason: collision with root package name */
    private final Bitmap f45534e;

    /* renamed from: f, reason: collision with root package name */
    private final Uri f45535f;

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f45536g;

    /* renamed from: h, reason: collision with root package name */
    private final Uri f45537h;

    /* renamed from: i, reason: collision with root package name */
    private Object f45538i;

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
        private String f45539a;

        /* renamed from: b, reason: collision with root package name */
        private CharSequence f45540b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f45541c;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f45542d;

        /* renamed from: e, reason: collision with root package name */
        private Bitmap f45543e;

        /* renamed from: f, reason: collision with root package name */
        private Uri f45544f;

        /* renamed from: g, reason: collision with root package name */
        private Bundle f45545g;

        /* renamed from: h, reason: collision with root package name */
        private Uri f45546h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f45539a, this.f45540b, this.f45541c, this.f45542d, this.f45543e, this.f45544f, this.f45545g, this.f45546h);
        }

        public b b(CharSequence charSequence) {
            this.f45542d = charSequence;
            return this;
        }

        public b c(Bundle bundle) {
            this.f45545g = bundle;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.f45543e = bitmap;
            return this;
        }

        public b e(Uri uri) {
            this.f45544f = uri;
            return this;
        }

        public b f(String str) {
            this.f45539a = str;
            return this;
        }

        public b g(Uri uri) {
            this.f45546h = uri;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.f45541c = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.f45540b = charSequence;
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
        mediaDescriptionCompatA.f45538i = obj;
        return mediaDescriptionCompatA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Object b() {
        Object obj = this.f45538i;
        if (obj != null) {
            return obj;
        }
        Object objB = a.C0950a.b();
        a.C0950a.g(objB, this.f45530a);
        a.C0950a.i(objB, this.f45531b);
        a.C0950a.h(objB, this.f45532c);
        a.C0950a.c(objB, this.f45533d);
        a.C0950a.e(objB, this.f45534e);
        a.C0950a.f(objB, this.f45535f);
        a.C0950a.d(objB, this.f45536g);
        b.a.a(objB, this.f45537h);
        Object objA = a.C0950a.a(objB);
        this.f45538i = objA;
        return objA;
    }

    public String toString() {
        return ((Object) this.f45531b) + ", " + ((Object) this.f45532c) + ", " + ((Object) this.f45533d);
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f45530a = str;
        this.f45531b = charSequence;
        this.f45532c = charSequence2;
        this.f45533d = charSequence3;
        this.f45534e = bitmap;
        this.f45535f = uri;
        this.f45536g = bundle;
        this.f45537h = uri2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        android.support.v4.media.a.i(b(), parcel, i10);
    }
}
