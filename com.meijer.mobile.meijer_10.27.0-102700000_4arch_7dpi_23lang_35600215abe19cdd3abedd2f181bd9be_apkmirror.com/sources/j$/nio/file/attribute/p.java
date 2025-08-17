package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.FileOwnerAttributeView;

/* loaded from: classes3.dex */
public final /* synthetic */ class p implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FileOwnerAttributeView f138634a;

    @Override // j$.nio.file.attribute.r
    public final /* synthetic */ void b(A a10) throws IOException {
        this.f138634a.setOwner(z.a(a10));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileOwnerAttributeView fileOwnerAttributeView = this.f138634a;
        if (obj instanceof p) {
            obj = ((p) obj).f138634a;
        }
        return fileOwnerAttributeView.equals(obj);
    }

    @Override // j$.nio.file.attribute.r
    public final /* synthetic */ A getOwner() {
        return y.a(this.f138634a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.f138634a.hashCode();
    }

    @Override // j$.nio.file.attribute.o
    public final /* synthetic */ String name() {
        return this.f138634a.name();
    }
}
