package com.google.android.libraries.places.internal;

import Td.AbstractC5223a;
import Td.AbstractC5232j;
import Td.C5233k;
import Td.InterfaceC5230h;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.android.volley.VolleyError;
import com.android.volley.h;
import com.android.volley.j;
import com.android.volley.k;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import java.util.Map;

/* loaded from: classes6.dex */
public final class zzfx {
    private final j zza;

    zzfx(j jVar) {
        this.zza = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zzd(C5233k c5233k, VolleyError volleyError) {
        ApiException apiExceptionZza;
        try {
            h hVar = volleyError.f62877a;
            if (hVar != null) {
                int i10 = hVar.f62913a;
                apiExceptionZza = i10 != 400 ? i10 != 403 ? zzfl.zza(volleyError) : new ApiException(new Status(PlacesStatusCodes.REQUEST_DENIED, "The provided API key is invalid.")) : new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "The provided parameters are invalid (did you include a max width or height?)."));
            }
            c5233k.d(apiExceptionZza);
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zze(zzkb zzkbVar, C5233k c5233k, Bitmap bitmap) {
        try {
            zzkbVar.zzb(bitmap);
            c5233k.e(zzkbVar.zza());
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    public final AbstractC5232j zzb(zzfz zzfzVar, final zzkb zzkbVar) {
        C5233k c5233k;
        String strZzd = zzfzVar.zzd();
        Map mapZzc = zzfzVar.zzc();
        AbstractC5223a abstractC5223aZzb = zzfzVar.zzb();
        if (abstractC5223aZzb != null) {
            c5233k = new C5233k(abstractC5223aZzb);
        } else {
            c5233k = new C5233k();
        }
        final C5233k c5233k2 = c5233k;
        final zzft zzftVar = new zzft(this, strZzd, new k.b() { // from class: com.google.android.libraries.places.internal.zzfv
            @Override // com.android.volley.k.b
            public final /* synthetic */ void onResponse(Object obj) {
                zzfx.zze(zzkbVar, c5233k2, (Bitmap) obj);
            }
        }, 0, 0, ImageView.ScaleType.CENTER, Bitmap.Config.ARGB_8888, new k.a() { // from class: com.google.android.libraries.places.internal.zzfu
            @Override // com.android.volley.k.a
            public final /* synthetic */ void onErrorResponse(VolleyError volleyError) {
                zzfx.zzd(c5233k2, volleyError);
            }
        }, mapZzc);
        if (abstractC5223aZzb != null) {
            abstractC5223aZzb.b(new InterfaceC5230h() { // from class: com.google.android.libraries.places.internal.zzfw
                @Override // Td.InterfaceC5230h
                public final /* synthetic */ void onCanceled() {
                    zzftVar.cancel();
                }
            });
        }
        this.zza.a(zzftVar);
        return c5233k2.a();
    }
}
