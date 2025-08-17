package com.google.android.libraries.places.widget.internal.placedetails;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.AccessibilityOptions;
import com.google.android.libraries.places.api.model.Money;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.zzey;
import com.google.android.libraries.places.internal.zzdy;
import com.google.android.libraries.places.internal.zzoq;
import java.util.Currency;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class zzaa {
    private final View zza;
    private final Context zzb;
    private final int zzc;
    private final zzdy zzd;
    private final TextView zze;
    private final View zzf;
    private final LinearLayout zzg;
    private final TextView zzh;
    private final TextView zzi;
    private final TextView zzj;
    private final ImageView zzk;
    private final TextView zzl;
    private final TextView zzm;
    private final TextView zzn;
    private final TextView zzo;
    private final TextView zzp;
    private final TextView zzq;
    private final View zzr;

    public zzaa(View view, Context context, int i10, zzdy zzdyVar) {
        Intrinsics.j(view, "view");
        Intrinsics.j(context, "context");
        this.zza = view;
        this.zzb = context;
        this.zzc = i10;
        this.zzd = zzdyVar;
        View viewFindViewById = view.findViewById(R.id.place_rating);
        Intrinsics.i(viewFindViewById, "findViewById(...)");
        this.zze = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.rating_stars);
        Intrinsics.i(viewFindViewById2, "findViewById(...)");
        this.zzf = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.place_rating_container);
        Intrinsics.i(viewFindViewById3, "findViewById(...)");
        this.zzg = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.place_rating_count);
        Intrinsics.i(viewFindViewById4, "findViewById(...)");
        this.zzh = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.place_type);
        Intrinsics.i(viewFindViewById5, "findViewById(...)");
        this.zzi = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.place_price);
        Intrinsics.i(viewFindViewById6, "findViewById(...)");
        this.zzj = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.wheelchair_accessibility_icon);
        Intrinsics.i(viewFindViewById7, "findViewById(...)");
        this.zzk = (ImageView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.place_wheelchair_icon_label);
        Intrinsics.i(viewFindViewById8, "findViewById(...)");
        this.zzl = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.place_type_price_spacer);
        Intrinsics.i(viewFindViewById9, "findViewById(...)");
        this.zzm = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.place_price_a11y_spacer);
        Intrinsics.i(viewFindViewById10, "findViewById(...)");
        this.zzn = (TextView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.place_open_status);
        Intrinsics.i(viewFindViewById11, "findViewById(...)");
        this.zzo = (TextView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.place_open_status_and_time_spacer);
        Intrinsics.i(viewFindViewById12, "findViewById(...)");
        this.zzp = (TextView) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.place_next_open_or_close_time);
        Intrinsics.i(viewFindViewById13, "findViewById(...)");
        this.zzq = (TextView) viewFindViewById13;
        View viewFindViewById14 = view.findViewById(R.id.open_in_maps);
        Intrinsics.i(viewFindViewById14, "findViewById(...)");
        this.zzr = viewFindViewById14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg(Intent intent) {
        try {
            this.zzb.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            new zzoq(this.zzb, this.zzc).show();
        }
    }

    private static final void zzi(View view, CharSequence charSequence, boolean z10) {
        if (!z10 || charSequence == null || StringsKt.r0(charSequence)) {
            view.setVisibility(8);
            return;
        }
        if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
        view.setVisibility(0);
    }

    public final void zza(Place place, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, zzp zzpVar) {
        String currencyCode;
        String string;
        Integer userRatingCount;
        String string2;
        Intrinsics.j(place, "place");
        Double rating = place.getRating();
        if (rating == null || place.getUserRatingCount() == null || ((userRatingCount = place.getUserRatingCount()) != null && userRatingCount.intValue() == 0)) {
            zzi(this.zze, this.zzb.getString(R.string.place_details_no_reviews), z10);
            this.zzf.setVisibility(8);
            this.zzh.setVisibility(8);
        } else {
            TextView textView = this.zze;
            zzi(textView, rating.toString(), z10);
            View view = this.zzf;
            if (view instanceof RatingStarsView) {
                RatingStarsView ratingStarsView = (RatingStarsView) view;
                ratingStarsView.getLayoutParams().height = textView.getLineHeight();
                ratingStarsView.zza(rating.doubleValue());
            } else {
                view.getLayoutParams().height = textView.getLineHeight();
                view.getLayoutParams().width = textView.getLineHeight();
            }
            zzi(view, rating.toString(), z10);
            int iDoubleValue = Intrinsics.b(rating, 1.0d) ? (int) rating.doubleValue() : 5;
            LinearLayout linearLayout = this.zzg;
            Context context = this.zzb;
            linearLayout.setContentDescription(context.getResources().getQuantityString(R.plurals.place_details_ratings_content_description, iDoubleValue, rating.toString()));
            Integer userRatingCount2 = place.getUserRatingCount();
            if (userRatingCount2 != null) {
                string2 = context.getString(R.string.place_details_review_count, userRatingCount2);
                Intrinsics.i(string2, "getString(...)");
            } else {
                string2 = null;
            }
            SpannableString spannableString = new SpannableString(string2);
            spannableString.setSpan(new zzz(this, place, zzpVar), 1, spannableString.length() - 1, 33);
            TextView textView2 = this.zzh;
            zzi(textView2, spannableString, z10);
            textView2.setMovementMethod(new LinkMovementMethod());
            Resources resources = context.getResources();
            int i10 = R.plurals.place_details_review_count_a11y_label;
            Integer userRatingCount3 = place.getUserRatingCount();
            textView2.setContentDescription(resources.getQuantityString(i10, userRatingCount3 != null ? userRatingCount3.intValue() : 0, place.getUserRatingCount()));
        }
        TextView textView3 = this.zzi;
        zzi(textView3, place.getPrimaryTypeDisplayName(), z11);
        TextView textView4 = this.zzj;
        Context context2 = this.zzb;
        Intrinsics.j(place, "<this>");
        Intrinsics.j(context2, "context");
        zzey zzeyVarZza = place.zza();
        Money moneyZza = zzeyVarZza != null ? zzeyVarZza.zza() : null;
        zzey zzeyVarZza2 = place.zza();
        Money moneyZzb = zzeyVarZza2 != null ? zzeyVarZza2.zzb() : null;
        if (moneyZza == null || (currencyCode = moneyZza.getCurrencyCode()) == null) {
            currencyCode = moneyZzb != null ? moneyZzb.getCurrencyCode() : null;
        }
        if (place.zza() == null || currencyCode == null || moneyZza == null) {
            string = null;
        } else {
            Currency currency = Currency.getInstance(currencyCode);
            Intrinsics.i(currency, "getInstance(...)");
            String symbol = currency.getSymbol(Locale.getDefault());
            Intrinsics.i(symbol, "getSymbol(...)");
            string = moneyZzb != null ? context2.getString(R.string.place_details_price_range, symbol, moneyZza.getUnits(), moneyZzb.getUnits()) : context2.getString(R.string.place_details_price_range_no_upper_bound, symbol, moneyZza.getUnits());
        }
        if (string == null) {
            Integer priceLevel = place.getPriceLevel();
            string = (priceLevel != null && priceLevel.intValue() == 1) ? context2.getString(R.string.place_details_price_level_1) : (priceLevel != null && priceLevel.intValue() == 2) ? context2.getString(R.string.place_details_price_level_2) : (priceLevel != null && priceLevel.intValue() == 3) ? context2.getString(R.string.place_details_price_level_3) : (priceLevel != null && priceLevel.intValue() == 4) ? context2.getString(R.string.place_details_price_level_4) : null;
        }
        zzi(textView4, string, z12);
        AccessibilityOptions accessibilityOptions = place.getAccessibilityOptions();
        if ((accessibilityOptions != null ? accessibilityOptions.getWheelchairAccessibleEntrance() : null) == Place.BooleanPlaceAttributeValue.TRUE && z13) {
            ImageView imageView = this.zzk;
            imageView.setVisibility(0);
            TextView textView5 = this.zzl;
            imageView.getLayoutParams().height = textView5.getLineHeight();
            imageView.getLayoutParams().width = textView5.getLineHeight();
            if (textView3.getVisibility() == 8 && textView4.getVisibility() == 8) {
                textView5.setVisibility(0);
            } else {
                textView5.setVisibility(8);
            }
        } else {
            this.zzk.setVisibility(8);
            this.zzl.setVisibility(8);
        }
        TextView textView6 = this.zzo;
        zzi(textView6, zzad.zzc(place, context2), z14);
        textView6.setTextColor(zzad.zza(place, context2, this.zzc));
        TextView textView7 = this.zzq;
        zzdy zzdyVar = this.zzd;
        zzi(textView7, zzad.zzb(place, zzdyVar != null ? zzdyVar.zza() : null, context2), z14);
        if (textView3.getVisibility() == 0 && (textView4.getVisibility() == 0 || this.zzk.getVisibility() == 0)) {
            this.zzm.setVisibility(0);
        } else {
            this.zzm.setVisibility(8);
        }
        if (textView4.getVisibility() == 0 && this.zzk.getVisibility() == 0) {
            this.zzn.setVisibility(0);
        } else {
            this.zzn.setVisibility(8);
        }
        if (textView6.getVisibility() == 0 && textView7.getVisibility() == 0) {
            this.zzp.setVisibility(0);
        } else {
            this.zzp.setVisibility(8);
        }
    }

    public final void zzb(final Place place, final zzp zzpVar) {
        Intrinsics.j(place, "place");
        View view = this.zzr;
        view.setVisibility(0);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzy
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view2) {
                zzaa.zzf(this.zza, place, zzpVar, view2);
            }
        });
    }

    public final void zzc() {
        this.zze.setVisibility(8);
        this.zzf.setVisibility(8);
        this.zzh.setVisibility(8);
        this.zzi.setVisibility(8);
        this.zzj.setVisibility(8);
        this.zzk.setVisibility(8);
        this.zzl.setVisibility(8);
        this.zzm.setVisibility(8);
        this.zzn.setVisibility(8);
        this.zzo.setVisibility(8);
        this.zzp.setVisibility(8);
        this.zzq.setVisibility(8);
        this.zzr.setVisibility(8);
    }

    static /* synthetic */ void zzf(zzaa zzaaVar, Place place, zzp zzpVar, View view) {
        zzaaVar.zzg(zzh(place));
        if (zzpVar != null) {
            zzpVar.zze();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent zzh(Place place) {
        Uri googleMapsUri = place.getGoogleMapsUri();
        if (googleMapsUri == null) {
            String formattedAddress = place.getFormattedAddress();
            String id2 = place.getId();
            StringBuilder sb2 = new StringBuilder(String.valueOf(formattedAddress).length() + 64 + String.valueOf(id2).length());
            sb2.append("https://www.google.com/maps/search/?api=1&query=");
            sb2.append(formattedAddress);
            sb2.append("&query_place_id=");
            sb2.append(id2);
            googleMapsUri = Uri.parse(sb2.toString());
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(googleMapsUri);
        return intent;
    }
}
