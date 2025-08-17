package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import android.content.Context;
import android.view.ViewGroup;
import com.scandit.datacapture.core.common.geometry.Point;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class D extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G f121357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f121358b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f121359c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f121360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f121361e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(G g10, E e10, int i10, float f10, int i11) {
        super(0);
        this.f121357a = g10;
        this.f121358b = e10;
        this.f121359c = i10;
        this.f121360d = f10;
        this.f121361e = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        S.f121408a.getClass();
        int iFloatValue = (int) ((Number) Q.f121407b.getValue()).floatValue();
        Context context = this.f121357a.f121369a.getContext();
        Intrinsics.i(context, "getContext(...)");
        L l10 = new L(context, this.f121357a.f121375g);
        l10.setLayoutParams(new ViewGroup.LayoutParams(iFloatValue, iFloatValue));
        E e10 = this.f121358b;
        int i10 = this.f121359c;
        float f10 = this.f121360d;
        int i11 = this.f121361e;
        G g10 = this.f121357a;
        Point pointA = E.a(i10, e10.f121362a, f10, i11, e10.f121364c);
        l10.a(e10.f121365d);
        G.a(g10, l10, pointA, f10);
        return l10;
    }
}
