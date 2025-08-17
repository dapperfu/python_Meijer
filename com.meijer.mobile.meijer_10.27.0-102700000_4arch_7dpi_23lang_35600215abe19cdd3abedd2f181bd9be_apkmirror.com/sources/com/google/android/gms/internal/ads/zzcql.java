package com.google.android.gms.internal.ads;

import Mc.C4169y;
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
    private final Context f80696a;

    /* renamed from: b, reason: collision with root package name */
    private View f80697b;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.f80697b.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.f80697b.setY(-r0[1]);
    }

    public static zzcql a(Context context, View view, Z50 z50) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcql zzcqlVar = new zzcql(context);
        if (!z50.f72061u.isEmpty() && (resources = zzcqlVar.f80696a.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f10 = ((C7435a60) z50.f72061u.get(0)).f72360a;
            float f11 = displayMetrics.density;
            zzcqlVar.setLayoutParams(new FrameLayout.LayoutParams((int) (f10 * f11), (int) (r1.f72361b * f11)));
        }
        zzcqlVar.f80697b = view;
        zzcqlVar.addView(view);
        Lc.v.B();
        C7411Zq.b(zzcqlVar, zzcqlVar);
        Lc.v.B();
        C7411Zq.a(zzcqlVar, zzcqlVar);
        JSONObject jSONObject = z50.f72036h0;
        RelativeLayout relativeLayout = new RelativeLayout(zzcqlVar.f80696a);
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
        TextView textView = new TextView(this.f80696a);
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
        this.f80696a = context;
    }

    private final int b(double d10) {
        C4169y.b();
        return Qc.g.z(this.f80696a, (int) d10);
    }
}
