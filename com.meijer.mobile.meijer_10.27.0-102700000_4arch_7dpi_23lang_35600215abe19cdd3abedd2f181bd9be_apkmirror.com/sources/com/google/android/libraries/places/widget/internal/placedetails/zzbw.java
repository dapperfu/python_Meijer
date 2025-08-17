package com.google.android.libraries.places.widget.internal.placedetails;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C6031t;
import androidx.view.f0;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.Review;
import com.google.android.libraries.places.internal.zzon;
import com.google.android.libraries.places.internal.zzoo;
import com.google.android.libraries.places.internal.zzor;
import com.google.android.libraries.places.internal.zzoy;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* loaded from: classes6.dex */
public final class zzbw extends Fragment {
    static final /* synthetic */ KProperty[] zza = {Reflection.f(new MutablePropertyReference1Impl(zzbw.class, "themeResId", "getThemeResId()I", 0))};
    private zzbi zzb;
    private RecyclerView zzc;
    private final ReadWriteProperty zzd = Delegates.f142874a.a();

    static /* synthetic */ void zzc(zzbw zzbwVar) {
        zzbi zzbiVar = zzbwVar.zzb;
        if (zzbiVar == null) {
            Intrinsics.y("viewModel");
            zzbiVar = null;
        }
        zzbiVar.zzh();
    }

    private final int zzd() {
        return ((Number) this.zzd.getValue(this, zza[0])).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zze(zzbw zzbwVar, View view) {
        Context contextRequireContext = zzbwVar.requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        new zzoo(contextRequireContext, zzbwVar.zzd(), CollectionsKt.p(zzon.zza, zzon.zzc)).show();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.j(inflater, "inflater");
        int i10 = requireArguments().getInt("arg-theme-res-id");
        this.zzd.setValue(this, zza[0], Integer.valueOf(i10));
        View viewInflate = inflater.cloneInContext(new ContextThemeWrapper(getContext(), zzd())).inflate(R.layout.place_details_reviews_fragment, viewGroup, false);
        Intrinsics.i(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.j(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.reviews_list);
        this.zzc = recyclerView;
        zzbi zzbiVar = null;
        if (recyclerView == null) {
            Intrinsics.y("recyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        ((ImageView) view.findViewById(R.id.about_reviews_icon)).setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzbt
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view2) {
                zzbw.zze(this.zza, view2);
            }
        });
        zzbi zzbiVar2 = this.zzb;
        if (zzbiVar2 == null) {
            Intrinsics.y("viewModel");
        } else {
            zzbiVar = zzbiVar2;
        }
        zzbiVar.zza().i(getViewLifecycleOwner(), new zzbv(new zzbu(this)));
    }

    public static final /* synthetic */ void zza(final zzbw zzbwVar, Place place) {
        zzor zzorVarZze;
        List<Review> reviews = place.getReviews();
        if (reviews != null) {
            RecyclerView recyclerView = zzbwVar.zzc;
            RecyclerView recyclerView2 = null;
            if (recyclerView == null) {
                Intrinsics.y("recyclerView");
                recyclerView = null;
            }
            zzbi zzbiVar = zzbwVar.zzb;
            if (zzbiVar == null) {
                Intrinsics.y("viewModel");
                zzbiVar = null;
            }
            zzoy zzoyVarZze = zzbiVar.zze();
            if (zzoyVarZze != null) {
                zzorVarZze = zzoyVarZze.zze();
            } else {
                zzorVarZze = null;
            }
            recyclerView.setAdapter(new zzcd(reviews, zzorVarZze, C6031t.a(zzbwVar), zzbwVar.zzd()));
            RecyclerView recyclerView3 = zzbwVar.zzc;
            if (recyclerView3 == null) {
                Intrinsics.y("recyclerView");
            } else {
                recyclerView2 = recyclerView3;
            }
            recyclerView2.post(new Runnable() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzbs
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzbw.zzc(this.zza);
                }
            });
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
