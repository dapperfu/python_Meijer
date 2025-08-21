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
    public final DirectoryStream.Filter f139163a;

    /* renamed from: b, reason: collision with root package name */
    public final File[] f139164b;

    /* renamed from: c, reason: collision with root package name */
    public int f139165c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f139166d;

    public l(m mVar, Path path, DirectoryStream.Filter filter) {
        this.f139166d = mVar;
        File[] fileArrListFiles = path.toFile().listFiles();
        this.f139164b = fileArrListFiles == null ? new File[0] : fileArrListFiles;
        this.f139163a = filter;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (next() == null) {
            return false;
        }
        this.f139165c--;
        return true;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final o next() {
        o oVar;
        do {
            int i10 = this.f139165c;
            File[] fileArr = this.f139164b;
            if (i10 >= fileArr.length) {
                return null;
            }
            this.f139165c = i10 + 1;
            File file = fileArr[i10];
            i iVar = this.f139166d.f139169d;
            String path = file.getPath();
            m mVar = this.f139166d;
            oVar = new o(iVar, path, mVar.f139167b, mVar.f139168c);
            try {
            } catch (IOException e10) {
                throw new DirectoryIteratorException(e10);
            }
        } while (!this.f139163a.accept(oVar));
        return oVar;
    }
}
