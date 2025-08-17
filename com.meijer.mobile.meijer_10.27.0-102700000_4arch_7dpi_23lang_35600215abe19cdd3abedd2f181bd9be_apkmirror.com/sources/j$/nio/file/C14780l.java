package j$.nio.file;

import java.nio.file.DirectoryStream;
import java.util.Iterator;

/* renamed from: j$.nio.file.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14780l {

    /* renamed from: a, reason: collision with root package name */
    public final Path f138652a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f138653b;

    /* renamed from: c, reason: collision with root package name */
    public final DirectoryStream f138654c;

    /* renamed from: d, reason: collision with root package name */
    public final Iterator f138655d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f138656e;

    public C14780l(Path path, Object obj, DirectoryStream directoryStream) {
        this.f138652a = path;
        this.f138653b = obj;
        this.f138654c = directoryStream;
        this.f138655d = directoryStream.iterator();
    }
}
