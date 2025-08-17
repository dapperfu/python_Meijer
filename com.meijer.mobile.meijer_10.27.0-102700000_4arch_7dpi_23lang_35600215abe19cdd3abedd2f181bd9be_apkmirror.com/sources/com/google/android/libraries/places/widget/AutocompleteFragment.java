package com.google.android.libraries.places.widget;

import Be.p;
import Ce.L;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.RecentlyNonNull;
import com.fullstory.FS;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.internal.zzmr;
import com.google.android.libraries.places.internal.zznj;
import com.google.android.libraries.places.internal.zzoc;
import com.google.android.libraries.places.widget.Autocomplete;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.List;

@Deprecated
/* loaded from: classes6.dex */
public class AutocompleteFragment extends Fragment {
    private View zza;
    private View zzb;
    private EditText zzc;
    private LocationBias zzd;
    private LocationRestriction zze;
    private String zzf;
    private TypeFilter zzg;
    private L zzh;
    private PlaceSelectionListener zzi;

    @Override // android.app.Fragment
    public void onDestroyView() {
        try {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            super.onDestroyView();
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    public void setCountry(String str) {
        this.zzf = str;
    }

    public void setLocationBias(LocationBias locationBias) {
        this.zzd = locationBias;
    }

    public void setLocationRestriction(LocationRestriction locationRestriction) {
        this.zze = locationRestriction;
    }

    public void setOnPlaceSelectedListener(PlaceSelectionListener placeSelectionListener) {
        this.zzi = placeSelectionListener;
    }

    public void setTypeFilter(TypeFilter typeFilter) {
        this.zzg = typeFilter;
    }

    private final void zzb() {
        this.zzb.setVisibility(true != this.zzc.getText().toString().isEmpty() ? 0 : 8);
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) throws Throwable {
        try {
            getView().setEnabled(true);
            if (i10 == 30421) {
                if (this.zzi == null) {
                    if (Log.isLoggable("Places", 5)) {
                        FS.log_w("Places", "No PlaceSelectionListener is set. No result will be delivered.");
                    }
                } else if (i11 == -1) {
                    Place placeFromIntent = Autocomplete.getPlaceFromIntent(intent);
                    this.zzi.onPlaceSelected(placeFromIntent);
                    setText(placeFromIntent.getName());
                } else if (i11 == 2) {
                    this.zzi.onError(Autocomplete.getStatusFromIntent(intent));
                    i11 = 2;
                }
                i10 = 30421;
            }
            super.onActivityResult(i10, i11, intent);
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

    @Override // android.app.Fragment
    @RecentlyNonNull
    public View onCreateView(@RecentlyNonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            View viewInflate = layoutInflater.inflate(R.layout.places_autocomplete_fragment, viewGroup, false);
            this.zza = viewInflate.findViewById(R.id.places_autocomplete_search_button);
            this.zzb = viewInflate.findViewById(R.id.places_autocomplete_clear_button);
            this.zzc = (EditText) viewInflate.findViewById(R.id.places_autocomplete_search_input);
            this.zzc.setHint(zznj.zze(layoutInflater.getContext(), R.string.places_autocomplete_search_hint));
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzd
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view) throws Throwable {
                    this.zza.zza(view);
                }
            };
            this.zza.setOnClickListener(onClickListener);
            this.zzc.setOnClickListener(onClickListener);
            this.zzb.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzc
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view) {
                    this.zza.setText("");
                }
            });
            zzb();
            viewInflate.setEnabled(false);
            return viewInflate;
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    public void setHint(CharSequence charSequence) throws Throwable {
        if (charSequence == null) {
            try {
                charSequence = getString(R.string.places_autocomplete_search_hint);
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
        this.zzc.setHint(charSequence);
        this.zza.setContentDescription(charSequence);
    }

    public void setPlaceFields(@RecentlyNonNull List<Place.Field> list) {
        try {
            p.r(list, "Place Fields must not be null.");
            this.zzh = L.s(list);
            getView().setEnabled(true);
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    public void setText(CharSequence charSequence) {
        try {
            this.zzc.setText(charSequence);
            zzb();
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    final /* synthetic */ void zza(View view) throws Throwable {
        if (!getView().isEnabled()) {
            p.r(this.zzh, "Place Fields must be set.");
            if (Log.isLoggable("Places", 6)) {
                FS.log_e("Places", "Autocomplete activity cannot be launched until fragment is enabled.");
                return;
            }
            return;
        }
        Autocomplete.IntentBuilder intentBuilder = new Autocomplete.IntentBuilder(AutocompleteActivityMode.OVERLAY, this.zzh);
        intentBuilder.setInitialQuery(this.zzc.getText().toString());
        intentBuilder.setHint(this.zzc.getHint().toString());
        intentBuilder.setCountry(this.zzf);
        intentBuilder.setLocationBias(this.zzd);
        intentBuilder.setLocationRestriction(this.zze);
        intentBuilder.setTypeFilter(this.zzg);
        intentBuilder.zza(zzoc.FRAGMENT);
        Intent intentBuild = intentBuilder.build(getActivity());
        getView().setEnabled(false);
        startActivityForResult(intentBuild, 30421);
    }
}
