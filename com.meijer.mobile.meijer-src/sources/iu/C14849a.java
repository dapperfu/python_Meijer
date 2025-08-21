package iu;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u00060\u0003j\u0002`\u00042\u00060\u0005j\u0002`\u0006B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R&\u0010\b\u001a\u0014\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u00000\u0013j\u0002`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Liu/a;", "T", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Ljava/io/Serializable;", "Lcom/squareup/wire/internal/Serializable;", "", "list", "<init>", "(Ljava/util/List;)V", "", "index", "get", "(I)Ljava/lang/Object;", "", "", "toArray", "()[Ljava/lang/Object;", "Ljava/util/ArrayList;", "kotlin.jvm.PlatformType", "Lkotlin/collections/ArrayList;", "b", "Ljava/util/ArrayList;", "f", "()I", "size", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: iu.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14849a<T> extends AbstractList<T> implements RandomAccess, Serializable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<T> list;

    public C14849a(List<? extends T> list) {
        Intrinsics.j(list, "list");
        this.list = new ArrayList<>(list);
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: f */
    public int get_size() {
        return this.list.size();
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public T get(int index) {
        return this.list.get(index);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return this.list.toArray(new Object[0]);
    }
}
