package com.google.android.libraries.places.widget.internal.placedetails;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.AbstractC6023l;
import androidx.viewpager2.adapter.a;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.Review;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzcf extends a {
    private final boolean zza;
    private final Place zzb;
    private final int zzc;
    private final List zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcf(FragmentManager fragmentManager, AbstractC6023l lifecycle, Context context, boolean z10, boolean z11, Place place, int i10) {
        super(fragmentManager, lifecycle);
        Intrinsics.j(fragmentManager, "fragmentManager");
        Intrinsics.j(lifecycle, "lifecycle");
        Intrinsics.j(context, "context");
        Intrinsics.j(place, "place");
        this.zza = z11;
        this.zzb = place;
        this.zzc = i10;
        List listC = CollectionsKt.c();
        if (zzce.zzk(place, context, z11)) {
            listC.add(1);
        }
        Intrinsics.j(place, "<this>");
        List<Review> reviews = place.getReviews();
        if (reviews != null && !reviews.isEmpty()) {
            listC.add(2);
        }
        Intrinsics.j(place, "<this>");
        if (z10 && (zzce.zza(place) || zzce.zzb(place) || zzce.zzc(place) || zzce.zzd(place) || zzce.zze(place) || zzce.zzf(place) || zzce.zzg(place) || zzce.zzh(place) || zzce.zzi(place) || zzce.zzj(place))) {
            listC.add(3);
        }
        this.zzd = CollectionsKt.a(listC);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: getItemCount */
    public final int getTotalNumberOfTabs() {
        return this.zzd.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i10) {
        return ((Number) this.zzd.get(i10)).intValue();
    }

    @Override // androidx.viewpager2.adapter.a
    public final Fragment createFragment(int i10) {
        int itemViewType = getItemViewType(i10);
        if (itemViewType != 1) {
            if (itemViewType != 2) {
                if (itemViewType == 3) {
                    int i11 = this.zzc;
                    zze zzeVar = new zze();
                    Bundle bundle = new Bundle();
                    bundle.putInt("arg-theme-res-id", i11);
                    zzeVar.setArguments(bundle);
                    return zzeVar;
                }
                throw new IllegalStateException("Invalid tab type.");
            }
            int i12 = this.zzc;
            zzbw zzbwVar = new zzbw();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("arg-theme-res-id", i12);
            zzbwVar.setArguments(bundle2);
            return zzbwVar;
        }
        int i13 = this.zzc;
        boolean z10 = this.zza;
        zzal zzalVar = new zzal();
        Bundle bundle3 = new Bundle();
        bundle3.putInt("arg-theme-res-id", i13);
        bundle3.putBoolean("arg-opening-hours-requested", z10);
        zzalVar.setArguments(bundle3);
        return zzalVar;
    }
}
