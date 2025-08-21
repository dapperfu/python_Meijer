package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import df.C13672A;
import df.C13676c;
import df.InterfaceC13677d;
import java.util.Arrays;
import java.util.List;
import rc.InterfaceC16890j;

@Keep
/* loaded from: classes8.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging a(C13672A c13672a, InterfaceC13677d interfaceC13677d) {
        return new FirebaseMessaging((com.google.firebase.f) interfaceC13677d.a(com.google.firebase.f.class), (Jf.a) interfaceC13677d.a(Jf.a.class), interfaceC13677d.g(eg.i.class), interfaceC13677d.g(If.j.class), (Lf.e) interfaceC13677d.a(Lf.e.class), interfaceC13677d.f(c13672a), (Hf.d) interfaceC13677d.a(Hf.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C13676c<?>> getComponents() {
        final C13672A c13672aA = C13672A.a(Bf.b.class, InterfaceC16890j.class);
        return Arrays.asList(C13676c.e(FirebaseMessaging.class).h(LIBRARY_NAME).b(df.q.l(com.google.firebase.f.class)).b(df.q.h(Jf.a.class)).b(df.q.j(eg.i.class)).b(df.q.j(If.j.class)).b(df.q.l(Lf.e.class)).b(df.q.i(c13672aA)).b(df.q.l(Hf.d.class)).f(new df.g() { // from class: com.google.firebase.messaging.D
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return FirebaseMessagingRegistrar.a(c13672aA, interfaceC13677d);
            }
        }).c().d(), eg.h.b(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
