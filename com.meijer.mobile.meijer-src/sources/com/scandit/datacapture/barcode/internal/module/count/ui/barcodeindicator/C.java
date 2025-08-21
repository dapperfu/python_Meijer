package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import android.content.Context;
import android.view.ViewGroup;
import com.scandit.datacapture.core.common.geometry.Point;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class C extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G f122305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f122306b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f122307c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f122308d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(G g10, E e10, float f10, int i10) {
        super(0);
        this.f122305a = g10;
        this.f122306b = e10;
        this.f122307c = f10;
        this.f122308d = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        S.f122360a.getClass();
        int iFloatValue = (int) ((Number) Q.f122359b.getValue()).floatValue();
        Context context = this.f122305a.f122321a.getContext();
        Intrinsics.i(context, "getContext(...)");
        L l10 = new L(context, this.f122305a.f122327g);
        l10.setLayoutParams(new ViewGroup.LayoutParams(iFloatValue, iFloatValue));
        E e10 = this.f122306b;
        float f10 = this.f122307c;
        int i10 = this.f122308d;
        G g10 = this.f122305a;
        Point pointA = E.a(0, e10.f122314a, f10, i10, e10.f122316c);
        l10.a(e10.f122317d);
        G.a(g10, l10, pointA, f10);
        return l10;
    }
}
