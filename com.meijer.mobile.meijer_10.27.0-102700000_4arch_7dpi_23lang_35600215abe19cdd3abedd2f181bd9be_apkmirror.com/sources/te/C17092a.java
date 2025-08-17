package te;

import Z.n0;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w2.AbstractC17751a;

/* renamed from: te.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17092a extends AbstractC17751a {
    public static final Parcelable.Creator<C17092a> CREATOR = new C2531a();

    /* renamed from: c, reason: collision with root package name */
    public final n0<String, Bundle> f161633c;

    /* renamed from: te.a$a, reason: collision with other inner class name */
    class C2531a implements Parcelable.ClassLoaderCreator<C17092a> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C17092a createFromParcel(Parcel parcel) {
            return new C17092a(parcel, null, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C17092a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C17092a(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C17092a[] newArray(int i10) {
            return new C17092a[i10];
        }

        C2531a() {
        }
    }

    /* synthetic */ C17092a(Parcel parcel, ClassLoader classLoader, C2531a c2531a) {
        this(parcel, classLoader);
    }

    public C17092a(Parcelable parcelable) {
        super(parcelable);
        this.f161633c = new n0<>();
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f161633c + "}";
    }

    @Override // w2.AbstractC17751a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        int size = this.f161633c.getSize();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i11 = 0; i11 < size; i11++) {
            strArr[i11] = this.f161633c.g(i11);
            bundleArr[i11] = this.f161633c.k(i11);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    private C17092a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i10 = parcel.readInt();
        String[] strArr = new String[i10];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i10];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f161633c = new n0<>(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f161633c.put(strArr[i11], bundleArr[i11]);
        }
    }
}
