package com.google.firebase.sessions;

import B2.C2912i;
import B2.D;
import B2.InterfaceC2909f;
import B2.InterfaceC2911h;
import B2.x;
import android.content.Context;
import androidx.datastore.core.CorruptionException;
import cf.InterfaceC6504a;
import com.fullstory.FS;
import com.google.firebase.sessions.b;
import java.io.File;
import java.util.List;
import jg.ApplicationInfo;
import jg.C15018l;
import jg.F;
import jg.J;
import jg.SessionData;
import jg.T;
import jg.X;
import jg.Y;
import jg.Z;
import jg.a0;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mg.SessionConfigs;
import mg.i;
import mv.C15784P;
import mv.InterfaceC15783O;
import rc.InterfaceC16890j;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0002\u0007\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/google/firebase/sessions/b;", "", "Ljg/l;", "b", "()Ljg/l;", "firebaseSessions", "Ljg/T;", "a", "()Ljg/T;", "sharedSessionRepository", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface b {

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\n\u001a\u00020\u0006H'¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H'¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/google/firebase/sessions/b$a;", "", "Landroid/content/Context;", "appContext", "f", "(Landroid/content/Context;)Lcom/google/firebase/sessions/b$a;", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "a", "(Lkotlin/coroutines/CoroutineContext;)Lcom/google/firebase/sessions/b$a;", "blockingDispatcher", "e", "Lcom/google/firebase/f;", "firebaseApp", "c", "(Lcom/google/firebase/f;)Lcom/google/firebase/sessions/b$a;", "LLf/e;", "firebaseInstallationsApi", "b", "(LLf/e;)Lcom/google/firebase/sessions/b$a;", "LKf/b;", "Lrc/j;", "transportFactoryProvider", "d", "(LKf/b;)Lcom/google/firebase/sessions/b$a;", "Lcom/google/firebase/sessions/b;", "build", "()Lcom/google/firebase/sessions/b;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        a a(@InterfaceC6504a CoroutineContext backgroundDispatcher);

        a b(Lf.e firebaseInstallationsApi);

        b build();

        a c(com.google.firebase.f firebaseApp);

        a d(Kf.b<InterfaceC16890j> transportFactoryProvider);

        a e(@cf.b CoroutineContext blockingDispatcher);

        a f(Context appContext);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/firebase/sessions/b$b;", "", "a", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.google.firebase.sessions.b$b, reason: collision with other inner class name */
    public interface InterfaceC1296b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = Companion.f90211a;

        @Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jc\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b \u0010!J'\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00112\u0006\u0010#\u001a\u00020\"2\b\b\u0001\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b'\u0010(J/\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00112\u0006\u0010#\u001a\u00020\"2\b\b\u0001\u0010%\u001a\u00020$2\u0006\u0010*\u001a\u00020)H\u0007¢\u0006\u0004\b,\u0010-¨\u0006."}, d2 = {"Lcom/google/firebase/sessions/b$b$a;", "", "<init>", "()V", "T", "LB2/D;", "serializer", "LC2/b;", "corruptionHandler", "", "LB2/f;", "migrations", "Lmv/O;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "LB2/h;", "f", "(LB2/D;LC2/b;Ljava/util/List;Lmv/O;Lkotlin/jvm/functions/Function0;)LB2/h;", "", "h", "()Z", "Ljg/X;", "o", "()Ljg/X;", "Ljg/Z;", "p", "()Ljg/Z;", "Lcom/google/firebase/f;", "firebaseApp", "Ljg/b;", "e", "(Lcom/google/firebase/f;)Ljg/b;", "Landroid/content/Context;", "appContext", "Lkotlin/coroutines/CoroutineContext;", "blockingDispatcher", "Lmg/h;", "i", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)LB2/h;", "Ljg/F;", "sessionDataSerializer", "Ljg/E;", "l", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;Ljg/F;)LB2/h;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: com.google.firebase.sessions.b$b$a, reason: from kotlin metadata */
        public static final class Companion {

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ Companion f90211a = new Companion();

            static /* synthetic */ InterfaceC2911h g(Companion companion, D d10, C2.b bVar, List list, InterfaceC15783O interfaceC15783O, Function0 function0, int i10, Object obj) {
                if ((i10 & 4) != 0) {
                    list = CollectionsKt.m();
                }
                return companion.f(d10, bVar, list, interfaceC15783O, function0);
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
                return i.f151040a.a();
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
                return J.f140446a.b(firebaseApp);
            }

            public final InterfaceC2911h<SessionConfigs> i(final Context appContext, @cf.b CoroutineContext blockingDispatcher) {
                Intrinsics.j(appContext, "appContext");
                Intrinsics.j(blockingDispatcher, "blockingDispatcher");
                return g(this, i.f151040a, new C2.b(new Function1() { // from class: jg.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b.InterfaceC1296b.Companion.j((CorruptionException) obj);
                    }
                }), null, C15784P.a(blockingDispatcher), new Function0() { // from class: jg.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return b.InterfaceC1296b.Companion.k(appContext);
                    }
                }, 4, null);
            }

            public final InterfaceC2911h<SessionData> l(final Context appContext, @cf.b CoroutineContext blockingDispatcher, final F sessionDataSerializer) {
                Intrinsics.j(appContext, "appContext");
                Intrinsics.j(blockingDispatcher, "blockingDispatcher");
                Intrinsics.j(sessionDataSerializer, "sessionDataSerializer");
                return g(this, sessionDataSerializer, new C2.b(new Function1() { // from class: jg.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b.InterfaceC1296b.Companion.m(sessionDataSerializer, (CorruptionException) obj);
                    }
                }), null, C15784P.a(blockingDispatcher), new Function0() { // from class: jg.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return b.InterfaceC1296b.Companion.n(appContext);
                    }
                }, 4, null);
            }

            public final X o() {
                return Y.f140538a;
            }

            public final Z p() {
                return a0.f140545a;
            }

            private Companion() {
            }

            private final <T> InterfaceC2911h<T> f(D<T> serializer, C2.b<T> corruptionHandler, List<? extends InterfaceC2909f<T>> migrations, InterfaceC15783O scope, Function0<? extends File> produceFile) {
                if (h()) {
                    return x.f2499a.a(serializer, corruptionHandler, migrations, scope, produceFile);
                }
                return C2912i.f2264a.a(serializer, corruptionHandler, migrations, scope, produceFile);
            }
        }
    }

    T a();

    C15018l b();
}
