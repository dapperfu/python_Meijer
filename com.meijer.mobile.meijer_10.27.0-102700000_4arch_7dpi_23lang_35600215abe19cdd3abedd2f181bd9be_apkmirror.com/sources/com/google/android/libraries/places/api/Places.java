package com.google.android.libraries.places.api;

import Be.p;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.auth.PlacesAppCheckTokenProvider;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.internal.zzlu;
import com.google.android.libraries.places.internal.zzmc;
import com.google.android.libraries.places.internal.zzmd;
import com.google.android.libraries.places.internal.zzmf;
import com.google.android.libraries.places.internal.zzmp;
import com.google.android.libraries.places.internal.zzmr;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class Places {
    private static final zzmf zza = new zzmf();
    private static volatile zzmd zzb;

    private Places() {
    }

    public static void initialize(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        try {
            zza(context, str, null, false);
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    public static void initializeWithNewPlacesApiEnabled(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        try {
            zza(context, str, null, true);
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    public static synchronized zzmf zzc() {
        return zza;
    }

    @RecentlyNonNull
    public static synchronized PlacesClient createClient(@RecentlyNonNull Context context) {
        try {
            p.r(context, "Context must not be null.");
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
        return zzb(context, zzmp.zzd(context).zze());
    }

    public static synchronized void deinitialize() {
        zza.zze();
    }

    public static synchronized boolean isInitialized() {
        try {
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
        return zza.zzc();
    }

    public static void setPlacesAppCheckTokenProvider(@RecentlyNonNull PlacesAppCheckTokenProvider placesAppCheckTokenProvider) {
        zza.zzd(placesAppCheckTokenProvider);
    }

    public static synchronized void zza(@RecentlyNonNull Context context, @RecentlyNonNull String str, Locale locale, boolean z10) {
        try {
            p.r(context, "Application context must not be null.");
            p.r(str, "API Key must not be null.");
            p.e(!str.isEmpty(), "API Key must not be empty.");
            zzmr.zza(context.getApplicationContext());
            if (z10) {
                zza.zzb(str, locale);
            } else {
                zza.zza(str, locale);
            }
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    public static synchronized PlacesClient zzb(Context context, zzmp zzmpVar) {
        zzmc zzmcVarZza;
        try {
            p.r(context, "Context must not be null.");
            p.r(zzmpVar, "ClientProfile must not be null.");
            p.x(isInitialized(), "Places must be initialized first.");
            zzmcVarZza = zzlu.zza();
            zzmcVarZza.zzd(context);
            zzmcVarZza.zzc(zza);
            zzmcVarZza.zzb(zzmpVar);
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
        return zzmcVarZza.zza().zzc();
    }

    public static void initialize(@RecentlyNonNull Context context, @RecentlyNonNull String str, Locale locale) {
        try {
            zza(context, str, locale, false);
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    public static void initializeWithNewPlacesApiEnabled(@RecentlyNonNull Context context, @RecentlyNonNull String str, Locale locale) {
        try {
            zza(context, str, locale, true);
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }
}
