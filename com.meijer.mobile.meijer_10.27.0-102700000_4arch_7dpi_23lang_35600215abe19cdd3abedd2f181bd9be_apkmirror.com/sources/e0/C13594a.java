package e0;

import H1.o;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import e0.ContextMenuState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u001ap\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001aH\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u0007H\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Le0/i;", "state", "Lkotlin/Function0;", "", "onDismiss", "Lkotlin/Function1;", "Le0/g;", "Lkotlin/ExtensionFunctionType;", "contextMenuBuilderBlock", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "onOpenGesture", "content", "b", "(Le0/i;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "a", "(Le0/i;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13594a {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: e0.a$a, reason: collision with other inner class name */
    static final class C2013a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ContextMenuState f127671f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f127672g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f127673h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<C13600g, Unit> f127674i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f127675j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f127676k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2013a(ContextMenuState contextMenuState, Function0<Unit> function0, Modifier modifier, Function1<? super C13600g, Unit> function1, int i10, int i11) {
            super(2);
            this.f127671f = contextMenuState;
            this.f127672g = function0;
            this.f127673h = modifier;
            this.f127674i = function1;
            this.f127675j = i10;
            this.f127676k = i11;
        }

        public final void a(Composer composer, int i10) {
            C13594a.a(this.f127671f, this.f127672g, this.f127673h, this.f127674i, composer, J0.a(this.f127675j | 1), this.f127676k);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: e0.a$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ContextMenuState f127677f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f127678g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f127679h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<C13600g, Unit> f127680i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f127681j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f127682k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ContextMenuState contextMenuState, Function0<Unit> function0, Modifier modifier, Function1<? super C13600g, Unit> function1, int i10, int i11) {
            super(2);
            this.f127677f = contextMenuState;
            this.f127678g = function0;
            this.f127679h = modifier;
            this.f127680i = function1;
            this.f127681j = i10;
            this.f127682k = i11;
        }

        public final void a(Composer composer, int i10) {
            C13594a.a(this.f127677f, this.f127678g, this.f127679h, this.f127680i, composer, J0.a(this.f127681j | 1), this.f127682k);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: e0.a$c */
    static final class c extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f127683f = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: e0.a$d */
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ContextMenuState f127684f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f127685g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<C13600g, Unit> f127686h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Modifier f127687i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f127688j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f127689k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f127690l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f127691m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f127692n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ContextMenuState contextMenuState, Function0<Unit> function0, Function1<? super C13600g, Unit> function1, Modifier modifier, boolean z10, Function0<Unit> function02, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f127684f = contextMenuState;
            this.f127685g = function0;
            this.f127686h = function1;
            this.f127687i = modifier;
            this.f127688j = z10;
            this.f127689k = function02;
            this.f127690l = function2;
            this.f127691m = i10;
            this.f127692n = i11;
        }

        public final void a(Composer composer, int i10) {
            C13594a.b(this.f127684f, this.f127685g, this.f127686h, this.f127687i, this.f127688j, this.f127689k, this.f127690l, composer, J0.a(this.f127691m | 1), this.f127692n);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/f;", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: e0.a$e */
    static final class e extends Lambda implements Function1<U0.f, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f127693f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ContextMenuState f127694g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Function0<Unit> function0, ContextMenuState contextMenuState) {
            super(1);
            this.f127693f = function0;
            this.f127694g = contextMenuState;
        }

        public final void a(long j10) {
            this.f127693f.invoke();
            this.f127694g.b(new ContextMenuState.a.Open(j10, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(U0.f fVar) {
            a(fVar.getPackedValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(e0.ContextMenuState r18, kotlin.jvm.functions.Function0<kotlin.Unit> r19, kotlin.jvm.functions.Function1<? super e0.C13600g, kotlin.Unit> r20, androidx.compose.ui.Modifier r21, boolean r22, kotlin.jvm.functions.Function0<kotlin.Unit> r23, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.C13594a.b(e0.i, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void a(ContextMenuState contextMenuState, Function0<Unit> function0, Modifier modifier, Function1<? super C13600g, Unit> function1, Composer composer, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        Composer composer2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(645832757);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.V(contextMenuState)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(function0)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i17 = i11 & 4;
        if (i17 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (composerStartRestartGroup.D(function1)) {
                i16 = RecyclerView.m.FLAG_MOVED;
            } else {
                i16 = 1024;
            }
            i12 |= i16;
        }
        if ((i12 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (composerStartRestartGroup.p(z10, i12 & 1)) {
            if (i17 != 0) {
                modifier = Modifier.INSTANCE;
            }
            modifier2 = modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(645832757, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenu (ContextMenuArea.android.kt:73)");
            }
            ContextMenuState.a aVarA = contextMenuState.a();
            if (!(aVarA instanceof ContextMenuState.a.Open)) {
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                T0 t0L = composerStartRestartGroup.l();
                if (t0L != null) {
                    t0L.a(new C2013a(contextMenuState, function0, modifier2, function1, i10, i11));
                    return;
                }
                return;
            }
            boolean zV = composerStartRestartGroup.V(aVarA);
            Object objB = composerStartRestartGroup.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new C13598e(o.d(((ContextMenuState.a.Open) aVarA).getOffset()), null);
                composerStartRestartGroup.t(objB);
            }
            composer2 = composerStartRestartGroup;
            k.d((C13598e) objB, function0, modifier2, function1, composer2, i12 & 8176, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.K();
            modifier2 = modifier;
        }
        T0 t0L2 = composer2.l();
        if (t0L2 != null) {
            t0L2.a(new b(contextMenuState, function0, modifier2, function1, i10, i11));
        }
    }
}
