package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.internal.zzmr;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzb extends RecyclerView.u {
    final /* synthetic */ AutocompleteImplFragment zza;

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final void onScrollStateChanged(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            try {
                AutocompleteImplFragment autocompleteImplFragment = this.zza;
                autocompleteImplFragment.zzg().zze();
                autocompleteImplFragment.zzh().clearFocus();
            } catch (Error | RuntimeException e10) {
                zzmr.zzb(e10);
                throw e10;
            }
        }
    }

    zzb(AutocompleteImplFragment autocompleteImplFragment) {
        Objects.requireNonNull(autocompleteImplFragment);
        this.zza = autocompleteImplFragment;
    }
}
