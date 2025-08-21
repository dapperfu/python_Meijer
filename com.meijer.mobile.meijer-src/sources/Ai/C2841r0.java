package Ai;

import Ai.C2841r0;
import Ki.LocalThemeScope;
import P0.e;
import V0.C5489q0;
import android.content.Context;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.C5937w;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import d0.C13572f;
import j0.C14889J;
import j0.C14903g;
import j0.InterfaceC14888I;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import ki.q1;
import kotlin.C17943E0;
import kotlin.C17956L;
import kotlin.C17958M;
import kotlin.C17960N;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import qi.C16673d;
import r0.C16806i;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a)\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\b\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\b\u0010\u0006\u001a9\u0010\u0011\u001a\u00020\u0004*\u00020\t2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001aÉ\u0002\u00105\u001a\u000204*\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u00142\b\b\u0002\u0010\u001c\u001a\u00020\u00142\b\b\u0002\u0010\u001d\u001a\u00020\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00142\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\u00142\b\b\u0002\u0010\"\u001a\u00020\u00142\b\b\u0002\u0010#\u001a\u00020\u00142\b\b\u0002\u0010$\u001a\u00020\u00142\b\b\u0002\u0010%\u001a\u00020\u00142\b\b\u0002\u0010&\u001a\u00020\u00142\b\b\u0002\u0010'\u001a\u00020\u00142\b\b\u0002\u0010(\u001a\u00020\u00142\b\b\u0002\u0010)\u001a\u00020\u00142\b\b\u0002\u0010*\u001a\u00020\u00142\b\b\u0002\u0010+\u001a\u00020\u00142\b\b\u0002\u0010,\u001a\u00020\u00142\b\b\u0002\u0010-\u001a\u00020\u00142\b\b\u0002\u0010.\u001a\u00020\u00142\b\b\u0002\u0010/\u001a\u00020\u00142\b\b\u0002\u00100\u001a\u00020\u00142\b\b\u0002\u00101\u001a\u00020\u00142\b\b\u0002\u00102\u001a\u00020\u00142\b\b\u0002\u00103\u001a\u00020\u0014H\u0007¢\u0006\u0004\b5\u00106¨\u00069²\u0006\f\u00108\u001a\u0002078\nX\u008a\u0084\u0002²\u0006\f\u00108\u001a\u0002078\nX\u008a\u0084\u0002"}, d2 = {"LAi/g1;", "", "Landroidx/compose/ui/Modifier;", "modifier", "", "d", "(LAi/g1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "g", "LKi/M;", "Lkotlin/Function0;", "onClick", "Lqi/d;", BarcodePickDeserializer.FIELD_ICON, "Lki/w1;", "Lki/j1;", "assembly", "j", "(LKi/M;Lkotlin/jvm/functions/Function0;Lqi/d;Lki/w1;Landroidx/compose/runtime/Composer;I)V", "Lx0/G1;", "LV0/q0;", "textColor", "disabledTextColor", "backgroundColor", "cursorColor", "errorCursorColor", "warningCursorColor", "successCursorColor", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "warningBorderColor", "successBorderColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "warningLeadingIconColor", "successLeadingIconColor", "trailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "warningTrailingIconColor", "successTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "warningLabelColor", "successLabelColor", "placeholderColor", "disabledPlaceholderColor", "LAi/c1;", "o", "(Lx0/G1;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIII)LAi/c1;", "", "isFocused", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Ai.r0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2841r0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ai.r0$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2817g1<Number, Number> f1213a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0.l f1214b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f1215c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f1216d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.z1<Boolean> f1217e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f1218f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ai.r0$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0020a extends FunctionReferenceImpl implements Function1<String, Unit> {
            C0020a(Object obj) {
                super(1, obj, C2823i1.class, "sanitizeInputs", "sanitizeInputs(Lcom/meijer/mobile/android_acres_library/composables/form_fields/CustomFieldComposer;Ljava/lang/String;)V", 1);
            }

            public final void a(String p02) {
                Intrinsics.j(p02, "p0");
                C2823i1.b((InterfaceC2817g1) this.receiver, p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                a(str);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Ai.r0$a$b */
        static final class b implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.z1<Modifier> f1219a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f1220b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC2817g1<Number, Number> f1221c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.z1<Boolean> f1222d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Ai.r0$a$b$a, reason: collision with other inner class name */
            static final class C0021a implements MeasurePolicy {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Context f1223a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f1224b;

                C0021a(Context context, boolean z10) {
                    this.f1223a = context;
                    this.f1224b = z10;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit b(List list, Ref.IntRef intRef, f0.a layout) {
                    Intrinsics.j(layout, "$this$layout");
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        androidx.compose.ui.layout.f0 f0Var = (androidx.compose.ui.layout.f0) it.next();
                        f0.a aVar = layout;
                        f0.a.l(aVar, f0Var, intRef.f143740a, 0, 0.0f, 4, null);
                        intRef.f143740a += f0Var.M0();
                        layout = aVar;
                    }
                    return Unit.f143329a;
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final androidx.compose.ui.layout.J d(androidx.compose.ui.layout.K Layout, List<? extends androidx.compose.ui.layout.I> measurables, long j10) {
                    Intrinsics.j(Layout, "$this$Layout");
                    Intrinsics.j(measurables, "measurables");
                    float fK = Layout.K(this.f1223a.getResources().getDisplayMetrics().widthPixels);
                    int iE0 = H1.b.l(j10) >= Layout.E0(fK) ? Layout.E0(fK) : H1.b.l(j10);
                    final ArrayList arrayList = new ArrayList();
                    int i10 = iE0;
                    int iMax = 0;
                    int i11 = 0;
                    for (androidx.compose.ui.layout.I i12 : measurables) {
                        int iW = i12.W(a.e.API_PRIORITY_OTHER);
                        int iD0 = i12.d0(iW);
                        int iI1 = (int) Layout.I1(H1.h.p(0));
                        if (Intrinsics.e(C5937w.a(i12), "InnerTextField")) {
                            iI1 = (int) Layout.I1(H1.h.p(2));
                        }
                        int i13 = iD0 + iI1;
                        arrayList.add(i12.k0(H1.b.c(j10, i13, i13, iW, iW)));
                        iMax = Math.max(iMax, iW);
                        i11 += iD0;
                    }
                    int iF = this.f1224b ? i10 : RangesKt.f((((int) Layout.I1(H1.h.p(22))) * 2) + i11, (int) Layout.I1(H1.h.p(85)));
                    final Ref.IntRef intRef = new Ref.IntRef();
                    intRef.f143740a = (iF - i11) / 2;
                    return androidx.compose.ui.layout.K.G0(Layout, iF, iMax, null, new Function1() { // from class: Ai.s0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C2841r0.a.b.C0021a.b(arrayList, intRef, (f0.a) obj);
                        }
                    }, 4, null);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            b(androidx.compose.runtime.z1<? extends Modifier> z1Var, boolean z10, InterfaceC2817g1<Number, Number> interfaceC2817g1, androidx.compose.runtime.z1<Boolean> z1Var2) {
                this.f1219a = z1Var;
                this.f1220b = z10;
                this.f1221c = interfaceC2817g1;
                this.f1222d = z1Var2;
            }

            public final void a(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer, int i10) {
                int i11;
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
                    ComposerKt.U(-1402058418, i11, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.AdsQuantityInput.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsQuantityInputComposer.kt:116)");
                }
                Modifier value = this.f1219a.getValue();
                e.Companion companion = P0.e.INSTANCE;
                e.c cVarI = companion.i();
                boolean z10 = this.f1220b;
                InterfaceC2817g1<Number, Number> interfaceC2817g1 = this.f1221c;
                androidx.compose.runtime.z1<Boolean> z1Var = this.f1222d;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), cVarI, composer2, 48);
                int iA = C5859f.a(composer2, 0);
                InterfaceC5884s interfaceC5884sR = composer2.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer2, value);
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
                Context context = (Context) composer2.o(AndroidCompositionLocals_androidKt.g());
                composer2.startReplaceGroup(-1633490746);
                boolean zD = composer2.D(context) | composer2.a(z10);
                Object objB = composer2.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new C0021a(context, z10);
                    composer2.t(objB);
                }
                MeasurePolicy measurePolicy = (MeasurePolicy) objB;
                composer2.P();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                int iA2 = C5859f.a(composer2, 0);
                InterfaceC5884s interfaceC5884sR2 = composer2.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer2, companion3);
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
                androidx.compose.runtime.D1.c(composerA2, measurePolicy, companion2.e());
                androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion2.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                androidx.compose.runtime.D1.c(composerA2, modifierE2, companion2.f());
                if (C2841r0.e(z1Var)) {
                    composer2.startReplaceGroup(-2124585517);
                    Modifier modifierB = C5937w.b(companion3, "InnerTextField");
                    MeasurePolicy measurePolicyG = C5804h.g(companion.o(), false);
                    int iA3 = C5859f.a(composer2, 0);
                    InterfaceC5884s interfaceC5884sR3 = composer2.r();
                    Modifier modifierE3 = androidx.compose.ui.b.e(composer2, modifierB);
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
                    androidx.compose.runtime.D1.c(composerA3, measurePolicyG, companion2.e());
                    androidx.compose.runtime.D1.c(composerA3, interfaceC5884sR3, companion2.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion2.b();
                    if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                        composerA3.t(Integer.valueOf(iA3));
                        composerA3.n(Integer.valueOf(iA3), function2B3);
                    }
                    androidx.compose.runtime.D1.c(composerA3, modifierE3, companion2.f());
                    C5806j c5806j = C5806j.f48836a;
                    innerTextField.invoke(composer2, Integer.valueOf(i11 & 14));
                    composer2.v();
                    composer2.P();
                } else {
                    composer2.startReplaceGroup(-2124349235);
                    TextStyle textStyleC = TextStyle.c(interfaceC2817g1.getTemplate().getTextStyle().getStyle(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, F1.j.INSTANCE.a(), 0, 0L, null, null, null, 0, 0, null, 16744447, null);
                    StringBuilder sb2 = new StringBuilder();
                    q1.f fVarB = interfaceC2817g1.getTemplate();
                    Intrinsics.h(fVarB, "null cannot be cast to non-null type com.meijer.mobile.android_acres_library.assemblies.Template.FormField.QuantityInput");
                    sb2.append(((q1.f.QuantityInput) fVarB).getSignifier());
                    sb2.append(' ');
                    int i12 = i11;
                    N1.b(sb2.toString(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleC, composer, 0, 0, 65534);
                    composer2 = composer;
                    Modifier modifierB2 = C5937w.b(companion3, "InnerTextField");
                    MeasurePolicy measurePolicyG2 = C5804h.g(companion.o(), false);
                    int iA4 = C5859f.a(composer2, 0);
                    InterfaceC5884s interfaceC5884sR4 = composer2.r();
                    Modifier modifierE4 = androidx.compose.ui.b.e(composer2, modifierB2);
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
                    androidx.compose.runtime.D1.c(composerA4, measurePolicyG2, companion2.e());
                    androidx.compose.runtime.D1.c(composerA4, interfaceC5884sR4, companion2.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion2.b();
                    if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                        composerA4.t(Integer.valueOf(iA4));
                        composerA4.n(Integer.valueOf(iA4), function2B4);
                    }
                    androidx.compose.runtime.D1.c(composerA4, modifierE4, companion2.f());
                    C5806j c5806j2 = C5806j.f48836a;
                    innerTextField.invoke(composer2, Integer.valueOf(i12 & 14));
                    composer2.v();
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
                return Unit.f143329a;
            }
        }

        a(InterfaceC2817g1<Number, Number> interfaceC2817g1, h0.l lVar, boolean z10, boolean z11, androidx.compose.runtime.z1<Boolean> z1Var, LocalThemeScope localThemeScope) {
            this.f1213a = interfaceC2817g1;
            this.f1214b = lVar;
            this.f1215c = z10;
            this.f1216d = z11;
            this.f1217e = z1Var;
            this.f1218f = localThemeScope;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Modifier c(boolean z10, boolean z11, InterfaceC2817g1 interfaceC2817g1, LocalThemeScope localThemeScope, long j10, androidx.compose.runtime.z1 z1Var) {
            if ((z10 || z11) && !C2841r0.e(z1Var)) {
                return Modifier.INSTANCE;
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            V0.D1 shape = interfaceC2817g1.getTemplate().getShape();
            if (shape == null) {
                shape = C16806i.c(localThemeScope.getAdsCornerRadii().getRadius04().getDp());
            }
            return C13572f.g(companion, H1.h.p(1), j10, shape);
        }

        public final void b(Composer composer, int i10) {
            Modifier.Companion companion;
            String str;
            LocalThemeScope localThemeScope;
            int i11;
            int i12;
            final LocalThemeScope localThemeScope2;
            String str2;
            int i13;
            int i14;
            androidx.compose.runtime.z1<Boolean> z1Var;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1615055701, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.AdsQuantityInput.<anonymous>.<anonymous> (AdsQuantityInputComposer.kt:74)");
            }
            e.Companion companion2 = P0.e.INSTANCE;
            e.c cVarI = companion2.i();
            final InterfaceC2817g1<Number, Number> interfaceC2817g1 = this.f1213a;
            h0.l lVar = this.f1214b;
            final boolean z10 = this.f1215c;
            final boolean z11 = this.f1216d;
            final androidx.compose.runtime.z1<Boolean> z1Var2 = this.f1217e;
            LocalThemeScope localThemeScope3 = this.f1218f;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            C5800d c5800d = C5800d.f48779a;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), cVarI, composer, 48);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion3);
            InterfaceC5953g.Companion companion4 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion4.a();
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
            androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion4.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion4.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion4.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion4.f());
            C14889J c14889j = C14889J.f139620a;
            C16673d c16673dC0 = interfaceC2817g1.getLeadingIcon();
            composer.startReplaceGroup(-710251929);
            if (c16673dC0 == null) {
                str = "null cannot be cast to non-null type com.meijer.mobile.android_acres_library.assemblies.Template.FormField.QuantityInput";
                i11 = 6;
                localThemeScope = localThemeScope3;
                companion = companion3;
            } else {
                Modifier modifierM = androidx.compose.foundation.layout.D.m(companion3, 0.0f, 0.0f, H1.h.p(4), 0.0f, 11, null);
                companion = companion3;
                MeasurePolicy measurePolicyA = C5807k.a(c5800d.b(), companion2.k(), composer, 6);
                int iA2 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierM);
                Function0<InterfaceC5953g> function0A2 = companion4.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A2);
                } else {
                    composer.s();
                }
                Composer composerA2 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA2, measurePolicyA, companion4.e());
                androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion4.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion4.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                androidx.compose.runtime.D1.c(composerA2, modifierE2, companion4.f());
                C14903g c14903g = C14903g.f139698a;
                Function0<Unit> function0V0 = interfaceC2817g1.v0();
                q1.f fVarB = interfaceC2817g1.getTemplate();
                Intrinsics.h(fVarB, "null cannot be cast to non-null type com.meijer.mobile.android_acres_library.assemblies.Template.FormField.QuantityInput");
                str = "null cannot be cast to non-null type com.meijer.mobile.android_acres_library.assemblies.Template.FormField.QuantityInput";
                localThemeScope = localThemeScope3;
                i11 = 6;
                C2841r0.j(localThemeScope, function0V0, c16673dC0, ((q1.f.QuantityInput) fVarB).z(), composer, 0);
                composer.v();
            }
            composer.P();
            final long value = interfaceC2817g1.getTemplate().getColors().e(interfaceC2817g1.getTemplate().getState(), lVar, composer, 0).getValue().getValue();
            composer.startReplaceGroup(-1224400529);
            boolean zA = composer.a(z10) | composer.a(z11) | composer.V(z1Var2) | composer.D(interfaceC2817g1) | composer.D(localThemeScope) | composer.e(value);
            Object objB = composer.B();
            if (zA || objB == Composer.INSTANCE.a()) {
                i12 = 0;
                localThemeScope2 = localThemeScope;
                str2 = str;
                i13 = i11;
                i14 = 4;
                Object obj = new Function0() { // from class: Ai.q0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C2841r0.a.c(z10, z11, interfaceC2817g1, localThemeScope2, value, z1Var2);
                    }
                };
                z1Var = z1Var2;
                composer.t(obj);
                objB = obj;
            } else {
                localThemeScope2 = localThemeScope;
                z1Var = z1Var2;
                str2 = str;
                i12 = 0;
                i13 = i11;
                i14 = 4;
            }
            composer.P();
            androidx.compose.runtime.z1 z1VarE = androidx.compose.runtime.o1.e((Function0) objB);
            q1.f fVarB2 = interfaceC2817g1.getTemplate();
            Intrinsics.h(fVarB2, str2);
            Modifier outerModifier = ((q1.f.QuantityInput) fVarB2).getOuterModifier();
            MeasurePolicy measurePolicyA2 = C5807k.a(c5800d.b(), companion2.k(), composer, i13);
            int iA3 = C5859f.a(composer, i12);
            InterfaceC5884s interfaceC5884sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, outerModifier);
            Function0<InterfaceC5953g> function0A3 = companion4.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A3);
            } else {
                composer.s();
            }
            Composer composerA3 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA3, measurePolicyA2, companion4.e());
            androidx.compose.runtime.D1.c(composerA3, interfaceC5884sR3, companion4.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion4.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            androidx.compose.runtime.D1.c(composerA3, modifierE3, companion4.f());
            C14903g c14903g2 = C14903g.f139698a;
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(interfaceC2817g1);
            Object objB2 = composer.B();
            if (zD || objB2 == Composer.INSTANCE.a()) {
                objB2 = new C0020a(interfaceC2817g1);
                composer.t(objB2);
            }
            composer.P();
            String str3 = str2;
            int i15 = i14;
            C2814f1.c(interfaceC2817g1, null, lVar, (Function1) ((KFunction) objB2), ComposableLambdaKt.c(-1402058418, true, new b(z1VarE, z11, interfaceC2817g1, z1Var), composer, 54), composer, 24576, 1);
            composer.v();
            C16673d c16673dB = interfaceC2817g1.getTrailingIcon();
            composer.startReplaceGroup(-710003607);
            if (c16673dB != null) {
                Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion, H1.h.p(i15), 0.0f, 0.0f, 0.0f, 14, null);
                MeasurePolicy measurePolicyA3 = C5807k.a(c5800d.b(), companion2.k(), composer, 6);
                int iA4 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR4 = composer.r();
                Modifier modifierE4 = androidx.compose.ui.b.e(composer, modifierM2);
                Function0<InterfaceC5953g> function0A4 = companion4.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A4);
                } else {
                    composer.s();
                }
                Composer composerA4 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA4, measurePolicyA3, companion4.e());
                androidx.compose.runtime.D1.c(composerA4, interfaceC5884sR4, companion4.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion4.b();
                if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                    composerA4.t(Integer.valueOf(iA4));
                    composerA4.n(Integer.valueOf(iA4), function2B4);
                }
                androidx.compose.runtime.D1.c(composerA4, modifierE4, companion4.f());
                Function0<Unit> function0S = interfaceC2817g1.s();
                q1.f fVarB3 = interfaceC2817g1.getTemplate();
                Intrinsics.h(fVarB3, str3);
                C2841r0.j(localThemeScope2, function0S, c16673dB, ((q1.f.QuantityInput) fVarB3).z(), composer, 0);
                composer.v();
                Unit unit = Unit.f143329a;
            }
            composer.P();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ai.r0$b */
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2817g1<String, Unit> f1225a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0.l f1226b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f1227c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f1228d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.z1<Boolean> f1229e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f1230f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Ai.r0$b$a */
        static final class a implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.z1<Modifier> f1231a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f1232b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC2817g1<String, Unit> f1233c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.z1<Boolean> f1234d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Ai.r0$b$a$a, reason: collision with other inner class name */
            static final class C0022a implements MeasurePolicy {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Context f1235a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f1236b;

                C0022a(Context context, boolean z10) {
                    this.f1235a = context;
                    this.f1236b = z10;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit b(List list, Ref.IntRef intRef, f0.a layout) {
                    Intrinsics.j(layout, "$this$layout");
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        androidx.compose.ui.layout.f0 f0Var = (androidx.compose.ui.layout.f0) it.next();
                        f0.a aVar = layout;
                        f0.a.l(aVar, f0Var, intRef.f143740a, 0, 0.0f, 4, null);
                        intRef.f143740a += f0Var.M0();
                        layout = aVar;
                    }
                    return Unit.f143329a;
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final androidx.compose.ui.layout.J d(androidx.compose.ui.layout.K Layout, List<? extends androidx.compose.ui.layout.I> measurables, long j10) {
                    Intrinsics.j(Layout, "$this$Layout");
                    Intrinsics.j(measurables, "measurables");
                    float fK = Layout.K(this.f1235a.getResources().getDisplayMetrics().widthPixels);
                    int iE0 = H1.b.l(j10) >= Layout.E0(fK) ? Layout.E0(fK) : H1.b.l(j10);
                    final ArrayList arrayList = new ArrayList();
                    int i10 = iE0;
                    int iMax = 0;
                    int i11 = 0;
                    for (androidx.compose.ui.layout.I i12 : measurables) {
                        int iW = i12.W(a.e.API_PRIORITY_OTHER);
                        int iD0 = i12.d0(iW);
                        int iI1 = (int) Layout.I1(H1.h.p(0));
                        if (Intrinsics.e(C5937w.a(i12), "InnerTextField")) {
                            iI1 = (int) Layout.I1(H1.h.p(2));
                        }
                        int i13 = iD0 + iI1;
                        arrayList.add(i12.k0(H1.b.c(j10, i13, i13, iW, iW)));
                        iMax = Math.max(iMax, iW);
                        i11 += iD0;
                    }
                    int iF = this.f1236b ? i10 : RangesKt.f((((int) Layout.I1(H1.h.p(22))) * 2) + i11, (int) Layout.I1(H1.h.p(85)));
                    final Ref.IntRef intRef = new Ref.IntRef();
                    intRef.f143740a = (iF - i11) / 2;
                    return androidx.compose.ui.layout.K.G0(Layout, iF, iMax, null, new Function1() { // from class: Ai.v0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C2841r0.b.a.C0022a.b(arrayList, intRef, (f0.a) obj);
                        }
                    }, 4, null);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(androidx.compose.runtime.z1<? extends Modifier> z1Var, boolean z10, InterfaceC2817g1<String, Unit> interfaceC2817g1, androidx.compose.runtime.z1<Boolean> z1Var2) {
                this.f1231a = z1Var;
                this.f1232b = z10;
                this.f1233c = interfaceC2817g1;
                this.f1234d = z1Var2;
            }

            public final void a(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer, int i10) {
                int i11;
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
                    ComposerKt.U(224784142, i11, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.AdsQuantityInputComposer.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsQuantityInputComposer.kt:292)");
                }
                Modifier value = this.f1231a.getValue();
                e.Companion companion = P0.e.INSTANCE;
                e.c cVarI = companion.i();
                boolean z10 = this.f1232b;
                InterfaceC2817g1<String, Unit> interfaceC2817g1 = this.f1233c;
                androidx.compose.runtime.z1<Boolean> z1Var = this.f1234d;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), cVarI, composer2, 48);
                int iA = C5859f.a(composer2, 0);
                InterfaceC5884s interfaceC5884sR = composer2.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer2, value);
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
                Context context = (Context) composer2.o(AndroidCompositionLocals_androidKt.g());
                composer2.startReplaceGroup(-1633490746);
                boolean zD = composer2.D(context) | composer2.a(z10);
                Object objB = composer2.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new C0022a(context, z10);
                    composer2.t(objB);
                }
                MeasurePolicy measurePolicy = (MeasurePolicy) objB;
                composer2.P();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                int iA2 = C5859f.a(composer2, 0);
                InterfaceC5884s interfaceC5884sR2 = composer2.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer2, companion3);
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
                androidx.compose.runtime.D1.c(composerA2, measurePolicy, companion2.e());
                androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion2.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                androidx.compose.runtime.D1.c(composerA2, modifierE2, companion2.f());
                if (C2841r0.h(z1Var)) {
                    composer2.startReplaceGroup(-182362861);
                    Modifier modifierB = C5937w.b(companion3, "InnerTextField");
                    MeasurePolicy measurePolicyG = C5804h.g(companion.o(), false);
                    int iA3 = C5859f.a(composer2, 0);
                    InterfaceC5884s interfaceC5884sR3 = composer2.r();
                    Modifier modifierE3 = androidx.compose.ui.b.e(composer2, modifierB);
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
                    androidx.compose.runtime.D1.c(composerA3, measurePolicyG, companion2.e());
                    androidx.compose.runtime.D1.c(composerA3, interfaceC5884sR3, companion2.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion2.b();
                    if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                        composerA3.t(Integer.valueOf(iA3));
                        composerA3.n(Integer.valueOf(iA3), function2B3);
                    }
                    androidx.compose.runtime.D1.c(composerA3, modifierE3, companion2.f());
                    C5806j c5806j = C5806j.f48836a;
                    innerTextField.invoke(composer2, Integer.valueOf(i11 & 14));
                    composer2.v();
                    composer2.P();
                } else {
                    composer2.startReplaceGroup(-182126579);
                    TextStyle textStyleC = TextStyle.c(interfaceC2817g1.getTemplate().getTextStyle().getStyle(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, F1.j.INSTANCE.a(), 0, 0L, null, null, null, 0, 0, null, 16744447, null);
                    StringBuilder sb2 = new StringBuilder();
                    q1.f fVarB = interfaceC2817g1.getTemplate();
                    Intrinsics.h(fVarB, "null cannot be cast to non-null type com.meijer.mobile.android_acres_library.assemblies.Template.FormField.QuantityInput");
                    sb2.append(((q1.f.QuantityInput) fVarB).getSignifier());
                    sb2.append(' ');
                    int i12 = i11;
                    N1.b(sb2.toString(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleC, composer, 0, 0, 65534);
                    composer2 = composer;
                    Modifier modifierB2 = C5937w.b(companion3, "InnerTextField");
                    MeasurePolicy measurePolicyG2 = C5804h.g(companion.o(), false);
                    int iA4 = C5859f.a(composer2, 0);
                    InterfaceC5884s interfaceC5884sR4 = composer2.r();
                    Modifier modifierE4 = androidx.compose.ui.b.e(composer2, modifierB2);
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
                    androidx.compose.runtime.D1.c(composerA4, measurePolicyG2, companion2.e());
                    androidx.compose.runtime.D1.c(composerA4, interfaceC5884sR4, companion2.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion2.b();
                    if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                        composerA4.t(Integer.valueOf(iA4));
                        composerA4.n(Integer.valueOf(iA4), function2B4);
                    }
                    androidx.compose.runtime.D1.c(composerA4, modifierE4, companion2.f());
                    C5806j c5806j2 = C5806j.f48836a;
                    innerTextField.invoke(composer2, Integer.valueOf(i12 & 14));
                    composer2.v();
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
                return Unit.f143329a;
            }
        }

        b(InterfaceC2817g1<String, Unit> interfaceC2817g1, h0.l lVar, boolean z10, boolean z11, androidx.compose.runtime.z1<Boolean> z1Var, LocalThemeScope localThemeScope) {
            this.f1225a = interfaceC2817g1;
            this.f1226b = lVar;
            this.f1227c = z10;
            this.f1228d = z11;
            this.f1229e = z1Var;
            this.f1230f = localThemeScope;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Modifier d(boolean z10, boolean z11, InterfaceC2817g1 interfaceC2817g1, long j10, androidx.compose.runtime.z1 z1Var) {
            if ((z10 || z11) && !C2841r0.h(z1Var)) {
                return interfaceC2817g1.getTemplate().getModifier();
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            V0.D1 shape = interfaceC2817g1.getTemplate().getShape();
            if (shape == null) {
                shape = C16806i.c(H1.h.p(4));
            }
            return C13572f.g(companion, H1.h.p(1), j10, shape).then(interfaceC2817g1.getTemplate().getModifier());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(InterfaceC2817g1 interfaceC2817g1, String proposed) {
            Intrinsics.j(proposed, "proposed");
            Function2 function2C = interfaceC2817g1.C();
            Unit unit = Unit.f143329a;
            function2C.invoke(proposed, unit);
            return unit;
        }

        public final void c(Composer composer, int i10) {
            String str;
            int i11;
            int i12;
            LocalThemeScope localThemeScope;
            Composer composer2;
            final InterfaceC2817g1<String, Unit> interfaceC2817g1;
            Object obj;
            final boolean z10;
            final androidx.compose.runtime.z1<Boolean> z1Var;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(309669227, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.AdsQuantityInputComposer.<anonymous>.<anonymous> (AdsQuantityInputComposer.kt:253)");
            }
            e.Companion companion = P0.e.INSTANCE;
            e.c cVarI = companion.i();
            InterfaceC2817g1<String, Unit> interfaceC2817g12 = this.f1225a;
            h0.l lVar = this.f1226b;
            final boolean z11 = this.f1227c;
            boolean z12 = this.f1228d;
            androidx.compose.runtime.z1<Boolean> z1Var2 = this.f1229e;
            LocalThemeScope localThemeScope2 = this.f1230f;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            C5800d c5800d = C5800d.f48779a;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), cVarI, composer, 48);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion2);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
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
            androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion3.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            C16673d c16673dC0 = interfaceC2817g12.getLeadingIcon();
            composer.startReplaceGroup(-2002481369);
            if (c16673dC0 == null) {
                localThemeScope = localThemeScope2;
                str = "null cannot be cast to non-null type com.meijer.mobile.android_acres_library.assemblies.Template.FormField.QuantityInput";
                composer2 = composer;
                i11 = 6;
                i12 = 0;
            } else {
                Modifier modifierM = androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, H1.h.p(4), 0.0f, 11, null);
                MeasurePolicy measurePolicyA = C5807k.a(c5800d.b(), companion.k(), composer, 6);
                int iA2 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierM);
                Function0<InterfaceC5953g> function0A2 = companion3.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A2);
                } else {
                    composer.s();
                }
                Composer composerA2 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA2, measurePolicyA, companion3.e());
                androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
                C14903g c14903g = C14903g.f139698a;
                Function0<Unit> function0V0 = interfaceC2817g12.v0();
                q1.f fVarB = interfaceC2817g12.getTemplate();
                Intrinsics.h(fVarB, "null cannot be cast to non-null type com.meijer.mobile.android_acres_library.assemblies.Template.FormField.QuantityInput");
                ki.w1<ki.j1> w1VarZ = ((q1.f.QuantityInput) fVarB).z();
                str = "null cannot be cast to non-null type com.meijer.mobile.android_acres_library.assemblies.Template.FormField.QuantityInput";
                i11 = 6;
                i12 = 0;
                C2841r0.j(localThemeScope2, function0V0, c16673dC0, w1VarZ, composer, 0);
                localThemeScope = localThemeScope2;
                composer2 = composer;
                composer2.v();
            }
            composer2.P();
            final long value = interfaceC2817g12.getTemplate().getColors().e(interfaceC2817g12.getTemplate().getState(), lVar, composer2, i12).getValue().getValue();
            composer2.startReplaceGroup(-1224400529);
            boolean zA = composer2.a(z11) | composer2.a(z12) | composer2.V(z1Var2) | composer2.D(interfaceC2817g12) | composer2.e(value);
            Object objB = composer2.B();
            if (zA || objB == Composer.INSTANCE.a()) {
                interfaceC2817g1 = interfaceC2817g12;
                z10 = z12;
                z1Var = z1Var2;
                obj = new Function0() { // from class: Ai.t0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C2841r0.b.d(z11, z10, interfaceC2817g1, value, z1Var);
                    }
                };
                composer2.t(obj);
            } else {
                obj = objB;
                interfaceC2817g1 = interfaceC2817g12;
                z10 = z12;
                z1Var = z1Var2;
            }
            composer2.P();
            androidx.compose.runtime.z1 z1VarE = androidx.compose.runtime.o1.e((Function0) obj);
            q1.f fVarB2 = interfaceC2817g1.getTemplate();
            Intrinsics.h(fVarB2, str);
            Modifier outerModifier = ((q1.f.QuantityInput) fVarB2).getOuterModifier();
            MeasurePolicy measurePolicyA2 = C5807k.a(c5800d.b(), companion.k(), composer2, i11);
            int iA3 = C5859f.a(composer2, i12);
            InterfaceC5884s interfaceC5884sR3 = composer2.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer2, outerModifier);
            Function0<InterfaceC5953g> function0A3 = companion3.a();
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
            androidx.compose.runtime.D1.c(composerA3, measurePolicyA2, companion3.e());
            androidx.compose.runtime.D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            androidx.compose.runtime.D1.c(composerA3, modifierE3, companion3.f());
            C14903g c14903g2 = C14903g.f139698a;
            composer2.startReplaceGroup(5004770);
            boolean zD = composer2.D(interfaceC2817g1);
            Object objB2 = composer2.B();
            if (zD || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: Ai.u0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return C2841r0.b.e(interfaceC2817g1, (String) obj2);
                    }
                };
                composer2.t(objB2);
            }
            composer2.P();
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(224784142, true, new a(z1VarE, z10, interfaceC2817g1, z1Var), composer2, 54);
            InterfaceC2817g1<String, Unit> interfaceC2817g13 = interfaceC2817g1;
            C2814f1.c(interfaceC2817g13, null, lVar, (Function1) objB2, composableLambdaC, composer, 24576, 1);
            composer.v();
            C16673d c16673dB = interfaceC2817g13.getTrailingIcon();
            composer.startReplaceGroup(-2002243415);
            if (c16673dB != null) {
                String str2 = str;
                Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion2, H1.h.p(4), 0.0f, 0.0f, 0.0f, 14, null);
                MeasurePolicy measurePolicyA3 = C5807k.a(c5800d.b(), companion.k(), composer, 6);
                int iA4 = C5859f.a(composer, i12);
                InterfaceC5884s interfaceC5884sR4 = composer.r();
                Modifier modifierE4 = androidx.compose.ui.b.e(composer, modifierM2);
                Function0<InterfaceC5953g> function0A4 = companion3.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A4);
                } else {
                    composer.s();
                }
                Composer composerA4 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA4, measurePolicyA3, companion3.e());
                androidx.compose.runtime.D1.c(composerA4, interfaceC5884sR4, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion3.b();
                if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                    composerA4.t(Integer.valueOf(iA4));
                    composerA4.n(Integer.valueOf(iA4), function2B4);
                }
                androidx.compose.runtime.D1.c(composerA4, modifierE4, companion3.f());
                Function0<Unit> function0S = interfaceC2817g13.s();
                q1.f fVarB3 = interfaceC2817g13.getTemplate();
                Intrinsics.h(fVarB3, str2);
                C2841r0.j(localThemeScope, function0S, c16673dB, ((q1.f.QuantityInput) fVarB3).z(), composer, 0);
                composer.v();
                Unit unit = Unit.f143329a;
            }
            composer.P();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ai.r0$c */
    static final class c implements Function3<ki.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f1237a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f1238b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C16673d f1239c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Ai.r0$c$a */
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C16673d f1240a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ai.r0$c$a$a, reason: collision with other inner class name */
            public static final class C0023a implements Function1<C16673d, Unit> {

                /* renamed from: a, reason: collision with root package name */
                public static final C0023a f1241a = new C0023a();

                public final void a(C16673d c16673d) {
                    Intrinsics.j(c16673d, "<this>");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C16673d c16673d) {
                    a(c16673d);
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LJi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LJi/h;", "s", "()LJi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Ai.r0$c$a$b */
            public static final class b extends Ji.c<Integer, C16673d, C16673d> {

                /* renamed from: e, reason: collision with root package name and from kotlin metadata */
                private final androidx.compose.runtime.z1<Function1<C16673d, Unit>> latestContent;

                /* renamed from: f, reason: collision with root package name and from kotlin metadata */
                private final androidx.compose.runtime.z1<C16673d> state;

                /* renamed from: g, reason: collision with root package name and from kotlin metadata */
                private final C16673d initialScope;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: Ai.r0$c$a$b$a, reason: collision with other inner class name */
                public static final class C0024a implements Function0<C16673d> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ Ji.h f1245a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ b f1246b;

                    public C0024a(Ji.h hVar, b bVar) {
                        this.f1245a = hVar;
                        this.f1246b = bVar;
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [Ji.h, java.lang.Object, qi.d] */
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final C16673d invoke() {
                        ?? r02 = this.f1245a;
                        this.f1246b.t().getValue().invoke(r02);
                        return r02;
                    }
                }

                @Override // Ji.c
                public androidx.compose.runtime.z1<C16673d> r() {
                    return this.state;
                }

                @Override // Ji.i
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public C16673d getInitialScope() {
                    return this.initialScope;
                }

                public androidx.compose.runtime.z1<Function1<C16673d, Unit>> t() {
                    return this.latestContent;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public b(Function1 function1, Composer composer, int i10, Object[] objArr, Ji.h hVar) {
                    this.latestContent = androidx.compose.runtime.o1.p(function1, composer, (i10 >> 6) & 14);
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(objArr);
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = androidx.compose.runtime.o1.e(new C0024a(hVar, this));
                        composer.t(objB);
                    }
                    composer.P();
                    this.state = (androidx.compose.runtime.z1) objB;
                    this.initialScope = hVar;
                }
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1822499741, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.QtyButton.<anonymous>.<anonymous> (AdsQuantityInputComposer.kt:426)");
                }
                C16673d c16673d = this.f1240a;
                composer.startReplaceGroup(327606171);
                Modifier.Companion companion = Modifier.INSTANCE;
                Object[] objArr = {c16673d};
                composer.startReplaceGroup(-2104237158);
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = C0023a.f1241a;
                    composer.t(objB);
                }
                composer.P();
                Object[] objArrCopyOf = Arrays.copyOf(objArr, 1);
                composer.startReplaceGroup(1252494947);
                b bVar = new b((Function1) objB, composer, 0, objArrCopyOf, c16673d);
                composer.P();
                bVar.k(0, companion).invoke(composer, 0);
                composer.P();
                composer.P();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            a(C16673d c16673d) {
                this.f1240a = c16673d;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        c(LocalThemeScope localThemeScope, Function0<Unit> function0, C16673d c16673d) {
            this.f1237a = localThemeScope;
            this.f1238b = function0;
            this.f1239c = c16673d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c() {
            return Unit.f143329a;
        }

        public final void b(ki.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(875076848, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.QtyButton.<anonymous> (AdsQuantityInputComposer.kt:418)");
            }
            LocalThemeScope localThemeScope = this.f1237a;
            q1.d.StandardButton enabledAlternateButton = this.f1238b != null ? Assemble.getButtons().getEnabledAlternateButton() : Assemble.getButtons().getDisabledButton();
            Function0<Unit> function0 = this.f1238b;
            composer.startReplaceGroup(-864733219);
            if (function0 == null) {
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Ai.w0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C2841r0.c.c();
                        }
                    };
                    composer.t(objB);
                }
                function0 = (Function0) objB;
                composer.P();
            }
            composer.P();
            oi.E0.b(localThemeScope, enabledAlternateButton, function0, ComposableLambdaKt.c(1822499741, true, new a(this.f1239c), composer, 54), composer, 3072);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final AdsTextFieldColors o(kotlin.G1 outlinedAdsTextFieldColors, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, Composer composer, int i10, int i11, int i12, int i13, int i14) {
        Intrinsics.j(outlinedAdsTextFieldColors, "$this$outlinedAdsTextFieldColors");
        composer.startReplaceGroup(-2030468158);
        long jQ = (i14 & 1) != 0 ? C5489q0.q(((C5489q0) composer.o(C17960N.a())).getValue(), ((Number) composer.o(C17958M.a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long jQ2 = (i14 & 2) != 0 ? C5489q0.q(jQ, C17956L.f168212a.b(composer, C17956L.f168213b), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jI = (i14 & 4) != 0 ? C5489q0.INSTANCE.i() : j12;
        long jA = (i14 & 8) != 0 ? C5489q0.INSTANCE.a() : j13;
        long jD = (i14 & 16) != 0 ? C17943E0.f167967a.a(composer, C17943E0.f167968b).d() : j14;
        long jL = (i14 & 32) != 0 ? C17943E0.f167967a.a(composer, C17943E0.f167968b).l() : j15;
        long jM = (i14 & 64) != 0 ? C17943E0.f167967a.a(composer, C17943E0.f167968b).m() : j16;
        long jQ3 = (i14 & 128) != 0 ? C5489q0.q(C17943E0.f167967a.a(composer, C17943E0.f167968b).j(), C17956L.f168212a.c(composer, C17956L.f168213b), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long jQ4 = (i14 & 256) != 0 ? C5489q0.q(C17943E0.f167967a.a(composer, C17943E0.f167968b).i(), C17956L.f168212a.b(composer, C17956L.f168213b), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long jQ5 = (i14 & 512) != 0 ? C5489q0.q(jQ4, C17956L.f168212a.b(composer, C17956L.f168213b), 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long jD2 = (i14 & 1024) != 0 ? C17943E0.f167967a.a(composer, C17943E0.f167968b).d() : j20;
        long jL2 = (i14 & RecyclerView.m.FLAG_MOVED) != 0 ? C17943E0.f167967a.a(composer, C17943E0.f167968b).l() : j21;
        long jM2 = (i14 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? C17943E0.f167967a.a(composer, C17943E0.f167968b).m() : j22;
        long jQ6 = (i14 & 8192) != 0 ? C5489q0.q(C17943E0.f167967a.a(composer, C17943E0.f167968b).i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long jQ7 = (i14 & 16384) != 0 ? C5489q0.q(jQ6, C17956L.f168212a.b(composer, C17956L.f168213b), 0.0f, 0.0f, 0.0f, 14, null) : j24;
        long j41 = (32768 & i14) != 0 ? jQ6 : j25;
        long j42 = (65536 & i14) != 0 ? jQ6 : j26;
        long j43 = (131072 & i14) != 0 ? jQ6 : j27;
        long jQ8 = (262144 & i14) != 0 ? C5489q0.q(C17943E0.f167967a.a(composer, C17943E0.f167968b).i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j28;
        long jQ9 = (524288 & i14) != 0 ? C5489q0.q(jQ8, C17956L.f168212a.b(composer, C17956L.f168213b), 0.0f, 0.0f, 0.0f, 14, null) : j29;
        long jD3 = (1048576 & i14) != 0 ? C17943E0.f167967a.a(composer, C17943E0.f167968b).d() : j30;
        long j44 = (2097152 & i14) != 0 ? jQ8 : j31;
        long j45 = (4194304 & i14) != 0 ? jQ8 : j32;
        long jQ10 = (8388608 & i14) != 0 ? C5489q0.q(C17943E0.f167967a.a(composer, C17943E0.f167968b).j(), C17956L.f168212a.c(composer, C17956L.f168213b), 0.0f, 0.0f, 0.0f, 14, null) : j33;
        long jQ11 = (16777216 & i14) != 0 ? C5489q0.q(C17943E0.f167967a.a(composer, C17943E0.f167968b).i(), C17956L.f168212a.d(composer, C17956L.f168213b), 0.0f, 0.0f, 0.0f, 14, null) : j34;
        long jQ12 = (33554432 & i14) != 0 ? C5489q0.q(jQ11, C17956L.f168212a.b(composer, C17956L.f168213b), 0.0f, 0.0f, 0.0f, 14, null) : j35;
        long jD4 = (67108864 & i14) != 0 ? C17943E0.f167967a.a(composer, C17943E0.f167968b).d() : j36;
        long j46 = (134217728 & i14) != 0 ? jQ10 : j37;
        long j47 = (268435456 & i14) != 0 ? jQ10 : j38;
        long jQ13 = (536870912 & i14) != 0 ? C5489q0.q(C17943E0.f167967a.a(composer, C17943E0.f167968b).i(), C17956L.f168212a.d(composer, C17956L.f168213b), 0.0f, 0.0f, 0.0f, 14, null) : j39;
        long jQ14 = (i14 & 1073741824) != 0 ? C5489q0.q(jQ13, C17956L.f168212a.b(composer, C17956L.f168213b), 0.0f, 0.0f, 0.0f, 14, null) : j40;
        if (ComposerKt.M()) {
            ComposerKt.U(-2030468158, i10, i11, "com.meijer.mobile.android_acres_library.composables.form_fields.outlinedAdsTextFieldColors (AdsQuantityInputComposer.kt:463)");
        }
        outlinedAdsTextFieldColors.f(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, 0, (i10 << 3) & 112, 2097151);
        AdsTextFieldColors adsTextFieldColors = new AdsTextFieldColors(jQ, jQ2, jA, jD, jQ3, jQ4, jD2, jL, jM, jQ5, jL2, jM2, jQ6, jQ7, j41, jQ8, jQ9, jD3, j44, j45, j42, j43, jI, jQ10, jQ11, jQ12, jD4, j46, j47, jQ13, jQ14, null);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return adsTextFieldColors;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    @kotlin.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ai.InterfaceC2817g1<java.lang.Number, java.lang.Number> r21, androidx.compose.ui.Modifier r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ai.C2841r0.d(Ai.g1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(InterfaceC2817g1 interfaceC2817g1, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        d(interfaceC2817g1, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ai.InterfaceC2817g1<java.lang.String, kotlin.Unit> r21, androidx.compose.ui.Modifier r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ai.C2841r0.g(Ai.g1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(InterfaceC2817g1 interfaceC2817g1, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        g(interfaceC2817g1, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, Function0 function0, C16673d c16673d, ki.w1 w1Var, int i10, Composer composer, int i11) {
        j(localThemeScope, function0, c16673d, w1Var, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(androidx.compose.runtime.z1<Boolean> z1Var) {
        return z1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(androidx.compose.runtime.z1<Boolean> z1Var) {
        return z1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(final LocalThemeScope localThemeScope, final Function0<Unit> function0, final C16673d c16673d, final ki.w1<ki.j1> w1Var, Composer composer, final int i10) {
        int i11;
        boolean zD;
        int i12;
        boolean zD2;
        int i13;
        int i14;
        boolean zD3;
        int i15;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2069656692);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD3 = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD3 = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD3) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(function0)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if ((i10 & 512) == 0) {
                zD2 = composerStartRestartGroup.V(c16673d);
            } else {
                zD2 = composerStartRestartGroup.D(c16673d);
            }
            if (zD2) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 3072) == 0) {
            if ((i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
                zD = composerStartRestartGroup.V(w1Var);
            } else {
                zD = composerStartRestartGroup.D(w1Var);
            }
            if (zD) {
                i12 = RecyclerView.m.FLAG_MOVED;
            } else {
                i12 = 1024;
            }
            i11 |= i12;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-2069656692, i11, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.QtyButton (AdsQuantityInputComposer.kt:417)");
            }
            Ki.Q.e(localThemeScope, w1Var, ComposableLambdaKt.c(875076848, true, new c(localThemeScope, function0, c16673d), composerStartRestartGroup, 54), composerStartRestartGroup, ((i11 >> 6) & 112) | (i11 & 14) | 384);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ai.p0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C2841r0.k(localThemeScope, function0, c16673d, w1Var, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
