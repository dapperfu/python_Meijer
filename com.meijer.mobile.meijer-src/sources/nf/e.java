package nf;

import ig.AbstractC14731d;
import ig.AbstractC14732e;
import ig.InterfaceC14733f;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import sf.p;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lnf/e;", "Lig/f;", "Lsf/p;", "userMetadata", "<init>", "(Lsf/p;)V", "Lig/e;", "rolloutsState", "", "a", "(Lig/e;)V", "Lsf/p;", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class e implements InterfaceC14733f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p userMetadata;

    public e(p userMetadata) {
        Intrinsics.j(userMetadata, "userMetadata");
        this.userMetadata = userMetadata;
    }

    @Override // ig.InterfaceC14733f
    public void a(AbstractC14732e rolloutsState) {
        Intrinsics.j(rolloutsState, "rolloutsState");
        p pVar = this.userMetadata;
        Set<AbstractC14731d> setB = rolloutsState.b();
        Intrinsics.i(setB, "getRolloutAssignments(...)");
        Set<AbstractC14731d> set = setB;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(set, 10));
        for (AbstractC14731d abstractC14731d : set) {
            arrayList.add(sf.j.b(abstractC14731d.d(), abstractC14731d.b(), abstractC14731d.c(), abstractC14731d.f(), abstractC14731d.e()));
        }
        pVar.r(arrayList);
        g.f().b("Updated Crashlytics Rollout State");
    }
}
