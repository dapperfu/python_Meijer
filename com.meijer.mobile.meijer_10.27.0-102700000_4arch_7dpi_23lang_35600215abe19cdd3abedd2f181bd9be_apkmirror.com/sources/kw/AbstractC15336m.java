package kw;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\"\u0010 J\u001f\u0010$\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020#2\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020#2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b*\u0010%J\u000f\u0010+\u001a\u00020#H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0007H\u0016¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0002\u001a\u00020\u00018G¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b\u0002\u00101¨\u00062"}, d2 = {"Lkw/m;", "Lkw/l;", "delegate", "<init>", "(Lkw/l;)V", "Lkw/B;", "path", "", "functionName", "parameterName", "H", "(Lkw/B;Ljava/lang/String;Ljava/lang/String;)Lkw/B;", "J", "(Lkw/B;Ljava/lang/String;)Lkw/B;", "Lkw/k;", "w", "(Lkw/B;)Lkw/k;", "dir", "", "p", "(Lkw/B;)Ljava/util/List;", "file", "Lkw/j;", "z", "(Lkw/B;)Lkw/j;", "Lkw/J;", "D", "(Lkw/B;)Lkw/J;", "", "mustCreate", "Lkw/I;", "B", "(Lkw/B;Z)Lkw/I;", "mustExist", "b", "", "h", "(Lkw/B;Z)V", "source", "target", "c", "(Lkw/B;Lkw/B;)V", "l", "close", "()V", "toString", "()Ljava/lang/String;", "e", "Lkw/l;", "()Lkw/l;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: kw.m, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC15336m extends AbstractC15335l {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15335l delegate;

    public B H(B path, String functionName, String parameterName) {
        Intrinsics.j(path, "path");
        Intrinsics.j(functionName, "functionName");
        Intrinsics.j(parameterName, "parameterName");
        return path;
    }

    public B J(B path, String functionName) {
        Intrinsics.j(path, "path");
        Intrinsics.j(functionName, "functionName");
        return path;
    }

    public AbstractC15336m(AbstractC15335l delegate) {
        Intrinsics.j(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // kw.AbstractC15335l
    public I B(B file, boolean mustCreate) throws IOException {
        Intrinsics.j(file, "file");
        return this.delegate.B(H(file, "sink", "file"), mustCreate);
    }

    @Override // kw.AbstractC15335l
    public J D(B file) throws IOException {
        Intrinsics.j(file, "file");
        return this.delegate.D(H(file, "source", "file"));
    }

    @Override // kw.AbstractC15335l
    public I b(B file, boolean mustExist) throws IOException {
        Intrinsics.j(file, "file");
        return this.delegate.b(H(file, "appendingSink", "file"), mustExist);
    }

    @Override // kw.AbstractC15335l
    public void c(B source, B target) throws IOException {
        Intrinsics.j(source, "source");
        Intrinsics.j(target, "target");
        this.delegate.c(H(source, "atomicMove", "source"), H(target, "atomicMove", "target"));
    }

    @Override // kw.AbstractC15335l, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // kw.AbstractC15335l
    public void h(B dir, boolean mustCreate) throws IOException {
        Intrinsics.j(dir, "dir");
        this.delegate.h(H(dir, "createDirectory", "dir"), mustCreate);
    }

    @Override // kw.AbstractC15335l
    public void l(B path, boolean mustExist) throws IOException {
        Intrinsics.j(path, "path");
        this.delegate.l(H(path, "delete", "path"), mustExist);
    }

    @Override // kw.AbstractC15335l
    public List<B> p(B dir) throws IOException {
        Intrinsics.j(dir, "dir");
        List<B> listP = this.delegate.p(H(dir, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(J((B) it.next(), "list"));
        }
        CollectionsKt.A(arrayList);
        return arrayList;
    }

    public String toString() {
        return Reflection.b(getClass()).u() + '(' + this.delegate + ')';
    }

    @Override // kw.AbstractC15335l
    public C15334k w(B path) throws IOException {
        Intrinsics.j(path, "path");
        C15334k c15334kW = this.delegate.w(H(path, "metadataOrNull", "path"));
        if (c15334kW == null) {
            return null;
        }
        return c15334kW.getSymlinkTarget() == null ? c15334kW : C15334k.b(c15334kW, false, false, J(c15334kW.getSymlinkTarget(), "metadataOrNull"), null, null, null, null, null, 251, null);
    }

    @Override // kw.AbstractC15335l
    public AbstractC15333j z(B file) throws IOException {
        Intrinsics.j(file, "file");
        return this.delegate.z(H(file, "openReadOnly", "file"));
    }
}
