package com.meijer.mobile.meijer.activity.find.fragment;

import Ji.K;
import Ji.LocalThemeScope;
import Mn.T1;
import V0.C5346q0;
import Zm.C5530c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.meijer.mobile.meijer.activity.find.fragment.ItemLocationInfoBottomDialogFragment;
import com.meijer.mobile.meijer.activity.find.productdetail.C12117e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.t1;
import r0.C16692i;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/fragment/ItemLocationInfoBottomDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "LMn/T1;", "a", "LMn/T1;", "B0", "()LMn/T1;", "E0", "(LMn/T1;)V", "binding", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ItemLocationInfoBottomDialogFragment extends BottomSheetDialogFragment {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public T1 binding;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.find.fragment.ItemLocationInfoBottomDialogFragment$a$a, reason: collision with other inner class name */
        static final class C1607a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ItemLocationInfoBottomDialogFragment f106792a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.find.fragment.ItemLocationInfoBottomDialogFragment$a$a$a, reason: collision with other inner class name */
            static final class C1608a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f106793a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ItemLocationInfoBottomDialogFragment f106794b;

                C1608a(LocalThemeScope localThemeScope, ItemLocationInfoBottomDialogFragment itemLocationInfoBottomDialogFragment) {
                    this.f106793a = localThemeScope;
                    this.f106794b = itemLocationInfoBottomDialogFragment;
                }

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1313264478, i10, -1, "com.meijer.mobile.meijer.activity.find.fragment.ItemLocationInfoBottomDialogFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (ItemLocationInfoBottomDialogFragment.kt:44)");
                    }
                    LocalThemeScope localThemeScope = this.f106793a;
                    float f10 = 24;
                    Modifier modifierA = T0.e.a(androidx.compose.foundation.b.d(Modifier.INSTANCE, C5346q0.INSTANCE.k(), null, 2, null), C16692i.e(H1.h.p(f10), H1.h.p(f10), 0.0f, 0.0f, 12, null));
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f106794b);
                    final ItemLocationInfoBottomDialogFragment itemLocationInfoBottomDialogFragment = this.f106794b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.fragment.b
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ItemLocationInfoBottomDialogFragment.a.C1607a.C1608a.c(itemLocationInfoBottomDialogFragment);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    C12117e.b(localThemeScope, modifierA, (Function0) objB, composer, LocalThemeScope.f15770g, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(ItemLocationInfoBottomDialogFragment itemLocationInfoBottomDialogFragment) {
                    itemLocationInfoBottomDialogFragment.dismiss();
                    return Unit.f142422a;
                }
            }

            C1607a(ItemLocationInfoBottomDialogFragment itemLocationInfoBottomDialogFragment) {
                this.f106792a = itemLocationInfoBottomDialogFragment;
            }

            public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i11 = ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-939705310, i11, -1, "com.meijer.mobile.meijer.activity.find.fragment.ItemLocationInfoBottomDialogFragment.onCreateView.<anonymous>.<anonymous> (ItemLocationInfoBottomDialogFragment.kt:37)");
                }
                float f10 = 24;
                t1.a(null, C16692i.e(H1.h.p(f10), H1.h.p(f10), 0.0f, 0.0f, 12, null), C5346q0.INSTANCE.k(), 0L, null, 0.0f, ComposableLambdaKt.c(1313264478, true, new C1608a(AdsTheme, this.f106792a), composer, 54), composer, 1573248, 57);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        a() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1902058029, i10, -1, "com.meijer.mobile.meijer.activity.find.fragment.ItemLocationInfoBottomDialogFragment.onCreateView.<anonymous> (ItemLocationInfoBottomDialogFragment.kt:36)");
            }
            K.b(null, ComposableLambdaKt.c(-939705310, true, new C1607a(ItemLocationInfoBottomDialogFragment.this), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public final T1 B0() {
        T1 t12 = this.binding;
        if (t12 != null) {
            return t12;
        }
        Intrinsics.y("binding");
        return null;
    }

    public final void E0(T1 t12) {
        Intrinsics.j(t12, "<set-?>");
        this.binding = t12;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.j(inflater, "inflater");
        E0(T1.K0(inflater));
        B0().f20337z.setContent(ComposableLambdaKt.composableLambdaInstance(-1902058029, true, new a()));
        return B0().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C5530c.b(this);
    }
}
