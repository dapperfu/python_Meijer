package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import r1.C16706n;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u000026\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u0001j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002`\u0006B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJC\u0010\t\u001a\u00020\u000b2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\u0016¢\u0006\u0004\b\t\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/K1;", "Ljava/util/Comparator;", "Lkotlin/Pair;", "Landroidx/compose/ui/geometry/Rect;", "", "Lr1/n;", "Lkotlin/Comparator;", "<init>", "()V", "a", "b", "", "(Lkotlin/Pair;Lkotlin/Pair;)I", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class K1 implements Comparator<Pair<? extends Rect, ? extends List<C16706n>>> {

    /* renamed from: a, reason: collision with root package name */
    public static final K1 f51836a = new K1();

    private K1() {
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Pair<Rect, ? extends List<C16706n>> a10, Pair<Rect, ? extends List<C16706n>> b10) {
        int iCompare = Float.compare(a10.c().getTop(), b10.c().getTop());
        if (iCompare != 0) {
            return iCompare;
        }
        return Float.compare(a10.c().i(), b10.c().i());
    }
}
