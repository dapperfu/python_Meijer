package kotlin.io.path;

import j$.nio.file.FileVisitOption;
import j$.nio.file.LinkOption;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0017"}, d2 = {"Lkotlin/io/path/LinkFollowing;", "", "<init>", "()V", "", "followLinks", "", "j$/nio/file/LinkOption", "a", "(Z)[Lj$/nio/file/LinkOption;", "", "j$/nio/file/FileVisitOption", "b", "(Z)Ljava/util/Set;", "[Lj$/nio/file/LinkOption;", "nofollowLinkOption", "c", "followLinkOption", "d", "Ljava/util/Set;", "nofollowVisitOption", "e", "followVisitOption", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LinkFollowing {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkFollowing f142761a = new LinkFollowing();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final LinkOption[] nofollowLinkOption = {LinkOption.NOFOLLOW_LINKS};

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final LinkOption[] followLinkOption = new LinkOption[0];

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final Set<FileVisitOption> nofollowVisitOption = SetsKt.e();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final Set<FileVisitOption> followVisitOption = SetsKt.d(FileVisitOption.FOLLOW_LINKS);

    public final LinkOption[] a(boolean followLinks) {
        return followLinks ? followLinkOption : nofollowLinkOption;
    }

    public final Set<FileVisitOption> b(boolean followLinks) {
        return followLinks ? followVisitOption : nofollowVisitOption;
    }

    private LinkFollowing() {
    }
}
