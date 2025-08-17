package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.internal.zzmr;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzt extends RecyclerView.u {
    final /* synthetic */ BaseAutocompleteImplFragment zza;

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final void onScrollStateChanged(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            try {
                BaseAutocompleteImplFragment baseAutocompleteImplFragment = this.zza;
                baseAutocompleteImplFragment.zzj().zze();
                baseAutocompleteImplFragment.zzk().clearFocus();
            } catch (Error | RuntimeException e10) {
                zzmr.zzb(e10);
                throw e10;
            }
        }
    }

    zzt(BaseAutocompleteImplFragment baseAutocompleteImplFragment) {
        Objects.requireNonNull(baseAutocompleteImplFragment);
        this.zza = baseAutocompleteImplFragment;
    }
}
