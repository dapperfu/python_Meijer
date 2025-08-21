package j0;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ2\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R(\u0010\u0006\u001a\u00020\u00058\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u0007\u001a\u00020\u00058\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Lj0/p;", "", "", "lineIndex", "positionInLine", "LH1/h;", "maxMainAxisSize", "maxCrossAxisSize", "<init>", "(IIFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "a", "(IIFF)V", "I", "getLineIndex$foundation_layout_release", "()I", "setLineIndex$foundation_layout_release", "(I)V", "b", "getPositionInLine$foundation_layout_release", "setPositionInLine$foundation_layout_release", "c", "F", "getMaxMainAxisSize-D9Ej5fM$foundation_layout_release", "()F", "setMaxMainAxisSize-0680j_4$foundation_layout_release", "(F)V", "d", "getMaxCrossAxisSize-D9Ej5fM$foundation_layout_release", "setMaxCrossAxisSize-0680j_4$foundation_layout_release", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: j0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14912p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int lineIndex;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int positionInLine;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float maxMainAxisSize;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float maxCrossAxisSize;

    public /* synthetic */ C14912p(int i10, int i11, float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, f10, f11);
    }

    private C14912p(int i10, int i11, float f10, float f11) {
        this.lineIndex = i10;
        this.positionInLine = i11;
        this.maxMainAxisSize = f10;
        this.maxCrossAxisSize = f11;
    }

    public final void a(int lineIndex, int positionInLine, float maxMainAxisSize, float maxCrossAxisSize) {
        this.lineIndex = lineIndex;
        this.positionInLine = positionInLine;
        this.maxMainAxisSize = maxMainAxisSize;
        this.maxCrossAxisSize = maxCrossAxisSize;
    }

    public /* synthetic */ C14912p(int i10, int i11, float f10, float f11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? H1.h.p(0) : f10, (i12 & 8) != 0 ? H1.h.p(0) : f11, null);
    }
}
