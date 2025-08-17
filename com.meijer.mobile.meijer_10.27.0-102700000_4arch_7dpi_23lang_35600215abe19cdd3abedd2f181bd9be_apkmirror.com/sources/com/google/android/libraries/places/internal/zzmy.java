package com.google.android.libraries.places.internal;

import Be.p;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment;

/* loaded from: classes6.dex */
public class zzmy extends AppCompatActivity {
    public BaseAutocompleteImplFragment zza;
    private int zzb;

    public zzmy() {
        super(R.layout.autocomplete_activity);
    }

    public final void zza(int i10, Place place, Status status) throws Throwable {
        try {
            Intent intent = new Intent();
            if (place != null) {
                intent.putExtra("places/selected_place", place);
            }
            intent.putExtra("places/status", status);
            setResult(i10, intent);
            BaseAutocompleteImplFragment baseAutocompleteImplFragment = this.zza;
            if (baseAutocompleteImplFragment != null) {
                baseAutocompleteImplFragment.zza();
            }
            finish();
        } catch (Error e10) {
            e = e10;
            zzmr.zzb(e);
            throw e;
        } catch (RuntimeException e11) {
            e = e11;
            zzmr.zzb(e);
            throw e;
        }
    }

    public final void zzb(int i10, AutocompletePrediction autocompletePrediction, AutocompleteSessionToken autocompleteSessionToken, Status status) throws Throwable {
        try {
            Intent intent = new Intent();
            if (autocompletePrediction != null && autocompleteSessionToken != null) {
                intent.putExtra("places/selected_prediction", autocompletePrediction);
                intent.putExtra("places/session_token", autocompleteSessionToken);
            }
            intent.putExtra("places/status", status);
            setResult(i10, intent);
            BaseAutocompleteImplFragment baseAutocompleteImplFragment = this.zza;
            if (baseAutocompleteImplFragment != null) {
                baseAutocompleteImplFragment.zza();
            }
            finish();
        } catch (Error e10) {
            e = e10;
            zzmr.zzb(e);
            throw e;
        } catch (RuntimeException e11) {
            e = e11;
            zzmr.zzb(e);
            throw e;
        }
    }

    public final void zzc(int i10, Status status) {
        try {
            Intent intent = new Intent();
            intent.putExtra("places/status", status);
            setResult(i10, intent);
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public void onCreate(Bundle bundle) throws Throwable {
        boolean z10;
        zzmo zzmoVar;
        try {
            p.x(Places.isInitialized(), "Places must be initialized.");
            boolean z11 = false;
            if (getCallingActivity() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            p.x(z10, "Cannot find caller. startActivityForResult should be used.");
            zzng zzngVarZzd = zznj.zzd(getIntent());
            this.zzb = R.layout.autocomplete_fullscreen;
            setTheme(R.style.AutocompleteFullscreen);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            int i10 = this.zzb;
            zzox zzoxVarZza = zzow.zza();
            zzoxVarZza.zzc(this);
            if (zzngVarZzd.zza() == zzoh.JWT_AND_ONE_PLATFORM) {
                zzmoVar = zzmo.PLACES_UI_KIT;
            } else {
                zzmoVar = zzmo.ONE_PLATFORM_AUTOCOMPLETE_WIDGET;
            }
            zzoxVarZza.zzb(zzmoVar);
            supportFragmentManager.setFragmentFactory(new com.google.android.libraries.places.widget.internal.autocomplete.ui.zzab(i10, zzoxVarZza.zza(), zzngVarZzd));
            super.onCreate(bundle);
            BaseAutocompleteImplFragment baseAutocompleteImplFragment = (BaseAutocompleteImplFragment) getSupportFragmentManager().findFragmentById(R.id.autocomplete_content);
            this.zza = baseAutocompleteImplFragment;
            if (baseAutocompleteImplFragment != null) {
                z11 = true;
            }
            p.w(z11);
        } catch (Error e10) {
            e = e10;
            zzmr.zzb(e);
            throw e;
        } catch (RuntimeException e11) {
            e = e11;
            zzmr.zzb(e);
            throw e;
        }
    }
}
