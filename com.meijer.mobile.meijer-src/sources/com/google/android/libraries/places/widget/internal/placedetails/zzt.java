package com.google.android.libraries.places.widget.internal.placedetails;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzt extends RecyclerView.F {
    private final TextView zza;

    public final TextView zza() {
        return this.zza;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzt(View itemView) {
        super(itemView);
        Intrinsics.j(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R.id.day_of_week_timings);
        Intrinsics.i(viewFindViewById, "findViewById(...)");
        this.zza = (TextView) viewFindViewById;
    }
}
