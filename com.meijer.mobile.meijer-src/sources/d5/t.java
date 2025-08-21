package d5;

import android.content.Context;
import d5.q;
import gw.AbstractC14423l;
import gw.B;
import gw.InterfaceC14418g;
import java.io.Closeable;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import r5.C16846j;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lgw/B;", "file", "Lgw/l;", "fileSystem", "", "diskCacheKey", "Ljava/io/Closeable;", "closeable", "Ld5/q;", "g", "(Lgw/B;Lgw/l;Ljava/lang/String;Ljava/io/Closeable;)Ld5/q;", "Lgw/g;", "source", "Landroid/content/Context;", "context", "e", "(Lgw/g;Landroid/content/Context;)Ld5/q;", "Ld5/q$a;", "metadata", "f", "(Lgw/g;Landroid/content/Context;Ld5/q$a;)Ld5/q;", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
/* loaded from: classes4.dex */
public final class t {
    @JvmName
    public static final q e(InterfaceC14418g interfaceC14418g, final Context context) {
        return new v(interfaceC14418g, new Function0() { // from class: d5.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t.c(context);
            }
        }, null);
    }

    @JvmName
    public static final q f(InterfaceC14418g interfaceC14418g, final Context context, q.a aVar) {
        return new v(interfaceC14418g, new Function0() { // from class: d5.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t.d(context);
            }
        }, aVar);
    }

    @JvmName
    public static final q g(B b10, AbstractC14423l abstractC14423l, String str, Closeable closeable) {
        return new p(b10, abstractC14423l, str, closeable, null);
    }

    public static /* synthetic */ q h(B b10, AbstractC14423l abstractC14423l, String str, Closeable closeable, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            abstractC14423l = AbstractC14423l.f134581b;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            closeable = null;
        }
        return g(b10, abstractC14423l, str, closeable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File c(Context context) {
        return C16846j.n(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File d(Context context) {
        return C16846j.n(context);
    }
}
