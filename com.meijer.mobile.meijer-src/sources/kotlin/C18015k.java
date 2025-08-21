package kotlin;

import V0.C5489q0;
import V0.D1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kotlin.C6418E;
import kotlin.C6453j;
import kotlin.InterfaceC6452i;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import r0.AbstractC16798a;
import r0.C16800c;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\u000e\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b\r\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00188Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Lx0/k;", "", "<init>", "()V", "LH1/h;", "b", "F", "f", "()F", "PeekHeight", "c", "e", "HeaderHeight", "d", "FrontLayerElevation", "Lc0/i;", "", "Lc0/i;", "a", "()Lc0/i;", "AnimationSpec", "LV0/D1;", "(Landroidx/compose/runtime/Composer;I)LV0/D1;", "frontLayerShape", "LV0/q0;", "(Landroidx/compose/runtime/Composer;I)J", "frontLayerScrimColor", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18015k {

    /* renamed from: a, reason: collision with root package name */
    public static final C18015k f169255a = new C18015k();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float PeekHeight = H1.h.p(56);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float HeaderHeight = H1.h.p(48);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float FrontLayerElevation = H1.h.p(1);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final InterfaceC6452i<Float> AnimationSpec = C6453j.l(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, 0, C6418E.c(), 2, null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f169260f = 8;

    public final InterfaceC6452i<Float> a() {
        return AnimationSpec;
    }

    public final float b() {
        return FrontLayerElevation;
    }

    public final float e() {
        return HeaderHeight;
    }

    public final float f() {
        return PeekHeight;
    }

    private C18015k() {
    }

    @JvmName
    public final long c(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(1806270648, i10, -1, "androidx.compose.material.BackdropScaffoldDefaults.<get-frontLayerScrimColor> (BackdropScaffold.kt:628)");
        }
        long jQ = C5489q0.q(C17943E0.f167967a.a(composer, 6).n(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return jQ;
    }

    @JvmName
    public final D1 d(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(1580588700, i10, -1, "androidx.compose.material.BackdropScaffoldDefaults.<get-frontLayerShape> (BackdropScaffold.kt:618)");
        }
        AbstractC16798a large = C17943E0.f167967a.b(composer, 6).getLarge();
        float f10 = 16;
        AbstractC16798a abstractC16798aD = AbstractC16798a.d(large, C16800c.b(H1.h.p(f10)), C16800c.b(H1.h.p(f10)), null, null, 12, null);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return abstractC16798aD;
    }
}
