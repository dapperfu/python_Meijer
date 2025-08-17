package l0;

import Z.AbstractC5517o;
import androidx.compose.ui.layout.f0;
import com.google.android.gms.common.api.a;
import java.util.List;
import kotlin.InterfaceC15716B;
import kotlin.InterfaceC15761u;
import kotlin.InterfaceC15763w;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014JB\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0004\u001a\u00020\u0003H&ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001fR\u001d\u0010#\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010 \u001a\u0004\b!\u0010\"R\u0011\u0010'\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010+\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006,"}, d2 = {"Ll0/s;", "Ln0/B;", "Ll0/r;", "LH1/b;", "constraints", "", "isVertical", "Ll0/j;", "itemProvider", "Ln0/w;", "measureScope", "<init>", "(JZLl0/j;Ln0/w;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "index", "lane", "span", "c", "(IIIJ)Ll0/r;", "d", "(IJ)Ll0/r;", "", "key", "contentType", "", "Landroidx/compose/ui/layout/f0;", "placeables", "b", "(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/List;J)Ll0/r;", "a", "Ll0/j;", "Ln0/w;", "J", "f", "()J", "childConstraints", "Ln0/u;", "h", "()Ln0/u;", "keyIndexMap", "LZ/o;", "g", "()LZ/o;", "headerIndexes", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class s implements InterfaceC15716B<r> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15350j itemProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15763w measureScope;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long childConstraints;

    public /* synthetic */ s(long j10, boolean z10, InterfaceC15350j interfaceC15350j, InterfaceC15763w interfaceC15763w, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, z10, interfaceC15350j, interfaceC15763w);
    }

    public abstract r b(int index, Object key, Object contentType, List<? extends f0> placeables, long constraints);

    private s(long j10, boolean z10, InterfaceC15350j interfaceC15350j, InterfaceC15763w interfaceC15763w) {
        this.itemProvider = interfaceC15350j;
        this.measureScope = interfaceC15763w;
        this.childConstraints = H1.c.b(0, z10 ? H1.b.l(j10) : Integer.MAX_VALUE, 0, z10 ? a.e.API_PRIORITY_OTHER : H1.b.k(j10), 5, null);
    }

    public static /* synthetic */ r e(s sVar, int i10, long j10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMeasure-0kLqBqw");
        }
        if ((i11 & 2) != 0) {
            j10 = sVar.childConstraints;
        }
        return sVar.d(i10, j10);
    }

    public final r d(int index, long constraints) {
        return b(index, this.itemProvider.d(index), this.itemProvider.f(index), this.measureScope.p0(index, constraints), constraints);
    }

    /* renamed from: f, reason: from getter */
    public final long getChildConstraints() {
        return this.childConstraints;
    }

    public final AbstractC5517o g() {
        return this.itemProvider.e();
    }

    public final InterfaceC15761u h() {
        return this.itemProvider.b();
    }

    @Override // kotlin.InterfaceC15716B
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public r a(int index, int lane, int span, long constraints) {
        return d(index, constraints);
    }
}
