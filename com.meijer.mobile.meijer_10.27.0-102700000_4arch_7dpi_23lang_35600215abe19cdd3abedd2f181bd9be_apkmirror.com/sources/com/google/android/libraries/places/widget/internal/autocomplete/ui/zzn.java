package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.q;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.internal.zzmr;
import com.google.android.libraries.places.internal.zzng;
import java.util.List;

/* loaded from: classes6.dex */
public final class zzn extends q {
    private final zzp zza;
    private int zzb;
    private boolean zzc;
    private final zzng zzd;

    public zzn(zzp zzpVar, zzng zzngVar) {
        super(new zzm(null));
        this.zzc = true;
        this.zza = zzpVar;
        this.zzd = zzngVar;
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
    public final zzq onCreateViewHolder(ViewGroup viewGroup, int i10) {
        try {
            return new zzq(this.zza, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.autocomplete_prediction_item, viewGroup, false), this.zzd);
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(zzq zzqVar, int i10) {
        try {
            zzqVar.zza((AutocompletePrediction) getItem(i10), this.zzc);
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }
}
