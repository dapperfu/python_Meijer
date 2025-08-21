package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.ty, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C9677ty {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10214yz f79541a;

    /* renamed from: b, reason: collision with root package name */
    private final View f79542b;

    /* renamed from: c, reason: collision with root package name */
    private final C7560a60 f79543c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC9133ot f79544d;

    public C9677ty(View view, InterfaceC9133ot interfaceC9133ot, InterfaceC10214yz interfaceC10214yz, C7560a60 c7560a60) {
        this.f79542b = view;
        this.f79544d = interfaceC9133ot;
        this.f79541a = interfaceC10214yz;
        this.f79543c = c7560a60;
    }

    public final View a() {
        return this.f79542b;
    }

    public final InterfaceC9133ot b() {
        return this.f79544d;
    }

    public final InterfaceC10214yz c() {
        return this.f79541a;
    }

    public final C7560a60 e() {
        return this.f79543c;
    }

    public NC d(Set set) {
        return new NC(set);
    }
}
