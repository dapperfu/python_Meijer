package com.google.android.libraries.places.internal;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.ParseError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.h;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;

/* loaded from: classes6.dex */
final class zzfl {
    static ApiException zza(VolleyError volleyError) {
        int i10 = volleyError instanceof NetworkError ? 7 : volleyError instanceof TimeoutError ? 15 : ((volleyError instanceof ServerError) || (volleyError instanceof ParseError)) ? 8 : volleyError instanceof AuthFailureError ? PlacesStatusCodes.REQUEST_DENIED : 13;
        h hVar = volleyError.f63716a;
        return new ApiException(new Status(i10, String.format("Unexpected server error (HTTP Code: %s. Message: %s.)", hVar == null ? "N/A" : String.valueOf(hVar.f63752a), volleyError)));
    }

    static ApiException zzb(zzbjy zzbjyVar) {
        zzbjv zzbjvVarZzb = zzbjv.zzb(zzbjyVar);
        zzbjs zzbjsVar = zzbjs.OK;
        int iOrdinal = zzbjvVarZzb.zzg().ordinal();
        if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                if (iOrdinal != 5) {
                    if (iOrdinal != 7) {
                        if (iOrdinal != 13) {
                            if (iOrdinal != 14) {
                                return new ApiException(new Status(13, zzbjvVarZzb.zzh()));
                            }
                            return new ApiException(new Status(7, zzbjvVarZzb.zzh()));
                        }
                        return new ApiException(new Status(8, zzbjvVarZzb.zzh()));
                    }
                    return new ApiException(new Status(PlacesStatusCodes.REQUEST_DENIED, zzbjvVarZzb.zzh()));
                }
                return new ApiException(new Status(PlacesStatusCodes.NOT_FOUND, zzbjvVarZzb.zzh()));
            }
            return new ApiException(new Status(15, zzbjvVarZzb.zzh()));
        }
        return new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, zzbjvVarZzb.zzh()));
    }
}
