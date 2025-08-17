package com.scandit.datacapture.barcode.internal.module.count.ui.status;

import android.view.View;
import android.view.animation.LinearInterpolator;
import com.scandit.datacapture.barcode.internal.module.count.ui.status.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class j extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f121804a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f121805b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f121806c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f121807d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(View view, boolean z10, boolean z11, Function0 function0) {
        super(0);
        this.f121804a = view;
        this.f121805b = z10;
        this.f121806c = z11;
        this.f121807d = function0;
    }

    public final void a() {
        View view = this.f121804a;
        boolean z10 = this.f121805b;
        boolean z11 = this.f121806c;
        final Function0 function0 = this.f121807d;
        float f10 = z10 ? 1.0f : 0.0f;
        if (z11) {
            view.animate().setInterpolator(new LinearInterpolator()).setDuration(200L).alpha(f10).withEndAction(new Runnable() { // from class: Nt.b
                @Override // java.lang.Runnable
                public final void run() {
                    j.a(function0);
                }
            }).start();
        } else {
            view.setAlpha(f10);
            function0.invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        a();
        return Unit.f142422a;
    }

    public static final void a(Function0 tmp0) {
        Intrinsics.j(tmp0, "$tmp0");
        tmp0.invoke();
    }
}
