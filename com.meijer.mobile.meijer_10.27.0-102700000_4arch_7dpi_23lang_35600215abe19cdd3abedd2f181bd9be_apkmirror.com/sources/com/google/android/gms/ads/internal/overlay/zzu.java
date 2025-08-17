package com.google.android.gms.ads.internal.overlay;

import Lc.v;
import Mc.A;
import Mc.C4169y;
import Oc.q;
import Qc.p;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.fullstory.FS;
import com.google.android.gms.common.util.n;
import com.google.android.gms.internal.ads.C8659lf;

/* loaded from: classes4.dex */
public final class zzu extends FrameLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final ImageButton f64638a;

    /* renamed from: b, reason: collision with root package name */
    private final Oc.h f64639b;

    private final void c() {
        String str = (String) A.c().a(C8659lf.f76391k1);
        if (!n.d() || TextUtils.isEmpty(str) || "default".equals(str)) {
            FS.Resources_setImageResource(this.f64638a, R.drawable.btn_dialog);
            return;
        }
        Resources resourcesF = v.s().f();
        if (resourcesF == null) {
            FS.Resources_setImageResource(this.f64638a, R.drawable.btn_dialog);
            return;
        }
        Drawable drawableResources_getDrawable = null;
        try {
            if ("white".equals(str)) {
                drawableResources_getDrawable = FS.Resources_getDrawable(resourcesF, Jc.a.f14751b);
            } else if ("black".equals(str)) {
                drawableResources_getDrawable = FS.Resources_getDrawable(resourcesF, Jc.a.f14750a);
            }
        } catch (Resources.NotFoundException unused) {
            p.b("Close button resource not found, falling back to default.");
        }
        if (drawableResources_getDrawable == null) {
            FS.Resources_setImageResource(this.f64638a, R.drawable.btn_dialog);
        } else {
            this.f64638a.setImageDrawable(drawableResources_getDrawable);
            this.f64638a.setScaleType(ImageView.ScaleType.CENTER);
        }
    }

    public final void b(boolean z10) {
        if (!z10) {
            this.f64638a.setVisibility(0);
            return;
        }
        this.f64638a.setVisibility(8);
        if (((Long) A.c().a(C8659lf.f76405l1)).longValue() > 0) {
            this.f64638a.animate().cancel();
            this.f64638a.clearAnimation();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Oc.h hVar = this.f64639b;
        if (hVar != null) {
            hVar.zzj();
        }
    }

    public zzu(Context context, q qVar, Oc.h hVar) {
        l lVar;
        super(context);
        this.f64639b = hVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f64638a = imageButton;
        c();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        C4169y.b();
        int iZ = Qc.g.z(context, qVar.f23540a);
        C4169y.b();
        int iZ2 = Qc.g.z(context, 0);
        C4169y.b();
        int iZ3 = Qc.g.z(context, qVar.f23541b);
        C4169y.b();
        imageButton.setPadding(iZ, iZ2, iZ3, Qc.g.z(context, qVar.f23542c));
        imageButton.setContentDescription("Interstitial close button");
        C4169y.b();
        int iZ4 = Qc.g.z(context, qVar.f23543d + qVar.f23540a + qVar.f23541b);
        C4169y.b();
        addView(imageButton, new FrameLayout.LayoutParams(iZ4, Qc.g.z(context, qVar.f23543d + qVar.f23542c), 17));
        long jLongValue = ((Long) A.c().a(C8659lf.f76405l1)).longValue();
        if (jLongValue <= 0) {
            return;
        }
        if (((Boolean) A.c().a(C8659lf.f76419m1)).booleanValue()) {
            lVar = new l(this);
        } else {
            lVar = null;
        }
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(jLongValue).setListener(lVar);
    }
}
