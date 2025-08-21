package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import De.p;
import Ee.L;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC6131E;
import androidx.view.f0;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.internal.zzdy;
import com.google.android.libraries.places.internal.zzmo;
import com.google.android.libraries.places.internal.zzmr;
import com.google.android.libraries.places.internal.zzng;
import com.google.android.libraries.places.internal.zzni;
import com.google.android.libraries.places.internal.zznj;
import com.google.android.libraries.places.internal.zznt;
import com.google.android.libraries.places.internal.zznx;
import com.google.android.libraries.places.internal.zzny;
import com.google.android.libraries.places.internal.zzoa;
import com.google.android.libraries.places.internal.zzod;
import com.google.android.libraries.places.internal.zzoe;
import com.google.android.libraries.places.internal.zzoh;
import com.google.android.libraries.places.internal.zzoo;
import com.google.android.libraries.places.internal.zzoz;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.android.libraries.places.widget.listener.PredictionSelectionListener;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.android.libraries.places.widget.model.AutocompleteUiCustomization;

@SuppressLint({"ValidFragment"})
/* loaded from: classes6.dex */
public final class BaseAutocompleteImplFragment extends Fragment {
    public static final /* synthetic */ int zza = 0;
    private final PlacesClient zzb;
    private final zzng zzc;
    private final zzoz zzd;
    private final zzdy zze;
    private String zzf;
    private zzny zzg;
    private PlaceSelectionListener zzh;
    private PredictionSelectionListener zzi;
    private EditText zzj;
    private RecyclerView zzk;
    private View zzl;
    private View zzm;
    private View zzn;
    private LinearLayout zzo;
    private LinearLayout zzp;
    private TextView zzq;
    private ImageButton zzr;
    private zzn zzs;
    private final zzac zzt;
    private boolean zzu;

    /* synthetic */ BaseAutocompleteImplFragment(int i10, PlacesClient placesClient, zzng zzngVar, zzoz zzozVar, zzdy zzdyVar, byte[] bArr) {
        this(i10, placesClient, zzngVar, zzozVar, zzdyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final void zzi() {
        this.zzu = true;
        zzoo zzooVar = new zzoo(requireContext(), R.style.PlacesMaterialTheme, L.x());
        zzooVar.setTitle(R.string.google_maps_terms_title);
        zzooVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzz
            @Override // android.content.DialogInterface.OnDismissListener
            public final /* synthetic */ void onDismiss(DialogInterface dialogInterface) {
                this.zza.zzh(dialogInterface);
            }
        });
        zzooVar.show();
    }

    public final void zzb(@RecentlyNonNull PlaceSelectionListener placeSelectionListener) {
        this.zzh = placeSelectionListener;
    }

    public final void zzc(@RecentlyNonNull PredictionSelectionListener predictionSelectionListener) {
        this.zzi = predictionSelectionListener;
    }

    final /* synthetic */ void zzh(DialogInterface dialogInterface) {
        this.zzu = false;
    }

    final /* synthetic */ zzny zzj() {
        return this.zzg;
    }

    final /* synthetic */ EditText zzk() {
        return this.zzj;
    }

    private BaseAutocompleteImplFragment(int i10, PlacesClient placesClient, zzng zzngVar, zzoz zzozVar, zzdy zzdyVar) {
        super(i10);
        this.zzt = new zzac(this, null);
        this.zzu = false;
        this.zzb = placesClient;
        this.zzc = zzngVar;
        this.zzd = zzozVar;
        this.zze = zzdyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzg(AutocompletePrediction autocompletePrediction, int i10) {
        try {
            this.zzg.zzd(autocompletePrediction, i10);
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzf(View view) {
        try {
            this.zzg.zzf();
            this.zzj.requestFocus();
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzo, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzd(zzni zzniVar) throws Throwable {
        try {
            this.zzm.setVisibility(0);
            this.zzp.setVisibility(8);
            this.zzo.setVisibility(8);
            AutocompleteActivityMode autocompleteActivityMode = AutocompleteActivityMode.FULLSCREEN;
            int iZzg = zzniVar.zzg() - 1;
            if (iZzg == 0) {
                zzng zzngVar = this.zzc;
                if (TextUtils.isEmpty(zzngVar.zzf())) {
                    this.zzm.setVisibility(8);
                }
                this.zzj.requestFocus();
                this.zzj.setText(zzngVar.zzf());
                EditText editText = this.zzj;
                editText.setSelection(editText.getText().length());
                return;
            }
            if (iZzg == 1) {
                this.zzs.submitList(null);
                this.zzm.setVisibility(8);
                this.zzj.getText().clear();
                return;
            }
            switch (iZzg) {
                case 4:
                    this.zzs.submitList(zzniVar.zzb());
                    this.zzo.setVisibility(0);
                    return;
                case 5:
                    this.zzs.submitList(null);
                    this.zzq.setText(this.zzf);
                    this.zzp.setVisibility(0);
                    this.zzo.setVisibility(0);
                    return;
                case 6:
                    break;
                case 7:
                    PlaceSelectionListener placeSelectionListener = this.zzh;
                    if (placeSelectionListener != null) {
                        placeSelectionListener.onPlaceSelected((Place) p.q(zzniVar.zzc()));
                    }
                    PredictionSelectionListener predictionSelectionListener = this.zzi;
                    if (predictionSelectionListener != null) {
                        predictionSelectionListener.onPredictionSelected((AutocompletePrediction) p.q(zzniVar.zzd()), (AutocompleteSessionToken) p.q(zzniVar.zze()));
                        return;
                    }
                    return;
                case 8:
                    AutocompletePrediction autocompletePrediction = (AutocompletePrediction) p.r(zzniVar.zzd(), "Prediction should not be null.");
                    this.zzj.clearFocus();
                    EditText editText2 = this.zzj;
                    zzac zzacVar = this.zzt;
                    editText2.removeTextChangedListener(zzacVar);
                    this.zzj.setText(autocompletePrediction.getPrimaryText(null));
                    this.zzj.addTextChangedListener(zzacVar);
                    break;
                case 9:
                    PlaceSelectionListener placeSelectionListener2 = this.zzh;
                    if (placeSelectionListener2 != null) {
                        placeSelectionListener2.onError((Status) p.q(zzniVar.zzf()));
                    }
                    PredictionSelectionListener predictionSelectionListener2 = this.zzi;
                    if (predictionSelectionListener2 != null) {
                        predictionSelectionListener2.onError((Status) p.q(zzniVar.zzf()));
                    }
                    Status statusZzf = zzniVar.zzf();
                    if (statusZzf == null || statusZzf.equals(Status.f65579j)) {
                        return;
                    }
                    this.zzq.setText(zznj.zze(requireContext(), R.string.autocomplete_error_loading_results_message));
                    this.zzp.setVisibility(0);
                    return;
                default:
                    return;
            }
            this.zzs.submitList(null);
            PlaceSelectionListener placeSelectionListener3 = this.zzh;
            if (placeSelectionListener3 != null) {
                placeSelectionListener3.onError((Status) p.q(zzniVar.zzf()));
            }
            PredictionSelectionListener predictionSelectionListener3 = this.zzi;
            if (predictionSelectionListener3 != null) {
                predictionSelectionListener3.onError((Status) p.q(zzniVar.zzf()));
            }
            this.zzq.setText(zznj.zze(requireContext(), R.string.autocomplete_error_loading_results_message));
            this.zzp.setVisibility(0);
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

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@RecentlyNonNull final View view, Bundle bundle) throws Throwable {
        try {
            this.zzj = (EditText) view.findViewById(R.id.autocomplete_search_bar_edit_text);
            this.zzk = (RecyclerView) view.findViewById(R.id.autocomplete_prediction_list);
            this.zzl = view.findViewById(R.id.autocomplete_back_image_button);
            this.zzm = view.findViewById(R.id.autocomplete_clear_image_button);
            this.zzn = view.findViewById(R.id.autocomplete_google_maps_attribution_image_separator);
            this.zzo = (LinearLayout) view.findViewById(R.id.autocomplete_google_maps_attribution_image_container);
            this.zzp = (LinearLayout) view.findViewById(R.id.autocomplete_message_container);
            this.zzq = (TextView) view.findViewById(R.id.autocomplete_message_text_view);
            ImageButton imageButton = (ImageButton) view.findViewById(R.id.autocomplete_disclosure_icon);
            this.zzr = imageButton;
            imageButton.setOnClickListener(new zzs(this));
            this.zzf = zznj.zze(requireContext(), R.string.autocomplete_no_matching_results_for_query);
            this.zzj.addTextChangedListener(this.zzt);
            this.zzj.setOnFocusChangeListener(new zzad(null));
            AutocompleteActivityMode autocompleteActivityMode = AutocompleteActivityMode.FULLSCREEN;
            zzng zzngVar = this.zzc;
            int iOrdinal = zzngVar.zzb().ordinal();
            if (iOrdinal == 0) {
                view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzu
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final /* synthetic */ WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                        int i10 = BaseAutocompleteImplFragment.zza;
                        View view3 = view;
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        if (marginLayoutParams != null) {
                            marginLayoutParams.setMargins(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
                            view3.setLayoutParams(marginLayoutParams);
                        }
                        return windowInsets;
                    }
                });
            } else if (iOrdinal == 1) {
                requireActivity().getWindow().addFlags(67108864);
                view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzv
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final /* synthetic */ WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                        int i10 = BaseAutocompleteImplFragment.zza;
                        View view3 = view;
                        view3.setPaddingRelative(view3.getPaddingStart(), windowInsets.getSystemWindowInsetTop(), view3.getPaddingEnd(), view3.getPaddingBottom());
                        return windowInsets;
                    }
                });
                this.zzn.setVisibility(8);
            }
            this.zzl.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzw
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view2) {
                    this.zza.zze(view2);
                }
            });
            this.zzm.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzx
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view2) {
                    this.zza.zzf(view2);
                }
            });
            this.zzs = new zzn(new zzp() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzy
                @Override // com.google.android.libraries.places.widget.internal.autocomplete.ui.zzp
                public final /* synthetic */ void zza(AutocompletePrediction autocompletePrediction, int i10) {
                    this.zza.zzg(autocompletePrediction, i10);
                }
            }, zzngVar);
            this.zzk.setLayoutManager(new LinearLayoutManager(requireContext()));
            this.zzk.setItemAnimator(new zzaf(getResources()));
            this.zzk.setAdapter(this.zzs);
            this.zzk.addOnScrollListener(new zzt(this));
            AutocompleteUiCustomization autocompleteUiCustomizationZzp = zzngVar.zzp();
            if (autocompleteUiCustomizationZzp != null) {
                String zzd = autocompleteUiCustomizationZzp.getZzd();
                if (zzd == null) {
                    zzd = zznj.zze(requireContext(), R.string.autocomplete_search_hint);
                }
                this.zzj.setHint(zzd);
                String zzb = autocompleteUiCustomizationZzp.getZzb();
                if (zzb != null) {
                    this.zzf = zzb;
                }
            }
            Context context = getContext();
            if (context != null) {
                int i10 = R.style.AutocompleteFullscreen;
                zzoe zzoeVar = zzoe.zza;
                int iZza = zzod.zza(context, i10);
                ((ImageView) requireView().findViewById(R.id.autocomplete_google_maps_attribution_image)).setColorFilter(iZza);
                ((ImageButton) requireView().findViewById(R.id.autocomplete_disclosure_icon)).setColorFilter(iZza);
            }
            this.zzg.zza().i(getViewLifecycleOwner(), new InterfaceC6131E() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzaa
                @Override // androidx.view.InterfaceC6131E
                public final /* synthetic */ void onChanged(Object obj) throws Throwable {
                    this.zza.zzd((zzni) obj);
                }
            });
            if (bundle != null) {
                boolean z10 = bundle.getBoolean("arg-show-legal-disclosures");
                this.zzu = z10;
                if (z10) {
                    zzi();
                }
            }
            this.zzg.zzl();
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

    public final void zza() {
        this.zzg.zzk();
    }

    final /* synthetic */ void zze(View view) {
        this.zzg.zzj();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws Throwable {
        zzmo zzmoVar;
        super.onCreate(bundle);
        try {
            zzng zzngVar = this.zzc;
            zzoa zzoaVar = new zzoa(zzngVar.zza(), zzngVar.zzp(), zzngVar.zzd(), zzngVar.zzb(), zzngVar.zzf(), zzngVar.zzr(), this.zze);
            PlacesClient placesClient = this.zzb;
            AutocompleteSessionToken autocompleteSessionTokenZze = zzoaVar.zze();
            if (zzngVar.zza() == zzoh.JWT_AND_ONE_PLATFORM) {
                zzmoVar = zzmo.PLACES_UI_KIT;
            } else {
                zzmoVar = zzmo.ONE_PLATFORM_AUTOCOMPLETE_WIDGET;
            }
            zzny zznyVar = (zzny) new f0(this, new zznx(new zznt(placesClient, zzngVar, autocompleteSessionTokenZze, zzmoVar), zzoaVar, this.zzd)).a(zzny.class);
            this.zzg = zznyVar;
            zznyVar.zzb(bundle);
            requireActivity().getOnBackPressedDispatcher().i(this, new zzr(this, true));
        } catch (Error e10) {
            e = e10;
            Throwable th2 = e;
            zzmr.zzb(th2);
            throw th2;
        } catch (RuntimeException e11) {
            e = e11;
            Throwable th22 = e;
            zzmr.zzb(th22);
            throw th22;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.zzg.zzi();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.zzg.zzh();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@RecentlyNonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("arg-show-legal-disclosures", this.zzu);
    }
}
