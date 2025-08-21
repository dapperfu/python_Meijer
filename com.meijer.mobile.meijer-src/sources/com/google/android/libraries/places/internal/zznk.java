package com.google.android.libraries.places.internal;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes6.dex */
public final class zznk {
    public static int zza(int i10, int i11, int i12) {
        if (zzb(i10, i11, i12)) {
            return i12;
        }
        return i11;
    }

    public static boolean zzb(int i10, int i11, int i12) {
        double dZze = zze(i10);
        double dZzd = zzd(zze(i11), dZze);
        if (dZzd > 3.0d || dZzd > zzd(zze(i12), dZze)) {
            return false;
        }
        return true;
    }

    public static void zzc(ImageView imageView, int i10) {
        Drawable drawable = imageView.getDrawable();
        int iRgb = Color.rgb(Color.red(i10), Color.green(i10), Color.blue(i10));
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setColorFilter(iRgb, PorterDuff.Mode.SRC_ATOP);
        drawableMutate.setAlpha(Color.alpha(i10));
    }

    private static double zzd(double d10, double d11) {
        return Math.round(((Math.max(d10, d11) + 0.05d) / (Math.min(d10, d11) + 0.05d)) * 100.0d) / 100.0d;
    }

    private static double zze(int i10) {
        return (zzf(Color.red(i10) / 255.0d) * 0.2126d) + (zzf(Color.green(i10) / 255.0d) * 0.7152d) + (zzf(Color.blue(i10) / 255.0d) * 0.0722d);
    }

    private static double zzf(double d10) {
        if (d10 <= 0.03928d) {
            return d10 / 12.92d;
        }
        return Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
    }
}
