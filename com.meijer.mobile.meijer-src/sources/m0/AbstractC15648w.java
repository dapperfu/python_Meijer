package m0;

import Z.AbstractC5617o;
import androidx.compose.ui.layout.f0;
import i0.C14592e;
import java.util.List;
import kotlin.InterfaceC15843B;
import kotlin.InterfaceC15888u;
import kotlin.InterfaceC15890w;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ2\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014Jb\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u0011\u0010%\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010)\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Lm0/w;", "Ln0/B;", "Lm0/v;", "Lm0/k;", "itemProvider", "Ln0/w;", "measureScope", "", "defaultMainAxisSpacing", "<init>", "(Lm0/k;Ln0/w;I)V", "index", "lane", "span", "LH1/b;", "constraints", "c", "(IIIJ)Lm0/v;", "mainAxisSpacing", "d", "(IJIII)Lm0/v;", "", "key", "contentType", "crossAxisSize", "", "Landroidx/compose/ui/layout/f0;", "placeables", "b", "(ILjava/lang/Object;Ljava/lang/Object;IILjava/util/List;JII)Lm0/v;", "a", "Lm0/k;", "Ln0/w;", "I", "Ln0/u;", "f", "()Ln0/u;", "keyIndexMap", "LZ/o;", "e", "()LZ/o;", "headerIndices", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: m0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC15648w implements InterfaceC15843B<C15647v> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15636k itemProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15890w measureScope;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int defaultMainAxisSpacing;

    public abstract C15647v b(int index, Object key, Object contentType, int crossAxisSize, int mainAxisSpacing, List<? extends f0> placeables, long constraints, int lane, int span);

    @Override // kotlin.InterfaceC15843B
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C15647v a(int index, int lane, int span, long constraints) {
        return d(index, constraints, lane, span, this.defaultMainAxisSpacing);
    }

    public final C15647v d(int index, long constraints, int lane, int span, int mainAxisSpacing) {
        int iM;
        Object objD = this.itemProvider.d(index);
        Object objF = this.itemProvider.f(index);
        List<f0> listP0 = this.measureScope.p0(index, constraints);
        if (H1.b.j(constraints)) {
            iM = H1.b.n(constraints);
        } else {
            if (!H1.b.i(constraints)) {
                C14592e.a("does not have fixed height");
            }
            iM = H1.b.m(constraints);
        }
        return b(index, objD, objF, iM, mainAxisSpacing, listP0, constraints, lane, span);
    }

    public final AbstractC5617o e() {
        return this.itemProvider.e();
    }

    public final InterfaceC15888u f() {
        return this.itemProvider.b();
    }

    public AbstractC15648w(InterfaceC15636k interfaceC15636k, InterfaceC15890w interfaceC15890w, int i10) {
        this.itemProvider = interfaceC15636k;
        this.measureScope = interfaceC15890w;
        this.defaultMainAxisSpacing = i10;
    }
}
