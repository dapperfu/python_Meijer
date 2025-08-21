package androidx.compose.ui.window;

import H1.t;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.E;
import androidx.compose.runtime.F;
import androidx.compose.runtime.F0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Z;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.InterfaceC5953g;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.InterfaceC15783O;
import r1.C16819m;
import r1.u;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001aA\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0013\u001a\u00020\n*\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0016\u001a\u00020\u000f*\u00020\u00052\u0006\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\" \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#²\u0006\u0012\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/window/p;", "popupPositionProvider", "Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/window/q;", "properties", "content", "a", "(Landroidx/compose/ui/window/p;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/q;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "", "focusable", "Landroidx/compose/ui/window/r;", "securePolicy", "clippingEnabled", "", "g", "(ZLandroidx/compose/ui/window/r;Z)I", "Landroid/view/View;", "i", "(Landroid/view/View;)Z", "isParentFlagSecureEnabled", "h", "(Landroidx/compose/ui/window/q;Z)I", "Landroid/graphics/Rect;", "LH1/p;", "j", "(Landroid/graphics/Rect;)LH1/p;", "Landroidx/compose/runtime/F0;", "", "Landroidx/compose/runtime/F0;", "getLocalPopupTestTag", "()Landroidx/compose/runtime/F0;", "LocalPopupTestTag", "currentContent", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final F0<String> f53109a = androidx.compose.runtime.r.d(null, a.f53110f, 1, null);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function0<String> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f53110f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: androidx.compose.ui.window.b$b, reason: collision with other inner class name */
    static final class C1096b extends Lambda implements Function1<F, E> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ PopupLayout f53111f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f53112g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ q f53113h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f53114i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ t f53115j;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/window/b$b$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: androidx.compose.ui.window.b$b$a */
        public static final class a implements E {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PopupLayout f53116a;

            public a(PopupLayout popupLayout) {
                this.f53116a = popupLayout;
            }

            @Override // androidx.compose.runtime.E
            public void dispose() {
                this.f53116a.e();
                this.f53116a.m();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1096b(PopupLayout popupLayout, Function0<Unit> function0, q qVar, String str, t tVar) {
            super(1);
            this.f53111f = popupLayout;
            this.f53112g = function0;
            this.f53113h = qVar;
            this.f53114i = str;
            this.f53115j = tVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke(F f10) {
            this.f53111f.r();
            this.f53111f.t(this.f53112g, this.f53113h, this.f53114i, this.f53115j);
            return new a(this.f53111f);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ PopupLayout f53117f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f53118g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ q f53119h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f53120i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ t f53121j;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(PopupLayout popupLayout, Function0<Unit> function0, q qVar, String str, t tVar) {
            super(0);
            this.f53117f = popupLayout;
            this.f53118g = function0;
            this.f53119h = qVar;
            this.f53120i = str;
            this.f53121j = tVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f53117f.t(this.f53118g, this.f53119h, this.f53120i, this.f53121j);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class d extends Lambda implements Function1<F, E> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ PopupLayout f53122f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ p f53123g;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/window/b$d$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a implements E {
            @Override // androidx.compose.runtime.E
            public void dispose() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(PopupLayout popupLayout, p pVar) {
            super(1);
            this.f53122f = popupLayout;
            this.f53123g = pVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke(F f10) {
            this.f53122f.setPositionProvider(this.f53123g);
            this.f53122f.x();
            return new a();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1", f = "AndroidPopup.android.kt", l = {371}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f53124a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f53125b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ PopupLayout f53126c;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends Lambda implements Function1<Long, Unit> {

            /* renamed from: f, reason: collision with root package name */
            public static final a f53127f = new a();

            a() {
                super(1);
            }

            public final void a(long j10) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
                a(l10.longValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(PopupLayout popupLayout, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f53126c = popupLayout;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(this.f53126c, continuation);
            eVar.f53125b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0033 -> B:14:0x0036). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r3.f53124a
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r3.f53125b
                mv.O r1 = (mv.InterfaceC15783O) r1
                kotlin.ResultKt.b(r4)
                goto L36
            L13:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L1b:
                kotlin.ResultKt.b(r4)
                java.lang.Object r4 = r3.f53125b
                mv.O r4 = (mv.InterfaceC15783O) r4
                r1 = r4
            L23:
                boolean r4 = mv.C15784P.i(r1)
                if (r4 == 0) goto L3c
                androidx.compose.ui.window.b$e$a r4 = androidx.compose.ui.window.b.e.a.f53127f
                r3.f53125b = r1
                r3.f53124a = r2
                java.lang.Object r4 = androidx.compose.ui.platform.J0.a(r4, r3)
                if (r4 != r0) goto L36
                return r0
            L36:
                androidx.compose.ui.window.PopupLayout r4 = r3.f53126c
                r4.p()
                goto L23
            L3c:
                kotlin.Unit r4 = kotlin.Unit.f143329a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "childCoordinates", "", "a", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ PopupLayout f53128f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(PopupLayout popupLayout) {
            super(1);
            this.f53128f = popupLayout;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
            a(layoutCoordinates);
            return Unit.f143329a;
        }

        public final void a(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates layoutCoordinatesN0 = layoutCoordinates.n0();
            Intrinsics.g(layoutCoordinatesN0);
            this.f53128f.v(layoutCoordinatesN0);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/K;", "", "Landroidx/compose/ui/layout/I;", "<anonymous parameter 0>", "LH1/b;", "<anonymous parameter 1>", "Landroidx/compose/ui/layout/J;", "d", "(Landroidx/compose/ui/layout/K;Ljava/util/List;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
    static final class g implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PopupLayout f53129a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f53130b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            public static final a f53131f = new a();

            a() {
                super(1);
            }

            public final void a(f0.a aVar) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f143329a;
            }
        }

        g(PopupLayout popupLayout, t tVar) {
            this.f53129a = popupLayout;
            this.f53130b = tVar;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final J d(K k10, List<? extends I> list, long j10) {
            this.f53129a.setParentLayoutDirection(this.f53130b);
            return K.G0(k10, 0, 0, null, a.f53131f, 4, null);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ p f53132f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f53133g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ q f53134h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f53135i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f53136j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f53137k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(p pVar, Function0<Unit> function0, q qVar, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f53132f = pVar;
            this.f53133g = function0;
            this.f53134h = qVar;
            this.f53135i = function2;
            this.f53136j = i10;
            this.f53137k = i11;
        }

        public final void a(Composer composer, int i10) {
            b.a(this.f53132f, this.f53133g, this.f53134h, this.f53135i, composer, J0.a(this.f53136j | 1), this.f53137k);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class j extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ PopupLayout f53139f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z1<Function2<Composer, Integer, Unit>> f53140g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends Lambda implements Function1<u, Unit> {

            /* renamed from: f, reason: collision with root package name */
            public static final a f53141f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
                a(uVar);
                return Unit.f143329a;
            }

            public final void a(u uVar) {
                r1.s.U(uVar);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH1/r;", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.ui.window.b$j$b, reason: collision with other inner class name */
        static final class C1097b extends Lambda implements Function1<H1.r, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ PopupLayout f53142f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1097b(PopupLayout popupLayout) {
                super(1);
                this.f53142f = popupLayout;
            }

            public final void a(long j10) {
                this.f53142f.m16setPopupContentSizefhxjrPA(H1.r.b(j10));
                this.f53142f.x();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(H1.r rVar) {
                a(rVar.getPackedValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(PopupLayout popupLayout, z1<? extends Function2<? super Composer, ? super Integer, Unit>> z1Var) {
            super(2);
            this.f53139f = popupLayout;
            this.f53140g = z1Var;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1302892335, i10, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:317)");
            }
            Modifier modifierD = C16819m.d(Modifier.INSTANCE, false, a.f53141f, 1, null);
            boolean zD = composer.D(this.f53139f);
            PopupLayout popupLayout = this.f53139f;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new C1097b(popupLayout);
                composer.t(objB);
            }
            Modifier modifierA = T0.a.a(Z.a(modifierD, (Function1) objB), this.f53139f.getCanCalculatePosition() ? 1.0f : 0.0f);
            Function2 function2B = b.b(this.f53140g);
            androidx.compose.ui.window.c cVar = androidx.compose.ui.window.c.f53143a;
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierA);
            InterfaceC5953g.Companion aVar = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = aVar.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, cVar, aVar.e());
            D1.c(composerA, interfaceC5884sR, aVar.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = aVar.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B2);
            }
            D1.c(composerA, modifierE, aVar.f());
            function2B.invoke(composer, 0);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/util/UUID;", "kotlin.jvm.PlatformType", "c", "()Ljava/util/UUID;"}, k = 3, mv = {1, 9, 0})
    static final class i extends Lambda implements Function0<UUID> {

        /* renamed from: f, reason: collision with root package name */
        public static final i f53138f = new i();

        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.window.p r29, kotlin.jvm.functions.Function0<kotlin.Unit> r30, androidx.compose.ui.window.q r31, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.b.a(androidx.compose.ui.window.p, kotlin.jvm.functions.Function0, androidx.compose.ui.window.q, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(boolean z10, r rVar, boolean z11) {
        int i10 = !z10 ? 262152 : 262144;
        if (rVar == r.f53174b) {
            i10 |= 8192;
        }
        return !z11 ? i10 | 512 : i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H1.p j(Rect rect) {
        return new H1.p(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2<Composer, Integer, Unit> b(z1<? extends Function2<? super Composer, ? super Integer, Unit>> z1Var) {
        return (Function2) z1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(q qVar, boolean z10) {
        if (qVar.getInheritSecurePolicy() && z10) {
            return qVar.getFlags() | 8192;
        }
        if (qVar.getInheritSecurePolicy() && !z10) {
            return qVar.getFlags() & (-8193);
        }
        return qVar.getFlags();
    }

    public static final boolean i(View view) {
        WindowManager.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getRootView().getLayoutParams();
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null || (layoutParams.flags & 8192) == 0) {
            return false;
        }
        return true;
    }
}
