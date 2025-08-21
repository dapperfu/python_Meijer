package com.google.android.libraries.places.widget.internal.placedetails;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.fullstory.FS;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.Review;
import com.google.android.libraries.places.internal.zzoq;
import com.google.android.libraries.places.internal.zzor;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import mv.C15809k;
import mv.InterfaceC15783O;

/* loaded from: classes6.dex */
public final class zzcd extends RecyclerView.h {
    public static final /* synthetic */ int zza = 0;
    private final List zzb;
    private final InterfaceC15783O zzc;
    private final int zzd;
    private final zzor zze;

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.F f10, int i10) {
        final zzca viewHolder = (zzca) f10;
        Intrinsics.j(viewHolder, "viewHolder");
        final Review review = (Review) this.zzb.get(i10);
        final Context context = viewHolder.itemView.getContext();
        String photoUri = review.getAuthorAttribution().getPhotoUri();
        Drawable drawableResources_getDrawable = FS.Resources_getDrawable(context, R.drawable.review_author_image_placeholder);
        viewHolder.zzb().setImageDrawable(drawableResources_getDrawable);
        if (photoUri != null) {
            C15809k.d(this.zzc, null, null, new zzcc(this, photoUri, viewHolder, drawableResources_getDrawable, null), 3, null);
        }
        zzf(viewHolder.zzc(), review.getAuthorAttribution().getName());
        zzf(viewHolder.zzd(), review.getRelativePublishTimeDescription());
        RatingStarsView ratingStarsViewZze = viewHolder.zze();
        Double rating = review.getRating();
        Intrinsics.i(rating, "getRating(...)");
        ratingStarsViewZze.zza(rating.doubleValue());
        TextView textViewZzf = viewHolder.zzf();
        String text = review.getText();
        if (text == null) {
            text = "";
        }
        zzf(textViewZzf, text);
        viewHolder.zzg().setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzbz
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                View viewZzh = viewHolder.zzh();
                if (viewZzh.getVisibility() == 0) {
                    viewZzh.setVisibility(8);
                } else {
                    viewZzh.setVisibility(0);
                }
            }
        });
        viewHolder.zzh().setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzbx
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                zzcd.zzd(context, this, viewHolder, review, view);
            }
        });
        viewHolder.zza().setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzby
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                zzcd.zze(context, this, review, view);
            }
        });
        viewHolder.zza().setContentDescription(context.getString(R.string.place_details_view_review_author_content_description, review.getAuthorAttribution().getName()));
    }

    public zzcd(List reviews, zzor zzorVar, InterfaceC15783O scope, int i10) {
        Intrinsics.j(reviews, "reviews");
        Intrinsics.j(scope, "scope");
        this.zzb = reviews;
        this.zze = zzorVar;
        this.zzc = scope;
        this.zzd = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzd(Context context, zzcd zzcdVar, zzca zzcaVar, Review review, View view) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(review.getFlagContentUri());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Intrinsics.g(context);
            new zzoq(context, zzcdVar.zzd).show();
        }
        zzcaVar.zzh().setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zze(Context context, zzcd zzcdVar, Review review, View view) {
        Intent intent = new Intent("android.intent.action.VIEW");
        String uri = review.getAuthorAttribution().getUri();
        intent.setData(uri != null ? Uri.parse(uri) : null);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Intrinsics.g(context);
            new zzoq(context, zzcdVar.zzd).show();
        }
    }

    private static final void zzf(View view, CharSequence charSequence) {
        if (charSequence == null || StringsKt.s0(charSequence)) {
            view.setVisibility(8);
            return;
        }
        if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
        view.setVisibility(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: getItemCount */
    public final int getTotalNumberOfTabs() {
        return this.zzb.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final /* bridge */ /* synthetic */ RecyclerView.F onCreateViewHolder(ViewGroup viewGroup, int i10) {
        Intrinsics.j(viewGroup, "viewGroup");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.place_details_reviews_item, viewGroup, false);
        Intrinsics.g(viewInflate);
        return new zzca(viewInflate);
    }
}
