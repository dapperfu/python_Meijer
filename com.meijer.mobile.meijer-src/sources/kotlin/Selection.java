package kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\fB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lw0/p;", "", "Lw0/p$a;", "start", "end", "", "handlesCrossed", "<init>", "(Lw0/p$a;Lw0/p$a;Z)V", "other", "f", "(Lw0/p;)Lw0/p;", "a", "(Lw0/p$a;Lw0/p$a;Z)Lw0/p;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "Lw0/p$a;", "e", "()Lw0/p$a;", "b", "c", "Z", "d", "()Z", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: w0.p, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final /* data */ class Selection {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AnchorInfo start;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AnchorInfo end;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean handlesCrossed;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lw0/p$a;", "", "LF1/i;", "direction", "", "offset", "", "selectableId", "<init>", "(LF1/i;IJ)V", "a", "(LF1/i;IJ)Lw0/p$a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LF1/i;", "c", "()LF1/i;", "b", "I", "d", "J", "e", "()J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w0.p$a, reason: from toString */
    public static final /* data */ class AnchorInfo {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final F1.i direction;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int offset;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long selectableId;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnchorInfo)) {
                return false;
            }
            AnchorInfo anchorInfo = (AnchorInfo) other;
            return this.direction == anchorInfo.direction && this.offset == anchorInfo.offset && this.selectableId == anchorInfo.selectableId;
        }

        public static /* synthetic */ AnchorInfo b(AnchorInfo anchorInfo, F1.i iVar, int i10, long j10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iVar = anchorInfo.direction;
            }
            if ((i11 & 2) != 0) {
                i10 = anchorInfo.offset;
            }
            if ((i11 & 4) != 0) {
                j10 = anchorInfo.selectableId;
            }
            return anchorInfo.a(iVar, i10, j10);
        }

        public final AnchorInfo a(F1.i direction, int offset, long selectableId) {
            return new AnchorInfo(direction, offset, selectableId);
        }

        /* renamed from: c, reason: from getter */
        public final F1.i getDirection() {
            return this.direction;
        }

        /* renamed from: d, reason: from getter */
        public final int getOffset() {
            return this.offset;
        }

        /* renamed from: e, reason: from getter */
        public final long getSelectableId() {
            return this.selectableId;
        }

        public int hashCode() {
            return (((this.direction.hashCode() * 31) + Integer.hashCode(this.offset)) * 31) + Long.hashCode(this.selectableId);
        }

        public String toString() {
            return "AnchorInfo(direction=" + this.direction + ", offset=" + this.offset + ", selectableId=" + this.selectableId + ')';
        }

        public AnchorInfo(F1.i iVar, int i10, long j10) {
            this.direction = iVar;
            this.offset = i10;
            this.selectableId = j10;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Selection)) {
            return false;
        }
        Selection selection = (Selection) other;
        return Intrinsics.e(this.start, selection.start) && Intrinsics.e(this.end, selection.end) && this.handlesCrossed == selection.handlesCrossed;
    }

    public static /* synthetic */ Selection b(Selection selection, AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            anchorInfo = selection.start;
        }
        if ((i10 & 2) != 0) {
            anchorInfo2 = selection.end;
        }
        if ((i10 & 4) != 0) {
            z10 = selection.handlesCrossed;
        }
        return selection.a(anchorInfo, anchorInfo2, z10);
    }

    public final Selection a(AnchorInfo start, AnchorInfo end, boolean handlesCrossed) {
        return new Selection(start, end, handlesCrossed);
    }

    /* renamed from: c, reason: from getter */
    public final AnchorInfo getEnd() {
        return this.end;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getHandlesCrossed() {
        return this.handlesCrossed;
    }

    /* renamed from: e, reason: from getter */
    public final AnchorInfo getStart() {
        return this.start;
    }

    public final Selection f(Selection other) {
        if (other == null) {
            return this;
        }
        boolean z10 = this.handlesCrossed;
        if (z10 || other.handlesCrossed) {
            return new Selection(other.handlesCrossed ? other.start : other.end, z10 ? this.end : this.start, true);
        }
        return b(this, null, other.end, false, 5, null);
    }

    public int hashCode() {
        return (((this.start.hashCode() * 31) + this.end.hashCode()) * 31) + Boolean.hashCode(this.handlesCrossed);
    }

    public String toString() {
        return "Selection(start=" + this.start + ", end=" + this.end + ", handlesCrossed=" + this.handlesCrossed + ')';
    }

    public Selection(AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z10) {
        this.start = anchorInfo;
        this.end = anchorInfo2;
        this.handlesCrossed = z10;
    }
}
