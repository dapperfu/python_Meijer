package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.InterfaceC9133ot;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f65434a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup.LayoutParams f65435b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f65436c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f65437d;

    public e(InterfaceC9133ot interfaceC9133ot) throws d {
        this.f65435b = interfaceC9133ot.getLayoutParams();
        ViewParent parent = interfaceC9133ot.getParent();
        this.f65437d = interfaceC9133ot.A();
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            this.f65436c = viewGroup;
            this.f65434a = viewGroup.indexOfChild(interfaceC9133ot.zzF());
            viewGroup.removeView(interfaceC9133ot.zzF());
            interfaceC9133ot.K0(true);
            return;
        }
        throw new d("Could not get the parent of the WebView for an overlay.");
    }
}
