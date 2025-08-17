package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.text.TextStyle;
import kotlin.AbstractC18142l;
import kotlin.C18153w;
import kotlin.C18154x;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import u1.C17208B;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/text/z;", "style", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/z;)Landroidx/compose/ui/Modifier;", "", "typeface", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f0 {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class a extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ TextStyle f49513f;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: androidx.compose.foundation.text.f0$a$a, reason: collision with other inner class name */
        static final class C1029a extends Lambda implements Function3<androidx.compose.ui.layout.K, androidx.compose.ui.layout.I, H1.b, androidx.compose.ui.layout.J> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ e0 f49514f;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
            /* renamed from: androidx.compose.foundation.text.f0$a$a$a, reason: collision with other inner class name */
            static final class C1030a extends Lambda implements Function1<f0.a, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.layout.f0 f49515f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1030a(androidx.compose.ui.layout.f0 f0Var) {
                    super(1);
                    this.f49515f = f0Var;
                }

                public final void a(f0.a aVar) {
                    f0.a.l(aVar, this.f49515f, 0, 0, 0.0f, 4, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                    a(aVar);
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1029a(e0 e0Var) {
                super(3);
                this.f49514f = e0Var;
            }

            public final androidx.compose.ui.layout.J a(androidx.compose.ui.layout.K k10, androidx.compose.ui.layout.I i10, long j10) {
                long minSize = this.f49514f.getMinSize();
                androidx.compose.ui.layout.f0 f0VarK0 = i10.k0(H1.b.d(j10, RangesKt.o((int) (minSize >> 32), H1.b.n(j10), H1.b.l(j10)), 0, RangesKt.o((int) (minSize & 4294967295L), H1.b.m(j10), H1.b.k(j10)), 0, 10, null));
                return androidx.compose.ui.layout.K.G0(k10, f0VarK0.getWidth(), f0VarK0.getHeight(), null, new C1030a(f0VarK0), 4, null);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ androidx.compose.ui.layout.J invoke(androidx.compose.ui.layout.K k10, androidx.compose.ui.layout.I i10, H1.b bVar) {
                return a(k10, i10, bVar.getValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(TextStyle textStyle) {
            super(3);
            this.f49513f = textStyle;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return a(modifier, composer, num.intValue());
        }

        private static final Object b(z1<? extends Object> z1Var) {
            return z1Var.getValue();
        }

        public final Modifier a(Modifier modifier, Composer composer, int i10) {
            int iB;
            int iA;
            composer.startReplaceGroup(1582736677);
            if (ComposerKt.M()) {
                ComposerKt.U(1582736677, i10, -1, "androidx.compose.foundation.text.textFieldMinSize.<anonymous> (TextFieldSize.kt:37)");
            }
            H1.d dVar = (H1.d) composer.o(C5892t0.g());
            AbstractC18142l.b bVar = (AbstractC18142l.b) composer.o(C5892t0.i());
            H1.t tVar = (H1.t) composer.o(C5892t0.m());
            boolean zV = composer.V(this.f49513f) | composer.V(tVar);
            TextStyle textStyle = this.f49513f;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = C17208B.d(textStyle, tVar);
                composer.t(objB);
            }
            TextStyle textStyle2 = (TextStyle) objB;
            boolean zV2 = composer.V(bVar) | composer.V(textStyle2);
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                AbstractC18142l abstractC18142lJ = textStyle2.j();
                FontWeight fontWeightO = textStyle2.o();
                if (fontWeightO == null) {
                    fontWeightO = FontWeight.INSTANCE.e();
                }
                C18153w c18153wM = textStyle2.m();
                if (c18153wM != null) {
                    iB = c18153wM.getValue();
                } else {
                    iB = C18153w.INSTANCE.b();
                }
                C18154x c18154xN = textStyle2.n();
                if (c18154xN != null) {
                    iA = c18154xN.getValue();
                } else {
                    iA = C18154x.INSTANCE.a();
                }
                objB2 = bVar.b(abstractC18142lJ, fontWeightO, iB, iA);
                composer.t(objB2);
            }
            z1 z1Var = (z1) objB2;
            TextStyle textStyle3 = this.f49513f;
            Object objB3 = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB3 == companion.a()) {
                objB3 = new e0(tVar, dVar, bVar, textStyle3, b(z1Var));
                composer.t(objB3);
            }
            e0 e0Var = (e0) objB3;
            e0Var.c(tVar, dVar, bVar, textStyle2, b(z1Var));
            Modifier.Companion companion2 = Modifier.INSTANCE;
            boolean zD = composer.D(e0Var);
            Object objB4 = composer.B();
            if (zD || objB4 == companion.a()) {
                objB4 = new C1029a(e0Var);
                composer.t(objB4);
            }
            Modifier modifierA = androidx.compose.ui.layout.D.a(companion2, (Function3) objB4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return modifierA;
        }
    }

    public static final Modifier a(Modifier modifier, TextStyle textStyle) {
        return androidx.compose.ui.b.c(modifier, null, new a(textStyle), 1, null);
    }
}
