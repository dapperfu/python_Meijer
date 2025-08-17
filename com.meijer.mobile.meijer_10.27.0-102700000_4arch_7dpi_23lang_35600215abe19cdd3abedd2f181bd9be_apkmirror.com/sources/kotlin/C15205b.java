package kotlin;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import kotlin.internal.HidesMembers;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "", "b", "(Ljava/lang/Throwable;)Ljava/lang/String;", "exception", "", "a", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/ExceptionsKt")
/* renamed from: kotlin.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15205b {
    @SinceKotlin
    @HidesMembers
    public static void a(Throwable th2, Throwable exception) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(th2, "<this>");
        Intrinsics.j(exception, "exception");
        if (th2 != exception) {
            PlatformImplementationsKt.f142682a.a(th2, exception);
        }
    }

    @SinceKotlin
    public static String b(Throwable th2) {
        Intrinsics.j(th2, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }
}
