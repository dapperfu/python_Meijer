package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.libraries.places.internal.zzmr;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzac implements TextWatcher {
    final /* synthetic */ BaseAutocompleteImplFragment zza;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        try {
            BaseAutocompleteImplFragment baseAutocompleteImplFragment = this.zza;
            baseAutocompleteImplFragment.zzj().zzc(editable.toString(), baseAutocompleteImplFragment.zzk().getSelectionEnd());
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    /* synthetic */ zzac(BaseAutocompleteImplFragment baseAutocompleteImplFragment, byte[] bArr) {
        Objects.requireNonNull(baseAutocompleteImplFragment);
        this.zza = baseAutocompleteImplFragment;
    }
}
