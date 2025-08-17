package kotlin;

import H1.p;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.q;
import d0.V;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import kotlin.C6307U;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000L\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ai\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a`\u0010\u001a\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\"\u001a\u0010\u001f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"", "expanded", "Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/Modifier;", "modifier", "LH1/j;", "offset", "Ld0/V;", "scrollState", "Landroidx/compose/ui/window/q;", "properties", "Lkotlin/Function1;", "Lj0/f;", "Lkotlin/ExtensionFunctionType;", "content", "a", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLd0/V;Landroidx/compose/ui/window/q;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "onClick", "enabled", "Lj0/C;", "contentPadding", "Lh0/l;", "interactionSource", "Lj0/I;", "b", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLj0/C;Lh0/l;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/window/q;", "getDefaultMenuProperties", "()Landroidx/compose/ui/window/q;", "DefaultMenuProperties", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17937g {

    /* renamed from: a, reason: collision with root package name */
    private static final q f167895a = new q(true, false, false, false, 14, (DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.g$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C6307U<Boolean> f167896f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<androidx.compose.ui.graphics.i> f167897g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ V f167898h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Modifier f167899i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14814f, Composer, Integer, Unit> f167900j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(C6307U<Boolean> c6307u, InterfaceC5730l0<androidx.compose.ui.graphics.i> interfaceC5730l0, V v10, Modifier modifier, Function3<? super InterfaceC14814f, ? super Composer, ? super Integer, Unit> function3) {
            super(2);
            this.f167896f = c6307u;
            this.f167897g = interfaceC5730l0;
            this.f167898h = v10;
            this.f167899i = modifier;
            this.f167900j = function3;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-47803778, i10, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:92)");
            }
            C17885I0.a(this.f167896f, this.f167897g, this.f167898h, this.f167899i, this.f167900j, composer, C6307U.f60956d | 48, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.g$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f167901f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f167902g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f167903h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f167904i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ V f167905j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ q f167906k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14814f, Composer, Integer, Unit> f167907l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f167908m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f167909n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(boolean z10, Function0<Unit> function0, Modifier modifier, long j10, V v10, q qVar, Function3<? super InterfaceC14814f, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f167901f = z10;
            this.f167902g = function0;
            this.f167903h = modifier;
            this.f167904i = j10;
            this.f167905j = v10;
            this.f167906k = qVar;
            this.f167907l = function3;
            this.f167908m = i10;
            this.f167909n = i11;
        }

        public final void a(Composer composer, int i10) {
            C17937g.a(this.f167901f, this.f167902g, this.f167903h, this.f167904i, this.f167905j, this.f167906k, this.f167907l, composer, J0.a(this.f167908m | 1), this.f167909n);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LH1/p;", "parentBounds", "menuBounds", "", "a", "(LH1/p;LH1/p;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.g$c */
    static final class c extends Lambda implements Function2<p, p, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<androidx.compose.ui.graphics.i> f167910f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC5730l0<androidx.compose.ui.graphics.i> interfaceC5730l0) {
            super(2);
            this.f167910f = interfaceC5730l0;
        }

        public final void a(p pVar, p pVar2) {
            this.f167910f.setValue(androidx.compose.ui.graphics.i.b(C17885I0.h(pVar, pVar2)));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(p pVar, p pVar2) {
            a(pVar, pVar2);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.g$d */
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f167911f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f167912g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f167913h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC14794C f167914i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ h0.l f167915j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14800I, Composer, Integer, Unit> f167916k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f167917l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f167918m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function0<Unit> function0, Modifier modifier, boolean z10, InterfaceC14794C interfaceC14794C, h0.l lVar, Function3<? super InterfaceC14800I, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f167911f = function0;
            this.f167912g = modifier;
            this.f167913h = z10;
            this.f167914i = interfaceC14794C;
            this.f167915j = lVar;
            this.f167916k = function3;
            this.f167917l = i10;
            this.f167918m = i11;
        }

        public final void a(Composer composer, int i10) {
            C17937g.b(this.f167911f, this.f167912g, this.f167913h, this.f167914i, this.f167915j, this.f167916k, composer, J0.a(this.f167917l | 1), this.f167918m);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r27, kotlin.jvm.functions.Function0<kotlin.Unit> r28, androidx.compose.ui.Modifier r29, long r30, d0.V r32, androidx.compose.ui.window.q r33, kotlin.jvm.functions.Function3<? super j0.InterfaceC14814f, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17937g.a(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, long, d0.V, androidx.compose.ui.window.q, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(kotlin.jvm.functions.Function0<kotlin.Unit> r17, androidx.compose.ui.Modifier r18, boolean r19, j0.InterfaceC14794C r20, h0.l r21, kotlin.jvm.functions.Function3<? super j0.InterfaceC14800I, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17937g.b(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, j0.C, h0.l, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }
}
