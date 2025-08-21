package j$.desugar.sun.nio.fs;

import com.medallia.digital.mobilesdk.q2;
import j$.nio.file.AbstractC14864h;
import j$.nio.file.EnumC14854a;
import j$.nio.file.J;
import j$.nio.file.K;
import j$.nio.file.L;
import j$.nio.file.LinkOption;
import j$.nio.file.M;
import j$.nio.file.Path;
import j$.nio.file.u;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class o implements Path {

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f139170h = Pattern.compile("/+");

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC14864h f139171a;

    /* renamed from: b, reason: collision with root package name */
    public final String f139172b;

    /* renamed from: c, reason: collision with root package name */
    public final List f139173c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f139174d;

    /* renamed from: e, reason: collision with root package name */
    public final String f139175e;

    /* renamed from: f, reason: collision with root package name */
    public final String f139176f;

    /* renamed from: g, reason: collision with root package name */
    public volatile byte[] f139177g;

    public o(AbstractC14864h abstractC14864h, String str, String str2, String str3) {
        this(abstractC14864h, str.startsWith(q2.f93563c), str.isEmpty() ? Collections.singletonList("") : (List) Arrays.stream(f139170h.split(str)).filter(new n()).collect(new j$.util.stream.e(new j$.util.stream.a(), new j$.util.stream.b(), new j$.util.stream.c(), new j$.util.stream.d(), j$.util.stream.f.f139606a)), str2, str3);
    }

    public o(AbstractC14864h abstractC14864h, boolean z10, List list, String str, String str2) {
        this.f139171a = abstractC14864h;
        this.f139174d = z10;
        this.f139173c = list;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10 ? q2.f93563c : "");
        sb2.append(g.n(list));
        this.f139172b = sb2.toString();
        this.f139175e = str;
        this.f139176f = str2;
    }

    @Override // j$.nio.file.Path
    public final AbstractC14864h getFileSystem() {
        return this.f139171a;
    }

    @Override // j$.nio.file.Path
    public final Path s(LinkOption[] linkOptionArr) {
        this.f139171a.i().a(this, EnumC14854a.READ);
        if (Arrays.asList(linkOptionArr).contains(LinkOption.NOFOLLOW_LINKS)) {
            return toAbsolutePath();
        }
        return new o(this.f139171a, toFile().getCanonicalPath(), this.f139175e, this.f139176f);
    }

    @Override // j$.nio.file.Path
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final o toAbsolutePath() {
        if (this.f139174d) {
            return this;
        }
        AbstractC14864h abstractC14864h = this.f139171a;
        String str = this.f139175e;
        return new o(abstractC14864h, str, str, this.f139176f).r(this);
    }

    @Override // j$.nio.file.Path
    public final Path getRoot() {
        if (!this.f139174d) {
            return null;
        }
        AbstractC14864h abstractC14864h = this.f139171a;
        String str = this.f139176f;
        return new o(abstractC14864h, str, this.f139175e, str);
    }

    @Override // j$.nio.file.Path
    public final boolean isAbsolute() {
        return this.f139174d;
    }

    @Override // j$.nio.file.Path
    public final Path getFileName() {
        if (this.f139173c.isEmpty()) {
            if (this.f139174d) {
                return null;
            }
            return this;
        }
        return new o(this.f139171a, (String) this.f139173c.get(r2.size() - 1), this.f139175e, this.f139176f);
    }

    @Override // j$.nio.file.Path
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final o getName(int i10) {
        if (i10 < 0 || i10 >= this.f139173c.size()) {
            throw new IllegalArgumentException(String.format("Requested name for index (%d) is out of bound in \n%s.", Integer.valueOf(i10), this));
        }
        return new o(this.f139171a, (String) this.f139173c.get(i10), this.f139175e, this.f139176f);
    }

    @Override // j$.nio.file.Path
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final o getParent() {
        int size = this.f139173c.size();
        if (size == 0) {
            return null;
        }
        if (size == 1 && !this.f139174d) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f139174d) {
            sb2.append(q2.f93563c);
        }
        sb2.append(g.n(this.f139173c.subList(0, size - 1)));
        return new o(this.f139171a, sb2.toString(), this.f139175e, this.f139176f);
    }

    @Override // j$.nio.file.Path
    public final int getNameCount() {
        return this.f139173c.size();
    }

    @Override // j$.nio.file.Path
    public final Path subpath(int i10, int i11) {
        return new o(this.f139171a, g.n(this.f139173c.subList(i10, i11)), this.f139175e, this.f139176f);
    }

    @Override // j$.nio.file.Path
    public final boolean startsWith(String str) {
        return w(new o(this.f139171a, str, this.f139175e, this.f139176f));
    }

    @Override // j$.nio.file.Path
    public final boolean w(Path path) {
        int nameCount;
        Objects.requireNonNull(path);
        if (!(path instanceof o) || this.f139174d != path.isAbsolute() || this.f139173c.size() < (nameCount = path.getNameCount())) {
            return false;
        }
        for (int i10 = 0; i10 < nameCount; i10++) {
            if (!getName(i10).equals(path.getName(i10))) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.nio.file.Path
    public final boolean endsWith(String str) {
        return z(new o(this.f139171a, str, this.f139175e, this.f139176f));
    }

    @Override // j$.nio.file.Path
    public final boolean z(Path path) {
        Objects.requireNonNull(path);
        if (!(path instanceof o)) {
            return false;
        }
        if (path.isAbsolute()) {
            return equals(path);
        }
        int nameCount = path.getNameCount();
        if (this.f139173c.size() < nameCount) {
            return false;
        }
        int size = this.f139173c.size();
        for (int i10 = nameCount - 1; i10 >= 0; i10--) {
            if (!getName((i10 - nameCount) + size).equals(path.getName(i10))) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.nio.file.Path
    public final boolean equals(Object obj) {
        return (obj instanceof o) && compareTo((o) obj) == 0;
    }

    public final int hashCode() {
        return this.f139172b.hashCode();
    }

    @Override // j$.nio.file.Path, java.lang.Comparable
    /* renamed from: u */
    public final int compareTo(Path path) {
        return this.f139172b.compareTo(((o) path).f139172b);
    }

    @Override // j$.nio.file.Path
    public final Path normalize() {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (String str : this.f139173c) {
            str.getClass();
            if (!str.equals(".")) {
                if (str.equals("..")) {
                    arrayDeque.removeLast();
                } else {
                    arrayDeque.add(str);
                }
            }
        }
        AbstractC14864h abstractC14864h = this.f139171a;
        boolean z10 = this.f139174d;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10 ? q2.f93563c : "");
        sb2.append(g.n(arrayDeque));
        return new o(abstractC14864h, sb2.toString(), this.f139175e, this.f139176f);
    }

    @Override // j$.nio.file.Path
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final o r(Path path) {
        if (path instanceof o) {
            if (((o) path).f139174d) {
                return (o) path;
            }
            return new o(this.f139171a, this.f139172b + q2.f93563c + path, this.f139175e, this.f139176f);
        }
        throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
    }

    @Override // j$.nio.file.Path
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final o B(Path path) {
        Objects.requireNonNull(path);
        if (!(path instanceof o)) {
            throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        o parent = getParent();
        return parent == null ? (o) path : parent.r(path);
    }

    @Override // j$.nio.file.Path
    public final Path resolveSibling(String str) {
        return B(new o(this.f139171a, str, this.f139175e, this.f139176f));
    }

    @Override // j$.nio.file.Path
    public final Path J(Path path) {
        if (path instanceof o) {
            if (this.f139174d != ((o) path).f139174d) {
                throw new IllegalArgumentException("'other' is different type of Path in absolute property.");
            }
            List list = ((o) path).f139173c;
            int size = this.f139173c.size();
            int size2 = list.size();
            int i10 = 0;
            while (i10 < size && i10 < size2 && ((String) this.f139173c.get(i10)).equals(list.get(i10))) {
                i10++;
            }
            ArrayList arrayList = new ArrayList();
            for (int i11 = i10; i11 < size; i11++) {
                arrayList.add("..");
            }
            while (i10 < size2) {
                arrayList.add((String) list.get(i10));
                i10++;
            }
            return new o(this.f139171a, false, arrayList, this.f139175e, this.f139176f);
        }
        throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
    }

    @Override // j$.nio.file.Path
    public final File toFile() {
        return new File(this.f139172b);
    }

    @Override // j$.nio.file.Path
    public final URI toUri() {
        char[] cArr = p.f139180c;
        o absolutePath = toAbsolutePath();
        if (absolutePath.f139177g == null) {
            absolutePath.f139177g = absolutePath.f139172b.getBytes(q.f139181a);
        }
        byte[] bArr = absolutePath.f139177g;
        StringBuilder sb2 = new StringBuilder("file:///");
        for (int i10 = 1; i10 < bArr.length; i10++) {
            char c10 = (char) (bArr[i10] & 255);
            long j10 = p.f139178a;
            long j11 = p.f139179b;
            if (c10 >= '@' ? !(c10 >= 128 || ((1 << (c10 - '@')) & j11) == 0) : (j10 & (1 << c10)) != 0) {
                sb2.append(c10);
            } else {
                sb2.append('%');
                char[] cArr2 = p.f139180c;
                sb2.append(cArr2[(c10 >> 4) & 15]);
                sb2.append(cArr2[c10 & 15]);
            }
        }
        if (sb2.charAt(sb2.length() - 1) != '/' && toFile().isDirectory()) {
            sb2.append('/');
        }
        try {
            return new URI(sb2.toString());
        } catch (URISyntaxException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // j$.nio.file.Path
    public final String toString() {
        return this.f139172b;
    }

    @Override // j$.nio.file.Path
    public final L p(M m10, J[] jArr, K... kArr) {
        throw new UnsupportedOperationException("Watch Service is not supported");
    }

    @Override // j$.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new u(this);
    }
}
