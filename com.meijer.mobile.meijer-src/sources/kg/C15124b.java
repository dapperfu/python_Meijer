package kg;

import com.fullstory.FS;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kg.InterfaceC15125c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import wv.InterfaceC17929a;
import wv.g;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0010H\u0080@¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0013\u0010\u0014RT\u0010\u0018\u001aB\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\r0\r \u0016* \u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\r0\r\u0018\u00010\u00100\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017¨\u0006\u0019"}, d2 = {"Lkg/b;", "", "<init>", "()V", "Lkg/c$a;", "subscriberName", "", "a", "(Lkg/c$a;)V", "Lkg/c;", "subscriber", "e", "(Lkg/c;)V", "Lkg/b$a;", "b", "(Lkg/c$a;)Lkg/b$a;", "", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "(Lkg/c$a;)Lkg/c;", "", "kotlin.jvm.PlatformType", "Ljava/util/Map;", "dependencies", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: kg.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C15124b {

    /* renamed from: a, reason: collision with root package name */
    public static final C15124b f141827a = new C15124b();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Map<InterfaceC15125c.a, Dependency> dependencies = Collections.synchronizedMap(new LinkedHashMap());

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lkg/b$a;", "", "Lwv/a;", "mutex", "Lkg/c;", "subscriber", "<init>", "(Lwv/a;Lkg/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwv/a;", "()Lwv/a;", "b", "Lkg/c;", "()Lkg/c;", "c", "(Lkg/c;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kg.b$a, reason: from toString */
    private static final /* data */ class Dependency {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC17929a mutex;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private InterfaceC15125c subscriber;

        public Dependency(InterfaceC17929a mutex, InterfaceC15125c interfaceC15125c) {
            Intrinsics.j(mutex, "mutex");
            this.mutex = mutex;
            this.subscriber = interfaceC15125c;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dependency)) {
                return false;
            }
            Dependency dependency = (Dependency) other;
            return Intrinsics.e(this.mutex, dependency.mutex) && Intrinsics.e(this.subscriber, dependency.subscriber);
        }

        public /* synthetic */ Dependency(InterfaceC17929a interfaceC17929a, InterfaceC15125c interfaceC15125c, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC17929a, (i10 & 2) != 0 ? null : interfaceC15125c);
        }

        /* renamed from: a, reason: from getter */
        public final InterfaceC17929a getMutex() {
            return this.mutex;
        }

        /* renamed from: b, reason: from getter */
        public final InterfaceC15125c getSubscriber() {
            return this.subscriber;
        }

        public final void c(InterfaceC15125c interfaceC15125c) {
            this.subscriber = interfaceC15125c;
        }

        public int hashCode() {
            int iHashCode = this.mutex.hashCode() * 31;
            InterfaceC15125c interfaceC15125c = this.subscriber;
            return iHashCode + (interfaceC15125c == null ? 0 : interfaceC15125c.hashCode());
        }

        public String toString() {
            return "Dependency(mutex=" + this.mutex + ", subscriber=" + this.subscriber + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", f = "FirebaseSessionsDependencies.kt", l = {110}, m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions")
    /* renamed from: kg.b$b, reason: collision with other inner class name */
    static final class C2246b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f141831a;

        /* renamed from: b, reason: collision with root package name */
        Object f141832b;

        /* renamed from: c, reason: collision with root package name */
        Object f141833c;

        /* renamed from: d, reason: collision with root package name */
        Object f141834d;

        /* renamed from: e, reason: collision with root package name */
        Object f141835e;

        /* renamed from: f, reason: collision with root package name */
        Object f141836f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f141837g;

        /* renamed from: i, reason: collision with root package name */
        int f141839i;

        C2246b(Continuation<? super C2246b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f141837g = obj;
            this.f141839i |= Integer.MIN_VALUE;
            return C15124b.this.c(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void a(InterfaceC15125c.a subscriberName) {
        Intrinsics.j(subscriberName, "subscriberName");
        Map<InterfaceC15125c.a, Dependency> dependencies2 = dependencies;
        if (dependencies2.containsKey(subscriberName)) {
            FS.log_d("FirebaseSessions", "Dependency " + subscriberName + " already added.");
            return;
        }
        Intrinsics.i(dependencies2, "dependencies");
        dependencies2.put(subscriberName, new Dependency(g.a(true), null, 2, 0 == true ? 1 : 0));
        FS.log_d("FirebaseSessions", "Dependency to " + subscriberName + " added.");
    }

    private final Dependency b(InterfaceC15125c.a subscriberName) {
        Map<InterfaceC15125c.a, Dependency> dependencies2 = dependencies;
        Intrinsics.i(dependencies2, "dependencies");
        Dependency dependency = dependencies2.get(subscriberName);
        if (dependency != null) {
            Intrinsics.i(dependency, "getOrElse(...)");
            return dependency;
        }
        throw new IllegalStateException("Cannot get dependency " + subscriberName + ". Dependencies should be added at class load time.");
    }

    @JvmStatic
    public static final void e(InterfaceC15125c subscriber) {
        Intrinsics.j(subscriber, "subscriber");
        InterfaceC15125c.a aVarC = subscriber.c();
        Dependency dependencyB = f141827a.b(aVarC);
        if (dependencyB.getSubscriber() != null) {
            FS.log_d("FirebaseSessions", "Subscriber " + aVarC + " already registered.");
            return;
        }
        dependencyB.c(subscriber);
        FS.log_d("FirebaseSessions", "Subscriber " + aVarC + " registered.");
        InterfaceC17929a.C2673a.c(dependencyB.getMutex(), null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a1 -> B:27:0x00a2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation<? super java.util.Map<kg.InterfaceC15125c.a, ? extends kg.InterfaceC15125c>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof kg.C15124b.C2246b
            if (r0 == 0) goto L13
            r0 = r11
            kg.b$b r0 = (kg.C15124b.C2246b) r0
            int r1 = r0.f141839i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f141839i = r1
            goto L18
        L13:
            kg.b$b r0 = new kg.b$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f141837g
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f141839i
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r2 = r0.f141836f
            java.lang.Object r5 = r0.f141835e
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.f141834d
            wv.a r6 = (wv.InterfaceC17929a) r6
            java.lang.Object r7 = r0.f141833c
            kg.c$a r7 = (kg.InterfaceC15125c.a) r7
            java.lang.Object r8 = r0.f141832b
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.f141831a
            java.util.Map r9 = (java.util.Map) r9
            kotlin.ResultKt.b(r11)
            goto La2
        L40:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L48:
            kotlin.ResultKt.b(r11)
            java.util.Map<kg.c$a, kg.b$a> r11 = kg.C15124b.dependencies
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.Intrinsics.i(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = kotlin.collections.MapsKt.f(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L6b:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lb5
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            kg.c$a r7 = (kg.InterfaceC15125c.a) r7
            java.lang.Object r11 = r11.getValue()
            kg.b$a r11 = (kg.C15124b.Dependency) r11
            wv.a r6 = r11.getMutex()
            r0.f141831a = r5
            r0.f141832b = r8
            r0.f141833c = r7
            r0.f141834d = r6
            r0.f141835e = r5
            r0.f141836f = r2
            r0.f141839i = r3
            java.lang.Object r11 = r6.g(r4, r0)
            if (r11 != r1) goto La1
            return r1
        La1:
            r9 = r5
        La2:
            kg.b r11 = kg.C15124b.f141827a     // Catch: java.lang.Throwable -> Lb0
            kg.c r11 = r11.d(r7)     // Catch: java.lang.Throwable -> Lb0
            r6.h(r4)
            r5.put(r2, r11)
            r5 = r9
            goto L6b
        Lb0:
            r11 = move-exception
            r6.h(r4)
            throw r11
        Lb5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.C15124b.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final InterfaceC15125c d(InterfaceC15125c.a subscriberName) {
        Intrinsics.j(subscriberName, "subscriberName");
        InterfaceC15125c subscriber = b(subscriberName).getSubscriber();
        if (subscriber != null) {
            return subscriber;
        }
        throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
    }

    private C15124b() {
    }
}
