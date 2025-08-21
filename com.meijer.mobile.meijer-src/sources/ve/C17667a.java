package ve;

import Z.n0;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w2.AbstractC17821a;

/* renamed from: ve.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17667a extends AbstractC17821a {
    public static final Parcelable.Creator<C17667a> CREATOR = new C2621a();

    /* renamed from: c, reason: collision with root package name */
    public final n0<String, Bundle> f165811c;

    /* renamed from: ve.a$a, reason: collision with other inner class name */
    class C2621a implements Parcelable.ClassLoaderCreator<C17667a> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C17667a createFromParcel(Parcel parcel) {
            return new C17667a(parcel, null, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C17667a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C17667a(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C17667a[] newArray(int i10) {
            return new C17667a[i10];
        }

        C2621a() {
        }
    }

    /* synthetic */ C17667a(Parcel parcel, ClassLoader classLoader, C2621a c2621a) {
        this(parcel, classLoader);
    }

    public C17667a(Parcelable parcelable) {
        super(parcelable);
        this.f165811c = new n0<>();
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f165811c + "}";
    }

    @Override // w2.AbstractC17821a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        int size = this.f165811c.getSize();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i11 = 0; i11 < size; i11++) {
            strArr[i11] = this.f165811c.g(i11);
            bundleArr[i11] = this.f165811c.k(i11);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    private C17667a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i10 = parcel.readInt();
        String[] strArr = new String[i10];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i10];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f165811c = new n0<>(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f165811c.put(strArr[i11], bundleArr[i11]);
        }
    }
}
