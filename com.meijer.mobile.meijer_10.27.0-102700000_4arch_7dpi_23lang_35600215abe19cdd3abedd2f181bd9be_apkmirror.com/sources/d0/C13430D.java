package d0;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a¬\u0001\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001b\b\u0002\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001¢\u0006\u0002\b\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00012\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001c\u001a\u00020\f*\u00020\n2\u0006\u0010\u001b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\"&\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001f0\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "LH1/d;", "LU0/f;", "Lkotlin/ExtensionFunctionType;", "sourceCenter", "magnifierCenter", "LH1/k;", "", "onSizeChanged", "", "zoom", "", "useTextDefault", "size", "LH1/h;", "cornerRadius", "elevation", "clippingEnabled", "Ld0/N;", "platformMagnifierFactory", "e", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLd0/N;)Landroidx/compose/ui/Modifier;", "", "sdkVersion", "c", "(I)Z", "other", "a", "(FF)Z", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lkotlin/Function0;", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "b", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "MagnifierPositionInRoot", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: d0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13430D {

    /* renamed from: a, reason: collision with root package name */
    private static final SemanticsPropertyKey<Function0<U0.f>> f126844a = new SemanticsPropertyKey<>("MagnifierPositionInRoot", null, 2, null);

    public static final Modifier e(Modifier modifier, Function1<? super H1.d, U0.f> function1, Function1<? super H1.d, U0.f> function12, Function1<? super H1.k, Unit> function13, float f10, boolean z10, long j10, float f11, float f12, boolean z11, N n10) {
        if (d(0, 1, null)) {
            return modifier.then(new MagnifierElement(function1, function12, function13, f10, z10, j10, f11, f12, z11, n10 == null ? N.INSTANCE.a() : n10, null));
        }
        return modifier;
    }

    public static final SemanticsPropertyKey<Function0<U0.f>> b() {
        return f126844a;
    }

    public static final boolean c(int i10) {
        return i10 >= 28;
    }

    public static /* synthetic */ boolean d(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Build.VERSION.SDK_INT;
        }
        return c(i10);
    }

    public static /* synthetic */ Modifier f(Modifier modifier, Function1 function1, Function1 function12, Function1 function13, float f10, boolean z10, long j10, float f11, float f12, boolean z11, N n10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function12 = null;
        }
        if ((i10 & 4) != 0) {
            function13 = null;
        }
        if ((i10 & 8) != 0) {
            f10 = Float.NaN;
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        if ((i10 & 32) != 0) {
            j10 = H1.k.INSTANCE.a();
        }
        if ((i10 & 64) != 0) {
            f11 = H1.h.INSTANCE.c();
        }
        if ((i10 & 128) != 0) {
            f12 = H1.h.INSTANCE.c();
        }
        if ((i10 & 256) != 0) {
            z11 = true;
        }
        if ((i10 & 512) != 0) {
            n10 = null;
        }
        return e(modifier, function1, function12, function13, f10, z10, j10, f11, f12, z11, n10);
    }

    public static final boolean a(float f10, float f11) {
        if ((Float.isNaN(f10) && Float.isNaN(f11)) || f10 == f11) {
            return true;
        }
        return false;
    }
}
