package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class l implements FileAttribute {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f138631a;

    public l(k kVar) {
        this.f138631a = kVar;
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final String name() {
        return "posix:permissions";
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final Object value() {
        return Collections.unmodifiableSet(j$.desugar.sun.nio.fs.g.l((Set) this.f138631a.value()));
    }
}
