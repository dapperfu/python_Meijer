package kotlin.io.path;

import j$.nio.file.Path;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0010(\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0013\u001a\u0004\b\b\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lkotlin/io/path/b;", "", "j$/nio/file/Path", "path", "key", "parent", "<init>", "(Lj$/nio/file/Path;Ljava/lang/Object;Lkotlin/io/path/b;)V", "a", "Lj$/nio/file/Path;", "d", "()Lj$/nio/file/Path;", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "c", "Lkotlin/io/path/b;", "()Lkotlin/io/path/b;", "", "Ljava/util/Iterator;", "()Ljava/util/Iterator;", "e", "(Ljava/util/Iterator;)V", "contentIterator", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Path path;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object key;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b parent;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Iterator<b> contentIterator;

    public b(Path path, Object obj, b bVar) {
        Intrinsics.j(path, "path");
        this.path = path;
        this.key = obj;
        this.parent = bVar;
    }

    public final Iterator<b> a() {
        return this.contentIterator;
    }

    /* renamed from: b, reason: from getter */
    public final Object getKey() {
        return this.key;
    }

    /* renamed from: c, reason: from getter */
    public final b getParent() {
        return this.parent;
    }

    /* renamed from: d, reason: from getter */
    public final Path getPath() {
        return this.path;
    }

    public final void e(Iterator<b> it) {
        this.contentIterator = it;
    }
}
