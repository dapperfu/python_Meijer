package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.view.AbstractC6165l;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final String f55095a;

    /* renamed from: b, reason: collision with root package name */
    final String f55096b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f55097c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f55098d;

    /* renamed from: e, reason: collision with root package name */
    final int f55099e;

    /* renamed from: f, reason: collision with root package name */
    final int f55100f;

    /* renamed from: g, reason: collision with root package name */
    final String f55101g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f55102h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f55103i;

    /* renamed from: j, reason: collision with root package name */
    final boolean f55104j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f55105k;

    /* renamed from: l, reason: collision with root package name */
    final int f55106l;

    /* renamed from: m, reason: collision with root package name */
    final String f55107m;

    /* renamed from: n, reason: collision with root package name */
    final int f55108n;

    /* renamed from: o, reason: collision with root package name */
    final boolean f55109o;

    class a implements Parcelable.Creator<N> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public N createFromParcel(Parcel parcel) {
            return new N(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public N[] newArray(int i10) {
            return new N[i10];
        }

        a() {
        }
    }

    N(Fragment fragment) {
        this.f55095a = fragment.getClass().getName();
        this.f55096b = fragment.mWho;
        this.f55097c = fragment.mFromLayout;
        this.f55098d = fragment.mInDynamicContainer;
        this.f55099e = fragment.mFragmentId;
        this.f55100f = fragment.mContainerId;
        this.f55101g = fragment.mTag;
        this.f55102h = fragment.mRetainInstance;
        this.f55103i = fragment.mRemoving;
        this.f55104j = fragment.mDetached;
        this.f55105k = fragment.mHidden;
        this.f55106l = fragment.mMaxState.ordinal();
        this.f55107m = fragment.mTargetWho;
        this.f55108n = fragment.mTargetRequestCode;
        this.f55109o = fragment.mUserVisibleHint;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    Fragment a(C6123w c6123w, ClassLoader classLoader) {
        Fragment fragmentInstantiate = c6123w.instantiate(classLoader, this.f55095a);
        fragmentInstantiate.mWho = this.f55096b;
        fragmentInstantiate.mFromLayout = this.f55097c;
        fragmentInstantiate.mInDynamicContainer = this.f55098d;
        fragmentInstantiate.mRestored = true;
        fragmentInstantiate.mFragmentId = this.f55099e;
        fragmentInstantiate.mContainerId = this.f55100f;
        fragmentInstantiate.mTag = this.f55101g;
        fragmentInstantiate.mRetainInstance = this.f55102h;
        fragmentInstantiate.mRemoving = this.f55103i;
        fragmentInstantiate.mDetached = this.f55104j;
        fragmentInstantiate.mHidden = this.f55105k;
        fragmentInstantiate.mMaxState = AbstractC6165l.b.values()[this.f55106l];
        fragmentInstantiate.mTargetWho = this.f55107m;
        fragmentInstantiate.mTargetRequestCode = this.f55108n;
        fragmentInstantiate.mUserVisibleHint = this.f55109o;
        return fragmentInstantiate;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f55095a);
        sb2.append(" (");
        sb2.append(this.f55096b);
        sb2.append(")}:");
        if (this.f55097c) {
            sb2.append(" fromLayout");
        }
        if (this.f55098d) {
            sb2.append(" dynamicContainer");
        }
        if (this.f55100f != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f55100f));
        }
        String str = this.f55101g;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f55101g);
        }
        if (this.f55102h) {
            sb2.append(" retainInstance");
        }
        if (this.f55103i) {
            sb2.append(" removing");
        }
        if (this.f55104j) {
            sb2.append(" detached");
        }
        if (this.f55105k) {
            sb2.append(" hidden");
        }
        if (this.f55107m != null) {
            sb2.append(" targetWho=");
            sb2.append(this.f55107m);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f55108n);
        }
        if (this.f55109o) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f55095a);
        parcel.writeString(this.f55096b);
        parcel.writeInt(this.f55097c ? 1 : 0);
        parcel.writeInt(this.f55098d ? 1 : 0);
        parcel.writeInt(this.f55099e);
        parcel.writeInt(this.f55100f);
        parcel.writeString(this.f55101g);
        parcel.writeInt(this.f55102h ? 1 : 0);
        parcel.writeInt(this.f55103i ? 1 : 0);
        parcel.writeInt(this.f55104j ? 1 : 0);
        parcel.writeInt(this.f55105k ? 1 : 0);
        parcel.writeInt(this.f55106l);
        parcel.writeString(this.f55107m);
        parcel.writeInt(this.f55108n);
        parcel.writeInt(this.f55109o ? 1 : 0);
    }

    N(Parcel parcel) {
        this.f55095a = parcel.readString();
        this.f55096b = parcel.readString();
        this.f55097c = parcel.readInt() != 0;
        this.f55098d = parcel.readInt() != 0;
        this.f55099e = parcel.readInt();
        this.f55100f = parcel.readInt();
        this.f55101g = parcel.readString();
        this.f55102h = parcel.readInt() != 0;
        this.f55103i = parcel.readInt() != 0;
        this.f55104j = parcel.readInt() != 0;
        this.f55105k = parcel.readInt() != 0;
        this.f55106l = parcel.readInt();
        this.f55107m = parcel.readString();
        this.f55108n = parcel.readInt();
        this.f55109o = parcel.readInt() != 0;
    }
}
