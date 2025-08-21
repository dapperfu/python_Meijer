package com.google.android.gms.internal.ads;

import Oc.C4447y;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class zzcql extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    private final Context f81536a;

    /* renamed from: b, reason: collision with root package name */
    private View f81537b;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.f81537b.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.f81537b.setY(-r0[1]);
    }

    public static zzcql a(Context context, View view, Z50 z50) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcql zzcqlVar = new zzcql(context);
        if (!z50.f72901u.isEmpty() && (resources = zzcqlVar.f81536a.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f10 = ((C7560a60) z50.f72901u.get(0)).f73200a;
            float f11 = displayMetrics.density;
            zzcqlVar.setLayoutParams(new FrameLayout.LayoutParams((int) (f10 * f11), (int) (r1.f73201b * f11)));
        }
        zzcqlVar.f81537b = view;
        zzcqlVar.addView(view);
        Nc.v.B();
        C7536Zq.b(zzcqlVar, zzcqlVar);
        Nc.v.B();
        C7536Zq.a(zzcqlVar, zzcqlVar);
        JSONObject jSONObject = z50.f72876h0;
        RelativeLayout relativeLayout = new RelativeLayout(zzcqlVar.f81536a);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            zzcqlVar.c(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            zzcqlVar.c(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        zzcqlVar.addView(relativeLayout);
        return zzcqlVar;
    }

    private final void c(JSONObject jSONObject, RelativeLayout relativeLayout, int i10) {
        TextView textView = new TextView(this.f81536a);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int iB = b(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, iB, 0, iB);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, b(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i10);
        relativeLayout.addView(textView, layoutParams);
    }

    private zzcql(Context context) {
        super(context);
        this.f81536a = context;
    }

    private final int b(double d10) {
        C4447y.b();
        return Sc.g.z(this.f81536a, (int) d10);
    }
}
