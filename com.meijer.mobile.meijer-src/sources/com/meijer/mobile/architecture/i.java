package com.meijer.mobile.architecture;

import M0.SnapshotStateMap;
import Wi.o;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.compose.runtime.o1;
import androidx.view.InterfaceC6157f;
import androidx.view.c0;
import com.meijer.mobile.architecture.j;
import g.C14274a;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\t\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0003*\b\b\u0002\u0010\u0005*\u00028\u00012\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0010\u0010\tJ!\u0010\u0015\u001a\u00020\u0011*\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0004¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001c\u001a\u00020\u0017*\u00020\u00172\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\f0\u0018H\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010\u001e\u001a\u00020\u0017*\u00020\u00172\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\f0\u0018H\u0004¢\u0006\u0004\b\u001e\u0010\u001dJ.\u0010%\u001a\u00020\u001f*\u00020\u001f2\u0019\u0010$\u001a\u0015\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b#H\u0004¢\u0006\u0004\b%\u0010&J.\u0010)\u001a\u00020'*\u00020'2\u0019\u0010(\u001a\u0015\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b#H\u0004¢\u0006\u0004\b)\u0010*J'\u0010-\u001a\u00020'*\u00020'2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\f0 H\u0004¢\u0006\u0004\b-\u0010*J,\u00101\u001a\u00020.*\u00020.2\u0017\u00100\u001a\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\f0 ¢\u0006\u0002\b#H\u0004¢\u0006\u0004\b1\u00102R\u001a\u00108\u001a\u0002038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R!\u0010>\u001a\u00028\u00018@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b=\u0010\t\u001a\u0004\b;\u0010<R \u0010C\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\n0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR&\u0010I\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\n0D8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010L\u001a\u00028\u00028$X¥\u0004¢\u0006\f\u0012\u0004\bK\u0010\t\u001a\u0004\bJ\u0010<¨\u0006M"}, d2 = {"Lcom/meijer/mobile/architecture/i;", "", "VSU", "LWi/o;", "IVS", "VS", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "<init>", "()V", "Lcom/meijer/mobile/architecture/j;", "vse", "", "n", "(Lcom/meijer/mobile/architecture/j;)V", "o", "onCleared", "Lcom/meijer/mobile/architecture/j$i;", "Lkotlin/Function0;", "", "execute", "y", "(Lcom/meijer/mobile/architecture/j$i;Lkotlin/jvm/functions/Function0;)Lcom/meijer/mobile/architecture/j$i;", "Lcom/meijer/mobile/architecture/j$c;", "Lkotlin/Function2;", "Landroid/content/DialogInterface;", "", "onClick", "A", "(Lcom/meijer/mobile/architecture/j$c;Lkotlin/jvm/functions/Function2;)Lcom/meijer/mobile/architecture/j$c;", "v", "Lcom/meijer/mobile/architecture/j$f;", "Lkotlin/Function1;", "Landroid/content/Context;", "Landroid/content/Intent;", "Lkotlin/ExtensionFunctionType;", "navigate", "u", "(Lcom/meijer/mobile/architecture/j$f;Lkotlin/jvm/functions/Function1;)Lcom/meijer/mobile/architecture/j$f;", "Lcom/meijer/mobile/architecture/j$a;", "intent", "B", "(Lcom/meijer/mobile/architecture/j$a;Lkotlin/jvm/functions/Function1;)Lcom/meijer/mobile/architecture/j$a;", "Lg/a;", "activityResult", "w", "Lcom/meijer/mobile/architecture/j$e;", "LWi/a;", "activityDelegate", "x", "(Lcom/meijer/mobile/architecture/j$e;Lkotlin/jvm/functions/Function1;)Lcom/meijer/mobile/architecture/j$e;", "LJu/a;", "a", "LJu/a;", "p", "()LJu/a;", "disposables", "b", "Lkotlin/Lazy;", "r", "()LWi/o;", "getInternalViewState$architecture_release$annotations", "internalViewState", "LM0/o;", "Ljava/util/UUID;", "c", "LM0/o;", "effectsInMotion", "", "d", "Ljava/util/Map;", "q", "()Ljava/util/Map;", "internalEffectsInMotion", "s", "getViewState$annotations", "viewState", "architecture_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class i<VSU, IVS extends o<VSU>, VS extends IVS> extends c0 implements InterfaceC6157f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables = new Ju.a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy internalViewState = LazyKt.b(new Function0() { // from class: Wi.n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return com.meijer.mobile.architecture.i.t(this.f41129a);
        }
    });

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SnapshotStateMap<UUID, j> effectsInMotion;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<UUID, j> internalEffectsInMotion;

    /* JADX WARN: Incorrect return type in method signature: ()TVS; */
    protected abstract o s();

    protected final j.Dialog A(j.Dialog dialog, Function2<? super DialogInterface, ? super Integer, Unit> onClick) {
        Intrinsics.j(dialog, "<this>");
        Intrinsics.j(onClick, "onClick");
        dialog.o(onClick);
        return dialog;
    }

    protected final j.ActivityResultEffect B(j.ActivityResultEffect activityResultEffect, Function1<? super Context, ? extends Intent> intent) {
        Intrinsics.j(activityResultEffect, "<this>");
        Intrinsics.j(intent, "intent");
        activityResultEffect.f(intent);
        return activityResultEffect;
    }

    protected final void n(j vse) {
        Intrinsics.j(vse, "vse");
        this.effectsInMotion.put(vse.getUuid(), vse);
    }

    public final void o(j vse) {
        Intrinsics.j(vse, "vse");
        this.effectsInMotion.remove(vse.getUuid());
    }

    /* renamed from: p, reason: from getter */
    protected final Ju.a getDisposables() {
        return this.disposables;
    }

    public final Map<UUID, j> q() {
        return this.internalEffectsInMotion;
    }

    public final IVS r() {
        return (IVS) this.internalViewState.getValue();
    }

    protected final j.NavigateTo u(j.NavigateTo navigateTo, Function1<? super Context, ? extends Intent> navigate) {
        Intrinsics.j(navigateTo, "<this>");
        Intrinsics.j(navigate, "navigate");
        navigateTo.c(navigate);
        return navigateTo;
    }

    protected final j.Dialog v(j.Dialog dialog, Function2<? super DialogInterface, ? super Integer, Unit> onClick) {
        Intrinsics.j(dialog, "<this>");
        Intrinsics.j(onClick, "onClick");
        dialog.n(onClick);
        return dialog;
    }

    protected final j.ActivityResultEffect w(j.ActivityResultEffect activityResultEffect, Function1<? super C14274a, Unit> activityResult) {
        Intrinsics.j(activityResultEffect, "<this>");
        Intrinsics.j(activityResult, "activityResult");
        activityResultEffect.e(activityResult);
        return activityResultEffect;
    }

    protected final j.FinishActivity x(j.FinishActivity finishActivity, Function1<? super Wi.a, Unit> activityDelegate) {
        Intrinsics.j(finishActivity, "<this>");
        Intrinsics.j(activityDelegate, "activityDelegate");
        finishActivity.c(activityDelegate);
        return finishActivity;
    }

    protected final j.Toast y(j.Toast toast, Function0<Boolean> execute) {
        Intrinsics.j(toast, "<this>");
        Intrinsics.j(execute, "execute");
        toast.o(execute);
        return toast;
    }

    public i() {
        SnapshotStateMap<UUID, j> snapshotStateMapH = o1.h();
        this.effectsInMotion = snapshotStateMapH;
        this.internalEffectsInMotion = snapshotStateMapH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o t(i iVar) {
        return iVar.s();
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        super.onCleared();
        this.disposables.d();
    }
}
