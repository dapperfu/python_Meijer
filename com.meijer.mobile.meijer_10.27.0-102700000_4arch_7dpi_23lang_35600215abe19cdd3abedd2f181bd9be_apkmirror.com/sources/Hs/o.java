package Hs;

import Hs.o;
import Ji.LocalThemeScope;
import Js.WeeklyAdItem;
import Ps.o;
import android.content.Context;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5726j0;
import androidx.compose.runtime.J;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b5.C6197c;
import j0.InterfaceC14794C;
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
import l0.C15339A;
import l0.C15340B;
import l0.C15342b;
import l0.InterfaceC15343c;
import l0.w;
import l5.C15372h;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001aG\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\r\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0013²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "LPs/o$i;", "viewState", "Lkotlin/Function1;", "LPs/o$f;", "", "onAction", "Lkotlin/Function0;", "changeDrawerState", "g", "(LJi/M;Landroidx/compose/ui/Modifier;LPs/o$i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "l", "(LJi/M;Landroidx/compose/ui/Modifier;LPs/o$i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "rotationState", "", "currentItemListIndex", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class o {

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class a extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final a f13233f = new a();

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
        final /* synthetic */ Function1 f13234f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f13235g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, List list) {
            super(1);
            this.f13234f = function1;
            this.f13235g = list;
        }

        public final Object a(int i10) {
            return this.f13234f.invoke(this.f13235g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class c extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f13236f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f13237g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f13238h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list, LocalThemeScope localThemeScope, Function1 function1) {
            super(4);
            this.f13236f = list;
            this.f13237g = localThemeScope;
            this.f13238h = function1;
        }

        public final void a(InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15343c) ? 4 : 2) | i11;
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
            Pair pair = (Pair) this.f13236f.get(i10);
            composer.startReplaceGroup(-1815268655);
            h.b(this.f13237g, null, this.f13238h, (String) pair.a(), (List) pair.b(), composer, LocalThemeScope.f15770g, 1);
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15343c, num.intValue(), composer, num2.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function3<C15339A, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o.ViewState f13239a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5726j0 f13240b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.weeklyad.compose.weeklyAdHybrid.WeeklyAdViewScreenKt$WeeklyAdViewPager$1$1$1$2$1", f = "WeeklyAdViewScreen.kt", l = {190}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f13241a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C15339A f13242b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ o.ViewState f13243c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C15339A c15339a, o.ViewState iVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f13242b = c15339a;
                this.f13243c = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f13242b, this.f13243c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f13241a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C15339A c15339a = this.f13242b;
                    int iF = this.f13243c.getCurrentPage();
                    this.f13241a = 1;
                    if (C15339A.J(c15339a, iF, 0, this, 2, null) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
        public static final class b extends Lambda implements Function1 {

            /* renamed from: f, reason: collision with root package name */
            public static final b f13244f = new b();

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
            final /* synthetic */ Function1 f13245f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List f13246g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Function1 function1, List list) {
                super(1);
                this.f13245f = function1;
                this.f13246g = list;
            }

            public final Object a(int i10) {
                return this.f13245f.invoke(this.f13246g.get(i10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
        @SourceDebugExtension
        /* renamed from: Hs.o$d$d, reason: collision with other inner class name */
        public static final class C0211d extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f13247f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0211d(List list) {
                super(4);
                this.f13247f = list;
            }

            public final void a(InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = i11 | (composer.V(interfaceC15343c) ? 4 : 2);
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
                String str = (String) this.f13247f.get(i10);
                composer.startReplaceGroup(-1668320172);
                C6197c.e(new C15372h.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())).f(str).e(true).c(), null, Z4.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())), interfaceC15343c.e(Modifier.INSTANCE, 1.0f), null, null, null, InterfaceC5784k.INSTANCE.e(), 0.0f, null, 0, false, null, composer, 12582960, 0, 8048);
                composer.P();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Integer num, Composer composer, Integer num2) {
                a(interfaceC15343c, num.intValue(), composer, num2.intValue());
                return Unit.f142422a;
            }
        }

        d(o.ViewState iVar, InterfaceC5726j0 interfaceC5726j0) {
            this.f13239a = iVar;
            this.f13240b = interfaceC5726j0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(o.ViewState iVar, w LazyRow) {
            Intrinsics.j(LazyRow, "$this$LazyRow");
            List<String> listK = iVar.k();
            LazyRow.i(listK.size(), null, new c(b.f13244f, listK), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new C0211d(listK)));
            return Unit.f142422a;
        }

        public final void b(C15339A listState, Composer composer, int i10) {
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
            o.n(this.f13240b, Br.h.b(listState, composer, i12));
            float f10 = 8;
            InterfaceC14794C interfaceC14794CB = D.b(H1.h.p(16), H1.h.p(f10));
            C5658d.f fVarO = C5658d.f48555a.o(H1.h.p(f10));
            Cu.e eVarB = Cu.a.b(C15340B.b(0, 0, composer, 0, 3), null, null, null, null, composer, 0, 30);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f13239a);
            final o.ViewState iVar = this.f13239a;
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
            C15342b.c(null, listState, interfaceC14794CB, false, fVarO, null, eVarB, false, null, (Function1) objB, composer, ((i11 << 3) & 112) | 24960, 425);
            Integer numValueOf = Integer.valueOf(this.f13239a.getCurrentPage());
            composer.startReplaceGroup(-1633490746);
            boolean zV2 = composer.V(this.f13239a) | (i12 == 4);
            o.ViewState iVar2 = this.f13239a;
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
        public /* bridge */ /* synthetic */ Unit invoke(C15339A c15339a, Composer composer, Integer num) {
            b(c15339a, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.compose.weeklyAdHybrid.WeeklyAdViewScreenKt$WeeklyAdViewPager$2$1", f = "WeeklyAdViewScreen.kt", l = {}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f13248a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<o.f, Unit> f13249b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5726j0 f13250c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function1<? super o.f, Unit> function1, InterfaceC5726j0 interfaceC5726j0, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f13249b = function1;
            this.f13250c = interfaceC5726j0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(this.f13249b, this.f13250c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f13248a == 0) {
                ResultKt.b(obj);
                this.f13249b.invoke(new o.f.PagerSwipe(o.m(this.f13250c)));
                return Unit.f142422a;
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
    public static final void g(final Ji.LocalThemeScope r42, androidx.compose.ui.Modifier r43, Ps.o.ViewState r44, final kotlin.jvm.functions.Function1<? super Ps.o.f, kotlin.Unit> r45, final kotlin.jvm.functions.Function0<kotlin.Unit> r46, androidx.compose.runtime.Composer r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Hs.o.g(Ji.M, androidx.compose.ui.Modifier, Ps.o$i, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(o.ViewState iVar, LocalThemeScope localThemeScope, Function1 function1, w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        if (iVar.q().isEmpty()) {
            w.g(LazyColumn, null, null, Hs.a.f13185a.a(), 3, null);
        } else {
            List<Pair<String, List<WeeklyAdItem>>> listQ = iVar.q();
            LazyColumn.i(listQ.size(), null, new b(a.f13233f, listQ), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new c(listQ, localThemeScope, function1)));
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, Modifier modifier, o.ViewState iVar, Function1 function1, Function0 function0, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, modifier, iVar, function1, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    public static final void l(final Ji.LocalThemeScope r44, androidx.compose.ui.Modifier r45, final Ps.o.ViewState r46, final kotlin.jvm.functions.Function1<? super Ps.o.f, kotlin.Unit> r47, androidx.compose.runtime.Composer r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 1175
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Hs.o.l(Ji.M, androidx.compose.ui.Modifier, Ps.o$i, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(Function1 function1) {
        function1.invoke(o.f.d.f29256a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(Function1 function1) {
        function1.invoke(o.f.C0680f.f29258a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, Modifier modifier, o.ViewState iVar, Function1 function1, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, modifier, iVar, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Function0 function0) {
        function0.invoke();
        return Unit.f142422a;
    }

    private static final float i(z1<Float> z1Var) {
        return z1Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(InterfaceC5726j0 interfaceC5726j0) {
        return interfaceC5726j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(InterfaceC5726j0 interfaceC5726j0, int i10) {
        interfaceC5726j0.j(i10);
    }
}
