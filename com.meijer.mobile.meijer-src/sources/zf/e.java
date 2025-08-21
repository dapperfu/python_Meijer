package zf;

import java.util.Stack;

/* loaded from: classes8.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f172744a;

    /* renamed from: b, reason: collision with root package name */
    public final String f172745b;

    /* renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f172746c;

    /* renamed from: d, reason: collision with root package name */
    public final e f172747d;

    public static e a(Throwable th2, InterfaceC18481d interfaceC18481d) {
        Stack stack = new Stack();
        while (th2 != null) {
            stack.push(th2);
            th2 = th2.getCause();
        }
        e eVar = null;
        while (!stack.isEmpty()) {
            Throwable th3 = (Throwable) stack.pop();
            eVar = new e(th3.getLocalizedMessage(), th3.getClass().getName(), interfaceC18481d.a(th3.getStackTrace()), eVar);
        }
        return eVar;
    }

    private e(String str, String str2, StackTraceElement[] stackTraceElementArr, e eVar) {
        this.f172744a = str;
        this.f172745b = str2;
        this.f172746c = stackTraceElementArr;
        this.f172747d = eVar;
    }
}
