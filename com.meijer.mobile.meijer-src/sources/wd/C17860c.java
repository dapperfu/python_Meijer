package wd;

import android.os.Parcel;

/* renamed from: wd.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C17860c {

    /* renamed from: a, reason: collision with root package name */
    private static final ClassLoader f167110a = C17860c.class.getClassLoader();

    public static void a(Parcel parcel, boolean z10) {
        parcel.writeInt(1);
    }

    private C17860c() {
    }

    public static boolean b(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }
}
