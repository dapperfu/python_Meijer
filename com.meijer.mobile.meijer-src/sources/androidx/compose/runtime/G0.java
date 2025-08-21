package androidx.compose.runtime;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bl\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n\u0012\u0019\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f¢\u0006\u0002\b\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R-\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f¢\u0006\u0002\b\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b\u001a\u0010#R\u001a\u0010\u0010\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b$\u0010%R\u0016\u0010(\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00068G@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u0015\u0010%R\u0017\u0010\u0005\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b,\u0010-\u001a\u0004\b&\u0010+R\u001a\u0010/\u001a\u00028\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b.\u0010-\u001a\u0004\b\u001e\u0010+R\u0014\u00101\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b0\u0010%¨\u00062"}, d2 = {"Landroidx/compose/runtime/G0;", "T", "", "Landroidx/compose/runtime/p;", "compositionLocal", "value", "", "explicitNull", "Landroidx/compose/runtime/n1;", "mutationPolicy", "Landroidx/compose/runtime/l0;", "state", "Lkotlin/Function1;", "Landroidx/compose/runtime/q;", "Lkotlin/ExtensionFunctionType;", "compute", "isDynamic", "<init>", "(Landroidx/compose/runtime/p;Ljava/lang/Object;ZLandroidx/compose/runtime/n1;Landroidx/compose/runtime/l0;Lkotlin/jvm/functions/Function1;Z)V", "h", "()Landroidx/compose/runtime/G0;", "a", "Landroidx/compose/runtime/p;", "b", "()Landroidx/compose/runtime/p;", "Z", "c", "Landroidx/compose/runtime/n1;", "e", "()Landroidx/compose/runtime/n1;", "d", "Landroidx/compose/runtime/l0;", "f", "()Landroidx/compose/runtime/l0;", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "i", "()Z", "g", "Ljava/lang/Object;", "providedValue", "<set-?>", "canOverride", "()Ljava/lang/Object;", "getValue$annotations", "()V", "getEffectiveValue$runtime_release$annotations", "effectiveValue", "j", "isStatic", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class G0<T> {

    /* renamed from: i, reason: collision with root package name */
    public static final int f50200i = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5879p<T> compositionLocal;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean explicitNull;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final n1<T> mutationPolicy;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<T> state;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function1<InterfaceC5881q, T> compute;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isDynamic;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final T providedValue;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean canOverride = true;

    public final G0<T> h() {
        this.canOverride = false;
        return this;
    }

    @JvmName
    /* renamed from: a, reason: from getter */
    public final boolean getCanOverride() {
        return this.canOverride;
    }

    public final AbstractC5879p<T> b() {
        return this.compositionLocal;
    }

    public final Function1<InterfaceC5881q, T> c() {
        return this.compute;
    }

    public final T d() {
        if (this.explicitNull) {
            return null;
        }
        InterfaceC5872l0<T> interfaceC5872l0 = this.state;
        if (interfaceC5872l0 != null) {
            return interfaceC5872l0.getValue();
        }
        T t10 = this.providedValue;
        if (t10 != null) {
            return t10;
        }
        ComposerKt.u("Unexpected form of a provided value");
        throw new KotlinNothingValueException();
    }

    public final n1<T> e() {
        return this.mutationPolicy;
    }

    public final InterfaceC5872l0<T> f() {
        return this.state;
    }

    public final T g() {
        return this.providedValue;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getIsDynamic() {
        return this.isDynamic;
    }

    public final boolean j() {
        return (this.explicitNull || g() != null) && !this.isDynamic;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public G0(AbstractC5879p<T> abstractC5879p, T t10, boolean z10, n1<T> n1Var, InterfaceC5872l0<T> interfaceC5872l0, Function1<? super InterfaceC5881q, ? extends T> function1, boolean z11) {
        this.compositionLocal = abstractC5879p;
        this.explicitNull = z10;
        this.mutationPolicy = n1Var;
        this.state = interfaceC5872l0;
        this.compute = function1;
        this.isDynamic = z11;
        this.providedValue = t10;
    }
}
