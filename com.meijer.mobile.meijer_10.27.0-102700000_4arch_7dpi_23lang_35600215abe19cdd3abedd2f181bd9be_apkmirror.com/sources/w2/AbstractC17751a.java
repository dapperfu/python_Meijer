package w2;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: w2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17751a implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final Parcelable f165652a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC17751a f165651b = new C2625a();
    public static final Parcelable.Creator<AbstractC17751a> CREATOR = new b();

    /* renamed from: w2.a$a, reason: collision with other inner class name */
    class C2625a extends AbstractC17751a {
        C2625a() {
            super((C2625a) null);
        }
    }

    /* renamed from: w2.a$b */
    class b implements Parcelable.ClassLoaderCreator<AbstractC17751a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC17751a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbstractC17751a[] newArray(int i10) {
            return new AbstractC17751a[i10];
        }

        b() {
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC17751a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC17751a.f165651b;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    /* synthetic */ AbstractC17751a(C2625a c2625a) {
        this();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AbstractC17751a() {
        this.f165652a = null;
    }

    public final Parcelable a() {
        return this.f165652a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f165652a, i10);
    }

    protected AbstractC17751a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f165652a = parcelable == f165651b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected AbstractC17751a(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f165652a = parcelable == null ? f165651b : parcelable;
    }
}
