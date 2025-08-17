package zi;

import Ji.C;
import Ji.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.recyclerview.widget.RecyclerView;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d0.C13439f;
import j0.C14801J;
import j0.C14802K;
import j0.InterfaceC14800I;
import java.util.Arrays;
import ji.InterfaceC14918V;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pi.C16307b;
import pi.C16309d;
import r0.C16692i;
import zi.S0;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a)\u0010\u0005\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\u000b\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\r\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\tH\u0001¢\u0006\u0004\b\r\u0010\f\u001a9\u0010\u000e\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\tH\u0001¢\u0006\u0004\b\u000e\u0010\f\u001a9\u0010\u000f\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\tH\u0001¢\u0006\u0004\b\u000f\u0010\f\u001a9\u0010\u0010\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\tH\u0001¢\u0006\u0004\b\u0010\u0010\f\u001a9\u0010\u0011\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\tH\u0001¢\u0006\u0004\b\u0011\u0010\f\u001a9\u0010\u0012\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\tH\u0001¢\u0006\u0004\b\u0012\u0010\f\u001a9\u0010\u0013\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\tH\u0001¢\u0006\u0004\b\u0013\u0010\f\u001a9\u0010\u0014\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\tH\u0001¢\u0006\u0004\b\u0014\u0010\f\u001a\u001d\u0010\u0015\u001a\u00020\u0002*\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\"²\u0006\f\u0010\u0018\u001a\u00020\u00178\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001b\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001f\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010 \u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010!\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"Lzi/g1;", "", "", "Landroidx/compose/ui/Modifier;", "modifier", "v", "(Lzi/g1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LJi/M;", "value", "Lkotlin/Function1;", "onValueChange", "P", "(LJi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "J", "B", "H", "D", "N", "L", "F", "z", "R", "(LJi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "isFocused", "emptyInput", "placeHolder", "disabled", "standardInput", "errorInput", "warningInput", "successInput", "informationInput", "everythingInput", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class S0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC18489g1<String, Unit> f172368a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172369b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0.l f172370c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.z1<Boolean> f172371d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: zi.S0$a$a, reason: collision with other inner class name */
        public static final class C2774a implements Function1<ri.p, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final C2774a f172372a = new C2774a();

            public final void a(ri.p pVar) {
                Intrinsics.j(pVar, "<this>");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ri.p pVar) {
                a(pVar);
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LIi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LIi/h;", "s", "()LIi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class b extends Ii.c<Integer, ri.p, ri.p> {

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            private final androidx.compose.runtime.z1<Function1<ri.p, Unit>> latestContent;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            private final androidx.compose.runtime.z1<ri.p> state;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            private final ri.p initialScope;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: zi.S0$a$b$a, reason: collision with other inner class name */
            public static final class C2775a implements Function0<ri.p> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Ii.h f172376a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ b f172377b;

                public C2775a(Ii.h hVar, b bVar) {
                    this.f172376a = hVar;
                    this.f172377b = bVar;
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [Ii.h, java.lang.Object, ri.p] */
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ri.p invoke() {
                    ?? r02 = this.f172376a;
                    this.f172377b.t().getValue().invoke(r02);
                    return r02;
                }
            }

            @Override // Ii.c
            public androidx.compose.runtime.z1<ri.p> r() {
                return this.state;
            }

            @Override // Ii.i
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public ri.p getInitialScope() {
                return this.initialScope;
            }

            public androidx.compose.runtime.z1<Function1<ri.p, Unit>> t() {
                return this.latestContent;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public b(Function1 function1, Composer composer, int i10, Object[] objArr, Ii.h hVar) {
                this.latestContent = androidx.compose.runtime.o1.p(function1, composer, (i10 >> 6) & 14);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(objArr);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = androidx.compose.runtime.o1.e(new C2775a(hVar, this));
                    composer.t(objB);
                }
                composer.P();
                this.state = (androidx.compose.runtime.z1) objB;
                this.initialScope = hVar;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class c implements Function1<ri.p, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final c f172378a = new c();

            public final void a(ri.p pVar) {
                Intrinsics.j(pVar, "<this>");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ri.p pVar) {
                a(pVar);
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LIi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LIi/h;", "s", "()LIi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class d extends Ii.c<Integer, ri.p, ri.p> {

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            private final androidx.compose.runtime.z1<Function1<ri.p, Unit>> latestContent;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            private final androidx.compose.runtime.z1<ri.p> state;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            private final ri.p initialScope;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: zi.S0$a$d$a, reason: collision with other inner class name */
            public static final class C2776a implements Function0<ri.p> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Ii.h f172382a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ d f172383b;

                public C2776a(Ii.h hVar, d dVar) {
                    this.f172382a = hVar;
                    this.f172383b = dVar;
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [Ii.h, java.lang.Object, ri.p] */
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ri.p invoke() {
                    ?? r02 = this.f172382a;
                    this.f172383b.t().getValue().invoke(r02);
                    return r02;
                }
            }

            @Override // Ii.c
            public androidx.compose.runtime.z1<ri.p> r() {
                return this.state;
            }

            @Override // Ii.i
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public ri.p getInitialScope() {
                return this.initialScope;
            }

            public androidx.compose.runtime.z1<Function1<ri.p, Unit>> t() {
                return this.latestContent;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public d(Function1 function1, Composer composer, int i10, Object[] objArr, Ii.h hVar) {
                this.latestContent = androidx.compose.runtime.o1.p(function1, composer, (i10 >> 6) & 14);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(objArr);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = androidx.compose.runtime.o1.e(new C2776a(hVar, this));
                    composer.t(objB);
                }
                composer.P();
                this.state = (androidx.compose.runtime.z1) objB;
                this.initialScope = hVar;
            }
        }

        a(InterfaceC18489g1<String, Unit> interfaceC18489g1, LocalThemeScope localThemeScope, h0.l lVar, androidx.compose.runtime.z1<Boolean> z1Var) {
            this.f172368a = interfaceC18489g1;
            this.f172369b = localThemeScope;
            this.f172370c = lVar;
            this.f172371d = z1Var;
        }

        public final void a(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer, int i10) {
            int i11;
            ri.p pVarG;
            ri.p pVarG2;
            Composer composer2 = composer;
            Intrinsics.j(innerTextField, "innerTextField");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer2.D(innerTextField) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer2.j()) {
                composer2.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(777622844, i11, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.AdsTextAreaField.<anonymous>.<anonymous> (AdsTextAreaField.kt:61)");
            }
            Modifier modifier = this.f172368a.getTemplate().getModifier();
            V0.D1 shape = this.f172368a.getTemplate().getShape();
            if (shape == null) {
                shape = C16692i.c(this.f172369b.getAdsCornerRadii().getRadius04().getDp());
            }
            Modifier modifierI = androidx.compose.foundation.layout.D.i(C13439f.g(modifier, H1.h.p(S0.w(this.f172371d) ? 2 : 1), this.f172368a.getTemplate().getColors().e(this.f172368a.getTemplate().getState(), this.f172370c, composer2, 48).getValue().getValue(), shape), this.f172369b.getAdsSpacing().getFive().getDp());
            C5658d c5658d = C5658d.f48555a;
            C5658d.f fVarE = c5658d.e();
            e.Companion companion = P0.e.INSTANCE;
            e.c cVarI = companion.i();
            InterfaceC18489g1<String, Unit> interfaceC18489g1 = this.f172368a;
            LocalThemeScope localThemeScope = this.f172369b;
            androidx.compose.runtime.z1<Boolean> z1Var = this.f172371d;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(fVarE, cVarI, composer2, 54);
            int iA = C5717f.a(composer2, 0);
            InterfaceC5742s interfaceC5742sR = composer2.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer2, modifierI);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composer2.k() == null) {
                C5717f.c();
            }
            composer2.F();
            if (composer2.getInserting()) {
                composer2.I(function0A);
            } else {
                composer2.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composer2);
            androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14801J c14801j = C14801J.f139030a;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierD = androidx.compose.foundation.layout.J.d(InterfaceC14800I.b(c14801j, companion3, 1.0f, false, 2, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion.l(), composer2, 0);
            int iA2 = C5717f.a(composer2, 0);
            InterfaceC5742s interfaceC5742sR2 = composer2.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer2, modifierD);
            Function0<InterfaceC5811g> function0A2 = companion2.a();
            if (composer2.k() == null) {
                C5717f.c();
            }
            composer2.F();
            if (composer2.getInserting()) {
                composer2.I(function0A2);
            } else {
                composer2.s();
            }
            Composer composerA2 = androidx.compose.runtime.D1.a(composer2);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyB2, companion2.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5742sR2, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion2.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            androidx.compose.runtime.D1.c(composerA2, modifierE2, companion2.f());
            if (interfaceC18489g1.getLeadingIcon() != null) {
                composer2.startReplaceGroup(1004121228);
                MeasurePolicy measurePolicyB3 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion.l(), composer2, 0);
                int iA3 = C5717f.a(composer2, 0);
                InterfaceC5742s interfaceC5742sR3 = composer2.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer2, companion3);
                Function0<InterfaceC5811g> function0A3 = companion2.a();
                if (composer2.k() == null) {
                    C5717f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A3);
                } else {
                    composer2.s();
                }
                Composer composerA3 = androidx.compose.runtime.D1.a(composer2);
                androidx.compose.runtime.D1.c(composerA3, measurePolicyB3, companion2.e());
                androidx.compose.runtime.D1.c(composerA3, interfaceC5742sR3, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion2.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                androidx.compose.runtime.D1.c(composerA3, modifierE3, companion2.f());
                C14802K.a(androidx.compose.foundation.layout.J.z(companion3, localThemeScope.getAdsSpacing().getThree().getDp()), composer2, 0);
                Function0<Unit> function0V0 = interfaceC18489g1.v0();
                C16309d c16309dW = interfaceC18489g1.getLeadingIcon();
                Intrinsics.g(c16309dW);
                s1.b(localThemeScope, function0V0, c16309dW, H1.h.p(20), composer, 3072, 0);
                composer2 = composer;
                composer2.startReplaceGroup(280784293);
                if (!S0.w(z1Var) && interfaceC18489g1.getValue().length() == 0 && (pVarG2 = interfaceC18489g1.getPlaceHolder()) != null) {
                    composer2.startReplaceGroup(327606171);
                    Object[] objArr = {pVarG2};
                    composer2.startReplaceGroup(-2104237158);
                    composer2.startReplaceGroup(1849434622);
                    Object objB = composer2.B();
                    if (objB == Composer.INSTANCE.a()) {
                        objB = c.f172378a;
                        composer2.t(objB);
                    }
                    composer2.P();
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, 1);
                    composer2.startReplaceGroup(1252494947);
                    d dVar = new d((Function1) objB, composer2, 0, objArrCopyOf, pVarG2);
                    composer2.P();
                    dVar.k(0, companion3).invoke(composer2, 0);
                    composer2.P();
                    composer2.P();
                    Unit unit = Unit.f142422a;
                }
                composer2.P();
                innerTextField.invoke(composer2, Integer.valueOf(i11 & 14));
                composer2.v();
                composer2.P();
            } else {
                composer2.startReplaceGroup(1004704555);
                composer2.startReplaceGroup(-1353062754);
                if (!S0.w(z1Var) && interfaceC18489g1.getValue().length() == 0 && (pVarG = interfaceC18489g1.getPlaceHolder()) != null) {
                    composer2.startReplaceGroup(327606171);
                    Object[] objArr2 = {pVarG};
                    composer2.startReplaceGroup(-2104237158);
                    composer2.startReplaceGroup(1849434622);
                    Object objB2 = composer2.B();
                    if (objB2 == Composer.INSTANCE.a()) {
                        objB2 = C2774a.f172372a;
                        composer2.t(objB2);
                    }
                    composer2.P();
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, 1);
                    composer2.startReplaceGroup(1252494947);
                    b bVar = new b((Function1) objB2, composer2, 0, objArrCopyOf2, pVarG);
                    composer2.P();
                    bVar.k(0, companion3).invoke(composer2, 0);
                    composer2.P();
                    composer2.P();
                    Unit unit2 = Unit.f142422a;
                }
                composer2.P();
                innerTextField.invoke(composer2, Integer.valueOf(i11 & 14));
                composer2.P();
            }
            composer2.v();
            composer2.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            a(function2, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<InterfaceC14918V, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f172384a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172385b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f172386c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f172387d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f172388a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14918V f172389b;

            a(LocalThemeScope localThemeScope, InterfaceC14918V interfaceC14918V) {
                this.f172388a = localThemeScope;
                this.f172389b = interfaceC14918V;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1315191380, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextAreaWithAllFeaturesEnabled.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsTextAreaField.kt:349)");
                }
                LocalThemeScope localThemeScope = this.f172388a;
                InterfaceC14918V interfaceC14918V = this.f172389b;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                C14801J c14801j = C14801J.f139030a;
                C16307b.b(localThemeScope, interfaceC14918V.getIcons().getInfoBlockIcon(), C.i.h.f15557d, "Information", composer, 3456, 0);
                ri.j.h(localThemeScope, interfaceC14918V.getLabels().getInfoBlockMessage(), "Text input with info uses gray border with a light blue info block.", null, composer, 384, 4);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(Modifier modifier, LocalThemeScope localThemeScope, String str, Function1<? super String, Unit> function1) {
            this.f172384a = modifier;
            this.f172385b = localThemeScope;
            this.f172386c = str;
            this.f172387d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC14918V interfaceC14918V, LocalThemeScope localThemeScope, G1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC14918V.getLabels().getLabel(), "Label");
            AdsInputField.e(interfaceC14918V.getLabels().getDescription(), "This is a description");
            G1.K(AdsInputField, interfaceC14918V.getLabels().getDescription(), null, 2, null);
            AdsInputField.i(interfaceC14918V.getLabels().getPlaceholder(), "Placeholder");
            AdsInputField.f(interfaceC14918V.getInfoBlocks().getInformationBlock(), ComposableLambdaKt.composableLambdaInstance(-1315191380, true, new a(localThemeScope, interfaceC14918V)));
            return Unit.f142422a;
        }

        public final void b(final InterfaceC14918V Assemble, Composer composer, int i10) {
            int i11;
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i11 = i10 | ((i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1210972963, i11, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextAreaWithAllFeaturesEnabled.<anonymous> (AdsTextAreaField.kt:335)");
            }
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.b.d(this.f172384a, this.f172385b.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null), this.f172385b.getAdsSpacing().getFive().getDp());
            q1.f.TextArea textArea = Assemble.getInputFields().getDefault();
            int i12 = i11;
            LocalThemeScope localThemeScope = this.f172385b;
            String str = this.f172386c;
            Integer numValueOf = Integer.valueOf(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES);
            Function1<String, Unit> function1 = this.f172387d;
            composer.startReplaceGroup(-1633490746);
            boolean zD = ((i12 & 14) == 4 || ((i12 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f172385b);
            final LocalThemeScope localThemeScope2 = this.f172385b;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: zi.T0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return S0.b.c(Assemble, localThemeScope2, (G1) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C18504m0.g(localThemeScope, str, modifierI, numValueOf, textArea, function1, (Function1) objB, composer, 3072, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14918V interfaceC14918V, Composer composer, Integer num) {
            b(interfaceC14918V, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function3<InterfaceC14918V, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172390a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f172391b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f172392c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f172393d;

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1) {
            this.f172390a = localThemeScope;
            this.f172391b = str;
            this.f172392c = modifier;
            this.f172393d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC14918V interfaceC14918V, G1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC14918V.getLabels().getLabel(), "Disabled");
            G1.K(AdsInputField, interfaceC14918V.getLabels().getDescription(), null, 2, null);
            return Unit.f142422a;
        }

        public final void b(final InterfaceC14918V Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(409674807, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextAreaWithCharLimitDisabled.<anonymous> (AdsTextAreaField.kt:158)");
            }
            q1.f.TextArea disabled = Assemble.getInputFields().getDisabled();
            LocalThemeScope localThemeScope = this.f172390a;
            String str = this.f172391b;
            Modifier modifier = this.f172392c;
            Integer numValueOf = Integer.valueOf(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES);
            Function1<String, Unit> function1 = this.f172393d;
            composer.startReplaceGroup(5004770);
            boolean z10 = (i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(Assemble));
            Object objB = composer.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: zi.U0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return S0.c.c(Assemble, (G1) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C18504m0.g(localThemeScope, str, modifier, numValueOf, disabled, function1, (Function1) objB, composer, 3072, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14918V interfaceC14918V, Composer composer, Integer num) {
            b(interfaceC14918V, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function3<InterfaceC14918V, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172394a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f172395b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f172396c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f172397d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f172398a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14918V f172399b;

            a(LocalThemeScope localThemeScope, InterfaceC14918V interfaceC14918V) {
                this.f172398a = localThemeScope;
                this.f172399b = interfaceC14918V;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1736252913, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextAreaWithCharLimitErrorBlock.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsTextAreaField.kt:212)");
                }
                LocalThemeScope localThemeScope = this.f172398a;
                InterfaceC14918V interfaceC14918V = this.f172399b;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                C14801J c14801j = C14801J.f139030a;
                C16307b.b(localThemeScope, interfaceC14918V.getIcons().getInfoBlockIcon(), C.i.e.f15552d, "Validation Error", composer, 3456, 0);
                ri.j.h(localThemeScope, interfaceC14918V.getLabels().getInfoBlockMessage(), "Text input with error uses red border with a red info block.", null, composer, 384, 4);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1) {
            this.f172394a = localThemeScope;
            this.f172395b = str;
            this.f172396c = modifier;
            this.f172397d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC14918V interfaceC14918V, LocalThemeScope localThemeScope, G1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC14918V.getLabels().getLabel(), "Error");
            AdsInputField.f(interfaceC14918V.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(1736252913, true, new a(localThemeScope, interfaceC14918V)));
            G1.K(AdsInputField, interfaceC14918V.getLabels().getDescription(), null, 2, null);
            return Unit.f142422a;
        }

        public final void b(final InterfaceC14918V Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(672056544, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextAreaWithCharLimitErrorBlock.<anonymous> (AdsTextAreaField.kt:203)");
            }
            q1.f.TextArea error = Assemble.getInputFields().getError();
            LocalThemeScope localThemeScope = this.f172394a;
            String str = this.f172395b;
            Modifier modifier = this.f172396c;
            Integer numValueOf = Integer.valueOf(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES);
            Function1<String, Unit> function1 = this.f172397d;
            composer.startReplaceGroup(-1633490746);
            boolean zD = ((i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f172394a);
            final LocalThemeScope localThemeScope2 = this.f172394a;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: zi.V0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return S0.d.c(Assemble, localThemeScope2, (G1) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C18504m0.g(localThemeScope, str, modifier, numValueOf, error, function1, (Function1) objB, composer, 3072, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14918V interfaceC14918V, Composer composer, Integer num) {
            b(interfaceC14918V, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function3<InterfaceC14918V, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172400a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f172401b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f172402c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f172403d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f172404a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14918V f172405b;

            a(LocalThemeScope localThemeScope, InterfaceC14918V interfaceC14918V) {
                this.f172404a = localThemeScope;
                this.f172405b = interfaceC14918V;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1340306627, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextAreaWithCharLimitInfoBlock.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsTextAreaField.kt:311)");
                }
                LocalThemeScope localThemeScope = this.f172404a;
                InterfaceC14918V interfaceC14918V = this.f172405b;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                C14801J c14801j = C14801J.f139030a;
                C16307b.b(localThemeScope, interfaceC14918V.getIcons().getInfoBlockIcon(), C.i.h.f15557d, "Information", composer, 3456, 0);
                ri.j.h(localThemeScope, interfaceC14918V.getLabels().getInfoBlockMessage(), "Text input with info uses gray border with a light blue info block.", null, composer, 384, 4);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        e(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1) {
            this.f172400a = localThemeScope;
            this.f172401b = str;
            this.f172402c = modifier;
            this.f172403d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC14918V interfaceC14918V, LocalThemeScope localThemeScope, G1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC14918V.getLabels().getLabel(), "Label");
            AdsInputField.f(interfaceC14918V.getInfoBlocks().getInformationBlock(), ComposableLambdaKt.composableLambdaInstance(1340306627, true, new a(localThemeScope, interfaceC14918V)));
            G1.K(AdsInputField, interfaceC14918V.getLabels().getDescription(), null, 2, null);
            return Unit.f142422a;
        }

        public final void b(final InterfaceC14918V Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1444525044, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextAreaWithCharLimitInfoBlock.<anonymous> (AdsTextAreaField.kt:302)");
            }
            q1.f.TextArea textArea = Assemble.getInputFields().getDefault();
            LocalThemeScope localThemeScope = this.f172400a;
            String str = this.f172401b;
            Modifier modifier = this.f172402c;
            Integer numValueOf = Integer.valueOf(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES);
            Function1<String, Unit> function1 = this.f172403d;
            composer.startReplaceGroup(-1633490746);
            boolean zD = ((i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f172400a);
            final LocalThemeScope localThemeScope2 = this.f172400a;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: zi.W0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return S0.e.c(Assemble, localThemeScope2, (G1) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C18504m0.g(localThemeScope, str, modifier, numValueOf, textArea, function1, (Function1) objB, composer, 3072, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14918V interfaceC14918V, Composer composer, Integer num) {
            b(interfaceC14918V, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class f implements Function3<InterfaceC14918V, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172406a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f172407b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f172408c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f172409d;

        /* JADX WARN: Multi-variable type inference failed */
        f(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1) {
            this.f172406a = localThemeScope;
            this.f172407b = str;
            this.f172408c = modifier;
            this.f172409d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC14918V interfaceC14918V, G1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            G1.b0(AdsInputField, interfaceC14918V.getIcons().getLabelIcon(), C.i.h.f15557d, "More Info", null, 8, null);
            AdsInputField.d(interfaceC14918V.getLabels().getLabel(), "Label");
            G1.K(AdsInputField, interfaceC14918V.getLabels().getDescription(), null, 2, null);
            return Unit.f142422a;
        }

        public final void b(final InterfaceC14918V Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2142637054, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextAreaWithCharLimitLabelIcon.<anonymous> (AdsTextAreaField.kt:178)");
            }
            q1.f.TextArea textArea = Assemble.getInputFields().getDefault();
            LocalThemeScope localThemeScope = this.f172406a;
            String str = this.f172407b;
            Modifier modifier = this.f172408c;
            Integer numValueOf = Integer.valueOf(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES);
            Function1<String, Unit> function1 = this.f172409d;
            composer.startReplaceGroup(5004770);
            boolean z10 = (i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(Assemble));
            Object objB = composer.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: zi.X0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return S0.f.c(Assemble, (G1) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C18504m0.g(localThemeScope, str, modifier, numValueOf, textArea, function1, (Function1) objB, composer, 3072, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14918V interfaceC14918V, Composer composer, Integer num) {
            b(interfaceC14918V, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class g implements Function3<InterfaceC14918V, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172410a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f172411b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f172412c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f172413d;

        /* JADX WARN: Multi-variable type inference failed */
        g(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1) {
            this.f172410a = localThemeScope;
            this.f172411b = str;
            this.f172412c = modifier;
            this.f172413d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC14918V interfaceC14918V, G1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.i(interfaceC14918V.getLabels().getPlaceholder(), "Placeholder");
            G1.K(AdsInputField, interfaceC14918V.getLabels().getDescription(), null, 2, null);
            return Unit.f142422a;
        }

        public final void b(final InterfaceC14918V Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2121087064, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextAreaWithCharLimitPlaceholder.<anonymous> (AdsTextAreaField.kt:138)");
            }
            q1.f.TextArea textArea = Assemble.getInputFields().getDefault();
            LocalThemeScope localThemeScope = this.f172410a;
            String str = this.f172411b;
            Modifier modifier = this.f172412c;
            Integer numValueOf = Integer.valueOf(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES);
            Function1<String, Unit> function1 = this.f172413d;
            composer.startReplaceGroup(5004770);
            boolean z10 = (i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(Assemble));
            Object objB = composer.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: zi.Y0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return S0.g.c(Assemble, (G1) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C18504m0.g(localThemeScope, str, modifier, numValueOf, textArea, function1, (Function1) objB, composer, 3072, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14918V interfaceC14918V, Composer composer, Integer num) {
            b(interfaceC14918V, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class h implements Function3<InterfaceC14918V, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172414a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f172415b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f172416c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f172417d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f172418a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14918V f172419b;

            a(LocalThemeScope localThemeScope, InterfaceC14918V interfaceC14918V) {
                this.f172418a = localThemeScope;
                this.f172419b = interfaceC14918V;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-40708522, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextAreaWithCharLimitSuccessBlock.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsTextAreaField.kt:278)");
                }
                LocalThemeScope localThemeScope = this.f172418a;
                InterfaceC14918V interfaceC14918V = this.f172419b;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                C14801J c14801j = C14801J.f139030a;
                C16307b.b(localThemeScope, interfaceC14918V.getIcons().getInfoBlockIcon(), C.i.b.f15549d, "Success", composer, 3456, 0);
                ri.j.h(localThemeScope, interfaceC14918V.getLabels().getInfoBlockMessage(), "Text input with success uses green border with a green info block.", null, composer, 384, 4);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        h(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1) {
            this.f172414a = localThemeScope;
            this.f172415b = str;
            this.f172416c = modifier;
            this.f172417d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC14918V interfaceC14918V, LocalThemeScope localThemeScope, G1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC14918V.getLabels().getLabel(), "Success");
            AdsInputField.f(interfaceC14918V.getInfoBlocks().getSuccessBlock(), ComposableLambdaKt.composableLambdaInstance(-40708522, true, new a(localThemeScope, interfaceC14918V)));
            G1.K(AdsInputField, interfaceC14918V.getLabels().getDescription(), null, 2, null);
            return Unit.f142422a;
        }

        public final void b(final InterfaceC14918V Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-531202683, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextAreaWithCharLimitSuccessBlock.<anonymous> (AdsTextAreaField.kt:269)");
            }
            q1.f.TextArea success = Assemble.getInputFields().getSuccess();
            LocalThemeScope localThemeScope = this.f172414a;
            String str = this.f172415b;
            Modifier modifier = this.f172416c;
            Integer numValueOf = Integer.valueOf(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES);
            Function1<String, Unit> function1 = this.f172417d;
            composer.startReplaceGroup(-1633490746);
            boolean zD = ((i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f172414a);
            final LocalThemeScope localThemeScope2 = this.f172414a;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: zi.Z0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return S0.h.c(Assemble, localThemeScope2, (G1) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C18504m0.g(localThemeScope, str, modifier, numValueOf, success, function1, (Function1) objB, composer, 3072, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14918V interfaceC14918V, Composer composer, Integer num) {
            b(interfaceC14918V, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class i implements Function3<InterfaceC14918V, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172420a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f172421b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f172422c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f172423d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f172424a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14918V f172425b;

            a(LocalThemeScope localThemeScope, InterfaceC14918V interfaceC14918V) {
                this.f172424a = localThemeScope;
                this.f172425b = interfaceC14918V;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1815025187, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextAreaWithCharLimitWarningBlock.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsTextAreaField.kt:245)");
                }
                LocalThemeScope localThemeScope = this.f172424a;
                InterfaceC14918V interfaceC14918V = this.f172425b;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                C14801J c14801j = C14801J.f139030a;
                C16307b.b(localThemeScope, interfaceC14918V.getIcons().getInfoBlockIcon(), C.i.n.f15565d, "Warning", composer, 3456, 0);
                ri.j.h(localThemeScope, interfaceC14918V.getLabels().getInfoBlockMessage(), "Text input with warning uses yellow border with a yellow info block.", null, composer, 384, 4);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        i(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1) {
            this.f172420a = localThemeScope;
            this.f172421b = str;
            this.f172422c = modifier;
            this.f172423d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC14918V interfaceC14918V, LocalThemeScope localThemeScope, G1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC14918V.getLabels().getLabel(), "Warning");
            AdsInputField.f(interfaceC14918V.getInfoBlocks().getWarningBlock(), ComposableLambdaKt.composableLambdaInstance(-1815025187, true, new a(localThemeScope, interfaceC14918V)));
            G1.K(AdsInputField, interfaceC14918V.getLabels().getDescription(), null, 2, null);
            return Unit.f142422a;
        }

        public final void b(final InterfaceC14918V Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1989447948, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextAreaWithCharLimitWarningBlock.<anonymous> (AdsTextAreaField.kt:236)");
            }
            q1.f.TextArea warning = Assemble.getInputFields().getWarning();
            LocalThemeScope localThemeScope = this.f172420a;
            String str = this.f172421b;
            Modifier modifier = this.f172422c;
            Integer numValueOf = Integer.valueOf(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES);
            Function1<String, Unit> function1 = this.f172423d;
            composer.startReplaceGroup(-1633490746);
            boolean zD = ((i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f172420a);
            final LocalThemeScope localThemeScope2 = this.f172420a;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: zi.a1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return S0.i.c(Assemble, localThemeScope2, (G1) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C18504m0.g(localThemeScope, str, modifier, numValueOf, warning, function1, (Function1) objB, composer, 3072, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14918V interfaceC14918V, Composer composer, Integer num) {
            b(interfaceC14918V, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class j implements Function3<InterfaceC14918V, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172426a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f172427b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f172428c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f172429d;

        /* JADX WARN: Multi-variable type inference failed */
        j(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1) {
            this.f172426a = localThemeScope;
            this.f172427b = str;
            this.f172428c = modifier;
            this.f172429d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC14918V interfaceC14918V, G1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC14918V.getLabels().getLabel(), "Bio");
            AdsInputField.e(interfaceC14918V.getLabels().getDescription(), "Tell us about yourself, your hobbies, and interests. Be as detailed as you like.");
            G1.K(AdsInputField, interfaceC14918V.getLabels().getDescription(), null, 2, null);
            return Unit.f142422a;
        }

        public final void b(final InterfaceC14918V Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(533340947, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextAreaWithLabelDescriptionCharLimit.<anonymous> (AdsTextAreaField.kt:114)");
            }
            q1.f.TextArea textArea = Assemble.getInputFields().getDefault();
            LocalThemeScope localThemeScope = this.f172426a;
            String str = this.f172427b;
            Modifier modifier = this.f172428c;
            Integer numValueOf = Integer.valueOf(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES);
            Function1<String, Unit> function1 = this.f172429d;
            composer.startReplaceGroup(5004770);
            boolean z10 = (i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(Assemble));
            Object objB = composer.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: zi.b1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return S0.j.c(Assemble, (G1) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C18504m0.g(localThemeScope, str, modifier, numValueOf, textArea, function1, (Function1) objB, composer, 3072, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14918V interfaceC14918V, Composer composer, Integer num) {
            b(interfaceC14918V, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        z(localThemeScope, str, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void B(final LocalThemeScope localThemeScope, final String value, Modifier modifier, final Function1<? super String, Unit> onValueChange, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(value, "value");
        Intrinsics.j(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2134633211);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(value) ? 32 : 16;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(onValueChange) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2134633211, i12, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextAreaWithCharLimitDisabled (AdsTextAreaField.kt:156)");
            }
            Ji.Q.e(localThemeScope, ji.K0.f139673a, ComposableLambdaKt.c(409674807, true, new c(localThemeScope, value, modifier, onValueChange), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: zi.F0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return S0.C(localThemeScope, value, modifier2, onValueChange, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        B(localThemeScope, str, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void D(final LocalThemeScope localThemeScope, final String value, Modifier modifier, final Function1<? super String, Unit> onValueChange, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(value, "value");
        Intrinsics.j(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-571557330);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(value) ? 32 : 16;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(onValueChange) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-571557330, i12, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextAreaWithCharLimitErrorBlock (AdsTextAreaField.kt:201)");
            }
            Ji.Q.e(localThemeScope, ji.K0.f139673a, ComposableLambdaKt.c(672056544, true, new d(localThemeScope, value, modifier, onValueChange), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: zi.D0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return S0.E(localThemeScope, value, modifier2, onValueChange, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        D(localThemeScope, str, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void F(final LocalThemeScope localThemeScope, final String value, Modifier modifier, final Function1<? super String, Unit> onValueChange, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(value, "value");
        Intrinsics.j(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-119612186);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(value) ? 32 : 16;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(onValueChange) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-119612186, i12, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextAreaWithCharLimitInfoBlock (AdsTextAreaField.kt:300)");
            }
            Ji.Q.e(localThemeScope, ji.K0.f139673a, ComposableLambdaKt.c(1444525044, true, new e(localThemeScope, value, modifier, onValueChange), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: zi.J0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return S0.G(localThemeScope, value, modifier2, onValueChange, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        F(localThemeScope, str, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void H(final LocalThemeScope localThemeScope, final String value, Modifier modifier, final Function1<? super String, Unit> onValueChange, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(value, "value");
        Intrinsics.j(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(588193012);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(value) ? 32 : 16;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(onValueChange) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(588193012, i12, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextAreaWithCharLimitLabelIcon (AdsTextAreaField.kt:176)");
            }
            Ji.Q.e(localThemeScope, ji.K0.f139673a, ComposableLambdaKt.c(-2142637054, true, new f(localThemeScope, value, modifier, onValueChange), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: zi.G0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return S0.I(localThemeScope, value, modifier2, onValueChange, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        H(localThemeScope, str, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void J(final LocalThemeScope localThemeScope, final String value, Modifier modifier, final Function1<? super String, Unit> onValueChange, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(value, "value");
        Intrinsics.j(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2018411494);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(value) ? 32 : 16;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(onValueChange) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2018411494, i12, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextAreaWithCharLimitPlaceholder (AdsTextAreaField.kt:136)");
            }
            Ji.Q.e(localThemeScope, ji.K0.f139673a, ComposableLambdaKt.c(-2121087064, true, new g(localThemeScope, value, modifier, onValueChange), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: zi.A0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return S0.K(localThemeScope, value, modifier2, onValueChange, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        J(localThemeScope, str, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void L(final LocalThemeScope localThemeScope, final String value, Modifier modifier, final Function1<? super String, Unit> onValueChange, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(value, "value");
        Intrinsics.j(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1643227309);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(value) ? 32 : 16;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(onValueChange) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1643227309, i12, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextAreaWithCharLimitSuccessBlock (AdsTextAreaField.kt:267)");
            }
            Ji.Q.e(localThemeScope, ji.K0.f139673a, ComposableLambdaKt.c(-531202683, true, new h(localThemeScope, value, modifier, onValueChange), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: zi.C0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return S0.M(localThemeScope, value, modifier2, onValueChange, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        L(localThemeScope, str, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void N(final LocalThemeScope localThemeScope, final String value, Modifier modifier, final Function1<? super String, Unit> onValueChange, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(value, "value");
        Intrinsics.j(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(877423322);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(value) ? 32 : 16;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(onValueChange) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(877423322, i12, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextAreaWithCharLimitWarningBlock (AdsTextAreaField.kt:234)");
            }
            Ji.Q.e(localThemeScope, ji.K0.f139673a, ComposableLambdaKt.c(1989447948, true, new i(localThemeScope, value, modifier, onValueChange), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: zi.B0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return S0.O(localThemeScope, value, modifier2, onValueChange, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        N(localThemeScope, str, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void P(final LocalThemeScope localThemeScope, final String value, Modifier modifier, final Function1<? super String, Unit> onValueChange, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(value, "value");
        Intrinsics.j(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(658793953);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(value) ? 32 : 16;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(onValueChange) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(658793953, i12, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextAreaWithLabelDescriptionCharLimit (AdsTextAreaField.kt:112)");
            }
            Ji.Q.e(localThemeScope, ji.K0.f139673a, ComposableLambdaKt.c(533340947, true, new j(localThemeScope, value, modifier, onValueChange), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: zi.E0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return S0.Q(localThemeScope, value, modifier2, onValueChange, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        P(localThemeScope, str, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0315  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void R(Ji.LocalThemeScope r21, androidx.compose.ui.Modifier r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zi.S0.R(Ji.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k0(InterfaceC5730l0 interfaceC5730l0, String it) {
        Intrinsics.j(it, "it");
        T(interfaceC5730l0, it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(InterfaceC5730l0 interfaceC5730l0, String it) {
        Intrinsics.j(it, "it");
        V(interfaceC5730l0, it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m0(InterfaceC5730l0 interfaceC5730l0, String it) {
        Intrinsics.j(it, "it");
        X(interfaceC5730l0, it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n0(InterfaceC5730l0 interfaceC5730l0, String it) {
        Intrinsics.j(it, "it");
        Z(interfaceC5730l0, it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o0(InterfaceC5730l0 interfaceC5730l0, String it) {
        Intrinsics.j(it, "it");
        b0(interfaceC5730l0, it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p0(InterfaceC5730l0 interfaceC5730l0, String it) {
        Intrinsics.j(it, "it");
        d0(interfaceC5730l0, it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q0(InterfaceC5730l0 interfaceC5730l0, String it) {
        Intrinsics.j(it, "it");
        f0(interfaceC5730l0, it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r0(InterfaceC5730l0 interfaceC5730l0, String it) {
        Intrinsics.j(it, "it");
        h0(interfaceC5730l0, it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s0(InterfaceC5730l0 interfaceC5730l0, String it) {
        Intrinsics.j(it, "it");
        j0(interfaceC5730l0, it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t0(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        R(localThemeScope, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void v(final InterfaceC18489g1<String, Unit> interfaceC18489g1, final Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        final InterfaceC18489g1<String, Unit> interfaceC18489g12;
        Intrinsics.j(interfaceC18489g1, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(2106637101);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(interfaceC18489g1) : composerStartRestartGroup.D(interfaceC18489g1) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            interfaceC18489g12 = interfaceC18489g1;
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(2106637101, i12, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.AdsTextAreaField (AdsTextAreaField.kt:52)");
            }
            LocalThemeScope localThemeScopeC = interfaceC18489g1.c();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = interfaceC18489g1.getTemplate().getInteractionSource();
                if (objB == null) {
                    objB = h0.k.a();
                }
                composerStartRestartGroup.t(objB);
            }
            h0.l lVar = (h0.l) objB;
            composerStartRestartGroup.P();
            androidx.compose.runtime.z1<Boolean> z1VarA = h0.f.a(lVar, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i14 = i12 & 14;
            boolean z10 = i14 == 4 || ((i12 & 8) != 0 && composerStartRestartGroup.D(interfaceC18489g1));
            Object objB2 = composerStartRestartGroup.B();
            if (z10 || objB2 == companion.a()) {
                objB2 = new Function1() { // from class: zi.y0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return S0.x(interfaceC18489g1, (String) obj);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            interfaceC18489g12 = interfaceC18489g1;
            C18486f1.c(interfaceC18489g12, modifier2, lVar, (Function1) objB2, ComposableLambdaKt.c(777622844, true, new a(interfaceC18489g1, localThemeScopeC, lVar, z1VarA), composerStartRestartGroup, 54), composerStartRestartGroup, i14 | 24960 | (i12 & 112), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier = modifier2;
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: zi.z0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return S0.y(interfaceC18489g12, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(InterfaceC18489g1 interfaceC18489g1, String value) {
        Intrinsics.j(value, "value");
        Function2 function2A = interfaceC18489g1.A();
        Unit unit = Unit.f142422a;
        function2A.invoke(value, unit);
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(InterfaceC18489g1 interfaceC18489g1, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        v(interfaceC18489g1, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void z(final LocalThemeScope localThemeScope, final String value, Modifier modifier, final Function1<? super String, Unit> onValueChange, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(value, "value");
        Intrinsics.j(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(1519857103);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(value) ? 32 : 16;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(onValueChange) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1519857103, i12, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextAreaWithAllFeaturesEnabled (AdsTextAreaField.kt:333)");
            }
            Ji.Q.e(localThemeScope, ji.K0.f139673a, ComposableLambdaKt.c(-1210972963, true, new b(modifier, localThemeScope, value, onValueChange), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: zi.H0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return S0.A(localThemeScope, value, modifier2, onValueChange, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String S(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final void T(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    private static final String U(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final void V(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    private static final String W(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final void X(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    private static final String Y(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final void Z(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    private static final String a0(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final void b0(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    private static final String c0(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final void d0(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    private static final String e0(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final void f0(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    private static final String g0(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final void h0(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    private static final String i0(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final void j0(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w(androidx.compose.runtime.z1<Boolean> z1Var) {
        return z1Var.getValue().booleanValue();
    }
}
