package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.b70, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7669b70 implements InterfaceC7784cC {

    /* renamed from: a, reason: collision with root package name */
    private final HashSet f73560a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Context f73561b;

    /* renamed from: c, reason: collision with root package name */
    private final C6829Eq f73562c;

    @Override // com.google.android.gms.internal.ads.InterfaceC7784cC
    public final synchronized void C(Oc.W0 w02) {
        if (w02.f23346a != 3) {
            this.f73562c.l(this.f73560a);
        }
    }

    public final synchronized void b(HashSet hashSet) {
        this.f73560a.clear();
        this.f73560a.addAll(hashSet);
    }

    public final Bundle a() {
        return this.f73562c.n(this.f73561b, this);
    }

    public C7669b70(Context context, C6829Eq c6829Eq) {
        this.f73561b = context;
        this.f73562c = c6829Eq;
    }
}
