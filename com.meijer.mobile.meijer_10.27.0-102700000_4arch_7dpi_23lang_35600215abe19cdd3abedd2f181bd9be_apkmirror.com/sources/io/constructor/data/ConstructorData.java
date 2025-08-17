package io.constructor.data;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001c*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001cB)\b\u0002\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u000f\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0007J\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u0018J \u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\u0018J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0002X\u0083\u0004¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u001d"}, d2 = {"Lio/constructor/data/ConstructorData;", "V", "", "value", "error", "", "networkError", "", "(Ljava/lang/Object;Ljava/lang/Throwable;Z)V", "isEmpty", "()Z", "isError", "getNetworkError", "setNetworkError", "(Z)V", "Ljava/lang/Object;", "get", "()Ljava/lang/Object;", "hasValue", "onEmpty", "action", "Lkotlin/Function0;", "", "onError", "Lkotlin/Function1;", "onValue", "toString", "", "Companion", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class ConstructorData<V> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Throwable error;
    private boolean networkError;
    private final V value;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004J\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u0005J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u001d\u0010\r\u001a\u0004\u0018\u0001H\u0005\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u000e\u001a\u0002H\u0005H\u0002¢\u0006\u0002\u0010\u000fJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\b\u0001\u0010\u000e\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/constructor/data/ConstructorData$Companion;", "", "()V", "asError", "Lio/constructor/data/ConstructorData;", "V", "data", "empty", "error", "", "networkError", "msg", "", "nullIfEmptyCollection", "value", "(Ljava/lang/Object;)Ljava/lang/Object;", "of", "(Ljava/lang/Object;)Lio/constructor/data/ConstructorData;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final <V> V nullIfEmptyCollection(V value) {
            if ((value instanceof Collection) && ((Collection) value).isEmpty()) {
                return null;
            }
            return value;
        }

        public final <V> ConstructorData<V> asError(ConstructorData<V> data) {
            Intrinsics.j(data, "data");
            return error(((ConstructorData) data).error);
        }

        public final <V> ConstructorData<V> empty() {
            return new ConstructorData<>(null, null, false, 4, null);
        }

        public final <V> ConstructorData<V> error(Throwable error) {
            return new ConstructorData<>(null, error, false, 4, null);
        }

        public final <V> ConstructorData<V> networkError(String msg) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new ConstructorData<>(defaultConstructorMarker, new Exception(msg), true, defaultConstructorMarker);
        }

        public final <V> ConstructorData<V> of(V value) {
            return new ConstructorData<>(nullIfEmptyCollection(value), null, false, 4, null);
        }
    }

    public /* synthetic */ ConstructorData(Object obj, Throwable th2, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, th2, z10);
    }

    private ConstructorData(V v10, Throwable th2, boolean z10) {
        this.value = v10;
        this.error = th2;
        this.networkError = z10;
    }

    /* renamed from: error, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    public final V get() {
        return this.value;
    }

    public final boolean getNetworkError() {
        return this.networkError;
    }

    public final boolean hasValue() {
        return this.value != null;
    }

    public final boolean isEmpty() {
        return this.value == null && this.error == null;
    }

    public final boolean isError() {
        return this.error != null;
    }

    public final ConstructorData<V> onEmpty(Function0<Unit> action) {
        Intrinsics.j(action, "action");
        if (isEmpty()) {
            action.invoke();
        }
        return this;
    }

    public final ConstructorData<V> onError(Function1<? super Throwable, Unit> action) {
        Intrinsics.j(action, "action");
        Throwable th2 = this.error;
        if (th2 != null) {
            action.invoke(th2);
        }
        return this;
    }

    public final ConstructorData<V> onValue(Function1<? super V, Unit> action) {
        Intrinsics.j(action, "action");
        V v10 = this.value;
        if (v10 != null) {
            action.invoke(v10);
        }
        return this;
    }

    public final void setNetworkError(boolean z10) {
        this.networkError = z10;
    }

    public String toString() {
        return "Data{value=" + this.value + ", error=" + this.error + "}";
    }

    /* synthetic */ ConstructorData(Object obj, Throwable th2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, th2, (i10 & 4) != 0 ? false : z10);
    }
}
