package j$.desugar.sun.nio.fs;

import j$.nio.file.D;
import j$.nio.file.Path;
import java.nio.file.DirectoryStream;
import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements D, DirectoryStream.Filter, j$.nio.file.attribute.k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f138568a;

    public /* synthetic */ h(Object obj) {
        this.f138568a = obj;
    }

    @Override // j$.nio.file.attribute.k
    public String name() {
        return "posix:permissions";
    }

    @Override // j$.nio.file.attribute.k
    public Object value() {
        return Collections.unmodifiableSet(g.l((Set) ((FileAttribute) this.f138568a).value()));
    }

    @Override // java.nio.file.DirectoryStream.Filter
    public boolean accept(Object obj) {
        return ((DirectoryStream.Filter) this.f138568a).accept(g.f(obj));
    }

    @Override // j$.nio.file.D
    public boolean a(Path path) {
        return ((Pattern) this.f138568a).matcher(path.toString()).matches();
    }
}
