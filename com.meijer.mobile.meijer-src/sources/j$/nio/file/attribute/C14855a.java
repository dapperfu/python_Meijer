package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.AclFileAttributeView;

/* renamed from: j$.nio.file.attribute.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C14855a implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AclFileAttributeView f139211a;

    @Override // j$.nio.file.attribute.r
    public final /* synthetic */ void b(A a10) throws IOException {
        this.f139211a.setOwner(z.a(a10));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AclFileAttributeView aclFileAttributeView = this.f139211a;
        if (obj instanceof C14855a) {
            obj = ((C14855a) obj).f139211a;
        }
        return aclFileAttributeView.equals(obj);
    }

    @Override // j$.nio.file.attribute.r
    public final /* synthetic */ A getOwner() {
        return y.a(this.f139211a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.f139211a.hashCode();
    }

    @Override // j$.nio.file.attribute.o
    public final /* synthetic */ String name() {
        return this.f139211a.name();
    }
}
