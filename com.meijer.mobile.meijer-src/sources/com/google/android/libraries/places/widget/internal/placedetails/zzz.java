package com.google.android.libraries.places.widget.internal.placedetails;

import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.libraries.places.api.model.Place;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzz extends ClickableSpan {
    final /* synthetic */ zzaa zza;
    final /* synthetic */ Place zzb;
    final /* synthetic */ zzp zzc;

    zzz(zzaa zzaaVar, Place place, zzp zzpVar) {
        this.zza = zzaaVar;
        this.zzb = place;
        this.zzc = zzpVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        Intrinsics.j(widget, "widget");
        this.zza.zzg(zzaa.zzh(this.zzb));
        zzp zzpVar = this.zzc;
        if (zzpVar != null) {
            zzpVar.zzf();
        }
    }
}
