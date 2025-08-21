package Zr;

import android.view.View;
import com.fullstory.FS;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import p2.C16351d0;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0004\u001a'\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u0001*\u00028\u00002\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u0001*\u00028\u00002\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\f\u0010\u000b\u001a'\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u0001*\u00028\u00002\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lkotlin/sequences/Sequence;", "Landroid/view/View;", "", "f", "(Lkotlin/sequences/Sequence;)V", "i", "b", "T", "", "deepMask", "e", "(Landroid/view/View;Z)Landroid/view/View;", "h", "a", "fullstory-ext_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class a {
    @JvmOverloads
    public static final <T extends View> T d(T t10) {
        Intrinsics.j(t10, "<this>");
        return (T) g(t10, false, 1, null);
    }

    @JvmOverloads
    public static final <T extends View> T a(T t10, boolean z10) {
        Intrinsics.j(t10, "<this>");
        if (z10) {
            b(C16351d0.a(t10));
            return t10;
        }
        FS.exclude(t10);
        return t10;
    }

    public static final void b(Sequence<? extends View> sequence) {
        Intrinsics.j(sequence, "<this>");
        Iterator<? extends View> it = sequence.iterator();
        while (it.hasNext()) {
            FS.exclude(it.next());
        }
    }

    public static /* synthetic */ View c(View view, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a(view, z10);
    }

    @JvmOverloads
    public static final <T extends View> T e(T t10, boolean z10) {
        Intrinsics.j(t10, "<this>");
        if (z10) {
            f(C16351d0.a(t10));
            return t10;
        }
        FS.mask(t10);
        return t10;
    }

    public static final void f(Sequence<? extends View> sequence) {
        Intrinsics.j(sequence, "<this>");
        Iterator<? extends View> it = sequence.iterator();
        while (it.hasNext()) {
            FS.mask(it.next());
        }
    }

    public static /* synthetic */ View g(View view, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return e(view, z10);
    }

    @JvmOverloads
    public static final <T extends View> T h(T t10, boolean z10) {
        Intrinsics.j(t10, "<this>");
        if (z10) {
            i(C16351d0.a(t10));
            return t10;
        }
        FS.unmask(t10);
        return t10;
    }

    public static final void i(Sequence<? extends View> sequence) {
        Intrinsics.j(sequence, "<this>");
        Iterator<? extends View> it = sequence.iterator();
        while (it.hasNext()) {
            FS.unmask(it.next());
        }
    }

    public static /* synthetic */ View j(View view, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return h(view, z10);
    }
}
