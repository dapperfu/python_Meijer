package m0;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010&\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b \u0010\u001a¨\u0006'"}, d2 = {"Lm0/x;", "", "", "index", "", "Lm0/v;", "items", "Lm0/E;", "slots", "", "Lm0/c;", "spans", "", "isVertical", "mainAxisSpacing", "<init>", "(I[Lm0/v;Lm0/E;Ljava/util/List;ZI)V", "e", "()Z", "offset", "layoutWidth", "layoutHeight", "f", "(III)[Lm0/v;", "a", "I", "()I", "b", "[Lm0/v;", "()[Lm0/v;", "c", "Lm0/E;", "d", "Ljava/util/List;", "Z", "g", "mainAxisSize", "h", "mainAxisSizeWithSpacings", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: m0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15649x {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C15647v[] items;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C15619E slots;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<C15628c> spans;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSpacing;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSize;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSizeWithSpacings;

    /* renamed from: a, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* renamed from: b, reason: from getter */
    public final C15647v[] getItems() {
        return this.items;
    }

    /* renamed from: c, reason: from getter */
    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    /* renamed from: d, reason: from getter */
    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final boolean e() {
        return this.items.length == 0;
    }

    public final C15647v[] f(int offset, int layoutWidth, int layoutHeight) {
        int i10;
        int i11;
        int i12;
        int i13;
        C15647v[] c15647vArr = this.items;
        int length = c15647vArr.length;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < length) {
            C15647v c15647v = c15647vArr[i14];
            int i17 = i15 + 1;
            int iD = C15628c.d(this.spans.get(i15).getPackedValue());
            int i18 = this.slots.getPositions()[i16];
            boolean z10 = this.isVertical;
            int i19 = z10 ? this.index : i16;
            if (z10) {
                i10 = i16;
                i13 = offset;
                i11 = layoutWidth;
                i12 = layoutHeight;
            } else {
                i10 = this.index;
                i11 = layoutWidth;
                i12 = layoutHeight;
                i13 = offset;
            }
            c15647v.u(i13, i18, i11, i12, i19, i10);
            Unit unit = Unit.f143329a;
            i16 += iD;
            i14++;
            i15 = i17;
        }
        return this.items;
    }

    public C15649x(int i10, C15647v[] c15647vArr, C15619E c15619e, List<C15628c> list, boolean z10, int i11) {
        this.index = i10;
        this.items = c15647vArr;
        this.slots = c15619e;
        this.spans = list;
        this.isVertical = z10;
        this.mainAxisSpacing = i11;
        int iMax = 0;
        for (C15647v c15647v : c15647vArr) {
            iMax = Math.max(iMax, c15647v.getMainAxisSize());
        }
        this.mainAxisSize = iMax;
        this.mainAxisSizeWithSpacings = RangesKt.f(iMax + this.mainAxisSpacing, 0);
    }
}
