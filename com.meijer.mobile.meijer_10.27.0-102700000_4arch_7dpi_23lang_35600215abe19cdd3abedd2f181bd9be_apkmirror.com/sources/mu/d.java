package mu;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableList;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\u00060\u0005j\u0002`\u0006J\u0018\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\nR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001c¨\u0006\u001e"}, d2 = {"Lmu/d;", "T", "Lkotlin/collections/AbstractMutableList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Ljava/io/Serializable;", "Lcom/squareup/wire/internal/Serializable;", "", "index", "get", "(I)Ljava/lang/Object;", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "add", "(ILjava/lang/Object;)V", "f", "", "a", "Ljava/util/List;", "immutableList", "b", "h", "()Ljava/util/List;", "setMutableList$wire_runtime", "(Ljava/util/List;)V", "mutableList", "()I", "size", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d<T> extends AbstractMutableList<T> implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<T> immutableList;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private List<? extends T> mutableList;

    @Override // kotlin.collections.AbstractMutableList
    public int a() {
        return this.mutableList.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int index, T element) {
        if (this.mutableList == this.immutableList) {
            this.mutableList = new ArrayList(this.immutableList);
        }
        List<? extends T> list = this.mutableList;
        Intrinsics.h(list, "null cannot be cast to non-null type java.util.ArrayList<T of com.squareup.wire.internal.MutableOnWriteList>");
        ((ArrayList) list).add(index, element);
    }

    @Override // kotlin.collections.AbstractMutableList
    public T f(int index) {
        if (this.mutableList == this.immutableList) {
            this.mutableList = new ArrayList(this.immutableList);
        }
        List<? extends T> list = this.mutableList;
        Intrinsics.h(list, "null cannot be cast to non-null type java.util.ArrayList<T of com.squareup.wire.internal.MutableOnWriteList>");
        return (T) ((ArrayList) list).remove(index);
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int index) {
        return this.mutableList.get(index);
    }

    public final List<T> h() {
        return this.mutableList;
    }

    @Override // java.util.AbstractList, java.util.List
    public T set(int index, T element) {
        if (this.mutableList == this.immutableList) {
            this.mutableList = new ArrayList(this.immutableList);
        }
        List<? extends T> list = this.mutableList;
        Intrinsics.h(list, "null cannot be cast to non-null type java.util.ArrayList<T of com.squareup.wire.internal.MutableOnWriteList>");
        return (T) ((ArrayList) list).set(index, element);
    }
}
