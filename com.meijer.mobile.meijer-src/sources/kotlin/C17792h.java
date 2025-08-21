package kotlin;

import H1.o;
import H1.r;
import H1.t;
import androidx.compose.ui.window.p;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Lw0/h;", "Landroidx/compose/ui/window/p;", "LP0/e;", "handleReferencePoint", "Lw0/m;", "positionProvider", "<init>", "(LP0/e;Lw0/m;)V", "LH1/p;", "anchorBounds", "LH1/r;", "windowSize", "LH1/t;", "layoutDirection", "popupContentSize", "LH1/n;", "a", "(LH1/p;JLH1/t;J)J", "LP0/e;", "b", "Lw0/m;", "LU0/f;", "c", "J", "prevPosition", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: w0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17792h implements p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final P0.e handleReferencePoint;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17797m positionProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long prevPosition = U0.f.INSTANCE.c();

    @Override // androidx.compose.ui.window.p
    public long a(H1.p anchorBounds, long windowSize, t layoutDirection, long popupContentSize) {
        long jA = this.positionProvider.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.prevPosition;
        }
        this.prevPosition = jA;
        return H1.n.o(H1.n.o(anchorBounds.i(), o.d(jA)), this.handleReferencePoint.a(popupContentSize, r.INSTANCE.a(), layoutDirection));
    }

    public C17792h(P0.e eVar, InterfaceC17797m interfaceC17797m) {
        this.handleReferencePoint = eVar;
        this.positionProvider = interfaceC17797m;
    }
}
