package d0;

import androidx.compose.foundation.ScrollingLayoutElement;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.EnumC13937z;
import kotlin.InterfaceC13930s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\f\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r\u001a9\u0010\u000e\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\r\u001aQ\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"", "initial", "Ld0/V;", "c", "(ILandroidx/compose/runtime/Composer;II)Ld0/V;", "Landroidx/compose/ui/Modifier;", "state", "", "enabled", "Lf0/s;", "flingBehavior", "reverseScrolling", "f", "(Landroidx/compose/ui/Modifier;Ld0/V;ZLf0/s;Z)Landroidx/compose/ui/Modifier;", "a", "isScrollable", "isVertical", "useLocalOverscrollFactory", "Ld0/J;", "overscrollEffect", "d", "(Landroidx/compose/ui/Modifier;Ld0/V;ZLf0/s;ZZZLd0/J;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class T {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ld0/V;", "c", "()Ld0/V;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function0<V> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f127693f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(0);
            this.f127693f = i10;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final V invoke() {
            return new V(this.f127693f);
        }
    }

    public static final V c(int i10, Composer composer, int i11, int i12) {
        boolean z10 = true;
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if (ComposerKt.M()) {
            ComposerKt.U(-1464256199, i11, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:68)");
        }
        Object[] objArr = new Object[0];
        L0.k<V, ?> kVarA = V.INSTANCE.a();
        if ((((i11 & 14) ^ 6) <= 4 || !composer.d(i10)) && (i11 & 6) != 4) {
            z10 = false;
        }
        Object objB = composer.B();
        if (z10 || objB == Composer.INSTANCE.a()) {
            objB = new a(i10);
            composer.t(objB);
        }
        V v10 = (V) L0.c.c(objArr, kVarA, null, (Function0) objB, composer, 0, 4);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return v10;
    }

    public static final Modifier a(Modifier modifier, V v10, boolean z10, InterfaceC13930s interfaceC13930s, boolean z11) {
        return e(modifier, v10, z11, interfaceC13930s, z10, false, true, null, 64, null);
    }

    public static /* synthetic */ Modifier b(Modifier modifier, V v10, boolean z10, InterfaceC13930s interfaceC13930s, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            interfaceC13930s = null;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return a(modifier, v10, z10, interfaceC13930s, z11);
    }

    private static final Modifier d(Modifier modifier, V v10, boolean z10, InterfaceC13930s interfaceC13930s, boolean z11, boolean z12, boolean z13, J j10) {
        return androidx.compose.foundation.m.a(modifier, v10, z12 ? EnumC13937z.f131419a : EnumC13937z.f131420b, z11, z10, interfaceC13930s, v10.getInternalInteractionSource(), z13, j10, (256 & 256) != 0 ? null : null).then(new ScrollingLayoutElement(v10, z10, z12));
    }

    static /* synthetic */ Modifier e(Modifier modifier, V v10, boolean z10, InterfaceC13930s interfaceC13930s, boolean z11, boolean z12, boolean z13, J j10, int i10, Object obj) {
        return d(modifier, v10, z10, interfaceC13930s, z11, z12, z13, (i10 & 64) != 0 ? null : j10);
    }

    public static final Modifier f(Modifier modifier, V v10, boolean z10, InterfaceC13930s interfaceC13930s, boolean z11) {
        return e(modifier, v10, z11, interfaceC13930s, z10, true, true, null, 64, null);
    }

    public static /* synthetic */ Modifier g(Modifier modifier, V v10, boolean z10, InterfaceC13930s interfaceC13930s, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            interfaceC13930s = null;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return f(modifier, v10, z10, interfaceC13930s, z11);
    }
}
