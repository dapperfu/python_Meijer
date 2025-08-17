package xf;

import java.util.Stack;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f169595a;

    /* renamed from: b, reason: collision with root package name */
    public final String f169596b;

    /* renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f169597c;

    /* renamed from: d, reason: collision with root package name */
    public final e f169598d;

    public static e a(Throwable th2, InterfaceC18044d interfaceC18044d) {
        Stack stack = new Stack();
        while (th2 != null) {
            stack.push(th2);
            th2 = th2.getCause();
        }
        e eVar = null;
        while (!stack.isEmpty()) {
            Throwable th3 = (Throwable) stack.pop();
            eVar = new e(th3.getLocalizedMessage(), th3.getClass().getName(), interfaceC18044d.a(th3.getStackTrace()), eVar);
        }
        return eVar;
    }

    private e(String str, String str2, StackTraceElement[] stackTraceElementArr, e eVar) {
        this.f169595a = str;
        this.f169596b = str2;
        this.f169597c = stackTraceElementArr;
        this.f169598d = eVar;
    }
}
