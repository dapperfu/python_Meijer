package kotlin;

import V0.C5346q0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kotlin.C6292E;
import kotlin.C6327j;
import kotlin.InterfaceC6326i;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00108Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Lx0/K0;", "", "<init>", "()V", "LH1/h;", "b", "F", "()F", "Elevation", "Lc0/i;", "", "c", "Lc0/i;", "a", "()Lc0/i;", "AnimationSpec", "LV0/q0;", "(Landroidx/compose/runtime/Composer;I)J", "scrimColor", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.K0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17889K0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C17889K0 f167100a = new C17889K0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float Elevation = H1.h.p(16);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final InterfaceC6326i<Float> AnimationSpec = C6327j.l(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, 0, C6292E.c(), 2, null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f167103d = 8;

    public final InterfaceC6326i<Float> a() {
        return AnimationSpec;
    }

    public final float b() {
        return Elevation;
    }

    private C17889K0() {
    }

    @JvmName
    public final long c(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-112572414, i10, -1, "androidx.compose.material.ModalBottomSheetDefaults.<get-scrimColor> (ModalBottomSheet.kt:522)");
        }
        long jQ = C5346q0.q(C17877E0.f166879a.a(composer, 6).i(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return jQ;
    }
}
