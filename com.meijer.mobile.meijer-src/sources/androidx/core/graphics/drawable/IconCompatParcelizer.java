package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.x(true, true);
        iconCompat.r(versionedParcel.f());
        int i10 = iconCompat.f54107a;
        if (-1 != i10) {
            versionedParcel.F(i10, 1);
        }
        byte[] bArr = iconCompat.f54109c;
        if (bArr != null) {
            versionedParcel.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f54110d;
        if (parcelable != null) {
            versionedParcel.H(parcelable, 3);
        }
        int i11 = iconCompat.f54111e;
        if (i11 != 0) {
            versionedParcel.F(i11, 4);
        }
        int i12 = iconCompat.f54112f;
        if (i12 != 0) {
            versionedParcel.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f54113g;
        if (colorStateList != null) {
            versionedParcel.H(colorStateList, 6);
        }
        String str = iconCompat.f54115i;
        if (str != null) {
            versionedParcel.J(str, 7);
        }
        String str2 = iconCompat.f54116j;
        if (str2 != null) {
            versionedParcel.J(str2, 8);
        }
    }

    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f54107a = versionedParcel.p(iconCompat.f54107a, 1);
        iconCompat.f54109c = versionedParcel.j(iconCompat.f54109c, 2);
        iconCompat.f54110d = versionedParcel.r(iconCompat.f54110d, 3);
        iconCompat.f54111e = versionedParcel.p(iconCompat.f54111e, 4);
        iconCompat.f54112f = versionedParcel.p(iconCompat.f54112f, 5);
        iconCompat.f54113g = (ColorStateList) versionedParcel.r(iconCompat.f54113g, 6);
        iconCompat.f54115i = versionedParcel.t(iconCompat.f54115i, 7);
        iconCompat.f54116j = versionedParcel.t(iconCompat.f54116j, 8);
        iconCompat.q();
        return iconCompat;
    }
}
