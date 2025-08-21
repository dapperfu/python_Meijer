package Qm;

import android.content.Context;
import android.util.Base64;
import io.reactivex.l;
import io.reactivex.n;
import io.reactivex.o;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\fB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LQm/b;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "base64Pdf", "Lio/reactivex/l;", "Ljava/io/File;", "b", "(Ljava/lang/String;)Lio/reactivex/l;", "a", "Landroid/content/Context;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final int f31059c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    public b(Context context) {
        Intrinsics.j(context, "context");
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(b bVar, String str, n fileObservableEmitter) throws IOException {
        Intrinsics.j(fileObservableEmitter, "fileObservableEmitter");
        File file = new File(bVar.context.getFilesDir(), "receipt.pdf");
        if (file.exists()) {
            file.delete();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file.getPath());
        try {
            try {
                fileOutputStream.write(Base64.decode(str, 2));
                fileOutputStream.getFD().sync();
            } catch (IOException e10) {
                fileObservableEmitter.onError(e10);
            }
        } finally {
            fileOutputStream.close();
            fileObservableEmitter.onNext(file);
            fileObservableEmitter.onComplete();
        }
    }

    public final l<File> b(final String base64Pdf) {
        Intrinsics.j(base64Pdf, "base64Pdf");
        l<File> lVarCreate = l.create(new o() { // from class: Qm.a
            @Override // io.reactivex.o
            public final void a(n nVar) throws IOException {
                b.c(this.f31056a, base64Pdf, nVar);
            }
        });
        Intrinsics.i(lVarCreate, "create(...)");
        return lVarCreate;
    }
}
