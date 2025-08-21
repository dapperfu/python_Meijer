package gw;

import com.medallia.digital.mobilesdk.q2;
import gw.B;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 62\u00020\u0001:\u00017B7\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u0010H\u0016¢\u0006\u0004\b&\u0010$J\u001f\u0010(\u001a\u00020'2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020'2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0002H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020'2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u0010H\u0016¢\u0006\u0004\b.\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00105¨\u00068"}, d2 = {"Lgw/N;", "Lgw/l;", "Lgw/B;", "zipPath", "fileSystem", "", "Lhw/n;", "entries", "", "comment", "<init>", "(Lgw/B;Lgw/l;Ljava/util/Map;Ljava/lang/String;)V", "path", "H", "(Lgw/B;)Lgw/B;", "dir", "", "throwOnFailure", "", "J", "(Lgw/B;Z)Ljava/util/List;", "Lgw/k;", "w", "(Lgw/B;)Lgw/k;", "file", "Lgw/j;", "z", "(Lgw/B;)Lgw/j;", "p", "(Lgw/B;)Ljava/util/List;", "Lgw/K;", "D", "(Lgw/B;)Lgw/K;", "mustCreate", "Lgw/J;", "B", "(Lgw/B;Z)Lgw/J;", "mustExist", "b", "", "h", "(Lgw/B;Z)V", "source", "target", "c", "(Lgw/B;Lgw/B;)V", "l", "e", "Lgw/B;", "f", "Lgw/l;", "g", "Ljava/util/Map;", "Ljava/lang/String;", "i", "a", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class N extends AbstractC14423l {

    /* renamed from: i, reason: collision with root package name */
    private static final a f134522i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    private static final B f134523j = B.Companion.e(B.INSTANCE, q2.f93563c, false, 1, null);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final B zipPath;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14423l fileSystem;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Map<B, hw.n> entries;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String comment;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgw/N$a;", "", "<init>", "()V", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public N(B zipPath, AbstractC14423l fileSystem, Map<B, hw.n> entries, String str) {
        Intrinsics.j(zipPath, "zipPath");
        Intrinsics.j(fileSystem, "fileSystem");
        Intrinsics.j(entries, "entries");
        this.zipPath = zipPath;
        this.fileSystem = fileSystem;
        this.entries = entries;
        this.comment = str;
    }

    private final B H(B path) {
        return f134523j.u(path, true);
    }

    @Override // gw.AbstractC14423l
    public J B(B file, boolean mustCreate) throws IOException {
        Intrinsics.j(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // gw.AbstractC14423l
    public K D(B file) throws IOException {
        Intrinsics.j(file, "file");
        hw.n nVar = this.entries.get(H(file));
        if (nVar == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        AbstractC14421j abstractC14421jZ = this.fileSystem.z(this.zipPath);
        InterfaceC14418g th2 = null;
        try {
            InterfaceC14418g interfaceC14418gC = w.c(abstractC14421jZ.m(nVar.getOffset()));
            if (abstractC14421jZ != null) {
                try {
                    abstractC14421jZ.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            th = th2;
            th2 = interfaceC14418gC;
        } catch (Throwable th4) {
            th = th4;
            if (abstractC14421jZ != null) {
                try {
                    abstractC14421jZ.close();
                } catch (Throwable th5) {
                    ExceptionsKt.a(th, th5);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        hw.r.r(th2);
        return nVar.getCompressionMethod() == 0 ? new hw.i(th2, nVar.getSize(), true) : new hw.i(new r(new hw.i(th2, nVar.getCompressedSize(), true), new Inflater(true)), nVar.getSize(), false);
    }

    @Override // gw.AbstractC14423l
    public J b(B file, boolean mustExist) throws IOException {
        Intrinsics.j(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // gw.AbstractC14423l
    public void c(B source, B target) throws IOException {
        Intrinsics.j(source, "source");
        Intrinsics.j(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // gw.AbstractC14423l
    public void h(B dir, boolean mustCreate) throws IOException {
        Intrinsics.j(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // gw.AbstractC14423l
    public void l(B path, boolean mustExist) throws IOException {
        Intrinsics.j(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // gw.AbstractC14423l
    public List<B> p(B dir) throws IOException {
        Intrinsics.j(dir, "dir");
        List<B> listJ = J(dir, true);
        Intrinsics.g(listJ);
        return listJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f A[Catch: all -> 0x004e, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x004e, blocks: (B:8:0x0027, B:34:0x005f, B:22:0x004a, B:9:0x0033, B:19:0x0045), top: B:60:0x0027, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    @Override // gw.AbstractC14423l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public gw.C14422k w(gw.B r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.j(r14, r0)
            gw.B r14 = r13.H(r14)
            java.util.Map<gw.B, hw.n> r0 = r13.entries
            java.lang.Object r14 = r0.get(r14)
            hw.n r14 = (hw.n) r14
            r1 = 0
            if (r14 != 0) goto L15
            return r1
        L15:
            long r2 = r14.getOffset()
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L70
            gw.l r0 = r13.fileSystem
            gw.B r2 = r13.zipPath
            gw.j r2 = r0.z(r2)
            long r3 = r14.getOffset()     // Catch: java.lang.Throwable -> L4e
            gw.K r0 = r2.m(r3)     // Catch: java.lang.Throwable -> L4e
            gw.g r3 = gw.w.c(r0)     // Catch: java.lang.Throwable -> L4e
            hw.n r14 = hw.r.n(r3, r14)     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L3f
            r3.close()     // Catch: java.lang.Throwable -> L3d
            goto L3f
        L3d:
            r0 = move-exception
            goto L53
        L3f:
            r0 = r1
            goto L53
        L41:
            r0 = move-exception
            r14 = r0
            if (r3 == 0) goto L51
            r3.close()     // Catch: java.lang.Throwable -> L49
            goto L51
        L49:
            r0 = move-exception
            kotlin.ExceptionsKt.a(r14, r0)     // Catch: java.lang.Throwable -> L4e
            goto L51
        L4e:
            r0 = move-exception
            r14 = r0
            goto L60
        L51:
            r0 = r14
            r14 = r1
        L53:
            if (r0 != 0) goto L5f
            if (r2 == 0) goto L5d
            r2.close()     // Catch: java.lang.Throwable -> L5b
            goto L5d
        L5b:
            r0 = move-exception
            goto L6c
        L5d:
            r0 = r1
            goto L6c
        L5f:
            throw r0     // Catch: java.lang.Throwable -> L4e
        L60:
            if (r2 == 0) goto L6a
            r2.close()     // Catch: java.lang.Throwable -> L66
            goto L6a
        L66:
            r0 = move-exception
            kotlin.ExceptionsKt.a(r14, r0)
        L6a:
            r0 = r14
            r14 = r1
        L6c:
            if (r0 != 0) goto L6f
            goto L70
        L6f:
            throw r0
        L70:
            gw.k r2 = new gw.k
            boolean r0 = r14.getIsDirectory()
            r3 = r0 ^ 1
            boolean r4 = r14.getIsDirectory()
            boolean r0 = r14.getIsDirectory()
            if (r0 == 0) goto L84
        L82:
            r6 = r1
            goto L8d
        L84:
            long r0 = r14.getSize()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            goto L82
        L8d:
            java.lang.Long r7 = r14.f()
            java.lang.Long r8 = r14.h()
            java.lang.Long r9 = r14.g()
            r11 = 128(0x80, float:1.8E-43)
            r12 = 0
            r5 = 0
            r10 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: gw.N.w(gw.B):gw.k");
    }

    @Override // gw.AbstractC14423l
    public AbstractC14421j z(B file) {
        Intrinsics.j(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    private final List<B> J(B dir, boolean throwOnFailure) throws IOException {
        hw.n nVar = this.entries.get(H(dir));
        if (nVar == null) {
            if (!throwOnFailure) {
                return null;
            }
            throw new IOException("not a directory: " + dir);
        }
        return CollectionsKt.j1(nVar.c());
    }
}
