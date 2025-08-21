package wa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lwa/c;", "Ljava/lang/Runnable;", "", "commands", "<init>", "(Ljava/util/List;)V", "", "run", "()V", "a", "Ljava/util/List;", "getCommands", "()Ljava/util/List;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<Runnable> commands;

    /* JADX WARN: Multi-variable type inference failed */
    public c(List<? extends Runnable> commands) {
        Intrinsics.j(commands, "commands");
        this.commands = commands;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<Runnable> list = this.commands;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof f) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((f) it.next()).run();
        }
        Iterator it2 = CollectionsKt.L0(this.commands, arrayList).iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
    }
}
