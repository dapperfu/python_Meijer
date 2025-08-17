package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.room.C6131q;
import androidx.room.InterfaceC6125k;
import androidx.room.InterfaceC6126l;
import com.fullstory.FS;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16648k;
import qv.InterfaceC16622O;
import sv.EnumC17050a;
import tv.C17146H;
import tv.InterfaceC17139A;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u00017\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\fJ)\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00150\u00142\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0012¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\n  *\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R \u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0015048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00105R\u0014\u00109\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00108R\u0014\u0010<\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010;R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010>¨\u0006@"}, d2 = {"Landroidx/room/r;", "", "Landroid/content/Context;", "context", "", "name", "Landroidx/room/q;", "invalidationTracker", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroidx/room/q;)V", "", "j", "()V", "Landroid/content/Intent;", "serviceIntent", "k", "(Landroid/content/Intent;)V", "l", "", "resolvedTableNames", "Ltv/f;", "", "h", "([Ljava/lang/String;)Ltv/f;", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "Landroidx/room/q;", "i", "()Landroidx/room/q;", "kotlin.jvm.PlatformType", "c", "Landroid/content/Context;", "appContext", "Lqv/O;", "d", "Lqv/O;", "coroutineScope", "Ljava/util/concurrent/atomic/AtomicBoolean;", "e", "Ljava/util/concurrent/atomic/AtomicBoolean;", "stopped", "", "f", "I", "clientId", "Landroidx/room/l;", "g", "Landroidx/room/l;", "invalidationService", "Ltv/A;", "Ltv/A;", "invalidatedTables", "androidx/room/r$c", "Landroidx/room/r$c;", "observer", "Landroidx/room/k;", "Landroidx/room/k;", "invalidationCallback", "Landroid/content/ServiceConnection;", "Landroid/content/ServiceConnection;", "serviceConnection", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C6131q invalidationTracker;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context appContext;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O coroutineScope;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean stopped;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int clientId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private InterfaceC6126l invalidationService;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<Set<String>> invalidatedTables;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final c observer;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6125k invalidationCallback;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ServiceConnection serviceConnection;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a implements InterfaceC17152f<Set<? extends String>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f58621a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String[] f58622b;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        @SourceDebugExtension
        /* renamed from: androidx.room.r$a$a, reason: collision with other inner class name */
        public static final class C1147a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f58623a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String[] f58624b;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2", f = "MultiInstanceInvalidationClient.android.kt", l = {239}, m = "emit")
            /* renamed from: androidx.room.r$a$a$a, reason: collision with other inner class name */
            public static final class C1148a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f58625a;

                /* renamed from: b, reason: collision with root package name */
                int f58626b;

                public C1148a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f58625a = obj;
                    this.f58626b |= Integer.MIN_VALUE;
                    return C1147a.this.emit(null, this);
                }
            }

            public C1147a(InterfaceC17153g interfaceC17153g, String[] strArr) {
                this.f58623a = interfaceC17153g;
                this.f58624b = strArr;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof androidx.room.r.a.C1147a.C1148a
                    if (r0 == 0) goto L13
                    r0 = r12
                    androidx.room.r$a$a$a r0 = (androidx.room.r.a.C1147a.C1148a) r0
                    int r1 = r0.f58626b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f58626b = r1
                    goto L18
                L13:
                    androidx.room.r$a$a$a r0 = new androidx.room.r$a$a$a
                    r0.<init>(r12)
                L18:
                    java.lang.Object r12 = r0.f58625a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f58626b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.ResultKt.b(r12)
                    goto L7c
                L29:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L31:
                    kotlin.ResultKt.b(r12)
                    tv.g r12 = r10.f58623a
                    java.util.Set r11 = (java.util.Set) r11
                    java.util.Set r2 = kotlin.collections.SetsKt.b()
                    java.lang.String[] r4 = r10.f58624b
                    int r5 = r4.length
                    r6 = 0
                L40:
                    if (r6 >= r5) goto L64
                    r7 = r4[r6]
                    r8 = r11
                    java.lang.Iterable r8 = (java.lang.Iterable) r8
                    java.util.Iterator r8 = r8.iterator()
                L4b:
                    boolean r9 = r8.hasNext()
                    if (r9 == 0) goto L61
                    java.lang.Object r9 = r8.next()
                    java.lang.String r9 = (java.lang.String) r9
                    boolean r9 = kotlin.text.StringsKt.H(r7, r9, r3)
                    if (r9 == 0) goto L4b
                    r2.add(r7)
                    goto L4b
                L61:
                    int r6 = r6 + 1
                    goto L40
                L64:
                    java.util.Set r11 = kotlin.collections.SetsKt.a(r2)
                    java.util.Collection r11 = (java.util.Collection) r11
                    boolean r2 = r11.isEmpty()
                    if (r2 == 0) goto L71
                    r11 = 0
                L71:
                    if (r11 == 0) goto L7c
                    r0.f58626b = r3
                    java.lang.Object r11 = r12.emit(r11, r0)
                    if (r11 != r1) goto L7c
                    return r1
                L7c:
                    kotlin.Unit r11 = kotlin.Unit.f142422a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.r.a.C1147a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC17152f interfaceC17152f, String[] strArr) {
            this.f58621a = interfaceC17152f;
            this.f58622b = strArr;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super Set<? extends String>> interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f58621a.collect(new C1147a(interfaceC17153g, this.f58622b), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/room/r$b", "Landroidx/room/k$a;", "", "", "tables", "", "C1", "([Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends InterfaceC6125k.a {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1", f = "MultiInstanceInvalidationClient.android.kt", l = {87}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f58629a;

            /* renamed from: b, reason: collision with root package name */
            int f58630b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String[] f58631c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ r f58632d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String[] strArr, r rVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f58631c = strArr;
                this.f58632d = rVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f58631c, this.f58632d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Set<String> set;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f58630b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        set = (Set) this.f58629a;
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    String[] strArr = this.f58631c;
                    Set<String> setI = SetsKt.i(Arrays.copyOf(strArr, strArr.length));
                    InterfaceC17139A interfaceC17139A = this.f58632d.invalidatedTables;
                    this.f58629a = setI;
                    this.f58630b = 1;
                    if (interfaceC17139A.emit(setI, this) == objF) {
                        return objF;
                    }
                    set = setI;
                }
                this.f58632d.getInvalidationTracker().t(set);
                return Unit.f142422a;
            }
        }

        b() {
        }

        @Override // androidx.room.InterfaceC6125k
        public void C1(String[] tables) {
            Intrinsics.j(tables, "tables");
            C16648k.d(r.this.coroutineScope, null, null, new a(tables, r.this, null), 3, null);
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"androidx/room/r$c", "Landroidx/room/q$b;", "", "", "tables", "", "c", "(Ljava/util/Set;)V", "", "b", "()Z", "isRemote", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class c extends C6131q.b {
        @Override // androidx.room.C6131q.b
        public boolean b() {
            return true;
        }

        c(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.C6131q.b
        public void c(Set<String> tables) {
            Intrinsics.j(tables, "tables");
            if (r.this.stopped.get()) {
                return;
            }
            try {
                InterfaceC6126l interfaceC6126l = r.this.invalidationService;
                if (interfaceC6126l != null) {
                    interfaceC6126l.J4(r.this.clientId, (String[]) tables.toArray(new String[0]));
                }
            } catch (RemoteException e10) {
                FS.log_w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/room/r$d", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", "service", "", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements ServiceConnection {
        d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            Intrinsics.j(name, "name");
            Intrinsics.j(service, "service");
            r.this.invalidationService = InterfaceC6126l.a.A1(service);
            r.this.j();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            Intrinsics.j(name, "name");
            r.this.invalidationService = null;
        }
    }

    public r(Context context, String name, C6131q invalidationTracker) {
        Intrinsics.j(context, "context");
        Intrinsics.j(name, "name");
        Intrinsics.j(invalidationTracker, "invalidationTracker");
        this.name = name;
        this.invalidationTracker = invalidationTracker;
        this.appContext = context.getApplicationContext();
        this.coroutineScope = invalidationTracker.getDatabase().getCoroutineScope();
        this.stopped = new AtomicBoolean(true);
        this.invalidatedTables = C17146H.a(0, 0, EnumC17050a.f161240a);
        this.observer = new c(invalidationTracker.getTableNames());
        this.invalidationCallback = new b();
        this.serviceConnection = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        try {
            InterfaceC6126l interfaceC6126l = this.invalidationService;
            if (interfaceC6126l != null) {
                this.clientId = interfaceC6126l.g6(this.invalidationCallback, this.name);
            }
        } catch (RemoteException e10) {
            FS.log_w("ROOM", "Cannot register multi-instance invalidation callback", e10);
        }
    }

    public final InterfaceC17152f<Set<String>> h(String[] resolvedTableNames) {
        Intrinsics.j(resolvedTableNames, "resolvedTableNames");
        return new a(this.invalidatedTables, resolvedTableNames);
    }

    /* renamed from: i, reason: from getter */
    public final C6131q getInvalidationTracker() {
        return this.invalidationTracker;
    }

    public final void k(Intent serviceIntent) {
        Intrinsics.j(serviceIntent, "serviceIntent");
        if (this.stopped.compareAndSet(true, false)) {
            this.appContext.bindService(serviceIntent, this.serviceConnection, 1);
            this.invalidationTracker.j(this.observer);
        }
    }

    public final void l() {
        if (this.stopped.compareAndSet(false, true)) {
            this.invalidationTracker.z(this.observer);
            try {
                InterfaceC6126l interfaceC6126l = this.invalidationService;
                if (interfaceC6126l != null) {
                    interfaceC6126l.p9(this.invalidationCallback, this.clientId);
                }
            } catch (RemoteException e10) {
                FS.log_w("ROOM", "Cannot unregister multi-instance invalidation callback", e10);
            }
            this.appContext.unbindService(this.serviceConnection);
        }
    }
}
