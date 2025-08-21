package com.google.firebase;

import androidx.annotation.Keep;
import cf.InterfaceC6504a;
import com.google.firebase.components.ComponentRegistrar;
import df.C13672A;
import df.C13676c;
import df.InterfaceC13677d;
import df.q;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.AbstractC15779K;
import mv.C15830u0;

@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Ldf/c;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> implements df.g {

        /* renamed from: a, reason: collision with root package name */
        public static final a<T> f89437a = new a<>();

        @Override // df.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC15779K a(InterfaceC13677d interfaceC13677d) {
            Object objC = interfaceC13677d.c(C13672A.a(InterfaceC6504a.class, Executor.class));
            Intrinsics.i(objC, "get(...)");
            return C15830u0.b((Executor) objC);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b<T> implements df.g {

        /* renamed from: a, reason: collision with root package name */
        public static final b<T> f89438a = new b<>();

        @Override // df.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC15779K a(InterfaceC13677d interfaceC13677d) {
            Object objC = interfaceC13677d.c(C13672A.a(cf.c.class, Executor.class));
            Intrinsics.i(objC, "get(...)");
            return C15830u0.b((Executor) objC);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class c<T> implements df.g {

        /* renamed from: a, reason: collision with root package name */
        public static final c<T> f89439a = new c<>();

        @Override // df.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC15779K a(InterfaceC13677d interfaceC13677d) {
            Object objC = interfaceC13677d.c(C13672A.a(cf.b.class, Executor.class));
            Intrinsics.i(objC, "get(...)");
            return C15830u0.b((Executor) objC);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class d<T> implements df.g {

        /* renamed from: a, reason: collision with root package name */
        public static final d<T> f89440a = new d<>();

        @Override // df.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC15779K a(InterfaceC13677d interfaceC13677d) {
            Object objC = interfaceC13677d.c(C13672A.a(cf.d.class, Executor.class));
            Intrinsics.i(objC, "get(...)");
            return C15830u0.b((Executor) objC);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C13676c<?>> getComponents() {
        C13676c c13676cD = C13676c.c(C13672A.a(InterfaceC6504a.class, AbstractC15779K.class)).b(q.k(C13672A.a(InterfaceC6504a.class, Executor.class))).f(a.f89437a).d();
        Intrinsics.i(c13676cD, "build(...)");
        C13676c c13676cD2 = C13676c.c(C13672A.a(cf.c.class, AbstractC15779K.class)).b(q.k(C13672A.a(cf.c.class, Executor.class))).f(b.f89438a).d();
        Intrinsics.i(c13676cD2, "build(...)");
        C13676c c13676cD3 = C13676c.c(C13672A.a(cf.b.class, AbstractC15779K.class)).b(q.k(C13672A.a(cf.b.class, Executor.class))).f(c.f89439a).d();
        Intrinsics.i(c13676cD3, "build(...)");
        C13676c c13676cD4 = C13676c.c(C13672A.a(cf.d.class, AbstractC15779K.class)).b(q.k(C13672A.a(cf.d.class, Executor.class))).f(d.f89440a).d();
        Intrinsics.i(c13676cD4, "build(...)");
        return CollectionsKt.p(c13676cD, c13676cD2, c13676cD3, c13676cD4);
    }
}
