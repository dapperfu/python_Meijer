package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.x(true, true);
        iconCompat.r(versionedParcel.f());
        int i10 = iconCompat.f53883a;
        if (-1 != i10) {
            versionedParcel.F(i10, 1);
        }
        byte[] bArr = iconCompat.f53885c;
        if (bArr != null) {
            versionedParcel.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f53886d;
        if (parcelable != null) {
            versionedParcel.H(parcelable, 3);
        }
        int i11 = iconCompat.f53887e;
        if (i11 != 0) {
            versionedParcel.F(i11, 4);
        }
        int i12 = iconCompat.f53888f;
        if (i12 != 0) {
            versionedParcel.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f53889g;
        if (colorStateList != null) {
            versionedParcel.H(colorStateList, 6);
        }
        String str = iconCompat.f53891i;
        if (str != null) {
            versionedParcel.J(str, 7);
        }
        String str2 = iconCompat.f53892j;
        if (str2 != null) {
            versionedParcel.J(str2, 8);
        }
    }

    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f53883a = versionedParcel.p(iconCompat.f53883a, 1);
        iconCompat.f53885c = versionedParcel.j(iconCompat.f53885c, 2);
        iconCompat.f53886d = versionedParcel.r(iconCompat.f53886d, 3);
        iconCompat.f53887e = versionedParcel.p(iconCompat.f53887e, 4);
        iconCompat.f53888f = versionedParcel.p(iconCompat.f53888f, 5);
        iconCompat.f53889g = (ColorStateList) versionedParcel.r(iconCompat.f53889g, 6);
        iconCompat.f53891i = versionedParcel.t(iconCompat.f53891i, 7);
        iconCompat.f53892j = versionedParcel.t(iconCompat.f53892j, 8);
        iconCompat.q();
        return iconCompat;
    }
}
