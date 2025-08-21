package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import androidx.fragment.app.C6123w;
import androidx.fragment.app.Fragment;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.internal.zzdy;
import com.google.android.libraries.places.internal.zzng;
import com.google.android.libraries.places.internal.zzoy;
import com.google.android.libraries.places.internal.zzoz;

/* loaded from: classes6.dex */
public final class zzj extends C6123w {
    private final int zza;
    private final PlacesClient zzb;
    private final zzng zzc;
    private final zzoz zzd;
    private final zzdy zze;

    public zzj(int i10, zzoy zzoyVar, zzng zzngVar) {
        this.zza = i10;
        this.zzb = zzoyVar.zzc();
        this.zzc = zzngVar;
        this.zzd = zzoyVar.zzd();
        this.zze = zzoyVar.zzb();
    }

    @Override // androidx.fragment.app.C6123w
    public final Fragment instantiate(ClassLoader classLoader, String str) {
        if (C6123w.loadFragmentClass(classLoader, str) == AutocompleteImplFragment.class) {
            return new AutocompleteImplFragment(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
        }
        return super.instantiate(classLoader, str);
    }
}
