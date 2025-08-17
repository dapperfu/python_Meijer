package Pi;

import Ji.LocalThemeScope;
import P0.e;
import Pi.C4888q6;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import j0.C14801J;
import j0.C14815g;
import ji.InterfaceC14926b0;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/M;", "", "b", "(LJi/M;Landroidx/compose/runtime/Composer;I)V", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Pi.q6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4888q6 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Pi.q6$a */
    static final class a implements Function3<InterfaceC14926b0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f27789a;

        public final void F(InterfaceC14926b0 Assemble, Composer composer, int i10) {
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
                ComposerKt.U(1981743975, i11, -1, "com.meijer.mobile.androidacres.showcase.components.StaticInlineShowcase.<anonymous>.<anonymous> (InlineNotificationShowcase.kt:49)");
            }
            final Toast toastMakeText = Toast.makeText((Context) composer.o(AndroidCompositionLocals_androidKt.g()), "This is a toasts", 0);
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 4;
            float f11 = 12;
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), 0.0f, H1.h.p(f10), H1.h.p(f11), 2, null);
            LocalThemeScope localThemeScope = this.f27789a;
            C5658d c5658d = C5658d.f48555a;
            C5658d.e eVarG = c5658d.g();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(eVarG, companion2.l(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierM);
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
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
            androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion3.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            Ci.j.i(localThemeScope, null, "Small messages", "Quick and short", Assemble.getToastVariant().getDefault(), null, composer, 3456, 17);
            composer.v();
            Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), 0.0f, H1.h.p(f10), H1.h.p(f11), 2, null);
            LocalThemeScope localThemeScope2 = this.f27789a;
            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierM2);
            Function0<InterfaceC5811g> function0A2 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyB2, companion3.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
            q1.m.Inline inline = Assemble.getToastVariant().getDefault();
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(toastMakeText);
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Pi.Q5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4888q6.a.W(toastMakeText, (Ci.o) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Ci.j.i(localThemeScope2, null, "Small messages", "Quick and short", inline, (Function1) objB, composer, 3456, 1);
            composer.v();
            Modifier modifierM3 = androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), 0.0f, H1.h.p(f10), H1.h.p(f11), 2, null);
            LocalThemeScope localThemeScope3 = this.f27789a;
            MeasurePolicy measurePolicyB3 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
            int iA3 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierM3);
            Function0<InterfaceC5811g> function0A3 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A3);
            } else {
                composer.s();
            }
            Composer composerA3 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA3, measurePolicyB3, companion3.e());
            androidx.compose.runtime.D1.c(composerA3, interfaceC5742sR3, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            androidx.compose.runtime.D1.c(composerA3, modifierE3, companion3.f());
            Ci.j.i(localThemeScope3, null, "A very long message that is going to show how the toast actually looks if there is more information", "Quick anda sort", Assemble.getToastVariant().getDefault(), null, composer, 3456, 17);
            composer.v();
            Modifier modifierM4 = androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), 0.0f, H1.h.p(f10), H1.h.p(f11), 2, null);
            LocalThemeScope localThemeScope4 = this.f27789a;
            MeasurePolicy measurePolicyB4 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
            int iA4 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR4 = composer.r();
            Modifier modifierE4 = androidx.compose.ui.b.e(composer, modifierM4);
            Function0<InterfaceC5811g> function0A4 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A4);
            } else {
                composer.s();
            }
            Composer composerA4 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA4, measurePolicyB4, companion3.e());
            androidx.compose.runtime.D1.c(composerA4, interfaceC5742sR4, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B4 = companion3.b();
            if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                composerA4.t(Integer.valueOf(iA4));
                composerA4.n(Integer.valueOf(iA4), function2B4);
            }
            androidx.compose.runtime.D1.c(composerA4, modifierE4, companion3.f());
            q1.m.Inline inline2 = Assemble.getToastVariant().getDefault();
            composer.startReplaceGroup(5004770);
            boolean zD2 = composer.D(toastMakeText);
            Object objB2 = composer.B();
            if (zD2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: Pi.j6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4888q6.a.e0(toastMakeText, (Ci.o) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            Ci.j.i(localThemeScope4, null, "Small", "Quick and short", inline2, (Function1) objB2, composer, 3456, 1);
            composer.v();
            Modifier modifierM5 = androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), 0.0f, H1.h.p(f10), H1.h.p(f11), 2, null);
            LocalThemeScope localThemeScope5 = this.f27789a;
            MeasurePolicy measurePolicyB5 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
            int iA5 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR5 = composer.r();
            Modifier modifierE5 = androidx.compose.ui.b.e(composer, modifierM5);
            Function0<InterfaceC5811g> function0A5 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A5);
            } else {
                composer.s();
            }
            Composer composerA5 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA5, measurePolicyB5, companion3.e());
            androidx.compose.runtime.D1.c(composerA5, interfaceC5742sR5, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B5 = companion3.b();
            if (composerA5.getInserting() || !Intrinsics.e(composerA5.B(), Integer.valueOf(iA5))) {
                composerA5.t(Integer.valueOf(iA5));
                composerA5.n(Integer.valueOf(iA5), function2B5);
            }
            androidx.compose.runtime.D1.c(composerA5, modifierE5, companion3.f());
            q1.m.Inline inline3 = Assemble.getToastVariant().getDefault();
            composer.startReplaceGroup(5004770);
            boolean zD3 = composer.D(toastMakeText);
            Object objB3 = composer.B();
            if (zD3 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function1() { // from class: Pi.k6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4888q6.a.G(toastMakeText, (Ci.o) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            Ci.j.i(localThemeScope5, null, "Small message", "Quick and short", inline3, (Function1) objB3, composer, 3456, 1);
            composer.v();
            Modifier modifierM6 = androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), 0.0f, H1.h.p(f10), H1.h.p(f11), 2, null);
            LocalThemeScope localThemeScope6 = this.f27789a;
            MeasurePolicy measurePolicyB6 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
            int iA6 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR6 = composer.r();
            Modifier modifierE6 = androidx.compose.ui.b.e(composer, modifierM6);
            Function0<InterfaceC5811g> function0A6 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A6);
            } else {
                composer.s();
            }
            Composer composerA6 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA6, measurePolicyB6, companion3.e());
            androidx.compose.runtime.D1.c(composerA6, interfaceC5742sR6, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B6 = companion3.b();
            if (composerA6.getInserting() || !Intrinsics.e(composerA6.B(), Integer.valueOf(iA6))) {
                composerA6.t(Integer.valueOf(iA6));
                composerA6.n(Integer.valueOf(iA6), function2B6);
            }
            androidx.compose.runtime.D1.c(composerA6, modifierE6, companion3.f());
            q1.m.Inline inline4 = Assemble.getToastVariant().getDefault();
            composer.startReplaceGroup(5004770);
            boolean zD4 = composer.D(toastMakeText);
            Object objB4 = composer.B();
            if (zD4 || objB4 == Composer.INSTANCE.a()) {
                objB4 = new Function1() { // from class: Pi.l6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4888q6.a.J(toastMakeText, (Ci.o) obj);
                    }
                };
                composer.t(objB4);
            }
            composer.P();
            Ci.j.i(localThemeScope6, null, "A really long text that is going to wrap at the end showing in two lines", "Quick and short", inline4, (Function1) objB4, composer, 3456, 1);
            composer.v();
            Modifier modifierM7 = androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), 0.0f, H1.h.p(f10), H1.h.p(f11), 2, null);
            LocalThemeScope localThemeScope7 = this.f27789a;
            MeasurePolicy measurePolicyB7 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
            int iA7 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR7 = composer.r();
            Modifier modifierE7 = androidx.compose.ui.b.e(composer, modifierM7);
            Function0<InterfaceC5811g> function0A7 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A7);
            } else {
                composer.s();
            }
            Composer composerA7 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA7, measurePolicyB7, companion3.e());
            androidx.compose.runtime.D1.c(composerA7, interfaceC5742sR7, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B7 = companion3.b();
            if (composerA7.getInserting() || !Intrinsics.e(composerA7.B(), Integer.valueOf(iA7))) {
                composerA7.t(Integer.valueOf(iA7));
                composerA7.n(Integer.valueOf(iA7), function2B7);
            }
            androidx.compose.runtime.D1.c(composerA7, modifierE7, companion3.f());
            q1.m.Inline error = Assemble.getToastVariant().getError();
            composer.startReplaceGroup(5004770);
            boolean zD5 = composer.D(toastMakeText);
            Object objB5 = composer.B();
            if (zD5 || objB5 == Composer.INSTANCE.a()) {
                objB5 = new Function1() { // from class: Pi.m6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4888q6.a.M(toastMakeText, (Ci.o) obj);
                    }
                };
                composer.t(objB5);
            }
            composer.P();
            Ci.j.i(localThemeScope7, null, "Also a small message", "Quick and short", error, (Function1) objB5, composer, 3456, 1);
            composer.v();
            Modifier modifierM8 = androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), 0.0f, H1.h.p(f10), H1.h.p(f11), 2, null);
            LocalThemeScope localThemeScope8 = this.f27789a;
            MeasurePolicy measurePolicyB8 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
            int iA8 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR8 = composer.r();
            Modifier modifierE8 = androidx.compose.ui.b.e(composer, modifierM8);
            Function0<InterfaceC5811g> function0A8 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A8);
            } else {
                composer.s();
            }
            Composer composerA8 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA8, measurePolicyB8, companion3.e());
            androidx.compose.runtime.D1.c(composerA8, interfaceC5742sR8, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B8 = companion3.b();
            if (composerA8.getInserting() || !Intrinsics.e(composerA8.B(), Integer.valueOf(iA8))) {
                composerA8.t(Integer.valueOf(iA8));
                composerA8.n(Integer.valueOf(iA8), function2B8);
            }
            androidx.compose.runtime.D1.c(composerA8, modifierE8, companion3.f());
            q1.m.Inline error2 = Assemble.getToastVariant().getError();
            composer.startReplaceGroup(5004770);
            boolean zD6 = composer.D(toastMakeText);
            Object objB6 = composer.B();
            if (zD6 || objB6 == Composer.INSTANCE.a()) {
                objB6 = new Function1() { // from class: Pi.n6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4888q6.a.O(toastMakeText, (Ci.o) obj);
                    }
                };
                composer.t(objB6);
            }
            composer.P();
            Ci.j.i(localThemeScope8, null, "A really long text that is going to wrap at the end showing in two lines", "Quick and short", error2, (Function1) objB6, composer, 3456, 1);
            composer.v();
            Modifier modifierM9 = androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), 0.0f, H1.h.p(f10), H1.h.p(f11), 2, null);
            LocalThemeScope localThemeScope9 = this.f27789a;
            MeasurePolicy measurePolicyB9 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
            int iA9 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR9 = composer.r();
            Modifier modifierE9 = androidx.compose.ui.b.e(composer, modifierM9);
            Function0<InterfaceC5811g> function0A9 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A9);
            } else {
                composer.s();
            }
            Composer composerA9 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA9, measurePolicyB9, companion3.e());
            androidx.compose.runtime.D1.c(composerA9, interfaceC5742sR9, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B9 = companion3.b();
            if (composerA9.getInserting() || !Intrinsics.e(composerA9.B(), Integer.valueOf(iA9))) {
                composerA9.t(Integer.valueOf(iA9));
                composerA9.n(Integer.valueOf(iA9), function2B9);
            }
            androidx.compose.runtime.D1.c(composerA9, modifierE9, companion3.f());
            q1.m.Inline success = Assemble.getToastVariant().getSuccess();
            composer.startReplaceGroup(5004770);
            boolean zD7 = composer.D(toastMakeText);
            Object objB7 = composer.B();
            if (zD7 || objB7 == Composer.INSTANCE.a()) {
                objB7 = new Function1() { // from class: Pi.o6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4888q6.a.Q(toastMakeText, (Ci.o) obj);
                    }
                };
                composer.t(objB7);
            }
            composer.P();
            Ci.j.i(localThemeScope9, null, "Also a small message", "Quick and short", success, (Function1) objB7, composer, 3456, 1);
            composer.v();
            Modifier modifierM10 = androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), 0.0f, H1.h.p(f10), H1.h.p(f11), 2, null);
            LocalThemeScope localThemeScope10 = this.f27789a;
            MeasurePolicy measurePolicyB10 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
            int iA10 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR10 = composer.r();
            Modifier modifierE10 = androidx.compose.ui.b.e(composer, modifierM10);
            Function0<InterfaceC5811g> function0A10 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A10);
            } else {
                composer.s();
            }
            Composer composerA10 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA10, measurePolicyB10, companion3.e());
            androidx.compose.runtime.D1.c(composerA10, interfaceC5742sR10, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B10 = companion3.b();
            if (composerA10.getInserting() || !Intrinsics.e(composerA10.B(), Integer.valueOf(iA10))) {
                composerA10.t(Integer.valueOf(iA10));
                composerA10.n(Integer.valueOf(iA10), function2B10);
            }
            androidx.compose.runtime.D1.c(composerA10, modifierE10, companion3.f());
            q1.m.Inline success2 = Assemble.getToastVariant().getSuccess();
            composer.startReplaceGroup(5004770);
            boolean zD8 = composer.D(toastMakeText);
            Object objB8 = composer.B();
            if (zD8 || objB8 == Composer.INSTANCE.a()) {
                objB8 = new Function1() { // from class: Pi.p6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4888q6.a.S(toastMakeText, (Ci.o) obj);
                    }
                };
                composer.t(objB8);
            }
            composer.P();
            Ci.j.i(localThemeScope10, null, "A really long text that is going to wrap at the end showing in two lines", "Quick and short", success2, (Function1) objB8, composer, 3456, 1);
            composer.v();
            Modifier modifierM11 = androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), 0.0f, H1.h.p(f10), H1.h.p(f11), 2, null);
            LocalThemeScope localThemeScope11 = this.f27789a;
            MeasurePolicy measurePolicyB11 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
            int iA11 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR11 = composer.r();
            Modifier modifierE11 = androidx.compose.ui.b.e(composer, modifierM11);
            Function0<InterfaceC5811g> function0A11 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A11);
            } else {
                composer.s();
            }
            Composer composerA11 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA11, measurePolicyB11, companion3.e());
            androidx.compose.runtime.D1.c(composerA11, interfaceC5742sR11, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B11 = companion3.b();
            if (composerA11.getInserting() || !Intrinsics.e(composerA11.B(), Integer.valueOf(iA11))) {
                composerA11.t(Integer.valueOf(iA11));
                composerA11.n(Integer.valueOf(iA11), function2B11);
            }
            androidx.compose.runtime.D1.c(composerA11, modifierE11, companion3.f());
            q1.m.Inline informational = Assemble.getToastVariant().getInformational();
            composer.startReplaceGroup(5004770);
            boolean zD9 = composer.D(toastMakeText);
            Object objB9 = composer.B();
            if (zD9 || objB9 == Composer.INSTANCE.a()) {
                objB9 = new Function1() { // from class: Pi.R5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4888q6.a.U(toastMakeText, (Ci.o) obj);
                    }
                };
                composer.t(objB9);
            }
            composer.P();
            Ci.j.i(localThemeScope11, null, "A really long text that is going to wrap at the end showing in two lines", "Quick and short", informational, (Function1) objB9, composer, 3456, 1);
            composer.v();
            Modifier modifierM12 = androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), 0.0f, H1.h.p(f10), H1.h.p(f11), 2, null);
            LocalThemeScope localThemeScope12 = this.f27789a;
            MeasurePolicy measurePolicyB12 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
            int iA12 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR12 = composer.r();
            Modifier modifierE12 = androidx.compose.ui.b.e(composer, modifierM12);
            Function0<InterfaceC5811g> function0A12 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A12);
            } else {
                composer.s();
            }
            Composer composerA12 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA12, measurePolicyB12, companion3.e());
            androidx.compose.runtime.D1.c(composerA12, interfaceC5742sR12, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B12 = companion3.b();
            if (composerA12.getInserting() || !Intrinsics.e(composerA12.B(), Integer.valueOf(iA12))) {
                composerA12.t(Integer.valueOf(iA12));
                composerA12.n(Integer.valueOf(iA12), function2B12);
            }
            androidx.compose.runtime.D1.c(composerA12, modifierE12, companion3.f());
            q1.m.Inline informational2 = Assemble.getToastVariant().getInformational();
            composer.startReplaceGroup(5004770);
            boolean zD10 = composer.D(toastMakeText);
            Object objB10 = composer.B();
            if (zD10 || objB10 == Composer.INSTANCE.a()) {
                objB10 = new Function1() { // from class: Pi.S5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4888q6.a.Y(toastMakeText, (Ci.o) obj);
                    }
                };
                composer.t(objB10);
            }
            composer.P();
            Ci.j.i(localThemeScope12, null, "A really long text that is going to wrap at the end showing in two lines", "Quick and short", informational2, (Function1) objB10, composer, 3456, 1);
            composer.v();
            Modifier modifierM13 = androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), 0.0f, H1.h.p(f10), H1.h.p(f11), 2, null);
            LocalThemeScope localThemeScope13 = this.f27789a;
            MeasurePolicy measurePolicyB13 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
            int iA13 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR13 = composer.r();
            Modifier modifierE13 = androidx.compose.ui.b.e(composer, modifierM13);
            Function0<InterfaceC5811g> function0A13 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A13);
            } else {
                composer.s();
            }
            Composer composerA13 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA13, measurePolicyB13, companion3.e());
            androidx.compose.runtime.D1.c(composerA13, interfaceC5742sR13, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B13 = companion3.b();
            if (composerA13.getInserting() || !Intrinsics.e(composerA13.B(), Integer.valueOf(iA13))) {
                composerA13.t(Integer.valueOf(iA13));
                composerA13.n(Integer.valueOf(iA13), function2B13);
            }
            androidx.compose.runtime.D1.c(composerA13, modifierE13, companion3.f());
            q1.m.Inline warning = Assemble.getToastVariant().getWarning();
            composer.startReplaceGroup(5004770);
            boolean zD11 = composer.D(toastMakeText);
            Object objB11 = composer.B();
            if (zD11 || objB11 == Composer.INSTANCE.a()) {
                objB11 = new Function1() { // from class: Pi.b6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4888q6.a.a0(toastMakeText, (Ci.o) obj);
                    }
                };
                composer.t(objB11);
            }
            composer.P();
            Ci.j.i(localThemeScope13, null, "A really long text that is going to wrap at the end showing in two lines", "Long and really extended piece of informational warning, these are not the droids you are looking for", warning, (Function1) objB11, composer, 3456, 1);
            composer.v();
            Modifier modifierM14 = androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), 0.0f, H1.h.p(f10), H1.h.p(f11), 2, null);
            LocalThemeScope localThemeScope14 = this.f27789a;
            MeasurePolicy measurePolicyB14 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
            int iA14 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR14 = composer.r();
            Modifier modifierE14 = androidx.compose.ui.b.e(composer, modifierM14);
            Function0<InterfaceC5811g> function0A14 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A14);
            } else {
                composer.s();
            }
            Composer composerA14 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA14, measurePolicyB14, companion3.e());
            androidx.compose.runtime.D1.c(composerA14, interfaceC5742sR14, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B14 = companion3.b();
            if (composerA14.getInserting() || !Intrinsics.e(composerA14.B(), Integer.valueOf(iA14))) {
                composerA14.t(Integer.valueOf(iA14));
                composerA14.n(Integer.valueOf(iA14), function2B14);
            }
            androidx.compose.runtime.D1.c(composerA14, modifierE14, companion3.f());
            q1.m.Inline warning2 = Assemble.getToastVariant().getWarning();
            composer.startReplaceGroup(5004770);
            boolean zD12 = composer.D(toastMakeText);
            Object objB12 = composer.B();
            if (zD12 || objB12 == Composer.INSTANCE.a()) {
                objB12 = new Function1() { // from class: Pi.i6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4888q6.a.c0(toastMakeText, (Ci.o) obj);
                    }
                };
                composer.t(objB12);
            }
            composer.P();
            Ci.j.i(localThemeScope14, null, "A really long text that is going to wrap at the end showing in two lines", "Long and really extended piece of informational warning, these are not the droids you are looking for", warning2, (Function1) objB12, composer, 3456, 1);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        a(LocalThemeScope localThemeScope) {
            this.f27789a = localThemeScope;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit G(final Toast toast, Ci.o AdsInlineNotification) {
            Intrinsics.j(AdsInlineNotification, "$this$AdsInlineNotification");
            AdsInlineNotification.D("Label", new Function0() { // from class: Pi.g6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4888q6.a.H(toast);
                }
            });
            AdsInlineNotification.Q(new Function0() { // from class: Pi.h6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4888q6.a.I(toast);
                }
            });
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit J(final Toast toast, Ci.o AdsInlineNotification) {
            Intrinsics.j(AdsInlineNotification, "$this$AdsInlineNotification");
            AdsInlineNotification.D("Label", new Function0() { // from class: Pi.T5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4888q6.a.K(toast);
                }
            });
            AdsInlineNotification.Q(new Function0() { // from class: Pi.U5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4888q6.a.L(toast);
                }
            });
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit M(final Toast toast, Ci.o AdsInlineNotification) {
            Intrinsics.j(AdsInlineNotification, "$this$AdsInlineNotification");
            AdsInlineNotification.D("Label", new Function0() { // from class: Pi.c6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4888q6.a.N(toast);
                }
            });
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(final Toast toast, Ci.o AdsInlineNotification) {
            Intrinsics.j(AdsInlineNotification, "$this$AdsInlineNotification");
            AdsInlineNotification.D("Label", new Function0() { // from class: Pi.W5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4888q6.a.P(toast);
                }
            });
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Q(final Toast toast, Ci.o AdsInlineNotification) {
            Intrinsics.j(AdsInlineNotification, "$this$AdsInlineNotification");
            AdsInlineNotification.D("Label", new Function0() { // from class: Pi.Z5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4888q6.a.R(toast);
                }
            });
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit S(final Toast toast, Ci.o AdsInlineNotification) {
            Intrinsics.j(AdsInlineNotification, "$this$AdsInlineNotification");
            AdsInlineNotification.D("Label", new Function0() { // from class: Pi.X5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4888q6.a.T(toast);
                }
            });
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit U(final Toast toast, Ci.o AdsInlineNotification) {
            Intrinsics.j(AdsInlineNotification, "$this$AdsInlineNotification");
            AdsInlineNotification.D("Label", new Function0() { // from class: Pi.a6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4888q6.a.V(toast);
                }
            });
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit W(final Toast toast, Ci.o AdsInlineNotification) {
            Intrinsics.j(AdsInlineNotification, "$this$AdsInlineNotification");
            AdsInlineNotification.D("Label", new Function0() { // from class: Pi.V5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4888q6.a.X(toast);
                }
            });
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Y(final Toast toast, Ci.o AdsInlineNotification) {
            Intrinsics.j(AdsInlineNotification, "$this$AdsInlineNotification");
            AdsInlineNotification.D("Label", new Function0() { // from class: Pi.Y5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4888q6.a.Z(toast);
                }
            });
            Ci.o.a0(AdsInlineNotification, null, 1, null);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit a0(final Toast toast, Ci.o AdsInlineNotification) {
            Intrinsics.j(AdsInlineNotification, "$this$AdsInlineNotification");
            AdsInlineNotification.D("Label", new Function0() { // from class: Pi.f6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4888q6.a.b0(toast);
                }
            });
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c0(final Toast toast, Ci.o AdsInlineNotification) {
            Intrinsics.j(AdsInlineNotification, "$this$AdsInlineNotification");
            AdsInlineNotification.D("Label", new Function0() { // from class: Pi.d6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4888q6.a.d0(toast);
                }
            });
            Ci.o.a0(AdsInlineNotification, null, 1, null);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e0(final Toast toast, Ci.o AdsInlineNotification) {
            Intrinsics.j(AdsInlineNotification, "$this$AdsInlineNotification");
            AdsInlineNotification.Q(new Function0() { // from class: Pi.e6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4888q6.a.f0(toast);
                }
            });
            return Unit.f142422a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14926b0 interfaceC14926b0, Composer composer, Integer num) {
            F(interfaceC14926b0, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit H(Toast toast) {
            toast.show();
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit I(Toast toast) {
            toast.show();
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit K(Toast toast) {
            toast.show();
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit L(Toast toast) {
            toast.show();
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit N(Toast toast) {
            toast.show();
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit P(Toast toast) {
            toast.show();
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit R(Toast toast) {
            toast.show();
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit T(Toast toast) {
            toast.show();
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit V(Toast toast) {
            toast.show();
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit X(Toast toast) {
            toast.show();
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Z(Toast toast) {
            toast.show();
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b0(Toast toast) {
            toast.show();
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d0(Toast toast) {
            toast.show();
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f0(Toast toast) {
            toast.show();
            return Unit.f142422a;
        }
    }

    public static final void b(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-180857206);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-180857206, i11, -1, "com.meijer.mobile.androidacres.showcase.components.StaticInlineShowcase (InlineNotificationShowcase.kt:46)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            Ji.Q.e(localThemeScope, ji.a1.f139760a, ComposableLambdaKt.c(1981743975, true, new a(localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | 432);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Pi.P5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4888q6.c(localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        b(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }
}
