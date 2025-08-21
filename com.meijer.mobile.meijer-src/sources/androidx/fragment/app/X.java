package androidx.fragment.app;

import V2.CreationExtras;
import androidx.view.f0;
import androidx.view.g0;
import androidx.view.h0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aa\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\u0018\u0010\u0010\u001a\u00020\u000f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0010\u001a\u00020\u000f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/fragment/app/Fragment;", "Lkotlin/reflect/KClass;", "viewModelClass", "Lkotlin/Function0;", "Landroidx/lifecycle/g0;", "storeProducer", "LV2/a;", "extrasProducer", "Landroidx/lifecycle/f0$c;", "factoryProducer", "Lkotlin/Lazy;", "b", "(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;", "Landroidx/lifecycle/h0;", "owner", "fragment-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class X {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class a extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Fragment f55188f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Fragment fragment) {
            super(0);
            this.f55188f = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f55188f.getDefaultViewModelProviderFactory();
        }
    }

    public static final <VM extends androidx.view.c0> Lazy<VM> b(Fragment fragment, KClass<VM> kClass, Function0<? extends g0> function0, Function0<? extends CreationExtras> function02, Function0<? extends f0.c> function03) {
        if (function03 == null) {
            function03 = new a(fragment);
        }
        return new androidx.view.e0(kClass, function0, function03, function02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 c(Lazy<? extends h0> lazy) {
        return lazy.getValue();
    }
}
