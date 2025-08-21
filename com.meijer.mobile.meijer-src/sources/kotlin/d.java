package kotlin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aE\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "content", "LV0/q0;", "borderColor", "onClick", "a", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "assurance_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class d {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f98f;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0<Unit> function0) {
            super(0);
            this.f98f = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f98f.invoke();
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f99f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f100g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f101h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f102i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f103j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f104k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, long j10, Function0<Unit> function0, int i10, int i11) {
            super(2);
            this.f99f = modifier;
            this.f100g = function2;
            this.f101h = j10;
            this.f102i = function0;
            this.f103j = i10;
            this.f104k = i11;
        }

        public final void a(Composer composer, int i10) {
            d.a(this.f99f, this.f100g, this.f101h, this.f102i, composer, J0.a(this.f103j | 1), this.f104k);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r17, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r18, long r19, kotlin.jvm.functions.Function0<kotlin.Unit> r21, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.d.a(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, long, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }
}
