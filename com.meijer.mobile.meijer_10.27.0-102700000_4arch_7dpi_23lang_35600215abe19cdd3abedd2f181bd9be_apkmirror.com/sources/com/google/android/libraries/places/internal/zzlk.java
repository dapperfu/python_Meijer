package com.google.android.libraries.places.internal;

import Be.i;
import Be.p;
import Ce.L;
import Ce.M;
import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.RectangularBounds;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class zzlk {
    private static final M zza = M.a().f(zzfe.NONE, "NONE").f(zzfe.PSK, "WPA_PSK").f(zzfe.EAP, "WPA_EAP").f(zzfe.OTHER, "SECURED_NONE").c();

    /* JADX WARN: Multi-variable type inference failed */
    public static String zza(L l10, int i10) {
        p.e(true, "maxLength must not be negative");
        StringBuilder sb2 = new StringBuilder();
        int size = l10.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzff zzffVar = (zzff) l10.get(i11);
            int length = sb2.length();
            String strValueOf = String.valueOf(i.h(",").k("=").e(M.a().f("mac", zzffVar.zza()).f("strength_dbm", Integer.valueOf(zzffVar.zzb())).f("wifi_auth_type", zza.get(zzffVar.zzc())).f("is_connected", Boolean.valueOf(zzffVar.zzd())).f("frequency_mhz", Integer.valueOf(zzffVar.zze())).c()));
            int length2 = sb2.length();
            String strConcat = (length > 0 ? "|" : "").concat(strValueOf);
            if (length2 + strConcat.length() > 4000) {
                break;
            }
            sb2.append(strConcat);
        }
        return sb2.toString();
    }

    public static String zzb(Location location) {
        if (location == null) {
            return null;
        }
        return zzf(location.getLatitude(), location.getLongitude());
    }

    public static String zzc(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return zzf(latLng.f84814a, latLng.f84815b);
    }

    public static String zzd(LocationBias locationBias) {
        if (locationBias == null) {
            return null;
        }
        if (locationBias instanceof RectangularBounds) {
            return zzg((RectangularBounds) locationBias);
        }
        throw new AssertionError("Unknown LocationBias type.");
    }

    public static String zze(LocationRestriction locationRestriction) {
        if (locationRestriction == null) {
            return null;
        }
        if (locationRestriction instanceof RectangularBounds) {
            return zzg((RectangularBounds) locationRestriction);
        }
        throw new AssertionError("Unknown LocationRestriction type.");
    }

    private static String zzf(double d10, double d11) {
        return String.format(Locale.US, "%.15f,%.15f", Double.valueOf(d10), Double.valueOf(d11));
    }

    private static String zzg(RectangularBounds rectangularBounds) {
        LatLng southwest = rectangularBounds.getSouthwest();
        double d10 = southwest.f84814a;
        double d11 = southwest.f84815b;
        LatLng northeast = rectangularBounds.getNortheast();
        return String.format(Locale.US, "rectangle:%.15f,%.15f|%.15f,%.15f", Double.valueOf(d10), Double.valueOf(d11), Double.valueOf(northeast.f84814a), Double.valueOf(northeast.f84815b));
    }
}
