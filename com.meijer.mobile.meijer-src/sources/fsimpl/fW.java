package fsimpl;

import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
class fW extends PrintWriter {

    /* renamed from: a, reason: collision with root package name */
    List f133491a;

    public fW(Writer writer) {
        super(writer);
        this.f133491a = new ArrayList();
    }

    @Override // java.io.PrintWriter
    public void println(Object obj) {
        this.f133491a.add(String.valueOf(obj));
        super.println(obj);
    }
}
