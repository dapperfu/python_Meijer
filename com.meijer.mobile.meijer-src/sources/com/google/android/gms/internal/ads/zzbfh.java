package com.google.android.gms.internal.ads;

import Oc.C4447y;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class zzbfh extends RelativeLayout {

    /* renamed from: b, reason: collision with root package name */
    private static final float[] f81417b = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: a, reason: collision with root package name */
    private AnimationDrawable f81418a;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f81418a;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }

    public zzbfh(Context context, BinderC6953Ig binderC6953Ig, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        com.google.android.gms.common.internal.r.l(binderC6953Ig);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f81417b, null, null));
        shapeDrawable.getPaint().setColor(binderC6953Ig.zzd());
        setLayoutParams(layoutParams);
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(binderC6953Ig.zzg())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(binderC6953Ig.zzg());
            textView.setTextColor(binderC6953Ig.zze());
            textView.setTextSize(binderC6953Ig.zzf());
            C4447y.b();
            int iZ = Sc.g.z(context, 4);
            C4447y.b();
            textView.setPadding(iZ, 0, Sc.g.z(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List listC9 = binderC6953Ig.C9();
        if (listC9 != null && listC9.size() > 1) {
            this.f81418a = new AnimationDrawable();
            Iterator it = listC9.iterator();
            while (it.hasNext()) {
                try {
                    this.f81418a.addFrame((Drawable) com.google.android.gms.dynamic.d.c2(((BinderC7021Kg) it.next()).zzf()), binderC6953Ig.zzb());
                } catch (Exception e10) {
                    Sc.p.e("Error while getting drawable.", e10);
                }
            }
            imageView.setBackground(this.f81418a);
        } else if (listC9.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) com.google.android.gms.dynamic.d.c2(((BinderC7021Kg) listC9.get(0)).zzf()));
            } catch (Exception e11) {
                Sc.p.e("Error while getting drawable.", e11);
            }
        }
        addView(imageView);
    }
}
