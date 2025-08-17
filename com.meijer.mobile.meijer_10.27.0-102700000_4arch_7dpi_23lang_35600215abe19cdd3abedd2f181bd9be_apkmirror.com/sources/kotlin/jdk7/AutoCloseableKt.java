package kotlin.jdk7;

import X2.f;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0004*\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006*\u001a\b\u0007\u0010\n\"\u00020\u00002\u00020\u0000B\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t¨\u0006\u000b"}, d2 = {"Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "", "cause", "", "a", "(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V", "Lkotlin/SinceKotlin;", "version", "2.0", "AutoCloseable", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
@JvmName
/* loaded from: classes6.dex */
public final class AutoCloseableKt {
    @SinceKotlin
    @PublishedApi
    public static final void a(AutoCloseable autoCloseable, Throwable th2) {
        if (autoCloseable != null) {
            if (th2 == null) {
                f.a(autoCloseable);
                return;
            }
            try {
                f.a(autoCloseable);
            } catch (Throwable th3) {
                ExceptionsKt.a(th2, th3);
            }
        }
    }
}
