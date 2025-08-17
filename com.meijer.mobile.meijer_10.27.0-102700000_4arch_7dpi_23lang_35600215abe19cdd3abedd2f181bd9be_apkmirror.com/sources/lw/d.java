package lw;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kw.AbstractC15335l;
import kw.B;
import kw.C15334k;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkw/l;", "Lkw/B;", "path", "Lkw/k;", "c", "(Lkw/l;Lkw/B;)Lkw/k;", "", "b", "(Lkw/l;Lkw/B;)Z", "dir", "mustCreate", "", "a", "(Lkw/l;Lkw/B;Z)V", "okio"}, k = 2, mv = {2, 1, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class d {
    public static final void a(AbstractC15335l abstractC15335l, B dir, boolean z10) throws IOException {
        Intrinsics.j(abstractC15335l, "<this>");
        Intrinsics.j(dir, "dir");
        ArrayDeque arrayDeque = new ArrayDeque();
        for (B bP = dir; bP != null && !abstractC15335l.m(bP); bP = bP.p()) {
            arrayDeque.addFirst(bP);
        }
        if (z10 && arrayDeque.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = arrayDeque.iterator();
        while (it.hasNext()) {
            AbstractC15335l.i(abstractC15335l, (B) it.next(), false, 2, null);
        }
    }

    public static final boolean b(AbstractC15335l abstractC15335l, B path) throws IOException {
        Intrinsics.j(abstractC15335l, "<this>");
        Intrinsics.j(path, "path");
        return abstractC15335l.w(path) != null;
    }

    public static final C15334k c(AbstractC15335l abstractC15335l, B path) throws IOException {
        Intrinsics.j(abstractC15335l, "<this>");
        Intrinsics.j(path, "path");
        C15334k c15334kW = abstractC15335l.w(path);
        if (c15334kW != null) {
            return c15334kW;
        }
        throw new FileNotFoundException("no such file: " + path);
    }
}
