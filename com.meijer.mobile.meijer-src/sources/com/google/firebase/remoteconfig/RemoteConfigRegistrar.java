package com.google.firebase.remoteconfig;

import Lf.e;
import android.content.Context;
import androidx.annotation.Keep;
import bf.InterfaceC6375a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.f;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import df.C13672A;
import df.C13676c;
import df.InterfaceC13677d;
import df.g;
import df.q;
import eg.h;
import hg.InterfaceC14521a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

@Keep
/* loaded from: classes8.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    public static /* synthetic */ c a(C13672A c13672a, InterfaceC13677d interfaceC13677d) {
        return new c((Context) interfaceC13677d.a(Context.class), (ScheduledExecutorService) interfaceC13677d.c(c13672a), (f) interfaceC13677d.a(f.class), (e) interfaceC13677d.a(e.class), ((com.google.firebase.abt.component.a) interfaceC13677d.a(com.google.firebase.abt.component.a.class)).b("frc"), interfaceC13677d.g(InterfaceC6375a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C13676c<?>> getComponents() {
        final C13672A c13672aA = C13672A.a(cf.b.class, ScheduledExecutorService.class);
        return Arrays.asList(C13676c.f(c.class, InterfaceC14521a.class).h(LIBRARY_NAME).b(q.l(Context.class)).b(q.k(c13672aA)).b(q.l(f.class)).b(q.l(e.class)).b(q.l(com.google.firebase.abt.component.a.class)).b(q.j(InterfaceC6375a.class)).f(new g() { // from class: fg.m
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return RemoteConfigRegistrar.a(c13672aA, interfaceC13677d);
            }
        }).e().d(), h.b(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
