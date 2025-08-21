package T;

import C.AbstractC3025j;
import C.C3030o;
import C.C3034t;
import C.C3035u;
import C.InterfaceC3024i;
import C.InterfaceC3028m;
import C.InterfaceC3029n;
import C.O;
import C.p0;
import C.q0;
import C.r0;
import F.C3286v;
import F.InterfaceC3285u;
import F.InterfaceC3287w;
import F.InterfaceC3289y;
import F.InterfaceC3290z;
import F.o0;
import G.o;
import I.n;
import T.g;
import android.content.Context;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.concurrent.futures.c;
import androidx.view.InterfaceC6172s;
import com.google.common.util.concurrent.q;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import o2.i;
import q.InterfaceC16578a;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 T2\u00020\u0001:\u00010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJk\u0010+\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010#2\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0%2\u0016\u0010*\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010)0(\"\u0004\u0018\u00010)H\u0001¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0012H\u0017¢\u0006\u0004\b-\u0010\u0003J\u0017\u0010.\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b7\u00108R$\u0010=\u001a\u0010\u0012\f\u0012\n ;*\u0004\u0018\u00010:0:0\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u00108R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010D\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR \u0010M\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020J0H8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bK\u0010LR$\u0010O\u001a\u00020N2\u0006\u0010O\u001a\u00020N8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S¨\u0006U"}, d2 = {"LT/g;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/google/common/util/concurrent/q;", "LC/t;", "s", "(Landroid/content/Context;)Lcom/google/common/util/concurrent/q;", "LC/o;", "cameraSelector", "LC/n;", "cameraInfo", "Landroidx/camera/core/impl/f;", "p", "(LC/o;LC/n;)Landroidx/camera/core/impl/f;", "cameraX", "", "w", "(LC/t;)V", "x", "(Landroid/content/Context;)V", "Landroidx/lifecycle/s;", "lifecycleOwner", "LC/q0;", "useCaseGroup", "LC/i;", "n", "(Landroidx/lifecycle/s;LC/o;LC/q0;)LC/i;", "primaryCameraSelector", "secondaryCameraSelector", "LC/O;", "primaryLayoutSettings", "secondaryLayoutSettings", "LC/r0;", "viewPort", "", "LC/j;", "effects", "", "LC/p0;", "useCases", "o", "(Landroidx/lifecycle/s;LC/o;LC/o;LC/O;LC/O;LC/r0;Ljava/util/List;[LC/p0;)LC/i;", "y", "q", "(LC/o;)LC/n;", "a", "Ljava/lang/Object;", "mLock", "LC/u$b;", "b", "LC/u$b;", "mCameraXConfigProvider", "c", "Lcom/google/common/util/concurrent/q;", "mCameraXInitializeFuture", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "d", "mCameraXShutdownFuture", "LT/c;", "e", "LT/c;", "mLifecycleCameraRepository", "f", "LC/t;", "mCameraX", "g", "Landroid/content/Context;", "mContext", "", "Landroidx/camera/core/internal/CameraUseCaseAdapter$a;", "LF/o0;", "h", "Ljava/util/Map;", "mCameraInfoMap", "", "cameraOperatingMode", "r", "()I", "v", "(I)V", "i", "camera-lifecycle_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class g {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: j, reason: collision with root package name */
    private static final g f35857j = new g();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object mLock = new Object();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private C3035u.b mCameraXConfigProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private q<C3034t> mCameraXInitializeFuture;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private q<Void> mCameraXShutdownFuture;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final T.c mLifecycleCameraRepository;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private C3034t mCameraX;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Context mContext;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Map<CameraUseCaseAdapter.a, o0> mCameraInfoMap;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LT/g$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/google/common/util/concurrent/q;", "LT/g;", "b", "(Landroid/content/Context;)Lcom/google/common/util/concurrent/q;", "sAppInstance", "LT/g;", "camera-lifecycle_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: T.g$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LC/t;", "kotlin.jvm.PlatformType", "cameraX", "LT/g;", "a", "(LC/t;)LT/g;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: T.g$a$a, reason: collision with other inner class name */
        static final class C0792a extends Lambda implements Function1<C3034t, g> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Context f35866f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0792a(Context context) {
                super(1);
                this.f35866f = context;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g invoke(C3034t cameraX) {
                g gVar = g.f35857j;
                Intrinsics.i(cameraX, "cameraX");
                gVar.w(cameraX);
                g gVar2 = g.f35857j;
                Context contextA = G.e.a(this.f35866f);
                Intrinsics.i(contextA, "getApplicationContext(context)");
                gVar2.x(contextA);
                return g.f35857j;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g c(Function1 tmp0, Object obj) {
            Intrinsics.j(tmp0, "$tmp0");
            return (g) tmp0.invoke(obj);
        }

        @JvmStatic
        public final q<g> b(Context context) {
            Intrinsics.j(context, "context");
            i.g(context);
            q qVarS = g.f35857j.s(context);
            final C0792a c0792a = new C0792a(context);
            q<g> qVarX = n.x(qVarS, new InterfaceC16578a() { // from class: T.f
                @Override // q.InterfaceC16578a
                public final Object apply(Object obj) {
                    return g.Companion.c(c0792a, obj);
                }
            }, H.a.a());
            Intrinsics.i(qVarX, "context: Context): Liste…tExecutor()\n            )");
            return qVarX;
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"T/g$b", "LI/c;", "Ljava/lang/Void;", "result", "", "a", "(Ljava/lang/Void;)V", "", "t", "onFailure", "(Ljava/lang/Throwable;)V", "camera-lifecycle_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements I.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a<C3034t> f35867a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3034t f35868b;

        b(c.a<C3034t> aVar, C3034t c3034t) {
            this.f35867a = aVar;
            this.f35868b = c3034t;
        }

        @Override // I.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void result) {
            this.f35867a.c(this.f35868b);
        }

        @Override // I.c
        public void onFailure(Throwable t10) {
            Intrinsics.j(t10, "t");
            this.f35867a.f(t10);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00000\u00000\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Void;", "it", "Lcom/google/common/util/concurrent/q;", "kotlin.jvm.PlatformType", "a", "(Ljava/lang/Void;)Lcom/google/common/util/concurrent/q;"}, k = 3, mv = {1, 8, 0})
    static final class c extends Lambda implements Function1<Void, q<Void>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C3034t f35869f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C3034t c3034t) {
            super(1);
            this.f35869f = c3034t;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q<Void> invoke(Void r12) {
            return this.f35869f.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int r() {
        C3034t c3034t = this.mCameraX;
        if (c3034t == null) {
            return 0;
        }
        Intrinsics.g(c3034t);
        return c3034t.e().d().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q<C3034t> s(Context context) {
        synchronized (this.mLock) {
            q<C3034t> qVar = this.mCameraXInitializeFuture;
            if (qVar != null) {
                Intrinsics.h(qVar, "null cannot be cast to non-null type com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.CameraX>");
                return qVar;
            }
            final C3034t c3034t = new C3034t(context, this.mCameraXConfigProvider);
            q<C3034t> qVarA = androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: T.d
                @Override // androidx.concurrent.futures.c.InterfaceC1101c
                public final Object a(c.a aVar) {
                    return g.t(this.f35852a, c3034t, aVar);
                }
            });
            this.mCameraXInitializeFuture = qVarA;
            Intrinsics.h(qVarA, "null cannot be cast to non-null type com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.CameraX>");
            return qVarA;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object t(g this$0, C3034t cameraX, c.a completer) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(cameraX, "$cameraX");
        Intrinsics.j(completer, "completer");
        synchronized (this$0.mLock) {
            I.d dVarA = I.d.a(this$0.mCameraXShutdownFuture);
            final c cVar = new c(cameraX);
            I.d dVarE = dVarA.e(new I.a() { // from class: T.e
                @Override // I.a
                public final q apply(Object obj) {
                    return g.u(cVar, obj);
                }
            }, H.a.a());
            Intrinsics.i(dVarE, "cameraX = CameraX(contex…                        )");
            n.j(dVarE, new b(completer, cameraX), H.a.a());
            Unit unit = Unit.f143329a;
        }
        return "ProcessCameraProvider-initializeCameraX";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q u(Function1 tmp0, Object obj) {
        Intrinsics.j(tmp0, "$tmp0");
        return (q) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(int i10) {
        C3034t c3034t = this.mCameraX;
        if (c3034t == null) {
            return;
        }
        Intrinsics.g(c3034t);
        c3034t.e().d().d(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(C3034t cameraX) {
        this.mCameraX = cameraX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(Context context) {
        this.mContext = context;
    }

    public final InterfaceC3024i n(InterfaceC6172s lifecycleOwner, C3030o cameraSelector, q0 useCaseGroup) {
        Intrinsics.j(lifecycleOwner, "lifecycleOwner");
        Intrinsics.j(cameraSelector, "cameraSelector");
        Intrinsics.j(useCaseGroup, "useCaseGroup");
        H4.a.c("CX:bindToLifecycle-UseCaseGroup");
        try {
            if (r() == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
            }
            v(1);
            O DEFAULT = O.f3762f;
            Intrinsics.i(DEFAULT, "DEFAULT");
            Intrinsics.i(DEFAULT, "DEFAULT");
            r0 r0VarC = useCaseGroup.c();
            List<AbstractC3025j> listA = useCaseGroup.a();
            Intrinsics.i(listA, "useCaseGroup.effects");
            List<p0> listB = useCaseGroup.b();
            Intrinsics.i(listB, "useCaseGroup.useCases");
            p0[] p0VarArr = (p0[]) listB.toArray(new p0[0]);
            InterfaceC3024i interfaceC3024iO = o(lifecycleOwner, cameraSelector, null, DEFAULT, DEFAULT, r0VarC, listA, (p0[]) Arrays.copyOf(p0VarArr, p0VarArr.length));
            H4.a.f();
            return interfaceC3024iO;
        } catch (Throwable th2) {
            H4.a.f();
            throw th2;
        }
    }

    public final InterfaceC3024i o(InterfaceC6172s lifecycleOwner, C3030o primaryCameraSelector, C3030o secondaryCameraSelector, O primaryLayoutSettings, O secondaryLayoutSettings, r0 viewPort, List<? extends AbstractC3025j> effects, p0... useCases) {
        InterfaceC3290z interfaceC3290z;
        o0 o0Var;
        Intrinsics.j(lifecycleOwner, "lifecycleOwner");
        Intrinsics.j(primaryCameraSelector, "primaryCameraSelector");
        Intrinsics.j(primaryLayoutSettings, "primaryLayoutSettings");
        Intrinsics.j(secondaryLayoutSettings, "secondaryLayoutSettings");
        Intrinsics.j(effects, "effects");
        Intrinsics.j(useCases, "useCases");
        H4.a.c("CX:bindToLifecycle-internal");
        try {
            o.a();
            C3034t c3034t = this.mCameraX;
            Intrinsics.g(c3034t);
            InterfaceC3290z interfaceC3290zE = primaryCameraSelector.e(c3034t.f().a());
            Intrinsics.i(interfaceC3290zE, "primaryCameraSelector.se…cameraRepository.cameras)");
            interfaceC3290zE.p(true);
            InterfaceC3029n interfaceC3029nQ = q(primaryCameraSelector);
            Intrinsics.h(interfaceC3029nQ, "null cannot be cast to non-null type androidx.camera.core.impl.RestrictedCameraInfo");
            o0 o0Var2 = (o0) interfaceC3029nQ;
            if (secondaryCameraSelector != null) {
                C3034t c3034t2 = this.mCameraX;
                Intrinsics.g(c3034t2);
                InterfaceC3290z interfaceC3290zE2 = secondaryCameraSelector.e(c3034t2.f().a());
                interfaceC3290zE2.p(false);
                InterfaceC3029n interfaceC3029nQ2 = q(secondaryCameraSelector);
                Intrinsics.h(interfaceC3029nQ2, "null cannot be cast to non-null type androidx.camera.core.impl.RestrictedCameraInfo");
                interfaceC3290z = interfaceC3290zE2;
                o0Var = (o0) interfaceC3029nQ2;
            } else {
                interfaceC3290z = null;
                o0Var = null;
            }
            T.b bVarC = this.mLifecycleCameraRepository.c(lifecycleOwner, CameraUseCaseAdapter.A(o0Var2, o0Var));
            Collection<T.b> collectionE = this.mLifecycleCameraRepository.e();
            for (p0 p0Var : ArraysKt.c0(useCases)) {
                for (T.b lifecycleCameras : collectionE) {
                    Intrinsics.i(lifecycleCameras, "lifecycleCameras");
                    T.b bVar = lifecycleCameras;
                    if (bVar.s(p0Var) && !Intrinsics.e(bVar, bVarC)) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.f143748a;
                        String str = String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{p0Var}, 1));
                        Intrinsics.i(str, "format(format, *args)");
                        throw new IllegalStateException(str);
                    }
                }
            }
            if (bVarC == null) {
                T.c cVar = this.mLifecycleCameraRepository;
                C3034t c3034t3 = this.mCameraX;
                Intrinsics.g(c3034t3);
                D.a aVarD = c3034t3.e().d();
                C3034t c3034t4 = this.mCameraX;
                Intrinsics.g(c3034t4);
                InterfaceC3287w interfaceC3287wD = c3034t4.d();
                C3034t c3034t5 = this.mCameraX;
                Intrinsics.g(c3034t5);
                bVarC = cVar.b(lifecycleOwner, new CameraUseCaseAdapter(interfaceC3290zE, interfaceC3290z, o0Var2, o0Var, primaryLayoutSettings, secondaryLayoutSettings, aVarD, interfaceC3287wD, c3034t5.h()));
            }
            T.b bVar2 = bVarC;
            if (useCases.length == 0) {
                Intrinsics.g(bVar2);
            } else {
                T.c cVar2 = this.mLifecycleCameraRepository;
                Intrinsics.g(bVar2);
                List listP = CollectionsKt.p(Arrays.copyOf(useCases, useCases.length));
                C3034t c3034t6 = this.mCameraX;
                Intrinsics.g(c3034t6);
                cVar2.a(bVar2, viewPort, effects, listP, c3034t6.e().d());
            }
            H4.a.f();
            return bVar2;
        } catch (Throwable th2) {
            H4.a.f();
            throw th2;
        }
    }

    public InterfaceC3029n q(C3030o cameraSelector) {
        Object o0Var;
        Intrinsics.j(cameraSelector, "cameraSelector");
        H4.a.c("CX:getCameraInfo");
        try {
            C3034t c3034t = this.mCameraX;
            Intrinsics.g(c3034t);
            InterfaceC3289y interfaceC3289yI = cameraSelector.e(c3034t.f().a()).i();
            Intrinsics.i(interfaceC3289yI, "cameraSelector.select(mC…meras).cameraInfoInternal");
            androidx.camera.core.impl.f fVarP = p(cameraSelector, interfaceC3289yI);
            CameraUseCaseAdapter.a aVarA = CameraUseCaseAdapter.a.a(interfaceC3289yI.b(), fVarP.S());
            Intrinsics.i(aVarA, "create(\n                …ilityId\n                )");
            synchronized (this.mLock) {
                try {
                    o0Var = this.mCameraInfoMap.get(aVarA);
                    if (o0Var == null) {
                        o0Var = new o0(interfaceC3289yI, fVarP);
                        this.mCameraInfoMap.put(aVarA, o0Var);
                    }
                    Unit unit = Unit.f143329a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return (o0) o0Var;
        } finally {
            H4.a.f();
        }
    }

    public void y() {
        H4.a.c("CX:unbindAll");
        try {
            o.a();
            v(0);
            this.mLifecycleCameraRepository.k();
            Unit unit = Unit.f143329a;
        } finally {
            H4.a.f();
        }
    }

    private g() {
        q<Void> qVarP = n.p(null);
        Intrinsics.i(qVarP, "immediateFuture<Void>(null)");
        this.mCameraXShutdownFuture = qVarP;
        this.mLifecycleCameraRepository = new T.c();
        this.mCameraInfoMap = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.camera.core.impl.f p(C3030o cameraSelector, InterfaceC3029n cameraInfo) {
        Iterator<InterfaceC3028m> it = cameraSelector.c().iterator();
        androidx.camera.core.impl.f fVar = null;
        while (it.hasNext()) {
            InterfaceC3028m next = it.next();
            Intrinsics.i(next, "cameraSelector.cameraFilterSet");
            InterfaceC3028m interfaceC3028m = next;
            if (!Intrinsics.e(interfaceC3028m.getIdentifier(), InterfaceC3028m.f3861a)) {
                InterfaceC3285u interfaceC3285uA = F.O.a(interfaceC3028m.getIdentifier());
                Context context = this.mContext;
                Intrinsics.g(context);
                androidx.camera.core.impl.f fVarA = interfaceC3285uA.a(cameraInfo, context);
                if (fVarA == null) {
                    continue;
                } else if (fVar == null) {
                    fVar = fVarA;
                } else {
                    throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                }
            }
        }
        if (fVar == null) {
            return C3286v.a();
        }
        return fVar;
    }
}
