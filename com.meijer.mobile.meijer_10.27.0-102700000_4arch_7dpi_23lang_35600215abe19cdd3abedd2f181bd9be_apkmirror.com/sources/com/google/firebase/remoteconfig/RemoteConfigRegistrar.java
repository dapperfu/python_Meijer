package com.google.firebase.remoteconfig;

import Jf.e;
import android.content.Context;
import androidx.annotation.Keep;
import bf.C6241A;
import bf.C6245c;
import bf.InterfaceC6246d;
import bf.g;
import bf.q;
import cg.h;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.f;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import fg.InterfaceC13891a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

@Keep
/* loaded from: classes7.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    public static /* synthetic */ c a(C6241A c6241a, InterfaceC6246d interfaceC6246d) {
        return new c((Context) interfaceC6246d.a(Context.class), (ScheduledExecutorService) interfaceC6246d.c(c6241a), (f) interfaceC6246d.a(f.class), (e) interfaceC6246d.a(e.class), ((com.google.firebase.abt.component.a) interfaceC6246d.a(com.google.firebase.abt.component.a.class)).b("frc"), interfaceC6246d.f(Ze.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C6245c<?>> getComponents() {
        final C6241A c6241aA = C6241A.a(af.b.class, ScheduledExecutorService.class);
        return Arrays.asList(C6245c.f(c.class, InterfaceC13891a.class).h(LIBRARY_NAME).b(q.l(Context.class)).b(q.k(c6241aA)).b(q.l(f.class)).b(q.l(e.class)).b(q.l(com.google.firebase.abt.component.a.class)).b(q.j(Ze.a.class)).f(new g() { // from class: dg.m
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return RemoteConfigRegistrar.a(c6241aA, interfaceC6246d);
            }
        }).e().d(), h.b(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
