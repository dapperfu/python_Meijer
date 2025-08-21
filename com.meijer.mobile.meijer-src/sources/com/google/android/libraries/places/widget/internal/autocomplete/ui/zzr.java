package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import androidx.view.F;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzr extends F {
    final /* synthetic */ BaseAutocompleteImplFragment zza;

    @Override // androidx.view.F
    public final void handleOnBackPressed() {
        this.zza.zzj().zzj();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzr(BaseAutocompleteImplFragment baseAutocompleteImplFragment, boolean z10) {
        super(true);
        Objects.requireNonNull(baseAutocompleteImplFragment);
        this.zza = baseAutocompleteImplFragment;
    }
}
