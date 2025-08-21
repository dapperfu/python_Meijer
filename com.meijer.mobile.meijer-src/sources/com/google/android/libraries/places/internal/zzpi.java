package com.google.android.libraries.places.internal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.widget.model.Orientation;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mv.InterfaceC15783O;

/* loaded from: classes6.dex */
public final class zzpi extends RecyclerView.h {
    private final InterfaceC15783O zza;
    private final Orientation zzb;
    private final int zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final List zzg;
    private final zzoy zzh;
    private final Function1 zzi;
    private List zzj;
    private int zzk;

    public zzpi(InterfaceC15783O lifecycleScope, Orientation placeDetailsFragmentOrientation, int i10, int i11, boolean z10, boolean z11, List places, zzoy zzoyVar, Function1 onItemClick) {
        Intrinsics.j(lifecycleScope, "lifecycleScope");
        Intrinsics.j(placeDetailsFragmentOrientation, "placeDetailsFragmentOrientation");
        Intrinsics.j(places, "places");
        Intrinsics.j(onItemClick, "onItemClick");
        this.zza = lifecycleScope;
        this.zzb = placeDetailsFragmentOrientation;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = z10;
        this.zzf = z11;
        this.zzg = places;
        this.zzh = zzoyVar;
        this.zzi = onItemClick;
        this.zzj = CollectionsKt.m();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: getItemCount */
    public final int getTotalNumberOfTabs() {
        return this.zzg.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final /* bridge */ /* synthetic */ RecyclerView.F onCreateViewHolder(ViewGroup parent, int i10) {
        Intrinsics.j(parent, "parent");
        final View viewInflate = this.zzb == Orientation.HORIZONTAL ? LayoutInflater.from(parent.getContext()).inflate(R.layout.place_details_compact_horizontal_fragment, parent, false) : LayoutInflater.from(parent.getContext()).inflate(R.layout.place_details_compact_vertical_fragment, parent, false);
        viewInflate.post(new Runnable() { // from class: com.google.android.libraries.places.internal.zzpe
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzk = (int) (r1.getWidth() / viewInflate.getContext().getResources().getDisplayMetrics().density);
            }
        });
        Intrinsics.g(viewInflate);
        return new zzph(this, viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(zzph holder, int i10) {
        Intrinsics.j(holder, "holder");
        onBindViewHolder(holder, i10, CollectionsKt.m());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(zzph holder, final int i10, List payloads) {
        Intrinsics.j(holder, "holder");
        Intrinsics.j(payloads, "payloads");
        View itemView = holder.itemView;
        Intrinsics.i(itemView, "itemView");
        Context context = holder.itemView.getContext();
        Intrinsics.i(context, "getContext(...)");
        zzoy zzoyVar = this.zzh;
        InterfaceC15783O interfaceC15783O = this.zza;
        int i11 = this.zzc;
        Orientation orientation = this.zzb;
        final com.google.android.libraries.places.widget.internal.placedetails.zzar zzarVar = new com.google.android.libraries.places.widget.internal.placedetails.zzar(itemView, context, zzoyVar, interfaceC15783O, i11, orientation);
        View itemView2 = holder.itemView;
        Intrinsics.i(itemView2, "itemView");
        Context context2 = holder.itemView.getContext();
        Intrinsics.i(context2, "getContext(...)");
        com.google.android.libraries.places.widget.internal.placedetails.zzaa zzaaVar = new com.google.android.libraries.places.widget.internal.placedetails.zzaa(itemView2, context2, i11, zzoyVar != null ? zzoyVar.zzb() : null);
        Object objU0 = CollectionsKt.u0(payloads);
        String str = objU0 instanceof String ? (String) objU0 : null;
        if (str != null) {
            if (Intrinsics.e(str, "place-image")) {
                holder.itemView.post(new Runnable() { // from class: com.google.android.libraries.places.internal.zzpd
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.libraries.places.widget.internal.placedetails.zzar zzarVar2 = zzarVar;
                        zzpi zzpiVar = this;
                        zzarVar2.zzc((com.google.android.libraries.places.widget.internal.placedetails.zzbp) zzpiVar.zzj.get(i10), zzpiVar.zzb == Orientation.VERTICAL || zzpiVar.zzk > 350, zzpiVar.zzj.size() > 0);
                    }
                });
                return;
            }
            return;
        }
        if (orientation == Orientation.HORIZONTAL) {
            holder.zza();
        } else {
            holder.zzb();
        }
        holder.itemView.findViewById(R.id.loading_indicator).setVisibility(8);
        holder.itemView.findViewById(R.id.loading_failed_message).setVisibility(8);
        zzarVar.zza();
        List list = this.zzg;
        zzarVar.zzb((Place) list.get(i10), this.zzf);
        zzaaVar.zza((Place) list.get(i10), true, true, true, true, true, null);
        zzaaVar.zzb((Place) list.get(i10), null);
        if (this.zzj.size() > i10) {
            holder.itemView.post(new Runnable() { // from class: com.google.android.libraries.places.internal.zzpc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.libraries.places.widget.internal.placedetails.zzar zzarVar2 = zzarVar;
                    zzpi zzpiVar = this;
                    zzarVar2.zzc((com.google.android.libraries.places.widget.internal.placedetails.zzbp) zzpiVar.zzj.get(i10), zzpiVar.zzb == Orientation.VERTICAL || zzpiVar.zzk > 350, zzpiVar.zzj.size() > 0);
                }
            });
        }
    }

    public final void zzc(List placeImages) {
        Intrinsics.j(placeImages, "placeImages");
        this.zzj = placeImages;
        int totalNumberOfTabs = getTotalNumberOfTabs();
        for (int i10 = 0; i10 < totalNumberOfTabs; i10++) {
            notifyItemChanged(i10, "place-image");
        }
    }
}
