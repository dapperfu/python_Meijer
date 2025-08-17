package com.google.android.libraries.places.widget.internal.placedetails;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzu extends RecyclerView.h {
    private final List zza;

    public zzu(List items) {
        Intrinsics.j(items, "items");
        this.zza = items;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.zza.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.F f10, int i10) {
        zzt viewHolder = (zzt) f10;
        Intrinsics.j(viewHolder, "viewHolder");
        viewHolder.zza().setText((CharSequence) this.zza.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final /* bridge */ /* synthetic */ RecyclerView.F onCreateViewHolder(ViewGroup viewGroup, int i10) {
        Intrinsics.j(viewGroup, "viewGroup");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.expanded_open_hours_item, viewGroup, false);
        Intrinsics.g(viewInflate);
        return new zzt(viewInflate);
    }
}
