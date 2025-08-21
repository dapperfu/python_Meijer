package m0;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import m0.C15622H;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b \u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\"\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010!\u001a\u00020\u0006H&¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010&R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Lm0/y;", "", "", "isVertical", "Lm0/E;", "slots", "", "gridItemsCount", "spaceBetweenLines", "Lm0/w;", "measuredItemProvider", "Lm0/H;", "spanLayoutProvider", "<init>", "(ZLm0/E;IILm0/w;Lm0/H;)V", "startSlot", "span", "LH1/b;", "a", "(II)J", "index", "d", "(I)I", "lineIndex", "Lm0/x;", "c", "(I)Lm0/x;", "", "Lm0/v;", "items", "", "Lm0/c;", "spans", "mainAxisSpacing", "b", "(I[Lm0/v;Ljava/util/List;I)Lm0/x;", "Z", "Lm0/E;", "I", "e", "Lm0/w;", "f", "Lm0/H;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: m0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC15650y {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C15619E slots;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int gridItemsCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int spaceBetweenLines;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15648w measuredItemProvider;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C15622H spanLayoutProvider;

    public final long a(int startSlot, int span) {
        int i10;
        if (span == 1) {
            i10 = this.slots.getSizes()[startSlot];
        } else {
            int i11 = (span + startSlot) - 1;
            i10 = (this.slots.getPositions()[i11] + this.slots.getSizes()[i11]) - this.slots.getPositions()[startSlot];
        }
        int iF = RangesKt.f(i10, 0);
        return this.isVertical ? H1.b.INSTANCE.e(iF) : H1.b.INSTANCE.d(iF);
    }

    public abstract C15649x b(int index, C15647v[] items, List<C15628c> spans, int mainAxisSpacing);

    public final C15649x c(int lineIndex) {
        C15622H.c cVarC = this.spanLayoutProvider.c(lineIndex);
        int size = cVarC.b().size();
        int i10 = (size == 0 || cVarC.getFirstItemIndex() + size == this.gridItemsCount) ? 0 : this.spaceBetweenLines;
        C15647v[] c15647vArr = new C15647v[size];
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            int iD = C15628c.d(cVarC.b().get(i12).getPackedValue());
            C15647v c15647vD = this.measuredItemProvider.d(cVarC.getFirstItemIndex() + i12, a(i11, iD), i11, iD, i10);
            i11 += iD;
            Unit unit = Unit.f143329a;
            c15647vArr[i12] = c15647vD;
        }
        return b(lineIndex, c15647vArr, cVarC.b(), i10);
    }

    public final int d(int index) {
        C15622H c15622h = this.spanLayoutProvider;
        return c15622h.i(index, c15622h.getSlotsPerLine());
    }

    public AbstractC15650y(boolean z10, C15619E c15619e, int i10, int i11, AbstractC15648w abstractC15648w, C15622H c15622h) {
        this.isVertical = z10;
        this.slots = c15619e;
        this.gridItemsCount = i10;
        this.spaceBetweenLines = i11;
        this.measuredItemProvider = abstractC15648w;
        this.spanLayoutProvider = c15622h;
    }
}
