package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.C6034t0;
import androidx.compose.ui.platform.L0;
import androidx.compose.ui.platform.N0;
import androidx.compose.ui.text.TextStyle;
import i0.C14592e;
import kotlin.AbstractC18269l;
import kotlin.C18280w;
import kotlin.C18281x;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import u1.C17335B;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a/\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\r²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/text/z;", "textStyle", "", "minLines", "maxLines", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/z;II)Landroidx/compose/ui/Modifier;", "", "b", "(II)V", "", "typeface", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.text.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5826p {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.text.p$a */
    public static final class a extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f49929f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f49930g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ TextStyle f49931h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11, TextStyle textStyle) {
            super(1);
            this.f49929f = i10;
            this.f49930g = i11;
            this.f49931h = textStyle;
        }

        public final void a(N0 n02) {
            n02.b("heightInLines");
            n02.getProperties().c("minLines", Integer.valueOf(this.f49929f));
            n02.getProperties().c("maxLines", Integer.valueOf(this.f49930g));
            n02.getProperties().c("textStyle", this.f49931h);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.text.p$b */
    static final class b extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f49932f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f49933g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ TextStyle f49934h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, int i11, TextStyle textStyle) {
            super(3);
            this.f49932f = i10;
            this.f49933g = i11;
            this.f49934h = textStyle;
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
            Integer numValueOf;
            float fC;
            float fC2;
            composer.startReplaceGroup(408240218);
            if (ComposerKt.M()) {
                ComposerKt.U(408240218, i10, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:62)");
            }
            C5826p.b(this.f49932f, this.f49933g);
            if (this.f49932f == 1 && this.f49933g == Integer.MAX_VALUE) {
                Modifier.Companion companion = Modifier.INSTANCE;
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return companion;
            }
            H1.d dVar = (H1.d) composer.o(C6034t0.g());
            AbstractC18269l.b bVar = (AbstractC18269l.b) composer.o(C6034t0.i());
            H1.t tVar = (H1.t) composer.o(C6034t0.m());
            boolean zV = composer.V(this.f49934h) | composer.V(tVar);
            TextStyle textStyle = this.f49934h;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = C17335B.d(textStyle, tVar);
                composer.t(objB);
            }
            TextStyle textStyle2 = (TextStyle) objB;
            boolean zV2 = composer.V(bVar) | composer.V(textStyle2);
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                AbstractC18269l abstractC18269lJ = textStyle2.j();
                FontWeight fontWeightO = textStyle2.o();
                if (fontWeightO == null) {
                    fontWeightO = FontWeight.INSTANCE.e();
                }
                C18280w c18280wM = textStyle2.m();
                if (c18280wM != null) {
                    iB = c18280wM.getValue();
                } else {
                    iB = C18280w.INSTANCE.b();
                }
                C18281x c18281xN = textStyle2.n();
                if (c18281xN != null) {
                    iA = c18281xN.getValue();
                } else {
                    iA = C18281x.INSTANCE.a();
                }
                objB2 = bVar.b(abstractC18269lJ, fontWeightO, iB, iA);
                composer.t(objB2);
            }
            z1 z1Var = (z1) objB2;
            boolean zV3 = composer.V(b(z1Var)) | composer.V(dVar) | composer.V(bVar) | composer.V(this.f49934h) | composer.V(tVar);
            Object objB3 = composer.B();
            if (zV3 || objB3 == Composer.INSTANCE.a()) {
                objB3 = Integer.valueOf((int) (U.a(textStyle2, dVar, bVar, U.c(), 1) & 4294967295L));
                composer.t(objB3);
            }
            int iIntValue = ((Number) objB3).intValue();
            boolean zV4 = composer.V(tVar) | composer.V(dVar) | composer.V(bVar) | composer.V(this.f49934h) | composer.V(b(z1Var));
            Object objB4 = composer.B();
            if (zV4 || objB4 == Composer.INSTANCE.a()) {
                objB4 = Integer.valueOf((int) (U.a(textStyle2, dVar, bVar, U.c() + '\n' + U.c(), 2) & 4294967295L));
                composer.t(objB4);
            }
            int iIntValue2 = ((Number) objB4).intValue() - iIntValue;
            int i11 = this.f49932f;
            Integer numValueOf2 = null;
            if (i11 == 1) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(((i11 - 1) * iIntValue2) + iIntValue);
            }
            int i12 = this.f49933g;
            if (i12 != Integer.MAX_VALUE) {
                numValueOf2 = Integer.valueOf(iIntValue + (iIntValue2 * (i12 - 1)));
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            if (numValueOf != null) {
                fC = dVar.K(numValueOf.intValue());
            } else {
                fC = H1.h.INSTANCE.c();
            }
            if (numValueOf2 != null) {
                fC2 = dVar.K(numValueOf2.intValue());
            } else {
                fC2 = H1.h.INSTANCE.c();
            }
            Modifier modifierJ = androidx.compose.foundation.layout.J.j(companion2, fC, fC2);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return modifierJ;
        }
    }

    public static final void b(int i10, int i11) {
        if (!(i10 > 0 && i11 > 0)) {
            C14592e.a("both minLines " + i10 + " and maxLines " + i11 + " must be greater than zero");
        }
        if (i10 <= i11) {
            return;
        }
        C14592e.a("minLines " + i10 + " must be less than or equal to maxLines " + i11);
    }

    public static final Modifier a(Modifier modifier, TextStyle textStyle, int i10, int i11) {
        Function1 function1A;
        if (L0.b()) {
            function1A = new a(i10, i11, textStyle);
        } else {
            function1A = L0.a();
        }
        return androidx.compose.ui.b.b(modifier, function1A, new b(i10, i11, textStyle));
    }
}
