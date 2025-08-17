package d8;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import c8.EnumC6375b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\" \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroid/view/ViewGroup;", "", "x", "y", "Landroid/view/View;", "a", "(Landroid/view/ViewGroup;II)Landroid/view/View;", "", "c", "(Landroid/view/View;II)Z", "Landroid/view/MotionEvent;", "Lc8/b;", "b", "(Landroid/view/MotionEvent;)Lc8/b;", "", "", "Ljava/util/Set;", "getCLICKABLE_MODIFIER_NAMES", "()Ljava/util/Set;", "CLICKABLE_MODIFIER_NAMES", "com.dynatrace.agent_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: d8.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13496c {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<String> f127296a = SetsKt.i("androidx.compose.foundation.ClickableElement", "androidx.compose.foundation.CombinedClickableElement");

    private static final boolean c(View view, int i10, int i11) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i12 = iArr[0];
        int i13 = iArr[1];
        return i10 >= i12 && i10 <= i12 + view.getWidth() && i11 >= i13 && i11 <= i13 + view.getHeight();
    }

    public static final View a(ViewGroup viewGroup, int i10, int i11) {
        View childAt;
        Intrinsics.j(viewGroup, "<this>");
        if (!c(viewGroup, i10, i11)) {
            return viewGroup;
        }
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                childAt = null;
                break;
            }
            childAt = viewGroup.getChildAt(childCount);
            Intrinsics.g(childAt);
            if (c(childAt, i10, i11)) {
                if (childAt instanceof ViewGroup) {
                    childAt = a((ViewGroup) childAt, i10, i11);
                }
            }
        }
        return childAt == null ? viewGroup : childAt;
    }

    public static final EnumC6375b b(MotionEvent motionEvent) {
        Intrinsics.j(motionEvent, "<this>");
        int action = motionEvent.getAction();
        return action != 0 ? action != 1 ? action != 2 ? action != 5 ? action != 6 ? EnumC6375b.f61646f : EnumC6375b.f61645e : EnumC6375b.f61644d : EnumC6375b.f61643c : EnumC6375b.f61642b : EnumC6375b.f61641a;
    }
}
