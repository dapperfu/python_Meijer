package vd;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: vd.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C17547c {

    /* renamed from: a, reason: collision with root package name */
    private static final ClassLoader f164646a = C17547c.class.getClassLoader();

    public static void b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    private C17547c() {
    }

    public static <T extends Parcelable> T a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface);
    }
}
