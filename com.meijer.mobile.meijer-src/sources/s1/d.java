package s1;

import androidx.compose.ui.node.InterfaceC5956j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Ls1/d;", "", "", "topLeft", "bottomRight", "LH1/n;", "windowOffset", "screenOffset", "LV0/k1;", "viewToWindowMatrix", "Landroidx/compose/ui/node/j;", "node", "<init>", "(JJJJ[FLandroidx/compose/ui/node/j;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "J", "b", "c", "d", "e", "[F", "f", "Landroidx/compose/ui/node/j;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long topLeft;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long bottomRight;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long windowOffset;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long screenOffset;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float[] viewToWindowMatrix;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5956j node;

    public /* synthetic */ d(long j10, long j11, long j12, long j13, float[] fArr, InterfaceC5956j interfaceC5956j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, fArr, interfaceC5956j);
    }

    private d(long j10, long j11, long j12, long j13, float[] fArr, InterfaceC5956j interfaceC5956j) {
        this.topLeft = j10;
        this.bottomRight = j11;
        this.windowOffset = j12;
        this.screenOffset = j13;
        this.viewToWindowMatrix = fArr;
        this.node = interfaceC5956j;
    }
}
