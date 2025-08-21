package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import androidx.view.F;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zza extends F {
    final /* synthetic */ AutocompleteImplFragment zza;

    @Override // androidx.view.F
    public final void handleOnBackPressed() {
        this.zza.zzg().zzj();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zza(AutocompleteImplFragment autocompleteImplFragment, boolean z10) {
        super(true);
        Objects.requireNonNull(autocompleteImplFragment);
        this.zza = autocompleteImplFragment;
    }
}
