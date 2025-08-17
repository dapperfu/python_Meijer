package com.google.firebase.sessions;

import B2.x;
import af.InterfaceC5598a;
import android.content.Context;
import androidx.annotation.Keep;
import bf.C6241A;
import bf.C6245c;
import bf.InterfaceC6246d;
import bf.q;
import cg.h;
import com.fullstory.FS;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.google.firebase.sessions.b;
import hg.C14440l;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pc.InterfaceC16286j;
import qv.AbstractC16618K;

@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lbf/c;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", "a", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final a Companion = new a(null);

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final C6241A<Context> appContext;
    private static final C6241A<AbstractC16618K> backgroundDispatcher;
    private static final C6241A<AbstractC16618K> blockingDispatcher;
    private static final C6241A<com.google.firebase.f> firebaseApp;
    private static final C6241A<Jf.e> firebaseInstallationsApi;
    private static final C6241A<b> firebaseSessionsComponent;
    private static final C6241A<InterfaceC16286j> transportFactory;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;", "", "<init>", "()V", "", "LIBRARY_NAME", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        C6241A<Context> c6241aB = C6241A.b(Context.class);
        Intrinsics.i(c6241aB, "unqualified(...)");
        appContext = c6241aB;
        C6241A<com.google.firebase.f> c6241aB2 = C6241A.b(com.google.firebase.f.class);
        Intrinsics.i(c6241aB2, "unqualified(...)");
        firebaseApp = c6241aB2;
        C6241A<Jf.e> c6241aB3 = C6241A.b(Jf.e.class);
        Intrinsics.i(c6241aB3, "unqualified(...)");
        firebaseInstallationsApi = c6241aB3;
        C6241A<AbstractC16618K> c6241aA = C6241A.a(InterfaceC5598a.class, AbstractC16618K.class);
        Intrinsics.i(c6241aA, "qualified(...)");
        backgroundDispatcher = c6241aA;
        C6241A<AbstractC16618K> c6241aA2 = C6241A.a(af.b.class, AbstractC16618K.class);
        Intrinsics.i(c6241aA2, "qualified(...)");
        blockingDispatcher = c6241aA2;
        C6241A<InterfaceC16286j> c6241aB4 = C6241A.b(InterfaceC16286j.class);
        Intrinsics.i(c6241aB4, "unqualified(...)");
        transportFactory = c6241aB4;
        C6241A<b> c6241aB5 = C6241A.b(b.class);
        Intrinsics.i(c6241aB5, "unqualified(...)");
        firebaseSessionsComponent = c6241aB5;
        try {
            x.f2020a.getClass();
        } catch (NoClassDefFoundError unused) {
            FS.log_w("FirebaseSessions", "Your app is experiencing a known issue in the Android Gradle plugin, see https://issuetracker.google.com/328687152\n\nIt affects Java-only apps using AGP version 8.3.2 and under. To avoid the issue, either:\n\n1. Upgrade Android Gradle plugin to 8.4.0+\n   Follow the guide at https://developer.android.com/build/agp-upgrade-assistant\n\n2. Or, add the Kotlin plugin to your app\n   Follow the guide at https://developer.android.com/kotlin/add-kotlin\n\n3. Or, do the technical workaround described in https://issuetracker.google.com/issues/328687152#comment3");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C14440l getComponents$lambda$0(InterfaceC6246d interfaceC6246d) {
        return ((b) interfaceC6246d.c(firebaseSessionsComponent)).b();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C6245c<? extends Object>> getComponents() {
        return CollectionsKt.p(C6245c.e(C14440l.class).h(LIBRARY_NAME).b(q.k(firebaseSessionsComponent)).f(new bf.g() { // from class: hg.q
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return FirebaseSessionsRegistrar.getComponents$lambda$0(interfaceC6246d);
            }
        }).e().d(), C6245c.e(b.class).h("fire-sessions-component").b(q.k(appContext)).b(q.k(backgroundDispatcher)).b(q.k(blockingDispatcher)).b(q.k(firebaseApp)).b(q.k(firebaseInstallationsApi)).b(q.m(transportFactory)).f(new bf.g() { // from class: hg.r
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return FirebaseSessionsRegistrar.getComponents$lambda$1(interfaceC6246d);
            }
        }).d(), h.b(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b getComponents$lambda$1(InterfaceC6246d interfaceC6246d) {
        b.a aVarA = com.google.firebase.sessions.a.a();
        Object objC = interfaceC6246d.c(appContext);
        Intrinsics.i(objC, "get(...)");
        b.a aVarF = aVarA.f((Context) objC);
        Object objC2 = interfaceC6246d.c(backgroundDispatcher);
        Intrinsics.i(objC2, "get(...)");
        b.a aVarB = aVarF.b((CoroutineContext) objC2);
        Object objC3 = interfaceC6246d.c(blockingDispatcher);
        Intrinsics.i(objC3, "get(...)");
        b.a aVarE = aVarB.e((CoroutineContext) objC3);
        Object objC4 = interfaceC6246d.c(firebaseApp);
        Intrinsics.i(objC4, "get(...)");
        b.a aVarC = aVarE.c((com.google.firebase.f) objC4);
        Object objC5 = interfaceC6246d.c(firebaseInstallationsApi);
        Intrinsics.i(objC5, "get(...)");
        b.a aVarD = aVarC.d((Jf.e) objC5);
        If.b<InterfaceC16286j> bVarG = interfaceC6246d.g(transportFactory);
        Intrinsics.i(bVarG, "getProvider(...)");
        return aVarD.a(bVarG).build();
    }
}
