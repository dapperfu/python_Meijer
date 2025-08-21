package zf;

/* renamed from: zf.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C18478a implements InterfaceC18481d {

    /* renamed from: a, reason: collision with root package name */
    private final int f172739a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC18481d[] f172740b;

    /* renamed from: c, reason: collision with root package name */
    private final C18479b f172741c;

    @Override // zf.InterfaceC18481d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f172739a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrA = stackTraceElementArr;
        for (InterfaceC18481d interfaceC18481d : this.f172740b) {
            if (stackTraceElementArrA.length <= this.f172739a) {
                break;
            }
            stackTraceElementArrA = interfaceC18481d.a(stackTraceElementArr);
        }
        return stackTraceElementArrA.length > this.f172739a ? this.f172741c.a(stackTraceElementArrA) : stackTraceElementArrA;
    }

    public C18478a(int i10, InterfaceC18481d... interfaceC18481dArr) {
        this.f172739a = i10;
        this.f172740b = interfaceC18481dArr;
        this.f172741c = new C18479b(i10);
    }
}
