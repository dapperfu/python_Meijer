package com.google.firebase.datatransport;

import Bf.b;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.cct.a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import df.C13672A;
import df.C13676c;
import df.InterfaceC13677d;
import df.g;
import df.q;
import eg.h;
import java.util.Arrays;
import java.util.List;
import rc.InterfaceC16890j;
import tc.u;

@Keep
/* loaded from: classes8.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ InterfaceC16890j a(InterfaceC13677d interfaceC13677d) {
        u.f((Context) interfaceC13677d.a(Context.class));
        return u.c().h(a.f65256g);
    }

    public static /* synthetic */ InterfaceC16890j b(InterfaceC13677d interfaceC13677d) {
        u.f((Context) interfaceC13677d.a(Context.class));
        return u.c().h(a.f65257h);
    }

    public static /* synthetic */ InterfaceC16890j c(InterfaceC13677d interfaceC13677d) {
        u.f((Context) interfaceC13677d.a(Context.class));
        return u.c().h(a.f65257h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C13676c<?>> getComponents() {
        return Arrays.asList(C13676c.e(InterfaceC16890j.class).h(LIBRARY_NAME).b(q.l(Context.class)).f(new g() { // from class: Bf.c
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return TransportRegistrar.c(interfaceC13677d);
            }
        }).d(), C13676c.c(C13672A.a(Bf.a.class, InterfaceC16890j.class)).b(q.l(Context.class)).f(new g() { // from class: Bf.d
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return TransportRegistrar.b(interfaceC13677d);
            }
        }).d(), C13676c.c(C13672A.a(b.class, InterfaceC16890j.class)).b(q.l(Context.class)).f(new g() { // from class: Bf.e
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return TransportRegistrar.a(interfaceC13677d);
            }
        }).d(), h.b(LIBRARY_NAME, "19.0.0"));
    }
}
