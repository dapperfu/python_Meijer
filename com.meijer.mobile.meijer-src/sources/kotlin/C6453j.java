package kotlin;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kotlin.C6430Q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u001a;\u0010\u0005\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a:\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\"\u0004\b\u0000\u0010\u00002\u001d\u0010\u001a\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a@\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\u0004\b\u0000\u0010\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a%\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b(\u0010)\u001a1\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000*\"\u0004\b\u0000\u0010\u00002\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*2\u0006\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b.\u0010/\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"T", "Lc0/q;", "V", "Lc0/o0;", "data", "b", "(Lc0/o0;Ljava/lang/Object;)Lc0/q;", "", "durationMillis", "delayMillis", "Lc0/C;", "easing", "Lc0/n0;", "k", "(IILc0/C;)Lc0/n0;", "", "dampingRatio", "stiffness", "visibilityThreshold", "Lc0/d0;", "i", "(FFLjava/lang/Object;)Lc0/d0;", "Lkotlin/Function1;", "Lc0/Q$b;", "", "Lkotlin/ExtensionFunctionType;", "init", "Lc0/Q;", "f", "(Lkotlin/jvm/functions/Function1;)Lc0/Q;", "Lc0/B;", "animation", "Lc0/Y;", "repeatMode", "Lc0/g0;", "initialStartOffset", "Lc0/M;", "d", "(Lc0/B;Lc0/Y;J)Lc0/M;", "Lc0/a0;", "g", "(I)Lc0/a0;", "Lc0/i;", "animationSpec", "", "startDelayNanos", "c", "(Lc0/i;J)Lc0/i;", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: c0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6453j {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends AbstractC6460q> V b(o0<T, V> o0Var, T t10) {
        if (t10 == null) {
            return null;
        }
        return o0Var.a().invoke(t10);
    }

    public static final <T> InterfaceC6452i<T> c(InterfaceC6452i<T> interfaceC6452i, long j10) {
        return new C6448e0(interfaceC6452i, j10);
    }

    public static final <T> C6426M<T> d(InterfaceC6415B<T> interfaceC6415B, EnumC6437Y enumC6437Y, long j10) {
        return new C6426M<>(interfaceC6415B, enumC6437Y, j10, null);
    }

    public static /* synthetic */ C6426M e(InterfaceC6415B interfaceC6415B, EnumC6437Y enumC6437Y, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            enumC6437Y = EnumC6437Y.f60775a;
        }
        if ((i10 & 4) != 0) {
            j10 = g0.c(0, 0, 2, null);
        }
        return d(interfaceC6415B, enumC6437Y, j10);
    }

    public static final <T> C6430Q<T> f(Function1<? super C6430Q.b<T>, Unit> function1) {
        C6430Q.b bVar = new C6430Q.b();
        function1.invoke(bVar);
        return new C6430Q<>(bVar);
    }

    public static final <T> C6440a0<T> g(int i10) {
        return new C6440a0<>(i10);
    }

    public static /* synthetic */ C6440a0 h(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return g(i10);
    }

    public static final <T> C6446d0<T> i(float f10, float f11, T t10) {
        return new C6446d0<>(f10, f11, t10);
    }

    public static /* synthetic */ C6446d0 j(float f10, float f11, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1500.0f;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return i(f10, f11, obj);
    }

    public static final <T> n0<T> k(int i10, int i11, InterfaceC6416C interfaceC6416C) {
        return new n0<>(i10, i11, interfaceC6416C);
    }

    public static /* synthetic */ n0 l(int i10, int i11, InterfaceC6416C interfaceC6416C, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            interfaceC6416C = C6418E.c();
        }
        return k(i10, i11, interfaceC6416C);
    }
}
