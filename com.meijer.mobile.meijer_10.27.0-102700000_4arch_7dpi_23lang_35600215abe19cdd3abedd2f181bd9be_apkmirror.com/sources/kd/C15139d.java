package kd;

import android.content.Intent;
import android.os.Parcel;

/* renamed from: kd.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15139d {
    public static <T extends InterfaceC15138c> byte[] a(T t10) {
        Parcel parcelObtain = Parcel.obtain();
        t10.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static <T extends InterfaceC15138c> void b(T t10, Intent intent, String str) {
        intent.putExtra(str, a(t10));
    }
}
