package kotlin.io.path;

import j$.nio.file.FileVisitResult;
import j$.nio.file.Files;
import j$.nio.file.Path;
import j$.nio.file.SimpleFileVisitor;
import j$.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019¨\u0006\u001b"}, d2 = {"Lkotlin/io/path/a;", "j$/nio/file/SimpleFileVisitor", "j$/nio/file/Path", "", "followLinks", "<init>", "(Z)V", "Lkotlin/io/path/b;", "directoryNode", "", "b", "(Lkotlin/io/path/b;)Ljava/util/List;", "dir", "j$/nio/file/attribute/BasicFileAttributes", "attrs", "j$/nio/file/FileVisitResult", "a", "(Lj$/nio/file/Path;Lj$/nio/file/attribute/BasicFileAttributes;)Lj$/nio/file/FileVisitResult;", "file", "c", "Z", "getFollowLinks", "()Z", "Lkotlin/io/path/b;", "Lkotlin/collections/ArrayDeque;", "Lkotlin/collections/ArrayDeque;", "entries", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
final class a extends SimpleFileVisitor<Path> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean followLinks;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private b directoryNode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private ArrayDeque<b> entries = new ArrayDeque<>();

    @Override // j$.nio.file.SimpleFileVisitor, j$.nio.file.FileVisitor
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
        Intrinsics.j(dir, "dir");
        Intrinsics.j(attrs, "attrs");
        this.entries.add(new b(dir, attrs.fileKey(), this.directoryNode));
        FileVisitResult fileVisitResultPreVisitDirectory = super.preVisitDirectory(dir, attrs);
        Intrinsics.i(fileVisitResultPreVisitDirectory, "preVisitDirectory(...)");
        return fileVisitResultPreVisitDirectory;
    }

    public final List<b> b(b directoryNode) {
        Intrinsics.j(directoryNode, "directoryNode");
        this.directoryNode = directoryNode;
        Files.walkFileTree(directoryNode.getPath(), LinkFollowing.f143668a.b(this.followLinks), 1, this);
        this.entries.removeFirst();
        ArrayDeque<b> arrayDeque = this.entries;
        this.entries = new ArrayDeque<>();
        return arrayDeque;
    }

    @Override // j$.nio.file.SimpleFileVisitor, j$.nio.file.FileVisitor
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        Intrinsics.j(file, "file");
        Intrinsics.j(attrs, "attrs");
        this.entries.add(new b(file, null, this.directoryNode));
        FileVisitResult fileVisitResultVisitFile = super.visitFile(file, attrs);
        Intrinsics.i(fileVisitResultVisitFile, "visitFile(...)");
        return fileVisitResultVisitFile;
    }

    public a(boolean z10) {
        this.followLinks = z10;
    }
}
