package j$.nio.file;

/* renamed from: j$.nio.file.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C14858b implements CopyOption {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.nio.file.CopyOption f139233a;

    public /* synthetic */ C14858b(java.nio.file.CopyOption copyOption) {
        this.f139233a = copyOption;
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
        if (copyOption instanceof C14859c) {
            return ((C14859c) copyOption).f139234a;
        }
        if (copyOption instanceof LinkOption) {
            return java.nio.file.LinkOption.NOFOLLOW_LINKS;
        }
        if (!(copyOption instanceof StandardCopyOption)) {
            return new C14858b(copyOption);
        }
        StandardCopyOption standardCopyOption = (StandardCopyOption) copyOption;
        return standardCopyOption == StandardCopyOption.REPLACE_EXISTING ? java.nio.file.StandardCopyOption.REPLACE_EXISTING : standardCopyOption == StandardCopyOption.COPY_ATTRIBUTES ? java.nio.file.StandardCopyOption.COPY_ATTRIBUTES : java.nio.file.StandardCopyOption.ATOMIC_MOVE;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.CopyOption copyOption = this.f139233a;
        if (obj instanceof C14858b) {
            obj = ((C14858b) obj).f139233a;
        }
        return copyOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f139233a.hashCode();
    }
}
