package Ai;

import Ai.K;
import Ai.t1;
import Ki.C;
import Ki.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.text.C5835z;
import androidx.compose.foundation.text.InterfaceC5834y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5905f;
import androidx.compose.ui.focus.InterfaceC5914o;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.recyclerview.widget.RecyclerView;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13572f;
import d0.C13590y;
import j0.C14889J;
import j0.C14903g;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import java.util.Arrays;
import ji.C15040a;
import ki.DefaultTextInputs;
import ki.InterfaceC15153W;
import ki.q1;
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
import mv.C15809k;
import mv.InterfaceC15783O;
import p1.C16335d;
import qi.C16671b;
import qi.C16673d;
import r0.C16806i;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0005\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\u000b\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\r\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\tH\u0001¢\u0006\u0004\b\r\u0010\f\u001a9\u0010\u000e\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\tH\u0001¢\u0006\u0004\b\u000e\u0010\f\u001aG\u0010\u0011\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\tH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aG\u0010\u0014\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\tH\u0001¢\u0006\u0004\b\u0014\u0010\u0012\u001aG\u0010\u0015\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\tH\u0001¢\u0006\u0004\b\u0015\u0010\u0012\u001a9\u0010\u0016\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\tH\u0001¢\u0006\u0004\b\u0016\u0010\f\u001a9\u0010\u0017\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\tH\u0001¢\u0006\u0004\b\u0017\u0010\f\u001a9\u0010\u0018\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\tH\u0001¢\u0006\u0004\b\u0018\u0010\f\u001a9\u0010\u0019\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\tH\u0001¢\u0006\u0004\b\u0019\u0010\f\u001ac\u0010\u001d\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001aU\u0010\u001f\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0001¢\u0006\u0004\b\u001f\u0010 \u001a\u001d\u0010!\u001a\u00020\u0002*\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b!\u0010\"\u001a\u001d\u0010#\u001a\u00020\u0002*\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b#\u0010\"¨\u00064²\u0006\f\u0010%\u001a\u00020$8\nX\u008a\u0084\u0002²\u0006\u000e\u0010&\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010'\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010(\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010)\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010*\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010+\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010,\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010-\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010.\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010/\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00100\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00101\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00103\u001a\u0002028\n@\nX\u008a\u008e\u0002"}, d2 = {"LAi/g1;", "", "", "Landroidx/compose/ui/Modifier;", "modifier", "K", "(LAi/g1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LKi/M;", "value", "Lkotlin/Function1;", "onValueChange", "O", "(LKi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Q", "S", "Lkotlin/Function0;", "onInfoClick", "Y", "(LKi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "onIconClick", "c0", "a0", "e0", "k0", "i0", "W", "onLabelIconClick", "onLeadingIconClick", "onTrailingIconClick", "U", "(LKi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "g0", "(LKi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "t0", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "m0", "", "isFocused", "defaultBlankText", "defaultBlankPlaceholderText", "defaultBlankPlaceholderDisabledText", "defaultLabelIconText", "defaultTrailingIconText", "defaultLeadingIconText", "errorFieldText", "warningFieldText", "successFieldText", "defaultInfoBlockText", "defaultEverythingText", "errorEverythingText", "LAi/t1;", "state", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class K {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2817g1<String, Unit> f724a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f725b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0.l f726c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f727d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f728e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.z1<Boolean> f729f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ai.K$a$a, reason: collision with other inner class name */
        public static final class C0013a implements Function1<si.p, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0013a f730a = new C0013a();

            public final void a(si.p pVar) {
                Intrinsics.j(pVar, "<this>");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(si.p pVar) {
                a(pVar);
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LJi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LJi/h;", "s", "()LJi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class b extends Ji.c<Integer, si.p, si.p> {

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            private final androidx.compose.runtime.z1<Function1<si.p, Unit>> latestContent;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            private final androidx.compose.runtime.z1<si.p> state;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            private final si.p initialScope;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ai.K$a$b$a, reason: collision with other inner class name */
            public static final class C0014a implements Function0<si.p> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Ji.h f734a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ b f735b;

                public C0014a(Ji.h hVar, b bVar) {
                    this.f734a = hVar;
                    this.f735b = bVar;
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [Ji.h, java.lang.Object, si.p] */
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final si.p invoke() {
                    ?? r02 = this.f734a;
                    this.f735b.t().getValue().invoke(r02);
                    return r02;
                }
            }

            @Override // Ji.c
            public androidx.compose.runtime.z1<si.p> r() {
                return this.state;
            }

            @Override // Ji.i
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public si.p getInitialScope() {
                return this.initialScope;
            }

            public androidx.compose.runtime.z1<Function1<si.p, Unit>> t() {
                return this.latestContent;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public b(Function1 function1, Composer composer, int i10, Object[] objArr, Ji.h hVar) {
                this.latestContent = androidx.compose.runtime.o1.p(function1, composer, (i10 >> 6) & 14);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(objArr);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = androidx.compose.runtime.o1.e(new C0014a(hVar, this));
                    composer.t(objB);
                }
                composer.P();
                this.state = (androidx.compose.runtime.z1) objB;
                this.initialScope = hVar;
            }
        }

        a(InterfaceC2817g1<String, Unit> interfaceC2817g1, LocalThemeScope localThemeScope, h0.l lVar, float f10, float f11, androidx.compose.runtime.z1<Boolean> z1Var) {
            this.f724a = interfaceC2817g1;
            this.f725b = localThemeScope;
            this.f726c = lVar;
            this.f727d = f10;
            this.f728e = f11;
            this.f729f = z1Var;
        }

        public final void a(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer, int i10) {
            int i11;
            androidx.compose.runtime.z1<Boolean> z1Var;
            LocalThemeScope localThemeScope;
            si.p pVarI;
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
            Modifier modifier = this.f724a.getTemplate().getModifier();
            V0.D1 shape = this.f724a.getTemplate().getShape();
            if (shape == null) {
                shape = C16806i.c(this.f725b.getAdsCornerRadii().getRadius04().getDp());
            }
            Modifier modifierD = androidx.compose.foundation.b.d(T0.e.a(modifier, shape), this.f724a.getTemplate().getColors().getBackgroundColor(), null, 2, null);
            V0.D1 shape2 = this.f724a.getTemplate().getShape();
            if (shape2 == null) {
                shape2 = C16806i.c(this.f725b.getAdsCornerRadii().getRadius04().getDp());
            }
            Modifier modifierM = androidx.compose.foundation.layout.D.m(C13572f.g(modifierD, H1.h.p(K.L(this.f729f) ? 2 : 1), this.f724a.getTemplate().getColors().e(this.f724a.getTemplate().getState(), this.f726c, composer2, 0).getValue().getValue(), shape2), this.f727d, 0.0f, this.f728e, 0.0f, 10, null);
            C5800d c5800d = C5800d.f48779a;
            C5800d.f fVarE = c5800d.e();
            e.Companion companion = P0.e.INSTANCE;
            e.c cVarI = companion.i();
            InterfaceC2817g1<String, Unit> interfaceC2817g1 = this.f724a;
            LocalThemeScope localThemeScope2 = this.f725b;
            androidx.compose.runtime.z1<Boolean> z1Var2 = this.f729f;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(fVarE, cVarI, composer2, 54);
            int iA = C5859f.a(composer2, 0);
            InterfaceC5884s interfaceC5884sR = composer2.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer2, modifierM);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composer2.k() == null) {
                C5859f.c();
            }
            composer2.F();
            if (composer2.getInserting()) {
                composer2.I(function0A);
            } else {
                composer2.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composer2);
            androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14889J c14889j = C14889J.f139620a;
            C16673d c16673dC0 = interfaceC2817g1.getLeadingIcon();
            composer2.startReplaceGroup(170419107);
            if (c16673dC0 == null) {
                localThemeScope = localThemeScope2;
                z1Var = z1Var2;
            } else {
                Modifier modifierM2 = androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, 0.0f, H1.h.p(6), 0.0f, 11, null);
                MeasurePolicy measurePolicyA = C5807k.a(c5800d.h(), companion.k(), composer2, 0);
                int iA2 = C5859f.a(composer2, 0);
                InterfaceC5884s interfaceC5884sR2 = composer2.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer2, modifierM2);
                Function0<InterfaceC5953g> function0A2 = companion2.a();
                if (composer2.k() == null) {
                    C5859f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A2);
                } else {
                    composer2.s();
                }
                Composer composerA2 = androidx.compose.runtime.D1.a(composer2);
                androidx.compose.runtime.D1.c(composerA2, measurePolicyA, companion2.e());
                androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion2.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                androidx.compose.runtime.D1.c(composerA2, modifierE2, companion2.f());
                C14903g c14903g = C14903g.f139698a;
                z1Var = z1Var2;
                s1.b(localThemeScope2, interfaceC2817g1.v0(), c16673dC0, 0.0f, composer2, 0, 4);
                localThemeScope = localThemeScope2;
                composer2 = composer2;
                composer2.v();
                Unit unit = Unit.f143329a;
            }
            composer2.P();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierD2 = c14889j.d(InterfaceC14888I.b(c14889j, companion3, 1.0f, false, 2, null), companion.i());
            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion.l(), composer2, 0);
            int iA3 = C5859f.a(composer2, 0);
            InterfaceC5884s interfaceC5884sR3 = composer2.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer2, modifierD2);
            Function0<InterfaceC5953g> function0A3 = companion2.a();
            if (composer2.k() == null) {
                C5859f.c();
            }
            composer2.F();
            if (composer2.getInserting()) {
                composer2.I(function0A3);
            } else {
                composer2.s();
            }
            Composer composerA3 = androidx.compose.runtime.D1.a(composer2);
            androidx.compose.runtime.D1.c(composerA3, measurePolicyB2, companion2.e());
            androidx.compose.runtime.D1.c(composerA3, interfaceC5884sR3, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion2.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            androidx.compose.runtime.D1.c(composerA3, modifierE3, companion2.f());
            composer2.startReplaceGroup(-1354391676);
            if (!K.L(z1Var) && interfaceC2817g1.getValue().length() == 0 && (pVarI = interfaceC2817g1.getPlaceHolder()) != null) {
                composer2.startReplaceGroup(327606171);
                Object[] objArr = {pVarI};
                composer2.startReplaceGroup(-2104237158);
                composer2.startReplaceGroup(1849434622);
                Object objB = composer2.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = C0013a.f730a;
                    composer2.t(objB);
                }
                composer2.P();
                Object[] objArrCopyOf = Arrays.copyOf(objArr, 1);
                composer2.startReplaceGroup(1252494947);
                b bVar = new b((Function1) objB, composer2, 0, objArrCopyOf, pVarI);
                composer2.P();
                bVar.k(0, companion3).invoke(composer2, 0);
                composer2.P();
                composer2.P();
                Unit unit2 = Unit.f143329a;
            }
            composer2.P();
            innerTextField.invoke(composer2, Integer.valueOf(i11 & 14));
            composer2.v();
            MeasurePolicy measurePolicyB3 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion.l(), composer2, 0);
            int iA4 = C5859f.a(composer2, 0);
            InterfaceC5884s interfaceC5884sR4 = composer2.r();
            Modifier modifierE4 = androidx.compose.ui.b.e(composer2, companion3);
            Function0<InterfaceC5953g> function0A4 = companion2.a();
            if (composer2.k() == null) {
                C5859f.c();
            }
            composer2.F();
            if (composer2.getInserting()) {
                composer2.I(function0A4);
            } else {
                composer2.s();
            }
            Composer composerA4 = androidx.compose.runtime.D1.a(composer2);
            androidx.compose.runtime.D1.c(composerA4, measurePolicyB3, companion2.e());
            androidx.compose.runtime.D1.c(composerA4, interfaceC5884sR4, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion2.b();
            if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                composerA4.t(Integer.valueOf(iA4));
                composerA4.n(Integer.valueOf(iA4), function2B4);
            }
            androidx.compose.runtime.D1.c(composerA4, modifierE4, companion2.f());
            C16673d c16673dB = interfaceC2817g1.getTrailingIcon();
            composer2.startReplaceGroup(-166756357);
            if (c16673dB != null) {
                MeasurePolicy measurePolicyA2 = C5807k.a(c5800d.h(), companion.k(), composer2, 0);
                int iA5 = C5859f.a(composer2, 0);
                InterfaceC5884s interfaceC5884sR5 = composer2.r();
                Modifier modifierE5 = androidx.compose.ui.b.e(composer2, companion3);
                Function0<InterfaceC5953g> function0A5 = companion2.a();
                if (composer2.k() == null) {
                    C5859f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A5);
                } else {
                    composer2.s();
                }
                Composer composerA5 = androidx.compose.runtime.D1.a(composer2);
                androidx.compose.runtime.D1.c(composerA5, measurePolicyA2, companion2.e());
                androidx.compose.runtime.D1.c(composerA5, interfaceC5884sR5, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B5 = companion2.b();
                if (composerA5.getInserting() || !Intrinsics.e(composerA5.B(), Integer.valueOf(iA5))) {
                    composerA5.t(Integer.valueOf(iA5));
                    composerA5.n(Integer.valueOf(iA5), function2B5);
                }
                androidx.compose.runtime.D1.c(composerA5, modifierE5, companion2.f());
                C14903g c14903g2 = C14903g.f139698a;
                s1.b(localThemeScope, interfaceC2817g1.s(), c16673dB, 0.0f, composer, 0, 4);
                composer2 = composer;
                composer2.v();
                Unit unit3 = Unit.f143329a;
            }
            composer2.P();
            Function2<Composer, Integer, Unit> function2O = interfaceC2817g1.o();
            composer2.startReplaceGroup(-166749775);
            if (function2O != null) {
                function2O.invoke(composer2, 0);
                Unit unit4 = Unit.f143329a;
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
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f736a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f737b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f738c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f739d;

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1) {
            this.f736a = localThemeScope;
            this.f737b = str;
            this.f738c = modifier;
            this.f739d = function1;
        }

        public final void a(InterfaceC15153W Assemble, Composer composer, int i10) {
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
            C2832m0.i(this.f736a, this.f737b, Assemble.getInputFields().getDefault(), this.f738c, this.f739d, null, composer, 0, 16);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            a(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f740a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f741b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f742c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f743d;

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1) {
            this.f740a = localThemeScope;
            this.f741b = str;
            this.f742c = modifier;
            this.f743d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC15153W interfaceC15153W, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.i(interfaceC15153W.getLabels().getPlaceholder(), "Placeholder");
            return Unit.f143329a;
        }

        public final void b(final InterfaceC15153W Assemble, Composer composer, int i10) {
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
            LocalThemeScope localThemeScope = this.f740a;
            String str = this.f741b;
            Modifier modifier = this.f742c;
            Function1<String, Unit> function1 = this.f743d;
            composer.startReplaceGroup(5004770);
            boolean z10 = (i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(Assemble));
            Object objB = composer.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Ai.L
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.c.c(Assemble, (H1) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C2832m0.i(localThemeScope, str, textInput, modifier, function1, (Function1) objB, composer, 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            b(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f744a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f745b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f746c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f747d;

        /* JADX WARN: Multi-variable type inference failed */
        d(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1) {
            this.f744a = localThemeScope;
            this.f745b = str;
            this.f746c = modifier;
            this.f747d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC15153W interfaceC15153W, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC15153W.getLabels().getLabel(), "Disabled");
            return Unit.f143329a;
        }

        public final void b(final InterfaceC15153W Assemble, Composer composer, int i10) {
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
            LocalThemeScope localThemeScope = this.f744a;
            String str = this.f745b;
            Modifier modifier = this.f746c;
            Function1<String, Unit> function1 = this.f747d;
            composer.startReplaceGroup(5004770);
            boolean z10 = (i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(Assemble));
            Object objB = composer.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Ai.M
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.d.c(Assemble, (H1) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C2832m0.i(localThemeScope, str, disabled, modifier, function1, (Function1) objB, composer, 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            b(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f748a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f749b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f750c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f751d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f752e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f753f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f754g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f755a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15153W f756b;

            a(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W) {
                this.f755a = localThemeScope;
                this.f756b = interfaceC15153W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1459105051, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputDefaultEverythingComplexModifier.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:416)");
                }
                LocalThemeScope localThemeScope = this.f755a;
                InterfaceC15153W interfaceC15153W = this.f756b;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                C14889J c14889j = C14889J.f139620a;
                C16671b.b(localThemeScope, interfaceC15153W.getIcons().getInfoBlockIcon(), C.i.C0307i.f17103d, "Validation Info", composer, 3456, 0);
                si.j.h(localThemeScope, interfaceC15153W.getLabels().getInfoBlockMessage(), "Text input with info uses gray border with a light blue info block.", null, composer, 384, 4);
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

        public final void b(final InterfaceC15153W Assemble, Composer composer, int i10) {
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
            LocalThemeScope localThemeScope = this.f748a;
            String str = this.f749b;
            Modifier modifier = this.f750c;
            Function1<String, Unit> function1 = this.f751d;
            composer.startReplaceGroup(-1224400529);
            boolean zV = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble))) | composer.V(this.f752e) | composer.V(this.f753f) | composer.V(this.f754g) | composer.D(this.f748a);
            final Function0<Unit> function0 = this.f752e;
            final Function0<Unit> function02 = this.f753f;
            final Function0<Unit> function03 = this.f754g;
            final LocalThemeScope localThemeScope2 = this.f748a;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                Function1 function12 = new Function1() { // from class: Ai.N
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.e.c(Assemble, function0, function02, function03, localThemeScope2, (H1) obj);
                    }
                };
                composer.t(function12);
                objB = function12;
            }
            composer.P();
            C2832m0.i(localThemeScope, str, textInput, modifier, function1, (Function1) objB, composer, 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        e(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
            this.f748a = localThemeScope;
            this.f749b = str;
            this.f750c = modifier;
            this.f751d = function1;
            this.f752e = function0;
            this.f753f = function02;
            this.f754g = function03;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC15153W interfaceC15153W, Function0 function0, Function0 function02, Function0 function03, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC15153W.getLabels().getLabel(), "Label");
            AdsInputField.f(interfaceC15153W.getLabels().getDescription(), "This is a field with everything together!!");
            H1.g0(AdsInputField, interfaceC15153W.getIcons().getLabelIcon(), C.i.h.f17101d, null, function0, 4, null);
            H1.L(AdsInputField, interfaceC15153W.getIcons().getLeadingIcon(), C.a.B.f16864e, null, function02, 4, null);
            H1.z(AdsInputField, interfaceC15153W.getIcons().getTrailingIcon(), C.f.p.f17068e, null, function03, 4, null);
            AdsInputField.i(interfaceC15153W.getLabels().getPlaceholder(), "Placeholder");
            AdsInputField.e(interfaceC15153W.getInfoBlocks().getInformationBlock(), ComposableLambdaKt.composableLambdaInstance(1459105051, true, new a(localThemeScope, interfaceC15153W)));
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            b(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class f implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f757a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f758b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f759c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f760d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f761a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15153W f762b;

            a(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W) {
                this.f761a = localThemeScope;
                this.f762b = interfaceC15153W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1707005908, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputDefaultInfoBlock.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:362)");
                }
                LocalThemeScope localThemeScope = this.f761a;
                InterfaceC15153W interfaceC15153W = this.f762b;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                C14889J c14889j = C14889J.f139620a;
                C16671b.b(localThemeScope, interfaceC15153W.getIcons().getInfoBlockIcon(), C.i.C0307i.f17103d, "Validation Info", composer, 3456, 0);
                si.j.h(localThemeScope, interfaceC15153W.getLabels().getInfoBlockMessage(), "Text input with info uses gray border with a light blue info block.", null, composer, 384, 4);
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

        /* JADX WARN: Multi-variable type inference failed */
        f(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1) {
            this.f757a = localThemeScope;
            this.f758b = str;
            this.f759c = modifier;
            this.f760d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC15153W interfaceC15153W, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC15153W.getLabels().getLabel(), "Information");
            AdsInputField.e(interfaceC15153W.getInfoBlocks().getInformationBlock(), ComposableLambdaKt.composableLambdaInstance(1707005908, true, new a(localThemeScope, interfaceC15153W)));
            return Unit.f143329a;
        }

        public final void b(final InterfaceC15153W Assemble, Composer composer, int i10) {
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
            LocalThemeScope localThemeScope = this.f757a;
            String str = this.f758b;
            Modifier modifier = this.f759c;
            Function1<String, Unit> function1 = this.f760d;
            composer.startReplaceGroup(-1633490746);
            boolean zD = ((i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f757a);
            final LocalThemeScope localThemeScope2 = this.f757a;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Ai.O
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.f.c(Assemble, localThemeScope2, (H1) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C2832m0.i(localThemeScope, str, textInput, modifier, function1, (Function1) objB, composer, 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            b(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class g implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f763a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f764b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f765c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f766d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f767e;

        /* JADX WARN: Multi-variable type inference failed */
        g(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1, Function0<Unit> function0) {
            this.f763a = localThemeScope;
            this.f764b = str;
            this.f765c = modifier;
            this.f766d = function1;
            this.f767e = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC15153W interfaceC15153W, Function0 function0, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            H1.g0(AdsInputField, interfaceC15153W.getIcons().getLabelIcon(), C.i.h.f17101d, null, function0, 4, null);
            AdsInputField.d(interfaceC15153W.getLabels().getLabel(), "Label");
            return Unit.f143329a;
        }

        public final void b(final InterfaceC15153W Assemble, Composer composer, int i10) {
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
            LocalThemeScope localThemeScope = this.f763a;
            String str = this.f764b;
            Modifier modifier = this.f765c;
            Function1<String, Unit> function1 = this.f766d;
            composer.startReplaceGroup(-1633490746);
            boolean zV = ((i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(Assemble))) | composer.V(this.f767e);
            final Function0<Unit> function0 = this.f767e;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Ai.P
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.g.c(Assemble, function0, (H1) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C2832m0.i(localThemeScope, str, textInput, modifier, function1, (Function1) objB, composer, 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            b(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class h implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f768a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f769b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f770c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f771d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f772e;

        /* JADX WARN: Multi-variable type inference failed */
        h(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1, Function0<Unit> function0) {
            this.f768a = localThemeScope;
            this.f769b = str;
            this.f770c = modifier;
            this.f771d = function1;
            this.f772e = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC15153W interfaceC15153W, Function0 function0, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            H1.L(AdsInputField, interfaceC15153W.getIcons().getFieldIcon(), C.a.B.f16864e, null, function0, 4, null);
            AdsInputField.d(interfaceC15153W.getLabels().getLabel(), "Leading Icon");
            AdsInputField.i(interfaceC15153W.getLabels().getPlaceholder(), "Search");
            return Unit.f143329a;
        }

        public final void b(final InterfaceC15153W Assemble, Composer composer, int i10) {
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
            LocalThemeScope localThemeScope = this.f768a;
            String str = this.f769b;
            Modifier modifier = this.f770c;
            Function1<String, Unit> function1 = this.f771d;
            composer.startReplaceGroup(-1633490746);
            boolean zV = ((i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(Assemble))) | composer.V(this.f772e);
            final Function0<Unit> function0 = this.f772e;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Ai.Q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.h.c(Assemble, function0, (H1) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C2832m0.i(localThemeScope, str, textInput, modifier, function1, (Function1) objB, composer, 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            b(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class i implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f773a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f774b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f775c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f776d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f777e;

        /* JADX WARN: Multi-variable type inference failed */
        i(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1, Function0<Unit> function0) {
            this.f773a = localThemeScope;
            this.f774b = str;
            this.f775c = modifier;
            this.f776d = function1;
            this.f777e = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC15153W interfaceC15153W, Function0 function0, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            H1.z(AdsInputField, interfaceC15153W.getIcons().getFieldIcon(), C.a.B.f16864e, null, function0, 4, null);
            AdsInputField.d(interfaceC15153W.getLabels().getLabel(), "Trailing Icon");
            AdsInputField.i(interfaceC15153W.getLabels().getPlaceholder(), "Search");
            return Unit.f143329a;
        }

        public final void b(final InterfaceC15153W Assemble, Composer composer, int i10) {
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
            LocalThemeScope localThemeScope = this.f773a;
            String str = this.f774b;
            Modifier modifier = this.f775c;
            Function1<String, Unit> function1 = this.f776d;
            composer.startReplaceGroup(-1633490746);
            boolean zV = ((i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(Assemble))) | composer.V(this.f777e);
            final Function0<Unit> function0 = this.f777e;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Ai.S
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.i.c(Assemble, function0, (H1) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C2832m0.i(localThemeScope, str, textInput, modifier, function1, (Function1) objB, composer, 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            b(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class j implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f778a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f779b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f780c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f781d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f782a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15153W f783b;

            a(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W) {
                this.f782a = localThemeScope;
                this.f783b = interfaceC15153W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1714305516, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputError.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:269)");
                }
                LocalThemeScope localThemeScope = this.f782a;
                InterfaceC15153W interfaceC15153W = this.f783b;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                C14889J c14889j = C14889J.f139620a;
                C16671b.b(localThemeScope, interfaceC15153W.getIcons().getInfoBlockIcon(), C.i.e.f17096d, "Validation Error", composer, 3456, 0);
                si.j.h(localThemeScope, interfaceC15153W.getLabels().getInfoBlockMessage(), "Text input with error uses red border with a red info block.", null, composer, 384, 4);
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

        /* JADX WARN: Multi-variable type inference failed */
        j(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1) {
            this.f778a = localThemeScope;
            this.f779b = str;
            this.f780c = modifier;
            this.f781d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC15153W interfaceC15153W, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC15153W.getLabels().getLabel(), "Error");
            AdsInputField.e(interfaceC15153W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(-1714305516, true, new a(localThemeScope, interfaceC15153W)));
            return Unit.f143329a;
        }

        public final void b(final InterfaceC15153W Assemble, Composer composer, int i10) {
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
            LocalThemeScope localThemeScope = this.f778a;
            String str = this.f779b;
            Modifier modifier = this.f780c;
            Function1<String, Unit> function1 = this.f781d;
            composer.startReplaceGroup(-1633490746);
            boolean zD = ((i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f778a);
            final LocalThemeScope localThemeScope2 = this.f778a;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Ai.T
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.j.c(Assemble, localThemeScope2, (H1) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C2832m0.i(localThemeScope, str, error, modifier, function1, (Function1) objB, composer, 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            b(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class k implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f784a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f785b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f786c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f787d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f788e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f789f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f790a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15153W f791b;

            a(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W) {
                this.f790a = localThemeScope;
                this.f791b = interfaceC15153W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1382186450, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputErrorEverythingComplexModifier.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:464)");
                }
                LocalThemeScope localThemeScope = this.f790a;
                InterfaceC15153W interfaceC15153W = this.f791b;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                C14889J c14889j = C14889J.f139620a;
                C16671b.b(localThemeScope, interfaceC15153W.getIcons().getInfoBlockIcon(), C.i.e.f17096d, "Validation Error", composer, 3456, 0);
                si.j.h(localThemeScope, interfaceC15153W.getLabels().getInfoBlockMessage(), "Text input with error uses red border with a red info block.", null, composer, 384, 4);
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

        /* JADX WARN: Multi-variable type inference failed */
        k(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1, Function0<Unit> function0, Function0<Unit> function02) {
            this.f784a = localThemeScope;
            this.f785b = str;
            this.f786c = modifier;
            this.f787d = function1;
            this.f788e = function0;
            this.f789f = function02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC15153W interfaceC15153W, Function0 function0, Function0 function02, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC15153W.getLabels().getLabel(), "Label");
            AdsInputField.f(interfaceC15153W.getLabels().getDescription(), "This is a field with everything together!!");
            H1.g0(AdsInputField, interfaceC15153W.getIcons().getLabelIcon(), C.i.h.f17101d, null, function0, 4, null);
            H1.L(AdsInputField, interfaceC15153W.getIcons().getLeadingIcon(), C.a.B.f16864e, null, function02, 4, null);
            AdsInputField.i(interfaceC15153W.getLabels().getPlaceholder(), "Placeholder");
            AdsInputField.e(interfaceC15153W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(-1382186450, true, new a(localThemeScope, interfaceC15153W)));
            return Unit.f143329a;
        }

        public final void b(final InterfaceC15153W Assemble, Composer composer, int i10) {
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
            LocalThemeScope localThemeScope = this.f784a;
            String str = this.f785b;
            Modifier modifier = this.f786c;
            Function1<String, Unit> function1 = this.f787d;
            composer.startReplaceGroup(-1224400529);
            boolean zV = ((i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(Assemble))) | composer.V(this.f788e) | composer.V(this.f789f) | composer.D(this.f784a);
            final Function0<Unit> function0 = this.f788e;
            final Function0<Unit> function02 = this.f789f;
            final LocalThemeScope localThemeScope2 = this.f784a;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Ai.U
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.k.c(Assemble, function0, function02, localThemeScope2, (H1) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C2832m0.i(localThemeScope, str, error, modifier, function1, (Function1) objB, composer, 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            b(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class l implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f792a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f793b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f794c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f795d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f796a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15153W f797b;

            a(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W) {
                this.f796a = localThemeScope;
                this.f797b = interfaceC15153W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1317593273, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputSuccess.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:331)");
                }
                LocalThemeScope localThemeScope = this.f796a;
                InterfaceC15153W interfaceC15153W = this.f797b;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                C14889J c14889j = C14889J.f139620a;
                C16671b.b(localThemeScope, interfaceC15153W.getIcons().getInfoBlockIcon(), C.i.b.f17093d, "Validation Success", composer, 3456, 0);
                si.j.h(localThemeScope, interfaceC15153W.getLabels().getInfoBlockMessage(), "Text input with success uses green border with a green info block.", null, composer, 384, 4);
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

        /* JADX WARN: Multi-variable type inference failed */
        l(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1) {
            this.f792a = localThemeScope;
            this.f793b = str;
            this.f794c = modifier;
            this.f795d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC15153W interfaceC15153W, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC15153W.getLabels().getLabel(), "Success");
            AdsInputField.e(interfaceC15153W.getInfoBlocks().getSuccessBlock(), ComposableLambdaKt.composableLambdaInstance(1317593273, true, new a(localThemeScope, interfaceC15153W)));
            return Unit.f143329a;
        }

        public final void b(final InterfaceC15153W Assemble, Composer composer, int i10) {
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
            LocalThemeScope localThemeScope = this.f792a;
            String str = this.f793b;
            Modifier modifier = this.f794c;
            Function1<String, Unit> function1 = this.f795d;
            composer.startReplaceGroup(-1633490746);
            boolean zD = ((i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f792a);
            final LocalThemeScope localThemeScope2 = this.f792a;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Ai.V
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.l.c(Assemble, localThemeScope2, (H1) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C2832m0.i(localThemeScope, str, success, modifier, function1, (Function1) objB, composer, 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            b(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class m implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f798a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f799b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f800c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f801d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f802a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15153W f803b;

            a(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W) {
                this.f802a = localThemeScope;
                this.f803b = interfaceC15153W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1098108864, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.ExampleTextInputWarning.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:300)");
                }
                LocalThemeScope localThemeScope = this.f802a;
                InterfaceC15153W interfaceC15153W = this.f803b;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                C14889J c14889j = C14889J.f139620a;
                C16671b.b(localThemeScope, interfaceC15153W.getIcons().getInfoBlockIcon(), C.i.n.f17109d, "Validation Warning", composer, 3456, 0);
                si.j.h(localThemeScope, interfaceC15153W.getLabels().getInfoBlockMessage(), "Text input with warning uses yellow border with a yellow info block.", null, composer, 384, 4);
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

        /* JADX WARN: Multi-variable type inference failed */
        m(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1) {
            this.f798a = localThemeScope;
            this.f799b = str;
            this.f800c = modifier;
            this.f801d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC15153W interfaceC15153W, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC15153W.getLabels().getLabel(), "Warning");
            AdsInputField.e(interfaceC15153W.getInfoBlocks().getWarningBlock(), ComposableLambdaKt.composableLambdaInstance(1098108864, true, new a(localThemeScope, interfaceC15153W)));
            return Unit.f143329a;
        }

        public final void b(final InterfaceC15153W Assemble, Composer composer, int i10) {
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
            LocalThemeScope localThemeScope = this.f798a;
            String str = this.f799b;
            Modifier modifier = this.f800c;
            Function1<String, Unit> function1 = this.f801d;
            composer.startReplaceGroup(-1633490746);
            boolean zD = ((i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f798a);
            final LocalThemeScope localThemeScope2 = this.f798a;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Ai.W
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.m.c(Assemble, localThemeScope2, (H1) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C2832m0.i(localThemeScope, str, warning, modifier, function1, (Function1) objB, composer, 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            b(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class n implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC14882C f804a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<String> f805b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f806c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f807d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<t1> f808e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f809f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f810a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15153W f811b;

            a(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W) {
                this.f810a = localThemeScope;
                this.f811b = interfaceC15153W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1078886676, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.PasswordInputExamples.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:693)");
                }
                si.j.h(this.f810a, this.f811b.getLabels().getInfoBlockMessage(), "Password fields must match!", null, composer, 384, 4);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f812a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15153W f813b;

            b(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W) {
                this.f812a = localThemeScope;
                this.f813b = interfaceC15153W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1883281419, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.PasswordInputExamples.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:699)");
                }
                si.j.h(this.f812a, this.f813b.getLabels().getInfoBlockMessage(), "Passwords is too short!!", null, composer, 384, 4);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f814a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15153W f815b;

            c(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W) {
                this.f814a = localThemeScope;
                this.f815b = interfaceC15153W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(550482218, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.PasswordInputExamples.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:705)");
                }
                si.j.h(this.f814a, this.f815b.getLabels().getInfoBlockMessage(), "Password must be 8 characters", null, composer, 384, 4);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f816a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15153W f817b;

            d(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W) {
                this.f816a = localThemeScope;
                this.f817b = interfaceC15153W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-782316983, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.PasswordInputExamples.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:711)");
                }
                si.j.h(this.f816a, this.f817b.getLabels().getInfoBlockMessage(), "You did it!!!", null, composer, 384, 4);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class e implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f818a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15153W f819b;

            e(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W) {
                this.f818a = localThemeScope;
                this.f819b = interfaceC15153W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-2115116184, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.PasswordInputExamples.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:717)");
                }
                si.j.h(this.f818a, this.f819b.getLabels().getInfoBlockMessage(), "Password is too short", null, composer, 384, 4);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class f implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f820a;

            f(LocalThemeScope localThemeScope) {
                this.f820a = localThemeScope;
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
                LocalThemeScope localThemeScope = this.f820a;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), cVarI, composer, 48);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                C14889J c14889j = C14889J.f139620a;
                si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 383, null), "Alone", null, composer, 384, 4);
                C13590y.a(C16335d.c(C15040a.f140764a, composer, 0), null, androidx.compose.foundation.layout.D.m(companion, localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 4, null), null, null, 0.0f, null, composer, 48, BinsView.TOTE_HEIGHT_DP);
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

        n(InterfaceC14882C interfaceC14882C, InterfaceC5872l0<String> interfaceC5872l0, InterfaceC5914o interfaceC5914o, LocalThemeScope localThemeScope, InterfaceC5872l0<t1> interfaceC5872l02, InterfaceC5872l0<Boolean> interfaceC5872l03) {
            this.f804a = interfaceC14882C;
            this.f805b = interfaceC5872l0;
            this.f806c = interfaceC5914o;
            this.f807d = localThemeScope;
            this.f808e = interfaceC5872l02;
            this.f809f = interfaceC5872l03;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5914o interfaceC5914o, InterfaceC5834y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            interfaceC5914o.e(C5905f.INSTANCE.a());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, String it) {
            Intrinsics.j(it, "it");
            interfaceC5872l0.setValue(it);
            K.n0(interfaceC5872l0, interfaceC5872l02);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InterfaceC15153W interfaceC15153W, final InterfaceC5872l0 interfaceC5872l0, final InterfaceC5872l0 interfaceC5872l02, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC15153W.getLabels().getLabel(), "Enter a new password");
            H1.g0(AdsInputField, interfaceC15153W.getIcons().getLabelIcon(), C.i.h.f17101d, null, new Function0() { // from class: Ai.a0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return K.n.o(interfaceC5872l02);
                }
            }, 4, null);
            t1 t1VarP0 = K.p0(interfaceC5872l02);
            if (!(t1VarP0 instanceof t1.d)) {
                if (Intrinsics.e(t1VarP0, t1.a.f1278a)) {
                    AdsInputField.e(interfaceC15153W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(-1078886676, true, new a(localThemeScope, interfaceC15153W)));
                } else if (Intrinsics.e(t1VarP0, t1.b.f1279a)) {
                    AdsInputField.e(interfaceC15153W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(1883281419, true, new b(localThemeScope, interfaceC15153W)));
                } else if (Intrinsics.e(t1VarP0, t1.c.f1280a)) {
                    AdsInputField.e(interfaceC15153W.getInfoBlocks().getInformationBlock(), ComposableLambdaKt.composableLambdaInstance(550482218, true, new c(localThemeScope, interfaceC15153W)));
                } else if (Intrinsics.e(t1VarP0, t1.e.f1282a)) {
                    AdsInputField.e(interfaceC15153W.getInfoBlocks().getSuccessBlock(), ComposableLambdaKt.composableLambdaInstance(-782316983, true, new d(localThemeScope, interfaceC15153W)));
                } else {
                    if (!Intrinsics.e(t1VarP0, t1.f.f1283a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AdsInputField.e(interfaceC15153W.getInfoBlocks().getWarningBlock(), ComposableLambdaKt.composableLambdaInstance(-2115116184, true, new e(localThemeScope, interfaceC15153W)));
                }
            }
            H1.L(AdsInputField, interfaceC15153W.getIcons().getFieldIcon(), ((Boolean) interfaceC5872l0.getValue()).booleanValue() ? C.j.p.f17135d : C.j.o.f17134d, null, new Function0() { // from class: Ai.b0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return K.n.p(interfaceC5872l0);
                }
            }, 4, null);
            AdsInputField.D(ComposableLambdaKt.composableLambdaInstance(1341940931, true, new f(localThemeScope)));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(InterfaceC5872l0 interfaceC5872l0) {
            K.q0(interfaceC5872l0, t1.c.f1280a);
            return Unit.f143329a;
        }

        public final void f(final InterfaceC15153W Assemble, Composer composer, int i10) {
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
            Modifier modifierH = androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, this.f804a);
            String value = this.f805b.getValue();
            q1.f.TextInput textInputO0 = K.o0(Assemble.getInputFields(), this.f808e, this.f809f);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.f(), androidx.compose.ui.text.input.a.INSTANCE.d(), null, null, null, 115, null);
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(this.f806c);
            final InterfaceC5914o interfaceC5914o = this.f806c;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Ai.X
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.n.g(interfaceC5914o, (InterfaceC5834y) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.f.TextInput textInputY = q1.f.TextInput.y(textInputO0, null, false, null, null, null, keyboardOptions, new C5835z(null, null, (Function1) objB, null, null, null, 59, null), false, 0, null, null, null, 3999, null);
            LocalThemeScope localThemeScope = this.f807d;
            composer.startReplaceGroup(-1633490746);
            final InterfaceC5872l0<String> interfaceC5872l0 = this.f805b;
            final InterfaceC5872l0<t1> interfaceC5872l02 = this.f808e;
            Object objB2 = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB2 == companion.a()) {
                objB2 = new Function1() { // from class: Ai.Y
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.n.k(interfaceC5872l0, interfaceC5872l02, (String) obj);
                    }
                };
                composer.t(objB2);
            }
            Function1 function1 = (Function1) objB2;
            composer.P();
            composer.startReplaceGroup(-1224400529);
            boolean zD2 = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f807d);
            final InterfaceC5872l0<Boolean> interfaceC5872l03 = this.f809f;
            final InterfaceC5872l0<t1> interfaceC5872l04 = this.f808e;
            final LocalThemeScope localThemeScope2 = this.f807d;
            Object objB3 = composer.B();
            if (zD2 || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: Ai.Z
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.n.l(Assemble, interfaceC5872l03, interfaceC5872l04, localThemeScope2, (H1) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C2832m0.i(localThemeScope, value, textInputY, modifierH, function1, (Function1) objB3, composer, 24576, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            f(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(InterfaceC5872l0 interfaceC5872l0) {
            interfaceC5872l0.setValue(Boolean.valueOf(!((Boolean) interfaceC5872l0.getValue()).booleanValue()));
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class o implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC14882C f821a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<String> f822b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f823c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.D1 f824d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f825e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<t1> f826f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f827g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<String> f828h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f829a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15153W f830b;

            a(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W) {
                this.f829a = localThemeScope;
                this.f830b = interfaceC15153W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(744667235, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.PasswordInputExamples.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:784)");
                }
                si.j.h(this.f829a, this.f830b.getLabels().getInfoBlockMessage(), "Password fields must match!", null, composer, 384, 4);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f831a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15153W f832b;

            b(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W) {
                this.f831a = localThemeScope;
                this.f832b = interfaceC15153W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-175110718, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.PasswordInputExamples.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:790)");
                }
                si.j.h(this.f831a, this.f832b.getLabels().getInfoBlockMessage(), "Passwords is too short!!", null, composer, 384, 4);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f833a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15153W f834b;

            c(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W) {
                this.f833a = localThemeScope;
                this.f834b = interfaceC15153W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1094888671, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.PasswordInputExamples.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:796)");
                }
                si.j.h(this.f833a, this.f834b.getLabels().getInfoBlockMessage(), "Password must be 8 characters", null, composer, 384, 4);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f835a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15153W f836b;

            d(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W) {
                this.f835a = localThemeScope;
                this.f836b = interfaceC15153W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-2014666624, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.PasswordInputExamples.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:802)");
                }
                si.j.h(this.f835a, this.f836b.getLabels().getInfoBlockMessage(), "Best password EVER!", null, composer, 384, 4);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class e implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f837a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15153W f838b;

            e(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W) {
                this.f837a = localThemeScope;
                this.f838b = interfaceC15153W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1360522719, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.PasswordInputExamples.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsBasicTextField.kt:808)");
                }
                si.j.h(this.f837a, this.f838b.getLabels().getInfoBlockMessage(), "Password is too short", null, composer, 384, 4);
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

        o(InterfaceC14882C interfaceC14882C, InterfaceC5872l0<String> interfaceC5872l0, InterfaceC5914o interfaceC5914o, androidx.compose.ui.platform.D1 d12, LocalThemeScope localThemeScope, InterfaceC5872l0<t1> interfaceC5872l02, InterfaceC5872l0<Boolean> interfaceC5872l03, InterfaceC5872l0<String> interfaceC5872l04) {
            this.f821a = interfaceC14882C;
            this.f822b = interfaceC5872l0;
            this.f823c = interfaceC5914o;
            this.f824d = d12;
            this.f825e = localThemeScope;
            this.f826f = interfaceC5872l02;
            this.f827g = interfaceC5872l03;
            this.f828h = interfaceC5872l04;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(InterfaceC5914o interfaceC5914o, androidx.compose.ui.platform.D1 d12, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, InterfaceC5872l0 interfaceC5872l03, InterfaceC5834y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            InterfaceC5914o.l(interfaceC5914o, false, 1, null);
            if (d12 != null) {
                d12.b();
            }
            K.s0(interfaceC5872l0, interfaceC5872l02, interfaceC5872l03);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, InterfaceC5872l0 interfaceC5872l03, String it) {
            Intrinsics.j(it, "it");
            interfaceC5872l0.setValue(it);
            K.n0(interfaceC5872l02, interfaceC5872l03);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC15153W interfaceC15153W, final InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC15153W.getLabels().getLabel(), "Confirm Password");
            t1 t1VarP0 = K.p0(interfaceC5872l02);
            if (!(t1VarP0 instanceof t1.d)) {
                if (Intrinsics.e(t1VarP0, t1.a.f1278a)) {
                    AdsInputField.e(interfaceC15153W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(744667235, true, new a(localThemeScope, interfaceC15153W)));
                } else if (Intrinsics.e(t1VarP0, t1.b.f1279a)) {
                    AdsInputField.e(interfaceC15153W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(-175110718, true, new b(localThemeScope, interfaceC15153W)));
                } else if (Intrinsics.e(t1VarP0, t1.c.f1280a)) {
                    AdsInputField.e(interfaceC15153W.getInfoBlocks().getInformationBlock(), ComposableLambdaKt.composableLambdaInstance(-1094888671, true, new c(localThemeScope, interfaceC15153W)));
                } else if (Intrinsics.e(t1VarP0, t1.e.f1282a)) {
                    AdsInputField.e(interfaceC15153W.getInfoBlocks().getSuccessBlock(), ComposableLambdaKt.composableLambdaInstance(-2014666624, true, new d(localThemeScope, interfaceC15153W)));
                } else {
                    if (!Intrinsics.e(t1VarP0, t1.f.f1283a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AdsInputField.e(interfaceC15153W.getInfoBlocks().getWarningBlock(), ComposableLambdaKt.composableLambdaInstance(1360522719, true, new e(localThemeScope, interfaceC15153W)));
                }
            }
            H1.L(AdsInputField, interfaceC15153W.getIcons().getFieldIcon(), ((Boolean) interfaceC5872l0.getValue()).booleanValue() ? C.j.p.f17135d : C.j.o.f17134d, null, new Function0() { // from class: Ai.f0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return K.o.l(interfaceC5872l0);
                }
            }, 4, null);
            return Unit.f143329a;
        }

        public final void e(final InterfaceC15153W Assemble, Composer composer, int i10) {
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
            Modifier modifierH = androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, this.f821a);
            String value = this.f822b.getValue();
            q1.f.TextInput textInputO0 = K.o0(Assemble.getInputFields(), this.f826f, this.f827g);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.f(), androidx.compose.ui.text.input.a.INSTANCE.c(), null, null, null, 115, null);
            composer.startReplaceGroup(-1224400529);
            boolean zD = composer.D(this.f823c) | composer.V(this.f824d);
            final InterfaceC5914o interfaceC5914o = this.f823c;
            final androidx.compose.ui.platform.D1 d12 = this.f824d;
            final InterfaceC5872l0<String> interfaceC5872l0 = this.f828h;
            final InterfaceC5872l0<String> interfaceC5872l02 = this.f822b;
            final InterfaceC5872l0<t1> interfaceC5872l03 = this.f826f;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                Function1 function1 = new Function1() { // from class: Ai.c0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.o.f(interfaceC5914o, d12, interfaceC5872l0, interfaceC5872l02, interfaceC5872l03, (InterfaceC5834y) obj);
                    }
                };
                composer.t(function1);
                objB = function1;
            }
            composer.P();
            q1.f.TextInput textInputY = q1.f.TextInput.y(textInputO0, null, false, null, null, null, keyboardOptions, new C5835z(null, (Function1) objB, null, null, null, null, 61, null), false, 0, null, null, null, 3999, null);
            LocalThemeScope localThemeScope = this.f825e;
            composer.startReplaceGroup(-1746271574);
            final InterfaceC5872l0<String> interfaceC5872l04 = this.f822b;
            final InterfaceC5872l0<String> interfaceC5872l05 = this.f828h;
            final InterfaceC5872l0<t1> interfaceC5872l06 = this.f826f;
            Object objB2 = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB2 == companion.a()) {
                objB2 = new Function1() { // from class: Ai.d0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.o.g(interfaceC5872l04, interfaceC5872l05, interfaceC5872l06, (String) obj);
                    }
                };
                composer.t(objB2);
            }
            Function1 function12 = (Function1) objB2;
            composer.P();
            composer.startReplaceGroup(-1224400529);
            boolean zD2 = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f825e);
            final InterfaceC5872l0<Boolean> interfaceC5872l07 = this.f827g;
            final InterfaceC5872l0<t1> interfaceC5872l08 = this.f826f;
            final LocalThemeScope localThemeScope2 = this.f825e;
            Object objB3 = composer.B();
            if (zD2 || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: Ai.e0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K.o.k(Assemble, interfaceC5872l07, interfaceC5872l08, localThemeScope2, (H1) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C2832m0.i(localThemeScope, value, textInputY, modifierH, function12, (Function1) objB3, composer, 24576, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            e(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InterfaceC5872l0 interfaceC5872l0) {
            interfaceC5872l0.setValue(Boolean.valueOf(!((Boolean) interfaceC5872l0.getValue()).booleanValue()));
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class p extends FunctionReferenceImpl implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<String> f839b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<String> f840c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<t1> f841d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(InterfaceC5872l0<String> interfaceC5872l0, InterfaceC5872l0<String> interfaceC5872l02, InterfaceC5872l0<t1> interfaceC5872l03) {
            super(0, Intrinsics.Kotlin.class, "submit", "PasswordInputExamples$submit(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V", 0);
            this.f839b = interfaceC5872l0;
            this.f840c = interfaceC5872l02;
            this.f841d = interfaceC5872l03;
        }

        public final void a() {
            K.s0(this.f839b, this.f840c, this.f841d);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.android_acres_library.composables.form_fields.AdsBasicTextFieldKt$TextInputExamples$1$15$1$1", f = "AdsBasicTextField.kt", l = {576, 576}, m = "invokeSuspend")
    static final class q extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f842a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f843b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(LocalThemeScope localThemeScope, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f843b = localThemeScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new q(this.f843b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((q) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (Hi.i.i((Hi.i) r0, "Label Icon Clicked", null, null, false, null, null, null, null, r13, 254, null) == r12) goto L15;
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
                int r0 = r13.f842a
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
                Ki.M r0 = r13.f843b
                Ki.E r3 = r0.getAdsSpacing()
                Ki.V r3 = r3.getFive()
                float r3 = r3.getDp()
                r13.f842a = r2
                java.lang.Object r0 = r0.f(r3, r13)
                if (r0 != r12) goto L39
                goto L50
            L39:
                Hi.i r0 = (Hi.i) r0
                r13.f842a = r1
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
                java.lang.Object r0 = Hi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r0 != r12) goto L51
            L50:
                return r12
            L51:
                kotlin.Unit r0 = kotlin.Unit.f143329a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ai.K.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.android_acres_library.composables.form_fields.AdsBasicTextFieldKt$TextInputExamples$1$16$1$1", f = "AdsBasicTextField.kt", l = {579, 579}, m = "invokeSuspend")
    static final class r extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f844a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f845b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(LocalThemeScope localThemeScope, Continuation<? super r> continuation) {
            super(2, continuation);
            this.f845b = localThemeScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new r(this.f845b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((r) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (Hi.i.i((Hi.i) r0, "Complex Leading Icon Clicked", null, null, false, null, null, null, null, r13, 254, null) == r12) goto L15;
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
                int r0 = r13.f844a
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
                Ki.M r0 = r13.f845b
                Ki.E r3 = r0.getAdsSpacing()
                Ki.V r3 = r3.getFive()
                float r3 = r3.getDp()
                r13.f844a = r2
                java.lang.Object r0 = r0.f(r3, r13)
                if (r0 != r12) goto L39
                goto L50
            L39:
                Hi.i r0 = (Hi.i) r0
                r13.f844a = r1
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
                java.lang.Object r0 = Hi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r0 != r12) goto L51
            L50:
                return r12
            L51:
                kotlin.Unit r0 = kotlin.Unit.f143329a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ai.K.r.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.android_acres_library.composables.form_fields.AdsBasicTextFieldKt$TextInputExamples$1$17$1$1", f = "AdsBasicTextField.kt", l = {582, 582}, m = "invokeSuspend")
    static final class s extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f846a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f847b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(LocalThemeScope localThemeScope, Continuation<? super s> continuation) {
            super(2, continuation);
            this.f847b = localThemeScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new s(this.f847b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((s) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (Hi.i.i((Hi.i) r0, "Trailing Icon Clicked", null, null, false, null, null, null, null, r13, 254, null) == r12) goto L15;
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
                int r0 = r13.f846a
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
                Ki.M r0 = r13.f847b
                Ki.E r3 = r0.getAdsSpacing()
                Ki.V r3 = r3.getFive()
                float r3 = r3.getDp()
                r13.f846a = r2
                java.lang.Object r0 = r0.f(r3, r13)
                if (r0 != r12) goto L39
                goto L50
            L39:
                Hi.i r0 = (Hi.i) r0
                r13.f846a = r1
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
                java.lang.Object r0 = Hi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r0 != r12) goto L51
            L50:
                return r12
            L51:
                kotlin.Unit r0 = kotlin.Unit.f143329a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ai.K.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.android_acres_library.composables.form_fields.AdsBasicTextFieldKt$TextInputExamples$1$19$1$1", f = "AdsBasicTextField.kt", l = {593, 593}, m = "invokeSuspend")
    static final class t extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f848a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f849b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(LocalThemeScope localThemeScope, Continuation<? super t> continuation) {
            super(2, continuation);
            this.f849b = localThemeScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new t(this.f849b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((t) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (Hi.i.i((Hi.i) r0, "Label Icon Clicked", null, null, false, null, null, null, null, r13, 254, null) == r12) goto L15;
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
                int r0 = r13.f848a
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
                Ki.M r0 = r13.f849b
                Ki.E r3 = r0.getAdsSpacing()
                Ki.V r3 = r3.getFive()
                float r3 = r3.getDp()
                r13.f848a = r2
                java.lang.Object r0 = r0.f(r3, r13)
                if (r0 != r12) goto L39
                goto L50
            L39:
                Hi.i r0 = (Hi.i) r0
                r13.f848a = r1
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
                java.lang.Object r0 = Hi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r0 != r12) goto L51
            L50:
                return r12
            L51:
                kotlin.Unit r0 = kotlin.Unit.f143329a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ai.K.t.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.android_acres_library.composables.form_fields.AdsBasicTextFieldKt$TextInputExamples$1$20$1$1", f = "AdsBasicTextField.kt", l = {596, 596}, m = "invokeSuspend")
    static final class u extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f850a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f851b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(LocalThemeScope localThemeScope, Continuation<? super u> continuation) {
            super(2, continuation);
            this.f851b = localThemeScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new u(this.f851b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((u) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (Hi.i.i((Hi.i) r0, "Error Leading Icon Clicked", null, null, false, null, null, null, null, r13, 254, null) == r12) goto L15;
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
                int r0 = r13.f850a
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
                Ki.M r0 = r13.f851b
                Ki.E r3 = r0.getAdsSpacing()
                Ki.V r3 = r3.getFive()
                float r3 = r3.getDp()
                r13.f850a = r2
                java.lang.Object r0 = r0.f(r3, r13)
                if (r0 != r12) goto L39
                goto L50
            L39:
                Hi.i r0 = (Hi.i) r0
                r13.f850a = r1
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
                java.lang.Object r0 = Hi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r0 != r12) goto L51
            L50:
                return r12
            L51:
                kotlin.Unit r0 = kotlin.Unit.f143329a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ai.K.u.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.android_acres_library.composables.form_fields.AdsBasicTextFieldKt$TextInputExamples$1$4$1$1", f = "AdsBasicTextField.kt", l = {523, 523}, m = "invokeSuspend")
    static final class v extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f852a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f853b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(LocalThemeScope localThemeScope, Continuation<? super v> continuation) {
            super(2, continuation);
            this.f853b = localThemeScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new v(this.f853b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((v) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (Hi.i.i((Hi.i) r0, "Info Clicked", null, null, false, null, null, null, null, r13, 254, null) == r12) goto L15;
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
                int r0 = r13.f852a
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
                Ki.M r0 = r13.f853b
                Ki.E r3 = r0.getAdsSpacing()
                Ki.V r3 = r3.getFive()
                float r3 = r3.getDp()
                r13.f852a = r2
                java.lang.Object r0 = r0.f(r3, r13)
                if (r0 != r12) goto L39
                goto L50
            L39:
                Hi.i r0 = (Hi.i) r0
                r13.f852a = r1
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
                java.lang.Object r0 = Hi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r0 != r12) goto L51
            L50:
                return r12
            L51:
                kotlin.Unit r0 = kotlin.Unit.f143329a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ai.K.v.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.android_acres_library.composables.form_fields.AdsBasicTextFieldKt$TextInputExamples$1$6$1$1", f = "AdsBasicTextField.kt", l = {532, 532}, m = "invokeSuspend")
    static final class w extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f854a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f855b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(LocalThemeScope localThemeScope, Continuation<? super w> continuation) {
            super(2, continuation);
            this.f855b = localThemeScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new w(this.f855b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((w) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (Hi.i.i((Hi.i) r0, "Trailing Icon Clicked", null, null, false, null, null, null, null, r13, 254, null) == r12) goto L15;
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
                int r0 = r13.f854a
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
                Ki.M r0 = r13.f855b
                Ki.E r3 = r0.getAdsSpacing()
                Ki.V r3 = r3.getFive()
                float r3 = r3.getDp()
                r13.f854a = r2
                java.lang.Object r0 = r0.f(r3, r13)
                if (r0 != r12) goto L39
                goto L50
            L39:
                Hi.i r0 = (Hi.i) r0
                r13.f854a = r1
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
                java.lang.Object r0 = Hi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r0 != r12) goto L51
            L50:
                return r12
            L51:
                kotlin.Unit r0 = kotlin.Unit.f143329a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ai.K.w.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.android_acres_library.composables.form_fields.AdsBasicTextFieldKt$TextInputExamples$1$8$1$1", f = "AdsBasicTextField.kt", l = {541, 541}, m = "invokeSuspend")
    static final class x extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f856a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f857b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(LocalThemeScope localThemeScope, Continuation<? super x> continuation) {
            super(2, continuation);
            this.f857b = localThemeScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new x(this.f857b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((x) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (Hi.i.i((Hi.i) r0, "Default Leading Icon Clicked", null, null, false, null, null, null, null, r13, 254, null) == r12) goto L15;
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
                int r0 = r13.f856a
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
                Ki.M r0 = r13.f857b
                Ki.E r3 = r0.getAdsSpacing()
                Ki.V r3 = r3.getFive()
                float r3 = r3.getDp()
                r13.f856a = r2
                java.lang.Object r0 = r0.f(r3, r13)
                if (r0 != r12) goto L39
                goto L50
            L39:
                Hi.i r0 = (Hi.i) r0
                r13.f856a = r1
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
                java.lang.Object r0 = Hi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r0 != r12) goto L51
            L50:
                return r12
            L51:
                kotlin.Unit r0 = kotlin.Unit.f143329a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ai.K.x.invokeSuspend(java.lang.Object):java.lang.Object");
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
    public static final void K(Ai.InterfaceC2817g1<java.lang.String, kotlin.Unit> r16, androidx.compose.ui.Modifier r17, androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ai.K.K(Ai.g1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(InterfaceC2817g1 interfaceC2817g1, String value) {
        Intrinsics.j(value, "value");
        Function2 function2C = interfaceC2817g1.C();
        Unit unit = Unit.f143329a;
        function2C.invoke(value, unit);
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(InterfaceC2817g1 interfaceC2817g1, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        K(interfaceC2817g1, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
            Ki.Q.e(localThemeScope, ki.L0.f141930a, ComposableLambdaKt.c(845684624, true, new b(localThemeScope, value, modifier, onValueChange), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ai.u
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
        return Unit.f143329a;
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
            Ki.Q.e(localThemeScope, ki.L0.f141930a, ComposableLambdaKt.c(1644336363, true, new c(localThemeScope, value, modifier, onValueChange), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ai.C
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
        return Unit.f143329a;
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
            Ki.Q.e(localThemeScope, ki.L0.f141930a, ComposableLambdaKt.c(287619023, true, new d(localThemeScope, value, modifier, onValueChange), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ai.x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K.T(localThemeScope, value, modifier2, onValueChange, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S0(InterfaceC5872l0 interfaceC5872l0, String it) {
        Intrinsics.j(it, "it");
        v0(interfaceC5872l0, it);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        S(localThemeScope, str, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T0(InterfaceC5872l0 interfaceC5872l0, String it) {
        Intrinsics.j(it, "it");
        x0(interfaceC5872l0, it);
        return Unit.f143329a;
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
            Ki.Q.e(localThemeScope, ki.L0.f141930a, ComposableLambdaKt.c(-1600504500, true, new e(localThemeScope, value, modifier2, onValueChange, onLabelIconClick, onLeadingIconClick, onTrailingIconClick), composerStartRestartGroup, 54), composerStartRestartGroup, (i14 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ai.y
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K.V(localThemeScope, value, modifier2, onValueChange, onLabelIconClick, onLeadingIconClick, onTrailingIconClick, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U0(InterfaceC5872l0 interfaceC5872l0, String it) {
        Intrinsics.j(it, "it");
        z0(interfaceC5872l0, it);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1 function1, Function0 function0, Function0 function02, Function0 function03, int i10, int i11, Composer composer, int i12) {
        U(localThemeScope, str, modifier, function1, function0, function02, function03, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V0(InterfaceC15783O interfaceC15783O, LocalThemeScope localThemeScope) {
        C15809k.d(interfaceC15783O, null, null, new v(localThemeScope, null), 3, null);
        return Unit.f143329a;
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
            Ki.Q.e(localThemeScope, ki.L0.f141930a, ComposableLambdaKt.c(-633231931, true, new f(localThemeScope, value, modifier, onValueChange), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ai.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K.X(localThemeScope, value, modifier2, onValueChange, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W0(InterfaceC5872l0 interfaceC5872l0, String it) {
        Intrinsics.j(it, "it");
        B0(interfaceC5872l0, it);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        W(localThemeScope, str, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X0(InterfaceC15783O interfaceC15783O, LocalThemeScope localThemeScope) {
        C15809k.d(interfaceC15783O, null, null, new w(localThemeScope, null), 3, null);
        return Unit.f143329a;
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
            Ki.Q.e(localThemeScope, ki.L0.f141930a, ComposableLambdaKt.c(812036843, true, new g(localThemeScope, value, modifier2, onValueChange, onInfoClick), composerStartRestartGroup, 54), composerStartRestartGroup, (i14 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ai.B
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K.Z(localThemeScope, value, modifier2, onInfoClick, onValueChange, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y0(InterfaceC5872l0 interfaceC5872l0, String it) {
        Intrinsics.j(it, "it");
        D0(interfaceC5872l0, it);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(LocalThemeScope localThemeScope, String str, Modifier modifier, Function0 function0, Function1 function1, int i10, int i11, Composer composer, int i12) {
        Y(localThemeScope, str, modifier, function0, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z0(InterfaceC15783O interfaceC15783O, LocalThemeScope localThemeScope) {
        C15809k.d(interfaceC15783O, null, null, new x(localThemeScope, null), 3, null);
        return Unit.f143329a;
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
            Ki.Q.e(localThemeScope, ki.L0.f141930a, ComposableLambdaKt.c(505685081, true, new h(localThemeScope, value, modifier2, onValueChange, onIconClick), composerStartRestartGroup, 54), composerStartRestartGroup, (i14 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ai.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K.b0(localThemeScope, value, modifier2, onIconClick, onValueChange, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a1(InterfaceC5872l0 interfaceC5872l0, String it) {
        Intrinsics.j(it, "it");
        F0(interfaceC5872l0, it);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0(LocalThemeScope localThemeScope, String str, Modifier modifier, Function0 function0, Function1 function1, int i10, int i11, Composer composer, int i12) {
        a0(localThemeScope, str, modifier, function0, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b1(InterfaceC5872l0 interfaceC5872l0, String it) {
        Intrinsics.j(it, "it");
        H0(interfaceC5872l0, it);
        return Unit.f143329a;
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
            Ki.Q.e(localThemeScope, ki.L0.f141930a, ComposableLambdaKt.c(-1354994455, true, new i(localThemeScope, value, modifier2, onValueChange, onIconClick), composerStartRestartGroup, 54), composerStartRestartGroup, (i14 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ai.z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K.d0(localThemeScope, value, modifier2, onIconClick, onValueChange, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c1(InterfaceC5872l0 interfaceC5872l0, String it) {
        Intrinsics.j(it, "it");
        J0(interfaceC5872l0, it);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d0(LocalThemeScope localThemeScope, String str, Modifier modifier, Function0 function0, Function1 function1, int i10, int i11, Composer composer, int i12) {
        c0(localThemeScope, str, modifier, function0, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d1(InterfaceC5872l0 interfaceC5872l0, String it) {
        Intrinsics.j(it, "it");
        L0(interfaceC5872l0, it);
        return Unit.f143329a;
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
            Ki.Q.e(localThemeScope, ki.L0.f141930a, ComposableLambdaKt.c(-1209776957, true, new j(localThemeScope, value, modifier, onValueChange), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ai.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K.f0(localThemeScope, value, modifier2, onValueChange, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e1(InterfaceC5872l0 interfaceC5872l0, String it) {
        Intrinsics.j(it, "it");
        N0(interfaceC5872l0, it);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f0(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        e0(localThemeScope, str, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f1(InterfaceC5872l0 interfaceC5872l0, String it) {
        Intrinsics.j(it, "it");
        P0(interfaceC5872l0, it);
        return Unit.f143329a;
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
            Ki.Q.e(localThemeScope, ki.L0.f141930a, ComposableLambdaKt.c(-449211425, true, new k(localThemeScope, value, modifier2, onValueChange, onLabelIconClick, onLeadingIconClick), composerStartRestartGroup, 54), composerStartRestartGroup, (i14 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ai.A
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K.h0(localThemeScope, value, modifier2, onValueChange, onLabelIconClick, onLeadingIconClick, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g1(InterfaceC15783O interfaceC15783O, LocalThemeScope localThemeScope) {
        C15809k.d(interfaceC15783O, null, null, new q(localThemeScope, null), 3, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1 function1, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        g0(localThemeScope, str, modifier, function1, function0, function02, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h1(InterfaceC15783O interfaceC15783O, LocalThemeScope localThemeScope) {
        C15809k.d(interfaceC15783O, null, null, new r(localThemeScope, null), 3, null);
        return Unit.f143329a;
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
            Ki.Q.e(localThemeScope, ki.L0.f141930a, ComposableLambdaKt.c(838234024, true, new l(localThemeScope, value, modifier, onValueChange), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ai.v
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K.j0(localThemeScope, value, modifier2, onValueChange, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i1(InterfaceC15783O interfaceC15783O, LocalThemeScope localThemeScope) {
        C15809k.d(interfaceC15783O, null, null, new s(localThemeScope, null), 3, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        i0(localThemeScope, str, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j1(InterfaceC5872l0 interfaceC5872l0, String it) {
        Intrinsics.j(it, "it");
        R0(interfaceC5872l0, it);
        return Unit.f143329a;
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
            Ki.Q.e(localThemeScope, ki.L0.f141930a, ComposableLambdaKt.c(618749615, true, new m(localThemeScope, value, modifier, onValueChange), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ai.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K.l0(localThemeScope, value, modifier2, onValueChange, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k1(InterfaceC15783O interfaceC15783O, LocalThemeScope localThemeScope) {
        C15809k.d(interfaceC15783O, null, null, new t(localThemeScope, null), 3, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        k0(localThemeScope, str, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l1(InterfaceC15783O interfaceC15783O, LocalThemeScope localThemeScope) {
        C15809k.d(interfaceC15783O, null, null, new u(localThemeScope, null), 3, null);
        return Unit.f143329a;
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
    public static final void m0(Ki.LocalThemeScope r28, androidx.compose.ui.Modifier r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ai.K.m0(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m1(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        t0(localThemeScope, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r0(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        m0(localThemeScope, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    public static final void t0(final Ki.LocalThemeScope r35, androidx.compose.ui.Modifier r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 1792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ai.K.t0(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final String A0(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    private static final void B0(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }

    private static final String C0(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    private static final void D0(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }

    private static final String E0(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    private static final void F0(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }

    private static final String G0(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    private static final void H0(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }

    private static final String I0(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    private static final void J0(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }

    private static final String K0(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean L(androidx.compose.runtime.z1<Boolean> z1Var) {
        return z1Var.getValue().booleanValue();
    }

    private static final void L0(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }

    private static final String M0(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    private static final void N0(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }

    private static final String O0(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    private static final void P0(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }

    private static final String Q0(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    private static final void R0(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(InterfaceC5872l0<String> interfaceC5872l0, InterfaceC5872l0<t1> interfaceC5872l02) {
        t1 t1Var;
        int length = interfaceC5872l0.getValue().length();
        if (1 <= length && length < 8) {
            t1Var = t1.f.f1283a;
        } else {
            t1Var = t1.d.f1281a;
        }
        q0(interfaceC5872l02, t1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q1.f.TextInput o0(DefaultTextInputs defaultTextInputs, InterfaceC5872l0<t1> interfaceC5872l0, InterfaceC5872l0<Boolean> interfaceC5872l02) {
        q1.f.TextInput warning;
        z1.W g10;
        t1 t1VarP0 = p0(interfaceC5872l0);
        if (t1VarP0 instanceof t1.d) {
            warning = defaultTextInputs.getDefault();
        } else if (Intrinsics.e(t1VarP0, t1.a.f1278a) || Intrinsics.e(t1VarP0, t1.b.f1279a)) {
            warning = defaultTextInputs.getError();
        } else if (Intrinsics.e(t1VarP0, t1.c.f1280a)) {
            warning = defaultTextInputs.getDefault();
        } else if (Intrinsics.e(t1VarP0, t1.e.f1282a)) {
            warning = defaultTextInputs.getSuccess();
        } else if (Intrinsics.e(t1VarP0, t1.f.f1283a)) {
            warning = defaultTextInputs.getWarning();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        q1.f.TextInput textInput = warning;
        if (interfaceC5872l02.getValue().booleanValue()) {
            g10 = z1.W.INSTANCE.c();
        } else {
            g10 = new z1.G((char) 0, 1, null);
        }
        return q1.f.TextInput.y(textInput, null, false, null, null, g10, null, null, false, 0, null, null, null, 4079, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t1 p0(InterfaceC5872l0<t1> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q0(InterfaceC5872l0<t1> interfaceC5872l0, t1 t1Var) {
        interfaceC5872l0.setValue(t1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(InterfaceC5872l0<String> interfaceC5872l0, InterfaceC5872l0<String> interfaceC5872l02, InterfaceC5872l0<t1> interfaceC5872l03) {
        t1 t1Var;
        if (interfaceC5872l0.getValue().length() < 8) {
            t1Var = t1.b.f1279a;
        } else if (!Intrinsics.e(interfaceC5872l0.getValue(), interfaceC5872l02.getValue())) {
            t1Var = t1.a.f1278a;
        } else {
            t1Var = t1.e.f1282a;
        }
        q0(interfaceC5872l03, t1Var);
    }

    private static final String u0(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    private static final void v0(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }

    private static final String w0(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    private static final void x0(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }

    private static final String y0(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    private static final void z0(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }
}
