package com.google.android.gms.ads.internal.overlay;

import Nc.v;
import Oc.A;
import Oc.C4447y;
import Qc.q;
import Sc.p;
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
import com.google.android.gms.internal.ads.C8784lf;

/* loaded from: classes4.dex */
public final class zzu extends FrameLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final ImageButton f65478a;

    /* renamed from: b, reason: collision with root package name */
    private final Qc.h f65479b;

    private final void c() {
        String str = (String) A.c().a(C8784lf.f77231k1);
        if (!n.d() || TextUtils.isEmpty(str) || "default".equals(str)) {
            FS.Resources_setImageResource(this.f65478a, R.drawable.btn_dialog);
            return;
        }
        Resources resourcesF = v.s().f();
        if (resourcesF == null) {
            FS.Resources_setImageResource(this.f65478a, R.drawable.btn_dialog);
            return;
        }
        Drawable drawableResources_getDrawable = null;
        try {
            if ("white".equals(str)) {
                drawableResources_getDrawable = FS.Resources_getDrawable(resourcesF, Lc.a.f18088b);
            } else if ("black".equals(str)) {
                drawableResources_getDrawable = FS.Resources_getDrawable(resourcesF, Lc.a.f18087a);
            }
        } catch (Resources.NotFoundException unused) {
            p.b("Close button resource not found, falling back to default.");
        }
        if (drawableResources_getDrawable == null) {
            FS.Resources_setImageResource(this.f65478a, R.drawable.btn_dialog);
        } else {
            this.f65478a.setImageDrawable(drawableResources_getDrawable);
            this.f65478a.setScaleType(ImageView.ScaleType.CENTER);
        }
    }

    public final void b(boolean z10) {
        if (!z10) {
            this.f65478a.setVisibility(0);
            return;
        }
        this.f65478a.setVisibility(8);
        if (((Long) A.c().a(C8784lf.f77245l1)).longValue() > 0) {
            this.f65478a.animate().cancel();
            this.f65478a.clearAnimation();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Qc.h hVar = this.f65479b;
        if (hVar != null) {
            hVar.zzj();
        }
    }

    public zzu(Context context, q qVar, Qc.h hVar) {
        l lVar;
        super(context);
        this.f65479b = hVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f65478a = imageButton;
        c();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        C4447y.b();
        int iZ = Sc.g.z(context, qVar.f28028a);
        C4447y.b();
        int iZ2 = Sc.g.z(context, 0);
        C4447y.b();
        int iZ3 = Sc.g.z(context, qVar.f28029b);
        C4447y.b();
        imageButton.setPadding(iZ, iZ2, iZ3, Sc.g.z(context, qVar.f28030c));
        imageButton.setContentDescription("Interstitial close button");
        C4447y.b();
        int iZ4 = Sc.g.z(context, qVar.f28031d + qVar.f28028a + qVar.f28029b);
        C4447y.b();
        addView(imageButton, new FrameLayout.LayoutParams(iZ4, Sc.g.z(context, qVar.f28031d + qVar.f28030c), 17));
        long jLongValue = ((Long) A.c().a(C8784lf.f77245l1)).longValue();
        if (jLongValue <= 0) {
            return;
        }
        if (((Boolean) A.c().a(C8784lf.f77259m1)).booleanValue()) {
            lVar = new l(this);
        } else {
            lVar = null;
        }
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(jLongValue).setListener(lVar);
    }
}
