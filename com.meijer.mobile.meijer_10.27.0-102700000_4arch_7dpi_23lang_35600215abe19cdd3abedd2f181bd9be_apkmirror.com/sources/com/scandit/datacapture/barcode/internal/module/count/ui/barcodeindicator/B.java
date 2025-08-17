package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class B extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G f121348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f121349b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f121350c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f121351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f121352e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(G g10, E e10, int i10, float f10, int i11) {
        super(0);
        this.f121348a = g10;
        this.f121349b = e10;
        this.f121350c = i10;
        this.f121351d = f10;
        this.f121352e = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        S.f121408a.getClass();
        int iFloatValue = (int) ((Number) Q.f121407b.getValue()).floatValue();
        Context context = this.f121348a.f121369a.getContext();
        Intrinsics.i(context, "getContext(...)");
        L l10 = new L(context, this.f121348a.f121375g);
        l10.setLayoutParams(new ViewGroup.LayoutParams(iFloatValue, iFloatValue));
        I i10 = I.f121380b;
        Intrinsics.j(i10, "<set-?>");
        l10.f121392e = i10;
        E e10 = this.f121349b;
        int i11 = this.f121350c;
        float f10 = this.f121351d;
        G.a(this.f121348a, l10, E.a(i11, e10.f121362a, f10, this.f121352e, e10.f121364c), f10);
        return l10;
    }
}
