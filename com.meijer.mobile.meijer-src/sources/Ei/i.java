package Ei;

import Ei.i;
import Ki.C;
import Ki.LocalThemeScope;
import Ki.T;
import V0.AbstractC5467i0;
import V0.C5489q0;
import V0.F1;
import X0.Stroke;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.InterfaceC5866i0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C6418E;
import kotlin.C6439a;
import kotlin.C6453j;
import kotlin.C6456m;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.n0;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u001a]\u0010\u000f\u001a\u00020\r*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a]\u0010\u0013\u001a\u00020\r*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00112\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0012\u001a\u00020\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0016\u001a\u00020\r*\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001aQ\u0010 \u001a\u00020\r*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001eH\u0007¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "value", "maxValue", "LKi/C;", BarcodePickDeserializer.FIELD_ICON, "", "description", "", "isLogScale", "Lkotlin/Function0;", "", "content", "g", "(LKi/M;Landroidx/compose/ui/Modifier;DDLKi/C;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "", "showFraction", "h", "(LKi/M;Landroidx/compose/ui/Modifier;IILKi/C;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "LEi/b;", "n", "(LEi/b;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "", "progressValue", "LH1/h;", "thickness", "LKi/T;", "backgroundIndicatorColor", "", "gradientColors", "k", "(LKi/M;Landroidx/compose/ui/Modifier;FFFLKi/T;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class i {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Function1<l, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7695a = new a();

        public final void a(l lVar) {
            Intrinsics.j(lVar, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(l lVar) {
            a(lVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LJi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LJi/h;", "s", "()LJi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b extends Ji.c<Integer, l, l> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final z1<Function1<l, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final z1<l> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final l initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Function0<l> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ji.h f7699a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f7700b;

            public a(Ji.h hVar, b bVar) {
                this.f7699a = hVar;
                this.f7700b = bVar;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Ei.l, Ji.h, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final l invoke() {
                ?? r02 = this.f7699a;
                this.f7700b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ji.c
        public z1<l> r() {
            return this.state;
        }

        @Override // Ji.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public l getInitialScope() {
            return this.initialScope;
        }

        public z1<Function1<l, Unit>> t() {
            return this.latestContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1 function1, Composer composer, int i10, Object[] objArr, Ji.h hVar) {
            this.latestContent = o1.p(function1, composer, (i10 >> 6) & 14);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(objArr);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = o1.e(new a(hVar, this));
                composer.t(objB);
            }
            composer.P();
            this.state = (z1) objB;
            this.initialScope = hVar;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c implements Function1<l, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f7701a = new c();

        public final void a(l lVar) {
            Intrinsics.j(lVar, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(l lVar) {
            a(lVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LJi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LJi/h;", "s", "()LJi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class d extends Ji.c<Integer, l, l> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final z1<Function1<l, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final z1<l> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final l initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Function0<l> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ji.h f7705a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f7706b;

            public a(Ji.h hVar, d dVar) {
                this.f7705a = hVar;
                this.f7706b = dVar;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Ei.l, Ji.h, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final l invoke() {
                ?? r02 = this.f7705a;
                this.f7706b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ji.c
        public z1<l> r() {
            return this.state;
        }

        @Override // Ji.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public l getInitialScope() {
            return this.initialScope;
        }

        public z1<Function1<l, Unit>> t() {
            return this.latestContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1 function1, Composer composer, int i10, Object[] objArr, Ji.h hVar) {
            this.latestContent = o1.p(function1, composer, (i10 >> 6) & 14);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(objArr);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = o1.e(new a(hVar, this));
                composer.t(objB);
            }
            composer.P();
            this.state = (z1) objB;
            this.initialScope = hVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.android_acres_library.composables.progress_indicator.ProgressIndicatorKt$ProgressIndicatorFromScope$1$1", f = "ProgressIndicator.kt", l = {187}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f7707a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6439a<Float, C6456m> f7708b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ double f7709c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C6439a<Float, C6456m> c6439a, double d10, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f7708b = c6439a;
            this.f7709c = d10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(this.f7708b, this.f7709c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f7707a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C6439a<Float, C6456m> c6439a = this.f7708b;
                Float fC = Boxing.c((float) this.f7709c);
                n0 n0VarL = C6453j.l(750, 0, C6418E.d(), 2, null);
                this.f7707a = 1;
                if (C6439a.f(c6439a, fC, n0VarL, null, null, this, 12, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.android_acres_library.composables.progress_indicator.ProgressIndicatorKt$ProgressIndicatorFromScope$2$1", f = "ProgressIndicator.kt", l = {194}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f7710a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6439a<Float, C6456m> f7711b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5866i0 f7712c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C6439a<Float, C6456m> c6439a, InterfaceC5866i0 interfaceC5866i0, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f7711b = c6439a;
            this.f7712c = interfaceC5866i0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.f7711b, this.f7712c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f7710a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C6439a<Float, C6456m> c6439a = this.f7711b;
                Float value = this.f7712c.getValue();
                n0 n0VarL = C6453j.l(250, 0, C6418E.d(), 2, null);
                this.f7710a = 1;
                if (C6439a.f(c6439a, value, n0VarL, null, null, this, 12, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f7713a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5866i0 f7714b;

        g(boolean z10, InterfaceC5866i0 interfaceC5866i0) {
            this.f7713a = z10;
            this.f7714b = interfaceC5866i0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(f0 f0Var, f0 f0Var2, f0.a layout) {
            Intrinsics.j(layout, "$this$layout");
            f0.a.l(layout, f0Var, 0, 0, 0.0f, 4, null);
            f0.a.l(layout, f0Var2, (f0Var.M0() / 2) - (f0Var2.M0() / 2), f0Var.J0() - (f0Var2.J0() / 3), 0.0f, 4, null);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(f0 f0Var, f0.a layout) {
            Intrinsics.j(layout, "$this$layout");
            f0.a.l(layout, f0Var, 0, 0, 0.0f, 4, null);
            return Unit.f143329a;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final J d(K Layout, List<? extends I> measurables, long j10) {
            Intrinsics.j(Layout, "$this$Layout");
            Intrinsics.j(measurables, "measurables");
            final f0 f0VarK0 = measurables.get(0).k0(j10);
            if (!this.f7713a) {
                return K.G0(Layout, f0VarK0.M0(), f0VarK0.J0(), null, new Function1() { // from class: Ei.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return i.g.f(f0VarK0, (f0.a) obj);
                    }
                }, 4, null);
            }
            final f0 f0VarK02 = measurables.get(1).k0(j10);
            double d10 = 2;
            this.f7714b.q((float) Math.toDegrees(Math.atan((f0VarK02.getWidth() / d10) / (f0VarK0.getHeight() / d10))));
            return K.G0(Layout, f0VarK0.M0(), f0VarK0.J0() + f0VarK02.J0(), null, new Function1() { // from class: Ei.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return i.g.c(f0VarK0, f0VarK02, (f0.a) obj);
                }
            }, 4, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ki.LocalThemeScope r22, androidx.compose.ui.Modifier r23, final double r24, final double r26, Ki.C r28, java.lang.String r29, boolean r30, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ei.i.g(Ki.M, androidx.compose.ui.Modifier, double, double, Ki.C, java.lang.String, boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final Ki.LocalThemeScope r25, androidx.compose.ui.Modifier r26, final int r27, final int r28, Ki.C r29, java.lang.String r30, boolean r31, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ei.i.h(Ki.M, androidx.compose.ui.Modifier, int, int, Ki.C, java.lang.String, boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, Modifier modifier, double d10, double d11, C c10, String str, boolean z10, Function2 function2, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, modifier, d10, d11, c10, str, z10, function2, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, C c10, String str, boolean z10, Function2 function2, int i12, int i13, Composer composer, int i14) {
        h(localThemeScope, modifier, i10, i11, c10, str, z10, function2, composer, J0.a(i12 | 1), i13);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final Ki.LocalThemeScope r22, androidx.compose.ui.Modifier r23, final float r24, final float r25, float r26, Ki.T r27, java.util.List<? extends Ki.T> r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ei.i.k(Ki.M, androidx.compose.ui.Modifier, float, float, float, Ki.T, java.util.List, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(T t10, float f10, float f11, float f12, List list, X0.f Canvas) {
        Intrinsics.j(Canvas, "$this$Canvas");
        long color = t10.getColor();
        int iB = F1.INSTANCE.b();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.b() & 4294967295L));
        float f13 = 2;
        float fI1 = Canvas.I1(f10) / f13;
        float fI12 = Canvas.I1(f10) / f13;
        long jE = U0.f.e((Float.floatToRawIntBits(fI12) & 4294967295L) | (Float.floatToRawIntBits(fI1) << 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.b() >> 32)) - (Canvas.I1(f10) / f13);
        float fI13 = Canvas.I1(f10) / f13;
        X0.f.O0(Canvas, color, jE, U0.f.e((Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(fI13) & 4294967295L)), fIntBitsToFloat, iB, null, 0.0f, null, 0, 480, null);
        if (f11 > 0.0f) {
            float fIntBitsToFloat3 = (f11 / f12) * Float.intBitsToFloat((int) (Canvas.b() >> 32));
            AbstractC5467i0.Companion companion = AbstractC5467i0.INSTANCE;
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(C5489q0.m(((T) it.next()).getColor()));
            }
            AbstractC5467i0 abstractC5467i0B = AbstractC5467i0.Companion.b(companion, arrayList, 0L, 0L, 0, 14, null);
            int iB2 = F1.INSTANCE.b();
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (Canvas.b() & 4294967295L));
            float fI14 = Canvas.I1(f10) / f13;
            float fI15 = Canvas.I1(f10) / f13;
            long jE2 = U0.f.e((Float.floatToRawIntBits(fI15) & 4294967295L) | (Float.floatToRawIntBits(fI14) << 32));
            float fI16 = fIntBitsToFloat3 - (Canvas.I1(f10) / f13);
            float fI17 = Canvas.I1(f10) / f13;
            X0.f.P0(Canvas, abstractC5467i0B, jE2, U0.f.e((Float.floatToRawIntBits(fI16) << 32) | (Float.floatToRawIntBits(fI17) & 4294967295L)), fIntBitsToFloat4, iB2, null, 0.0f, null, 0, 480, null);
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, Modifier modifier, float f10, float f11, float f12, T t10, List list, int i10, int i11, Composer composer, int i12) {
        k(localThemeScope, modifier, f10, f11, f12, t10, list, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(final Ei.b r38, final androidx.compose.ui.Modifier r39, androidx.compose.runtime.Composer r40, final int r41) {
        /*
            Method dump skipped, instructions count: 1708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ei.i.n(Ei.b, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(Ei.b bVar, C6439a c6439a, float f10, float f11, boolean z10, C6439a c6439a2, X0.f Canvas) throws Throwable {
        X0.d dVar;
        long j10;
        Intrinsics.j(Canvas, "$this$Canvas");
        long jQ1 = Canvas.Q1();
        X0.d drawContext = Canvas.getDrawContext();
        long jB = drawContext.b();
        drawContext.g().save();
        try {
            drawContext.getTransform().g(90.0f, jQ1);
        } catch (Throwable th2) {
            th = th2;
            dVar = drawContext;
            j10 = jB;
        }
        try {
            X0.f.k1(Canvas, bVar.getLocalThemeScope().getAdsColors().getAdsColorUIBorder02().getColor(), ((Number) c6439a.m()).floatValue(), 360.0f - (((Number) c6439a.m()).floatValue() * 2.0f), false, U0.f.e((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), U0.k.d((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L)), 0.0f, new Stroke(f11, 0.0f, 0, 0, null, 30, null), null, 0, 832, null);
            if (z10) {
                X0.f.f2(Canvas, AbstractC5467i0.Companion.d(AbstractC5467i0.INSTANCE, CollectionsKt.p(C5489q0.m(T.a.C3936d.f17376c.getColor()), C5489q0.m(bVar.getLocalThemeScope().getAdsColors().getAdsColorEnabled01().getColor())), 0L, 2, null), ((Number) c6439a.m()).floatValue(), (360.0f - (((Number) c6439a.m()).floatValue() * 2.0f)) * ((Number) c6439a2.m()).floatValue(), false, U0.f.e((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), U0.k.d((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L)), 0.0f, new Stroke(f11 * 2, 0.0f, F1.INSTANCE.b(), 0, null, 26, null), null, 0, 832, null);
            }
            drawContext.g().i();
            drawContext.h(jB);
            return Unit.f143329a;
        } catch (Throwable th3) {
            th = th3;
            dVar = drawContext;
            j10 = jB;
            dVar.g().i();
            dVar.h(j10);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(Ei.b bVar, Modifier modifier, int i10, Composer composer, int i11) {
        n(bVar, modifier, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }
}
