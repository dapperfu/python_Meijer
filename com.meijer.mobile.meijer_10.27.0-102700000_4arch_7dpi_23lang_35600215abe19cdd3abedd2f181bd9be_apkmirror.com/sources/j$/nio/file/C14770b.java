package j$.nio.file;

/* renamed from: j$.nio.file.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C14770b implements CopyOption {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.nio.file.CopyOption f138644a;

    public /* synthetic */ C14770b(java.nio.file.CopyOption copyOption) {
        this.f138644a = copyOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j$.nio.file.CopyOption, java.nio.file.StandardCopyOption] */
    /* JADX WARN: Type inference failed for: r1v3, types: [j$.nio.file.CopyOption, java.nio.file.StandardCopyOption] */
    /* JADX WARN: Type inference failed for: r1v4, types: [j$.nio.file.CopyOption, java.nio.file.StandardCopyOption] */
    /* JADX WARN: Type inference failed for: r1v6, types: [j$.nio.file.CopyOption, java.nio.file.LinkOption] */
    public static /* synthetic */ CopyOption a(java.nio.file.CopyOption copyOption) {
        if (copyOption == 0) {
            return null;
        }
        if (copyOption instanceof C14771c) {
            return ((C14771c) copyOption).f138645a;
        }
        if (copyOption instanceof LinkOption) {
            return java.nio.file.LinkOption.NOFOLLOW_LINKS;
        }
        if (!(copyOption instanceof StandardCopyOption)) {
            return new C14770b(copyOption);
        }
        StandardCopyOption standardCopyOption = (StandardCopyOption) copyOption;
        return standardCopyOption == StandardCopyOption.REPLACE_EXISTING ? java.nio.file.StandardCopyOption.REPLACE_EXISTING : standardCopyOption == StandardCopyOption.COPY_ATTRIBUTES ? java.nio.file.StandardCopyOption.COPY_ATTRIBUTES : java.nio.file.StandardCopyOption.ATOMIC_MOVE;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.CopyOption copyOption = this.f138644a;
        if (obj instanceof C14770b) {
            obj = ((C14770b) obj).f138644a;
        }
        return copyOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f138644a.hashCode();
    }
}
