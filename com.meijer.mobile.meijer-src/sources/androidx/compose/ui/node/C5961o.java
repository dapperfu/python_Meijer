package androidx.compose.ui.node;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"$\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Comparator;", "a", "Ljava/util/Comparator;", "DepthComparator", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.node.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5961o {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator<LayoutNode> f51784a = new a();

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003J\u001f\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"androidx/compose/ui/node/o$a", "Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Comparator;", "a", "b", "", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutNode;)I", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.o$a */
    public static final class a implements Comparator<LayoutNode> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(LayoutNode a10, LayoutNode b10) {
            int iK = Intrinsics.k(a10.getDepth(), b10.getDepth());
            if (iK != 0) {
                return iK;
            }
            return Intrinsics.k(a10.hashCode(), b10.hashCode());
        }
    }
}
