package j$.nio.file.attribute;

import java.nio.file.attribute.UserDefinedFileAttributeView;

/* loaded from: classes3.dex */
public final /* synthetic */ class x implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserDefinedFileAttributeView f138641a;

    public final /* synthetic */ boolean equals(Object obj) {
        UserDefinedFileAttributeView userDefinedFileAttributeView = this.f138641a;
        if (obj instanceof x) {
            obj = ((x) obj).f138641a;
        }
        return userDefinedFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f138641a.hashCode();
    }

    @Override // j$.nio.file.attribute.o
    public final /* synthetic */ String name() {
        return this.f138641a.name();
    }
}
