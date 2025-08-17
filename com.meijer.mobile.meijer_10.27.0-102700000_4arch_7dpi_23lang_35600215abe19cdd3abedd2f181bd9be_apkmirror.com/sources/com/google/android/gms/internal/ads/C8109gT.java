package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.topics.C6103b;
import o4.AbstractC15995a;

/* renamed from: com.google.android.gms.internal.ads.gT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8109gT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f74316a;

    C8109gT(Context context) {
        this.f74316a = context;
    }

    public final com.google.common.util.concurrent.q a(boolean z10) {
        try {
            C6103b c6103bA = new C6103b.a().b("com.google.android.gms.ads").c(z10).a();
            AbstractC15995a abstractC15995aA = AbstractC15995a.a(this.f74316a);
            return abstractC15995aA != null ? abstractC15995aA.b(c6103bA) : Mj0.g(new IllegalStateException());
        } catch (Exception e10) {
            return Mj0.g(e10);
        }
    }
}
