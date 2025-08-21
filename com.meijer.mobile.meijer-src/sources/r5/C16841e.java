package r5;

import gw.AbstractC14423l;
import gw.B;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"Lgw/l;", "Lgw/B;", "file", "", "a", "(Lgw/l;Lgw/B;)V", "directory", "b", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
/* renamed from: r5.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16841e {
    public static final void a(AbstractC14423l abstractC14423l, B b10) throws IOException {
        if (!abstractC14423l.m(b10)) {
            C16846j.d(abstractC14423l.A(b10));
        }
    }

    public static final void b(AbstractC14423l abstractC14423l, B b10) throws IOException {
        try {
            IOException iOException = null;
            for (B b11 : abstractC14423l.p(b10)) {
                try {
                    if (abstractC14423l.u(b11).getIsDirectory()) {
                        b(abstractC14423l, b11);
                    }
                    abstractC14423l.j(b11);
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
