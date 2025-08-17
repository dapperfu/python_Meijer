package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.q;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.internal.zzmr;
import java.util.List;

/* loaded from: classes6.dex */
public final class zzah extends q {
    private final zzai zza;
    private int zzb;
    private boolean zzc;

    public zzah(zzai zzaiVar) {
        super(new zzag(null));
        this.zzc = true;
        this.zza = zzaiVar;
    }

    @Override // androidx.recyclerview.widget.q
    public final void submitList(List list) throws Throwable {
        try {
            int size = 0;
            this.zzc = (this.zzb != 0 || list == null || list.isEmpty()) ? false : true;
            if (list != null) {
                size = list.size();
            }
            this.zzb = size;
            super.submitList(list);
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

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzak onCreateViewHolder(ViewGroup viewGroup, int i10) {
        try {
            return new zzak(this.zza, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.places_autocomplete_prediction, viewGroup, false));
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(zzak zzakVar, int i10) {
        try {
            zzakVar.zza((AutocompletePrediction) getItem(i10), this.zzc);
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }
}
