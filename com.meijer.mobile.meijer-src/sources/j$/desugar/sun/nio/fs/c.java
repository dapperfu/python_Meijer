package j$.desugar.sun.nio.fs;

import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.FileTime;

/* loaded from: classes3.dex */
public final class c implements BasicFileAttributes {

    /* renamed from: a, reason: collision with root package name */
    public final FileTime f139141a;

    /* renamed from: b, reason: collision with root package name */
    public final FileTime f139142b;

    /* renamed from: c, reason: collision with root package name */
    public final FileTime f139143c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f139144d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f139145e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f139146f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f139147g;

    /* renamed from: h, reason: collision with root package name */
    public final long f139148h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f139149i;

    public c(FileTime fileTime, FileTime fileTime2, FileTime fileTime3, boolean z10, boolean z11, boolean z12, boolean z13, long j10, Object obj) {
        this.f139141a = fileTime;
        this.f139142b = fileTime2;
        this.f139143c = fileTime3;
        this.f139144d = z10;
        this.f139145e = z11;
        this.f139146f = z12;
        this.f139147g = z13;
        this.f139148h = j10;
        this.f139149i = obj;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final FileTime lastModifiedTime() {
        return this.f139141a;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final FileTime lastAccessTime() {
        return this.f139142b;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final FileTime creationTime() {
        return this.f139143c;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final boolean isRegularFile() {
        return this.f139144d;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final boolean isDirectory() {
        return this.f139145e;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final boolean isSymbolicLink() {
        return this.f139146f;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final boolean isOther() {
        return this.f139147g;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final long size() {
        return this.f139148h;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final Object fileKey() {
        return this.f139149i;
    }
}
