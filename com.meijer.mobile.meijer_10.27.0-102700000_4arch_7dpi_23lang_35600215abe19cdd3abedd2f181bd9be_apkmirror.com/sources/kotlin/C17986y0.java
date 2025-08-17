package kotlin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\n\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aY\u0010\u000f\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u0014"}, d2 = {"Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Lh0/l;", "interactionSource", "content", "a", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLh0/l;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "checked", "Lkotlin/Function1;", "onCheckedChange", "b", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLh0/l;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "LH1/h;", "F", "RippleRadius", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.y0, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17986y0 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f168876a = H1.h.p(24);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.y0$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f168877f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f168878g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f168879h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ h0.l f168880i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168881j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f168882k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f168883l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function0<Unit> function0, Modifier modifier, boolean z10, h0.l lVar, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f168877f = function0;
            this.f168878g = modifier;
            this.f168879h = z10;
            this.f168880i = lVar;
            this.f168881j = function2;
            this.f168882k = i10;
            this.f168883l = i11;
        }

        public final void a(Composer composer, int i10) {
            C17986y0.a(this.f168877f, this.f168878g, this.f168879h, this.f168880i, this.f168881j, composer, J0.a(this.f168882k | 1), this.f168883l);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.y0$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f168884f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f168885g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f168886h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f168887i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ h0.l f168888j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168889k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f168890l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f168891m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(boolean z10, Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z11, h0.l lVar, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f168884f = z10;
            this.f168885g = function1;
            this.f168886h = modifier;
            this.f168887i = z11;
            this.f168888j = lVar;
            this.f168889k = function2;
            this.f168890l = i10;
            this.f168891m = i11;
        }

        public final void a(Composer composer, int i10) {
            C17986y0.b(this.f168884f, this.f168885g, this.f168886h, this.f168887i, this.f168888j, this.f168889k, composer, J0.a(this.f168890l | 1), this.f168891m);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(kotlin.jvm.functions.Function0<kotlin.Unit> r21, androidx.compose.ui.Modifier r22, boolean r23, h0.l r24, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17986y0.a(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, h0.l, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(boolean r22, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r23, androidx.compose.ui.Modifier r24, boolean r25, h0.l r26, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17986y0.b(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, h0.l, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }
}
