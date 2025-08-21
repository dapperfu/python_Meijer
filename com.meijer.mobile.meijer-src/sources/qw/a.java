package qw;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lqw/a;", "", "a", "b", "timber_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static final ArrayList<b> f159094b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private static volatile b[] f159095c = new b[0];

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\n\u001a\u00020\t2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0010\u001a\u00020\t2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u0010\u0010\u000bJ=\u0010\u0011\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u0011\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0014\u001a\u00020\t2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u0014\u0010\u000bJ=\u0010\u0015\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u0015\u0010\u000fJ3\u0010\u0016\u001a\u00020\t2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u0016\u0010\u000bJ=\u0010\u0017\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u0017\u0010\u000fJ\u0019\u0010\r\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b\r\u0010\u0013J3\u0010\u0018\u001a\u00020\t2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u0018\u0010\u000bJ=\u0010\u0019\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u0019\u0010\u000fJ\u0019\u0010\u001a\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b\u001a\u0010\u0013J3\u0010\u001b\u001a\u00020\t2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u001b\u0010\u000bJ=\u0010\u001c\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u001c\u0010\u000fJ3\u0010 \u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u0001H\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u0001H\u0007¢\u0006\u0004\b'\u0010&J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010(H\u0007¢\u0006\u0004\b)\u0010*R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00010-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lqw/a$a;", "Lqw/a$b;", "<init>", "()V", "", "message", "", "", "args", "", "q", "(Ljava/lang/String;[Ljava/lang/Object;)V", "", "t", "r", "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "a", "c", "b", "(Ljava/lang/Throwable;)V", "k", "l", "s", "u", "d", "f", "e", "v", "w", "", "priority", "tag", "o", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "z", "(Ljava/lang/String;)Lqw/a$b;", "tree", "y", "(Lqw/a$b;)V", "A", "", "x", "()Ljava/util/List;", "treeArray", "[Lqw/a$b;", "Ljava/util/ArrayList;", "trees", "Ljava/util/ArrayList;", "timber_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: qw.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion extends b {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final void A(b tree) {
            Intrinsics.j(tree, "tree");
            synchronized (a.f159094b) {
                if (!a.f159094b.remove(tree)) {
                    throw new IllegalArgumentException(Intrinsics.q("Cannot uproot tree which is not planted: ", tree).toString());
                }
                Object[] array = a.f159094b.toArray(new b[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                a.f159095c = (b[]) array;
                Unit unit = Unit.f143329a;
            }
        }

        @Override // qw.a.b
        @JvmStatic
        public void a(String message, Object... args) {
            Intrinsics.j(args, "args");
            for (b bVar : a.f159095c) {
                bVar.a(message, Arrays.copyOf(args, args.length));
            }
        }

        @Override // qw.a.b
        @JvmStatic
        public void c(Throwable t10, String message, Object... args) {
            Intrinsics.j(args, "args");
            for (b bVar : a.f159095c) {
                bVar.c(t10, message, Arrays.copyOf(args, args.length));
            }
        }

        @Override // qw.a.b
        @JvmStatic
        public void d(String message, Object... args) {
            Intrinsics.j(args, "args");
            for (b bVar : a.f159095c) {
                bVar.d(message, Arrays.copyOf(args, args.length));
            }
        }

        @Override // qw.a.b
        @JvmStatic
        public void f(Throwable t10, String message, Object... args) {
            Intrinsics.j(args, "args");
            for (b bVar : a.f159095c) {
                bVar.f(t10, message, Arrays.copyOf(args, args.length));
            }
        }

        @Override // qw.a.b
        @JvmStatic
        public void k(String message, Object... args) {
            Intrinsics.j(args, "args");
            for (b bVar : a.f159095c) {
                bVar.k(message, Arrays.copyOf(args, args.length));
            }
        }

        @Override // qw.a.b
        @JvmStatic
        public void l(Throwable t10, String message, Object... args) {
            Intrinsics.j(args, "args");
            for (b bVar : a.f159095c) {
                bVar.l(t10, message, Arrays.copyOf(args, args.length));
            }
        }

        @Override // qw.a.b
        protected void o(int priority, String tag, String message, Throwable t10) {
            Intrinsics.j(message, "message");
            throw new AssertionError();
        }

        @Override // qw.a.b
        @JvmStatic
        public void q(String message, Object... args) {
            Intrinsics.j(args, "args");
            for (b bVar : a.f159095c) {
                bVar.q(message, Arrays.copyOf(args, args.length));
            }
        }

        @Override // qw.a.b
        @JvmStatic
        public void r(Throwable t10, String message, Object... args) {
            Intrinsics.j(args, "args");
            for (b bVar : a.f159095c) {
                bVar.r(t10, message, Arrays.copyOf(args, args.length));
            }
        }

        @Override // qw.a.b
        @JvmStatic
        public void s(String message, Object... args) {
            Intrinsics.j(args, "args");
            for (b bVar : a.f159095c) {
                bVar.s(message, Arrays.copyOf(args, args.length));
            }
        }

        @Override // qw.a.b
        @JvmStatic
        public void u(Throwable t10, String message, Object... args) {
            Intrinsics.j(args, "args");
            for (b bVar : a.f159095c) {
                bVar.u(t10, message, Arrays.copyOf(args, args.length));
            }
        }

        @Override // qw.a.b
        @JvmStatic
        public void v(String message, Object... args) {
            Intrinsics.j(args, "args");
            for (b bVar : a.f159095c) {
                bVar.v(message, Arrays.copyOf(args, args.length));
            }
        }

        @Override // qw.a.b
        @JvmStatic
        public void w(Throwable t10, String message, Object... args) {
            Intrinsics.j(args, "args");
            for (b bVar : a.f159095c) {
                bVar.w(t10, message, Arrays.copyOf(args, args.length));
            }
        }

        @JvmStatic
        public final void y(b tree) {
            Intrinsics.j(tree, "tree");
            if (!(tree != this)) {
                throw new IllegalArgumentException("Cannot plant Timber into itself.");
            }
            synchronized (a.f159094b) {
                a.f159094b.add(tree);
                Object[] array = a.f159094b.toArray(new b[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                a.f159095c = (b[]) array;
                Unit unit = Unit.f143329a;
            }
        }

        @JvmStatic
        public final b z(String tag) {
            Intrinsics.j(tag, "tag");
            b[] bVarArr = a.f159095c;
            int length = bVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                b bVar = bVarArr[i10];
                i10++;
                bVar.getExplicitTag().set(tag);
            }
            return this;
        }

        @Override // qw.a.b
        @JvmStatic
        public void b(Throwable t10) {
            for (b bVar : a.f159095c) {
                bVar.b(t10);
            }
        }

        @Override // qw.a.b
        @JvmStatic
        public void e(Throwable t10) {
            for (b bVar : a.f159095c) {
                bVar.e(t10);
            }
        }

        @Override // qw.a.b
        @JvmStatic
        public void t(Throwable t10) {
            for (b bVar : a.f159095c) {
                bVar.t(t10);
            }
        }

        @JvmStatic
        public final List<b> x() {
            List<b> listUnmodifiableList;
            synchronized (a.f159094b) {
                listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.j1(a.f159094b));
                Intrinsics.i(listUnmodifiableList, "unmodifiableList(trees.toList())");
            }
            return listUnmodifiableList;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0011\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0013\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0015\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0012J;\u0010\u0016\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u0019\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u0012J;\u0010\u001a\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J1\u0010\u001b\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u0012J;\u0010\u001c\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u0014J\u0019\u0010\u0007\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\u0018J1\u0010\u001d\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u0012J;\u0010\u001e\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u001e\u0010\u0014J\u0019\u0010\u001f\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\u0018J1\u0010 \u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b \u0010\u0012J;\u0010!\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b!\u0010\u0014J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u0004H\u0015¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b&\u0010'J)\u0010(\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0010\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\nH\u0014¢\u0006\u0004\b(\u0010)J3\u0010*\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H$¢\u0006\u0004\b*\u0010+R \u00100\u001a\b\u0012\u0004\u0012\u00020\b0,8@X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010-\u001a\u0004\b.\u0010/R\u0016\u0010%\u001a\u0004\u0018\u00010\b8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lqw/a$b;", "", "<init>", "()V", "", "priority", "", "t", "", "message", "", "args", "", "p", "(ILjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "i", "(Ljava/lang/Throwable;)Ljava/lang/String;", "q", "(Ljava/lang/String;[Ljava/lang/Object;)V", "r", "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "a", "c", "b", "(Ljava/lang/Throwable;)V", "k", "l", "s", "u", "d", "f", "e", "v", "w", "", "m", "(I)Z", "tag", "n", "(Ljava/lang/String;I)Z", "g", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "o", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "Ljava/lang/ThreadLocal;", "Ljava/lang/ThreadLocal;", "h", "()Ljava/lang/ThreadLocal;", "explicitTag", "j", "()Ljava/lang/String;", "timber_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ThreadLocal<String> explicitTag = new ThreadLocal<>();

        public void b(Throwable t10) {
            p(3, t10, null, new Object[0]);
        }

        public void e(Throwable t10) {
            p(6, t10, null, new Object[0]);
        }

        @Deprecated
        protected boolean m(int priority) {
            return true;
        }

        protected abstract void o(int priority, String tag, String message, Throwable t10);

        public void t(Throwable t10) {
            p(5, t10, null, new Object[0]);
        }

        private final String i(Throwable t10) {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
            t10.printStackTrace(printWriter);
            printWriter.flush();
            String string = stringWriter.toString();
            Intrinsics.i(string, "sw.toString()");
            return string;
        }

        public void a(String message, Object... args) {
            Intrinsics.j(args, "args");
            p(3, null, message, Arrays.copyOf(args, args.length));
        }

        public void c(Throwable t10, String message, Object... args) {
            Intrinsics.j(args, "args");
            p(3, t10, message, Arrays.copyOf(args, args.length));
        }

        public void d(String message, Object... args) {
            Intrinsics.j(args, "args");
            p(6, null, message, Arrays.copyOf(args, args.length));
        }

        public void f(Throwable t10, String message, Object... args) {
            Intrinsics.j(args, "args");
            p(6, t10, message, Arrays.copyOf(args, args.length));
        }

        protected String g(String message, Object[] args) {
            Intrinsics.j(message, "message");
            Intrinsics.j(args, "args");
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String str = String.format(message, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            Intrinsics.i(str, "java.lang.String.format(this, *args)");
            return str;
        }

        /* renamed from: h, reason: from getter */
        public final /* synthetic */ ThreadLocal getExplicitTag() {
            return this.explicitTag;
        }

        public /* synthetic */ String j() {
            String str = this.explicitTag.get();
            if (str != null) {
                this.explicitTag.remove();
            }
            return str;
        }

        public void k(String message, Object... args) {
            Intrinsics.j(args, "args");
            p(4, null, message, Arrays.copyOf(args, args.length));
        }

        public void l(Throwable t10, String message, Object... args) {
            Intrinsics.j(args, "args");
            p(4, t10, message, Arrays.copyOf(args, args.length));
        }

        public void q(String message, Object... args) {
            Intrinsics.j(args, "args");
            p(2, null, message, Arrays.copyOf(args, args.length));
        }

        public void r(Throwable t10, String message, Object... args) {
            Intrinsics.j(args, "args");
            p(2, t10, message, Arrays.copyOf(args, args.length));
        }

        public void s(String message, Object... args) {
            Intrinsics.j(args, "args");
            p(5, null, message, Arrays.copyOf(args, args.length));
        }

        public void u(Throwable t10, String message, Object... args) {
            Intrinsics.j(args, "args");
            p(5, t10, message, Arrays.copyOf(args, args.length));
        }

        public void v(String message, Object... args) {
            Intrinsics.j(args, "args");
            p(7, null, message, Arrays.copyOf(args, args.length));
        }

        public void w(Throwable t10, String message, Object... args) {
            Intrinsics.j(args, "args");
            p(7, t10, message, Arrays.copyOf(args, args.length));
        }

        private final void p(int priority, Throwable t10, String message, Object... args) {
            boolean z10;
            String strJ = j();
            if (n(strJ, priority)) {
                if (message != null && message.length() != 0) {
                    if (args.length == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        message = g(message, args);
                    }
                    if (t10 != null) {
                        message = ((Object) message) + '\n' + i(t10);
                    }
                } else if (t10 == null) {
                    return;
                } else {
                    message = i(t10);
                }
                o(priority, strJ, message, t10);
            }
        }

        protected boolean n(String tag, int priority) {
            return m(priority);
        }
    }

    @JvmStatic
    public static void d(String str, Object... objArr) {
        INSTANCE.a(str, objArr);
    }

    @JvmStatic
    public static void e(Throwable th2, String str, Object... objArr) {
        INSTANCE.f(th2, str, objArr);
    }

    @JvmStatic
    public static final b f(String str) {
        return INSTANCE.z(str);
    }

    @JvmStatic
    public static void g(String str, Object... objArr) {
        INSTANCE.s(str, objArr);
    }
}
