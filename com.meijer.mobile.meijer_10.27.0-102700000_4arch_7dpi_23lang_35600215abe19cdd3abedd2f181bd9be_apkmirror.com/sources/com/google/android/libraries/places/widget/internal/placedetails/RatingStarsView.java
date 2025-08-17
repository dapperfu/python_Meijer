package com.google.android.libraries.places.widget.internal.placedetails;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.R;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/google/android/libraries/places/widget/internal/placedetails/RatingStarsView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "stars", "", "Landroid/widget/ImageView;", "[Landroid/widget/ImageView;", "setRating", "", "rating", "", "StarsModel", "java.com.google.android.libraries.places.widget.internal.placedetails_rating_stars_view_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RatingStarsView extends FrameLayout {
    private final ImageView[] zza;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public RatingStarsView(@RecentlyNonNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.j(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RatingStarsView(@RecentlyNonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.j(context, "context");
        LayoutInflater.from(context).inflate(R.layout.rating_stars_view, this);
        this.zza = new ImageView[]{(ImageView) findViewById(R.id.rating_star_1), (ImageView) findViewById(R.id.rating_star_2), (ImageView) findViewById(R.id.rating_star_3), (ImageView) findViewById(R.id.rating_star_4), (ImageView) findViewById(R.id.rating_star_5)};
    }

    public final void zza(double d10) {
        zzbr zzbrVarZza = zzbq.zza(d10);
        ImageView[] imageViewArr = this.zza;
        int length = imageViewArr.length;
        for (int i10 = 0; i10 < 5; i10++) {
            imageViewArr[i10].setImageDrawable(getResources().getDrawable(zzbrVarZza.zza(i10), getContext().getTheme()));
        }
    }

    public /* synthetic */ RatingStarsView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i10, @RecentlyNonNull DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }
}
