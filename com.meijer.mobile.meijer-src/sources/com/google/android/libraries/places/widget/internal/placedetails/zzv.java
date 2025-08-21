package com.google.android.libraries.places.widget.internal.placedetails;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzv extends RecyclerView.F {
    private final TextView zza;
    private final TextView zzb;

    public final TextView zza() {
        return this.zza;
    }

    public final TextView zzb() {
        return this.zzb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzv(View itemView) {
        super(itemView);
        Intrinsics.j(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R.id.fuel_type);
        Intrinsics.i(viewFindViewById, "findViewById(...)");
        this.zza = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R.id.fuel_price);
        Intrinsics.i(viewFindViewById2, "findViewById(...)");
        this.zzb = (TextView) viewFindViewById2;
    }
}
