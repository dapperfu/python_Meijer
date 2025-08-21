package com.google.firebase.sessions;

import B2.x;
import android.content.Context;
import androidx.annotation.Keep;
import cf.InterfaceC6504a;
import com.fullstory.FS;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.google.firebase.sessions.b;
import df.C13672A;
import df.C13676c;
import df.InterfaceC13677d;
import df.q;
import eg.h;
import java.util.List;
import jg.C15018l;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mv.AbstractC15779K;
import rc.InterfaceC16890j;

@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Ldf/c;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", "a", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final a Companion = new a(null);

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final C13672A<Context> appContext;
    private static final C13672A<AbstractC15779K> backgroundDispatcher;
    private static final C13672A<AbstractC15779K> blockingDispatcher;
    private static final C13672A<com.google.firebase.f> firebaseApp;
    private static final C13672A<Lf.e> firebaseInstallationsApi;
    private static final C13672A<b> firebaseSessionsComponent;
    private static final C13672A<InterfaceC16890j> transportFactory;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;", "", "<init>", "()V", "", "LIBRARY_NAME", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        C13672A<Context> c13672aB = C13672A.b(Context.class);
        Intrinsics.i(c13672aB, "unqualified(...)");
        appContext = c13672aB;
        C13672A<com.google.firebase.f> c13672aB2 = C13672A.b(com.google.firebase.f.class);
        Intrinsics.i(c13672aB2, "unqualified(...)");
        firebaseApp = c13672aB2;
        C13672A<Lf.e> c13672aB3 = C13672A.b(Lf.e.class);
        Intrinsics.i(c13672aB3, "unqualified(...)");
        firebaseInstallationsApi = c13672aB3;
        C13672A<AbstractC15779K> c13672aA = C13672A.a(InterfaceC6504a.class, AbstractC15779K.class);
        Intrinsics.i(c13672aA, "qualified(...)");
        backgroundDispatcher = c13672aA;
        C13672A<AbstractC15779K> c13672aA2 = C13672A.a(cf.b.class, AbstractC15779K.class);
        Intrinsics.i(c13672aA2, "qualified(...)");
        blockingDispatcher = c13672aA2;
        C13672A<InterfaceC16890j> c13672aB4 = C13672A.b(InterfaceC16890j.class);
        Intrinsics.i(c13672aB4, "unqualified(...)");
        transportFactory = c13672aB4;
        C13672A<b> c13672aB5 = C13672A.b(b.class);
        Intrinsics.i(c13672aB5, "unqualified(...)");
        firebaseSessionsComponent = c13672aB5;
        try {
            x.f2499a.getClass();
        } catch (NoClassDefFoundError unused) {
            FS.log_w("FirebaseSessions", "Your app is experiencing a known issue in the Android Gradle plugin, see https://issuetracker.google.com/328687152\n\nIt affects Java-only apps using AGP version 8.3.2 and under. To avoid the issue, either:\n\n1. Upgrade Android Gradle plugin to 8.4.0+\n   Follow the guide at https://developer.android.com/build/agp-upgrade-assistant\n\n2. Or, add the Kotlin plugin to your app\n   Follow the guide at https://developer.android.com/kotlin/add-kotlin\n\n3. Or, do the technical workaround described in https://issuetracker.google.com/issues/328687152#comment3");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C15018l getComponents$lambda$0(InterfaceC13677d interfaceC13677d) {
        return ((b) interfaceC13677d.c(firebaseSessionsComponent)).b();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C13676c<? extends Object>> getComponents() {
        return CollectionsKt.p(C13676c.e(C15018l.class).h(LIBRARY_NAME).b(q.k(firebaseSessionsComponent)).f(new df.g() { // from class: jg.q
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return FirebaseSessionsRegistrar.getComponents$lambda$0(interfaceC13677d);
            }
        }).e().d(), C13676c.e(b.class).h("fire-sessions-component").b(q.k(appContext)).b(q.k(backgroundDispatcher)).b(q.k(blockingDispatcher)).b(q.k(firebaseApp)).b(q.k(firebaseInstallationsApi)).b(q.m(transportFactory)).f(new df.g() { // from class: jg.r
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return FirebaseSessionsRegistrar.getComponents$lambda$1(interfaceC13677d);
            }
        }).d(), h.b(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b getComponents$lambda$1(InterfaceC13677d interfaceC13677d) {
        b.a aVarA = com.google.firebase.sessions.a.a();
        Object objC = interfaceC13677d.c(appContext);
        Intrinsics.i(objC, "get(...)");
        b.a aVarF = aVarA.f((Context) objC);
        Object objC2 = interfaceC13677d.c(backgroundDispatcher);
        Intrinsics.i(objC2, "get(...)");
        b.a aVarA2 = aVarF.a((CoroutineContext) objC2);
        Object objC3 = interfaceC13677d.c(blockingDispatcher);
        Intrinsics.i(objC3, "get(...)");
        b.a aVarE = aVarA2.e((CoroutineContext) objC3);
        Object objC4 = interfaceC13677d.c(firebaseApp);
        Intrinsics.i(objC4, "get(...)");
        b.a aVarC = aVarE.c((com.google.firebase.f) objC4);
        Object objC5 = interfaceC13677d.c(firebaseInstallationsApi);
        Intrinsics.i(objC5, "get(...)");
        b.a aVarB = aVarC.b((Lf.e) objC5);
        Kf.b<InterfaceC16890j> bVarF = interfaceC13677d.f(transportFactory);
        Intrinsics.i(bVarF, "getProvider(...)");
        return aVarB.d(bVarF).build();
    }
}
