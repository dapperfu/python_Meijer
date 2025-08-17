package xf;

/* renamed from: xf.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C18042b implements InterfaceC18044d {

    /* renamed from: a, reason: collision with root package name */
    private final int f169593a;

    @Override // xf.InterfaceC18044d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i10 = this.f169593a;
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

    public C18042b(int i10) {
        this.f169593a = i10;
    }
}
