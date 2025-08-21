package rv;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.AbstractC15779K;
import mv.InterfaceC15804h0;
import mv.InterfaceC15815n;
import mv.L0;
import mv.Y;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001a2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0016¢\u0006\u0004\b\u001f\u0010 J%\u0010$\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0005H\u0016¢\u0006\u0004\b&\u0010'R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lrv/u;", "Lmv/L0;", "Lmv/Y;", "", "cause", "", "errorHint", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "", "Y0", "()Ljava/lang/Void;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "P0", "(Lkotlin/coroutines/CoroutineContext;)Z", "", "parallelism", "name", "Lmv/K;", "S0", "(ILjava/lang/String;)Lmv/K;", "", "timeMillis", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lmv/h0;", "w", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lmv/h0;", "X0", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)Ljava/lang/Void;", "Lmv/n;", "", "continuation", "Z0", "(JLmv/n;)Ljava/lang/Void;", "toString", "()Ljava/lang/String;", "c", "Ljava/lang/Throwable;", "d", "Ljava/lang/String;", "U0", "()Lmv/L0;", "immediate", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: rv.u, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C16984u extends L0 implements Y {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Throwable cause;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String errorHint;

    public /* synthetic */ C16984u(Throwable th2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(th2, (i10 & 2) != 0 ? null : str);
    }

    @Override // mv.L0
    public L0 U0() {
        return this;
    }

    public C16984u(Throwable th2, String str) {
        this.cause = th2;
        this.errorHint = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Void Y0() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.cause
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.errorHint
            if (r1 == 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.cause
            r1.<init>(r0, r2)
            throw r1
        L36:
            rv.C16983t.d()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rv.C16984u.Y0():java.lang.Void");
    }

    @Override // mv.L0, mv.AbstractC15779K
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dispatchers.Main[missing");
        if (this.cause != null) {
            str = ", cause=" + this.cause;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // mv.AbstractC15779K
    public boolean P0(CoroutineContext context) {
        Y0();
        throw new KotlinNothingValueException();
    }

    @Override // mv.L0, mv.AbstractC15779K
    public AbstractC15779K S0(int parallelism, String name) {
        Y0();
        throw new KotlinNothingValueException();
    }

    @Override // mv.AbstractC15779K
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public Void J0(CoroutineContext context, Runnable block) {
        Y0();
        throw new KotlinNothingValueException();
    }

    @Override // mv.Y
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public Void H0(long timeMillis, InterfaceC15815n<? super Unit> continuation) {
        Y0();
        throw new KotlinNothingValueException();
    }

    @Override // mv.Y
    public InterfaceC15804h0 w(long timeMillis, Runnable block, CoroutineContext context) {
        Y0();
        throw new KotlinNothingValueException();
    }
}
