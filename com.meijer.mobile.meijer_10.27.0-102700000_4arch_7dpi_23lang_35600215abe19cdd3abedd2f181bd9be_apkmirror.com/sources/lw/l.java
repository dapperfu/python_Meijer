package lw;

import com.fullstory.FS;
import com.medallia.digital.mobilesdk.q2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kw.AbstractC15333j;
import kw.AbstractC15335l;
import kw.B;
import kw.C15334k;
import kw.I;
import kw.J;
import kw.w;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001<B#\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\u00110\u0010*\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011*\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\u0006\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b*\u0010(J\u001f\u0010,\u001a\u00020+2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020+2\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\tH\u0016¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020+2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0006\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R-\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\u00110\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006="}, d2 = {"Llw/l;", "Lkw/l;", "Ljava/lang/ClassLoader;", "classLoader", "", "indexEagerly", "systemFileSystem", "<init>", "(Ljava/lang/ClassLoader;ZLkw/l;)V", "Lkw/B;", "path", "O", "(Lkw/B;)Lkw/B;", "", "i0", "(Lkw/B;)Ljava/lang/String;", "", "Lkotlin/Pair;", "Z", "(Ljava/lang/ClassLoader;)Ljava/util/List;", "Ljava/net/URL;", "c0", "(Ljava/net/URL;)Lkotlin/Pair;", "e0", "dir", "p", "(Lkw/B;)Ljava/util/List;", "file", "Lkw/j;", "z", "(Lkw/B;)Lkw/j;", "Lkw/k;", "w", "(Lkw/B;)Lkw/k;", "Lkw/J;", "D", "(Lkw/B;)Lkw/J;", "mustCreate", "Lkw/I;", "B", "(Lkw/B;Z)Lkw/I;", "mustExist", "b", "", "h", "(Lkw/B;Z)V", "source", "target", "c", "(Lkw/B;Lkw/B;)V", "l", "e", "Ljava/lang/ClassLoader;", "f", "Lkw/l;", "g", "Lkotlin/Lazy;", "R", "()Ljava/util/List;", "roots", "a", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class l extends AbstractC15335l {

    /* renamed from: h, reason: collision with root package name */
    private static final a f149459h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    private static final B f149460i = B.Companion.e(B.INSTANCE, q2.f92724c, false, 1, null);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ClassLoader classLoader;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15335l systemFileSystem;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Lazy roots;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Llw/l$a;", "", "<init>", "()V", "Lkw/B;", "path", "", "c", "(Lkw/B;)Z", "base", "d", "(Lkw/B;Lkw/B;)Lkw/B;", "ROOT", "Lkw/B;", "b", "()Lkw/B;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }

        public final B d(B b10, B base) {
            Intrinsics.j(b10, "<this>");
            Intrinsics.j(base, "base");
            return b().u(StringsKt.P(StringsKt.J0(b10.toString(), base.toString()), '\\', '/', false, 4, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean c(B path) {
            return !StringsKt.F(path.m(), ".class", true);
        }

        public final B b() {
            return l.f149460i;
        }
    }

    public /* synthetic */ l(ClassLoader classLoader, boolean z10, AbstractC15335l abstractC15335l, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(classLoader, z10, (i10 & 4) != 0 ? AbstractC15335l.f148118b : abstractC15335l);
    }

    private final B O(B path) {
        return f149460i.w(path, true);
    }

    private final List<Pair<AbstractC15335l, B>> R() {
        return (List) this.roots.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List T(l lVar) {
        return lVar.Z(lVar.classLoader);
    }

    private final List<Pair<AbstractC15335l, B>> Z(ClassLoader classLoader) throws IOException {
        Enumeration<URL> resources = classLoader.getResources("");
        Intrinsics.i(resources, "getResources(...)");
        ArrayList<URL> list = Collections.list(resources);
        Intrinsics.i(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            Intrinsics.g(url);
            Pair<AbstractC15335l, B> pairC0 = c0(url);
            if (pairC0 != null) {
                arrayList.add(pairC0);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        Intrinsics.i(resources2, "getResources(...)");
        ArrayList<URL> list2 = Collections.list(resources2);
        Intrinsics.i(list2, "list(...)");
        ArrayList arrayList2 = new ArrayList();
        for (URL url2 : list2) {
            Intrinsics.g(url2);
            Pair<AbstractC15335l, B> pairE0 = e0(url2);
            if (pairE0 != null) {
                arrayList2.add(pairE0);
            }
        }
        return CollectionsKt.P0(arrayList, arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h0(n entry) {
        Intrinsics.j(entry, "entry");
        return f149459h.c(entry.getCanonicalPath());
    }

    @Override // kw.AbstractC15335l
    public I B(B file, boolean mustCreate) throws IOException {
        Intrinsics.j(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // kw.AbstractC15335l
    public J D(B file) throws IOException {
        Intrinsics.j(file, "file");
        if (!f149459h.c(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        B b10 = f149460i;
        URL resource = this.classLoader.getResource(B.z(b10, file, false, 2, null).t(b10).toString());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + file);
        }
        URLConnection uRLConnectionUrlconnection_wrapInstance = FS.urlconnection_wrapInstance(resource.openConnection());
        if (uRLConnectionUrlconnection_wrapInstance instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionUrlconnection_wrapInstance).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionUrlconnection_wrapInstance.getInputStream();
        Intrinsics.i(inputStream, "getInputStream(...)");
        return w.k(inputStream);
    }

    @Override // kw.AbstractC15335l
    public I b(B file, boolean mustExist) throws IOException {
        Intrinsics.j(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // kw.AbstractC15335l
    public void c(B source, B target) throws IOException {
        Intrinsics.j(source, "source");
        Intrinsics.j(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // kw.AbstractC15335l
    public void h(B dir, boolean mustCreate) throws IOException {
        Intrinsics.j(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // kw.AbstractC15335l
    public void l(B path, boolean mustExist) throws IOException {
        Intrinsics.j(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // kw.AbstractC15335l
    public List<B> p(B dir) throws FileNotFoundException {
        Intrinsics.j(dir, "dir");
        String strI0 = i0(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (Pair<AbstractC15335l, B> pair : R()) {
            AbstractC15335l abstractC15335lA = pair.a();
            B b10 = pair.b();
            try {
                List<B> listP = abstractC15335lA.p(b10.u(strI0));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listP) {
                    if (f149459h.c((B) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.x(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(f149459h.d((B) it.next(), b10));
                }
                CollectionsKt.C(linkedHashSet, arrayList2);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return CollectionsKt.j1(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + dir);
    }

    @Override // kw.AbstractC15335l
    public C15334k w(B path) throws IOException {
        Intrinsics.j(path, "path");
        if (!f149459h.c(path)) {
            return null;
        }
        String strI0 = i0(path);
        for (Pair<AbstractC15335l, B> pair : R()) {
            C15334k c15334kW = pair.a().w(pair.b().u(strI0));
            if (c15334kW != null) {
                return c15334kW;
            }
        }
        return null;
    }

    @Override // kw.AbstractC15335l
    public AbstractC15333j z(B file) throws FileNotFoundException {
        Intrinsics.j(file, "file");
        if (!f149459h.c(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        String strI0 = i0(file);
        for (Pair<AbstractC15335l, B> pair : R()) {
            try {
                return pair.a().z(pair.b().u(strI0));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    public l(ClassLoader classLoader, boolean z10, AbstractC15335l systemFileSystem) {
        Intrinsics.j(classLoader, "classLoader");
        Intrinsics.j(systemFileSystem, "systemFileSystem");
        this.classLoader = classLoader;
        this.systemFileSystem = systemFileSystem;
        this.roots = LazyKt.b(new Function0() { // from class: lw.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l.T(this.f149458a);
            }
        });
        if (z10) {
            R().size();
        }
    }

    private final Pair<AbstractC15335l, B> c0(URL url) {
        if (!Intrinsics.e(url.getProtocol(), "file")) {
            return null;
        }
        return TuplesKt.a(this.systemFileSystem, B.Companion.d(B.INSTANCE, new File(url.toURI()), false, 1, null));
    }

    private final Pair<AbstractC15335l, B> e0(URL url) {
        int iW0;
        String string = url.toString();
        Intrinsics.i(string, "toString(...)");
        if (!StringsKt.W(string, "jar:file:", false, 2, null) || (iW0 = StringsKt.w0(string, "!", 0, false, 6, null)) == -1) {
            return null;
        }
        B.Companion companion = B.INSTANCE;
        String strSubstring = string.substring(4, iW0);
        Intrinsics.i(strSubstring, "substring(...)");
        return TuplesKt.a(r.h(B.Companion.d(companion, new File(URI.create(strSubstring)), false, 1, null), this.systemFileSystem, new Function1() { // from class: lw.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(l.h0((n) obj));
            }
        }), f149460i);
    }

    private final String i0(B b10) {
        return O(b10).t(f149460i).toString();
    }
}
