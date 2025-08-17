package com.google.android.libraries.places.widget;

import Ce.L;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.Fragment;
import androidx.view.C5988D;
import androidx.view.InterfaceC5989E;
import com.fullstory.FS;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.internal.zzmr;
import com.google.android.libraries.places.internal.zznf;
import com.google.android.libraries.places.internal.zzng;
import com.google.android.libraries.places.internal.zznj;
import com.google.android.libraries.places.internal.zzoc;
import com.google.android.libraries.places.widget.Autocomplete;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.List;

/* loaded from: classes6.dex */
public class AutocompleteSupportFragment extends Fragment {
    private final C5988D zza;
    private final C5988D zzb;
    private zznf zzc;
    private PlaceSelectionListener zzd;

    @RecentlyNonNull
    public AutocompleteSupportFragment setCountries(@RecentlyNonNull List<String> list) {
        this.zzc.zzj(list);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setOnPlaceSelectedListener(PlaceSelectionListener placeSelectionListener) {
        this.zzd = placeSelectionListener;
        return this;
    }

    public AutocompleteSupportFragment() {
        super(R.layout.places_autocomplete_fragment);
        this.zza = new C5988D();
        this.zzb = new C5988D();
        this.zzc = zzng.zzt(AutocompleteActivityMode.OVERLAY, L.x(), zzoc.FRAGMENT);
    }

    @RecentlyNonNull
    public static AutocompleteSupportFragment newInstance() {
        return new AutocompleteSupportFragment();
    }

    private final void zze(View view) {
        view.setVisibility(true != TextUtils.isEmpty((CharSequence) this.zza.e()) ? 0 : 8);
    }

    private final void zzf() throws Throwable {
        Intent intentBuild = new Autocomplete.IntentBuilder(this.zzc.zzs()).build(requireContext());
        if (requireView().isEnabled()) {
            requireView().setEnabled(false);
            startActivityForResult(intentBuild, 30421);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) throws Throwable {
        if (i10 == 30421) {
            try {
                PlaceSelectionListener placeSelectionListener = this.zzd;
                if (placeSelectionListener == null) {
                    if (Log.isLoggable("Places", 5)) {
                        FS.log_w("Places", "No PlaceSelectionListener is set. No result will be delivered.");
                    }
                } else if (intent == null) {
                    if (Log.isLoggable("Places", 6)) {
                        FS.log_e("Places", "Intent data was null.");
                    }
                } else {
                    if (i11 != -1) {
                        placeSelectionListener.onError(Autocomplete.getStatusFromIntent(intent));
                        return;
                    }
                    Place placeFromIntent = Autocomplete.getPlaceFromIntent(intent);
                    placeSelectionListener.onPlaceSelected(placeFromIntent);
                    setText(placeFromIntent.getName());
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

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@RecentlyNonNull Bundle bundle) {
        bundle.putParcelable("options", this.zzc.zzs());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@RecentlyNonNull View view, Bundle bundle) {
        final View viewFindViewById = view.findViewById(R.id.places_autocomplete_search_button);
        final View viewFindViewById2 = view.findViewById(R.id.places_autocomplete_clear_button);
        final EditText editText = (EditText) view.findViewById(R.id.places_autocomplete_search_input);
        editText.setHint(zznj.zze(requireContext(), R.string.places_autocomplete_search_hint));
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzi
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view2) throws Throwable {
                this.zza.zza(view2);
            }
        });
        editText.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zze
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view2) throws Throwable {
                this.zza.zzb(view2);
            }
        });
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzf
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view2) {
                this.zza.setText(null);
            }
        });
        zze(viewFindViewById2);
        this.zza.i(getViewLifecycleOwner(), new InterfaceC5989E() { // from class: com.google.android.libraries.places.widget.zzg
            @Override // androidx.view.InterfaceC5989E
            public final /* synthetic */ void onChanged(Object obj) {
                this.zza.zzc(editText, viewFindViewById2, (CharSequence) obj);
            }
        });
        this.zzb.i(getViewLifecycleOwner(), new InterfaceC5989E() { // from class: com.google.android.libraries.places.widget.zzh
            @Override // androidx.view.InterfaceC5989E
            public final /* synthetic */ void onChanged(Object obj) {
                AutocompleteSupportFragment.zzg(editText, viewFindViewById, (CharSequence) obj);
            }
        });
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setActivityMode(@RecentlyNonNull AutocompleteActivityMode autocompleteActivityMode) {
        this.zzc.zzb(autocompleteActivityMode);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setCountries(@RecentlyNonNull String... strArr) {
        this.zzc.zzj(L.t(strArr));
        return this;
    }

    @RecentlyNonNull
    @Deprecated
    public AutocompleteSupportFragment setCountry(String str) {
        this.zzc.zzt(str);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setHint(CharSequence charSequence) throws Throwable {
        try {
            if (charSequence != null) {
                this.zzc.zzg(charSequence.toString());
                this.zzb.m(charSequence);
                return this;
            }
            String string = getString(R.string.places_autocomplete_search_hint);
            this.zzc.zzg(string);
            this.zzb.m(string);
            return this;
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

    @RecentlyNonNull
    public AutocompleteSupportFragment setLocationBias(LocationBias locationBias) {
        this.zzc.zzh(locationBias);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setLocationRestriction(LocationRestriction locationRestriction) {
        this.zzc.zzi(locationRestriction);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setPlaceFields(@RecentlyNonNull List<Place.Field> list) {
        this.zzc.zzc(list);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setRegionCode(String str) {
        this.zzc.zzo(str);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setText(CharSequence charSequence) {
        try {
            this.zzc.zzf(TextUtils.isEmpty(charSequence) ? null : charSequence.toString());
            this.zza.m(charSequence);
            return this;
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    @RecentlyNonNull
    @Deprecated
    public AutocompleteSupportFragment setTypeFilter(TypeFilter typeFilter) {
        this.zzc.zzk(typeFilter);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setTypesFilter(@RecentlyNonNull List<String> list) {
        this.zzc.zzl(list);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zzg(EditText editText, View view, CharSequence charSequence) {
        try {
            editText.setHint(charSequence);
            view.setContentDescription(charSequence);
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzc(EditText editText, View view, CharSequence charSequence) {
        try {
            editText.setText(charSequence);
            zze(view);
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        if (bundle != null) {
            try {
                zzng zzngVar = (zzng) bundle.getParcelable("options");
                if (zzngVar != null) {
                    C5988D c5988d = this.zza;
                    if (c5988d.e() == 0) {
                        c5988d.m(zzngVar.zzf());
                    }
                    C5988D c5988d2 = this.zzb;
                    if (c5988d2.e() == 0) {
                        c5988d2.m(zzngVar.zzg());
                    }
                    this.zzc = zzngVar.zzs();
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

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        requireView().setEnabled(true);
    }

    final /* synthetic */ void zza(View view) throws Throwable {
        zzf();
    }

    final /* synthetic */ void zzb(View view) throws Throwable {
        zzf();
    }
}
