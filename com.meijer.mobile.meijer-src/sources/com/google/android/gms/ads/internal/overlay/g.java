package com.google.android.gms.ads.internal.overlay;

import Nc.v;
import Rc.B;
import Rc.D0;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* loaded from: classes4.dex */
final class g extends B {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h f65440c;

    /* synthetic */ g(h hVar, Qc.m mVar) {
        this.f65440c = hVar;
    }

    @Override // Rc.B
    public final void a() {
        final BitmapDrawable bitmapDrawable;
        Bitmap bitmapA = v.y().a(Integer.valueOf(this.f65440c.f65443b.f65421o.f20829f));
        if (bitmapA != null) {
            v.t();
            h hVar = this.f65440c;
            Nc.l lVar = hVar.f65443b.f65421o;
            boolean z10 = lVar.f20827d;
            float f10 = lVar.f20828e;
            Activity activity = hVar.f65442a;
            if (!z10 || f10 <= 0.0f || f10 > 25.0f) {
                bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapA);
            } else {
                try {
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapA, bitmapA.getWidth(), bitmapA.getHeight(), false);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
                    RenderScript renderScriptCreate = RenderScript.create(activity);
                    ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                    Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
                    Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                    scriptIntrinsicBlurCreate.setRadius(f10);
                    scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                    scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                    allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapCreateBitmap);
                } catch (RuntimeException unused) {
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapA);
                }
            }
            D0.f32295l.post(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f65438a.f65440c.f65442a.getWindow().setBackgroundDrawable(bitmapDrawable);
                }
            });
        }
    }
}
