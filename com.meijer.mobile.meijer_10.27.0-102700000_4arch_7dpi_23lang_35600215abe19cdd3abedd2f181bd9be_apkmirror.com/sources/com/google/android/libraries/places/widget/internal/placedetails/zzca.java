package com.google.android.libraries.places.widget.internal.placedetails;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzca extends RecyclerView.F {
    private final ConstraintLayout zza;
    private final ImageView zzb;
    private final TextView zzc;
    private final TextView zzd;
    private final RatingStarsView zze;
    private final TextView zzf;
    private final ImageView zzg;
    private final View zzh;

    public final ConstraintLayout zza() {
        return this.zza;
    }

    public final ImageView zzb() {
        return this.zzb;
    }

    public final TextView zzc() {
        return this.zzc;
    }

    public final TextView zzd() {
        return this.zzd;
    }

    public final RatingStarsView zze() {
        return this.zze;
    }

    public final TextView zzf() {
        return this.zzf;
    }

    public final ImageView zzg() {
        return this.zzg;
    }

    public final View zzh() {
        return this.zzh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzca(View itemView) {
        super(itemView);
        Intrinsics.j(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R.id.author_attribution);
        Intrinsics.i(viewFindViewById, "findViewById(...)");
        this.zza = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R.id.author_image);
        Intrinsics.i(viewFindViewById2, "findViewById(...)");
        this.zzb = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R.id.author_name);
        Intrinsics.i(viewFindViewById3, "findViewById(...)");
        this.zzc = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R.id.publish_time);
        Intrinsics.i(viewFindViewById4, "findViewById(...)");
        this.zzd = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R.id.rating_stars);
        Intrinsics.i(viewFindViewById5, "findViewById(...)");
        this.zze = (RatingStarsView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R.id.review_text);
        Intrinsics.i(viewFindViewById6, "findViewById(...)");
        this.zzf = (TextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R.id.review_options);
        Intrinsics.i(viewFindViewById7, "findViewById(...)");
        this.zzg = (ImageView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R.id.report_review);
        Intrinsics.i(viewFindViewById8, "findViewById(...)");
        this.zzh = viewFindViewById8;
    }
}
