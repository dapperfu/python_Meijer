package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.b70, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7544b70 implements InterfaceC7659cC {

    /* renamed from: a, reason: collision with root package name */
    private final HashSet f72720a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Context f72721b;

    /* renamed from: c, reason: collision with root package name */
    private final C6704Eq f72722c;

    public final synchronized void b(HashSet hashSet) {
        this.f72720a.clear();
        this.f72720a.addAll(hashSet);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7659cC
    public final synchronized void g0(Mc.W0 w02) {
        if (w02.f19159a != 3) {
            this.f72722c.l(this.f72720a);
        }
    }

    public final Bundle a() {
        return this.f72722c.n(this.f72721b, this);
    }

    public C7544b70(Context context, C6704Eq c6704Eq) {
        this.f72721b = context;
        this.f72722c = c6704Eq;
    }
}
