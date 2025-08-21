package hw;

import gw.AbstractC14423l;
import gw.B;
import gw.C14422k;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lgw/l;", "Lgw/B;", "path", "Lgw/k;", "c", "(Lgw/l;Lgw/B;)Lgw/k;", "", "b", "(Lgw/l;Lgw/B;)Z", "dir", "mustCreate", "", "a", "(Lgw/l;Lgw/B;Z)V", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class d {
    public static final void a(AbstractC14423l abstractC14423l, B dir, boolean z10) throws IOException {
        Intrinsics.j(abstractC14423l, "<this>");
        Intrinsics.j(dir, "dir");
        ArrayDeque arrayDeque = new ArrayDeque();
        for (B bP = dir; bP != null && !abstractC14423l.m(bP); bP = bP.p()) {
            arrayDeque.addFirst(bP);
        }
        if (z10 && arrayDeque.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = arrayDeque.iterator();
        while (it.hasNext()) {
            AbstractC14423l.i(abstractC14423l, (B) it.next(), false, 2, null);
        }
    }

    public static final boolean b(AbstractC14423l abstractC14423l, B path) throws IOException {
        Intrinsics.j(abstractC14423l, "<this>");
        Intrinsics.j(path, "path");
        return abstractC14423l.w(path) != null;
    }

    public static final C14422k c(AbstractC14423l abstractC14423l, B path) throws IOException {
        Intrinsics.j(abstractC14423l, "<this>");
        Intrinsics.j(path, "path");
        C14422k c14422kW = abstractC14423l.w(path);
        if (c14422kW != null) {
            return c14422kW;
        }
        throw new FileNotFoundException("no such file: " + path);
    }
}
