package kotlin.reflect.jvm.internal.impl.utils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* loaded from: classes14.dex */
public class DFS {

    public static abstract class AbstractNodeHandler<N, R> implements NodeHandler<N, R> {
        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        public void b(N n10) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        public boolean c(N n10) {
            return true;
        }
    }

    public static abstract class CollectingNodeHandler<N, R, C extends Iterable<R>> extends AbstractNodeHandler<N, C> {

        /* renamed from: a, reason: collision with root package name */
        protected final C f148068a;

        private static /* synthetic */ void d(int i10) {
            String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 1 ? 3 : 2];
            if (i10 != 1) {
                objArr[0] = "result";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/DFS$CollectingNodeHandler";
            }
            if (i10 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS$CollectingNodeHandler";
            } else {
                objArr[1] = "result";
            }
            if (i10 != 1) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 1) {
                throw new IllegalStateException(str2);
            }
        }

        protected CollectingNodeHandler(C c10) {
            if (c10 == null) {
                d(0);
            }
            this.f148068a = c10;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C a() {
            C c10 = this.f148068a;
            if (c10 == null) {
                d(1);
            }
            return c10;
        }
    }

    public interface Neighbors<N> {
        Iterable<? extends N> a(N n10);
    }

    public interface NodeHandler<N, R> {
        R a();

        void b(N n10);

        boolean c(N n10);
    }

    public static abstract class NodeHandlerWithListResult<N, R> extends CollectingNodeHandler<N, R, LinkedList<R>> {
        protected NodeHandlerWithListResult() {
            super(new LinkedList());
        }
    }

    public interface Visited<N> {
        boolean a(N n10);
    }

    public static class VisitedWithSet<N> implements Visited<N> {

        /* renamed from: a, reason: collision with root package name */
        private final Set<N> f148069a;

        public VisitedWithSet() {
            this(new HashSet());
        }

        private static /* synthetic */ void b(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"));
        }

        public VisitedWithSet(Set<N> set) {
            if (set == null) {
                b(0);
            }
            this.f148069a = set;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Visited
        public boolean a(N n10) {
            return this.f148069a.add(n10);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [N] */
    static class a<N> extends AbstractNodeHandler<N, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f148070a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean[] f148071b;

        a(Function1 function1, boolean[] zArr) {
            this.f148070a = function1;
            this.f148071b = zArr;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        public boolean c(N n10) {
            if (((Boolean) this.f148070a.invoke(n10)).booleanValue()) {
                this.f148071b[0] = true;
            }
            return !this.f148071b[0];
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean a() {
            return Boolean.valueOf(this.f148071b[0]);
        }
    }

    private static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i10) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static <N, R> R b(Collection<N> collection, Neighbors<N> neighbors, NodeHandler<N, R> nodeHandler) {
        if (collection == null) {
            a(4);
        }
        if (neighbors == null) {
            a(5);
        }
        if (nodeHandler == null) {
            a(6);
        }
        return (R) c(collection, neighbors, new VisitedWithSet(), nodeHandler);
    }

    public static <N, R> R c(Collection<N> collection, Neighbors<N> neighbors, Visited<N> visited, NodeHandler<N, R> nodeHandler) {
        if (collection == null) {
            a(0);
        }
        if (neighbors == null) {
            a(1);
        }
        if (visited == null) {
            a(2);
        }
        if (nodeHandler == null) {
            a(3);
        }
        Iterator<N> it = collection.iterator();
        while (it.hasNext()) {
            d(it.next(), neighbors, visited, nodeHandler);
        }
        return nodeHandler.a();
    }

    public static <N> void d(N n10, Neighbors<N> neighbors, Visited<N> visited, NodeHandler<N, ?> nodeHandler) {
        if (n10 == null) {
            a(22);
        }
        if (neighbors == null) {
            a(23);
        }
        if (visited == null) {
            a(24);
        }
        if (nodeHandler == null) {
            a(25);
        }
        if (visited.a(n10) && nodeHandler.c(n10)) {
            Iterator<? extends N> it = neighbors.a(n10).iterator();
            while (it.hasNext()) {
                d(it.next(), neighbors, visited, nodeHandler);
            }
            nodeHandler.b(n10);
        }
    }

    public static <N> Boolean e(Collection<N> collection, Neighbors<N> neighbors, Function1<N, Boolean> function1) {
        if (collection == null) {
            a(7);
        }
        if (neighbors == null) {
            a(8);
        }
        if (function1 == null) {
            a(9);
        }
        return (Boolean) b(collection, neighbors, new a(function1, new boolean[1]));
    }
}
