package androidx.compose.foundation.text.handwriting;

import H1.h;
import androidx.compose.foundation.text.n0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DpTouchBoundsExpansion;
import androidx.compose.ui.node.z0;
import g1.C14191x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import s0.C16844b;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u001a\u0010\u0010\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u000f\u0010\r\"\u001a\u0010\u0015\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\n\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "enabled", "showHoverIcon", "Lkotlin/Function0;", "", "onHandwritingSlopExceeded", "b", "(Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "LH1/h;", "a", "F", "getHandwritingBoundsVerticalOffset", "()F", "HandwritingBoundsVerticalOffset", "getHandwritingBoundsHorizontalOffset", "HandwritingBoundsHorizontalOffset", "Landroidx/compose/ui/node/s;", "c", "Landroidx/compose/ui/node/s;", "()Landroidx/compose/ui/node/s;", "HandwritingBoundsExpansion", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final float f49546a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f49547b;

    /* renamed from: c, reason: collision with root package name */
    private static final DpTouchBoundsExpansion f49548c;

    static {
        float fP = h.p(40);
        f49546a = fP;
        float fP2 = h.p(10);
        f49547b = fP2;
        f49548c = z0.a(fP2, fP, fP2, fP);
    }

    public static final DpTouchBoundsExpansion a() {
        return f49548c;
    }

    public static final Modifier b(Modifier modifier, boolean z10, boolean z11, Function0<Unit> function0) {
        if (!z10 || !C16844b.a()) {
            return modifier;
        }
        if (z11) {
            modifier = C14191x.c(modifier, n0.a(), false, f49548c);
        }
        return modifier.then(new StylusHandwritingElement(function0));
    }
}
