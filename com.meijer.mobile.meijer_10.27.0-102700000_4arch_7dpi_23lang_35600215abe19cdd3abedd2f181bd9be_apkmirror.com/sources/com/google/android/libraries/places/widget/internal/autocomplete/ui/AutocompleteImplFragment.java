package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import Be.p;
import Z1.b;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC5989E;
import androidx.view.f0;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.internal.zzdy;
import com.google.android.libraries.places.internal.zzmo;
import com.google.android.libraries.places.internal.zzmr;
import com.google.android.libraries.places.internal.zzng;
import com.google.android.libraries.places.internal.zzni;
import com.google.android.libraries.places.internal.zznj;
import com.google.android.libraries.places.internal.zznk;
import com.google.android.libraries.places.internal.zznt;
import com.google.android.libraries.places.internal.zznx;
import com.google.android.libraries.places.internal.zzny;
import com.google.android.libraries.places.internal.zzoa;
import com.google.android.libraries.places.internal.zzoz;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;

@SuppressLint({"ValidFragment"})
/* loaded from: classes6.dex */
public final class AutocompleteImplFragment extends Fragment {
    public static final /* synthetic */ int zza = 0;
    private final PlacesClient zzb;
    private final zzng zzc;
    private final zzoz zzd;
    private final zzdy zze;
    private zzny zzf;
    private PlaceSelectionListener zzg;
    private EditText zzh;
    private RecyclerView zzi;
    private View zzj;
    private View zzk;
    private View zzl;
    private View zzm;
    private View zzn;
    private View zzo;
    private View zzp;
    private View zzq;
    private TextView zzr;
    private TextView zzs;
    private zzah zzt;
    private final zzk zzu;

    /* synthetic */ AutocompleteImplFragment(int i10, PlacesClient placesClient, zzng zzngVar, zzoz zzozVar, zzdy zzdyVar, byte[] bArr) {
        this(i10, placesClient, zzngVar, zzozVar, zzdyVar);
    }

    public final void zza(@RecentlyNonNull PlaceSelectionListener placeSelectionListener) {
        this.zzg = placeSelectionListener;
    }

    final /* synthetic */ zzny zzg() {
        return this.zzf;
    }

    final /* synthetic */ EditText zzh() {
        return this.zzh;
    }

    private AutocompleteImplFragment(int i10, PlacesClient placesClient, zzng zzngVar, zzoz zzozVar, zzdy zzdyVar) {
        super(i10);
        this.zzu = new zzk(this, null);
        this.zzb = placesClient;
        this.zzc = zzngVar;
        this.zzd = zzozVar;
        this.zze = zzdyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzf(View view) {
        try {
            this.zzf.zzg(this.zzh.getText().toString(), this.zzh.getSelectionEnd());
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zze(AutocompletePrediction autocompletePrediction, int i10) {
        try {
            this.zzf.zzd(autocompletePrediction, i10);
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzd(View view) {
        try {
            this.zzf.zzf();
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzb(zzni zzniVar) throws Throwable {
        try {
            this.zzk.setVisibility(0);
            this.zzl.setVisibility(0);
            this.zzm.setVisibility(8);
            this.zzn.setVisibility(8);
            this.zzo.setVisibility(0);
            this.zzp.setVisibility(8);
            this.zzq.setVisibility(8);
            this.zzr.setVisibility(8);
            this.zzs.setVisibility(8);
            AutocompleteActivityMode autocompleteActivityMode = AutocompleteActivityMode.FULLSCREEN;
            switch (zzniVar.zzg() - 1) {
                case 0:
                    zzng zzngVar = this.zzc;
                    if (TextUtils.isEmpty(zzngVar.zzf())) {
                        this.zzk.setVisibility(8);
                    }
                    this.zzh.requestFocus();
                    this.zzh.setText(zzngVar.zzf());
                    EditText editText = this.zzh;
                    editText.setSelection(editText.getText().length());
                    return;
                case 1:
                    this.zzt.submitList(null);
                    this.zzk.setVisibility(8);
                    this.zzh.getText().clear();
                    return;
                case 2:
                    this.zzm.setVisibility(0);
                    return;
                case 3:
                    this.zzs.setVisibility(8);
                    this.zzn.setVisibility(0);
                    this.zzo.setVisibility(8);
                    this.zzq.setVisibility(0);
                    this.zzr.setVisibility(0);
                    return;
                case 4:
                    this.zzt.submitList(zzniVar.zzb());
                    this.zzp.setVisibility(0);
                    return;
                case 5:
                    this.zzt.submitList(null);
                    this.zzo.setVisibility(8);
                    this.zzq.setVisibility(0);
                    this.zzs.setVisibility(4);
                    this.zzr.setText(getString(R.string.places_autocomplete_no_results_for_query, zzniVar.zza()));
                    this.zzr.setVisibility(0);
                    return;
                case 6:
                    break;
                case 7:
                default:
                    this.zzg.onPlaceSelected((Place) p.q(zzniVar.zzc()));
                    return;
                case 8:
                    AutocompletePrediction autocompletePrediction = (AutocompletePrediction) p.r(zzniVar.zzd(), "Prediction should not be null.");
                    this.zzh.clearFocus();
                    EditText editText2 = this.zzh;
                    zzk zzkVar = this.zzu;
                    editText2.removeTextChangedListener(zzkVar);
                    this.zzh.setText(autocompletePrediction.getPrimaryText(null));
                    this.zzh.addTextChangedListener(zzkVar);
                    break;
                case 9:
                    this.zzg.onError((Status) p.q(zzniVar.zzf()));
                    return;
            }
            this.zzt.submitList(null);
            this.zzo.setVisibility(8);
            this.zzq.setVisibility(0);
            this.zzs.setVisibility(0);
            this.zzr.setText(getString(R.string.places_search_error));
            this.zzr.setVisibility(0);
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
            this.zzh = (EditText) view.findViewById(R.id.places_autocomplete_search_bar);
            this.zzi = (RecyclerView) view.findViewById(R.id.places_autocomplete_list);
            this.zzj = view.findViewById(R.id.places_autocomplete_back_button);
            this.zzk = view.findViewById(R.id.places_autocomplete_clear_button);
            this.zzl = view.findViewById(R.id.places_autocomplete_search_bar_separator);
            this.zzm = view.findViewById(R.id.places_autocomplete_progress);
            this.zzn = view.findViewById(R.id.places_autocomplete_try_again_progress);
            this.zzo = view.findViewById(R.id.places_autocomplete_powered_by_google);
            this.zzp = view.findViewById(R.id.places_autocomplete_powered_by_google_separator);
            this.zzq = view.findViewById(R.id.places_autocomplete_sad_cloud);
            this.zzr = (TextView) view.findViewById(R.id.places_autocomplete_error_message);
            this.zzs = (TextView) view.findViewById(R.id.places_autocomplete_try_again);
            this.zzh.addTextChangedListener(this.zzu);
            this.zzh.setOnFocusChangeListener(new zzl(null));
            EditText editText = this.zzh;
            zzng zzngVar = this.zzc;
            editText.setHint(TextUtils.isEmpty(zzngVar.zzg()) ? zznj.zze(requireContext(), R.string.places_autocomplete_search_hint) : zzngVar.zzg());
            AutocompleteActivityMode autocompleteActivityMode = AutocompleteActivityMode.FULLSCREEN;
            int iOrdinal = zzngVar.zzb().ordinal();
            if (iOrdinal == 0) {
                view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzc
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final /* synthetic */ WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                        int i10 = AutocompleteImplFragment.zza;
                        View view3 = view;
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        if (marginLayoutParams != null) {
                            marginLayoutParams.setMargins(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
                            view3.setLayoutParams(marginLayoutParams);
                        }
                        return windowInsets;
                    }
                });
                int iZzm = zzngVar.zzm();
                int iZzn = zzngVar.zzn();
                if (Color.alpha(iZzm) < 255) {
                    iZzm = 0;
                }
                if (iZzm != 0 && iZzn != 0) {
                    int iZza = zznk.zza(iZzm, b.c(requireContext(), R.color.places_text_white_alpha_87), b.c(requireContext(), R.color.places_text_black_alpha_87));
                    int iZza2 = zznk.zza(iZzm, b.c(requireContext(), R.color.places_text_white_alpha_60), b.c(requireContext(), R.color.places_text_black_alpha_60));
                    view.findViewById(R.id.places_autocomplete_search_bar_container).setBackgroundColor(iZzm);
                    Window window = requireActivity().getWindow();
                    window.setStatusBarColor(iZzn);
                    if (zznk.zzb(iZzn, -1, -16777216)) {
                        window.getDecorView().setSystemUiVisibility(8192);
                    }
                    this.zzh.setTextColor(iZza);
                    this.zzh.setHintTextColor(iZza2);
                    zznk.zzc((ImageView) this.zzj, iZza);
                    zznk.zzc((ImageView) this.zzk, iZza);
                }
            } else if (iOrdinal == 1) {
                requireActivity().getWindow().addFlags(67108864);
                view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzd
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final /* synthetic */ WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                        int i10 = AutocompleteImplFragment.zza;
                        View view3 = view;
                        view3.setPaddingRelative(view3.getPaddingStart(), windowInsets.getSystemWindowInsetTop(), view3.getPaddingEnd(), view3.getPaddingBottom());
                        return windowInsets;
                    }
                });
            }
            this.zzj.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zze
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view2) {
                    this.zza.zzc(view2);
                }
            });
            this.zzk.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzf
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view2) {
                    this.zza.zzd(view2);
                }
            });
            this.zzs.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzh
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view2) {
                    this.zza.zzf(view2);
                }
            });
            this.zzt = new zzah(new zzai() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzg
                @Override // com.google.android.libraries.places.widget.internal.autocomplete.ui.zzai
                public final /* synthetic */ void zza(AutocompletePrediction autocompletePrediction, int i10) {
                    this.zza.zze(autocompletePrediction, i10);
                }
            });
            this.zzi.setLayoutManager(new LinearLayoutManager(requireContext()));
            this.zzi.setItemAnimator(new zzaf(getResources()));
            this.zzi.setAdapter(this.zzt);
            this.zzi.addOnScrollListener(new zzb(this));
            this.zzf.zza().i(getViewLifecycleOwner(), new InterfaceC5989E() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzi
                @Override // androidx.view.InterfaceC5989E
                public final /* synthetic */ void onChanged(Object obj) throws Throwable {
                    this.zza.zzb((zzni) obj);
                }
            });
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

    final /* synthetic */ void zzc(View view) {
        this.zzf.zzj();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            zzng zzngVar = this.zzc;
            zzoa zzoaVar = new zzoa(zzngVar.zza(), null, zzngVar.zzd(), zzngVar.zzb(), zzngVar.zzf(), zzngVar.zzr(), this.zze);
            zzny zznyVar = (zzny) new f0(this, new zznx(new zznt(this.zzb, zzngVar, zzoaVar.zze(), zzmo.AUTOCOMPLETE_WIDGET), zzoaVar, this.zzd)).a(zzny.class);
            this.zzf = zznyVar;
            zznyVar.zzb(bundle);
            requireActivity().getOnBackPressedDispatcher().i(this, new zza(this, true));
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.zzf.zzk();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.zzf.zzi();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.zzf.zzh();
    }
}
