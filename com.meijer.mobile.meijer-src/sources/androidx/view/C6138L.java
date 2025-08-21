package androidx.view;

import T2.c;
import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import x4.C18083c;
import x4.C18086f;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0002\u0015\u001dB\u001f\b\u0016\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0019\u001a\u00020\u0018\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010!¨\u0006#"}, d2 = {"Landroidx/lifecycle/L;", "", "", "", "initialState", "<init>", "(Ljava/util/Map;)V", "()V", "T", "key", "", "hasInitialValue", "initialValue", "Landroidx/lifecycle/D;", "d", "(Ljava/lang/String;ZLjava/lang/Object;)Landroidx/lifecycle/D;", "Lx4/f$b;", "e", "()Lx4/f$b;", "c", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/lifecycle/D;", "b", "(Ljava/lang/String;)Ljava/lang/Object;", "value", "", "f", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "Landroidx/lifecycle/L$b;", "a", "Ljava/util/Map;", "liveDatas", "LT2/b;", "LT2/b;", "impl", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.lifecycle.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6138L {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, b<?>> liveDatas;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private T2.b impl;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\t\u001a\u00020\b2\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u000e\u0010\u0007\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/L$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "restoredState", "defaultState", "Landroidx/lifecycle/L;", "a", "(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/L;", "value", "", "b", "(Ljava/lang/Object;)Z", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.lifecycle.L$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C6138L a(Bundle restoredState, Bundle defaultState) {
            if (restoredState == null) {
                restoredState = defaultState;
            }
            if (restoredState == null) {
                return new C6138L();
            }
            ClassLoader classLoader = C6138L.class.getClassLoader();
            Intrinsics.g(classLoader);
            restoredState.setClassLoader(classLoader);
            return new C6138L(C18083c.g(C18083c.a(restoredState)));
        }

        public final boolean b(Object value) {
            return c.a(value);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/L$b;", "T", "Landroidx/lifecycle/D;", "Landroidx/lifecycle/L;", "handle", "", "key", "value", "<init>", "(Landroidx/lifecycle/L;Ljava/lang/String;Ljava/lang/Object;)V", "(Landroidx/lifecycle/L;Ljava/lang/String;)V", "", "o", "(Ljava/lang/Object;)V", "l", "Ljava/lang/String;", "m", "Landroidx/lifecycle/L;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.L$b */
    public static final class b<T> extends C6130D<T> {

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private String key;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private C6138L handle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C6138L c6138l, String key, T t10) {
            super(t10);
            Intrinsics.j(key, "key");
            this.key = key;
            this.handle = c6138l;
        }

        @Override // androidx.view.C6130D, androidx.view.AbstractC6127A
        public void o(T value) {
            T2.b bVar;
            C6138L c6138l = this.handle;
            if (c6138l != null && (bVar = c6138l.impl) != null) {
                bVar.h(this.key, value);
            }
            super.o(value);
        }

        public b(C6138L c6138l, String key) {
            Intrinsics.j(key, "key");
            this.key = key;
            this.handle = c6138l;
        }
    }

    public C6138L(Map<String, ? extends Object> initialState) {
        Intrinsics.j(initialState, "initialState");
        this.liveDatas = new LinkedHashMap();
        this.impl = new T2.b(initialState);
    }

    private final <T> C6130D<T> d(String key, boolean hasInitialValue, T initialValue) {
        b<?> bVar;
        if (this.impl.c().containsKey(key)) {
            throw new IllegalArgumentException(C6142P.b(key).toString());
        }
        Map<String, b<?>> map = this.liveDatas;
        b<?> bVar2 = map.get(key);
        if (bVar2 == null) {
            if (this.impl.d().containsKey(key)) {
                bVar = new b<>(this, key, this.impl.d().get(key));
            } else if (hasInitialValue) {
                this.impl.d().put(key, initialValue);
                bVar = new b<>(this, key, initialValue);
            } else {
                bVar = new b<>(this, key);
            }
            bVar2 = bVar;
            map.put(key, bVar2);
        }
        return bVar2;
    }

    public final <T> T b(String key) {
        Intrinsics.j(key, "key");
        return (T) this.impl.b(key);
    }

    public final <T> C6130D<T> c(String key, T initialValue) {
        Intrinsics.j(key, "key");
        return d(key, true, initialValue);
    }

    public final C18086f.b e() {
        return this.impl.getSavedStateProvider();
    }

    public final <T> void f(String key, T value) {
        Intrinsics.j(key, "key");
        if (INSTANCE.b(value)) {
            b<?> bVar = this.liveDatas.get(key);
            b<?> bVar2 = bVar instanceof C6130D ? bVar : null;
            if (bVar2 != null) {
                bVar2.o(value);
            }
            this.impl.h(key, value);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't put value with type ");
        Intrinsics.g(value);
        sb2.append(value.getClass());
        sb2.append(" into saved state");
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6138L() {
        this.liveDatas = new LinkedHashMap();
        this.impl = new T2.b(null, 1, 0 == true ? 1 : 0);
    }
}
