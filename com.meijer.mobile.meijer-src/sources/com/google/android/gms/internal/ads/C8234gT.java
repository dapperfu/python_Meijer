package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.topics.C6245b;
import o4.AbstractC16070a;

/* renamed from: com.google.android.gms.internal.ads.gT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8234gT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f75156a;

    C8234gT(Context context) {
        this.f75156a = context;
    }

    public final com.google.common.util.concurrent.q a(boolean z10) {
        try {
            C6245b c6245bA = new C6245b.a().b("com.google.android.gms.ads").c(z10).a();
            AbstractC16070a abstractC16070aA = AbstractC16070a.a(this.f75156a);
            return abstractC16070aA != null ? abstractC16070aA.b(c6245bA) : Mj0.g(new IllegalStateException());
        } catch (Exception e10) {
            return Mj0.g(e10);
        }
    }
}
