package j$.nio.file.attribute;

import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;

/* loaded from: classes3.dex */
public final /* synthetic */ class q implements FileOwnerAttributeView {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f138635a;

    public final /* synthetic */ boolean equals(Object obj) {
        r rVar = this.f138635a;
        if (obj instanceof q) {
            obj = ((q) obj).f138635a;
        }
        return rVar.equals(obj);
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ UserPrincipal getOwner() {
        return z.a(this.f138635a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.f138635a.hashCode();
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.f138635a.name();
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ void setOwner(UserPrincipal userPrincipal) {
        this.f138635a.b(y.a(userPrincipal));
    }
}
