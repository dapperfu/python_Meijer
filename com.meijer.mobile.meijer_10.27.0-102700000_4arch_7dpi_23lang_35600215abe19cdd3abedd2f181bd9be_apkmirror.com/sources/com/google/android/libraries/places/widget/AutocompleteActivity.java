package com.google.android.libraries.places.widget;

import Be.p;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import com.google.android.libraries.places.internal.zzmo;
import com.google.android.libraries.places.internal.zzmr;
import com.google.android.libraries.places.internal.zzng;
import com.google.android.libraries.places.internal.zznj;
import com.google.android.libraries.places.internal.zzow;
import com.google.android.libraries.places.internal.zzox;
import com.google.android.libraries.places.widget.internal.autocomplete.ui.AutocompleteImplFragment;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;

/* loaded from: classes6.dex */
public class AutocompleteActivity extends AppCompatActivity implements PlaceSelectionListener {
    public static final int RESULT_ERROR = 2;
    private int zza;
    private int zzb;
    private boolean zzc;

    @Override // com.google.android.libraries.places.widget.listener.PlaceSelectionListener
    public void onError(@RecentlyNonNull Status status) throws Throwable {
        zzc(true != status.W0() ? 2 : 0, null, status);
    }

    @Override // com.google.android.libraries.places.widget.listener.PlaceSelectionListener
    public void onPlaceSelected(@RecentlyNonNull Place place) throws Throwable {
        zzc(-1, place, Status.f64735f);
    }

    final /* synthetic */ boolean zza(AutocompleteImplFragment autocompleteImplFragment, View view, View view2, MotionEvent motionEvent) {
        this.zzc = false;
        if (autocompleteImplFragment.getView() == null || motionEvent.getY() <= r1.getBottom()) {
            return false;
        }
        this.zzc = true;
        view.performClick();
        return true;
    }

    public AutocompleteActivity() {
        super(R.layout.places_autocomplete_activity);
        this.zzc = false;
    }

    private final void zzc(int i10, Place place, Status status) throws Throwable {
        try {
            Intent intent = new Intent();
            if (place != null) {
                intent.putExtra("places/selected_place", place);
            }
            intent.putExtra("places/status", status);
            setResult(i10, intent);
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

    final /* synthetic */ void zzb(View view) throws Throwable {
        if (this.zzc) {
            zzc(0, null, new Status(16));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public void onCreate(Bundle bundle) throws Throwable {
        boolean z10;
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
            AutocompleteActivityMode autocompleteActivityMode = AutocompleteActivityMode.FULLSCREEN;
            int iOrdinal = zzngVarZzd.zzb().ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    this.zza = R.layout.places_autocomplete_impl_fragment_overlay;
                    this.zzb = R.style.PlacesAutocompleteOverlay;
                }
            } else {
                this.zza = R.layout.places_autocomplete_impl_fragment_fullscreen;
                this.zzb = R.style.PlacesAutocompleteFullscreen;
            }
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            int i10 = this.zza;
            zzox zzoxVarZza = zzow.zza();
            zzoxVarZza.zzc(this);
            zzoxVarZza.zzb(zzmo.AUTOCOMPLETE_WIDGET);
            supportFragmentManager.setFragmentFactory(new com.google.android.libraries.places.widget.internal.autocomplete.ui.zzj(i10, zzoxVarZza.zza(), zzngVarZzd));
            setTheme(this.zzb);
            super.onCreate(bundle);
            final AutocompleteImplFragment autocompleteImplFragment = (AutocompleteImplFragment) getSupportFragmentManager().findFragmentById(R.id.places_autocomplete_content);
            if (autocompleteImplFragment != null) {
                z11 = true;
            }
            p.w(z11);
            autocompleteImplFragment.zza(this);
            final View viewFindViewById = findViewById(android.R.id.content);
            viewFindViewById.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.libraries.places.widget.zzb
                @Override // android.view.View.OnTouchListener
                public final /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.zza.zza(autocompleteImplFragment, viewFindViewById, view, motionEvent);
                }
            });
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zza
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view) throws Throwable {
                    this.zza.zzb(view);
                }
            });
            if (zzngVarZzd.zzc().isEmpty()) {
                zzc(2, null, new Status(PlacesStatusCodes.INVALID_REQUEST, "Place Fields must not be empty."));
            }
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
