package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.view.AbstractC6023l;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final String f54871a;

    /* renamed from: b, reason: collision with root package name */
    final String f54872b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f54873c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f54874d;

    /* renamed from: e, reason: collision with root package name */
    final int f54875e;

    /* renamed from: f, reason: collision with root package name */
    final int f54876f;

    /* renamed from: g, reason: collision with root package name */
    final String f54877g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f54878h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f54879i;

    /* renamed from: j, reason: collision with root package name */
    final boolean f54880j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f54881k;

    /* renamed from: l, reason: collision with root package name */
    final int f54882l;

    /* renamed from: m, reason: collision with root package name */
    final String f54883m;

    /* renamed from: n, reason: collision with root package name */
    final int f54884n;

    /* renamed from: o, reason: collision with root package name */
    final boolean f54885o;

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
        this.f54871a = fragment.getClass().getName();
        this.f54872b = fragment.mWho;
        this.f54873c = fragment.mFromLayout;
        this.f54874d = fragment.mInDynamicContainer;
        this.f54875e = fragment.mFragmentId;
        this.f54876f = fragment.mContainerId;
        this.f54877g = fragment.mTag;
        this.f54878h = fragment.mRetainInstance;
        this.f54879i = fragment.mRemoving;
        this.f54880j = fragment.mDetached;
        this.f54881k = fragment.mHidden;
        this.f54882l = fragment.mMaxState.ordinal();
        this.f54883m = fragment.mTargetWho;
        this.f54884n = fragment.mTargetRequestCode;
        this.f54885o = fragment.mUserVisibleHint;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    Fragment a(C5981w c5981w, ClassLoader classLoader) {
        Fragment fragmentInstantiate = c5981w.instantiate(classLoader, this.f54871a);
        fragmentInstantiate.mWho = this.f54872b;
        fragmentInstantiate.mFromLayout = this.f54873c;
        fragmentInstantiate.mInDynamicContainer = this.f54874d;
        fragmentInstantiate.mRestored = true;
        fragmentInstantiate.mFragmentId = this.f54875e;
        fragmentInstantiate.mContainerId = this.f54876f;
        fragmentInstantiate.mTag = this.f54877g;
        fragmentInstantiate.mRetainInstance = this.f54878h;
        fragmentInstantiate.mRemoving = this.f54879i;
        fragmentInstantiate.mDetached = this.f54880j;
        fragmentInstantiate.mHidden = this.f54881k;
        fragmentInstantiate.mMaxState = AbstractC6023l.b.values()[this.f54882l];
        fragmentInstantiate.mTargetWho = this.f54883m;
        fragmentInstantiate.mTargetRequestCode = this.f54884n;
        fragmentInstantiate.mUserVisibleHint = this.f54885o;
        return fragmentInstantiate;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f54871a);
        sb2.append(" (");
        sb2.append(this.f54872b);
        sb2.append(")}:");
        if (this.f54873c) {
            sb2.append(" fromLayout");
        }
        if (this.f54874d) {
            sb2.append(" dynamicContainer");
        }
        if (this.f54876f != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f54876f));
        }
        String str = this.f54877g;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f54877g);
        }
        if (this.f54878h) {
            sb2.append(" retainInstance");
        }
        if (this.f54879i) {
            sb2.append(" removing");
        }
        if (this.f54880j) {
            sb2.append(" detached");
        }
        if (this.f54881k) {
            sb2.append(" hidden");
        }
        if (this.f54883m != null) {
            sb2.append(" targetWho=");
            sb2.append(this.f54883m);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f54884n);
        }
        if (this.f54885o) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f54871a);
        parcel.writeString(this.f54872b);
        parcel.writeInt(this.f54873c ? 1 : 0);
        parcel.writeInt(this.f54874d ? 1 : 0);
        parcel.writeInt(this.f54875e);
        parcel.writeInt(this.f54876f);
        parcel.writeString(this.f54877g);
        parcel.writeInt(this.f54878h ? 1 : 0);
        parcel.writeInt(this.f54879i ? 1 : 0);
        parcel.writeInt(this.f54880j ? 1 : 0);
        parcel.writeInt(this.f54881k ? 1 : 0);
        parcel.writeInt(this.f54882l);
        parcel.writeString(this.f54883m);
        parcel.writeInt(this.f54884n);
        parcel.writeInt(this.f54885o ? 1 : 0);
    }

    N(Parcel parcel) {
        this.f54871a = parcel.readString();
        this.f54872b = parcel.readString();
        this.f54873c = parcel.readInt() != 0;
        this.f54874d = parcel.readInt() != 0;
        this.f54875e = parcel.readInt();
        this.f54876f = parcel.readInt();
        this.f54877g = parcel.readString();
        this.f54878h = parcel.readInt() != 0;
        this.f54879i = parcel.readInt() != 0;
        this.f54880j = parcel.readInt() != 0;
        this.f54881k = parcel.readInt() != 0;
        this.f54882l = parcel.readInt();
        this.f54883m = parcel.readString();
        this.f54884n = parcel.readInt();
        this.f54885o = parcel.readInt() != 0;
    }
}
