package kotlin;

import H1.o;
import H1.r;
import H1.t;
import androidx.compose.ui.window.p;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R)\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Lx0/g0;", "Landroidx/compose/ui/window/p;", "LH1/j;", "contentOffset", "LH1/d;", "density", "Lkotlin/Function2;", "LH1/p;", "", "onPositionCalculated", "<init>", "(JLH1/d;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "anchorBounds", "LH1/r;", "windowSize", "LH1/t;", "layoutDirection", "popupContentSize", "LH1/n;", "a", "(LH1/p;JLH1/t;J)J", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getContentOffset-RKDOV3M", "()J", "b", "LH1/d;", "getDensity", "()LH1/d;", "c", "Lkotlin/jvm/functions/Function2;", "getOnPositionCalculated", "()Lkotlin/jvm/functions/Function2;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.g0, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final /* data */ class DropdownMenuPositionProvider implements p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long contentOffset;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final H1.d density;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function2<H1.p, H1.p, Unit> onPositionCalculated;

    public /* synthetic */ DropdownMenuPositionProvider(long j10, H1.d dVar, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, dVar, function2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) other;
        return H1.j.d(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && Intrinsics.e(this.density, dropdownMenuPositionProvider.density) && Intrinsics.e(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DropdownMenuPositionProvider(long j10, H1.d dVar, Function2<? super H1.p, ? super H1.p, Unit> function2) {
        this.contentOffset = j10;
        this.density = dVar;
        this.onPositionCalculated = function2;
    }

    @Override // androidx.compose.ui.window.p
    public long a(H1.p anchorBounds, long windowSize, t layoutDirection, long popupContentSize) {
        Sequence sequenceV;
        Object obj;
        Object next;
        int iE0 = this.density.E0(C17885I0.j());
        int iE02 = this.density.E0(H1.j.e(this.contentOffset));
        t tVar = t.f12006a;
        int i10 = iE02 * (layoutDirection == tVar ? 1 : -1);
        int iE03 = this.density.E0(H1.j.f(this.contentOffset));
        int left = anchorBounds.getLeft() + i10;
        int right = (anchorBounds.getRight() - r.g(popupContentSize)) + i10;
        int iG = r.g(windowSize) - r.g(popupContentSize);
        if (layoutDirection == tVar) {
            Integer numValueOf = Integer.valueOf(left);
            Integer numValueOf2 = Integer.valueOf(right);
            if (anchorBounds.getLeft() < 0) {
                iG = 0;
            }
            sequenceV = SequencesKt.v(numValueOf, numValueOf2, Integer.valueOf(iG));
        } else {
            Integer numValueOf3 = Integer.valueOf(right);
            Integer numValueOf4 = Integer.valueOf(left);
            if (anchorBounds.getRight() <= r.g(windowSize)) {
                iG = 0;
            }
            sequenceV = SequencesKt.v(numValueOf3, numValueOf4, Integer.valueOf(iG));
        }
        Iterator it = sequenceV.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int iIntValue = ((Number) next).intValue();
            if (iIntValue >= 0 && iIntValue + r.g(popupContentSize) <= r.g(windowSize)) {
                break;
            }
        }
        Integer num = (Integer) next;
        if (num != null) {
            right = num.intValue();
        }
        int iMax = Math.max(anchorBounds.getBottom() + iE03, iE0);
        int top = (anchorBounds.getTop() - r.f(popupContentSize)) + iE03;
        Iterator it2 = SequencesKt.v(Integer.valueOf(iMax), Integer.valueOf(top), Integer.valueOf((anchorBounds.getTop() - (r.f(popupContentSize) / 2)) + iE03), Integer.valueOf((r.f(windowSize) - r.f(popupContentSize)) - iE0)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            int iIntValue2 = ((Number) next2).intValue();
            if (iIntValue2 >= iE0 && iIntValue2 + r.f(popupContentSize) <= r.f(windowSize) - iE0) {
                obj = next2;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            top = num2.intValue();
        }
        this.onPositionCalculated.invoke(anchorBounds, new H1.p(right, top, r.g(popupContentSize) + right, r.f(popupContentSize) + top));
        return o.a(right, top);
    }

    public int hashCode() {
        return (((H1.j.g(this.contentOffset) * 31) + this.density.hashCode()) * 31) + this.onPositionCalculated.hashCode();
    }

    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) H1.j.h(this.contentOffset)) + ", density=" + this.density + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }
}
