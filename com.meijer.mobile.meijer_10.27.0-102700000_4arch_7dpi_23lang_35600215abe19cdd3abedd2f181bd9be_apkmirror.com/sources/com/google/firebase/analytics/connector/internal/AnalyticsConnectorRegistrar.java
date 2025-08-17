package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import bf.C6245c;
import bf.InterfaceC6246d;
import bf.q;
import cg.h;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.remoteconfig.BuildConfig;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes7.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Ze.a lambda$getComponents$0(InterfaceC6246d interfaceC6246d) {
        return Ze.b.h((com.google.firebase.f) interfaceC6246d.a(com.google.firebase.f.class), (Context) interfaceC6246d.a(Context.class), (Ff.d) interfaceC6246d.a(Ff.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C6245c<?>> getComponents() {
        return Arrays.asList(C6245c.e(Ze.a.class).b(q.l(com.google.firebase.f.class)).b(q.l(Context.class)).b(q.l(Ff.d.class)).f(a.f88610a).e().d(), h.b("fire-analytics", BuildConfig.VERSION_NAME));
    }
}
