package xf;

/* renamed from: xf.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C18041a implements InterfaceC18044d {

    /* renamed from: a, reason: collision with root package name */
    private final int f169590a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC18044d[] f169591b;

    /* renamed from: c, reason: collision with root package name */
    private final C18042b f169592c;

    @Override // xf.InterfaceC18044d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f169590a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrA = stackTraceElementArr;
        for (InterfaceC18044d interfaceC18044d : this.f169591b) {
            if (stackTraceElementArrA.length <= this.f169590a) {
                break;
            }
            stackTraceElementArrA = interfaceC18044d.a(stackTraceElementArr);
        }
        return stackTraceElementArrA.length > this.f169590a ? this.f169592c.a(stackTraceElementArrA) : stackTraceElementArrA;
    }

    public C18041a(int i10, InterfaceC18044d... interfaceC18044dArr) {
        this.f169590a = i10;
        this.f169591b = interfaceC18044dArr;
        this.f169592c = new C18042b(i10);
    }
}
