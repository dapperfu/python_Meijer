package c5;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import c5.C6487f;
import coil.request.NullRequestDataException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import m5.C15669h;
import n5.AbstractC15906c;
import n5.C15904a;
import n5.C15914k;
import n5.EnumC15911h;
import n5.InterfaceC15913j;
import n5.Size;
import r1.C16819m;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0007\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a_\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\rH\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001d\u0010\u001d\u001a\u00020\u001a*\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010 \u001a\u00020\u001f*\u00020\u0005H\u0001¢\u0006\u0004\b \u0010!\u001a\u0015\u0010$\u001a\u0004\u0018\u00010#*\u00020\"H\u0001¢\u0006\u0004\b$\u0010%\u001a\u001b\u0010(\u001a\u00020&*\u00020\"2\u0006\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\b(\u0010)\u001a\u001b\u0010+\u001a\u00020&*\u00020\"2\u0006\u0010*\u001a\u00020&H\u0000¢\u0006\u0004\b+\u0010)\u001a\u0013\u0010.\u001a\u00020-*\u00020,H\u0000¢\u0006\u0004\b.\u0010/\"\u001a\u00104\u001a\u00020\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u001a\u0010:\u001a\u0002058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0018\u0010>\u001a\u00020;*\u00020,8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"", "model", "Lm5/h;", "l", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Lm5/h;", "Landroidx/compose/ui/layout/k;", "contentScale", "m", "(Ljava/lang/Object;Landroidx/compose/ui/layout/k;Landroidx/compose/runtime/Composer;I)Lm5/h;", "LZ0/c;", "placeholder", "error", "fallback", "Lkotlin/Function1;", "Lc5/f$b;", "q", "(LZ0/c;LZ0/c;LZ0/c;)Lkotlin/jvm/functions/Function1;", "Lc5/f$b$c;", "", "onLoading", "Lc5/f$b$d;", "onSuccess", "Lc5/f$b$b;", "onError", "j", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/Modifier;", "", "contentDescription", "f", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;", "Ln5/h;", "o", "(Landroidx/compose/ui/layout/k;)Ln5/h;", "LH1/b;", "Ln5/i;", "p", "(J)Ln5/i;", "", "width", "e", "(JF)F", "height", "d", "LU0/k;", "LH1/r;", "n", "(J)J", "a", "J", "h", "()J", "ZeroConstraints", "Ln5/j;", "b", "Ln5/j;", "getOriginalSizeResolver", "()Ln5/j;", "OriginalSizeResolver", "", "i", "(J)Z", "isPositive", "coil-compose-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    private static final long f61268a = H1.b.INSTANCE.c(0, 0);

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC15913j f61269b = C15914k.a(Size.f152064d);

    public static final Modifier f(Modifier modifier, final String str) {
        return str != null ? C16819m.d(modifier, false, new Function1() { // from class: c5.E
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return F.g(str, (r1.u) obj);
            }
        }, 1, null) : modifier;
    }

    public static final long h() {
        return f61268a;
    }

    public static final Function1<C6487f.b, Unit> j(final Function1<? super C6487f.b.Loading, Unit> function1, final Function1<? super C6487f.b.Success, Unit> function12, final Function1<? super C6487f.b.Error, Unit> function13) {
        if (function1 == null && function12 == null && function13 == null) {
            return null;
        }
        return new Function1() { // from class: c5.C
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return F.k(function1, function12, function13, (C6487f.b) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Function1 function1, Function1 function12, Function1 function13, C6487f.b bVar) {
        if (bVar instanceof C6487f.b.Loading) {
            if (function1 != null) {
                function1.invoke(bVar);
            }
        } else if (bVar instanceof C6487f.b.Success) {
            if (function12 != null) {
                function12.invoke(bVar);
            }
        } else if (bVar instanceof C6487f.b.Error) {
            if (function13 != null) {
                function13.invoke(bVar);
            }
        } else if (!(bVar instanceof C6487f.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f143329a;
    }

    public static final EnumC15911h o(InterfaceC5926k interfaceC5926k) {
        InterfaceC5926k.Companion companion = InterfaceC5926k.INSTANCE;
        return (Intrinsics.e(interfaceC5926k, companion.e()) || Intrinsics.e(interfaceC5926k, companion.f())) ? EnumC15911h.f152060b : EnumC15911h.f152059a;
    }

    public static final Function1<C6487f.b, C6487f.b> q(final Z0.c cVar, final Z0.c cVar2, final Z0.c cVar3) {
        return (cVar == null && cVar2 == null && cVar3 == null) ? C6487f.INSTANCE.a() : new Function1() { // from class: c5.D
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return F.r(cVar, cVar3, cVar2, (C6487f.b) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6487f.b r(Z0.c cVar, Z0.c cVar2, Z0.c cVar3, C6487f.b bVar) {
        if (bVar instanceof C6487f.b.Loading) {
            C6487f.b.Loading loading = (C6487f.b.Loading) bVar;
            return cVar != null ? loading.b(cVar) : loading;
        }
        boolean z10 = bVar instanceof C6487f.b.Error;
        C6487f.b bVar2 = bVar;
        if (z10) {
            C6487f.b.Error error = (C6487f.b.Error) bVar;
            boolean z11 = error.getResult().getThrowable() instanceof NullRequestDataException;
            bVar2 = error;
            bVar2 = error;
            if (z11) {
                if (cVar2 != null) {
                    return C6487f.b.Error.c(error, cVar2, null, 2, null);
                }
            } else if (cVar3 != null) {
                return C6487f.b.Error.c(error, cVar3, null, 2, null);
            }
        }
        return bVar2;
    }

    public static final float d(long j10, float f10) {
        return RangesKt.n(f10, H1.b.m(j10), H1.b.k(j10));
    }

    public static final float e(long j10, float f10) {
        return RangesKt.n(f10, H1.b.n(j10), H1.b.l(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(String str, r1.u uVar) {
        r1.s.g0(uVar, str);
        r1.s.s0(uVar, Role.INSTANCE.e());
        return Unit.f143329a;
    }

    public static final boolean i(long j10) {
        if (U0.k.i(j10) >= 0.5d && U0.k.g(j10) >= 0.5d) {
            return true;
        }
        return false;
    }

    public static final C15669h l(Object obj, Composer composer, int i10) {
        composer.startReplaceableGroup(1087186730);
        if (obj instanceof C15669h) {
            C15669h c15669h = (C15669h) obj;
            composer.U();
            return c15669h;
        }
        Context context = (Context) composer.o(AndroidCompositionLocals_androidKt.g());
        composer.startReplaceableGroup(-1245195153);
        boolean zV = composer.V(context) | composer.V(obj);
        Object objB = composer.B();
        if (zV || objB == Composer.INSTANCE.a()) {
            objB = new C15669h.a(context).f(obj).c();
            composer.t(objB);
        }
        C15669h c15669h2 = (C15669h) objB;
        composer.U();
        composer.U();
        return c15669h2;
    }

    public static final C15669h m(Object obj, InterfaceC5926k interfaceC5926k, Composer composer, int i10) {
        InterfaceC15913j interfaceC15913j;
        composer.startReplaceableGroup(1677680258);
        boolean z10 = obj instanceof C15669h;
        if (z10) {
            C15669h c15669h = (C15669h) obj;
            if (c15669h.getDefined().getSizeResolver() != null) {
                composer.U();
                return c15669h;
            }
        }
        composer.startReplaceableGroup(408306591);
        if (Intrinsics.e(interfaceC5926k, InterfaceC5926k.INSTANCE.g())) {
            interfaceC15913j = f61269b;
        } else {
            composer.startReplaceableGroup(408309406);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new l();
                composer.t(objB);
            }
            interfaceC15913j = (l) objB;
            composer.U();
        }
        composer.U();
        if (z10) {
            composer.startReplaceableGroup(-227230258);
            C15669h c15669h2 = (C15669h) obj;
            composer.startReplaceableGroup(408312509);
            boolean zV = composer.V(c15669h2) | composer.V(interfaceC15913j);
            Object objB2 = composer.B();
            if (zV || objB2 == Composer.INSTANCE.a()) {
                objB2 = C15669h.R(c15669h2, null, 1, null).A(interfaceC15913j).c();
                composer.t(objB2);
            }
            C15669h c15669h3 = (C15669h) objB2;
            composer.U();
            composer.U();
            composer.U();
            return c15669h3;
        }
        composer.startReplaceableGroup(-227066702);
        Context context = (Context) composer.o(AndroidCompositionLocals_androidKt.g());
        composer.startReplaceableGroup(408319118);
        boolean zV2 = composer.V(context) | composer.V(obj) | composer.V(interfaceC15913j);
        Object objB3 = composer.B();
        if (zV2 || objB3 == Composer.INSTANCE.a()) {
            objB3 = new C15669h.a(context).f(obj).A(interfaceC15913j).c();
            composer.t(objB3);
        }
        C15669h c15669h4 = (C15669h) objB3;
        composer.U();
        composer.U();
        composer.U();
        return c15669h4;
    }

    public static final long n(long j10) {
        return H1.s.a(MathKt.d(U0.k.i(j10)), MathKt.d(U0.k.g(j10)));
    }

    public static final Size p(long j10) {
        AbstractC15906c abstractC15906cA;
        AbstractC15906c abstractC15906cA2;
        if (H1.b.p(j10)) {
            return null;
        }
        if (H1.b.h(j10)) {
            abstractC15906cA = C15904a.a(H1.b.l(j10));
        } else {
            abstractC15906cA = AbstractC15906c.b.f152049a;
        }
        if (H1.b.g(j10)) {
            abstractC15906cA2 = C15904a.a(H1.b.k(j10));
        } else {
            abstractC15906cA2 = AbstractC15906c.b.f152049a;
        }
        return new Size(abstractC15906cA, abstractC15906cA2);
    }
}
