package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import bf.C6376b;
import bf.InterfaceC6375a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.remoteconfig.BuildConfig;
import df.C13676c;
import df.InterfaceC13677d;
import df.q;
import eg.h;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes8.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC6375a lambda$getComponents$0(InterfaceC13677d interfaceC13677d) {
        return C6376b.h((com.google.firebase.f) interfaceC13677d.a(com.google.firebase.f.class), (Context) interfaceC13677d.a(Context.class), (Hf.d) interfaceC13677d.a(Hf.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C13676c<?>> getComponents() {
        return Arrays.asList(C13676c.e(InterfaceC6375a.class).b(q.l(com.google.firebase.f.class)).b(q.l(Context.class)).b(q.l(Hf.d.class)).f(a.f89450a).e().d(), h.b("fire-analytics", BuildConfig.VERSION_NAME));
    }
}
