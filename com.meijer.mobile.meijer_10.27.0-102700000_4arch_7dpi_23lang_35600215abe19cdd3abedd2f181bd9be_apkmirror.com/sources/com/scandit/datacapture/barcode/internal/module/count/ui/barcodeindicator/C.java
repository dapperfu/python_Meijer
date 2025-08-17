package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import android.content.Context;
import android.view.ViewGroup;
import com.scandit.datacapture.core.common.geometry.Point;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class C extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G f121353a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f121354b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f121355c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f121356d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(G g10, E e10, float f10, int i10) {
        super(0);
        this.f121353a = g10;
        this.f121354b = e10;
        this.f121355c = f10;
        this.f121356d = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        S.f121408a.getClass();
        int iFloatValue = (int) ((Number) Q.f121407b.getValue()).floatValue();
        Context context = this.f121353a.f121369a.getContext();
        Intrinsics.i(context, "getContext(...)");
        L l10 = new L(context, this.f121353a.f121375g);
        l10.setLayoutParams(new ViewGroup.LayoutParams(iFloatValue, iFloatValue));
        E e10 = this.f121354b;
        float f10 = this.f121355c;
        int i10 = this.f121356d;
        G g10 = this.f121353a;
        Point pointA = E.a(0, e10.f121362a, f10, i10, e10.f121364c);
        l10.a(e10.f121365d);
        G.a(g10, l10, pointA, f10);
        return l10;
    }
}
