package J0;

import G0.t;
import androidx.compose.runtime.AbstractC5879p;
import androidx.compose.runtime.C5886t;
import androidx.compose.runtime.E1;
import androidx.compose.runtime.InterfaceC5897y0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00162\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005:\u0002\u000e\u0017B3\u0012\"\u0010\u0007\u001a\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\u00020\u00052\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"LJ0/f;", "LG0/d;", "Landroidx/compose/runtime/p;", "", "Landroidx/compose/runtime/E1;", "Landroidx/compose/runtime/y0;", "LG0/t;", "node", "", "size", "<init>", "(LG0/t;I)V", "T", "key", "a", "(Landroidx/compose/runtime/p;)Ljava/lang/Object;", "value", "l", "(Landroidx/compose/runtime/p;Landroidx/compose/runtime/E1;)Landroidx/compose/runtime/y0;", "LJ0/f$a;", "D", "()LJ0/f$a;", "i", "b", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f extends G0.d<AbstractC5879p<Object>, E1<Object>> implements InterfaceC5897y0 {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: j, reason: collision with root package name */
    private static final f f15356j;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"LJ0/f$a;", "LG0/f;", "Landroidx/compose/runtime/p;", "", "Landroidx/compose/runtime/E1;", "Landroidx/compose/runtime/y0$a;", "LJ0/f;", "map", "<init>", "(LJ0/f;)V", "s", "()LJ0/f;", "g", "LJ0/f;", "getMap$runtime_release", "setMap$runtime_release", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends G0.f<AbstractC5879p<Object>, E1<Object>> implements InterfaceC5897y0.a {

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private f map;

        @Override // G0.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof AbstractC5879p) {
                return t((AbstractC5879p) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof E1) {
                return v((E1) obj);
            }
            return false;
        }

        @Override // G0.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof AbstractC5879p) {
                return w((AbstractC5879p) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof AbstractC5879p) ? obj2 : x((AbstractC5879p) obj, (E1) obj2);
        }

        @Override // G0.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof AbstractC5879p) {
                return y((AbstractC5879p) obj);
            }
            return null;
        }

        public a(f fVar) {
            super(fVar);
            this.map = fVar;
        }

        @Override // G0.f
        /* renamed from: s, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public f build() {
            f fVar;
            if (h() == this.map.w()) {
                fVar = this.map;
            } else {
                q(new I0.e());
                fVar = new f(h(), size());
            }
            this.map = fVar;
            return fVar;
        }

        public /* bridge */ boolean t(AbstractC5879p<Object> abstractC5879p) {
            return super.containsKey(abstractC5879p);
        }

        public /* bridge */ boolean v(E1<Object> e12) {
            return super.containsValue(e12);
        }

        public /* bridge */ E1<Object> w(AbstractC5879p<Object> abstractC5879p) {
            return (E1) super.get(abstractC5879p);
        }

        public /* bridge */ E1<Object> x(AbstractC5879p<Object> abstractC5879p, E1<Object> e12) {
            return (E1) super.getOrDefault(abstractC5879p, e12);
        }

        public /* bridge */ E1<Object> y(AbstractC5879p<Object> abstractC5879p) {
            return (E1) super.remove(abstractC5879p);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"LJ0/f$b;", "", "<init>", "()V", "LJ0/f;", "Empty", "LJ0/f;", "a", "()LJ0/f;", "getEmpty$annotations", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: J0.f$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final f a() {
            return f.f15356j;
        }
    }

    static {
        t tVarA = t.INSTANCE.a();
        Intrinsics.h(tVarA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.ValueHolder<kotlin.Any?>>");
        f15356j = new f(tVarA, 0);
    }

    @Override // G0.d
    /* renamed from: D, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a builder() {
        return new a(this);
    }

    @Override // G0.d, kotlin.collections.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC5879p) {
            return E((AbstractC5879p) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof E1) {
            return F((E1) obj);
        }
        return false;
    }

    @Override // G0.d, kotlin.collections.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof AbstractC5879p) {
            return G((AbstractC5879p) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC5879p) ? obj2 : H((AbstractC5879p) obj, (E1) obj2);
    }

    public f(t<AbstractC5879p<Object>, E1<Object>> tVar, int i10) {
        super(tVar, i10);
    }

    public /* bridge */ boolean E(AbstractC5879p<Object> abstractC5879p) {
        return super.containsKey(abstractC5879p);
    }

    public /* bridge */ boolean F(E1<Object> e12) {
        return super.containsValue(e12);
    }

    public /* bridge */ E1<Object> G(AbstractC5879p<Object> abstractC5879p) {
        return (E1) super.get(abstractC5879p);
    }

    public /* bridge */ E1<Object> H(AbstractC5879p<Object> abstractC5879p, E1<Object> e12) {
        return (E1) super.getOrDefault(abstractC5879p, e12);
    }

    @Override // androidx.compose.runtime.InterfaceC5884s
    public <T> T a(AbstractC5879p<T> key) {
        return (T) C5886t.b(this, key);
    }

    @Override // androidx.compose.runtime.InterfaceC5897y0
    public InterfaceC5897y0 l(AbstractC5879p<Object> key, E1<Object> value) {
        t.b<AbstractC5879p<Object>, E1<Object>> bVarP = w().P(key.hashCode(), key, value, 0);
        if (bVarP == null) {
            return this;
        }
        return new f(bVarP.a(), size() + bVarP.getSizeDelta());
    }
}
