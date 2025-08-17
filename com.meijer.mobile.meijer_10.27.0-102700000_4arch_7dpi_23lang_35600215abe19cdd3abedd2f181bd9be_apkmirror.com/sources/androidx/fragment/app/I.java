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
    ArrayList<String> f54850a;

    /* renamed from: b, reason: collision with root package name */
    ArrayList<String> f54851b;

    /* renamed from: c, reason: collision with root package name */
    C5961b[] f54852c;

    /* renamed from: d, reason: collision with root package name */
    int f54853d;

    /* renamed from: e, reason: collision with root package name */
    String f54854e;

    /* renamed from: f, reason: collision with root package name */
    ArrayList<String> f54855f;

    /* renamed from: g, reason: collision with root package name */
    ArrayList<C5962c> f54856g;

    /* renamed from: h, reason: collision with root package name */
    ArrayList<FragmentManager.n> f54857h;

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
        this.f54854e = null;
        this.f54855f = new ArrayList<>();
        this.f54856g = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f54850a);
        parcel.writeStringList(this.f54851b);
        parcel.writeTypedArray(this.f54852c, i10);
        parcel.writeInt(this.f54853d);
        parcel.writeString(this.f54854e);
        parcel.writeStringList(this.f54855f);
        parcel.writeTypedList(this.f54856g);
        parcel.writeTypedList(this.f54857h);
    }

    public I(Parcel parcel) {
        this.f54854e = null;
        this.f54855f = new ArrayList<>();
        this.f54856g = new ArrayList<>();
        this.f54850a = parcel.createStringArrayList();
        this.f54851b = parcel.createStringArrayList();
        this.f54852c = (C5961b[]) parcel.createTypedArray(C5961b.CREATOR);
        this.f54853d = parcel.readInt();
        this.f54854e = parcel.readString();
        this.f54855f = parcel.createStringArrayList();
        this.f54856g = parcel.createTypedArrayList(C5962c.CREATOR);
        this.f54857h = parcel.createTypedArrayList(FragmentManager.n.CREATOR);
    }
}
