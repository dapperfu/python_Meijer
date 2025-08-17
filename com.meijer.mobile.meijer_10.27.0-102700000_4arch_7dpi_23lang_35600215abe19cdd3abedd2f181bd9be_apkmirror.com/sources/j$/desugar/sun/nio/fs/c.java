package j$.desugar.sun.nio.fs;

import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.FileTime;

/* loaded from: classes3.dex */
public final class c implements BasicFileAttributes {

    /* renamed from: a, reason: collision with root package name */
    public final FileTime f138552a;

    /* renamed from: b, reason: collision with root package name */
    public final FileTime f138553b;

    /* renamed from: c, reason: collision with root package name */
    public final FileTime f138554c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f138555d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f138556e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f138557f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f138558g;

    /* renamed from: h, reason: collision with root package name */
    public final long f138559h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f138560i;

    public c(FileTime fileTime, FileTime fileTime2, FileTime fileTime3, boolean z10, boolean z11, boolean z12, boolean z13, long j10, Object obj) {
        this.f138552a = fileTime;
        this.f138553b = fileTime2;
        this.f138554c = fileTime3;
        this.f138555d = z10;
        this.f138556e = z11;
        this.f138557f = z12;
        this.f138558g = z13;
        this.f138559h = j10;
        this.f138560i = obj;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final FileTime lastModifiedTime() {
        return this.f138552a;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final FileTime lastAccessTime() {
        return this.f138553b;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final FileTime creationTime() {
        return this.f138554c;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final boolean isRegularFile() {
        return this.f138555d;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final boolean isDirectory() {
        return this.f138556e;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final boolean isSymbolicLink() {
        return this.f138557f;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final boolean isOther() {
        return this.f138558g;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final long size() {
        return this.f138559h;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final Object fileKey() {
        return this.f138560i;
    }
}
