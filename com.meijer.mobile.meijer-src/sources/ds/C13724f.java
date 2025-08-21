package ds;

import Ki.LocalThemeScope;
import Vl.HomeDepartment;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import bk.AbstractC6392a;
import d0.T;
import ds.C13724f;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001as\u0010\u0012\u001a\u00020\r*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015²\u0006\u000e\u0010\u0014\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "carouselTitle", "LPj/a;", "loadingState", "", "LVl/g;", "departments", "Lbk/a;", "viewAllTitle", "Lkotlin/Function0;", "", "onViewAllClicked", "onRetryClicked", "Lkotlin/Function1;", "onDepartmentClicked", "b", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;LPj/a;Ljava/util/List;Lbk/a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "lastAction", "homescreen_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ds.f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13724f {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ds.f$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<HomeDepartment> f128859a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f128860b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<HomeDepartment, Unit> f128861c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: ds.f$a$a, reason: collision with other inner class name */
        static final class C2031a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<HomeDepartment> f128862a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f128863b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<HomeDepartment, Unit> f128864c;

            /* JADX WARN: Multi-variable type inference failed */
            C2031a(List<HomeDepartment> list, LocalThemeScope localThemeScope, Function1<? super HomeDepartment, Unit> function1) {
                this.f128862a = list;
                this.f128863b = localThemeScope;
                this.f128864c = function1;
            }

            public final void b(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(354027977, i10, -1, "com.meijer.mobile.ui.homescreen.departments.DepartmentCarousel.<anonymous>.<anonymous> (DepartmentCarousel.kt:47)");
                }
                List<HomeDepartment> list = this.f128862a;
                LocalThemeScope localThemeScope = this.f128863b;
                final Function1<HomeDepartment, Unit> function1 = this.f128864c;
                for (final HomeDepartment homeDepartment : list) {
                    String name = homeDepartment.getName();
                    String imageUrl = homeDepartment.getImageUrl();
                    composer.startReplaceGroup(-1633490746);
                    boolean zV = composer.V(function1) | composer.D(homeDepartment);
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: ds.e
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C13724f.a.C2031a.c(function1, homeDepartment);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    C13726h.b(localThemeScope, name, imageUrl, null, (Function0) objB, composer, LocalThemeScope.f17314g, 4);
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1, HomeDepartment homeDepartment) {
                function1.invoke(homeDepartment);
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(List<HomeDepartment> list, LocalThemeScope localThemeScope, Function1<? super HomeDepartment, Unit> function1) {
            this.f128859a = list;
            this.f128860b = localThemeScope;
            this.f128861c = function1;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(448084704, i10, -1, "com.meijer.mobile.ui.homescreen.departments.DepartmentCarousel.<anonymous> (DepartmentCarousel.kt:46)");
            }
            Br.f.b(T.b(Modifier.INSTANCE, T.c(0, composer, 0, 1), false, null, false, 14, null), ComposableLambdaKt.c(354027977, true, new C2031a(this.f128859a, this.f128860b, this.f128861c), composer, 54), composer, 48, 0);
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

    /* JADX WARN: Removed duplicated region for block: B:109:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r17, androidx.compose.ui.Modifier r18, final java.lang.String r19, final Pj.a r20, final java.util.List<Vl.HomeDepartment> r21, final bk.AbstractC6392a r22, final kotlin.jvm.functions.Function0<kotlin.Unit> r23, final kotlin.jvm.functions.Function0<kotlin.Unit> r24, final kotlin.jvm.functions.Function1<? super Vl.HomeDepartment, kotlin.Unit> r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ds.C13724f.b(Ki.M, androidx.compose.ui.Modifier, java.lang.String, Pj.a, java.util.List, bk.a, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, String str, Pj.a aVar, List list, AbstractC6392a abstractC6392a, Function0 function0, Function0 function02, Function1 function1, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, str, aVar, list, abstractC6392a, function0, function02, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
