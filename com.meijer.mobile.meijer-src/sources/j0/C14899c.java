package j0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.r0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aF\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "LP0/e;", "contentAlignment", "", "propagateMinConstraints", "Lkotlin/Function1;", "Lj0/d;", "", "Lkotlin/ExtensionFunctionType;", "content", "a", "(Landroidx/compose/ui/Modifier;LP0/e;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: j0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14899c {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/r0;", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/r0;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: j0.c$a */
    static final class a extends Lambda implements Function2<r0, H1.b, androidx.compose.ui.layout.J> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ MeasurePolicy f139685f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14900d, Composer, Integer, Unit> f139686g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: j0.c$a$a, reason: collision with other inner class name */
        static final class C2214a extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function3<InterfaceC14900d, Composer, Integer, Unit> f139687f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ BoxWithConstraintsScopeImpl f139688g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2214a(Function3<? super InterfaceC14900d, ? super Composer, ? super Integer, Unit> function3, BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl) {
                super(2);
                this.f139687f = function3;
                this.f139688g = boxWithConstraintsScopeImpl;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1945019079, i10, -1, "androidx.compose.foundation.layout.BoxWithConstraints.<anonymous>.<anonymous>.<anonymous> (BoxWithConstraints.kt:65)");
                }
                this.f139687f.invoke(this.f139688g, composer, 0);
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
        a(MeasurePolicy measurePolicy, Function3<? super InterfaceC14900d, ? super Composer, ? super Integer, Unit> function3) {
            super(2);
            this.f139685f = measurePolicy;
            this.f139686g = function3;
        }

        public final androidx.compose.ui.layout.J a(r0 r0Var, long j10) {
            return this.f139685f.d(r0Var, r0Var.Z(Unit.f143329a, ComposableLambdaKt.composableLambdaInstance(-1945019079, true, new C2214a(this.f139686g, new BoxWithConstraintsScopeImpl(r0Var, j10, null)))), j10);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.J invoke(r0 r0Var, H1.b bVar) {
            return a(r0Var, bVar.getValue());
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: j0.c$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f139689f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ P0.e f139690g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f139691h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14900d, Composer, Integer, Unit> f139692i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f139693j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f139694k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Modifier modifier, P0.e eVar, boolean z10, Function3<? super InterfaceC14900d, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f139689f = modifier;
            this.f139690g = eVar;
            this.f139691h = z10;
            this.f139692i = function3;
            this.f139693j = i10;
            this.f139694k = i11;
        }

        public final void a(Composer composer, int i10) {
            C14899c.a(this.f139689f, this.f139690g, this.f139691h, this.f139692i, composer, J0.a(this.f139693j | 1), this.f139694k);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r16, P0.e r17, boolean r18, kotlin.jvm.functions.Function3<? super j0.InterfaceC14900d, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.C14899c.a(androidx.compose.ui.Modifier, P0.e, boolean, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }
}
