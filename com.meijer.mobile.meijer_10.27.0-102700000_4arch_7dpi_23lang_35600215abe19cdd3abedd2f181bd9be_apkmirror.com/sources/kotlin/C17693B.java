package kotlin;

import androidx.compose.ui.semantics.SemanticsPropertyKey;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\"\u001a\u0010\u0012\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0014\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011\" \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"LU0/f;", "position", "a", "(J)J", "", "isStartHandle", "LF1/i;", "direction", "handlesCrossed", "f", "(ZLF1/i;Z)Z", "areHandlesCrossed", "e", "(LF1/i;Z)Z", "LH1/h;", "F", "c", "()F", "HandleWidth", "b", "HandleHeight", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lw0/A;", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "d", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "SelectionHandleInfoKey", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: w0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17693B {

    /* renamed from: a, reason: collision with root package name */
    private static final float f165245a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f165246b;

    /* renamed from: c, reason: collision with root package name */
    private static final SemanticsPropertyKey<SelectionHandleInfo> f165247c = new SemanticsPropertyKey<>("SelectionHandleInfo", null, 2, null);

    static {
        float f10 = 25;
        f165245a = H1.h.p(f10);
        f165246b = H1.h.p(f10);
    }

    public static final long a(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - 1.0f;
        return U0.f.e((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    public static final float b() {
        return f165246b;
    }

    public static final float c() {
        return f165245a;
    }

    public static final SemanticsPropertyKey<SelectionHandleInfo> d() {
        return f165247c;
    }

    public static final boolean e(F1.i iVar, boolean z10) {
        if (iVar != F1.i.f10163a || z10) {
            return iVar == F1.i.f10164b && z10;
        }
        return true;
    }

    public static final boolean f(boolean z10, F1.i iVar, boolean z11) {
        return z10 ? e(iVar, z11) : !e(iVar, z11);
    }
}
