package rv;

import a.C5636a;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006\"\u001c\u0010\f\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u001c\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b*\f\b\u0000\u0010\u0010\"\u00020\u000f2\u00020\u000f*\f\b\u0000\u0010\u0011\"\u00020\u00052\u00020\u0005¨\u0006\u0012"}, d2 = {"", "E", "exception", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Ljava/lang/StackTraceElement;", "Ljava/lang/StackTraceElement;", "ARTIFICIAL_FRAME", "", "kotlin.jvm.PlatformType", "b", "Ljava/lang/String;", "baseContinuationImplClassName", "c", "stackTraceRecoveryClassName", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: rv.D, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C16949D {

    /* renamed from: a, reason: collision with root package name */
    private static final StackTraceElement f159618a = new C5636a().a();

    /* renamed from: b, reason: collision with root package name */
    private static final String f159619b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f159620c;

    public static final <E extends Throwable> E a(E e10) {
        return e10;
    }

    static {
        Object objB;
        Object objB2;
        try {
            Result.Companion companion = Result.INSTANCE;
            objB = Result.b(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        if (Result.e(objB) != null) {
            objB = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f159619b = (String) objB;
        try {
            objB2 = Result.b(C16949D.class.getCanonicalName());
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.INSTANCE;
            objB2 = Result.b(ResultKt.a(th3));
        }
        if (Result.e(objB2) != null) {
            objB2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f159620c = (String) objB2;
    }
}
