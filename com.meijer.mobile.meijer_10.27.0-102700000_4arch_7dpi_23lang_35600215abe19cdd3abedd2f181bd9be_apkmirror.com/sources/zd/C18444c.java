package zd;

import android.os.Parcel;

/* renamed from: zd.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C18444c {

    /* renamed from: a, reason: collision with root package name */
    private static final ClassLoader f171798a = C18444c.class.getClassLoader();

    private C18444c() {
    }

    public static void a(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static boolean b(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }
}
