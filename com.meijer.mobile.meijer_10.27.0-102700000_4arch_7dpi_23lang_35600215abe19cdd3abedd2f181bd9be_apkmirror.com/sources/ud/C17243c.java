package ud;

import android.os.Parcel;

/* renamed from: ud.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C17243c {

    /* renamed from: a, reason: collision with root package name */
    private static final ClassLoader f162901a = C17243c.class.getClassLoader();

    public static void a(Parcel parcel, boolean z10) {
        parcel.writeInt(1);
    }

    private C17243c() {
    }

    public static boolean b(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }
}
