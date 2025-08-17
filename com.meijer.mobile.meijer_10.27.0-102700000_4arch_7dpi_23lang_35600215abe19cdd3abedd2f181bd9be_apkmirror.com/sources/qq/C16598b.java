package qq;

import F2.f;
import F2.i;
import F2.j;
import android.content.Context;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u000bB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lqq/b;", "Lqq/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "deviceId", "", "c", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "Ltv/f;", "getDeviceId", "()Ltv/f;", "b", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: qq.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C16598b implements InterfaceC16597a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f157485b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f157486c = 8;

    /* renamed from: d, reason: collision with root package name */
    private static final f.a<String> f157487d = i.g("device_id");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lqq/b$a;", "", "<init>", "()V", "LF2/f$a;", "", "DEVICE_ID_KEY", "LF2/f$a;", "a", "()LF2/f$a;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qq.b$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }

        public final f.a<String> a() {
            return C16598b.f157487d;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: qq.b$b, reason: collision with other inner class name */
    public static final class C2440b implements InterfaceC17152f<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f157489a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: qq.b$b$a */
        public static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f157490a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.shopandscan.utils.datastore.ApplicationManagerImpl$special$$inlined$map$1$2", f = "ApplicationManagerImpl.kt", l = {50}, m = "emit")
            /* renamed from: qq.b$b$a$a, reason: collision with other inner class name */
            public static final class C2441a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f157491a;

                /* renamed from: b, reason: collision with root package name */
                int f157492b;

                /* renamed from: c, reason: collision with root package name */
                Object f157493c;

                /* renamed from: e, reason: collision with root package name */
                Object f157495e;

                /* renamed from: f, reason: collision with root package name */
                Object f157496f;

                /* renamed from: g, reason: collision with root package name */
                Object f157497g;

                /* renamed from: h, reason: collision with root package name */
                int f157498h;

                public C2441a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f157491a = obj;
                    this.f157492b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC17153g interfaceC17153g) {
                this.f157490a = interfaceC17153g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof qq.C16598b.C2440b.a.C2441a
                    if (r0 == 0) goto L13
                    r0 = r7
                    qq.b$b$a$a r0 = (qq.C16598b.C2440b.a.C2441a) r0
                    int r1 = r0.f157492b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f157492b = r1
                    goto L18
                L13:
                    qq.b$b$a$a r0 = new qq.b$b$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f157491a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f157492b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r6 = r0.f157497g
                    tv.g r6 = (tv.InterfaceC17153g) r6
                    java.lang.Object r6 = r0.f157495e
                    qq.b$b$a$a r6 = (qq.C16598b.C2440b.a.C2441a) r6
                    kotlin.ResultKt.b(r7)
                    goto L63
                L31:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L39:
                    kotlin.ResultKt.b(r7)
                    tv.g r7 = r5.f157490a
                    r2 = r6
                    F2.f r2 = (F2.f) r2
                    F2.f$a r4 = qq.C16598b.b()
                    java.lang.Object r2 = r2.b(r4)
                    java.lang.String r2 = (java.lang.String) r2
                    if (r2 != 0) goto L4f
                    java.lang.String r2 = ""
                L4f:
                    r0.f157493c = r6
                    r0.f157495e = r0
                    r0.f157496f = r6
                    r0.f157497g = r7
                    r6 = 0
                    r0.f157498h = r6
                    r0.f157492b = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L63
                    return r1
                L63:
                    kotlin.Unit r6 = kotlin.Unit.f142422a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: qq.C16598b.C2440b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C2440b(InterfaceC17152f interfaceC17152f) {
            this.f157489a = interfaceC17152f;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super String> interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f157489a.collect(new a(interfaceC17153g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: qq.b$c */
    public static final class c implements InterfaceC17152f<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f157499a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C16598b f157500b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: qq.b$c$a */
        public static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f157501a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C16598b f157502b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.shopandscan.utils.datastore.ApplicationManagerImpl$special$$inlined$map$2$2", f = "ApplicationManagerImpl.kt", l = {53, 50}, m = "emit")
            /* renamed from: qq.b$c$a$a, reason: collision with other inner class name */
            public static final class C2442a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f157503a;

                /* renamed from: b, reason: collision with root package name */
                int f157504b;

                /* renamed from: c, reason: collision with root package name */
                Object f157505c;

                /* renamed from: e, reason: collision with root package name */
                Object f157507e;

                /* renamed from: f, reason: collision with root package name */
                Object f157508f;

                /* renamed from: g, reason: collision with root package name */
                Object f157509g;

                /* renamed from: h, reason: collision with root package name */
                Object f157510h;

                /* renamed from: i, reason: collision with root package name */
                Object f157511i;

                /* renamed from: j, reason: collision with root package name */
                Object f157512j;

                /* renamed from: k, reason: collision with root package name */
                Object f157513k;

                /* renamed from: l, reason: collision with root package name */
                int f157514l;

                /* renamed from: m, reason: collision with root package name */
                int f157515m;

                /* renamed from: n, reason: collision with root package name */
                int f157516n;

                public C2442a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f157503a = obj;
                    this.f157504b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC17153g interfaceC17153g, C16598b c16598b) {
                this.f157501a = interfaceC17153g;
                this.f157502b = c16598b;
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x00c5, code lost:
            
                if (r12.emit(r2, r0) != r1) goto L27;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
                /*
                    Method dump skipped, instructions count: 203
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: qq.C16598b.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(InterfaceC17152f interfaceC17152f, C16598b c16598b) {
            this.f157499a = interfaceC17152f;
            this.f157500b = c16598b;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super String> interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f157499a.collect(new a(interfaceC17153g, this.f157500b), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LF2/c;", "applicationManager", "", "<anonymous>", "(LF2/c;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.utils.datastore.ApplicationManagerImpl$updateData$2", f = "ApplicationManagerImpl.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: qq.b$d */
    static final class d extends SuspendLambda implements Function2<F2.c, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f157517a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f157518b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f157519c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f157519c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f157519c, continuation);
            dVar.f157518b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(F2.c cVar, Continuation<? super Unit> continuation) {
            return ((d) create(cVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f157517a == 0) {
                ResultKt.b(obj);
                F2.c cVar = (F2.c) this.f157518b;
                String str = this.f157519c;
                if (str != null) {
                    cVar.i(C16598b.f157485b.a(), str);
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C16598b(Context context) {
        Intrinsics.j(context, "context");
        this.context = context;
    }

    public Object c(String str, Continuation<? super Unit> continuation) {
        Object objA = j.a(C16599c.b(this.context), new d(str, null), continuation);
        return objA == IntrinsicsKt.f() ? objA : Unit.f142422a;
    }

    @Override // qq.InterfaceC16597a
    public InterfaceC17152f<String> getDeviceId() {
        return new c(new C2440b(C16599c.b(this.context).getData()), this);
    }
}
