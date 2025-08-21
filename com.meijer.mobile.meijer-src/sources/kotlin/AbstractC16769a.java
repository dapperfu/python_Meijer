package kotlin;

import java.util.Arrays;
import kotlin.AbstractC16771c;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pv.P;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00028\u0000H$¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b2\u0006\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0011\u0010\u0012R8\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000b2\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000b8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0$8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010%¨\u0006'"}, d2 = {"Lqv/a;", "Lqv/c;", "S", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "j", "()Lqv/c;", "", "size", "", "k", "(I)[Lqv/c;", "i", "slot", "", "l", "(Lqv/c;)V", "value", "a", "[Lqv/c;", "n", "()[Lqv/c;", "slots", "b", "I", "m", "()I", "nCollectors", "c", "nextIndex", "Lqv/z;", "d", "Lqv/z;", "_subscriptionCount", "Lpv/P;", "()Lpv/P;", "subscriptionCount", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: qv.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC16769a<S extends AbstractC16771c<?>> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private S[] slots;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int nCollectors;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int nextIndex;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private C16793z _subscriptionCount;

    public final P<Integer> c() {
        C16793z c16793z;
        synchronized (this) {
            c16793z = this._subscriptionCount;
            if (c16793z == null) {
                c16793z = new C16793z(this.nCollectors);
                this._subscriptionCount = c16793z;
            }
        }
        return c16793z;
    }

    protected final S i() {
        S s10;
        C16793z c16793z;
        synchronized (this) {
            try {
                S[] sArr = this.slots;
                if (sArr == null) {
                    sArr = (S[]) k(2);
                    this.slots = sArr;
                } else if (this.nCollectors >= sArr.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    Intrinsics.i(objArrCopyOf, "copyOf(...)");
                    this.slots = (S[]) ((AbstractC16771c[]) objArrCopyOf);
                    sArr = (S[]) ((AbstractC16771c[]) objArrCopyOf);
                }
                int i10 = this.nextIndex;
                do {
                    s10 = sArr[i10];
                    if (s10 == null) {
                        s10 = (S) j();
                        sArr[i10] = s10;
                    }
                    i10++;
                    if (i10 >= sArr.length) {
                        i10 = 0;
                    }
                    Intrinsics.h(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!s10.a(this));
                this.nextIndex = i10;
                this.nCollectors++;
                c16793z = this._subscriptionCount;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c16793z != null) {
            c16793z.a0(1);
        }
        return s10;
    }

    protected abstract S j();

    protected abstract S[] k(int size);

    protected final void l(S slot) {
        C16793z c16793z;
        int i10;
        Continuation<Unit>[] continuationArrB;
        synchronized (this) {
            try {
                int i11 = this.nCollectors - 1;
                this.nCollectors = i11;
                c16793z = this._subscriptionCount;
                if (i11 == 0) {
                    this.nextIndex = 0;
                }
                Intrinsics.h(slot, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                continuationArrB = slot.b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (Continuation<Unit> continuation : continuationArrB) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.b(Unit.f143329a));
            }
        }
        if (c16793z != null) {
            c16793z.a0(-1);
        }
    }

    /* renamed from: m, reason: from getter */
    protected final int getNCollectors() {
        return this.nCollectors;
    }

    protected final S[] n() {
        return this.slots;
    }
}
