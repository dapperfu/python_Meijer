package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.InterfaceC9008ot;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f64594a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup.LayoutParams f64595b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f64596c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f64597d;

    public e(InterfaceC9008ot interfaceC9008ot) throws d {
        this.f64595b = interfaceC9008ot.getLayoutParams();
        ViewParent parent = interfaceC9008ot.getParent();
        this.f64597d = interfaceC9008ot.A();
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            this.f64596c = viewGroup;
            this.f64594a = viewGroup.indexOfChild(interfaceC9008ot.zzF());
            viewGroup.removeView(interfaceC9008ot.zzF());
            interfaceC9008ot.L0(true);
            return;
        }
        throw new d("Could not get the parent of the WebView for an overlay.");
    }
}
