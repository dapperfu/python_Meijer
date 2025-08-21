package j$.nio.file;

import java.nio.file.DirectoryStream;
import java.util.Iterator;

/* renamed from: j$.nio.file.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14868l {

    /* renamed from: a, reason: collision with root package name */
    public final Path f139241a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f139242b;

    /* renamed from: c, reason: collision with root package name */
    public final DirectoryStream f139243c;

    /* renamed from: d, reason: collision with root package name */
    public final Iterator f139244d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f139245e;

    public C14868l(Path path, Object obj, DirectoryStream directoryStream) {
        this.f139241a = path;
        this.f139242b = obj;
        this.f139243c = directoryStream;
        this.f139244d = directoryStream.iterator();
    }
}
