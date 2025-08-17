package com.google.firebase.sessions;

import B2.C2944i;
import B2.D;
import B2.InterfaceC2941f;
import B2.InterfaceC2943h;
import B2.x;
import af.InterfaceC5598a;
import android.content.Context;
import androidx.datastore.core.CorruptionException;
import com.fullstory.FS;
import com.google.firebase.sessions.b;
import hg.ApplicationInfo;
import hg.C14440l;
import hg.F;
import hg.J;
import hg.SessionData;
import hg.T;
import hg.X;
import hg.Y;
import hg.Z;
import hg.a0;
import java.io.File;
import java.util.List;
import kg.SessionConfigs;
import kg.i;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pc.InterfaceC16286j;
import qv.C16623P;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0002\u0007\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/google/firebase/sessions/b;", "", "Lhg/l;", "b", "()Lhg/l;", "firebaseSessions", "Lhg/T;", "a", "()Lhg/T;", "sharedSessionRepository", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface b {

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\n\u001a\u00020\u0006H'¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H'¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/google/firebase/sessions/b$a;", "", "Landroid/content/Context;", "appContext", "f", "(Landroid/content/Context;)Lcom/google/firebase/sessions/b$a;", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "b", "(Lkotlin/coroutines/CoroutineContext;)Lcom/google/firebase/sessions/b$a;", "blockingDispatcher", "e", "Lcom/google/firebase/f;", "firebaseApp", "c", "(Lcom/google/firebase/f;)Lcom/google/firebase/sessions/b$a;", "LJf/e;", "firebaseInstallationsApi", "d", "(LJf/e;)Lcom/google/firebase/sessions/b$a;", "LIf/b;", "Lpc/j;", "transportFactoryProvider", "a", "(LIf/b;)Lcom/google/firebase/sessions/b$a;", "Lcom/google/firebase/sessions/b;", "build", "()Lcom/google/firebase/sessions/b;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        a a(If.b<InterfaceC16286j> transportFactoryProvider);

        a b(@InterfaceC5598a CoroutineContext backgroundDispatcher);

        b build();

        a c(com.google.firebase.f firebaseApp);

        a d(Jf.e firebaseInstallationsApi);

        a e(@af.b CoroutineContext blockingDispatcher);

        a f(Context appContext);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/firebase/sessions/b$b;", "", "a", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.google.firebase.sessions.b$b, reason: collision with other inner class name */
    public interface InterfaceC1287b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = Companion.f89369a;

        @Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jc\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b \u0010!J'\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00112\u0006\u0010#\u001a\u00020\"2\b\b\u0001\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b'\u0010(J/\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00112\u0006\u0010#\u001a\u00020\"2\b\b\u0001\u0010%\u001a\u00020$2\u0006\u0010*\u001a\u00020)H\u0007¢\u0006\u0004\b,\u0010-¨\u0006."}, d2 = {"Lcom/google/firebase/sessions/b$b$a;", "", "<init>", "()V", "T", "LB2/D;", "serializer", "LC2/b;", "corruptionHandler", "", "LB2/f;", "migrations", "Lqv/O;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "LB2/h;", "f", "(LB2/D;LC2/b;Ljava/util/List;Lqv/O;Lkotlin/jvm/functions/Function0;)LB2/h;", "", "h", "()Z", "Lhg/X;", "o", "()Lhg/X;", "Lhg/Z;", "p", "()Lhg/Z;", "Lcom/google/firebase/f;", "firebaseApp", "Lhg/b;", "e", "(Lcom/google/firebase/f;)Lhg/b;", "Landroid/content/Context;", "appContext", "Lkotlin/coroutines/CoroutineContext;", "blockingDispatcher", "Lkg/h;", "i", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)LB2/h;", "Lhg/F;", "sessionDataSerializer", "Lhg/E;", "l", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;Lhg/F;)LB2/h;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: com.google.firebase.sessions.b$b$a, reason: from kotlin metadata */
        public static final class Companion {

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ Companion f89369a = new Companion();

            static /* synthetic */ InterfaceC2943h g(Companion companion, D d10, C2.b bVar, List list, InterfaceC16622O interfaceC16622O, Function0 function0, int i10, Object obj) {
                if ((i10 & 4) != 0) {
                    list = CollectionsKt.m();
                }
                return companion.f(d10, bVar, list, interfaceC16622O, function0);
            }

            private final boolean h() {
                try {
                    System.loadLibrary("datastore_shared_counter");
                    return true;
                } catch (SecurityException | UnsatisfiedLinkError unused) {
                    return false;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SessionConfigs j(CorruptionException ex) {
                Intrinsics.j(ex, "ex");
                FS.log_w("FirebaseSessions", "CorruptionException in session configs DataStore", ex);
                return i.f141894a.a();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final File k(Context context) {
                return A2.a.a(context, "aqs/sessionConfigsDataStore.data");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SessionData m(F f10, CorruptionException ex) {
                Intrinsics.j(ex, "ex");
                FS.log_w("FirebaseSessions", "CorruptionException in session data DataStore", ex);
                return f10.a();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final File n(Context context) {
                return A2.a.a(context, "aqs/sessionDataStore.data");
            }

            public final ApplicationInfo e(com.google.firebase.f firebaseApp) {
                Intrinsics.j(firebaseApp, "firebaseApp");
                return J.f134751a.b(firebaseApp);
            }

            public final InterfaceC2943h<SessionConfigs> i(final Context appContext, @af.b CoroutineContext blockingDispatcher) {
                Intrinsics.j(appContext, "appContext");
                Intrinsics.j(blockingDispatcher, "blockingDispatcher");
                return g(this, i.f141894a, new C2.b(new Function1() { // from class: hg.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b.InterfaceC1287b.Companion.j((CorruptionException) obj);
                    }
                }), null, C16623P.a(blockingDispatcher), new Function0() { // from class: hg.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return b.InterfaceC1287b.Companion.k(appContext);
                    }
                }, 4, null);
            }

            public final InterfaceC2943h<SessionData> l(final Context appContext, @af.b CoroutineContext blockingDispatcher, final F sessionDataSerializer) {
                Intrinsics.j(appContext, "appContext");
                Intrinsics.j(blockingDispatcher, "blockingDispatcher");
                Intrinsics.j(sessionDataSerializer, "sessionDataSerializer");
                return g(this, sessionDataSerializer, new C2.b(new Function1() { // from class: hg.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b.InterfaceC1287b.Companion.m(sessionDataSerializer, (CorruptionException) obj);
                    }
                }), null, C16623P.a(blockingDispatcher), new Function0() { // from class: hg.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return b.InterfaceC1287b.Companion.n(appContext);
                    }
                }, 4, null);
            }

            public final X o() {
                return Y.f134843a;
            }

            public final Z p() {
                return a0.f134850a;
            }

            private Companion() {
            }

            private final <T> InterfaceC2943h<T> f(D<T> serializer, C2.b<T> corruptionHandler, List<? extends InterfaceC2941f<T>> migrations, InterfaceC16622O scope, Function0<? extends File> produceFile) {
                if (h()) {
                    return x.f2020a.a(serializer, corruptionHandler, migrations, scope, produceFile);
                }
                return C2944i.f1785a.a(serializer, corruptionHandler, migrations, scope, produceFile);
            }
        }
    }

    T a();

    C14440l b();
}
