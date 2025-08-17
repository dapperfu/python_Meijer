package zi;

import Ji.C;
import Ji.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.text.C5693z;
import androidx.compose.foundation.text.InterfaceC5692y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5763f;
import androidx.compose.ui.focus.InterfaceC5772o;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.recyclerview.widget.RecyclerView;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13439f;
import d0.C13457y;
import ii.C14730a;
import j0.C14801J;
import j0.C14815g;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import java.util.Arrays;
import ji.DefaultTextInputs;
import ji.InterfaceC14919W;
import ji.q1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16190d;
import pi.C16307b;
import pi.C16309d;
import qv.C16648k;
import qv.InterfaceC16622O;
import r0.C16692i;
import zi.K;
import zi.t1;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0005\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\u000b\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\r\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\tH\u0001¢\u0006\u0004\b\r\u0010\f\u001a9\u0010\u000e\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\tH\u0001¢\u0006\u0004\b\u000e\u0010\f\u001aG\u0010\u0011\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\tH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aG\u0010\u0014\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\tH\u0001¢\u0006\u0004\b\u0014\u0010\u0012\u001aG\u0010\u0015\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\tH\u0001¢\u0006\u0004\b\u0015\u0010\u0012\u001a9\u0010\u0016\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\tH\u0001¢\u0006\u0004\b\u0016\u0010\f\u001a9\u0010\u0017\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\tH\u0001¢\u0006\u0004\b\u0017\u0010\f\u001a9\u0010\u0018\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\tH\u0001¢\u0006\u0004\b\u0018\u0010\f\u001a9\u0010\u0019\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\tH\u0001¢\u0006\u0004\b\u0019\u0010\f\u001ac\u0010\u001d\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001aU\u0010\u001f\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0001¢\u0006\u0004\b\u001f\u0010 \u001a\u001d\u0010!\u001a\u00020\u0002*\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b!\u0010\"\u001a\u001d\u0010#\u001a\u00020\u0002*\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b#\u0010\"¨\u00064²\u0006\f\u0010%\u001a\u00020$8\nX\u008a\u0084\u0002²\u0006\u000e\u0010&\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010'\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010(\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010)\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010*\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010+\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010,\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010-\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010.\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010/\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00100\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00101\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00103\u001a\u0002028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lzi/g1;", "", "", "Landroidx/compose/ui/Modifier;", "modifier", "K", "(Lzi/g1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LJi/M;", "value", "Lkotlin/Function1;", "onValueChange", "O", "(LJi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Q", "S", "Lkotlin/Function0;", "onInfoClick", "Y", "(LJi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "onIconClick", "c0", "a0", "e0", "k0", "i0", "W", "onLabelIconClick", "onLeadingIconClick", "onTrailingIconClick", "U", "(LJi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "g0", "(LJi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "t0", "(LJi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "m0", "", "isFocused", "defaultBlankText", "defaultBlankPlaceholderText", "defaultBlankPlaceholderDisabledText", "defaultLabelIconText", "defaultTrailingIconText", "defaultLeadingIconText", "errorFieldText", "warningFieldText", "successFieldText", "defaultInfoBlockText", "defaultEverythingText", "errorEverythingText", "Lzi/t1;", "state", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class K {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC18489g1<String, Unit> f172208a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172209b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0.l f172210c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f172211d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f172212e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.z1<Boolean> f172213f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: zi.K$a$a, reason: collision with other inner class name */
        public static final class C2772a implements Function1<ri.p, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final C2772a f172214a = new C2772a();

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
            /* renamed from: zi.K$a$b$a, reason: collision with other inner class name */
            public static final class C2773a implements Function0<ri.p> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Ii.h f172218a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ b f172219b;

                public C2773a(Ii.h hVar, b bVar) {
                    this.f172218a = hVar;
                    this.f172219b = bVar;
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [Ii.h, java.lang.Object, ri.p] */
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ri.p invoke() {
                    ?? r02 = this.f172218a;
                    this.f172219b.t().getValue().invoke(r02);
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
                    objB = androidx.compose.runtime.o1.e(new C2773a(hVar, this));
                    composer.t(objB);
                }
                composer.P();
                this.state = (androidx.compose.runtime.z1) objB;
                this.initialScope = hVar;
            }
        }

        a(InterfaceC18489g1<String, Unit> interfaceC18489g1, LocalThemeScope localThemeScope, h0.l lVar, float f10, float f11, androidx.compose.runtime.z1<Boolean> z1Var) {
            this.f172208a = interfaceC18489g1;
            this.f172209b = localThemeScope;
            this.f172210c = lVar;
            this.f172211d = f10;
            this.f172212e = f11;
            this.f172213f = z1Var;
        }

        public final void a(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer, int i10) {
            int i11;
            androidx.compose.runtime.z1<Boolean> z1Var;
            LocalThemeScope localThemeScope;
            ri.p pVarG;
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
                ComposerKt.U(2100571402, i11, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.AdsBasicTextField.<anonymous>.<anonymous> (AdsBasicTextField.kt:80)");
            }
            Modifier modifier = this.f172208a.getTemplate().getModifier();
            V0.D1 shape = this.f172208a.getTemplate().getShape();
            if (shape == null) {
                shape = C16692i.c(this.f172209b.getAdsCornerRadii().getRadius04().getDp());
            }
            Modifier modifierD = androidx.compose.foundation.b.d(T0.e.a(modifier, shape), this.f172208a.getTemplate().getColors().getBackgroundColor(), null, 2, null);
            V0.D1 shape2 = this.f172208a.getTemplate().getShape();
            if (shape2 == null) {
                shape2 = C16692i.c(this.f172209b.getAdsCornerRadii().getRadius04().getDp());
            }
            Modifier modifierM = androidx.compose.foundation.layout.D.m(C13439f.g(modifierD, H1.h.p(K.L(this.f172213f) ? 2 : 1), this.f172208a.getTemplate().getColors().e(this.f172208a.getTemplate().getState(), this.f172210c, composer2, 0).getValue().getValue(), shape2), this.f172211d, 0.0f, this.f172212e, 0.0f, 10, null);
            C5658d c5658d = C5658d.f48555a;
            C5658d.f fVarE = c5658d.e();
            e.Companion companion = P0.e.INSTANCE;
            e.c cVarI = companion.i();
            InterfaceC18489g1<String, Unit> interfaceC18489g1 = this.f172208a;
            LocalThemeScope localThemeScope2 = this.f172209b;
            androidx.compose.runtime.z1<Boolean> z1Var2 = this.f172213f;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(fVarE, cVarI, composer2, 54);
            int iA = C5717f.a(composer2, 0);
            InterfaceC5742s interfaceC5742sR = composer2.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer2, modifierM);
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
            C16309d c16309dW = interfaceC18489g1.getLeadingIcon();
            composer2.startReplaceGroup(170419107);
            if (c16309dW == null) {
                localThemeScope = localThemeScope2;
                z1Var = z1Var2;
            } else {
                Modifier modifierM2 = androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, 0.0f, H1.h.p(6), 0.0f, 11, null);
                MeasurePolicy measurePolicyA = C5665k.a(c5658d.h(), companion.k(), composer2, 0);
                int iA2 = C5717f.a(composer2, 0);
                InterfaceC5742s interfaceC5742sR2 = composer2.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer2, modifierM2);
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
                androidx.compose.runtime.D1.c(composerA2, measurePolicyA, companion2.e());
                androidx.compose.runtime.D1.c(composerA2, interfaceC5742sR2, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion2.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                androidx.compose.runtime.D1.c(composerA2, modifierE2, companion2.f());
                C14815g c14815g = C14815g.f139108a;
                z1Var = z1Var2;
                s1.b(localThemeScope2, interfaceC18489g1.v0(), c16309dW, 0.0f, composer2, 0, 4);
                localThemeScope = localThemeScope2;
                composer2 = composer2;
                composer2.v();
                Unit unit = Unit.f142422a;
            }
            composer2.P();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierD2 = c14801j.d(InterfaceC14800I.b(c14801j, companion3, 1.0f, false, 2, null), companion.i());
            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion.l(), composer2, 0);
            int iA3 = C5717f.a(composer2, 0);
            InterfaceC5742s interfaceC5742sR3 = composer2.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer2, modifierD2);
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
            androidx.compose.runtime.D1.c(composerA3, measurePolicyB2, companion2.e());
            androidx.compose.runtime.D1.c(composerA3, interfaceC5742sR3, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion2.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            androidx.compose.runtime.D1.c(composerA3, modifierE3, companion2.f());
            composer2.startReplaceGroup(-1354391676);
            if (!K.L(z1Var) && interfaceC18489g1.getValue().length() == 0 && (pVarG = interfaceC18489g1.getPlaceHolder()) != null) {
                composer2.startReplaceGroup(327606171);
                Object[] objArr = {pVarG};
                composer2.startReplaceGroup(-2104237158);
                composer2.startReplaceGroup(1849434622);
                Object objB = composer2.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = C2772a.f172214a;
                    composer2.t(objB);
                }
                composer2.P();
                Object[] objArrCopyOf = Arrays.copyOf(objArr, 1);
                composer2.startReplaceGroup(1252494947);
                b bVar = new b((Function1) objB, composer2, 0, objArrCopyOf, pVarG);
                composer2.P();
                bVar.k(0, companion3).invoke(composer2, 0);
                composer2.P();
                composer2.P();
                Unit unit2 = Unit.f142422a;
            }
            composer2.P();
            innerTextField.invoke(composer2, Integer.valueOf(i11 & 14));
            composer2.v();
            MeasurePolicy measurePolicyB3 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion.l(), composer2, 0);
            int iA4 = C5717f.a(composer2, 0);
            InterfaceC5742s interfaceC5742sR4 = composer2.r();
            Modifier modifierE4 = androidx.compose.ui.b.e(composer2, companion3);
            Function0<InterfaceC5811g> function0A4 = companion2.a();
            if (composer2.k() == null) {
                C5717f.c();
            }
            composer2.F();
            if (composer2.getInserting()) {
                composer2.I(function0A4);
            } else {
                composer2.s();
            }
            Composer composerA4 = androidx.compose.runtime.D1.a(composer2);
            androidx.compose.runtime.D1.c(composerA4, measurePolicyB3, companion2.e());
            androidx.compose.runtime.D1.c(composerA4, interfaceC5742sR4, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B4 = companion2.b();
            if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                composerA4.t(Integer.valueOf(iA4));
                composerA4.n(Integer.valueOf(iA4), function2B4);
            }
            androidx.compose.runtime.D1.c(composerA4, modifierE4, companion2.f());
            C16309d c16309dZ = interfaceC18489g1.getTrailingIcon();
            composer2.startReplaceGroup(-166756357);
            if (c16309dZ != null) {
                MeasurePolicy measurePolicyA2 = C5665k.a(c5658d.h(), companion.k(), composer2, 0);
                int iA5 = C5717f.a(composer2, 0);
                InterfaceC5742s interfaceC5742sR5 = composer2.r();
                Modifier modifierE5 = androidx.compose.ui.b.e(composer2, companion3);
                Function0<InterfaceC5811g> function0A5 = companion2.a();
                if (composer2.k() == null) {
                    C5717f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A5);
                } else {
                    composer2.s();
                }
                Composer composerA5 = androidx.compose.runtime.D1.a(composer2);
                androidx.compose.runtime.D1.c(composerA5, measurePolicyA2, companion2.e());
                androidx.compose.runtime.D1.c(composerA5, interfaceC5742sR5, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B5 = companion2.b();
                if (composerA5.getInserting() || !Intrinsics.e(composerA5.B(), Integer.valueOf(iA5))) {
                    composerA5.t(Integer.valueOf(iA5));
                    composerA5.n(Integer.valueOf(iA5), function2B5);
                }
                androidx.compose.runtime.D1.c(composerA5, modifierE5, companion2.f());
                C14815g c14815g2 = C14815g.f139108a;
                s1.b(localThemeScope, interfaceC18489g1.r(), c16309dZ, 0.0f, composer, 0, 4);
                composer2 = composer;
                composer2.v();
                Unit unit3 = Unit.f142422a;
            }
            composer2.P();
            Function2<Composer, Integer, Unit> function2N = interfaceC18489g1.n();
            composer2.startReplaceGroup(-166749775);
            if (function2N != null) {
                function2N.invoke(composer2, 0);
                Unit unit4 = Unit.f142422a;
            }
            composer2.P();
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
    static final class b implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172220a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f172221b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f172222c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f172223d;

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1) {
            this.f172220a = localThemeScope;
            this.f172221b = str;
            this.f172222c = modifier;
            this.f172223d = function1;
        }

        public final void a(InterfaceC14919W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(845684624, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputDefaultBlank.<anonymous> (AdsBasicTextField.kt:135)");
            }
            C18504m0.i(this.f172220a, this.f172221b, Assemble.getInputFields().getDefault(), this.f172222c, this.f172223d, null, composer, 0, 16);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            a(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172224a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f172225b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f172226c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f172227d;

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1) {
            this.f172224a = localThemeScope;
            this.f172225b = str;
            this.f172226c = modifier;
            this.f172227d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC14919W interfaceC14919W, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.i(interfaceC14919W.getLabels().getPlaceholder(), "Placeholder");
            return Unit.f142422a;
        }

        public final void b(final InterfaceC14919W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1644336363, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputDefaultBlankPlaceholder.<anonymous> (AdsBasicTextField.kt:151)");
            }
            q1.f.TextInput textInput = Assemble.getInputFields().getDefault();
            LocalThemeScope localThemeScope = this.f172224a;
            String str = this.f172225b;
            Modifier modifier = this.f172226c;
            Function1<String, Unit> function1 = this.f172227d;
            composer.startReplaceGroup(5004770);
            boolean z10 = (i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(Assemble));
            Object objB = composer.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: zi.L
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.c.c(Assemble, (H1) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C18504m0.i(localThemeScope, str, textInput, modifier, function1, (Function1) objB, composer, 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            b(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172228a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f172229b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f172230c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f172231d;

        /* JADX WARN: Multi-variable type inference failed */
        d(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1) {
            this.f172228a = localThemeScope;
            this.f172229b = str;
            this.f172230c = modifier;
            this.f172231d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC14919W interfaceC14919W, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC14919W.getLabels().getLabel(), "Disabled");
            return Unit.f142422a;
        }

        public final void b(final InterfaceC14919W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(287619023, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputDefaultBlankPlaceholderDisabled.<anonymous> (AdsBasicTextField.kt:169)");
            }
            q1.f.TextInput disabled = Assemble.getInputFields().getDisabled();
            LocalThemeScope localThemeScope = this.f172228a;
            String str = this.f172229b;
            Modifier modifier = this.f172230c;
            Function1<String, Unit> function1 = this.f172231d;
            composer.startReplaceGroup(5004770);
            boolean z10 = (i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(Assemble));
            Object objB = composer.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: zi.M
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.d.c(Assemble, (H1) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C18504m0.i(localThemeScope, str, disabled, modifier, function1, (Function1) objB, composer, 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            b(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172232a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f172233b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f172234c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f172235d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f172236e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f172237f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f172238g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f172239a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f172240b;

            a(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W) {
                this.f172239a = localThemeScope;
                this.f172240b = interfaceC14919W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1459105051, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputDefaultEverythingComplexModifier.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:416)");
                }
                LocalThemeScope localThemeScope = this.f172239a;
                InterfaceC14919W interfaceC14919W = this.f172240b;
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
                C16307b.b(localThemeScope, interfaceC14919W.getIcons().getInfoBlockIcon(), C.i.C0265i.f15559d, "Validation Info", composer, 3456, 0);
                ri.j.h(localThemeScope, interfaceC14919W.getLabels().getInfoBlockMessage(), "Text input with info uses gray border with a light blue info block.", null, composer, 384, 4);
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

        public final void b(final InterfaceC14919W Assemble, Composer composer, int i10) {
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
                ComposerKt.U(-1600504500, i11, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputDefaultEverythingComplexModifier.<anonymous> (AdsBasicTextField.kt:388)");
            }
            q1.f.TextInput textInput = Assemble.getInputFields().getDefault();
            LocalThemeScope localThemeScope = this.f172232a;
            String str = this.f172233b;
            Modifier modifier = this.f172234c;
            Function1<String, Unit> function1 = this.f172235d;
            composer.startReplaceGroup(-1224400529);
            boolean zV = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble))) | composer.V(this.f172236e) | composer.V(this.f172237f) | composer.V(this.f172238g) | composer.D(this.f172232a);
            final Function0<Unit> function0 = this.f172236e;
            final Function0<Unit> function02 = this.f172237f;
            final Function0<Unit> function03 = this.f172238g;
            final LocalThemeScope localThemeScope2 = this.f172232a;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                Function1 function12 = new Function1() { // from class: zi.N
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.e.c(Assemble, function0, function02, function03, localThemeScope2, (H1) obj);
                    }
                };
                composer.t(function12);
                objB = function12;
            }
            composer.P();
            C18504m0.i(localThemeScope, str, textInput, modifier, function1, (Function1) objB, composer, 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        e(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
            this.f172232a = localThemeScope;
            this.f172233b = str;
            this.f172234c = modifier;
            this.f172235d = function1;
            this.f172236e = function0;
            this.f172237f = function02;
            this.f172238g = function03;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC14919W interfaceC14919W, Function0 function0, Function0 function02, Function0 function03, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC14919W.getLabels().getLabel(), "Label");
            AdsInputField.e(interfaceC14919W.getLabels().getDescription(), "This is a field with everything together!!");
            H1.U(AdsInputField, interfaceC14919W.getIcons().getLabelIcon(), C.i.h.f15557d, null, function0, 4, null);
            H1.N(AdsInputField, interfaceC14919W.getIcons().getLeadingIcon(), C.a.B.f15320e, null, function02, 4, null);
            H1.w(AdsInputField, interfaceC14919W.getIcons().getTrailingIcon(), C.f.p.f15524e, null, function03, 4, null);
            AdsInputField.i(interfaceC14919W.getLabels().getPlaceholder(), "Placeholder");
            AdsInputField.f(interfaceC14919W.getInfoBlocks().getInformationBlock(), ComposableLambdaKt.composableLambdaInstance(1459105051, true, new a(localThemeScope, interfaceC14919W)));
            return Unit.f142422a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            b(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class f implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172241a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f172242b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f172243c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f172244d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f172245a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f172246b;

            a(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W) {
                this.f172245a = localThemeScope;
                this.f172246b = interfaceC14919W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1707005908, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputDefaultInfoBlock.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:362)");
                }
                LocalThemeScope localThemeScope = this.f172245a;
                InterfaceC14919W interfaceC14919W = this.f172246b;
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
                C16307b.b(localThemeScope, interfaceC14919W.getIcons().getInfoBlockIcon(), C.i.C0265i.f15559d, "Validation Info", composer, 3456, 0);
                ri.j.h(localThemeScope, interfaceC14919W.getLabels().getInfoBlockMessage(), "Text input with info uses gray border with a light blue info block.", null, composer, 384, 4);
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
        f(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1) {
            this.f172241a = localThemeScope;
            this.f172242b = str;
            this.f172243c = modifier;
            this.f172244d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC14919W interfaceC14919W, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC14919W.getLabels().getLabel(), "Information");
            AdsInputField.f(interfaceC14919W.getInfoBlocks().getInformationBlock(), ComposableLambdaKt.composableLambdaInstance(1707005908, true, new a(localThemeScope, interfaceC14919W)));
            return Unit.f142422a;
        }

        public final void b(final InterfaceC14919W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-633231931, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputDefaultInfoBlock.<anonymous> (AdsBasicTextField.kt:354)");
            }
            q1.f.TextInput textInput = Assemble.getInputFields().getDefault();
            LocalThemeScope localThemeScope = this.f172241a;
            String str = this.f172242b;
            Modifier modifier = this.f172243c;
            Function1<String, Unit> function1 = this.f172244d;
            composer.startReplaceGroup(-1633490746);
            boolean zD = ((i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f172241a);
            final LocalThemeScope localThemeScope2 = this.f172241a;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: zi.O
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.f.c(Assemble, localThemeScope2, (H1) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C18504m0.i(localThemeScope, str, textInput, modifier, function1, (Function1) objB, composer, 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            b(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class g implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172247a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f172248b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f172249c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f172250d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f172251e;

        /* JADX WARN: Multi-variable type inference failed */
        g(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1, Function0<Unit> function0) {
            this.f172247a = localThemeScope;
            this.f172248b = str;
            this.f172249c = modifier;
            this.f172250d = function1;
            this.f172251e = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC14919W interfaceC14919W, Function0 function0, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            H1.U(AdsInputField, interfaceC14919W.getIcons().getLabelIcon(), C.i.h.f15557d, null, function0, 4, null);
            AdsInputField.d(interfaceC14919W.getLabels().getLabel(), "Label");
            return Unit.f142422a;
        }

        public final void b(final InterfaceC14919W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(812036843, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputDefaultLabelIcon.<anonymous> (AdsBasicTextField.kt:188)");
            }
            q1.f.TextInput textInput = Assemble.getInputFields().getDefault();
            LocalThemeScope localThemeScope = this.f172247a;
            String str = this.f172248b;
            Modifier modifier = this.f172249c;
            Function1<String, Unit> function1 = this.f172250d;
            composer.startReplaceGroup(-1633490746);
            boolean zV = ((i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(Assemble))) | composer.V(this.f172251e);
            final Function0<Unit> function0 = this.f172251e;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: zi.P
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.g.c(Assemble, function0, (H1) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C18504m0.i(localThemeScope, str, textInput, modifier, function1, (Function1) objB, composer, 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            b(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class h implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172252a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f172253b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f172254c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f172255d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f172256e;

        /* JADX WARN: Multi-variable type inference failed */
        h(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1, Function0<Unit> function0) {
            this.f172252a = localThemeScope;
            this.f172253b = str;
            this.f172254c = modifier;
            this.f172255d = function1;
            this.f172256e = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC14919W interfaceC14919W, Function0 function0, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            H1.N(AdsInputField, interfaceC14919W.getIcons().getFieldIcon(), C.a.B.f15320e, null, function0, 4, null);
            AdsInputField.d(interfaceC14919W.getLabels().getLabel(), "Leading Icon");
            AdsInputField.i(interfaceC14919W.getLabels().getPlaceholder(), "Search");
            return Unit.f142422a;
        }

        public final void b(final InterfaceC14919W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(505685081, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputDefaultLeadingIcon.<anonymous> (AdsBasicTextField.kt:237)");
            }
            q1.f.TextInput textInput = Assemble.getInputFields().getDefault();
            LocalThemeScope localThemeScope = this.f172252a;
            String str = this.f172253b;
            Modifier modifier = this.f172254c;
            Function1<String, Unit> function1 = this.f172255d;
            composer.startReplaceGroup(-1633490746);
            boolean zV = ((i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(Assemble))) | composer.V(this.f172256e);
            final Function0<Unit> function0 = this.f172256e;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: zi.Q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.h.c(Assemble, function0, (H1) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C18504m0.i(localThemeScope, str, textInput, modifier, function1, (Function1) objB, composer, 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            b(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class i implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172257a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f172258b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f172259c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f172260d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f172261e;

        /* JADX WARN: Multi-variable type inference failed */
        i(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1, Function0<Unit> function0) {
            this.f172257a = localThemeScope;
            this.f172258b = str;
            this.f172259c = modifier;
            this.f172260d = function1;
            this.f172261e = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC14919W interfaceC14919W, Function0 function0, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            H1.w(AdsInputField, interfaceC14919W.getIcons().getFieldIcon(), C.a.B.f15320e, null, function0, 4, null);
            AdsInputField.d(interfaceC14919W.getLabels().getLabel(), "Trailing Icon");
            AdsInputField.i(interfaceC14919W.getLabels().getPlaceholder(), "Search");
            return Unit.f142422a;
        }

        public final void b(final InterfaceC14919W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1354994455, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputDefaultTrailingIcon.<anonymous> (AdsBasicTextField.kt:212)");
            }
            q1.f.TextInput textInput = Assemble.getInputFields().getDefault();
            LocalThemeScope localThemeScope = this.f172257a;
            String str = this.f172258b;
            Modifier modifier = this.f172259c;
            Function1<String, Unit> function1 = this.f172260d;
            composer.startReplaceGroup(-1633490746);
            boolean zV = ((i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(Assemble))) | composer.V(this.f172261e);
            final Function0<Unit> function0 = this.f172261e;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: zi.S
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.i.c(Assemble, function0, (H1) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C18504m0.i(localThemeScope, str, textInput, modifier, function1, (Function1) objB, composer, 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            b(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class j implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172262a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f172263b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f172264c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f172265d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f172266a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f172267b;

            a(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W) {
                this.f172266a = localThemeScope;
                this.f172267b = interfaceC14919W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1714305516, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputError.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:269)");
                }
                LocalThemeScope localThemeScope = this.f172266a;
                InterfaceC14919W interfaceC14919W = this.f172267b;
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
                C16307b.b(localThemeScope, interfaceC14919W.getIcons().getInfoBlockIcon(), C.i.e.f15552d, "Validation Error", composer, 3456, 0);
                ri.j.h(localThemeScope, interfaceC14919W.getLabels().getInfoBlockMessage(), "Text input with error uses red border with a red info block.", null, composer, 384, 4);
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
        j(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1) {
            this.f172262a = localThemeScope;
            this.f172263b = str;
            this.f172264c = modifier;
            this.f172265d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC14919W interfaceC14919W, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC14919W.getLabels().getLabel(), "Error");
            AdsInputField.f(interfaceC14919W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(-1714305516, true, new a(localThemeScope, interfaceC14919W)));
            return Unit.f142422a;
        }

        public final void b(final InterfaceC14919W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1209776957, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputError.<anonymous> (AdsBasicTextField.kt:261)");
            }
            q1.f.TextInput error = Assemble.getInputFields().getError();
            LocalThemeScope localThemeScope = this.f172262a;
            String str = this.f172263b;
            Modifier modifier = this.f172264c;
            Function1<String, Unit> function1 = this.f172265d;
            composer.startReplaceGroup(-1633490746);
            boolean zD = ((i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f172262a);
            final LocalThemeScope localThemeScope2 = this.f172262a;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: zi.T
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.j.c(Assemble, localThemeScope2, (H1) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C18504m0.i(localThemeScope, str, error, modifier, function1, (Function1) objB, composer, 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            b(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class k implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172268a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f172269b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f172270c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f172271d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f172272e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f172273f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f172274a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f172275b;

            a(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W) {
                this.f172274a = localThemeScope;
                this.f172275b = interfaceC14919W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1382186450, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputErrorEverythingComplexModifier.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:464)");
                }
                LocalThemeScope localThemeScope = this.f172274a;
                InterfaceC14919W interfaceC14919W = this.f172275b;
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
                C16307b.b(localThemeScope, interfaceC14919W.getIcons().getInfoBlockIcon(), C.i.e.f15552d, "Validation Error", composer, 3456, 0);
                ri.j.h(localThemeScope, interfaceC14919W.getLabels().getInfoBlockMessage(), "Text input with error uses red border with a red info block.", null, composer, 384, 4);
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
        k(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1, Function0<Unit> function0, Function0<Unit> function02) {
            this.f172268a = localThemeScope;
            this.f172269b = str;
            this.f172270c = modifier;
            this.f172271d = function1;
            this.f172272e = function0;
            this.f172273f = function02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC14919W interfaceC14919W, Function0 function0, Function0 function02, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC14919W.getLabels().getLabel(), "Label");
            AdsInputField.e(interfaceC14919W.getLabels().getDescription(), "This is a field with everything together!!");
            H1.U(AdsInputField, interfaceC14919W.getIcons().getLabelIcon(), C.i.h.f15557d, null, function0, 4, null);
            H1.N(AdsInputField, interfaceC14919W.getIcons().getLeadingIcon(), C.a.B.f15320e, null, function02, 4, null);
            AdsInputField.i(interfaceC14919W.getLabels().getPlaceholder(), "Placeholder");
            AdsInputField.f(interfaceC14919W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(-1382186450, true, new a(localThemeScope, interfaceC14919W)));
            return Unit.f142422a;
        }

        public final void b(final InterfaceC14919W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-449211425, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputErrorEverythingComplexModifier.<anonymous> (AdsBasicTextField.kt:441)");
            }
            q1.f.TextInput error = Assemble.getInputFields().getError();
            LocalThemeScope localThemeScope = this.f172268a;
            String str = this.f172269b;
            Modifier modifier = this.f172270c;
            Function1<String, Unit> function1 = this.f172271d;
            composer.startReplaceGroup(-1224400529);
            boolean zV = ((i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(Assemble))) | composer.V(this.f172272e) | composer.V(this.f172273f) | composer.D(this.f172268a);
            final Function0<Unit> function0 = this.f172272e;
            final Function0<Unit> function02 = this.f172273f;
            final LocalThemeScope localThemeScope2 = this.f172268a;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: zi.U
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.k.c(Assemble, function0, function02, localThemeScope2, (H1) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C18504m0.i(localThemeScope, str, error, modifier, function1, (Function1) objB, composer, 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            b(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class l implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172276a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f172277b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f172278c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f172279d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f172280a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f172281b;

            a(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W) {
                this.f172280a = localThemeScope;
                this.f172281b = interfaceC14919W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1317593273, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputSuccess.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:331)");
                }
                LocalThemeScope localThemeScope = this.f172280a;
                InterfaceC14919W interfaceC14919W = this.f172281b;
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
                C16307b.b(localThemeScope, interfaceC14919W.getIcons().getInfoBlockIcon(), C.i.b.f15549d, "Validation Success", composer, 3456, 0);
                ri.j.h(localThemeScope, interfaceC14919W.getLabels().getInfoBlockMessage(), "Text input with success uses green border with a green info block.", null, composer, 384, 4);
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
        l(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1) {
            this.f172276a = localThemeScope;
            this.f172277b = str;
            this.f172278c = modifier;
            this.f172279d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC14919W interfaceC14919W, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC14919W.getLabels().getLabel(), "Success");
            AdsInputField.f(interfaceC14919W.getInfoBlocks().getSuccessBlock(), ComposableLambdaKt.composableLambdaInstance(1317593273, true, new a(localThemeScope, interfaceC14919W)));
            return Unit.f142422a;
        }

        public final void b(final InterfaceC14919W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(838234024, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputSuccess.<anonymous> (AdsBasicTextField.kt:323)");
            }
            q1.f.TextInput success = Assemble.getInputFields().getSuccess();
            LocalThemeScope localThemeScope = this.f172276a;
            String str = this.f172277b;
            Modifier modifier = this.f172278c;
            Function1<String, Unit> function1 = this.f172279d;
            composer.startReplaceGroup(-1633490746);
            boolean zD = ((i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f172276a);
            final LocalThemeScope localThemeScope2 = this.f172276a;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: zi.V
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.l.c(Assemble, localThemeScope2, (H1) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C18504m0.i(localThemeScope, str, success, modifier, function1, (Function1) objB, composer, 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            b(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class m implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172282a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f172283b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f172284c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f172285d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f172286a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f172287b;

            a(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W) {
                this.f172286a = localThemeScope;
                this.f172287b = interfaceC14919W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1098108864, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputWarning.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:300)");
                }
                LocalThemeScope localThemeScope = this.f172286a;
                InterfaceC14919W interfaceC14919W = this.f172287b;
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
                C16307b.b(localThemeScope, interfaceC14919W.getIcons().getInfoBlockIcon(), C.i.n.f15565d, "Validation Warning", composer, 3456, 0);
                ri.j.h(localThemeScope, interfaceC14919W.getLabels().getInfoBlockMessage(), "Text input with warning uses yellow border with a yellow info block.", null, composer, 384, 4);
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
        m(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1) {
            this.f172282a = localThemeScope;
            this.f172283b = str;
            this.f172284c = modifier;
            this.f172285d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC14919W interfaceC14919W, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC14919W.getLabels().getLabel(), "Warning");
            AdsInputField.f(interfaceC14919W.getInfoBlocks().getWarningBlock(), ComposableLambdaKt.composableLambdaInstance(1098108864, true, new a(localThemeScope, interfaceC14919W)));
            return Unit.f142422a;
        }

        public final void b(final InterfaceC14919W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(618749615, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputWarning.<anonymous> (AdsBasicTextField.kt:292)");
            }
            q1.f.TextInput warning = Assemble.getInputFields().getWarning();
            LocalThemeScope localThemeScope = this.f172282a;
            String str = this.f172283b;
            Modifier modifier = this.f172284c;
            Function1<String, Unit> function1 = this.f172285d;
            composer.startReplaceGroup(-1633490746);
            boolean zD = ((i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f172282a);
            final LocalThemeScope localThemeScope2 = this.f172282a;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: zi.W
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.m.c(Assemble, localThemeScope2, (H1) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C18504m0.i(localThemeScope, str, warning, modifier, function1, (Function1) objB, composer, 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            b(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class n implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC14794C f172288a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<String> f172289b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f172290c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172291d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<t1> f172292e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f172293f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f172294a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f172295b;

            a(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W) {
                this.f172294a = localThemeScope;
                this.f172295b = interfaceC14919W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1078886676, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.PasswordInputExamples.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:693)");
                }
                ri.j.h(this.f172294a, this.f172295b.getLabels().getInfoBlockMessage(), "Password fields must match!", null, composer, 384, 4);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f172296a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f172297b;

            b(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W) {
                this.f172296a = localThemeScope;
                this.f172297b = interfaceC14919W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1883281419, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.PasswordInputExamples.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:699)");
                }
                ri.j.h(this.f172296a, this.f172297b.getLabels().getInfoBlockMessage(), "Passwords is too short!!", null, composer, 384, 4);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f172298a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f172299b;

            c(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W) {
                this.f172298a = localThemeScope;
                this.f172299b = interfaceC14919W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(550482218, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.PasswordInputExamples.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:705)");
                }
                ri.j.h(this.f172298a, this.f172299b.getLabels().getInfoBlockMessage(), "Password must be 8 characters", null, composer, 384, 4);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f172300a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f172301b;

            d(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W) {
                this.f172300a = localThemeScope;
                this.f172301b = interfaceC14919W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-782316983, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.PasswordInputExamples.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:711)");
                }
                ri.j.h(this.f172300a, this.f172301b.getLabels().getInfoBlockMessage(), "You did it!!!", null, composer, 384, 4);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class e implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f172302a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f172303b;

            e(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W) {
                this.f172302a = localThemeScope;
                this.f172303b = interfaceC14919W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-2115116184, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.PasswordInputExamples.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:717)");
                }
                ri.j.h(this.f172302a, this.f172303b.getLabels().getInfoBlockMessage(), "Password is too short", null, composer, 384, 4);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class f implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f172304a;

            f(LocalThemeScope localThemeScope) {
                this.f172304a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1341940931, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.PasswordInputExamples.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:735)");
                }
                e.c cVarI = P0.e.INSTANCE.i();
                LocalThemeScope localThemeScope = this.f172304a;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), cVarI, composer, 48);
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
                ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 383, null), "Alone", null, composer, 384, 4);
                C13457y.a(C16190d.c(C14730a.f137878a, composer, 0), null, androidx.compose.foundation.layout.D.m(companion, localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 4, null), null, null, 0.0f, null, composer, 48, BinsView.TOTE_HEIGHT_DP);
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

        n(InterfaceC14794C interfaceC14794C, InterfaceC5730l0<String> interfaceC5730l0, InterfaceC5772o interfaceC5772o, LocalThemeScope localThemeScope, InterfaceC5730l0<t1> interfaceC5730l02, InterfaceC5730l0<Boolean> interfaceC5730l03) {
            this.f172288a = interfaceC14794C;
            this.f172289b = interfaceC5730l0;
            this.f172290c = interfaceC5772o;
            this.f172291d = localThemeScope;
            this.f172292e = interfaceC5730l02;
            this.f172293f = interfaceC5730l03;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5772o interfaceC5772o, InterfaceC5692y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            interfaceC5772o.e(C5763f.INSTANCE.a());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, String it) {
            Intrinsics.j(it, "it");
            interfaceC5730l0.setValue(it);
            K.n0(interfaceC5730l0, interfaceC5730l02);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InterfaceC14919W interfaceC14919W, final InterfaceC5730l0 interfaceC5730l0, final InterfaceC5730l0 interfaceC5730l02, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC14919W.getLabels().getLabel(), "Enter a new password");
            H1.U(AdsInputField, interfaceC14919W.getIcons().getLabelIcon(), C.i.h.f15557d, null, new Function0() { // from class: zi.a0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return K.n.o(interfaceC5730l02);
                }
            }, 4, null);
            t1 t1VarP0 = K.p0(interfaceC5730l02);
            if (!(t1VarP0 instanceof t1.d)) {
                if (Intrinsics.e(t1VarP0, t1.a.f172762a)) {
                    AdsInputField.f(interfaceC14919W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(-1078886676, true, new a(localThemeScope, interfaceC14919W)));
                } else if (Intrinsics.e(t1VarP0, t1.b.f172763a)) {
                    AdsInputField.f(interfaceC14919W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(1883281419, true, new b(localThemeScope, interfaceC14919W)));
                } else if (Intrinsics.e(t1VarP0, t1.c.f172764a)) {
                    AdsInputField.f(interfaceC14919W.getInfoBlocks().getInformationBlock(), ComposableLambdaKt.composableLambdaInstance(550482218, true, new c(localThemeScope, interfaceC14919W)));
                } else if (Intrinsics.e(t1VarP0, t1.e.f172766a)) {
                    AdsInputField.f(interfaceC14919W.getInfoBlocks().getSuccessBlock(), ComposableLambdaKt.composableLambdaInstance(-782316983, true, new d(localThemeScope, interfaceC14919W)));
                } else {
                    if (!Intrinsics.e(t1VarP0, t1.f.f172767a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AdsInputField.f(interfaceC14919W.getInfoBlocks().getWarningBlock(), ComposableLambdaKt.composableLambdaInstance(-2115116184, true, new e(localThemeScope, interfaceC14919W)));
                }
            }
            H1.N(AdsInputField, interfaceC14919W.getIcons().getFieldIcon(), ((Boolean) interfaceC5730l0.getValue()).booleanValue() ? C.j.p.f15591d : C.j.o.f15590d, null, new Function0() { // from class: zi.b0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return K.n.p(interfaceC5730l0);
                }
            }, 4, null);
            AdsInputField.C(ComposableLambdaKt.composableLambdaInstance(1341940931, true, new f(localThemeScope)));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(InterfaceC5730l0 interfaceC5730l0) {
            K.q0(interfaceC5730l0, t1.c.f172764a);
            return Unit.f142422a;
        }

        public final void f(final InterfaceC14919W Assemble, Composer composer, int i10) {
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
                ComposerKt.U(-722658692, i11, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.PasswordInputExamples.<anonymous>.<anonymous> (AdsBasicTextField.kt:660)");
            }
            Modifier modifierH = androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, this.f172288a);
            String value = this.f172289b.getValue();
            q1.f.TextInput textInputO0 = K.o0(Assemble.getInputFields(), this.f172292e, this.f172293f);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.f(), androidx.compose.ui.text.input.a.INSTANCE.d(), null, null, null, 115, null);
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(this.f172290c);
            final InterfaceC5772o interfaceC5772o = this.f172290c;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: zi.X
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.n.g(interfaceC5772o, (InterfaceC5692y) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.f.TextInput textInputY = q1.f.TextInput.y(textInputO0, null, false, null, null, null, keyboardOptions, new C5693z(null, null, (Function1) objB, null, null, null, 59, null), false, 0, null, null, null, 3999, null);
            LocalThemeScope localThemeScope = this.f172291d;
            composer.startReplaceGroup(-1633490746);
            final InterfaceC5730l0<String> interfaceC5730l0 = this.f172289b;
            final InterfaceC5730l0<t1> interfaceC5730l02 = this.f172292e;
            Object objB2 = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB2 == companion.a()) {
                objB2 = new Function1() { // from class: zi.Y
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.n.k(interfaceC5730l0, interfaceC5730l02, (String) obj);
                    }
                };
                composer.t(objB2);
            }
            Function1 function1 = (Function1) objB2;
            composer.P();
            composer.startReplaceGroup(-1224400529);
            boolean zD2 = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f172291d);
            final InterfaceC5730l0<Boolean> interfaceC5730l03 = this.f172293f;
            final InterfaceC5730l0<t1> interfaceC5730l04 = this.f172292e;
            final LocalThemeScope localThemeScope2 = this.f172291d;
            Object objB3 = composer.B();
            if (zD2 || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: zi.Z
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.n.l(Assemble, interfaceC5730l03, interfaceC5730l04, localThemeScope2, (H1) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C18504m0.i(localThemeScope, value, textInputY, modifierH, function1, (Function1) objB3, composer, 24576, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            f(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(InterfaceC5730l0 interfaceC5730l0) {
            interfaceC5730l0.setValue(Boolean.valueOf(!((Boolean) interfaceC5730l0.getValue()).booleanValue()));
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class o implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC14794C f172305a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<String> f172306b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f172307c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.D1 f172308d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172309e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<t1> f172310f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f172311g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<String> f172312h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f172313a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f172314b;

            a(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W) {
                this.f172313a = localThemeScope;
                this.f172314b = interfaceC14919W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(744667235, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.PasswordInputExamples.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:784)");
                }
                ri.j.h(this.f172313a, this.f172314b.getLabels().getInfoBlockMessage(), "Password fields must match!", null, composer, 384, 4);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f172315a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f172316b;

            b(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W) {
                this.f172315a = localThemeScope;
                this.f172316b = interfaceC14919W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-175110718, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.PasswordInputExamples.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:790)");
                }
                ri.j.h(this.f172315a, this.f172316b.getLabels().getInfoBlockMessage(), "Passwords is too short!!", null, composer, 384, 4);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f172317a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f172318b;

            c(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W) {
                this.f172317a = localThemeScope;
                this.f172318b = interfaceC14919W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1094888671, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.PasswordInputExamples.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:796)");
                }
                ri.j.h(this.f172317a, this.f172318b.getLabels().getInfoBlockMessage(), "Password must be 8 characters", null, composer, 384, 4);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f172319a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f172320b;

            d(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W) {
                this.f172319a = localThemeScope;
                this.f172320b = interfaceC14919W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-2014666624, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.PasswordInputExamples.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:802)");
                }
                ri.j.h(this.f172319a, this.f172320b.getLabels().getInfoBlockMessage(), "Best password EVER!", null, composer, 384, 4);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class e implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f172321a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f172322b;

            e(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W) {
                this.f172321a = localThemeScope;
                this.f172322b = interfaceC14919W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1360522719, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.PasswordInputExamples.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:808)");
                }
                ri.j.h(this.f172321a, this.f172322b.getLabels().getInfoBlockMessage(), "Password is too short", null, composer, 384, 4);
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

        o(InterfaceC14794C interfaceC14794C, InterfaceC5730l0<String> interfaceC5730l0, InterfaceC5772o interfaceC5772o, androidx.compose.ui.platform.D1 d12, LocalThemeScope localThemeScope, InterfaceC5730l0<t1> interfaceC5730l02, InterfaceC5730l0<Boolean> interfaceC5730l03, InterfaceC5730l0<String> interfaceC5730l04) {
            this.f172305a = interfaceC14794C;
            this.f172306b = interfaceC5730l0;
            this.f172307c = interfaceC5772o;
            this.f172308d = d12;
            this.f172309e = localThemeScope;
            this.f172310f = interfaceC5730l02;
            this.f172311g = interfaceC5730l03;
            this.f172312h = interfaceC5730l04;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(InterfaceC5772o interfaceC5772o, androidx.compose.ui.platform.D1 d12, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, InterfaceC5730l0 interfaceC5730l03, InterfaceC5692y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            InterfaceC5772o.l(interfaceC5772o, false, 1, null);
            if (d12 != null) {
                d12.b();
            }
            K.s0(interfaceC5730l0, interfaceC5730l02, interfaceC5730l03);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, InterfaceC5730l0 interfaceC5730l03, String it) {
            Intrinsics.j(it, "it");
            interfaceC5730l0.setValue(it);
            K.n0(interfaceC5730l02, interfaceC5730l03);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC14919W interfaceC14919W, final InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC14919W.getLabels().getLabel(), "Confirm Password");
            t1 t1VarP0 = K.p0(interfaceC5730l02);
            if (!(t1VarP0 instanceof t1.d)) {
                if (Intrinsics.e(t1VarP0, t1.a.f172762a)) {
                    AdsInputField.f(interfaceC14919W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(744667235, true, new a(localThemeScope, interfaceC14919W)));
                } else if (Intrinsics.e(t1VarP0, t1.b.f172763a)) {
                    AdsInputField.f(interfaceC14919W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(-175110718, true, new b(localThemeScope, interfaceC14919W)));
                } else if (Intrinsics.e(t1VarP0, t1.c.f172764a)) {
                    AdsInputField.f(interfaceC14919W.getInfoBlocks().getInformationBlock(), ComposableLambdaKt.composableLambdaInstance(-1094888671, true, new c(localThemeScope, interfaceC14919W)));
                } else if (Intrinsics.e(t1VarP0, t1.e.f172766a)) {
                    AdsInputField.f(interfaceC14919W.getInfoBlocks().getSuccessBlock(), ComposableLambdaKt.composableLambdaInstance(-2014666624, true, new d(localThemeScope, interfaceC14919W)));
                } else {
                    if (!Intrinsics.e(t1VarP0, t1.f.f172767a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AdsInputField.f(interfaceC14919W.getInfoBlocks().getWarningBlock(), ComposableLambdaKt.composableLambdaInstance(1360522719, true, new e(localThemeScope, interfaceC14919W)));
                }
            }
            H1.N(AdsInputField, interfaceC14919W.getIcons().getFieldIcon(), ((Boolean) interfaceC5730l0.getValue()).booleanValue() ? C.j.p.f15591d : C.j.o.f15590d, null, new Function0() { // from class: zi.f0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return K.o.l(interfaceC5730l0);
                }
            }, 4, null);
            return Unit.f142422a;
        }

        public final void e(final InterfaceC14919W Assemble, Composer composer, int i10) {
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
                ComposerKt.U(-517623821, i11, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.PasswordInputExamples.<anonymous>.<anonymous> (AdsBasicTextField.kt:755)");
            }
            Modifier modifierH = androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, this.f172305a);
            String value = this.f172306b.getValue();
            q1.f.TextInput textInputO0 = K.o0(Assemble.getInputFields(), this.f172310f, this.f172311g);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.f(), androidx.compose.ui.text.input.a.INSTANCE.c(), null, null, null, 115, null);
            composer.startReplaceGroup(-1224400529);
            boolean zD = composer.D(this.f172307c) | composer.V(this.f172308d);
            final InterfaceC5772o interfaceC5772o = this.f172307c;
            final androidx.compose.ui.platform.D1 d12 = this.f172308d;
            final InterfaceC5730l0<String> interfaceC5730l0 = this.f172312h;
            final InterfaceC5730l0<String> interfaceC5730l02 = this.f172306b;
            final InterfaceC5730l0<t1> interfaceC5730l03 = this.f172310f;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                Function1 function1 = new Function1() { // from class: zi.c0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.o.f(interfaceC5772o, d12, interfaceC5730l0, interfaceC5730l02, interfaceC5730l03, (InterfaceC5692y) obj);
                    }
                };
                composer.t(function1);
                objB = function1;
            }
            composer.P();
            q1.f.TextInput textInputY = q1.f.TextInput.y(textInputO0, null, false, null, null, null, keyboardOptions, new C5693z(null, (Function1) objB, null, null, null, null, 61, null), false, 0, null, null, null, 3999, null);
            LocalThemeScope localThemeScope = this.f172309e;
            composer.startReplaceGroup(-1746271574);
            final InterfaceC5730l0<String> interfaceC5730l04 = this.f172306b;
            final InterfaceC5730l0<String> interfaceC5730l05 = this.f172312h;
            final InterfaceC5730l0<t1> interfaceC5730l06 = this.f172310f;
            Object objB2 = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB2 == companion.a()) {
                objB2 = new Function1() { // from class: zi.d0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.o.g(interfaceC5730l04, interfaceC5730l05, interfaceC5730l06, (String) obj);
                    }
                };
                composer.t(objB2);
            }
            Function1 function12 = (Function1) objB2;
            composer.P();
            composer.startReplaceGroup(-1224400529);
            boolean zD2 = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f172309e);
            final InterfaceC5730l0<Boolean> interfaceC5730l07 = this.f172311g;
            final InterfaceC5730l0<t1> interfaceC5730l08 = this.f172310f;
            final LocalThemeScope localThemeScope2 = this.f172309e;
            Object objB3 = composer.B();
            if (zD2 || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: zi.e0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.o.k(Assemble, interfaceC5730l07, interfaceC5730l08, localThemeScope2, (H1) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C18504m0.i(localThemeScope, value, textInputY, modifierH, function12, (Function1) objB3, composer, 24576, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            e(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InterfaceC5730l0 interfaceC5730l0) {
            interfaceC5730l0.setValue(Boolean.valueOf(!((Boolean) interfaceC5730l0.getValue()).booleanValue()));
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class p extends FunctionReferenceImpl implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<String> f172323b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<String> f172324c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<t1> f172325d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(InterfaceC5730l0<String> interfaceC5730l0, InterfaceC5730l0<String> interfaceC5730l02, InterfaceC5730l0<t1> interfaceC5730l03) {
            super(0, Intrinsics.Kotlin.class, "submit", "PasswordInputExamples$submit(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V", 0);
            this.f172323b = interfaceC5730l0;
            this.f172324c = interfaceC5730l02;
            this.f172325d = interfaceC5730l03;
        }

        public final void a() {
            K.s0(this.f172323b, this.f172324c, this.f172325d);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.android_acres_library.composables.form_fields.AdsBasicTextFieldKt$TextInputExamples$1$15$1$1", f = "AdsBasicTextField.kt", l = {576, 576}, m = "invokeSuspend")
    static final class q extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f172326a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172327b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(LocalThemeScope localThemeScope, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f172327b = localThemeScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new q(this.f172327b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((q) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (Gi.i.i((Gi.i) r0, "Label Icon Clicked", null, null, false, null, null, null, null, r13, 254, null) == r12) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r13.f172326a
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L1f
                if (r0 == r2) goto L1a
                if (r0 != r1) goto L12
                kotlin.ResultKt.b(r14)
                goto L51
            L12:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1a:
                kotlin.ResultKt.b(r14)
                r0 = r14
                goto L39
            L1f:
                kotlin.ResultKt.b(r14)
                Ji.M r0 = r13.f172327b
                Ji.E r3 = r0.getAdsSpacing()
                Ji.V r3 = r3.getFive()
                float r3 = r3.getDp()
                r13.f172326a = r2
                java.lang.Object r0 = r0.f(r3, r13)
                if (r0 != r12) goto L39
                goto L50
            L39:
                Gi.i r0 = (Gi.i) r0
                r13.f172326a = r1
                java.lang.String r1 = "Label Icon Clicked"
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r10 = 254(0xfe, float:3.56E-43)
                r11 = 0
                r9 = r13
                java.lang.Object r0 = Gi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r0 != r12) goto L51
            L50:
                return r12
            L51:
                kotlin.Unit r0 = kotlin.Unit.f142422a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zi.K.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.android_acres_library.composables.form_fields.AdsBasicTextFieldKt$TextInputExamples$1$16$1$1", f = "AdsBasicTextField.kt", l = {579, 579}, m = "invokeSuspend")
    static final class r extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f172328a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172329b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(LocalThemeScope localThemeScope, Continuation<? super r> continuation) {
            super(2, continuation);
            this.f172329b = localThemeScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new r(this.f172329b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((r) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (Gi.i.i((Gi.i) r0, "Complex Leading Icon Clicked", null, null, false, null, null, null, null, r13, 254, null) == r12) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r13.f172328a
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L1f
                if (r0 == r2) goto L1a
                if (r0 != r1) goto L12
                kotlin.ResultKt.b(r14)
                goto L51
            L12:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1a:
                kotlin.ResultKt.b(r14)
                r0 = r14
                goto L39
            L1f:
                kotlin.ResultKt.b(r14)
                Ji.M r0 = r13.f172329b
                Ji.E r3 = r0.getAdsSpacing()
                Ji.V r3 = r3.getFive()
                float r3 = r3.getDp()
                r13.f172328a = r2
                java.lang.Object r0 = r0.f(r3, r13)
                if (r0 != r12) goto L39
                goto L50
            L39:
                Gi.i r0 = (Gi.i) r0
                r13.f172328a = r1
                java.lang.String r1 = "Complex Leading Icon Clicked"
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r10 = 254(0xfe, float:3.56E-43)
                r11 = 0
                r9 = r13
                java.lang.Object r0 = Gi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r0 != r12) goto L51
            L50:
                return r12
            L51:
                kotlin.Unit r0 = kotlin.Unit.f142422a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zi.K.r.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.android_acres_library.composables.form_fields.AdsBasicTextFieldKt$TextInputExamples$1$17$1$1", f = "AdsBasicTextField.kt", l = {582, 582}, m = "invokeSuspend")
    static final class s extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f172330a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172331b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(LocalThemeScope localThemeScope, Continuation<? super s> continuation) {
            super(2, continuation);
            this.f172331b = localThemeScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new s(this.f172331b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((s) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (Gi.i.i((Gi.i) r0, "Trailing Icon Clicked", null, null, false, null, null, null, null, r13, 254, null) == r12) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r13.f172330a
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L1f
                if (r0 == r2) goto L1a
                if (r0 != r1) goto L12
                kotlin.ResultKt.b(r14)
                goto L51
            L12:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1a:
                kotlin.ResultKt.b(r14)
                r0 = r14
                goto L39
            L1f:
                kotlin.ResultKt.b(r14)
                Ji.M r0 = r13.f172331b
                Ji.E r3 = r0.getAdsSpacing()
                Ji.V r3 = r3.getFive()
                float r3 = r3.getDp()
                r13.f172330a = r2
                java.lang.Object r0 = r0.f(r3, r13)
                if (r0 != r12) goto L39
                goto L50
            L39:
                Gi.i r0 = (Gi.i) r0
                r13.f172330a = r1
                java.lang.String r1 = "Trailing Icon Clicked"
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r10 = 254(0xfe, float:3.56E-43)
                r11 = 0
                r9 = r13
                java.lang.Object r0 = Gi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r0 != r12) goto L51
            L50:
                return r12
            L51:
                kotlin.Unit r0 = kotlin.Unit.f142422a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zi.K.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.android_acres_library.composables.form_fields.AdsBasicTextFieldKt$TextInputExamples$1$19$1$1", f = "AdsBasicTextField.kt", l = {593, 593}, m = "invokeSuspend")
    static final class t extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f172332a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172333b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(LocalThemeScope localThemeScope, Continuation<? super t> continuation) {
            super(2, continuation);
            this.f172333b = localThemeScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new t(this.f172333b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((t) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (Gi.i.i((Gi.i) r0, "Label Icon Clicked", null, null, false, null, null, null, null, r13, 254, null) == r12) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r13.f172332a
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L1f
                if (r0 == r2) goto L1a
                if (r0 != r1) goto L12
                kotlin.ResultKt.b(r14)
                goto L51
            L12:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1a:
                kotlin.ResultKt.b(r14)
                r0 = r14
                goto L39
            L1f:
                kotlin.ResultKt.b(r14)
                Ji.M r0 = r13.f172333b
                Ji.E r3 = r0.getAdsSpacing()
                Ji.V r3 = r3.getFive()
                float r3 = r3.getDp()
                r13.f172332a = r2
                java.lang.Object r0 = r0.f(r3, r13)
                if (r0 != r12) goto L39
                goto L50
            L39:
                Gi.i r0 = (Gi.i) r0
                r13.f172332a = r1
                java.lang.String r1 = "Label Icon Clicked"
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r10 = 254(0xfe, float:3.56E-43)
                r11 = 0
                r9 = r13
                java.lang.Object r0 = Gi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r0 != r12) goto L51
            L50:
                return r12
            L51:
                kotlin.Unit r0 = kotlin.Unit.f142422a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zi.K.t.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.android_acres_library.composables.form_fields.AdsBasicTextFieldKt$TextInputExamples$1$20$1$1", f = "AdsBasicTextField.kt", l = {596, 596}, m = "invokeSuspend")
    static final class u extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f172334a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172335b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(LocalThemeScope localThemeScope, Continuation<? super u> continuation) {
            super(2, continuation);
            this.f172335b = localThemeScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new u(this.f172335b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((u) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (Gi.i.i((Gi.i) r0, "Error Leading Icon Clicked", null, null, false, null, null, null, null, r13, 254, null) == r12) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r13.f172334a
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L1f
                if (r0 == r2) goto L1a
                if (r0 != r1) goto L12
                kotlin.ResultKt.b(r14)
                goto L51
            L12:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1a:
                kotlin.ResultKt.b(r14)
                r0 = r14
                goto L39
            L1f:
                kotlin.ResultKt.b(r14)
                Ji.M r0 = r13.f172335b
                Ji.E r3 = r0.getAdsSpacing()
                Ji.V r3 = r3.getFive()
                float r3 = r3.getDp()
                r13.f172334a = r2
                java.lang.Object r0 = r0.f(r3, r13)
                if (r0 != r12) goto L39
                goto L50
            L39:
                Gi.i r0 = (Gi.i) r0
                r13.f172334a = r1
                java.lang.String r1 = "Error Leading Icon Clicked"
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r10 = 254(0xfe, float:3.56E-43)
                r11 = 0
                r9 = r13
                java.lang.Object r0 = Gi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r0 != r12) goto L51
            L50:
                return r12
            L51:
                kotlin.Unit r0 = kotlin.Unit.f142422a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zi.K.u.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.android_acres_library.composables.form_fields.AdsBasicTextFieldKt$TextInputExamples$1$4$1$1", f = "AdsBasicTextField.kt", l = {523, 523}, m = "invokeSuspend")
    static final class v extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f172336a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172337b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(LocalThemeScope localThemeScope, Continuation<? super v> continuation) {
            super(2, continuation);
            this.f172337b = localThemeScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new v(this.f172337b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((v) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (Gi.i.i((Gi.i) r0, "Info Clicked", null, null, false, null, null, null, null, r13, 254, null) == r12) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r13.f172336a
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L1f
                if (r0 == r2) goto L1a
                if (r0 != r1) goto L12
                kotlin.ResultKt.b(r14)
                goto L51
            L12:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1a:
                kotlin.ResultKt.b(r14)
                r0 = r14
                goto L39
            L1f:
                kotlin.ResultKt.b(r14)
                Ji.M r0 = r13.f172337b
                Ji.E r3 = r0.getAdsSpacing()
                Ji.V r3 = r3.getFive()
                float r3 = r3.getDp()
                r13.f172336a = r2
                java.lang.Object r0 = r0.f(r3, r13)
                if (r0 != r12) goto L39
                goto L50
            L39:
                Gi.i r0 = (Gi.i) r0
                r13.f172336a = r1
                java.lang.String r1 = "Info Clicked"
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r10 = 254(0xfe, float:3.56E-43)
                r11 = 0
                r9 = r13
                java.lang.Object r0 = Gi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r0 != r12) goto L51
            L50:
                return r12
            L51:
                kotlin.Unit r0 = kotlin.Unit.f142422a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zi.K.v.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.android_acres_library.composables.form_fields.AdsBasicTextFieldKt$TextInputExamples$1$6$1$1", f = "AdsBasicTextField.kt", l = {532, 532}, m = "invokeSuspend")
    static final class w extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f172338a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172339b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(LocalThemeScope localThemeScope, Continuation<? super w> continuation) {
            super(2, continuation);
            this.f172339b = localThemeScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new w(this.f172339b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((w) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (Gi.i.i((Gi.i) r0, "Trailing Icon Clicked", null, null, false, null, null, null, null, r13, 254, null) == r12) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r13.f172338a
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L1f
                if (r0 == r2) goto L1a
                if (r0 != r1) goto L12
                kotlin.ResultKt.b(r14)
                goto L51
            L12:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1a:
                kotlin.ResultKt.b(r14)
                r0 = r14
                goto L39
            L1f:
                kotlin.ResultKt.b(r14)
                Ji.M r0 = r13.f172339b
                Ji.E r3 = r0.getAdsSpacing()
                Ji.V r3 = r3.getFive()
                float r3 = r3.getDp()
                r13.f172338a = r2
                java.lang.Object r0 = r0.f(r3, r13)
                if (r0 != r12) goto L39
                goto L50
            L39:
                Gi.i r0 = (Gi.i) r0
                r13.f172338a = r1
                java.lang.String r1 = "Trailing Icon Clicked"
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r10 = 254(0xfe, float:3.56E-43)
                r11 = 0
                r9 = r13
                java.lang.Object r0 = Gi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r0 != r12) goto L51
            L50:
                return r12
            L51:
                kotlin.Unit r0 = kotlin.Unit.f142422a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zi.K.w.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.android_acres_library.composables.form_fields.AdsBasicTextFieldKt$TextInputExamples$1$8$1$1", f = "AdsBasicTextField.kt", l = {541, 541}, m = "invokeSuspend")
    static final class x extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f172340a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172341b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(LocalThemeScope localThemeScope, Continuation<? super x> continuation) {
            super(2, continuation);
            this.f172341b = localThemeScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new x(this.f172341b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((x) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (Gi.i.i((Gi.i) r0, "Default Leading Icon Clicked", null, null, false, null, null, null, null, r13, 254, null) == r12) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r13.f172340a
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L1f
                if (r0 == r2) goto L1a
                if (r0 != r1) goto L12
                kotlin.ResultKt.b(r14)
                goto L51
            L12:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1a:
                kotlin.ResultKt.b(r14)
                r0 = r14
                goto L39
            L1f:
                kotlin.ResultKt.b(r14)
                Ji.M r0 = r13.f172341b
                Ji.E r3 = r0.getAdsSpacing()
                Ji.V r3 = r3.getFive()
                float r3 = r3.getDp()
                r13.f172340a = r2
                java.lang.Object r0 = r0.f(r3, r13)
                if (r0 != r12) goto L39
                goto L50
            L39:
                Gi.i r0 = (Gi.i) r0
                r13.f172340a = r1
                java.lang.String r1 = "Default Leading Icon Clicked"
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r10 = 254(0xfe, float:3.56E-43)
                r11 = 0
                r9 = r13
                java.lang.Object r0 = Gi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r0 != r12) goto L51
            L50:
                return r12
            L51:
                kotlin.Unit r0 = kotlin.Unit.f142422a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zi.K.x.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void K(zi.InterfaceC18489g1<java.lang.String, kotlin.Unit> r16, androidx.compose.ui.Modifier r17, androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zi.K.K(zi.g1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(InterfaceC18489g1 interfaceC18489g1, String value) {
        Intrinsics.j(value, "value");
        Function2 function2A = interfaceC18489g1.A();
        Unit unit = Unit.f142422a;
        function2A.invoke(value, unit);
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(InterfaceC18489g1 interfaceC18489g1, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        K(interfaceC18489g1, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void O(final LocalThemeScope localThemeScope, final String value, Modifier modifier, final Function1<? super String, Unit> onValueChange, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(value, "value");
        Intrinsics.j(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(132768603);
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
                ComposerKt.U(132768603, i12, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputDefaultBlank (AdsBasicTextField.kt:133)");
            }
            Ji.Q.e(localThemeScope, ji.L0.f139675a, ComposableLambdaKt.c(845684624, true, new b(localThemeScope, value, modifier, onValueChange), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: zi.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K.P(localThemeScope, value, modifier2, onValueChange, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        O(localThemeScope, str, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void Q(final LocalThemeScope localThemeScope, final String value, Modifier modifier, final Function1<? super String, Unit> onValueChange, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(value, "value");
        Intrinsics.j(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(750195776);
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
                ComposerKt.U(750195776, i12, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputDefaultBlankPlaceholder (AdsBasicTextField.kt:149)");
            }
            Ji.Q.e(localThemeScope, ji.L0.f139675a, ComposableLambdaKt.c(1644336363, true, new c(localThemeScope, value, modifier, onValueChange), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: zi.C
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K.R(localThemeScope, value, modifier2, onValueChange, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        Q(localThemeScope, str, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void S(final LocalThemeScope localThemeScope, final String value, Modifier modifier, final Function1<? super String, Unit> onValueChange, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(value, "value");
        Intrinsics.j(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(363008548);
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
                ComposerKt.U(363008548, i12, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputDefaultBlankPlaceholderDisabled (AdsBasicTextField.kt:167)");
            }
            Ji.Q.e(localThemeScope, ji.L0.f139675a, ComposableLambdaKt.c(287619023, true, new d(localThemeScope, value, modifier, onValueChange), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: zi.x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K.T(localThemeScope, value, modifier2, onValueChange, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S0(InterfaceC5730l0 interfaceC5730l0, String it) {
        Intrinsics.j(it, "it");
        v0(interfaceC5730l0, it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        S(localThemeScope, str, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T0(InterfaceC5730l0 interfaceC5730l0, String it) {
        Intrinsics.j(it, "it");
        x0(interfaceC5730l0, it);
        return Unit.f142422a;
    }

    public static final void U(final LocalThemeScope localThemeScope, final String value, Modifier modifier, final Function1<? super String, Unit> onValueChange, final Function0<Unit> onLabelIconClick, final Function0<Unit> onLeadingIconClick, final Function0<Unit> onTrailingIconClick, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(value, "value");
        Intrinsics.j(onValueChange, "onValueChange");
        Intrinsics.j(onLabelIconClick, "onLabelIconClick");
        Intrinsics.j(onLeadingIconClick, "onLeadingIconClick");
        Intrinsics.j(onTrailingIconClick, "onTrailingIconClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1160390569);
        if ((i11 & Integer.MIN_VALUE) != 0) {
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
        if ((i11 & 8) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.D(onLabelIconClick) ? 16384 : 8192;
        }
        if ((i11 & 16) != 0) {
            i12 |= 196608;
        } else if ((i10 & 196608) == 0) {
            i12 |= composerStartRestartGroup.D(onLeadingIconClick) ? 131072 : 65536;
        }
        if ((i11 & 32) != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            i12 |= composerStartRestartGroup.D(onTrailingIconClick) ? 1048576 : 524288;
        }
        int i14 = i12;
        if ((599187 & i14) == 599186 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
        } else {
            modifier2 = i13 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(-1160390569, i14, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputDefaultEverythingComplexModifier (AdsBasicTextField.kt:386)");
            }
            Ji.Q.e(localThemeScope, ji.L0.f139675a, ComposableLambdaKt.c(-1600504500, true, new e(localThemeScope, value, modifier2, onValueChange, onLabelIconClick, onLeadingIconClick, onTrailingIconClick), composerStartRestartGroup, 54), composerStartRestartGroup, (i14 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: zi.y
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K.V(localThemeScope, value, modifier2, onValueChange, onLabelIconClick, onLeadingIconClick, onTrailingIconClick, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U0(InterfaceC5730l0 interfaceC5730l0, String it) {
        Intrinsics.j(it, "it");
        z0(interfaceC5730l0, it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1 function1, Function0 function0, Function0 function02, Function0 function03, int i10, int i11, Composer composer, int i12) {
        U(localThemeScope, str, modifier, function1, function0, function02, function03, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V0(InterfaceC16622O interfaceC16622O, LocalThemeScope localThemeScope) {
        C16648k.d(interfaceC16622O, null, null, new v(localThemeScope, null), 3, null);
        return Unit.f142422a;
    }

    public static final void W(final LocalThemeScope localThemeScope, final String value, Modifier modifier, final Function1<? super String, Unit> onValueChange, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(value, "value");
        Intrinsics.j(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-833188848);
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
                ComposerKt.U(-833188848, i12, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputDefaultInfoBlock (AdsBasicTextField.kt:352)");
            }
            Ji.Q.e(localThemeScope, ji.L0.f139675a, ComposableLambdaKt.c(-633231931, true, new f(localThemeScope, value, modifier, onValueChange), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: zi.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K.X(localThemeScope, value, modifier2, onValueChange, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W0(InterfaceC5730l0 interfaceC5730l0, String it) {
        Intrinsics.j(it, "it");
        B0(interfaceC5730l0, it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        W(localThemeScope, str, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X0(InterfaceC16622O interfaceC16622O, LocalThemeScope localThemeScope) {
        C16648k.d(interfaceC16622O, null, null, new w(localThemeScope, null), 3, null);
        return Unit.f142422a;
    }

    public static final void Y(final LocalThemeScope localThemeScope, final String value, Modifier modifier, final Function0<Unit> onInfoClick, final Function1<? super String, Unit> onValueChange, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(value, "value");
        Intrinsics.j(onInfoClick, "onInfoClick");
        Intrinsics.j(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(856979318);
        if ((i11 & Integer.MIN_VALUE) != 0) {
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
            i12 |= composerStartRestartGroup.D(onInfoClick) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 8) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.D(onValueChange) ? 16384 : 8192;
        }
        int i14 = i12;
        if ((i14 & 9363) == 9362 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            modifier2 = modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(856979318, i14, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputDefaultLabelIcon (AdsBasicTextField.kt:186)");
            }
            Ji.Q.e(localThemeScope, ji.L0.f139675a, ComposableLambdaKt.c(812036843, true, new g(localThemeScope, value, modifier2, onValueChange, onInfoClick), composerStartRestartGroup, 54), composerStartRestartGroup, (i14 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: zi.B
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K.Z(localThemeScope, value, modifier2, onInfoClick, onValueChange, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y0(InterfaceC5730l0 interfaceC5730l0, String it) {
        Intrinsics.j(it, "it");
        D0(interfaceC5730l0, it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(LocalThemeScope localThemeScope, String str, Modifier modifier, Function0 function0, Function1 function1, int i10, int i11, Composer composer, int i12) {
        Y(localThemeScope, str, modifier, function0, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z0(InterfaceC16622O interfaceC16622O, LocalThemeScope localThemeScope) {
        C16648k.d(interfaceC16622O, null, null, new x(localThemeScope, null), 3, null);
        return Unit.f142422a;
    }

    public static final void a0(final LocalThemeScope localThemeScope, final String value, Modifier modifier, final Function0<Unit> onIconClick, final Function1<? super String, Unit> onValueChange, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(value, "value");
        Intrinsics.j(onIconClick, "onIconClick");
        Intrinsics.j(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(745730596);
        if ((i11 & Integer.MIN_VALUE) != 0) {
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
            i12 |= composerStartRestartGroup.D(onIconClick) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 8) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.D(onValueChange) ? 16384 : 8192;
        }
        int i14 = i12;
        if ((i14 & 9363) == 9362 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            modifier2 = modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(745730596, i14, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputDefaultLeadingIcon (AdsBasicTextField.kt:235)");
            }
            Ji.Q.e(localThemeScope, ji.L0.f139675a, ComposableLambdaKt.c(505685081, true, new h(localThemeScope, value, modifier2, onValueChange, onIconClick), composerStartRestartGroup, 54), composerStartRestartGroup, (i14 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: zi.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K.b0(localThemeScope, value, modifier2, onIconClick, onValueChange, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a1(InterfaceC5730l0 interfaceC5730l0, String it) {
        Intrinsics.j(it, "it");
        F0(interfaceC5730l0, it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0(LocalThemeScope localThemeScope, String str, Modifier modifier, Function0 function0, Function1 function1, int i10, int i11, Composer composer, int i12) {
        a0(localThemeScope, str, modifier, function0, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b1(InterfaceC5730l0 interfaceC5730l0, String it) {
        Intrinsics.j(it, "it");
        H0(interfaceC5730l0, it);
        return Unit.f142422a;
    }

    public static final void c0(final LocalThemeScope localThemeScope, final String value, Modifier modifier, final Function0<Unit> onIconClick, final Function1<? super String, Unit> onValueChange, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(value, "value");
        Intrinsics.j(onIconClick, "onIconClick");
        Intrinsics.j(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(1791449214);
        if ((i11 & Integer.MIN_VALUE) != 0) {
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
            i12 |= composerStartRestartGroup.D(onIconClick) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 8) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.D(onValueChange) ? 16384 : 8192;
        }
        int i14 = i12;
        if ((i14 & 9363) == 9362 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            modifier2 = modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(1791449214, i14, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputDefaultTrailingIcon (AdsBasicTextField.kt:210)");
            }
            Ji.Q.e(localThemeScope, ji.L0.f139675a, ComposableLambdaKt.c(-1354994455, true, new i(localThemeScope, value, modifier2, onValueChange, onIconClick), composerStartRestartGroup, 54), composerStartRestartGroup, (i14 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: zi.z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K.d0(localThemeScope, value, modifier2, onIconClick, onValueChange, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c1(InterfaceC5730l0 interfaceC5730l0, String it) {
        Intrinsics.j(it, "it");
        J0(interfaceC5730l0, it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d0(LocalThemeScope localThemeScope, String str, Modifier modifier, Function0 function0, Function1 function1, int i10, int i11, Composer composer, int i12) {
        c0(localThemeScope, str, modifier, function0, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d1(InterfaceC5730l0 interfaceC5730l0, String it) {
        Intrinsics.j(it, "it");
        L0(interfaceC5730l0, it);
        return Unit.f142422a;
    }

    public static final void e0(final LocalThemeScope localThemeScope, final String value, Modifier modifier, final Function1<? super String, Unit> onValueChange, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(value, "value");
        Intrinsics.j(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1350541480);
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
                ComposerKt.U(-1350541480, i12, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputError (AdsBasicTextField.kt:259)");
            }
            Ji.Q.e(localThemeScope, ji.L0.f139675a, ComposableLambdaKt.c(-1209776957, true, new j(localThemeScope, value, modifier, onValueChange), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: zi.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K.f0(localThemeScope, value, modifier2, onValueChange, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e1(InterfaceC5730l0 interfaceC5730l0, String it) {
        Intrinsics.j(it, "it");
        N0(interfaceC5730l0, it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f0(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        e0(localThemeScope, str, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f1(InterfaceC5730l0 interfaceC5730l0, String it) {
        Intrinsics.j(it, "it");
        P0(interfaceC5730l0, it);
        return Unit.f142422a;
    }

    public static final void g0(final LocalThemeScope localThemeScope, final String value, Modifier modifier, final Function1<? super String, Unit> onValueChange, final Function0<Unit> onLabelIconClick, final Function0<Unit> onLeadingIconClick, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(value, "value");
        Intrinsics.j(onValueChange, "onValueChange");
        Intrinsics.j(onLabelIconClick, "onLabelIconClick");
        Intrinsics.j(onLeadingIconClick, "onLeadingIconClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1307236502);
        if ((i11 & Integer.MIN_VALUE) != 0) {
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
        if ((i11 & 8) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.D(onLabelIconClick) ? 16384 : 8192;
        }
        if ((i11 & 16) != 0) {
            i12 |= 196608;
        } else if ((i10 & 196608) == 0) {
            i12 |= composerStartRestartGroup.D(onLeadingIconClick) ? 131072 : 65536;
        }
        int i14 = i12;
        if ((74899 & i14) == 74898 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            modifier2 = modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(-1307236502, i14, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputErrorEverythingComplexModifier (AdsBasicTextField.kt:439)");
            }
            Ji.Q.e(localThemeScope, ji.L0.f139675a, ComposableLambdaKt.c(-449211425, true, new k(localThemeScope, value, modifier2, onValueChange, onLabelIconClick, onLeadingIconClick), composerStartRestartGroup, 54), composerStartRestartGroup, (i14 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: zi.A
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K.h0(localThemeScope, value, modifier2, onValueChange, onLabelIconClick, onLeadingIconClick, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g1(InterfaceC16622O interfaceC16622O, LocalThemeScope localThemeScope) {
        C16648k.d(interfaceC16622O, null, null, new q(localThemeScope, null), 3, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1 function1, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        g0(localThemeScope, str, modifier, function1, function0, function02, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h1(InterfaceC16622O interfaceC16622O, LocalThemeScope localThemeScope) {
        C16648k.d(interfaceC16622O, null, null, new r(localThemeScope, null), 3, null);
        return Unit.f142422a;
    }

    public static final void i0(final LocalThemeScope localThemeScope, final String value, Modifier modifier, final Function1<? super String, Unit> onValueChange, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(value, "value");
        Intrinsics.j(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1292486403);
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
                ComposerKt.U(-1292486403, i12, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputSuccess (AdsBasicTextField.kt:321)");
            }
            Ji.Q.e(localThemeScope, ji.L0.f139675a, ComposableLambdaKt.c(838234024, true, new l(localThemeScope, value, modifier, onValueChange), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: zi.v
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K.j0(localThemeScope, value, modifier2, onValueChange, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i1(InterfaceC16622O interfaceC16622O, LocalThemeScope localThemeScope) {
        C16648k.d(interfaceC16622O, null, null, new s(localThemeScope, null), 3, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        i0(localThemeScope, str, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j1(InterfaceC5730l0 interfaceC5730l0, String it) {
        Intrinsics.j(it, "it");
        R0(interfaceC5730l0, it);
        return Unit.f142422a;
    }

    public static final void k0(final LocalThemeScope localThemeScope, final String value, Modifier modifier, final Function1<? super String, Unit> onValueChange, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(value, "value");
        Intrinsics.j(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1511970812);
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
                ComposerKt.U(-1511970812, i12, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputWarning (AdsBasicTextField.kt:290)");
            }
            Ji.Q.e(localThemeScope, ji.L0.f139675a, ComposableLambdaKt.c(618749615, true, new m(localThemeScope, value, modifier, onValueChange), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: zi.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K.l0(localThemeScope, value, modifier2, onValueChange, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k1(InterfaceC16622O interfaceC16622O, LocalThemeScope localThemeScope) {
        C16648k.d(interfaceC16622O, null, null, new t(localThemeScope, null), 3, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        k0(localThemeScope, str, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l1(InterfaceC16622O interfaceC16622O, LocalThemeScope localThemeScope) {
        C16648k.d(interfaceC16622O, null, null, new u(localThemeScope, null), 3, null);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m0(Ji.LocalThemeScope r28, androidx.compose.ui.Modifier r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zi.K.m0(Ji.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m1(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        t0(localThemeScope, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r0(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        m0(localThemeScope, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:250:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void t0(final Ji.LocalThemeScope r35, androidx.compose.ui.Modifier r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 1792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zi.K.t0(Ji.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final String A0(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final void B0(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    private static final String C0(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final void D0(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    private static final String E0(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final void F0(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    private static final String G0(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final void H0(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    private static final String I0(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final void J0(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    private static final String K0(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean L(androidx.compose.runtime.z1<Boolean> z1Var) {
        return z1Var.getValue().booleanValue();
    }

    private static final void L0(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    private static final String M0(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final void N0(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    private static final String O0(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final void P0(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    private static final String Q0(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final void R0(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(InterfaceC5730l0<String> interfaceC5730l0, InterfaceC5730l0<t1> interfaceC5730l02) {
        t1 t1Var;
        int length = interfaceC5730l0.getValue().length();
        if (1 <= length && length < 8) {
            t1Var = t1.f.f172767a;
        } else {
            t1Var = t1.d.f172765a;
        }
        q0(interfaceC5730l02, t1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q1.f.TextInput o0(DefaultTextInputs defaultTextInputs, InterfaceC5730l0<t1> interfaceC5730l0, InterfaceC5730l0<Boolean> interfaceC5730l02) {
        q1.f.TextInput warning;
        z1.W g10;
        t1 t1VarP0 = p0(interfaceC5730l0);
        if (t1VarP0 instanceof t1.d) {
            warning = defaultTextInputs.getDefault();
        } else if (Intrinsics.e(t1VarP0, t1.a.f172762a) || Intrinsics.e(t1VarP0, t1.b.f172763a)) {
            warning = defaultTextInputs.getError();
        } else if (Intrinsics.e(t1VarP0, t1.c.f172764a)) {
            warning = defaultTextInputs.getDefault();
        } else if (Intrinsics.e(t1VarP0, t1.e.f172766a)) {
            warning = defaultTextInputs.getSuccess();
        } else if (Intrinsics.e(t1VarP0, t1.f.f172767a)) {
            warning = defaultTextInputs.getWarning();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        q1.f.TextInput textInput = warning;
        if (interfaceC5730l02.getValue().booleanValue()) {
            g10 = z1.W.INSTANCE.c();
        } else {
            g10 = new z1.G((char) 0, 1, null);
        }
        return q1.f.TextInput.y(textInput, null, false, null, null, g10, null, null, false, 0, null, null, null, 4079, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t1 p0(InterfaceC5730l0<t1> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q0(InterfaceC5730l0<t1> interfaceC5730l0, t1 t1Var) {
        interfaceC5730l0.setValue(t1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(InterfaceC5730l0<String> interfaceC5730l0, InterfaceC5730l0<String> interfaceC5730l02, InterfaceC5730l0<t1> interfaceC5730l03) {
        t1 t1Var;
        if (interfaceC5730l0.getValue().length() < 8) {
            t1Var = t1.b.f172763a;
        } else if (!Intrinsics.e(interfaceC5730l0.getValue(), interfaceC5730l02.getValue())) {
            t1Var = t1.a.f172762a;
        } else {
            t1Var = t1.e.f172766a;
        }
        q0(interfaceC5730l03, t1Var);
    }

    private static final String u0(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final void v0(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    private static final String w0(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final void x0(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    private static final String y0(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final void z0(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }
}
