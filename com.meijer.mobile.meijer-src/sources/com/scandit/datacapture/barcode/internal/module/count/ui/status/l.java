package com.scandit.datacapture.barcode.internal.module.count.ui.status;

import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.scandit.datacapture.barcode.internal.module.count.ui.status.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class l extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f122761a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f122762b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f122763c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f122764d;

    public final void a() {
        View view = this.f122761a;
        boolean z10 = this.f122762b;
        boolean z11 = this.f122763c;
        final Function0 function0 = this.f122764d;
        float f10 = z10 ? 1.0f : 0.0f;
        if (z11) {
            view.animate().setInterpolator(new LinearInterpolator()).setDuration(200L).scaleX(f10).scaleY(f10).withEndAction(new Runnable() { // from class: Nt.c
                @Override // java.lang.Runnable
                public final void run() {
                    l.a(function0);
                }
            }).start();
        } else {
            view.setScaleX(f10);
            view.setScaleY(f10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ImageView imageView, boolean z10, boolean z11, Function0 function0) {
        super(0);
        this.f122761a = imageView;
        this.f122762b = z10;
        this.f122763c = z11;
        this.f122764d = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        a();
        return Unit.f143329a;
    }

    public static final void a(Function0 tmp0) {
        Intrinsics.j(tmp0, "$tmp0");
        tmp0.invoke();
    }
}
