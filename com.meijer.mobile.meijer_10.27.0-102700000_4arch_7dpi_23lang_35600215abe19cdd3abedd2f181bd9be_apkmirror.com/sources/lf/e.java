package lf;

import gg.AbstractC14257d;
import gg.AbstractC14258e;
import gg.InterfaceC14259f;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qf.p;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Llf/e;", "Lgg/f;", "Lqf/p;", "userMetadata", "<init>", "(Lqf/p;)V", "Lgg/e;", "rolloutsState", "", "a", "(Lgg/e;)V", "Lqf/p;", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class e implements InterfaceC14259f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p userMetadata;

    public e(p userMetadata) {
        Intrinsics.j(userMetadata, "userMetadata");
        this.userMetadata = userMetadata;
    }

    @Override // gg.InterfaceC14259f
    public void a(AbstractC14258e rolloutsState) {
        Intrinsics.j(rolloutsState, "rolloutsState");
        p pVar = this.userMetadata;
        Set<AbstractC14257d> setB = rolloutsState.b();
        Intrinsics.i(setB, "getRolloutAssignments(...)");
        Set<AbstractC14257d> set = setB;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(set, 10));
        for (AbstractC14257d abstractC14257d : set) {
            arrayList.add(qf.j.b(abstractC14257d.d(), abstractC14257d.b(), abstractC14257d.c(), abstractC14257d.f(), abstractC14257d.e()));
        }
        pVar.r(arrayList);
        g.f().b("Updated Crashlytics Rollout State");
    }
}
