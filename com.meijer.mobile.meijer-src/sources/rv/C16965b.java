package rv;

import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ai\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u000226\u0010\b\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\u000e\u001a\u00028\u0000\"\u000e\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\f*\u00028\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a?\u0010\u0017\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0082\b¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lrv/B;", "S", "", PreferencesHelper.PREF_ID, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "prev", "createNewSegment", "Lrv/C;", "c", "(Lrv/B;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lrv/c;", "N", "b", "(Lrv/c;)Lrv/c;", "", "", "delta", "Lkotlin/Function1;", "cur", "", "condition", "addConditionally", "(Ljava/lang/Object;ILkotlin/jvm/functions/Function1;)Z", "Lrv/E;", "a", "Lrv/E;", "CLOSED", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: rv.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C16965b {

    /* renamed from: a, reason: collision with root package name */
    private static final C16950E f159638a = new C16950E("CLOSED");

    public static final <S extends AbstractC16947B<S>> Object c(S s10, long j10, Function2<? super Long, ? super S, ? extends S> function2) {
        while (true) {
            if (s10.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String >= j10 && !s10.k()) {
                return C16948C.a(s10);
            }
            Object objG = s10.g();
            if (objG == f159638a) {
                return C16948C.a(f159638a);
            }
            S sInvoke = (S) ((AbstractC16966c) objG);
            if (sInvoke == null) {
                sInvoke = function2.invoke(Long.valueOf(s10.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String + 1), s10);
                if (s10.o(sInvoke)) {
                    if (s10.k()) {
                        s10.n();
                    }
                }
            }
            s10 = sInvoke;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [rv.c] */
    public static final <N extends AbstractC16966c<N>> N b(N n10) {
        while (true) {
            Object objG = n10.g();
            if (objG == f159638a) {
                return n10;
            }
            ?? r02 = (AbstractC16966c) objG;
            if (r02 == 0) {
                if (n10.m()) {
                    return n10;
                }
            } else {
                n10 = r02;
            }
        }
    }
}
