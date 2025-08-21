package com.google.android.libraries.places.internal;

import Vd.AbstractC5507a;
import Vd.AbstractC5516j;
import Vd.C5517k;
import Vd.InterfaceC5514h;
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
    public static /* synthetic */ void zzd(C5517k c5517k, VolleyError volleyError) {
        ApiException apiExceptionZza;
        try {
            h hVar = volleyError.f63716a;
            if (hVar != null) {
                int i10 = hVar.f63752a;
                apiExceptionZza = i10 != 400 ? i10 != 403 ? zzfl.zza(volleyError) : new ApiException(new Status(PlacesStatusCodes.REQUEST_DENIED, "The provided API key is invalid.")) : new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "The provided parameters are invalid (did you include a max width or height?)."));
            }
            c5517k.d(apiExceptionZza);
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zze(zzkb zzkbVar, C5517k c5517k, Bitmap bitmap) {
        try {
            zzkbVar.zzb(bitmap);
            c5517k.e(zzkbVar.zza());
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    public final AbstractC5516j zzb(zzfz zzfzVar, final zzkb zzkbVar) {
        C5517k c5517k;
        String strZzd = zzfzVar.zzd();
        Map mapZzc = zzfzVar.zzc();
        AbstractC5507a abstractC5507aZzb = zzfzVar.zzb();
        if (abstractC5507aZzb != null) {
            c5517k = new C5517k(abstractC5507aZzb);
        } else {
            c5517k = new C5517k();
        }
        final C5517k c5517k2 = c5517k;
        final zzft zzftVar = new zzft(this, strZzd, new k.b() { // from class: com.google.android.libraries.places.internal.zzfv
            @Override // com.android.volley.k.b
            public final /* synthetic */ void onResponse(Object obj) {
                zzfx.zze(zzkbVar, c5517k2, (Bitmap) obj);
            }
        }, 0, 0, ImageView.ScaleType.CENTER, Bitmap.Config.ARGB_8888, new k.a() { // from class: com.google.android.libraries.places.internal.zzfu
            @Override // com.android.volley.k.a
            public final /* synthetic */ void onErrorResponse(VolleyError volleyError) {
                zzfx.zzd(c5517k2, volleyError);
            }
        }, mapZzc);
        if (abstractC5507aZzb != null) {
            abstractC5507aZzb.b(new InterfaceC5514h() { // from class: com.google.android.libraries.places.internal.zzfw
                @Override // Vd.InterfaceC5514h
                public final /* synthetic */ void onCanceled() {
                    zzftVar.cancel();
                }
            });
        }
        this.zza.a(zzftVar);
        return c5517k2.a();
    }
}
