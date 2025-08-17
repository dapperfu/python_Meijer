package q5;

import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kw.AbstractC15335l;
import kw.B;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"Lkw/l;", "Lkw/B;", "file", "", "a", "(Lkw/l;Lkw/B;)V", "directory", "b", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
/* renamed from: q5.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16453e {
    public static final void a(AbstractC15335l abstractC15335l, B b10) throws IOException {
        if (!abstractC15335l.m(b10)) {
            C16458j.d(abstractC15335l.A(b10));
        }
    }

    public static final void b(AbstractC15335l abstractC15335l, B b10) throws IOException {
        try {
            IOException iOException = null;
            for (B b11 : abstractC15335l.p(b10)) {
                try {
                    if (abstractC15335l.u(b11).getIsDirectory()) {
                        b(abstractC15335l, b11);
                    }
                    abstractC15335l.j(b11);
                } catch (IOException e10) {
                    if (iOException == null) {
                        iOException = e10;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}
