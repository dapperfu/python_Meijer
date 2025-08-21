package zf;

/* renamed from: zf.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C18479b implements InterfaceC18481d {

    /* renamed from: a, reason: collision with root package name */
    private final int f172742a;

    @Override // zf.InterfaceC18481d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i10 = this.f172742a;
        if (length <= i10) {
            return stackTraceElementArr;
        }
        int i11 = i10 / 2;
        int i12 = i10 - i11;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i10];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i12);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i11, stackTraceElementArr2, i12, i11);
        return stackTraceElementArr2;
    }

    public C18479b(int i10) {
        this.f172742a = i10;
    }
}
