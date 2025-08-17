package com.google.android.gms.internal.ads;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;

/* renamed from: com.google.android.gms.internal.ads.yP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10028yP {
    C10028yP() {
    }

    public static final void a(Context context, ViewGroup viewGroup, AdView adView) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag("layout");
        f(linearLayout, -1, -1);
        linearLayout.setGravity(17);
        linearLayout.addView(adView);
        adView.setTag("ad_view");
        viewGroup.addView(linearLayout);
    }

    public static final void b(Context context, ViewGroup viewGroup, NativeAd nativeAd) {
        NativeAdView nativeAdView = new NativeAdView(context);
        nativeAdView.setTag("ad_view_tag");
        f(nativeAdView, -1, -1);
        viewGroup.addView(nativeAdView);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag("layout_tag");
        linearLayout.setOrientation(1);
        f(linearLayout, -1, -1);
        linearLayout.setBackgroundColor(-1);
        nativeAdView.addView(linearLayout);
        Resources resourcesF = Lc.v.s().f();
        linearLayout.addView(c(context, resourcesF == null ? "Headline" : resourcesF.getString(Jc.d.f14757b), "headline_header_tag"));
        View viewD = d(context, C7267Vf0.c(nativeAd.b()), "headline_tag");
        nativeAdView.setHeadlineView(viewD);
        linearLayout.addView(viewD);
        linearLayout.addView(c(context, resourcesF == null ? "Body" : resourcesF.getString(Jc.d.f14756a), "body_header_tag"));
        View viewD2 = d(context, C7267Vf0.c(nativeAd.a()), "body_tag");
        nativeAdView.setBodyView(viewD2);
        linearLayout.addView(viewD2);
        linearLayout.addView(c(context, resourcesF == null ? "Media View" : resourcesF.getString(Jc.d.f14758c), "media_view_header_tag"));
        MediaView mediaView = new MediaView(context);
        mediaView.setTag("media_view_tag");
        nativeAdView.setMediaView(mediaView);
        linearLayout.addView(mediaView);
        nativeAdView.setNativeAd(nativeAd);
    }

    private static TextView d(Context context, String str, String str2) {
        return e(context, str, R.style.TextAppearance.Medium, -16777216, 12.0f, str2);
    }

    private static TextView e(Context context, String str, int i10, int i11, float f10, String str2) {
        TextView textView = new TextView(context);
        textView.setTag(str2);
        f(textView, -2, -2);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, f10, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextAppearance(context, i10);
        textView.setTextColor(i11);
        textView.setText(str);
        return textView;
    }

    private static TextView c(Context context, String str, String str2) {
        return e(context, str, R.style.TextAppearance.Small, -9210245, 0.0f, str2);
    }

    private static void f(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams2.height = i10;
        layoutParams2.width = i11;
        view.setLayoutParams(layoutParams2);
    }
}
