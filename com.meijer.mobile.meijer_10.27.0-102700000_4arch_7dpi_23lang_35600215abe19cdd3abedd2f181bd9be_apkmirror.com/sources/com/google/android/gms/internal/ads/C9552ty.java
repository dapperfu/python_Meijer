package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.ty, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C9552ty {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10089yz f78701a;

    /* renamed from: b, reason: collision with root package name */
    private final View f78702b;

    /* renamed from: c, reason: collision with root package name */
    private final C7435a60 f78703c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC9008ot f78704d;

    public C9552ty(View view, InterfaceC9008ot interfaceC9008ot, InterfaceC10089yz interfaceC10089yz, C7435a60 c7435a60) {
        this.f78702b = view;
        this.f78704d = interfaceC9008ot;
        this.f78701a = interfaceC10089yz;
        this.f78703c = c7435a60;
    }

    public final View a() {
        return this.f78702b;
    }

    public final InterfaceC9008ot b() {
        return this.f78704d;
    }

    public final InterfaceC10089yz c() {
        return this.f78701a;
    }

    public final C7435a60 e() {
        return this.f78703c;
    }

    public NC d(Set set) {
        return new NC(set);
    }
}
