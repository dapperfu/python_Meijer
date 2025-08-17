package com.google.firebase.messaging;

import androidx.annotation.Keep;
import bf.C6241A;
import bf.C6245c;
import bf.InterfaceC6246d;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import pc.InterfaceC16286j;
import zf.InterfaceC18451b;

@Keep
/* loaded from: classes7.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging a(C6241A c6241a, InterfaceC6246d interfaceC6246d) {
        return new FirebaseMessaging((com.google.firebase.f) interfaceC6246d.a(com.google.firebase.f.class), (Hf.a) interfaceC6246d.a(Hf.a.class), interfaceC6246d.f(cg.i.class), interfaceC6246d.f(Gf.j.class), (Jf.e) interfaceC6246d.a(Jf.e.class), interfaceC6246d.g(c6241a), (Ff.d) interfaceC6246d.a(Ff.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C6245c<?>> getComponents() {
        final C6241A c6241aA = C6241A.a(InterfaceC18451b.class, InterfaceC16286j.class);
        return Arrays.asList(C6245c.e(FirebaseMessaging.class).h(LIBRARY_NAME).b(bf.q.l(com.google.firebase.f.class)).b(bf.q.h(Hf.a.class)).b(bf.q.j(cg.i.class)).b(bf.q.j(Gf.j.class)).b(bf.q.l(Jf.e.class)).b(bf.q.i(c6241aA)).b(bf.q.l(Ff.d.class)).f(new bf.g() { // from class: com.google.firebase.messaging.B
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return FirebaseMessagingRegistrar.a(c6241aA, interfaceC6246d);
            }
        }).c().d(), cg.h.b(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
