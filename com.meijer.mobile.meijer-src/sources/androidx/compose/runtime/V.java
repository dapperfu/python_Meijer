package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B3\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/V;", "", "", "key", "objectKey", "location", "nodes", "index", "<init>", "(ILjava/lang/Object;III)V", "a", "I", "()I", "b", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "c", "e", "getIndex", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int key;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object objectKey;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int location;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int nodes;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* renamed from: a, reason: from getter */
    public final int getKey() {
        return this.key;
    }

    /* renamed from: b, reason: from getter */
    public final int getLocation() {
        return this.location;
    }

    /* renamed from: c, reason: from getter */
    public final int getNodes() {
        return this.nodes;
    }

    /* renamed from: d, reason: from getter */
    public final Object getObjectKey() {
        return this.objectKey;
    }

    public V(int i10, Object obj, int i11, int i12, int i13) {
        this.key = i10;
        this.objectKey = obj;
        this.location = i11;
        this.nodes = i12;
        this.index = i13;
    }
}
