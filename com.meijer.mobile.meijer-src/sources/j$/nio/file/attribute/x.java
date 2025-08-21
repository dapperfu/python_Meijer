package j$.nio.file.attribute;

import java.nio.file.attribute.UserDefinedFileAttributeView;

/* loaded from: classes3.dex */
public final /* synthetic */ class x implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserDefinedFileAttributeView f139230a;

    public final /* synthetic */ boolean equals(Object obj) {
        UserDefinedFileAttributeView userDefinedFileAttributeView = this.f139230a;
        if (obj instanceof x) {
            obj = ((x) obj).f139230a;
        }
        return userDefinedFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f139230a.hashCode();
    }

    @Override // j$.nio.file.attribute.o
    public final /* synthetic */ String name() {
        return this.f139230a.name();
    }
}
