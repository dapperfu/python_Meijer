package com.google.android.libraries.places.widget.internal.placedetails;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzq extends RecyclerView.F {
    private final TextView zza;
    private final TextView zzb;
    private final CardView zzc;
    private final TextView zzd;

    public final TextView zza() {
        return this.zza;
    }

    public final TextView zzb() {
        return this.zzb;
    }

    public final CardView zzc() {
        return this.zzc;
    }

    public final TextView zzd() {
        return this.zzd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzq(View itemView) {
        super(itemView);
        Intrinsics.j(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R.id.connector_name);
        Intrinsics.i(viewFindViewById, "findViewById(...)");
        this.zza = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R.id.max_charge_rate);
        Intrinsics.i(viewFindViewById2, "findViewById(...)");
        this.zzb = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R.id.chargers_available_card);
        Intrinsics.i(viewFindViewById3, "findViewById(...)");
        this.zzc = (CardView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R.id.chargers_available);
        Intrinsics.i(viewFindViewById4, "findViewById(...)");
        this.zzd = (TextView) viewFindViewById4;
    }
}
