package e0;

import M0.SnapshotStateList;
import V0.C5489q0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.ui.Modifier;
import i0.C14592e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\u0003Jd\u0010\u0018\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2%\b\u0002\u0010\u0016\u001a\u001f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u0018\u0010\u0019R5\u0010\u001c\u001a#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00110\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001b¨\u0006\u001d"}, d2 = {"Le0/g;", "", "<init>", "()V", "Le0/b;", "colors", "", "a", "(Le0/b;Landroidx/compose/runtime/Composer;I)V", "b", "Lkotlin/Function0;", "", "label", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Lkotlin/Function1;", "LV0/q0;", "Lkotlin/ParameterName;", "name", "iconColor", "leadingIcon", "onClick", "c", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;)V", "LM0/m;", "LM0/m;", "composables", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: e0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13748g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SnapshotStateList<Function3<ContextMenuColors, Composer, Integer, Unit>> composables = o1.f();

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: e0.g$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ContextMenuColors f129047g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f129048h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ContextMenuColors contextMenuColors, int i10) {
            super(2);
            this.f129047g = contextMenuColors;
            this.f129048h = i10;
        }

        public final void a(Composer composer, int i10) {
            C13748g.this.a(this.f129047g, composer, J0.a(this.f129048h | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le0/b;", "colors", "", "a", "(Le0/b;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: e0.g$b */
    static final class b extends Lambda implements Function3<ContextMenuColors, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, String> f129049f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f129050g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f129051h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function3<C5489q0, Composer, Integer, Unit> f129052i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f129053j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function2<? super Composer, ? super Integer, String> function2, boolean z10, Modifier modifier, Function3<? super C5489q0, ? super Composer, ? super Integer, Unit> function3, Function0<Unit> function0) {
            super(3);
            this.f129049f = function2;
            this.f129050g = z10;
            this.f129051h = modifier;
            this.f129052i = function3;
            this.f129053j = function0;
        }

        public final void a(ContextMenuColors contextMenuColors, Composer composer, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= composer.V(contextMenuColors) ? 4 : 2;
            }
            if (!composer.p((i10 & 19) != 18, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(262103052, i10, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.item.<anonymous> (ContextMenuUi.android.kt:282)");
            }
            String strInvoke = this.f129049f.invoke(composer, 0);
            if (StringsKt.s0(strInvoke)) {
                C14592e.c("Label must not be blank");
            }
            k.b(strInvoke, this.f129050g, contextMenuColors, this.f129051h, this.f129052i, this.f129053j, composer, (i10 << 6) & 896, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ContextMenuColors contextMenuColors, Composer composer, Integer num) {
            a(contextMenuColors, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static /* synthetic */ void d(C13748g c13748g, Function2 function2, Modifier modifier, boolean z10, Function3 function3, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        Modifier modifier2 = modifier;
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            function3 = null;
        }
        c13748g.c(function2, modifier2, z11, function3, function0);
    }

    public final void b() {
        this.composables.clear();
    }

    public final void c(Function2<? super Composer, ? super Integer, String> label, Modifier modifier, boolean enabled, Function3<? super C5489q0, ? super Composer, ? super Integer, Unit> leadingIcon, Function0<Unit> onClick) {
        this.composables.add(ComposableLambdaKt.composableLambdaInstance(262103052, true, new b(label, enabled, modifier, leadingIcon, onClick)));
    }

    public final void a(ContextMenuColors contextMenuColors, Composer composer, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(1320309496);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.V(contextMenuColors)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(this)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (composerStartRestartGroup.p(z10, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(1320309496, i11, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.Content (ContextMenuUi.android.kt:240)");
            }
            SnapshotStateList<Function3<ContextMenuColors, Composer, Integer, Unit>> snapshotStateList = this.composables;
            int size = snapshotStateList.size();
            for (int i14 = 0; i14 < size; i14++) {
                snapshotStateList.get(i14).invoke(contextMenuColors, composerStartRestartGroup, Integer.valueOf(i11 & 14));
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new a(contextMenuColors, i10));
        }
    }
}
