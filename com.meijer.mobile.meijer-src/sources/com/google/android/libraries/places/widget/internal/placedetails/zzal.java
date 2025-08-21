package com.google.android.libraries.places.widget.internal.placedetails;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.f0;
import com.fullstory.FS;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.internal.zzoq;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class zzal extends Fragment {
    static final /* synthetic */ KProperty[] zza = {Reflection.f(new MutablePropertyReference1Impl(zzal.class, "themeResId", "getThemeResId()I", 0)), Reflection.f(new MutablePropertyReference1Impl(zzal.class, "openingHoursRequested", "getOpeningHoursRequested()Z", 0))};
    private zzbi zzb;
    private final ReadWriteProperty zzc;
    private final ReadWriteProperty zzd;
    private RecyclerView zze;
    private TextView zzf;
    private RecyclerView zzg;
    private TextView zzh;
    private View zzi;
    private TextView zzj;
    private ImageView zzk;
    private TextView zzl;
    private TextView zzm;
    private TextView zzn;
    private ImageView zzo;
    private RecyclerView zzp;
    private ImageView zzq;
    private TextView zzr;
    private ImageView zzs;
    private TextView zzt;
    private ImageView zzu;
    private TextView zzv;
    private ImageView zzw;
    private boolean zzx;

    /* JADX WARN: Removed duplicated region for block: B:102:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void zza(final com.google.android.libraries.places.widget.internal.placedetails.zzal r16, final com.google.android.libraries.places.api.model.Place r17) {
        /*
            Method dump skipped, instructions count: 1023
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.internal.placedetails.zzal.zza(com.google.android.libraries.places.widget.internal.placedetails.zzal, com.google.android.libraries.places.api.model.Place):void");
    }

    static /* synthetic */ void zzf(zzal zzalVar, View view) {
        RecyclerView recyclerView = null;
        if (zzalVar.zzx) {
            ImageView imageView = zzalVar.zzo;
            if (imageView == null) {
                Intrinsics.x("expandOpenHours");
                imageView = null;
            }
            imageView.setContentDescription(zzalVar.requireContext().getString(R.string.show_weekly_hours_content_description));
            RecyclerView recyclerView2 = zzalVar.zzp;
            if (recyclerView2 == null) {
                Intrinsics.x("expandedOpenHours");
            } else {
                recyclerView = recyclerView2;
            }
            recyclerView.setVisibility(8);
        } else {
            ImageView imageView2 = zzalVar.zzo;
            if (imageView2 == null) {
                Intrinsics.x("expandOpenHours");
                imageView2 = null;
            }
            imageView2.setContentDescription(zzalVar.requireContext().getString(R.string.hide_weekly_hours_content_description));
            RecyclerView recyclerView3 = zzalVar.zzp;
            if (recyclerView3 == null) {
                Intrinsics.x("expandedOpenHours");
            } else {
                recyclerView = recyclerView3;
            }
            recyclerView.setVisibility(0);
        }
        zzalVar.zzx = !zzalVar.zzx;
        zzalVar.zzk();
    }

    private final int zzg() {
        return ((Number) this.zzc.getValue(this, zza[0])).intValue();
    }

    private final boolean zzh() {
        return ((Boolean) this.zzd.getValue(this, zza[1])).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzi(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        try {
            requireContext().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Context contextRequireContext = requireContext();
            Intrinsics.i(contextRequireContext, "requireContext(...)");
            new zzoq(contextRequireContext, zzg()).show();
        }
    }

    private final void zzj(View view, CharSequence charSequence) {
        if (charSequence == null || StringsKt.s0(charSequence)) {
            view.setVisibility(8);
            return;
        }
        if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
        view.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzk() {
        zzbi zzbiVar = this.zzb;
        if (zzbiVar == null) {
            Intrinsics.x("viewModel");
            zzbiVar = null;
        }
        zzbiVar.zzh();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.j(inflater, "inflater");
        boolean z10 = requireArguments().getBoolean("arg-opening-hours-requested");
        KProperty<?>[] kPropertyArr = zza;
        this.zzd.setValue(this, kPropertyArr[1], Boolean.valueOf(z10));
        int i10 = requireArguments().getInt("arg-theme-res-id");
        this.zzc.setValue(this, kPropertyArr[0], Integer.valueOf(i10));
        View viewInflate = inflater.cloneInContext(new ContextThemeWrapper(getContext(), zzg())).inflate(R.layout.place_details_overview_fragment, viewGroup, false);
        Intrinsics.i(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.j(view, "view");
        super.onViewCreated(view, bundle);
        this.zze = (RecyclerView) view.findViewById(R.id.ev_charging_options);
        this.zzf = (TextView) view.findViewById(R.id.ev_chargers_availability_last_updated);
        this.zzg = (RecyclerView) view.findViewById(R.id.fuel_options);
        this.zzh = (TextView) view.findViewById(R.id.stale_fuel_prices_message);
        this.zzi = view.findViewById(R.id.type_specific_info_divider);
        this.zzj = (TextView) view.findViewById(R.id.address_text);
        this.zzk = (ImageView) view.findViewById(R.id.address_icon);
        this.zzt = (TextView) view.findViewById(R.id.phone_text);
        this.zzu = (ImageView) view.findViewById(R.id.phone_icon);
        this.zzr = (TextView) view.findViewById(R.id.website_text);
        this.zzs = (ImageView) view.findViewById(R.id.website_icon);
        this.zzv = (TextView) view.findViewById(R.id.plus_code_text);
        this.zzw = (ImageView) view.findViewById(R.id.plus_code_icon);
        this.zzl = (TextView) view.findViewById(R.id.open_status);
        this.zzm = (TextView) view.findViewById(R.id.open_status_and_time_spacer);
        this.zzn = (TextView) view.findViewById(R.id.next_open_or_close_time);
        this.zzo = (ImageView) view.findViewById(R.id.expand_open_hours);
        this.zzp = (RecyclerView) view.findViewById(R.id.expanded_open_hours);
        this.zzq = (ImageView) view.findViewById(R.id.open_hours_icon);
        zzbi zzbiVar = this.zzb;
        if (zzbiVar == null) {
            Intrinsics.x("viewModel");
            zzbiVar = null;
        }
        zzbiVar.zza().i(getViewLifecycleOwner(), new zzak(new zzaj(this)));
    }

    public zzal() {
        Delegates delegates = Delegates.f143781a;
        this.zzc = delegates.a();
        this.zzd = delegates.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzl(Place place, zzal zzalVar, View view) {
        try {
            zzalVar.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat(String.valueOf(place.getInternationalPhoneNumber())))));
        } catch (ActivityNotFoundException unused) {
            FS.log_w("OverviewFragment", "No dialer app available, cannot dial the number.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Fragment fragmentRequireParentFragment = requireParentFragment();
        Intrinsics.i(fragmentRequireParentFragment, "requireParentFragment(...)");
        Application application = requireActivity().getApplication();
        Intrinsics.i(application, "getApplication(...)");
        this.zzb = (zzbi) new f0(fragmentRequireParentFragment, zzat.zza(application)).a(zzbi.class);
    }
}
