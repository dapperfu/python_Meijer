package kw;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kw.B;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\r\b&\u0018\u0000 !2\u00060\u0001j\u0002`\u0002:\u0001!B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0006\u0010\u000e\u001a\u00020\u0005H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0005H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0005H&¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u000bH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000bH&¢\u0006\u0004\b \u0010\u001cJ\u0015\u0010!\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b!\u0010\u001eJ!\u0010#\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u000bH&¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b%\u0010$J\u0015\u0010&\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\"2\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0005H&¢\u0006\u0004\b*\u0010+J!\u0010,\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000bH&¢\u0006\u0004\b,\u0010$J\u0015\u0010-\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b-\u0010'J\u000f\u0010.\u001a\u00020\"H\u0016¢\u0006\u0004\b.\u0010\u0004¨\u0006/"}, d2 = {"Lkw/l;", "Ljava/io/Closeable;", "Lokio/Closeable;", "<init>", "()V", "Lkw/B;", "path", "Lkw/k;", "u", "(Lkw/B;)Lkw/k;", "w", "", "m", "(Lkw/B;)Z", "dir", "", "p", "(Lkw/B;)Ljava/util/List;", "file", "Lkw/j;", "z", "(Lkw/B;)Lkw/j;", "Lkw/J;", "D", "(Lkw/B;)Lkw/J;", "mustCreate", "Lkw/I;", "B", "(Lkw/B;Z)Lkw/I;", "A", "(Lkw/B;)Lkw/I;", "mustExist", "b", "a", "", "h", "(Lkw/B;Z)V", "g", "d", "(Lkw/B;)V", "source", "target", "c", "(Lkw/B;Lkw/B;)V", "l", "j", "close", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: kw.l, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC15335l implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final AbstractC15335l f148118b;

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public static final B f148119c;

    /* renamed from: d, reason: collision with root package name */
    @JvmField
    public static final AbstractC15335l f148120d;

    public abstract I B(B file, boolean mustCreate) throws IOException;

    public abstract J D(B file) throws IOException;

    public abstract I b(B file, boolean mustExist) throws IOException;

    public abstract void c(B source, B target) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public abstract void h(B dir, boolean mustCreate) throws IOException;

    public abstract void l(B path, boolean mustExist) throws IOException;

    public abstract List<B> p(B dir) throws IOException;

    public abstract C15334k w(B path) throws IOException;

    public abstract AbstractC15333j z(B file) throws IOException;

    static {
        AbstractC15335l uVar;
        try {
            Class.forName("j$.nio.file.Files");
            uVar = new v();
        } catch (ClassNotFoundException unused) {
            uVar = new u();
        }
        f148118b = uVar;
        B.Companion companion = B.INSTANCE;
        String property = System.getProperty("java.io.tmpdir");
        Intrinsics.i(property, "getProperty(...)");
        f148119c = B.Companion.e(companion, property, false, 1, null);
        ClassLoader classLoader = lw.l.class.getClassLoader();
        Intrinsics.i(classLoader, "getClassLoader(...)");
        f148120d = new lw.l(classLoader, false, null, 4, null);
    }

    public static /* synthetic */ void i(AbstractC15335l abstractC15335l, B b10, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        abstractC15335l.h(b10, z10);
    }

    public final I A(B file) throws IOException {
        Intrinsics.j(file, "file");
        return B(file, false);
    }

    public final I a(B file) throws IOException {
        Intrinsics.j(file, "file");
        return b(file, false);
    }

    public final void d(B dir) throws IOException {
        Intrinsics.j(dir, "dir");
        g(dir, false);
    }

    public final void g(B dir, boolean mustCreate) throws IOException {
        Intrinsics.j(dir, "dir");
        lw.d.a(this, dir, mustCreate);
    }

    public final void j(B path) throws IOException {
        Intrinsics.j(path, "path");
        l(path, false);
    }

    public final boolean m(B path) throws IOException {
        Intrinsics.j(path, "path");
        return lw.d.b(this, path);
    }

    public final C15334k u(B path) throws IOException {
        Intrinsics.j(path, "path");
        return lw.d.c(this, path);
    }
}
