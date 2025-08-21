package com.google.android.libraries.places.widget.internal.placedetails;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzm extends RecyclerView.h {
    private final List zza;

    public zzm(List items) {
        Intrinsics.j(items, "items");
        this.zza = items;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.zza.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i10) {
        zzi zziVar = (zzi) this.zza.get(i10);
        if (zziVar instanceof zzh) {
            return 0;
        }
        if (zziVar instanceof zzf) {
            return 1;
        }
        if (zziVar instanceof zzg) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.F viewHolder, int i10) {
        Intrinsics.j(viewHolder, "viewHolder");
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType == 0) {
            TextView textViewZza = ((zzl) viewHolder).zza();
            Object obj = this.zza.get(i10);
            Intrinsics.h(obj, "null cannot be cast to non-null type com.google.android.libraries.places.widget.internal.placedetails.AboutTabItem.SectionTitle");
            textViewZza.setText(((zzh) obj).zza());
            return;
        }
        if (itemViewType != 1) {
            return;
        }
        TextView textViewZza2 = ((zzj) viewHolder).zza();
        Object obj2 = this.zza.get(i10);
        Intrinsics.h(obj2, "null cannot be cast to non-null type com.google.android.libraries.places.widget.internal.placedetails.AboutTabItem.Feature");
        textViewZza2.setText(((zzf) obj2).zza());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.F onCreateViewHolder(ViewGroup viewGroup, int i10) {
        Intrinsics.j(viewGroup, "viewGroup");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i10 == 0) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.about_tab_section_title, viewGroup, false);
            Intrinsics.g(viewInflate);
            return new zzl(viewInflate);
        }
        if (i10 == 1) {
            View viewInflate2 = layoutInflaterFrom.inflate(R.layout.about_tab_feature, viewGroup, false);
            Intrinsics.g(viewInflate2);
            return new zzj(viewInflate2);
        }
        if (i10 != 2) {
            throw new IllegalArgumentException("Invalid view type");
        }
        View viewInflate3 = layoutInflaterFrom.inflate(R.layout.about_tab_horizontal_divider, viewGroup, false);
        Intrinsics.g(viewInflate3);
        return new zzk(viewInflate3);
    }
}
