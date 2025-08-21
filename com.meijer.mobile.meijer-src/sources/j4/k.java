package j4;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.E;
import androidx.compose.runtime.F;
import androidx.compose.runtime.J;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.view.InterfaceC6172s;
import androidx.view.h0;
import com.google.android.libraries.places.api.model.PlaceTypes;
import e.C13736d;
import j4.d;
import j4.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.AbstractC14656B;
import kotlin.C14667h;
import kotlin.C14675p;
import kotlin.C14677r;
import kotlin.C14678s;
import kotlin.C14680u;
import kotlin.C6309i;
import kotlin.C6453j;
import kotlin.Deprecated;
import kotlin.InterfaceC6302b;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.l0;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\u001aN\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aÜ\u0001\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u001f\b\u0002\u0010\u0013\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\n2\u001f\b\u0002\u0010\u0015\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\n2\u001f\b\u0002\u0010\u0016\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\n2\u001f\b\u0002\u0010\u0017\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a·\u0001\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u001f\b\u0002\u0010\u0013\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\n2\u001f\b\u0002\u0010\u0015\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\n2\u001f\b\u0002\u0010\u0016\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\n2\u001f\b\u0002\u0010\u0017\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a#\u0010 \u001a\u0004\u0018\u00010\u0012*\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b \u0010!\u001a#\u0010\"\u001a\u0004\u0018\u00010\u0014*\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\"\u0010#\u001a#\u0010$\u001a\u0004\u0018\u00010\u0012*\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b$\u0010!\u001a#\u0010%\u001a\u0004\u0018\u00010\u0014*\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b%\u0010#¨\u0006*²\u0006\u0012\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110&8\nX\u008a\u0084\u0002²\u0006\u0012\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110&8\nX\u008a\u0084\u0002²\u0006\u0012\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110&8\nX\u008a\u0084\u0002"}, d2 = {"Li4/u;", "navController", "", "startDestination", "Landroidx/compose/ui/Modifier;", "modifier", PlaceTypes.ROUTE, "Lkotlin/Function1;", "Li4/s;", "", "Lkotlin/ExtensionFunctionType;", "builder", "c", "(Li4/u;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LP0/e;", "contentAlignment", "Landroidx/compose/animation/d;", "Li4/h;", "Landroidx/compose/animation/h;", "enterTransition", "Landroidx/compose/animation/j;", "exitTransition", "popEnterTransition", "popExitTransition", "b", "(Li4/u;Ljava/lang/String;Landroidx/compose/ui/Modifier;LP0/e;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Li4/r;", "graph", "a", "(Li4/u;Li4/r;Landroidx/compose/ui/Modifier;LP0/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Li4/p;", "scope", "m", "(Li4/p;Landroidx/compose/animation/d;)Landroidx/compose/animation/h;", "n", "(Li4/p;Landroidx/compose/animation/d;)Landroidx/compose/animation/j;", "o", "p", "", "currentBackStack", "allVisibleEntries", "visibleEntries", "navigation-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class k {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C14680u f139901f;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C14680u c14680u) {
            super(0);
            this.f139901f = c14680u;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f139901f.X();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 8, 0})
    @SourceDebugExtension
    static final class b extends Lambda implements Function1<F, E> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C14680u f139902f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6172s f139903g;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"j4/k$b$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a implements E {
            @Override // androidx.compose.runtime.E
            public void dispose() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C14680u c14680u, InterfaceC6172s interfaceC6172s) {
            super(1);
            this.f139902f = c14680u;
            this.f139903g = interfaceC6172s;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke(F f10) {
            this.f139902f.n0(this.f139903g);
            return new a();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/d;", "Li4/h;", "Lb0/i;", "a", "(Landroidx/compose/animation/d;)Lb0/i;"}, k = 3, mv = {1, 8, 0})
    @SourceDebugExtension
    static final class c extends Lambda implements Function1<androidx.compose.animation.d<C14667h>, C6309i> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Map<String, Float> f139904f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ j4.e f139905g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.h> f139906h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.j> f139907i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ z1<List<C14667h>> f139908j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Map<String, Float> map, j4.e eVar, Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.h> function1, Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.j> function12, z1<? extends List<C14667h>> z1Var) {
            super(1);
            this.f139904f = map;
            this.f139905g = eVar;
            this.f139906h = function1;
            this.f139907i = function12;
            this.f139908j = z1Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6309i invoke(androidx.compose.animation.d<C14667h> dVar) {
            float fFloatValue;
            if (!k.f(this.f139908j).contains(dVar.b())) {
                return androidx.compose.animation.a.f(androidx.compose.animation.h.INSTANCE.a(), androidx.compose.animation.j.INSTANCE.a());
            }
            Float f10 = this.f139904f.get(dVar.b().getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
            if (f10 != null) {
                fFloatValue = f10.floatValue();
            } else {
                this.f139904f.put(dVar.b().getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), Float.valueOf(0.0f));
                fFloatValue = 0.0f;
            }
            if (!Intrinsics.e(dVar.a().getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), dVar.b().getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String())) {
                fFloatValue = this.f139905g.n().getValue().booleanValue() ? fFloatValue - 1.0f : fFloatValue + 1.0f;
            }
            float f11 = fFloatValue;
            this.f139904f.put(dVar.a().getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), Float.valueOf(f11));
            return new C6309i(this.f139906h.invoke(dVar), this.f139907i.invoke(dVar), f11, null, 8, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lb0/b;", "Li4/h;", "it", "", "a", "(Lb0/b;Li4/h;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0})
    @SourceDebugExtension
    static final class e extends Lambda implements Function4<InterfaceC6302b, C14667h, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L0.e f139910f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z1<List<C14667h>> f139911g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C14667h f139912f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC6302b f139913g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C14667h c14667h, InterfaceC6302b interfaceC6302b) {
                super(2);
                this.f139912f = c14667h;
                this.f139913g = interfaceC6302b;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 11) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1425390790, i10, -1, "androidx.navigation.compose.NavHost.<anonymous>.<anonymous> (NavHost.kt:306)");
                }
                C14675p destination = this.f139912f.getDestination();
                Intrinsics.h(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                ((e.b) destination).H().invoke(this.f139913g, this.f139912f, composer, 72);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(L0.e eVar, z1<? extends List<C14667h>> z1Var) {
            super(4);
            this.f139910f = eVar;
            this.f139911g = z1Var;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6302b interfaceC6302b, C14667h c14667h, Composer composer, Integer num) {
            a(interfaceC6302b, c14667h, composer, num.intValue());
            return Unit.f143329a;
        }

        public final void a(InterfaceC6302b interfaceC6302b, C14667h c14667h, Composer composer, int i10) {
            Object objPrevious;
            if (ComposerKt.M()) {
                ComposerKt.U(-1440061047, i10, -1, "androidx.navigation.compose.NavHost.<anonymous> (NavHost.kt:301)");
            }
            List listF = k.f(this.f139911g);
            ListIterator listIterator = listF.listIterator(listF.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    objPrevious = listIterator.previous();
                    if (Intrinsics.e(c14667h, (C14667h) objPrevious)) {
                        break;
                    }
                } else {
                    objPrevious = null;
                    break;
                }
            }
            C14667h c14667h2 = (C14667h) objPrevious;
            if (c14667h2 != null) {
                j4.h.a(c14667h2, this.f139910f, ComposableLambdaKt.composableLambda(composer, -1425390790, true, new a(c14667h2, interfaceC6302b)), composer, 456);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.navigation.compose.NavHostKt$NavHost$15", f = "NavHost.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f139914a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k0<C14667h> f139915b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map<String, Float> f139916c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ z1<List<C14667h>> f139917d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ j4.e f139918e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(k0<C14667h> k0Var, Map<String, Float> map, z1<? extends List<C14667h>> z1Var, j4.e eVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f139915b = k0Var;
            this.f139916c = map;
            this.f139917d = z1Var;
            this.f139918e = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.f139915b, this.f139916c, this.f139917d, this.f139918e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f139914a == 0) {
                ResultKt.b(obj);
                if (Intrinsics.e(this.f139915b.h(), this.f139915b.o())) {
                    List listF = k.f(this.f139917d);
                    j4.e eVar = this.f139918e;
                    Iterator it = listF.iterator();
                    while (it.hasNext()) {
                        eVar.o((C14667h) it.next());
                    }
                    Map<String, Float> map = this.f139916c;
                    k0<C14667h> k0Var = this.f139915b;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, Float> entry : map.entrySet()) {
                        if (!Intrinsics.e(entry.getKey(), k0Var.o().getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Map<String, Float> map2 = this.f139916c;
                    Iterator it2 = linkedHashMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        map2.remove(((Map.Entry) it2.next()).getKey());
                    }
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 8, 0})
    @SourceDebugExtension
    static final class g extends Lambda implements Function1<F, E> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z1<List<C14667h>> f139919f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ j4.e f139920g;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"j4/k$g$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a implements E {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z1 f139921a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j4.e f139922b;

            public a(z1 z1Var, j4.e eVar) {
                this.f139921a = z1Var;
                this.f139922b = eVar;
            }

            @Override // androidx.compose.runtime.E
            public void dispose() {
                Iterator it = k.f(this.f139921a).iterator();
                while (it.hasNext()) {
                    this.f139922b.o((C14667h) it.next());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(z1<? extends List<C14667h>> z1Var, j4.e eVar) {
            super(1);
            this.f139919f = z1Var;
            this.f139920g = eVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke(F f10) {
            return new a(this.f139919f, this.f139920g);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C14680u f139923f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C14677r f139924g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f139925h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ P0.e f139926i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.h> f139927j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.j> f139928k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.h> f139929l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.j> f139930m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f139931n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f139932o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(C14680u c14680u, C14677r c14677r, Modifier modifier, P0.e eVar, Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.h> function1, Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.j> function12, Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.h> function13, Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.j> function14, int i10, int i11) {
            super(2);
            this.f139923f = c14680u;
            this.f139924g = c14677r;
            this.f139925h = modifier;
            this.f139926i = eVar;
            this.f139927j = function1;
            this.f139928k = function12;
            this.f139929l = function13;
            this.f139930m = function14;
            this.f139931n = i10;
            this.f139932o = i11;
        }

        public final void a(Composer composer, int i10) throws Resources.NotFoundException {
            k.a(this.f139923f, this.f139924g, this.f139925h, this.f139926i, this.f139927j, this.f139928k, this.f139929l, this.f139930m, composer, J0.a(this.f139931n | 1), this.f139932o);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class i extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C14680u f139933f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f139934g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f139935h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f139936i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<C14678s, Unit> f139937j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f139938k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f139939l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(C14680u c14680u, String str, Modifier modifier, String str2, Function1<? super C14678s, Unit> function1, int i10, int i11) {
            super(2);
            this.f139933f = c14680u;
            this.f139934g = str;
            this.f139935h = modifier;
            this.f139936i = str2;
            this.f139937j = function1;
            this.f139938k = i10;
            this.f139939l = i11;
        }

        public final void a(Composer composer, int i10) throws Resources.NotFoundException {
            k.c(this.f139933f, this.f139934g, this.f139935h, this.f139936i, this.f139937j, composer, J0.a(this.f139938k | 1), this.f139939l);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class j extends Lambda implements Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.h> {

        /* renamed from: f, reason: collision with root package name */
        public static final j f139940f = new j();

        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.animation.h invoke(androidx.compose.animation.d<C14667h> dVar) {
            return androidx.compose.animation.f.m(C6453j.l(700, 0, null, 6, null), 0.0f, 2, null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: j4.k$k, reason: collision with other inner class name */
    static final class C2218k extends Lambda implements Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.j> {

        /* renamed from: f, reason: collision with root package name */
        public static final C2218k f139941f = new C2218k();

        C2218k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.animation.j invoke(androidx.compose.animation.d<C14667h> dVar) {
            return androidx.compose.animation.f.o(C6453j.l(700, 0, null, 6, null), 0.0f, 2, null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class l extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C14680u f139942f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f139943g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f139944h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ P0.e f139945i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f139946j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.h> f139947k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.j> f139948l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.h> f139949m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.j> f139950n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function1<C14678s, Unit> f139951o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f139952p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f139953q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(C14680u c14680u, String str, Modifier modifier, P0.e eVar, String str2, Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.h> function1, Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.j> function12, Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.h> function13, Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.j> function14, Function1<? super C14678s, Unit> function15, int i10, int i11) {
            super(2);
            this.f139942f = c14680u;
            this.f139943g = str;
            this.f139944h = modifier;
            this.f139945i = eVar;
            this.f139946j = str2;
            this.f139947k = function1;
            this.f139948l = function12;
            this.f139949m = function13;
            this.f139950n = function14;
            this.f139951o = function15;
            this.f139952p = i10;
            this.f139953q = i11;
        }

        public final void a(Composer composer, int i10) {
            k.b(this.f139942f, this.f139943g, this.f139944h, this.f139945i, this.f139946j, this.f139947k, this.f139948l, this.f139949m, this.f139950n, this.f139951o, composer, J0.a(this.f139952p | 1), this.f139953q);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class m extends Lambda implements Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.h> {

        /* renamed from: f, reason: collision with root package name */
        public static final m f139954f = new m();

        m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.animation.h invoke(androidx.compose.animation.d<C14667h> dVar) {
            return androidx.compose.animation.f.m(C6453j.l(700, 0, null, 6, null), 0.0f, 2, null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class n extends Lambda implements Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.j> {

        /* renamed from: f, reason: collision with root package name */
        public static final n f139955f = new n();

        n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.animation.j invoke(androidx.compose.animation.d<C14667h> dVar) {
            return androidx.compose.animation.f.o(C6453j.l(700, 0, null, 6, null), 0.0f, 2, null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C14680u f139956f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C14677r f139957g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f139958h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ P0.e f139959i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.h> f139960j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.j> f139961k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.h> f139962l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.j> f139963m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f139964n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f139965o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        o(C14680u c14680u, C14677r c14677r, Modifier modifier, P0.e eVar, Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.h> function1, Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.j> function12, Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.h> function13, Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.j> function14, int i10, int i11) {
            super(2);
            this.f139956f = c14680u;
            this.f139957g = c14677r;
            this.f139958h = modifier;
            this.f139959i = eVar;
            this.f139960j = function1;
            this.f139961k = function12;
            this.f139962l = function13;
            this.f139963m = function14;
            this.f139964n = i10;
            this.f139965o = i11;
        }

        public final void a(Composer composer, int i10) throws Resources.NotFoundException {
            k.a(this.f139956f, this.f139957g, this.f139958h, this.f139959i, this.f139960j, this.f139961k, this.f139962l, this.f139963m, composer, J0.a(this.f139964n | 1), this.f139965o);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class p extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C14680u f139966f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C14677r f139967g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f139968h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ P0.e f139969i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.h> f139970j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.j> f139971k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.h> f139972l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.j> f139973m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f139974n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f139975o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        p(C14680u c14680u, C14677r c14677r, Modifier modifier, P0.e eVar, Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.h> function1, Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.j> function12, Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.h> function13, Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.j> function14, int i10, int i11) {
            super(2);
            this.f139966f = c14680u;
            this.f139967g = c14677r;
            this.f139968h = modifier;
            this.f139969i = eVar;
            this.f139970j = function1;
            this.f139971k = function12;
            this.f139972l = function13;
            this.f139973m = function14;
            this.f139974n = i10;
            this.f139975o = i11;
        }

        public final void a(Composer composer, int i10) throws Resources.NotFoundException {
            k.a(this.f139966f, this.f139967g, this.f139968h, this.f139969i, this.f139970j, this.f139971k, this.f139972l, this.f139973m, composer, J0.a(this.f139974n | 1), this.f139975o);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/d;", "Li4/h;", "Landroidx/compose/animation/h;", "a", "(Landroidx/compose/animation/d;)Landroidx/compose/animation/h;"}, k = 3, mv = {1, 8, 0})
    static final class q extends Lambda implements Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.h> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ j4.e f139976f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.h> f139977g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.h> f139978h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        q(j4.e eVar, Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.h> function1, Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.h> function12) {
            super(1);
            this.f139976f = eVar;
            this.f139977g = function1;
            this.f139978h = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.animation.h invoke(androidx.compose.animation.d<C14667h> dVar) {
            C14675p destination = dVar.a().getDestination();
            Intrinsics.h(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
            e.b bVar = (e.b) destination;
            androidx.compose.animation.h hVar = null;
            if (this.f139976f.n().getValue().booleanValue()) {
                Iterator<C14675p> it = C14675p.INSTANCE.c(bVar).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    androidx.compose.animation.h hVarO = k.o(it.next(), dVar);
                    if (hVarO != null) {
                        hVar = hVarO;
                        break;
                    }
                }
                if (hVar == null) {
                    return this.f139977g.invoke(dVar);
                }
                return hVar;
            }
            Iterator<C14675p> it2 = C14675p.INSTANCE.c(bVar).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                androidx.compose.animation.h hVarM = k.m(it2.next(), dVar);
                if (hVarM != null) {
                    hVar = hVarM;
                    break;
                }
            }
            if (hVar == null) {
                return this.f139978h.invoke(dVar);
            }
            return hVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/d;", "Li4/h;", "Landroidx/compose/animation/j;", "a", "(Landroidx/compose/animation/d;)Landroidx/compose/animation/j;"}, k = 3, mv = {1, 8, 0})
    static final class r extends Lambda implements Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.j> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ j4.e f139979f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.j> f139980g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.j> f139981h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        r(j4.e eVar, Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.j> function1, Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.j> function12) {
            super(1);
            this.f139979f = eVar;
            this.f139980g = function1;
            this.f139981h = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.animation.j invoke(androidx.compose.animation.d<C14667h> dVar) {
            C14675p destination = dVar.b().getDestination();
            Intrinsics.h(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
            e.b bVar = (e.b) destination;
            androidx.compose.animation.j jVar = null;
            if (this.f139979f.n().getValue().booleanValue()) {
                Iterator<C14675p> it = C14675p.INSTANCE.c(bVar).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    androidx.compose.animation.j jVarP = k.p(it.next(), dVar);
                    if (jVarP != null) {
                        jVar = jVarP;
                        break;
                    }
                }
                if (jVar == null) {
                    return this.f139980g.invoke(dVar);
                }
                return jVar;
            }
            Iterator<C14675p> it2 = C14675p.INSTANCE.c(bVar).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                androidx.compose.animation.j jVarN = k.n(it2.next(), dVar);
                if (jVarN != null) {
                    jVar = jVarN;
                    break;
                }
            }
            if (jVar == null) {
                return this.f139981h.invoke(dVar);
            }
            return jVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Li4/h;", "c", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    @SourceDebugExtension
    static final class s extends Lambda implements Function0<List<? extends C14667h>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z1<List<C14667h>> f139982f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        s(z1<? extends List<C14667h>> z1Var) {
            super(0);
            this.f139982f = z1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final List<C14667h> invoke() {
            List listE = k.e(this.f139982f);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listE) {
                if (Intrinsics.e(((C14667h) obj).getDestination().getNavigatorName(), "composable")) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    @SuppressLint({"StateFlowValueCalledInComposition"})
    public static final void a(C14680u c14680u, C14677r c14677r, Modifier modifier, P0.e eVar, Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.h> function1, Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.j> function12, Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.h> function13, Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.j> function14, Composer composer, int i10, int i11) throws Resources.NotFoundException {
        Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.h> function15;
        int i12;
        int i13;
        Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.j> function16;
        Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.j> function17;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1818191915);
        Modifier modifier2 = (i11 & 4) != 0 ? Modifier.INSTANCE : modifier;
        P0.e eVarE = (i11 & 8) != 0 ? P0.e.INSTANCE.e() : eVar;
        Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.h> function18 = (i11 & 16) != 0 ? m.f139954f : function1;
        Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.j> function19 = (i11 & 32) != 0 ? n.f139955f : function12;
        if ((i11 & 64) != 0) {
            i12 = i10 & (-3670017);
            function15 = function18;
        } else {
            function15 = function13;
            i12 = i10;
        }
        if ((i11 & 128) != 0) {
            i13 = i12 & (-29360129);
            function16 = function19;
        } else {
            i13 = i12;
            function16 = function14;
        }
        if (ComposerKt.M()) {
            ComposerKt.U(-1818191915, i13, -1, "androidx.navigation.compose.NavHost (NavHost.kt:195)");
        }
        InterfaceC6172s interfaceC6172s = (InterfaceC6172s) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        h0 h0VarC = W2.b.f40696a.c(composerStartRestartGroup, W2.b.f40698c);
        if (h0VarC == null) {
            throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
        }
        c14680u.o0(h0VarC.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String());
        c14680u.l0(c14677r);
        AbstractC14656B abstractC14656BE = c14680u.get_navigatorProvider().e("composable");
        j4.e eVar2 = abstractC14656BE instanceof j4.e ? (j4.e) abstractC14656BE : null;
        if (eVar2 == null) {
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            T0 t0L = composerStartRestartGroup.l();
            if (t0L == null) {
                return;
            }
            t0L.a(new o(c14680u, c14677r, modifier2, eVarE, function18, function19, function15, function16, i10, i11));
            return;
        }
        Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.h> function110 = function15;
        Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.h> function111 = function18;
        Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.j> function112 = function19;
        Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.j> function113 = function16;
        C13736d.a(d(o1.b(eVar2.m(), null, composerStartRestartGroup, 8, 1)).size() > 1, new a(c14680u), composerStartRestartGroup, 0, 0);
        J.c(interfaceC6172s, new b(c14680u, interfaceC6172s), composerStartRestartGroup, 8);
        L0.e eVarA = L0.g.a(composerStartRestartGroup, 0);
        z1 z1VarB = o1.b(c14680u.J(), null, composerStartRestartGroup, 8, 1);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objB = composerStartRestartGroup.B();
        Composer.Companion companion = Composer.INSTANCE;
        if (objB == companion.a()) {
            objB = o1.e(new s(z1VarB));
            composerStartRestartGroup.t(objB);
        }
        composerStartRestartGroup.U();
        z1 z1Var = (z1) objB;
        C14667h c14667h = (C14667h) CollectionsKt.F0(f(z1Var));
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objB2 = composerStartRestartGroup.B();
        if (objB2 == companion.a()) {
            objB2 = new LinkedHashMap();
            composerStartRestartGroup.t(objB2);
        }
        composerStartRestartGroup.U();
        Map map = (Map) objB2;
        composerStartRestartGroup.startReplaceableGroup(1822177954);
        if (c14667h != null) {
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            boolean zV = composerStartRestartGroup.V(eVar2) | composerStartRestartGroup.V(function110) | composerStartRestartGroup.V(function111);
            Object objB3 = composerStartRestartGroup.B();
            if (zV || objB3 == companion.a()) {
                objB3 = new q(eVar2, function110, function111);
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.U();
            Function1 function114 = (Function1) objB3;
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            boolean zV2 = composerStartRestartGroup.V(eVar2) | composerStartRestartGroup.V(function113) | composerStartRestartGroup.V(function112);
            Modifier modifier3 = modifier2;
            Object objB4 = composerStartRestartGroup.B();
            if (zV2 || objB4 == companion.a()) {
                objB4 = new r(eVar2, function113, function112);
                composerStartRestartGroup.t(objB4);
            }
            composerStartRestartGroup.U();
            function17 = function113;
            k0 k0VarI = l0.i(c14667h, "entry", composerStartRestartGroup, 56, 0);
            i14 = 0;
            androidx.compose.animation.a.a(k0VarI, modifier3, new c(map, eVar2, function114, (Function1) objB4, z1Var), eVarE, d.f139909f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1440061047, true, new e(eVarA, z1Var)), composerStartRestartGroup, (i13 & 7168) | ((i13 >> 3) & 112) | 221184, 0);
            modifier2 = modifier3;
            J.f(k0VarI.h(), k0VarI.o(), new f(k0VarI, map, z1Var, eVar2, null), composerStartRestartGroup, 584);
            Boolean bool = Boolean.TRUE;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zV3 = composerStartRestartGroup.V(z1Var) | composerStartRestartGroup.V(eVar2);
            Object objB5 = composerStartRestartGroup.B();
            if (zV3 || objB5 == companion.a()) {
                objB5 = new g(z1Var, eVar2);
                composerStartRestartGroup.t(objB5);
            }
            composerStartRestartGroup.U();
            J.c(bool, (Function1) objB5, composerStartRestartGroup, 6);
        } else {
            function17 = function113;
            i14 = 0;
        }
        composerStartRestartGroup.U();
        AbstractC14656B abstractC14656BE2 = c14680u.get_navigatorProvider().e("dialog");
        j4.g gVar = abstractC14656BE2 instanceof j4.g ? (j4.g) abstractC14656BE2 : null;
        if (gVar == null) {
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            T0 t0L2 = composerStartRestartGroup.l();
            if (t0L2 == null) {
                return;
            }
            t0L2.a(new p(c14680u, c14677r, modifier2, eVarE, function111, function112, function110, function17, i10, i11));
            return;
        }
        Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.j> function115 = function17;
        j4.f.a(gVar, composerStartRestartGroup, i14);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        T0 t0L3 = composerStartRestartGroup.l();
        if (t0L3 == null) {
            return;
        }
        t0L3.a(new h(c14680u, c14677r, modifier2, eVarE, function111, function112, function110, function115, i10, i11));
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li4/h;", "it", "", "a", "(Li4/h;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class d extends Lambda implements Function1<C14667h, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f139909f = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C14667h c14667h) {
            return c14667h.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
        }
    }

    public static final void b(C14680u c14680u, String str, Modifier modifier, P0.e eVar, String str2, Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.h> function1, Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.j> function12, Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.h> function13, Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.j> function14, Function1<? super C14678s, Unit> function15, Composer composer, int i10, int i11) {
        Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.h> function16;
        int i12;
        Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.j> function17;
        Composer composerStartRestartGroup = composer.startRestartGroup(410432995);
        Modifier modifier2 = (i11 & 4) != 0 ? Modifier.INSTANCE : modifier;
        P0.e eVarE = (i11 & 8) != 0 ? P0.e.INSTANCE.e() : eVar;
        String str3 = (i11 & 16) != 0 ? null : str2;
        Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.h> function18 = (i11 & 32) != 0 ? j.f139940f : function1;
        Function1<? super androidx.compose.animation.d<C14667h>, ? extends androidx.compose.animation.j> function19 = (i11 & 64) != 0 ? C2218k.f139941f : function12;
        if ((i11 & 128) != 0) {
            i12 = i10 & (-29360129);
            function16 = function18;
        } else {
            function16 = function13;
            i12 = i10;
        }
        if ((i11 & 256) != 0) {
            i12 &= -234881025;
            function17 = function19;
        } else {
            function17 = function14;
        }
        if (ComposerKt.M()) {
            ComposerKt.U(410432995, i12, -1, "androidx.navigation.compose.NavHost (NavHost.kt:126)");
        }
        composerStartRestartGroup.startReplaceableGroup(1618982084);
        boolean zV = composerStartRestartGroup.V(str3) | composerStartRestartGroup.V(str) | composerStartRestartGroup.V(function15);
        Object objB = composerStartRestartGroup.B();
        if (zV || objB == Composer.INSTANCE.a()) {
            C14678s c14678s = new C14678s(c14680u.get_navigatorProvider(), str, str3);
            function15.invoke(c14678s);
            objB = c14678s.a();
            composerStartRestartGroup.t(objB);
        }
        composerStartRestartGroup.U();
        int i13 = (i12 & 896) | 72 | (i12 & 7168);
        int i14 = i12 >> 3;
        a(c14680u, (C14677r) objB, modifier2, eVarE, function18, function19, function16, function17, composerStartRestartGroup, i13 | (57344 & i14) | (458752 & i14) | (3670016 & i14) | (i14 & 29360128), 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L == null) {
            return;
        }
        t0L.a(new l(c14680u, str, modifier2, eVarE, str3, function18, function19, function16, function17, function15, i10, i11));
    }

    @Deprecated
    public static final /* synthetic */ void c(C14680u c14680u, String str, Modifier modifier, String str2, Function1 function1, Composer composer, int i10, int i11) throws Resources.NotFoundException {
        Composer composerStartRestartGroup = composer.startRestartGroup(141827520);
        Modifier modifier2 = (i11 & 4) != 0 ? Modifier.INSTANCE : modifier;
        String str3 = (i11 & 8) != 0 ? null : str2;
        if (ComposerKt.M()) {
            ComposerKt.U(141827520, i10, -1, "androidx.navigation.compose.NavHost (NavHost.kt:80)");
        }
        composerStartRestartGroup.startReplaceableGroup(1618982084);
        boolean zV = composerStartRestartGroup.V(str3) | composerStartRestartGroup.V(str) | composerStartRestartGroup.V(function1);
        Object objB = composerStartRestartGroup.B();
        if (zV || objB == Composer.INSTANCE.a()) {
            C14678s c14678s = new C14678s(c14680u.get_navigatorProvider(), str, str3);
            function1.invoke(c14678s);
            objB = c14678s.a();
            composerStartRestartGroup.t(objB);
        }
        composerStartRestartGroup.U();
        a(c14680u, (C14677r) objB, modifier2, null, null, null, null, null, composerStartRestartGroup, (i10 & 896) | 72, 248);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L == null) {
            return;
        }
        t0L.a(new i(c14680u, str, modifier2, str3, function1, i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.h m(C14675p c14675p, androidx.compose.animation.d<C14667h> dVar) {
        Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.h> function1Y;
        if (c14675p instanceof e.b) {
            Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.h> function1I = ((e.b) c14675p).I();
            if (function1I != null) {
                return function1I.invoke(dVar);
            }
            return null;
        }
        if (!(c14675p instanceof d.a) || (function1Y = ((d.a) c14675p).Y()) == null) {
            return null;
        }
        return function1Y.invoke(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.j n(C14675p c14675p, androidx.compose.animation.d<C14667h> dVar) {
        Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.j> function1Z;
        if (c14675p instanceof e.b) {
            Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.j> function1K = ((e.b) c14675p).K();
            if (function1K != null) {
                return function1K.invoke(dVar);
            }
            return null;
        }
        if (!(c14675p instanceof d.a) || (function1Z = ((d.a) c14675p).Z()) == null) {
            return null;
        }
        return function1Z.invoke(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.h o(C14675p c14675p, androidx.compose.animation.d<C14667h> dVar) {
        Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.h> function1A0;
        if (c14675p instanceof e.b) {
            Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.h> function1L = ((e.b) c14675p).L();
            if (function1L != null) {
                return function1L.invoke(dVar);
            }
            return null;
        }
        if (!(c14675p instanceof d.a) || (function1A0 = ((d.a) c14675p).a0()) == null) {
            return null;
        }
        return function1A0.invoke(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.j p(C14675p c14675p, androidx.compose.animation.d<C14667h> dVar) {
        Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.j> function1B0;
        if (c14675p instanceof e.b) {
            Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.j> function1M = ((e.b) c14675p).M();
            if (function1M != null) {
                return function1M.invoke(dVar);
            }
            return null;
        }
        if (!(c14675p instanceof d.a) || (function1B0 = ((d.a) c14675p).b0()) == null) {
            return null;
        }
        return function1B0.invoke(dVar);
    }

    private static final List<C14667h> d(z1<? extends List<C14667h>> z1Var) {
        return z1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<C14667h> e(z1<? extends List<C14667h>> z1Var) {
        return z1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<C14667h> f(z1<? extends List<C14667h>> z1Var) {
        return z1Var.getValue();
    }
}
