package com.google.firebase;

import af.InterfaceC5598a;
import androidx.annotation.Keep;
import bf.C6241A;
import bf.C6245c;
import bf.InterfaceC6246d;
import bf.q;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.AbstractC16618K;
import qv.C16669u0;

@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lbf/c;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> implements bf.g {

        /* renamed from: a, reason: collision with root package name */
        public static final a<T> f88597a = new a<>();

        @Override // bf.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC16618K a(InterfaceC6246d interfaceC6246d) {
            Object objC = interfaceC6246d.c(C6241A.a(InterfaceC5598a.class, Executor.class));
            Intrinsics.i(objC, "get(...)");
            return C16669u0.b((Executor) objC);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b<T> implements bf.g {

        /* renamed from: a, reason: collision with root package name */
        public static final b<T> f88598a = new b<>();

        @Override // bf.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC16618K a(InterfaceC6246d interfaceC6246d) {
            Object objC = interfaceC6246d.c(C6241A.a(af.c.class, Executor.class));
            Intrinsics.i(objC, "get(...)");
            return C16669u0.b((Executor) objC);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class c<T> implements bf.g {

        /* renamed from: a, reason: collision with root package name */
        public static final c<T> f88599a = new c<>();

        @Override // bf.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC16618K a(InterfaceC6246d interfaceC6246d) {
            Object objC = interfaceC6246d.c(C6241A.a(af.b.class, Executor.class));
            Intrinsics.i(objC, "get(...)");
            return C16669u0.b((Executor) objC);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class d<T> implements bf.g {

        /* renamed from: a, reason: collision with root package name */
        public static final d<T> f88600a = new d<>();

        @Override // bf.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC16618K a(InterfaceC6246d interfaceC6246d) {
            Object objC = interfaceC6246d.c(C6241A.a(af.d.class, Executor.class));
            Intrinsics.i(objC, "get(...)");
            return C16669u0.b((Executor) objC);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C6245c<?>> getComponents() {
        C6245c c6245cD = C6245c.c(C6241A.a(InterfaceC5598a.class, AbstractC16618K.class)).b(q.k(C6241A.a(InterfaceC5598a.class, Executor.class))).f(a.f88597a).d();
        Intrinsics.i(c6245cD, "build(...)");
        C6245c c6245cD2 = C6245c.c(C6241A.a(af.c.class, AbstractC16618K.class)).b(q.k(C6241A.a(af.c.class, Executor.class))).f(b.f88598a).d();
        Intrinsics.i(c6245cD2, "build(...)");
        C6245c c6245cD3 = C6245c.c(C6241A.a(af.b.class, AbstractC16618K.class)).b(q.k(C6241A.a(af.b.class, Executor.class))).f(c.f88599a).d();
        Intrinsics.i(c6245cD3, "build(...)");
        C6245c c6245cD4 = C6245c.c(C6241A.a(af.d.class, AbstractC16618K.class)).b(q.k(C6241A.a(af.d.class, Executor.class))).f(d.f88600a).d();
        Intrinsics.i(c6245cD4, "build(...)");
        return CollectionsKt.p(c6245cD, c6245cD2, c6245cD3, c6245cD4);
    }
}
