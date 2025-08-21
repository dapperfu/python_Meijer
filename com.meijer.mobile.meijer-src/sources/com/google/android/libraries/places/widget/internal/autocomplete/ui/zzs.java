package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import android.view.View;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzs implements View.OnClickListener {
    final /* synthetic */ BaseAutocompleteImplFragment zza;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zzi();
    }

    zzs(BaseAutocompleteImplFragment baseAutocompleteImplFragment) {
        Objects.requireNonNull(baseAutocompleteImplFragment);
        this.zza = baseAutocompleteImplFragment;
    }
}
