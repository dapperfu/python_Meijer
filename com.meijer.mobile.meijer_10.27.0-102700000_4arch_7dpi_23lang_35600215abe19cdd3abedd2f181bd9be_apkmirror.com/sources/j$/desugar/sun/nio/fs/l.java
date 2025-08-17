package j$.desugar.sun.nio.fs;

import j$.nio.file.Path;
import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class l implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final DirectoryStream.Filter f138574a;

    /* renamed from: b, reason: collision with root package name */
    public final File[] f138575b;

    /* renamed from: c, reason: collision with root package name */
    public int f138576c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f138577d;

    public l(m mVar, Path path, DirectoryStream.Filter filter) {
        this.f138577d = mVar;
        File[] fileArrListFiles = path.toFile().listFiles();
        this.f138575b = fileArrListFiles == null ? new File[0] : fileArrListFiles;
        this.f138574a = filter;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (next() == null) {
            return false;
        }
        this.f138576c--;
        return true;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final o next() {
        o oVar;
        do {
            int i10 = this.f138576c;
            File[] fileArr = this.f138575b;
            if (i10 >= fileArr.length) {
                return null;
            }
            this.f138576c = i10 + 1;
            File file = fileArr[i10];
            i iVar = this.f138577d.f138580d;
            String path = file.getPath();
            m mVar = this.f138577d;
            oVar = new o(iVar, path, mVar.f138578b, mVar.f138579c);
            try {
            } catch (IOException e10) {
                throw new DirectoryIteratorException(e10);
            }
        } while (!this.f138574a.accept(oVar));
        return oVar;
    }
}
