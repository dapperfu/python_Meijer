package w2;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: w2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17821a implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final Parcelable f166863a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC17821a f166862b = new C2649a();
    public static final Parcelable.Creator<AbstractC17821a> CREATOR = new b();

    /* renamed from: w2.a$a, reason: collision with other inner class name */
    class C2649a extends AbstractC17821a {
        C2649a() {
            super((C2649a) null);
        }
    }

    /* renamed from: w2.a$b */
    class b implements Parcelable.ClassLoaderCreator<AbstractC17821a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC17821a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbstractC17821a[] newArray(int i10) {
            return new AbstractC17821a[i10];
        }

        b() {
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC17821a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC17821a.f166862b;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    /* synthetic */ AbstractC17821a(C2649a c2649a) {
        this();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AbstractC17821a() {
        this.f166863a = null;
    }

    public final Parcelable a() {
        return this.f166863a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f166863a, i10);
    }

    protected AbstractC17821a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f166863a = parcelable == f166862b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected AbstractC17821a(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f166863a = parcelable == null ? f166862b : parcelable;
    }
}
