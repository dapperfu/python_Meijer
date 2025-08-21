package kotlin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a;\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lx0/D;", "colors", "Lx0/P1;", "typography", "Lx0/e1;", "shapes", "Lkotlin/Function0;", "", "content", "a", "(Lx0/D;Lx0/P1;Lx0/e1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.F0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17945F0 {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.F0$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Typography f167979f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167980g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.F0$a$a, reason: collision with other inner class name */
        static final class C2678a extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f167981f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2678a(Function2<? super Composer, ? super Integer, Unit> function2) {
                super(2);
                this.f167981f = function2;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(181426554, i10, -1, "androidx.compose.material.MaterialTheme.<anonymous>.<anonymous> (MaterialTheme.kt:81)");
                }
                C17947G0.a(this.f167981f, composer, 0);
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
        a(Typography typography, Function2<? super Composer, ? super Integer, Unit> function2) {
            super(2);
            this.f167979f = typography;
            this.f167980g = function2;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1740102967, i10, -1, "androidx.compose.material.MaterialTheme.<anonymous> (MaterialTheme.kt:81)");
            }
            N1.a(this.f167979f.getBody1(), ComposableLambdaKt.c(181426554, true, new C2678a(this.f167980g), composer, 54), composer, 48);
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

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.F0$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Colors f167982f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Typography f167983g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Shapes f167984h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167985i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f167986j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f167987k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Colors colors, Typography typography, Shapes shapes, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f167982f = colors;
            this.f167983g = typography;
            this.f167984h = shapes;
            this.f167985i = function2;
            this.f167986j = i10;
            this.f167987k = i11;
        }

        public final void a(Composer composer, int i10) {
            C17945F0.a(this.f167982f, this.f167983g, this.f167984h, this.f167985i, composer, J0.a(this.f167986j | 1), this.f167987k);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(kotlin.Colors r40, kotlin.Typography r41, kotlin.Shapes r42, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r43, androidx.compose.runtime.Composer r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17945F0.a(x0.D, x0.P1, x0.e1, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }
}
