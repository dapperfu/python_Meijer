package B2;

import B2.z;
import android.os.FileObserver;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.InterfaceC16643h0;
import tv.C17154h;
import tv.InterfaceC17152f;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR,\u0010\u0014\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\b0\u0010j\u0002`\u00110\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"LB2/z;", "Landroid/os/FileObserver;", "", "path", "<init>", "(Ljava/lang/String;)V", "", "event", "", "onEvent", "(ILjava/lang/String;)V", "a", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function1;", "Landroidx/datastore/core/FileMoveObserver;", "b", "Ljava/util/concurrent/CopyOnWriteArrayList;", "delegates", "c", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class z extends FileObserver {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Object f2025d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static final Map<String, z> f2026e = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String path;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<Function1<String, Unit>> delegates;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\tH\u0003¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011R,\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00130\u00128\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LB2/z$a;", "", "<init>", "()V", "Ljava/io/File;", "parent", "Lkotlin/Function1;", "", "", "Landroidx/datastore/core/FileMoveObserver;", "observer", "Lqv/h0;", "d", "(Ljava/io/File;Lkotlin/jvm/functions/Function1;)Lqv/h0;", "file", "Ltv/f;", "e", "(Ljava/io/File;)Ltv/f;", "", "LB2/z;", "fileObservers", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "getFileObservers$datastore_core_release$annotations", "LOCK", "Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: B2.z$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsv/t;", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.datastore.core.MulticastFileObserver$Companion$observe$1", f = "MulticastFileObserver.android.kt", l = {84, 85}, m = "invokeSuspend")
        /* renamed from: B2.z$a$a, reason: collision with other inner class name */
        static final class C0039a extends SuspendLambda implements Function2<sv.t<? super Unit>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f2029a;

            /* renamed from: b, reason: collision with root package name */
            int f2030b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f2031c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ File f2032d;

            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: B2.z$a$a$a, reason: collision with other inner class name */
            static final class C0040a extends Lambda implements Function0<Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ InterfaceC16643h0 f2033f;

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f142422a;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0040a(InterfaceC16643h0 interfaceC16643h0) {
                    super(0);
                    this.f2033f = interfaceC16643h0;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.f2033f.dispose();
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "fileName", "", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: B2.z$a$a$b */
            static final class b extends Lambda implements Function1<String, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ File f2034f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ sv.t<Unit> f2035g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(File file, sv.t<? super Unit> tVar) {
                    super(1);
                    this.f2034f = file;
                    this.f2035g = tVar;
                }

                public final void a(String str) {
                    if (Intrinsics.e(str, this.f2034f.getName())) {
                        sv.n.b(this.f2035g, Unit.f142422a);
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    a(str);
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0039a(File file, Continuation<? super C0039a> continuation) {
                super(2, continuation);
                this.f2032d = file;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C0039a c0039a = new C0039a(this.f2032d, continuation);
                c0039a.f2031c = obj;
                return c0039a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(sv.t<? super Unit> tVar, Continuation<? super Unit> continuation) {
                return ((C0039a) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
            
                if (sv.r.a(r3, r7, r6) == r0) goto L16;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r6.f2030b
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L26
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    kotlin.ResultKt.b(r7)
                    goto L66
                L12:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1a:
                    java.lang.Object r1 = r6.f2029a
                    qv.h0 r1 = (qv.InterfaceC16643h0) r1
                    java.lang.Object r3 = r6.f2031c
                    sv.t r3 = (sv.t) r3
                    kotlin.ResultKt.b(r7)
                    goto L53
                L26:
                    kotlin.ResultKt.b(r7)
                    java.lang.Object r7 = r6.f2031c
                    sv.t r7 = (sv.t) r7
                    B2.z$a$a$b r1 = new B2.z$a$a$b
                    java.io.File r4 = r6.f2032d
                    r1.<init>(r4, r7)
                    B2.z$a r4 = B2.z.INSTANCE
                    java.io.File r5 = r6.f2032d
                    java.io.File r5 = r5.getParentFile()
                    kotlin.jvm.internal.Intrinsics.g(r5)
                    qv.h0 r1 = B2.z.Companion.b(r4, r5, r1)
                    kotlin.Unit r4 = kotlin.Unit.f142422a
                    r6.f2031c = r7
                    r6.f2029a = r1
                    r6.f2030b = r3
                    java.lang.Object r3 = r7.r(r4, r6)
                    if (r3 != r0) goto L52
                    goto L65
                L52:
                    r3 = r7
                L53:
                    B2.z$a$a$a r7 = new B2.z$a$a$a
                    r7.<init>(r1)
                    r1 = 0
                    r6.f2031c = r1
                    r6.f2029a = r1
                    r6.f2030b = r2
                    java.lang.Object r7 = sv.r.a(r3, r7, r6)
                    if (r7 != r0) goto L66
                L65:
                    return r0
                L66:
                    kotlin.Unit r7 = kotlin.Unit.f142422a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: B2.z.Companion.C0039a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(String str, Function1 observer) {
            Intrinsics.j(observer, "$observer");
            synchronized (z.f2025d) {
                try {
                    Companion companion = z.INSTANCE;
                    z zVar = companion.c().get(str);
                    if (zVar != null) {
                        zVar.delegates.remove(observer);
                        if (zVar.delegates.isEmpty()) {
                            companion.c().remove(str);
                            zVar.stopWatching();
                        }
                    }
                    Unit unit = Unit.f142422a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final InterfaceC17152f<Unit> e(File file) {
            Intrinsics.j(file, "file");
            return C17154h.i(new C0039a(file, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final InterfaceC16643h0 d(File parent, final Function1<? super String, Unit> observer) {
            final String key = parent.getCanonicalFile().getPath();
            synchronized (z.f2025d) {
                try {
                    Map<String, z> mapC = z.INSTANCE.c();
                    Intrinsics.i(key, "key");
                    z zVar = mapC.get(key);
                    if (zVar == null) {
                        zVar = new z(key, null);
                        mapC.put(key, zVar);
                    }
                    z zVar2 = zVar;
                    zVar2.delegates.add(observer);
                    if (zVar2.delegates.size() == 1) {
                        zVar2.startWatching();
                    }
                    Unit unit = Unit.f142422a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return new InterfaceC16643h0() { // from class: B2.y
                @Override // qv.InterfaceC16643h0
                public final void dispose() {
                    z.Companion.f(key, observer);
                }
            };
        }

        public final Map<String, z> c() {
            return z.f2026e;
        }
    }

    public /* synthetic */ z(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private z(String str) {
        super(str, 128);
        this.path = str;
        this.delegates = new CopyOnWriteArrayList<>();
    }

    @Override // android.os.FileObserver
    public void onEvent(int event, String path) {
        Iterator<T> it = this.delegates.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(path);
        }
    }
}
