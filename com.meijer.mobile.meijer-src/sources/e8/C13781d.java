package e8;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a)\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "Le8/c;", "", "distance", "a", "(Ljava/util/List;I)Ljava/util/List;", "com.dynatrace.agent_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: e8.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13781d {
    public static final List<TouchEvent> a(List<TouchEvent> list, int i10) {
        Intrinsics.j(list, "<this>");
        if (list.isEmpty()) {
            return CollectionsKt.m();
        }
        List<TouchEvent> listM1 = CollectionsKt.m1(list);
        Object objS0 = CollectionsKt.s0(list);
        int i11 = 0;
        for (Object obj : CollectionsKt.j0(list, 1)) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.w();
            }
            TouchEvent touchEvent = (TouchEvent) obj;
            TouchEvent touchEvent2 = (TouchEvent) objS0;
            if (Math.hypot(touchEvent2.getX() - touchEvent.getX(), touchEvent2.getY() - touchEvent.getY()) >= i10) {
                objS0 = touchEvent;
            } else {
                listM1.remove(touchEvent);
            }
            i11 = i12;
        }
        return listM1;
    }

    public static /* synthetic */ List b(List list, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 100;
        }
        return a(list, i10);
    }
}
