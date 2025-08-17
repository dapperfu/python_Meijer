package com.google.android.libraries.places.internal;

import Be.p;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import j2.C14837e;
import j2.i;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class zznj {
    public static Place zza(Intent intent) {
        try {
            p.r(intent, "Intent must not be null.");
            Place place = (Place) intent.getParcelableExtra("places/selected_place");
            p.r(place, "Intent expected to contain a Place, but doesn't.");
            return place;
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    public static Status zzb(Intent intent) {
        try {
            p.r(intent, "Intent must not be null.");
            Status status = (Status) intent.getParcelableExtra("places/status");
            p.r(status, "Intent expected to contain a Status, but doesn't.");
            return status;
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    public static Status zzc(Intent intent) {
        return (Status) intent.getParcelableExtra("places/status");
    }

    public static zzng zzd(Intent intent) {
        return (zzng) p.q((zzng) intent.getParcelableExtra("places/AutocompleteOptions"));
    }

    public static String zze(Context context, int i10) {
        Locale localeZzg;
        Object objC = C14837e.a(context.getResources().getConfiguration()).c(0);
        if (objC == null) {
            objC = Locale.getDefault();
        }
        if (Places.isInitialized()) {
            localeZzg = Places.zzc().zzg();
        } else {
            localeZzg = objC;
        }
        if (localeZzg.equals(objC)) {
            return context.getString(i10);
        }
        i iVarB = i.b(localeZzg.toLanguageTag());
        Configuration configuration = context.getResources().getConfiguration();
        C14837e.b(configuration, iVarB);
        return context.createConfigurationContext(configuration).getString(i10);
    }
}
