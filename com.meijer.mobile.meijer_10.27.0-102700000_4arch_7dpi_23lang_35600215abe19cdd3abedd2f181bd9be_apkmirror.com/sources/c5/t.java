package c5;

import android.content.Context;
import c5.q;
import java.io.Closeable;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kw.AbstractC15335l;
import kw.B;
import kw.InterfaceC15330g;
import q5.C16458j;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lkw/B;", "file", "Lkw/l;", "fileSystem", "", "diskCacheKey", "Ljava/io/Closeable;", "closeable", "Lc5/q;", "g", "(Lkw/B;Lkw/l;Ljava/lang/String;Ljava/io/Closeable;)Lc5/q;", "Lkw/g;", "source", "Landroid/content/Context;", "context", "e", "(Lkw/g;Landroid/content/Context;)Lc5/q;", "Lc5/q$a;", "metadata", "f", "(Lkw/g;Landroid/content/Context;Lc5/q$a;)Lc5/q;", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
/* loaded from: classes4.dex */
public final class t {
    @JvmName
    public static final q e(InterfaceC15330g interfaceC15330g, final Context context) {
        return new v(interfaceC15330g, new Function0() { // from class: c5.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t.c(context);
            }
        }, null);
    }

    @JvmName
    public static final q f(InterfaceC15330g interfaceC15330g, final Context context, q.a aVar) {
        return new v(interfaceC15330g, new Function0() { // from class: c5.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t.d(context);
            }
        }, aVar);
    }

    @JvmName
    public static final q g(B b10, AbstractC15335l abstractC15335l, String str, Closeable closeable) {
        return new p(b10, abstractC15335l, str, closeable, null);
    }

    public static /* synthetic */ q h(B b10, AbstractC15335l abstractC15335l, String str, Closeable closeable, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            abstractC15335l = AbstractC15335l.f148118b;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            closeable = null;
        }
        return g(b10, abstractC15335l, str, closeable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File c(Context context) {
        return C16458j.n(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File d(Context context) {
        return C16458j.n(context);
    }
}
