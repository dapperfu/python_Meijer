package xd;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: xd.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C18159c {

    /* renamed from: a, reason: collision with root package name */
    private static final ClassLoader f170682a = C18159c.class.getClassLoader();

    public static void b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    private C18159c() {
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
