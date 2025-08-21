package a;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\n\u001a\u00020\u00018\u0000X\u0080D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"", "", "name", "Ljava/lang/StackTraceElement;", "b", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/lang/StackTraceElement;", "a", "Ljava/lang/String;", "getARTIFICIAL_FRAME_PACKAGE_NAME", "()Ljava/lang/String;", "ARTIFICIAL_FRAME_PACKAGE_NAME", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f44158a = "_COROUTINE";

    /* JADX INFO: Access modifiers changed from: private */
    public static final StackTraceElement b(Throwable th2, String str) {
        StackTraceElement stackTraceElement = th2.getStackTrace()[0];
        return new StackTraceElement(f44158a + '.' + str, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}
