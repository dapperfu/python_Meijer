package Hs;

import Hs.o;
import Js.WeeklyAdItem;
import Ki.LocalThemeScope;
import Ps.o;
import android.content.Context;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5868j0;
import androidx.compose.runtime.J;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c5.C6484c;
import j0.InterfaceC14882C;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15429A;
import l0.C15430B;
import l0.C15432b;
import l0.InterfaceC15433c;
import l0.w;
import m5.C15669h;
import mv.InterfaceC15783O;
import yu.C18374a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001aG\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\r\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0013²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "LPs/o$i;", "viewState", "Lkotlin/Function1;", "LPs/o$f;", "", "onAction", "Lkotlin/Function0;", "changeDrawerState", "g", "(LKi/M;Landroidx/compose/ui/Modifier;LPs/o$i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "l", "(LKi/M;Landroidx/compose/ui/Modifier;LPs/o$i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "rotationState", "", "currentItemListIndex", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class o {

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class a extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final a f14043f = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Pair<? extends String, ? extends List<? extends WeeklyAdItem>> pair) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f14044f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f14045g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, List list) {
            super(1);
            this.f14044f = function1;
            this.f14045g = list;
        }

        public final Object a(int i10) {
            return this.f14044f.invoke(this.f14045g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class c extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f14046f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f14047g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f14048h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list, LocalThemeScope localThemeScope, Function1 function1) {
            super(4);
            this.f14046f = list;
            this.f14047g = localThemeScope;
            this.f14048h = function1;
        }

        public final void a(InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15433c) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= composer.d(i10) ? 32 : 16;
            }
            if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            Pair pair = (Pair) this.f14046f.get(i10);
            composer.startReplaceGroup(-1815268655);
            h.b(this.f14047g, null, this.f14048h, (String) pair.a(), (List) pair.b(), composer, LocalThemeScope.f17314g, 1);
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15433c, num.intValue(), composer, num2.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function3<C15429A, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o.ViewState f14049a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5868j0 f14050b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.weeklyad.compose.weeklyAdHybrid.WeeklyAdViewScreenKt$WeeklyAdViewPager$1$1$1$2$1", f = "WeeklyAdViewScreen.kt", l = {190}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f14051a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C15429A f14052b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ o.ViewState f14053c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C15429A c15429a, o.ViewState iVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f14052b = c15429a;
                this.f14053c = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f14052b, this.f14053c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f14051a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C15429A c15429a = this.f14052b;
                    int iF = this.f14053c.getCurrentPage();
                    this.f14051a = 1;
                    if (C15429A.J(c15429a, iF, 0, this, 2, null) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
        public static final class b extends Lambda implements Function1 {

            /* renamed from: f, reason: collision with root package name */
            public static final b f14054f = new b();

            public b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Void invoke(String str) {
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        public static final class c extends Lambda implements Function1<Integer, Object> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1 f14055f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List f14056g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Function1 function1, List list) {
                super(1);
                this.f14055f = function1;
                this.f14056g = list;
            }

            public final Object a(int i10) {
                return this.f14055f.invoke(this.f14056g.get(i10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
        @SourceDebugExtension
        /* renamed from: Hs.o$d$d, reason: collision with other inner class name */
        public static final class C0224d extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f14057f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0224d(List list) {
                super(4);
                this.f14057f = list;
            }

            public final void a(InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = i11 | (composer.V(interfaceC15433c) ? 4 : 2);
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= composer.d(i10) ? 32 : 16;
                }
                if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                String str = (String) this.f14057f.get(i10);
                composer.startReplaceGroup(-1668320172);
                C6484c.e(new C15669h.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())).f(str).e(true).c(), null, a5.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())), interfaceC15433c.e(Modifier.INSTANCE, 1.0f), null, null, null, InterfaceC5926k.INSTANCE.e(), 0.0f, null, 0, false, null, composer, 12582960, 0, 8048);
                composer.P();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Integer num, Composer composer, Integer num2) {
                a(interfaceC15433c, num.intValue(), composer, num2.intValue());
                return Unit.f143329a;
            }
        }

        d(o.ViewState iVar, InterfaceC5868j0 interfaceC5868j0) {
            this.f14049a = iVar;
            this.f14050b = interfaceC5868j0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(o.ViewState iVar, w LazyRow) {
            Intrinsics.j(LazyRow, "$this$LazyRow");
            List<String> listK = iVar.k();
            LazyRow.i(listK.size(), null, new c(b.f14054f, listK), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new C0224d(listK)));
            return Unit.f143329a;
        }

        public final void b(C15429A listState, Composer composer, int i10) {
            int i11;
            Intrinsics.j(listState, "listState");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(listState) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-672847268, i11, -1, "com.meijer.mobile.weeklyad.compose.weeklyAdHybrid.WeeklyAdViewPager.<anonymous>.<anonymous>.<anonymous> (WeeklyAdViewScreen.kt:166)");
            }
            int i12 = i11 & 14;
            o.n(this.f14050b, Br.h.b(listState, composer, i12));
            float f10 = 8;
            InterfaceC14882C interfaceC14882CB = D.b(H1.h.p(16), H1.h.p(f10));
            C5800d.f fVarO = C5800d.f48779a.o(H1.h.p(f10));
            yu.e eVarB = C18374a.b(C15430B.b(0, 0, composer, 0, 3), null, null, null, null, composer, 0, 30);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f14049a);
            final o.ViewState iVar = this.f14049a;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Hs.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return o.d.c(iVar, (w) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C15432b.c(null, listState, interfaceC14882CB, false, fVarO, null, eVarB, false, null, (Function1) objB, composer, ((i11 << 3) & 112) | 24960, 425);
            Integer numValueOf = Integer.valueOf(this.f14049a.getCurrentPage());
            composer.startReplaceGroup(-1633490746);
            boolean zV2 = composer.V(this.f14049a) | (i12 == 4);
            o.ViewState iVar2 = this.f14049a;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new a(listState, iVar2, null);
                composer.t(objB2);
            }
            composer.P();
            J.g(numValueOf, (Function2) objB2, composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(C15429A c15429a, Composer composer, Integer num) {
            b(c15429a, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.compose.weeklyAdHybrid.WeeklyAdViewScreenKt$WeeklyAdViewPager$2$1", f = "WeeklyAdViewScreen.kt", l = {}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f14058a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<o.f, Unit> f14059b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5868j0 f14060c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function1<? super o.f, Unit> function1, InterfaceC5868j0 interfaceC5868j0, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f14059b = function1;
            this.f14060c = interfaceC5868j0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(this.f14059b, this.f14060c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f14058a == 0) {
                ResultKt.b(obj);
                this.f14059b.invoke(new o.f.PagerSwipe(o.m(this.f14060c)));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ki.LocalThemeScope r42, androidx.compose.ui.Modifier r43, Ps.o.ViewState r44, final kotlin.jvm.functions.Function1<? super Ps.o.f, kotlin.Unit> r45, final kotlin.jvm.functions.Function0<kotlin.Unit> r46, androidx.compose.runtime.Composer r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Hs.o.g(Ki.M, androidx.compose.ui.Modifier, Ps.o$i, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(o.ViewState iVar, LocalThemeScope localThemeScope, Function1 function1, w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        if (iVar.q().isEmpty()) {
            w.g(LazyColumn, null, null, Hs.a.f13995a.a(), 3, null);
        } else {
            List<Pair<String, List<WeeklyAdItem>>> listQ = iVar.q();
            LazyColumn.i(listQ.size(), null, new b(a.f14043f, listQ), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new c(listQ, localThemeScope, function1)));
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, Modifier modifier, o.ViewState iVar, Function1 function1, Function0 function0, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, modifier, iVar, function1, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final Ki.LocalThemeScope r44, androidx.compose.ui.Modifier r45, final Ps.o.ViewState r46, final kotlin.jvm.functions.Function1<? super Ps.o.f, kotlin.Unit> r47, androidx.compose.runtime.Composer r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 1175
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Hs.o.l(Ki.M, androidx.compose.ui.Modifier, Ps.o$i, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(Function1 function1) {
        function1.invoke(o.f.d.f27138a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(Function1 function1) {
        function1.invoke(o.f.C0500f.f27140a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, Modifier modifier, o.ViewState iVar, Function1 function1, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, modifier, iVar, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }

    private static final float i(z1<Float> z1Var) {
        return z1Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(InterfaceC5868j0 interfaceC5868j0) {
        return interfaceC5868j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(InterfaceC5868j0 interfaceC5868j0, int i10) {
        interfaceC5868j0.i(i10);
    }
}
