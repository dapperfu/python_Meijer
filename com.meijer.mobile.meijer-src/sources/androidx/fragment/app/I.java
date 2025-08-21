package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class I implements Parcelable {
    public static final Parcelable.Creator<I> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    ArrayList<String> f55074a;

    /* renamed from: b, reason: collision with root package name */
    ArrayList<String> f55075b;

    /* renamed from: c, reason: collision with root package name */
    C6103b[] f55076c;

    /* renamed from: d, reason: collision with root package name */
    int f55077d;

    /* renamed from: e, reason: collision with root package name */
    String f55078e;

    /* renamed from: f, reason: collision with root package name */
    ArrayList<String> f55079f;

    /* renamed from: g, reason: collision with root package name */
    ArrayList<C6104c> f55080g;

    /* renamed from: h, reason: collision with root package name */
    ArrayList<FragmentManager.n> f55081h;

    class a implements Parcelable.Creator<I> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public I createFromParcel(Parcel parcel) {
            return new I(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public I[] newArray(int i10) {
            return new I[i10];
        }

        a() {
        }
    }

    public I() {
        this.f55078e = null;
        this.f55079f = new ArrayList<>();
        this.f55080g = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f55074a);
        parcel.writeStringList(this.f55075b);
        parcel.writeTypedArray(this.f55076c, i10);
        parcel.writeInt(this.f55077d);
        parcel.writeString(this.f55078e);
        parcel.writeStringList(this.f55079f);
        parcel.writeTypedList(this.f55080g);
        parcel.writeTypedList(this.f55081h);
    }

    public I(Parcel parcel) {
        this.f55078e = null;
        this.f55079f = new ArrayList<>();
        this.f55080g = new ArrayList<>();
        this.f55074a = parcel.createStringArrayList();
        this.f55075b = parcel.createStringArrayList();
        this.f55076c = (C6103b[]) parcel.createTypedArray(C6103b.CREATOR);
        this.f55077d = parcel.readInt();
        this.f55078e = parcel.readString();
        this.f55079f = parcel.createStringArrayList();
        this.f55080g = parcel.createTypedArrayList(C6104c.CREATOR);
        this.f55081h = parcel.createTypedArrayList(FragmentManager.n.CREATOR);
    }
}
