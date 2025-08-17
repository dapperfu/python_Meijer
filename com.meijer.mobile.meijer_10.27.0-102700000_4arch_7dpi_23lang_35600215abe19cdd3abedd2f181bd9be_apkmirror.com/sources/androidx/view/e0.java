package androidx.view;

import V2.CreationExtras;
import androidx.view.c0;
import androidx.view.f0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BC\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/e0;", "Landroidx/lifecycle/c0;", "VM", "Lkotlin/Lazy;", "Lkotlin/reflect/KClass;", "viewModelClass", "Lkotlin/Function0;", "Landroidx/lifecycle/g0;", "storeProducer", "Landroidx/lifecycle/f0$c;", "factoryProducer", "LV2/a;", "extrasProducer", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "a", "()Z", "Lkotlin/reflect/KClass;", "b", "Lkotlin/jvm/functions/Function0;", "c", "d", "e", "Landroidx/lifecycle/c0;", "cached", "()Landroidx/lifecycle/c0;", "value", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e0<VM extends c0> implements Lazy<VM> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final KClass<VM> viewModelClass;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function0<g0> storeProducer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function0<f0.c> factoryProducer;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function0<CreationExtras> extrasProducer;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private VM cached;

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public e0(KClass<VM> viewModelClass, Function0<? extends g0> storeProducer, Function0<? extends f0.c> factoryProducer, Function0<? extends CreationExtras> extrasProducer) {
        Intrinsics.j(viewModelClass, "viewModelClass");
        Intrinsics.j(storeProducer, "storeProducer");
        Intrinsics.j(factoryProducer, "factoryProducer");
        Intrinsics.j(extrasProducer, "extrasProducer");
        this.viewModelClass = viewModelClass;
        this.storeProducer = storeProducer;
        this.factoryProducer = factoryProducer;
        this.extrasProducer = extrasProducer;
    }

    @Override // kotlin.Lazy
    public boolean a() {
        return this.cached != null;
    }

    @Override // kotlin.Lazy
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public VM getValue() {
        VM vm2 = this.cached;
        if (vm2 != null) {
            return vm2;
        }
        VM vm3 = (VM) f0.INSTANCE.a(this.storeProducer.invoke(), this.factoryProducer.invoke(), this.extrasProducer.invoke()).c(this.viewModelClass);
        this.cached = vm3;
        return vm3;
    }
}
