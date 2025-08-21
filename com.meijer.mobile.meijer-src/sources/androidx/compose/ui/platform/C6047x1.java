package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import java.util.Comparator;
import kotlin.Metadata;
import r1.C16820n;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/x1;", "Ljava/util/Comparator;", "Lr1/n;", "Lkotlin/Comparator;", "<init>", "()V", "a", "b", "", "(Lr1/n;Lr1/n;)I", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.x1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6047x1 implements Comparator<C16820n> {

    /* renamed from: a, reason: collision with root package name */
    public static final C6047x1 f52506a = new C6047x1();

    private C6047x1() {
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(C16820n a10, C16820n b10) {
        Rect rectJ = a10.j();
        Rect rectJ2 = b10.j();
        int iCompare = Float.compare(rectJ2.l(), rectJ.l());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Float.compare(rectJ.getTop(), rectJ2.getTop());
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Float.compare(rectJ.i(), rectJ2.i());
        if (iCompare3 != 0) {
            return iCompare3;
        }
        return Float.compare(rectJ2.getLeft(), rectJ.getLeft());
    }
}
