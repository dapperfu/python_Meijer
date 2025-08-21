package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class B extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G f122300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f122301b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f122302c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f122303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f122304e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(G g10, E e10, int i10, float f10, int i11) {
        super(0);
        this.f122300a = g10;
        this.f122301b = e10;
        this.f122302c = i10;
        this.f122303d = f10;
        this.f122304e = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        S.f122360a.getClass();
        int iFloatValue = (int) ((Number) Q.f122359b.getValue()).floatValue();
        Context context = this.f122300a.f122321a.getContext();
        Intrinsics.i(context, "getContext(...)");
        L l10 = new L(context, this.f122300a.f122327g);
        l10.setLayoutParams(new ViewGroup.LayoutParams(iFloatValue, iFloatValue));
        I i10 = I.f122332b;
        Intrinsics.j(i10, "<set-?>");
        l10.f122344e = i10;
        E e10 = this.f122301b;
        int i11 = this.f122302c;
        float f10 = this.f122303d;
        G.a(this.f122300a, l10, E.a(i11, e10.f122314a, f10, this.f122304e, e10.f122316c), f10);
        return l10;
    }
}
