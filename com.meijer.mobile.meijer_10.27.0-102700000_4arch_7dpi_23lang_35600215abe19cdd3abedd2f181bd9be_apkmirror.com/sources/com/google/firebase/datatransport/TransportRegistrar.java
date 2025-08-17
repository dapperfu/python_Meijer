package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import bf.C6241A;
import bf.C6245c;
import bf.InterfaceC6246d;
import bf.g;
import bf.q;
import cg.h;
import com.google.android.datatransport.cct.a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
import pc.InterfaceC16286j;
import rc.u;
import zf.InterfaceC18450a;
import zf.InterfaceC18451b;

@Keep
/* loaded from: classes7.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ InterfaceC16286j a(InterfaceC6246d interfaceC6246d) {
        u.f((Context) interfaceC6246d.a(Context.class));
        return u.c().h(a.f64416g);
    }

    public static /* synthetic */ InterfaceC16286j b(InterfaceC6246d interfaceC6246d) {
        u.f((Context) interfaceC6246d.a(Context.class));
        return u.c().h(a.f64417h);
    }

    public static /* synthetic */ InterfaceC16286j c(InterfaceC6246d interfaceC6246d) {
        u.f((Context) interfaceC6246d.a(Context.class));
        return u.c().h(a.f64417h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C6245c<?>> getComponents() {
        return Arrays.asList(C6245c.e(InterfaceC16286j.class).h(LIBRARY_NAME).b(q.l(Context.class)).f(new g() { // from class: zf.c
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return TransportRegistrar.c(interfaceC6246d);
            }
        }).d(), C6245c.c(C6241A.a(InterfaceC18450a.class, InterfaceC16286j.class)).b(q.l(Context.class)).f(new g() { // from class: zf.d
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return TransportRegistrar.b(interfaceC6246d);
            }
        }).d(), C6245c.c(C6241A.a(InterfaceC18451b.class, InterfaceC16286j.class)).b(q.l(Context.class)).f(new g() { // from class: zf.e
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return TransportRegistrar.a(interfaceC6246d);
            }
        }).d(), h.b(LIBRARY_NAME, "19.0.0"));
    }
}
